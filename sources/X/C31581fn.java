package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1fn  reason: invalid class name and case insensitive filesystem */
public class C31581fn implements C31571fm {
    public static final Socket A03 = new Socket();
    public ThreadPoolExecutor A00;
    public boolean A01;
    public final AnonymousClass10I A02;

    private synchronized ThreadPoolExecutor A00() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.A00;
        if (threadPoolExecutor == null) {
            AnonymousClass10I r2 = this.A02;
            threadPoolExecutor = new C49302Py((AnonymousClass10J) r2, new ArrayBlockingQueue(2), new AnonymousClass10O(1, "happy-eyeball"), TimeUnit.SECONDS, 2, 2, 30, false);
            this.A00 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }

    public static void A01(C31581fn r4, C58582kv r5, InetSocketAddress inetSocketAddress, SSLSocketFactory sSLSocketFactory, int i) {
        try {
            TrafficStats.setThreadStatsTag(1);
            C62662rl A002 = C31561fl.A00("HappyEyeball", inetSocketAddress, sSLSocketFactory, i);
            if (!r5.A01(A002.A00)) {
                Log.i("HappyEyeball/closeSocket");
                A002.A02();
            }
        } catch (IOException | ClassCastException e) {
            if (!(e instanceof ClassCastException) || Build.VERSION.SDK_INT == 26) {
                StringBuilder sb = new StringBuilder();
                sb.append("HappyEyeball/connectAndCountDown could not connect to ");
                sb.append(inetSocketAddress);
                Log.e(sb.toString(), e);
                synchronized (r4) {
                    if (r4.A01) {
                        r5.A01(A03);
                    } else {
                        r4.A01 = true;
                    }
                }
            } else {
                throw ((ClassCastException) e);
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        TrafficStats.clearThreadStatsTag();
    }

    public C62662rl CPv(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, SSLSocketFactory sSLSocketFactory, int i) {
        ReentrantLock reentrantLock;
        Object obj;
        C58582kv r6 = new C58582kv();
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        int i2 = i;
        A00().execute(new AnonymousClass7Q7(this, inetSocketAddress2, sSLSocketFactory2, r6, i2, 15));
        try {
            Socket socket = (Socket) r6.A00(250, TimeUnit.MILLISECONDS);
            if (socket != null) {
                return new C62662rl(socket);
            }
            Log.i("happyEyeball/couldn't connect to ipv6 in 250 ms");
            A00().execute(new AnonymousClass7Q7(this, inetSocketAddress, sSLSocketFactory2, r6, i2, 16));
            try {
                reentrantLock = r6.A02;
                reentrantLock.lockInterruptibly();
                while (true) {
                    obj = r6.A00;
                    if (obj != null) {
                        break;
                    }
                    r6.A01.await();
                }
                reentrantLock.unlock();
                Socket socket2 = (Socket) obj;
                if (!(socket2 == null || !socket2.isConnected() || socket2 == A03)) {
                    return new C62662rl(socket2);
                }
            } catch (InterruptedException e) {
                Log.w("HappyEyeball", e);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            throw new IOException("HappyEyeball/couldn't connect to neither of ips");
        } catch (InterruptedException e2) {
            Log.e("HappyEyeball/try_connect exception short wait for ipv6", e2);
        }
    }

    public C31581fn(AnonymousClass10I r1) {
        this.A02 = r1;
    }
}
