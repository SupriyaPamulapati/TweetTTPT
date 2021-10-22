
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;


public class Main {
    public static void main (String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("WBH5XjrRwnR2eDuS39Oq9Og3p")
                .setOAuthConsumerSecret("UrR4tvM3zfHtglDBkUTHzbbiLcbUK14GWOvGmlPXC0kjz7Mdl7")
                .setOAuthAccessToken("1450686116353376256-WOjiH1tdNSeIBvET2GvAnGRFejnF9y")
                .setOAuthAccessTokenSecret("EWXeQ5r9oEXTrlt2wLbmnpkWAlBdOXOU1Yyhy5IvnVSWq");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        twitter.updateStatus("Hello");


        List<Status> status = twitter.getHomeTimeline();
        for(Status st : status)
        {
            System.out.println(st.getUser().getName()+"-------"+st.getText());
        }
    }


}