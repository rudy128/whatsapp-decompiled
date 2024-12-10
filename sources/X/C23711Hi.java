package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.1Hi  reason: invalid class name and case insensitive filesystem */
public class C23711Hi extends C23701Hh {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if ((activity instanceof AnonymousClass1FY) && Boolean.TRUE.equals(((C27431Wb) this.A00.get()).A03.A06())) {
            Log.i("LockedForBackupLifecycleObserver/onActivityCreated redirect to BlockingUserInteractionActivity");
            this.A01.get();
            activity.startActivity(AnonymousClass1LU.A0B(activity, 0));
            activity.finish();
        }
    }

    public C23711Hi(AnonymousClass00H r1, AnonymousClass00H r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
