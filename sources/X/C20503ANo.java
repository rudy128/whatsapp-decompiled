package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import javax.crypto.SecretKey;

/* renamed from: X.ANo  reason: case insensitive filesystem */
public final class C20503ANo implements BAN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C188249h7 A01;
    public final /* synthetic */ BC0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ SecretKey A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    public void Bv7(UserJid userJid, String str, String str2, String str3) {
        String str4;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        if (this.A05) {
            C20081A6h A0V = AnonymousClass8BR.A0V(this.A01.A01);
            boolean z = this.A06;
            int i = this.A00;
            if (z) {
                str4 = "fetch_key_network_1_end";
            } else {
                str4 = "fetch_key_network_end";
            }
            C20081A6h.A02(A0V, str4, i);
        }
        String str5 = str2;
        String str6 = str3;
        ((A5A) this.A01.A00.get()).A02(this.A02, userJid2, str5, str6, this.A03, this.A04, this.A07, this.A00, this.A06);
    }

    public C20503ANo(C188249h7 r1, BC0 bc0, String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = r1;
        this.A06 = z2;
        this.A00 = i;
        this.A02 = bc0;
        this.A03 = str;
        this.A04 = secretKey;
        this.A07 = bArr;
    }

    public void Bv6(UserJid userJid) {
        String str;
        A5A a5a = (A5A) this.A01.A00.get();
        BC0 bc0 = this.A02;
        boolean z = this.A05;
        boolean z2 = this.A06;
        int i = this.A00;
        Log.w("FlowsLogger/FlowsDataCryptoProcessor/loadGalaxyBizPublicKey()/onGetBusinessPublicKeyError()");
        if (z) {
            AnonymousClass00H r2 = a5a.A06;
            C20081A6h A0V = AnonymousClass8BR.A0V(r2);
            if (z2) {
                str = "fetch_key_network_1_end";
            } else {
                str = "fetch_key_network_end";
            }
            C20081A6h.A02(A0V, str, i);
            C172058si.A00(r2, i, z2).A0E(i, "extensions-public-key-error-response", (String) null);
        }
        bc0.Bqn("extensions-public-key-error-response");
        bc0.BwS(false, "extensions-public-key-error-response");
        a5a.A00.A0G("extensions-public-key-error-response", "", false);
    }
}
