package X;

import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1De  reason: invalid class name and case insensitive filesystem */
public abstract class C22781De {
    public static void A01() {
        try {
            Log.i("ThreadUtils/logAllStackTraces");
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                StringBuilder sb = new StringBuilder("\n");
                A02(sb, (Thread) next.getKey(), (StackTraceElement[]) next.getValue());
                Log.log(3, sb.toString());
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static String A00(Throwable th) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement obj : th.getStackTrace()) {
            sb.append(obj.toString());
            sb.append("\n");
            i++;
            if (i == 15) {
                break;
            }
        }
        return sb.toString();
    }

    public static void A02(StringBuilder sb, Thread thread, StackTraceElement[] stackTraceElementArr) {
        sb.append("name=");
        sb.append(thread.getName());
        sb.append(" state=");
        sb.append(thread.getState());
        sb.append(" tid=");
        sb.append(thread.getId());
        sb.append(10);
        sb.append(Log.stackTraceStartPhrase());
        for (StackTraceElement obj : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(obj.toString());
            sb.append(10);
        }
        sb.append("### end stack trace");
        sb.append(10);
    }

    public static boolean A03() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
