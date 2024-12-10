package X;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public class C007403i extends C007303h {
    public void A00(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean A01(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
