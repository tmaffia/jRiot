import org.junit.Assert;
import org.junit.Test;
import riot.api.Region;
import riot.api.RiotApi;

/**
 * Created by tmaffia on 2/17/16.
 */
public class RiotApiTest {

    public static final String apiKey = "YOUR-API-KEY-HERE";

    @Test
    public void testCreate() {
        RiotApi api = new RiotApi(apiKey);
        Assert.assertEquals(api.getApiKey(), apiKey);
    }

    @Test
    public void testCreateWithRegion() {
        for(Region region : Region.values()) {
            RiotApi api = new RiotApi(apiKey, region);
            Assert.assertEquals(api.getApiKey(), apiKey);
            Assert.assertEquals(api.getApiRegion(), region);
        }
    }
}
