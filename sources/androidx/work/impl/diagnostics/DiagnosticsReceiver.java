package androidx.work.impl.diagnostics;

import X.A5Z;
import X.A7W;
import X.C196269uj;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = A5Z.A01("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            A5Z A002 = A5Z.A00();
            String str = A00;
            A002.A03(str, "Requesting diagnostics");
            try {
                A7W.A00(context).A08(new C196269uj(DiagnosticsWorker.class).A00());
            } catch (IllegalStateException e) {
                A5Z.A00().A08(str, "WorkManager is not initialized", e);
            }
        }
    }
}
