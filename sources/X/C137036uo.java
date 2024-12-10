package X;

import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6uo  reason: invalid class name and case insensitive filesystem */
public abstract class C137036uo {
    public static C136826uT A01(PersistableBundle persistableBundle) {
        return new C136826uT((IconCompat) null, persistableBundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), persistableBundle.getString("key"), persistableBundle.getString("uri"), persistableBundle.getBoolean("isBot"), persistableBundle.getBoolean("isImportant"));
    }

    public static PersistableBundle A00(C136826uT r3) {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = r3.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        persistableBundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        persistableBundle.putString("uri", r3.A03);
        persistableBundle.putString("key", r3.A02);
        persistableBundle.putBoolean("isBot", r3.A04);
        persistableBundle.putBoolean("isImportant", r3.A05);
        return persistableBundle;
    }
}
