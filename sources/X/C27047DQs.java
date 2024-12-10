package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.DQs  reason: case insensitive filesystem */
public final class C27047DQs implements C108155bD {
    public StaticLayout BHV(TextView textView, CharSequence charSequence, int i) {
        C18070vi.A0d(charSequence, 0);
        Layout layout = textView.getLayout();
        CharSequence A02 = AnonymousClass1EG.A02(charSequence);
        if (A02 != null) {
            StaticLayout build = StaticLayout.Builder.obtain(A02, 0, charSequence.length(), textView.getPaint(), i).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
            C18070vi.A0X(build);
            return build;
        }
        throw C17880vN.A0g();
    }

    public void CKm(TextView textView) {
        textView.setBreakStrategy(0);
    }
}
