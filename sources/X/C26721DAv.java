package X;

import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.DAv  reason: case insensitive filesystem */
public final class C26721DAv implements E94 {
    public void BZm(String str) {
    }

    public boolean BNa(C24326BzN bzN, boolean z) {
        if (bzN != null) {
            switch (bzN.ordinal()) {
                case 1:
                case 2:
                case 43:
                case 44:
                case 45:
                case 46:
                case 140:
                    return true;
                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                    return false;
            }
        }
        return z;
    }

    public boolean BNb(C24326BzN bzN, boolean z) {
        if (bzN != null) {
            switch (bzN.ordinal()) {
                case 1:
                case 2:
                case 43:
                case 44:
                case 45:
                case 46:
                case 140:
                    return true;
                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                    return false;
            }
        }
        return z;
    }

    public double BQo(Integer num, double d) {
        if (num == null || num.intValue() != 2) {
            return d;
        }
        return 0.15d;
    }
}
