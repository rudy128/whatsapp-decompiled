package X;

/* renamed from: X.3s8  reason: invalid class name and case insensitive filesystem */
public final class C78083s8 extends AnonymousClass4LF {
    public final AnonymousClass206 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78083s8(AnonymousClass206 r2) {
        super(AnonymousClass00R.A0u);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78083s8) && C18070vi.A18(this.A00, ((C78083s8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommentDateDividerItem(comment=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
