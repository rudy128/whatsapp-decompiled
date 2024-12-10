package X;

/* renamed from: X.3s9  reason: invalid class name and case insensitive filesystem */
public final class C78093s9 extends AnonymousClass4LF {
    public final AnonymousClass206 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78093s9) && C18070vi.A18(this.A00, ((C78093s9) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C78093s9(AnonymousClass206 r2) {
        super(AnonymousClass00R.A01);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommentItem(comment=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
