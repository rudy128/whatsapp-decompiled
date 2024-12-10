package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.A9g  reason: case insensitive filesystem */
public final /* synthetic */ class C20144A9g implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C19830z4 A01;
    public final /* synthetic */ AnonymousClass11O A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C19830z4 r7 = this.A01;
        Activity activity = this.A00;
        String str = this.A04;
        AnonymousClass11O r4 = this.A02;
        Runnable runnable = this.A03;
        Log.i("RegistrationUtils/showLoginFailedDialog/exit login");
        C17880vN.A1E(C19830z4.A00(r7), "account_switching_logged_out_phone_number", (String) null);
        activity.startActivity(AnonymousClass1LU.A1Y(activity, str, r4.A01(), r7.A0E(), false));
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C20144A9g(Activity activity, C19830z4 r2, AnonymousClass11O r3, Runnable runnable, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = runnable;
    }
}
