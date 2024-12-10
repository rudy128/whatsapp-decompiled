package X;

import java.util.List;

/* renamed from: X.8lC  reason: invalid class name */
public final class AnonymousClass8lC extends AnonymousClass9M6 {
    public final int A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8lC) {
                AnonymousClass8lC r5 = (AnonymousClass8lC) obj;
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

    public AnonymousClass8lC(List list, List list2, int i) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(statusCode=");
        A10.append(this.A00);
        A10.append(", errorCode=");
        A10.append(this.A01);
        A10.append(", errorMessage=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
