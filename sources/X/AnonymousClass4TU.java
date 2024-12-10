package X;

import java.util.List;

/* renamed from: X.4TU  reason: invalid class name */
public final class AnonymousClass4TU {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TU) {
                AnonymousClass4TU r8 = (AnonymousClass4TU) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public AnonymousClass4TU(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageReceiptsInfo(receiptsList=");
        A10.append(this.A01);
        A10.append(", minReceiptTime=");
        return C17900vP.A0E(A10, this.A00);
    }
}
