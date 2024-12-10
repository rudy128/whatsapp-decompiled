package X;

import android.app.Activity;
import android.content.Intent;

public final /* synthetic */ class AX5 implements B8X {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ boolean A02;

    public final void C5A(Intent intent) {
        boolean z = this.A02;
        Activity activity = this.A01;
        int i = this.A00;
        if (z) {
            activity.startActivityForResult(intent, i);
        } else {
            activity.startActivity(intent);
        }
    }

    public /* synthetic */ AX5(Activity activity, int i, boolean z) {
        this.A02 = z;
        this.A01 = activity;
        this.A00 = i;
    }
}
