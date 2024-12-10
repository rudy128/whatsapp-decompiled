package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.8CQ  reason: invalid class name */
public final class AnonymousClass8CQ extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C19830z4 A00;
    public final /* synthetic */ C183609Yx A01;

    public void onAvailable(Network network) {
        C18070vi.A0d(network, 0);
        Log.i("CellularNetworkUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular is available");
        C31761g5 r1 = this.A01.A00;
        if (r1.Be2()) {
            r1.resumeWith(network);
        }
    }

    public AnonymousClass8CQ(C19830z4 r1, C183609Yx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onUnavailable() {
        Log.e("CellularNetworkUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular network is unavailable");
        this.A00.A1g("silent_auth_no_cellular");
        C31761g5 r1 = this.A01.A00;
        if (r1.Be2()) {
            r1.resumeWith((Object) null);
        }
    }
}
