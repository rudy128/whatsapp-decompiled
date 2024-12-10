package X;

import java.util.Enumeration;

/* renamed from: X.DxW  reason: case insensitive filesystem */
public class C28324DxW extends AnonymousClass1By implements E3M {
    public static CZY A05 = C28374DyK.A0e;
    public C28357Dy3 A00;
    public CZY A01;
    public C28307DxF[] A02;
    public int A03;
    public boolean A04;

    public C28307DxF[] A0D() {
        return (C28307DxF[]) this.A02.clone();
    }

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        boolean z;
        int i;
        if (obj != this) {
            if (!(obj instanceof C28324DxW) && !(obj instanceof C28339Dxl)) {
                return false;
            }
            AnonymousClass1Bx r13 = (AnonymousClass1Bx) obj;
            if (!this.A00.A0J(r13.CP9())) {
                try {
                    CZY czy = this.A01;
                    C28324DxW dxW = new C28324DxW(C28339Dxl.A05(r13.CP9()), A05);
                    if (czy instanceof C28373DyJ) {
                        C28307DxF[] A0D = A0D();
                        C28307DxF[] A0D2 = dxW.A0D();
                        int length = A0D.length;
                        if (length != A0D2.length) {
                            return false;
                        }
                        for (int i2 = 0; i2 != length; i2++) {
                            if (!C26254Cvu.A06(A0D[i2], A0D2[i2])) {
                                return false;
                            }
                        }
                        return true;
                    }
                    C28307DxF[] A0D3 = A0D();
                    C28307DxF[] A0D4 = dxW.A0D();
                    int length2 = A0D3.length;
                    int length3 = A0D4.length;
                    if (length2 != length3) {
                        return false;
                    }
                    if (A0D3[0].A0D() == null || A0D4[0].A0D() == null) {
                        z = false;
                    } else {
                        z = !A0D3[0].A0D().A01.A0J(A0D4[0].A0D().A01);
                    }
                    for (int i3 = 0; i3 != length2; i3++) {
                        C28307DxF dxF = A0D3[i3];
                        int i4 = 0;
                        if (z) {
                            i = length3 - 1;
                            while (i >= 0) {
                                C28307DxF dxF2 = A0D4[i];
                                if (dxF2 == null || !C26254Cvu.A06(dxF, dxF2)) {
                                    i--;
                                }
                            }
                            return false;
                        }
                        while (i != length3) {
                            C28307DxF dxF3 = A0D4[i];
                            if (dxF3 == null || !C26254Cvu.A06(dxF, dxF3)) {
                                i4 = i + 1;
                            }
                        }
                        return false;
                        A0D4[i] = null;
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return this.A01.A01(this);
    }

    public static C28324DxW A01(Object obj) {
        if (obj instanceof C28324DxW) {
            return (C28324DxW) obj;
        }
        if (obj != null) {
            return new C28324DxW(C28339Dxl.A05(obj), A05);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.DxW, java.lang.Object] */
    public static C28324DxW A02(Object obj, CZY czy) {
        if (obj instanceof C28324DxW) {
            C28324DxW dxW = (C28324DxW) obj;
            ? obj2 = new Object();
            obj2.A01 = czy;
            obj2.A02 = dxW.A02;
            obj2.A00 = dxW.A00;
            return obj2;
        } else if (obj != null) {
            return new C28324DxW(C28339Dxl.A05(obj), czy);
        } else {
            return null;
        }
    }

    public int hashCode() {
        if (this.A04) {
            return this.A03;
        }
        this.A04 = true;
        C28307DxF[] A0D = A0D();
        int i = 0;
        for (int i2 = 0; i2 != A0D.length; i2++) {
            C28307DxF dxF = A0D[i2];
            if (dxF.A00.A00.length > 1) {
                C28291Dwz[] A0E = dxF.A0E();
                for (int i3 = 0; i3 != A0E.length; i3++) {
                    C28291Dwz dwz = A0E[i3];
                    i = (i ^ dwz.A01.hashCode()) ^ C26254Cvu.A01(C26254Cvu.A03(dwz.A00)).hashCode();
                }
            } else {
                i = (i ^ dxF.A0D().A01.hashCode()) ^ C26254Cvu.A01(C26254Cvu.A03(A0D[i2].A0D().A00)).hashCode();
            }
        }
        this.A03 = i;
        return i;
    }

    public C28324DxW(C28339Dxl dxl, CZY czy) {
        C28357Dy3 dy3;
        this.A01 = czy;
        this.A02 = new C28307DxF[dxl.A0K()];
        Enumeration A0L = dxl.A0L();
        boolean z = true;
        int i = 0;
        while (A0L.hasMoreElements()) {
            Object nextElement = A0L.nextElement();
            C28307DxF A012 = C28307DxF.A01(nextElement);
            z &= AnonymousClass000.A1Z(A012, nextElement);
            this.A02[i] = A012;
            i++;
        }
        if (z) {
            dy3 = (C28357Dy3) dxl.A0E();
        } else {
            dy3 = new C28357Dy3((AnonymousClass1Bx[]) this.A02);
        }
        this.A00 = dy3;
    }

    public C28324DxW(CZY czy, C28307DxF[] dxFArr) {
        this.A01 = czy;
        C28307DxF[] dxFArr2 = (C28307DxF[]) dxFArr.clone();
        this.A02 = dxFArr2;
        this.A00 = new C28357Dy3((AnonymousClass1Bx[]) dxFArr2);
    }
}
