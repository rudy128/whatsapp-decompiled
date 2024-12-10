package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.Cz4  reason: case insensitive filesystem */
public final class C26404Cz4 implements OutcomeReceiver {
    public final /* synthetic */ E7A A00;
    public final /* synthetic */ C26612D6f A01;

    public C26404Cz4(E7A e7a, C26612D6f d6f) {
        this.A00 = e7a;
        this.A01 = d6f;
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        C18070vi.A0d(getCredentialException, 0);
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        this.A00.Bsz(C26612D6f.A02(getCredentialException));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        C18070vi.A0d(getCredentialResponse, 0);
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        this.A00.onResult(C26612D6f.A00(getCredentialResponse));
    }
}
