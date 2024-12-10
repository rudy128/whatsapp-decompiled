package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ja  reason: invalid class name and case insensitive filesystem */
public final class C57752ja {
    public final Context A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C31391fU A03;
    public final C65292wA A04;

    public C57752ja(Context context, C19830z4 r3, C18030ve r4, C31391fU r5, C65292wA r6) {
        C17960vV.A07(context);
        this.A00 = context.getApplicationContext();
        C17960vV.A07(r5);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void A00() {
        C31381fT r0;
        ActivityInfo activityInfo;
        boolean A032;
        Intent A0A = C17880vN.A0A();
        Context context = this.A00;
        A0A.setComponent(new ComponentName(context.getPackageName(), "com.facebook.phoneid.PhoneIdRequestReceiver"));
        PendingIntent A002 = C1408573i.A00(context, 0, A0A, 201326592);
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("auth", A002);
        if (C18020vd.A05(C18040vf.A01, this.A02, 3651)) {
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (AnonymousClass112.A05()) {
                i = 134217728;
            }
            Intent A0A2 = C17880vN.A0A();
            A0A2.setAction("com.facebook.GET_PHONE_ID");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(A0A2, 0);
            ArrayList A13 = AnonymousClass000.A13();
            String packageName = context.getPackageName();
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (!(next == null || (activityInfo = next.activityInfo) == null)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, i);
                        String str = packageInfo.packageName;
                        if (!str.equals(packageName) && (A032 || !C20013A3d.A02(context, str))) {
                            A13.add(new C52872bc(str, (A032 = C20070A5v.A03(packageInfo))));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("could not find package; packageName=");
                        A10.append(next.activityInfo.packageName);
                        C17900vP.A0X(e, " ", A10);
                    }
                }
            }
            boolean A012 = C20013A3d.A01(context);
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                C52872bc r1 = (C52872bc) it.next();
                String str2 = r1.A00;
                Intent A0A3 = C17880vN.A0A();
                A0A3.setAction("com.facebook.GET_PHONE_ID");
                A0A3.setPackage(str2);
                boolean z = r1.A01;
                if (z || !A012) {
                    r0 = this.A03;
                } else {
                    r0 = this.A04;
                }
                AnonymousClass264 r15 = new AnonymousClass264(r0);
                Bundle bundle = null;
                if (z) {
                    bundle = A0D;
                }
                context.sendOrderedBroadcast(A0A3, (String) null, r15, (Handler) null, 1, (String) null, bundle);
            }
            return;
        }
        Iterator it2 = C20013A3d.A00(context).iterator();
        while (it2.hasNext()) {
            String A0v = C17880vN.A0v(it2);
            Intent A0A4 = C17880vN.A0A();
            A0A4.setAction("com.facebook.GET_PHONE_ID");
            A0A4.setPackage(A0v);
            context.sendOrderedBroadcast(A0A4, (String) null, new AnonymousClass264(this.A03), (Handler) null, 1, (String) null, A0D);
        }
    }
}
