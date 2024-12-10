package X;

import android.media.MediaCodec;
import com.facebook.wearable.mediastream.codec.VideoDecoderBufferHandler$onOutputBuffer$1;
import java.nio.ByteBuffer;

/* renamed from: X.CuG  reason: case insensitive filesystem */
public final class C26190CuG {
    public static final C26190CuG A00 = new Object();

    public static final void A00(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, BT9 bt9, ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null || bufferInfo.size == 0 || !bt9.A03) {
            mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
        AnonymousClass3MX.A1Q(new VideoDecoderBufferHandler$onOutputBuffer$1(bufferInfo, bt9, (C30391dr) null), AnonymousClass1OW.A02(C23871Hy.A00));
    }

    public final void A03(MediaCodec mediaCodec, C25002CTc cTc, BT9 bt9, ByteBuffer byteBuffer, int i) {
        long j;
        int i2;
        int i3;
        int i4 = 0;
        if (byteBuffer == null || !bt9.A02) {
            j = 0;
            i2 = 0;
            i3 = 0;
        } else {
            ByteBuffer byteBuffer2 = cTc.A05;
            byteBuffer2.rewind();
            byteBuffer.clear();
            byteBuffer.put(byteBuffer2);
            byteBuffer.flip();
            i4 = cTc.A01;
            i2 = cTc.A02;
            j = cTc.A03;
            i3 = cTc.A00;
        }
        mediaCodec.queueInputBuffer(i, i4, i2, j, i3);
    }

    public static final void A01(BT9 bt9, Throwable th) {
        if (!(th instanceof MediaCodec.CodecException)) {
            C24712CGy.A01.A05("sup:VideoDecoderBufferHandler", "Video decoder output exception!", th);
        } else if (bt9.A02) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            int errorCode = codecException.getErrorCode();
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            if (errorCode == -19) {
                A10.append("Resource was not available. Likely caused by preview surface change. Diagnostics: ");
                cn1.A07("sup:VideoDecoderBufferHandler", AnonymousClass000.A0y(codecException.getDiagnosticInfo(), A10), th);
            } else {
                A10.append("Video decoder output exception! Diagnostics: ");
                cn1.A05("sup:VideoDecoderBufferHandler", AnonymousClass000.A0y(codecException.getDiagnosticInfo(), A10), th);
            }
            bt9.A01.invoke();
        }
    }

    public static final void A02(BT9 bt9, Throwable th) {
        String str;
        if (bt9.A02) {
            if (th instanceof MediaCodec.CodecException) {
                str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            } else {
                str = "";
            }
            C18070vi.A0b(str);
            C24712CGy.A01.A05("sup:VideoDecoderBufferHandler", AnonymousClass001.A1H("Video decoder enqueue video frame exception! Diagnostics ", str, AnonymousClass000.A10()), th);
            bt9.A01.invoke();
        }
    }
}
