package X;

/* renamed from: X.0Vw  reason: invalid class name and case insensitive filesystem */
public final class C05830Vw implements C16300s2 {
    public AnonymousClass0D0 A00;
    public final C17290uQ A01;
    public final C17330uU A02;
    public final C17330uU A03;
    public final C17330uU A04 = AnonymousClass0Q9.A04(true);
    public final C17330uU A05;
    public final C17330uU A06;
    public final C17330uU A07;
    public final C17190uG A08;
    public final C16590sg A09;
    public final /* synthetic */ AnonymousClass0Q5 A0A;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.08Z, X.0W5, X.0uQ] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.0Ig, X.08c] */
    public C05830Vw(AnonymousClass0D0 r12, AnonymousClass0Q5 r13, C16590sg r14, Object obj) {
        this.A0A = r13;
        this.A09 = r14;
        Object obj2 = null;
        this.A06 = AnonymousClass0Q9.A02(obj);
        AnonymousClass08V A012 = AnonymousClass0Q9.A01(AnonymousClass0U0.A01((Object) null));
        this.A03 = A012;
        this.A02 = AnonymousClass0Q9.A01(new AnonymousClass0Ts((C16000rY) A012.getValue(), r12, r14, obj, this.A06.getValue()));
        ? r3 = new AnonymousClass0W5();
        ? r0 = new C03460Ig();
        r0.A00 = 0;
        r3.A00 = r0;
        this.A01 = r3;
        this.A05 = AnonymousClass0Q9.A04(false);
        this.A07 = AnonymousClass0Q9.A01(obj);
        this.A00 = r12;
        Number number = (Number) AnonymousClass0GP.A01.get(r14);
        if (number != null) {
            float floatValue = number.floatValue();
            AnonymousClass0D0 r1 = (AnonymousClass0D0) r14.BPS().invoke(obj);
            int A013 = r1.A01();
            for (int i = 0; i < A013; i++) {
                r1.A04(i, floatValue);
            }
            obj2 = this.A09.BPR().invoke(r1);
        }
        this.A08 = AnonymousClass0U0.A01(obj2);
    }

    private final void A00(Object obj, boolean z) {
        C16000rY r2;
        if (!z || (this.A03.getValue() instanceof AnonymousClass0U0)) {
            r2 = (C16000rY) this.A03.getValue();
        } else {
            r2 = this.A08;
        }
        this.A02.setValue(new AnonymousClass0Ts(r2, this.A00, this.A09, obj, this.A06.getValue()));
        AnonymousClass0Q5.A03(this.A0A);
    }

    public final void A01(long j) {
        C17330uU r2 = this.A02;
        this.A07.setValue(((AnonymousClass0Ts) r2.getValue()).BbD(j));
        this.A00 = ((AnonymousClass0Ts) r2.getValue()).BbM(j);
    }

    public final void A02(C17190uG r5, Object obj) {
        C17330uU r1 = this.A06;
        if (!C18070vi.A18(r1.getValue(), obj) || AnonymousClass001.A1b(this.A05)) {
            r1.setValue(obj);
            this.A03.setValue(r5);
            C17330uU r2 = this.A04;
            A00(this.A07.getValue(), !AnonymousClass001.A1b(r2));
            Boolean A0h = AnonymousClass000.A0h();
            r2.setValue(A0h);
            this.A01.CJN(this.A0A.A02.BUF());
            this.A05.setValue(A0h);
        }
    }

    public final void A03(C17190uG r3, Object obj, Object obj2) {
        this.A06.setValue(obj2);
        this.A03.setValue(r3);
        C17330uU r1 = this.A02;
        if (!C18070vi.A18(((AnonymousClass0Ts) r1.getValue()).A02, obj) || !C18070vi.A18(((AnonymousClass0Ts) r1.getValue()).A03, obj2)) {
            A00(obj, false);
        }
    }

    public Object getValue() {
        return this.A07.getValue();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("current value: ");
        A10.append(this.A07.getValue());
        A10.append(", target: ");
        A10.append(this.A06.getValue());
        A10.append(", spec: ");
        A10.append(this.A03.getValue());
        return A10.toString();
    }
}
