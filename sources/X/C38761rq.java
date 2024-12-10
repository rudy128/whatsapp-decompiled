package X;

/* renamed from: X.1rq  reason: invalid class name and case insensitive filesystem */
public final class C38761rq {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 11));
    public final C18100vl A02 = new C18110vm(new C71023Dm(this, 16));
    public final C18100vl A03 = new C18110vm(new C71023Dm(this, 12));
    public final C18100vl A04 = new C18110vm(new C71023Dm(this, 14));
    public final C18100vl A05 = new C18110vm(new C71023Dm(this, 15));
    public final C18100vl A06 = new C18110vm(new C71023Dm(this, 13));

    public C38761rq(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final AnonymousClass1H7 A01(AnonymousClass6RD r2) {
        C18100vl r0;
        C18070vi.A0d(r2, 0);
        switch (r2.ordinal()) {
            case 0:
            case 6:
                r0 = this.A03;
                break;
            case 1:
                r0 = this.A01;
                break;
            case 2:
            case 7:
                r0 = this.A06;
                break;
            case 3:
                r0 = this.A04;
                break;
            case 4:
                r0 = this.A05;
                break;
            case 5:
                r0 = this.A02;
                break;
            default:
                throw new AnonymousClass3EW();
        }
        return (AnonymousClass1H7) r0.getValue();
    }

    public final boolean A05(AnonymousClass6RD r4) {
        C18100vl r0;
        C18070vi.A0d(r4, 0);
        switch (r4.ordinal()) {
            case 0:
            case 6:
                return A02();
            case 1:
            case 7:
                r0 = this.A01;
                break;
            case 2:
                return A03();
            case 3:
                r0 = this.A04;
                break;
            case 4:
                r0 = this.A05;
                break;
            case 5:
                r0 = this.A02;
                break;
            default:
                throw new AnonymousClass3EW();
        }
        if (((AnonymousClass1H7) r0.getValue()).A01() == C38781rs.A02) {
            return true;
        }
        return false;
    }

    public static final void A00(AnonymousClass1H7 r2, boolean z) {
        C38781rs r1;
        if (z) {
            r1 = C38781rs.A02;
        } else {
            r1 = C38781rs.A03;
        }
        r2.A04(r1, true);
    }

    public final boolean A02() {
        if (((AnonymousClass1H7) this.A03.getValue()).A01() == C38781rs.A02) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (((AnonymousClass1H7) this.A06.getValue()).A01() == C38781rs.A02) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        Object A012 = ((AnonymousClass1H7) this.A01.getValue()).A01();
        C38781rs r2 = C38781rs.A02;
        if (A012 == r2 || A02() || A03() || ((AnonymousClass1H7) this.A05.getValue()).A01() == r2 || ((AnonymousClass1H7) this.A02.getValue()).A01() == r2) {
            return true;
        }
        return false;
    }
}
