package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.8CO  reason: invalid class name */
public final class AnonymousClass8CO extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass8KP A00;

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C18070vi.A0d(networkCapabilities, 1);
        AnonymousClass8BX.A12(A5Z.A00(), networkCapabilities, "Network capabilities changed: ", C20091A6t.A00, AnonymousClass000.A10());
        AnonymousClass8KP r1 = this.A00;
        r1.A03(C20091A6t.A01(r1.A00));
    }

    public AnonymousClass8CO(AnonymousClass8KP r1) {
        this.A00 = r1;
    }

    public void onLost(Network network) {
        A5Z.A00().A03(C20091A6t.A00, "Network connection lost");
        AnonymousClass8KP r1 = this.A00;
        r1.A03(C20091A6t.A01(r1.A00));
    }
}
