package X;

import java.util.List;

/* renamed from: X.9lM  reason: invalid class name and case insensitive filesystem */
public final class C190689lM {
    public final BCI A00;
    public final AnonymousClass1OZ A01;
    public final C30931ek A02;

    public C190689lM(AnonymousClass1OZ r2, C30931ek r3, BCI bci) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = bci;
    }

    public final void A00(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        String str6 = str2;
        String str7 = str3;
        int A0G = C72453Mb.A0G(str6, str7, 1);
        C178709Ed[] r2 = new C178709Ed[3];
        r2[0] = new C178709Ed("pix_key_type", str);
        r2[1] = new C178709Ed("pix_display_name", str7);
        List A0O = C18070vi.A0O(new C178709Ed("pix_key", str6), r2, A0G);
        AnonymousClass1OZ r7 = this.A01;
        String A0B = r7.A0B();
        C178759Ei r1 = new C178759Ei(A0O, 1);
        String str8 = str4;
        String str9 = null;
        if (C18070vi.A18(str8, "p2p_context")) {
            str5 = "p2p";
        } else if (C18070vi.A18(str8, "p2m_context")) {
            str5 = "p2m";
        } else {
            str5 = null;
        }
        String A012 = this.A02.A01();
        C178759Ei r22 = new C178759Ei(r1);
        if (z) {
            str9 = "true";
        }
        C18070vi.A0b(A012);
        AnonymousClass9F1 r12 = new AnonymousClass9F1(r22, A0B, A012, str9, str5);
        r7.A0N(new C20996Aco(this, r12, 13), r12.A00, A0B, 204, 32000);
    }
}
