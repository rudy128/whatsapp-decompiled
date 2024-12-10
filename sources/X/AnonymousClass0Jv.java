package X;

import java.util.List;

/* renamed from: X.0Jv  reason: invalid class name */
public final class AnonymousClass0Jv {
    public final String A00;
    public final String A01;
    public final List A02;

    public AnonymousClass0Jv(String str, String str2, List list) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Jv) {
                AnonymousClass0Jv r5 = (AnonymousClass0Jv) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A0N = AnonymousClass000.A0N(this.A02, this.A01.hashCode() * 31);
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return A0N + hashCode;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessApiSearchResult(usecase=");
        A10.append(this.A01);
        A10.append(", businesses=");
        A10.append(this.A02);
        A10.append(", pageId=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
