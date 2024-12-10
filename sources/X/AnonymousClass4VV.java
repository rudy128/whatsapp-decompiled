package X;

import java.util.Collection;

/* renamed from: X.4VV  reason: invalid class name */
public final class AnonymousClass4VV {
    public final AnonymousClass1TK A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass18K A02;

    public final void A00(int i) {
        C81353z6 r1 = new C81353z6();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = C17880vN.A0n(this.A01.A01.size());
        r1.A00 = Boolean.valueOf(this.A00.A05());
        this.A02.CC7(r1);
    }

    public final void A01(int i, int i2) {
        C81403zB r2 = new C81403zB();
        r2.A01 = Integer.valueOf(i);
        r2.A00 = Integer.valueOf(i2);
        r2.A02 = C17880vN.A0n(this.A01.A01.size());
        Integer num = r2.A00;
        if (num != null && num.intValue() == 1) {
            AnonymousClass1TK.A00(this.A00, "folder_open_count");
        }
        this.A02.CC7(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (((X.C76873oZ) r6).A01 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass4EF r6, java.lang.Integer r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C76873oZ
            r4 = 1
            r1 = 3
            if (r0 == 0) goto L_0x0057
            X.3oZ r6 = (X.C76873oZ) r6
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0074
        L_0x000c:
            r3 = 1
        L_0x000d:
            if (r7 != 0) goto L_0x0027
            r4 = 3
        L_0x0010:
            X.3yq r1 = new X.3yq
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            X.18K r0 = r5.A02
            r0.CC7(r1)
            return
        L_0x0027:
            int r2 = r7.intValue()
            r0 = 5
            if (r2 == r0) goto L_0x0010
            r4 = 2
            r0 = 10
            if (r2 == r0) goto L_0x0010
            r0 = 13
            if (r2 == r0) goto L_0x0010
            r0 = 15
            if (r2 != r0) goto L_0x003e
            r4 = 9
            goto L_0x0010
        L_0x003e:
            r0 = 7
            if (r2 != r0) goto L_0x0044
            r4 = 10
            goto L_0x0010
        L_0x0044:
            r0 = 4
            if (r2 != r0) goto L_0x004a
            r4 = 11
            goto L_0x0010
        L_0x004a:
            if (r2 != r1) goto L_0x004f
            r4 = 12
            goto L_0x0010
        L_0x004f:
            r0 = 2
            r4 = 14
            if (r2 != r0) goto L_0x0010
            r4 = 13
            goto L_0x0010
        L_0x0057:
            boolean r0 = r6 instanceof X.C76863oY
            if (r0 != 0) goto L_0x0076
            boolean r0 = r6 instanceof X.C76853oX
            if (r0 != 0) goto L_0x0076
            boolean r0 = r6 instanceof X.C76893ob
            if (r0 != 0) goto L_0x0074
            boolean r0 = r6 instanceof X.C76883oa
            if (r0 != 0) goto L_0x000c
            boolean r0 = r6 instanceof X.C76843oW
            if (r0 != 0) goto L_0x000c
            boolean r0 = r6 instanceof X.C76833oV
            if (r0 != 0) goto L_0x000c
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0074:
            r3 = 3
            goto L_0x000d
        L_0x0076:
            r3 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VV.A02(X.4EF, java.lang.Integer):void");
    }

    public final void A03(AnonymousClass4EF r2, Integer num, Integer num2, int i) {
        AnonymousClass1BI r0;
        Collection collection;
        if ((r2 instanceof C76883oa) || (r2 instanceof C76893ob)) {
            r0 = null;
        } else if (r2 instanceof C76853oX) {
            r0 = ((C76853oX) r2).A00;
        } else if (r2 instanceof C76873oZ) {
            r0 = ((C76873oZ) r2).A00;
        } else if (r2 instanceof C76833oV) {
            r0 = ((C76833oV) r2).A00;
        } else {
            if (r2 instanceof C76863oY) {
                collection = ((C76863oY) r2).A00;
            } else if (r2 instanceof C76843oW) {
                collection = ((C76843oW) r2).A00;
            } else {
                throw AnonymousClass3MW.A14();
            }
            r0 = (AnonymousClass1BI) C29431cG.A0Y(collection);
        }
        A04(r0, num, num2, i);
    }

    public final void A04(AnonymousClass1BI r4, Integer num, Integer num2, int i) {
        Boolean bool;
        if (r4 != null) {
            bool = Boolean.valueOf(C22971Dz.A0e(r4));
        } else {
            bool = null;
        }
        C81503zL r1 = new C81503zL();
        r1.A03 = Integer.valueOf(i);
        r1.A00 = bool;
        r1.A01 = num;
        r1.A04 = C17880vN.A0n(this.A01.A01.size());
        r1.A02 = num2;
        this.A02.CC7(r1);
    }

    public final void A05(Integer num, Integer num2) {
        C81343z5 r1 = new C81343z5();
        r1.A01 = num;
        r1.A00 = Boolean.valueOf(this.A00.A05());
        r1.A02 = num2;
        this.A02.CC7(r1);
    }

    public AnonymousClass4VV(AnonymousClass1TK r1, AnonymousClass1CJ r2, AnonymousClass18K r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
