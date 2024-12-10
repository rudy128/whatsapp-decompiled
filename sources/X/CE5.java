package X;

import android.text.Layout;

public abstract /* synthetic */ class CE5 {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            BE8.A13(Layout.Alignment.ALIGN_CENTER, iArr);
        } catch (NoSuchFieldError unused) {
        }
        A00 = iArr;
    }
}
