package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.7Mr  reason: invalid class name and case insensitive filesystem */
public final class C145807Mr implements AnonymousClass88E {
    public StaticLayout BHW(TextPaint textPaint, CharSequence charSequence, int i) {
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
        C18070vi.A0X(build);
        return build;
    }
}
