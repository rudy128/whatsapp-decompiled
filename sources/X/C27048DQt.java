package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.DQt  reason: case insensitive filesystem */
public final class C27048DQt implements C108155bD {
    public StaticLayout BHV(TextView textView, CharSequence charSequence, int i) {
        C18070vi.A0d(charSequence, 0);
        Layout layout = textView.getLayout();
        return new StaticLayout(charSequence, textView.getPaint(), i, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
    }

    public void CKm(TextView textView) {
    }
}
