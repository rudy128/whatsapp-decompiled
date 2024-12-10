package X;

/* renamed from: X.64s  reason: invalid class name and case insensitive filesystem */
public final class C1187364s extends AnonymousClass6TO {
    public final C136626u7 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1187364s) && C18070vi.A18(this.A00, ((C1187364s) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1187364s(C136626u7 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadSuccess(uploadSuccessParams=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
