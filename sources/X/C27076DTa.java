package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.DTa  reason: case insensitive filesystem */
public class C27076DTa implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C27076DTa(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C27076DTa(obj, obj2, i));
    }

    public static void A01(Object obj, Object obj2, Executor executor, int i) {
        executor.execute(new C27076DTa(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r0v131, types: [X.C3S, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.E1O, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4, types: [X.E1P, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0429, code lost:
        r2.Bsw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x042c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x057d, code lost:
        if (r3 > 0) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0ad4, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0ad8, code lost:
        throw null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0954  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0973  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09a8  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09d6  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x09fd  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0ad2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r33 = this;
            r4 = r33
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0284;
                case 2: goto L_0x029d;
                case 3: goto L_0x0117;
                case 4: goto L_0x02ab;
                case 5: goto L_0x0008;
                case 6: goto L_0x02b7;
                case 7: goto L_0x0279;
                case 8: goto L_0x0321;
                case 9: goto L_0x0349;
                case 10: goto L_0x03a1;
                case 11: goto L_0x03e6;
                case 12: goto L_0x03f7;
                case 13: goto L_0x0421;
                case 14: goto L_0x0127;
                case 15: goto L_0x0102;
                case 16: goto L_0x0421;
                case 17: goto L_0x042d;
                case 18: goto L_0x043c;
                case 19: goto L_0x0451;
                case 20: goto L_0x0472;
                case 21: goto L_0x013e;
                case 22: goto L_0x0491;
                case 23: goto L_0x04f9;
                case 24: goto L_0x0504;
                case 25: goto L_0x0679;
                case 26: goto L_0x001d;
                case 27: goto L_0x014e;
                case 28: goto L_0x016a;
                case 29: goto L_0x0182;
                case 30: goto L_0x019a;
                case 31: goto L_0x01b2;
                case 32: goto L_0x0688;
                case 33: goto L_0x06b6;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0783;
                case 37: goto L_0x078e;
                case 38: goto L_0x0ad9;
                case 39: goto L_0x0799;
                case 40: goto L_0x07c5;
                case 41: goto L_0x07d2;
                case 42: goto L_0x0805;
                case 43: goto L_0x01ca;
                case 44: goto L_0x0202;
                case 45: goto L_0x083f;
                case 46: goto L_0x0210;
                case 47: goto L_0x08ad;
                case 48: goto L_0x08c2;
                case 49: goto L_0x08ca;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r0 = r4.A02     // Catch:{ all -> 0x0b06 }
            X.C108945cZ.A1P(r0)     // Catch:{ all -> 0x0b06 }
            java.lang.Object r0 = r4.A01
            X.9cL r0 = (X.C185289cL) r0
            android.os.PowerManager$WakeLock r1 = r0.A00
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0007
            r1.release()
            return
        L_0x001d:
            java.lang.Object r0 = r4.A02     // Catch:{ Exception -> 0x0007 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0007 }
            r0.delete()     // Catch:{ Exception -> 0x0007 }
            goto L_0x0b25
        L_0x0026:
            java.lang.Object r10 = r4.A02
            X.EDJ r10 = (X.EDJ) r10
            long r21 = X.BE6.A0O(r4)
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.String r13 = "effect_instance_id"
            java.lang.String r12 = "effect_session_id"
            java.lang.String r19 = "ArEngineControllerImpl"
            java.lang.String r11 = "effect_id"
            java.lang.String r9 = "filter_type"
            boolean r18 = r10.BXc()
            java.util.LinkedList r8 = X.AnonymousClass8BR.A14()
            java.util.LinkedList r15 = X.AnonymousClass8BR.A14()
            java.util.LinkedList r7 = X.AnonymousClass8BR.A14()
            java.util.LinkedList r6 = X.AnonymousClass8BR.A14()
            java.util.LinkedList r5 = X.AnonymousClass8BR.A14()
            java.util.Iterator r17 = r0.iterator()
        L_0x0058:
            boolean r0 = r17.hasNext()
            java.lang.String r4 = "msqrd"
            java.lang.String r3 = "0"
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r17.next()
            X.CJb r0 = (X.C24763CJb) r0
            java.util.Map r2 = r0.A00
            java.lang.String r1 = "none"
            if (r2 == 0) goto L_0x00b9
            boolean r0 = r2.containsKey(r11)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = X.C17880vN.A0s(r11, r2)
        L_0x0078:
            boolean r14 = r2.containsKey(r9)
            if (r14 == 0) goto L_0x0082
            java.lang.String r1 = X.C17880vN.A0s(r9, r2)
        L_0x0082:
            boolean r14 = r2.containsKey(r13)
            if (r14 == 0) goto L_0x00b5
            java.lang.Object r14 = r2.get(r13)
        L_0x008c:
            boolean r16 = r2.containsKey(r12)
            if (r16 == 0) goto L_0x00b3
            java.lang.Object r2 = r2.get(r12)
        L_0x0096:
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00a5
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00a5
            r15.add(r0)
        L_0x00a5:
            r3 = r0
        L_0x00a6:
            r8.add(r3)
            r7.add(r1)
            r6.add(r14)
            r5.add(r2)
            goto L_0x0058
        L_0x00b3:
            r2 = r3
            goto L_0x0096
        L_0x00b5:
            r14 = r3
            goto L_0x008c
        L_0x00b7:
            r0 = r3
            goto L_0x0078
        L_0x00b9:
            r14 = r3
            r2 = r3
            goto L_0x00a6
        L_0x00bc:
            X.E7a r1 = r10.BOB()
            if (r18 == 0) goto L_0x0100
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x00ca:
            java.util.List r2 = r1.BN0(r0, r6, r5)
            java.util.List r1 = r1.BN1(r7)
            boolean r0 = r8.equals(r2)
            if (r0 != 0) goto L_0x0007
            boolean r0 = r15.isEmpty()
            r5 = 0
            if (r0 != 0) goto L_0x0b42
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.util.Iterator r6 = r15.iterator()
        L_0x00e7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0b26
            java.lang.String r1 = X.C17880vN.A0v(r6)
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x00e7
            r4.append(r1)
            java.lang.String r0 = ";"
            r4.append(r0)
            goto L_0x00e7
        L_0x0100:
            r0 = r8
            goto L_0x00ca
        L_0x0102:
            java.lang.Object r2 = r4.A02
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x0007
            r2.get(r0)
            java.lang.String r0 = "onPreviewStopped"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0117:
            java.lang.Object r0 = r4.A01
            X.BPw r0 = (X.C22808BPw) r0
            java.lang.Object r1 = r4.A02
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.view.TextureView r0 = r0.A0A
            if (r0 == 0) goto L_0x0007
            r0.setTransform(r1)
            return
        L_0x0127:
            java.lang.Object r3 = r4.A02
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            r1 = 0
        L_0x0130:
            if (r1 >= r2) goto L_0x0007
            java.lang.Object r0 = r3.get(r1)
            X.E4i r0 = (X.E4i) r0
            r0.C1k()
            int r1 = r1 + 1
            goto L_0x0130
        L_0x013e:
            java.lang.Object r0 = r4.A01
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r0 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r0
            java.lang.Object r1 = r4.A02
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.facebook.smartcapture.components.ContourView r0 = r0.A06
            if (r0 == 0) goto L_0x0007
            r0.setTextTip(r1)
            return
        L_0x014e:
            java.lang.Object r0 = r4.A01
            X.DGH r0 = (X.DGH) r0
            java.lang.Object r2 = r4.A02
            X.CA0 r2 = (X.CA0) r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x015c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            X.EAh r0 = X.BE6.A0U(r1)
            r0.C79(r2)
            goto L_0x015c
        L_0x016a:
            java.lang.Object r0 = r4.A01
            java.util.Iterator r2 = X.DGH.A00(r0)
        L_0x0170:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.EAh r1 = X.BE6.A0U(r2)
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            r1.Bqd(r0)
            goto L_0x0170
        L_0x0182:
            java.lang.Object r0 = r4.A01
            java.util.Iterator r2 = X.DGH.A00(r0)
        L_0x0188:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.EAh r1 = X.BE6.A0U(r2)
            java.lang.Object r0 = r4.A02
            X.CpJ r0 = (X.C25951CpJ) r0
            r1.CAQ(r0)
            goto L_0x0188
        L_0x019a:
            java.lang.Object r0 = r4.A01
            java.util.Iterator r2 = X.DGH.A00(r0)
        L_0x01a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.EAh r1 = X.BE6.A0U(r2)
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            r1.C8i(r0)
            goto L_0x01a0
        L_0x01b2:
            java.lang.Object r0 = r4.A01
            java.util.Iterator r2 = X.DGH.A00(r0)
        L_0x01b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            X.EAh r1 = X.BE6.A0U(r2)
            java.lang.Object r0 = r4.A02
            byte[] r0 = (byte[]) r0
            r1.Bz4(r0)
            goto L_0x01b8
        L_0x01ca:
            java.lang.Object r2 = r4.A02
            X.DIw r2 = (X.C26915DIw) r2
            X.Cyd r0 = r2.A05
            java.util.Map r1 = r0.A09
            X.CYu r0 = r2.A04
            java.lang.Object r5 = r1.get(r0)
            X.DIr r5 = (X.C26910DIr) r5
            if (r5 == 0) goto L_0x0007
            java.lang.Object r1 = r4.A01
            X.Bcx r1 = (X.C23203Bcx) r1
            int r0 = r1.A01
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0bd2
            r0 = 1
            r2.A02 = r0
            X.EDS r3 = r2.A03
            boolean r0 = r3.CFe()
            if (r0 == 0) goto L_0x0ba5
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0007
            com.google.android.gms.common.internal.IAccountAccessor r1 = r2.A00
            if (r1 == 0) goto L_0x0007
            java.util.Set r0 = r2.A01
            r3.BY1(r1, r0)
            return
        L_0x0202:
            java.lang.Object r0 = r4.A01
            X.CWD r0 = (X.CWD) r0
            java.lang.Object r1 = r4.A02
            X.E5B r1 = (X.E5B) r1
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x0007
            goto L_0x0bd6
        L_0x0210:
            java.lang.Object r6 = r4.A01
            X.BZQ r6 = (X.BZQ) r6
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0007
            java.lang.Object r2 = r4.A02
            X.CNr r2 = (X.C24873CNr) r2
            X.Bcx r3 = r2.A01
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x024d
            X.E9G r7 = r6.mLifecycleFragment
            android.app.Activity r5 = r6.getActivity()
            android.app.PendingIntent r4 = r3.A02
            X.C18210vx.A00(r4)
            int r3 = r2.A00
            r2 = 0
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r0 = com.google.android.gms.common.api.GoogleApiActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            java.lang.String r0 = "pending_intent"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "failing_client_id"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "notify_manager"
            r1.putExtra(r0, r2)
            r0 = 1
            r7.startActivityForResult(r1, r0)
            return
        L_0x024d:
            android.app.Activity r1 = r6.getActivity()
            int r7 = r3.A01
            X.1wH r5 = r6.A02
            r0 = 0
            android.content.Intent r0 = r5.A03(r1, r0, r7)
            if (r0 == 0) goto L_0x0bdc
            android.app.Activity r3 = r6.getActivity()
            X.E9G r2 = r6.mLifecycleFragment
            java.lang.String r0 = "d"
            android.content.Intent r1 = r5.A03(r3, r0, r7)
            X.BdP r0 = new X.BdP
            r0.<init>(r1, r2)
            android.app.AlertDialog r1 = X.C41381wH.A00(r3, r6, r0, r7)
            if (r1 == 0) goto L_0x0007
            java.lang.String r0 = "GooglePlayServicesErrorDialog"
            X.C41381wH.A01(r3, r1, r6, r0)
            return
        L_0x0279:
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x027e }
        L_0x027e:
            java.lang.Object r0 = r4.A01
            X.C108945cZ.A1P(r0)
            return
        L_0x0284:
            java.lang.Object r1 = r4.A02
            X.E9y r1 = (X.C28607E9y) r1
            boolean r0 = r1 instanceof X.C28561E7n
            if (r0 == 0) goto L_0x0296
            X.E7n r1 = (X.C28561E7n) r1
            java.lang.Object r0 = r4.A01
            X.E7m r0 = (X.C28560E7m) r0
            r1.C3B(r0)
            return
        L_0x0296:
            java.lang.String r0 = "Renderer does not implement RendererEventListener"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x029d:
            java.lang.Object r0 = r4.A02
            X.BPv r0 = (X.C22807BPv) r0
            java.lang.Object r1 = r4.A01
            X.EDG r1 = (X.EDG) r1
            X.Cyc r0 = r0.A06
            r0.A01(r1)
            return
        L_0x02ab:
            java.lang.Object r1 = r4.A02
            X.3Lx r1 = (X.C72423Lx) r1
            java.lang.Object r0 = r4.A01
            X.CrF r0 = (X.C26048CrF) r0
            r1.C25(r0)
            return
        L_0x02b7:
            java.lang.Object r0 = r4.A02
            X.DBT r0 = (X.DBT) r0
            X.BFG r5 = r0.A00
            X.CmM r3 = r5.A0C
            java.lang.Object r0 = r4.A01
            X.DBr r0 = (X.C26738DBr) r0
            X.BRd r0 = r0.A01
            int r4 = r0.A01
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x02ce
            r0.end()
        L_0x02ce:
            if (r4 != 0) goto L_0x02e9
            android.graphics.Paint r1 = r3.A08
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
        L_0x02d7:
            X.CmM r3 = r5.A0E
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x02e0
            r0.end()
        L_0x02e0:
            if (r4 != 0) goto L_0x0303
            android.graphics.Paint r1 = r3.A08
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x02e9:
            int[] r0 = X.C108945cZ.A1W()
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            long r0 = (long) r4
            r2.setDuration(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r0 = r3.A07
            r2.addUpdateListener(r0)
            r2.start()
            r3.A00 = r2
            goto L_0x02d7
        L_0x0303:
            int[] r0 = X.C108945cZ.A1W()
            r0 = {255, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            long r0 = (long) r4
            r2.setDuration(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r0 = r3.A07
            r2.addUpdateListener(r0)
            r0 = 7
            X.BEQ.A00(r2, r3, r0)
            r2.start()
            r3.A00 = r2
            return
        L_0x0321:
            java.lang.Object r0 = r4.A01
            X.BSX r0 = (X.BSX) r0
            X.DDC r5 = r0.A00
            java.lang.Object r0 = r4.A02
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r4 = r0.first
            X.CcD r4 = (X.C25268CcD) r4
            java.lang.Object r3 = r0.second
            X.ECs r3 = (X.ECs) r3
            r0 = r3
            X.DDI r0 = (X.DDI) r0
            X.E9w r2 = r0.A05
            java.lang.String r1 = "ThrottlingProducer"
            r0 = 0
            r2.C1q(r3, r1, r0)
            X.E4W r1 = r5.A01
            X.BSX r0 = new X.BSX
            r0.<init>(r4, r5)
            r1.CCn(r0, r3)
            return
        L_0x0349:
            java.lang.Object r2 = r4.A01
            X.DEu r2 = (X.C26812DEu) r2
            java.lang.Object r4 = r4.A02
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            X.ClC r1 = r2.A05     // Catch:{ RuntimeException -> 0x0390 }
            if (r1 == 0) goto L_0x035a
            X.BUO r0 = r2.A08     // Catch:{ RuntimeException -> 0x0390 }
            X.BUO.A02(r0, r1)     // Catch:{ RuntimeException -> 0x0390 }
        L_0x035a:
            X.BUO r3 = r2.A08     // Catch:{ RuntimeException -> 0x0390 }
            boolean r0 = r3.A0P     // Catch:{ RuntimeException -> 0x0390 }
            if (r0 == 0) goto L_0x0379
            X.DDy r2 = r2.A07     // Catch:{ RuntimeException -> 0x0390 }
            X.BUV r0 = new X.BUV     // Catch:{ RuntimeException -> 0x0390 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0390 }
            X.DDo r1 = new X.DDo     // Catch:{ RuntimeException -> 0x0390 }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0390 }
            r0 = 0
            X.BUO.A00(r1, r3, r0)     // Catch:{ RuntimeException -> 0x0390 }
            android.os.Handler r0 = r3.A0K     // Catch:{ RuntimeException -> 0x0390 }
            r2.A02(r0)     // Catch:{ RuntimeException -> 0x0390 }
            X.BUO.A01(r3)     // Catch:{ RuntimeException -> 0x0390 }
            goto L_0x03e2
        L_0x0379:
            X.DDy r2 = r2.A07     // Catch:{ RuntimeException -> 0x0390 }
            r2.A01()     // Catch:{ RuntimeException -> 0x0390 }
            X.BUV r0 = new X.BUV     // Catch:{ RuntimeException -> 0x0390 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0390 }
            X.DDo r1 = new X.DDo     // Catch:{ RuntimeException -> 0x0390 }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0390 }
            r0 = 0
            X.BUO.A00(r1, r3, r0)     // Catch:{ RuntimeException -> 0x0390 }
            r2.A00()     // Catch:{ RuntimeException -> 0x0390 }
            goto L_0x03e2
        L_0x0390:
            r3 = move-exception
            java.lang.String r2 = X.BUO.A0U
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.BE6.A1M(r3, r1, r0)
            java.lang.String r0 = "Failed to create SurfaceNode: %s"
            X.C26294Cx6.A0D(r2, r0, r3, r1)
            goto L_0x03e2
        L_0x03a1:
            java.lang.Object r3 = r4.A01
            X.DEv r3 = (X.C26813DEv) r3
            java.lang.Object r4 = r4.A02
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            X.ClC r1 = r3.A05     // Catch:{ RuntimeException -> 0x03d2 }
            if (r1 == 0) goto L_0x03b2
            X.BUN r0 = r3.A08     // Catch:{ RuntimeException -> 0x03d2 }
            X.BUN.A03(r0, r1)     // Catch:{ RuntimeException -> 0x03d2 }
        L_0x03b2:
            X.BUN r2 = r3.A08     // Catch:{ RuntimeException -> 0x03d2 }
            boolean r0 = r2.A0O     // Catch:{ RuntimeException -> 0x03d2 }
            if (r0 == 0) goto L_0x03c6
            X.DDy r1 = r3.A07     // Catch:{ RuntimeException -> 0x03d2 }
            X.BUN.A00(r1, r2)     // Catch:{ RuntimeException -> 0x03d2 }
            android.os.Handler r0 = r2.A0J     // Catch:{ RuntimeException -> 0x03d2 }
            r1.A02(r0)     // Catch:{ RuntimeException -> 0x03d2 }
            X.BUN.A02(r2)     // Catch:{ RuntimeException -> 0x03d2 }
            goto L_0x03e2
        L_0x03c6:
            X.DDy r0 = r3.A07     // Catch:{ RuntimeException -> 0x03d2 }
            r0.A01()     // Catch:{ RuntimeException -> 0x03d2 }
            X.BUN.A00(r0, r2)     // Catch:{ RuntimeException -> 0x03d2 }
            r0.A00()     // Catch:{ RuntimeException -> 0x03d2 }
            goto L_0x03e2
        L_0x03d2:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.BE6.A1M(r3, r2, r0)
            java.lang.String r1 = "RtcSurfacePipeComponent"
            java.lang.String r0 = "Failed to create SurfaceNode: %s"
            X.C26294Cx6.A0D(r1, r0, r3, r2)
        L_0x03e2:
            r4.countDown()
            return
        L_0x03e6:
            java.lang.Object r2 = r4.A01
            X.E9C r2 = (X.E9C) r2
            java.lang.Object r1 = r4.A02
            X.CZR r1 = (X.CZR) r1
            X.ClL r0 = new X.ClL
            r0.<init>(r1)
            r2.C8r(r0)
            return
        L_0x03f7:
            java.lang.Object r1 = r4.A01
            X.ClL r1 = (X.C25751ClL) r1
            java.lang.Object r2 = r4.A02
            X.E9C r2 = (X.E9C) r2
            X.CKO r0 = X.C25751ClL.A0X
            java.lang.Object r0 = r1.A01(r0)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x041a
            int r0 = r0.length
            if (r0 == 0) goto L_0x041a
            r2.C0W(r1)
            X.Cq0 r3 = X.C25986Cq0.A00()
            r2 = 0
            long r0 = r3.A03
            X.C25986Cq0.A01(r3, r2, r0)
            return
        L_0x041a:
            java.lang.String r0 = "Photo taking returned no jpeg data!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            goto L_0x0429
        L_0x0421:
            java.lang.Object r2 = r4.A01
            X.E9C r2 = (X.E9C) r2
            java.lang.Object r0 = r4.A02
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x0429:
            r2.Bsw(r0)
            return
        L_0x042d:
            java.lang.Object r1 = r4.A01
            X.E9C r1 = (X.E9C) r1
            java.lang.Object r0 = r4.A02
            X.ClL r0 = (X.C25751ClL) r0
            r1.C0W(r0)
            r1.C8r(r0)
            return
        L_0x043c:
            java.lang.Object r1 = r4.A01
            X.CNQ r1 = (X.CNQ) r1
            java.lang.Object r0 = r4.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch:{ all -> 0x0448 }
            return
        L_0x0448:
            r2 = move-exception
            X.9iX r1 = r1.A00
            java.lang.String r0 = "OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION"
            r1.A00(r0, r2)
            return
        L_0x0451:
            java.lang.Object r5 = r4.A02
            com.facebook.smartcapture.camera.LiteCameraFragment r5 = (com.facebook.smartcapture.camera.LiteCameraFragment) r5
            X.BHg r3 = r5.A02
            java.lang.String r0 = "cameraViewWrapper"
            if (r3 == 0) goto L_0x0ad4
            java.lang.Object r2 = r4.A01
            X.CUB r2 = (X.CUB) r2
            int r1 = r2.A03
            int r0 = r2.A00
            r3.A02 = r1
            r3.A01 = r0
            int r0 = r2.A02
            r3.A00 = r0
            r3.requestLayout()
            r0 = 1
            r5.A05 = r0
            return
        L_0x0472:
            java.lang.Object r3 = r4.A01
            X.E7h r3 = (X.C28556E7h) r3
            java.lang.Object r0 = r4.A02
            X.DEn r0 = (X.C26805DEn) r0
            java.lang.Integer r2 = r0.A03
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 22
            X.DTa r1 = new X.DTa
            r1.<init>(r3, r2, r0)
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r3)
            r0.post(r1)
            return
        L_0x0491:
            java.lang.Object r3 = r4.A01
            com.facebook.smartcapture.view.IdCaptureActivity r3 = (com.facebook.smartcapture.view.IdCaptureActivity) r3
            java.lang.Object r4 = r4.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x04d1
            r0 = 1
            if (r1 != r0) goto L_0x04e6
            X.Bzl r0 = X.C24350Bzl.SECOND_PHOTO_CONFIRMATION
        L_0x04a5:
            r3.A04 = r0
            X.D3k r2 = r3.A2m()
            int r1 = r4.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x04ce
            r0 = 1
            if (r1 != r0) goto L_0x04df
            java.lang.String r0 = r2.A0A
        L_0x04b7:
            if (r0 == 0) goto L_0x04d8
            java.io.File r0 = X.C108945cZ.A17(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r3.A00 = r0
            X.DEn r0 = r3.A03
            if (r0 != 0) goto L_0x04d4
            java.lang.String r0 = "presenter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x04ce:
            java.lang.String r0 = r2.A0B
            goto L_0x04b7
        L_0x04d1:
            X.Bzl r0 = X.C24350Bzl.FIRST_PHOTO_CONFIRMATION
            goto L_0x04a5
        L_0x04d4:
            r0.A01()
            return
        L_0x04d8:
            java.lang.String r0 = "Required path not passed to IdCaptureConfig"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x04df:
            java.lang.String r0 = "Unsupported CaptureStage"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        L_0x04e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported stage: "
            r1.append(r0)
            java.lang.String r0 = "ID_FRONT_SIDE"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            r3.A2n()
            throw r0
        L_0x04f9:
            java.lang.Object r0 = r4.A02
            X.DG3 r0 = (X.DG3) r0
            r0.getAllKeys()
            r0.getSizeBytes()
            return
        L_0x0504:
            java.lang.Object r0 = r4.A02
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getValue()
            X.BVl r8 = (X.C22923BVl) r8
            monitor-enter(r8)
            java.lang.Object r6 = r4.A01     // Catch:{ all -> 0x0676 }
            X.DG7 r6 = (X.DG7) r6     // Catch:{ all -> 0x0676 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0676 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0676 }
            java.lang.String r1 = "stash"
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x0676 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0560
            boolean r0 = r8 instanceof X.C22922BVk     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x055e
            r0 = r8
            X.BVk r0 = (X.C22922BVk) r0     // Catch:{ all -> 0x0676 }
            java.lang.ref.WeakReference r0 = r0.A00     // Catch:{ all -> 0x0676 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0676 }
            com.facebook.stash.core.Stash r1 = (com.facebook.stash.core.Stash) r1     // Catch:{ all -> 0x0676 }
        L_0x0532:
            boolean r0 = r1 instanceof com.facebook.stash.core.FileStash     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0556
            com.facebook.stash.core.FileStash r1 = (com.facebook.stash.core.FileStash) r1     // Catch:{ all -> 0x0676 }
        L_0x0538:
            X.DGA r9 = new X.DGA     // Catch:{ all -> 0x0676 }
            r9.<init>(r1)     // Catch:{ all -> 0x0676 }
        L_0x053d:
            X.8Qu r5 = r8.A01     // Catch:{ all -> 0x0676 }
            r1 = 0
            if (r5 == 0) goto L_0x056b
            java.lang.Boolean r3 = r6.A01     // Catch:{ all -> 0x0676 }
            if (r3 != 0) goto L_0x0573
            X.E52 r0 = r6.A03     // Catch:{ all -> 0x0676 }
            X.E7j r0 = (X.C28558E7j) r0     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.Bh3()     // Catch:{ all -> 0x0676 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0676 }
            r6.A01 = r3     // Catch:{ all -> 0x0676 }
            goto L_0x0568
        L_0x0556:
            X.E52 r0 = r6.A03     // Catch:{ all -> 0x0676 }
            X.DG4 r1 = new X.DG4     // Catch:{ all -> 0x0676 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0676 }
            goto L_0x0538
        L_0x055e:
            r1 = 0
            goto L_0x0532
        L_0x0560:
            X.E52 r0 = r6.A03     // Catch:{ all -> 0x0676 }
            X.DGB r9 = new X.DGB     // Catch:{ all -> 0x0676 }
            r9.<init>(r0, r2)     // Catch:{ all -> 0x0676 }
            goto L_0x053d
        L_0x0568:
            if (r0 == 0) goto L_0x0573
            goto L_0x056d
        L_0x056b:
            r3 = r1
            goto L_0x057f
        L_0x056d:
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0676 }
            r6.A00 = r0     // Catch:{ all -> 0x0676 }
        L_0x0573:
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0586
            long r3 = r5.A02     // Catch:{ all -> 0x0676 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0586
        L_0x057f:
            X.BVh r0 = r8.A02     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x05a8
            long r5 = r0.A00     // Catch:{ all -> 0x0676 }
            goto L_0x05aa
        L_0x0586:
            java.lang.Boolean r0 = r6.A00     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0598
            X.E52 r0 = r6.A03     // Catch:{ all -> 0x0676 }
            X.E7j r0 = (X.C28558E7j) r0     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.BfP()     // Catch:{ all -> 0x0676 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0676 }
            r6.A00 = r0     // Catch:{ all -> 0x0676 }
        L_0x0598:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x05a5
            long r3 = r5.A01     // Catch:{ all -> 0x0676 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x05a5
            goto L_0x057f
        L_0x05a5:
            long r1 = r5.A00     // Catch:{ all -> 0x0676 }
            goto L_0x056b
        L_0x05a8:
            r5 = 0
        L_0x05aa:
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x05b6
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x05b6
            goto L_0x0646
        L_0x05b6:
            java.util.Collection r2 = r9.BMs()     // Catch:{ all -> 0x0676 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0646
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x05c7
            r12 = -1
            goto L_0x05cf
        L_0x05c7:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0676 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r12 = r12 - r5
        L_0x05cf:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0676 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0676 }
        L_0x05d7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x05ea
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ all -> 0x0676 }
            X.CPh r0 = new X.CPh     // Catch:{ all -> 0x0676 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0676 }
            r10.add(r0)     // Catch:{ all -> 0x0676 }
            goto L_0x05d7
        L_0x05ea:
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ all -> 0x0676 }
            r6 = 3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x061e
            r0 = 8
            X.DUR.A00(r0, r10)     // Catch:{ all -> 0x0676 }
            java.util.ListIterator r11 = r10.listIterator()     // Catch:{ all -> 0x0676 }
        L_0x05fc:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x061e
            java.lang.Object r5 = r11.next()     // Catch:{ all -> 0x0676 }
            X.CPh r5 = (X.C24914CPh) r5     // Catch:{ all -> 0x0676 }
            if (r5 == 0) goto L_0x061e
            java.lang.Long r0 = r5.A00     // Catch:{ all -> 0x0676 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x0676 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x061e
            r11.remove()     // Catch:{ all -> 0x0676 }
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x0676 }
            r0 = 2
            X.C17890vO.A0z(r1, r7, r0)     // Catch:{ all -> 0x0676 }
            goto L_0x05fc
        L_0x061e:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x064a
            r0 = 9
            X.DUR.A00(r0, r10)     // Catch:{ all -> 0x0676 }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ all -> 0x0676 }
        L_0x062b:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x064a
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0676 }
            X.CPh r0 = (X.C24914CPh) r0     // Catch:{ all -> 0x0676 }
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x0676 }
            long r0 = r9.Bh8(r2)     // Catch:{ all -> 0x0676 }
            long r14 = r14 + r0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x062b
            X.C17890vO.A0z(r2, r7, r6)     // Catch:{ all -> 0x0676 }
            goto L_0x062b
        L_0x0646:
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0676 }
        L_0x064a:
            java.util.Iterator r3 = X.AnonymousClass000.A15(r7)     // Catch:{ all -> 0x0676 }
        L_0x064e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0674
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x0676 }
            java.lang.String r0 = X.C17880vN.A0x(r2)     // Catch:{ all -> 0x0676 }
            r9.Bgr(r0)     // Catch:{ all -> 0x0676 }
            boolean r0 = r9.remove(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x064e
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0676 }
            int r1 = X.BE6.A0F(r0)     // Catch:{ all -> 0x0676 }
            r0 = 3
            if (r1 == r0) goto L_0x064e
            r2.getValue()     // Catch:{ all -> 0x0676 }
            goto L_0x064e
        L_0x0674:
            monitor-exit(r8)     // Catch:{ all -> 0x0676 }
            return
        L_0x0676:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0676 }
            throw r0
        L_0x0679:
            java.lang.Object r0 = r4.A01
            X.DW5 r0 = (X.DW5) r0
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r4.A02
            X.C108945cZ.A1P(r0)
            return
        L_0x0688:
            java.lang.Object r0 = r4.A01
            X.Cub r0 = (X.C26204Cub) r0
            X.DRp r1 = r0.A0A
            boolean r0 = r1.enableWarmCodec
            if (r0 == 0) goto L_0x06ae
            boolean r2 = r1.warmupVp9Codec
            boolean r1 = r1.warmupAv1Codec
            java.lang.String r0 = "video/avc"
            X.C26283Cwe.A05(r0)
            java.lang.String r0 = "audio/mp4a-latm"
            X.C26283Cwe.A05(r0)
            if (r2 == 0) goto L_0x06a7
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            X.C26283Cwe.A05(r0)
        L_0x06a7:
            if (r1 == 0) goto L_0x06ae
            java.lang.String r0 = "video/av01"
            X.C26283Cwe.A05(r0)
        L_0x06ae:
            java.lang.Object r0 = r4.A02
            android.os.Looper r0 = (android.os.Looper) r0
            r0.quit()
            return
        L_0x06b6:
            java.lang.Object r9 = r4.A01
            X.Cyh r9 = (X.C26381Cyh) r9
            java.lang.Object r12 = r4.A02
            X.CbZ r12 = (X.C25238CbZ) r12
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "Create new ExoPlayer"
            X.C26381Cyh.A0E(r9, r0, r1)
            X.DRp r2 = r9.A0p
            X.DRk r0 = r2.unstallBufferSetting
            r16 = r0
            X.CKj r0 = new X.CKj
            r0.<init>()
            X.CSt r13 = new X.CSt
            r13.<init>(r0)
            X.C3S r0 = new X.C3S
            r0.<init>()
            r9.A0N = r0
            X.D47 r0 = r12.A0C
            java.lang.String r4 = r0.A0H
            java.util.concurrent.atomic.AtomicReference r11 = r9.A0W
            X.CTu r10 = r9.A0m
            X.C92 r0 = r10.A03
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = new com.facebook.video.heroplayer.service.ServiceEventCallbackImpl
            r8.<init>(r0, r4, r11)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.lang.String r1 = r12.A06
            if (r1 == 0) goto L_0x0715
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0715
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "_"
            r5.append(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r5)
            java.lang.String r0 = "session_id"
            r3.put(r0, r1)
        L_0x0715:
            if (r4 == 0) goto L_0x071c
            java.lang.String r0 = "asset_id"
            r3.put(r0, r4)
        L_0x071c:
            X.DGI r7 = new X.DGI
            r7.<init>()
            r9.A0M = r7
            X.E1P r6 = r9.A0Q
            if (r6 != 0) goto L_0x0734
            X.DRY r0 = r2.tslogSettings
            boolean r0 = r0.enableTslog
            if (r0 == 0) goto L_0x0734
            X.DGO r6 = new X.DGO
            r6.<init>()
            r9.A0Q = r6
        L_0x0734:
            android.content.Context r0 = r9.A0D
            r32 = r0
            android.os.Handler r0 = r9.A0E
            r31 = r0
            X.Cqn r15 = r9.A0L
            java.util.Map r14 = r9.A0V
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.A0t
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.A0q
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.A0r
            X.CKo r2 = r9.A0n
            X.C3S r1 = r9.A0N
            X.Cuc r0 = new X.Cuc
            r28 = r4
            r29 = r3
            r30 = r11
            r25 = r6
            r26 = r14
            r27 = r5
            r22 = r9
            r23 = r8
            r24 = r16
            r19 = r12
            r20 = r10
            r21 = r2
            r16 = r7
            r17 = r1
            r18 = r13
            r13 = r32
            r14 = r31
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9.A12 = r0
            X.DGK r0 = new X.DGK
            r0.<init>(r9)
            r9.A0O = r0
            X.Cuc r1 = r9.A12
            X.DGK r0 = r9.A0O
            r1.A09(r0)
            return
        L_0x0783:
            java.lang.Object r1 = r4.A01
            X.Cyg r1 = (X.C26380Cyg) r1
            java.lang.Object r0 = r4.A02
            X.COY r0 = (X.COY) r0
            r1.A0M = r0
            return
        L_0x078e:
            java.lang.Object r1 = r4.A01
            X.Cyg r1 = (X.C26380Cyg) r1
            java.lang.Object r0 = r4.A02
            X.CLt r0 = (X.C24825CLt) r0
            r1.A0K = r0
            return
        L_0x0799:
            r5 = -1
            java.lang.Object r1 = r4.A02     // Catch:{ all -> 0x07ba }
            X.CRX r1 = (X.CRX) r1     // Catch:{ all -> 0x07ba }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02     // Catch:{ all -> 0x07ba }
            r0.decrementAndGet()     // Catch:{ all -> 0x07ba }
            java.util.concurrent.atomic.AtomicLong r2 = r1.A03     // Catch:{ all -> 0x07ba }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x07ba }
            long r0 = r0.getId()     // Catch:{ all -> 0x07ba }
            r2.set(r0)     // Catch:{ all -> 0x07ba }
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x07ba }
            X.C108945cZ.A1P(r0)     // Catch:{ all -> 0x07ba }
            r2.set(r5)
            return
        L_0x07ba:
            r2 = move-exception
            java.lang.Object r0 = r4.A02
            X.CRX r0 = (X.CRX) r0
            java.util.concurrent.atomic.AtomicLong r0 = r0.A03
            r0.set(r5)
            throw r2
        L_0x07c5:
            java.lang.Object r2 = r4.A01
            android.app.job.JobService r2 = (android.app.job.JobService) r2
            java.lang.Object r1 = r4.A02
            android.app.job.JobParameters r1 = (android.app.job.JobParameters) r1
            r0 = 0
            r2.jobFinished(r1, r0)
            return
        L_0x07d2:
            java.lang.Object r2 = r4.A01
            X.Cxy r2 = (X.C26341Cxy) r2
            java.lang.Object r1 = r4.A02
            android.os.IBinder r1 = (android.os.IBinder) r1
            monitor-enter(r2)
            if (r1 != 0) goto L_0x07de
            goto L_0x07fb
        L_0x07de:
            X.CNp r0 = new X.CNp     // Catch:{ RemoteException -> 0x07f5 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x07f5 }
            r2.A01 = r0     // Catch:{ RemoteException -> 0x07f5 }
            r0 = 2
            r2.A00 = r0     // Catch:{ all -> 0x0802 }
            X.Cpw r0 = r2.A05     // Catch:{ all -> 0x0802 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x0802 }
            X.DSc r0 = new X.DSc     // Catch:{ all -> 0x0802 }
            r0.<init>(r2)     // Catch:{ all -> 0x0802 }
            r1.execute(r0)     // Catch:{ all -> 0x0802 }
            goto L_0x0800
        L_0x07f5:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0802 }
            goto L_0x07fd
        L_0x07fb:
            java.lang.String r0 = "Null service connection"
        L_0x07fd:
            r2.A01(r0)     // Catch:{ all -> 0x0802 }
        L_0x0800:
            monitor-exit(r2)     // Catch:{ all -> 0x0802 }
            return
        L_0x0802:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0802 }
            throw r0
        L_0x0805:
            java.lang.Object r5 = r4.A01
            X.Cxy r5 = (X.C26341Cxy) r5
            java.lang.Object r0 = r4.A02
            X.Cc5 r0 = (X.C25264Cc5) r0
            int r4 = r0.A00
            monitor-enter(r5)
            android.util.SparseArray r2 = r5.A03     // Catch:{ all -> 0x083c }
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x083c }
            X.Cc5 r3 = (X.C25264Cc5) r3     // Catch:{ all -> 0x083c }
            if (r3 == 0) goto L_0x083a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x083c }
            java.lang.String r0 = "Timing out request: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ all -> 0x083c }
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x083c }
            r2.remove(r4)     // Catch:{ all -> 0x083c }
            java.lang.String r2 = "Timed out waiting for response"
            r1 = 0
            X.C1U r0 = new X.C1U     // Catch:{ all -> 0x083c }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x083c }
            r3.A01(r0)     // Catch:{ all -> 0x083c }
            r5.A00()     // Catch:{ all -> 0x083c }
        L_0x083a:
            monitor-exit(r5)
            return
        L_0x083c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x083f:
            java.lang.Object r5 = r4.A02
            X.Bi8 r5 = (X.C23501Bi8) r5
            java.lang.Object r1 = r4.A01
            X.Bap r1 = (X.C23074Bap) r1
            X.Bcx r4 = r1.A01
            int r0 = r4.A01
            if (r0 != 0) goto L_0x08a7
            X.Bbp r1 = r1.A02
            X.C18210vx.A00(r1)
            X.Bcx r4 = r1.A02
            int r0 = r4.A01
            if (r0 != 0) goto L_0x088f
            X.E5E r3 = r5.A00
            com.google.android.gms.common.internal.IAccountAccessor r2 = r1.A00()
            java.util.Set r1 = r5.A06
            X.DIw r3 = (X.C26915DIw) r3
            if (r2 == 0) goto L_0x0879
            if (r1 == 0) goto L_0x0879
            r3.A00 = r2
            r3.A01 = r1
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0873
            X.EDS r0 = r3.A03
            r0.BY1(r2, r1)
        L_0x0873:
            X.EDR r0 = r5.A01
            r0.BIn()
            return
        L_0x0879:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r1, r0, r2)
            r1 = 4
            X.Bcx r0 = new X.Bcx
            r0.<init>(r1)
            r3.CSl(r0)
            goto L_0x0873
        L_0x088f:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "SignInCoordinator"
            java.lang.String r0 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r1, r0, r2)
        L_0x08a7:
            X.E5E r0 = r5.A00
            r0.CSl(r4)
            goto L_0x0873
        L_0x08ad:
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r4.A02
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            X.C26234CvS.A03(r0)     // Catch:{ Exception -> 0x08bd }
            r0 = 0
            r1.setResult(r0)     // Catch:{ Exception -> 0x08bd }
            return
        L_0x08bd:
            r0 = move-exception
            r1.setException(r0)
            return
        L_0x08c2:
            java.lang.Object r0 = r4.A01
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            r0.close()
            return
        L_0x08ca:
            java.lang.Object r0 = r4.A02
            X.BiI r0 = (X.C23508BiI) r0
            X.BEf r6 = r0.A01
            java.lang.Object r1 = r4.A01
            X.BbM r1 = (X.C23107BbM) r1
            com.whatsapp.wearos.WearOsListenerService r6 = (com.whatsapp.wearos.WearOsListenerService) r6
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r7 = r1.A01
            X.C18070vi.A0X(r7)
            java.lang.String r2 = r1.A00
            X.C18070vi.A0X(r2)
            byte[] r1 = r1.A02
            X.C18070vi.A0X(r1)
            X.00H r0 = r6.A01
            if (r0 == 0) goto L_0x0acf
            java.lang.Object r3 = r0.get()
            X.CME r3 = (X.CME) r3
            java.lang.String r0 = "/altLinkingPrefillRequest"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0ac1
            java.nio.charset.Charset r5 = X.C26571Sq.A05     // Catch:{ IOException -> 0x0ab6 }
            java.lang.String r1 = X.BE6.A0q(r5, r1)     // Catch:{ IOException -> 0x0ab6 }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0ab6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0ab6 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x0ab6 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0ab6 }
            r2.beginObject()     // Catch:{ IllegalStateException -> 0x0aaf }
            java.lang.String r1 = r2.nextName()     // Catch:{ IllegalStateException -> 0x0aaf }
            java.lang.String r0 = "wearOsAppVersion"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ IllegalStateException -> 0x0aaf }
            if (r0 == 0) goto L_0x0aa8
            java.lang.String r0 = r2.nextString()     // Catch:{ IllegalStateException -> 0x0aaf }
            r2.endObject()     // Catch:{ IllegalStateException -> 0x0aaf }
            X.C18070vi.A0b(r0)     // Catch:{ IOException -> 0x0ab6 }
            X.CZu r2 = new X.CZu     // Catch:{ IOException -> 0x0ab6 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0ab6 }
            X.00H r0 = r3.A00
            java.lang.Object r9 = r0.get()
            X.CSe r9 = (X.C24979CSe) r9
            X.11S r0 = r9.A00
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0E
            r4 = 0
            if (r1 != 0) goto L_0x0a93
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber no me contact available"
        L_0x093d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0940:
            X.00H r8 = r9.A04
            java.lang.Object r0 = r8.get()
            X.CMF r0 = (X.CMF) r0
            X.0ve r1 = r0.A00
            r0 = 3698(0xe72, float:5.182E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x09fd
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking for Wear OS killswitch is enabled"
        L_0x0956:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest feature disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x095e:
            X.BwZ r8 = X.C24165BwZ.A00
        L_0x0960:
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter
            r3.<init>(r4)
            r3.beginObject()
            boolean r0 = r8 instanceof X.C24164BwY
            java.lang.String r9 = "success"
            if (r0 == 0) goto L_0x09d6
            android.util.JsonWriter r1 = r3.name(r9)
            r0 = 1
            r1.value(r0)
            java.lang.String r0 = "phoneNumber"
            android.util.JsonWriter r1 = r3.name(r0)
            X.BwY r8 = (X.C24164BwY) r8
            java.lang.String r0 = r8.A01
            r1.value(r0)
            java.lang.String r0 = "openOnPhoneNonce"
            android.util.JsonWriter r1 = r3.name(r0)
            java.lang.String r0 = r8.A00
        L_0x0990:
            r1.value(r0)
            r3.endObject()
            r3.close()
            java.lang.String r0 = X.C18070vi.A0H(r4)
            byte[] r2 = r0.getBytes(r5)
            X.C18070vi.A0X(r2)
            X.BZ1 r0 = r6.A00
            if (r0 == 0) goto L_0x0ad2
            X.Cbz r0 = r0.A05
            X.BiK r1 = new X.BiK
            r1.<init>(r0, r7, r2)
            r0.A05(r1)
            X.E5G r0 = X.C26918DIz.A00
            com.google.android.gms.tasks.zzw r3 = X.C25399Cf0.A00(r1, r0)
            r0 = 11
            X.DWa r2 = new X.DWa
            r2.<init>(r0)
            r1 = 9
            X.AJM r0 = new X.AJM
            r0.<init>(r2, r1)
            r3.addOnSuccessListener(r0)
            r1 = 1
            X.DKi r0 = new X.DKi
            r0.<init>(r1)
            r3.addOnFailureListener(r0)
            com.google.android.gms.tasks.Tasks.await(r3)
            return
        L_0x09d6:
            boolean r0 = r8 instanceof X.C24166Bwa
            java.lang.String r2 = "error"
            r1 = 0
            if (r0 == 0) goto L_0x09eb
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "WearOsAppVersionTooOld"
            goto L_0x0990
        L_0x09eb:
            boolean r0 = r8 instanceof X.C24165BwZ
            if (r0 == 0) goto L_0x0aa3
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "Disabled"
            goto L_0x0990
        L_0x09fd:
            r0 = 3548(0xddc, float:4.972E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x0a09
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking prefill is disabled"
            goto L_0x0956
        L_0x0a09:
            java.lang.Object r0 = r8.get()
            X.CMF r0 = (X.CMF) r0
            java.lang.String r8 = r2.A00
            X.2nG r10 = X.C49982Sr.A00(r8)
            X.0ve r1 = r0.A00
            r0 = 3549(0xddd, float:4.973E-42)
            java.lang.String r2 = X.C108955ca.A0v(r1, r0)
            X.2nG r0 = X.C49982Sr.A00(r2)
            if (r10 != 0) goto L_0x0a47
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse Wear OS app version: "
            r1.append(r0)
            r1.append(r8)
        L_0x0a2f:
            X.C17890vO.A0w(r1)
        L_0x0a32:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest version "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " is too old"
            X.C17890vO.A1B(r1, r0)
            X.Bwa r8 = X.C24166Bwa.A00
            goto L_0x0960
        L_0x0a47:
            if (r0 != 0) goto L_0x0a56
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse alt linking min version: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x0a2f
        L_0x0a56:
            int r0 = r10.A00(r0)
            if (r0 < 0) goto L_0x0a32
            if (r4 == 0) goto L_0x095e
            X.0z4 r8 = r9.A01
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r8)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            X.C17880vN.A1F(r1, r0, r2)
            X.0ve r1 = r9.A02
            r0 = 4560(0x11d0, float:6.39E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0a91
            java.lang.String r3 = X.C108985cd.A0f()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r8)
            java.lang.String r0 = "adl_deep_link_nonce"
            X.C17880vN.A1E(r1, r0, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "adl_deep_link_nonce_gen_timestamp"
            r8.A1q(r0, r1)
        L_0x0a8a:
            X.BwY r8 = new X.BwY
            r8.<init>(r4, r3)
            goto L_0x0960
        L_0x0a91:
            r3 = 0
            goto L_0x0a8a
        L_0x0a93:
            X.1CM r0 = r9.A03
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0a9f
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber registration not verified"
            goto L_0x093d
        L_0x0a9f:
            java.lang.String r4 = r1.user
            goto L_0x0940
        L_0x0aa3:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0aa8:
            java.lang.String r0 = "wearOsAppVersion key not present"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IllegalStateException -> 0x0aaf }
            throw r0     // Catch:{ IllegalStateException -> 0x0aaf }
        L_0x0aaf:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0ab6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0ab6 }
            throw r0     // Catch:{ IOException -> 0x0ab6 }
        L_0x0ab6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RequestDispatcher/onRequest failed to parse AltLinkingPrefillRequest: "
            X.C17900vP.A0X(r2, r0, r1)
            return
        L_0x0ac1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RequestDispatcher/onRequest ignoring unrecognised request path: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0acf:
            java.lang.String r0 = "requestDispatcher"
            goto L_0x0ad4
        L_0x0ad2:
            java.lang.String r0 = "messageClient"
        L_0x0ad4:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0ad9:
            java.lang.Object r5 = r4.A02     // Catch:{ all -> 0x0b17 }
            X.CtE r5 = (X.C26149CtE) r5     // Catch:{ all -> 0x0b17 }
            X.Cax r3 = r5.A07     // Catch:{ all -> 0x0b17 }
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A01     // Catch:{ all -> 0x0b17 }
            r2.set(r0)     // Catch:{ all -> 0x0b17 }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A02     // Catch:{ all -> 0x0b17 }
            int r1 = r0.get()     // Catch:{ all -> 0x0b17 }
            r0 = 10
            if (r1 != r0) goto L_0x0afa
            java.lang.Object r1 = r3.A00     // Catch:{ all -> 0x0b17 }
            monitor-enter(r1)     // Catch:{ all -> 0x0b17 }
            r1.notify()     // Catch:{ all -> 0x0af6 }
            goto L_0x0af9
        L_0x0af6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0b17 }
            throw r0     // Catch:{ all -> 0x0b17 }
        L_0x0af9:
            monitor-exit(r1)     // Catch:{ all -> 0x0b17 }
        L_0x0afa:
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x0b17 }
            X.1Di r0 = (X.C22821Di) r0     // Catch:{ all -> 0x0b17 }
            r0.invoke(r5)     // Catch:{ all -> 0x0b17 }
            r0 = 0
            r2.set(r0)
            return
        L_0x0b06:
            r2 = move-exception
            java.lang.Object r0 = r4.A01
            X.9cL r0 = (X.C185289cL) r0
            android.os.PowerManager$WakeLock r1 = r0.A00
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0b24
            r1.release()
            throw r2
        L_0x0b17:
            r2 = move-exception
            java.lang.Object r0 = r4.A02
            X.CtE r0 = (X.C26149CtE) r0
            X.Cax r0 = r0.A07
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            r0.set(r1)
        L_0x0b24:
            throw r2
        L_0x0b25:
            return
        L_0x0b26:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0b50
            if (r18 != 0) goto L_0x0b39
            int r0 = r4.length()
            int r1 = r0 + -1
            r0 = 0
            java.lang.String r3 = r4.substring(r0, r1)
        L_0x0b39:
            X.E7b r0 = r10.BX0()
            X.CK5 r5 = r0.BJr(r3)
            goto L_0x0b50
        L_0x0b42:
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x0b50
            X.E7b r0 = r10.BX0()
            X.CK5 r5 = r0.BJq()
        L_0x0b50:
            java.util.HashMap r4 = X.C17880vN.A11()
            if (r18 != 0) goto L_0x0b70
            int r1 = r2.size()
            int r0 = r8.size()
            java.lang.String r6 = "effects_added"
            if (r1 >= r0) goto L_0x0b7c
            java.util.ArrayList r0 = X.C17880vN.A10(r8)
            r0.removeAll(r2)
            java.lang.String r0 = X.C24530C8b.A00(r0)
            r4.put(r6, r0)
        L_0x0b70:
            java.lang.String r18 = "media_pipeline_update_effects_list"
            java.util.Map r20 = r10.BdX(r5, r4)
            r17 = r10
            r17.BiS(r18, r19, r20, r21)
            return
        L_0x0b7c:
            int r3 = r2.size()
            int r0 = r8.size()
            java.lang.String r1 = "effects_removed"
            if (r3 > r0) goto L_0x0b96
            java.util.ArrayList r0 = X.C17880vN.A10(r8)
            r0.removeAll(r2)
            java.lang.String r0 = X.C24530C8b.A00(r0)
            r4.put(r6, r0)
        L_0x0b96:
            java.util.ArrayList r0 = X.C17880vN.A10(r2)
            r0.removeAll(r8)
            java.lang.String r0 = X.C24530C8b.A00(r0)
            r4.put(r1, r0)
            goto L_0x0b70
        L_0x0ba5:
            r1 = r3
            X.BZz r1 = (X.C23023BZz) r1     // Catch:{ SecurityException -> 0x0bba }
            boolean r0 = r1.CFe()     // Catch:{ SecurityException -> 0x0bba }
            if (r0 == 0) goto L_0x0bb4
            java.util.Set r0 = r1.A01     // Catch:{ SecurityException -> 0x0bba }
        L_0x0bb0:
            r3.BY1(r4, r0)     // Catch:{ SecurityException -> 0x0bba }
            goto L_0x0bb9
        L_0x0bb4:
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ SecurityException -> 0x0bba }
            goto L_0x0bb0
        L_0x0bb9:
            return
        L_0x0bba:
            r2 = move-exception
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Failed to get service from broker. "
            android.util.Log.e(r1, r0, r2)
            java.lang.String r0 = "Failed to get service from broker."
            r3.BIo(r0)
            r1 = 10
            X.Bcx r0 = new X.Bcx
            r0.<init>(r1)
            r5.A0C(r0, r4)
            return
        L_0x0bd2:
            r5.A0C(r1, r4)
            return
        L_0x0bd6:
            r1.BkV(r0)     // Catch:{ RuntimeException -> 0x0bda }
            return
        L_0x0bda:
            r0 = move-exception
            throw r0
        L_0x0bdc:
            r0 = 18
            if (r7 != r0) goto L_0x0c25
            android.app.Activity r7 = r6.getActivity()
            r0 = 16842874(0x101007a, float:2.36939E-38)
            r3 = 0
            android.widget.ProgressBar r2 = new android.widget.ProgressBar
            r2.<init>(r7, r3, r0)
            r0 = 1
            r2.setIndeterminate(r0)
            r0 = 0
            r2.setVisibility(r0)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            r1.setView(r2)
            r0 = 18
            java.lang.String r0 = X.C63692tX.A01(r7, r0)
            r1.setMessage(r0)
            java.lang.String r0 = ""
            r1.setPositiveButton(r0, r3)
            android.app.AlertDialog r2 = r1.create()
            java.lang.String r0 = "GooglePlayServicesUpdatingDialog"
            X.C41381wH.A01(r7, r2, r6, r0)
            android.app.Activity r0 = r6.getActivity()
            android.content.Context r1 = r0.getApplicationContext()
            X.BZZ r0 = new X.BZZ
            r0.<init>(r2, r4)
            r5.A04(r1, r0)
            return
        L_0x0c25:
            int r2 = r2.A00
            java.util.concurrent.atomic.AtomicReference r1 = r6.A04
            r0 = 0
            r1.set(r0)
            X.Cyd r0 = r6.A03
            r0.A06(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27076DTa.run():void");
    }
}
