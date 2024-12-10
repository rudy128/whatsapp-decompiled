package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public class DH2 implements C28577E8n {
    public MediaCodec.BufferInfo A00;
    public boolean A01;
    public final int A02;
    public final WeakReference A03;

    public void CI8(int i, long j, int i2) {
        this.A00.set(0, i, j, i2);
    }

    public MediaCodec.BufferInfo BNo() {
        return this.A00;
    }

    public ByteBuffer BNu() {
        return (ByteBuffer) this.A03.get();
    }

    public DH2(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A03 = AnonymousClass3MW.A0z(byteBuffer);
        this.A02 = i;
        this.A00 = bufferInfo == null ? new MediaCodec.BufferInfo() : bufferInfo;
        this.A01 = false;
    }
}
