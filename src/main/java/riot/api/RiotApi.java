package riot.api;

/**
 * Created by tmaffia on 2/17/16.
 */
public class RiotApi {

    private final String apiKey;
    private final Region apiRegion;

    public RiotApi(String apiKey) {
        this.apiKey = apiKey;
        // Default to NA
        this.apiRegion = Region.NA;
    }

    public RiotApi(String apiKey, Region apiRegion) {
        this.apiKey = apiKey;
        this.apiRegion = apiRegion;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Region getApiRegion() {
        return apiRegion;
    }
}
