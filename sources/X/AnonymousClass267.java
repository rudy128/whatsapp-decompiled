package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.267  reason: invalid class name */
public class AnonymousClass267 extends BroadcastReceiver {
    public final /* synthetic */ HomeActivity A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass267(HomeActivity homeActivity, Runnable runnable) {
        this.A00 = homeActivity;
        this.A01 = runnable;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("HomeActivity/resume/unlocked received ACTION_USER_PRESENT");
        try {
            HomeActivity homeActivity = this.A00;
            ((C29831cw) homeActivity.A1s.get()).A02(this, context);
            AnonymousClass1KB r0 = homeActivity.A05;
            Runnable runnable = this.A01;
            r0.A0I(runnable);
            homeActivity.A05.A0K(runnable, 500);
            homeActivity.A05 = null;
        } catch (Exception e) {
            Log.e("HomeActivity/resume/unlocked received ACTION_USER_PRESENT ", e);
        }
    }
}
