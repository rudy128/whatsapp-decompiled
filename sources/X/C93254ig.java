package X;

/* renamed from: X.4ig  reason: invalid class name and case insensitive filesystem */
public final class C93254ig implements C106705Ww {
    public final AnonymousClass4ZN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93254ig) && C18070vi.A18(this.A00, ((C93254ig) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C93254ig(AnonymousClass4ZN r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LoadingState(title=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
