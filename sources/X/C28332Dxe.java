package X;

import java.util.Arrays;

/* renamed from: X.Dxe  reason: case insensitive filesystem */
public class C28332Dxe extends AnonymousClass1Bz {
    public byte[] A00;

    public int A0D() {
        int length = this.A00.length;
        return C26084Cs1.A00(length) + 1 + length;
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        cr0.A06(this.A00, 23, z);
    }

    public boolean A0H() {
        return false;
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public String toString() {
        return AnonymousClass1Bo.A02(this.A00);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28332Dxe)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28332Dxe) r3).A00);
    }

    public String A0K() {
        StringBuilder A0t;
        String substring;
        String A02 = AnonymousClass1Bo.A02(this.A00);
        int indexOf = A02.indexOf(45);
        if (indexOf >= 0 || (indexOf = A02.indexOf(43)) >= 0) {
            if (indexOf == A02.length() - 3) {
                A02 = AnonymousClass000.A0y("00", AnonymousClass000.A11(A02));
            }
            if (indexOf == 10) {
                A0t = BE9.A0t(10, A02);
                A0t.append("00GMT");
                A0t.append(A02.substring(10, 13));
                A0t.append(":");
                substring = A02.substring(13, 15);
            } else {
                A0t = BE9.A0t(12, A02);
                A0t.append("GMT");
                A0t.append(A02.substring(12, 15));
                A0t.append(":");
                substring = A02.substring(15, 17);
            }
        } else if (A02.length() == 11) {
            A0t = BE9.A0t(10, A02);
            substring = "00GMT+00:00";
        } else {
            A0t = BE9.A0t(12, A02);
            substring = "GMT+00:00";
        }
        return AnonymousClass000.A0y(substring, A0t);
    }
}
