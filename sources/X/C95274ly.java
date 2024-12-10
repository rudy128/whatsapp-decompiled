package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.4ly  reason: invalid class name and case insensitive filesystem */
public class C95274ly implements C23501Gn {
    public final int A00;
    public final Object A01;

    public C95274ly(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        Activity activity = (Activity) this.A01;
        int i = Build.VERSION.SDK_INT;
        int i2 = 2131894434;
        if (i >= 30) {
            i2 = 2131894437;
            if (i < 33) {
                i2 = 2131894436;
            }
        }
        AnonymousClass74O.A08(activity, 2131894435, i2);
    }

    public void C2V() {
        switch (this.A00) {
            case 0:
                throw AnonymousClass000.A0n("inAppBugReporting/external-storage-readonly");
            case 1:
                throw AnonymousClass000.A0n("must not be called");
            default:
                Log.i("settings-chat/readonly-external-storage-readonly");
                AnonymousClass1FY r3 = (AnonymousClass1FY) this.A01;
                r3.A0C.get();
                int i = 2131894931;
                if (AnonymousClass11Z.A00()) {
                    i = 2131894930;
                }
                r3.BhU(new Object[0], 2131892322, i);
                return;
        }
    }

    public void C2W() {
        switch (this.A00) {
            case 0:
                throw AnonymousClass000.A0n("inAppBugReporting/external-storage-readonly/permission denied");
            case 1:
                throw AnonymousClass000.A0n("must not be called");
            default:
                Log.i("settings-chat/readonly-external-storage-readonly-permission");
                A00();
                return;
        }
    }

    public void C9R() {
        switch (this.A00) {
            case 0:
                AnonymousClass4RM r2 = (AnonymousClass4RM) this.A01;
                r2.A00 = -2;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("inAppBugReporting/error-external-storage-unavailable/state=");
                C17890vO.A1A(A10, r2.A01);
                return;
            case 1:
                AnonymousClass1FY r3 = (AnonymousClass1FY) this.A01;
                AnonymousClass1KB r22 = r3.A05;
                r3.A0C.get();
                int i = 2131892427;
                if (AnonymousClass11Z.A00()) {
                    i = 2131892426;
                }
                r22.A08(i, 1);
                r3.finish();
                return;
            default:
                Log.i("settings-chat/external-storage-unavailable");
                AnonymousClass4Yv.A01((Activity) this.A01, 602);
                return;
        }
    }

    public void C9S() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass4RM) this.A01).A00 = -2;
                Log.i("inAppBugReporting/error-external-storage-unavailable/permission denied");
                return;
            case 1:
                Activity activity = (Activity) this.A01;
                int i = Build.VERSION.SDK_INT;
                int i2 = 2131894490;
                if (i >= 30) {
                    i2 = 2131894493;
                    if (i < 33) {
                        i2 = 2131894492;
                    }
                }
                AnonymousClass74O.A08(activity, 2131894491, i2);
                return;
            default:
                Log.i("settings-chat/external-storage-unavailable-permission");
                A00();
                return;
        }
    }
}
