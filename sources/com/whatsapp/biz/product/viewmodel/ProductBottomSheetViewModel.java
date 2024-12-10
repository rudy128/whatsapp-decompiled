package com.whatsapp.biz.product.viewmodel;

import X.A78;
import X.A8Q;
import X.ADW;
import X.AE6;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass2UJ;
import X.AnonymousClass8F7;
import X.AnonymousClass8FK;
import X.AnonymousClass9PQ;
import X.AnonymousClass9QG;
import X.B0W;
import X.B7A;
import X.BAK;
import X.C108965cb;
import X.C17880vN;
import X.C18000vb;
import X.C180579Nc;
import X.C18460wS;
import X.C187599g4;
import X.C192559ob;
import X.C192829p3;
import X.C195529tU;
import X.C199419zy;
import X.C20114A7x;
import X.C20287AEv;
import X.C20334AGq;
import X.C21450AkH;
import X.C21542Alp;
import X.C22417B6z;
import X.C22851Dl;
import X.C25511Om;
import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ProductBottomSheetViewModel extends AnonymousClass8FK {
    public C192829p3 A00;
    public C20287AEv A01;
    public C20287AEv A02;
    public UserJid A03;
    public String A04;
    public List A05 = C18460wS.A00;
    public AtomicBoolean A06 = C108965cb.A0w();
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public AnonymousClass8F7 A0B;
    public final Application A0C;
    public final AnonymousClass1DS A0D;
    public final AnonymousClass1DS A0E;
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass11S A0H;
    public final C195529tU A0I;
    public final A8Q A0J;
    public final AnonymousClass10I A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass1DS A0U;
    public final AnonymousClass1DT A0V;
    public final C22851Dl A0W;
    public final C22851Dl A0X = new C20334AGq(this, 43);
    public final C22851Dl A0Y = new C20334AGq(this, 44);
    public final C22417B6z A0Z;
    public final C180579Nc A0a;
    public final B7A A0b;
    public final BAK A0c;
    public final C187599g4 A0d;
    public final A78 A0e;
    public final C18000vb A0f;
    public final AnonymousClass2UJ A0g;
    public final AnonymousClass00H A0h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductBottomSheetViewModel(android.app.Application r23, X.AnonymousClass11S r24, X.C22417B6z r25, X.C195529tU r26, X.B7A r27, X.A8Q r28, X.C187599g4 r29, X.A78 r30, X.C18000vb r31, X.AnonymousClass2UJ r32, X.AnonymousClass10I r33, X.AnonymousClass00H r34, X.AnonymousClass00H r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, X.AnonymousClass00H r39, X.AnonymousClass00H r40, X.AnonymousClass00H r41, X.AnonymousClass00H r42, X.AnonymousClass00H r43) {
        /*
            r22 = this;
            r2 = 1
            r15 = r23
            X.C18070vi.A0d(r15, r2)
            r0 = r34
            r19 = r26
            r21 = r24
            r3 = r19
            r1 = r21
            X.C18070vi.A0p(r0, r1, r3)
            r1 = 5
            r11 = r35
            X.C18070vi.A0d(r11, r1)
            r18 = r27
            r17 = r28
            r16 = r30
            r14 = r31
            r13 = r32
            r4 = r18
            r3 = r17
            r1 = r16
            X.C18070vi.A0x(r14, r4, r3, r13, r1)
            r10 = r36
            r9 = r37
            X.C72473Md.A1L(r10, r9)
            r1 = 14
            r8 = r38
            X.C18070vi.A0d(r8, r1)
            r1 = 15
            r7 = r39
            X.C18070vi.A0d(r7, r1)
            r6 = r40
            r5 = r41
            r4 = r42
            r20 = r25
            r1 = r20
            X.C18070vi.A0t(r6, r5, r1, r4)
            r12 = r33
            r3 = r43
            X.AnonymousClass8BW.A1J(r3, r12)
            r1 = r22
            r1.<init>(r15)
            r1.A0C = r15
            r1.A0N = r0
            r0 = r21
            r1.A0H = r0
            r0 = r19
            r1.A0I = r0
            r1.A0L = r11
            r1.A0f = r14
            r0 = r18
            r1.A0b = r0
            r0 = r17
            r1.A0J = r0
            r1.A0g = r13
            r0 = r16
            r1.A0e = r0
            r1.A0O = r10
            r1.A0Q = r9
            r0 = r29
            r1.A0d = r0
            r1.A0P = r8
            r1.A0h = r7
            r1.A0S = r6
            r1.A0M = r5
            r0 = r20
            r1.A0Z = r0
            r1.A0T = r4
            r1.A0R = r3
            r1.A0K = r12
            X.AND r4 = new X.AND
            r4.<init>(r1, r2)
            r1.A0c = r4
            r0 = 3
            X.8i2 r3 = new X.8i2
            r3.<init>(r1, r0)
            r1.A0a = r3
            java.lang.Object r0 = r10.get()
            com.whatsapp.biz.catalog.manager.CatalogManager r0 = (com.whatsapp.biz.catalog.manager.CatalogManager) r0
            java.util.List r0 = r0.A08
            r0.add(r4)
            X.C72453Mb.A1Q(r7, r3)
            r3 = 43
            X.AGq r0 = new X.AGq
            r0.<init>(r1, r3)
            r1.A0X = r0
            r3 = 44
            X.AGq r0 = new X.AGq
            r0.<init>(r1, r3)
            r1.A0Y = r0
            X.0wS r0 = X.C18460wS.A00
            r1.A05 = r0
            r1.A0A = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C108965cb.A0w()
            r1.A06 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0V = r0
            X.1Dg r0 = X.C22791Df.A00(r0)
            r1.A0E = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0F = r0
            r1.A0D = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0G = r0
            r1.A0U = r0
            r2 = 45
            X.AGq r0 = new X.AGq
            r0.<init>(r1, r2)
            r1.A0W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.<init>(android.app.Application, X.11S, X.B6z, X.9tU, X.B7A, X.A8Q, X.9g4, X.A78, X.0vb, X.2UJ, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }

    public final void A0T(UserJid userJid, String str) {
        Set A002;
        AE6 ae6;
        ADW adw;
        List list;
        this.A09 = false;
        this.A0d.A00 = userJid;
        this.A04 = str;
        this.A03 = userJid;
        C20287AEv A0A2 = ((C20114A7x) this.A0N.get()).A0A(userJid, str);
        if (this.A02 != null || !this.A0A) {
            this.A0A = false;
        } else {
            this.A01 = A0A2;
        }
        C21450AkH.A01(this.A0K, this, userJid, 35);
        this.A02 = A0A2;
        if (this.A0B == null) {
            AnonymousClass8F7 BGH = this.A0b.BGH(userJid);
            this.A0B = BGH;
            BGH.A00.A0C(this.A0W);
            AnonymousClass8F7 r0 = this.A0B;
            if (r0 != null) {
                r0.A0V();
            }
        }
        if (this.A00 == null) {
            C192829p3 BGF = this.A0Z.BGF(userJid);
            this.A00 = BGF;
            BGF.A03.A0C(this.A0X);
            C192829p3 r02 = this.A00;
            if (r02 != null) {
                r02.A00();
            }
        }
        C20287AEv aEv = this.A02;
        if (!(aEv == null || (ae6 = aEv.A05) == null || (adw = ae6.A00) == null || (list = adw.A00) == null || list.isEmpty())) {
            C199419zy r2 = (C199419zy) this.A0S.get();
            C199419zy.A00(r2, new B0W(r2, true));
        }
        A00(this);
        if (this.A0A || !this.A08) {
            A002 = AnonymousClass9QG.A00();
        } else {
            A002 = C25511Om.A00;
        }
        ((C192559ob) this.A0Q.get()).A01(userJid, A002, new C21542Alp(this, userJid, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r0.A09 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1.A01() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r19) {
        /*
            r0 = r19
            X.AEv r1 = r0.A02
            if (r1 == 0) goto L_0x008d
            r10 = 0
            r8 = 99
            r4 = 1
            boolean r2 = r0.A07
            if (r2 == 0) goto L_0x0016
            boolean r2 = r1.A01()
            r13 = 1
            if (r2 != 0) goto L_0x0017
        L_0x0016:
            r13 = 0
        L_0x0017:
            X.8F7 r5 = r0.A0B
            if (r5 == 0) goto L_0x0025
            X.0vb r3 = r0.A0f
            java.util.List r2 = r0.A05
            java.lang.String r7 = r5.A0T(r3, r2)
            if (r7 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r7 = ""
        L_0x0027:
            X.AEv r2 = r0.A02
            if (r2 == 0) goto L_0x002d
            long r8 = r2.A01
        L_0x002d:
            X.8F7 r2 = r0.A0B
            if (r2 == 0) goto L_0x0039
            java.util.List r3 = r0.A05
            java.lang.String r2 = r1.A0H
            long r10 = X.AnonymousClass8F7.A00(r2, r3)
        L_0x0039:
            X.1DS r2 = r0.A0U
            java.lang.Object r2 = r2.A06()
            boolean r12 = X.C18070vi.A19(r2, r4)
            X.1DT r2 = r0.A0V
            java.lang.String r6 = r1.A08
            java.math.BigDecimal r5 = r1.A09
            X.A6S r4 = r1.A07
            X.AE5 r15 = r1.A04
            X.0vb r3 = r0.A0f
            java.util.Date r19 = new java.util.Date
            r19.<init>()
            android.app.Application r14 = r0.A0C
            r17 = r3
            r18 = r5
            r16 = r4
            android.text.SpannableString r4 = X.A78.A01(r14, r15, r16, r17, r18, r19)
            X.AEv r5 = r0.A02
            int r3 = r1.A00
            boolean r14 = X.AnonymousClass000.A1P(r3)
            boolean r15 = r0.A0A
            X.AE6 r1 = r1.A05
            if (r1 == 0) goto L_0x007c
            X.ADW r1 = r1.A00
            if (r1 == 0) goto L_0x007c
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x007c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0082
        L_0x007c:
            boolean r0 = r0.A09
            r16 = 0
            if (r0 == 0) goto L_0x0084
        L_0x0082:
            r16 = 1
        L_0x0084:
            X.AO9 r3 = new X.AO9
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16)
            r2.A0E(r3)
            return
        L_0x008d:
            X.1DT r2 = r0.A0V
            boolean r1 = r0.A0A
            X.AO8 r0 = new X.AO8
            r0.<init>(r1)
            r2.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A00(com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel):void");
    }

    public void A0S() {
        AnonymousClass8F7 r0 = this.A0B;
        if (r0 != null) {
            r0.A00.A0D(this.A0W);
        }
        C192829p3 r02 = this.A00;
        if (r02 != null) {
            r02.A03.A0D(this.A0X);
        }
        C17880vN.A0V(this.A0h).unregisterObserver(this.A0a);
    }

    public final void A0U(List list, long j) {
        UserJid userJid;
        C192829p3 r0;
        C20287AEv A002 = AnonymousClass9PQ.A00(this.A02, this.A01);
        if (A002 != null && (userJid = this.A03) != null && (r0 = this.A00) != null) {
            r0.A01(A002, userJid, (String) null, (String) null, (String) null, list, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r1 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0.size() <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0V(boolean r6) {
        /*
            r5 = this;
            X.AEv r0 = r5.A02
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            X.AE6 r0 = r0.A05
            if (r0 == 0) goto L_0x0019
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0021
            r3 = 1
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0027
            return r2
        L_0x0027:
            X.1DT r2 = r5.A0F
            android.app.Application r1 = r5.A0C
            r0 = 2131888017(0x7f120791, float:1.9410657E38)
            java.lang.String r1 = X.C18070vi.A0F(r1, r0)
            X.9qH r0 = new X.9qH
            r0.<init>(r1, r3)
            r2.A0E(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel.A0V(boolean):boolean");
    }
}
