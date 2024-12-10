package X;

/* renamed from: X.9sc  reason: invalid class name and case insensitive filesystem */
public final class C194989sc {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194989sc) {
                C194989sc r8 = (C194989sc) obj;
                if (!(this.A00 == r8.A00 && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A03, AnonymousClass0DV.A00(0, this.A00))) * 31) + this.A01;
    }

    public C194989sc(int i, long j, long j2, boolean z) {
        this.A00 = z;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "TransferProgressData(transferSessionID=");
        A10.append(", isSender=");
        A10.append(this.A00);
        A10.append(", transferredSize=");
        A10.append(this.A03);
        A10.append(", totalSizeExpected=");
        A10.append(this.A02);
        AnonymousClass000.A1G(A10, ", totalNumberOfExpectedFiles=");
        A10.append(", progress=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
