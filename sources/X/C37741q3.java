package X;

/* renamed from: X.1q3  reason: invalid class name and case insensitive filesystem */
public final class C37741q3 implements AnonymousClass1GE {
    public C18090vk A00;
    public C18090vk A01;
    public final C37761q5 A02 = new C37761q5(this);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public C37741q3(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A04 = r2;
        this.A03 = r3;
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void BrH(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public void C6E() {
        if (((C38501rO) this.A04.get()).A07()) {
            ((AnonymousClass10T) this.A03.get()).registerObserver(this.A02);
        }
    }

    public void C71(AnonymousClass1F9 r3) {
        if (((C38501rO) this.A04.get()).A07()) {
            ((AnonymousClass10T) this.A03.get()).unregisterObserver(this.A02);
        }
    }
}
