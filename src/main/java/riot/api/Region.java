package riot.api;

/**
 * Created by tmaffia on 2/17/16.
 */
public enum Region {
    BR("br.api.pvp.net", "br"),
    EUNE("eune.api.pvp.net", "eune"),
    EUW("euw.api.pvp.net", "euw"),
    KR("kr.api.pvp.net", "kr"),
    LAS("las.api.pvp.net", "las"),
    LAN("lan.api.pvp.net", "lan"),
    NA("na.api.pvp.net", "na"),
    OCE("oce.api.pvp.net", "oce"),
    PBE("pbe.api.pvp.net", "pbe"),
    RU("ru.api.pvp.net", "ru"),
    TR("tr.api.pvp.net", "tr"),
    GLOBAL("global.api.pvp.net", "global");


    private String baseUrl;
    private String name;


    Region(String baseUrl, String name) {
        this.baseUrl = baseUrl;
        this.name = name;
    }

    public String getBaseUrl(boolean withRegion) {
        String url = "https://" + baseUrl + "/api/lol/";
        if (withRegion) {
            url += getName();
        }
        return url;
    }

    public String getBaseUrl() {
        return getBaseUrl(false);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
