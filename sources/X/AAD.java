package X;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class AAD implements WifiP2pManager.ActionListener {
    public int A00 = -1;
    public final String A01;
    public final CountDownLatch A02 = new CountDownLatch(1);

    public AAD(String str) {
        this.A01 = str;
    }

    public final boolean A00() {
        try {
            if (!this.A02.await(5000, TimeUnit.MILLISECONDS)) {
                StringBuilder A11 = AnonymousClass000.A11("p2p/WifiDirectManager/ ActionListener [");
                A11.append(this.A01);
                C17890vO.A1A(A11, " ] timed out after 5000 ms");
                this.A00 = 3;
                return false;
            }
        } catch (InterruptedException unused) {
            StringBuilder A112 = AnonymousClass000.A11("p2p/WifiDirectManager/ ActionListener [");
            A112.append(this.A01);
            C17890vO.A1A(A112, "] interrupted");
        }
        if (this.A00 == -1) {
            return true;
        }
        return false;
    }

    public void onFailure(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("p2p/WifiDirectManager/ ");
        A10.append(this.A01);
        C17900vP.A0k(" failure_reason: ", A10, i);
        this.A00 = i;
        this.A02.countDown();
    }

    public void onSuccess() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("p2p/WifiDirectManager/ ");
        A10.append(this.A01);
        C17890vO.A1A(A10, " success");
        this.A02.countDown();
    }
}
