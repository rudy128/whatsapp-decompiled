package X;

import android.app.AppOpsManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.util.UidVerifier;

/* renamed from: X.BiI  reason: case insensitive filesystem */
public final class C23508BiI extends Bi3 {
    public volatile int A00 = -1;
    public final /* synthetic */ C22581BEf A01;

    public /* synthetic */ C23508BiI(C22581BEf bEf) {
        this.A01 = bEf;
    }

    public static final boolean A01(C23508BiI biI, Object obj, Runnable runnable, String str) {
        if (Log.isLoggable("WearableLS", 3)) {
            Object[] objArr = new Object[3];
            objArr[0] = str;
            BE6.A1H(biI.A01.A00, objArr, 1);
            objArr[2] = obj;
            BE7.A1L("%s: %s %s", "WearableLS", objArr);
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != biI.A00) {
            C22581BEf bEf = biI.A01;
            C18210vx.A00(bEf);
            synchronized (C25976Cpm.class) {
                if (C25976Cpm.A01 == null) {
                    C25976Cpm.A01 = new C25976Cpm(bEf);
                }
            }
            if (C25976Cpm.A01.A01()) {
                try {
                    AppOpsManager appOpsManager = (AppOpsManager) C41401wK.A00(bEf).A00.getSystemService("appops");
                    if (appOpsManager != null) {
                        appOpsManager.checkPackage(callingUid, "com.google.android.wearable.app.cn");
                        biI.A00 = callingUid;
                    } else {
                        throw AnonymousClass000.A0s("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                    }
                } catch (SecurityException unused) {
                }
            }
            if (!UidVerifier.A00(bEf, callingUid)) {
                Log.e("WearableLS", AnonymousClass001.A1I("Caller is not GooglePlayServices; caller UID: ", BE6.A0t(57), callingUid));
                return false;
            }
            biI.A00 = callingUid;
        }
        C22581BEf bEf2 = biI.A01;
        synchronized (bEf2.A07) {
            if (bEf2.A05) {
                return false;
            }
            bEf2.A04.post(runnable);
            return true;
        }
    }
}
