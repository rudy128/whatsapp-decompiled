package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.9f5  reason: invalid class name and case insensitive filesystem */
public class C186989f5 {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;

    public C186989f5(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        C18070vi.A0o(str, jid, str2);
        this.A03 = str;
        this.A00 = jid;
        this.A02 = str2;
        this.A01 = voipStanzaChildNode;
        if (!C22971Dz.A0P(jid)) {
            throw AnonymousClass8BX.A0V(jid, "CallStanza:Wrong jid type: ", AnonymousClass000.A10());
        }
    }
}
