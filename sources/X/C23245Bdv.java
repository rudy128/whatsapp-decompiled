package X;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import com.google.android.gms.common.util.UidVerifier;

/* renamed from: X.Bdv  reason: case insensitive filesystem */
public final class C23245Bdv extends BFY implements IInterface {
    public final Context A00;

    public static final void A00(C23245Bdv bdv) {
        if (!UidVerifier.A00(bdv.A00, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Calling UID ");
            A10.append(callingUid);
            throw new SecurityException(AnonymousClass000.A0y(" is not Google Play services.", A10));
        }
    }

    public C23245Bdv(Context context) {
        this();
        this.A00 = context;
    }

    public C23245Bdv() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}
