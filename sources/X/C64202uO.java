package X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.2uO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64202uO implements DialogInterface.OnKeyListener {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ C53602cn A01;
    public final /* synthetic */ C36341nj A02;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C36341nj r4 = this.A02;
        AnonymousClass1FU r3 = this.A00;
        C53602cn r2 = this.A01;
        if (i == 4) {
            r4.A05(r3);
            dialogInterface.dismiss();
            r2.A00 = true;
        }
        return true;
    }

    public /* synthetic */ C64202uO(AnonymousClass1FU r1, C53602cn r2, C36341nj r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
