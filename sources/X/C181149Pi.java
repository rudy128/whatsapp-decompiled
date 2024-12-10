package X;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: X.9Pi  reason: invalid class name and case insensitive filesystem */
public abstract class C181149Pi {
    public static String A00(Context context, Locale locale, float f) {
        int i;
        Object[] objArr;
        Object valueOf;
        DecimalFormat decimalFormat;
        String str;
        if (A78.A03(locale)) {
            int round = Math.round(f * 1.09f);
            float f2 = ((float) round) / 1760.0f;
            if (round < 325) {
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, round, 0);
                return context.getString(2131887107, objArr2);
            }
            if (f2 < 1000.0f) {
                str = "0.#";
            } else {
                decimalFormat = new DecimalFormat();
                str = "#,###";
            }
            decimalFormat.applyPattern(str);
            return C17880vN.A0q(context, decimalFormat.format((double) f2), new Object[1], 0, 2131887106);
        }
        if (f < 1000.0f) {
            i = 2131887105;
            objArr = new Object[1];
            valueOf = Integer.valueOf(Math.round(f));
        } else {
            int i2 = (f > 10000.0f ? 1 : (f == 10000.0f ? 0 : -1));
            float f3 = f / 1000.0f;
            if (i2 < 0) {
                return C17880vN.A0q(context, String.format(Locale.US, "%.1f", new Object[]{Double.valueOf((double) f3)}), new Object[1], 0, 2131887104);
            }
            i = 2131887104;
            objArr = new Object[1];
            valueOf = String.valueOf(Math.round(f3));
        }
        return C17880vN.A0q(context, valueOf, objArr, 0, i);
    }
}
