package com.whatsapp.calling.areffects;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass1G4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D9;
import X.AnonymousClass4RN;
import X.AnonymousClass4YJ;
import X.AnonymousClass4ZO;
import X.AnonymousClass5C1;
import X.AnonymousClass5UZ;
import X.BDF;
import X.BUY;
import X.C106555Wh;
import X.C106575Wj;
import X.C106585Wk;
import X.C107085Yi;
import X.C108335bX;
import X.C136336te;
import X.C175258yP;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C200410p;
import X.C22821Di;
import X.C22889BUa;
import X.C22891BUc;
import X.C26074Cro;
import X.C26704DAd;
import X.C26706DAf;
import X.C26983DOf;
import X.C28596E9n;
import X.C30391dr;
import X.C56102gu;
import X.C82864Cj;
import X.C83474Fg;
import X.C85624Oc;
import X.C85794Ot;
import X.C86534Sa;
import X.C89344cJ;
import X.C92604hb;
import X.C92614hc;
import X.CQQ;
import X.DDU;
import X.ED7;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class CallArEffectsViewModel extends BaseArEffectsViewModel implements BDF {
    public static final Set A0L;
    public String A00;
    public final AnonymousClass4D9 A01 = AnonymousClass4D9.CALLING;
    public final C107085Yi A02;
    public final C106555Wh A03;
    public final C106585Wk A04;
    public final C85794Ot A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final List A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18600wl A0J;
    public final C175258yP A0K;

    static {
        Integer[] numArr = new Integer[4];
        AnonymousClass000.A1L(numArr, -1);
        AnonymousClass000.A1M(numArr, -2);
        AnonymousClass3Ma.A1S(numArr, -10);
        C17890vO.A1G(numArr, -12);
        A0L = C200410p.A0S(numArr);
    }

    public /* synthetic */ void Blp(int i, boolean z, boolean z2) {
    }

    public /* synthetic */ void BmO(C89344cJ r1) {
    }

    public /* synthetic */ void Bn6(long j) {
    }

    public /* synthetic */ void Bn8() {
    }

    public /* synthetic */ void BnL(C86534Sa r1) {
    }

    public /* synthetic */ void BnM(C86534Sa r1) {
    }

    public void BnP(boolean z, String str) {
        C82864Cj r0;
        C18070vi.A0d(str, 1);
        this.A00 = str;
        if (z) {
            if (C18020vd.A05(C18040vf.A01, this.A06, 11143)) {
                AnonymousClass3MY.A1Y(((C85624Oc) this.A0I.getValue()).A04, ((VoipCameraManager) this.A09.get()).isFrontCamera());
            }
        }
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A05.A03);
        if (z) {
            r0 = C82864Cj.SUPPORTS_AR_EFFECTS_AND_OPEN;
        } else {
            r0 = C82864Cj.DOES_NOT_SUPPORT_AR_EFFECTS;
        }
        A17.setValue(r0);
    }

    public /* synthetic */ void Bnc() {
    }

    public /* synthetic */ void Bvf(boolean z) {
    }

    public /* synthetic */ void Byq(UserJid userJid, boolean z) {
    }

    public /* synthetic */ void Byr(UserJid userJid, boolean z) {
    }

    public /* synthetic */ void Bz3(C136336te r1, boolean z) {
    }

    public /* synthetic */ void C07(UserJid[] userJidArr, int[] iArr) {
    }

    public /* synthetic */ void C08(UserJid userJid) {
    }

    public /* synthetic */ void C33(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C36(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C4X(int i) {
    }

    public /* synthetic */ void C4Y(UserJid userJid, boolean z, boolean z2) {
    }

    public /* synthetic */ void C5Q(String str, boolean z) {
    }

    public /* synthetic */ void C9p(UserJid userJid, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.E94, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.DEE, java.lang.Object, X.E4f] */
    public static final C28596E9n A08(CallArEffectsViewModel callArEffectsViewModel, C22821Di r10) {
        C28596E9n e9n;
        AnonymousClass4RN r4 = (AnonymousClass4RN) callArEffectsViewModel.A08.get();
        AnonymousClass5C1 r1 = new AnonymousClass5C1(callArEffectsViewModel);
        AnonymousClass5UZ r5 = new AnonymousClass5UZ(callArEffectsViewModel, r10);
        synchronized (r4) {
            e9n = r4.A00;
            if (e9n == null) {
                Context context = ((AnonymousClass118) r4.A06.get()).A00;
                C18070vi.A0X(context);
                C26706DAf dAf = new C26706DAf(1);
                int A002 = AnonymousClass4ZO.A00(AnonymousClass4D9.CALLING);
                CQQ cqq = (CQQ) C18070vi.A0E(r4.A03);
                ? obj = new Object();
                C26704DAd dAd = new C26704DAd(r4, 1);
                C18070vi.A0d(cqq, 2);
                DDU ddu = new DDU(context, C26074Cro.A00((HandlerThread) r1.invoke(), dAf, "Camera Processor", "whatsapp_calling"));
                ddu.A02(new C22889BUa(ddu));
                ? obj2 = new Object();
                obj2.A00 = ddu;
                ddu.A02(obj2);
                ddu.A02(new BUY(dAd.BV5(), ddu, dAd.BS8()));
                C26074Cro.A01(dAd, ddu, obj, cqq, A002);
                ddu.A01(new C22891BUc(ddu), ED7.A00);
                e9n = new C26983DOf(ddu, r4.A01, r4.A02);
                r5.invoke(e9n);
            }
            r4.A00 = e9n;
        }
        return e9n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r4 >= 5) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A09(com.whatsapp.calling.areffects.CallArEffectsViewModel r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100754v1
            if (r0 == 0) goto L_0x007c
            r6 = r9
            X.4v1 r6 = (X.C100754v1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007c
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x0073
            if (r0 != r5) goto L_0x009f
            int r4 = r6.I$0
            java.lang.Object r3 = r6.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r8 = r6.L$0
            com.whatsapp.calling.areffects.CallArEffectsViewModel r8 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r8
            X.C30691eM.A01(r1)
        L_0x002a:
            int r4 = r4 + 1
            r0 = 5
            if (r4 >= r0) goto L_0x0082
        L_0x002f:
            X.00H r0 = r8.A09
            java.lang.Object r0 = r0.get()
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = (com.whatsapp.voipcalling.camera.VoipCameraManager) r0
            int r2 = r0.toggleCameraProcessor(r5, r5)
            if (r2 != 0) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallArEffectsViewModel/toggleCameraProcessorOn Success, encountered errors: "
            X.C17900vP.A0Y(r3, r0, r1)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0049:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r2)
            r3.add(r0)
            java.util.Set r1 = A0L
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0082
            r0 = 4
            if (r4 >= r0) goto L_0x0082
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A06(r8)
            r6.L$0 = r8
            r6.L$1 = r3
            r6.I$0 = r4
            r6.label = r5
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r7) goto L_0x002a
            return r7
        L_0x0073:
            X.C30691eM.A01(r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r4 = 0
            goto L_0x002f
        L_0x007c:
            X.4v1 r6 = new X.4v1
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x0082:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Camera error codes: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", Last created camera: "
            r1.append(r0)
            java.lang.String r0 = r8.A00
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.3hf r0 = new X.3hf
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.CallArEffectsViewModel.A09(com.whatsapp.calling.areffects.CallArEffectsViewModel, X.1dr):java.lang.Object");
    }

    public static final boolean A0A(C106575Wj r3, CallArEffectsViewModel callArEffectsViewModel) {
        if (r3 instanceof C92614hc) {
            return false;
        }
        if (r3 instanceof C108335bX) {
            C108335bX r32 = (C108335bX) r3;
            return C83474Fg.A00(r32.BW8().A00, callArEffectsViewModel.A01, r32.BR7());
        } else if (r3 instanceof C92604hb) {
            return A0A(((C92604hb) r3).A00, callArEffectsViewModel);
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    public java.lang.Object A0X(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C100224uA
            if (r0 == 0) goto L_0x0041
            r3 = r6
            X.4uA r3 = (X.C100224uA) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0041
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r4 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r0) goto L_0x006a
            java.lang.Object r3 = r3.L$0
            com.whatsapp.calling.areffects.CallArEffectsViewModel r3 = (com.whatsapp.calling.areffects.CallArEffectsViewModel) r3
            X.C30691eM.A01(r4)
        L_0x0024:
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel.A06(r3)
            X.00H r0 = r3.A08
            java.lang.Object r2 = r0.get()
            X.4RN r2 = (X.AnonymousClass4RN) r2
            monitor-enter(r2)
            goto L_0x0047
        L_0x0031:
            X.C30691eM.A01(r4)
            r3.L$0 = r5
            r3.label = r0
            java.lang.Object r0 = super.A0X(r3)
            if (r0 != r2) goto L_0x003f
            return r2
        L_0x003f:
            r3 = r5
            goto L_0x0024
        L_0x0041:
            X.4uA r3 = new X.4uA
            r3.<init>(r5, r6)
            goto L_0x0012
        L_0x0047:
            X.E9n r1 = r2.A00     // Catch:{ all -> 0x0067 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x005e
            X.DOf r1 = (X.C26983DOf) r1     // Catch:{ all -> 0x0067 }
            monitor-enter(r1)     // Catch:{ all -> 0x0067 }
            r1.stop()     // Catch:{ all -> 0x005b }
            X.DDU r0 = r1.A09     // Catch:{ all -> 0x005b }
            r0.destroy()     // Catch:{ all -> 0x005b }
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x005e:
            monitor-exit(r2)
            X.8yP r0 = r3.A0K
            r0.unregisterObserver(r3)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0067:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.CallArEffectsViewModel.A0X(X.1dr):java.lang.Object");
    }

    public final void A0l(boolean z, boolean z2) {
        C56102gu r2;
        C85794Ot r4 = this.A05;
        CallInfo A012 = r4.A01.A01();
        String str = null;
        if (!(A012 == null || (r2 = A012.callWaitingInfo) == null || r2.A01 != 1)) {
            str = r2.A04;
        }
        r4.A05.setValue(new AnonymousClass4YJ(str, z, z2));
    }

    public void BnO(Bitmap bitmap, boolean z) {
        C85794Ot r0 = this.A05;
        if (z) {
            AnonymousClass3MW.A17(r0.A03).setValue(C82864Cj.SUPPORTS_AR_EFFECTS_AND_CLOSED);
        }
    }

    public void A0c(int i) {
        super.A0c(i);
        C28596E9n A002 = ((AnonymousClass4RN) this.A08.get()).A00();
        if (A002 != null) {
            A002.CR6(i * 90);
        }
    }

    public void A0j(boolean z) {
        super.A0j(z);
        if (!z) {
            Collection A0g = C17890vO.A0g(this.A0G);
            if (A0g == null || !A0g.isEmpty()) {
                Iterator it = A0g.iterator();
                while (it.hasNext()) {
                    if (!(ArEffectSession.A03(it) instanceof C92614hc)) {
                        return;
                    }
                }
            }
            AnonymousClass3MX.A1Q(new CallArEffectsViewModel$setIsArEffectsUiShown$2(this, (C30391dr) null), this.A0N);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallArEffectsViewModel(X.C37361pP r25, X.AnonymousClass4KU r26, X.C183829Zt r27, com.whatsapp.areffects.util.ArEffectsGatingUtil r28, X.C106565Wi r29, com.whatsapp.calling.areffects.CallSessionEffectsStateSaver r30, com.whatsapp.calling.areffects.StickyEffectsStateSaver r31, X.C175258yP r32, X.C18030ve r33, X.AnonymousClass00H r34, X.AnonymousClass00H r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, X.C18600wl r39, X.C18600wl r40, X.C18600wl r41) {
        /*
            r24 = this;
            r4 = 1
            r12 = r25
            X.C18070vi.A0d(r12, r4)
            r3 = 2
            r2 = 3
            r1 = 4
            r19 = r29
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r1 = 6
            r13 = r26
            r6 = r39
            r18 = r34
            r15 = r35
            r0 = r18
            X.C72483Me.A16(r6, r0, r13, r15, r1)
            r8 = r37
            r9 = r36
            r14 = r40
            r11 = r32
            r10 = r33
            X.C18070vi.A0y(r14, r10, r11, r9, r8)
            r5 = r41
            r7 = r38
            X.C18070vi.A0m(r5, r7)
            r1 = 0
            r0 = r24
            r17 = r28
            r16 = r27
            r20 = r18
            r21 = r15
            r22 = r14
            r23 = r6
            r18 = r19
            r19 = r10
            r14 = r0
            r15 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A06 = r10
            r0.A0K = r11
            r0.A09 = r9
            r0.A07 = r8
            r0.A0J = r5
            r0.A08 = r7
            X.1OX r5 = r0.A0N
            java.lang.Integer r8 = r0.A06
            X.1pS r7 = r13.A00
            X.10E r9 = r7.A00
            X.00S r7 = r9.ABQ
            java.lang.Object r10 = r7.get()
            com.whatsapp.voipcalling.camera.VoipCameraManager r10 = (com.whatsapp.voipcalling.camera.VoipCameraManager) r10
            X.00S r7 = r9.A1Z
            X.00H r16 = X.C000200d.A00(r7)
            X.00S r7 = r9.A1b
            java.lang.Object r9 = r7.get()
            X.4Yd r9 = (X.C88054Yd) r9
            X.4Ot r7 = new X.4Ot
            r17 = r8
            r18 = r5
            r13 = r7
            r14 = r9
            r15 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A05 = r7
            X.4D9 r7 = X.AnonymousClass4D9.CALLING
            r0.A01 = r7
            X.5By r7 = new X.5By
            r7.<init>(r0)
            X.0vl r7 = X.AnonymousClass1DF.A00(r8, r7)
            r0.A0C = r7
            X.5Bx r7 = new X.5Bx
            r7.<init>(r0)
            X.0vl r7 = X.AnonymousClass1DF.A00(r8, r7)
            r0.A0B = r7
            X.5bJ[] r9 = new X.C108205bJ[r2]
            r7 = 0
            r9[r7] = r31
            r9[r4] = r30
            X.4hM r2 = new X.4hM
            r2.<init>(r12, r6)
            java.util.List r2 = X.C18070vi.A0O(r2, r9, r3)
            r0.A0A = r2
            X.4hX r2 = new X.4hX
            r2.<init>(r0, r7)
            r0.A03 = r2
            X.4hW r2 = new X.4hW
            r2.<init>(r0, r7)
            r0.A02 = r2
            X.4hd r2 = new X.4hd
            r2.<init>(r0, r7)
            r0.A04 = r2
            X.5C3 r2 = new X.5C3
            r2.<init>(r0)
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0H = r2
            X.5Ph r2 = X.C104735Ph.A00
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0F = r2
            X.5Pi r2 = X.C104745Pi.A00
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0I = r2
            X.5Bz r2 = new X.5Bz
            r2.<init>(r0)
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0D = r2
            X.5C2 r2 = new X.5C2
            r2.<init>(r0)
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0G = r2
            X.5C0 r2 = new X.5C0
            r2.<init>(r0)
            X.0vl r2 = X.AnonymousClass1DF.A00(r8, r2)
            r0.A0E = r2
            r0.A0b()
            X.0vl r2 = r0.A0G
            java.util.Map r2 = X.AnonymousClass3MW.A12(r2)
            java.util.ArrayList r4 = X.C72453Mb.A11(r2)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r2)
        L_0x0110:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0122
            java.lang.Object r2 = X.C17890vO.A0P(r3)
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r2 = (com.whatsapp.areffects.viewmodel.session.ArEffectSession) r2
            X.1G4 r2 = r2.A08
            r4.add(r2)
            goto L_0x0110
        L_0x0122:
            java.lang.Object[] r4 = X.C72463Mc.A1b(r4, r7)
            r2 = 7
            X.4sq r3 = new X.4sq
            r3.<init>(r4, r2)
            com.whatsapp.calling.areffects.CallArEffectsViewModel$3 r2 = new com.whatsapp.calling.areffects.CallArEffectsViewModel$3
            r2.<init>(r1)
            X.C88604aC.A04(r2, r5, r3)
            com.whatsapp.calling.areffects.CallArEffectsViewModel$4 r2 = new com.whatsapp.calling.areffects.CallArEffectsViewModel$4
            r2.<init>(r1)
            X.AnonymousClass3MX.A1Q(r2, r5)
            X.4Ot r2 = r0.A05
            X.0vl r2 = r2.A02
            X.1Fz r3 = X.AnonymousClass3MX.A18(r2)
            com.whatsapp.calling.areffects.CallArEffectsViewModel$5 r2 = new com.whatsapp.calling.areffects.CallArEffectsViewModel$5
            r2.<init>(r1)
            X.C88604aC.A04(r2, r5, r3)
            X.8yP r1 = r0.A0K
            r1.registerObserver(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.CallArEffectsViewModel.<init>(X.1pP, X.4KU, X.9Zt, com.whatsapp.areffects.util.ArEffectsGatingUtil, X.5Wi, com.whatsapp.calling.areffects.CallSessionEffectsStateSaver, com.whatsapp.calling.areffects.StickyEffectsStateSaver, X.8yP, X.0ve, X.00H, X.00H, X.00H, X.00H, X.00H, X.0wl, X.0wl, X.0wl):void");
    }
}
