package riot.api;

import java.util.logging.Level;

/**
 * Created by tmaffia on 2/21/16.
 */
public class ApiConfig {

    private int requestTimeout = 10000;
    private Level debufLevel = Level.WARNING;

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public Level getDebufLevel() {
        return debufLevel;
    }

    public ApiConfig setRequestTimeout(int requestTimeout) {
        if (requestTimeout < 0) {
            throw new IllegalArgumentException("The timeout value needs to be >= 0");
        }
        this.requestTimeout = requestTimeout;
        return this;
    }

}
