package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0ZV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0ZV implements Runnable {
    public final /* synthetic */ Context A00;

    public static void A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AnonymousClass013.A00().A07()) {
                    String A002 = AnonymousClass0D5.A00(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AnonymousClass0Ki.A01(AnonymousClass0D4.A00(A002), systemService);
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public final void run() {
        Context context = this.A00;
        boolean z = AnonymousClass013.A02;
        A00(context);
        AnonymousClass013.A02 = true;
    }

    public /* synthetic */ AnonymousClass0ZV(Context context) {
        this.A00 = context;
    }
}
