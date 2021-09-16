package sara.ahmed.moatazsamir.main.pojo;

import java.util.ArrayList;

public class We extends Model{
    public We(String typeBundleName)
    {
        ArrayList<String> codeNumber = new ArrayList<>() ;
        ArrayList<String> codeDescription = new ArrayList<>() ;
        ArrayList<String> codeCategory = new ArrayList<>() ;
        ArrayList<String> separateCategories = new ArrayList<>() ;
        ArrayList<String> determineAction = new ArrayList<>() ;

        switch (typeBundleName)
        {
            case "ViewModelData":
                codeNumber.add("*551*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                codeNumber.add("#");          codeDescription.add("تحويل رصيد");    codeCategory.add("codeCategory");    separateCategories.add("separateCategories");    determineAction.add("ACTION_DIAL");
                break;

            case "ViewModelCodesDataConnectBundles":
                codeNumber.add("*660*30#");          codeDescription.add( "[كنترول تظبيط 30]\n" + "موبايل إنترنت: 1,250 ميجابايت تصل الى 2,500 ميجابايت\n" + "دقائق الأساسية: 300\n" + "دقائق مجانية للخطوط الجديدة: 300 دقيقة لكل الشبكات + 500 دقيقة لشبكة WE\n" + "مجموع الدقائق: 1100");    codeCategory.add("نظام الكنترول تظبيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*660*40#");          codeDescription.add( "[كنترول تظبيط 40]\n" + "موبايل إنترنت: ميجابايت 2,250  تصل الى 4,500 ميجابايت\n" + "دقائق الأساسية: 400\n" + "دقائق مجانية للخطوط الجديدة: 400 دقيقة لكل الشبكات + 500 دقيقة لشبكة WE\n" + "مجموع الدقائق: 1300");    codeCategory.add("نظام الكنترول تظبيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*660*70#");          codeDescription.add( "كنترول تظبيط 70]\n" + "موبايل إنترنت: 5,250 ميجابايت تصل الى 10,500 ميجابايت\n" + "دقائق الأساسية: 500\n" + "دقائق مجانية للخطوط الجديدة: 500 دقيقة لكل الشبكات + 500 دقيقة لشبكة WE\n" + "مجموع الدقائق: 1500");    codeCategory.add("نظام الكنترول تظبيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*660*110#");          codeDescription.add( "[كنترول تظبيط 110]\n" + "موبايل إنترنت: 11,250 ميجابايت تصل الى 22,500 ميجابايت\n" + "دقائق الأساسية: 600\n" + "دقائق مجانية للخطوط الجديدة: 600 دقيقة لكل الشبكات + 500 دقيقة لشبكة WE\n" + "مجموع الدقائق: 1700");    codeCategory.add("نظام الكنترول تظبيط");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*660*05#");          codeDescription.add( "[الباقه الاضافية]\n" + "الدقائق: 500 دقيقة لشبكة WE\n" + "الصلاحية: 28 يوم\n" + "السعر: 5 جنيه\n" + "التجديد: لا تجدد تلقائيا");    codeCategory.add("نظام الكنترول تظبيط باقه اضافيه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*610*30#");          codeDescription.add( "[الأهلاوية 30]\n" + "موبايل إنترنت: 1,000 MB تصل الى 2,000 MB\n" + "دقائق لـلأهلاوية: 1000 دقيقة\n" + "دقائق لكل الشبكات: 400 دقيقة\n" + "الصلاحية: 30 يوم\n" + "مصاريف الاشتراك: 30 جنية");    codeCategory.add("خط الأهلاوية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*610*50#");          codeDescription.add( "[الأهلاوية 50]\n" + "موبايل إنترنت: MB 2,500  تصل الى5,000 MB\n" + "دقائق لـلأهلاوية: 1000 دقيقة\n" + "دقائق لكل الشبكات: 700 دقيقة\n" + "الصلاحية: 30 يوم\n" + "مصاريف الاشتراك: 50 جنية");    codeCategory.add("خط الأهلاوية");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*617*25#");          codeDescription.add( "[نظام 25 WE Club]\n" + "موبايل إنترنت: 1,000 MB تصل الى 2,000 MB\n" + "دقائق أساسية لكل الشبكات: 400\n" + "مكالمات لخطوط WE Club لكل الشبكات: 500 دقيقه\n" + "الصلاحية: 30 يوم\n" + "الاشتراك من الرصيد: 25 جنية");    codeCategory.add("نظام WE Club");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*617*40#");          codeDescription.add( "[نظام 40 WE Club]\n" + "موبايل إنترنت: 2,000 MB تصل الى 4,000 MB\n" + "دقائق أساسية لكل الشبكات: 700\n" + "مكالمات لخطوط WE Club لكل الشبكات: 500 دقيقه\n" + "الصلاحية: 30 يوم\n" + "الاشتراك من الرصيد: 40 جنية");    codeCategory.add("نظام WE Club");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*617*65#");          codeDescription.add( "[نظام 65 WE Club]\n" + "موبايل إنترنت: 5,000 MB تصل الى 10,000 MB\n" + "دقائق أساسية لكل الشبكات: 800\n" + "مكالمات لخطوط WE Club لكل الشبكات: 500 دقيقه\n" + "الصلاحية: 30 يوم\n" + "الاشتراك من الرصيد: 65 جنية");    codeCategory.add("نظام WE Club");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*617*100#");          codeDescription.add( "[نظام 100 WE Club]\n" + "موبايل إنترنت: 10,000 MB تصل الى20,000 MB\n" + "دقائق أساسية لكل الشبكات: 800\n" + "مكالمات لخطوط WE Club لكل الشبكات: 500 دقيقه\n" + "الصلاحية: 30 يوم\n" + "الاشتراك من الرصيد: 100 جنية");    codeCategory.add("نظام WE Club");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*617*300#");          codeDescription.add( "[باقات اضافيه]\n" + "الدقائق: 300 دقيقة لكل الشبكات\n" + "السعر: 5 جنية\n" + "الصلاحية: 30 يوم\n" + "التجديد: لا تجدد تلقائيا");    codeCategory.add("نظام WE Club باقات اضافيه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*617*500#");          codeDescription.add( "[باقات اضافيه]\n" + "الدقائق: 500 دقيقة داخل شبكة WE\n" + "السعر: 5 جنية\n" + "الصلاحية: 30 يوم\n" + "التجديد: لا تجدد تلقائيا");    codeCategory.add("نظام WE Club باقات اضافيه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*999*10#");          codeDescription.add( "[ 10 Nitro Prime]\n" + "حتى 1250 ميجا\n" + "السعر (غير شامل الضريبة): 10 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*10#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*20#");          codeDescription.add( "[ 20 Nitro Prime]\n" + "حتى 2750 ميجا\n" + "السعر (غير شامل الضريبة): 20 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*20#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*40#");          codeDescription.add( "[ 40 Nitro Prime]\n" + "حتى 6500 ميجا\n" + "السعر (غير شامل الضريبة): 40 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*40#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*70#");          codeDescription.add( "[ 70 Nitro Prime]\n" + "حتى 12500 ميجا\n" + "السعر (غير شامل الضريبة): 70 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*70#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*100#");          codeDescription.add( "[ 100 Nitro Prime]\n" + "حتى 20000 ميجا\n" + "السعر (غير شامل الضريبة): 100 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*100#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*200#");          codeDescription.add( "[ 200 Nitro Prime]\n" + "حتى 74000 ميجا\n" + "السعر (غير شامل الضريبة): 200 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*200#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*450#");          codeDescription.add( "[ 450 Nitro Prime]\n" + "حتى 100000 ميجا\n" + "السعر (غير شامل الضريبة): 450 جنيه / الشهر\n" + "صلاحية الباقة: شهر\n" + "كود الإشتراك (عملاء الفاتوره): *888*450#");    codeCategory.add("باقات Nitro Prime");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*990*20#");          codeDescription.add( "[Nitro X Social]\n" + "سوشيال بلا حدود\n" + "السعر بدون ضريبه: 20 جنيه/شهر\n" + "صلاحية الباقه: شهر");    codeCategory.add("Nitro X باقات");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*990*50#");          codeDescription.add( "[Nitro X Video Plus]\n" + "سوشيال بلا حدود + YouTube\n" + "السعر بدون ضرايب: 50 جنيه/شهر\n" + "صلاحية الباقه: شهر");    codeCategory.add("Nitro X باقات");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*999*250#");          codeDescription.add( "[Nitro Extra Streaming]\n" + "(فيديو يوميه)\n" + "الباقه 250 ميجا\n" + "السعر (غير شامل الضريبه): 2 جنيه/يوم\n" + "صلاحية الباقه: 24 ساعه");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*1250#");          codeDescription.add( "[Nitro Extra Streaming]\n" + "(فيديو اسبوعيه)\n" + "الباقه 1250 ميجا\n" + "السعر (غير شامل الضريبه): 10 جنيه/يوم\n" + "صلاحية الباقه: 7 أيام");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*3500#");          codeDescription.add( "[Nitro Extra Streaming]\n" + "(فيديو شهريه)\n" + "الباقه 3500 ميجا\n" + "السعر (غير شامل الضريبه): 25 جنيه/شهر\n" + "صلاحية الباقه: شهر");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*999*25#");          codeDescription.add( "[Nitro Extra Daily]\n" + "(يوميه 1 جنيه)\n" + "الباقه تصل الى 50 ميجا\n" + "السعر (غير شامل الضريبه): 1 جنيه/يوم\n" + "صلاحية الباقه: 24 ساعه");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*315#");          codeDescription.add( "[Nitro Extra Daily]\n" + "(يوميه 5 جنيه)\n" + "الباقه 315 ميجا\n" + "السعر (غير شامل الضريبه): 5 جنيه/يوم\n" + "صلاحية الباقه: 24 ساعه");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("*999*101#");          codeDescription.add( "[Nitro Extra Monthly]\n" + "(Extra الشهريه)\n" + "الباقه1 جيجا \n" + "السعر (غير شامل الضريبه): 20 جنيه/شهر\n" + "صلاحية الباقه: شهر");    codeCategory.add("باقات Nitro Extra");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");

                codeNumber.add("15179");          codeDescription.add( "[Nitro Exclusive learning]\n" + "(خط طلاب المدارس)\n" + "الباقه:1 جيجا \n" + "السعر (غير شامل الضريبه): 5 جنيه/شهر\n" + "صلاحية الباقه: شهر");    codeCategory.add("باقات Nitro exclusive Learning");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");

                codeNumber.add("https://te.eg/wps/portal/te/Personal/Mobile/KIX/!ut/p/z1/lZFBU4MwEIX_ipceM7sESsiRKWNFrJ2K2pKLgyRoLARao1P_vaHTGU_FaW5J3u5-7y0I2IAw5bd-K63uTNm4eyHClykmNMUc76Ign-EqpMxL8xuKiLA-CrJVQr3lHLNldu9jvOAJzq5DDxcMxHj9MwgQlbG9fYfCqgnu1aeWylhdNhNsu1fdqKu2k1-N-6s6Y_ede9_qw1DXV1pCUfmcKcYjUkqpSFDRKYmCwCcykH4dspq6eSfOEZCBE8-cePApjpI_pzzkzmmaIH9gFCN6Eoz0yJWBwnGwsxxzCvmFxm7_S9itUH_sdiJ2Obv81MHC5qKg-_apjfwfsq2Tx7pdx796cFU3/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvYXI!/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FMobile%2BModule%2FControl%2FControl_Tazbeet%2F");    codeDescription.add("لمزيد من التفاصيل حول نظام الكنترول تظبيط");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                codeNumber.add("https://te.eg/wps/portal/te/Personal/Mobile/KIX/!ut/p/z1/lZFBU4MwEIX_ipceM7sESsiRKWNFrJ2K2pKLgyRoLARao1P_vaHTGU_FaW5J3u5-7y0I2IAw5bd-K63uTNm4eyHClykmNMUc76Ign-EqpMxL8xuKiLA-CrJVQr3lHLNldu9jvOAJzq5DDxcMxHj9MwgQlbG9fYfCqgnu1aeWylhdNhNsu1fdqKu2k1-N-6s6Y_ede9_qw1DXV1pCUfmcKcYjUkqpSFDRKYmCwCcykH4dspq6eSfOEZCBE8-cePApjpI_pzzkzmmaIH9gFCN6Eoz0yJWBwnGwsxxzCvmFxm7_S9itUH_sdiJ2Obv81MHC5qKg-_apjfwfsq2Tx7pdx796cFU3/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvYXI!/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FMobile%2BModule%2FControl%2FAl-Ahly%2F");    codeDescription.add("لمزيد من التفاصيل حول خط الأهلاوية");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                codeNumber.add("https://te.eg/wps/portal/te/Personal/Mobile/KIX/!ut/p/z1/lZFBU4MwEIX_ipceM7sESsiRKWNFrJ2K2pKLgyRoLARao1P_vaHTGU_FaW5J3u5-7y0I2IAw5bd-K63uTNm4eyHClykmNMUc76Ign-EqpMxL8xuKiLA-CrJVQr3lHLNldu9jvOAJzq5DDxcMxHj9MwgQlbG9fYfCqgnu1aeWylhdNhNsu1fdqKu2k1-N-6s6Y_ede9_qw1DXV1pCUfmcKcYjUkqpSFDRKYmCwCcykH4dspq6eSfOEZCBE8-cePApjpI_pzzkzmmaIH9gFCN6Eoz0yJWBwnGwsxxzCvmFxm7_S9itUH_sdiJ2Obv81MHC5qKg-_apjfwfsq2Tx7pdx796cFU3/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvYXI!/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FMobile%2BModule%2FControl%2FWEClub%2F");    codeDescription.add("لمزيد من التفاصيل حول نظام WE Club");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");

                codeNumber.add("https://te.eg/wps/portal/te/Personal/Mobile/Nitro-mobile-internet/!ut/p/z1/jY_LDoIwEEU_qZfhZZeVFqyADQ8jdmNYERJFF8bvF4yJicTH7CY5J3OGWdYwO7S3vmuv_Xloj-O-t8HBhySNClli1hGKpTKeKisXHtjuAaSFJMckSA0POESuJXgZEhbE7D_-F2Dy8WHE5Nu3E1WiIGLlZ3VYU7SiJ_BKTDfumMglojhwkIczYP7Dr4rLadug190d9sN_7g!!/dz/d5/L0lDUmlTUSEhL3dHa0FKRnNBLzROV3FpQSEhL2Fy/");    codeDescription.add("لمزيد من التفاصيل حول باقات Nitro");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");

                break;

            case "ViewModelCodesDataHekayaBundles":
                codeNumber.add("*666*17#");          codeDescription.add("[كيكس 17]\n" + "الكيكسات الأساسية وحدات سوشيال: 500 كيكس تصل إلي 1,000 كيكس\n" + "مصاريف الإشتراك: 17 جنية");    codeCategory.add("أنظمة كنترول كيكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*666*25#");          codeDescription.add("[كيكس 25]\n" + "الكيكسات الأساسية وحدات سوشيال: 1,100 كيكس تصل إلي 2,200 كيكس\n" + "مصاريف الإشتراك: 25 جنية");    codeCategory.add("أنظمة كنترول كيكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*666*35#");          codeDescription.add("[كيكس 35]\n" + "الكيكسات الأساسية وحدات سوشيال: 1,850 كيكس تصل إلي3,700 كيكس\n" + "مصاريف الإشتراك: 35 جنية");    codeCategory.add("أنظمة كنترول كيكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*666*45#");          codeDescription.add("[كيكس 45]\n" + "الكيكسات الأساسية وحدات سوشيال: 2,600 كيكس تصل إلي 5,200 كيكس\n" + "مصاريف الإشتراك: 45 جنية");    codeCategory.add("أنظمة كنترول كيكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*666*75#");          codeDescription.add("[كيكس 75]\n" + "الكيكسات الأساسية وحدات سوشيال: 4,600 كيكس تصل إلي9,200 كيكس\n" + "مصاريف الإشتراك: 75 جنية");    codeCategory.add("أنظمة كنترول كيكس");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*666*8#");          codeDescription.add("[كيكس 12]\n" + "الكيكسات الأساسية وحدات سوشيال: 100\n" + "مصاريف التجديد الجزئي: 4.25 جنية\n" + "\n" + "[كيكس 20]\n" + "الكيكسات: 220\n" + "مصاريف الإشتراك: 6.25 جنية\n" + "\n" + "[كيكس 30]\n" + "الكيكسات: 370\n" + "مصاريف التجديد الجزئي: 8.75 جنية\n" + "\n" + "[كيكس 40]\n" + "الكيكسات: 520\n" + "مصاريف التجديد الجزئي: 11.25 جنية\n" + "\n" + "[كيكس 60]\n" + "الكيكسات: 920\n" + "مصاريف التجديد الجزئي: 18.75 جنية");    codeCategory.add("أنظمة كنترول كيكس للتجديد الجزئي");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("https://te.eg/wps/portal/te/Personal/Mobile/KIX/!ut/p/z1/lZFBU4MwEIX_ipceM7sESsiRKWNFrJ2K2pKLgyRoLARao1P_vaHTGU_FaW5J3u5-7y0I2IAw5bd-K63uTNm4eyHClykmNMUc76Ign-EqpMxL8xuKiLA-CrJVQr3lHLNldu9jvOAJzq5DDxcMxHj9MwgQlbG9fYfCqgnu1aeWylhdNhNsu1fdqKu2k1-N-6s6Y_ede9_qw1DXV1pCUfmcKcYjUkqpSFDRKYmCwCcykH4dspq6eSfOEZCBE8-cePApjpI_pzzkzmmaIH9gFCN6Eoz0yJWBwnGwsxxzCvmFxm7_S9itUH_sdiJ2Obv81MHC5qKg-_apjfwfsq2Tx7pdx796cFU3/dz/d5/L0lHSkovd0RNQUZrQUVnQSEhLzROVkUvYXI!/");    codeDescription.add("لمزيد من التفاصيل حول أنظمة كنترول كيكس");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");

                break;

            case "ViewModelCodesDataEntertainmentBundles":

                codeNumber.add("#404*");          codeDescription.add( "هى مكتبة من الافلام و المسلسلات والبرامج , تتيح لعملاء الموبايل إمكانية تصفح المحتوى الخاص بالمكتبة بدون فواصل او اى مواد اعلانية من خلال اشتراك يومى او شهرى , بإلاضافة الى تشغيل متوافق على جميع انواع اجهزة التليفون المحمول الذكية , الاجهزة اللوحية او اجهزة التلفاز الذكية.");    codeCategory.add("خدمه WE TV");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("#777*");          codeDescription.add( "خدمة الكول تون من وي تسمح للمتصلين برقمك بالاستمتاع بنغمة مخصصة حسب اختيارك من مكتبة النغمات, بدلا من النغمة المعتادة للمكالمات.\n" + "تحميل كول تون جديدة 5 جنيه\n" + "تجديد الكول تون 3 جنيه/شهريا.\n" + "ميوزيك بوكس 10 جنيه.\n" + "تجديد الميوزيك بوكس 5 جنيه/شهريا.\n" + "الكول تون \"خاصية الأذان\" 1 جنيه/شهرياً.");    codeCategory.add("خدمه كول تون");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("https://www.te.eg/wps/portal/te/Personal/Mobile/Entertainment/!ut/p/z1/jZDdboJAEIWfZi_rHFblp3cEBClatWqKe2MgWZGEAlm2NX37orZpotF27mZyvpkzhwQlJKr0o8hTXdRVWnb9RpjbIXweYYlJaM9NLNZjLwrgGcCAXk-CeOFzYxYinjmmA3ca-XBeLA6bk_gPf0dw5HGjXHS8uDixDEdwg9FwsrJW3Bvzb8Gvxfi531l0fHiBaWBqXQmuf_jLxROJvKyzc2BulfXtnISSO6mk6r2rbrzXumkfGRi07Mmc4dC0DE2tdFoeZwxzqdqfzC9X7OtWU3IiqXlbJyiiB5F9Hr4AKnYkHA!!/dz/d5/L0lDUmlTUSEhL3dHa0FKRnNBLzROV3FpQSEhL2Fy/");    codeDescription.add("لمزيد من التفاصيل حول أنظمة كنترول كيكس");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");

                break;

            case "ViewModelCodesDataCallCenter":
                codeNumber.add("111");          codeDescription.add( "للاتصال بخدمة العملاء علي خط ساخن");    codeCategory.add("خدمة العملاء");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("01555000111");          codeDescription.add( "للاتصال بخدمة العملاء من اي موبيل");    codeCategory.add("خدمة العملاء");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_CALL");
                codeNumber.add("https://www.te.eg/wps/portal/te/About/Contact%20Us/!ut/p/z1/04_iUlDg4uLSjwDSQBYygZujH5WXWJaZnliSmZ-XmKMfoR8ZZRbvHehiZOjvbuDtb-LhZuDoaubq6mLhZ-TubKjvpR-FX0FwYpF-QXagIgDj_8RV/");    codeDescription.add("لمزيد من التفاصيل حول ارقام خدمه العملاء");    codeCategory.add( "المصدر الرئيسي");    separateCategories.add("URLSource");    determineAction.add("ACTION_VIEW");
                break;

            case "ViewModelCodesDataOthers":
                codeNumber.add("*550#");          codeDescription.add( "معرفه الرصيد");    codeCategory.add("معلومات عن الرصيد");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*688#");          codeDescription.add( "معرفه الرقم");    codeCategory.add("معلومات عن الخط");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*414#");          codeDescription.add( "الباقي من الباقه");    codeCategory.add("معلومات عن الباقه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999#");          codeDescription.add( "لاشتراك في باقه نت");    codeCategory.add("معلومات عن الباقه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*2#");          codeDescription.add( "تجديد النت في اي وقت");    codeCategory.add("معلومات عن الباقه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*999*0#");          codeDescription.add( "الغاء باقه النت");    codeCategory.add("معلومات عن الباقه");    separateCategories.add("SecondCategory");    determineAction.add("ACTION_DIAL");
                codeNumber.add("*504#");          codeDescription.add( "خدمه سلفني");    codeCategory.add("خدمات عامه");    separateCategories.add("FirstCategory");    determineAction.add("ACTION_DIAL");
                break;
        }

        setCodeNumber(codeNumber);
        setCodeDescription(codeDescription);
        setCodeCategory(codeCategory);
        setSeparateCategories(separateCategories);
        setDetermineAction(determineAction);

    }
}
