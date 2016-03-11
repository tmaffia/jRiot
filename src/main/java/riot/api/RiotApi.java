package riot.api;

import riot.api.summoner.Summoner;
import riot.api.summoner.SummonerRequest;

import java.util.HashMap;
import java.util.Map;

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

    public Map<String, Summoner> getSummonerByName(Region region, String... summonerNames) {
        return new HashMap<String, Summoner>();
    }
}
