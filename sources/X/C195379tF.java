package X;

/* renamed from: X.9tF  reason: invalid class name and case insensitive filesystem */
public final class C195379tF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195379tF) {
                C195379tF r5 = (C195379tF) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.A01 * 31) + this.A00) * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31) + this.A04;
    }

    public C195379tF(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A05 = i5;
        this.A04 = i6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GlobalSERPLoggingData(contactCount=");
        A10.append(this.A01);
        A10.append(", chatCount=");
        A10.append(this.A00);
        A10.append(", invitableContactsCount=");
        A10.append(this.A03);
        A10.append(", groupsInCommonCount=");
        A10.append(this.A02);
        A10.append(", messageCount=");
        A10.append(this.A05);
        A10.append(", mediaPillCount=");
        return AnonymousClass001.A1L(A10, this.A04);
    }
}
