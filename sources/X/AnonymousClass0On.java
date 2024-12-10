package X;

import android.widget.TextView;

/* renamed from: X.0On  reason: invalid class name */
public abstract class AnonymousClass0On {
    public static void A01(TextView textView, int i, int i2, int i3) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, 0);
    }

    public static void A02(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    public static int A00(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void A03(String str, TextView textView) {
        textView.setFontVariationSettings(str);
    }
}
