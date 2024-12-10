package X;

import android.app.ProgressDialog;
import android.content.Context;
import com.whatsapp.accountsync.LoginActivity;

/* renamed from: X.9An  reason: invalid class name and case insensitive filesystem */
public class C177769An extends A34 {
    public final ProgressDialog A00;
    public final /* synthetic */ LoginActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177769An(Context context, LoginActivity loginActivity) {
        super(loginActivity, true);
        this.A01 = loginActivity;
        ProgressDialog show = ProgressDialog.show(context, "", loginActivity.getString(2131886400), true, false);
        this.A00 = show;
        show.setCancelable(true);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        this.A00.dismiss();
        if (((Boolean) obj).booleanValue()) {
            this.A01.finish();
        }
    }
}
