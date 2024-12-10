package X;

/* renamed from: X.5WR  reason: invalid class name */
public abstract class AnonymousClass5WR extends C99664tG {
    public final C23421Fz A00;

    public Object A00(C30391dr r2, C108475bl r3) {
        return AnonymousClass3MX.A13(A02(r2, new C99514sw(r3)));
    }

    public Object A02(C30391dr r4, AnonymousClass1G2 r5) {
        if (this instanceof AnonymousClass5WQ) {
            return AnonymousClass3MX.A13(AnonymousClass1OW.A00(r4, new AnonymousClass57M((C30391dr) null, r5, (AnonymousClass5WQ) this)));
        }
        return AnonymousClass3MX.A13(this.A00.BFC(r4, r5));
    }

    public Object BFC(C30391dr r6, AnonymousClass1G2 r7) {
        Object BFC;
        if (this.A00 == -3) {
            C18560wh context = r6.getContext();
            C18560wh A002 = C30471e0.A00(context, this.A01);
            if (C18070vi.A18(A002, context)) {
                BFC = A02(r6, r7);
            } else {
                C23831Hu r0 = C18590wk.A00;
                if (C18070vi.A18(A002.get(r0), context.get(r0))) {
                    C18560wh context2 = r6.getContext();
                    if (!(r7 instanceof C99514sw) && !(r7 instanceof C99604tA)) {
                        r7 = new C99534sz(context2, r7);
                    }
                    AnonymousClass55S r3 = new AnonymousClass55S((C30391dr) null, this);
                    Object A003 = C30631eG.A00(C30631eG.A01(A002), A002);
                    try {
                        C99284sZ r1 = new C99284sZ(r6, A002);
                        C41681wt.A04(r3, 2);
                        BFC = r3.invoke(r7, r1);
                    } finally {
                        C30631eG.A02(A003, A002);
                    }
                }
            }
            return AnonymousClass3MX.A13(BFC);
        }
        BFC = super.BFC(r6, r7);
        return AnonymousClass3MX.A13(BFC);
    }

    public AnonymousClass5WR(C18560wh r1, C25691Pg r2, C23421Fz r3, int i) {
        super(r1, r2, i);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(" -> ");
        return AnonymousClass000.A0y(super.toString(), A10);
    }
}
