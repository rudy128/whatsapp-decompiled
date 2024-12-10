package X;

import android.os.Bundle;
import com.whatsapp.status.playback.fragment.Hilt_OpenLinkConfirmationDialogFragment;
import com.whatsapp.status.playback.fragment.OpenLinkConfirmationDialogFragment;

/* renamed from: X.6Xa  reason: invalid class name and case insensitive filesystem */
public abstract class C124096Xa {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.status.playback.fragment.Hilt_OpenLinkConfirmationDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.status.playback.fragment.OpenLinkConfirmationDialogFragment] */
    public static final OpenLinkConfirmationDialogFragment A00(String str, String str2) {
        ? hilt_OpenLinkConfirmationDialogFragment = new Hilt_OpenLinkConfirmationDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("url", str);
        A0D.putString("message_key_id", str2);
        hilt_OpenLinkConfirmationDialogFragment.A1R(A0D);
        return hilt_OpenLinkConfirmationDialogFragment;
    }
}
