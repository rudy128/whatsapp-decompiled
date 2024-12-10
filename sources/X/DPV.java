package X;

import android.media.MediaCodec;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class DPV implements C28532E6g {
    public static final int[] A07 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public int A00;
    public C28531E6f A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final File A04;
    public final File A05;
    public volatile boolean A06;

    public static boolean A01(File file) {
        C109545dc r2;
        if (file != null && file.exists()) {
            try {
                r2 = new C109545dc("AudioTranscoder/canTranscode");
                r2.A00(file);
                boolean A1W = AnonymousClass000.A1W(r2.extractMetadata(16));
                r2.close();
                return A1W;
            } catch (Exception e) {
                Log.e("audiotranscoder/cantranscode", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return false;
        throw th;
    }

    public void cancel() {
        this.A06 = true;
    }

    public static void A00(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, DPV dpv, WritableByteChannel writableByteChannel, byte[] bArr) {
        String A1E;
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = dpv.A02[dequeueOutputBuffer];
                BEA.A15(bufferInfo, byteBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    dpv.A00++;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    BE6.A1N(bArr, (i >> 11) & 3, bArr[3] & 252, 3);
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                if (dequeueOutputBuffer == -3) {
                    dpv.A02 = mediaCodec.getOutputBuffers();
                    A1E = "audiotranscoder/encoder output buffers have changed";
                } else if (dequeueOutputBuffer == -2) {
                    A1E = AnonymousClass001.A1E(mediaCodec.getOutputFormat(), "audiotranscoder/encoder output format has changed to ", AnonymousClass000.A10());
                }
                Log.i(A1E);
            }
        }
    }

    public DPV(C24928CQb cQb) {
        this.A04 = cQb.A01;
        this.A05 = cQb.A02;
        this.A03 = cQb.A00;
    }
}
