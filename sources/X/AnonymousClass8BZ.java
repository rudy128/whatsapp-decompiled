package X;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.8BZ  reason: invalid class name */
public class AnonymousClass8BZ extends AbstractAccountAuthenticator {
    public final Context A00;

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i("account/sync/addAccount");
        Bundle A0D = C17880vN.A0D();
        Intent A07 = AnonymousClass8BR.A07(this.A00, LoginActivity.class);
        A07.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        A0D.putParcelable("intent", A07);
        return A0D;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i("account/sync/confirmCredentials");
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i("account/sync/editProperties");
        return null;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i("account/sync/getAuthTokenLabel");
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/updateCredentials");
        return null;
    }

    public AnonymousClass8BZ(Context context) {
        super(context);
        this.A00 = context;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("account/sync/hasFeatures: ");
        C17890vO.A1A(A10, Arrays.toString(strArr));
        return null;
    }
}
