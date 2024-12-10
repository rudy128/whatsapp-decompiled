package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Hilt_LegacyMessageDialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;

/* renamed from: X.4FY  reason: invalid class name */
public abstract class AnonymousClass4FY {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.LegacyMessageDialogFragment, com.whatsapp.Hilt_LegacyMessageDialogFragment, androidx.fragment.app.Fragment] */
    public static LegacyMessageDialogFragment A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, CharSequence charSequence, Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, int i5) {
        ? hilt_LegacyMessageDialogFragment = new Hilt_LegacyMessageDialogFragment();
        Bundle A0D = C17880vN.A0D();
        if (i != -1) {
            A0D.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
        }
        if (i5 != 0) {
            A0D.putInt("title_res", i5);
        }
        if (i2 != 0) {
            A0D.putInt("message_res", i2);
            AnonymousClass4FX.A00(A0D, "message_params_values", "message_params_types", objArr);
        }
        if (i3 != 0) {
            A0D.putInt("primary_action_text_id_res", i3);
        }
        if (i4 != 0) {
            A0D.putInt("secondary_action_text_res", i4);
        }
        if (i5 != 0) {
            AnonymousClass4FX.A00(A0D, "title_params_values", "title_params_types", objArr2);
        }
        if (charSequence != null) {
            A0D.putCharSequence("message", charSequence);
        }
        if (!(i3 == 0 || onClickListener == null)) {
            hilt_LegacyMessageDialogFragment.A00 = onClickListener;
        }
        if (!(i4 == 0 || onClickListener2 == null)) {
            hilt_LegacyMessageDialogFragment.A01 = onClickListener2;
        }
        hilt_LegacyMessageDialogFragment.A1R(A0D);
        return hilt_LegacyMessageDialogFragment;
    }
}
