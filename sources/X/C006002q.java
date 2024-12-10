package X;

import android.app.Activity;
import android.app.Application;

/* renamed from: X.02q  reason: invalid class name and case insensitive filesystem */
public class C006002q implements AnonymousClass009 {
    public final Activity A00;
    public final AnonymousClass009 A01;
    public final Object A02 = new Object();
    public volatile Object A03;

    public final C006302u A00() {
        return ((AnonymousClass02r) this.A01).A02();
    }

    public Object generatedComponent() {
        String obj;
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    Activity activity = this.A00;
                    if (!(activity.getApplication() instanceof AnonymousClass009)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
                        if (Application.class.equals(activity.getApplication().getClass())) {
                            obj = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Found: ");
                            sb2.append(activity.getApplication().getClass());
                            obj = sb2.toString();
                        }
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    }
                    C006502w A032 = ((C006102s) C000400h.A00(C006102s.class, this.A01)).A03();
                    A032.BAj(activity);
                    this.A03 = A032.BDQ();
                }
            }
        }
        return this.A03;
    }

    public C006002q(Activity activity) {
        this.A00 = activity;
        this.A01 = new AnonymousClass02r((AnonymousClass01C) activity);
    }
}
