package X;

import android.os.SystemClock;
import android.view.View;
import java.util.List;

/* renamed from: X.4NU  reason: invalid class name */
public class AnonymousClass4NU {
    public boolean A00;
    public final C23571Gu A01;
    public final List A02 = AnonymousClass000.A13();

    public AnonymousClass4NU(View view) {
        SystemClock.elapsedRealtime();
        this.A00 = false;
        this.A01 = new C689335g(this, 1);
        view.getViewTreeObserver().addOnPreDrawListener(new C90624eN(view, this, 2));
    }
}
