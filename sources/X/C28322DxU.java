package X;

import java.io.IOException;

/* renamed from: X.DxU  reason: case insensitive filesystem */
public class C28322DxU extends AnonymousClass1By implements E3M {
    public int A00;
    public AnonymousClass1Bx A01;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.DxU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.DxU, java.lang.Object] */
    public static C28322DxU A01(Object obj) {
        AnonymousClass1Bx r1;
        if (obj == null || (obj instanceof C28322DxU)) {
            return (C28322DxU) obj;
        }
        if (obj instanceof C28341Dxn) {
            C28341Dxn dxn = (C28341Dxn) obj;
            int i = dxn.A00;
            switch (i) {
                case 0:
                case 3:
                case 5:
                    r1 = C28339Dxl.A06(dxn, false);
                    break;
                case 1:
                case 2:
                case 6:
                    AnonymousClass1Bz A02 = C28341Dxn.A02(dxn);
                    if (!(A02 instanceof C28353Dxz)) {
                        r1 = new C28353Dxz(C28342Dxo.A05(A02));
                        break;
                    } else {
                        r1 = C28353Dxz.A03(A02);
                        break;
                    }
                case 4:
                    CZY czy = C28324DxW.A05;
                    C28324DxW A012 = C28324DxW.A01(C28339Dxl.A06(dxn, true));
                    ? obj2 = new Object();
                    obj2.A01 = A012;
                    obj2.A00 = i;
                    return obj2;
                case 7:
                    r1 = C28342Dxo.A04(dxn, false);
                    break;
                case 8:
                    AnonymousClass1Bz A022 = C28341Dxn.A02(dxn);
                    if (!(A022 instanceof AnonymousClass1C0)) {
                        byte[] A05 = C28342Dxo.A05(A022);
                        r1 = (AnonymousClass1By) AnonymousClass1C0.A02.get(new AnonymousClass1C1(A05));
                        if (r1 == null) {
                            r1 = new AnonymousClass1C0(A05);
                            break;
                        }
                    } else {
                        r1 = AnonymousClass1C0.A02(A022);
                        break;
                    }
                    break;
                default:
                    throw AnonymousClass001.A13("unknown tag: ", AnonymousClass000.A10(), i);
            }
            ? obj3 = new Object();
            obj3.A01 = r1;
            obj3.A00 = i;
            return obj3;
        } else if (obj instanceof byte[]) {
            try {
                return A01(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException unused) {
                throw AnonymousClass000.A0k("unable to parse encoded general name");
            }
        } else {
            throw BEB.A0T(obj, "unknown object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public AnonymousClass1Bz CP9() {
        int i = this.A00;
        return new C28341Dxn(this.A01, i, AnonymousClass000.A1T(i, 4));
    }

    public String toString() {
        String A02;
        Object A012;
        StringBuffer A0s = BE6.A0s();
        int i = this.A00;
        A0s.append(i);
        A0s.append(": ");
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                A012 = C28324DxW.A01(this.A01);
            } else if (i != 6) {
                A012 = this.A01;
            }
            A02 = A012.toString();
            return BE7.A0n(A02, A0s);
        }
        A02 = C28353Dxz.A02(this);
        return BE7.A0n(A02, A0s);
    }
}
