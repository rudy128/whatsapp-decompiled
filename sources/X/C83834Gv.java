package X;

import android.os.Bundle;
import com.whatsapp.growthlock.Hilt_InviteLinkUnavailableDialogFragment;
import com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment;

/* renamed from: X.4Gv  reason: invalid class name and case insensitive filesystem */
public abstract class C83834Gv {
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.whatsapp.growthlock.Hilt_InviteLinkUnavailableDialogFragment, com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment] */
    public static final InviteLinkUnavailableDialogFragment A00(boolean z, boolean z2) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("finishCurrentActivity", z);
        A0D.putBoolean("isGroupStillLocked", z2);
        ? hilt_InviteLinkUnavailableDialogFragment = new Hilt_InviteLinkUnavailableDialogFragment();
        hilt_InviteLinkUnavailableDialogFragment.A1R(A0D);
        return hilt_InviteLinkUnavailableDialogFragment;
    }
}
