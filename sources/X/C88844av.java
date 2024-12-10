package X;

import android.content.DialogInterface;

/* renamed from: X.4av  reason: invalid class name and case insensitive filesystem */
public class C88844av implements DialogInterface.OnClickListener {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();

    public void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1DT r0;
        if (i == -3) {
            r0 = this.A01;
        } else if (i == -2) {
            r0 = this.A00;
        } else if (i == -1) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.A0E(dialogInterface);
    }
}
