package X;

/* renamed from: X.DxP  reason: case insensitive filesystem */
public class C28317DxP extends AnonymousClass1By {
    public final C28322DxU[] A00;

    public AnonymousClass1Bz CP9() {
        return new C28357Dy3((AnonymousClass1Bx[]) this.A00);
    }

    public static C28322DxU[] A01(Object obj) {
        C28317DxP dxP;
        if (obj instanceof C28317DxP) {
            dxP = (C28317DxP) obj;
        } else if (obj != null) {
            dxP = new C28317DxP(C28339Dxl.A05(obj));
        } else {
            dxP = null;
        }
        C28322DxU[] dxUArr = dxP.A00;
        int length = dxUArr.length;
        C28322DxU[] dxUArr2 = new C28322DxU[length];
        System.arraycopy(dxUArr, 0, dxUArr2, 0, length);
        return dxUArr2;
    }

    public C28317DxP(C28339Dxl dxl) {
        this.A00 = new C28322DxU[dxl.A0K()];
        for (int i = 0; i != dxl.A0K(); i++) {
            this.A00[i] = C28322DxU.A01(dxl.A0M(i));
        }
    }

    public String toString() {
        StringBuffer A0s = BE6.A0s();
        String str = AnonymousClass1Bo.A00;
        A0s.append("GeneralNames:");
        A0s.append(str);
        int i = 0;
        while (true) {
            C28322DxU[] dxUArr = this.A00;
            if (i == dxUArr.length) {
                return A0s.toString();
            }
            A0s.append("    ");
            A0s.append(dxUArr[i]);
            A0s.append(str);
            i++;
        }
    }

    public C28317DxP(C28322DxU dxU) {
        this.A00 = new C28322DxU[]{dxU};
    }
}
