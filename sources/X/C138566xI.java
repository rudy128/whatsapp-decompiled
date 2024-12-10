package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6xI  reason: invalid class name and case insensitive filesystem */
public class C138566xI {
    public final AnonymousClass118 A00;
    public final C37261pE A01;
    public final C138016wO A02;
    public final C37011op A03;
    public final C58292kS A04;
    public final C190339km A05;
    public final Executor A06;

    public C138566xI(AnonymousClass118 r4, C37261pE r5, C138016wO r6, C37011op r7, C58292kS r8, AnonymousClass10I r9) {
        AnonymousClass3DM r2 = new AnonymousClass3DM(r9, 5, false);
        C190339km r0 = new C190339km(r4, new C37001oo(r4, new C37031or()));
        this.A00 = r4;
        this.A04 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A06 = r2;
        this.A05 = r0;
        this.A02 = r6;
    }

    public static void A00(C138566xI r8, String str, String str2, boolean z) {
        SecurityException securityException;
        C138566xI r7 = r8;
        try {
            if (r8.A03.A01(str2).A03) {
                Intent intent = C108945cZ.A0G("com.whatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage(str2);
                try {
                    C190339km r0 = r8.A05;
                    String str3 = C19620yd.A0B;
                    List<ResolveInfo> queryIntentServices = r0.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !str3.equals(serviceInfo.permission)) {
                                securityException = new SecurityException(AnonymousClass001.A1H("Service not protected by permission ", str3, AnonymousClass000.A10()));
                            }
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Multiple services can handle this intent ");
                            securityException = new SecurityException(AnonymousClass000.A0y(intent.getAction(), A10));
                        }
                        throw securityException;
                    }
                    if (!r8.A00.A00.bindService(intent, new AnonymousClass75I(r7, r8.A02, str, str2, z), 1)) {
                        Log.w("CallbackServiceProxy/Failed to bind to stella service");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
