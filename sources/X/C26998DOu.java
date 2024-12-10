package X;

/* renamed from: X.DOu  reason: case insensitive filesystem */
public final /* synthetic */ class C26998DOu implements C28526E6a {
    public final /* synthetic */ C25688CkJ A00;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0092=Splitter:B:43:0x0092, B:38:0x0089=Splitter:B:38:0x0089} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.CQV BM5() {
        /*
            r15 = this;
            X.CkJ r4 = r15.A00
            boolean r0 = r4.A07
            r10 = 0
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r3 = r4.A05
            monitor-enter(r3)
            r0 = 1
            r2 = 0
            r4.A06 = r0     // Catch:{ all -> 0x0099 }
        L_0x000e:
            boolean r0 = r4.A08     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x001a
            boolean r0 = r4.A07     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x001a
            r3.wait()     // Catch:{ InterruptedException -> 0x000e }
            goto L_0x000e
        L_0x001a:
            boolean r0 = r4.A07     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0092
            X.CRi r5 = r4.A02     // Catch:{ all -> 0x0099 }
            byte[] r0 = r5.A02     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0031
            X.CQV r1 = r4.A04     // Catch:{ all -> 0x0099 }
            r1.A02 = r0     // Catch:{ all -> 0x0099 }
            int r0 = r5.A01     // Catch:{ all -> 0x0099 }
            r1.A01 = r0     // Catch:{ all -> 0x0099 }
            int r0 = r5.A00     // Catch:{ all -> 0x0099 }
            r1.A00 = r0     // Catch:{ all -> 0x0099 }
            goto L_0x0089
        L_0x0031:
            X.E0h[] r0 = r5.A03     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0089
            int[] r11 = X.C25688CkJ.A09     // Catch:{ all -> 0x0099 }
            r9 = 5
            r8 = 480(0x1e0, float:6.73E-43)
            r7 = 640(0x280, float:8.97E-43)
            r6 = 0
        L_0x003d:
            r1 = r11[r6]     // Catch:{ all -> 0x0099 }
            int r0 = r5.A01     // Catch:{ all -> 0x0099 }
            int r0 = r0 * r1
            int r12 = r0 / 8
            int r0 = r5.A00     // Catch:{ all -> 0x0099 }
            int r1 = r1 * r0
            int r14 = r1 / 8
            if (r12 < r7) goto L_0x004e
            if (r14 < r8) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            int r6 = r6 + 1
            if (r6 >= r9) goto L_0x0053
            goto L_0x003d
        L_0x0053:
            boolean r0 = r4.A07     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0092
            int r1 = r12 * r14
            java.nio.ByteBuffer r0 = r4.A00     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0063
            int r0 = r0.capacity()     // Catch:{ all -> 0x0099 }
            if (r0 == r1) goto L_0x0075
        L_0x0063:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x0099 }
            r4.A00 = r0     // Catch:{ all -> 0x0099 }
            X.CQV r1 = r4.A04     // Catch:{ all -> 0x0099 }
            byte[] r0 = r0.array()     // Catch:{ all -> 0x0099 }
            r1.A02 = r0     // Catch:{ all -> 0x0099 }
            r1.A01 = r12     // Catch:{ all -> 0x0099 }
            r1.A00 = r14     // Catch:{ all -> 0x0099 }
        L_0x0075:
            X.E0h[] r0 = r5.A03     // Catch:{ all -> 0x0099 }
            r0 = r0[r2]     // Catch:{ all -> 0x0099 }
            X.DAZ r0 = (X.DAZ) r0     // Catch:{ all -> 0x0099 }
            java.nio.ByteBuffer r7 = r0.A02     // Catch:{ all -> 0x0099 }
            int r8 = r0.A01     // Catch:{ all -> 0x0099 }
            int r9 = r5.A01     // Catch:{ all -> 0x0099 }
            int r10 = r5.A00     // Catch:{ all -> 0x0099 }
            java.nio.ByteBuffer r11 = r4.A00     // Catch:{ all -> 0x0099 }
            r13 = r12
            com.whatsapp.VideoFrameConverter.scalePlane(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0099 }
        L_0x0089:
            r4.A06 = r2     // Catch:{ all -> 0x00a0 }
            r3.notify()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            X.CQV r10 = r4.A04
            return r10
        L_0x0092:
            r4.A06 = r2     // Catch:{ all -> 0x00a0 }
            r3.notify()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            return r10
        L_0x0099:
            r0 = move-exception
            r4.A06 = r2     // Catch:{ all -> 0x00a0 }
            r3.notify()     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a0 }
            throw r0
        L_0x00a3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26998DOu.BM5():X.CQV");
    }

    public /* synthetic */ C26998DOu(C25688CkJ ckJ) {
        this.A00 = ckJ;
    }
}
