package X;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: X.7BM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BM implements OnSuccessListener {
    public final /* synthetic */ BZ9 A00;
    public final /* synthetic */ C23194Bco A01;

    public /* synthetic */ AnonymousClass7BM(BZ9 bz9, C23194Bco bco) {
        this.A00 = bz9;
        this.A01 = bco;
    }

    public final void onSuccess(Object obj) {
        if (this.A01.A0A) {
            Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
        }
    }
}
