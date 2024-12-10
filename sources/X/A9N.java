package X;

import android.app.Activity;
import android.content.DialogInterface;

public class A9N implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public A9N(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ((Activity) this.A02).onBackPressed();
    }
}
