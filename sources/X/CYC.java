package X;

import java.util.Arrays;

public final class CYC {
    public int A00;
    public final C28650ECj[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((CYC) obj).A01);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A01);
        this.A00 = hashCode;
        return hashCode;
    }

    public CYC(C28650ECj... eCjArr) {
        this.A01 = eCjArr;
    }
}
