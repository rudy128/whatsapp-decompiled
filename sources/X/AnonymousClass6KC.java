package X;

import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.6KC  reason: invalid class name */
public final class AnonymousClass6KC extends C113585nK {
    public WaTextView A00;
    public WaTextView A01;
    public UpdatesFragment A02;
    public C36401np A03;

    public AnonymousClass6KC(View view, UpdatesFragment updatesFragment, C36401np r4) {
        super(view);
        this.A02 = updatesFragment;
        this.A03 = r4;
        this.A01 = AnonymousClass3MW.A0U(view, 2131436208);
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131429738);
        if (A0U != null) {
            C43421zm.A04(A0U);
        } else {
            A0U = null;
        }
        this.A00 = A0U;
    }
}
