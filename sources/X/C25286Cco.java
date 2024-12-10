package X;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* renamed from: X.Cco  reason: case insensitive filesystem */
public abstract class C25286Cco {
    public static final void A00(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final boolean A01(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
