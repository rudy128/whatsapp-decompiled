package X;

/* renamed from: X.8wS  reason: invalid class name and case insensitive filesystem */
public final class C174238wS extends C174358we {
    public final C22495BAc A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174238wS(C22495BAc bAc, String str) {
        super(50);
        C18070vi.A0d(bAc, 2);
        this.A01 = str;
        this.A00 = bAc;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174238wS) {
                C174238wS r5 = (C174238wS) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17900vP.A00(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocationPermissionRequestFooterViewData(categoryId=");
        A10.append(this.A01);
        A10.append(", locationRequestClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
