package X;

/* renamed from: X.7JZ  reason: invalid class name */
public final class AnonymousClass7JZ implements AnonymousClass85R {
    public final AnonymousClass21V A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7JZ) && C18070vi.A18(this.A00, ((AnonymousClass7JZ) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass7JZ(AnonymousClass21V r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageResult(message=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
