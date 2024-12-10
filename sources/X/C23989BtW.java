package X;

/* renamed from: X.BtW  reason: case insensitive filesystem */
public final class C23989BtW extends DPJ {
    public final DPI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23989BtW) && C18070vi.A18(this.A00, ((C23989BtW) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23989BtW(DPI dpi) {
        this.A00 = dpi;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Scalar(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
