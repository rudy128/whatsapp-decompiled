package X;

/* renamed from: X.0JD  reason: invalid class name */
public final class AnonymousClass0JD {
    public C17040te A00 = null;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0JD) && C18070vi.A18(this.A00, ((AnonymousClass0JD) obj).A00));
    }

    public int hashCode() {
        int i = 0;
        C17040te r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return 0 + i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "BorderCache(imageBitmap=");
        AnonymousClass000.A1G(A10, ", canvas=");
        AnonymousClass000.A1G(A10, ", canvasDrawScope=");
        A10.append(", borderPath=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
