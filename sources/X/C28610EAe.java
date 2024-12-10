package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.EAe  reason: case insensitive filesystem */
public interface C28610EAe {
    @Deprecated
    void BFa(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface);

    int BIQ();

    int BIT(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer BT3(int i);

    ByteBuffer BVs(int i);

    MediaFormat BVu();

    void CDD(int i, int i2, long j, int i3);

    void CDE(C25016CTs cTs, int i, long j);

    void CEI(int i, long j);

    void CEK(int i);

    void CJg(Handler handler, C25044CUy cUy);

    void CJp(Surface surface);

    void CLO(int i);

    void flush();

    void release();

    @Deprecated
    void reset();

    @Deprecated
    void start();

    @Deprecated
    void stop();
}
