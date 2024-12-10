package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

public final class D9E implements E9P {
    public MediaCodecInfo[] A00;
    public final int A01;

    public boolean CH8() {
        return true;
    }

    public int BOs() {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    public MediaCodecInfo BOt(int i) {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i];
    }

    public D9E(boolean z) {
        this.A01 = BE8.A1S(z ? 1 : 0) ? 1 : 0;
    }

    public boolean Bek(MediaCodecInfo.CodecCapabilities codecCapabilities, String str) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public boolean Bel(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
