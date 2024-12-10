package X;

/* renamed from: X.0Oa  reason: invalid class name and case insensitive filesystem */
public final class C04600Oa {
    public static final C04600Oa A01 = new C04600Oa(AnonymousClass1b6.A00());
    public final AnonymousClass3MT A00;

    public C04600Oa(AnonymousClass3MT r2, float f, int i) {
        this.A00 = r2;
        if (!(!Float.isNaN(0.0f))) {
            throw AnonymousClass000.A0k("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C04600Oa) && C18070vi.A18(this.A00, ((C04600Oa) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass000.A05(0.0f));
    }

    public final AnonymousClass3MT A00() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1H(A10, "ProgressBarRangeInfo(current=");
        A10.append(", range=");
        A10.append(this.A00);
        A10.append(", steps=");
        return AnonymousClass001.A1L(A10, 0);
    }

    public /* synthetic */ C04600Oa(AnonymousClass3MT r3) {
        this(r3, 0.0f, 0);
    }
}
