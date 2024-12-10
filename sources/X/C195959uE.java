package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.9uE  reason: invalid class name and case insensitive filesystem */
public final class C195959uE {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195959uE)) {
            return false;
        }
        C195959uE r4 = (C195959uE) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00 && C18070vi.A18(this.A02, r4.A02);
    }

    public int hashCode() {
        Integer[] numArr = new Integer[3];
        AnonymousClass000.A1L(numArr, this.A01);
        AnonymousClass000.A1M(numArr, this.A00);
        AnonymousClass3Ma.A1S(numArr, this.A02.hashCode());
        return Arrays.hashCode(numArr);
    }

    public final C165148af A00() {
        C23624Bmt A0N = C165148af.DEFAULT_INSTANCE.A0N();
        int i = this.A01;
        C165148af r1 = (C165148af) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.rawId_ = i;
        int i2 = this.A00;
        C165148af r12 = (C165148af) C17880vN.A0G(A0N);
        r12.bitField0_ |= 2;
        r12.currentIndex_ = i2;
        Set set = this.A02;
        C165148af r2 = (C165148af) C17880vN.A0G(A0N);
        C28667EDj eDj = r2.deviceIndexes_;
        boolean z = ((C27296DbR) eDj).A00;
        Bm7 bm7 = eDj;
        if (!z) {
            Bm7 A08 = C23577Bm6.A08(eDj);
            r2.deviceIndexes_ = A08;
            bm7 = A08;
        }
        DND.A09(set, bm7);
        return (C165148af) A0N.A0C();
    }

    public C195959uE(Set set, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdKeyFingerprint{ rawId=");
        A10.append(this.A01);
        A10.append(", currentIndex=");
        A10.append(this.A00);
        A10.append(", deviceIndexes=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
