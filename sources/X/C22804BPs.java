package X;

import android.os.Handler;

/* renamed from: X.BPs  reason: case insensitive filesystem */
public final class C22804BPs extends DDR {
    public static final C22892BUd A07 = new Object();
    public DDv A00;
    public final E4Y A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C28607E9y[] A06;

    public C22804BPs(C28423E0o e0o, E94 e94, C28426E0r e0r, E4Y e4y, C28592E9h e9h, int i) {
        C18070vi.A0d(e0r, 4);
        this.A00 = e9h;
        this.A01 = e4y;
        this.A06 = new C28607E9y[i];
        C25313CdJ cdJ = EB3.A01;
        C26159CtX.A01(e9h);
        this.A00 = (DDv) e9h.BPA(cdJ);
        Integer num = AnonymousClass00R.A0C;
        this.A02 = AnonymousClass1DF.A00(num, new C27485DgE(this));
        this.A04 = AnonymousClass1DF.A00(num, new C27486DgF(this));
        this.A03 = AnonymousClass1DF.A00(num, C27861Dmy.A00);
        this.A05 = AnonymousClass1DF.A00(num, new C27837DmY(e0o, e94, e0r));
    }

    public static final void A00(C22804BPs bPs, int i) {
        if (i >= bPs.A06.length) {
            throw AnonymousClass001.A13("index should be < maxRenderers and >= 0, received: ", AnonymousClass000.A10(), i);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.E9y] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.E7n] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.lang.Object, X.C9O] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.CTG] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0F(int r17, boolean r18) {
        /*
            r16 = this;
            r2 = r16
            monitor-enter(r2)
            r3 = r17
            A00(r2, r3)     // Catch:{ all -> 0x0132 }
            X.E9y[] r1 = r2.A06     // Catch:{ all -> 0x0132 }
            r0 = r1[r17]     // Catch:{ all -> 0x0132 }
            r5 = r18
            if (r0 == 0) goto L_0x0014
            boolean r4 = r0 instanceof X.DGT     // Catch:{ all -> 0x0132 }
            if (r4 == r5) goto L_0x0129
        L_0x0014:
            if (r18 == 0) goto L_0x0017
            goto L_0x0031
        L_0x0017:
            android.content.Context r6 = X.DDR.A06(r2)     // Catch:{ all -> 0x0132 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x0132 }
            X.0vl r4 = r2.A03     // Catch:{ all -> 0x0132 }
            java.lang.Object r5 = r4.getValue()     // Catch:{ all -> 0x0132 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.whatsapp.WhatsAppFilterFactoryProvider r5 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.whatsapp.WhatsAppFilterFactoryProvider) r5     // Catch:{ all -> 0x0132 }
            r4 = 1
            X.C18070vi.A0d(r5, r4)     // Catch:{ all -> 0x0132 }
            X.BVr r7 = new X.BVr     // Catch:{ all -> 0x0132 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x0132 }
            goto L_0x00bd
        L_0x0031:
            android.content.Context r11 = X.DDR.A06(r2)     // Catch:{ all -> 0x0132 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0132 }
            X.E4Y r9 = r2.A01     // Catch:{ all -> 0x0132 }
            X.0vl r4 = r2.A04     // Catch:{ all -> 0x0132 }
            java.lang.Object r8 = r4.getValue()     // Catch:{ all -> 0x0132 }
            X.EDH r8 = (X.EDH) r8     // Catch:{ all -> 0x0132 }
            X.0vl r4 = r2.A05     // Catch:{ all -> 0x0132 }
            java.lang.Object r12 = r4.getValue()     // Catch:{ all -> 0x0132 }
            X.CRC r12 = (X.CRC) r12     // Catch:{ all -> 0x0132 }
            r7 = 0
            X.C18070vi.A0k(r8, r12)     // Catch:{ all -> 0x0132 }
            X.CK1 r4 = new X.CK1     // Catch:{ all -> 0x0132 }
            r4.<init>()     // Catch:{ all -> 0x0132 }
            X.CK2 r13 = new X.CK2     // Catch:{ all -> 0x0132 }
            r13.<init>(r4)     // Catch:{ all -> 0x0132 }
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0132 }
            int r4 = r4.availableProcessors()     // Catch:{ all -> 0x0132 }
            java.util.concurrent.ScheduledExecutorService r14 = java.util.concurrent.Executors.newScheduledThreadPool(r4)     // Catch:{ all -> 0x0132 }
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ all -> 0x0132 }
            X.CqS r10 = new X.CqS     // Catch:{ all -> 0x0132 }
            r15 = r14
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0132 }
            X.C9O r4 = new X.C9O     // Catch:{ all -> 0x0132 }
            r4.<init>()     // Catch:{ all -> 0x0132 }
            X.CTG r6 = new X.CTG     // Catch:{ all -> 0x0132 }
            r6.<init>()     // Catch:{ all -> 0x0132 }
            r6.A00 = r11     // Catch:{ all -> 0x0132 }
            r6.A06 = r5     // Catch:{ all -> 0x0132 }
            r6.A04 = r10     // Catch:{ all -> 0x0132 }
            r6.A02 = r9     // Catch:{ all -> 0x0132 }
            r6.A03 = r4     // Catch:{ all -> 0x0132 }
            X.CgY r5 = new X.CgY     // Catch:{ all -> 0x0132 }
            r5.<init>(r8)     // Catch:{ all -> 0x0132 }
            X.CJF r4 = new X.CJF     // Catch:{ all -> 0x0132 }
            r4.<init>(r5)     // Catch:{ all -> 0x0132 }
            r6.A01 = r4     // Catch:{ all -> 0x0132 }
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r4 = new com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl     // Catch:{ all -> 0x0132 }
            r4.<init>(r7)     // Catch:{ all -> 0x0132 }
            r6.A05 = r4     // Catch:{ all -> 0x0132 }
            java.util.concurrent.Executor r14 = r6.A06     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r14)     // Catch:{ all -> 0x0132 }
            android.content.Context r8 = r6.A00     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r8)     // Catch:{ all -> 0x0132 }
            X.CqS r12 = r6.A04     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r12)     // Catch:{ all -> 0x0132 }
            X.E4Y r10 = r6.A02     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r10)     // Catch:{ all -> 0x0132 }
            X.C9O r11 = r6.A03     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r11)     // Catch:{ all -> 0x0132 }
            X.CJF r9 = r6.A01     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r9)     // Catch:{ all -> 0x0132 }
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r13 = r6.A05     // Catch:{ all -> 0x0132 }
            X.C199610h.A04(r13)     // Catch:{ all -> 0x0132 }
            X.DGT r7 = new X.DGT     // Catch:{ all -> 0x0132 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0132 }
        L_0x00bd:
            r1[r17] = r7     // Catch:{ all -> 0x0132 }
            X.0vl r3 = r2.A02     // Catch:{ all -> 0x0132 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0132 }
            X.ED4 r3 = (X.ED4) r3     // Catch:{ all -> 0x0132 }
            java.util.List r7 = X.C200410p.A0P(r1)     // Catch:{ all -> 0x012b }
            X.BPt r3 = (X.C22805BPt) r3     // Catch:{ all -> 0x0132 }
            X.ClH r6 = r3.A02     // Catch:{ all -> 0x0132 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0132 }
        L_0x00d3:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0132 }
            r5 = 0
            if (r1 == 0) goto L_0x00f1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0132 }
            X.E9y r4 = (X.C28607E9y) r4     // Catch:{ all -> 0x0132 }
            boolean r1 = r4 instanceof X.DGT     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x00d3
            r3 = r4
            X.DGT r3 = (X.DGT) r3     // Catch:{ all -> 0x0132 }
            boolean r1 = r4 instanceof X.C28561E7n     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x00ee
            X.E7n r4 = (X.C28561E7n) r4     // Catch:{ all -> 0x0132 }
            r5 = r4
        L_0x00ee:
            r1 = r5
            r5 = r3
            goto L_0x00f2
        L_0x00f1:
            r1 = r5
        L_0x00f2:
            r6.A03 = r5     // Catch:{ all -> 0x0132 }
            r6.A05 = r1     // Catch:{ all -> 0x0132 }
            X.DDv r4 = r6.A02     // Catch:{ all -> 0x0132 }
            if (r4 == 0) goto L_0x012d
            android.os.Handler r1 = r4.A02     // Catch:{ all -> 0x0132 }
            if (r1 != 0) goto L_0x0101
            r4.A06 = r7     // Catch:{ all -> 0x0132 }
            goto L_0x010c
        L_0x0101:
            r3 = 0
            r4.A06 = r3     // Catch:{ all -> 0x0132 }
            X.DGe r1 = new X.DGe     // Catch:{ all -> 0x0132 }
            r1.<init>(r7)     // Catch:{ all -> 0x0132 }
            X.DDv.A06(r4, r1, r3)     // Catch:{ all -> 0x0132 }
        L_0x010c:
            if (r0 == 0) goto L_0x0129
            boolean r1 = r0 instanceof X.DGT     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x011e
            r1 = 0
            X.DGj r3 = new X.DGj     // Catch:{ all -> 0x0132 }
            r3.<init>(r1, r1)     // Catch:{ all -> 0x0132 }
        L_0x0118:
            X.E7m r3 = (X.C28560E7m) r3     // Catch:{ all -> 0x0132 }
            A01(r2, r0, r3)     // Catch:{ all -> 0x0132 }
            goto L_0x0129
        L_0x011e:
            boolean r1 = r0 instanceof X.BVr     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x0129
            r1 = 0
            X.DGi r3 = new X.DGi     // Catch:{ all -> 0x0132 }
            r3.<init>(r1, r1)     // Catch:{ all -> 0x0132 }
            goto L_0x0118
        L_0x0129:
            monitor-exit(r2)
            return
        L_0x012b:
            r0 = move-exception
            goto L_0x0131
        L_0x012d:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0132 }
        L_0x0131:
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22804BPs.A0F(int, boolean):void");
    }

    public C22892BUd BTg() {
        return A07;
    }

    public static final void A01(C22804BPs bPs, C28607E9y e9y, C28560E7m e7m) {
        Handler handler;
        if (e7m.BIP()) {
            C27076DTa dTa = new C27076DTa(e7m, e9y, 1);
            DDv dDv = bPs.A00;
            if (dDv == null || (handler = dDv.A02) == null) {
                dTa.run();
            } else {
                handler.post(dTa);
            }
        } else if (e9y instanceof C28561E7n) {
            ((C28561E7n) e9y).C3B(e7m);
        }
    }
}
