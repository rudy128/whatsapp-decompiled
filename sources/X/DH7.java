package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.wamediajni.WamediaStreamsMP4Muxer;
import java.nio.ByteBuffer;

public final class DH7 implements EAM {
    public WamediaStreamsMP4Muxer A00;
    public boolean A01;
    public final CSX A02;

    public DH7(CSX csx) {
        C18070vi.A0d(csx, 1);
        this.A02 = csx;
    }

    public void BFZ(String str) {
        C18070vi.A0d(str, 0);
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = new WamediaStreamsMP4Muxer(this.A02, str);
        wamediaStreamsMP4Muxer.initialize();
        this.A00 = wamediaStreamsMP4Muxer;
    }

    public void CHz(MediaFormat mediaFormat) {
        C18070vi.A0d(mediaFormat, 0);
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetAudioMediaFormat(mediaFormat);
        }
    }

    public void CSW(C28577E8n e8n) {
        C18070vi.A0d(e8n, 0);
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            try {
                ByteBuffer BNu = e8n.BNu();
                if (BNu != null) {
                    MediaCodec.BufferInfo BNo = e8n.BNo();
                    wamediaStreamsMP4Muxer.mNativeWrapper.nativeWriteVideoSampleData(BNu, BNo.offset, BNo.size, BNo.flags, BNo.presentationTimeUs);
                }
            } catch (Throwable th) {
                throw new C2D(th);
            }
        }
    }

    public String BV9() {
        return "Wamedia";
    }

    public boolean BgY() {
        return this.A01;
    }

    public void CJl(int i) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetOrientationHint(i);
        }
    }

    public void CLL(MediaFormat mediaFormat) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeSetVideoMediaFormat(mediaFormat);
        }
    }

    public void CSO(C28577E8n e8n) {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            try {
                ByteBuffer BNu = e8n.BNu();
                if (BNu != null) {
                    MediaCodec.BufferInfo BNo = e8n.BNo();
                    wamediaStreamsMP4Muxer.mNativeWrapper.nativeWriteAudioSampleData(BNu, BNo.offset, BNo.size, BNo.flags, BNo.presentationTimeUs);
                }
            } catch (Throwable th) {
                throw new C2D(th);
            }
        }
    }

    public void start() {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            wamediaStreamsMP4Muxer.mNativeWrapper.nativeStart();
            wamediaStreamsMP4Muxer.A00 = true;
            this.A01 = true;
        }
    }

    public void stop() {
        WamediaStreamsMP4Muxer wamediaStreamsMP4Muxer = this.A00;
        if (wamediaStreamsMP4Muxer != null) {
            if (wamediaStreamsMP4Muxer.A00) {
                wamediaStreamsMP4Muxer.mNativeWrapper.nativeStop();
                wamediaStreamsMP4Muxer.A00 = false;
            }
            this.A01 = false;
        }
    }
}
