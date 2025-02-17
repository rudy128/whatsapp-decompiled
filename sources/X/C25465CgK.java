package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CgK  reason: case insensitive filesystem */
public abstract class C25465CgK {
    public static final AnonymousClass00O A00;
    public static final AnonymousClass00O A01;
    public static final AnonymousClass00O A02;
    public static final AnonymousClass1LB A03;
    public static final HashMap A04;
    public static final Set A05;

    static {
        AnonymousClass00O r1 = new AnonymousClass00O(24);
        A02 = r1;
        r1.put("am", 4768);
        r1.put("ar", 1593);
        r1.put("az", 399);
        r1.put("bn", 2437);
        r1.put("zh-Hans", 35831);
        r1.put("zh-Hant", 35531);
        r1.put("hr", 273);
        r1.put("gu", 2693);
        r1.put("hi", 2308);
        r1.put("kn", 3205);
        r1.put("kk", 1201);
        r1.put("lo", 3713);
        r1.put("mk", 1107);
        r1.put("ml", 3333);
        r1.put("mr", 2418);
        r1.put("fa", 1740);
        r1.put("pa", 2576);
        r1.put("ro", 539);
        r1.put("sr", 1115);
        r1.put("ta", 2949);
        r1.put("te", 3077);
        r1.put("th", 3585);
        r1.put("uk", 1111);
        r1.put("ur", 1746);
        AnonymousClass00O r12 = new AnonymousClass00O(14);
        A01 = r12;
        A00(r12, "ar", 1632);
        A00(r12, "bn", 2534);
        A00(r12, "fa", 1776);
        A00(r12, "gu", 2790);
        A00(r12, "hi", 2406);
        A00(r12, "kn", 3302);
        A00(r12, "lo", 3792);
        A00(r12, "ml", 3430);
        A00(r12, "mr", 2406);
        A00(r12, "pa", 2662);
        A00(r12, "ta", 3046);
        A00(r12, "te", 3174);
        A00(r12, "th", 3664);
        A00(r12, "ur", 1776);
        AnonymousClass1LB r8 = new AnonymousClass1LB(47);
        A03 = r8;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "fa-AF";
        A1Z[1] = "en-GB";
        r8.A03("AF", A1Z);
        String[] A1Z2 = C17880vN.A1Z();
        AnonymousClass8BS.A1B("sq-AL", "en-GB", A1Z2);
        r8.A03("AL", A1Z2);
        String[] A1Z3 = C17880vN.A1Z();
        A1Z3[0] = "ar-DZ";
        A1Z3[1] = "fr-DZ";
        r8.A03("DZ", A1Z3);
        String[] A1b = BE6.A1b(r8, new String[]{"ca-AD", "es-ES", "pt-PT", "fr-FR"}, "AD", 1);
        A1b[0] = "es-AR";
        String[] A1b2 = BE6.A1b(r8, A1b, "AR", 1);
        A1b2[0] = "en-AU";
        String[] A1b3 = BE6.A1b(r8, A1b2, "AU", 1);
        A1b3[0] = "de-AT";
        r8.A03("AT", A1b3);
        String[] A1b4 = BE6.A1b(r8, new String[]{"az-AZ", "ru-RU", "tr-TR"}, "AZ", 2);
        A1b4[0] = "ar-BH";
        A1b4[1] = "en-GB";
        String[] A1b5 = BE6.A1b(r8, A1b4, "BH", 2);
        A1b5[0] = "bn-BD";
        A1b5[1] = "en-GB";
        String[] A1b6 = BE6.A1b(r8, A1b5, "BD", 2);
        A1b6[0] = "nl-BE";
        A1b6[1] = "fr-BE";
        String[] A1b7 = BE6.A1b(r8, A1b6, "BE", 1);
        A1b7[0] = "es-BO";
        String[] A1b8 = BE6.A1b(r8, A1b7, "BO", 2);
        A1b8[0] = "hr-BA";
        A1b8[1] = "sr-BA";
        String[] A1b9 = BE6.A1b(r8, A1b8, "BA", 1);
        A1b9[0] = "pt-BR";
        r8.A03("BR", A1b9);
        r8.A03("BN", new String[]{"ms-BN", "en-GB", "zh-CN", "zh-TW"});
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "fr-BF";
        String[] A1b10 = BE6.A1b(r8, A1Y, "BF", 3);
        A1b10[0] = "en-BI";
        A1b10[1] = "fr-BI";
        A1b10[2] = "sw-TZ";
        String[] A1b11 = BE6.A1b(r8, A1b10, "BI", 2);
        A1b11[0] = "fr-CM";
        A1b11[1] = "en-CM";
        r8.A03("CM", A1b11);
        String[] A1b12 = BE6.A1b(r8, new String[]{"en-CA", "fr-CA"}, "CA", 2);
        A1b12[0] = "fr-TD";
        A1b12[1] = "ar-TD";
        String[] A1b13 = BE6.A1b(r8, A1b12, "TD", 1);
        A1b13[0] = "es-CL";
        String[] A1b14 = BE6.A1b(r8, A1b13, "CL", 1);
        A1b14[0] = "es-CO";
        r8.A03("CO", A1b14);
        String[] A1b15 = BE6.A1b(r8, new String[]{"fr-KM", "en-GB", "ar-KM"}, "KM", 2);
        A1b15[0] = "fr-CD";
        A1b15[1] = "sw-CD";
        String[] A1b16 = BE6.A1b(r8, A1b15, "CD", 1);
        A1b16[0] = "es-CR";
        String[] A1b17 = BE6.A1b(r8, A1b16, "CR", 1);
        A1b17[0] = "es-CU";
        String[] A1b18 = BE6.A1b(r8, A1b17, "CU", 1);
        A1b18[0] = "cs-CZ";
        r8.A03("CZ", A1b18);
        String[] A1b19 = BE6.A1b(r8, new String[]{"fr-DJ", "en-GB", "ar-DJ"}, "DJ", 1);
        A1b19[0] = "es-DO";
        String[] A1b20 = BE6.A1b(r8, A1b19, "DO", 1);
        A1b20[0] = "es-EC";
        String[] A1b21 = BE6.A1b(r8, A1b20, "EC", 1);
        A1b21[0] = "ar-EG";
        String[] A1b22 = BE6.A1b(r8, A1b21, "EG", 1);
        A1b22[0] = "es-SV";
        String[] A1b23 = BE6.A1b(r8, A1b22, "SV", 2);
        A1b23[0] = "en-ER";
        A1b23[1] = "ar-ER";
        String[] A1b24 = BE6.A1b(r8, A1b23, "ER", 1);
        A1b24[0] = "fi-FI";
        String[] A1b25 = BE6.A1b(r8, A1b24, "FI", 1);
        A1b25[0] = "fr-FR";
        String[] A1b26 = BE6.A1b(r8, A1b25, "FR", 1);
        A1b26[0] = "de-DE";
        String[] A1b27 = BE6.A1b(r8, A1b26, "DE", 1);
        A1b27[0] = "en-GH";
        String[] A1b28 = BE6.A1b(r8, A1b27, "GH", 1);
        A1b28[0] = "es-GT";
        String[] A1b29 = BE6.A1b(r8, A1b28, "GT", 1);
        A1b29[0] = "fr-HT";
        String[] A1b30 = BE6.A1b(r8, A1b29, "HT", 1);
        A1b30[0] = "es-HN";
        r8.A03("HN", A1b30);
        String[] A1b31 = BE6.A1b(r8, new String[]{"en-IN", "hi-IN", "mr-IN", "gu-IN", "ta-IN", "bn-IN", "te-IN", "kn-IN", "ml-IN", "pa-IN", "ur-IN"}, "IN", 2);
        char A1X = BE7.A1X("fa-IR", "en-GB", A1b31);
        String[] A1b32 = BE6.A1b(r8, A1b31, "IR", A1X);
        A1b32[0] = "ar-iq";
        r8.A03("IQ", A1b32);
        String[] A1Z4 = C17880vN.A1Z();
        A1Z4[0] = "en-IE";
        A1Z4[A1X] = "ga-IE";
        r8.A03("IE", A1Z4);
        String[] strArr = new String[4];
        strArr[0] = "iw-IL";
        strArr[A1X] = "ar-IL";
        BE7.A1F("en-IL", "ru-RU", strArr);
        String[] A1b33 = BE6.A1b(r8, strArr, "IL", A1X);
        A1b33[0] = "it-IT";
        String[] A1b34 = BE6.A1b(r8, A1b33, "IT", A1X);
        A1b34[0] = "fr-CI";
        r8.A03("CI", A1b34);
        String[] strArr2 = new String[2];
        strArr2[0] = "ar-JO";
        strArr2[A1X] = "en-GB";
        String[] A1b35 = BE6.A1b(r8, strArr2, "JO", 2);
        A1b35[0] = "kk-KZ";
        A1b35[1] = "ru-KZ";
        r8.A03("KZ", A1b35);
        String[] A1Z5 = C17880vN.A1Z();
        A1Z5[0] = "en-KE";
        A1Z5[1] = "sw-KE";
        r8.A03("KE", A1Z5);
        String[] A1b36 = BE6.A1b(r8, new String[]{"sq-XK", "sr-XK", "hr-HR"}, "XK", 2);
        A1b36[0] = "ar-KW";
        A1b36[1] = "en-GB";
        String[] A1b37 = BE6.A1b(r8, A1b36, "KW", 1);
        A1b37[0] = "ru-KG";
        r8.A03("KG", A1b37);
        String[] A1b38 = BE6.A1b(r8, new String[]{"lo-LA", "th-TH", "en-GB"}, "LA", 3);
        A1b38[0] = "ar-LB";
        A1b38[1] = "en-GB";
        A1b38[2] = "fr-FR";
        String[] A1b39 = BE6.A1b(r8, A1b38, "LB", 1);
        A1b39[0] = "ar-LY";
        r8.A03("LY", A1b39);
        String[] A1b40 = BE6.A1b(r8, new String[]{"mk-MK", "sq-MK", "tr-TR", "hr-HR", "sr-RS"}, "MK", 2);
        A1b40[0] = "en-MW";
        A1b40[1] = "sw-TZ";
        r8.A03("MW", A1b40);
        String[] strArr3 = new String[5];
        strArr3[0] = "ms-MY";
        strArr3[1] = "en-MY";
        BE7.A1F("zh-CN", "zh-TW", strArr3);
        strArr3[4] = "ta-MY";
        String[] A1b41 = BE6.A1b(r8, strArr3, "MY", 1);
        A1b41[0] = "fr-ML";
        String[] A1b42 = BE6.A1b(r8, A1b41, "ML", 2);
        A1b42[0] = "ar-MR";
        A1b42[1] = "fr-MR";
        String[] A1b43 = BE6.A1b(r8, A1b42, "MR", 1);
        A1b43[0] = "es";
        r8.A03("MX", A1b43);
        String[] A1b44 = BE6.A1b(r8, new String[]{"ro-MD", "ru-MD"}, "MD", 2);
        A1b44[0] = "ar-MA";
        A1b44[1] = "fr-MA";
        String[] A1b45 = BE6.A1b(r8, A1b44, "MA", 1);
        A1b45[0] = "pt-MZ";
        String[] A1b46 = BE6.A1b(r8, A1b45, "MZ", 1);
        A1b46[0] = "nl-NL";
        String[] A1b47 = BE6.A1b(r8, A1b46, "NL", 1);
        A1b47[0] = "es-NI";
        String[] A1b48 = BE6.A1b(r8, A1b47, "NI", 2);
        A1b48[0] = "ar-TD";
        A1b48[1] = "fr-NE";
        String[] A1b49 = BE6.A1b(r8, A1b48, "NE", 2);
        A1b49[0] = "ar-OM";
        A1b49[1] = "en-GB";
        String[] A1b50 = BE6.A1b(r8, A1b49, "OM", 2);
        A1b50[0] = "en-PK";
        A1b50[1] = "ur-PK";
        String[] A1b51 = BE6.A1b(r8, A1b50, "PK", 1);
        A1b51[0] = "es-PA";
        String[] A1b52 = BE6.A1b(r8, A1b51, "PA", 1);
        A1b52[0] = "es-PY";
        String[] A1b53 = BE6.A1b(r8, A1b52, "PY", 1);
        A1b53[0] = "es-PE";
        String[] A1b54 = BE6.A1b(r8, A1b53, "PE", 4);
        A1b54[0] = "en-PH";
        A1b54[1] = "fil-PH";
        A1b54[2] = "es-PH";
        A1b54[3] = "ar-EG";
        String[] A1b55 = BE6.A1b(r8, A1b54, "PH", 1);
        A1b55[0] = "pl-PL";
        String[] A1b56 = BE6.A1b(r8, A1b55, "PL", 1);
        A1b56[0] = "pt-PT";
        String[] A1b57 = BE6.A1b(r8, A1b56, "PT", 2);
        A1b57[0] = "ar-QA";
        A1b57[1] = "en-GB";
        String[] A1b58 = BE6.A1b(r8, A1b57, "QA", 1);
        A1b58[0] = "ro-RO";
        String[] A1b59 = BE6.A1b(r8, A1b58, "RO", 1);
        A1b59[0] = "ru-RU";
        String[] A1b60 = BE6.A1b(r8, A1b59, "RU", 3);
        A1b60[0] = "en-RW";
        A1b60[1] = "fr-RW";
        A1b60[2] = "sw-TZ";
        String[] A1b61 = BE6.A1b(r8, A1b60, "RW", 2);
        A1b61[0] = "ar-SA";
        A1b61[1] = "en-GB";
        String[] A1b62 = BE6.A1b(r8, A1b61, "SA", 1);
        A1b62[0] = "fr-SN";
        String[] A1b63 = BE6.A1b(r8, A1b62, "SN", 1);
        A1b63[0] = "en-SG";
        r8.A03("SG", A1b63);
        String[] strArr4 = new String[6];
        strArr4[0] = "sl-SI";
        strArr4[1] = "en-SI";
        strArr4[2] = "hr-HR";
        strArr4[3] = "it-IT";
        C72453Mb.A1T("hu-HU", "sr-RS", strArr4);
        String[] A1b64 = BE6.A1b(r8, strArr4, "SI", 2);
        A1b64[0] = "en-GB";
        A1b64[1] = "ar-SO";
        String[] A1b65 = BE6.A1b(r8, A1b64, "SO", 1);
        A1b65[0] = "en-ZA";
        String[] A1b66 = BE6.A1b(r8, A1b65, "ZA", 2);
        A1b66[0] = "en-SS";
        A1b66[1] = "ar-SS";
        String[] A1b67 = BE6.A1b(r8, A1b66, "SS", 1);
        A1b67[0] = "es-ES";
        String[] A1b68 = BE6.A1b(r8, A1b67, "ES", 1);
        A1b68[0] = "en-GB";
        String[] A1b69 = BE6.A1b(r8, A1b68, "LK", 2);
        A1b69[0] = "ar-SD";
        A1b69[1] = "en-SD";
        String[] A1b70 = BE6.A1b(r8, A1b69, "SD", 2);
        A1b70[0] = "de-CH";
        A1b70[1] = "fr-CH";
        String[] A1b71 = BE6.A1b(r8, A1b70, "CH", 1);
        A1b71[0] = "ar-SY";
        String[] A1b72 = BE6.A1b(r8, A1b71, "SY", 2);
        A1b72[0] = "en-TZ";
        A1b72[1] = "sw-TZ";
        String[] A1b73 = BE6.A1b(r8, A1b72, "TZ", 2);
        A1b73[0] = "ar-TN";
        A1b73[1] = "fr-TN";
        r8.A03("TN", A1b73);
        String[] A1b74 = BE6.A1b(r8, C17880vN.A1b("tr-TR", "ar", 2, 1), "TR", 2);
        A1b74[0] = "en-UG";
        A1b74[1] = "sw-UG";
        String[] A1b75 = BE6.A1b(r8, A1b74, "UG", 2);
        A1b75[0] = "uk-UA";
        A1b75[1] = "ru-UA";
        String[] A1b76 = BE6.A1b(r8, A1b75, "UA", 2);
        A1b76[0] = "ar-AE";
        A1b76[1] = "en-GB";
        r8.A03("AE", A1b76);
        r8.A03("GB", C17880vN.A1b("en-GB", "ga-IE", 2, 1));
        String[] strArr5 = new String[9];
        strArr5[0] = "en-US";
        strArr5[1] = "es-LA";
        AnonymousClass001.A1R("pt-BR", "ar-AE", strArr5);
        C72453Mb.A1T("zh-CN", "fr-FR", strArr5);
        strArr5[6] = "ru-RU";
        strArr5[7] = "vi-VN";
        strArr5[8] = "ko-KR";
        r8.A03("US", strArr5);
        String[] A1Z6 = C17880vN.A1Z();
        A1Z6[0] = "uz-UZ";
        A1Z6[1] = "ru-RU";
        String[] A1b77 = BE6.A1b(r8, A1Z6, "UZ", 1);
        A1b77[0] = "es-VE";
        String[] A1b78 = BE6.A1b(r8, A1b77, "VE", 1);
        A1b78[0] = "en-ZM";
        String[] A1b79 = BE6.A1b(r8, A1b78, "ZM", 1);
        A1b79[0] = "en-ZW";
        r8.A03("ZW", A1b79);
        String[] strArr6 = new String[40];
        strArr6[0] = "az-AZ";
        strArr6[1] = "ca-ES";
        AnonymousClass001.A1R("en-US", "es-ES", strArr6);
        C17900vP.A0P("fil-PH", "fr-FR", "ga-IE", "hr-HR", strArr6);
        C17890vO.A0x("it-IT", "sw-TZ", strArr6);
        C17900vP.A0Q("uz-UZ", "hu-HU", "ms-MY", "sq-AL", strArr6);
        strArr6[14] = "sl-SI";
        C17900vP.A0R("tr-TR", "kk-KZ", "ru-RU", "sr-RS", strArr6);
        BE9.A1C("uk-UA", "iw-IL", strArr6);
        C17900vP.A0S("ur-PK", "fa-IR", "ar-EG", "hi-IN", strArr6);
        C17900vP.A0T("bn-BD", "pa-IN", "te-IN", "mr-IN", strArr6);
        C17890vO.A0y("ta-IN", "gu-IN", strArr6);
        C17900vP.A0U("kn-IN", "ml-IN", "th-TH", "lo-LA", strArr6);
        strArr6[35] = "zh-CN";
        strArr6[36] = "zh-TW";
        strArr6[37] = "ha-NG";
        strArr6[38] = "am-ET";
        strArr6[39] = "om-ET";
        r8.A03("QQ", strArr6);
        AnonymousClass1LB r7 = CGE.A00;
        SparseArray sparseArray = r7.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (i < 0 || i >= sparseArray.size()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Invalid index ");
                A10.append(i);
                throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0y(" when fetching flavor specific country language data", A10));
            }
            int keyAt = sparseArray.keyAt(i);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("");
            A102.append((char) ((keyAt / 26) + 65));
            String A0c = C17890vO.A0c(A102, (char) ((keyAt % 26) + 65));
            A03.A03(A0c, r7.A01(A0c));
        }
        AnonymousClass00O r122 = new AnonymousClass00O(63);
        A00 = r122;
        r122.put("af", "Afrikaans");
        r122.put("sq", "Shqip");
        r122.put("am", "አማርኛ");
        r122.put("ar", "العربية");
        r122.put("az", "Azərbaycan dili");
        r122.put("bn", "বাংলা");
        r122.put("bg", "Български");
        r122.put("ca", "Català");
        r122.put("zh-Hans", "简体中文");
        r122.put("zh-Hant", "繁體中文");
        r122.put("zh-HK", "繁體中文（香港）");
        r122.put("zh-TW", "繁體中文（台灣)");
        r122.put("hr", "Hrvatski");
        r122.put("cs", "Čeština");
        r122.put("da", "Dansk");
        r122.put("nl", "Nederlands");
        r122.put("en", "English");
        r122.put("de", "Deutsch");
        r122.put("el", "Ελληνικά");
        r122.put("et", "Eesti");
        r122.put("fil", "Filipino");
        r122.put("fi", "Suomi");
        r122.put("fr", "Français");
        r122.put("gu", "ગુજરાતી");
        r122.put("ha", "Hausa");
        r122.put("iw", "עברית");
        r122.put("hi", "हिन्दी");
        r122.put("hu", "Magyar");
        r122.put("in", "Bahasa Indonesia");
        r122.put("ga", "Gaeilge");
        r122.put("it", "Italiano");
        r122.put("ja", "日本語");
        r122.put("kn", "ಕನ್ನಡ");
        r122.put("kk", "Қазақ тілі");
        r122.put("ko", "한국어");
        r122.put("lo", "ລາວ");
        r122.put("lv", "Latviešu");
        r122.put("lt", "Lietuvių");
        r122.put("mk", "Македонски");
        r122.put("ms", "Melayu");
        r122.put("ml", "മലയാളം");
        r122.put("mr", "मराठी");
        r122.put("nb", "Norsk bokmål");
        r122.put("om", "Oromoo");
        r122.put("fa", "فارسی");
        r122.put("pl", "Polski");
        r122.put("pt", "Português");
        r122.put("pt-BR", "Português (Brasil)");
        r122.put("pt-PT", "Português (Portugal)");
        r122.put("pa", "ਪੰਜਾਬੀ");
        r122.put("ro", "Română");
        r122.put("ru", "Русский");
        r122.put("sr", "Српски");
        r122.put("sk", "Slovenčina");
        r122.put("sl", "Slovenščina");
        r122.put("es", "Español");
        r122.put("sw", "Kiswahili");
        r122.put("sv", "Svenska");
        r122.put("tl", "Filipino");
        r122.put("ta", "தமிழ்");
        r122.put("te", "తెలుగు");
        r122.put("th", "ไทย");
        r122.put("tr", "Türkçe");
        r122.put("uk", "Українська");
        r122.put("ur", "اردو");
        r122.put("uz", "O‘zbek");
        r122.put("vi", "Tiếng Việt");
        String[] A1b80 = C17880vN.A1b("af", "sq", 65, 1);
        AnonymousClass001.A1R("am", "ar", A1b80);
        C17900vP.A0P("az", "bn", "bg", "ca", A1b80);
        C17890vO.A0x("zh-CN", "zh-HK", A1b80);
        C17900vP.A0Q("zh-TW", "hr", "cs", "da", A1b80);
        A1b80[14] = "nl";
        C17900vP.A0R("en", "et", "fil", "fi", A1b80);
        BE9.A1C("fr", "de", A1b80);
        BEA.A1G("el", "gu", "ha", A1b80);
        A1b80[24] = "he";
        A1b80[25] = "hi";
        A1b80[26] = "hu";
        A1b80[27] = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        A1b80[28] = "ga";
        C17890vO.A0y("it", "ja", A1b80);
        C17900vP.A0U("kn", "kk", "ko", "lo", A1b80);
        A1b80[35] = "lv";
        C17900vP.A0V("lt", "mk", "ms", "ml", A1b80);
        A1b80[40] = "mr";
        BEB.A18("nb", "om", "fa", "pl", A1b80);
        BEB.A19("pt-BR", "pt-PT", "pa", "ro", A1b80);
        BEA.A1F("ru", "sr", "sk", A1b80);
        BEB.A1A("sl", "es", "sw", "sv", A1b80);
        BEB.A1B("tl", "ta", "te", "th", A1b80);
        A1b80[60] = "tr";
        BEB.A1C("uk", "ur", "uz", "vi", A1b80);
        A05 = new LinkedHashSet(Arrays.asList(A1b80));
        LinkedHashMap A13 = C17880vN.A13();
        A04 = A13;
        A13.put("af", "ZA");
        A13.put("sq", "AL");
        A13.put("am", "ET");
        A13.put("ar", "EG");
        A13.put("az", "AZ");
        A13.put("bn", "BD");
        A13.put("bg", "BG");
        A13.put("ca", "AD");
        A13.put("hr", "HR");
        A13.put("cs", "CZ");
        A13.put("da", "DK");
        A13.put("nl", "NL");
        A13.put("en", "US");
        A13.put("et", "EE");
        A13.put("fil", "PH");
        A13.put("fi", "FI");
        A13.put("fr", "FR");
        A13.put("de", "DE");
        A13.put("el", "GR");
        A13.put("gu", "IN");
        A13.put("ha", "NG");
        A13.put("he", "IL");
        A13.put("hi", "IN");
        A13.put("hu", "HU");
        A13.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ID");
        A13.put("in", "ID");
        A13.put("ga", "IE");
        A13.put("it", "IT");
        A13.put("ja", "JP");
        A13.put("kn", "IN");
        A13.put("kk", "KZ");
        A13.put("ko", "KR");
        A13.put("lo", "LA");
        A13.put("lv", "LV");
        A13.put("lt", "LT");
        A13.put("mk", "MK");
        A13.put("ms", "MY");
        A13.put("ml", "IN");
        A13.put("mr", "IN");
        A13.put("nb", "NO");
        A13.put("om", "ET");
        A13.put("fa", "IR");
        A13.put("pl", "PL");
        A13.put("pa", "IN");
        A13.put("ro", "RO");
        A13.put("ru", "RU");
        A13.put("sr", "RS");
        A13.put("sk", "SK");
        A13.put("sl", "SI");
        A13.put("es", "ES");
        A13.put("sw", "KE");
        A13.put("sv", "SE");
        A13.put("tl", "PH");
        A13.put("ta", "IN");
        A13.put("te", "IN");
        A13.put("th", "TH");
        A13.put("tr", "TR");
        A13.put("uk", "UA");
        A13.put("ur", "PK");
        A13.put("uz", "UZ");
        A13.put("vi", "VN");
    }

    public static void A00(AnonymousClass00O r4, Object obj, char c) {
        HashSet hashSet = AnonymousClass1X0.A00;
        String[] strArr = new String[10];
        int i = 0;
        do {
            strArr[i] = Character.toString((char) (c + i));
            i++;
        } while (i < 10);
        r4.put(obj, strArr);
    }
}
