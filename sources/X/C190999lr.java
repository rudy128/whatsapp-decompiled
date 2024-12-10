package X;

import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.9lr  reason: invalid class name and case insensitive filesystem */
public final class C190999lr {
    public final AnonymousClass190 A00;
    public final AnonymousClass1P3 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final void A00(C186989f5 r12) {
        C18030ve r2;
        long A05;
        C18040vf r1;
        boolean A052;
        int i;
        C186989f5 r6 = r12;
        VoipStanzaChildNode voipStanzaChildNode = r12.A01;
        if (C18070vi.A18(voipStanzaChildNode.tag, "offer")) {
            r2 = this.A02;
            A05 = AnonymousClass8BR.A05(r2, 9257);
            if (A05 > 0) {
                r1 = C18040vf.A02;
                A052 = C18020vd.A05(r1, r2, 9258);
                i = 9256;
            }
            C17880vN.A0U(this.A03).A0F(AnonymousClass8BX.A0F(r12), r12.A03);
            return;
        }
        if (C18070vi.A18(voipStanzaChildNode.tag, "accept")) {
            r2 = this.A02;
            A05 = AnonymousClass8BR.A05(r2, 9431);
            if (A05 > 0) {
                r1 = C18040vf.A02;
                A052 = C18020vd.A05(r1, r2, 9433);
                i = 9432;
            }
        }
        C17880vN.A0U(this.A03).A0F(AnonymousClass8BX.A0F(r12), r12.A03);
        return;
        boolean A053 = C18020vd.A05(r1, r2, i);
        C17960vV.A0C(AnonymousClass000.A1R((A05 > 0 ? 1 : (A05 == 0 ? 0 : -1))));
        AnonymousClass1OZ A0U = C17880vN.A0U(this.A03);
        AnonymousClass1OZ.A02(AnonymousClass8BX.A0F(r12), A0U, new C21082AeC(this, r6, A05, A052, A053), r12.A03, A05, true);
    }

    public C190999lr(AnonymousClass190 r1, AnonymousClass1P3 r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0s(r3, r1, r4, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
