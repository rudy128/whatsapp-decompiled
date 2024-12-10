package X;

import android.net.Uri;
import java.util.Locale;

/* renamed from: X.4X8  reason: invalid class name */
public final class AnonymousClass4X8 {
    public static final int A00(String str) {
        String host;
        String host2;
        if (str == null) {
            return 0;
        }
        Uri parse = Uri.parse(C32011gU.A00(str));
        String[] strArr = C197569wu.A0g;
        C18070vi.A0Z(strArr);
        if (!(parse == null || (host2 = parse.getHost()) == null)) {
            Locale locale = Locale.ROOT;
            C18070vi.A0Z(locale);
            String lowerCase = host2.toLowerCase(locale);
            C18070vi.A0X(lowerCase);
            if (C200410p.A0U(lowerCase, strArr)) {
                return 1;
            }
        }
        String[] strArr2 = C197569wu.A0h;
        C18070vi.A0Z(strArr2);
        if (parse == null || (host = parse.getHost()) == null) {
            return 0;
        }
        Locale locale2 = Locale.ROOT;
        C18070vi.A0Z(locale2);
        String lowerCase2 = host.toLowerCase(locale2);
        C18070vi.A0X(lowerCase2);
        return C200410p.A0U(lowerCase2, strArr2) ? 2 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (X.C24211Jh.A01(r14, "com.instagram.android") != -1) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        if (r9.length() != 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ec, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r15, 2060) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0105, code lost:
        if (X.C24211Jh.A01(r14, "com.instagram.android") == -1) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C87754Wv A01(android.content.Context r14, X.C18030ve r15, X.C32011gU r16, X.AnonymousClass206 r17) {
        /*
            r13 = this;
            r5 = r16
            boolean r6 = X.C18070vi.A15(r15, r5)
            r0 = 2
            r4 = r17
            X.AnonymousClass3Ma.A1O(r4, r0, r14)
            X.Abv r2 = X.C60532oB.A00(r4)
            if (r2 == 0) goto L_0x0074
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0074
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L_0x0065
            java.lang.String r9 = r2.A08
            r0 = r9
            if (r9 != 0) goto L_0x0022
            java.lang.String r0 = ""
        L_0x0022:
            int r10 = X.C63712tZ.A01(r0)
            java.lang.String r8 = r2.A0E
            if (r10 == 0) goto L_0x0041
            r0 = 4
            if (r10 != r0) goto L_0x004a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x0041
            r0 = 22
            if (r1 == r0) goto L_0x0041
            r1 = 3522(0xdc2, float:4.935E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x004a
        L_0x0041:
            r12 = 0
        L_0x0042:
            X.4Wv r3 = new X.4Wv
            r7 = r3
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            return r3
        L_0x004a:
            r12 = 1
            r0 = 3
            if (r10 != r0) goto L_0x0042
            r1 = 11439(0x2caf, float:1.603E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "com.instagram.android"
            long r3 = X.C24211Jh.A01(r14, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            goto L_0x0041
        L_0x0065:
            java.lang.String r4 = r2.A0E
            java.lang.String r5 = r2.A0F
            int r7 = A00(r4)
            X.4Wv r3 = new X.4Wv
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x0074:
            boolean r0 = r4 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x010a
            r3 = r4
            X.210 r3 = (X.AnonymousClass210) r3
            java.lang.String r0 = r3.A06
            java.lang.String r1 = r3.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0108
        L_0x008b:
            java.lang.String r0 = r4.A0P()
            java.lang.String r8 = r5.A02(r0)
            if (r8 == 0) goto L_0x0108
            java.lang.String r9 = r3.A07
            if (r9 == 0) goto L_0x009f
            int r0 = r9.length()
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r9 = r8
        L_0x00a0:
            r10 = 0
            if (r8 == 0) goto L_0x00d6
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00d6
            r0 = r9
            if (r9 != 0) goto L_0x00ae
            java.lang.String r0 = ""
        L_0x00ae:
            int r2 = X.C63712tZ.A01(r0)
            byte[] r0 = r3.A1A()
            if (r0 == 0) goto L_0x00b9
            r10 = 1
        L_0x00b9:
            int r3 = r3.A01
            r4 = r10
            r10 = r2
            if (r2 == 0) goto L_0x00d6
            r0 = 4
            if (r2 != r0) goto L_0x00df
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x00d6
            r0 = 22
            if (r1 == r0) goto L_0x00d6
            r1 = 3522(0xdc2, float:4.935E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x00df
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            X.4Wv r3 = new X.4Wv
            r7 = r3
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            return r3
        L_0x00df:
            r12 = 1
            if (r3 != r12) goto L_0x00d6
            if (r4 != 0) goto L_0x00ee
            r1 = 2060(0x80c, float:2.887E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x00d6
        L_0x00ee:
            r0 = 3
            if (r2 != r0) goto L_0x00d7
            r1 = 11439(0x2caf, float:1.603E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "com.instagram.android"
            long r3 = X.C24211Jh.A01(r14, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            goto L_0x00d6
        L_0x0108:
            r8 = 0
            goto L_0x009f
        L_0x010a:
            r4 = 0
            X.4Wv r3 = new X.4Wv
            r7 = r6
            r5 = r4
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X8.A01(android.content.Context, X.0ve, X.1gU, X.206):X.4Wv");
    }
}
