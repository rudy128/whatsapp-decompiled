package X;

/* renamed from: X.64q  reason: invalid class name and case insensitive filesystem */
public final class C1187164q extends AnonymousClass6TO {
    public final C136356tg A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1187164q) && C18070vi.A18(this.A00, ((C1187164q) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1187164q(C136356tg r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadFailed(uploadFailedParams=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
