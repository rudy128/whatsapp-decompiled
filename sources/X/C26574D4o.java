package X;

import android.view.View;
import java.util.List;

/* renamed from: X.D4o  reason: case insensitive filesystem */
public final class C26574D4o implements View.OnFocusChangeListener {
    public final List A00 = AnonymousClass000.A13();

    public void onFocusChange(View view, boolean z) {
        for (View.OnFocusChangeListener onFocusChange : this.A00) {
            onFocusChange.onFocusChange(view, z);
        }
    }
}
