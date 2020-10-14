package TestAPI.ChallengeApiTesting;

import static org.junit.Assert.assertTrue;
import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
        
    okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();

    okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/x-www-form-urlencoded");
    okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "undefined=");
    okhttp3.Request request = new okhttp3.Request.Builder()
  .url("https://clarity.dexcom.com/api/subject/1594950620847472640/analysis_session")
  .post(body)
  .addHeader("Content-Type", "application/x-www-form-urlencoded")
  .addHeader("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJodHRwczovL3N3ZWV0c3BvdGRpYWJldGVzLmNvbSIsInN1YiI6IlN3ZWV0c3BvdCIsImlhdCI6MTYwMjUzOTQzNywiY29uc2VudFBlcm1pc3Npb24iOiJsaW5rZWRTdWJqZWN0cyIsImRleGNvbUlkIjoiNWQ0ZWZkZTEtNzg4NC00Y2YzLWJlYjctMzllNTM4OGFjNDBkIiwiZXhwIjoxNjAyNjI1ODM3LCJyb2xlIjoiT3duZXIiLCJzdWJqZWN0SWQiOiIxNTk0OTUwNjIwODQ3NDcyNjQwIn0.mwqCsPxec2qb_IIskEV5EBD8oiYtYLkW_7CMT1DwZYUyQSul6gpISNgiOat8Z3tgXr9bKVXnZx_pfZvRR5e4TFZGASqsCVZn06uWxKE26d_n558oU1qX41tHj3wkTLT90Fn9a7t6v__sXw8g3vJFHg1Drgb_GCaRq9Ww0c-hs_hQFHp7BSN-U5KeYNQclKM_ONIr_jHrdWdtuiGdKsNU7-wCMX2kq1mj5jplHBI7Thw6iJpVQebTFW7vP6KBDf3eZ1pro_KkcEsW21syaoWJT0dTPcuPFTkTeqEgJuXEcvCoIXFmSd6FLGN4z3LvQu49KaHbMSU2lNuX2RqotlHL4A")
  .addHeader("cache-control", "no-cache")
  .addHeader("Postman-Token", "d41a0888-5316-4787-aef6-e67e656743fc")
  .build();

okhttp3.Response response = client.newCall(request).execute();

    	
        
  
    }
}
