package X;

import java.util.List;

/* renamed from: X.8R1  reason: invalid class name */
public final class AnonymousClass8R1 extends C180979Or {
    public final List A00;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C180979Or) {
            return this.A00.equals(((AnonymousClass8R1) ((C180979Or) obj)).A00);
        }
        return false;
    }

    public AnonymousClass8R1(List list) {
        this.A00 = list;
    }

    public int hashCode() {
        return 1000003 ^ this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BatchedLogRequest{logRequests=");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
