package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.whatsapp.glasses.BluetoothPermissionDialogFragment;
import com.whatsapp.loginfailure.LogoutMessageActivity;

/* renamed from: X.48c  reason: invalid class name and case insensitive filesystem */
public class C824748c extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C824748c(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    public void A04(View view) {
        String str;
        switch (this.A00) {
            case 0:
                if (!this.A03) {
                    ((Dialog) this.A01).dismiss();
                    BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment = (BluetoothPermissionDialogFragment) this.A02;
                    C19830z4 r1 = bluetoothPermissionDialogFragment.A03;
                    if (r1 == null) {
                        str = "waSharedPreferences";
                        break;
                    } else {
                        AnonymousClass74O.A0G(bluetoothPermissionDialogFragment, r1, bluetoothPermissionDialogFragment.A06);
                        return;
                    }
                } else {
                    BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment2 = (BluetoothPermissionDialogFragment) this.A02;
                    bluetoothPermissionDialogFragment2.A05 = true;
                    AnonymousClass4aU.A05(bluetoothPermissionDialogFragment2.A1D());
                    return;
                }
            case 1:
                LogoutMessageActivity logoutMessageActivity = (LogoutMessageActivity) this.A02;
                logoutMessageActivity.A4c();
                boolean z = this.A03;
                String A0r = C17880vN.A0r(C72453Mb.A0M(logoutMessageActivity), "main_button_url");
                if (!z || A0r == null || C24605CBj.A00(A0r)) {
                    logoutMessageActivity.A4b();
                } else {
                    C36361nl r12 = logoutMessageActivity.A00;
                    if (r12 != null) {
                        C72453Mb.A18((Context) this.A01, r12, A0r);
                    }
                }
                ((Activity) this.A01).finishAffinity();
                return;
            default:
                LogoutMessageActivity logoutMessageActivity2 = (LogoutMessageActivity) this.A02;
                C36361nl r4 = logoutMessageActivity2.A00;
                if (r4 != null) {
                    Activity activity = (Activity) this.A01;
                    boolean z2 = this.A03;
                    String A0r2 = C17880vN.A0r(C72453Mb.A0M(logoutMessageActivity2), "secondary_button_url");
                    if (!z2 || A0r2 == null || C24605CBj.A00(A0r2)) {
                        A0r2 = null;
                    }
                    C72453Mb.A18(activity, r4, A0r2);
                    activity.finishAffinity();
                    return;
                }
                break;
        }
        str = "linkLauncher";
        C18070vi.A11(str);
        throw null;
    }
}
