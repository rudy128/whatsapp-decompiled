package X;

/* renamed from: X.45L  reason: invalid class name */
public final class AnonymousClass45L extends C83364Ev {
    public final C89494cY A00;

    public AnonymousClass45L(C89494cY r2) {
        C18070vi.A0d(r2, 2);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass45L) && C18070vi.A18(this.A00, ((AnonymousClass45L) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, 1664167174);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Response(toastMessage=");
        A10.append(2131892794);
        A10.append(", appealData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
