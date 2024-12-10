package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4bE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4bE implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C62292rA A00;
    public final /* synthetic */ LinkedDevicesEnterCodeActivity A01;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = this.A01;
        C62292rA r2 = this.A00;
        if (i != 4) {
            return false;
        }
        Log.i("LinkedDevicesEnterCodeActivity cancel the progress dialog on press back button");
        AnonymousClass4Q4 r0 = linkedDevicesEnterCodeActivity.A07;
        C17960vV.A02();
        C57572jI r02 = r0.A01;
        if (r02 != null) {
            r02.A00().A02();
        }
        if (r2 != null) {
            LinkedDevicesEnterCodeActivity.A0d(linkedDevicesEnterCodeActivity, r2.A02);
        }
        linkedDevicesEnterCodeActivity.A0G.get();
        if (!linkedDevicesEnterCodeActivity.Bed()) {
            LinkedDevicesEnterCodeActivity.A0Q(linkedDevicesEnterCodeActivity);
            linkedDevicesEnterCodeActivity.finish();
        }
        return true;
    }

    public /* synthetic */ AnonymousClass4bE(C62292rA r1, LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity) {
        this.A01 = linkedDevicesEnterCodeActivity;
        this.A00 = r1;
    }
}
