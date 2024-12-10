package X;

/* renamed from: X.9qq  reason: invalid class name and case insensitive filesystem */
public final class C193899qq {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193899qq) {
                C193899qq r5 = (C193899qq) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + C17900vP.A00(this.A01);
    }

    public C193899qq(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessApiResultsPage(pageSize=");
        A10.append(this.A00);
        A10.append(", pageId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
