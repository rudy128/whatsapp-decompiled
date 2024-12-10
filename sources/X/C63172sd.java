package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.2sd  reason: invalid class name and case insensitive filesystem */
public final class C63172sd {
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public final AnonymousClass11S A00;
    public final AnonymousClass1W7 A01;
    public final AnonymousClass10I A02;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r1.A02 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (X.C22971Dz.A0a(r3) != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C134706r1 A00(X.C63172sd r4, X.AnonymousClass206 r5) {
        /*
            X.11S r2 = r4.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r2)
            X.205 r1 = r5.A0v
            X.1BI r3 = r1.A00
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x004d
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
        L_0x0016:
            if (r3 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x005d
            java.lang.String r2 = r1.A01
            byte[] r1 = r5.A1D
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "Rcat"
            byte[] r1 = X.C60612oK.A01(r3, r4, r0, r2, r1)
            if (r1 == 0) goto L_0x005d
            r0 = 10
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
        L_0x002e:
            boolean r0 = r5 instanceof X.AnonymousClass210
            r1 = 0
            if (r0 == 0) goto L_0x0041
            X.210 r5 = (X.AnonymousClass210) r5
            java.lang.String r0 = r5.A04
        L_0x0037:
            if (r2 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            X.6r1 r1 = new X.6r1
            r1.<init>(r2, r0)
        L_0x0040:
            return r1
        L_0x0041:
            r0 = r1
            goto L_0x0037
        L_0x0043:
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0058
        L_0x004d:
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r2)
            goto L_0x0016
        L_0x0052:
            boolean r0 = X.C22971Dz.A0a(r3)
            if (r0 == 0) goto L_0x005d
        L_0x0058:
            com.whatsapp.jid.UserJid r3 = r5.A0I()
            goto L_0x0016
        L_0x005d:
            r2 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63172sd.A00(X.2sd, X.206):X.6r1");
    }

    public byte[] A01(UserJid userJid, AnonymousClass210 r8, String str) {
        byte[] A012;
        if (str == null) {
            str = r8.A0P();
        }
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A00);
        if (!TextUtils.isEmpty(str) && AnonymousClass25A.A0t(r8) && A002 != null) {
            byte[] bytes = str.getBytes(A03);
            String str2 = r8.A0v.A01;
            byte[] bArr = r8.A1D;
            if (bArr == null) {
                A012 = null;
            } else {
                A012 = C60612oK.A01(A002, userJid, "Rcat", str2, bArr);
            }
            if (A012 != null) {
                try {
                    return Arrays.copyOf(AnonymousClass9QC.A00(bytes, A012), 8);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to calculate hmac-sha256", e);
                }
            }
        }
        return null;
    }

    public C63172sd(AnonymousClass11S r1, AnonymousClass1W7 r2, AnonymousClass10I r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
