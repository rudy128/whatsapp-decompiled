package X;

import android.content.DialogInterface;
import android.webkit.PermissionRequest;

/* renamed from: X.74p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1411774p implements DialogInterface.OnCancelListener {
    public final /* synthetic */ PermissionRequest A00;
    public final /* synthetic */ C130266j9 A01;

    public final void onCancel(DialogInterface dialogInterface) {
        C130266j9 r3 = this.A01;
        PermissionRequest permissionRequest = this.A00;
        if (r3.A01) {
            permissionRequest.deny();
            r3.A01 = false;
        }
    }

    public /* synthetic */ C1411774p(PermissionRequest permissionRequest, C130266j9 r2) {
        this.A01 = r2;
        this.A00 = permissionRequest;
    }
}
