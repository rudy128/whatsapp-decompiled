package X;

import android.content.DialogInterface;
import com.whatsapp.settings.MultiSelectionDialogFragment;

/* renamed from: X.4bF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4bF implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00.A02[i] = z;
    }

    public /* synthetic */ AnonymousClass4bF(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }
}
