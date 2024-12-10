package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

public final class D9D implements E9P {
    public boolean Bek(MediaCodecInfo.CodecCapabilities codecCapabilities, String str) {
        return false;
    }

    public boolean CH8() {
        return false;
    }

    public boolean Bel(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
            return false;
        }
        return true;
    }

    public int BOs() {
        return MediaCodecList.getCodecCount();
    }

    public MediaCodecInfo BOt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }
}
