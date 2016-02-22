package riot.api.summoner;

import riot.api.ApiConfig;
import riot.api.request.ApiRequest;
import riot.api.Region;
import riot.api.RiotApi;

import java.util.List;
import java.util.Map;

/**
 * Created by tmaffia on 2/21/16.
 */
public class SummonerRequest extends ApiRequest {

    private static String version = "/v1.4/";
    private static String summonerPath = "summoner/";
    private Region playerRegion;
    private String requestUrl;

    public SummonerRequest(RiotApi riotApi, ApiConfig config) {
        super(riotApi, config);
        this.requestUrl = getRequestUrl() + summonerPath + version;
    }

    public Map<String, Summoner> getSummonerByName(List<String> names) {
        StringBuilder sb = new StringBuilder();
        sb.append(requestUrl);
        sb.append("by-name/");
        for (String name : names) {
            sb.append(name);
            sb.append(",");
        }
    }

    public SummonerRequest setPlayerRegion(Region playerRegion) {
        this.playerRegion = playerRegion;
        return this;
    }

}
