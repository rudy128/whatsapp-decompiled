package X;

/* renamed from: X.0K2  reason: invalid class name */
public final class AnonymousClass0K2 {
    public final long A00;
    public final AnonymousClass0CM A01;
    public final Integer A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0K2) {
                AnonymousClass0K2 r9 = (AnonymousClass0K2) obj;
                if (this.A01 == r9.A01) {
                    long j = this.A00;
                    long j2 = r9.A00;
                    long j3 = AnonymousClass0QY.A03;
                    if (!(j == j2 && this.A02 == r9.A02 && this.A03 == r9.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0L = AnonymousClass000.A0L(this.A01);
        long j = this.A00;
        long j2 = AnonymousClass0QY.A03;
        int A0K = AnonymousClass001.A0K(j, A0L);
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        int hashCode = (A0K + str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    public AnonymousClass0K2(AnonymousClass0CM r1, Integer num, long j, boolean z) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectionHandleInfo(handle=");
        A10.append(this.A01);
        A10.append(", position=");
        A10.append(AnonymousClass0QY.A06(this.A00));
        A10.append(", anchor=");
        switch (this.A02.intValue()) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        A10.append(str);
        A10.append(", visible=");
        A10.append(this.A03);
        return AnonymousClass001.A1J(A10);
    }
}
