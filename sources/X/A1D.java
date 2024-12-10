package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;

public final class A1D {
    public final C183799Zq A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final AnonymousClass00H A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;

    public static final byte[] A00(A1D a1d, String str) {
        a1d.A05.get();
        C191309mN A002 = C196639vO.A00(new JSONArray(str));
        if (A002 == null) {
            return null;
        }
        byte[] A022 = ((C22661Cs) a1d.A03.get()).A02(A002, C197569wu.A0Z);
        if (A022 == null) {
            Log.e("PushEncryptionHelper/getSavedPKey failed to parse");
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if ((r7 + 2592000000L) < X.AnonymousClass11P.A01(r9.A01)) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A01(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            X.0z4 r2 = r9.A02
            r0 = -1
            X.00H r3 = r2.A00
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r3)
            java.lang.String r6 = "push:push_pkey_generate_ts"
            long r7 = r2.getLong(r6, r0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0025
            r0 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r7 = r7 + r0
            X.11P r0 = r9.A01
            long r4 = X.AnonymousClass11P.A01(r0)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            java.lang.Boolean r5 = X.AnonymousClass000.A0i()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "PushEncryptionHelper/isKeyExpired yes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0031:
            r0 = 32
            byte[] r7 = X.C17970vW.A0I(r0)
            X.00H r0 = r9.A03
            java.lang.Object r1 = r0.get()
            X.1Cs r1 = (X.C22661Cs) r1
            java.lang.String r0 = X.C197569wu.A0Z
            X.9mN r0 = r1.A01(r0, r7)
            r1 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.String r4 = r0.A00()
            if (r4 == 0) goto L_0x006a
            X.11P r0 = r9.A01
            long r1 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass8BV.A06(r3)
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r4)
            X.C17880vN.A1D(r0, r6, r1)
            java.lang.String r1 = X.AnonymousClass8BT.A0x(r7)
        L_0x0065:
            android.util.Pair r0 = X.C108945cZ.A0N(r5, r1)
            return r0
        L_0x006a:
            java.lang.String r0 = "PushEncryptionHelper/makeNewSharedSecret generation failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0065
        L_0x0070:
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r3)
            java.lang.String r0 = "push:push_pkey_data"
            java.lang.String r0 = X.C17880vN.A0r(r1, r0)
            if (r0 != 0) goto L_0x0086
            r4 = 0
        L_0x007d:
            if (r4 == 0) goto L_0x0031
            if (r11 != 0) goto L_0x00bc
            r0 = 1
            if (r10 == 0) goto L_0x00b0
            r3 = 0
            goto L_0x008b
        L_0x0086:
            byte[] r4 = A00(r9, r0)
            goto L_0x007d
        L_0x008b:
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            r2 = 6
            byte[] r1 = new byte[r2]
            byte[] r0 = r0.digest(r4)
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            java.lang.String r0 = X.C108955ca.A14(r1)
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r0 = "PushEncryptionHelper/pKey hash mismatch with server"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00a8:
            r0 = r1 ^ 1
            goto L_0x00b0
        L_0x00ab:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x00bc
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            r0 = 0
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            return r0
        L_0x00bc:
            java.lang.String r1 = X.AnonymousClass8BT.A0x(r4)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1D.A01(java.lang.String, boolean):android.util.Pair");
    }

    public final boolean A02() {
        if (C18020vd.A00(C18040vf.A02, this.A04, 4116) > 0 || C17880vN.A0I(this.A00.A00).A0F()) {
            return true;
        }
        return false;
    }

    public A1D(C183799Zq r2, AnonymousClass11P r3, C19830z4 r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r5, r6, r4, r7);
        C18070vi.A0d(r2, 6);
        this.A01 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r4;
        this.A03 = r7;
        this.A00 = r2;
    }
}
