package com.krosh.yammy;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class EchoSocketHandler extends TextWebSocketHandler {

	final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {

		System.out.println("handleTextMessage: " + message.getPayload());

		for (WebSocketSession webSocketSession : sessions) {
			if (webSocketSession.isOpen() && !session.getId().equals(webSocketSession.getId())) {
				webSocketSession.sendMessage(message);
			}
		}
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		sessions.add(session);
	}
}