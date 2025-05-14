import java.util.concurrent.*;

public class TokenCache {
    private final ConcurrentHashMap<String, String> tokenCache = new ConcurrentHashMap<>();

    public void addToken(String userId, String token) {
        tokenCache.put(userId, token);
    }

    public String getToken(String userId) {
        return tokenCache.get(userId);
    }

    public void removeToken(String userId) {
        tokenCache.remove(userId);
    }
}

