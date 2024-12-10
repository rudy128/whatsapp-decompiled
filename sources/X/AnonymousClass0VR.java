package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0VR  reason: invalid class name */
public final class AnonymousClass0VR implements C17130tn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public AnonymousClass06v A05;
    public C04330Mt A06 = new C04330Mt();
    public C04330Mt A07 = new C04330Mt();
    public C03620Iz A08;
    public C17350uW A09 = AnonymousClass0ES.A00();
    public C17350uW A0A;
    public AnonymousClass0NZ A0B;
    public C06390Yd A0C;
    public AnonymousClass0Qu A0D;
    public AnonymousClass0Kg A0E;
    public AnonymousClass0Kg A0F;
    public AnonymousClass0Kg A0G;
    public C03450If A0H;
    public AnonymousClass0H9 A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int[] A0R;
    public int A0S;
    public C02090Cr A0T;
    public final C16270rz A0U;
    public final AnonymousClass0D1 A0V;
    public final C17250uM A0W;
    public final C04330Mt A0X = new C04330Mt();
    public final C06390Yd A0Y;
    public final AnonymousClass0H8 A0Z = new AnonymousClass0H8();
    public final AnonymousClass0H8 A0a = new AnonymousClass0H8();
    public final C04930Po A0b;
    public final List A0c = AnonymousClass000.A13();
    public final Set A0d;
    public final C04330Mt A0e = new C04330Mt();
    public final C04330Mt A0f;
    public final AnonymousClass0VU A0g = new AnonymousClass0VU(this, 0);

    private final void A0D(int i) {
        A02(this, i, 0, false);
        C04930Po.A02(this.A0b);
    }

    public static void A0J(AnonymousClass0VR r2) {
        A0R(r2, true);
        A0R(r2, false);
    }

    public static void A0K(AnonymousClass0VR r2) {
        A0R(r2, false);
        A0R(r2, true);
        A0R(r2, false);
        A0R(r2, false);
    }

    public static void A0L(AnonymousClass0VR r1) {
        A0R(r1, false);
        A0R(r1, false);
    }

    public static final void A0N(AnonymousClass0VR r3) {
        r3.A08 = null;
        r3.A03 = 0;
        r3.A02 = 0;
        r3.A01 = 0;
        r3.A0M = false;
        C04930Po r2 = r3.A0b;
        r2.A06 = false;
        r2.A0A.A00 = 0;
        r2.A03 = 0;
        r3.A0Z.A00.clear();
        r3.A0R = null;
        r3.A05 = null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.0Cn, java.lang.Object] */
    public static void A0O(AnonymousClass0VR r6, C03290Hk r7, C03620Iz r8) {
        int i = r6.A03 - r8.A01;
        HashMap hashMap = r8.A02;
        Integer valueOf = Integer.valueOf(r7.A01);
        ? obj = new Object();
        obj.A02 = -1;
        obj.A01 = i;
        obj.A00 = 0;
        hashMap.put(valueOf, obj);
        r8.A04.add(r7);
    }

    public static void A0Q(AnonymousClass0VR r1, boolean z) {
        A0R(r1, false);
        A0R(r1, z);
        A0R(r1, false);
        A0R(r1, false);
    }

    public static void A0U(Object obj) {
        A0R((AnonymousClass0VR) obj, false);
    }

    public static boolean A0Y(AnonymousClass0VR r2) {
        A0R(r2, false);
        A0R(r2, true);
        A0R(r2, false);
        A0R(r2, false);
        return true;
    }

    public void BKA() {
        A0R(this, false);
        C05660Vf A0Z2 = A0Z();
        if (A0Z2 != null) {
            int i = A0Z2.A01;
            if ((i & 1) != 0) {
                A0Z2.A01 = i | 2;
            }
        }
    }

    public void BKC() {
        A0R(this, true);
    }

    public void BKD() {
        boolean z = false;
        A0R(this, false);
        A0R(this, false);
        if (C04330Mt.A00(this.A0X) != 0) {
            z = true;
        }
        this.A0N = z;
        this.A0A = null;
    }

    public void BKE() {
        boolean z = false;
        A0R(this, false);
        A0R(this, false);
        if (C04330Mt.A00(this.A0X) != 0) {
            z = true;
        }
        this.A0N = z;
        this.A0A = null;
    }

    public void CNl() {
        A0P(this, (Object) null, (Object) null, -127, 0);
    }

    public void COB(int i) {
        A0P(this, (Object) null, (Object) null, i, 0);
    }

    public void COC(int i) {
        A0P(this, (Object) null, (Object) null, i, 0);
        A08();
    }

    public void COE() {
        A0P(this, (Object) null, (Object) null, 125, 2);
        this.A0M = true;
    }

    private final int A00(int i) {
        int i2;
        int A022;
        if (i < 0) {
            AnonymousClass06v r2 = this.A05;
            if (r2 == null || (A022 = r2.A02(i)) < 0) {
                return 0;
            }
            return r2.A03[A022];
        }
        int[] iArr = this.A0R;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return AnonymousClass000.A0R(this.A0B.A08, i * 5);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r1.equals(X.AnonymousClass0MH.A00) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A01(int r6, int r7, int r8) {
        /*
            r5 = this;
            if (r6 == r7) goto L_0x0029
            X.0NZ r4 = r5.A0B
            int[] r2 = r4.A08
            int r3 = r6 * 5
            int r0 = r3 + 1
            r1 = r2[r0]
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = X.AnonymousClass0NZ.A00(r4, r2, r6)
            if (r1 == 0) goto L_0x0044
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x003f
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r2 = r1.ordinal()
        L_0x0021:
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r2 != r0) goto L_0x0045
            r8 = 126665345(0x78cc281, float:2.1179178E-34)
        L_0x0029:
            return r8
        L_0x002a:
            r2 = r2[r3]
            r0 = 207(0xcf, float:2.9E-43)
            if (r2 != r0) goto L_0x0021
            java.lang.Object r1 = r4.A06(r6)
            if (r1 == 0) goto L_0x0045
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            int r2 = r1.hashCode()
            goto L_0x0021
        L_0x0044:
            r2 = 0
        L_0x0045:
            X.0NZ r0 = r5.A0B
            int[] r1 = r0.A08
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r5.A01(r0, r7, r8)
            r0 = 3
            int r8 = java.lang.Integer.rotateLeft(r1, r0)
            r8 = r8 ^ r2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A01(int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        if (r8 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r0 = r13 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r9 = r9 + A02(r11, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        if (r8 == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        r0 = r11.A0b;
        X.C04930Po.A02(r0);
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f8, code lost:
        if (r14 != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (X.C04780Ot.A03(r5.A08, r12) != false) goto L_0x010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A02(X.AnonymousClass0VR r11, int r12, int r13, boolean r14) {
        /*
            X.0NZ r5 = r11.A0B
            int[] r4 = r5.A08
            int r6 = r12 * 5
            r3 = 1
            int r9 = r6 + 1
            r1 = r4[r9]
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0011
            r3 = 0
        L_0x0011:
            r10 = 1
            r2 = 0
            if (r3 == 0) goto L_0x00a5
            r3 = r4[r6]
            java.lang.Object r1 = X.AnonymousClass0NZ.A00(r5, r4, r12)
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r3 == r0) goto L_0x0102
            r0 = 206(0xce, float:2.89E-43)
            if (r3 != r0) goto L_0x0102
            java.lang.Object r0 = X.C05020Qb.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r1 = r5.A07(r12, r2)
            boolean r0 = r1 instanceof X.C05730Vm
            if (r0 == 0) goto L_0x010b
            X.0Vm r1 = (X.C05730Vm) r1
            if (r1 == 0) goto L_0x010b
            X.07S r0 = r1.A00
            java.util.Set r0 = r0.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r7 = r8.next()
            X.0VR r7 = (X.AnonymousClass0VR) r7
            X.0Yd r1 = r7.A0Y
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0094
            X.0Kg r0 = new X.0Kg
            r0.<init>()
            r7.A0F = r0
            X.0NZ r6 = r1.A04()
            r7.A0B = r6     // Catch:{ all -> 0x00a0 }
            X.0Po r4 = r7.A0b     // Catch:{ all -> 0x00a0 }
            X.0Kg r3 = r4.A05     // Catch:{ all -> 0x00a0 }
            r4.A05 = r0     // Catch:{ all -> 0x009c }
            r7.A0D(r2)     // Catch:{ all -> 0x009c }
            X.C04930Po.A00(r4)     // Catch:{ all -> 0x009c }
            boolean r0 = r4.A06     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x008f
            X.0Kg r0 = r4.A05     // Catch:{ all -> 0x009c }
            X.0Pm r1 = r0.A00     // Catch:{ all -> 0x009c }
            X.07d r0 = X.C011007d.A00     // Catch:{ all -> 0x009c }
            r1.A06(r0)     // Catch:{ all -> 0x009c }
            boolean r0 = r4.A06     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x008f
            X.C04930Po.A03(r4, r2)     // Catch:{ all -> 0x009c }
            X.C04930Po.A03(r4, r2)     // Catch:{ all -> 0x009c }
            X.0Kg r0 = r4.A05     // Catch:{ all -> 0x009c }
            X.0Pm r1 = r0.A00     // Catch:{ all -> 0x009c }
            X.07Y r0 = X.AnonymousClass07Y.A00     // Catch:{ all -> 0x009c }
            r1.A06(r0)     // Catch:{ all -> 0x009c }
            r4.A06 = r2     // Catch:{ all -> 0x009c }
        L_0x008f:
            r4.A05 = r3     // Catch:{ all -> 0x00a0 }
            r6.A08()
        L_0x0094:
            X.0D1 r1 = r11.A0V
            X.0uM r0 = r7.A0W
            r1.A0a(r0)
            goto L_0x0040
        L_0x009c:
            r0 = move-exception
            r4.A05 = r3     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r6.A08()
            throw r0
        L_0x00a5:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0102
            int r0 = r6 + 3
            r3 = r4[r0]
            int r3 = r3 + r12
            int r2 = r12 + 1
            r9 = 0
        L_0x00b2:
            int[] r0 = r5.A08
            if (r2 >= r3) goto L_0x00fb
            boolean r8 = X.C04780Ot.A03(r0, r2)
            if (r8 == 0) goto L_0x00f7
            X.0Po r7 = r11.A0b
            X.C04930Po.A02(r7)
            int[] r6 = r5.A08
            boolean r0 = X.C04780Ot.A03(r6, r2)
            if (r0 == 0) goto L_0x00f5
            java.lang.Object[] r1 = r5.A09
            int r0 = r2 * 5
            int r0 = r0 + 4
            r0 = r6[r0]
            r1 = r1[r0]
        L_0x00d3:
            X.0H8 r0 = r7.A04
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
        L_0x00da:
            r1 = 1
            r0 = 0
            if (r8 != 0) goto L_0x00e0
        L_0x00de:
            int r0 = r13 + r9
        L_0x00e0:
            int r0 = A02(r11, r2, r0, r1)
            int r9 = r9 + r0
            if (r8 == 0) goto L_0x00ef
            X.0Po r0 = r11.A0b
            X.C04930Po.A02(r0)
            r0.A04()
        L_0x00ef:
            int r0 = X.AnonymousClass000.A0S(r4, r2)
            int r2 = r2 + r0
            goto L_0x00b2
        L_0x00f5:
            r1 = 0
            goto L_0x00d3
        L_0x00f7:
            r1 = 0
            if (r14 == 0) goto L_0x00de
            goto L_0x00da
        L_0x00fb:
            boolean r0 = X.C04780Ot.A03(r0, r12)
            if (r0 != 0) goto L_0x010a
            return r9
        L_0x0102:
            int[] r0 = r5.A08
            boolean r0 = X.C04780Ot.A03(r0, r12)
            if (r0 == 0) goto L_0x010b
        L_0x010a:
            return r10
        L_0x010b:
            int[] r0 = r5.A08
            r10 = r0[r9]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r10 = r10 & r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A02(X.0VR, int, int, boolean):int");
    }

    public static int A03(Object obj, Object obj2, int i) {
        if (obj == null) {
            if (obj2 == null || i != 207 || obj2.equals(AnonymousClass0MH.A00)) {
                return i;
            }
            return obj2.hashCode();
        } else if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        } else {
            return obj.hashCode();
        }
    }

    private final C17350uW A05(int i) {
        C17350uW r0;
        Object A062;
        Object obj;
        if (this.A0K && this.A0Q) {
            AnonymousClass0Qu r3 = this.A0D;
            int i2 = r3.A08;
            while (true) {
                if (i2 <= 0) {
                    break;
                }
                int[] iArr = r3.A0G;
                if (iArr[AnonymousClass0Qu.A01(r3, i2) * 5] == 202) {
                    int A012 = AnonymousClass0Qu.A01(r3, i2) * 5;
                    int i3 = iArr[A012 + 1];
                    if ((536870912 & i3) != 0) {
                        obj = r3.A0H[iArr[A012 + 4] + C04780Ot.A00(i3 >> 30)];
                    } else {
                        obj = null;
                    }
                    if (C18070vi.A18(obj, C05020Qb.A00)) {
                        AnonymousClass0Qu r6 = this.A0D;
                        int A013 = AnonymousClass0Qu.A01(r6, i2);
                        int[] iArr2 = r6.A0G;
                        int i4 = iArr2[(A013 * 5) + 1];
                        if ((268435456 & i4) != 0) {
                            A062 = r6.A0H[AnonymousClass0Qu.A03(r6, iArr2, A013) + C04780Ot.A00(i4 >> 29)];
                        } else {
                            A062 = AnonymousClass0MH.A00;
                        }
                    }
                }
                r3 = this.A0D;
                i2 = AnonymousClass0Qu.A04(r3, r3.A0G, i2);
            }
            C18070vi.A0z(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            r0 = (C17350uW) A062;
            this.A0A = r0;
            return r0;
        }
        AnonymousClass0NZ r32 = this.A0B;
        if (r32.A07 > 0) {
            while (true) {
                if (i <= 0) {
                    break;
                }
                int[] iArr3 = r32.A08;
                if (iArr3[i * 5] != 202 || !C18070vi.A18(AnonymousClass0NZ.A00(r32, iArr3, i), C05020Qb.A00)) {
                    r32 = this.A0B;
                    i = r32.A08[(i * 5) + 2];
                } else {
                    AnonymousClass0H9 r02 = this.A0I;
                    if (r02 == null || (r0 = (C17350uW) r02.A00.get(i)) == null) {
                        A062 = this.A0B.A06(i);
                    }
                }
            }
            this.A0A = r0;
            return r0;
        }
        r0 = this.A09;
        this.A0A = r0;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.0Vf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.0Vf, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A08() {
        /*
            r4 = this;
            boolean r0 = r4.A0K
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x0029
            X.0uM r0 = r4.A0W
            X.C18070vi.A0z(r0, r3)
            X.0VT r0 = (X.AnonymousClass0VT) r0
            X.0Vf r1 = new X.0Vf
            r1.<init>()
            r1.A05 = r0
            X.0H8 r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            r4.A0c(r1)
            int r0 = r4.A0S
            r1.A00 = r0
            int r0 = r1.A01
            r0 = r0 & -17
            r1.A01 = r0
            return
        L_0x0029:
            java.util.List r1 = r4.A0c
            X.0NZ r0 = r4.A0B
            int r0 = r0.A05
            int r0 = X.C05020Qb.A01(r1, r0)
            if (r0 < 0) goto L_0x008c
            java.lang.Object r1 = r1.remove(r0)
        L_0x0039:
            X.0NZ r0 = r4.A0B
            java.lang.Object r2 = r0.A05()
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0084
            X.0uM r0 = r4.A0W
            X.C18070vi.A0z(r0, r3)
            X.0VT r0 = (X.AnonymousClass0VT) r0
            X.0Vf r2 = new X.0Vf
            r2.<init>()
            r2.A05 = r0
            r4.A0c(r2)
        L_0x0058:
            if (r1 != 0) goto L_0x0064
            int r1 = r2.A01
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0082
            r0 = r1 & -65
            r2.A01 = r0
        L_0x0064:
            r1 = 1
        L_0x0065:
            int r0 = r2.A01
            if (r1 == 0) goto L_0x007f
            r0 = r0 | 8
        L_0x006b:
            r2.A01 = r0
            X.0H8 r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r2)
            int r0 = r4.A0S
            r2.A00 = r0
            int r0 = r2.A01
            r0 = r0 & -17
            r2.A01 = r0
            return
        L_0x007f:
            r0 = r0 & -9
            goto L_0x006b
        L_0x0082:
            r1 = 0
            goto L_0x0065
        L_0x0084:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.C18070vi.A0z(r2, r0)
            X.0Vf r2 = (X.C05660Vf) r2
            goto L_0x0058
        L_0x008c:
            r1 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A08():void");
    }

    private final void A09() {
        C05020Qb.A08(this.A0D.A0F);
        C06390Yd r0 = new C06390Yd();
        this.A0C = r0;
        AnonymousClass0Qu A052 = r0.A05();
        A052.A0R();
        this.A0D = A052;
    }

    private final void A0A() {
        AnonymousClass06z r7;
        int i;
        boolean z = this.A0L;
        this.A0L = true;
        AnonymousClass0NZ r72 = this.A0B;
        int i2 = r72.A05;
        int i3 = i2;
        int A0S2 = AnonymousClass000.A0S(r72.A08, i2) + i2;
        int i4 = this.A03;
        int i5 = this.A01;
        int i6 = this.A02;
        List list = this.A0c;
        int A012 = C05020Qb.A01(list, r72.A01);
        if (A012 < 0) {
            A012 = -(A012 + 1);
        }
        if (A012 < list.size()) {
            AnonymousClass0Jr r73 = (AnonymousClass0Jr) list.get(A012);
            if (r73.A01 < A0S2) {
                boolean z2 = false;
                do {
                    int i7 = r73.A01;
                    int A013 = C05020Qb.A01(list, i7);
                    if (A013 >= 0) {
                        list.remove(A013);
                    }
                    if (r73.A02()) {
                        AnonymousClass0NZ r0 = this.A0B;
                        r0.A0C(i7);
                        int i8 = r0.A01;
                        A0H(i3, i8, i2);
                        int i9 = i4;
                        int[] iArr = this.A0B.A08;
                        int i10 = i8 * 5;
                        int i11 = i10;
                        while (true) {
                            i = iArr[i10 + 2];
                            if (i != i2 && !C04780Ot.A03(iArr, i)) {
                                i10 = i * 5;
                            }
                        }
                        if (C04780Ot.A03(iArr, i)) {
                            i9 = 0;
                        }
                        if (i != i8) {
                            int A002 = (A00(i) - AnonymousClass000.A0R(this.A0B.A08, i11)) + i9;
                            while (i9 < A002 && i != i7) {
                                i++;
                                while (true) {
                                    if (i >= i7) {
                                        break;
                                    }
                                    int A0S3 = AnonymousClass000.A0S(this.A0B.A08, i) + i;
                                    if (i7 >= A0S3) {
                                        i9 += A00(i);
                                        i = A0S3;
                                    }
                                }
                            }
                        }
                        this.A03 = i9;
                        i3 = i8;
                        int i12 = this.A0B.A08[i11 + 2];
                        this.A01 = A01(i12, i2, i5);
                        this.A0A = null;
                        r73.A02.A02(this);
                        this.A0A = null;
                        AnonymousClass0NZ r10 = this.A0B;
                        int A0S4 = AnonymousClass000.A0S(r10.A08, i2) + i2;
                        int i13 = r10.A01;
                        if (i13 < i2 || i13 > A0S4) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Index ");
                            A10.append(i2);
                            C05020Qb.A06(AnonymousClass001.A1I(" is not a parent of ", A10, i13));
                            throw null;
                        }
                        r10.A05 = i2;
                        r10.A00 = A0S4;
                        r10.A02 = 0;
                        r10.A03 = 0;
                        z2 = true;
                    } else {
                        AnonymousClass0H8 r02 = this.A0Z;
                        C05660Vf r9 = r73.A02;
                        ArrayList arrayList = r02.A00;
                        arrayList.add(r9);
                        C16660sn r14 = r9.A05;
                        if (!(r14 == null || (r7 = r9.A02) == null)) {
                            r9.A01 |= 32;
                            try {
                                Object[] objArr = r7.A04;
                                long[] jArr = r7.A03;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j = jArr[i14];
                                        if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                            int A0D2 = 8 - AnonymousClass000.A0D(i14, length);
                                            for (int i15 = 0; i15 < A0D2; i15++) {
                                                if ((255 & j) < 128) {
                                                    r14.CDi(AnonymousClass000.A0x(objArr, i14, i15));
                                                }
                                                j >>= 8;
                                            }
                                            if (A0D2 != 8) {
                                                break;
                                            }
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            } finally {
                                r9.A01 &= -33;
                            }
                        }
                        arrayList.remove(AnonymousClass000.A0Q(arrayList));
                    }
                    int A014 = C05020Qb.A01(list, this.A0B.A01);
                    if (A014 < 0) {
                        A014 = -(A014 + 1);
                    }
                    if (A014 >= list.size()) {
                        break;
                    }
                    r73 = (AnonymousClass0Jr) list.get(A014);
                } while (r73.A01 < A0S2);
                if (z2) {
                    A0H(i3, i2, i2);
                    this.A0B.A0A();
                    int A003 = A00(i2);
                    this.A03 = i4 + A003;
                    this.A02 = i6 + A003;
                    this.A01 = i5;
                    this.A0L = z;
                }
            }
        }
        A0C();
        this.A01 = i5;
        this.A0L = z;
    }

    private final void A0B() {
        A0D(this.A0B.A01);
        C04930Po r3 = this.A0b;
        C04930Po.A01(r3);
        r3.A05.A00.A06(C010807b.A00);
        int i = r3.A03;
        AnonymousClass0NZ r0 = r3.A09.A0B;
        r3.A03 = i + AnonymousClass000.A0S(r0.A08, r0.A01);
    }

    private final void A0C() {
        int i;
        AnonymousClass0NZ r2 = this.A0B;
        int i2 = r2.A05;
        if (i2 >= 0) {
            i = AnonymousClass000.A0R(r2.A08, i2 * 5);
        } else {
            i = 0;
        }
        this.A02 = i;
        r2.A0A();
    }

    private final void A0E(int i, int i2) {
        Object obj;
        if (i > 0 && i != i2) {
            AnonymousClass0NZ r5 = this.A0B;
            int i3 = i * 5;
            A0E(r5.A08[i3 + 2], i2);
            int[] iArr = r5.A08;
            if (C04780Ot.A03(iArr, i)) {
                C04930Po r2 = this.A0b;
                if (C04780Ot.A03(iArr, i)) {
                    obj = r5.A09[iArr[i3 + 4]];
                } else {
                    obj = null;
                }
                r2.A04.A00.add(obj);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [X.06v, X.0KS] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if ((X.AnonymousClass000.A0U(r17) & -9187201950435737472L) == 0) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        r11 = X.AnonymousClass06v.A00(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r10.A00 != 0) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (X.AnonymousClass001.A0x(r7, r11) == 254) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        r0 = X.AnonymousClass0GO.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r8 == 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r1 = (r8 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        r23 = r10.A02;
        r22 = r10.A03;
        X.AnonymousClass06v.A01(r10, r1);
        r14 = r10.A02;
        r13 = r10.A03;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r12 >= r8) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (X.AnonymousClass001.A0x(r7, r12) >= 128) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r21 = r23[r12];
        r1 = X.AnonymousClass001.A0D(r21);
        r11 = X.AnonymousClass06v.A00(r10, r1 >>> 7);
        r1 = (long) (r1 & com.facebook.common.dextricks.StringTreeSet.OFFSET_BASE_ENCODING);
        r0 = r10.A04;
        r20 = r11 >> 3;
        r19 = (r11 & 7) << 3;
        r0[r20] = (r0[r20] & ((255 << r19) ^ -1)) | (r1 << r19);
        r15 = X.AnonymousClass000.A0E(r11, r10.A00);
        r20 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r0[r20] = (r0[r20] & ((255 << r19) ^ -1)) | (r1 << r19);
        r14[r11] = r21;
        r13[r11] = r22[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0104, code lost:
        r11 = X.AnonymousClass06v.A00(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        r10.A01++;
        r9 = r10.A00;
        r8 = r10.A04;
        r16 = r11 >> 3;
        r14 = r8[r16];
        r7 = (r11 & 7) << 3;
        r10.A00 = r9 - X.AnonymousClass000.A1P((((r14 >> r7) & 255) > 128 ? 1 : (((r14 >> r7) & 255) == 128 ? 0 : -1)));
        r8[r16] = (r14 & ((255 << r7) ^ -1)) | (r3 << r7);
        r0 = X.AnonymousClass000.A0E(r11, r10.A00);
        r7 = r0 >> 3;
        r2 = (r0 & 7) << 3;
        r8[r7] = (r3 << r2) | (((255 << r2) ^ -1) & r8[r7]);
        r13 = r11 ^ -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0F(int r29, int r30) {
        /*
            r28 = this;
            r4 = r28
            r6 = r29
            int r0 = r4.A00(r6)
            r5 = r30
            if (r0 == r5) goto L_0x015a
            if (r29 >= 0) goto L_0x00f0
            X.06v r10 = r4.A05
            if (r10 != 0) goto L_0x001f
            X.06v r10 = new X.06v
            r10.<init>()
            X.070 r0 = X.AnonymousClass0GO.A01
            r0 = 6
            X.AnonymousClass06v.A01(r10, r0)
            r4.A05 = r10
        L_0x001f:
            int r0 = X.AnonymousClass001.A0D(r6)
            int r9 = r0 >>> 7
            r12 = r0 & 127(0x7f, float:1.78E-43)
            int r8 = r10.A00
            r11 = r9 & r8
            r19 = 0
        L_0x002d:
            long[] r7 = r10.A04
            long r17 = X.AnonymousClass002.A01(r7, r11)
            long r3 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r3 * r15
            long r0 = r0 ^ r17
            long r13 = r0 - r15
            r26 = -1
            long r0 = r0 ^ r26
            long r0 = r0 & r13
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
        L_0x004a:
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x005f
            int r13 = X.AnonymousClass001.A0H(r11, r8, r0)
            int[] r2 = r10.A02
            r2 = r2[r13]
            if (r2 == r6) goto L_0x014e
            long r0 = X.AnonymousClass000.A0T(r0)
            goto L_0x004a
        L_0x005f:
            long r1 = X.AnonymousClass000.A0U(r17)
            long r1 = r1 & r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00e9
            int r11 = X.AnonymousClass06v.A00(r10, r9)
            int r0 = r10.A00
            r24 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x0108
            long r12 = X.AnonymousClass001.A0x(r7, r11)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
            X.070 r0 = X.AnonymousClass0GO.A01
            r1 = 6
            if (r8 == 0) goto L_0x0085
            int r0 = r8 * 2
            int r1 = r0 + 1
        L_0x0085:
            int[] r0 = r10.A02
            r23 = r0
            int[] r0 = r10.A03
            r22 = r0
            X.AnonymousClass06v.A01(r10, r1)
            int[] r14 = r10.A02
            int[] r13 = r10.A03
            r12 = 0
        L_0x0095:
            if (r12 >= r8) goto L_0x0104
            long r15 = X.AnonymousClass001.A0x(r7, r12)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
            r21 = r23[r12]
            int r1 = X.AnonymousClass001.A0D(r21)
            int r0 = r1 >>> 7
            int r11 = X.AnonymousClass06v.A00(r10, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r1 = (long) r0
            long[] r0 = r10.A04
            int r20 = r11 >> 3
            r15 = r11 & 7
            int r19 = r15 << 3
            r17 = r0[r20]
            long r15 = r24 << r19
            long r15 = r15 ^ r26
            long r17 = r17 & r15
            long r15 = r1 << r19
            long r17 = r17 | r15
            r0[r20] = r17
            int r15 = r10.A00
            int r15 = X.AnonymousClass000.A0E(r11, r15)
            int r20 = r15 >> 3
            r15 = r15 & 7
            int r19 = r15 << 3
            r17 = r0[r20]
            long r15 = r24 << r19
            long r15 = r15 ^ r26
            long r17 = r17 & r15
            long r1 = r1 << r19
            long r17 = r17 | r1
            r0[r20] = r17
            r14[r11] = r21
            r0 = r22[r12]
            r13[r11] = r0
        L_0x00e6:
            int r12 = r12 + 1
            goto L_0x0095
        L_0x00e9:
            int r19 = r19 + 8
            int r11 = r11 + r19
            r11 = r11 & r8
            goto L_0x002d
        L_0x00f0:
            int[] r3 = r4.A0R
            if (r3 != 0) goto L_0x0101
            X.0NZ r0 = r4.A0B
            int r2 = r0.A07
            int[] r3 = new int[r2]
            r1 = -1
            r0 = 0
            java.util.Arrays.fill(r3, r0, r2, r1)
            r4.A0R = r3
        L_0x0101:
            r3[r29] = r30
            return
        L_0x0104:
            int r11 = X.AnonymousClass06v.A00(r10, r9)
        L_0x0108:
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            int r9 = r10.A00
            long[] r8 = r10.A04
            int r16 = r11 >> 3
            r14 = r8[r16]
            r0 = r11 & 7
            int r7 = r0 << 3
            long r12 = r14 >> r7
            long r12 = r12 & r24
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            int r9 = r9 - r0
            r10.A00 = r9
            long r0 = r24 << r7
            long r0 = r0 ^ r26
            long r14 = r14 & r0
            long r0 = r3 << r7
            long r14 = r14 | r0
            r8[r16] = r14
            int r0 = r10.A00
            int r0 = X.AnonymousClass000.A0E(r11, r0)
            int r7 = r0 >> 3
            r0 = r0 & 7
            int r2 = r0 << 3
            r0 = r8[r7]
            long r24 = r24 << r2
            long r24 = r24 ^ r26
            long r24 = r24 & r0
            long r3 = r3 << r2
            long r3 = r3 | r24
            r8[r7] = r3
            r13 = r11 ^ -1
        L_0x014e:
            if (r13 >= 0) goto L_0x0152
            r13 = r13 ^ -1
        L_0x0152:
            int[] r0 = r10.A02
            r0[r13] = r29
            int[] r0 = r10.A03
            r0[r13] = r30
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A0F(int, int):void");
    }

    private final void A0H(int i, int i2, int i3) {
        AnonymousClass0NZ r4 = this.A0B;
        int i4 = i;
        int i5 = i2;
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                i4 = i3;
            } else {
                int[] iArr = r4.A08;
                int i6 = iArr[(i * 5) + 2];
                if (i6 == i2) {
                    i4 = i2;
                } else {
                    int i7 = iArr[(i2 * 5) + 2];
                    if (i7 != i) {
                        if (i6 == i7) {
                            i4 = i6;
                        } else {
                            int i8 = i;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = iArr[(i8 * 5) + 2];
                                i9++;
                            }
                            int i10 = i2;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i3) {
                                i10 = iArr[(i10 * 5) + 2];
                                i11++;
                            }
                            int i12 = i9 - i11;
                            for (int i13 = 0; i13 < i12; i13++) {
                                i4 = iArr[(i4 * 5) + 2];
                            }
                            int i14 = i11 - i9;
                            for (int i15 = 0; i15 < i14; i15++) {
                                i5 = iArr[(i5 * 5) + 2];
                            }
                            while (i4 != i5) {
                                i4 = iArr[(i4 * 5) + 2];
                                i5 = iArr[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            }
        }
        while (i > 0 && i != i4) {
            if (C04780Ot.A03(r4.A08, i)) {
                this.A0b.A04();
            }
            i = r4.A08[(i * 5) + 2];
        }
        A0E(i2, i4);
    }

    public static final void A0I(C17130tn r1, AnonymousClass1OS r2) {
        C18070vi.A0z(r2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        C41681wt.A04(r2, 2);
        r2.invoke(r1, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r6.A0O == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0P(X.AnonymousClass0VR r16, java.lang.Object r17, java.lang.Object r18, int r19, int r20) {
        /*
            r9 = r17
            r6 = r16
            boolean r0 = r6.A0M
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0239
            r10 = r18
            r7 = r19
            int r2 = A03(r9, r10, r7)
            int r1 = r6.A01
            r0 = 3
            int r0 = java.lang.Integer.rotateLeft(r1, r0)
            r2 = r2 ^ r0
            r6.A01 = r2
            r5 = 0
            r3 = 1
            r19 = 0
            r1 = r20
            boolean r4 = X.AnonymousClass000.A1S(r1, r5)
            boolean r0 = r6.A0K
            r18 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0088
            X.0NZ r1 = r6.A0B
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            X.0Qu r8 = r6.A0D
            int r1 = r8.A00
            if (r4 == 0) goto L_0x0074
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            X.AnonymousClass0Qu.A0J(r8, r0, r0, r7, r3)
        L_0x0040:
            X.0Iz r9 = r6.A08
            if (r9 == 0) goto L_0x0054
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
            int r3 = -2 - r1
            X.0Hk r1 = new X.0Hk
            r0 = r18
            r1.<init>(r8, r7, r3, r0)
            A0O(r6, r1, r9)
        L_0x0054:
            X.0H8 r0 = r6.A0a
            X.0Iz r1 = r6.A08
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            r6.A08 = r2
            X.0Mt r1 = r6.A07
            int r0 = r6.A03
            r1.A01(r0)
            if (r4 == 0) goto L_0x006a
            r6.A03 = r5
        L_0x006a:
            X.0Mt r1 = r6.A06
            int r0 = r6.A02
            r1.A01(r0)
            r6.A02 = r5
            return
        L_0x0074:
            if (r10 == 0) goto L_0x007e
            if (r17 != 0) goto L_0x007a
            java.lang.Object r9 = X.AnonymousClass0MH.A00
        L_0x007a:
            X.AnonymousClass0Qu.A0J(r8, r9, r10, r7, r5)
            goto L_0x0040
        L_0x007e:
            if (r17 != 0) goto L_0x0082
            java.lang.Object r9 = X.AnonymousClass0MH.A00
        L_0x0082:
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            X.AnonymousClass0Qu.A0J(r8, r9, r0, r7, r5)
            goto L_0x0040
        L_0x0088:
            if (r1 != r3) goto L_0x0090
            boolean r0 = r6.A0O
            r17 = 1
            if (r0 != 0) goto L_0x0092
        L_0x0090:
            r17 = 0
        L_0x0092:
            X.0Iz r0 = r6.A08
            if (r0 != 0) goto L_0x00b9
            X.0NZ r12 = r6.A0B
            int r11 = r12.A01
            int r8 = r12.A00
            if (r11 >= r8) goto L_0x0174
            int[] r1 = r12.A08
            int r0 = r11 * 5
            r0 = r1[r0]
        L_0x00a4:
            if (r17 != 0) goto L_0x0131
            if (r0 != r7) goto L_0x0131
            if (r11 >= r8) goto L_0x012f
            int[] r0 = r12.A08
            java.lang.Object r0 = X.AnonymousClass0NZ.A00(r12, r0, r11)
        L_0x00b0:
            boolean r0 = X.C18070vi.A18(r9, r0)
            if (r0 == 0) goto L_0x0131
            r6.A0W(r4, r10)
        L_0x00b9:
            X.0Iz r8 = r6.A08
            if (r8 == 0) goto L_0x0054
            if (r9 == 0) goto L_0x012a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.0Jd r1 = new X.0Jd
            r1.<init>(r0, r9)
        L_0x00c8:
            java.util.HashMap r0 = r8.A00()
            java.lang.Object r1 = X.C05020Qb.A02(r1, r0)
            X.0Hk r1 = (X.C03290Hk) r1
            if (r17 != 0) goto L_0x01c2
            if (r1 == 0) goto L_0x01c2
            java.util.List r0 = r8.A04
            r0.add(r1)
            int r9 = r1.A01
            java.util.HashMap r13 = r8.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r13.get(r3)
            X.0Cn r0 = (X.C02050Cn) r0
            if (r0 == 0) goto L_0x0128
            int r1 = r0.A01
        L_0x00ed:
            int r0 = r8.A01
            int r1 = r1 + r0
            r6.A03 = r1
            java.lang.Object r0 = r13.get(r3)
            X.0Cn r0 = (X.C02050Cn) r0
            if (r0 == 0) goto L_0x0126
            int r11 = r0.A02
        L_0x00fc:
            int r12 = r8.A00
            int r7 = r11 - r12
            if (r11 <= r12) goto L_0x0177
            java.util.Collection r0 = r13.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x010a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r1 = r3.next()
            X.0Cn r1 = (X.C02050Cn) r1
            int r0 = r1.A02
            if (r0 != r11) goto L_0x011d
            r1.A02 = r12
            goto L_0x010a
        L_0x011d:
            if (r12 > r0) goto L_0x010a
            if (r0 >= r11) goto L_0x010a
            int r0 = r0 + 1
            r1.A02 = r0
            goto L_0x010a
        L_0x0126:
            r11 = -1
            goto L_0x00fc
        L_0x0128:
            r1 = -1
            goto L_0x00ed
        L_0x012a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x00c8
        L_0x012f:
            r0 = 0
            goto L_0x00b0
        L_0x0131:
            X.0NZ r13 = r6.A0B
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            int r0 = r13.A04
            if (r0 > 0) goto L_0x0169
            int r11 = r13.A01
        L_0x013d:
            int r0 = r13.A00
            if (r11 >= r0) goto L_0x0169
            int[] r14 = r13.A08
            int r0 = r11 * 5
            r1 = r14[r0]
            java.lang.Object r16 = X.AnonymousClass0NZ.A00(r13, r14, r11)
            boolean r0 = X.C04780Ot.A03(r14, r11)
            if (r0 == 0) goto L_0x0162
            r15 = 1
        L_0x0152:
            X.0Hk r8 = new X.0Hk
            r0 = r16
            r8.<init>(r0, r1, r11, r15)
            r12.add(r8)
            int r0 = X.AnonymousClass000.A0S(r14, r11)
            int r11 = r11 + r0
            goto L_0x013d
        L_0x0162:
            int r0 = r11 * 5
            int r15 = X.AnonymousClass000.A0R(r14, r0)
            goto L_0x0152
        L_0x0169:
            int r1 = r6.A03
            X.0Iz r0 = new X.0Iz
            r0.<init>(r12, r1)
            r6.A08 = r0
            goto L_0x00b9
        L_0x0174:
            r0 = 0
            goto L_0x00a4
        L_0x0177:
            if (r12 <= r11) goto L_0x019f
            java.util.Collection r0 = r13.values()
            java.util.Iterator r8 = r0.iterator()
        L_0x0181:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r3 = r8.next()
            X.0Cn r3 = (X.C02050Cn) r3
            int r1 = r3.A02
            if (r1 != r11) goto L_0x0194
            r3.A02 = r12
            goto L_0x0181
        L_0x0194:
            int r0 = r11 + 1
            if (r0 > r1) goto L_0x0181
            if (r1 >= r12) goto L_0x0181
            int r0 = r1 + -1
            r3.A02 = r0
            goto L_0x0181
        L_0x019f:
            X.0Po r3 = r6.A0b
            int r1 = r3.A03
            X.0VR r0 = r3.A09
            X.0NZ r0 = r0.A0B
            int r0 = r0.A01
            int r0 = r9 - r0
            int r1 = r1 + r0
            r3.A03 = r1
            X.0NZ r0 = r6.A0B
            r0.A0C(r9)
            if (r7 <= 0) goto L_0x01bd
            X.C04930Po.A01(r3)
            X.0Kg r0 = r3.A05
            r0.A01(r7)
        L_0x01bd:
            r6.A0W(r4, r10)
            goto L_0x0054
        L_0x01c2:
            X.0NZ r1 = r6.A0B
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            r6.A0K = r3
            r6.A0A = r2
            X.0Qu r11 = r6.A0D
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x01ec
            X.0Yd r0 = r6.A0C
            X.0Qu r11 = r0.A05()
            r6.A0D = r11
            int r1 = r11.A01
            r11.A00 = r1
            int[] r0 = r11.A0G
            int r0 = X.AnonymousClass0Qu.A02(r11, r0, r1)
            r11.A02 = r0
            r6.A0Q = r5
            r6.A0A = r2
        L_0x01ec:
            r11.A0Q()
            X.0Qu r2 = r6.A0D
            int r1 = r2.A00
            if (r4 == 0) goto L_0x0225
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            X.AnonymousClass0Qu.A0J(r2, r0, r0, r7, r3)
        L_0x01fa:
            X.0Qu r0 = r6.A0D
            X.0Cr r0 = r0.A0M(r1)
            r6.A0T = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            int r2 = -2 - r1
            X.0Hk r1 = new X.0Hk
            r0 = r18
            r1.<init>(r3, r7, r2, r0)
            A0O(r6, r1, r8)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            if (r4 != 0) goto L_0x021c
            int r0 = r6.A03
            r19 = r0
        L_0x021c:
            X.0Iz r2 = new X.0Iz
            r0 = r19
            r2.<init>(r1, r0)
            goto L_0x0054
        L_0x0225:
            if (r10 == 0) goto L_0x022f
            if (r9 != 0) goto L_0x022b
            java.lang.Object r9 = X.AnonymousClass0MH.A00
        L_0x022b:
            X.AnonymousClass0Qu.A0J(r2, r9, r10, r7, r5)
            goto L_0x01fa
        L_0x022f:
            if (r9 != 0) goto L_0x0233
            java.lang.Object r9 = X.AnonymousClass0MH.A00
        L_0x0233:
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            X.AnonymousClass0Qu.A0J(r2, r9, r0, r7, r5)
            goto L_0x01fa
        L_0x0239:
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            X.C05020Qb.A06(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A0P(X.0VR, java.lang.Object, java.lang.Object, int, int):void");
    }

    public static final void A0R(AnonymousClass0VR r21, boolean z) {
        int i;
        Object A002;
        Object A062;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AnonymousClass0VR r14 = r21;
        if (r14.A0K) {
            AnonymousClass0Qu r7 = r14.A0D;
            int i9 = r7.A08;
            int[] iArr = r7.A0G;
            int A012 = AnonymousClass0Qu.A01(r7, i9);
            int i10 = A012 * 5;
            i = iArr[i10];
            int i11 = iArr[i10 + 1];
            if ((536870912 & i11) != 0) {
                A002 = r7.A0H[iArr[i10 + 4] + C04780Ot.A00(i11 >> 30)];
            } else {
                A002 = null;
            }
            if ((268435456 & i11) != 0) {
                A062 = r7.A0H[AnonymousClass0Qu.A03(r7, iArr, A012) + C04780Ot.A00(i11 >> 29)];
            } else {
                A062 = AnonymousClass0MH.A00;
            }
        } else {
            AnonymousClass0NZ r3 = r14.A0B;
            int i12 = r3.A05;
            int[] iArr2 = r3.A08;
            i = iArr2[i12 * 5];
            A002 = AnonymousClass0NZ.A00(r3, iArr2, i12);
            A062 = r3.A06(i12);
        }
        r14.A01 = Integer.rotateRight(A03(A002, A062, i) ^ r14.A01, 3);
        int i13 = r14.A02;
        C03620Iz r12 = r14.A08;
        if (r12 != null && r12.A03.size() > 0) {
            List list = r12.A03;
            List list2 = r12.A04;
            HashSet hashSet = new HashSet(list2.size());
            int size = list2.size();
            for (int i14 = 0; i14 < size; i14++) {
                hashSet.add(list2.get(i14));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = list2.size();
            int size3 = list.size();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < size3) {
                C03290Hk r1 = (C03290Hk) list.get(i15);
                if (!hashSet.contains(r1)) {
                    C02050Cn r0 = (C02050Cn) r12.A02.get(Integer.valueOf(r1.A01));
                    if (r0 != null) {
                        i8 = r0.A01;
                    } else {
                        i8 = -1;
                    }
                    C04930Po r32 = r14.A0b;
                    r32.A05(i8 + r12.A01, r1.A02);
                    int i18 = r1.A01;
                    r12.A01(i18, 0);
                    r32.A03 += i18 - r32.A09.A0B.A01;
                    r14.A0B.A0C(i18);
                    r14.A0B();
                    AnonymousClass0NZ r02 = r14.A0B;
                    r02.A01();
                    C05020Qb.A07(r14.A0c, i18, AnonymousClass000.A0S(r02.A08, i18) + i18);
                } else if (!linkedHashSet.contains(r1)) {
                    if (i16 < size2) {
                        C03290Hk r72 = (C03290Hk) list2.get(i16);
                        if (r72 != r1) {
                            HashMap hashMap = r12.A02;
                            C02050Cn r03 = (C02050Cn) hashMap.get(Integer.valueOf(r72.A01));
                            if (r03 != null) {
                                i4 = r03.A01;
                            } else {
                                i4 = -1;
                            }
                            linkedHashSet.add(r72);
                            if (i4 != i17) {
                                C02050Cn r04 = (C02050Cn) hashMap.get(Integer.valueOf(r72.A01));
                                if (r04 != null) {
                                    i5 = r04.A00;
                                } else {
                                    i5 = r72.A02;
                                }
                                C04930Po r4 = r14.A0b;
                                int i19 = r12.A01;
                                int i20 = i19 + i4;
                                int i21 = i17 + i19;
                                if (i5 > 0) {
                                    int i22 = r4.A00;
                                    if (i22 > 0 && r4.A01 == i20 - i22 && r4.A02 == i21 - i22) {
                                        r4.A00 = i22 + i5;
                                    } else {
                                        C04930Po.A02(r4);
                                        r4.A01 = i20;
                                        r4.A02 = i21;
                                        r4.A00 = i5;
                                    }
                                }
                                if (i4 > i17) {
                                    for (C02050Cn r2 : hashMap.values()) {
                                        int i23 = r2.A01;
                                        if (i4 <= i23 && i23 < i4 + i5) {
                                            i7 = (i23 - i4) + i17;
                                        } else if (i17 <= i23 && i23 < i4) {
                                            i7 = i23 + i5;
                                        }
                                        r2.A01 = i7;
                                    }
                                } else if (i17 > i4) {
                                    for (C02050Cn r22 : hashMap.values()) {
                                        int i24 = r22.A01;
                                        if (i4 <= i24 && i24 < i4 + i5) {
                                            i6 = (i24 - i4) + i17;
                                        } else if (i4 + 1 <= i24 && i24 < i17) {
                                            i6 = i24 - i5;
                                        }
                                        r22.A01 = i6;
                                    }
                                }
                            }
                        } else {
                            i15++;
                        }
                        i16++;
                        C02050Cn r05 = (C02050Cn) r12.A02.get(Integer.valueOf(r72.A01));
                        if (r05 != null) {
                            i3 = r05.A00;
                        } else {
                            i3 = r72.A02;
                        }
                        i17 += i3;
                    }
                }
                i15++;
            }
            C04930Po r42 = r14.A0b;
            C04930Po.A02(r42);
            if (list.size() > 0) {
                AnonymousClass0NZ r33 = r14.A0B;
                r42.A03 += r33.A00 - r42.A09.A0B.A01;
                r33.A0A();
            }
        }
        int i25 = r14.A03;
        while (true) {
            AnonymousClass0NZ r13 = r14.A0B;
            if (r13.A04 > 0 || (i2 = r13.A01) == r13.A00) {
                boolean z2 = r14.A0K;
            } else {
                r14.A0B();
                r14.A0b.A05(i25, r14.A0B.A01());
                C05020Qb.A07(r14.A0c, i2, r14.A0B.A01);
            }
        }
        boolean z22 = r14.A0K;
        if (z22) {
            if (z) {
                C03450If r23 = r14.A0H;
                C04910Pm r15 = r23.A01;
                if (r15.A02 != 0) {
                    r15.A07(r23.A00);
                    i13 = 1;
                } else {
                    str = "Cannot end node insertion, there are no pending operations that can be realized.";
                    C05020Qb.A06(str);
                    throw null;
                }
            }
            AnonymousClass0NZ r43 = r14.A0B;
            int i26 = r43.A04;
            if (i26 > 0) {
                r43.A04 = i26 - 1;
                AnonymousClass0Qu r24 = r14.A0D;
                int i27 = r24.A08;
                r24.A0S();
                if (r43.A04 <= 0) {
                    int i28 = -2 - i27;
                    r24.A0T();
                    r24.A0R();
                    C02090Cr r5 = r14.A0T;
                    C03450If r44 = r14.A0H;
                    boolean A1P = AnonymousClass000.A1P(r44.A00.A02);
                    C04930Po r16 = r14.A0b;
                    C06390Yd r06 = r14.A0C;
                    if (A1P) {
                        r16.A06(r5, r06);
                    } else {
                        r16.A07(r5, r06, r44);
                        r14.A0H = new C03450If();
                    }
                    r14.A0K = false;
                    if (!r14.A0Y.A0C()) {
                        r14.A0F(i28, 0);
                        r14.A0G(i28, i13);
                    }
                }
            } else {
                throw AnonymousClass000.A0k("Unbalanced begin/end empty");
            }
        } else {
            if (z) {
                r14.A0b.A04();
            }
            C04930Po r25 = r14.A0b;
            int i29 = r25.A09.A0B.A05;
            C04330Mt r45 = r25.A0A;
            int i30 = -1;
            int i31 = r45.A00;
            if (i31 > 0) {
                i30 = r45.A01[i31 - 1];
            }
            if (i30 <= i29) {
                if (i30 == i29) {
                    C04930Po.A03(r25, false);
                    r45.A00--;
                    r25.A05.A00.A06(AnonymousClass07Y.A00);
                }
                int i32 = r14.A0B.A05;
                if (i13 != r14.A00(i32)) {
                    r14.A0G(i32, i13);
                }
                if (z) {
                    i13 = 1;
                }
                r14.A0B.A09();
                C04930Po.A02(r25);
            } else {
                str = "Missed recording an endGroup";
                C05020Qb.A06(str);
                throw null;
            }
        }
        ArrayList arrayList = r14.A0a.A00;
        C03620Iz r17 = (C03620Iz) arrayList.remove(AnonymousClass000.A0Q(arrayList));
        if (r17 != null && !z22) {
            r17.A00++;
        }
        r14.A08 = r17;
        r14.A03 = C04330Mt.A00(r14.A07) + i13;
        r14.A02 = C04330Mt.A00(r14.A06) + i13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = r12.A0Y;
        r12.A0B = r7.A04();
        r9 = 0;
        A0P(r12, (java.lang.Object) null, (java.lang.Object) null, 100, 0);
        r6 = r12.A0V;
        r6.A0U();
        r12.A09 = r6.A0S();
        r12.A0X.A01(r12.A0N ? 1 : 0);
        r12.A0N = BEf(r12.A09);
        r12.A0A = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
        if (r12.A0J != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        r12.A0J = r6.A0e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        if (r12.A0P != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        r12.A0P = r6.A0f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        r0 = (java.util.Set) X.C04450Nl.A01(X.AnonymousClass0GA.A00, r12.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        if (r0 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        r0.add(r7);
        r6.A0d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        A0P(r12, (java.lang.Object) null, (java.lang.Object) null, r6.A0X(), 0);
        r8 = A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        if (r8 == r14) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        if (r14 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        A0c(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        r0 = r12.A0g;
        r5 = X.AnonymousClass0PF.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ba, code lost:
        if (r14 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        if (r12.A0N == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        if (r8 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        if (r8.equals(X.AnonymousClass0MH.A00) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        A0P(r12, X.C05020Qb.A01, (java.lang.Object) null, 200, 0);
        X.C41681wt.A04(r8, 2);
        A0I(r12, (X.AnonymousClass1OS) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        A0P(r12, X.C05020Qb.A01, (java.lang.Object) null, 200, 0);
        A0I(r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        A0R(r12, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        if (r3.isEmpty() == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r12.A02 += r12.A0B.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fe, code lost:
        r10 = r12.A0B;
        r8 = r10.A01;
        r7 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0104, code lost:
        if (r8 >= r7) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        r9 = r10.A08[r8 * 5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010c, code lost:
        if (r8 >= r7) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        r8 = X.AnonymousClass0NZ.A00(r10, r10.A08, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        r7 = r10.A04();
        r12.A01 = A03(r8, r7, r9) ^ java.lang.Integer.rotateLeft(r12.A01, 3);
        A0W(X.C04780Ot.A03(r10.A08, r10.A01), (java.lang.Object) null);
        A0A();
        r10.A09();
        r12.A01 = java.lang.Integer.rotateRight(A03(r8, r7, r9) ^ r12.A01, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r5.A06(r5.A00 - 1);
        A0R(r12, false);
        r6.A0T();
        A0R(r12, false);
        r4 = r12.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015c, code lost:
        if (r4.A06 == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        X.C04930Po.A03(r4, false);
        X.C04930Po.A03(r4, false);
        r4.A05.A00.A06(X.AnonymousClass07Y.A00);
        r4.A06 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        X.C04930Po.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0176, code lost:
        if (r4.A0A.A00 != 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0180, code lost:
        if (r12.A0a.A00.isEmpty() == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0182, code lost:
        A0N(r12);
        r12.A0B.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r12.A0L = false;
        r3.clear();
        A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0196, code lost:
        r0 = "Start/end imbalance";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0199, code lost:
        r0 = "Missed recording an endGroup()";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.C05020Qb.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r5.A06(r5.A00 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r12.A0L = false;
        r3.clear();
        A0M(r12);
        A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r3 = r12.A0c;
        X.C29391cC.A0H(r3, X.C05020Qb.A05);
        r12.A03 = 0;
        r12.A0L = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0S(X.AnonymousClass0OL r13, X.AnonymousClass1OS r14) {
        /*
            r12 = this;
            boolean r0 = r12.A0L
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = "Compose:recompose"
            android.os.Trace.beginSection(r0)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C05200Qx.A01()     // Catch:{ all -> 0x01b5 }
            int r0 = r0.A04()     // Catch:{ all -> 0x01b5 }
            r12.A0S = r0     // Catch:{ all -> 0x01b5 }
            r0 = 0
            r12.A0I = r0     // Catch:{ all -> 0x01b5 }
            int r8 = r13.A00     // Catch:{ all -> 0x01b5 }
            r2 = 0
            r7 = 0
        L_0x001d:
            if (r7 >= r8) goto L_0x0043
            java.lang.Object[] r0 = r13.A01     // Catch:{ all -> 0x01b5 }
            r6 = r0[r7]     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            X.C18070vi.A0z(r6, r0)     // Catch:{ all -> 0x01b5 }
            java.lang.Object[] r0 = r13.A02     // Catch:{ all -> 0x01b5 }
            r5 = r0[r7]     // Catch:{ all -> 0x01b5 }
            X.0aB r5 = (X.C06990aB) r5     // Catch:{ all -> 0x01b5 }
            X.0Vf r6 = (X.C05660Vf) r6     // Catch:{ all -> 0x01b5 }
            X.0Cr r0 = r6.A04     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x0192
            int r3 = r0.A00     // Catch:{ all -> 0x01b5 }
            java.util.List r1 = r12.A0c     // Catch:{ all -> 0x01b5 }
            X.0Jr r0 = new X.0Jr     // Catch:{ all -> 0x01b5 }
            r0.<init>(r6, r5, r3)     // Catch:{ all -> 0x01b5 }
            r1.add(r0)     // Catch:{ all -> 0x01b5 }
            int r7 = r7 + 1
            goto L_0x001d
        L_0x0043:
            java.util.List r3 = r12.A0c     // Catch:{ all -> 0x01b5 }
            java.util.Comparator r0 = X.C05020Qb.A05     // Catch:{ all -> 0x01b5 }
            X.C29391cC.A0H(r3, r0)     // Catch:{ all -> 0x01b5 }
            r12.A03 = r2     // Catch:{ all -> 0x01b5 }
            r12.A0L = r4     // Catch:{ all -> 0x01b5 }
            X.0Yd r7 = r12.A0Y     // Catch:{ all -> 0x01a8 }
            X.0NZ r0 = r7.A04()     // Catch:{ all -> 0x01a8 }
            r12.A0B = r0     // Catch:{ all -> 0x01a8 }
            r0 = 100
            r9 = 0
            r5 = 0
            A0P(r12, r5, r5, r0, r2)     // Catch:{ all -> 0x01a8 }
            X.0D1 r6 = r12.A0V     // Catch:{ all -> 0x01a8 }
            r6.A0U()     // Catch:{ all -> 0x01a8 }
            X.0uW r0 = r6.A0S()     // Catch:{ all -> 0x01a8 }
            r12.A09 = r0     // Catch:{ all -> 0x01a8 }
            X.0Mt r1 = r12.A0X     // Catch:{ all -> 0x01a8 }
            boolean r0 = r12.A0N     // Catch:{ all -> 0x01a8 }
            r1.A01(r0)     // Catch:{ all -> 0x01a8 }
            X.0uW r0 = r12.A09     // Catch:{ all -> 0x01a8 }
            boolean r0 = r12.BEf(r0)     // Catch:{ all -> 0x01a8 }
            r12.A0N = r0     // Catch:{ all -> 0x01a8 }
            r12.A0A = r5     // Catch:{ all -> 0x01a8 }
            boolean r0 = r12.A0J     // Catch:{ all -> 0x01a8 }
            if (r0 != 0) goto L_0x0083
            boolean r0 = r6.A0e()     // Catch:{ all -> 0x01a8 }
            r12.A0J = r0     // Catch:{ all -> 0x01a8 }
        L_0x0083:
            boolean r0 = r12.A0P     // Catch:{ all -> 0x01a8 }
            if (r0 != 0) goto L_0x008d
            boolean r0 = r6.A0f()     // Catch:{ all -> 0x01a8 }
            r12.A0P = r0     // Catch:{ all -> 0x01a8 }
        L_0x008d:
            X.0uW r1 = r12.A09     // Catch:{ all -> 0x01a8 }
            X.07W r0 = X.AnonymousClass0GA.A00     // Catch:{ all -> 0x01a8 }
            java.lang.Object r0 = X.C04450Nl.A01(r0, r1)     // Catch:{ all -> 0x01a8 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x009f
            r0.add(r7)     // Catch:{ all -> 0x01a8 }
            r6.A0d(r0)     // Catch:{ all -> 0x01a8 }
        L_0x009f:
            int r0 = r6.A0X()     // Catch:{ all -> 0x01a8 }
            A0P(r12, r5, r5, r0, r2)     // Catch:{ all -> 0x01a8 }
            java.lang.Object r8 = r12.A0a()     // Catch:{ all -> 0x01a8 }
            if (r8 == r14) goto L_0x00b1
            if (r14 == 0) goto L_0x00b1
            r12.A0c(r14)     // Catch:{ all -> 0x01a8 }
        L_0x00b1:
            X.0VU r0 = r12.A0g     // Catch:{ all -> 0x01a8 }
            X.0a9 r5 = X.AnonymousClass0PF.A02()     // Catch:{ all -> 0x01a8 }
            r5.A0F(r0)     // Catch:{ all -> 0x01a0 }
            if (r14 == 0) goto L_0x00bd
            goto L_0x00dd
        L_0x00bd:
            boolean r0 = r12.A0N     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00ec
            if (r8 == 0) goto L_0x00ec
            java.lang.Object r0 = X.AnonymousClass0MH.A00     // Catch:{ all -> 0x01a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x00ec
            java.lang.Object r7 = X.C05020Qb.A01     // Catch:{ all -> 0x01a0 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 0
            A0P(r12, r7, r0, r1, r2)     // Catch:{ all -> 0x01a0 }
            r0 = 2
            X.C41681wt.A04(r8, r0)     // Catch:{ all -> 0x01a0 }
            X.1OS r8 = (X.AnonymousClass1OS) r8     // Catch:{ all -> 0x01a0 }
            A0I(r12, r8)     // Catch:{ all -> 0x01a0 }
            goto L_0x00e8
        L_0x00dd:
            java.lang.Object r7 = X.C05020Qb.A01     // Catch:{ all -> 0x01a0 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 0
            A0P(r12, r7, r0, r1, r2)     // Catch:{ all -> 0x01a0 }
            A0I(r12, r14)     // Catch:{ all -> 0x01a0 }
        L_0x00e8:
            A0R(r12, r2)     // Catch:{ all -> 0x01a0 }
            goto L_0x0149
        L_0x00ec:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00fe
            int r1 = r12.A02     // Catch:{ all -> 0x01a0 }
            X.0NZ r0 = r12.A0B     // Catch:{ all -> 0x01a0 }
            int r0 = r0.A01()     // Catch:{ all -> 0x01a0 }
            int r1 = r1 + r0
            r12.A02 = r1     // Catch:{ all -> 0x01a0 }
            goto L_0x0149
        L_0x00fe:
            X.0NZ r10 = r12.A0B     // Catch:{ all -> 0x01a0 }
            int r8 = r10.A01     // Catch:{ all -> 0x01a0 }
            int r7 = r10.A00     // Catch:{ all -> 0x01a0 }
            if (r8 >= r7) goto L_0x010c
            int[] r1 = r10.A08     // Catch:{ all -> 0x01a0 }
            int r0 = r8 * 5
            r9 = r1[r0]     // Catch:{ all -> 0x01a0 }
        L_0x010c:
            if (r8 >= r7) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r8 = 0
            goto L_0x0117
        L_0x0111:
            int[] r0 = r10.A08     // Catch:{ all -> 0x01a0 }
            java.lang.Object r8 = X.AnonymousClass0NZ.A00(r10, r0, r8)     // Catch:{ all -> 0x01a0 }
        L_0x0117:
            java.lang.Object r7 = r10.A04()     // Catch:{ all -> 0x01a0 }
            int r11 = A03(r8, r7, r9)     // Catch:{ all -> 0x01a0 }
            int r1 = r12.A01     // Catch:{ all -> 0x01a0 }
            r0 = 3
            int r0 = java.lang.Integer.rotateLeft(r1, r0)     // Catch:{ all -> 0x01a0 }
            r11 = r11 ^ r0
            r12.A01 = r11     // Catch:{ all -> 0x01a0 }
            int[] r1 = r10.A08     // Catch:{ all -> 0x01a0 }
            int r0 = r10.A01     // Catch:{ all -> 0x01a0 }
            boolean r1 = X.C04780Ot.A03(r1, r0)     // Catch:{ all -> 0x01a0 }
            r0 = 0
            r12.A0W(r1, r0)     // Catch:{ all -> 0x01a0 }
            r12.A0A()     // Catch:{ all -> 0x01a0 }
            r10.A09()     // Catch:{ all -> 0x01a0 }
            int r1 = A03(r8, r7, r9)     // Catch:{ all -> 0x01a0 }
            int r0 = r12.A01     // Catch:{ all -> 0x01a0 }
            r1 = r1 ^ r0
            r0 = 3
            int r0 = java.lang.Integer.rotateRight(r1, r0)     // Catch:{ all -> 0x01a0 }
            r12.A01 = r0     // Catch:{ all -> 0x01a0 }
        L_0x0149:
            int r0 = r5.A00     // Catch:{ all -> 0x01a8 }
            int r0 = r0 - r4
            r5.A06(r0)     // Catch:{ all -> 0x01a8 }
            A0R(r12, r2)     // Catch:{ all -> 0x01a8 }
            r6.A0T()     // Catch:{ all -> 0x01a8 }
            A0R(r12, r2)     // Catch:{ all -> 0x01a8 }
            X.0Po r4 = r12.A0b     // Catch:{ all -> 0x01a8 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x016f
            X.C04930Po.A03(r4, r2)     // Catch:{ all -> 0x01a8 }
            X.C04930Po.A03(r4, r2)     // Catch:{ all -> 0x01a8 }
            X.0Kg r0 = r4.A05     // Catch:{ all -> 0x01a8 }
            X.0Pm r1 = r0.A00     // Catch:{ all -> 0x01a8 }
            X.07Y r0 = X.AnonymousClass07Y.A00     // Catch:{ all -> 0x01a8 }
            r1.A06(r0)     // Catch:{ all -> 0x01a8 }
            r4.A06 = r2     // Catch:{ all -> 0x01a8 }
        L_0x016f:
            X.C04930Po.A00(r4)     // Catch:{ all -> 0x01a8 }
            X.0Mt r0 = r4.A0A     // Catch:{ all -> 0x01a8 }
            int r0 = r0.A00     // Catch:{ all -> 0x01a8 }
            if (r0 != 0) goto L_0x0199
            X.0H8 r0 = r12.A0a     // Catch:{ all -> 0x01a8 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x01a8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01a8 }
            if (r0 == 0) goto L_0x0196
            A0N(r12)     // Catch:{ all -> 0x01a8 }
            X.0NZ r0 = r12.A0B     // Catch:{ all -> 0x01a8 }
            r0.A08()     // Catch:{ all -> 0x01a8 }
            r12.A0L = r2     // Catch:{ all -> 0x01b5 }
            r3.clear()     // Catch:{ all -> 0x01b5 }
            r12.A09()     // Catch:{ all -> 0x01b5 }
        L_0x0192:
            android.os.Trace.endSection()
            return
        L_0x0196:
            java.lang.String r0 = "Start/end imbalance"
            goto L_0x019b
        L_0x0199:
            java.lang.String r0 = "Missed recording an endGroup()"
        L_0x019b:
            X.C05020Qb.A06(r0)     // Catch:{ all -> 0x01a8 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x01a8 }
        L_0x01a0:
            r1 = move-exception
            int r0 = r5.A00     // Catch:{ all -> 0x01a8 }
            int r0 = r0 - r4
            r5.A06(r0)     // Catch:{ all -> 0x01a8 }
            throw r1     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            r12.A0L = r2     // Catch:{ all -> 0x01b5 }
            r3.clear()     // Catch:{ all -> 0x01b5 }
            A0M(r12)     // Catch:{ all -> 0x01b5 }
            r12.A09()     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x01ba:
            java.lang.String r0 = "Reentrant composition is not supported"
            X.C05020Qb.A06(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A0S(X.0OL, X.1OS):void");
    }

    public static void A0T(Object obj) {
        A0R((AnonymousClass0VR) obj, false);
    }

    public static void A0V(Object obj, Object obj2) {
        ((AnonymousClass0VR) obj).A0c(obj2);
    }

    private final void A0W(boolean z, Object obj) {
        if (z) {
            AnonymousClass0NZ r2 = this.A0B;
            if (r2.A04 > 0) {
                return;
            }
            if (C04780Ot.A03(r2.A08, r2.A01)) {
                r2.A0B();
                return;
            }
            throw AnonymousClass000.A0k("Expected a node group");
        }
        if (!(obj == null || this.A0B.A04() == obj)) {
            C04930Po r1 = this.A0b;
            C04930Po.A03(r1, false);
            r1.A05.A0A(obj);
        }
        this.A0B.A0B();
    }

    public final C05660Vf A0Z() {
        AnonymousClass0H8 r1 = this.A0Z;
        if (this.A00 != 0) {
            return null;
        }
        ArrayList arrayList = r1.A00;
        if (!arrayList.isEmpty()) {
            return (C05660Vf) arrayList.get(AnonymousClass000.A0Q(arrayList));
        }
        return null;
    }

    public final Object A0a() {
        if (!this.A0K) {
            Object A052 = this.A0B.A05();
            if (!this.A0O || (A052 instanceof C17310uS)) {
                return A052;
            }
        } else if (!(!this.A0M)) {
            C05020Qb.A06("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return AnonymousClass0MH.A00;
    }

    public final void A0b(AnonymousClass0OL r2, AnonymousClass1OS r3) {
        if (this.A0E.A00.A02 == 0) {
            A0S(r2, r3);
        } else {
            C05020Qb.A06("Expected applyChanges() to have been called");
            throw null;
        }
    }

    public final void A0c(Object obj) {
        if (this.A0K) {
            AnonymousClass0Qu r5 = this.A0D;
            if (r5.A06 > 0) {
                AnonymousClass0Qu.A0E(r5, 1, r5.A08);
            }
            Object[] objArr = r5.A0H;
            int i = r5.A02 + 1;
            r5.A02 = i;
            int i2 = r5.A0B;
            if (i <= r5.A03) {
                int i3 = i - 1;
                if (i3 >= i2) {
                    i3 += r5.A09;
                }
                objArr[i3] = obj;
                return;
            }
            C05020Qb.A06("Writing to an invalid slot");
            throw null;
        }
        AnonymousClass0NZ r0 = this.A0B;
        C04930Po r1 = this.A0b;
        C04930Po.A03(r1, true);
        r1.A05.A0B(obj, (r0.A02 - C04780Ot.A02(r0.A08, r0.A05)) - 1);
    }

    public final void A0d(C18090vk r3) {
        if (!this.A0L) {
            this.A0L = true;
            try {
                r3.invoke();
            } finally {
                this.A0L = false;
            }
        } else {
            C05020Qb.A06("Preparing a composition while composing is not supported");
            throw null;
        }
    }

    public final boolean A0e(C05660Vf r5, Object obj) {
        C02090Cr r1 = r5.A04;
        if (r1 != null) {
            AnonymousClass0NZ r2 = this.A0B;
            int A002 = r1.A00(r2.A03());
            if (this.A0L && A002 >= r2.A01) {
                C05020Qb.A03(r5, obj, this.A0c, A002);
                return true;
            }
        }
        return false;
    }

    public final boolean A0f(AnonymousClass0OL r3) {
        C04910Pm r1 = this.A0E.A00;
        if (r1.A02 == 0) {
            if (r3.A00 > 0 || AnonymousClass000.A1a(this.A0c)) {
                A0S(r3, (AnonymousClass1OS) null);
                if (r1.A02 == 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        C05020Qb.A06("Expected applyChanges() to have been called");
        throw null;
    }

    public void BCJ(Object obj, AnonymousClass1OS r3) {
        if (this.A0K) {
            this.A0H.A01(obj, r3);
        } else {
            this.A0b.A09(obj, r3);
        }
    }

    public AnonymousClass07S BDX() {
        C05730Vm r1;
        A0P(this, C05020Qb.A04, (Object) null, 206, 0);
        AnonymousClass0EH r7 = null;
        if (this.A0K) {
            AnonymousClass0Qu r5 = this.A0D;
            int i = r5.A08;
            int A012 = AnonymousClass0Qu.A01(r5, i);
            int[] iArr = r5.A0G;
            int i2 = (A012 * 5) + 1;
            int i3 = iArr[i2];
            if ((134217728 & i3) == 0) {
                int i4 = i3 | 134217728;
                iArr[i2] = i4;
                if ((i4 & 67108864) == 0) {
                    AnonymousClass0Qu.A0D(r5, AnonymousClass0Qu.A04(r5, iArr, i));
                }
            }
        }
        Object A0a2 = A0a();
        if (!(A0a2 instanceof C05730Vm) || (r1 = (C05730Vm) A0a2) == null) {
            int i5 = this.A01;
            boolean z = this.A0J;
            boolean z2 = this.A0P;
            AnonymousClass0VT r0 = (AnonymousClass0VT) this.A0W;
            if (r0 != null) {
                r7 = r0.A06;
            }
            r1 = new C05730Vm(new AnonymousClass07S(this, r7, i5, z, z2));
            A0c(r1);
        }
        AnonymousClass07S r2 = r1.A00;
        C17350uW r12 = this.A0A;
        if (r12 == null) {
            r12 = A05(this.A0B.A05);
        }
        r2.A01.setValue(r12);
        A0R(this, false);
        return r2;
    }

    public Object BFh(AnonymousClass0OI r2) {
        C17350uW r0 = this.A0A;
        if (r0 == null) {
            r0 = A05(this.A0B.A05);
        }
        return C04450Nl.A01(r2, r0);
    }

    public void BHe(C18090vk r4) {
        String str;
        if (this.A0M) {
            this.A0M = false;
            if (this.A0K) {
                C04330Mt r0 = this.A07;
                int i = r0.A01[r0.A00 - 1];
                AnonymousClass0Qu r1 = this.A0D;
                C02090Cr A0M2 = r1.A0M(r1.A08);
                this.A02++;
                this.A0H.A00(A0M2, r4, i);
                return;
            }
            str = "createNode() can only be called when inserting";
        } else {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        }
        C05020Qb.A06(str);
        throw null;
    }

    public void BI3(boolean z) {
        if (this.A02 != 0) {
            C05020Qb.A06("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        } else if (this.A0K) {
        } else {
            if (!z) {
                A0C();
                return;
            }
            AnonymousClass0NZ r0 = this.A0B;
            int i = r0.A01;
            int i2 = r0.A00;
            C04930Po r1 = this.A0b;
            C04930Po.A03(r1, false);
            r1.A05.A00.A06(AnonymousClass07X.A00);
            C05020Qb.A07(this.A0c, i, i2);
            this.A0B.A0A();
        }
    }

    public void BJy() {
        this.A0O = AnonymousClass000.A1Q(this.A04);
    }

    public C05660Vf BKF() {
        C05660Vf r3;
        C02090Cr A022;
        ArrayList arrayList = this.A0Z.A00;
        C05660Vf r5 = null;
        if (!arrayList.isEmpty()) {
            r3 = (C05660Vf) arrayList.remove(AnonymousClass000.A0Q(arrayList));
        } else {
            r3 = null;
        }
        if (r3 != null) {
            r3.A01 &= -9;
            C11260jk A002 = r3.A00(this.A0S);
            if (A002 != null) {
                this.A0b.A08(this.A0W, A002);
            }
            int i = r3.A01;
            if ((i & 16) == 0 && ((i & 1) != 0 || this.A0J)) {
                if (r3.A04 == null) {
                    if (this.A0K) {
                        AnonymousClass0Qu r1 = this.A0D;
                        A022 = r1.A0M(r1.A08);
                    } else {
                        AnonymousClass0NZ r12 = this.A0B;
                        A022 = r12.A02(r12.A05);
                    }
                    r3.A04 = A022;
                }
                r3.A01 &= -5;
                r5 = r3;
            }
        }
        A0R(this, false);
        return r5;
    }

    public void BKG() {
        if (this.A0O && this.A0B.A05 == this.A04) {
            this.A04 = -1;
            this.A0O = false;
        }
        A0R(this, false);
    }

    public C18560wh BN8() {
        return this.A0V.A0Y();
    }

    public C17350uW BPs() {
        C17350uW r0 = this.A0A;
        if (r0 == null) {
            return A05(this.A0B.A05);
        }
        return r0;
    }

    public boolean BZO() {
        C05660Vf A0Z2;
        if (this.A0K || this.A0O || this.A0N || (A0Z2 = A0Z()) == null || (A0Z2.A01 & 8) != 0) {
            return false;
        }
        return true;
    }

    public void CDj(C18090vk r2) {
        this.A0b.A0A(r2);
    }

    public Object CER() {
        if (!this.A0K) {
            Object A052 = this.A0B.A05();
            if (!this.A0O || (A052 instanceof C17310uS)) {
                if (A052 instanceof C02030Cj) {
                    return ((C02030Cj) A052).A00;
                }
                return A052;
            }
        } else if (!(!this.A0M)) {
            C05020Qb.A06("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return AnonymousClass0MH.A00;
    }

    public void CNR() {
        if (this.A02 == 0) {
            C05660Vf A0Z2 = A0Z();
            if (A0Z2 != null) {
                A0Z2.A01 |= 16;
            }
            if (this.A0c.isEmpty()) {
                A0C();
            } else {
                A0A();
            }
        } else {
            C05020Qb.A06("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
    }

    public void CO5(C03230Hd r9) {
        C16300s2 r1;
        C17350uW r3;
        C17350uW r6 = this.A0A;
        if (r6 == null) {
            r6 = A05(this.A0B.A05);
        }
        A0P(this, C05020Qb.A02, (Object) null, 201, 0);
        Object CER = CER();
        if (C18070vi.A18(CER, AnonymousClass0MH.A00)) {
            r1 = null;
        } else {
            C18070vi.A0z(CER, "null cannot be cast to non-null type androidx.compose.runtime.State<kotlin.Any?>");
            r1 = (C16300s2) CER;
        }
        AnonymousClass0OI r7 = r9.A00;
        C18070vi.A0z(r7, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C16300s2 A022 = r7.A02(r1, r9.A01);
        boolean z = true;
        boolean z2 = !C18070vi.A18(A022, r1);
        if (z2) {
            CRH(A022);
        }
        boolean z3 = false;
        if (this.A0K) {
            r3 = r6.CD5(r7, A022);
            this.A0Q = true;
        } else {
            AnonymousClass0NZ r12 = this.A0B;
            Object A062 = r12.A06(r12.A01);
            C18070vi.A0z(A062, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C17350uW r13 = (C17350uW) A062;
            if ((!BZO() || z2) && (r9.A02 || !C04450Nl.A02(r7, r6))) {
                r3 = r6.CD5(r7, A022);
            } else {
                r3 = r13;
            }
            if (!this.A0O && r13 == r3) {
                z = false;
            }
            z3 = z;
            if (z && !this.A0K) {
                AnonymousClass0H9 r2 = this.A0I;
                if (r2 == null) {
                    r2 = new AnonymousClass0H9();
                    this.A0I = r2;
                }
                r2.A00.put(this.A0B.A01, r3);
            }
        }
        this.A0X.A01(this.A0N ? 1 : 0);
        this.A0N = z3;
        this.A0A = r3;
        A0P(this, C05020Qb.A00, r3, 202, 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0uW, java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.0uW, java.util.Map, java.lang.Object] */
    public void CO6(C03230Hd[] r9) {
        C17350uW BDN;
        C17350uW r7 = this.A0A;
        if (r7 == null) {
            r7 = A05(this.A0B.A05);
        }
        A0P(this, C05020Qb.A02, (Object) null, 201, 0);
        boolean z = true;
        boolean z2 = false;
        if (this.A0K) {
            ? A062 = A06(r7, AnonymousClass0ES.A00(), r9);
            C17340uV BDd = r7.BDd();
            BDd.putAll(A062);
            BDN = BDd.BDN();
            A0P(this, C05020Qb.A03, (Object) null, 204, 0);
            A0a();
            A0c(BDN);
            A0a();
            A0c(A062);
            A0R(this, false);
            this.A0Q = true;
        } else {
            AnonymousClass0NZ r1 = this.A0B;
            Object A072 = r1.A07(r1.A01, 0);
            C18070vi.A0z(A072, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C17350uW r5 = (C17350uW) A072;
            AnonymousClass0NZ r12 = this.A0B;
            Object A073 = r12.A07(r12.A01, 1);
            C18070vi.A0z(A073, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            C17350uW r13 = (C17350uW) A073;
            ? A063 = A06(r7, r13, r9);
            if (!BZO() || this.A0O || !C18070vi.A18(r13, A063)) {
                C17340uV BDd2 = r7.BDd();
                BDd2.putAll(A063);
                BDN = BDd2.BDN();
                A0P(this, C05020Qb.A03, (Object) null, 204, 0);
                A0a();
                A0c(BDN);
                A0a();
                A0c(A063);
                A0R(this, false);
                if (!this.A0O && C18070vi.A18(BDN, r5)) {
                    z = false;
                }
                z2 = z;
                if (z && !this.A0K) {
                    AnonymousClass0H9 r2 = this.A0I;
                    if (r2 == null) {
                        r2 = new AnonymousClass0H9();
                        this.A0I = r2;
                    }
                    r2.A00.put(this.A0B.A01, BDN);
                }
            } else {
                this.A02 += this.A0B.A01();
                BDN = r5;
            }
        }
        this.A0X.A01(this.A0N ? 1 : 0);
        this.A0N = z2;
        this.A0A = BDN;
        A0P(this, C05020Qb.A00, BDN, 202, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r5.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void COD(java.lang.Object r6) {
        /*
            r5 = this;
            r3 = 207(0xcf, float:2.9E-43)
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x002d
            X.0NZ r4 = r5.A0B
            int r2 = r4.A01
            int r0 = r4.A00
            if (r2 >= r0) goto L_0x002d
            int[] r1 = r4.A08
            int r0 = r2 * 5
            r0 = r1[r0]
            if (r0 != r3) goto L_0x002d
            java.lang.Object r0 = r4.A04()
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 != 0) goto L_0x002d
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x002d
            X.0NZ r0 = r5.A0B
            int r0 = r0.A01
            r5.A04 = r0
            r0 = 1
            r5.A0O = r0
        L_0x002d:
            r1 = 0
            r0 = 0
            A0P(r5, r0, r6, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.COD(java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0Cj] */
    public void CRH(Object obj) {
        if (obj instanceof AnonymousClass0t3) {
            if (this.A0K) {
                this.A0b.A05.A09((AnonymousClass0t3) obj);
            }
            this.A0d.add(obj);
            ? obj2 = new Object();
            obj2.A00 = (AnonymousClass0t3) obj;
            obj = obj2;
        }
        A0c(obj);
    }

    public void CRc() {
        String str;
        Object obj;
        if (this.A0M) {
            this.A0M = false;
            if (!this.A0K) {
                AnonymousClass0NZ r1 = this.A0B;
                int i = r1.A05;
                int[] iArr = r1.A08;
                if (C04780Ot.A03(iArr, i)) {
                    obj = r1.A09[iArr[(i * 5) + 4]];
                } else {
                    obj = null;
                }
                C04930Po r12 = this.A0b;
                r12.A04.A00.add(obj);
                if (this.A0O && (obj instanceof AnonymousClass0t2)) {
                    C04930Po.A00(r12);
                    r12.A05.A00.A06(C011107e.A00);
                    return;
                }
                return;
            }
            str = "useNode() called while inserting";
        } else {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        }
        C05020Qb.A06(str);
        throw null;
    }

    /* JADX INFO: finally extract failed */
    public AnonymousClass0VR(C16270rz r4, AnonymousClass0D1 r5, C17250uM r6, C06390Yd r7, AnonymousClass0Kg r8, AnonymousClass0Kg r9, Set set) {
        this.A0U = r4;
        this.A0V = r5;
        this.A0Y = r7;
        this.A0d = set;
        this.A0E = r8;
        this.A0G = r9;
        this.A0W = r6;
        AnonymousClass0NZ A042 = r7.A04();
        A042.A08();
        this.A0B = A042;
        C06390Yd r0 = new C06390Yd();
        this.A0C = r0;
        AnonymousClass0Qu A052 = r0.A05();
        A052.A0R();
        this.A0D = A052;
        this.A0b = new C04930Po(this, this.A0E);
        AnonymousClass0NZ A043 = this.A0C.A04();
        try {
            C02090Cr A022 = A043.A02(0);
            A043.A08();
            this.A0T = A022;
            this.A0H = new C03450If();
            this.A0f = new C04330Mt();
        } catch (Throwable th) {
            A043.A08();
            throw th;
        }
    }

    public static AnonymousClass0Tx A04(C17130tn r4, int i) {
        r4.COB(i);
        AnonymousClass0Tx r0 = new AnonymousClass0Tx(C02980Gd.A01, 150, 0);
        A0R((AnonymousClass0VR) r4, false);
        return r0;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.0uW, java.util.Map] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C17350uW A06(X.C17350uW r7, X.C17350uW r8, X.C03230Hd[] r9) {
        /*
            X.084 r0 = X.AnonymousClass0ES.A00()
            X.08B r6 = r0.A06()
            int r5 = r9.length
            r4 = 0
        L_0x000a:
            if (r4 >= r5) goto L_0x0031
            r3 = r9[r4]
            X.0OI r2 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>"
            X.C18070vi.A0z(r2, r0)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x001f
            boolean r0 = X.C04450Nl.A02(r2, r7)
            if (r0 != 0) goto L_0x002e
        L_0x001f:
            java.lang.Object r1 = r8.get(r2)
            X.0s2 r1 = (X.C16300s2) r1
            java.lang.Object r0 = r3.A01
            X.0s2 r0 = r2.A02(r1, r0)
            r6.put(r2, r0)
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0031:
            X.0uW r0 = r6.BDN()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VR.A06(X.0uW, X.0uW, X.0Hd[]):X.0uW");
    }

    private final void A0G(int i, int i2) {
        int A002 = A00(i);
        if (A002 != i2) {
            int i3 = i2 - A002;
            ArrayList arrayList = this.A0a.A00;
            int A0Q2 = AnonymousClass000.A0Q(arrayList);
            while (i != -1) {
                int A003 = A00(i) + i3;
                A0F(i, A003);
                int i4 = A0Q2;
                while (true) {
                    if (-1 < i4) {
                        C03620Iz r0 = (C03620Iz) arrayList.get(i4);
                        if (r0 != null && r0.A01(i, A003)) {
                            A0Q2 = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                AnonymousClass0NZ r02 = this.A0B;
                if (i < 0) {
                    i = r02.A05;
                } else {
                    int[] iArr = r02.A08;
                    if (!C04780Ot.A03(iArr, i)) {
                        i = iArr[(i * 5) + 2];
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A0M(AnonymousClass0VR r2) {
        A0N(r2);
        r2.A0a.A00.clear();
        r2.A07.A00 = 0;
        r2.A06.A00 = 0;
        r2.A0e.A00 = 0;
        r2.A0X.A00 = 0;
        r2.A0I = null;
        AnonymousClass0NZ r1 = r2.A0B;
        if (!r1.A06) {
            r1.A08();
        }
        AnonymousClass0Qu r12 = r2.A0D;
        if (!r12.A0F) {
            r12.A0R();
        }
        C03450If r13 = r2.A0H;
        r13.A01.A04();
        r13.A00.A04();
        r2.A09();
        r2.A01 = 0;
        r2.A00 = 0;
        r2.A0M = false;
        r2.A0K = false;
        r2.A0O = false;
        r2.A0L = false;
        r2.A04 = -1;
    }

    public static boolean A0X(C17130tn r1, AnonymousClass0VR r2) {
        r1.COB(1405779621);
        r1.COE();
        return r2.A0K;
    }

    public boolean BEc(float f) {
        Object A0a2 = A0a();
        if ((A0a2 instanceof Float) && f == AnonymousClass000.A04(A0a2)) {
            return false;
        }
        A0c(Float.valueOf(f));
        return true;
    }

    public boolean BEd(int i) {
        Object A0a2 = A0a();
        if ((A0a2 instanceof Integer) && i == AnonymousClass000.A0M(A0a2)) {
            return false;
        }
        A0c(Integer.valueOf(i));
        return true;
    }

    public boolean BEe(long j) {
        Object A0a2 = A0a();
        if ((A0a2 instanceof Long) && j == ((Number) A0a2).longValue()) {
            return false;
        }
        A0c(Long.valueOf(j));
        return true;
    }

    public boolean BEf(Object obj) {
        if (C18070vi.A18(A0a(), obj)) {
            return false;
        }
        A0c(obj);
        return true;
    }

    public boolean BEg(boolean z) {
        Object A0a2 = A0a();
        if ((A0a2 instanceof Boolean) && z == AnonymousClass000.A1Y(A0a2)) {
            return false;
        }
        A0c(Boolean.valueOf(z));
        return true;
    }

    public boolean BEh(Object obj) {
        if (A0a() == obj) {
            return false;
        }
        A0c(obj);
        return true;
    }

    public C06390Yd BP9() {
        return this.A0Y;
    }

    public boolean BQS() {
        C05660Vf A0Z2;
        if (!BZO() || this.A0N || ((A0Z2 = A0Z()) != null && (A0Z2.A01 & 4) != 0)) {
            return true;
        }
        return false;
    }
}
