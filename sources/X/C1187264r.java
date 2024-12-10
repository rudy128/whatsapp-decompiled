package X;

/* renamed from: X.64r  reason: invalid class name and case insensitive filesystem */
public final class C1187264r extends AnonymousClass6TO {
    public final C135226rr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1187264r) && C18070vi.A18(this.A00, ((C1187264r) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1187264r(C135226rr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadProgress(uploadProgressParams=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
