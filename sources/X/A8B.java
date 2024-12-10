package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class A8B {
    public final C197729xA A00;
    public final BA8 A01;

    public static String A03(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("intent(");
        A10.append("action = ");
        A10.append(intent.getAction());
        A10.append(", data= ");
        A10.append(intent.getData());
        A10.append(", type= ");
        A10.append(intent.getType());
        if (intent.getComponent() != null) {
            A10.append(", component = ");
            A10.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            A10.append(", extras = [");
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                A10.append(A0v);
                A10.append(" = ");
                A10.append(extras.get(A0v));
                A10.append(", ");
            }
            A10.append("]");
        }
        return AnonymousClass8BU.A0q(A10);
    }

    public static void A06(Intent intent, PackageItemInfo packageItemInfo) {
        intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
    }

    public Intent A08(Context context, Intent intent) {
        if (this instanceof AnonymousClass8Qh) {
            AnonymousClass8Qh r1 = (AnonymousClass8Qh) this;
            C196399uz.A01(context, intent, r1.A01);
            if (!A07(context, intent)) {
                return AnonymousClass8Qh.A00(context, intent, r1, A04(context, intent, 65600));
            }
            return intent;
        } else if (this instanceof AnonymousClass8Qj) {
            return AnonymousClass8Qj.A00(context, intent, (AnonymousClass8Qj) this, A04(context, intent, 65600));
        } else {
            if (this instanceof AnonymousClass8Qg) {
                AnonymousClass8Qg r2 = (AnonymousClass8Qg) this;
                if (A07(context, intent)) {
                    return null;
                }
                List A04 = A04(context, intent, 65600);
                if (A04.isEmpty()) {
                    A04 = A04(context, intent, 0);
                }
                return AnonymousClass8Qg.A00(context, intent, r2, A04);
            } else if (this instanceof AnonymousClass8Qf) {
                BA8 ba8 = this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Any_UNSAFE scope used for launching activity: ");
                ba8.CFI("AnyIntentScope", AnonymousClass000.A0y(A03(intent), A10), (Throwable) null);
                return intent;
            } else {
                AnonymousClass8Qi r5 = (AnonymousClass8Qi) this;
                List A042 = A04(context, intent, 65600);
                if (!A042.isEmpty() || !intent.hasExtra("expect_activity_not_found")) {
                    Iterator it = A042.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = (ActivityInfo) it.next();
                        if (!AnonymousClass8Qi.A01(context, activityInfo, r5, activityInfo.permission)) {
                            it.remove();
                            z = true;
                        }
                    }
                    return AnonymousClass8Qi.A00(intent, r5, A042, z);
                }
                BA8 ba82 = r5.A01;
                synchronized (r5.A00) {
                }
                C180889Oi.A00(intent, ba82);
                return intent;
            }
        }
    }

    public Intent A09(Context context, Intent intent) {
        if (this instanceof AnonymousClass8Qh) {
            AnonymousClass8Qh r1 = (AnonymousClass8Qh) this;
            C196399uz.A01(context, intent, r1.A01);
            if (!A07(context, intent)) {
                return AnonymousClass8Qh.A00(context, intent, r1, A05(context, intent, 65600));
            }
            return intent;
        } else if (this instanceof AnonymousClass8Qj) {
            return AnonymousClass8Qj.A00(context, intent, (AnonymousClass8Qj) this, A05(context, intent, 65600));
        } else {
            if (this instanceof AnonymousClass8Qg) {
                AnonymousClass8Qg r2 = (AnonymousClass8Qg) this;
                if (A07(context, intent)) {
                    return null;
                }
                List A05 = A05(context, intent, 65600);
                if (A05.isEmpty()) {
                    A05 = r2.A0A(context, intent);
                }
                return AnonymousClass8Qg.A00(context, intent, r2, A05);
            } else if (this instanceof AnonymousClass8Qf) {
                BA8 ba8 = this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Any_UNSAFE scope used for launching service: ");
                ba8.CFI("AnyIntentScope", AnonymousClass000.A0y(A03(intent), A10), (Throwable) null);
                return intent;
            } else {
                AnonymousClass8Qi r5 = (AnonymousClass8Qi) this;
                List A052 = A05(context, intent, 65600);
                Iterator it = A052.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = (ServiceInfo) it.next();
                    if (!AnonymousClass8Qi.A01(context, serviceInfo, r5, serviceInfo.permission)) {
                        it.remove();
                        z = true;
                    }
                }
                return AnonymousClass8Qi.A00(intent, r5, A052, z);
            }
        }
    }

    public List A0A(Context context, Intent intent) {
        return A05(context, intent, 268435456);
    }

    public boolean A0B() {
        if ((this instanceof AnonymousClass8Qh) || (this instanceof AnonymousClass8Qj)) {
            return true;
        }
        boolean z = this instanceof AnonymousClass8Ql;
        return false;
    }

    public boolean A0C() {
        Integer num;
        C197729xA r2 = this.A00;
        synchronized (r2) {
            num = r2.A00;
        }
        return AnonymousClass000.A1Z(num, AnonymousClass00R.A0N);
    }

    public A8B(C197729xA r1, BA8 ba8) {
        this.A00 = r1;
        this.A01 = ba8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A02(java.util.List r5) {
        /*
            int r0 = X.AnonymousClass3MX.A01(r5)
            android.content.Intent[] r4 = new android.content.Intent[r0]
            r3 = 0
            r2 = 0
        L_0x0008:
            int r0 = X.AnonymousClass3MX.A01(r5)
            if (r2 >= r0) goto L_0x0018
            int r1 = r2 + 1
            java.lang.Object r0 = r5.get(r1)
            r4[r2] = r0
            r2 = r1
            goto L_0x0008
        L_0x0018:
            java.lang.Object r1 = r5.get(r3)
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r0 = "Choose an app to launch."
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r0)
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r1.putExtra(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8B.A02(java.util.List):android.content.Intent");
    }

    public static List A04(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentActivities;
        C18070vi.A0h(context, intent);
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of((long) i));
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, i);
        }
        C18070vi.A0b(queryIntentActivities);
        if (queryIntentActivities == null) {
            return Collections.emptyList();
        }
        ArrayList A0z = AnonymousClass8BT.A0z();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!(activityInfo == null || activityInfo.applicationInfo == null)) {
                A0z.add(activityInfo);
            }
        }
        return A0z;
    }

    public static List A05(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentServices;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            queryIntentServices = packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of((long) i));
        } else {
            queryIntentServices = packageManager.queryIntentServices(intent, i);
        }
        C18070vi.A0b(queryIntentServices);
        if (queryIntentServices == null) {
            return Collections.emptyList();
        }
        ArrayList A0z = AnonymousClass8BT.A0z();
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (!(serviceInfo == null || serviceInfo.applicationInfo == null)) {
                A0z.add(serviceInfo);
            }
        }
        return A0z;
    }

    public static boolean A07(Context context, Intent intent) {
        String str;
        ComponentName component = intent.getComponent();
        if ((component == null || (str = component.getPackageName()) == null) && (str = intent.getPackage()) == null) {
            return false;
        }
        if (context != null) {
            return str.equals(context.getPackageName());
        }
        throw AnonymousClass000.A0k("context is null, did your Fragment destroy activity already?");
    }
}
