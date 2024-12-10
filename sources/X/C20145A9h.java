package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.A9h  reason: case insensitive filesystem */
public final /* synthetic */ class C20145A9h implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A01;
        String str = this.A03;
        int i2 = this.A00;
        String str2 = this.A04;
        Runnable runnable = this.A02;
        activity.startActivity(AnonymousClass1LU.A1Y(activity, str, str2, i2, false));
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C20145A9h(Activity activity, Runnable runnable, String str, String str2, int i) {
        this.A01 = activity;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = runnable;
    }
}
