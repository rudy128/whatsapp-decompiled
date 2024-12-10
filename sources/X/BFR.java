package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

public final class BFR extends MediaCodec.Callback {
    public final /* synthetic */ C26196CuR A00;

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        C18070vi.A0d(codecException, 1);
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Decoder onError Diagnostics: ");
        cn1.A04("sup:AsyncFrameHandler", AnonymousClass000.A0y(codecException.getDiagnosticInfo(), A10), codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodec mediaCodec2 = mediaCodec;
        C18070vi.A0d(mediaCodec2, 0);
        int i2 = i;
        try {
            C26196CuR cuR = this.A00;
            C25002CTc cTc = (C25002CTc) cuR.A04.poll(1, TimeUnit.SECONDS);
            if (cTc == null) {
                mediaCodec2.queueInputBuffer(i2, 0, 0, 0, 0);
                return;
            }
            C26196CuR.A01(cTc, cuR);
            C26190CuG.A00.A03(cuR.A03(), cTc, cuR.A04(), mediaCodec2.getInputBuffer(i2), i2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOutputBufferAvailable(android.media.MediaCodec r5, int r6, android.media.MediaCodec.BufferInfo r7) {
        /*
            r4 = this;
            r3 = 0
            X.C18070vi.A0e(r5, r3, r7)
            X.CuR r2 = r4.A00     // Catch:{ all -> 0x0024 }
            X.BT9 r1 = r2.A04()     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0012
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x0024 }
            return
        L_0x0012:
            java.nio.ByteBuffer r0 = r5.getOutputBuffer(r6)     // Catch:{ all -> 0x0024 }
            X.C26190CuG.A00(r7, r5, r1, r0, r6)     // Catch:{ all -> 0x0024 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0021 }
            r2.A00 = r0     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r2 = move-exception
            r1 = 1
            goto L_0x0026
        L_0x0024:
            r2 = move-exception
            r1 = 0
        L_0x0026:
            X.CuR r0 = r4.A00     // Catch:{ all -> 0x0035 }
            X.BT9 r0 = r0.A04()     // Catch:{ all -> 0x0035 }
            X.C26190CuG.A01(r0, r2)     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0034
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x0034 }
        L_0x0034:
            return
        L_0x0035:
            r0 = move-exception
            if (r1 != 0) goto L_0x003b
            r5.releaseOutputBuffer(r6, r3)     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFR.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C18070vi.A0d(mediaFormat, 1);
        C24712CGy.A01.A01("sup:AsyncFrameHandler", AnonymousClass001.A1E(mediaFormat, "onOutputFormatChanged ", AnonymousClass000.A10()));
    }

    public BFR(C26196CuR cuR) {
        this.A00 = cuR;
    }
}
