package X;

/* renamed from: X.4Uc  reason: invalid class name and case insensitive filesystem */
public final class C87054Uc {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87054Uc) {
                C87054Uc r8 = (C87054Uc) obj;
                if (!(this.A02 == r8.A02 && this.A03 == r8.A03 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A03, AnonymousClass000.A0I(this.A02) * 31)));
    }

    public C87054Uc(long j, long j2, long j3, long j4) {
        this.A02 = j;
        this.A03 = j2;
        this.A00 = j3;
        this.A01 = j4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScrollToMessage(rowId=");
        A10.append(this.A02);
        A10.append(", sortId=");
        A10.append(this.A03);
        A10.append(", parentRowId=");
        A10.append(this.A00);
        A10.append(", parentSortId=");
        return C17900vP.A0E(A10, this.A01);
    }
}
