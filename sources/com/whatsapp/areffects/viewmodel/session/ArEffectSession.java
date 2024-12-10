package com.whatsapp.areffects.viewmodel.session;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1G4;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C106545Wg;
import X.C106555Wh;
import X.C106575Wj;
import X.C106585Wk;
import X.C107085Yi;
import X.C107855aj;
import X.C108815cL;
import X.C18070vi;
import X.C30391dr;
import X.C30451dy;
import X.C30511e4;
import X.C72473Md;
import X.C75633hs;
import X.C75643ht;
import X.C86204Qs;
import X.C92384hD;
import X.C92484hP;
import X.C92494hQ;
import X.C92504hR;
import X.C92514hS;
import X.C92524hT;
import X.C92534hU;
import X.C92544hV;
import X.C92584hZ;
import X.C92594ha;
import X.C92614hc;
import X.C99804tU;
import com.whatsapp.util.Log;
import java.util.Iterator;

public final class ArEffectSession {
    public AnonymousClass1OB A00;
    public AnonymousClass1OB A01;
    public AnonymousClass1OB A02;
    public final C86204Qs A03;
    public final C107085Yi A04;
    public final C106555Wh A05;
    public final C106585Wk A06;
    public final AnonymousClass1OX A07;
    public final AnonymousClass1G4 A08 = AnonymousClass3MW.A18(new C92614hc(C92534hU.A00));
    public final AnonymousClass00H A09;

    public static final C106575Wj A02(C106575Wj r5, C106575Wj r6) {
        C106575Wj r1 = r6;
        if (!(r5 instanceof C92584hZ) || !(r6 instanceof C92594ha)) {
            return r1;
        }
        C92594ha r12 = (C92594ha) r1;
        C107855aj r3 = r12.A01;
        C92384hD r4 = r12.A02;
        return new C92594ha(r12.A00, r3, r4, (C92584hZ) r5, r12.A04);
    }

    public static final synchronized void A06(ArEffectSession arEffectSession, C106575Wj r4) {
        synchronized (arEffectSession) {
            AnonymousClass1G4 r2 = arEffectSession.A08;
            C106575Wj r1 = (C106575Wj) r2.getValue();
            C106575Wj A022 = A02(r1, r4);
            A07(r1, A022);
            r2.setValue(A022);
        }
    }

    public final synchronized void A08(C107855aj r9, C92384hD r10, boolean z) {
        C99804tU r0;
        synchronized (this) {
            C92384hD r3 = r10;
            if (r10.A05) {
                r0 = new C75643ht();
            } else {
                r0 = new C75633hs();
            }
            C30511e4 A052 = A05(r0, this);
            this.A02 = AnonymousClass3MY.A0s(new ArEffectSession$enableEffect$1(r9, r3, this, (C30391dr) null, A052, z), this.A07);
        }
    }

    public final synchronized void A09(C108815cL r5) {
        C18070vi.A0d(r5, 0);
        Log.i("ArEffectSession/maybeCancelEnabling Cancelling");
        C30511e4 A052 = A05(r5.CPA(), this);
        this.A00 = AnonymousClass3MY.A0s(new ArEffectSession$maybeCancelEnabling$1((C30391dr) null, A052), this.A07);
    }

    public static final int A00(C106545Wg r1) {
        if (r1 instanceof C92534hU) {
            return 0;
        }
        if ((r1 instanceof C92504hR) || (r1 instanceof C92514hS)) {
            return 1;
        }
        if (r1 instanceof C92484hP) {
            return 2;
        }
        if ((r1 instanceof C92494hQ) || (r1 instanceof C92544hV)) {
            return 4;
        }
        if (r1 instanceof C92524hT) {
            return 3;
        }
        throw AnonymousClass3MW.A14();
    }

