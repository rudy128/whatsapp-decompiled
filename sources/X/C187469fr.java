package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.9fr  reason: invalid class name and case insensitive filesystem */
public final class C187469fr {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final String A03;
    public final VoipStanzaChildNode[] A04;

    public C187469fr(Jid jid, String str, String str2, VoipStanzaChildNode[] voipStanzaChildNodeArr, int i) {
        C18070vi.A0o(str, jid, str2);
        this.A02 = str;
        this.A01 = jid;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = voipStanzaChildNodeArr;
        if (!C22971Dz.A0P(jid)) {
            throw AnonymousClass8BX.A0V(jid, "CallIncomingAck:Wrong jid type: ", AnonymousClass000.A10());
        }
    }
}
