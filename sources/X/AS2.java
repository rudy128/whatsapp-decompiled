package X;

import com.whatsapp.jid.UserJid;

public final class AS2 implements BC0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A5U A01;

    public void Bqn(String str) {
    }

    public void Bqo(UserJid userJid, String str, int i, boolean z, boolean z2) {
    }

    public AS2(A5U a5u, int i) {
        this.A01 = a5u;
        this.A00 = i;
    }

    public void BwS(boolean z, String str) {
        AnonymousClass8BR.A0V(this.A01.A04).A07(this.A00, "endpoint_public_key_valid", z);
    }
}
