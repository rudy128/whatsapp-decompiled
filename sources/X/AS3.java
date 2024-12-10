package X;

import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public class AS3 implements BC0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AS3(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj;
    }

    public void BwS(boolean z, String str) {
        C194939sX r2;
        Object r0;
        if (this.A00 != 0) {
            C30391dr r22 = (C30391dr) this.A02;
            if (z) {
                r0 = new C172078sk(((FlowsWebViewDataRepository) this.A03).A06.A03(((Jid) this.A01).user));
            } else {
                r0 = new C172068sj(str);
            }
            r22.resumeWith(r0);
            return;
        }
        Number number = (Number) this.A02;
        if (number != null) {
            AnonymousClass8BR.A0V(((C188329hF) this.A03).A05).A07(number.intValue(), "endpoint_public_key_valid", z);
        }
        C30391dr r5 = (C30391dr) this.A01;
        if (z) {
            r2 = new C194939sX(2, (String) null, true, false);
        } else {
            r2 = new C194939sX(3, str, false, false);
        }
        r5.resumeWith(r2);
    }

    public void Bqn(String str) {
    }

    public void Bqo(UserJid userJid, String str, int i, boolean z, boolean z2) {
    }
}
