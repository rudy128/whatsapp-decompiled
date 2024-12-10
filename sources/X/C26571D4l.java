package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.D4l  reason: case insensitive filesystem */
public class C26571D4l implements View.OnClickListener {
    public final /* synthetic */ int A00;

    public C26571D4l(int i) {
        this.A00 = i;
    }

    public void onClick(View view) {
        view.performAccessibilityAction(this.A00, (Bundle) null);
    }
}
