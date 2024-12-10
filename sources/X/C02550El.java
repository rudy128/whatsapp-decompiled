package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0El  reason: invalid class name and case insensitive filesystem */
public abstract class C02550El {
    public static final short A00(float f) {
        int i;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = floatToRawIntBits & 8388607;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = (i3 - 127) + 15;
            if (i7 >= 31) {
                i5 = 49;
            } else if (i7 <= 0) {
                if (i7 >= -10) {
                    int i8 = (i4 | 8388608) >> (1 - i7);
                    if ((i8 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                        i8 += DefaultCrypto.BUFFER_SIZE;
                    }
                    i6 = i8 >> 13;
                }
                i5 = 0;
            } else {
                i6 = i4 >> 13;
                if ((i4 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    return (short) i;
                }
                i5 = i7;
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return (short) i;
    }
}
