package X;

import android.content.DialogInterface;

/* renamed from: X.A9u  reason: case insensitive filesystem */
public final /* synthetic */ class C20158A9u implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ boolean A01;

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z = this.A01;
        AnonymousClass1FY r0 = this.A00;
        if (z) {
            r0.finish();
        }
    }

    public /* synthetic */ C20158A9u(AnonymousClass1FY r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
