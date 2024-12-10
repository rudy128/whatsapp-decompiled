package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.7F1  reason: invalid class name */
public class AnonymousClass7F1 implements C72113Kr {
    public final Context A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;

    public void Bqf() {
        ActivityInfo activityInfo;
        if (C18020vd.A05(C18040vf.A02, this.A01, 3085)) {
            Intent A0A = C17880vN.A0A();
            A0A.setAction("com.facebook.GET_PHONE_ID");
            Context context = this.A00;
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(A0A, 0);
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (AnonymousClass112.A05()) {
                i = 134217728;
            }
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        AnonymousClass631 r1 = new AnonymousClass631();
                        r1.A00 = packageManager.getApplicationLabel(next.activityInfo.applicationInfo).toString();
                        r1.A01 = next.activityInfo.packageName;
                        r1.A03 = C20070A5v.A01(packageInfo);
                        r1.A02 = C17970vW.A02(packageInfo.applicationInfo.publicSourceDir);
                        this.A02.CC4(r1);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
        }
    }

    public AnonymousClass7F1(Context context, C18030ve r2, AnonymousClass18K r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }
}
