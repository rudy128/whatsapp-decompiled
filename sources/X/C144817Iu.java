package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.7Iu  reason: invalid class name and case insensitive filesystem */
public final class C144817Iu implements C1607389s {
    public final C147067Rr A00;
    public final C144847Ix A01;

    public C144817Iu(AnonymousClass181 r12, AnonymousClass11P r13, C24371Kb r14, C129736iH r15, AnonymousClass70W r16, AnonymousClass87M r17, C24421Kg r18) {
        AnonymousClass70W r6 = r16;
        C18070vi.A0d(r6, 7);
        C144847Ix r2 = new C144847Ix(r15.A00, r15.A01, r15.A03, r15.A04);
        this.A01 = r2;
        this.A00 = new C147067Rr(r12, r13, r14, r6, new C129086hE(r2, r15.A02, (String) null, false), r17, r18, (C58092k8) null);
    }

    public void BEQ() {
        this.A00.BEQ();
    }

    public C126026c4 BJE() {
        String A0y;
        C126026c4 BJE = this.A00.BJE();
        C1409173o r2 = BJE.A00;
        if (r2.A03()) {
            C144847Ix r0 = this.A01;
            String str = r0.A00;
            MessageDigest messageDigest = r0.A01;
            if (messageDigest == null) {
                A0y = AnonymousClass001.A1H("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str, AnonymousClass000.A10());
            } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
                A10.append(str);
                A10.append("; calculatedHash=");
                A0y = AnonymousClass000.A0y(C108955ca.A14(messageDigest.digest()), A10);
            }
            Log.w(A0y);
            Log.e("encrypteddownloadtransfer/download/hash verification fail");
            return new C126026c4(new C1409173o(7, r2.A03, r2.A05));
        }
        return BJE;
    }

    public void cancel() {
        this.A00.cancel();
    }
}
