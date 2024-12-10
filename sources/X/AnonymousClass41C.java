package X;

/* renamed from: X.41C  reason: invalid class name */
public final class AnonymousClass41C extends C83164Eb {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41C) {
                AnonymousClass41C r5 = (AnonymousClass41C) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass41C(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkExistingSubgroupsPartialSuccessResult(totalCount=");
        A10.append(this.A01);
        A10.append(", successCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
