package X;

import android.hardware.Camera;

/* renamed from: X.CyD  reason: case insensitive filesystem */
public class C26351CyD implements Camera.PreviewCallback {
    public Camera.Size A00;
    public boolean A01 = true;
    public final /* synthetic */ Bq6 A02;

    public C26351CyD(Bq6 bq6) {
        this.A02 = bq6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r1 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r5.A0Q != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r7 != r5.A0R) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        r1.addCallbackBuffer(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreviewFrame(byte[] r7, android.hardware.Camera r8) {
        /*
            r6 = this;
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r6.A01 = r0
            X.Bq6 r0 = r6.A02
            X.6pb r1 = r0.A0I
            java.lang.String r0 = "cameraView1"
            r1.A01(r0)
        L_0x0010:
            android.hardware.Camera$Size r0 = r6.A00
            if (r0 != 0) goto L_0x001e
            android.hardware.Camera$Parameters r0 = r8.getParameters()     // Catch:{ RuntimeException -> 0x001e }
            android.hardware.Camera$Size r0 = r0.getPreviewSize()     // Catch:{ RuntimeException -> 0x001e }
            r6.A00 = r0     // Catch:{ RuntimeException -> 0x001e }
        L_0x001e:
            android.hardware.Camera$Size r0 = r6.A00
            if (r0 == 0) goto L_0x004f
            X.Bq6 r5 = r6.A02
            X.DOv r4 = r5.A0Y
            int r3 = r0.width
            int r2 = r0.height
            monitor-enter(r4)
            X.CQV r1 = r4.A00     // Catch:{ all -> 0x003c }
            byte[] r0 = r1.A02     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x003f
            r1.A02 = r7     // Catch:{ all -> 0x003c }
            r1.A01 = r3     // Catch:{ all -> 0x003c }
            r1.A00 = r2     // Catch:{ all -> 0x003c }
            r4.notify()     // Catch:{ all -> 0x003c }
            monitor-exit(r4)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x003f:
            monitor-exit(r4)
            android.hardware.Camera r1 = r5.A07
            if (r1 == 0) goto L_0x004f
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x004f
            byte[] r0 = r5.A0R
            if (r7 != r0) goto L_0x004f
            r1.addCallbackBuffer(r7)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26351CyD.onPreviewFrame(byte[], android.hardware.Camera):void");
    }
}
