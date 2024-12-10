package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AP6 implements BAY, C1599986r {
    public C20079A6f A00;
    public C195459tN A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C20653ATl A03;
    public final AnonymousClass9X2 A04 = new AnonymousClass9X2(this);
    public final AnonymousClass9X3 A05 = new AnonymousClass9X3(this);
    public final C188309hD A06;
    public final C22495BAc A07 = new APZ(this);
    public final C18030ve A08;
    public final AnonymousClass1XN A09;
    public final AnonymousClass00H A0A;
    public final Map A0B = Collections.synchronizedMap(C17880vN.A13());
    public final C18090vk A0C = new C21528Alb(this, 22);
    public final AM5 A0D;
    public final C199299zl A0E;
    public final AnonymousClass00H A0F;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AP6 r8, int r9) {
        /*
            r3 = 0
            r1 = 39
            if (r9 == 0) goto L_0x000f
            r0 = 1
            r1 = 38
            if (r9 == r0) goto L_0x000f
            r0 = 2
            if (r9 == r0) goto L_0x0036
            r1 = 78
        L_0x000f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0013:
            X.00H r0 = r8.A0F
            java.lang.Object r2 = r0.get()
            X.AM7 r2 = (X.AM7) r2
            int r7 = r1.intValue()
            X.A6f r0 = r8.A00
            if (r0 == 0) goto L_0x002b
            int r0 = r0.A03()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x002b:
            r6 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5 = 0
            r8 = 2
            r2.A08(r3, r4, r5, r6, r7, r8)
        L_0x0035:
            return
        L_0x0036:
            X.1XN r0 = r8.A09
            boolean r1 = r0.A06()
            r0 = 5
            if (r1 == 0) goto L_0x0041
            r0 = 86
        L_0x0041:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0035
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP6.A04(X.AP6, int):void");
    }

    public static boolean A07(C20079A6f a6f) {
        if (a6f == null) {
            return false;
        }
        String str = a6f.A08;
        return "device".equals(str) || "pin_on_map".equals(str) || "manual".equals(str);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.8vl, X.8vo] */
    private C173808vl A00(AnonymousClass9ND r6) {
        C169078kK r1 = (C169078kK) r6.A01;
        if (!r1.A00.isEmpty()) {
            List list = r1.A00;
            AWP awp = new AWP(this, 0);
            AWL awl = new AWL(this, 0);
            C18070vi.A0d(list, 1);
            return new C173838vo(awl, awp, list, 54);
        }
        this.A0D.A05(Integer.valueOf(this.A00.A03()), 83, 2);
        return null;
    }

    private C173828vn A01() {
        AnonymousClass9ND r2 = (AnonymousClass9ND) AnonymousClass000.A0w(this.A0B, 3);
        if (r2 == null || r2.A00 != 1) {
            return null;
        }
        ArrayList arrayList = ((C125776bf) r2.A01).A00;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C173828vn(new AWL(this, 1), new AWP(this, 1), new AWS(this), arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r0 != null) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AP6 r7) {
        /*
            java.util.Map r5 = r7.A0B
            java.util.Iterator r2 = X.C17890vO.A0l(r5)
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.9ND r0 = (X.AnonymousClass9ND) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0006
            return
        L_0x0018:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            boolean r0 = r7.A06()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r0 != 0) goto L_0x0066
            X.1XN r0 = r7.A09
            X.0ve r3 = r0.A03
            r1 = 4610(0x1202, float:6.46E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0045
            r0 = 0
            X.8wa r1 = new X.8wa
            r1.<init>(r0)
        L_0x003a:
            r4.add(r1)
        L_0x003d:
            r2.addAll(r4)
            java.lang.Class<X.AP6> r3 = X.AP6.class
            monitor-enter(r3)
            goto L_0x0160
        L_0x0045:
            r1 = 16
            X.8wR r0 = new X.8wR
            r0.<init>(r1)
            r4.add(r0)
            X.8w3 r0 = new X.8w3
            r0.<init>()
            r4.add(r0)
            X.8w3 r0 = new X.8w3
            r0.<init>()
            r4.add(r0)
            r0 = 1
            X.8wP r1 = new X.8wP
            r1.<init>(r0)
            goto L_0x003a
        L_0x0066:
            X.A6f r0 = r7.A00
            boolean r0 = A07(r0)
            if (r0 != 0) goto L_0x0081
            X.1XN r0 = r7.A09
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0081
            r3 = 0
            X.BAc r1 = r7.A07
            X.8wS r0 = new X.8wS
            r0.<init>(r1, r3)
            r4.add(r0)
        L_0x0081:
            r2.addAll(r4)
            X.1XN r0 = r7.A09
            X.0ve r3 = r0.A03
            r1 = 4610(0x1202, float:6.46E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            if (r0 == 0) goto L_0x00eb
            java.util.Iterator r6 = X.AnonymousClass8BU.A0x(r5)
        L_0x009a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r1 = r5.get(r0)
            X.C17960vV.A07(r1)
            X.9ND r1 = (X.AnonymousClass9ND) r1
            if (r3 == 0) goto L_0x00e3
            r0 = 1
            if (r3 == r0) goto L_0x00cd
            r0 = 2
            if (r3 == r0) goto L_0x00c8
            r0 = 3
            if (r3 != r0) goto L_0x009a
            X.8vn r1 = r7.A01()
            if (r1 == 0) goto L_0x009a
        L_0x00c4:
            r4.add(r1)
            goto L_0x009a
        L_0x00c8:
            X.8vl r1 = r7.A00(r1)
            goto L_0x00c4
        L_0x00cd:
            java.lang.Object r1 = r1.A01
            X.8kJ r1 = (X.C169068kJ) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e1
            java.util.List r0 = r1.A00
            X.8w7 r1 = new X.8w7
            r1.<init>(r7, r0)
            goto L_0x00c4
        L_0x00e1:
            r1 = 0
            goto L_0x00c4
        L_0x00e3:
            java.util.ArrayList r0 = r7.A02()
            r4.addAll(r0)
            goto L_0x009a
        L_0x00eb:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0 = 2
            java.lang.Object r1 = X.AnonymousClass000.A0w(r5, r0)
            X.9ND r1 = (X.AnonymousClass9ND) r1
            if (r1 == 0) goto L_0x015a
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x015a
            X.8vl r0 = r7.A00(r1)
            if (r0 == 0) goto L_0x0105
        L_0x0102:
            r3.add(r0)
        L_0x0105:
            r4.addAll(r3)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0 = 1
            java.lang.Object r0 = X.AnonymousClass000.A0w(r5, r0)
            X.9ND r0 = (X.AnonymousClass9ND) r0
            if (r0 == 0) goto L_0x0154
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x0154
            X.8kJ r1 = (X.C169068kJ) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012d
            java.util.List r0 = r1.A00
            X.8w7 r1 = new X.8w7
            r1.<init>(r7, r0)
        L_0x012a:
            r3.add(r1)
        L_0x012d:
            r4.addAll(r3)
            java.util.ArrayList r0 = r7.A02()
            r4.addAll(r0)
            X.8vn r0 = r7.A01()
            if (r0 == 0) goto L_0x0140
            r4.add(r0)
        L_0x0140:
            r2.addAll(r4)
            r1 = 5
            X.8vz r0 = new X.8vz
            r0.<init>((int) r1)
            r2.add(r0)
            X.A6f r0 = r7.A00
            java.util.ArrayList r4 = r7.A08(r0)
            goto L_0x003d
        L_0x0154:
            X.8w3 r1 = new X.8w3
            r1.<init>()
            goto L_0x012a
        L_0x015a:
            X.8w3 r0 = new X.8w3
            r0.<init>()
            goto L_0x0102
        L_0x0160:
            X.9hD r1 = r7.A06     // Catch:{ all -> 0x0172 }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x0172 }
            java.util.List r0 = r1.A08     // Catch:{ all -> 0x0172 }
            r0.clear()     // Catch:{ all -> 0x0172 }
            r0.addAll(r2)     // Catch:{ all -> 0x0172 }
            r7.A0A()     // Catch:{ all -> 0x0172 }
            monitor-exit(r3)     // Catch:{ all -> 0x0172 }
            return
        L_0x0172:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0172 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AP6.A03(X.AP6):void");
    }

    public static void A05(AP6 ap6, C190599lD r4, int i, int i2) {
        synchronized (AP6.class) {
            C188309hD r1 = ap6.A06;
            r1.A02 = 4;
            r1.A00 = i;
            r1.A07 = r4;
            r1.A01 = i2;
            ap6.A0A();
        }
    }

    private boolean A06() {
        Map map = this.A0B;
        if (!map.isEmpty()) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (((AnonymousClass9ND) A16.getValue()).A00 != 0 || AnonymousClass8BV.A04(A16) == 3) {
                }
            }
            return true;
        }
        return false;
    }

    public void A09() {
        synchronized (AP6.class) {
            C188309hD r1 = this.A06;
            r1.A04 = null;
            r1.A06 = null;
            r1.A02 = 1;
        }
    }

    public void A0A() {
        this.A02.A0E(this.A06);
    }

    public void Bmz(C190599lD r3, int i) {
        AnonymousClass9ND r1 = (AnonymousClass9ND) AnonymousClass000.A0w(this.A0B, 0);
        if (r1 != null) {
            r1.A00 = 2;
        }
        A05(this, r3, i, 1);
    }

    public void Bn0(C195699tl r9) {
        C195459tN r1 = this.A01;
        if (r1 != null) {
            r1.A00 = true;
            this.A01 = null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(r9.A09);
        C20079A6f a6f = this.A00;
        C17960vV.A07(a6f);
        String str = r9.A02;
        C195459tN r12 = new C195459tN(a6f, new C20540AOz(r9, this, 1), r9.A01, str, A13, 2);
        this.A01 = r12;
        this.A0E.A00(r12);
    }

    public void Bq2(C125776bf r5) {
        synchronized (AP6.class) {
            AnonymousClass9ND r1 = (AnonymousClass9ND) AnonymousClass000.A0w(this.A0B, 3);
            if (r1 != null) {
                r1.A00 = 1;
                r1.A01 = r5;
                if (!r5.A00.isEmpty()) {
                    A04(this, 3);
                }
                if (A06()) {
                    A03(this);
                }
            }
        }
    }

    public AP6(AM5 am5, C20653ATl aTl, C199299zl r5, C18030ve r6, AnonymousClass1XN r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A08 = r6;
        this.A09 = r7;
        this.A06 = new C188309hD();
        this.A03 = aTl;
        this.A0A = r8;
        aTl.A0A = this;
        aTl.A0B = this;
        this.A0D = am5;
        this.A0F = r9;
        aTl.A08 = this;
        this.A0E = r5;
    }

    private ArrayList A02() {
        Object r3;
        Object obj;
        ArrayList A13 = AnonymousClass000.A13();
        C20079A6f a6f = this.A00;
        C18090vk r5 = this.A0C;
        A13.add(new C174268wV(a6f, r5, 2131887047));
        if (A07(this.A00)) {
            AnonymousClass9ND r0 = (AnonymousClass9ND) AnonymousClass000.A0w(this.A0B, 0);
            if (r0 == null || (obj = r0.A01) == null) {
                r3 = new C174208wP(false);
            } else {
                C195699tl r1 = (C195699tl) obj;
                if (r1.A09.isEmpty()) {
                    r3 = new C174198wO(r5);
                } else {
                    r3 = new C174278wW(this.A00, this.A05, r1.A09);
                }
            }
        } else {
            r3 = new C174188wN(this.A04);
        }
        A13.add(r3);
        return A13;
    }

    public ArrayList A08(C20079A6f a6f) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new C173928vx());
        if (a6f == null || (a6f.A05() && !A07(this.A00) && this.A09.A05())) {
            return A13;
        }
        A13.add(new C174048w9(new AFN(this, 21)));
        return A13;
    }
}
