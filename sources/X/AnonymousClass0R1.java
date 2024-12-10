package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.0R1  reason: invalid class name */
public class AnonymousClass0R1 implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0Bs) weakReference.get()).A17(true);
        }
    }

    public AnonymousClass0R1(AnonymousClass0Bs r2) {
        this.A00 = new WeakReference(r2);
    }
}
