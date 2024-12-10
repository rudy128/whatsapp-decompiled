package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* renamed from: X.4bD  reason: invalid class name */
public class AnonymousClass4bD implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4bD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        AnonymousClass1FL A1B;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                Activity activity = (Activity) obj;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                activity.finish();
                return true;
            case 1:
                Fragment fragment = (Fragment) obj;
                if (i != 4 || keyEvent.getAction() != 1 || (A1B = fragment.A1B()) == null) {
                    return false;
                }
                A1B.onBackPressed();
                return true;
            case 2:
                DialogFragment dialogFragment = (DialogFragment) obj;
                C18070vi.A0d(keyEvent, 3);
                if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                    return false;
                }
                dialogFragment.A28();
                return true;
            default:
                Fragment fragment2 = (Fragment) obj;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                fragment2.A1D().finish();
                return true;
        }
    }
}
