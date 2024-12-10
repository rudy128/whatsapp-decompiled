package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity;
import androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity;
import androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity;

/* renamed from: X.BEi  reason: case insensitive filesystem */
public class C22584BEi extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public C22584BEi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        switch (this.A00) {
            case 0:
                InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = (InstrumentationActivityInvoker$BootstrapActivity) this.A01;
                instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
                instrumentationActivityInvoker$BootstrapActivity.finish();
                return;
            case 1:
                ((InstrumentationActivityInvoker$EmptyActivity) this.A01).finish();
                return;
            case 2:
                ((InstrumentationActivityInvoker$EmptyFloatingActivity) this.A01).finish();
                return;
            default:
                if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
                    ((View) this.A01).invalidate();
                    return;
                }
                return;
        }
    }
}
