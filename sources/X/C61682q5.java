package X;

import android.net.TrafficStats;
import android.os.Build;
import android.system.ErrnoException;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.2q5  reason: invalid class name and case insensitive filesystem */
public final class C61682q5 {
    public final int A00;
    public final C58582kv A01 = new C58582kv();
    public final ConcurrentLinkedDeque A02;
    public final ThreadPoolExecutor A03;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public final SSLSocketFactory A05;

    public C61682q5(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, ThreadPoolExecutor threadPoolExecutor, SSLSocketFactory sSLSocketFactory, int i) {
        C18070vi.A0d(threadPoolExecutor, 1);
        this.A03 = threadPoolExecutor;
        this.A05 = sSLSocketFactory;
        this.A00 = i;
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        this.A02 = concurrentLinkedDeque;
        concurrentLinkedDeque.offer(inetSocketAddress2);
        concurrentLinkedDeque.offer(inetSocketAddress);
    }

    public static final void A00(C61682q5 r5, InetSocketAddress inetSocketAddress) {
        IOException iOException;
        Throwable cause;
        try {
            TrafficStats.setThreadStatsTag(1);
            C62662rl A002 = C31561fl.A00("HappyEyeballV2", inetSocketAddress, r5.A05, r5.A00);
            if (A002.A00.isConnected()) {
                if (!r5.A01.A01(A002)) {
                    A002.A02();
                }
                TrafficStats.clearThreadStatsTag();
                return;
            }
            Log.w("HappyEyeballV2/workerConnect directConnect returned unconnected socket");
            throw C17880vN.A0f("SOCKET_NOT_CONNECTED");
        } catch (Exception e) {
            if (e instanceof IOException) {
                iOException = (IOException) e;
            } else if (!(e instanceof ClassCastException) || Build.VERSION.SDK_INT != 26) {
                throw e;
            } else {
                iOException = new IOException("CLASS_CAST_EXCEPTION", e);
            }
            if ((iOException instanceof ConnectException) && (cause = iOException.getCause()) != null && (cause instanceof ErrnoException)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("HappyEyeballV2/workerConnect failed to connect to ");
                A10.append(inetSocketAddress);
                A10.append(' ');
                A10.append(iOException.getCause());
                A10.append(')');
                C17890vO.A0w(A10);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("ConnectException(");
                A102.append(((ErrnoException) cause).errno);
                A102.append(')');
                A102.toString();
            } else if (iOException instanceof SocketTimeoutException) {
                C17900vP.A0X(inetSocketAddress, "HappyEyeballV2/workerConnect SocketTimeout connecting to ", AnonymousClass000.A10());
            } else {
                Log.e(AnonymousClass001.A1E(inetSocketAddress, "HappyEyeballV2/workerConnect IOException connecting to ", AnonymousClass000.A10()), iOException);
                C18070vi.A18(iOException.getMessage(), "SOCKET_NOT_CONNECTED");
            }
            if (r5.A04.incrementAndGet() > 1) {
                r5.A01.A01(new C62662rl(new Socket()));
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }
}
