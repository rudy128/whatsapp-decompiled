package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.AbstractMap;
import java.util.HashMap;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public abstract class C62972sI {
    public static final AnonymousClass1LB A00;
    public static final HashMap A01;
    public static final HashMap A02;

    public static String[] A01(AnonymousClass1LB r1, Object obj, String str) {
        r1.A02(str, obj);
        return new String[1];
    }

    static {
        AnonymousClass1LB r2 = new AnonymousClass1LB(255);
        A00 = r2;
        String[] A012 = A01(r2, new String[]{"SHP"}, "AC");
        A012[0] = "EUR";
        String[] A013 = A01(r2, A012, "AD");
        A013[0] = "AED";
        String[] A014 = A01(r2, A013, "AE");
        A014[0] = "AFN";
        String[] A015 = A01(r2, A014, "AF");
        A015[0] = "XCD";
        String[] A016 = A01(r2, A015, "AG");
        A016[0] = "XCD";
        String[] A017 = A01(r2, A016, "AI");
        A017[0] = "ALL";
        String[] A018 = A01(r2, A017, "AL");
        A018[0] = "AMD";
        String[] A019 = A01(r2, A018, "AM");
        A019[0] = "AOA";
        String[] A0110 = A01(r2, A019, "AO");
        A0110[0] = "ARS";
        String[] A0111 = A01(r2, A0110, "AR");
        A0111[0] = "USD";
        String[] A0112 = A01(r2, A0111, "AS");
        A0112[0] = "EUR";
        String[] A0113 = A01(r2, A0112, "AT");
        A0113[0] = "AUD";
        String[] A0114 = A01(r2, A0113, "AU");
        A0114[0] = "AWG";
        String[] A0115 = A01(r2, A0114, "AW");
        A0115[0] = "EUR";
        String[] A0116 = A01(r2, A0115, "AX");
        A0116[0] = "AZN";
        String[] A0117 = A01(r2, A0116, "AZ");
        A0117[0] = "BAM";
        String[] A0118 = A01(r2, A0117, "BA");
        A0118[0] = "BBD";
        String[] A0119 = A01(r2, A0118, "BB");
        A0119[0] = "BDT";
        String[] A0120 = A01(r2, A0119, "BD");
        A0120[0] = "EUR";
        String[] A0121 = A01(r2, A0120, "BE");
        A0121[0] = "XOF";
        String[] A0122 = A01(r2, A0121, "BF");
        A0122[0] = "BGN";
        String[] A0123 = A01(r2, A0122, "BG");
        A0123[0] = "BHD";
        String[] A0124 = A01(r2, A0123, "BH");
        A0124[0] = "BIF";
        String[] A0125 = A01(r2, A0124, "BI");
        A0125[0] = "XOF";
        String[] A0126 = A01(r2, A0125, "BJ");
        A0126[0] = "EUR";
        String[] A0127 = A01(r2, A0126, "BL");
        A0127[0] = "BMD";
        String[] A0128 = A01(r2, A0127, "BM");
        A0128[0] = "BND";
        String[] A0129 = A01(r2, A0128, "BN");
        A0129[0] = "BOB";
        String[] A0130 = A01(r2, A0129, "BO");
        A0130[0] = "USD";
        String[] A0131 = A01(r2, A0130, "BQ");
        A0131[0] = "BRL";
        String[] A0132 = A01(r2, A0131, "BR");
        A0132[0] = "BSD";
        r2.A02("BS", A0132);
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "BTN";
        A1Z[1] = "INR";
        String[] A0133 = A01(r2, A1Z, "BT");
        A0133[0] = "NOK";
        String[] A0134 = A01(r2, A0133, "BV");
        A0134[0] = "BWP";
        String[] A0135 = A01(r2, A0134, "BW");
        A0135[0] = "BYN";
        String[] A0136 = A01(r2, A0135, "BY");
        A0136[0] = "BZD";
        String[] A0137 = A01(r2, A0136, "BZ");
        A0137[0] = "CAD";
        String[] A0138 = A01(r2, A0137, "CA");
        A0138[0] = "AUD";
        String[] A0139 = A01(r2, A0138, "CC");
        A0139[0] = "CDF";
        String[] A0140 = A01(r2, A0139, "CD");
        A0140[0] = "XAF";
        String[] A0141 = A01(r2, A0140, "CF");
        A0141[0] = "XAF";
        String[] A0142 = A01(r2, A0141, "CG");
        A0142[0] = "CHF";
        String[] A0143 = A01(r2, A0142, "CH");
        A0143[0] = "XOF";
        String[] A0144 = A01(r2, A0143, "CI");
        A0144[0] = "NZD";
        String[] A0145 = A01(r2, A0144, "CK");
        A0145[0] = "CLP";
        String[] A0146 = A01(r2, A0145, "CL");
        A0146[0] = "XAF";
        String[] A0147 = A01(r2, A0146, "CM");
        A0147[0] = "CNY";
        String[] A0148 = A01(r2, A0147, "CN");
        A0148[0] = "COP";
        String[] A0149 = A01(r2, A0148, "CO");
        A0149[0] = "CRC";
        r2.A02("CR", A0149);
        String[] A1Z2 = C17880vN.A1Z();
        A1Z2[0] = "CUP";
        A1Z2[1] = "CUC";
        String[] A0150 = A01(r2, A1Z2, "CU");
        A0150[0] = "CVE";
        String[] A0151 = A01(r2, A0150, "CV");
        A0151[0] = "ANG";
        String[] A0152 = A01(r2, A0151, "CW");
        A0152[0] = "AUD";
        String[] A0153 = A01(r2, A0152, "CX");
        A0153[0] = "EUR";
        String[] A0154 = A01(r2, A0153, "CY");
        A0154[0] = "CZK";
        String[] A0155 = A01(r2, A0154, "CZ");
        A0155[0] = "EUR";
        String[] A0156 = A01(r2, A0155, "DE");
        A0156[0] = "USD";
        String[] A0157 = A01(r2, A0156, "DG");
        A0157[0] = "DJF";
        String[] A0158 = A01(r2, A0157, "DJ");
        A0158[0] = "DKK";
        String[] A0159 = A01(r2, A0158, "DK");
        A0159[0] = "XCD";
        String[] A0160 = A01(r2, A0159, "DM");
        A0160[0] = "DOP";
        String[] A0161 = A01(r2, A0160, "DO");
        A0161[0] = "DZD";
        String[] A0162 = A01(r2, A0161, "DZ");
        A0162[0] = "EUR";
        String[] A0163 = A01(r2, A0162, "EA");
        A0163[0] = "USD";
        String[] A0164 = A01(r2, A0163, "EC");
        A0164[0] = "EUR";
        String[] A0165 = A01(r2, A0164, "EE");
        A0165[0] = "EGP";
        String[] A0166 = A01(r2, A0165, "EG");
        A0166[0] = "MAD";
        String[] A0167 = A01(r2, A0166, "EH");
        A0167[0] = "ERN";
        String[] A0168 = A01(r2, A0167, "ER");
        A0168[0] = "EUR";
        String[] A0169 = A01(r2, A0168, "ES");
        A0169[0] = "ETB";
        String[] A0170 = A01(r2, A0169, "ET");
        A0170[0] = "EUR";
        String[] A0171 = A01(r2, A0170, "EU");
        A0171[0] = "EUR";
        String[] A0172 = A01(r2, A0171, "FI");
        A0172[0] = "FJD";
        String[] A0173 = A01(r2, A0172, "FJ");
        A0173[0] = "FKP";
        String[] A0174 = A01(r2, A0173, "FK");
        A0174[0] = "USD";
        String[] A0175 = A01(r2, A0174, "FM");
        A0175[0] = "DKK";
        String[] A0176 = A01(r2, A0175, "FO");
        A0176[0] = "EUR";
        String[] A0177 = A01(r2, A0176, "FR");
        A0177[0] = "XAF";
        String[] A0178 = A01(r2, A0177, "GA");
        A0178[0] = "GBP";
        String[] A0179 = A01(r2, A0178, "GB");
        A0179[0] = "XCD";
        String[] A0180 = A01(r2, A0179, "GD");
        A0180[0] = "GEL";
        String[] A0181 = A01(r2, A0180, "GE");
        A0181[0] = "EUR";
        String[] A0182 = A01(r2, A0181, "GF");
        A0182[0] = "GBP";
        String[] A0183 = A01(r2, A0182, "GG");
        A0183[0] = "GHS";
        String[] A0184 = A01(r2, A0183, "GH");
        A0184[0] = "GIP";
        String[] A0185 = A01(r2, A0184, "GI");
        A0185[0] = "DKK";
        String[] A0186 = A01(r2, A0185, "GL");
        A0186[0] = "GMD";
        String[] A0187 = A01(r2, A0186, "GM");
        A0187[0] = "GNF";
        String[] A0188 = A01(r2, A0187, "GN");
        A0188[0] = "EUR";
        String[] A0189 = A01(r2, A0188, "GP");
        A0189[0] = "XAF";
        String[] A0190 = A01(r2, A0189, "GQ");
        A0190[0] = "EUR";
        String[] A0191 = A01(r2, A0190, "GR");
        A0191[0] = "GBP";
        String[] A0192 = A01(r2, A0191, "GS");
        A0192[0] = "GTQ";
        String[] A0193 = A01(r2, A0192, "GT");
        A0193[0] = "USD";
        String[] A0194 = A01(r2, A0193, "GU");
        A0194[0] = "XOF";
        String[] A0195 = A01(r2, A0194, "GW");
        A0195[0] = "GYD";
        String[] A0196 = A01(r2, A0195, "GY");
        A0196[0] = "HKD";
        String[] A0197 = A01(r2, A0196, "HK");
        A0197[0] = "AUD";
        String[] A0198 = A01(r2, A0197, "HM");
        A0198[0] = "HNL";
        String[] A0199 = A01(r2, A0198, "HN");
        A0199[0] = "HRK";
        r2.A02("HR", A0199);
        String[] A1Z3 = C17880vN.A1Z();
        A1Z3[0] = "HTG";
        A1Z3[1] = "USD";
        String[] A01100 = A01(r2, A1Z3, "HT");
        A01100[0] = "HUF";
        String[] A01101 = A01(r2, A01100, "HU");
        A01101[0] = "EUR";
        String[] A01102 = A01(r2, A01101, "IC");
        A01102[0] = "IDR";
        String[] A01103 = A01(r2, A01102, "ID");
        A01103[0] = "EUR";
        String[] A01104 = A01(r2, A01103, "IE");
        A01104[0] = "ILS";
        String[] A01105 = A01(r2, A01104, "IL");
        A01105[0] = "GBP";
        String[] A01106 = A01(r2, A01105, "IM");
        A01106[0] = "INR";
        String[] A01107 = A01(r2, A01106, "IN");
        A01107[0] = "USD";
        String[] A01108 = A01(r2, A01107, "IO");
        A01108[0] = "IQD";
        String[] A01109 = A01(r2, A01108, "IQ");
        A01109[0] = "IRR";
        String[] A01110 = A01(r2, A01109, "IR");
        A01110[0] = "ISK";
        String[] A01111 = A01(r2, A01110, "IS");
        A01111[0] = "EUR";
        String[] A01112 = A01(r2, A01111, "IT");
        A01112[0] = "GBP";
        String[] A01113 = A01(r2, A01112, "JE");
        A01113[0] = "JMD";
        String[] A01114 = A01(r2, A01113, "JM");
        A01114[0] = "JOD";
        String[] A01115 = A01(r2, A01114, "JO");
        A01115[0] = "JPY";
        String[] A01116 = A01(r2, A01115, "JP");
        A01116[0] = "KES";
        String[] A01117 = A01(r2, A01116, "KE");
        A01117[0] = "KGS";
        String[] A01118 = A01(r2, A01117, "KG");
        A01118[0] = "KHR";
        String[] A01119 = A01(r2, A01118, "KH");
        A01119[0] = "AUD";
        String[] A01120 = A01(r2, A01119, "KI");
        A01120[0] = "KMF";
        String[] A01121 = A01(r2, A01120, "KM");
        A01121[0] = "XCD";
        String[] A01122 = A01(r2, A01121, "KN");
        A01122[0] = "KPW";
        String[] A01123 = A01(r2, A01122, "KP");
        A01123[0] = "KRW";
        String[] A01124 = A01(r2, A01123, "KR");
        A01124[0] = "KWD";
        String[] A01125 = A01(r2, A01124, "KW");
        A01125[0] = "KYD";
        String[] A01126 = A01(r2, A01125, "KY");
        A01126[0] = "KZT";
        String[] A01127 = A01(r2, A01126, "KZ");
        A01127[0] = "LAK";
        String[] A01128 = A01(r2, A01127, "LA");
        A01128[0] = "LBP";
        String[] A01129 = A01(r2, A01128, "LB");
        A01129[0] = "XCD";
        String[] A01130 = A01(r2, A01129, "LC");
        A01130[0] = "CHF";
        String[] A01131 = A01(r2, A01130, "LI");
        A01131[0] = "LKR";
        String[] A01132 = A01(r2, A01131, "LK");
        A01132[0] = "LRD";
        r2.A02("LR", A01132);
        String[] A1Z4 = C17880vN.A1Z();
        A1Z4[0] = "ZAR";
        A1Z4[1] = "LSL";
        String[] A01133 = A01(r2, A1Z4, "LS");
        A01133[0] = "EUR";
        String[] A01134 = A01(r2, A01133, "LT");
        A01134[0] = "EUR";
        String[] A01135 = A01(r2, A01134, "LU");
        A01135[0] = "EUR";
        String[] A01136 = A01(r2, A01135, "LV");
        A01136[0] = "LYD";
        String[] A01137 = A01(r2, A01136, "LY");
        A01137[0] = "MAD";
        String[] A01138 = A01(r2, A01137, "MA");
        A01138[0] = "EUR";
        String[] A01139 = A01(r2, A01138, "MC");
        A01139[0] = "MDL";
        String[] A01140 = A01(r2, A01139, "MD");
        A01140[0] = "EUR";
        String[] A01141 = A01(r2, A01140, "ME");
        A01141[0] = "EUR";
        String[] A01142 = A01(r2, A01141, "MF");
        A01142[0] = "MGA";
        String[] A01143 = A01(r2, A01142, "MG");
        A01143[0] = "USD";
        String[] A01144 = A01(r2, A01143, "MH");
        A01144[0] = "MKD";
        String[] A01145 = A01(r2, A01144, "MK");
        A01145[0] = "XOF";
        String[] A01146 = A01(r2, A01145, "ML");
        A01146[0] = "MMK";
        String[] A01147 = A01(r2, A01146, "MM");
        A01147[0] = "MNT";
        String[] A01148 = A01(r2, A01147, "MN");
        A01148[0] = "MOP";
        String[] A01149 = A01(r2, A01148, "MO");
        A01149[0] = "USD";
        String[] A01150 = A01(r2, A01149, "MP");
        A01150[0] = "EUR";
        String[] A01151 = A01(r2, A01150, "MQ");
        A01151[0] = "MRU";
        String[] A01152 = A01(r2, A01151, "MR");
        A01152[0] = "XCD";
        String[] A01153 = A01(r2, A01152, "MS");
        A01153[0] = "EUR";
        String[] A01154 = A01(r2, A01153, "MT");
        A01154[0] = "MUR";
        String[] A01155 = A01(r2, A01154, "MU");
        A01155[0] = "MVR";
        String[] A01156 = A01(r2, A01155, "MV");
        A01156[0] = "MWK";
        String[] A01157 = A01(r2, A01156, "MW");
        A01157[0] = "MXN";
        String[] A01158 = A01(r2, A01157, "MX");
        A01158[0] = "MYR";
        String[] A01159 = A01(r2, A01158, "MY");
        A01159[0] = "MZN";
        r2.A02("MZ", A01159);
        String[] A1Z5 = C17880vN.A1Z();
        A1Z5[0] = "NAD";
        A1Z5[1] = "ZAR";
        String[] A01160 = A01(r2, A1Z5, "NA");
        A01160[0] = "XPF";
        String[] A01161 = A01(r2, A01160, "NC");
        A01161[0] = "XOF";
        String[] A01162 = A01(r2, A01161, "NE");
        A01162[0] = "AUD";
        String[] A01163 = A01(r2, A01162, "NF");
        A01163[0] = "NGN";
        String[] A01164 = A01(r2, A01163, "NG");
        A01164[0] = "NIO";
        String[] A01165 = A01(r2, A01164, "NI");
        A01165[0] = "EUR";
        String[] A01166 = A01(r2, A01165, "NL");
        A01166[0] = "NOK";
        String[] A01167 = A01(r2, A01166, "NO");
        A01167[0] = "NPR";
        String[] A01168 = A01(r2, A01167, "NP");
        A01168[0] = "AUD";
        String[] A01169 = A01(r2, A01168, "NR");
        A01169[0] = "NZD";
        String[] A01170 = A01(r2, A01169, "NU");
        A01170[0] = "NZD";
        String[] A01171 = A01(r2, A01170, "NZ");
        A01171[0] = "OMR";
        r2.A02("OM", A01171);
        String[] A1Z6 = C17880vN.A1Z();
        A1Z6[0] = "PAB";
        A1Z6[1] = "USD";
        String[] A01172 = A01(r2, A1Z6, "PA");
        A01172[0] = "PEN";
        String[] A01173 = A01(r2, A01172, "PE");
        A01173[0] = "XPF";
        String[] A01174 = A01(r2, A01173, "PF");
        A01174[0] = "PGK";
        String[] A01175 = A01(r2, A01174, "PG");
        A01175[0] = "PHP";
        String[] A01176 = A01(r2, A01175, "PH");
        A01176[0] = "PKR";
        String[] A01177 = A01(r2, A01176, "PK");
        A01177[0] = "PLN";
        String[] A01178 = A01(r2, A01177, "PL");
        A01178[0] = "EUR";
        String[] A01179 = A01(r2, A01178, "PM");
        A01179[0] = "NZD";
        String[] A01180 = A01(r2, A01179, "PN");
        A01180[0] = "USD";
        r2.A02("PR", A01180);
        String[] A01181 = A01(r2, C17880vN.A1b("ILS", "JOD", 2, 1), "PS");
        A01181[0] = "EUR";
        String[] A01182 = A01(r2, A01181, "PT");
        A01182[0] = "USD";
        String[] A01183 = A01(r2, A01182, "PW");
        A01183[0] = "PYG";
        String[] A01184 = A01(r2, A01183, "PY");
        A01184[0] = "QAR";
        String[] A01185 = A01(r2, A01184, "QA");
        A01185[0] = "EUR";
        String[] A01186 = A01(r2, A01185, "RE");
        A01186[0] = "RON";
        String[] A01187 = A01(r2, A01186, "RO");
        A01187[0] = "RSD";
        String[] A01188 = A01(r2, A01187, "RS");
        A01188[0] = "RUB";
        String[] A01189 = A01(r2, A01188, "RU");
        A01189[0] = "RWF";
        String[] A01190 = A01(r2, A01189, "RW");
        A01190[0] = "SAR";
        String[] A01191 = A01(r2, A01190, "SA");
        A01191[0] = "SBD";
        String[] A01192 = A01(r2, A01191, "SB");
        A01192[0] = "SCR";
        String[] A01193 = A01(r2, A01192, "SC");
        A01193[0] = "SDG";
        String[] A01194 = A01(r2, A01193, "SD");
        A01194[0] = "SEK";
        String[] A01195 = A01(r2, A01194, "SE");
        A01195[0] = "SGD";
        String[] A01196 = A01(r2, A01195, "SG");
        A01196[0] = "SHP";
        String[] A01197 = A01(r2, A01196, "SH");
        A01197[0] = "EUR";
        String[] A01198 = A01(r2, A01197, "SI");
        A01198[0] = "NOK";
        String[] A01199 = A01(r2, A01198, "SJ");
        A01199[0] = "EUR";
        String[] A01200 = A01(r2, A01199, "SK");
        A01200[0] = "SLL";
        String[] A01201 = A01(r2, A01200, "SL");
        A01201[0] = "EUR";
        String[] A01202 = A01(r2, A01201, "SM");
        A01202[0] = "XOF";
        String[] A01203 = A01(r2, A01202, "SN");
        A01203[0] = "SOS";
        String[] A01204 = A01(r2, A01203, "SO");
        A01204[0] = "SRD";
        String[] A01205 = A01(r2, A01204, "SR");
        A01205[0] = "SSP";
        String[] A01206 = A01(r2, A01205, "SS");
        A01206[0] = "STN";
        String[] A01207 = A01(r2, A01206, "ST");
        A01207[0] = "USD";
        String[] A01208 = A01(r2, A01207, "SV");
        A01208[0] = "ANG";
        String[] A01209 = A01(r2, A01208, "SX");
        A01209[0] = "SYP";
        String[] A01210 = A01(r2, A01209, "SY");
        A01210[0] = "SZL";
        String[] A01211 = A01(r2, A01210, "SZ");
        A01211[0] = "GBP";
        String[] A01212 = A01(r2, A01211, "TA");
        A01212[0] = "USD";
        String[] A01213 = A01(r2, A01212, "TC");
        A01213[0] = "XAF";
        String[] A01214 = A01(r2, A01213, "TD");
        A01214[0] = "EUR";
        String[] A01215 = A01(r2, A01214, "TF");
        A01215[0] = "XOF";
        String[] A01216 = A01(r2, A01215, "TG");
        A01216[0] = "THB";
        String[] A01217 = A01(r2, A01216, "TH");
        A01217[0] = "TJS";
        String[] A01218 = A01(r2, A01217, "TJ");
        A01218[0] = "NZD";
        String[] A01219 = A01(r2, A01218, "TK");
        A01219[0] = "USD";
        String[] A01220 = A01(r2, A01219, "TL");
        A01220[0] = "TMT";
        String[] A01221 = A01(r2, A01220, "TM");
        A01221[0] = "TND";
        String[] A01222 = A01(r2, A01221, "TN");
        A01222[0] = "TOP";
        String[] A01223 = A01(r2, A01222, "TO");
        A01223[0] = "TRY";
        String[] A01224 = A01(r2, A01223, "TR");
        A01224[0] = "TTD";
        String[] A01225 = A01(r2, A01224, "TT");
        A01225[0] = "AUD";
        String[] A01226 = A01(r2, A01225, "TV");
        A01226[0] = "TWD";
        String[] A01227 = A01(r2, A01226, "TW");
        A01227[0] = "TZS";
        String[] A01228 = A01(r2, A01227, "TZ");
        A01228[0] = "UAH";
        String[] A01229 = A01(r2, A01228, "UA");
        A01229[0] = "UGX";
        String[] A01230 = A01(r2, A01229, "UG");
        A01230[0] = "USD";
        String[] A01231 = A01(r2, A01230, "UM");
        A01231[0] = "USD";
        String[] A01232 = A01(r2, A01231, "US");
        A01232[0] = "UYU";
        String[] A01233 = A01(r2, A01232, "UY");
        A01233[0] = "UZS";
        String[] A01234 = A01(r2, A01233, "UZ");
        A01234[0] = "EUR";
        String[] A01235 = A01(r2, A01234, "VA");
        A01235[0] = "XCD";
        String[] A01236 = A01(r2, A01235, "VC");
        A01236[0] = "VES";
        String[] A01237 = A01(r2, A01236, "VE");
        A01237[0] = "USD";
        String[] A01238 = A01(r2, A01237, "VG");
        A01238[0] = "USD";
        String[] A01239 = A01(r2, A01238, "VI");
        A01239[0] = "VND";
        String[] A01240 = A01(r2, A01239, "VN");
        A01240[0] = "VUV";
        String[] A01241 = A01(r2, A01240, "VU");
        A01241[0] = "XPF";
        String[] A01242 = A01(r2, A01241, "WF");
        A01242[0] = "WST";
        String[] A01243 = A01(r2, A01242, "WS");
        A01243[0] = "EUR";
        String[] A01244 = A01(r2, A01243, "XK");
        A01244[0] = "YER";
        String[] A01245 = A01(r2, A01244, "YE");
        A01245[0] = "EUR";
        String[] A01246 = A01(r2, A01245, "YT");
        A01246[0] = "ZAR";
        String[] A01247 = A01(r2, A01246, "ZA");
        A01247[0] = "ZMW";
        String[] A01248 = A01(r2, A01247, "ZM");
        A01248[0] = "USD";
        r2.A02("ZW", A01248);
        HashMap A11 = C17880vN.A11();
        A01 = A11;
        A00("ADP", 0, "AFN", "ALL", A11);
        Integer A0j = C17880vN.A0j();
        A11.put("BHD", A0j);
        A11.put("BIF", 0);
        A11.put("BYR", 0);
        Integer A0k = C17880vN.A0k();
        A11.put("CLF", A0k);
        A11.put("CLP", 0);
        A11.put("DJF", 0);
        A00("ESP", 0, "GNF", "IQD", A11);
        A11.put("IRR", 0);
        A11.put("ISK", 0);
        A11.put("ITL", 0);
        A11.put("JOD", A0j);
        A00("JPY", 0, "KMF", "KPW", A11);
        A11.put("KRW", 0);
        A11.put("KWD", A0j);
        A11.put("LAK", 0);
        A11.put("LBP", 0);
        A11.put("LUF", 0);
        A11.put("LYD", A0j);
        A11.put("MGA", 0);
        A11.put("MGF", 0);
        A11.put("MMK", 0);
        A11.put("MRO", 0);
        A11.put("OMR", A0j);
        Object obj = "PYG";
        Object obj2 = "RSD";
        A00(obj, 0, obj2, "RWF", A11);
        A11.put("SLL", 0);
        A11.put("SOS", 0);
        A11.put("STD", 0);
        A11.put("SYP", 0);
        A11.put("TMM", 0);
        A11.put("TND", A0j);
        A11.put("TRL", 0);
        A11.put("UGX", 0);
        A11.put("UYI", 0);
        A11.put("UYW", A0k);
        A00("VND", 0, "VUV", "XAF", A11);
        A00("XOF", 0, "XPF", "YER", A11);
        A11.put("ZMK", 0);
        A11.put("ZWD", 0);
        HashMap A112 = C17880vN.A11();
        A02 = A112;
        C17890vO.A0z("AED", A112, 12);
        C17890vO.A0z("AFN", A112, 13);
        C17890vO.A0z("ALL", A112, 14);
        C17890vO.A0z("AMD", A112, 15);
        C17890vO.A0z("ANG", A112, 16);
        C17890vO.A0z("AOA", A112, 17);
        C17890vO.A0z("ARS", A112, 18);
        C17890vO.A0z("AUD", A112, 19);
        C17890vO.A0z("AWG", A112, 20);
        C17890vO.A0z("AZN", A112, 21);
        C17890vO.A0z("BAM", A112, 22);
        C17890vO.A0z("BBD", A112, 23);
        C17890vO.A0z("BDT", A112, 24);
        C17890vO.A0z("BGN", A112, 25);
        C17890vO.A0z("BHD", A112, 26);
        C17890vO.A0z("BIF", A112, 27);
        C17890vO.A0z("BMD", A112, 28);
        C17890vO.A0z("BND", A112, 29);
        C17890vO.A0z("BOB", A112, 30);
        C17890vO.A0z("BRL", A112, 31);
        C17890vO.A0z("BSD", A112, 32);
        C17890vO.A0z("BTN", A112, 33);
        C17890vO.A0z("BWP", A112, 34);
        C17890vO.A0z("BYN", A112, 35);
        C17890vO.A0z("BZD", A112, 36);
        C17890vO.A0z("CAD", A112, 37);
        C17890vO.A0z("CDF", A112, 38);
        C17890vO.A0z("CHF", A112, 39);
        C17890vO.A0z("CLP", A112, 40);
        C17890vO.A0z("CNY", A112, 41);
        C17890vO.A0z("COP", A112, 42);
        C17890vO.A0z("CRC", A112, 43);
        C17890vO.A0z("CUC", A112, 44);
        C17890vO.A0z("CUP", A112, 45);
        C17890vO.A0z("CVE", A112, 46);
        C17890vO.A0z("CZK", A112, 47);
        C17890vO.A0z("DJF", A112, 48);
        C17890vO.A0z("DKK", A112, 49);
        C17890vO.A0z("DOP", A112, 50);
        C17890vO.A0z("DZD", A112, 51);
        C17890vO.A0z("EGP", A112, 52);
        C17890vO.A0z("ERN", A112, 53);
        C17890vO.A0z("ETB", A112, 54);
        C17890vO.A0z("EUR", A112, 55);
        C17890vO.A0z("FJD", A112, 56);
        C17890vO.A0z("FKP", A112, 57);
        C17890vO.A0z("GBP", A112, 58);
        C17890vO.A0z("GEL", A112, 59);
        C17890vO.A0z("GHS", A112, 60);
        C17890vO.A0z("GIP", A112, 61);
        C17890vO.A0z("GMD", A112, 62);
        C17890vO.A0z("GNF", A112, 63);
        C17890vO.A0z("GTQ", A112, 64);
        C17890vO.A0z("GYD", A112, 65);
        C17890vO.A0z("HKD", A112, 66);
        C17890vO.A0z("HNL", A112, 67);
        C17890vO.A0z("HRK", A112, 68);
        C17890vO.A0z("HTG", A112, 69);
        C17890vO.A0z("HUF", A112, 70);
        C17890vO.A0z("IDR", A112, 71);
        C17890vO.A0z("ILS", A112, 72);
        C17890vO.A0z("INR", A112, 73);
        C17890vO.A0z("IQD", A112, 74);
        C17890vO.A0z("IRR", A112, 75);
        C17890vO.A0z("ISK", A112, 76);
        C17890vO.A0z("JMD", A112, 77);
        C17890vO.A0z("JOD", A112, 78);
        C17890vO.A0z("JPY", A112, 79);
        C17890vO.A0z("KES", A112, 80);
        C17890vO.A0z("KGS", A112, 81);
        C17890vO.A0z("KHR", A112, 82);
        C17890vO.A0z("KMF", A112, 83);
        C17890vO.A0z("KPW", A112, 84);
        C17890vO.A0z("KRW", A112, 85);
        C17890vO.A0z("KWD", A112, 86);
        C17890vO.A0z("KYD", A112, 87);
        C17890vO.A0z("KZT", A112, 88);
        C17890vO.A0z("LAK", A112, 89);
        C17890vO.A0z("LBP", A112, 90);
        C17890vO.A0z("LKR", A112, 91);
        C17890vO.A0z("LRD", A112, 92);
        C17890vO.A0z("LSL", A112, 93);
        C17890vO.A0z("LYD", A112, 94);
        C17890vO.A0z("MAD", A112, 95);
        C17890vO.A0z("MDL", A112, 96);
        C17890vO.A0z("MGA", A112, 97);
        C17890vO.A0z("MKD", A112, 98);
        C17890vO.A0z("MMK", A112, 99);
        C17890vO.A0z("MNT", A112, 100);
        C17890vO.A0z("MOP", A112, 101);
        C17890vO.A0z("MRU", A112, 102);
        C17890vO.A0z("MUR", A112, 103);
        C17890vO.A0z("MVR", A112, 104);
        C17890vO.A0z("MWK", A112, 105);
        C17890vO.A0z("MXN", A112, 106);
        C17890vO.A0z("MYR", A112, 107);
        C17890vO.A0z("MZN", A112, AnonymousClass74N.A03);
        C17890vO.A0z("NAD", A112, 109);
        C17890vO.A0z("NGN", A112, 110);
        C17890vO.A0z("NIO", A112, 111);
        C17890vO.A0z("NOK", A112, 112);
        C17890vO.A0z("NPR", A112, 113);
        C17890vO.A0z("NZD", A112, 114);
        C17890vO.A0z("OMR", A112, 115);
        C17890vO.A0z("PAB", A112, 116);
        C17890vO.A0z("PEN", A112, 117);
        C17890vO.A0z("PGK", A112, 118);
        C17890vO.A0z("PHP", A112, 119);
        C17890vO.A0z("PKR", A112, 120);
        C17890vO.A0z("PLN", A112, 121);
        C17890vO.A0z(obj, A112, 122);
        C17890vO.A0z("QAR", A112, 123);
        C17890vO.A0z("RON", A112, 124);
        C17890vO.A0z(obj2, A112, 125);
        C17890vO.A0z("RUB", A112, 126);
        C17890vO.A0z("RWF", A112, StringTreeSet.OFFSET_BASE_ENCODING);
        C17890vO.A0z("SAR", A112, 128);
        C17890vO.A0z("SBD", A112, 129);
        C17890vO.A0z("SCR", A112, 130);
        C17890vO.A0z("SDG", A112, 131);
        C17890vO.A0z("SEK", A112, 132);
        C17890vO.A0z("SGD", A112, 133);
        C17890vO.A0z("SHP", A112, 134);
        C17890vO.A0z("SLL", A112, 135);
        C17890vO.A0z("SOS", A112, 136);
        C17890vO.A0z("SRD", A112, 137);
        C17890vO.A0z("SSP", A112, 138);
        C17890vO.A0z("STN", A112, 139);
        C17890vO.A0z("SYP", A112, 140);
        C17890vO.A0z("SZL", A112, 141);
        C17890vO.A0z("THB", A112, 142);
        C17890vO.A0z("TJS", A112, 143);
        C17890vO.A0z("TMT", A112, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT);
        C17890vO.A0z("TND", A112, 145);
        C17890vO.A0z("TOP", A112, 146);
        C17890vO.A0z("TRY", A112, 147);
        C17890vO.A0z("TTD", A112, 148);
        C17890vO.A0z("TWD", A112, 149);
        C17890vO.A0z("TZS", A112, 150);
        C17890vO.A0z("UAH", A112, 151);
        C17890vO.A0z("UGX", A112, 152);
        C17890vO.A0z("USD", A112, 153);
        C17890vO.A0z("UYU", A112, 154);
        C17890vO.A0z("UZS", A112, 155);
        C17890vO.A0z("VES", A112, 156);
        C17890vO.A0z("VND", A112, 157);
        C17890vO.A0z("VUV", A112, 158);
        C17890vO.A0z("WST", A112, 159);
        C17890vO.A0z("XAF", A112, 160);
        C17890vO.A0z("XCD", A112, 161);
        C17890vO.A0z("XOF", A112, 162);
        C17890vO.A0z("XPF", A112, 163);
        C17890vO.A0z("YER", A112, 164);
        C17890vO.A0z("ZAR", A112, 165);
        C17890vO.A0z("ZMW", A112, 166);
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put(obj3, obj2);
        abstractMap.put(obj4, obj2);
    }
}
