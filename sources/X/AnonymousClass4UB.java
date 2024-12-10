package X;

/* renamed from: X.4UB  reason: invalid class name */
public final class AnonymousClass4UB {
    public final int A00;
    public final long A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UB) {
                AnonymousClass4UB r8 = (AnonymousClass4UB) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((AnonymousClass000.A0I(this.A01) * 31) + this.A00) * 31, this.A02);
    }

    public AnonymousClass4UB(int i, long j, boolean z) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PreloadedMessageMetadata(rowId=");
        A10.append(this.A01);
        A10.append(", messageType=");
        A10.append(this.A00);
        A10.append(", fromMe=");
        return C17900vP.A0F(A10, this.A02);
    }
}
