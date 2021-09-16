package sara.ahmed.moatazsamir.main.pojo;

import java.util.ArrayList;

public class Etisalat extends Model {

    public Etisalat(String typeBundleName)
    {
        ArrayList<String> codeNumber = new ArrayList<>() ;
        ArrayList<String> codeDescription = new ArrayList<>() ;
        ArrayList<String> codeCategory = new ArrayList<>() ;
        ArrayList<String> separateCategories = new ArrayList<>() ;
        ArrayList<String> determineAction = new ArrayList<>() ;

        switch (typeBundleName)
        {
            case "ViewModelData":
                codeNumber.add("*557*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("#");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");

                break;

            case "ViewModelCodesDataConnectBundles":
                codeNumber.add("*566*1*5#");    codeDescription.add("كونكت 5 التقسيط\t\n" +"75 ميجا\n" +"2.5 جنيه ");    codeCategory.add("باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*10#");   codeDescription.add("كونكت 10 التقسيط\t\n" +"200 ميجا\n" +"5 جنيه ");    codeCategory.add( "باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*15#");   codeDescription.add("كونكت 15 التقسيط\t\n" +"سوشيال بلا حدود: \n" + "(Facebook - Twitter - WhatsApp - Instagram)\n" +   "50 ميجا لأي استخدام اخر للمواقع الاخرى \n" +"7.5 جنيه " );    codeCategory.add("باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*25#");   codeDescription.add("كونكت 25 التقسيط\t\n" +"640 ميجا\n" +"12.5 جنيه " );    codeCategory.add("باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*50#");   codeDescription.add("كونكت 50 التقسيط\t\n" + "1.5 جيجا\n" +"25 جنيه " );    codeCategory.add("باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*100#");  codeDescription.add("كونكت 100 التقسيط\t\n" +"3.5 جيجا\n" +"50 جنيه ");    codeCategory.add( "باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*1*150#");  codeDescription.add("كونكت 150 التقسيط\t\n"  +"6 ميجا\n" +"75 جنيه ");    codeCategory.add("باقات كونكت التقسيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566#");        codeDescription.add("(باقات ميجا الشهرية)\n" + "130 ميجا - 5 جنية\n" + "450 ميجا - 10 جنية\n" + "1000 ميجا - 20 جنية\n" + "2100 ميجا - 35 جنية\n" + "3400 ميجا - 50 جنية\n" + "5400 ميجا - 75 جنية\n" + "9000 ميجا - 100 جنية\n" + "12.000 ميجا - 150 جنية\n" + "20.000 ميجا - 250 جنية\n" + "40.000 ميجا - 400 جنية\n" + "(الباقات الاضافية)\n" + "7.5 ميجا - 250 جنية\n" + "15 ميجا - 750 جنية\n" + "30 ميجا - 1800 جنية");    codeCategory.add("باقات ميجا من سوبر كونكت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*721#");    codeDescription.add("60 دقيقة سوشيال - 3.5 جنيه - صالحة كل يوم");    codeCategory.add("باقات السوشيال بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*722#");    codeDescription.add("120 دقيقة سوشيال - 5 جنيه - صالحة كل يومين");    codeCategory.add( "باقات السوشيال بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*723#");    codeDescription.add( "180 دقيقة سوشيال - 7 جنيه - صالحة كل 3 أيام");    codeCategory.add("باقات السوشيال بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*724#");    codeDescription.add( "300 دقيقة سوشيال - 10 جنيه - صالحة كل 7 أيام");    codeCategory.add("باقات السوشيال بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*725#");    codeDescription.add("420  دقيقة سوشيال - 15 جنيه - صالحة كل 7 أيام");    codeCategory.add("باقات السوشيال بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*726#");    codeDescription.add("60 دقيقة فيديو - 3.5 جنيه - صالحة كل يوم");    codeCategory.add("باقات الفيديو بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*727#");    codeDescription.add("120 دقيقة فيديو - 5 جنيه - صالحة كل يومين");    codeCategory.add("باقات الفيديو بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*728#");    codeDescription.add("180 دقيقة فيديو - 7 جنيه - صالحة كل 3 ايام");    codeCategory.add("باقات الفيديو بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*729#");    codeDescription.add( "300 دقيقة فيديو - 10 جنيه - صالحة كل 7 ايام");    codeCategory.add( "باقات الفيديو بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*730#");    codeDescription.add("420 دقيقة فيديو - 15 جنيه - صالحة كل 7 ايام");    codeCategory.add("باقات الفيديو بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*731#");    codeDescription.add("90 دقيقة العاب - 2.5 جنيه قيمة الرصيد - كل يوم");    codeCategory.add( "باقات الالعاب بالوقت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*732#");    codeDescription.add("180 دقيقة العاب - 3.5 جنيه قيمة الرصيد - كل يومين");    codeCategory.add( "باقات الالعاب بالوقت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*733#");    codeDescription.add("360 دقيقة العاب - 5 جنيه قيمة الرصيد - كل 3 أيام");    codeCategory.add("باقات الالعاب بالوقت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*734#");    codeDescription.add("480 دقيقة العاب - 7 جنيه قيمة الرصيد - كل 7 أيام");    codeCategory.add("باقات الالعاب بالوقت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*735#");    codeDescription.add("720 دقيقة العاب - 10.5 جنيه قيمة الرصيد - كل 7 أيام");    codeCategory.add( "باقات الالعاب بالوقت");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*736#");    codeDescription.add("90 دقيقة مزيكا - 2.5 جنيه قيمة الرصيد - كل يوم");    codeCategory.add( "باقات المزيكا بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*737#");    codeDescription.add("180 دقيقة مزيكا - 3.5 جنيه قيمة الرصيد - كل يومين");    codeCategory.add("باقات المزيكا بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*738#");    codeDescription.add( "360 دقيقة مزيكا - 5 جنيه قيمة الرصيد - كل 3 أيام");    codeCategory.add("باقات المزيكا بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*739#");    codeDescription.add("480 دقيقة مزيكا - 7 جنيه قيمة الرصيد - كل 7 أيام");    codeCategory.add("باقات المزيكا بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*566*740#");    codeDescription.add( "720 دقيقة مزيكا - 10.5 جنيه قيمة الرصيد - كل 7 أيام");    codeCategory.add("باقات المزيكا بالوقت");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("https://www.etisalat.eg/etisalat/portal/mega_super_connect");    codeDescription.add("لمزيد من التفاصيل حول باقات ميجا من سوبر كونكت");    codeCategory.add("المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                codeNumber.add("https://www.etisalat.eg/etisalat/portal/summerpromo");    codeDescription.add("لمزيد من التفاصيل حول باقات كونكت التقسيط");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                codeNumber.add("https://www.etisalat.eg/etisalat/portal/internet_minutes");    codeDescription.add( "لمزيد من التفاصيل حول باقات الإنترنت بالدقايق");    codeCategory.add("المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                break;

            case "ViewModelCodesDataHekayaBundles":
                codeNumber.add("*809*1#");    codeDescription.add( "(تجديد اسبوع)\n" + "[حكاية 35] 212 ميكس - 9.30 جنيه\n" + "[حكاية 50] 350 ميكس - 13.25 جنيه\n" + "[حكاية 65] 500 ميكس - 17.25 جنيه\n" + "[حكاية 100] 825 ميكس - 26.50 جنيه\n" + "[حكاية 150] 1500 ميكس - 39.75 جنيه\n" + "[حكاية 200] 2250 ميكس - 53 جنيه");    codeCategory.add("باقات حكاية الاسبوعية");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*809*2#");    codeDescription.add( "(تجديد اسبوعين)\n" + "[حكاية 35] 425 ميكس - 18.55 جنيه\n" + "[حكاية 50] 700 ميكس - 26.50 جنيه\n" + "[حكاية 65] 1000 ميكس - 34.50 جنيه\n" + "[حكاية 100] 1650 ميكس - 53 جنيه\n" + "[حكاية 150] 3000 ميكس - 79.50 جنيه\n" + "[حكاية 200] 4500 ميكس - 106 جنيه");    codeCategory.add("باقات حكاية الاسبوعية");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*809*3#");    codeDescription.add( "(تجديد 3 اسابيع)\n" + "[حكاية 35] 637 ميكس - 27.85 جنيه\n" + "[حكاية 50] 1050 ميكس - 39.75 جنيه\n" + "[حكاية 65] 1500 ميكس - 51.70 جنيه\n" + "[حكاية 100] 2475 ميكس - 79.50 جنيه\n" + "[حكاية 150] 4500 ميكس - 119.25 جنيه\n" + "[حكاية 200] 6750 ميكس - 159 جنيه");    codeCategory.add("باقات حكاية الاسبوعية");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*35#");    codeDescription.add( "[حكاية 35]\n" +"عدد الميكسات الأساسية 850 - ضعف وحدات السوشيال 1400 ميجا\n" + "35 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*50#");    codeDescription.add( "[حكاية 50]\n" +"عدد الميكسات الأساسية 1400 - ضعف وحدات السوشيال 2800 ميجا\n" +"50 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*65#");    codeDescription.add("[حكاية 65]\n" +"عدد الميكسات الأساسية 2000 - ضعف وحدات السوشيال 4000 ميجا \n" + "65 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*100#");    codeDescription.add("[حكاية 100]\n" + "عدد الميكسات الأساسية 3300 - ضعف وحدات السوشيال 6600 ميجا\n" +"100 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*150#");    codeDescription.add( "[حكاية 150]\n" +"عدد الميكسات الأساسية 6000 - ضعف وحدات السوشيال 12000 ميجا\n" +"150 جنيه");    codeCategory.add( "باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*200#");    codeDescription.add("[حكاية 200]\n" +"عدد الميكسات الأساسية 9000 - ضعف وحدات السوشيال 18000 ميجا\n" +"200 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*689*200#");    codeDescription.add("[حكاية 200]\n" +"عدد الميكسات الأساسية 9000 - ضعف وحدات السوشيال 18000 ميجا\n" +"200 جنيه");    codeCategory.add("باقات حكاية الشهرية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*807#");    codeDescription.add("للتجديد المبكر");    codeCategory.add("ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*3333#");    codeDescription.add( "أخر العروض\n" +"خدمات نظام حكاية\n" + "استعلام عن الباقة والرصيد\n" + "تغيير النظام");    codeCategory.add("ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*319#");    codeDescription.add( "زود خط من باقة العيلة\n" + "الغاء خط من باقة العيلة\n" + "تحويل ميكسات");    codeCategory.add("ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("525");    codeDescription.add("للتحويل الى نظام حكاية" );    codeCategory.add( "ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("https://www.etisalat.eg/etisalat/portal/new_hekaya");    codeDescription.add("لمزيد من التفاصيل حول باقات انظمة حكاية");    codeCategory.add("المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                break;


            case "ViewModelCodesDataEntertainmentBundles":
                codeNumber.add("*5150#");    codeDescription.add("(كورة محلية)\n" + "استقبل يومياً أخبار عن الكورة المحلية وممكن \n" + "كمان تشاهد آخر الأخباروالفيديوهات الرياضية بدون\n" + " استخدام من باقة الانترنت الأساسية الخاصة بك\n" + "1 جنيه يومياً ");    codeCategory.add("اتصالات سبورتس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*2508#");    codeDescription.add("(كورة عالمية)\n" + "أستقبل رسائل يومية عن أخبار الكورة و\n" + " المنتخبات الاوروبية و ممكن تكسب و تسافر\n" + " تحضر ماتشات لفرقتك المفضلة\n" + "1 جنيه يومياً");    codeCategory.add("اتصالات سبورتس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("1500");    codeDescription.add("(سمعني)\n" + "كول تون هتغير فكرتك عن الكول تون.\n" + " تقدر تسمع كل اللي يتصل بيك احلي و\n" + " اجدد الرنات بدل الرنة العادية\n" + "5 جنية\\ شهر أو 20 قرش \\يوم");    codeCategory.add("اتصالات ميوزيك");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("*166#");    codeDescription.add("الاشتراك او الغاء خدمه الاخبار العاجله");    codeCategory.add("ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*515#");    codeDescription.add("الاشتراك في خدمه تحليل المباريات");    codeCategory.add("ارقام تهمك");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("https://www.etisalat.eg/etisalat/portal/entertainment_corner");    codeDescription.add("لمزيد من التفاصيل حول باقات ترفيه");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                break;

            case "ViewModelCodesDataCallCenter":
                codeNumber.add("0235346333");    codeDescription.add("اتصال بخدمه العملاء من التليفون الارضي");    codeCategory.add( "ارقام خدمه العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("01111234333");    codeDescription.add( "الاتصال بخدمه العملاء عن طريق اي شبكه مصريه");    codeCategory.add("ارقام خدمه العملاء");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("16511");    codeDescription.add( "الخط الساخن لخدمه عملاء اتصالات");    codeCategory.add( "ارقام خدمه العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("333");    codeDescription.add("خدمه عملاء اتصالات خط ساخن اخر");    codeCategory.add("ارقام خدمه العملاء");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("0235346377");    codeDescription.add("رقم الدعم الفني اتصالات");    codeCategory.add("ارقام خدمه العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                break;

            case "ViewModelCodesDataOthers":
                codeNumber.add("*80#");    codeDescription.add("اعرف رصيدك بيروح فين مع خدمة رصيدي. \n" + "هتتقدر تشوف كل العمليات التي قمت بها لحد 24 ساعة فاتوا\n" + " أو من أخر عملية شحن و كمان تقدر تشوف تفاصيل نظام خطك");    codeCategory.add("خدمه رصيدى");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*789#");    codeDescription.add("+ 10 رسايل مجانية في اليوم\n" + "دي خدمة هتقدر من خلالها تستقبل رسايل تعرفك مين\n" + " اتصل بيك لما الموبايل كان مغلق أو غير متاح.");    codeCategory.add("خدمه كول كيبر");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*911#");    codeDescription.add("دلوقتي تقدر تستلف من ٥ إلى ٧٠ جنيه تقدر\n" + " تستخدمهم في خدمات سلفني عالنوتة، انترنت\n" + " عالنوتة، مكالمة عالنوتة، رنات عالنوتة");    codeCategory.add("خدمه سوبر سلفني");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*777#");    codeDescription.add("اتصالات كاش");    codeCategory.add("خدمات متنوعه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*811#");    codeDescription.add("اقوي كارت في مصر");    codeCategory.add("خدمات متنوعه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*787#");    codeDescription.add("الكوا الكبير");    codeCategory.add("خدمات متنوعه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*911*7#");    codeDescription.add("الغاء خدمه الكول تون");    codeCategory.add( "خدمات متنوعه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*688#");    codeDescription.add("باقات المكالمات");    codeCategory.add("خدمات متنوعه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*404#");    codeDescription.add("دفع الفواتير");    codeCategory.add("خدمات متنوعه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*100#");    codeDescription.add("رسائل الضبط");    codeCategory.add("خدمات متنوعه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*15*5#");    codeDescription.add("اشتراك او الغاء خدمه الكول تون");    codeCategory.add("خدمات متنوعه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("555");    codeDescription.add("لمعرفه نظام خطك");    codeCategory.add( "خدمات متنوعه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("500");    codeDescription.add("لمعرفه احدث العروض");    codeCategory.add("خدمات متنوعه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                break;

        }







        setCodeNumber(codeNumber);
        setCodeDescription(codeDescription);
        setCodeCategory(codeCategory);
        setSeparateCategories(separateCategories);
        setDetermineAction(determineAction);
     }
}
