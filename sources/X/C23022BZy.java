package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.BZy  reason: case insensitive filesystem */
public class C23022BZy extends C23023BZz implements EDR {
    public final Bundle A00;
    public final CTL A01;
    public final Integer A02;

    public final int BUx() {
        return 12451000;
    }

    public final boolean CFe() {
        return true;
    }

    public final void CSj(ECJ ecj) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C26033Cqt.A00(this.A0F).A01();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.A02;
            C18210vx.A00(num);
            C23081Baw baw = new C23081Baw(account, googleSignInAccount, 2, num.intValue());
            C26392Cys cys = (C26392Cys) A04();
            C23044BaL baL = new C23044BaL(baw, 1);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cys.A01);
            obtain.writeInt(1);
            baL.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(ecj.asBinder());
            cys.A00(12, obtain);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                ecj.CSf(new C23074Bap(new C23203Bcx(8, (PendingIntent) null), (C23136Bbp) null, 1));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public C23022BZy(Context context, Bundle bundle, Looper looper, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 44);
        this.A01 = ctl;
        this.A00 = bundle;
        this.A02 = ctl.A00;
    }

    public static Bundle A00(CTL ctl) {
        Integer num = ctl.A00;
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            A0D.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A0D.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A0D.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A0D.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        A0D.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A0D.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A0D.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        A0D.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        A0D.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return A0D;
    }
}
