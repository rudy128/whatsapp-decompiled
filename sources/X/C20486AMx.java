package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AMx  reason: case insensitive filesystem */
public class C20486AMx implements C36211nW, C22572BDn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20486AMx(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BvB() {
        A25 a25;
        A2N a2n;
        String str;
        UserJid userJid;
        String str2;
        String str3;
        AnonymousClass1PM r4;
        AnonymousClass00H r0;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) obj;
            a25 = (A25) phoenixFlowsManagerWithCoroutines.A0D.get();
            a2n = (A2N) this.A01;
            str = a2n.A05;
            userJid = a2n.A02;
            str2 = a2n.A08;
            str3 = a2n.A09;
            r4 = phoenixFlowsManagerWithCoroutines.A05;
            r0 = phoenixFlowsManagerWithCoroutines.A0O;
        } else {
            C20119A8c a8c = (C20119A8c) obj;
            a25 = (A25) a8c.A0F.get();
            a2n = (A2N) this.A01;
            str = a2n.A05;
            userJid = a2n.A02;
            str2 = a2n.A08;
            str3 = a2n.A09;
            r4 = a8c.A05;
            r0 = a8c.A0Q;
        }
        a25.A03(r4, (A0M) C18070vi.A0E(r0), userJid, Boolean.valueOf(a2n.A0C), "galaxy_message", str, str2, str3, "extensions-invalid-business-profile", "Invalid Business Profile");
    }

    public void BvD(AEW aew) {
        A25 a25;
        A2N a2n;
        String str;
        UserJid userJid;
        String str2;
        String str3;
        AnonymousClass1PM r4;
        AnonymousClass00H r0;
        if (this.A00 != 0) {
            if (aew == null || !aew.A0b) {
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.A02;
                a25 = (A25) phoenixFlowsManagerWithCoroutines.A0D.get();
                a2n = (A2N) this.A01;
                str = a2n.A05;
                userJid = a2n.A02;
                str2 = a2n.A08;
                str3 = a2n.A09;
                r4 = phoenixFlowsManagerWithCoroutines.A05;
                r0 = phoenixFlowsManagerWithCoroutines.A0O;
            } else {
                return;
            }
        } else if (aew == null || !aew.A0b) {
            C20119A8c a8c = (C20119A8c) this.A02;
            a25 = (A25) a8c.A0F.get();
            a2n = (A2N) this.A01;
            str = a2n.A05;
            userJid = a2n.A02;
            str2 = a2n.A08;
            str3 = a2n.A09;
            r4 = a8c.A05;
            r0 = a8c.A0Q;
        } else {
            return;
        }
        a25.A03(r4, (A0M) C18070vi.A0E(r0), userJid, Boolean.valueOf(a2n.A0C), "galaxy_message", str, str2, str3, "extensions-invalid-business-profile", "Invalid Business Profile");
    }

    public void BvC() {
    }
}
