package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.03b  reason: invalid class name */
public class AnonymousClass03b implements View.OnClickListener {
    public final AnonymousClass03c A00;
    public final /* synthetic */ AnonymousClass03K A01;

    public AnonymousClass03b(AnonymousClass03K r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass03c(r4.A08.getContext(), r4.A0B);
    }

    public void onClick(View view) {
        AnonymousClass03K r0 = this.A01;
        Window.Callback callback = r0.A07;
        if (callback != null && r0.A0C) {
            callback.onMenuItemSelected(0, this.A00);
        }
    }
}
