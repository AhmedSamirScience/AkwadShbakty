package sara.ahmed.moatazsamir.main.pojo;

import java.util.ArrayList;

public class Vodafone extends Model  {


    public Vodafone(String typeBundleName) {
        ArrayList<String> codeNumber = new ArrayList<>();
        ArrayList<String> codeDescription = new ArrayList<>();
        ArrayList<String> codeCategory = new ArrayList<>();
        ArrayList<String> separateCategories = new ArrayList<>();
        ArrayList<String> determineAction = new ArrayList<>();


        switch (typeBundleName)
        {
            case "ViewModelData":
                codeNumber.add("*868*2*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("#");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                break;

            case "ViewModelCodesDataConnectBundles":
                codeNumber.add("*00*15#");    codeDescription.add("[2000 سوبرميجا]\n" + "15 جنيه\n" + "لو باقة فليكس مش متجددة ليك 1500 سوبر ميجا");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*25#");    codeDescription.add("[3500 سوبرميجا]\n" + "25 جنيه\n" + "لو باقة فليكس مش متجددة ليك 2800 سوبر ميجا");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*35#");    codeDescription.add("[6000 سوبر ميجا]\n" + "35 جنيه\n" + "لو باقة فليكس مش متجددة ليك 4500 سوبر ميجا");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*45#");    codeDescription.add("[8000 سوبر ميجا]\n" + "45 جنيه\n" + "لو باقة فليكس مش متجددة ليك 6000 سوبر ميجا");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*65#");    codeDescription.add("[12000 سوبر ميجا]\n" + "65 جنيه\n" + "لو باقة فليكس مش متجددة ليك 9500 سوبر ميجا");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*07#");    codeDescription.add("[500 سوبر ميجا]\n" + "7 جنيه");    codeCategory.add("باقات Plus الجديدة");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*00#");    codeDescription.add("للإشترك و متابعة استهلاكك");    codeCategory.add("اكواد تهمك");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*00*120#");    codeDescription.add("باقة Plus كومبو 20000 سوبرميجا\n" + "120 جنيه");    codeCategory.add("باقات Plus APPs كومبو");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*200#");    codeDescription.add("باقة Plus كومبو 36000 سوبرميجا\n" + "200 جنيه");    codeCategory.add("باقات Plus APPs كومبو");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*00*300#");    codeDescription.add("باقة Plusكومبو 58000 سوبرميجا\n" + "300 جنيه");    codeCategory.add("باقات Plus APPs كومبو");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*2000*5#");    codeDescription.add("150 ميجا\n" + "5 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*10#");    codeDescription.add("500 ميجا\n" + "10 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*20#");    codeDescription.add("1,100 ميجا بايت\n" + "20 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*30#");    codeDescription.add("1,800 ميجا بايت\n" + "30 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*40#");    codeDescription.add("2,500 ميجا بايت\n" + "40 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*60#");    codeDescription.add("4,000 ميجا بايت\n" + "60 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*80#");    codeDescription.add("6,000 ميجا بايت\n" + "80 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*100#");    codeDescription.add("8,000 ميجا بايت\n" + "100 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*150#");    codeDescription.add("12,000 ميجا بايت\n" + "150 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*250#");    codeDescription.add("20,000 ميجا بايت\n" + "250 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000*400#");    codeDescription.add("40,000 ميجا بايت\n" + "400 جنيه");    codeCategory.add("باقات باقات اكستريم الاساسيه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                break;

            case "ViewModelCodesDataHekayaBundles":
                codeNumber.add("*025#");    codeDescription.add("[فليكس 25]\n" + "600 فليكسات\n" + "25 جنيه/شهرياً");    codeCategory.add("باقات فليكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*035#");    codeDescription.add("[فليكس 35]\n" + "1400 فليكسات\n" + "35 جنيه/شهرياً");    codeCategory.add("باقات فليكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*060#");    codeDescription.add("[فليكس 60]\n" + "2700 فليكسات\n" + "60 جنيه/شهرياً");    codeCategory.add("باقات فليكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*880*03#");    codeDescription.add("[فليكس اكسترا 3]\n" + "فليكس إكسترا 3 جنيه هينّزلك 60 فليكس");    codeCategory.add("باقات فليكس");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*880*05#");    codeDescription.add("[فليكس اكسترا 5]\n" + "فليكس إكسترا 5 جنيه هينّزلك 120 فليكس");    codeCategory.add("باقات فليكس");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*880*010#");    codeDescription.add("[فليكس اكسترا 10]\n" + "فليكس إكسترا 10 جنيه هينّزلك 300 فليكس");    codeCategory.add("باقات فليكس");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*225#");    codeDescription.add("ممكن تجدد الباقة ببلاش. لو جددت باقتك فى ميعادها, كل الفليكسات المتبقية من الباقة الحالية هتكمل معاك فى الباقة الجديدة");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*60#");    codeDescription.add("لو عايز تعرف تفاصيل استهلاك بافتك ببلاش");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*60*7#");    codeDescription.add("عشان تعرف رصيدك الحالى ببلاش");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*9001#");    codeDescription.add("لو عايز تعرف سعر المكالمة بعد نهاية كل المكالمة ب1 قرش");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*880*23#");    codeDescription.add("فليكساتك بتخلص بسرعة على النت؟ دخل حد أقصى لعدد الفليكسات للنت من اول 5 فليكسات او مضاعفتها ببلاش");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2000#");    codeDescription.add("لو باقة فليكس خلصت وأنت لسة عايز تستمتع بالنت وأختار اكتر باقة تناسبك");    codeCategory.add("اكواد تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                break;


            case "ViewModelCodesDataEntertainmentBundles":
                codeNumber.add("*55#");    codeDescription.add("ريح بالك مع خدمة مواعيد الصلاة من ڤودافون اللى هتفكرك بميعاد كل صلاة قبلها بالوقت اللي أنت هتختاره و كمان حسب التوقيت المحلى لمدينة اختيارك \n" + "كمان هتجيلك رسالة كل يوم مساءاَ بمواعيد الصلاة لليوم التالى \n" + "تكلفة الخدمة: 20 قرش فى اليوم أو 3 جنيه فى الشهر");    codeCategory.add("خدمة مواقيت الصلاه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*444#");    codeDescription.add("إستمتع بصور و ادعية و ايات قرأنية يومياً و خدمة الكول تون بصوت الشيخ محمود الحصري.\n" + "\n" + "أول 3 ايام تشترك بيهم في الخدمة ببلاش، و بعد كده سيتم سحب 50 قرش من رصيدك كل يوم .");    codeCategory.add("خدمة مواقيت الصلاه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                break;

            case "ViewModelCodesDataCallCenter":
                codeNumber.add("888");    codeDescription.add("للاتصال من اى رقم ڤودافون\n" + "للكارت،ايزى وفليكس ب 50 قرش للمكالمة لنظام الخط ببلاش");    codeCategory.add("خدمة العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("16888");    codeDescription.add("للاتصال من اى رقم موبايل\n" + "نفس اسعار مكالمات الخطوط الارضية");    codeCategory.add("خدمة العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("0225292888");    codeDescription.add("للاتصال من اى خط ارضى\n" + "نفس اسعار مكالمات الخطوط الارضية");    codeCategory.add("خدمة العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("00201001888888");    codeDescription.add("للاتصال من اى خط ارضى\n" + "نفس اسعار مكالمات الخطوط الارضية");    codeCategory.add("خدمة العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");

                codeNumber.add("2828");    codeDescription.add("للاتصال من اى رقم ڤودافون\n" + "50 قرش للمكالمة ماعدا نظام الخط");    codeCategory.add("خدمة عملاء الانترنت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("0225292828");    codeDescription.add(" للاتصال من اى خط ارضى\n" + "نفس اسعار مكالمات الخطوط الارضية");    codeCategory.add("خدمة عملاء الانترنت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");

                codeNumber.add("7001");    codeDescription.add("للاتصال من اى رقم ڤودافون 50 قرش للمكالمة\n" + "ماعدا نظام الخط");    codeCategory.add("خدمة عملاء ڤودافون كاش");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");


                codeNumber.add("2121");    codeDescription.add("للاتصال من اى رقم ڤودافون 1.5 جنية للدقيقة");    codeCategory.add("خدمة الدليل");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");


                codeNumber.add("5065");    codeDescription.add("للاتصال من اى رقم ڤودافون 50 قرش للمكالمة\n" + "ماعدا نظام الخط");    codeCategory.add("خدمة التسوق اون لاين");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("0225292860");    codeDescription.add("للاتصال من اى خط ارضي 50 قرش للمكالمة\n" + "ماعدا نظام الخط");    codeCategory.add("خدمة التسوق اون لاين");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");

                codeNumber.add("247");    codeDescription.add("للاتصال من اى رقم ڤودافون ببلاش");    codeCategory.add("خدمة عملاء الشركات");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("16247");    codeDescription.add("للاتصال  من اى خط ارضى نفس اسعار مكالمات الخطوط الارضية");    codeCategory.add("خدمة عملاء الشركات");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");


                break;

            case "ViewModelCodesDataOthers":
                codeNumber.add("*868*1#");    codeDescription.add("لمعرفه الرصيد");    codeCategory.add("معلومات عن الرصيد");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                break;

        }



        setCodeNumber(codeNumber);
        setCodeDescription(codeDescription);
        setCodeCategory(codeCategory);
        setSeparateCategories(separateCategories);
        setDetermineAction(determineAction);
    }

    }
