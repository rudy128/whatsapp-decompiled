package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.D4y  reason: case insensitive filesystem */
public class C26584D4y implements View.OnLongClickListener {
    public final /* synthetic */ int A00;

    public C26584D4y(int i) {
        this.A00 = i;
    }

    public boolean onLongClick(View view) {
        return view.performAccessibilityAction(this.A00, (Bundle) null);
    }
}
