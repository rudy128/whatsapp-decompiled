package X;

import android.os.Handler;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.AeC  reason: case insensitive filesystem */
public final class C21082AeC implements C26971Uf {
    public final long A00;
    public final C186989f5 A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ C190999lr A04;

    public C21082AeC(C190999lr r1, C186989f5 r2, long j, boolean z, boolean z2) {
        this.A04 = r1;
        this.A01 = r2;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }

    public void BrC(Exception exc) {
        C36281nd r1;
        if (exc instanceof AnonymousClass9L1) {
            AnonymousClass9L1 r10 = (AnonymousClass9L1) exc;
            String str = r10.id;
            C186989f5 r5 = this.A01;
            String str2 = r5.A03;
            boolean A18 = C18070vi.A18(str, str2);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Delivery callback stanza id mismatch. Got ");
            A10.append(r10.id);
            A10.append(", expected ");
            A10.append(str2);
            C17960vV.A0G(A18, C17890vO.A0c(A10, '.'));
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Call stanza delivery timed out after ");
            A102.append(this.A00);
            A102.append(" ms: call id = ");
            String str3 = r5.A02;
            A102.append(str3);
            A102.append(", tag = ");
            VoipStanzaChildNode voipStanzaChildNode = r5.A01;
            A102.append(voipStanzaChildNode.tag);
            C17900vP.A0e(", stanza id = ", str2, A102);
            if (this.A03 && (r1 = C17880vN.A0U(this.A04.A03).A0I) != null) {
                AnonymousClass8BT.A17((Handler) r1, 10);
            }
            if (this.A02) {
                C17880vN.A0U(this.A04.A03).A0F(AnonymousClass8BX.A0F(r5), str2);
                return;
            }
            StringBuilder A103 = AnonymousClass000.A10();
            C17890vO.A10("Dropped call stanza when delivery times out: call id = ", str3, ", tag = ", A103);
            A103.append(voipStanzaChildNode.tag);
            C17900vP.A0g(", stanza id = ", str2, A103);
            return;
        }
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("Call stanza delivery failed: call id = ");
        C186989f5 r12 = this.A01;
        A104.append(r12.A02);
        A104.append(", tag = ");
        A104.append(r12.A01.tag);
        A104.append(", stanza id = ");
        C108985cd.A1M(r12.A03, A104, exc);
    }

    public /* bridge */ /* synthetic */ void BrF(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        String str2 = this.A01.A03;
        boolean equals = str.equals(str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Delivery callback stanza id mismatch. Got ");
        A10.append(str);
        A10.append(", expected ");
        A10.append(str2);
        C17960vV.A0G(equals, C17890vO.A0c(A10, '.'));
    }
}
