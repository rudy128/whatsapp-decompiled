package X;

import java.util.concurrent.Callable;

/* renamed from: X.DVh  reason: case insensitive filesystem */
public class C27121DVh implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C27121DVh(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0103;
                case 2: goto L_0x0140;
                case 3: goto L_0x0169;
                case 4: goto L_0x0195;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.0x8 r0 = (X.C18770x8) r0
            java.lang.Object r4 = r13.A02
            java.lang.Object r3 = r13.A03
            java.util.concurrent.ExecutorService r2 = r0.A00
            r1 = 12
            X.3Cf r0 = new X.3Cf
            r0.<init>(r4, r3, r1)
            java.util.concurrent.Future r3 = r2.submit(r0)
        L_0x001a:
            return r3
        L_0x001b:
            r3 = 0
            java.lang.Object r0 = r13.A01     // Catch:{ all -> 0x01fb }
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0     // Catch:{ all -> 0x01fb }
            boolean r0 = r0.get()     // Catch:{ all -> 0x01fb }
            if (r0 != 0) goto L_0x01f5
            java.lang.Object r8 = r13.A03     // Catch:{ all -> 0x01fb }
            X.CkB r8 = (X.C25680CkB) r8     // Catch:{ all -> 0x01fb }
            X.ClX r0 = r8.A02     // Catch:{ all -> 0x01fb }
            java.lang.Object r12 = r13.A02     // Catch:{ all -> 0x01fb }
            X.E8e r12 = (X.C28573E8e) r12     // Catch:{ all -> 0x01fb }
            X.DRJ r5 = r0.A01(r12)     // Catch:{ all -> 0x01fb }
            if (r5 == 0) goto L_0x0049
            java.lang.Class<X.CkB> r4 = X.C25680CkB.class
            java.lang.String r1 = "Found image for %s in staging area"
            java.lang.String r0 = r12.Bb4()     // Catch:{ all -> 0x01fb }
            X.C26265CwA.A02(r4, r0, r1)     // Catch:{ all -> 0x01fb }
        L_0x0041:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x01fb }
            if (r0 != 0) goto L_0x01d9
            goto L_0x01d8
        L_0x0049:
            java.lang.Class<X.CkB> r4 = X.C25680CkB.class
            java.lang.String r0 = "Did not find image for %s in staging area"
            java.lang.String r5 = r12.Bb4()     // Catch:{ all -> 0x01fb }
            X.C26265CwA.A02(r4, r5, r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "Disk cache read for %s"
            X.C26265CwA.A02(r4, r5, r0)     // Catch:{ IOException -> 0x00f5 }
            X.CpV r11 = r8.A00     // Catch:{ IOException -> 0x00f5 }
            X.Cpt r6 = X.C25980Cpt.A00()     // Catch:{ IOException -> 0x00f5 }
            r6.A00 = r12     // Catch:{ IOException -> 0x00f5 }
            java.lang.Object r7 = r11.A08     // Catch:{ IOException -> 0x00de }
            monitor-enter(r7)     // Catch:{ IOException -> 0x00de }
            java.util.ArrayList r10 = X.AnonymousClass8BT.A0z()     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            java.lang.String r0 = X.C8C.A00(r12)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            X.C18070vi.A0b(r0)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            r10.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            r9 = 0
            r1 = r3
            r2 = r3
        L_0x0075:
            int r0 = r10.size()     // Catch:{ all -> 0x00db }
            if (r9 >= r0) goto L_0x0096
            java.lang.Object r1 = r10.get(r9)     // Catch:{ all -> 0x00db }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00db }
            X.E9f r0 = r11.A04     // Catch:{ all -> 0x00db }
            X.CXt r2 = r0.BYI(r12, r1)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0093
            X.C26208Cuj.A01(r1)     // Catch:{ all -> 0x00db }
            java.util.Set r0 = r11.A09     // Catch:{ all -> 0x00db }
            r0.add(r1)     // Catch:{ all -> 0x00db }
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x00db }
            goto L_0x009c
        L_0x0093:
            int r9 = r9 + 1
            goto L_0x0075
        L_0x0096:
            java.util.Set r0 = r11.A09     // Catch:{ all -> 0x00db }
            r0.remove(r1)     // Catch:{ all -> 0x00db }
            goto L_0x0091
        L_0x009c:
            r6.A01()     // Catch:{ IOException -> 0x00f5 }
            if (r2 == 0) goto L_0x00e4
            java.lang.String r0 = "Found entry in disk cache for %s"
            X.C26265CwA.A02(r4, r5, r0)     // Catch:{ IOException -> 0x00f5 }
            java.io.File r0 = r2.A00     // Catch:{ IOException -> 0x00f5 }
            java.io.FileInputStream r7 = X.C108945cZ.A18(r0)     // Catch:{ IOException -> 0x00f5 }
            X.CVg r6 = r8.A03     // Catch:{ all -> 0x00f0 }
            long r1 = r0.length()     // Catch:{ all -> 0x00f0 }
            int r0 = (int) r1     // Catch:{ all -> 0x00f0 }
            X.DRG r1 = r6.A00(r7, r0)     // Catch:{ all -> 0x00f0 }
            r7.close()     // Catch:{ IOException -> 0x00f5 }
            java.lang.String r0 = "Successful read from disk cache for %s"
            X.C26265CwA.A02(r4, r5, r0)     // Catch:{ IOException -> 0x00f5 }
            X.DRN r1 = X.DRN.A01(r1)     // Catch:{ Exception -> 0x001a }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x001a }
            X.DRJ r5 = new X.DRJ     // Catch:{ all -> 0x00d0 }
            r5.<init>(r1)     // Catch:{ all -> 0x00d0 }
            r1.close()     // Catch:{ Exception -> 0x001a }
            goto L_0x0041
        L_0x00d0:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x001a }
            throw r0     // Catch:{ Exception -> 0x001a }
        L_0x00d5:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r6.A01 = r0     // Catch:{ all -> 0x00eb }
            r6.A01()     // Catch:{ IOException -> 0x00f5 }
        L_0x00e4:
            java.lang.String r0 = "Disk cache miss for %s"
            X.C26265CwA.A02(r4, r5, r0)     // Catch:{ IOException -> 0x00f5 }
            goto L_0x01f4
        L_0x00eb:
            r0 = move-exception
            r6.A01()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x00f4
        L_0x00f0:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x00f5 }
        L_0x00f4:
            throw r0     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
            r2 = move-exception
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x001a }
            r0 = 0
            r1[r0] = r5     // Catch:{ Exception -> 0x001a }
            java.lang.String r0 = "Exception reading from cache for %s"
            X.C26265CwA.A07(r0, r2, r1)     // Catch:{ Exception -> 0x001a }
            throw r2     // Catch:{ Exception -> 0x001a }
        L_0x0103:
            java.lang.Object r2 = r13.A01
            X.Cc8 r2 = (X.C25267Cc8) r2
            X.Ca9 r1 = r2.A0A
            java.lang.String r0 = "Cannot schedule reset focus task, not prepared"
            r1.A00(r0)
            X.CK9 r0 = r2.A03
            X.C28111Yx.A02(r0)
            X.DEr r0 = r0.A00
            boolean r0 = r0.isConnected()
            r3 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x001a
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x001a
            r0 = 0
            r2.A0C = r0
            r2.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2.A04(r0, r3)
            java.lang.Object r1 = r13.A02
            X.DEU r1 = (X.DEU) r1
            r1.A05 = r3
            r1.A04 = r3
            java.lang.Object r0 = r13.A03     // Catch:{  }
            android.hardware.camera2.CaptureRequest$Builder r0 = (android.hardware.camera2.CaptureRequest.Builder) r0     // Catch:{  }
            r2.A01(r0, r1)     // Catch:{  }
            goto L_0x01ff
        L_0x0140:
            java.lang.Object r2 = r13.A01
            X.Cc8 r2 = (X.C25267Cc8) r2
            X.Ca9 r1 = r2.A0A
            java.lang.String r0 = "Cannot schedule reset focus task, not prepared"
            r1.A00(r0)
            X.CK9 r0 = r2.A03
            X.C28111Yx.A02(r0)
            X.DEr r0 = r0.A00
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0167
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x0167
            java.lang.Object r1 = r13.A02
            X.DEU r1 = (X.DEU) r1
            X.CKE r0 = new X.CKE
            r0.<init>(r13)
            r1.A04 = r0
        L_0x0167:
            r3 = 0
            return r3
        L_0x0169:
            java.lang.Object r0 = r13.A01
            X.CmT r0 = (X.C25816CmT) r0
            X.CvG r0 = r0.A02
            if (r0 == 0) goto L_0x018d
            X.E9T r1 = r0.A08
            if (r1 == 0) goto L_0x0185
            java.lang.Object r0 = r13.A02
            android.hardware.camera2.CaptureRequest$Builder r0 = (android.hardware.camera2.CaptureRequest.Builder) r0
            android.hardware.camera2.CaptureRequest r0 = r0.build()
            java.lang.Object r3 = r13.A03
            X.DET r3 = (X.DET) r3
            r1.BEY(r0, r3)
            return r3
        L_0x0185:
            java.lang.String r1 = "Session closed while capturing photo."
            X.Da2 r0 = new X.Da2
            r0.<init>(r1)
            throw r0
        L_0x018d:
            java.lang.String r1 = "Preview closed while capturing photo."
            X.Da2 r0 = new X.Da2
            r0.<init>(r1)
            throw r0
        L_0x0195:
            java.lang.Object r1 = r13.A01
            X.CmT r1 = (X.C25816CmT) r1
            X.CvG r0 = r1.A02
            if (r0 == 0) goto L_0x01d5
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x01d5
            X.CvG r0 = r1.A02
            X.E9T r5 = r0.A08
            if (r5 == 0) goto L_0x01d5
            java.lang.Object r4 = r13.A03
            android.hardware.camera2.CaptureRequest$Builder r4 = (android.hardware.camera2.CaptureRequest.Builder) r4
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r1 = X.AnonymousClass3MY.A0f()
            r4.set(r2, r1)
            android.hardware.camera2.CaptureRequest r0 = r4.build()
            java.lang.Object r3 = r13.A02
            X.DEU r3 = (X.DEU) r3
            r5.BEY(r0, r3)
            r0 = 1
            X.BE7.A14(r4, r2, r0)
            android.hardware.camera2.CaptureRequest r0 = r4.build()
            r5.BEY(r0, r3)
            r4.set(r2, r1)
            android.hardware.camera2.CaptureRequest r0 = r4.build()
            r5.CKN(r0, r3)
            return r3
        L_0x01d5:
            java.lang.Object r3 = r13.A02
            return r3
        L_0x01d8:
            return r5
        L_0x01d9:
            java.lang.String r2 = "Host thread was interrupted, decreasing reference count"
            X.EAY r1 = X.C26265CwA.A00     // Catch:{ all -> 0x01fb }
            r0 = 2
            boolean r0 = r1.BfN(r0)     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = r4.getSimpleName()     // Catch:{ all -> 0x01fb }
            r1.CRf(r0, r2)     // Catch:{ all -> 0x01fb }
        L_0x01eb:
            r5.close()     // Catch:{ all -> 0x01fb }
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x01fb }
            r0.<init>()     // Catch:{ all -> 0x01fb }
            goto L_0x01fa
        L_0x01f4:
            return r3
        L_0x01f5:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x01fb }
            r0.<init>()     // Catch:{ all -> 0x01fb }
        L_0x01fa:
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            throw r0
        L_0x01ff:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27121DVh.call():java.lang.Object");
    }
}
