package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.Dxo  reason: case insensitive filesystem */
public abstract class C28342Dxo extends AnonymousClass1Bz implements EEO {
    public byte[] A00;

    public AnonymousClass1Bz A0E() {
        return new C28327DxZ(this.A00);
    }

    public AnonymousClass1Bz A0F() {
        return new C28327DxZ(this.A00);
    }

    public AnonymousClass1Bz BU4() {
        return this;
    }

    public static C24178Bwo A02(StringBuffer stringBuffer, C28342Dxo dxo, C28314DxM dxM) {
        C24178Bwo bwo = new C24178Bwo(dxo.A00);
        stringBuffer.append("                       critical(");
        stringBuffer.append(dxM.A02);
        stringBuffer.append(") ");
        return bwo;
    }

    public static C28342Dxo A03(Object obj) {
        if (obj == null || (obj instanceof C28342Dxo)) {
            return (C28342Dxo) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return A03(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("failed to construct OCTET STRING from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            if (obj instanceof AnonymousClass1Bx) {
                AnonymousClass1Bz CP9 = ((AnonymousClass1Bx) obj).CP9();
                if (CP9 instanceof C28342Dxo) {
                    return (C28342Dxo) CP9;
                }
            }
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public static C28342Dxo A04(C28341Dxn dxn, boolean z) {
        AnonymousClass1Bz r0;
        C28328Dxa dxa;
        if (!z) {
            AnonymousClass1Bz A02 = C28341Dxn.A02(dxn);
            if (dxn.A02) {
                boolean z2 = dxn instanceof C28361Dy7;
                C28342Dxo[] dxoArr = {A03(A02)};
                if (z2) {
                    return dxa;
                }
                dxa = new C28328Dxa(dxoArr);
            } else if (A02 instanceof C28342Dxo) {
                C28342Dxo dxo = (C28342Dxo) A02;
                if (dxn instanceof C28361Dy7) {
                    return dxo;
                }
                r0 = dxo.A0F();
                return (C28342Dxo) r0;
            } else if (A02 instanceof C28339Dxl) {
                C28339Dxl dxl = (C28339Dxl) A02;
                boolean z3 = dxn instanceof C28361Dy7;
                int A0K = dxl.A0K();
                C28342Dxo[] dxoArr2 = new C28342Dxo[A0K];
                for (int i = 0; i < A0K; i++) {
                    dxoArr2[i] = A03(dxl.A0M(i));
                }
                dxa = new C28328Dxa(dxoArr2);
                if (z3) {
                    return dxa;
                }
            } else {
                throw BEB.A0T(dxn, "unknown object in getInstance: ", AnonymousClass000.A10());
            }
            r0 = dxa.A0F();
            return (C28342Dxo) r0;
        } else if (dxn.A02) {
            return A03(C28341Dxn.A02(dxn));
        } else {
            throw AnonymousClass000.A0k("object implicit - explicit expected.");
        }
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28342Dxo)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28342Dxo) r3).A00);
    }

    public InputStream BVZ() {
        return BE6.A0h(this.A00);
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public static byte[] A05(Object obj) {
        return A03(obj).A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("#");
        byte[] bArr = this.A00;
        return AnonymousClass000.A0y(AnonymousClass1Bo.A02(C20073A5z.A02(bArr, 0, bArr.length)), A10);
    }
}
