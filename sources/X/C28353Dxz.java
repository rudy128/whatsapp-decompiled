package X;

import java.util.Arrays;

/* renamed from: X.Dxz  reason: case insensitive filesystem */
public class C28353Dxz extends AnonymousClass1Bz implements E74 {
    public final byte[] A00;

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 22, z);
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

    public static String A02(C28322DxU dxU) {
        return AnonymousClass1Bo.A02(A03(dxU.A01).A00);
    }

    public static C28353Dxz A03(Object obj) {
        if (obj == null || (obj instanceof C28353Dxz)) {
            return (C28353Dxz) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C28353Dxz) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (Exception e) {
                throw AnonymousClass000.A0k(BEA.A0j(e, "encoding error in getInstance: ", AnonymousClass000.A10()));
            }
        } else {
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public int A0D() {
        return BE9.A0K(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28353Dxz)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28353Dxz) r3).A00);
    }

    public String toString() {
        return AnonymousClass1Bo.A02(this.A00);
    }

    public C28353Dxz(String str) {
        if (str != null) {
            this.A00 = AnonymousClass1Bo.A03(str);
            return;
        }
        throw AnonymousClass000.A0s("'string' cannot be null");
    }

    public C28353Dxz(byte[] bArr) {
        this.A00 = bArr;
    }
}
