package X;

/* renamed from: X.7P1  reason: invalid class name */
public class AnonymousClass7P1 implements AnonymousClass8A2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass7P1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
        this.A04 = obj;
        this.A02 = obj2;
    }

    public final void A00() {
        AnonymousClass7RN.A01(((C122196Oc) this.A05).A00, this.A01, this.A02, 28);
    }

    public void BrA() {
        if (this.A00 != 0) {
            C31081ez.A01("UnlinkActionIqHelper/Iq delivery fail");
            AnonymousClass7RN.A01(((C122176Oa) this.A05).A00, this.A01, this.A02, 29);
            return;
        }
        C31081ez.A01("LinkActionIqHelper/Iq delivery fail");
        A00();
    }

    public void Bsx(Exception exc, Integer num) {
        int i = this.A00;
        StringBuilder A0K = C18070vi.A0K(exc);
        if (i != 0) {
            A0K.append("UnlinkActionIqHelper/Iq sent error with code ");
            A0K.append(num);
            C31081ez.A03(C17890vO.A0c(A0K, ' '), exc);
            AnonymousClass7RN.A01(((C122176Oa) this.A05).A00, this.A01, this.A02, 29);
            return;
        }
        A0K.append("LinkActionIqHelper/Iq sent error with code ");
        A0K.append(num);
        C31081ez.A03(C17890vO.A0c(A0K, ' '), exc);
        A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0026
            boolean r0 = X.AnonymousClass000.A1Y(r8)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "UnlinkActionIqHelper/execute:onSuccess"
            X.C31081ez.A02(r0)
            java.lang.Object r5 = r7.A05
            X.6Oa r5 = (X.C122176Oa) r5
            X.1KB r0 = r5.A00
            java.lang.Object r2 = r7.A03
            java.lang.Object r3 = r7.A01
            java.lang.Object r4 = r7.A04
            r6 = 28
            X.7Py r1 = new X.7Py
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGP(r1)
        L_0x0025:
            return
        L_0x0026:
            X.6gm r8 = (X.C128846gm) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "LinkActionIqHelper/execute:onSuccess"
            X.C31081ez.A02(r0)
            java.lang.String r1 = r8.A01
            if (r1 == 0) goto L_0x0048
            java.lang.Object r0 = r7.A05
            X.6Oc r0 = (X.C122196Oc) r0
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.2kw r0 = (X.C58592kw) r0
            r0.A01(r1)
        L_0x0048:
            java.lang.Object r3 = r7.A05
            X.6Oc r3 = (X.C122196Oc) r3
            X.1KB r5 = r3.A00
            java.lang.Object r4 = r7.A01
            java.lang.Object r2 = r7.A04
            r1 = 43
            X.7RO r0 = new X.7RO
            r0.<init>(r4, r2, r8, r1)
            r5.CGP(r0)
            X.10I r1 = r3.A01
            r0 = 36
            X.C146787Qp.A00(r1, r3, r0)
            java.lang.Object r0 = r7.A03
            X.6iW r0 = (X.C129876iW) r0
            int r1 = r0.A00
            X.62W r2 = new X.62W
            r2.<init>()
            r0 = 1
            if (r1 == 0) goto L_0x0074
            if (r1 != r0) goto L_0x007a
            r0 = 2
        L_0x0074:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
        L_0x007a:
            X.00H r0 = r3.A06
            X.1lS r1 = X.C108945cZ.A0f(r0)
            X.1lW r0 = X.C35011lV.A00
            X.732 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = X.AnonymousClass732.A00(r0)
            java.lang.Long r0 = (java.lang.Long) r0
        L_0x008e:
            r2.A01 = r0
            X.00H r0 = r3.A08
            X.C108965cb.A1F(r2, r0)
            java.lang.String r1 = "LinkActionIqHelper/logLinkedEvent Waffle ACLink Linked event logged"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x009c:
            r0 = 0
            goto L_0x008e
        L_0x009e:
            java.lang.String r0 = "LinkActionIqHelper/execute/result success is false"
            X.C31081ez.A01(r0)
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7P1.onSuccess(java.lang.Object):void");
    }
}
