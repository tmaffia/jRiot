package riot.api;

import riot.api.request.RequestErrorCode;

/**
 * Created by tmaffia on 2/22/16.
 */
public class RiotApiException extends Exception {

    public RiotApiException(int code) {
        super(getError(code));
    }

    public static String getError(int code) {
        for(RequestErrorCode errorCode : RequestErrorCode.values()) {
            if(errorCode.getErrorCode() == code) {
                return errorCode.toString();
            }
        }
        return "Unspecified URL Error";
    }

}
