package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.2T6  reason: invalid class name */
public abstract class AnonymousClass2T6 {
    public static String A00(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        Long[] lArr = new Long[11];
        C17890vO.A1L(lArr, j2);
        C17890vO.A1M(lArr, j);
        C17890vO.A1N(lArr, j9);
        C17890vO.A1O(lArr, j10);
        C17890vO.A1P(lArr, j11);
        C17890vO.A1Q(lArr, j5);
        lArr[6] = Long.valueOf(j7);
        lArr[7] = Long.valueOf(j8);
        lArr[8] = Long.valueOf(j3);
        lArr[9] = Long.valueOf(j4);
        lArr[10] = Long.valueOf(j6);
        return TextUtils.join(",", Arrays.asList(lArr));
    }
}
