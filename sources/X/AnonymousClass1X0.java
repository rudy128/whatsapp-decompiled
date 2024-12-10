package X;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1X0  reason: invalid class name */
public abstract class AnonymousClass1X0 {
    public static HashSet A00;
    public static final Object A01 = new Object();
    public static final Pattern A02 = Pattern.compile("[a-z]{2,3}");
    public static final Pattern A03 = Pattern.compile("[A-Z]{2}|[0-9]{3}");
    public static final String[] A04;

    static {
        String[] strArr = new String[10];
        int i = 0;
        do {
            strArr[i] = Character.toString((char) (i + 48));
            i++;
        } while (i < 10);
        A04 = strArr;
    }

    public static String A03(Locale locale) {
        char c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
            if (i >= 28) {
                return instance.getDigitStrings()[0];
            }
            c = instance.getZeroDigit();
        } else {
            c = java.text.DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }
        return Character.toString(c);
    }

    public static String A06(Locale locale, String str) {
        String[] strArr;
        String obj;
        String str2;
        char charAt;
        String[] strArr2 = (String[]) C25465CgK.A01.get(locale.getLanguage());
        if (strArr2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
                if (i >= 28) {
                    strArr = instance.getDigitStrings();
                } else {
                    char[] digits = instance.getDigits();
                    strArr = new String[10];
                    int i2 = 0;
                    do {
                        strArr[i2] = Character.toString(digits[i2]);
                        i2++;
                    } while (i2 < 10);
                }
            } else {
                char zeroDigit = java.text.DecimalFormatSymbols.getInstance(locale).getZeroDigit();
                strArr = new String[10];
                int i3 = 0;
                do {
                    strArr[i3] = Character.toString((char) (zeroDigit + i3));
                    i3++;
                } while (i3 < 10);
            }
            if (Arrays.equals(strArr2, strArr)) {
                obj = "[0-9]";
            } else if (Arrays.equals(A04, strArr)) {
                StringBuilder sb = new StringBuilder(19);
                sb.append(strArr2[0]);
                int i4 = 1;
                do {
                    sb.append('|');
                    sb.append(strArr2[i4]);
                    i4++;
                } while (i4 < 10);
                obj = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[0-9]|");
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append(strArr2[0]);
                int i5 = 1;
                do {
                    sb3.append('|');
                    sb3.append(strArr2[i5]);
                    i5++;
                } while (i5 < 10);
                sb2.append(sb3.toString());
                obj = sb2.toString();
            }
            Matcher matcher = Pattern.compile(obj).matcher(str);
            if (matcher.find()) {
                int length = str.length();
                StringBuilder sb4 = new StringBuilder(length);
                int i6 = 0;
                do {
                    int start = matcher.start();
                    if (i6 < start) {
                        sb4.append(str.substring(i6, start));
                    }
                    String group = matcher.group();
                    if (group.length() != 1 || '0' > (charAt = group.charAt(0)) || charAt > '9') {
                        str2 = "";
                    } else {
                        str2 = strArr[charAt - '0'];
                    }
                    if (str2.isEmpty()) {
                        int i7 = 0;
                        while (true) {
                            if (!group.equals(strArr2[i7])) {
                                i7++;
                                if (i7 >= 10) {
                                    break;
                                }
                            } else {
                                str2 = strArr[i7];
                                break;
                            }
                        }
                    }
                    if (!str2.isEmpty()) {
                        group = str2;
                    }
                    sb4.append(group);
                    i6 = matcher.end();
                } while (matcher.find());
                if (i6 < length) {
                    sb4.append(str.substring(i6));
                }
                return sb4.toString();
            }
        }
        return str;
    }

    public static int A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("-");
            sb.append(country);
            language = sb.toString();
        }
        AnonymousClass00O r1 = AnonymousClass1X2.A00;
        Number number = (Number) r1.get(language);
        if (number == null && (number = (Number) r1.get(country)) == null) {
            return 1;
        }
        return number.intValue();
    }

    public static String A01(Locale locale) {
        String language = locale.getLanguage();
        if (!"zh".equals(language)) {
            return language;
        }
        if ("Hans".equals(A02(locale))) {
            return "zh-Hans";
        }
        return "zh-Hant";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if ("ME".equals(r1) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r1 = r7.getCountry();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        switch(r1.hashCode()) {
            case 2344: goto L_0x006b;
            case 2345: goto L_0x006e;
            case 2627: goto L_0x0082;
            default: goto L_0x006a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = "IQ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r0 = "IR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r1.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if ("PK".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        return "Guru";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r1.equals("RU") != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        return "Cyrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if ("AF".equals(r1) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if ("CN".equals(r1) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        return "Latn";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if ("CN".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        if ("SG".equals(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        return "Hant";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return "Arab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return "Hans";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        switch(r6) {
            case 0: goto L_0x005f;
            case 1: goto L_0x0077;
            case 2: goto L_0x0056;
            case 3: goto L_0x008c;
            case 4: goto L_0x009c;
            default: goto L_0x0026;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(java.util.Locale r7) {
        /*
            java.lang.String r1 = r7.getScript()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            java.lang.String r1 = r7.getCountry()
            java.lang.String r2 = r7.getLanguage()
            int r0 = r2.hashCode()
            switch(r0) {
                case 3129: goto L_0x0029;
                case 3569: goto L_0x0031;
                case 3679: goto L_0x0039;
                case 3749: goto L_0x0042;
                case 3886: goto L_0x004b;
                default: goto L_0x001a;
            }
        L_0x001a:
            r6 = -1
        L_0x001b:
            java.lang.String r5 = "Cyrl"
            java.lang.String r4 = "CN"
            java.lang.String r3 = "Latn"
            java.lang.String r2 = "Arab"
            switch(r6) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0077;
                case 2: goto L_0x0056;
                case 3: goto L_0x008c;
                case 4: goto L_0x009c;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.String r0 = ""
            return r0
        L_0x0029:
            java.lang.String r0 = "az"
            boolean r0 = r2.equals(r0)
            r6 = 0
            goto L_0x0053
        L_0x0031:
            java.lang.String r0 = "pa"
            boolean r0 = r2.equals(r0)
            r6 = 1
            goto L_0x0053
        L_0x0039:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            r6 = 2
            goto L_0x0053
        L_0x0042:
            java.lang.String r0 = "uz"
            boolean r0 = r2.equals(r0)
            r6 = 3
            goto L_0x0053
        L_0x004b:
            java.lang.String r0 = "zh"
            boolean r0 = r2.equals(r0)
            r6 = 4
        L_0x0053:
            if (r0 != 0) goto L_0x001b
            goto L_0x001a
        L_0x0056:
            java.lang.String r0 = "ME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            return r3
        L_0x005f:
            java.lang.String r1 = r7.getCountry()
            int r0 = r1.hashCode()
            switch(r0) {
                case 2344: goto L_0x006b;
                case 2345: goto L_0x006e;
                case 2627: goto L_0x0082;
                default: goto L_0x006a;
            }
        L_0x006a:
            return r3
        L_0x006b:
            java.lang.String r0 = "IQ"
            goto L_0x0070
        L_0x006e:
            java.lang.String r0 = "IR"
        L_0x0070:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0081
            return r3
        L_0x0077:
            java.lang.String r0 = "PK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0081
            java.lang.String r2 = "Guru"
        L_0x0081:
            return r2
        L_0x0082:
            java.lang.String r0 = "RU"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008b
            return r3
        L_0x008b:
            return r5
        L_0x008c:
            java.lang.String r0 = "AF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x009b
        L_0x009a:
            return r2
        L_0x009b:
            return r3
        L_0x009c:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "SG"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "Hant"
            return r0
        L_0x00b3:
            java.lang.String r0 = "Hans"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1X0.A02(java.util.Locale):java.lang.String");
    }

    public static String A04(Locale locale) {
        String language = locale.getLanguage();
        switch (language.hashCode()) {
            case 3365:
                if (language.equals("in")) {
                    return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                }
                break;
            case 3374:
                if (language.equals("iw")) {
                    return "he";
                }
                break;
            case 3588:
                if (language.equals("pt")) {
                    if (AnonymousClass1XF.A00.contains(locale.getCountry())) {
                        return "pt-PT";
                    }
                    return "pt-BR";
                }
                break;
            case 3704:
                if (language.equals("tl")) {
                    return "fil";
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    if ("Hans".equals(A02(locale))) {
                        return "zh-Hans";
                    }
                    return "zh-Hant";
                }
                break;
        }
        return language;
    }

    public static String A05(Locale locale) {
        String language = locale.getLanguage();
        char c = 65535;
        switch (language.hashCode()) {
            case 3129:
                if (language.equals("az")) {
                    c = 0;
                    break;
                }
                break;
            case 3325:
                if (language.equals("he")) {
                    c = 1;
                    break;
                }
                break;
            case 3355:
                if (language.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                    c = 2;
                    break;
                }
                break;
            case 3569:
                if (language.equals("pa")) {
                    c = 3;
                    break;
                }
                break;
            case 3672:
                if (language.equals("sk")) {
                    c = 4;
                    break;
                }
                break;
            case 3679:
                if (language.equals("sr")) {
                    c = 5;
                    break;
                }
                break;
            case 3749:
                if (language.equals("uz")) {
                    c = 6;
                    break;
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    c = 7;
                    break;
                }
                break;
            case 101385:
                if (language.equals("fil")) {
                    c = 8;
                    break;
                }
                break;
        }
        String str = "Latn";
        switch (c) {
            case 0:
            case 6:
                break;
            case 1:
                return "iw";
            case 2:
                return "in";
            case 3:
                str = "Guru";
                break;
            case 4:
                return "cs";
            case 5:
                str = "Cyrl";
                break;
            case 7:
                if ("HK".equals(locale.getCountry())) {
                    return "zh-rHK";
                }
                if ("Hans".equals(A02(locale))) {
                    return "zh-rCN";
                }
                return "zh-rTW";
            case 8:
                return "tl";
        }
        if (!str.equals(A02(locale))) {
            return null;
        }
        return language;
    }
}
