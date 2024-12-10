package X;

/* renamed from: X.3xR  reason: invalid class name and case insensitive filesystem */
public final class C80583xR extends C86334Rf {
    public final C89294cE A00;
    public final C106835Xj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80583xR(C89294cE r2, C106835Xj r3) {
        super(2);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80583xR) {
                C80583xR r5 = (C80583xR) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QuestionItem(icebreaker=");
        A10.append(this.A00);
        A10.append(", clickListener=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
