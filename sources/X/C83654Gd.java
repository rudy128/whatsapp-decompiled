package X;

import android.os.Bundle;
import com.whatsapp.events.EventCallTypeDialog;

/* renamed from: X.4Gd  reason: invalid class name and case insensitive filesystem */
public abstract class C83654Gd {
    public static final EventCallTypeDialog A00(AnonymousClass4CW r4, boolean z) {
        EventCallTypeDialog eventCallTypeDialog = new EventCallTypeDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("INITIALLY_SELECTED_CALL_TYPE", r4.toString());
        A0D.putBoolean("IS_EDIT_MODE", z);
        eventCallTypeDialog.A1R(A0D);
        return eventCallTypeDialog;
    }
}
