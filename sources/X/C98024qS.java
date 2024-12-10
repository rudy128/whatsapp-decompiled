package X;

/* renamed from: X.4qS  reason: invalid class name and case insensitive filesystem */
public class C98024qS implements AnonymousClass3M1 {
    public final /* synthetic */ AnonymousClass3TA A00;

    public C98024qS(AnonymousClass3TA r1) {
        this.A00 = r1;
    }

    public long BaQ() {
        return (long) C18020vd.A00(C18040vf.A02, this.A00.A0e, 11888);
    }

    public void ByS(AnonymousClass206 r5) {
        AnonymousClass3TA r3 = this.A00;
        String str = r3.A0A;
        AnonymousClass4O2 r1 = r3.A02;
        if (!(r1 == null || str == null || !str.equals(r1.A02))) {
            r1.A00 = r5;
        }
        AnonymousClass4O2 r12 = r3.A01;
        if (r12 != null && str != null && str.equals(r12.A02)) {
            r12.A00 = r5;
        }
    }

    public void ByT(AnonymousClass206 r6) {
        AnonymousClass3TA r4 = this.A00;
        AnonymousClass4O2 r0 = r4.A02;
        if (r0 != null && r0.A00 == r6) {
            AnonymousClass3TA.A07(r4, (C693536w) null, true, false);
        }
        AnonymousClass4O2 r02 = r4.A01;
        if (r02 != null && r02.A00 == r6) {
            AnonymousClass3TA.A06(r4, (C693536w) null, true, false);
        }
    }

    public boolean CLo() {
        AnonymousClass3TA r2 = this.A00;
        C693536w r0 = r2.A05;
        if (r0 != null && !r0.A02() && r2.A07 == AnonymousClass00R.A0C) {
            return true;
        }
        C693536w r02 = r2.A04;
        if (r02 == null || r02.A02() || r2.A06 != AnonymousClass00R.A0C) {
            return false;
        }
        return true;
    }
}
