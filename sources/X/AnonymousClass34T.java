package X;

import com.whatsapp.util.Log;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.34T  reason: invalid class name */
public final class AnonymousClass34T implements C31571fm {
    public final AnonymousClass10I A00;
    public final C18100vl A01 = new C18110vm(new AnonymousClass3HT(this));

    public AnonymousClass34T(AnonymousClass10I r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public C62662rl CPv(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, SSLSocketFactory sSLSocketFactory, int i) {
        int i2;
        C61682q5 r8 = new C61682q5(inetSocketAddress, inetSocketAddress2, (ThreadPoolExecutor) this.A01.getValue(), sSLSocketFactory, i);
        C62662rl r7 = null;
        while (true) {
            ConcurrentLinkedDeque concurrentLinkedDeque = r8.A02;
            if (!C17880vN.A1X(concurrentLinkedDeque)) {
                break;
            }
            Object poll = concurrentLinkedDeque.poll();
            r7 = null;
            if (poll != null) {
                r8.A03.execute(new C70643By(r8, poll, 30));
                if (C17880vN.A1X(concurrentLinkedDeque)) {
                    i2 = 250;
                } else {
                    i2 = r8.A00;
                }
                try {
                    C62662rl r0 = (C62662rl) r8.A01.A00((long) i2, TimeUnit.MILLISECONDS);
                    r7 = r0;
                    if (r0 != null) {
                        Socket socket = r0.A00;
                        if (socket.isConnected()) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("HappyEyeballV2/connected ");
                            A10.append(socket.getInetAddress());
                            C17890vO.A14(": clearing remaining queue of ", A10, concurrentLinkedDeque);
                            C17890vO.A1A(A10, " ips");
                            concurrentLinkedDeque.clear();
                        } else {
                            Log.e("HappyEyeballV2/next/failed to produce connected socket");
                        }
                    }
                } catch (InterruptedException e) {
                    Log.e("HappyEyeballV2/connectAndCountDown/InterruptedException", e);
                }
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("HappyEyeballV2/next/timeout after ");
                A102.append(i2);
                C17900vP.A0Y(poll, "ms from enqueuing ", A102);
            }
        }
        if (r7 != null) {
            return r7;
        }
        throw C17880vN.A0f("HappyEyeballV2/try_connect failed to connect to both ipV4 and ipV6");
    }
}
