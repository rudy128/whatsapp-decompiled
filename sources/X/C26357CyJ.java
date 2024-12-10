package X;

import android.media.ImageReader;

/* renamed from: X.CyJ  reason: case insensitive filesystem */
public class C26357CyJ implements ImageReader.OnImageAvailableListener {
    public final int A00;
    public final Object A01;

    public C26357CyJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [X.CXa, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x000d;
                case 2: goto L_0x0089;
                case 3: goto L_0x007a;
                case 4: goto L_0x0072;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            com.whatsapp.voipcalling.camera.VoipLiteCamera r0 = (com.whatsapp.voipcalling.camera.VoipLiteCamera) r0
            com.whatsapp.voipcalling.camera.VoipLiteCamera.maybeInitSUPCamera$lambda$9(r0, r15)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r14.A01
            X.DEo r1 = (X.C26806DEo) r1
            X.CVC r4 = r1.A01
            android.media.ImageReader r0 = r1.A00
            r7 = 0
            if (r0 == 0) goto L_0x001d
            r0.setOnImageAvailableListener(r7, r7)
            r1.A01 = r7
        L_0x001d:
            android.media.Image r6 = r15.acquireLatestImage()     // Catch:{ Exception -> 0x0043 }
            if (r6 == 0) goto L_0x0056
            X.CXa r5 = new X.CXa     // Catch:{ all -> 0x0038 }
            r5.<init>()     // Catch:{ all -> 0x0038 }
            r12 = 1
            r9 = r7
            r10 = r7
            r11 = r7
            r8 = r7
            r13 = r12
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0036 }
            r7 = r5
            r6.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x0056
        L_0x0036:
            r1 = move-exception
            goto L_0x003a
        L_0x0038:
            r1 = move-exception
            r5 = r7
        L_0x003a:
            r6.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0045 }
        L_0x0042:
            throw r1     // Catch:{ Exception -> 0x0045 }
        L_0x0043:
            r3 = move-exception
            goto L_0x0047
        L_0x0045:
            r3 = move-exception
            r7 = r5
        L_0x0047:
            java.lang.String r2 = "YuvPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            X.C26175Cts.A02(r2, r0)
        L_0x0056:
            if (r4 == 0) goto L_0x000c
            X.CiL r0 = new X.CiL
            r0.<init>(r7)
            goto L_0x00ef
        L_0x005f:
            java.lang.Object r6 = r14.A01
            X.DEp r6 = (X.C26807DEp) r6
            android.media.ImageReader r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L_0x006b
            r0.setOnImageAvailableListener(r5, r5)
        L_0x006b:
            X.CVC r4 = r6.A03
            r6.A03 = r5
            if (r4 == 0) goto L_0x000c
            goto L_0x009e
        L_0x0072:
            java.lang.Object r0 = r14.A01
            X.BwM r0 = (X.C24156BwM) r0
            X.C24156BwM.A02(r15, r0)
            return
        L_0x007a:
            java.lang.Object r1 = r14.A01
            X.BwL r1 = (X.C24155BwL) r1
            r0 = 0
            r1.A00 = r0
            android.media.Image r0 = r15.acquireLatestImage()
            X.C24155BwL.A01(r0, r1)
            return
        L_0x0089:
            java.lang.Object r1 = r14.A01
            X.DEe r1 = (X.C26796DEe) r1
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x0094
            r0.close()
        L_0x0094:
            android.media.Image r0 = r15.acquireNextImage()
            r1.A00 = r0
            X.C26796DEe.A00(r1)
            return
        L_0x009e:
            android.media.Image r2 = r15.acquireNextImage()     // Catch:{ Exception -> 0x00ce }
            if (r2 == 0) goto L_0x00de
            android.media.Image$Plane[] r1 = r2.getPlanes()     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x00c0
            int r0 = r1.length     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x00c0
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00c4 }
            java.nio.ByteBuffer r1 = r0.getBuffer()     // Catch:{ all -> 0x00c4 }
            r1.rewind()     // Catch:{ all -> 0x00c4 }
            int r0 = r1.remaining()     // Catch:{ all -> 0x00c4 }
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00c4 }
            r1.get(r5)     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            r2.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00de
        L_0x00c4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x00ce }
        L_0x00cd:
            throw r1     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            r3 = move-exception
            java.lang.String r2 = "DefaultPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)     // Catch:{ all -> 0x00f3 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x00f3 }
        L_0x00de:
            boolean r0 = X.C25921Cof.A00()
            if (r0 == 0) goto L_0x00e8
            byte[] r5 = X.C25921Cof.A01()
        L_0x00e8:
            int r1 = r6.A01
            X.CiL r0 = new X.CiL
            r0.<init>(r5, r1)
        L_0x00ef:
            r4.A00(r0)
            return
        L_0x00f3:
            r2 = move-exception
            boolean r0 = X.C25921Cof.A00()
            if (r0 == 0) goto L_0x00fe
            byte[] r5 = X.C25921Cof.A01()
        L_0x00fe:
            int r1 = r6.A01
            X.CiL r0 = new X.CiL
            r0.<init>(r5, r1)
            r4.A00(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26357CyJ.onImageAvailable(android.media.ImageReader):void");
    }
}
