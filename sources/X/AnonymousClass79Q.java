package X;

import android.widget.PopupWindow;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.79Q  reason: invalid class name */
public class AnonymousClass79Q implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C126076c9 r0 = (C126076c9) obj;
                C18070vi.A0d(r0, 0);
                r0.A00.A00 = false;
                return;
            case 1:
                ((AnonymousClass70O) obj).A0C();
                return;
            case 2:
                ((AnonymousClass70O) obj).A05.A00.A0N();
                return;
            default:
                TextStatusComposerFragment.A0H((TextStatusComposerFragment) obj);
                return;
        }
    }
}
