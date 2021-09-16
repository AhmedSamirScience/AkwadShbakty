package sara.ahmed.moatazsamir.main.ui;

import androidx.lifecycle.MutableLiveData;

import sara.ahmed.moatazsamir.main.pojo.Model;
import sara.ahmed.moatazsamir.main.pojo.ModelFactory;


public class ViewModel extends androidx.lifecycle.ViewModel
{
    final MutableLiveData<String> balanceTransferMutableLiveData;
    final MutableLiveData<Model> adapterListAdapterCodesMutableLiveData;

    Model ViewModelData;
    Model ViewModelCodesDataConnectBundles;
    Model ViewModelCodesDataHekayaBundles;
    Model ViewModelCodesDataEntertainmentBundles;
    Model ViewModelCodesDataCallCenter;
    Model ViewModelCodesDataOthers;

    public ViewModel()
    {
        balanceTransferMutableLiveData = new MutableLiveData<>();
        adapterListAdapterCodesMutableLiveData = new MutableLiveData<>();
    }

    public void setData(String companyName)
    {
        ViewModelData = ModelFactory.createModel(companyName,  "ViewModelData");
        ViewModelCodesDataHekayaBundles = ModelFactory.createModel(companyName, "ViewModelCodesDataHekayaBundles");
        ViewModelCodesDataConnectBundles = ModelFactory.createModel(companyName, "ViewModelCodesDataConnectBundles");
        ViewModelCodesDataEntertainmentBundles = ModelFactory.createModel(companyName, "ViewModelCodesDataEntertainmentBundles");
        ViewModelCodesDataCallCenter = ModelFactory.createModel(companyName, "ViewModelCodesDataCallCenter");
        ViewModelCodesDataOthers = ModelFactory.createModel(companyName, "ViewModelCodesDataOthers");
    }

    public void getBalanceDataTransfer(String phoneNumber, String amountTransfer)
    {
        balanceTransferMutableLiveData.setValue(getDataFromDataBaseLeftPart()+phoneNumber+getDataFromDataBaseMiddlePart()+amountTransfer+getDataFromDataBaseRightPart());
    }

    private String getDataFromDataBaseRightPart()
    {
       return ViewModelData.getCodeNumber().get(2);
    }
    private String getDataFromDataBaseMiddlePart()
    {
        return ViewModelData.getCodeNumber().get(1);
    }
    private String getDataFromDataBaseLeftPart()
    {
       return ViewModelData.getCodeNumber().get(0);
    }

    public void getArrayAdapterConnectBundles()
    {
        adapterListAdapterCodesMutableLiveData.setValue(ViewModelCodesDataConnectBundles);
    }

    public void getArrayAdapterHekayaBundles()
    {
        adapterListAdapterCodesMutableLiveData.setValue(ViewModelCodesDataHekayaBundles);
    }

    public void getArrayAdapterEntertainmentBundles()
    {
        adapterListAdapterCodesMutableLiveData.setValue(ViewModelCodesDataEntertainmentBundles);
    }

    public void getArrayAdapterCallCenter()
    {
        adapterListAdapterCodesMutableLiveData.setValue(ViewModelCodesDataCallCenter);
    }

    public void getArrayAdapterOthers()
    {
        adapterListAdapterCodesMutableLiveData.setValue(ViewModelCodesDataOthers);
    }

}
