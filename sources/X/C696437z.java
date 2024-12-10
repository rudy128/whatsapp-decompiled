package X;

import android.net.Uri;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* renamed from: X.37z  reason: invalid class name and case insensitive filesystem */
public class C696437z implements BCG {
    public int A00 = 0;
    public C191779nA A01;
    public C58142kD A02;
    public final int A03;
    public final long A04;
    public final C18030ve A05;
    public final AnonymousClass1KX A06;
    public final C88214Yt A07;
    public final C220218h A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;
    public final long A0D;
    public final C23651Hc A0E;
    public final C58142kD A0F;
    public final C58142kD A0G;
    public final C24421Kg A0H;
    public final AnonymousClass1NV A0I;
    public final boolean A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r49 != 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r37 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r37 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14, 2648) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C696437z A01(X.AnonymousClass190 r37, X.C23651Hc r38, X.AnonymousClass11P r39, X.C18030ve r40, X.AnonymousClass1KX r41, X.C88214Yt r42, X.C24421Kg r43, X.C59912n5 r44, X.C220218h r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, int r50, long r51, boolean r53, boolean r54) {
        /*
            r1 = 1
            r14 = r40
            if (r53 != 0) goto L_0x0011
            r2 = 2648(0xa58, float:3.71E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r2)
            r31 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            r31 = 1
        L_0x0013:
            r0 = 256(0x100, float:3.59E-43)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r14, r0)
            r2 = r49
            if (r0 == 0) goto L_0x0051
            if (r49 != 0) goto L_0x0051
            r0 = 258(0x102, float:3.62E-43)
            int r25 = X.C18020vd.A00(r6, r14, r0)
        L_0x0027:
            r15 = r41
            r28 = r51
            r13 = r38
            r16 = r42
            r19 = r43
            r7 = r44
            r20 = r45
            if (r44 != 0) goto L_0x0054
            int r24 = 4 - r50
            r0 = 257(0x101, float:3.6E-43)
            boolean r30 = X.C18020vd.A05(r6, r14, r0)
            r17 = 0
            r26 = 0
            X.37z r12 = new X.37z
            r21 = r17
            r22 = r17
            r23 = r17
            r18 = r17
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)
            return r12
        L_0x0051:
            r25 = 0
            goto L_0x0027
        L_0x0054:
            long r10 = r7.A04
            java.lang.String r12 = r7.A09
            int r44 = 4 - r50
            if (r1 != r2) goto L_0x00e9
            int r0 = r7.A00
        L_0x005e:
            int r44 = r0 + 1
            r8 = 1
            if (r49 == 0) goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            java.util.List r5 = r7.A0C
            java.lang.String r0 = "fallback"
            r4 = 0
            r9 = r46
            X.2kD r38 = A00(r0, r9, r4, r5, r8)
            java.lang.String r3 = "primary"
            r2 = r4
            if (r8 != 0) goto L_0x009b
            r1 = r48
            r0 = r54
            r2 = r39
            java.lang.String r2 = A03(r2, r14, r1, r9, r0)
            if (r2 != 0) goto L_0x008a
            r0 = r47
            if (r47 == 0) goto L_0x008a
            r1 = r37
            java.lang.String r2 = A02(r1, r14, r7, r0)
        L_0x008a:
            r1 = 0
            if (r2 == 0) goto L_0x0093
            X.2kD r37 = A00(r3, r9, r2, r5, r1)
            if (r37 != 0) goto L_0x00a3
        L_0x0093:
            java.lang.String r0 = "0"
            X.2kD r37 = A00(r3, r9, r0, r5, r1)
            if (r37 != 0) goto L_0x00a3
        L_0x009b:
            X.2kD r37 = A00(r3, r9, r4, r5, r8)
            if (r37 != 0) goto L_0x00a3
            r37 = r38
        L_0x00a3:
            java.lang.String r0 = "newsletter"
            boolean r3 = r9.contains(r0)
            r42 = 0
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x00c5
            r0 = 12149(0x2f75, float:1.7024E-41)
            boolean r0 = X.C18020vd.A05(r6, r14, r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c3
        L_0x00c1:
            if (r3 == 0) goto L_0x00c5
        L_0x00c3:
            r42 = r1
        L_0x00c5:
            r0 = 257(0x101, float:3.6E-43)
            boolean r50 = X.C18020vd.A05(r6, r14, r0)
            X.37z r32 = new X.37z
            r43 = r2
            r46 = r10
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r16
            r39 = r19
            r40 = r20
            r41 = r12
            r45 = r25
            r48 = r28
            r51 = r31
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50, r51)
            return r32
        L_0x00e9:
            if (r49 == 0) goto L_0x00f9
            r0 = 2
            if (r0 == r2) goto L_0x00f9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Mms4RouteSupplier/invalid mode = "
            X.C17900vP.A0i(r0, r1, r2)
            goto L_0x0063
        L_0x00f9:
            int r0 = r7.A01
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696437z.A01(X.190, X.1Hc, X.11P, X.0ve, X.1KX, X.4Yt, X.1Kg, X.2n5, X.18h, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean):X.37z");
    }

    public static boolean A05(String str) {
        try {
            return new URL(AnonymousClass001.A1H("https://", str, AnonymousClass000.A10())).getHost().endsWith(".whatsapp.net");
        } catch (MalformedURLException e) {
            Log.e("Mms4RouteSupplier/isAcceptableHostname/", e);
            return false;
        }
    }

    public void Bt5(boolean z, int i) {
        if (i != -1) {
            this.A0H.A0E(i);
        }
        this.A00++;
        A04(z);
    }

    public static String A02(AnonymousClass190 r6, C18030ve r7, C59912n5 r8, String str) {
        long j;
        if (!C18020vd.A05(C18040vf.A02, r7, 2134)) {
            return null;
        }
        long j2 = r8.A06;
        if (j2 <= 0) {
            return null;
        }
        try {
            j = new BigInteger(1, Base64.decode(str, 2)).mod(BigInteger.valueOf(Math.abs(j2))).longValue();
        } catch (IllegalArgumentException e) {
            C17900vP.A0h("routesupplier/bigMod/could not parse hash: ", str, AnonymousClass000.A10(), e);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("hash=");
            A10.append(str);
            r6.A0G("routesupplier/hash not parsed", AnonymousClass001.A1E(e, " error=", A10), true);
            j = 0;
        }
        return Long.toString(j + 100);
    }

    public static String A03(AnonymousClass11P r9, C18030ve r10, String str, String str2, boolean z) {
        Long l;
        if (!z && !str2.startsWith("newsletter")) {
            long A032 = C17890vO.A03(C18020vd.A00(C18040vf.A02, r10, 2136));
            if (A032 > 0) {
                String queryParameter = Uri.parse(new Uri.Builder().encodedPath(str).build().toString()).getQueryParameter("_nc_hot");
                if (queryParameter == null) {
                    l = null;
                } else {
                    try {
                        l = Long.valueOf(Long.parseLong(queryParameter) * 1000);
                    } catch (NumberFormatException unused) {
                        C17900vP.A0e("catv1/cannot parse hot timestamp: ", queryParameter, AnonymousClass000.A10());
                        l = null;
                    }
                }
                long A012 = AnonymousClass11P.A01(r9);
                if (l == null || A012 - l.longValue() >= A032) {
                    return null;
                }
            }
            return null;
        }
        return "1";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r12.A0E.A06 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r13 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r13.A0C == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r12.A0J != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r3 >= 3) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r5 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (r3 == 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r3 < 2) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (r12.A0J != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        if (r13 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009e, code lost:
        if (r22 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 > 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        r11 = r13.A00;
        X.C17960vV.A07(r11);
        r10 = r13.A01;
        r2 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a9, code lost:
        r9 = "fna";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        if (r11.toLowerCase(java.util.Locale.ROOT).contains(r9) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        r9 = "pop";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ba, code lost:
        if (r6 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bc, code lost:
        if (r2 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00bf, code lost:
        r11 = r13.A04;
        r10 = r13.A05;
        r2 = r13.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r7 = java.net.InetAddress.getByName(r2).getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("[");
        r1.append(r2);
        r1.append("]");
        r10 = r1.toString();
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e5, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e6, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e7, code lost:
        r5 = r12.A07;
        r1 = r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ed, code lost:
        if (r1 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ef, code lost:
        r0 = X.C17880vN.A1Y();
        r0[0] = ":";
        r1 = X.AnonymousClass1YF.A0S(r1, r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010e, code lost:
        r2 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0122, code lost:
        r12.A08.A01(r3, r11);
        r6 = X.AnonymousClass000.A11(r3);
        r6.append(":");
        r10 = X.C17880vN.A0t(r6, r5.A01.A05("user_proxy_setting_pref").getInt("proxy_media_port", 587));
        r6 = X.AnonymousClass4ZA.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0147, code lost:
        r3 = r13.A08;
        r2 = r12.A09;
        X.C17960vV.A07(r2);
        r15 = r10;
        r16 = r2;
        r14 = r11;
        r13 = new X.C191779nA(r14, r15, r16, r12.A0B, r9, r12.A0A, r3, r6, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0167, code lost:
        if (r16 == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0171, code lost:
        r12.A08.A01(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0176, code lost:
        if (r6 != 2) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0178, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017a, code lost:
        r10 = r11;
        r6 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(boolean r24) {
        /*
            r23 = this;
            r12 = r23
            int r1 = r12.A00
            r0 = 3
            if (r1 <= r0) goto L_0x017d
            X.0ve r2 = r12.A05
            r0 = 12545(0x3101, float:1.7579E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x017d
            r0 = 12446(0x309e, float:1.744E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            if (r0 <= 0) goto L_0x017d
        L_0x001b:
            int r2 = r12.A00
            if (r2 < r0) goto L_0x002e
            if (r24 == 0) goto L_0x0028
            int r1 = r12.A03
            int r0 = r12.A0C
            int r1 = r1 + r0
            if (r2 < r1) goto L_0x002d
        L_0x0028:
            r13 = 0
            r12.A02 = r13
        L_0x002b:
            r12.A01 = r13
        L_0x002d:
            return
        L_0x002e:
            if (r24 != 0) goto L_0x002d
            X.1KX r15 = r12.A06
            X.0ve r1 = r15.A02
            r0 = 59
            X.0vf r14 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r14, r1, r0)
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0047
            X.1Hc r0 = r12.A0E
            boolean r0 = r0.A06
            r5 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            int r3 = r12.A00
            r4 = 3
            if (r3 > r1) goto L_0x0074
            X.2kD r13 = r12.A0G
            r12.A02 = r13
        L_0x0051:
            r22 = 0
            if (r13 == 0) goto L_0x0059
        L_0x0055:
            boolean r0 = r13.A0C
            if (r0 != 0) goto L_0x005f
        L_0x0059:
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x0071
            if (r3 >= r4) goto L_0x0071
        L_0x005f:
            r16 = 1
        L_0x0061:
            if (r5 == 0) goto L_0x006d
            if (r3 == 0) goto L_0x0068
            r0 = 2
            if (r3 < r0) goto L_0x006d
        L_0x0068:
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x006d
            r6 = 1
        L_0x006d:
            if (r13 != 0) goto L_0x009e
            r13 = 0
            goto L_0x002b
        L_0x0071:
            r16 = 0
            goto L_0x0061
        L_0x0074:
            X.2kD r2 = r12.A0F
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x0086
            X.2kD r13 = r12.A02
            if (r13 != r2) goto L_0x0086
            r0 = 4
            if (r3 != r0) goto L_0x0086
        L_0x0083:
            r22 = 1
            goto L_0x0055
        L_0x0086:
            int r0 = r12.A03
            int r0 = r0 - r1
            if (r3 == r0) goto L_0x009a
            if (r3 == r4) goto L_0x009a
            X.2kD r1 = r12.A0G
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x009a
            X.2kD r13 = r12.A02
            if (r13 != r1) goto L_0x009a
            goto L_0x0083
        L_0x009a:
            r12.A02 = r2
            r13 = r2
            goto L_0x0051
        L_0x009e:
            if (r22 == 0) goto L_0x00bf
            java.lang.String r11 = r13.A00
            X.C17960vV.A07(r11)
            java.lang.String r10 = r13.A01
            java.lang.String r2 = r13.A02
        L_0x00a9:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r11.toLowerCase(r0)
            java.lang.String r9 = "fna"
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x00b9
            java.lang.String r9 = "pop"
        L_0x00b9:
            r8 = 2
            if (r6 == 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00e5
            goto L_0x00c6
        L_0x00bf:
            java.lang.String r11 = r13.A04
            java.lang.String r10 = r13.A05
            java.lang.String r2 = r13.A06
            goto L_0x00a9
        L_0x00c6:
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r2)     // Catch:{ UnknownHostException -> 0x00e5 }
            java.lang.String r7 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ UnknownHostException -> 0x00e6 }
            java.lang.String r0 = "["
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00e6 }
            r1.append(r2)     // Catch:{ UnknownHostException -> 0x00e6 }
            java.lang.String r0 = "]"
            r1.append(r0)     // Catch:{ UnknownHostException -> 0x00e6 }
            java.lang.String r10 = r1.toString()     // Catch:{ UnknownHostException -> 0x00e6 }
            r6 = 2
            goto L_0x00e7
        L_0x00e5:
            r7 = r10
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            X.4Yt r5 = r12.A07
            java.lang.String r1 = r5.A01()
            if (r1 == 0) goto L_0x0167
            java.lang.String[] r0 = X.C17880vN.A1Y()
            java.lang.String r4 = ":"
            r2 = 0
            r0[r2] = r4
            java.util.List r1 = X.AnonymousClass1YF.A0S(r1, r0, r2)
            int r0 = r1.size()
            if (r0 != r8) goto L_0x0167
            java.lang.String r3 = X.C17880vN.A0w(r1, r2)
            if (r3 == 0) goto L_0x0167
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x0167
            X.0ve r2 = r5.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 3641(0xe39, float:5.102E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0167
            r0 = 4073(0xfe9, float:5.707E-42)
            boolean r0 = X.C18020vd.A05(r14, r2, r0)
            if (r0 == 0) goto L_0x0167
            X.18h r0 = r12.A08
            r0.A01(r3, r11)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r3)
            r6.append(r4)
            X.0vc r1 = r5.A01
            java.lang.String r0 = "user_proxy_setting_pref"
            android.content.SharedPreferences r2 = r1.A05(r0)
            java.lang.String r1 = "proxy_media_port"
            r0 = 587(0x24b, float:8.23E-43)
            int r0 = r2.getInt(r1, r0)
            java.lang.String r10 = X.C17880vN.A0t(r6, r0)
            boolean r6 = X.AnonymousClass4ZA.A00(r3)
        L_0x0147:
            java.lang.String r3 = r13.A08
            java.lang.String r2 = r12.A09
            X.C17960vV.A07(r2)
            java.lang.String r1 = r12.A0B
            java.lang.String r0 = r12.A0A
            X.9nA r13 = new X.9nA
            r17 = r1
            r18 = r9
            r19 = r0
            r20 = r3
            r21 = r6
            r15 = r10
            r16 = r2
            r14 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x002b
        L_0x0167:
            if (r16 == 0) goto L_0x017a
            boolean r0 = r15.A01()
            if (r0 == 0) goto L_0x017a
            if (r10 == 0) goto L_0x017a
            X.18h r0 = r12.A08
            r0.A01(r7, r11)
            if (r6 == r8) goto L_0x0147
            r6 = 1
            goto L_0x0147
        L_0x017a:
            r10 = r11
            r6 = 0
            goto L_0x0147
        L_0x017d:
            int r0 = r12.A03
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696437z.A04(boolean):void");
    }

    public long BNK() {
        AnonymousClass1NV r2 = this.A0I;
        if (r2 != null && this.A00 >= this.A03) {
            Long A012 = r2.A01();
            if (A012 != null) {
                return A012.longValue();
            }
            Log.e("Mms4RouteSupplier/getBackoffTime unexpected exponential backoff of null");
        }
        return this.A0D;
    }

    public C696437z(C23651Hc r10, C18030ve r11, AnonymousClass1KX r12, C88214Yt r13, C58142kD r14, C58142kD r15, C24421Kg r16, C220218h r17, String str, String str2, String str3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        AnonymousClass1NV r1;
        this.A05 = r11;
        this.A0H = r16;
        this.A0G = r14;
        this.A0F = r15;
        this.A0B = str2;
        this.A09 = str;
        this.A04 = j;
        this.A0A = str3;
        this.A08 = r17;
        this.A0E = r10;
        this.A07 = r13;
        this.A06 = r12;
        this.A03 = i;
        int i3 = i2;
        this.A0C = i3;
        this.A0D = j2;
        if (i2 <= 0 || !z) {
            r1 = null;
        } else {
            r1 = new AnonymousClass1NV(new Random(), (long) i3, 3000, 1000);
        }
        this.A0I = r1;
        this.A0J = z2;
        A04(false);
    }

    public static C58142kD A00(String str, String str2, String str3, Collection collection, boolean z) {
        Set set;
        Set set2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C58142kD r2 = (C58142kD) it.next();
            String str4 = r2.A00;
            if (A05(r2.A04) && ((str4 == null || A05(str4)) && str.equals(r2.A08))) {
                if (z) {
                    set = r2.A0B;
                } else {
                    set = r2.A09;
                }
                if ((set == null || set.contains(str2)) && (str3 == null || ((set2 = r2.A0A) != null && set2.contains(str3)))) {
                    return r2;
                }
            }
        }
        return null;
    }

    public C191779nA BQ1() {
        return this.A01;
    }
}
