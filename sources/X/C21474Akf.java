package X;

import android.os.Process;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: X.Akf  reason: case insensitive filesystem */
public class C21474Akf implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("************ LOCATION OF ERROR ************\n\n");
        A10.append("NPCI Common Library");
        A10.append("\n");
        A10.append("\n************ CAUSE OF ERROR ************\n\n");
        AnonymousClass8BS.A1D(stringWriter, A10);
        A10.append("\n");
        Log.e("Exception!!!", A10.toString());
        Process.killProcess(Process.myPid());
    }
}
