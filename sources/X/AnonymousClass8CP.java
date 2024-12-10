package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.8CP  reason: invalid class name */
public final class AnonymousClass8CP extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ConnectivityManager A00;
    public final /* synthetic */ C108935cY A01;

    public void onAvailable(Network network) {
        C18070vi.A0d(network, 0);
        Log.i("p2p/WifiDirectScannerConnectionHandler/ Network available");
        ConnectivityManager connectivityManager = this.A00;
        if (connectivityManager != null) {
            connectivityManager.bindProcessToNetwork(network);
        }
        this.A01.BFN(AnonymousClass000.A0i());
    }

    public AnonymousClass8CP(ConnectivityManager connectivityManager, C108935cY r2) {
        this.A00 = connectivityManager;
        this.A01 = r2;
    }

    public void onUnavailable() {
        Log.e("p2p/WifiDirectScannerConnectionHandler/ Network unavailable");
        this.A01.BFN(AnonymousClass000.A0h());
    }
}
