package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.A9x  reason: case insensitive filesystem */
public class C20161A9x implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public C20161A9x(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                C194839sN r1 = (C194839sN) this.A01;
                if (i != 4) {
                    return true;
                }
                r1.A00("on_press_back");
                dialogInterface.dismiss();
                return true;
            case 1:
                Activity activity = (Activity) this.A01;
                if (i != 4) {
                    return false;
                }
                dialogInterface.dismiss();
                activity.finish();
                return true;
            default:
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                if (dialogFragment.A1E().A0K() > 1) {
                    dialogFragment.A1E().A0b();
                    return true;
                }
                dialogFragment.A28();
                return true;
        }
    }
}
