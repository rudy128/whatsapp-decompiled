package X;

/* renamed from: X.3yD  reason: invalid class name and case insensitive filesystem */
public final class C80863yD extends C84914Li {
    public final C445823z A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80863yD(C445823z r2) {
        super(AnonymousClass00R.A0Y);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C80863yD) && C18070vi.A18(this.A00, ((C80863yD) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventAdditionalInfo(message=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
