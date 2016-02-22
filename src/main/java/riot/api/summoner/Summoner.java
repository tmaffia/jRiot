package riot.api.summoner;

/**
 * Created by tmaffia on 2/17/16.
 */
public class Summoner {

    private String name;
    private long id, revisionDate;
    private int summonerLevel, profileIconId;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public int getProfileIconId() {
        return profileIconId;
    }
}
