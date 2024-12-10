package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.26v  reason: invalid class name */
public class AnonymousClass26v extends ConnectivityManager.NetworkCallback {
    public volatile Network A00;
    public final /* synthetic */ C30041dI A01;

    public AnonymousClass26v(C30041dI r1) {
        this.A01 = r1;
    }

    private void A00(Network network, boolean z) {
        String str;
        if (this.A00 == null) {
            return;
        }
        if (network == null || network.equals(this.A00)) {
            this.A00 = null;
            C30041dI r4 = this.A01;
            r4.A03.A00();
            C219017v r0 = r4.A04;
            r0.A0C(-1, false, z);
            r0.A0G(false, false);
            if (z) {
                C29971dB r3 = r4.A05;
                Integer num = r3.A06;
                if (num != null) {
                    str = num.toString();
                } else {
                    str = null;
                }
                C19830z4 r42 = r3.A0B;
                List A0v = r42.A0v();
                C18070vi.A0X(A0v);
                if (str != null && !A0v.contains(str)) {
                    ArrayList A10 = C17880vN.A10(A0v);
                    A10.add(str);
                    if (A10.size() > 10) {
                        if (!A10.isEmpty()) {
                            A10.remove(0);
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                    C17880vN.A1E(C19830z4.A00(r42), "network:last_blocked_session_ids", AnonymousClass1EG.A07(",", C29431cG.A10(A10, 10)));
                }
                if (!r3.A08 && C29971dB.A03(r3, "xmpp-bg-to-blocked")) {
                    r3.A08 = true;
                }
            }
        }
    }

    public void onAvailable(Network network) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("xmpp/handler/network/network-callback onAvailable:");
        A10.append(network);
        A10.append(" handle:");
        C17890vO.A16(A10, network.getNetworkHandle());
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        NetworkCapabilities networkCapabilities;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("xmpp/handler/network/network-callback onBlockedStatusChanged network:");
        A10.append(network);
        A10.append(" blocked:");
        A10.append(z);
        A10.append(" handle:");
        C17890vO.A16(A10, network.getNetworkHandle());
        if (z) {
            A00(network, true);
            return;
        }
        this.A00 = network;
        C30041dI r6 = this.A01;
        ConnectivityManager A0E = r6.A02.A0E();
        boolean z2 = false;
        if (A0E != null && (networkCapabilities = A0E.getNetworkCapabilities(network)) != null && networkCapabilities.hasTransport(1) && networkCapabilities.hasCapability(17)) {
            z2 = true;
        }
        long networkHandle = network.getNetworkHandle();
        r6.A03.A00();
        C219017v r1 = r6.A04;
        r1.A0C(networkHandle, AnonymousClass000.A1P(z2 ? 1 : 0), false);
        r1.A0G(z2, false);
    }

    public void onLost(Network network) {
        C17900vP.A0Y(network, "xmpp/handler/network/network-callback onLost:", AnonymousClass000.A10());
        A00(network, false);
    }

    public void onUnavailable() {
        Log.i("xmpp/handler/network/network-callback onUnavailable");
        A00((Network) null, false);
    }
}
