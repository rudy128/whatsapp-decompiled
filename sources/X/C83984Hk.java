package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.twofactor.SetEmailFragment;

/* renamed from: X.4Hk  reason: invalid class name and case insensitive filesystem */
public abstract class C83984Hk {
    public static final SetEmailFragment A00(int i) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
        SetEmailFragment setEmailFragment = new SetEmailFragment();
        setEmailFragment.A1R(A0D);
        return setEmailFragment;
    }
}
