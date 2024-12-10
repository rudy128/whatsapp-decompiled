package X;

import android.content.Context;
import android.content.res.ColorStateList;

/* renamed from: X.02Q  reason: invalid class name */
public class AnonymousClass02Q implements AnonymousClass02P {
    public final int[] A00 = {2131230949, 2131230915, 2131230948};
    public final int[] A01 = {2131230973, 2131230975, 2131230917, 2131230969, 2131230970, 2131230971, 2131230972};
    public final int[] A02 = {2131230976, 2131230974, 2131230900};
    public final int[] A03 = {2131230903, 2131230909, 2131230904, 2131230910};
    public final int[] A04 = {2131230924, 2131230959, 2131230931, 2131230926, 2131230927, 2131230930, 2131230929};
    public final int[] A05 = {2131230967, 2131230977};

    public static ColorStateList A00(Context context, int i) {
        int A022 = AnonymousClass03T.A02(context, 2130969112);
        int A012 = AnonymousClass03T.A01(context, 2130969108);
        return new ColorStateList(new int[][]{AnonymousClass03T.A02, AnonymousClass03T.A05, AnonymousClass03T.A04, AnonymousClass03T.A03}, new int[]{A012, AnonymousClass1Z2.A05(A022, i), AnonymousClass1Z2.A05(A022, i), i});
    }

    public static boolean A01(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
