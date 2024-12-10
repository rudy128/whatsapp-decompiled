package X;

import java.io.File;

/* renamed from: X.7Iw  reason: invalid class name and case insensitive filesystem */
public class C144837Iw implements C1607489t {
    public long A00 = 0;
    public final C18030ve A01;
    public final AnonymousClass11Z A02;
    public final File A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (X.C18020vd.A05(r1, r2, 1539) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.OutputStream CB0(X.AnonymousClass8BJ r6) {
        /*
            r5 = this;
            X.11Z r0 = r5.A02
            long r3 = r0.A01()
            X.AUZ r6 = (X.AUZ) r6
            java.net.HttpURLConnection r0 = r6.A01
            int r0 = r0.getContentLength()
            long r1 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            X.0ve r2 = r5.A01     // Catch:{ FileNotFoundException -> 0x0043 }
            X.0vf r1 = X.C18040vf.A01     // Catch:{ FileNotFoundException -> 0x0043 }
            r0 = 1917(0x77d, float:2.686E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x0043 }
            if (r0 != 0) goto L_0x0028
            r0 = 1539(0x603, float:2.157E-42)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x0043 }
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x0037
            r5.CR5()     // Catch:{ FileNotFoundException -> 0x0043 }
            java.io.File r1 = r5.A03     // Catch:{ FileNotFoundException -> 0x0043 }
            r0 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0043 }
            r2.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x0043 }
            return r2
        L_0x0037:
            java.io.File r1 = r5.A03     // Catch:{ FileNotFoundException -> 0x0043 }
            X.C64062u9.A0Q(r1)     // Catch:{ FileNotFoundException -> 0x0043 }
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0043 }
            r2.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x0043 }
            return r2
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "plainfiledownload/FileNotFoundException"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 9
            X.6Sh r0 = new X.6Sh
            r0.<init>(r1)
            throw r0
        L_0x0051:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "plainfiledownload/not enough space to store the file: "
            r1.append(r0)
            java.io.File r0 = r5.A03
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 4
            X.6Sh r0 = new X.6Sh
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144837Iw.CB0(X.8BJ):java.io.OutputStream");
    }

    public void CR5() {
        long length;
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A01;
        if (C18020vd.A05(r1, r2, 1917) || C18020vd.A05(r1, r2, 1539)) {
            length = this.A03.length();
        } else {
            length = 0;
        }
        this.A00 = length;
    }

    public C144837Iw(AnonymousClass11Z r3, C18030ve r4, File file) {
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = file;
    }

    public long BVb() {
        return this.A00;
    }
}
