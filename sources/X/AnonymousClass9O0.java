package X;

/* renamed from: X.9O0  reason: invalid class name */
public final class AnonymousClass9O0 {
    public Integer A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9O0) {
                AnonymousClass9O0 r5 = (AnonymousClass9O0) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A03 = C17880vN.A03(this.A01);
        Integer num = this.A00;
        return A03 + C72453Mb.A0E(num, C196349ut.A00(num));
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IdAndState(id=");
        A10.append(this.A01);
        A10.append(", state=");
        Integer num = this.A00;
        if (num != null) {
            str = C196349ut.A00(num);
        } else {
            str = "null";
        }
        return C17900vP.A0B(str, A10);
    }
}
