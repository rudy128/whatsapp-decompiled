package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.33z  reason: invalid class name and case insensitive filesystem */
public final class C686033z implements C72443Lz {
    public final C25111Mx A00;
    public final C26031Qo A01;
    public final C18030ve A02;
    public final AnonymousClass1VD A03;

    public void BLq(C196049uN r9, C195829ty r10, A1O a1o) {
        byte[] bArr;
        C26031Qo r1;
        C80543xL r0;
        C18070vi.A0d(a1o, 0);
        C18030ve r3 = this.A02;
        C18040vf r12 = C18040vf.A02;
        if (C18020vd.A05(r12, r3, 10518) || (C18020vd.A05(r12, r3, 9920) && this.A03.A00.A02())) {
            C22941Dw r02 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(a1o.A06);
            if (A012 != null) {
                C58962lX A05 = this.A00.A05(A012);
                if (A05 != null) {
                    bArr = A05.A01;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    C29591cX r4 = new C29591cX("smax:any");
                    C29601cY.A02(bArr, 1, 120);
                    r4.A01 = bArr;
                    C29621ca A032 = r4.A03();
                    C29591cX r2 = new C29591cX("smax:any");
                    C29591cX r03 = new C29591cX("tctoken");
                    r03.A06(A032);
                    C29621ca A0K = C29591cX.A00(r03, r2).A0K("tctoken");
                    if (A0K == null) {
                        Log.e("PrivacyTokenMessageSendStanzaContributor/failed to generate stanza - missing tctoken node");
                        r1 = this.A01;
                        r0 = C80543xL.A04;
                    } else {
                        a1o.A0A.addAll(C18070vi.A0M(A0K));
                        return;
                    }
                } else if (C18020vd.A05(r12, r3, 9920) && this.A03.A00.A02()) {
                    C17900vP.A0X(A012, "PrivacyTokenMessageSendStanzaContributor/expected token, but missing for ", AnonymousClass000.A10());
                    r1 = this.A01;
                    r0 = C80543xL.A06;
                } else {
                    return;
                }
                r1.A00(r0, (String) null);
            }
        }
    }

    public C686033z(C25111Mx r1, C26031Qo r2, C18030ve r3, AnonymousClass1VD r4) {
        C18070vi.A0s(r3, r2, r1, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.PRIVACY_TOKEN;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
