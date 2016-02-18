package riot.api.summoners;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * Created by tmaffia on 2/17/16.
 */
public class Summoner {

    private static final String apiVersion = "V1.4";
    private static final String path = "/summoner/";

    private String name;
    private long id, revisionDate;
    private int summonerLevel, profileIconId;

    @JsonGetter("name")
    public String getName() {
        return name;
    }

    @JsonGetter("id")
    public long getId() {
        return id;
    }

    @JsonGetter("revisionDate")
    public long getRevisionDate() {
        return revisionDate;
    }

    @JsonGetter("summonerLevel")
    public int getSummonerLevel() {
        return summonerLevel;
    }

    @JsonGetter("profileIconId")
    public int getProfileIconId() {
        return profileIconId;
    }
}
