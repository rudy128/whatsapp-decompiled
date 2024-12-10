package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.D6s  reason: case insensitive filesystem */
public final class C26624D6s implements E8R {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ C26624D6s(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    public final void Bx8() {
    }

    public final C24494C6m BqU(Bundle bundle) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = C25260Cbz.A00;
        synchronized (set) {
        }
        return new C22701BLe(signInHubActivity, set);
    }

    public final /* bridge */ /* synthetic */ void Bx0(Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
