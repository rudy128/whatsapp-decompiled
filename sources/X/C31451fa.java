package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1fa  reason: invalid class name and case insensitive filesystem */
public class C31451fa {
    public C21523AlW A00;
    public final C22701Cw A01;
    public final AnonymousClass00H A02;

    public void A00() {
        C22701Cw r3 = this.A01;
        SharedPreferences A05 = r3.A0A.A05("keystore");
        if (A05.getInt("remaining_auth_key_rotation_attempts", 0) > 0) {
            long A012 = AnonymousClass11P.A01(r3.A05);
            if (A012 - A05.getLong("last_succeeded_auth_key_rotation_attempt", -1) >= 86400000) {
                long j = A05.getLong("last_failed_auth_key_rotation_attempt", -1);
                if (j == -1 || A012 - j > 1800000) {
                    if (this.A00 == null) {
                        this.A00 = C21523AlW.A00();
                    }
                    AnonymousClass00H r4 = this.A02;
                    String A0B = ((AnonymousClass1OZ) r4.get()).A0B();
                    byte[] bArr = this.A00.A02.A01;
                    C29591cX r5 = new C29591cX("iq");
                    r5.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
                    r5.A04(new AnonymousClass1MD("xmlns", "w:auth:key"));
                    r5.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                    if (C29601cY.A04(A0B, 0, 9007199254740991L, false)) {
                        r5.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B));
                    }
                    C29591cX r2 = new C29591cX("key");
                    C29601cY.A02(bArr, 32, 32);
                    r2.A01 = bArr;
                    r5.A05(r2.A03());
                    ((AnonymousClass1OZ) r4.get()).A0N(new AnonymousClass37H(r3, this, this.A00), r5.A03(), A0B, 331, 32000);
                }
            }
        }
    }

    public C31451fa(C22701Cw r1, AnonymousClass00H r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
