package riot.api.request;

import riot.api.ApiConfig;
import riot.api.Region;
import riot.api.RiotApi;
import riot.api.RiotApiException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by tmaffia on 2/21/16.
 */
public abstract class ApiRequest {

    private final RiotApi riotApi;
    private final ApiConfig config;

    private String requestUrl;
    private Region playerRegion;
    protected HttpURLConnection connection;

    protected ApiRequest(RiotApi riotApi, ApiConfig config) {
        this.riotApi = riotApi;
        this.config = config;

        this.requestUrl = riotApi.getApiRegion().getBaseUrl();
    }

    protected RiotApi getRiotApi() {
        return riotApi;
    }

    protected ApiConfig getConfig() {
        return config;
    }

    protected String getRequestUrl() {
        return requestUrl;
    }

    public synchronized void execute(String fullUrl) throws RiotApiException {
        try {
            URL url = new URL(fullUrl);
            connection = (HttpURLConnection) url.openConnection();
            setTimeout();
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() != 200) {
                throw new RiotApiException(connection.getResponseCode());
            }

            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, "utf-8"));

            //TODO pass response to subclass execute() methods

            connection.disconnect();
        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
    }

    protected void setTimeout() {
        if (connection != null) {
            connection.setConnectTimeout(config.getRequestTimeout());
            connection.setReadTimeout(config.getRequestTimeout());
        }
    }

}
