package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

public class DH1 implements C28577E8n {
    public final ByteBuffer A00 = ByteBuffer.allocateDirect(1048576);
    public final MediaCodec.BufferInfo A01 = new MediaCodec.BufferInfo();

    public void CI8(int i, long j, int i2) {
        this.A01.set(0, i, j, i2);
    }

    public MediaCodec.BufferInfo BNo() {
        return this.A01;
    }

    public ByteBuffer BNu() {
        return this.A00;
    }
}
