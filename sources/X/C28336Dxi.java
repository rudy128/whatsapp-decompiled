package X;

import java.io.IOException;

/* renamed from: X.Dxi  reason: case insensitive filesystem */
public class C28336Dxi extends AnonymousClass1Bz {
    public static final C28336Dxi A01 = new C28336Dxi((byte) 0);
    public static final C28336Dxi A02 = new C28336Dxi((byte) -1);
    public final byte A00;

    public int A0D() {
        return 3;
    }

    public boolean A0H() {
        return false;
    }

    public static C28336Dxi A02(Object obj) {
        if (obj == null || (obj instanceof C28336Dxi)) {
            return (C28336Dxi) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C28336Dxi) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("failed to construct boolean from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public AnonymousClass1Bz A0E() {
        if (this.A00 != 0) {
            return A02;
        }
        return A01;
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        byte b = this.A00;
        if (z) {
            C26039Cr0.A01(cr0, 1);
        }
        C26039Cr0.A01(cr0, 1);
        C26039Cr0.A01(cr0, b);
    }

    public boolean A0I(AnonymousClass1Bz r4) {
        if (!(r4 instanceof C28336Dxi) || AnonymousClass000.A1O(this.A00) != AnonymousClass000.A1O(((C28336Dxi) r4).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A1O(this.A00) ? 1 : 0;
    }

    public String toString() {
        if (this.A00 != 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    public C28336Dxi(byte b) {
        this.A00 = b;
    }

    public static C28336Dxi A03(C28341Dxn dxn) {
        AnonymousClass1Bz A022 = C28341Dxn.A02(dxn);
        if (A022 instanceof C28336Dxi) {
            return A02(A022);
        }
        byte[] A05 = C28342Dxo.A05(A022);
        if (A05.length == 1) {
            byte b = A05[0];
            if (b == -1) {
                return A02;
            }
            if (b != 0) {
                return new C28336Dxi(b);
            }
            return A01;
        }
        throw AnonymousClass000.A0k("BOOLEAN value should have 1 byte in it");
    }
}
