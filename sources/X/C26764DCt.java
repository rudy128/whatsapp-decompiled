package X;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: X.DCt  reason: case insensitive filesystem */
public class C26764DCt implements E4U {
    public final int A00;
    public final Object A01;

    public C26764DCt(AnimatedFactoryV2Impl animatedFactoryV2Impl, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = animatedFactoryV2Impl;
        } else {
            this.A01 = animatedFactoryV2Impl;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28672EDo BI4(X.C25798CmA r7, X.DRJ r8, X.C25112CYh r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            java.lang.Object r4 = r6.A01
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r4 = (com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl) r4
            X.CpH r3 = r4.A04
            if (r0 == 0) goto L_0x0053
            if (r3 != 0) goto L_0x001d
            r0 = 1
            X.DCh r2 = new X.DCh
            r2.<init>(r4, r0)
            X.CUc r1 = r4.A07
            boolean r0 = r4.A0B
            X.CpH r3 = new X.CpH
            r3.<init>(r2, r1, r0)
            r4.A04 = r3
        L_0x001d:
            android.graphics.Bitmap$Config r2 = r7.A01
            X.E4S r1 = X.C25949CpH.A03
            if (r1 == 0) goto L_0x004c
            X.DRN r0 = r8.A0B
            if (r0 == 0) goto L_0x002f
            X.DRN r5 = r0.A04()
        L_0x002b:
            X.C26208Cuj.A01(r5)
            goto L_0x0031
        L_0x002f:
            r5 = 0
            goto L_0x002b
        L_0x0031:
            java.lang.Object r4 = r5.A05()     // Catch:{ all -> 0x00b1 }
            X.DRG r4 = (X.DRG) r4     // Catch:{ all -> 0x00b1 }
            java.nio.ByteBuffer r0 = r4.A01()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0098
            java.nio.ByteBuffer r0 = r4.A01()     // Catch:{ all -> 0x00b1 }
            X.EAH r1 = r1.decodeFromByteBuffer(r0, r7)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x00b1 }
            X.DCv r0 = X.C25949CpH.A00(r2, r1, r3, r7, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x0094
        L_0x004c:
            java.lang.String r0 = "To encode animated gif please add the dependency to the animated-gif module"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        L_0x0053:
            if (r3 != 0) goto L_0x0066
            r0 = 1
            X.DCh r2 = new X.DCh
            r2.<init>(r4, r0)
            X.CUc r1 = r4.A07
            boolean r0 = r4.A0B
            X.CpH r3 = new X.CpH
            r3.<init>(r2, r1, r0)
            r4.A04 = r3
        L_0x0066:
            android.graphics.Bitmap$Config r2 = r7.A01
            X.E4S r1 = X.C25949CpH.A04
            if (r1 == 0) goto L_0x00b8
            X.DRN r0 = r8.A0B
            if (r0 == 0) goto L_0x0078
            X.DRN r5 = r0.A04()
        L_0x0074:
            X.C26208Cuj.A01(r5)
            goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x0074
        L_0x007a:
            java.lang.Object r4 = r5.A05()     // Catch:{ all -> 0x00b1 }
            X.DRG r4 = (X.DRG) r4     // Catch:{ all -> 0x00b1 }
            java.nio.ByteBuffer r0 = r4.A01()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0098
            java.nio.ByteBuffer r0 = r4.A01()     // Catch:{ all -> 0x00b1 }
            X.EAH r1 = r1.decodeFromByteBuffer(r0, r7)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x00b1 }
            X.DCv r0 = X.C25949CpH.A00(r2, r1, r3, r7, r0)     // Catch:{ all -> 0x00b1 }
        L_0x0094:
            r5.close()
            return r0
        L_0x0098:
            monitor-enter(r4)     // Catch:{ all -> 0x00b1 }
            r4.A02()     // Catch:{ all -> 0x00ae }
            X.DRN r0 = r4.A00     // Catch:{ all -> 0x00ae }
            X.C26208Cuj.A01(r0)     // Catch:{ all -> 0x00ae }
            X.DRN r0 = r4.A00     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = r0.A05()     // Catch:{ all -> 0x00ae }
            X.EAI r0 = (X.EAI) r0     // Catch:{ all -> 0x00ae }
            r0.BVH()     // Catch:{ all -> 0x00ae }
            r0 = 0
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            if (r5 == 0) goto L_0x00b7
            r5.close()
        L_0x00b7:
            throw r0
        L_0x00b8:
            java.lang.String r0 = "To encode animated webp please add the dependency to the animated-webp module"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26764DCt.BI4(X.CmA, X.DRJ, X.CYh, int):X.EDo");
    }
}
