package androidx.test.core.app;

import X.C108945cZ;
import X.C22584BEi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;

public class InstrumentationActivityInvoker$EmptyFloatingActivity extends Activity {
    public final BroadcastReceiver A00 = new C22584BEi(this, 2);

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.A00, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A00);
    }

    public void onResume() {
        super.onResume();
        sendBroadcast(C108945cZ.A0G("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
    }
}
