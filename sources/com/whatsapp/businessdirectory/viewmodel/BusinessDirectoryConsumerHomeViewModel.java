package com.whatsapp.businessdirectory.viewmodel;

import X.A5L;
import X.AEQ;
import X.AF0;
import X.AM5;
import X.AM7;
import X.AP6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass190;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1K2;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8FJ;
import X.AnonymousClass8FK;
import X.AnonymousClass9ND;
import X.B54;
import X.B55;
import X.BAa;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C133076o8;
import X.C169148kR;
import X.C169178kU;
import X.C169208kX;
import X.C171788sH;
import X.C173738ve;
import X.C174218wQ;
import X.C174308wZ;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C183279Xq;
import X.C184189aY;
import X.C190499l3;
import X.C191659mx;
import X.C195459tN;
import X.C20041A4k;
import X.C20079A6f;
import X.C20335AGr;
import X.C20531AOq;
import X.C20538AOx;
import X.C20539AOy;
import X.C20644ATc;
import X.C20645ATd;
import X.C20653ATl;
import X.C22416B6y;
import X.C22426B7i;
import X.C22434B7q;
import X.C22436B7s;
import X.C22495BAc;
import X.C22557BCq;
import X.C22801Dg;
import X.C24521Kq;
import X.C37391pS;
import X.C41731wy;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryConsumerHomeViewModel extends AnonymousClass8FK implements C22557BCq, C22495BAc, BAa, C22426B7i, C22436B7s {
    public AEQ A00;
    public AF0 A01;
    public AnonymousClass1E7 A02;
    public boolean A03;
    public final C22801Dg A04;
    public final AM5 A05;
    public final C173738ve A06;
    public final A5L A07;
    public final AP6 A08;
    public final C20531AOq A09;
    public final AnonymousClass1XN A0A;
    public final C41731wy A0B;
    public final C41731wy A0C = AnonymousClass3MW.A0o();
    public final C41731wy A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass1DS A0F;
    public final C20041A4k A0G;

    public void Boe(int i) {
        C41731wy r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            A00(this).A08(this.A07.A04(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0C;
            i2 = 8;
        } else if (i == 3) {
            A00(this).A08(this.A07.A04(), 7, (Map) null, 0, 50, 1);
            r2 = this.A0C;
            i2 = 5;
        } else {
            return;
        }
        r2.A0E(C108945cZ.A0N(Integer.valueOf(i2), A03(this)));
    }

    public void Boj() {
    }

    public void C45() {
        this.A03 = true;
        A05(this);
    }

    public static AM7 A00(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        return (AM7) businessDirectoryConsumerHomeViewModel.A0E.get();
    }

    public static C20079A6f A03(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        C20079A6f A022 = businessDirectoryConsumerHomeViewModel.A07.A02();
        if (A022 != null) {
            return A022;
        }
        C20041A4k a4k = businessDirectoryConsumerHomeViewModel.A0G;
        C20079A6f a6f = a4k.A00;
        if (a6f == null) {
            return C20041A4k.A00(a4k);
        }
        return a6f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r3 != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r3 != 1) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C188309hD r6, com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel r7) {
        /*
            X.9lD r0 = r6.A07
            if (r0 == 0) goto L_0x003c
            X.AM7 r5 = A00(r7)
            X.9lD r2 = r6.A07
            int r1 = r6.A01
            if (r1 == 0) goto L_0x004c
            r0 = 1
            if (r1 == r0) goto L_0x0049
            java.lang.String r0 = "unified_home"
        L_0x0013:
            java.util.HashMap r4 = r2.A00(r0)
            int r3 = r6.A01
            X.9lD r0 = r6.A07
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0046
            r1 = 1
            if (r2 == r1) goto L_0x003d
            r0 = 4
            if (r2 == r0) goto L_0x003d
            r0 = 7
            if (r2 == r0) goto L_0x003d
            if (r3 == 0) goto L_0x002e
            r0 = 41
            if (r3 == r1) goto L_0x0030
        L_0x002e:
            r0 = 40
        L_0x0030:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r0 = 0
            r5.BiG(r4, r0, r1)
        L_0x003c:
            return
        L_0x003d:
            if (r3 == 0) goto L_0x0043
            r0 = 44
            if (r3 == r1) goto L_0x0030
        L_0x0043:
            r0 = 43
            goto L_0x0030
        L_0x0046:
            r0 = 28
            goto L_0x0030
        L_0x0049:
            java.lang.String r0 = "businesses"
            goto L_0x0013
        L_0x004c:
            java.lang.String r0 = "home"
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel.A04(X.9hD, com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel):void");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.9ND, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.9ND, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.9ND, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.9ND, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14, types: [X.9ND, java.lang.Object] */
    public static void A05(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        AnonymousClass10E r7;
        AnonymousClass10E r4;
        BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel2 = businessDirectoryConsumerHomeViewModel;
        C20531AOq aOq = businessDirectoryConsumerHomeViewModel2.A09;
        if (aOq.A09()) {
            AP6 ap6 = businessDirectoryConsumerHomeViewModel2.A08;
            boolean z = businessDirectoryConsumerHomeViewModel2.A03;
            ap6.A00 = aOq.A00.A01;
            if (z) {
                AnonymousClass1XN r8 = ap6.A09;
                C18030ve r6 = r8.A03;
                C18040vf r42 = C18040vf.A02;
                if (C18020vd.A05(r42, r6, 4610)) {
                    ap6.A0B.clear();
                    C20653ATl aTl = ap6.A03;
                    C20079A6f a6f = ap6.A00;
                    aTl.A01();
                    C20645ATd aTd = new C20645ATd(aTl);
                    aTl.A06 = aTd;
                    B55 b55 = aTl.A0L;
                    C191659mx r14 = aTl.A0M.A00;
                    C20539AOy aOy = (C20539AOy) b55;
                    int i = aOy.A00;
                    Object obj = aOy.A01;
                    if (i != 0) {
                        r4 = ((C37391pS) obj).A00;
                    } else {
                        r4 = ((AnonymousClass1K2) obj).A01;
                    }
                    C18030ve A8r = AnonymousClass10E.A8r(r4);
                    AnonymousClass190 A0N = AnonymousClass3MY.A0N(r4);
                    AnonymousClass10I AL1 = AnonymousClass10E.AL1(r4);
                    AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r4);
                    C18000vb A6Q = AnonymousClass10E.A6Q(r4);
                    C22416B6y A0B2 = AnonymousClass8BT.A0B(r4);
                    AnonymousClass10G r3 = r4.A00;
                    C169178kU r43 = new C169178kU(A0N, A0B2, AnonymousClass8BT.A0E(r3), a6f, A0l, AnonymousClass8BU.A0F(r4), A6Q, A8r, aTd, r14, AnonymousClass8BT.A0O(r3), (C183279Xq) r3.A1B.get(), AL1);
                    r43.A0E();
                    aTl.A00 = r43;
                } else {
                    Map map = ap6.A0B;
                    Integer A0h = C17880vN.A0h();
                    ? obj2 = new Object();
                    obj2.A00 = 0;
                    Integer A0S = C108975cc.A0S(A0h, obj2, map);
                    ? obj3 = new Object();
                    obj3.A00 = 0;
                    map.put(A0S, obj3);
                    C20653ATl aTl2 = ap6.A03;
                    C20079A6f a6f2 = ap6.A00;
                    if (!(aTl2.A00 instanceof C169208kX)) {
                        aTl2.A01();
                    }
                    C20644ATc aTc = new C20644ATc(aTl2);
                    aTl2.A04 = aTc;
                    B54 b54 = aTl2.A0K;
                    C191659mx r9 = aTl2.A0M.A00;
                    C20538AOx aOx = (C20538AOx) b54;
                    int i2 = aOx.A00;
                    Object obj4 = aOx.A01;
                    if (i2 != 0) {
                        r7 = ((C37391pS) obj4).A00;
                    } else {
                        r7 = ((AnonymousClass1K2) obj4).A01;
                    }
                    C18030ve A8r2 = AnonymousClass10E.A8r(r7);
                    AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r7);
                    AnonymousClass118 A0l2 = AnonymousClass3MZ.A0l(r7);
                    AnonymousClass10I AL12 = AnonymousClass10E.AL1(r7);
                    C18000vb A6Q2 = AnonymousClass10E.A6Q(r7);
                    C22416B6y A0B3 = AnonymousClass8BT.A0B(r7);
                    C24521Kq A0F2 = AnonymousClass8BU.A0F(r7);
                    AnonymousClass10G r72 = r7.A00;
                    C169148kR r10 = new C169148kR(A0N2, A0B3, AnonymousClass8BT.A0E(r72), a6f2, A0l2, A0F2, A6Q2, A8r2, aTc, r9, AnonymousClass8BT.A0O(r72), AL12);
                    r10.A0E();
                    aTl2.A00 = r10;
                    AnonymousClass9ND r73 = (AnonymousClass9ND) map.get(0);
                    if (r73 != null && r73.A01 != null && r73.A00 != 2) {
                        ap6.A0A();
                    } else if (AP6.A07(ap6.A00)) {
                        ? obj5 = new Object();
                        obj5.A00 = 0;
                        map.put(0, obj5);
                        int A002 = C18020vd.A00(r42, ap6.A08, 1895);
                        aTl2.A03(new C184189aY(A002, (String) null), (C190499l3) null, ap6.A00, (String) null);
                    } else {
                        ? obj6 = new Object();
                        obj6.A00 = 1;
                        map.put(0, obj6);
                        AP6.A03(ap6);
                    }
                    if (r8.A02() && C18020vd.A05(r42, r6, 3948)) {
                        ? obj7 = new Object();
                        obj7.A00 = 0;
                        map.put(3, obj7);
                        ((C133076o8) ap6.A0A.get()).A00(ap6, 3);
                    }
                }
                AP6.A03(ap6);
                return;
            }
            ap6.A0A();
        }
    }

    public void A0S() {
        C20531AOq aOq = this.A09;
        AnonymousClass8FJ r0 = aOq.A00;
        r0.A02.removeCallbacks(r0.A09);
        aOq.A04.A00();
        aOq.A01 = null;
        AP6 ap6 = this.A08;
        C195459tN r1 = ap6.A01;
        if (r1 != null) {
            r1.A00 = true;
            ap6.A01 = null;
        }
        C20653ATl aTl = ap6.A03;
        aTl.A0A = null;
        aTl.A0B = null;
        aTl.A08 = null;
        C17890vO.A0t(((C133076o8) ap6.A0A.get()).A00);
    }

    public void BlM() {
        if (this.A0A.A05()) {
            AM5 am5 = this.A05;
            Integer A002 = C20531AOq.A00(this.A09);
            C171788sH A0J = AnonymousClass8BW.A0J(3);
            A0J.A09 = A002;
            AM5.A02(am5, A0J);
            this.A06.A02(true);
        }
        AnonymousClass3MX.A1K(this.A0B, 3);
    }

    public void Bo8() {
        this.A09.A03();
        this.A0C.A0F(C108945cZ.A0N(C108955ca.A0e(), A03(this)));
    }

    public void BxG() {
        AnonymousClass3MX.A1J(this.A0D, 10);
    }

    public void BxL() {
        AnonymousClass3MX.A1K(this.A0B, 0);
        A00(this).A08(this.A07.A04(), AnonymousClass3MY.A0g(), (Map) null, 0, 48, 1);
    }

    public void C44() {
        C20531AOq aOq = this.A09;
        aOq.A02();
        aOq.A00.A0H();
        AnonymousClass3MX.A1K(this.A0B, 1);
        A00(this).A08(this.A07.A04(), (Integer) null, (Map) null, 0, 49, 1);
    }

    public void C4r() {
        AnonymousClass3MX.A1K(this.A0D, 8);
    }

    public BusinessDirectoryConsumerHomeViewModel(Application application, AM5 am5, C173738ve r7, A5L a5l, C20041A4k a4k, AP6 ap6, C22434B7q b7q, AnonymousClass1XN r12, AnonymousClass00H r13) {
        super(application);
        this.A0A = r12;
        C22801Dg A0R = C108945cZ.A0R();
        this.A04 = A0R;
        this.A0D = AnonymousClass3MW.A0o();
        this.A0B = AnonymousClass3MW.A0o();
        this.A07 = a5l;
        this.A06 = r7;
        this.A0G = a4k;
        this.A05 = am5;
        this.A0E = r13;
        C20531AOq BH2 = b7q.BH2(this, this, this);
        this.A09 = BH2;
        this.A08 = ap6;
        AnonymousClass1DT r1 = ap6.A02;
        this.A0F = r1;
        this.A03 = true;
        C20335AGr.A01(r1, A0R, this, 23);
        C20335AGr.A01(BH2.A00, A0R, this, 24);
    }

    public static void A06(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new C174218wQ(businessDirectoryConsumerHomeViewModel));
        ArrayList A132 = AnonymousClass000.A13();
        AnonymousClass8FJ r2 = businessDirectoryConsumerHomeViewModel.A09.A00;
        if (r2.A06() != null && r2.A00 == 4) {
            A132.addAll(businessDirectoryConsumerHomeViewModel.A08.A08(r2.A01));
        }
        A13.addAll(A132);
        A13.addAll(list);
        businessDirectoryConsumerHomeViewModel.A04.A0E(A13);
    }

    public void Bvn() {
        ArrayList A13 = AnonymousClass000.A13();
        C174308wZ.A00(this, A13, 2);
        A06(this, A13);
    }

    public void Byj() {
        Bo8();
    }

    public void C43(String str) {
        A05(this);
    }
}
