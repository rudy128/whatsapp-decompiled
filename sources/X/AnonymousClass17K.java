package X;

import android.telephony.PhoneNumberUtils;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.17K  reason: invalid class name */
public class AnonymousClass17K {
    public static final String[] A00 = {"((?:0[1-3]|[457][0-3])\\d{6})", "([04-9][4-6]\\d{6})", "((?:[04-8][7-9]|9[78])\\d{6})", "(5\\d{6})", "(6\\d{6})", "(9\\d{6})", "(7\\d{6})"};
    public static final Pattern[] A01 = new Pattern[7];

    public static String A00(C42771yi r2, AnonymousClass1BI r3) {
        if (r3 == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (C22971Dz.A0Z(r3)) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(r3.user);
            return sb.toString();
        } else {
            String A04 = A04(r3);
            if (!PhoneNumberUtils.isGlobalPhoneNumber(A04)) {
                return A04;
            }
            C17960vV.A07(A04);
            return A01(r2, A04);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f A[Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C42771yi r11, java.lang.String r12) {
        /*
            java.lang.String r4 = " "
            java.lang.String r5 = "ZZ"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 43
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            X.1ym r2 = r11.A0H(r3, r5)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            int r6 = r2.countryCode_     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            long r0 = r2.nationalNumber_     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r0 = 52
            r9 = 1
            r10 = 0
            java.lang.String r1 = "+"
            if (r0 != r6) goto L_0x0051
            int r8 = r7.length()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r0 = 11
            if (r8 != r0) goto L_0x011c
            char r8 = r7.charAt(r10)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r0 = 49
            if (r8 != r0) goto L_0x011c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = r7.substring(r9)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
        L_0x004b:
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            goto L_0x011d
        L_0x0051:
            r0 = 225(0xe1, float:3.15E-43)
            if (r0 != r6) goto L_0x0056
            goto L_0x00c0
        L_0x0056:
            r0 = 245(0xf5, float:3.43E-43)
            if (r0 != r6) goto L_0x011c
            r0 = 3
            java.util.regex.Pattern r0 = A07(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 == 0) goto L_0x0077
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "95"
            goto L_0x00db
        L_0x0077:
            r0 = 4
            java.util.regex.Pattern r0 = A07(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 != 0) goto L_0x00b2
            r0 = 5
            java.util.regex.Pattern r0 = A07(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 != 0) goto L_0x00b2
            r0 = 6
            java.util.regex.Pattern r0 = A07(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 == 0) goto L_0x011c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "97"
            goto L_0x00db
        L_0x00b2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "96"
            goto L_0x00db
        L_0x00c0:
            java.util.regex.Pattern r0 = A07(r10)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 == 0) goto L_0x00e3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "01"
        L_0x00db:
            r8.append(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            goto L_0x004b
        L_0x00e3:
            java.util.regex.Pattern r0 = A07(r9)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "05"
            goto L_0x00db
        L_0x00ff:
            r0 = 2
            java.util.regex.Pattern r0 = A07(r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            if (r0 == 0) goto L_0x011c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.<init>()     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r1)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            r8.append(r6)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r0 = "07"
            goto L_0x00db
        L_0x011c:
            r0 = 0
        L_0x011d:
            if (r0 == 0) goto L_0x0123
            X.1ym r2 = r11.A0H(r0, r5)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
        L_0x0123:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            java.lang.String r3 = r11.A0J(r2, r0)     // Catch:{ Exception -> 0x012a, ExceptionInInitializerError -> 0x0133 }
            return r3
        L_0x012a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contact/formatter-exception num:"
            goto L_0x013b
        L_0x0133:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contact/formatter-init-exception num:"
        L_0x013b:
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17K.A01(X.1yi, java.lang.String):java.lang.String");
    }

    public static String A02(AnonymousClass1E7 r1) {
        return A00(C42771yi.A00(), (AnonymousClass1BI) r1.A06(AnonymousClass1BI.class));
    }

    public static String A04(AnonymousClass1BI r4) {
        String str;
        int indexOf;
        if (r4 instanceof PhoneUserJid) {
            return r4.user;
        }
        if (!C22971Dz.A0e(r4) || r4 == null || (str = r4.user) == null || (indexOf = str.indexOf("-")) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static Pattern A07(int i) {
        Pattern[] patternArr = A01;
        if (patternArr[i] == null) {
            patternArr[i] = Pattern.compile(A00[i]);
        }
        return patternArr[i];
    }

    public static String A03(AnonymousClass1BI r2) {
        String A04 = C63942tw.A04(A00(C42771yi.A00(), r2));
        if (A04 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        sb.append(A04);
        return sb.toString();
    }

    public static String A05(AnonymousClass1BI r1) {
        return A00(C42771yi.A00(), r1);
    }

    public static String A06(String str) {
        return A01(C42771yi.A00(), str);
    }
}
