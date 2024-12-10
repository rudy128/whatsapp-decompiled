package X;

import android.content.DialogInterface;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment;

/* renamed from: X.74x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1412574x implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DiscardWarningDialogFragment A01;
    public final /* synthetic */ boolean A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C145827Mt r0;
        DiscardWarningDialogFragment discardWarningDialogFragment = this.A01;
        int i2 = this.A00;
        boolean z = this.A02;
        discardWarningDialogFragment.A29();
        if (i2 != 2 || !z) {
            TextStatusComposerFragment textStatusComposerFragment = discardWarningDialogFragment.A00;
            if (textStatusComposerFragment != null) {
                C145827Mt r2 = textStatusComposerFragment.A0q;
                if (r2 != null) {
                    C145827Mt.A03(r2, true);
                    C145827Mt.A02(r2, r2.A08);
                    r2.A08 = null;
                    C145827Mt.A02(r2, r2.A09);
                    r2.A09 = null;
                }
                C72463Mc.A1A(textStatusComposerFragment);
                return;
            }
            return;
        }
        TextStatusComposerFragment textStatusComposerFragment2 = discardWarningDialogFragment.A00;
        if (textStatusComposerFragment2 != null && textStatusComposerFragment2.A0p != null && (r0 = textStatusComposerFragment2.A0q) != null) {
            r0.A04();
        }
    }

    public /* synthetic */ C1412574x(DiscardWarningDialogFragment discardWarningDialogFragment, int i, boolean z) {
        this.A01 = discardWarningDialogFragment;
        this.A00 = i;
        this.A02 = z;
    }
}
