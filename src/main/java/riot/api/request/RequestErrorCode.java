package riot.api.request;

/**
 * Created by tmaffia on 2/22/16.
 */
public enum RequestErrorCode {
    KEY_LIMIT("ERROR_API_KEY_LIMIT", 429),
    KEY_WRONG("KEY_WRONG", 401),
    DATA_NOT_FOUND("ERROR_DATA_NOT_FOUND", 404),
    BAD_REQUEST("ERROR_BAD_REQUEST", 400),
    INTERNAL_SERVER_ERROR("ERROR_INTERNAL_SERVER_ERROR", 500),
    SERVICE_UNAVAILABLE("ERROR_SERVICE_UNAVAILABLE", 503);

    private String error;
    private int errorCode;

    RequestErrorCode(String error, int errorCode) {
        this.error = error;
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return getErrorCode() + ": " + getError();
    }
}

