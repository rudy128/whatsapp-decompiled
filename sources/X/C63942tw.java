package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tw  reason: invalid class name and case insensitive filesystem */
public abstract class C63942tw {
    public static int A01(AnonymousClass1LA r3, String str, String str2) {
        int A00 = A00(r3, (C139576z4) null, str, str2);
        if (A00 != 7 && A00 != 5 && A00 != 6) {
            return A00;
        }
        int length = str.length() + str2.length();
        if (length > 17 || length < 6) {
            C17900vP.A0g("enterphone/num/allow-landline/error/length input=", str2, AnonymousClass000.A10());
            return 7;
        }
        C17900vP.A0f("enterphone/num/allow-landline/ok/length input=", str2, AnonymousClass000.A10());
        return 1;
    }

    public static int A00(AnonymousClass1LA r9, C139576z4 r10, String str, String str2) {
        try {
            int length = str.length();
            if (length < 1 || length > 3) {
                C17900vP.A0g("enterphone/cc/bad-length cc=", str, AnonymousClass000.A10());
                return 2;
            }
            Charset charset = AnonymousClass1K3.A06;
            try {
                if (AnonymousClass1K4.A01.indexOfKey(Integer.parseInt(str)) >= 0) {
                    if (str2 == null || str2.length() == 0 || str2.replaceAll("\\D", "").length() == 0) {
                        C17900vP.A0g("enterphone/num/error/empty cc=", str, AnonymousClass000.A10());
                        return 4;
                    }
                    int parseInt = Integer.parseInt(str);
                    String A03 = r9.A03(parseInt, str2.replaceAll("\\D", ""));
                    if (r10 == null || !r10.A02(12127)) {
                        int length2 = A03.length();
                        AnonymousClass1LA.A01(r9);
                        Iterator it = r9.A01.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C42841yp r1 = (C42841yp) it.next();
                            if (r1.A00 == parseInt) {
                                int A00 = C42841yp.A00(r1, length2);
                                if (A00 != 0) {
                                    if (A00 < 0) {
                                        return 5;
                                    }
                                    return 6;
                                }
                            }
                        }
                    }
                    int length3 = length + A03.length();
                    if (length3 <= 15 && length3 >= 8) {
                        return 1;
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("enterphone/num/error/length cc=");
                    A10.append(str);
                    C17900vP.A0g(" ph=", A03, A10);
                    return 7;
                }
            } catch (NumberFormatException unused) {
            }
            C17900vP.A0g("enterphone/cc/bad-name ", str, AnonymousClass000.A10());
            return 3;
        } catch (IOException e) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e);
            return 7;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[SYNTHETIC, Splitter:B:7:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C42771yi r7, java.lang.String r8, int r9) {
        /*
            java.lang.String r3 = "phonenumberutil/isValidNumber"
            java.lang.String r4 = "+"
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r6 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "\\D"
            java.lang.String r2 = ""
            java.lang.String r1 = r8.replaceAll(r0, r2)
            java.lang.String r0 = "^0+(?!$)"
            java.lang.String r5 = r1.replaceFirst(r0, r2)
            int r1 = r5.length()
            r0 = 5
            if (r1 >= r0) goto L_0x0026
            java.lang.String r0 = "phonenumberutil/formatEnteredNumber/too-short-number"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0025:
            r5 = r6
        L_0x0026:
            if (r5 == 0) goto L_0x006e
            boolean r0 = r5.startsWith(r4)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            java.lang.String r2 = "ZZ"
            if (r0 == 0) goto L_0x0035
            X.1ym r1 = r7.A0H(r5, r2)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            goto L_0x005d
        L_0x0035:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r4)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            r0.append(r9)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            java.lang.String r1 = X.AnonymousClass000.A0y(r5, r0)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            java.lang.String r0 = r7.A0I(r9)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            X.1ym r1 = r7.A0H(r1, r0)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            boolean r0 = r7.A0N(r1)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            if (r0 == 0) goto L_0x0055
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            java.lang.String r0 = r7.A0J(r1, r0)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            return r0
        L_0x0055:
            java.lang.String r0 = X.C17900vP.A0A(r4, r5)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            X.1ym r1 = r7.A0H(r0, r2)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
        L_0x005d:
            boolean r0 = r7.A0N(r1)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            java.lang.String r0 = r7.A0J(r1, r0)     // Catch:{ 1Mf | RuntimeException -> 0x006a }
            return r0
        L_0x006a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x006e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63942tw.A02(X.1yi, java.lang.String, int):java.lang.String");
    }

    public static String A04(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\D", "");
    }

    public static String A03(AnonymousClass1LA r1, String str, String str2) {
        try {
            return r1.A03(Integer.parseInt(str), str2);
        } catch (IOException e) {
            Log.e("phonenumberutils/trim/error", e);
            return str2;
        }
    }

    public static ArrayList A05(AnonymousClass1LA r6, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C89384cN r3 = (C89384cN) it.next();
            if (A00(r6, (C139576z4) null, r3.A00, r3.A02) == 1) {
                A13.add(r3);
            }
        }
        return A13;
    }

    public static boolean A06(String str, String str2, String str3) {
        if (!str.equals(str2)) {
            String replaceAll = str.replaceAll("[^0-9]", "");
            String replaceAll2 = str2.replaceAll("[^0-9]", "");
            if (replaceAll2.equals(replaceAll) || replaceAll2.substring(str3.length()).equals(replaceAll)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r6 = X.C17900vP.A0A(r11, r9);
        r5 = A08(r8, r9, r6, r7, r2);
        r4 = A08(r10, r9, r6, r7, r2);
        r1 = r2 - r11.length();
        r3 = A08(r9, r8, r10, r7, r1);
        r2 = A08(r6, r8, r10, r7, r2);
        r0 = A08(r8, r9, r6, r7, r1);
        r1 = A08(r10, r9, r6, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r5 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r4 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r3 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r2 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r0 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r2 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            r1 = 0
            switch(r0) {
                case 1693: goto L_0x0009;
                case 1695: goto L_0x0014;
                case 1696: goto L_0x0020;
                case 49686: goto L_0x002c;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r1
        L_0x0009:
            java.lang.String r0 = "52"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "1"
            goto L_0x001e
        L_0x0014:
            java.lang.String r0 = "54"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "9"
        L_0x001e:
            r2 = 2
            goto L_0x0037
        L_0x0020:
            java.lang.String r0 = "55"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "9"
            r2 = 4
            goto L_0x0037
        L_0x002c:
            java.lang.String r0 = "237"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.String r7 = "6"
            r2 = 3
        L_0x0037:
            java.lang.String r6 = X.C17900vP.A0A(r11, r9)
            boolean r5 = A08(r8, r9, r6, r7, r2)
            boolean r4 = A08(r10, r9, r6, r7, r2)
            int r0 = r11.length()
            int r1 = r2 - r0
            boolean r3 = A08(r9, r8, r10, r7, r1)
            boolean r2 = A08(r6, r8, r10, r7, r2)
            boolean r0 = A08(r8, r9, r6, r7, r1)
            boolean r1 = A08(r10, r9, r6, r7, r1)
            if (r5 != 0) goto L_0x0066
            if (r4 != 0) goto L_0x0066
            if (r3 != 0) goto L_0x0066
            if (r2 != 0) goto L_0x0066
            if (r0 != 0) goto L_0x0066
            r0 = 0
            if (r1 == 0) goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63942tw.A07(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A08(String str, String str2, String str3, String str4, int i) {
        if (str.length() < i) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(i, str4);
        String obj = sb.toString();
        if (obj.equals(str2) || obj.equals(str3)) {
            return true;
        }
        return false;
    }
}
