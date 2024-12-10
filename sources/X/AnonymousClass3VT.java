package X;

/* renamed from: X.3VT  reason: invalid class name */
public class AnonymousClass3VT extends AnonymousClass1J2 implements AnonymousClass1GC, C108105b8 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final C95424mD A02;
    public final C35681md A03;
    public final C175308yV A04;

    public final void A0T(C29681ch r2, Integer num) {
        C18070vi.A0d(r2, 0);
        this.A03.A0E(r2, num);
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r3, 1);
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            this.A04.registerObserver(this);
        } else if (ordinal == 3) {
            this.A04.unregisterObserver(this);
        }
    }

    public void Bkr(C29681ch r9, Integer num, Throwable th) {
        int i;
        int i2;
        C21598Amm amm;
        C29681ch r3 = r9;
        if (this.A02.A02(r9) != null) {
            boolean z = th instanceof C175068xw;
            boolean z2 = !z;
            boolean z3 = th instanceof C175058xv;
            Integer num2 = num;
            if (th instanceof C175048xu) {
                i = 2131888272;
                i2 = 2131888732;
            } else {
                if (!z || (amm = (C21598Amm) th) == null || amm.code != 419) {
                    switch (num.intValue()) {
                        case 0:
                            i = 2131892365;
                            break;
                        case 1:
                            i = 2131897327;
                            break;
                        case 2:
                            i = 2131890490;
                            break;
                        case 3:
                            i = 2131897306;
                            break;
                        case 4:
                            i = 2131897769;
                            break;
                        default:
                            i = 2131897366;
                            break;
                    }
                } else {
                    i = 2131890496;
                }
                i2 = i;
                if (z3) {
                    i2 = 2131894630;
                }
            }
            this.A01.A0E(new C88034Yb(r3, num2, Integer.valueOf(i), i2, z2));
        }
    }

    public void Bkv(C29681ch r3, Integer num) {
        this.A00.A0E(new C86954Ts(r3, num));
        if (num == AnonymousClass00R.A0N) {
            this.A03.A06(r3);
        }
    }

    public AnonymousClass3VT(C175308yV r2, C95424mD r3, C35681md r4) {
        C18070vi.A0o(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r2;
    }
}
