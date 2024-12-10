package X;

import android.view.KeyEvent;
import android.widget.TextView;

public class D5X implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public D5X(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.A00 != 0) {
            return ((BTQ) this.A01).A02.onEditorAction(textView, i, keyEvent);
        }
        return AnonymousClass000.A1Y(((C36001nB) this.A01).invoke(textView, Integer.valueOf(i), keyEvent));
    }
}
