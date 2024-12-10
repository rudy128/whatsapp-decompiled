package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;

public abstract class A3f {
    public static C161058Bf A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.app.ProgressDialog, android.app.Dialog, X.8Bf] */
    public static C161058Bf A01(Context context) {
        ? progressDialog = new ProgressDialog(context);
        A00 = progressDialog;
        progressDialog.setTitle(2131892315);
        A00.setMessage(context.getString(2131895806));
        A00.setIndeterminate(true);
        A00.setCancelable(false);
        return A00;
    }

    public static String A02(Activity activity, C18000vb r6, long j) {
        int i;
        if (j == 0) {
            i = 2131892444;
        } else if (j == -1) {
            i = 2131897311;
        } else {
            if (A87.A00(C17880vN.A0h(), System.currentTimeMillis(), j) == 0) {
                return A8I.A00(r6, j);
            }
            return C64052u8.A08(r6, j);
        }
        return activity.getString(i);
    }

    public static C010105w A00(Context context) {
        int i;
        int i2;
        C20151A9n a9n;
        if (AnonymousClass11Z.A00()) {
            i = 2131892324;
            i2 = 2131892323;
            if ("unmounted".equals(Environment.getExternalStorageState())) {
                i = 2131892326;
                i2 = 2131892325;
                a9n = new C20151A9n(context, 17);
            }
            a9n = null;
        } else {
            i = 2131892322;
            i2 = 2131892936;
            a9n = null;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(i);
        A002.A0D(i2);
        A002.A0Z((DialogInterface.OnClickListener) null, 2131899286);
        if (a9n != null) {
            A002.setPositiveButton(2131887456, a9n);
        }
        return A002.create();
    }
}
