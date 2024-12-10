package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.whatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver;

/* renamed from: X.1VJ  reason: invalid class name */
public class AnonymousClass1VJ {
    public ComponentName A00;
    public ComponentName A01;
    public final AnonymousClass118 A02;

    public void A02(boolean z) {
        int i = 2;
        if (z) {
            i = 1;
        }
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A00;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionLogoutStateReceiver.class);
            this.A00 = componentName;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
    }

    public int A00() {
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A01;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionPreferenceStateReceiver.class);
            this.A01 = componentName;
        }
        return packageManager.getComponentEnabledSetting(componentName);
    }

    public void A01(int i) {
        Context context = this.A02.A00;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = this.A01;
        if (componentName == null) {
            componentName = new ComponentName(context, CompanionStateHolder$CompanionPreferenceStateReceiver.class);
            this.A01 = componentName;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
    }

    public AnonymousClass1VJ(AnonymousClass118 r1) {
        this.A02 = r1;
    }
}
