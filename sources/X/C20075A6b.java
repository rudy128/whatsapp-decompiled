package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A6b  reason: case insensitive filesystem */
public class C20075A6b {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final AnonymousClass9X6 A05;
    public final AnonymousClass1HQ A06;
    public final ScheduledExecutorService A07;

    public C20075A6b(ConnectivityManager connectivityManager, AnonymousClass1HQ r4) {
        AnonymousClass9X6 r1 = new AnonymousClass9X6(r4);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A07 = newSingleThreadScheduledExecutor;
        this.A06 = r4;
    }

    public static void A00(Network network, C20075A6b a6b, boolean z) {
        DatagramSocket datagramSocket;
        String str;
        boolean z2 = false;
        C17960vV.A0F(AnonymousClass000.A1X(a6b.A02), "alternative socket must not have created");
        if (a6b.A02 != null) {
            Log.i("voip/weak-wifi/alt-sock: socket already created");
        } else {
            try {
                TrafficStats.setThreadStatsTag(15);
                a6b.A01 = network;
                DatagramSocket datagramSocket2 = new DatagramSocket();
                a6b.A02 = datagramSocket2;
                a6b.A01.bindSocket(datagramSocket2);
                z2 = true;
            } catch (SocketException unused) {
                str = "voip/weak-wifi/create-sock: socket exception to create alternative socket.";
            } catch (IOException unused2) {
                str = "voip/weak-wifi/create-sock: io exception to bind socket to alternative network.";
            }
            datagramSocket = a6b.A02;
            if (datagramSocket != null || !z2) {
                a6b.A02(true);
            } else {
                String str2 = null;
                try {
                    datagramSocket.connect(network.getByName("1.1.1.1"), 53);
                    InetAddress localAddress = datagramSocket.getLocalAddress();
                    if (!localAddress.isAnyLocalAddress()) {
                        str2 = localAddress.getHostAddress();
                    }
                    datagramSocket.disconnect();
                } catch (UnknownHostException unused3) {
                    Log.e("voip/weak-wifi/create-sock: unknown host exception to retrieve local ip.");
                }
                int detachFd = ParcelFileDescriptor.fromDatagramSocket(a6b.A02).detachFd();
                int localPort = a6b.A02.getLocalPort();
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/weak-wifi/create-sock: ip=");
                A10.append(str2);
                A10.append("; port=");
                A10.append(localPort);
                A10.append("; fd=");
                A10.append(detachFd);
                C17900vP.A0n("; test_network_cond = ", A10, z);
                if (z) {
                    Voip.startTestNetworkConditionWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                } else {
                    Voip.switchNetworkWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                }
            }
        }
        Voip.notifyFailureToCreateAlternativeSocket(z);
        Log.e(str);
        datagramSocket = a6b.A02;
        if (datagramSocket != null) {
        }
        a6b.A02(true);
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    private void A02(boolean z) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }

    public void A03() {
        ScheduledExecutorService scheduledExecutorService = this.A07;
        scheduledExecutorService.execute(new C21446AkD(this, 36));
        scheduledExecutorService.shutdown();
    }

    public void A04() {
        this.A07.execute(new C21446AkD(this, 37));
    }

    public /* synthetic */ void A05() {
        C17960vV.A0F(this.A03, "provider must not have already shutdown");
        if (!this.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        A02(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        this.A03 = false;
    }

    public /* synthetic */ void A06() {
        C17960vV.A0F(!this.A03, "provider must not have already started");
        if (this.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(this));
        this.A03 = true;
    }

    public /* synthetic */ void A07(boolean z) {
        if (!this.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            A02(z);
        }
    }

    public /* synthetic */ void A08(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        if (!this.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (this.A01 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/weak-wifi/re-use-alt-network: ");
            if (z) {
                str2 = "cellular";
            } else {
                str2 = "wifi";
            }
            A10.append(str2);
            A10.append("; test_network_cond=");
            if (z2) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            C17890vO.A1A(A10, str3);
            if (this.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                Voip.notifyFailureToCreateAlternativeSocket(z2);
                return;
            }
            A00(this.A01, this, z2);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z) {
                builder.addTransportType(0);
                str = "voip/weak-wifi/alt-network: cellular";
            } else {
                builder.addTransportType(1);
                str = "voip/weak-wifi/alt-network: wifi";
            }
            Log.i(str);
            builder.addCapability(12);
            this.A00 = new AnonymousClass8CR(this, this.A07.schedule(new AnonymousClass7RK(this, 15, z2), 5000, TimeUnit.MILLISECONDS), z2);
            int i = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = this.A04;
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (i >= 26) {
                connectivityManager.requestNetwork(build, networkCallback, 5000);
            } else {
                connectivityManager.requestNetwork(build, networkCallback);
            }
        }
    }
}
