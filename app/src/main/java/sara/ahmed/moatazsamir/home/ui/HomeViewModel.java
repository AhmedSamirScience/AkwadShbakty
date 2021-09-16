package sara.ahmed.moatazsamir.home.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import sara.ahmed.moatazsamir.home.pojo.Model;


public class HomeViewModel extends ViewModel
{
    final MutableLiveData<List<String>> subjectMessageTextMutableLiveData;
    final MutableLiveData<List<String>> shareTextAndUrlMutableLiveData;
    final MutableLiveData<String> moreAppUrlMutableLiveData;
    final MutableLiveData<String> privacyPolicyUrlMutableLiveData;
    final Model MyMainViewModel;

    public HomeViewModel()
    {
        MyMainViewModel = new Model("Application Name", "http://play.google.com/store/apps/details?id=","saraaccount@gmail.com", "Feedback about Esh7nli application.", "Write here what are your comments...", "https://www.filgoal.com", "https://stackoverflow.com");
        subjectMessageTextMutableLiveData = new MutableLiveData<>();
        moreAppUrlMutableLiveData = new MutableLiveData<>();
        privacyPolicyUrlMutableLiveData = new MutableLiveData<>();
        shareTextAndUrlMutableLiveData = new MutableLiveData<>();
    }

    public void getFeedbackData()
    {
        getDataFromDataBase("getFeedbackData");
    }
    public void getMoreAppData()
    {
        getDataFromDataBase("getMoreAppData");
    }
    public void getPrivacyPolicyData()
    {
        getDataFromDataBase("getPrivacyPolicyData");
    }
    public void getShareData()
    {
        getDataFromDataBase("getShareData");
    }

    private void getDataFromDataBase(String defineMethod)
    {
        if(defineMethod.equals("getFeedbackData"))
        {
            List <String> messagesOfSubjectsAndMessageForEmail = new ArrayList<>();
            messagesOfSubjectsAndMessageForEmail.add(MyMainViewModel.getDestinationEmailFeedbackURL());
            messagesOfSubjectsAndMessageForEmail.add(MyMainViewModel.getSubjectText());
            messagesOfSubjectsAndMessageForEmail.add(MyMainViewModel.getMessageText());
            subjectMessageTextMutableLiveData.setValue(messagesOfSubjectsAndMessageForEmail);
        }

        if(defineMethod.equals("getMoreAppData"))
        {
            moreAppUrlMutableLiveData.setValue(MyMainViewModel.getMoreAppsUrl());
        }

        if(defineMethod.equals("getPrivacyPolicyData"))
        {
            privacyPolicyUrlMutableLiveData.setValue(MyMainViewModel.getPrivacyPolicyUrl());
        }


        if(defineMethod.equals("getShareData"))
        {
            List <String> messagesOfTextAndUrlForEmail = new ArrayList<>();
            messagesOfTextAndUrlForEmail.add(MyMainViewModel.getShareText());
            messagesOfTextAndUrlForEmail.add(MyMainViewModel.getShareUrl());
            shareTextAndUrlMutableLiveData.setValue(messagesOfTextAndUrlForEmail);
        }
    }

}
