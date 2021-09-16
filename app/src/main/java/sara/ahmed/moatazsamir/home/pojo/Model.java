package sara.ahmed.moatazsamir.home.pojo;

public class Model
{
    private final String subjectText ;
    private final String messageText;
    private final String destinationEmailFeedbackURL;

    private final String moreAppsUrl ;

    private final String privacyPolicyUrl ;


    private final String shareText;
    private final String shareUrl;


    public Model(String shareText , String shareUrl , String destinationEmail , String subjectText, String messageText, String privacyPolicyUrl, String moreAppsUrl)
    {
        this.shareText = shareText;
        this.shareUrl = shareUrl;
        this.subjectText = subjectText;
        this.messageText = messageText;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.moreAppsUrl = moreAppsUrl;
        this.destinationEmailFeedbackURL = destinationEmail;
    }

    public String getShareText() {
        return shareText;
    }

    public String getShareUrl()
    {
        return shareUrl;
    }

    public String getDestinationEmailFeedbackURL() {
        return destinationEmailFeedbackURL;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    public String getMoreAppsUrl() {
        return moreAppsUrl;
    }

}