    public static C106575Wj A01(ArEffectSession arEffectSession) {
        return (C106575Wj) arEffectSession.A08.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C27621Wu A04(com.whatsapp.areffects.viewmodel.session.ArEffectSession r4, X.C30391dr r5) {
        /*
            boolean r0 = r5 instanceof X.C100154u3
            if (r0 == 0) goto L_0x0037
            r3 = r5
            X.4u3 r3 = (X.C100154u3) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 != r0) goto L_0x003d
            java.lang.Object r4 = r3.L$0
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r4 = (com.whatsapp.areffects.viewmodel.session.ArEffectSession) r4
            X.C30691eM.A01(r2)
        L_0x0022:
            X.00H r0 = r4.A09
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r2)
            X.00H r0 = r4.A09
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            goto L_0x0022
        L_0x0037:
            X.4u3 r3 = new X.4u3
            r3.<init>(r4, r5)
            goto L_0x0012
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.session.ArEffectSession.A04(com.whatsapp.areffects.viewmodel.session.ArEffectSession, X.1dr):X.1Wu");
    }

    public static final C30511e4 A05(C99804tU r9, ArEffectSession arEffectSession) {
        AnonymousClass1OB r8 = arEffectSession.A02;
        AnonymousClass1OB r7 = arEffectSession.A00;
        AnonymousClass1OB r6 = arEffectSession.A01;
        AnonymousClass1OX r2 = arEffectSession.A07;
        return C30451dy.A02(AnonymousClass00R.A01, AnonymousClass1OR.A00, new ArEffectSession$createCleanUpJob$1(r9, (C30391dr) null, r6, r7, r8), r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0178, code lost:
        r3.A0N(r0);
        r3.A0f(r3.A04.A02(r5));
        r3.A0M();
        r3.A0L();
        r3.A0K();
        r3.A0J();
        r3.A0X(X.AnonymousClass11P.A01(r3.A05));
        r3.A0Q(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C106575Wj r7, X.C106575Wj r8) {
        /*
            boolean r0 = r7 instanceof X.C92614hc
            r2 = 2
            r6 = 1
            if (r0 != 0) goto L_0x00f1
            boolean r0 = r7 instanceof X.C92604hb
            if (r0 != 0) goto L_0x00f1
            boolean r0 = r7 instanceof X.C92594ha
            r3 = 4
            if (r0 == 0) goto L_0x00c4
            X.4ha r7 = (X.C92594ha) r7
            X.4hZ r0 = r7.A03
            if (r0 == 0) goto L_0x005b
            X.4a4 r2 = r0.A00
        L_0x0017:
            boolean r0 = r8 instanceof X.C92614hc
            if (r0 == 0) goto L_0x006c
            X.4hc r8 = (X.C92614hc) r8
            X.5Wg r1 = r8.A00
            int r3 = A00(r1)
            if (r2 == 0) goto L_0x0028
            r2.A0T(r3)
        L_0x0028:
            boolean r0 = r1 instanceof X.C92524hT
            if (r0 == 0) goto L_0x00c1
            X.4hT r1 = (X.C92524hT) r1
            X.4tK r1 = r1.A00
            X.4a4 r3 = r7.A00
            boolean r0 = r1 instanceof X.C75513he
            if (r0 == 0) goto L_0x0040
            r0 = 7
        L_0x0037:
            java.lang.String r2 = com.whatsapp.util.Log.getStackTraceInfo(r1)
            X.C18070vi.A0X(r2)
            monitor-enter(r3)
            goto L_0x005d
        L_0x0040:
            boolean r0 = r1 instanceof X.C75533hg
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0037
        L_0x0046:
            boolean r0 = r1 instanceof X.C75523hf
            if (r0 == 0) goto L_0x004d
            r0 = 12
            goto L_0x0037
        L_0x004d:
            boolean r0 = r1 instanceof X.C75553hi
            if (r0 == 0) goto L_0x0054
            r0 = 13
            goto L_0x0037
        L_0x0054:
            boolean r0 = r1 instanceof X.C75543hh
            if (r0 == 0) goto L_0x0067
            r0 = 10
            goto L_0x0037
        L_0x005b:
            r2 = 0
            goto L_0x0017
        L_0x005d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019d }
            r0 = 3
            X.C88544a4.A00(r3, r1, r2, r0)     // Catch:{ all -> 0x019d }
            goto L_0x01a0
        L_0x0067:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x006c:
            boolean r0 = r8 instanceof X.C92584hZ
            if (r0 == 0) goto L_0x00b4
            X.4hZ r8 = (X.C92584hZ) r8
            X.4hD r0 = r8.A03
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0079
            r6 = 4
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.A0T(r6)
        L_0x007e:
            X.4a4 r4 = r8.A00
            monitor-enter(r4)
            X.0vl r0 = r4.A07     // Catch:{ all -> 0x00b1 }
            boolean r0 = X.C72453Mb.A1a(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00af
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x00b1 }
            boolean r0 = r4.A0i(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00af
            X.11P r0 = r4.A05     // Catch:{ all -> 0x00b1 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.Long r0 = r4.A0A()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00aa
            long r0 = r0.longValue()     // Catch:{ all -> 0x00b1 }
            long r2 = r2 - r0
            r4.A0Z(r2)     // Catch:{ all -> 0x00b1 }
            r0 = 1
            r4.A0O(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00af
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00af:
            monitor-exit(r4)
            return
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00b4:
            boolean r0 = r8 instanceof X.C92604hb
            if (r0 == 0) goto L_0x01a1
            X.4hb r8 = (X.C92604hb) r8
            X.4hZ r0 = r8.A00
            X.4a4 r0 = r0.A00
            r0.A0T(r3)
        L_0x00c1:
            X.4a4 r0 = r7.A00
            goto L_0x00e8
        L_0x00c4:
            boolean r0 = r7 instanceof X.C92584hZ
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r8 instanceof X.C92614hc
            if (r0 == 0) goto L_0x00dc
            X.4hZ r7 = (X.C92584hZ) r7
            X.4a4 r1 = r7.A00
            X.4hc r8 = (X.C92614hc) r8
            X.5Wg r0 = r8.A00
            int r0 = A00(r0)
            r1.A0T(r0)
            return
        L_0x00dc:
            boolean r0 = r8 instanceof X.C92594ha
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r8 instanceof X.C92604hb
            if (r0 == 0) goto L_0x01a1
            X.4hZ r7 = (X.C92584hZ) r7
            X.4a4 r0 = r7.A00
        L_0x00e8:
            r0.A0T(r3)
            return
        L_0x00ec:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00f1:
            boolean r0 = r8 instanceof X.C92594ha
            if (r0 == 0) goto L_0x01a1
        L_0x00f5:
            X.4ha r8 = (X.C92594ha) r8
            X.4hD r0 = r8.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x00fe
            r2 = 1
        L_0x00fe:
            X.4a4 r3 = r8.A00
            monitor-enter(r3)
            X.0vl r0 = r3.A07     // Catch:{ all -> 0x019d }
            boolean r0 = X.C72453Mb.A1a(r0)     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r3.A00     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x01a0
            r3.A00 = r6     // Catch:{ all -> 0x019d }
            X.5aj r0 = r3.A02     // Catch:{ all -> 0x019d }
            X.5cD r1 = r0.BUq()     // Catch:{ all -> 0x019d }
            X.4cF r0 = r1.BSi()     // Catch:{ all -> 0x019d }
            r0.toString()     // Catch:{ all -> 0x019d }
            r3.A0I()     // Catch:{ all -> 0x019d }
            X.4cF r0 = r1.BT7()     // Catch:{ all -> 0x019d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x019d }
            r3.A0d(r0)     // Catch:{ all -> 0x019d }
            X.4hD r7 = r3.A03     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x019d }
            r3.A0g(r0)     // Catch:{ all -> 0x019d }
            X.4D9 r5 = r7.A01     // Catch:{ all -> 0x019d }
            int r4 = r5.ordinal()     // Catch:{ all -> 0x019d }
            r1 = 1
            r0 = 0
            if (r4 == r0) goto L_0x0142
            if (r4 == r6) goto L_0x0143
            r0 = 2
            if (r4 != r0) goto L_0x015f
            r1 = 2
            goto L_0x0143
        L_0x0142:
            r1 = 0
        L_0x0143:
            r3.A0P(r1)     // Catch:{ all -> 0x019d }
            com.whatsapp.areffects.arclass.ArClassManager r0 = r3.A01     // Catch:{ all -> 0x019d }
            int r0 = r0.A00()     // Catch:{ all -> 0x019d }
            long r0 = (long) r0     // Catch:{ all -> 0x019d }
            r3.A0U(r0)     // Catch:{ all -> 0x019d }
            X.4DE r0 = r7.A00     // Catch:{ all -> 0x019d }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x019d }
            r0 = 0
            switch(r1) {
                case 0: goto L_0x0178;
                case 1: goto L_0x0178;
                case 2: goto L_0x0177;
                case 3: goto L_0x0175;
                case 4: goto L_0x0173;
                case 5: goto L_0x0171;
                case 6: goto L_0x016f;
                default: goto L_0x015a;
            }     // Catch:{ all -> 0x019d }
        L_0x015a:
            X.3EW r0 = X.AnonymousClass3MW.A14()     // Catch:{ all -> 0x019d }
            goto L_0x016e
        L_0x015f:
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r5)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = " is not a supported surface"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x019d }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x019d }
            r0.<init>(r1)     // Catch:{ all -> 0x019d }
        L_0x016e:
            throw r0     // Catch:{ all -> 0x019d }
        L_0x016f:
            r0 = 6
            goto L_0x0178
        L_0x0171:
            r0 = 1
            goto L_0x0178
        L_0x0173:
            r0 = 2
            goto L_0x0178
        L_0x0175:
            r0 = 7
            goto L_0x0178
        L_0x0177:
            r0 = 5
        L_0x0178:
            r3.A0N(r0)     // Catch:{ all -> 0x019d }
            com.whatsapp.areffects.util.ArEffectsGatingUtil r0 = r3.A04     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r0.A02(r5)     // Catch:{ all -> 0x019d }
            r3.A0f(r0)     // Catch:{ all -> 0x019d }
            r3.A0M()     // Catch:{ all -> 0x019d }
            r3.A0L()     // Catch:{ all -> 0x019d }
            r3.A0K()     // Catch:{ all -> 0x019d }
            r3.A0J()     // Catch:{ all -> 0x019d }
            X.11P r0 = r3.A05     // Catch:{ all -> 0x019d }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x019d }
            r3.A0X(r0)     // Catch:{ all -> 0x019d }
            r3.A0Q(r2)     // Catch:{ all -> 0x019d }
            goto L_0x01a0
        L_0x019d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01a0:
            monitor-exit(r3)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.session.ArEffectSession.A07(X.5Wj, X.5Wj):void");
    }

    public ArEffectSession(C86204Qs r3, C107085Yi r4, C106555Wh r5, C106585Wk r6, AnonymousClass00H r7, AnonymousClass1OX r8) {
        C18070vi.A0p(r7, r5, r4);
        C72473Md.A1J(r6, r8);
        this.A03 = r3;
        this.A09 = r7;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r8;
    }

    public static Object A03(Iterator it) {
        return ((ArEffectSession) it.next()).A08.getValue();
    }
}
