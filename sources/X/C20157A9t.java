package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.A9t  reason: case insensitive filesystem */
public final class C20157A9t implements DialogInterface.OnDismissListener {
    public B5P A00;

    public void onDismiss(DialogInterface dialogInterface) {
        B5P b5p = this.A00;
        if (b5p != null && (b5p instanceof BrazilOrderDetailsActivity)) {
            BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) b5p;
            if (brazilOrderDetailsActivity.A0V || C108965cb.A1b(brazilOrderDetailsActivity.A0X, brazilOrderDetailsActivity.A01)) {
                C108965cb.A0y(brazilOrderDetailsActivity);
            }
        }
    }
}
