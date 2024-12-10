package X;

import com.whatsapp.jid.Jid;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: X.2t2  reason: invalid class name and case insensitive filesystem */
public abstract class C63412t2 {
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass1E7 r2, java.util.Set r3, boolean r4) {
        /*
            X.1BI r1 = r2.A0J
            boolean r0 = X.C22971Dz.A0T(r1)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r1 = 1
        L_0x000f:
            return r1
        L_0x0010:
            X.1BI r0 = r2.A0J
            boolean r0 = X.C22971Dz.A0T(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000f
            X.2lf r0 = r2.A0H
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000e
            X.1BI r0 = r2.A0J
            if (r0 != 0) goto L_0x002c
            if (r4 != 0) goto L_0x000f
            goto L_0x000e
        L_0x002c:
            boolean r0 = A03(r0)
            if (r0 == 0) goto L_0x000f
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63412t2.A01(X.1E7, java.util.Set, boolean):boolean");
    }

    public static boolean A03(Jid jid) {
        if (jid == null || !jid.isProtocolCompliant() || C22971Dz.A0Z(jid)) {
            return true;
        }
        return false;
    }

    public static String A00(String str) {
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append('_');
        return AnonymousClass000.A0y(C17890vO.A0Q(), A11);
    }

    public static boolean A02(AnonymousClass1BI r4, MessageDigest messageDigest, List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.user);
        String A0y = AnonymousClass000.A0y("WA_ADD_NOTIF", A10);
        messageDigest.reset();
        messageDigest.update(A0y.getBytes());
        byte[] digest = messageDigest.digest();
        if (digest == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            if (digest.length >= bArr.length) {
                int i2 = 0;
                while (i2 < bArr.length) {
                    if (digest[i2] == bArr[i2]) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
