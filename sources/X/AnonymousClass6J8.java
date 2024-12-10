package X;

/* renamed from: X.6J8  reason: invalid class name */
public abstract class AnonymousClass6J8 extends AnonymousClass6JD {
    public AnonymousClass1E7 A00;
    public final C134956rQ A01;
    public final C63372sx A02;
    public final AnonymousClass206 A03;
    public final AnonymousClass206 A04;
    public final AnonymousClass206 A05;
    public final CharSequence A06;

    public final AnonymousClass206 A03() {
        C134956rQ r0;
        AnonymousClass206 r02;
        AnonymousClass206 r03;
        AnonymousClass206 r04;
        boolean z = this instanceof AnonymousClass6JC;
        if (z) {
            r0 = ((AnonymousClass6JC) this).A04;
        } else {
            r0 = this.A01;
        }
        if (r0 != null && (r04 = r0.A00) != null) {
            return r04;
        }
        if (z) {
            r02 = ((AnonymousClass6JC) this).A02;
        } else {
            r02 = ((AnonymousClass6JB) this).A03;
        }
        if (r02 != null) {
            return r02;
        }
        C63372sx A002 = A00();
        if (A002 != null && A002.A01() != 0) {
            r03 = A02();
        } else if (z) {
            r03 = ((AnonymousClass6JC) this).A01;
        } else {
            r03 = ((AnonymousClass6JB) this).A02;
        }
        if (r03 == null) {
            return A02();
        }
        return r03;
    }

    public C63372sx A00() {
        if (this instanceof AnonymousClass6JB) {
            return ((AnonymousClass6JB) this).A01;
        }
        return this.A02;
    }

    public AnonymousClass1E7 A01() {
        if (this instanceof AnonymousClass6JC) {
            return ((AnonymousClass6JC) this).A00;
        }
        return ((AnonymousClass6JB) this).A00;
    }

    public AnonymousClass206 A02() {
        if (this instanceof AnonymousClass6JC) {
            return ((AnonymousClass6JC) this).A03;
        }
        return ((AnonymousClass6JB) this).A04;
    }

    public AnonymousClass6J8(C63372sx r1, AnonymousClass1E7 r2, AnonymousClass206 r3, AnonymousClass206 r4, AnonymousClass206 r5, C134956rQ r6, CharSequence charSequence) {
        this.A02 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A06 = charSequence;
        this.A04 = r4;
        this.A01 = r6;
        this.A03 = r5;
    }
}
