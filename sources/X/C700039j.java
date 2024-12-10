package X;

import java.util.List;

/* renamed from: X.39j  reason: invalid class name and case insensitive filesystem */
public final class C700039j implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public void CCZ(AnonymousClass206 r2, C49702Rn r3) {
        C18070vi.A0d(r2, 0);
        A00(r2, r3);
    }

    public final void A00(AnonymousClass206 r5, C49702Rn r6) {
        C20955Ac9 ac9;
        List list;
        if (C18020vd.A05(C18040vf.A01, ((AnonymousClass1UD) this.A07.get()).A00, 6358)) {
            AnonymousClass205 r1 = r5.A0v;
            if (r1.A02) {
                return;
            }
            if ((C42701yb.A01(r1.A00) || r5.A0x()) && (ac9 = (C20955Ac9) C18070vi.A09(r5, C20955Ac9.class).A02) != null && (list = ac9.A03) != null) {
                ((AnonymousClass10I) this.A06.get()).CGS(new C21434Ak1(this, r5, list, 6), "BotMessagePromptsProcessor.STORE_PROMPTS_WORKER_TOKEN");
                if (r6 != null) {
                    throw C17900vP.A07(C700039j.class);
                }
            }
        }
    }

    public C700039j(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A07 = r1;
        this.A01 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r7;
        this.A02 = r8;
    }
}
