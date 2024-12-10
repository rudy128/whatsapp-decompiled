package X;

import android.credentials.CreateCredentialException;
import android.os.OutcomeReceiver;
import android.util.Log;

public final class Cz5 implements OutcomeReceiver {
    public final /* synthetic */ C24898COr A00;
    public final /* synthetic */ E7A A01;
    public final /* synthetic */ C26612D6f A02;

    public Cz5(C24898COr cOr, E7A e7a, C26612D6f d6f) {
        this.A01 = e7a;
        this.A00 = cOr;
        this.A02 = d6f;
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        C18070vi.A0d(createCredentialException, 0);
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        this.A01.Bsz(C26612D6f.A01(createCredentialException));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onResult(java.lang.Object r6) {
        /*
            r5 = this;
            android.credentials.CreateCredentialResponse r6 = (android.credentials.CreateCredentialResponse) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.String r1 = "CredManProvService"
            java.lang.String r0 = "Create Result returned from framework: "
            android.util.Log.i(r1, r0)
            X.E7A r4 = r5.A01
            java.lang.String r3 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            android.os.Bundle r2 = r6.getData()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0027 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0027 }
            X.BK6 r1 = new X.BK6     // Catch:{ Exception -> 0x0027 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0027 }
            goto L_0x003f
        L_0x0027:
            X.C1E r0 = new X.C1E     // Catch:{ C1E -> 0x002d }
            r0.<init>()     // Catch:{ C1E -> 0x002d }
            throw r0     // Catch:{ C1E -> 0x002d }
        L_0x002d:
            X.BK4 r1 = new X.BK4
            r1.<init>(r2)
            int r0 = r3.length()
            if (r0 > 0) goto L_0x003f
            java.lang.String r0 = "type should not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x003f:
            r4.onResult(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cz5.onResult(java.lang.Object):void");
    }
}
