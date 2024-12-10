package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1OE;
import X.AnonymousClass1OR;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass1OY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4D9;
import X.AnonymousClass4DE;
import X.AnonymousClass4S8;
import X.AnonymousClass4VF;
import X.AnonymousClass4Y3;
import X.AnonymousClass4ZO;
import X.AnonymousClass4a5;
import X.AnonymousClass71X;
import X.AnonymousClass78F;
import X.AnonymousClass7DY;
import X.C106285Vg;
import X.C106565Wi;
import X.C106575Wj;
import X.C107855aj;
import X.C108335bX;
import X.C108815cL;
import X.C108825cM;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C183829Zt;
import X.C18560wh;
import X.C18600wl;
import X.C194779sH;
import X.C197009w0;
import X.C19971A1g;
import X.C25073CWg;
import X.C27621Wu;
import X.C30391dr;
import X.C30451dy;
import X.C30511e4;
import X.C35911n2;
import X.C35921n3;
import X.C37361pP;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C75603ho;
import X.C83454Fe;
import X.C83474Fg;
import X.C83504Fj;
import X.C85624Oc;
import X.C85904Pe;
import X.C86214Qt;
import X.C86754Sx;
import X.C87484Vt;
import X.C87694Wo;
import X.C91804gH;
import X.C92364hB;
import X.C92384hD;
import X.C92454hK;
import X.C92474hM;
import X.C92484hP;
import X.C92494hQ;
import X.C93124iT;
import X.C93134iU;
import X.C93144iV;
import X.C93154iW;
import X.C97134oy;
import X.C99064sD;
import X.C99134sK;
import X.C99144sL;
import X.C99804tU;
import X.C99854tZ;
import android.app.Activity;
import android.content.Context;
import com.whatsapp.areffects.ArEffectsTrayCollectionFragment;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.areffects.util.ArEffectsGatingUtil;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession$disableEffect$1;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession$restoreSuspended$1;
import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseArEffectsViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final C37361pP A01;
    public final C183829Zt A02;
    public final AnonymousClass4VF A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final Integer A06;
    public final Integer A07;
    public final List A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18600wl A0M;
    public final AnonymousClass1OX A0N;
    public final AnonymousClass1G4 A0O;
    public final C35911n2 A0P;

    public /* synthetic */ BaseArEffectsViewModel(C37361pP r6, C183829Zt r7, ArEffectsGatingUtil arEffectsGatingUtil, C106565Wi r9, C18030ve r10, AnonymousClass00H r11, AnonymousClass00H r12, C18600wl r13, C18600wl r14) {
        Integer num;
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(new AnonymousClass1OE((AnonymousClass1OB) null).plus(r13).plus(new C99854tZ()));
        C18070vi.A0d(A022, 10);
        this.A01 = r6;
        this.A02 = r7;
        this.A0M = r14;
        this.A04 = r11;
        this.A05 = r12;
        this.A0N = A022;
        Integer A002 = C87484Vt.A00(r10);
        this.A06 = A002;
        if (C18020vd.A05(C18040vf.A02, r10, 12057)) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        this.A07 = num;
        this.A03 = C83504Fj.A00();
        this.A0H = C99134sK.A00(A002, arEffectsGatingUtil, this, 2);
        this.A09 = C99144sL.A00(A002, r10, 19);
        this.A0C = C99134sK.A00(A002, arEffectsGatingUtil, this, 3);
        this.A0A = AnonymousClass1DF.A00(A002, new C99064sD(1));
        this.A0K = AnonymousClass1DF.A00(A002, new C99064sD(0));
        this.A08 = C18070vi.A0M(new C92474hM(r6, r14));
        this.A0G = C99134sK.A00(num, r9, this, 1);
        this.A0O = AnonymousClass3MW.A18(false);
        this.A0P = new C35921n3();
        this.A0L = C99144sL.A00(A002, this, 12);
        this.A0J = C99144sL.A01(this, 13);
        this.A0I = C99144sL.A00(A002, this, 14);
        this.A0E = C99144sL.A00(A002, this, 15);
        this.A0D = C99144sL.A00(A002, this, 16);
        this.A0B = C99144sL.A00(A002, this, 17);
        this.A0F = C99144sL.A00(A002, this, 18);
    }

    public final ArEffectSession A0V(AnonymousClass4DE r4) {
        C18070vi.A0d(r4, 0);
        return (ArEffectSession) AnonymousClass000.A0w(AnonymousClass3MW.A12(this.A0G), AnonymousClass4ZO.A00.A01(r4, A0T()));
    }

    public void A0f(AnonymousClass4DE r5, AnonymousClass4DE r6) {
        Object value;
        Object obj;
        C18070vi.A0d(r6, 1);
        AnonymousClass3MW.A17(((C85624Oc) this.A0I.getValue()).A02).setValue(new C86754Sx(r6, false));
        if (r5 != null) {
            AnonymousClass1G4 r3 = ((C86214Qt) this.A0B.getValue()).A03;
            do {
                value = r3.getValue();
                obj = value;
                if (value instanceof C108825cM) {
                    obj = null;
                }
            } while (!r3.BFK(value, obj));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r22 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        if (X.C18070vi.A18(((X.C92424hH) r1).A00, r4) != false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(X.AnonymousClass4DE r18, X.C107855aj r19, java.lang.Float r20, java.lang.String r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = 0
            r11 = r18
            X.C18070vi.A0d(r11, r0)
            r5 = 1
            r4 = r19
            r15 = r21
            X.C18070vi.A0g(r4, r5, r15)
            r1 = r17
            r3 = r22
            boolean r0 = A07(r11, r4, r1, r3)
            if (r0 == 0) goto L_0x0032
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager r0 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager) r0
            X.1G4 r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "BaseArEffectsViewModel/enableEffect User has not opted in for FLM consent. Skipping."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0031:
            return
        L_0x0032:
            X.0vl r0 = r1.A0F
            java.lang.Object r2 = r0.getValue()
            X.4Pe r2 = (X.C85904Pe) r2
            r0 = 0
            X.A1g r13 = new X.A1g
            r13.<init>(r0, r0, r2)
            X.4D9 r12 = r1.A0T()
            X.4hD r10 = new X.4hD
            r14 = r20
            r16 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r7 = r1.A0V(r11)
            r6 = 0
            if (r7 == 0) goto L_0x00ff
            X.5Wj r2 = com.whatsapp.areffects.viewmodel.session.ArEffectSession.A01(r7)
        L_0x0058:
            boolean r0 = r2 instanceof X.C108335bX
            if (r0 == 0) goto L_0x0066
            X.5bX r2 = (X.C108335bX) r2
            if (r2 == 0) goto L_0x0066
            X.4hD r0 = r2.BW8()
            X.4DE r6 = r0.A00
        L_0x0066:
            if (r7 == 0) goto L_0x0071
            if (r23 == 0) goto L_0x00fb
            X.4hR r0 = X.C92504hR.A00
        L_0x006c:
            X.5cL r0 = (X.C108815cL) r0
            r7.A09(r0)
        L_0x0071:
            if (r6 == 0) goto L_0x0082
            if (r6 != r11) goto L_0x0077
            if (r22 == 0) goto L_0x0084
        L_0x0077:
            X.0vl r0 = r1.A0J
            X.4S8 r0 = X.C72473Md.A0P(r6, r0)
            if (r0 == 0) goto L_0x0082
            r0.A00(r5)
        L_0x0082:
            if (r22 != 0) goto L_0x00ba
        L_0x0084:
            X.0vl r0 = r1.A0J
            X.4S8 r9 = X.C72473Md.A0P(r11, r0)
            if (r9 == 0) goto L_0x00ba
            X.1G4 r8 = r9.A01
            java.lang.Object r0 = r8.getValue()
            X.4Sy r0 = (X.C86764Sy) r0
            X.5Wf r1 = r0.A00
            boolean r0 = r1 instanceof X.C92424hH
            if (r0 == 0) goto L_0x00c0
            X.4hH r1 = (X.C92424hH) r1
            X.5aj r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r0, r4)
            if (r0 == 0) goto L_0x00c0
            X.1G4 r0 = r9.A04
            java.lang.Object r1 = r0.getValue()
            X.5Wf r1 = (X.C106535Wf) r1
            boolean r0 = r1 instanceof X.C92424hH
            if (r0 == 0) goto L_0x00c0
            X.4hH r1 = (X.C92424hH) r1
            X.5aj r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r0, r4)
            if (r0 == 0) goto L_0x00c0
        L_0x00ba:
            if (r7 == 0) goto L_0x0031
            r7.A08(r4, r10, r3)
            return
        L_0x00c0:
            X.1G4 r0 = r9.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r6 = r0.iterator()
        L_0x00cc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.5Wf r1 = (X.C106535Wf) r1
            boolean r0 = r1 instanceof X.C92424hH
            if (r0 == 0) goto L_0x00cc
            X.4hH r1 = (X.C92424hH) r1
            X.5aj r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r0, r4)
            if (r0 == 0) goto L_0x00cc
        L_0x00e7:
            X.5Wf r2 = (X.C106535Wf) r2
            if (r2 == 0) goto L_0x00ba
            X.4Sy r0 = new X.4Sy
            r0.<init>(r2, r5)
            r8.setValue(r0)
            X.1G4 r0 = r9.A04
            r0.setValue(r2)
            goto L_0x00ba
        L_0x00f9:
            r2 = 0
            goto L_0x00e7
        L_0x00fb:
            X.4hQ r0 = X.C92494hQ.A00
            goto L_0x006c
        L_0x00ff:
            r2 = r6
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A0g(X.4DE, X.5aj, java.lang.Float, java.lang.String, boolean, boolean):void");
    }

    public final void A0h(AnonymousClass4DE r8, C108815cL r9) {
        C108815cL r3 = r9;
        boolean A16 = C18070vi.A16(r8, r9);
        C92364hB r2 = new C92364hB(r8, A0T());
        AnonymousClass4S8 A0P2 = C72473Md.A0P(r8, this.A0J);
        if (A0P2 != null) {
            A0P2.A00(A16);
        }
        ArEffectSession arEffectSession = (ArEffectSession) AnonymousClass000.A0w(AnonymousClass3MW.A12(this.A0G), C83454Fe.A00(r2));
        if (arEffectSession != null) {
            synchronized (arEffectSession) {
                C30511e4 A052 = ArEffectSession.A05(r9.CPA(), arEffectSession);
                arEffectSession.A00 = AnonymousClass3MY.A0s(new ArEffectSession$disableEffect$1(r2, r3, arEffectSession, (C30391dr) null, A052), arEffectSession.A07);
            }
        }
    }

    public final void A0i(C18560wh r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass3MW.A1X(r4, new BaseArEffectsViewModel$loadTray$1(this, (C30391dr) null), this.A0N);
    }

    public static C85624Oc A00(ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment) {
        return (C85624Oc) ((BaseArEffectsViewModel) arEffectsTrayCollectionFragment.A05.getValue()).A0I.getValue();
    }

    public static final void A04(BaseArEffectsViewModel baseArEffectsViewModel, C108815cL r4) {
        Iterator it = C17890vO.A0g(baseArEffectsViewModel.A0G).iterator();
        while (it.hasNext()) {
            C106575Wj r1 = (C106575Wj) ArEffectSession.A03(it);
            if (r1 instanceof C108335bX) {
                baseArEffectsViewModel.A0h(((C108335bX) r1).BW8().A00, r4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[LOOP:1: B:9:0x0027->B:12:0x003a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r5, java.lang.Integer r6) {
        /*
            X.0vl r0 = r5.A0G
            java.util.Collection r0 = X.C17890vO.A0g(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x000a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r3 = com.whatsapp.areffects.viewmodel.session.ArEffectSession.A03(r4)
            X.5Wj r3 = (X.C106575Wj) r3
            boolean r0 = r3 instanceof X.C108345bY
            if (r0 == 0) goto L_0x000a
            boolean r0 = r5 instanceof com.whatsapp.calling.areffects.CallArEffectsViewModel
            if (r0 == 0) goto L_0x003d
            r0 = r5
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            java.util.List r0 = r0.A0A
        L_0x0023:
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r1 = r2.next()
            X.5bJ r1 = (X.C108205bJ) r1
            r0 = r3
            X.5bY r0 = (X.C108345bY) r0
            boolean r0 = r1.BjK(r0, r6)
            if (r0 == 0) goto L_0x0027
            goto L_0x000a
        L_0x003d:
            java.util.List r0 = r5.A08
            goto L_0x0023
        L_0x0040:
            boolean r0 = r5 instanceof com.whatsapp.calling.areffects.CallArEffectsViewModel
            if (r0 == 0) goto L_0x0061
            r0 = r5
            com.whatsapp.calling.areffects.CallArEffectsViewModel r0 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r0
            java.util.List r0 = r0.A0A
        L_0x0049:
            java.util.Iterator r2 = r0.iterator()
        L_0x004d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r2.next()
            X.5bJ r1 = (X.C108205bJ) r1
            java.lang.String r0 = r5.A0Y()
            r1.CGl(r6, r0)
            goto L_0x004d
        L_0x0061:
            java.util.List r0 = r5.A08
            goto L_0x0049
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A05(com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel, java.lang.Integer):void");
    }

    public static void A06(CallArEffectsViewModel callArEffectsViewModel) {
        ((VoipCameraManager) callArEffectsViewModel.A09.get()).toggleCameraProcessor(false, false);
    }

    public static final boolean A07(AnonymousClass4DE r1, C107855aj r2, BaseArEffectsViewModel baseArEffectsViewModel, boolean z) {
        if (z) {
            return r2.BUq().BYG();
        }
        AnonymousClass4S8 A0P2 = C72473Md.A0P(r1, baseArEffectsViewModel.A0J);
        if (A0P2 == null || !A0P2.A01()) {
            return false;
        }
        return true;
    }

    public void A0S() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$onCleared$1(this, (C30391dr) null), this.A0N);
        }
    }

    public AnonymousClass4D9 A0T() {
        if (this instanceof C75603ho) {
            return ((C75603ho) this).A03;
        }
        return ((CallArEffectsViewModel) this).A01;
    }

    public AnonymousClass4Y3 A0U() {
        C18100vl r0;
        if (this instanceof C75603ho) {
            r0 = ((C75603ho) this).A0E;
        } else {
            r0 = this.A0K;
        }
        return (AnonymousClass4Y3) r0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0W(java.lang.String r9, X.C30391dr r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C100744v0
            if (r0 == 0) goto L_0x005c
            r6 = r10
            X.4v0 r6 = (X.C100744v0) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r5) goto L_0x00cc
            java.lang.Object r4 = r6.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r9 = r6.L$1
            java.lang.Object r2 = r6.L$0
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r2 = (com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel) r2
            X.C30691eM.A01(r1)
        L_0x002a:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r4.next()
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            X.1G4 r1 = r0.A03
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$findTrayEffectById$2$1 r0 = new com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$findTrayEffectById$2$1
            r0.<init>(r3)
            r6.L$0 = r2
            r6.L$1 = r9
            r6.L$2 = r4
            r6.label = r5
            java.lang.Object r0 = X.C26067Crh.A00(r6, r0, r1)
            if (r0 != r7) goto L_0x002a
            return r7
        L_0x004d:
            X.C30691eM.A01(r1)
            X.0vl r0 = r8.A0J
            java.util.Collection r0 = X.C17890vO.A0g(r0)
            java.util.Iterator r4 = r0.iterator()
            r2 = r8
            goto L_0x002a
        L_0x005c:
            X.4v0 r6 = new X.4v0
            r6.<init>(r8, r10)
            goto L_0x0012
        L_0x0062:
            X.0vl r0 = r2.A0J
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            java.util.Iterator r6 = X.AnonymousClass000.A15(r0)
        L_0x006c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)
            java.lang.Object r0 = r5.getValue()
            X.4S8 r0 = (X.AnonymousClass4S8) r0
            X.1G4 r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x008c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C92424hH
            if (r0 == 0) goto L_0x008c
            r4.add(r1)
            goto L_0x008c
        L_0x009e:
            java.util.Iterator r2 = r4.iterator()
        L_0x00a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4hH r0 = (X.C92424hH) r0
            X.5aj r0 = r0.A00
            X.5cD r0 = r0.BUq()
            X.4cF r0 = r0.BSi()
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x006c
            java.lang.Object r0 = r5.getKey()
            X.1D6 r3 = X.AnonymousClass1D6.A01(r0, r1)
        L_0x00cb:
            return r3
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A0W(java.lang.String, X.1dr):java.lang.Object");
    }

    public Object A0X(C30391dr r5) {
        C108815cL r3;
        C30511e4 A052;
        C108815cL r32;
        ArEffectsFlmConsentManager arEffectsFlmConsentManager = (ArEffectsFlmConsentManager) this.A04.get();
        C97134oy r1 = (C97134oy) arEffectsFlmConsentManager.A02.get();
        if (C72453Mb.A1a(r1.A03)) {
            arEffectsFlmConsentManager.A04.get();
            int A0I2 = C72453Mb.A0I(r1.A01);
            ConcurrentHashMap concurrentHashMap = AnonymousClass71X.A06;
            Activity activity = (Activity) concurrentHashMap.get(Integer.valueOf(A0I2));
            if (activity != null) {
                activity.finish();
            }
            AnonymousClass71X.A02 = null;
            concurrentHashMap.clear();
        }
        if (this instanceof CallArEffectsViewModel) {
            CallInfo A012 = ((CallArEffectsViewModel) this).A05.A01.A01();
            if (A012 == null || A012.callEnding) {
                r32 = C92484hP.A00;
            } else {
                r32 = C92494hQ.A00;
            }
            r3 = r32;
        } else {
            r3 = C92484hP.A00;
        }
        C18100vl r2 = this.A0G;
        for (ArEffectSession A092 : C17890vO.A0g(r2)) {
            A092.A09(r3);
        }
        A05(this, AnonymousClass00R.A00);
        A04(this, r3);
        Map A12 = AnonymousClass3MW.A12(r2);
        ArrayList A11 = C72453Mb.A11(A12);
        Iterator A15 = AnonymousClass000.A15(A12);
        while (A15.hasNext()) {
            ArEffectSession arEffectSession = (ArEffectSession) C17890vO.A0P(A15);
            synchronized (arEffectSession) {
                A052 = ArEffectSession.A05((C99804tU) null, arEffectSession);
            }
            A11.add(A052);
        }
        return AnonymousClass3MX.A13(C197009w0.A01(A11, r5));
    }

    public String A0Y() {
        if (this instanceof C75603ho) {
            return AnonymousClass3MW.A0y(((C75603ho) this).A0D);
        }
        return (String) ((CallArEffectsViewModel) this).A05.A06.getValue();
    }

    public void A0Z() {
        if (this instanceof C75603ho) {
            AnonymousClass7DY r1 = ((C75603ho) this).A07;
            AnonymousClass4a5.A03(r1.A1B);
            AnonymousClass7DY.A0Y(r1, false);
            return;
        }
        ((AnonymousClass1DS) ((CallArEffectsViewModel) this).A0F.getValue()).A0E(C27621Wu.A00);
    }

    public void A0a() {
        AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$onRemoveAllEffectsButtonClicked$1(this, (C30391dr) null), this.A0N);
    }

    public final void A0b() {
        AnonymousClass1OX r6 = this.A0N;
        BaseArEffectsViewModel$restoreState$1 baseArEffectsViewModel$restoreState$1 = new BaseArEffectsViewModel$restoreState$1(this, (C30391dr) null);
        AnonymousClass1OR r5 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r5, baseArEffectsViewModel$restoreState$1, r6);
        C37361pP r3 = this.A01;
        r3.A04.put("", new C91804gH(this, 0));
        C30451dy.A02(A0w, r5, new BaseArEffectsViewModel$collectFlmConsentState$1(this, (C30391dr) null), r6);
    }

    public void A0c(int i) {
        ((C87694Wo) this.A0L.getValue()).A03.setValue(Integer.valueOf(i));
    }

    public final void A0d(Context context, AnonymousClass4DE r21, C107855aj r22, Float f, boolean z) {
        Context context2 = context;
        AnonymousClass4DE r3 = r21;
        boolean A15 = C18070vi.A15(context2, r3);
        C107855aj r4 = r22;
        boolean z2 = z;
        boolean A072 = A07(r3, r4, this, z2);
        Float f2 = f;
        AnonymousClass78F r1 = new AnonymousClass78F(this, r3, r4, f2, A15 ? 1 : 0, z2);
        C92454hK r8 = new C92454hK(r3, r4, this, f2, z2);
        if (!A072 || AnonymousClass000.A1Y(((ArEffectsFlmConsentManager) this.A04.get()).A07.getValue())) {
            r8.Bzd();
            return;
        }
        AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$doWithFlmConsentCheck$1(context2, r1, r8, this, (C30391dr) null), this.A0N);
    }

    public void A0e(AnonymousClass4DE r3) {
        if (this instanceof C75603ho) {
            C75603ho r1 = (C75603ho) this;
            C18070vi.A0d(r3, 0);
            if (C72463Mc.A1a(r1.A0G)) {
                r1.A07.C5f();
            }
        }
    }

    public void A0j(boolean z) {
        AnonymousClass3MY.A1Y(this.A0O, z);
    }

    public boolean A0k(AnonymousClass4DE r5, C107855aj r6) {
        boolean z;
        if (!(this instanceof CallArEffectsViewModel)) {
            return true;
        }
        CallArEffectsViewModel callArEffectsViewModel = (CallArEffectsViewModel) this;
        Object value = ((AnonymousClass1G1) callArEffectsViewModel.A05.A02.getValue()).getValue();
        if (value instanceof C93124iT) {
            return true;
        }
        if (value instanceof C93134iU) {
            z = C83474Fg.A00(r5, AnonymousClass4D9.CALLING, r6);
            if (z) {
                return z;
            }
        } else if ((value instanceof C93144iV) || (value instanceof C93154iW)) {
            z = false;
        } else {
            throw AnonymousClass3MW.A14();
        }
        try {
            CallArEffectsViewModel.A08(callArEffectsViewModel, C106285Vg.A00);
            return z;
        } catch (UnsatisfiedLinkError e) {
            Log.e("CallArEffectsViewModel/canRestoreEffect Failed to mark processor as bindable", e);
            return z;
        }
    }

    public static final void A03(AnonymousClass4DE r10, C107855aj r11, BaseArEffectsViewModel baseArEffectsViewModel, Float f, boolean z) {
        String A0Y = baseArEffectsViewModel.A0Y();
        C18070vi.A0d(A0Y, 1);
        AnonymousClass4DE r4 = r10;
        C92384hD r3 = new C92384hD(r4, baseArEffectsViewModel.A0T(), new C19971A1g((C194779sH) null, (C25073CWg) null, (C85904Pe) baseArEffectsViewModel.A0F.getValue()), f, A0Y, true);
        ArEffectSession arEffectSession = (ArEffectSession) AnonymousClass000.A0w(AnonymousClass3MW.A12(baseArEffectsViewModel.A0G), C83454Fe.A00(r3));
        if (arEffectSession != null) {
            synchronized (arEffectSession) {
                Log.i("ArEffectSession/restoreSuspended Attempting to restore directly to suspended state");
                C30511e4 A052 = ArEffectSession.A05((C99804tU) null, arEffectSession);
                AnonymousClass3MX.A1Q(new ArEffectSession$restoreSuspended$1(r11, r3, arEffectSession, (C30391dr) null, A052, z), arEffectSession.A07);
            }
        }
    }
}
