//package birthday.example.countdown.core;
//
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class GameService {
//
//    private final Map<String, GameSession> sessions = new HashMap<>();
//
//    public GameSession getSession(String sessionId) {
//        // Ensure the sessionId exists in the map, or create a new GameSession
//        if (!sessions.containsKey(sessionId)) {
//            sessions.put(sessionId, new GameSession());
//        }
//        return sessions.get(sessionId);
//    }
//}
