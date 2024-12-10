package com.whatsapp.calling.util;

import X.AnonymousClass000;
import X.C17960vV;
import X.C23494Bhy;
import X.C23503BiC;
import X.C25135CZl;
import android.content.Context;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;

public final class VoipFaceDetector {
    public static final String TAG = "voip/video/VoipFaceDetector/";
    public final boolean detectBounds;
    public final C25135CZl detector;
    public final int maxDetections;
    public volatile int nextFrameId;
    public volatile boolean released;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r14 <= 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.calling.util.VoipFaceDetector.DetectionResult detect(java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            monitor-enter(r11)
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x0135 }
            X.CZl r0 = r11.detector     // Catch:{ all -> 0x0135 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0135 }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x0135 }
            r4 = 0
            if (r13 <= 0) goto L_0x0013
            r0 = 1
            if (r14 > 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.C17960vV.A0C(r0)     // Catch:{ all -> 0x0135 }
            r1 = r16
            if (r16 == 0) goto L_0x0034
            r0 = 90
            if (r1 == r0) goto L_0x0033
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0031
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0029
            r4 = 3
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "Unsupported rotation"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0134
        L_0x0031:
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = 1
        L_0x0034:
            X.CNw r3 = new X.CNw     // Catch:{ all -> 0x0135 }
            r3.<init>()     // Catch:{ all -> 0x0135 }
            int r1 = r11.nextFrameId     // Catch:{ all -> 0x0135 }
            int r0 = r1 + 1
            r11.nextFrameId = r0     // Catch:{ all -> 0x0135 }
            X.CSb r2 = r3.A01     // Catch:{ all -> 0x0135 }
            r2.A02 = r1     // Catch:{ all -> 0x0135 }
            r2.A03 = r4     // Catch:{ all -> 0x0135 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0135 }
            r2.A04 = r0     // Catch:{ all -> 0x0135 }
            if (r12 == 0) goto L_0x0121
            int r1 = r12.capacity()     // Catch:{ all -> 0x0135 }
            int r0 = r13 * r14
            if (r1 < r0) goto L_0x011a
            r0 = 16
            if (r15 == r0) goto L_0x0064
            r0 = 17
            if (r15 == r0) goto L_0x0064
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r15 == r0) goto L_0x0064
            goto L_0x0128
        L_0x0064:
            r3.A00 = r12     // Catch:{ all -> 0x0135 }
            r2.A00 = r13     // Catch:{ all -> 0x0135 }
            r2.A01 = r14     // Catch:{ all -> 0x0135 }
            X.CZl r0 = r11.detector     // Catch:{ all -> 0x0135 }
            android.util.SparseArray r7 = r0.A00(r3)     // Catch:{ all -> 0x0135 }
            int r1 = r11.maxDetections     // Catch:{ all -> 0x0135 }
        L_0x0072:
            int r0 = r7.size()     // Catch:{ all -> 0x0135 }
            if (r1 >= r0) goto L_0x007e
            r7.removeAt(r1)     // Catch:{ all -> 0x0135 }
            int r1 = r1 + 1
            goto L_0x0072
        L_0x007e:
            boolean r0 = r11.detectBounds     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x010e
            int r0 = r7.size()     // Catch:{ all -> 0x0135 }
            int r0 = r0 * 16
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0135 }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x0135 }
            r5.order(r0)     // Catch:{ all -> 0x0135 }
            r6 = 0
        L_0x0094:
            int r0 = r7.size()     // Catch:{ all -> 0x0135 }
            if (r6 >= r0) goto L_0x010f
            java.lang.Object r3 = r7.valueAt(r6)     // Catch:{ all -> 0x0135 }
            X.CSw r3 = (X.C24996CSw) r3     // Catch:{ all -> 0x0135 }
            android.graphics.PointF r1 = r3.A03     // Catch:{ all -> 0x0135 }
            float r8 = r1.x     // Catch:{ all -> 0x0135 }
            float r0 = r3.A00     // Catch:{ all -> 0x0135 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r8 = r8 - r0
            float r1 = r1.y     // Catch:{ all -> 0x0135 }
            float r0 = r3.A01     // Catch:{ all -> 0x0135 }
            float r0 = r0 / r4
            float r1 = r1 - r0
            android.graphics.PointF r10 = new android.graphics.PointF     // Catch:{ all -> 0x0135 }
            r10.<init>(r8, r1)     // Catch:{ all -> 0x0135 }
            int r9 = r2.A03     // Catch:{ all -> 0x0135 }
            r4 = 1
            if (r9 == 0) goto L_0x00f1
            if (r9 == r4) goto L_0x00d2
            r0 = 2
            if (r9 == r0) goto L_0x00c0
            goto L_0x00e0
        L_0x00c0:
            int r0 = r2.A00     // Catch:{ all -> 0x0135 }
            float r1 = (float) r0     // Catch:{ all -> 0x0135 }
            float r0 = r10.x     // Catch:{ all -> 0x0135 }
            float r1 = r1 - r0
            float r0 = r3.A00     // Catch:{ all -> 0x0135 }
            float r1 = r1 - r0
            int r0 = r2.A01     // Catch:{ all -> 0x0135 }
            float r8 = (float) r0     // Catch:{ all -> 0x0135 }
            float r0 = r10.y     // Catch:{ all -> 0x0135 }
            float r8 = r8 - r0
            float r0 = r3.A01     // Catch:{ all -> 0x0135 }
            goto L_0x00dc
        L_0x00d2:
            float r1 = r10.y     // Catch:{ all -> 0x0135 }
            int r0 = r2.A01     // Catch:{ all -> 0x0135 }
            float r8 = (float) r0     // Catch:{ all -> 0x0135 }
            float r0 = r10.x     // Catch:{ all -> 0x0135 }
            float r8 = r8 - r0
            float r0 = r3.A00     // Catch:{ all -> 0x0135 }
        L_0x00dc:
            float r8 = r8 - r0
            if (r9 == r4) goto L_0x00eb
            goto L_0x00f5
        L_0x00e0:
            int r0 = r2.A00     // Catch:{ all -> 0x0135 }
            float r1 = (float) r0     // Catch:{ all -> 0x0135 }
            float r0 = r10.y     // Catch:{ all -> 0x0135 }
            float r1 = r1 - r0
            float r0 = r3.A01     // Catch:{ all -> 0x0135 }
            float r1 = r1 - r0
            float r8 = r10.x     // Catch:{ all -> 0x0135 }
        L_0x00eb:
            float r4 = r3.A01     // Catch:{ all -> 0x0135 }
            float r4 = r4 + r1
            float r3 = r3.A00     // Catch:{ all -> 0x0135 }
            goto L_0x00fa
        L_0x00f1:
            float r1 = r10.x     // Catch:{ all -> 0x0135 }
            float r8 = r10.y     // Catch:{ all -> 0x0135 }
        L_0x00f5:
            float r4 = r3.A00     // Catch:{ all -> 0x0135 }
            float r4 = r4 + r1
            float r3 = r3.A01     // Catch:{ all -> 0x0135 }
        L_0x00fa:
            float r3 = r3 + r8
            int r0 = (int) r1     // Catch:{ all -> 0x0135 }
            r5.putInt(r0)     // Catch:{ all -> 0x0135 }
            int r0 = (int) r8     // Catch:{ all -> 0x0135 }
            r5.putInt(r0)     // Catch:{ all -> 0x0135 }
            int r0 = (int) r4     // Catch:{ all -> 0x0135 }
            r5.putInt(r0)     // Catch:{ all -> 0x0135 }
            int r0 = (int) r3     // Catch:{ all -> 0x0135 }
            r5.putInt(r0)     // Catch:{ all -> 0x0135 }
            int r6 = r6 + 1
            goto L_0x0094
        L_0x010e:
            r5 = 0
        L_0x010f:
            int r1 = r7.size()     // Catch:{ all -> 0x0135 }
            com.whatsapp.calling.util.VoipFaceDetector$DetectionResult r0 = new com.whatsapp.calling.util.VoipFaceDetector$DetectionResult     // Catch:{ all -> 0x0135 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0135 }
            monitor-exit(r11)
            return r0
        L_0x011a:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0134
        L_0x0121:
            java.lang.String r0 = "Null image data supplied."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0135 }
            goto L_0x0134
        L_0x0128:
            r0 = 37
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = "Unsupported image format: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r15)     // Catch:{ all -> 0x0135 }
        L_0x0134:
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.util.VoipFaceDetector.detect(java.nio.ByteBuffer, int, int, int, int):com.whatsapp.calling.util.VoipFaceDetector$DetectionResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2.detector.A02() == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOperational() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.released     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            X.CZl r0 = r2.detector     // Catch:{ all -> 0x0011 }
            boolean r1 = r0.A02()     // Catch:{ all -> 0x0011 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.util.VoipFaceDetector.isOperational():boolean");
    }

    public synchronized void release() {
        if (!this.released) {
            Log.i("voip/video/VoipFaceDetector/Releasing face detector");
            this.released = true;
            this.detector.A01();
        }
    }

    public final class DetectionResult {
        public final ByteBuffer faceBounds;
        public final int numOfDetections;

        public DetectionResult(int i, ByteBuffer byteBuffer) {
            this.numOfDetections = i;
            this.faceBounds = byteBuffer;
        }
    }

    public VoipFaceDetector(C25135CZl cZl, int i, boolean z) {
        this.detector = cZl;
        this.maxDetections = i;
        this.detectBounds = z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Bb8] */
    public static VoipFaceDetector create(Context context, int i, boolean z) {
        C17960vV.A0C(AnonymousClass000.A1R(i));
        ? obj = new Object();
        obj.A01 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        obj.A04 = true;
        obj.A05 = true;
        obj.A00 = -1.0f;
        return new VoipFaceDetector(new C23503BiC(new C23494Bhy(context, obj)), i, z);
    }
}
