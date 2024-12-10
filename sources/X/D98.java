package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

public class D98 implements C28610EAe {
    public final MediaCodec A00;

    public void BFa(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface) {
        this.A00.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    public void CDD(int i, int i2, long j, int i3) {
        this.A00.queueInputBuffer(i, 0, i2, j, i3);
    }

    public void CDE(C25016CTs cTs, int i, long j) {
        this.A00.queueSecureInputBuffer(i, 0, cTs.A08, j, 0);
    }

    public void CEK(int i) {
        this.A00.releaseOutputBuffer(i, false);
    }

    public int BIQ() {
        return this.A00.dequeueInputBuffer(0);
    }

    public int BIT(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.A00.dequeueOutputBuffer(bufferInfo, 0);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer BT3(int i) {
        return this.A00.getInputBuffer(i);
    }

    public ByteBuffer BVs(int i) {
        return this.A00.getOutputBuffer(i);
    }

    public MediaFormat BVu() {
        return this.A00.getOutputFormat();
    }

    public void CEI(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }

    public void CJg(Handler handler, C25044CUy cUy) {
        this.A00.setOnFrameRenderedListener(new C26362CyO(this, cUy), handler);
    }

    public void CJp(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    public void CLO(int i) {
        this.A00.setVideoScalingMode(i);
    }

    public void flush() {
        this.A00.flush();
    }

    public void release() {
        this.A00.release();
    }

    public void reset() {
        this.A00.reset();
    }

    public void start() {
        this.A00.start();
    }

    public void stop() {
        this.A00.stop();
    }

    public D98(String str) {
        this.A00 = MediaCodec.createByCodecName(str);
    }
}
