package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class BLW extends AnonymousClass2SF {
    public final AnonymousClass00P A00;
    public final AnonymousClass00P A01;
    public final AnonymousClass00P A02;
    public final C25842Cmw A03;
    public final Object A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final List A09;
    public final C42621yT A0A = new Object();
    public final C39481t9 A0B;
    public final C39481t9 A0C;

    private final void A00(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!A01(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A00(childAt, arrayList);
                    }
                }
                return;
            }
        }
        C108985cd.A1I(view, arrayList);
    }

    public void A04(ViewGroup viewGroup) {
        this.A0A.A01();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.1bX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: X.1bX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: android.transition.Transition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: X.1LG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: android.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: X.1bX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: X.1bX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: android.transition.Transition} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: android.transition.Transition} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.transition.Transition] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v11, types: [X.1LG] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x034c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034c A[LOOP:9: B:130:0x034c->B:210:0x034c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.ViewGroup r33) {
        /*
            r32 = this;
            r5 = r33
            boolean r0 = r5.isLaidOut()
            java.lang.String r3 = "FragmentManager"
            r23 = 2
            r9 = r32
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = r9.A09
            java.util.Iterator r4 = r0.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r0 = r4.next()
            X.1wB r0 = (X.C41331wB) r0
            X.1t9 r2 = r0.A00
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SpecialEffectsController: Container "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " has not been laid out. Completing operation "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            android.util.Log.v(r3, r0)
        L_0x003d:
            r2.A03(r9)
            goto L_0x0014
        L_0x0041:
            java.lang.String r22 = " to "
            X.1t9 r0 = r9.A0C
            r21 = r0
            X.1t9 r4 = r9.A0B
            android.content.Context r0 = r5.getContext()
            android.view.View r11 = new android.view.View
            r11.<init>(r0)
            android.graphics.Rect r20 = X.AnonymousClass3MW.A07()
            java.util.List r0 = r9.A09
            r30 = r0
            java.util.Iterator r16 = r30.iterator()
            r12 = 0
            r10 = 0
            r19 = 0
        L_0x0062:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r16.next()
            X.1wD r0 = (X.C41351wD) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            if (r4 == 0) goto L_0x0062
            if (r21 == 0) goto L_0x0062
            X.00P r0 = r9.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0062
            java.lang.Object r8 = r9.A04
            if (r8 == 0) goto L_0x0062
            X.00P r2 = r9.A00
            X.Cmw r0 = X.C25431Cfd.A01
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            r6 = 4
            X.DTg r1 = new X.DTg
            r0 = r21
            r1.<init>(r9, r0, r4, r6)
            X.C1420577z.A00(r5, r1)
            java.util.ArrayList r14 = r9.A07
            java.util.Collection r0 = r2.values()
            r14.addAll(r0)
            java.util.ArrayList r1 = r9.A06
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = X.AnonymousClass8BS.A0Z(r1, r12)
            java.lang.Object r10 = r2.get(r0)
            android.view.View r10 = (android.view.View) r10
            X.Cmw r0 = r9.A03
            r0.A05(r10, r8)
        L_0x00b7:
            java.util.ArrayList r13 = r9.A08
            X.00P r2 = r9.A01
            java.util.Collection r0 = r2.values()
            r13.addAll(r0)
            java.util.ArrayList r1 = r9.A05
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = X.AnonymousClass8BS.A0Z(r1, r12)
            java.lang.Object r7 = r2.get(r0)
            if (r7 == 0) goto L_0x00e3
            X.Cmw r6 = r9.A03
            r2 = 5
            X.DTg r1 = new X.DTg
            r0 = r20
            r1.<init>(r0, r6, r7, r2)
            X.C1420577z.A00(r5, r1)
            r19 = 1
        L_0x00e3:
            X.Cmw r7 = r9.A03
            boolean r0 = r7 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L_0x0102
            r15 = r8
            X.1LG r15 = (X.AnonymousClass1LG) r15
            java.util.ArrayList r6 = r15.A0F
            r6.clear()
            int r2 = r14.size()
            r1 = 0
        L_0x00f6:
            if (r1 >= r2) goto L_0x0121
            android.view.View r0 = X.BE6.A0R(r14, r1)
            X.C25842Cmw.A02(r0, r6)
            int r1 = r1 + 1
            goto L_0x00f6
        L_0x0102:
            r15 = r8
            android.transition.Transition r15 = (android.transition.Transition) r15
            java.util.List r6 = r15.getTargets()
            r6.clear()
            int r2 = r14.size()
            r1 = 0
        L_0x0111:
            if (r1 >= r2) goto L_0x011d
            android.view.View r0 = X.BE6.A0R(r14, r1)
            X.C25842Cmw.A02(r0, r6)
            int r1 = r1 + 1
            goto L_0x0111
        L_0x011d:
            r6.add(r11)
            goto L_0x0124
        L_0x0121:
            r6.add(r11)
        L_0x0124:
            r14.add(r11)
            r7.A07(r15, r14)
            r26 = 0
            r27 = r8
            r24 = r7
            r25 = r8
            r28 = r26
            r29 = r13
            r24.A06(r25, r26, r27, r28, r29)
            goto L_0x0062
        L_0x013b:
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r30.iterator()
            r12 = 0
            r17 = 0
        L_0x0146:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = r16.next()
            X.1wD r0 = (X.C41351wD) r0
            X.1t9 r13 = r0.A00
            X.Cmw r8 = r9.A03
            java.lang.Object r0 = r0.A01
            java.lang.Object r7 = r8.A03(r0)
            if (r7 == 0) goto L_0x0146
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            androidx.fragment.app.Fragment r1 = r13.A07
            android.view.View r0 = r1.A0B
            X.C18070vi.A0W(r0)
            r9.A00(r0, r6)
            java.lang.Object r0 = r9.A04
            if (r0 == 0) goto L_0x0181
            if (r13 == r4) goto L_0x0176
            r0 = r21
            if (r13 != r0) goto L_0x0181
        L_0x0176:
            if (r13 != r4) goto L_0x02b2
            java.util.ArrayList r0 = r9.A07
        L_0x017a:
            java.util.Set r0 = X.C29431cG.A12(r0)
            r6.removeAll(r0)
        L_0x0181:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0260
            boolean r0 = r8 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L_0x0258
            r0 = r7
            X.1LG r0 = (X.AnonymousClass1LG) r0
            r0.A0E(r11)
        L_0x0191:
            java.lang.Integer r2 = r13.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            java.lang.String r1 = "View: "
            if (r2 != r0) goto L_0x01f9
            r0 = r18
            r0.addAll(r6)
            if (r19 == 0) goto L_0x01b5
            boolean r0 = r8 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L_0x01e7
            r15 = r8
            androidx.transition.FragmentTransitionSupport r15 = (androidx.transition.FragmentTransitionSupport) r15
            r14 = r7
            X.1LG r14 = (X.AnonymousClass1LG) r14
            r13 = 1
            X.BMU r2 = new X.BMU
            r0 = r20
            r2.<init>(r0, r15, r13)
            r14.A0M(r2)
        L_0x01b5:
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x022e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Entering Transition: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r2)
            android.util.Log.v(r3, r0)
            java.lang.String r0 = ">>>>> EnteringViews <<<<<"
            android.util.Log.v(r3, r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x01d1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r2 = r6.next()
            java.lang.StringBuilder r0 = X.C108955ca.A15(r2)
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r1, r0)
            android.util.Log.v(r3, r0)
            goto L_0x01d1
        L_0x01e7:
            r15 = r8
            X.BLT r15 = (X.BLT) r15
            r14 = r7
            android.transition.Transition r14 = (android.transition.Transition) r14
            r13 = 1
            X.BGr r2 = new X.BGr
            r0 = r20
            r2.<init>(r0, r15, r13)
            r14.setEpicenterCallback(r2)
            goto L_0x01b5
        L_0x01f9:
            r8.A05(r10, r7)
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x022e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Exiting Transition: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r2)
            android.util.Log.v(r3, r0)
            java.lang.String r0 = ">>>>> ExitingViews <<<<<"
            android.util.Log.v(r3, r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0218:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x022e
            java.lang.Object r2 = r6.next()
            java.lang.StringBuilder r0 = X.C108955ca.A15(r2)
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r1, r0)
            android.util.Log.v(r3, r0)
            goto L_0x0218
        L_0x022e:
            boolean r0 = r8 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L_0x0246
            X.1bX r0 = new X.1bX
            r0.<init>()
            if (r12 == 0) goto L_0x023e
            X.1LG r12 = (X.AnonymousClass1LG) r12
            r0.A0a(r12)
        L_0x023e:
            X.1LG r7 = (X.AnonymousClass1LG) r7
            r0.A0a(r7)
        L_0x0243:
            r12 = r0
            goto L_0x0146
        L_0x0246:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r12 == 0) goto L_0x0252
            android.transition.Transition r12 = (android.transition.Transition) r12
            r0.addTransition(r12)
        L_0x0252:
            android.transition.Transition r7 = (android.transition.Transition) r7
            r0.addTransition(r7)
            goto L_0x0243
        L_0x0258:
            r0 = r7
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.addTarget(r11)
            goto L_0x0191
        L_0x0260:
            r8.A07(r7, r6)
            r26 = r7
            r29 = r17
            r24 = r8
            r25 = r7
            r27 = r17
            r28 = r6
            r24.A06(r25, r26, r27, r28, r29)
            java.lang.Integer r2 = r13.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x0191
            r0 = 0
            r13.A02 = r0
            java.util.ArrayList r2 = X.C17880vN.A10(r6)
            android.view.View r0 = r1.A0B
            r2.remove(r0)
            android.view.View r1 = r1.A0B
            boolean r0 = r8 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L_0x02a3
            r0 = r8
            androidx.transition.FragmentTransitionSupport r0 = (androidx.transition.FragmentTransitionSupport) r0
            r15 = r7
            X.1LG r15 = (X.AnonymousClass1LG) r15
            X.D79 r14 = new X.D79
            r14.<init>(r1, r0, r2)
            r15.A0N(r14)
        L_0x0298:
            r1 = 5
            X.AkX r0 = new X.AkX
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.C1420577z.A00(r5, r0)
            goto L_0x0191
        L_0x02a3:
            r0 = r8
            X.BLT r0 = (X.BLT) r0
            r15 = r7
            android.transition.Transition r15 = (android.transition.Transition) r15
            X.D4V r14 = new X.D4V
            r14.<init>(r1, r0, r2)
            r15.addListener(r14)
            goto L_0x0298
        L_0x02b2:
            java.util.ArrayList r0 = r9.A08
            goto L_0x017a
        L_0x02b6:
            X.Cmw r2 = r9.A03
            java.lang.Object r1 = r9.A04
            boolean r8 = r2 instanceof androidx.transition.FragmentTransitionSupport
            if (r8 == 0) goto L_0x030e
            X.1LG r12 = (X.AnonymousClass1LG) r12
            r0 = r1
            X.1LG r0 = (X.AnonymousClass1LG) r0
            if (r12 != 0) goto L_0x02c6
            r12 = 0
        L_0x02c6:
            if (r0 == 0) goto L_0x0326
            X.1bX r7 = new X.1bX
            r7.<init>()
            if (r12 == 0) goto L_0x02d2
            r7.A0a(r12)
        L_0x02d2:
            r7.A0a(r0)
        L_0x02d5:
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x02e8
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Final merged transition: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r6)
            android.util.Log.v(r3, r0)
        L_0x02e8:
            r0 = r18
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r7)
            java.lang.Object r11 = r0.first
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r10 = r0.second
            java.util.ArrayList r7 = X.C29351c6.A0D(r30)
            java.util.Iterator r6 = r30.iterator()
        L_0x02fc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0328
            java.lang.Object r0 = r6.next()
            X.1wB r0 = (X.C41331wB) r0
            X.1t9 r0 = r0.A00
            r7.add(r0)
            goto L_0x02fc
        L_0x030e:
            android.transition.Transition r12 = (android.transition.Transition) r12
            r0 = r1
            android.transition.Transition r0 = (android.transition.Transition) r0
            if (r12 != 0) goto L_0x0316
            r12 = 0
        L_0x0316:
            if (r0 == 0) goto L_0x0326
            android.transition.TransitionSet r7 = new android.transition.TransitionSet
            r7.<init>()
            if (r12 == 0) goto L_0x0322
            r7.addTransition(r12)
        L_0x0322:
            r7.addTransition(r0)
            goto L_0x02d5
        L_0x0326:
            r7 = r12
            goto L_0x02d5
        L_0x0328:
            java.util.Iterator r15 = r7.iterator()
        L_0x032c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0382
            java.lang.Object r6 = r15.next()
            X.1yT r13 = r9.A0A
            r0 = 4
            X.Akc r12 = new X.Akc
            r12.<init>((java.lang.Object) r6, (java.lang.Object) r9, (int) r0)
            if (r8 == 0) goto L_0x0370
            r7 = r2
            androidx.transition.FragmentTransitionSupport r7 = (androidx.transition.FragmentTransitionSupport) r7
            r6 = r10
            X.1LG r6 = (X.AnonymousClass1LG) r6
            X.D6H r14 = new X.D6H
            r14.<init>(r7, r6)
            monitor-enter(r13)
        L_0x034c:
            boolean r0 = r13.A01     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x0354
            r13.wait()     // Catch:{ InterruptedException -> 0x034c }
            goto L_0x034c
        L_0x0354:
            X.3K9 r0 = r13.A00     // Catch:{ all -> 0x037f }
            if (r0 == r14) goto L_0x0360
            r13.A00 = r14     // Catch:{ all -> 0x037f }
            boolean r0 = r13.A02     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x0360
            monitor-exit(r13)     // Catch:{ all -> 0x037f }
            goto L_0x0362
        L_0x0360:
            monitor-exit(r13)     // Catch:{ all -> 0x037f }
            goto L_0x0367
        L_0x0362:
            X.1LG r0 = r14.A01
            r0.A08()
        L_0x0367:
            X.D78 r0 = new X.D78
            r0.<init>(r7, r12)
            r6.A0N(r0)
            goto L_0x032c
        L_0x0370:
            r7 = r2
            X.BLT r7 = (X.BLT) r7
            r6 = r10
            android.transition.Transition r6 = (android.transition.Transition) r6
            X.D4U r0 = new X.D4U
            r0.<init>(r7, r12)
            r6.addListener(r0)
            goto L_0x032c
        L_0x037f:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x037f }
            throw r0
        L_0x0382:
            X.DmX r12 = new X.DmX
            r12.<init>(r5, r9, r10)
            r0 = 4
            X.C25431Cfd.A00(r11, r0)
            java.util.ArrayList r7 = r9.A08
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            int r14 = r7.size()
            r13 = 0
        L_0x0396:
            if (r13 >= r14) goto L_0x03ab
            android.view.View r6 = X.BE6.A0R(r7, r13)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r6)
            r10.add(r0)
            r0 = r17
            X.AnonymousClass1Xr.A04(r6, r0)
            int r13 = r13 + 1
            goto L_0x0396
        L_0x03ab:
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x0418
            java.lang.String r0 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r3, r0)
            java.lang.String r0 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r3, r0)
            java.util.ArrayList r0 = r9.A07
            java.util.Iterator r14 = r0.iterator()
        L_0x03c1:
            boolean r0 = r14.hasNext()
            java.lang.String r13 = " Name: "
            java.lang.String r15 = "View: "
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r0 = r14.next()
            X.C18070vi.A0X(r0)
            android.view.View r0 = (android.view.View) r0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r15)
            r6.append(r0)
            r6.append(r13)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r6)
            android.util.Log.v(r3, r0)
            goto L_0x03c1
        L_0x03ea:
            java.lang.String r0 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r3, r0)
            java.util.Iterator r14 = r7.iterator()
        L_0x03f3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = r14.next()
            X.C18070vi.A0X(r0)
            android.view.View r0 = (android.view.View) r0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r15)
            r6.append(r0)
            r6.append(r13)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r6)
            android.util.Log.v(r3, r0)
            goto L_0x03f3
        L_0x0418:
            r12.invoke()
            java.util.ArrayList r6 = r9.A07
            X.00P r0 = r9.A02
            r18 = r0
            int r12 = r7.size()
            java.util.ArrayList r16 = X.AnonymousClass000.A13()
            r13 = 0
        L_0x042a:
            if (r13 >= r12) goto L_0x0460
            android.view.View r14 = X.BE6.A0R(r6, r13)
            java.lang.String r9 = X.AnonymousClass1Xr.A02(r14)
            r0 = r16
            r0.add(r9)
            if (r9 == 0) goto L_0x045a
            r0 = r17
            X.AnonymousClass1Xr.A04(r14, r0)
            r0 = r18
            java.lang.String r15 = X.C17880vN.A0s(r9, r0)
            r14 = 0
        L_0x0447:
            if (r14 >= r12) goto L_0x045a
            java.lang.Object r0 = r10.get(r14)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x045d
            android.view.View r0 = X.BE6.A0R(r7, r14)
            X.AnonymousClass1Xr.A04(r0, r9)
        L_0x045a:
            int r13 = r13 + 1
            goto L_0x042a
        L_0x045d:
            int r14 = r14 + 1
            goto L_0x0447
        L_0x0460:
            r9 = 0
            X.3Ck r0 = new X.3Ck
            r24 = r0
            r25 = r2
            r26 = r7
            r27 = r10
            r28 = r6
            r29 = r16
            r30 = r12
            r31 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            X.C1420577z.A00(r5, r0)
            X.C25431Cfd.A00(r11, r9)
            if (r8 == 0) goto L_0x04ad
            androidx.transition.FragmentTransitionSupport r2 = (androidx.transition.FragmentTransitionSupport) r2
            X.1LG r1 = (X.AnonymousClass1LG) r1
            if (r1 == 0) goto L_0x048f
            java.util.ArrayList r0 = r1.A0F
            r0.clear()
            r0.addAll(r7)
            r2.A09(r1, r6, r7)
        L_0x048f:
            boolean r0 = X.AnonymousClass1GP.A0G(r23)
            if (r0 == 0) goto L_0x04ac
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Completed executing operations from "
            r2.append(r0)
            r2.append(r4)
            r1 = r21
            r0 = r22
            java.lang.String r0 = X.AnonymousClass001.A1E(r1, r0, r2)
            android.util.Log.v(r3, r0)
        L_0x04ac:
            return
        L_0x04ad:
            X.BLT r2 = (X.BLT) r2
            android.transition.Transition r1 = (android.transition.Transition) r1
            if (r1 == 0) goto L_0x048f
            java.util.List r0 = r1.getTargets()
            r0.clear()
            java.util.List r0 = r1.getTargets()
            r0.addAll(r7)
            r2.A09(r1, r6, r7)
            goto L_0x048f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLW.A05(android.view.ViewGroup):void");
    }

    public boolean A06() {
        String str;
        String str2;
        boolean z = this.A03 instanceof BLT;
        boolean A0G = AnonymousClass1GP.A0G(4);
        if (z) {
            if (!A0G) {
                return false;
            }
            str = "FragmentManager";
            str2 = "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.";
        } else if (!A0G) {
            return false;
        } else {
            str = "FragmentManager";
            str2 = "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.";
        }
        Log.i(str, str2);
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1yT] */
    public BLW(AnonymousClass00P r2, AnonymousClass00P r3, AnonymousClass00P r4, C25842Cmw cmw, C39481t9 r6, C39481t9 r7, Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list) {
        this.A09 = list;
        this.A0B = r6;
        this.A0C = r7;
        this.A03 = cmw;
        this.A04 = obj;
        this.A07 = arrayList;
        this.A08 = arrayList2;
        this.A02 = r2;
        this.A05 = arrayList3;
        this.A06 = arrayList4;
        this.A00 = r3;
        this.A01 = r4;
    }

    public static boolean A01(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public void A03(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            for (C41331wB r0 : this.A09) {
                C39481t9 r3 = r0.A00;
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("SpecialEffectsController: Container ");
                    A10.append(viewGroup);
                    Log.v("FragmentManager", AnonymousClass001.A1E(r3, " has not been laid out. Skipping onStart for operation ", A10));
                }
            }
            return;
        }
        List list = this.A09;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C41331wB) it.next()).A00.A07.A0m) {
                        break;
                    }
                } else {
                    break;
                }
            }
            A06();
        }
        Object obj = this.A04;
        if (obj != null) {
            A06();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Ignoring shared elements transition ");
            A102.append(obj);
            A102.append(" between ");
            A102.append(this.A0B);
            A102.append(" and ");
            A102.append(this.A0C);
            Log.i("FragmentManager", AnonymousClass000.A0y(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.", A102));
        }
        A06();
    }
}
