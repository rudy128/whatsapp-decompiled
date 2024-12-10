package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.Dxm  reason: case insensitive filesystem */
public abstract class C28340Dxm extends AnonymousClass1Bz implements Iterable {
    public final AnonymousClass1Bx[] A00;
    public final boolean A01;

    public static void A04(AnonymousClass1Bx[] r12) {
        int length = r12.length;
        int i = 2;
        if (length >= 2) {
            AnonymousClass1Bx r11 = r12[0];
            AnonymousClass1Bx r9 = r12[1];
            try {
                byte[] A1Z = BE9.A1Z(r11);
                try {
                    byte[] A1Z2 = BE9.A1Z(r9);
                    byte[] bArr = A1Z2;
                    if (A05(A1Z2, A1Z)) {
                        AnonymousClass1Bx r0 = r9;
                        r9 = r11;
                        r11 = r0;
                        bArr = A1Z;
                        A1Z = A1Z2;
                    }
                    while (i < length) {
                        AnonymousClass1Bx r4 = r12[i];
                        try {
                            byte[] A1Z3 = BE9.A1Z(r4);
                            if (A05(bArr, A1Z3)) {
                                r12[i - 2] = r11;
                                r11 = r9;
                                A1Z = bArr;
                                r9 = r4;
                                bArr = A1Z3;
                            } else if (A05(A1Z, A1Z3)) {
                                r12[i - 2] = r11;
                                r11 = r4;
                                A1Z = A1Z3;
                            } else {
                                int i2 = i - 1;
                                while (true) {
                                    i2--;
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    AnonymousClass1Bx r1 = r12[i2 - 1];
                                    try {
                                        if (A05(BE9.A1Z(r1), A1Z3)) {
                                            break;
                                        }
                                        r12[i2] = r1;
                                    } catch (IOException unused) {
                                        throw AnonymousClass000.A0k("cannot encode object added to SET");
                                    }
                                }
                                r12[i2] = r4;
                            }
                            i++;
                        } catch (IOException unused2) {
                            throw AnonymousClass000.A0k("cannot encode object added to SET");
                        }
                    }
                    r12[length - 2] = r11;
                    r12[length - 1] = r9;
                } catch (IOException unused3) {
                    throw AnonymousClass000.A0k("cannot encode object added to SET");
                }
            } catch (IOException unused4) {
                throw AnonymousClass000.A0k("cannot encode object added to SET");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(byte[] r5, byte[] r6) {
        /*
            r4 = 0
            byte r0 = r5[r4]
            r1 = r0 & -33
            byte r0 = r6[r4]
            r0 = r0 & -33
            r3 = 1
            if (r1 != r0) goto L_0x001f
            int r1 = r5.length
            int r0 = r6.length
            int r2 = java.lang.Math.min(r1, r0)
            int r2 = r2 - r3
        L_0x0013:
            if (r3 >= r2) goto L_0x0026
            byte r1 = r5[r3]
            byte r0 = r6[r3]
            if (r1 == r0) goto L_0x0023
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x001f:
            if (r1 >= r0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            return r4
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0026:
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r6[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0022
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28340Dxm.A05(byte[], byte[]):boolean");
    }

    public boolean A0H() {
        return true;
    }

    public static C28340Dxm A02(Object obj) {
        if (obj == null || (obj instanceof C28340Dxm)) {
            return (C28340Dxm) obj;
        }
        if (obj instanceof EEN) {
            return A02(((AnonymousClass1Bx) obj).CP9());
        }
        if (obj instanceof byte[]) {
            try {
                return A02(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("failed to construct set from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            if (obj instanceof AnonymousClass1Bx) {
                AnonymousClass1Bz CP9 = ((AnonymousClass1Bx) obj).CP9();
                if (CP9 instanceof C28340Dxm) {
                    return (C28340Dxm) CP9;
                }
            }
            throw BEB.A0T(obj, "unknown object in getInstance: ", AnonymousClass000.A10());
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Dy6, X.Dxm, X.1Bz] */
    public AnonymousClass1Bz A0E() {
        boolean z = this.A01;
        AnonymousClass1Bx[] r0 = this.A00;
        if (!z) {
            r0 = (AnonymousClass1Bx[]) r0.clone();
            A04(r0);
        }
        ? dxm = new C28340Dxm(r0, true);
        dxm.A00 = -1;
        return dxm;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dy5, X.Dxm, X.1Bz] */
    public AnonymousClass1Bz A0F() {
        ? dxm = new C28340Dxm(this.A00, this.A01);
        dxm.A00 = -1;
        return dxm;
    }

    public boolean A0I(AnonymousClass1Bz r8) {
        if (r8 instanceof C28340Dxm) {
            C28340Dxm dxm = (C28340Dxm) r8;
            int length = this.A00.length;
            if (dxm.A00.length == length) {
                C28340Dxm dxm2 = (C28340Dxm) A0E();
                C28340Dxm dxm3 = (C28340Dxm) dxm.A0E();
                int i = 0;
                while (i < length) {
                    AnonymousClass1Bz CP9 = dxm2.A00[i].CP9();
                    AnonymousClass1Bz CP92 = dxm3.A00[i].CP9();
                    if (CP9 == CP92 || CP9.A0I(CP92)) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AnonymousClass1Bx[] r3 = this.A00;
        int length = r3.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = AnonymousClass000.A0O(r3[length].CP9(), i);
        }
    }

    public Iterator iterator() {
        return new C27109DUs(C26135Csy.A00(this.A00));
    }

    public String toString() {
        AnonymousClass1Bx[] r4 = this.A00;
        int length = r4.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer A0s = BE6.A0s();
        A0s.append('[');
        int i = 0;
        while (true) {
            A0s.append(r4[i]);
            i++;
            if (i >= length) {
                A0s.append(']');
                return A0s.toString();
            }
            A0s.append(", ");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r2.length < 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28340Dxm(X.C26135Csy r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r4 = 2
            if (r7 == 0) goto L_0x0021
            int r3 = r6.A00
            if (r3 < r4) goto L_0x0021
            X.1Bx[] r2 = new X.AnonymousClass1Bx[r3]
            X.1Bx[] r1 = r6.A02
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            A04(r2)
        L_0x0015:
            r5.A00 = r2
            if (r7 != 0) goto L_0x001d
            int r1 = r2.length
            r0 = 0
            if (r1 >= r4) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r5.A01 = r0
            return
        L_0x0021:
            X.1Bx[] r2 = r6.A03()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28340Dxm.<init>(X.Csy, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.Dy2} */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.Dxm] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.Dxm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28340Dxm A03(X.C28341Dxn r3) {
        /*
            X.1Bz r2 = X.C28341Dxn.A02(r3)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0018
            boolean r0 = r3 instanceof X.C28361Dy7
            if (r0 == 0) goto L_0x0012
            X.Dy4 r1 = new X.Dy4
            r1.<init>((X.AnonymousClass1Bx) r2)
            return r1
        L_0x0012:
            X.Dy5 r1 = new X.Dy5
            r1.<init>((X.AnonymousClass1Bx) r2)
            goto L_0x004b
        L_0x0018:
            boolean r0 = r2 instanceof X.C28340Dxm
            if (r0 == 0) goto L_0x002a
            X.Dxm r2 = (X.C28340Dxm) r2
            boolean r0 = r3 instanceof X.C28361Dy7
            if (r0 == 0) goto L_0x0023
            return r2
        L_0x0023:
            X.1Bz r1 = r2.A0F()
            X.Dxm r1 = (X.C28340Dxm) r1
            return r1
        L_0x002a:
            boolean r0 = r2 instanceof X.C28339Dxl
            if (r0 == 0) goto L_0x004f
            X.Dxl r2 = (X.C28339Dxl) r2
            boolean r0 = r2 instanceof X.C28356Dy2
            if (r0 == 0) goto L_0x0039
            X.Dy2 r2 = (X.C28356Dy2) r2
            X.C28356Dy2.A09(r2)
        L_0x0039:
            X.1Bx[] r2 = r2.A00
            boolean r1 = r3 instanceof X.C28361Dy7
            r0 = 0
            if (r1 == 0) goto L_0x0046
            X.Dy4 r1 = new X.Dy4
            r1.<init>((X.AnonymousClass1Bx[]) r2, (boolean) r0)
            return r1
        L_0x0046:
            X.Dy5 r1 = new X.Dy5
            r1.<init>((X.AnonymousClass1Bx[]) r2, (boolean) r0)
        L_0x004b:
            r0 = -1
            r1.A00 = r0
            return r1
        L_0x004f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown object in getInstance: "
            java.lang.IllegalArgumentException r0 = X.BEB.A0T(r3, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28340Dxm.A03(X.Dxn):X.Dxm");
    }

    public C28340Dxm(AnonymousClass1Bx[] r4) {
        for (AnonymousClass1Bx r0 : r4) {
            if (r0 == null) {
                throw AnonymousClass000.A0s("'elements' cannot be null, or contain null");
            }
        }
        AnonymousClass1Bx[] A002 = C26135Csy.A00(r4);
        if (A002.length >= 2) {
            A04(A002);
        }
        this.A00 = A002;
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.length < 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28340Dxm(X.AnonymousClass1Bx[] r4, boolean r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            if (r5 != 0) goto L_0x000c
            int r2 = r4.length
            r1 = 2
            r0 = 0
            if (r2 >= r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28340Dxm.<init>(X.1Bx[], boolean):void");
    }

    public C28340Dxm(AnonymousClass1Bx r4) {
        if (r4 != null) {
            this.A00 = new AnonymousClass1Bx[]{r4};
            this.A01 = true;
            return;
        }
        throw AnonymousClass000.A0s("'element' cannot be null");
    }

    public C28340Dxm() {
        this.A00 = C26135Csy.A03;
        this.A01 = true;
    }
}
