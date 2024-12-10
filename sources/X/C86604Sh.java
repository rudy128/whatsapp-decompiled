package X;

/* renamed from: X.4Sh  reason: invalid class name and case insensitive filesystem */
public final class C86604Sh {
    public final AnonymousClass4ZN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86604Sh) && C18070vi.A18(this.A00, ((C86604Sh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C86604Sh(AnonymousClass4ZN r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserMessage(message=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
