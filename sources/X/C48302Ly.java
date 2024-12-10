package X;

/* renamed from: X.2Ly  reason: invalid class name and case insensitive filesystem */
public final class C48302Ly extends C692336k {
    public int A00;
    public Long A01;
    public Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48302Ly) {
                C48302Ly r5 = (C48302Ly) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParentMessage(replyCount=");
        A10.append(this.A00);
        A10.append(", lastCommentMessageRowId=");
        A10.append(this.A01);
        A10.append(", lastCommentMessageTs=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
