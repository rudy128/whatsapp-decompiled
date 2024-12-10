package X;

import java.io.InputStream;

/* renamed from: X.Cak  reason: case insensitive filesystem */
public class C25193Cak {
    public final InputStream A00;
    public final int A01;
    public final byte[][] A02 = new byte[11][];

    public C25193Cak(InputStream inputStream, int i) {
        this.A00 = inputStream;
        this.A01 = i;
    }

    public C26135Csy A01() {
        AnonymousClass1Bx A002 = A00();
        if (A002 == null) {
            return new C26135Csy(0);
        }
        C26135Csy csy = new C26135Csy();
        do {
            csy.A02(A002 instanceof E75 ? ((E75) A002).BU4() : A002.CP9());
            A002 = A00();
        } while (A002 != null);
        return csy;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Dxl] */
    public C28341Dxn A02(int i, boolean z) {
        AnonymousClass1Bx A08;
        C28354Dy0 dy0;
        if (!z) {
            A08 = new C28327DxZ(((C28371DyH) this.A00).A03());
        } else {
            C26135Csy A012 = A01();
            boolean z2 = this.A00 instanceof C28370DyG;
            int i2 = A012.A00;
            if (z2) {
                if (i2 == 1) {
                    return new C28341Dxn(A012.A01(0), i, true);
                }
                if (i2 < 1) {
                    dy0 = CHY.A00;
                } else {
                    ? obj = new Object();
                    obj.A00 = A012.A03();
                    dy0 = obj;
                }
                return new C28341Dxn(dy0, i, false);
            } else if (i2 == 1) {
                return new C28341Dxn(A012.A01(0), i, true);
            } else {
                if (i2 < 1) {
                    A08 = CHZ.A00;
                } else {
                    A08 = C28339Dxl.A08(A012);
                }
            }
        }
        return new C28341Dxn(A08, i, false);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.DYU, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.DYT, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.DYQ, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.DYW, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.DYY, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.DYR, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v29, types: [X.DYT, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.DYQ, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.DYV, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v34, types: [X.DYX, java.lang.Object, X.1Bx] */
    /* JADX WARNING: type inference failed for: r0v35, types: [X.DYR, java.lang.Object, X.1Bx] */
    public AnonymousClass1Bx A00() {
        InputStream inputStream = this.A00;
        int read = inputStream.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        if (inputStream instanceof C28370DyG) {
            C28370DyG dyG = (C28370DyG) inputStream;
            dyG.A00 = false;
            C28370DyG.A01(dyG);
        }
        int A002 = C24178Bwo.A00(inputStream, read);
        boolean A1O = AnonymousClass000.A1O(read & 32);
        int i = this.A01;
        if (A002 == 4 || A002 == 16 || A002 == 17 || A002 == 8) {
            z = true;
        }
        int A012 = C24178Bwo.A01(inputStream, i, z);
        if (A012 >= 0) {
            C28371DyH dyH = new C28371DyH(inputStream, A012, i);
            if ((read & 64) != 0) {
                return new C28334Dxg(dyH.A03(), A002, A1O);
            }
            if ((read & 128) != 0) {
                C25193Cak cak = new C25193Cak(dyH, C26084Cs1.A02(dyH));
                ? obj = new Object();
                obj.A02 = A1O;
                obj.A00 = A002;
                obj.A01 = cak;
                return obj;
            } else if (A1O) {
                if (A002 == 4) {
                    C25193Cak cak2 = new C25193Cak(dyH, C26084Cs1.A02(dyH));
                    ? obj2 = new Object();
                    obj2.A00 = cak2;
                    return obj2;
                } else if (A002 == 8) {
                    C25193Cak cak3 = new C25193Cak(dyH, C26084Cs1.A02(dyH));
                    ? obj3 = new Object();
                    obj3.A00 = cak3;
                    return obj3;
                } else if (A002 == 16) {
                    C25193Cak cak4 = new C25193Cak(dyH, C26084Cs1.A02(dyH));
                    ? obj4 = new Object();
                    obj4.A00 = cak4;
                    return obj4;
                } else if (A002 == 17) {
                    C25193Cak cak5 = new C25193Cak(dyH, C26084Cs1.A02(dyH));
                    ? obj5 = new Object();
                    obj5.A00 = cak5;
                    return obj5;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("unknown tag ");
                    A10.append(A002);
                    throw BE9.A0e(" encountered", A10);
                }
            } else if (A002 != 4) {
                try {
                    return C24178Bwo.A03(dyH, this.A02, A002);
                } catch (IllegalArgumentException e) {
                    throw new C24210BxM("corrupted stream detected", e);
                }
            } else {
                ? obj6 = new Object();
                obj6.A00 = dyH;
                return obj6;
            }
        } else if (A1O) {
            C25193Cak cak6 = new C25193Cak(new C28370DyG(inputStream, i), i);
            if ((read & 64) != 0) {
                return new DYS(cak6, A002);
            }
            if ((read & 128) != 0) {
                ? obj7 = new Object();
                obj7.A02 = true;
                obj7.A00 = A002;
                obj7.A01 = cak6;
                return obj7;
            } else if (A002 == 4) {
                ? obj8 = new Object();
                obj8.A00 = cak6;
                return obj8;
            } else if (A002 == 8) {
                ? obj9 = new Object();
                obj9.A00 = cak6;
                return obj9;
            } else if (A002 == 16) {
                ? obj10 = new Object();
                obj10.A00 = cak6;
                return obj10;
            } else if (A002 == 17) {
                ? obj11 = new Object();
                obj11.A00 = cak6;
                return obj11;
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                BE9.A1J("unknown BER object encountered: 0x", A102, A002);
                throw new C24210BxM(A102.toString());
            }
        } else {
            throw C17880vN.A0f("indefinite-length primitive encoding encountered");
        }
    }
}
