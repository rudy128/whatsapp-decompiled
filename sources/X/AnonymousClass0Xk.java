package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/* renamed from: X.0Xk  reason: invalid class name */
public final class AnonymousClass0Xk implements C16510sN {
    public ActionMode A00;
    public Integer A01 = AnonymousClass00R.A01;
    public final View A02;
    public final AnonymousClass0PX A03 = new AnonymousClass0PX((C18090vk) new C08290er(this), 62);

    public void CMw(AnonymousClass0NU r5, C18090vk r6, C18090vk r7, C18090vk r8, C18090vk r9) {
        ActionMode startActionMode;
        AnonymousClass0PX r3 = this.A03;
        r3.A00 = r5;
        r3.A03(r6);
        r3.A04(r8);
        r3.A05(r7);
        r3.A06(r9);
        ActionMode actionMode = this.A00;
        if (actionMode == null) {
            this.A01 = AnonymousClass00R.A00;
            int i = Build.VERSION.SDK_INT;
            View view = this.A02;
            if (i >= 23) {
                startActionMode = AnonymousClass0FL.A00(view, new AnonymousClass054(r3));
            } else {
                startActionMode = view.startActionMode(new AnonymousClass0RS(r3));
            }
            this.A00 = startActionMode;
            return;
        }
        actionMode.invalidate();
    }

    public AnonymousClass0Xk(View view) {
        this.A02 = view;
    }
}
