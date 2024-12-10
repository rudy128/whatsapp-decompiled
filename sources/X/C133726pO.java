package X;

/* renamed from: X.6pO  reason: invalid class name and case insensitive filesystem */
public final class C133726pO {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final void A00(C1606789m r4, AnonymousClass705 r5, C122936Sm r6, Runnable runnable, int i) {
        C18070vi.A0f(r5, 2, r4);
        if (!(i == 400 || i == 405)) {
            if (!(i == 408 || i == 429)) {
                if (i != 481) {
                    if (i != 500) {
                        if (i != 503) {
                            return;
                        }
                    }
                } else if (r5.A04()) {
                    this.A00.CGN(new C146757Qm((Object) runnable, 16));
                    return;
                }
            }
            Long A012 = r5.A01();
            if (A012 != null) {
                this.A00.CGv(runnable, A012.longValue());
                return;
            }
        }
        r4.Bsw(r6);
    }

    public final void A01(C1606789m r10, AnonymousClass705 r11, C122936Sm r12, Runnable runnable, C18090vk r14, C22821Di r15) {
        C1606789m r4 = r10;
        AnonymousClass705 r5 = r11;
        C72473Md.A1I(r11, r10);
        C122936Sm r6 = r12;
        int A002 = C122936Sm.A00(r12);
        if (A002 == 401 || A002 == 409) {
            C108945cZ.A0f(this.A02).A05(new AnonymousClass7GV(r10, r12, r14, 1), C35021lW.A03, (AnonymousClass705) null, (String) null);
        } else if (A002 != 480) {
            A00(r4, r5, r6, runnable, A002);
        } else {
            C144217Gl r2 = new C144217Gl(r10, r15, 2);
            if (!r11.A04() || r11.A03()) {
                r2.Bsw(r12);
                return;
            }
            r11.A02();
            C35021lW r1 = C35021lW.A03;
            ((C35031lX) this.A01.get()).A03(r1);
            ((C35041lY) this.A03.get()).A01(r1, r2);
        }
    }

    public C133726pO(AnonymousClass10I r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
