package X;

import java.util.Arrays;

/* renamed from: X.Dxq  reason: case insensitive filesystem */
public class C28344Dxq extends AnonymousClass1Bz implements E74 {
    public final byte[] A00;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 25, z);
    }

    public boolean A0H() {
        return false;
    }

    public String BZl() {
        return AnonymousClass1Bo.A02(this.A00);
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public int A0D() {
        return BE9.A0K(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28344Dxq)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28344Dxq) r3).A00);
    }

    public C28344Dxq(byte[] bArr) {
        this.A00 = AnonymousClass1C2.A02(bArr);
    }
}
