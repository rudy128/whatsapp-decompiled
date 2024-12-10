package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: X.6XL  reason: invalid class name */
public abstract class AnonymousClass6XL {
    public static final void A00(Context context, C19830z4 r7, AnonymousClass10I r8) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        String str3;
        boolean A17 = C18070vi.A17(context, r8);
        C18070vi.A0d(r7, 2);
        C138236wk r2 = new C138236wk(context);
        C128676gV r5 = new C128676gV(r2, r7, r8);
        int i = r2.A00;
        if (i != 2) {
            if (i == A17) {
                str3 = "Client is already in the process of connecting to the service.";
            } else if (i == 3) {
                str3 = "Client was already closed and can't be reused. Please create another instance.";
            }
            C137066ur.A01(str3);
            return;
        } else if (!(r2.A02 == null || r2.A01 == null)) {
            C137066ur.A00("Service connection is valid. No need to re-initialize.");
            r5.A02.CGF(new C146517Pk(r5.A00, r5.A01, 28));
            return;
        }
        C137066ur.A00("Starting install referrer service setup.");
        Intent A0G = C108945cZ.A0G("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        A0G.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context2 = r2.A03;
        List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(A0G, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            r2.A00 = 0;
            str = "Install Referrer service unavailable on device.";
        } else {
            String str4 = serviceInfo.packageName;
            String str5 = serviceInfo.name;
            if ("com.android.vending".equals(str4) && str5 != null) {
                try {
                    if (context2.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent = new Intent(A0G);
                        AnonymousClass75H r0 = new AnonymousClass75H(r2, r5);
                        r2.A01 = r0;
                        try {
                            if (context2.bindService(intent, r0, A17 ? 1 : 0)) {
                                str = "Service was bonded successfully.";
                            } else {
                                str2 = "Connection to service is blocked.";
                                C137066ur.A01(str2);
                                r2.A00 = 0;
                                return;
                            }
                        } catch (SecurityException unused) {
                            C137066ur.A01("No permission to connect to service.");
                            r2.A00 = 0;
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            str2 = "Play Store missing or incompatible. Version 8.3.73 or later required.";
            C137066ur.A01(str2);
            r2.A00 = 0;
            return;
        }
        C137066ur.A00(str);
    }
}
