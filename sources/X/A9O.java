package X;

import android.app.Activity;
import android.content.DialogInterface;

public class A9O implements DialogInterface.OnCancelListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public A9O(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 0:
            case 1:
                AnonymousClass91T r1 = (AnonymousClass91T) obj;
                AnonymousClass4Yv.A00(r1, this.A01);
                r1.A4o();
                r1.finish();
                return;
            default:
                AnonymousClass4Yv.A00((Activity) obj, this.A01);
                return;
        }
    }
}
