package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Dxg  reason: case insensitive filesystem */
public abstract class C28334Dxg extends AnonymousClass1Bz {
    public final int A00;
    public final boolean A01;
    public final byte[] A02;

    public int A0D() {
        int A012 = C26084Cs1.A01(this.A00);
        int length = this.A02.length;
        return A012 + C26084Cs1.A00(length) + length;
    }

    public boolean A0H() {
        return this.A01;
    }

    public int hashCode() {
        return (this.A01 ^ this.A00) ^ AnonymousClass1C2.A00(this.A02) ? 1 : 0;
    }

    public static C28334Dxg A02(Object obj) {
        if (obj == null || (obj instanceof C28334Dxg)) {
            return (C28334Dxg) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A02(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("Failed to construct object from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            throw BEB.A0T(obj, "unknown object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public boolean A0I(AnonymousClass1Bz r4) {
        if (!(r4 instanceof C28334Dxg)) {
            return false;
        }
        C28334Dxg dxg = (C28334Dxg) r4;
        if (this.A01 == dxg.A01 && this.A00 == dxg.A00 && Arrays.equals(this.A02, dxg.A02)) {
            return true;
        }
        return false;
    }

    public C28334Dxg(byte[] bArr, int i, boolean z) {
        this.A01 = z;
        this.A00 = i;
        this.A02 = AnonymousClass1C2.A02(bArr);
    }

    public String toString() {
        String str;
        StringBuffer A0s = BE6.A0s();
        A0s.append("[");
        if (this.A01) {
            A0s.append("CONSTRUCTED ");
        }
        A0s.append("APPLICATION ");
        A0s.append(Integer.toString(this.A00));
        A0s.append("]");
        byte[] bArr = this.A02;
        if (bArr != null) {
            A0s.append(" #");
            str = AnonymousClass1Bo.A02(C20073A5z.A02(bArr, 0, bArr.length));
        } else {
            str = " #null";
        }
        A0s.append(str);
        return BE7.A0n(" ", A0s);
    }
}
