package code_SCH.project.config.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

// 여러 개의 클라이언트 요청을 실시간으로 처리해야하므로 핸들러 필요
public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {

        // 클라이언트로부터 메시지 수신
        String payload = message.getPayload();
        System.out.println("Received message: " + payload);

        // 모든 클라이언트에 메시지 전송
        session.sendMessage(new TextMessage("Hello! " + payload));
    }
}
