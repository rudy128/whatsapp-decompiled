package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0Ya  reason: invalid class name and case insensitive filesystem */
public abstract class C06360Ya implements Comparable {
    public static final float A00 = Float.intBitsToFloat(1056964608);

    public static final float A00(short s) {
        int i;
        int i2;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i3 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        if (i3 != 0) {
            i = s4 << 13;
            if (i3 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i2 = 255;
            } else {
                i2 = (i3 - 15) + StringTreeSet.OFFSET_BASE_ENCODING;
            }
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - A00;
            if (s3 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (s3 << 16) | i);
    }
}
