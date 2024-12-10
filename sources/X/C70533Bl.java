package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Bl  reason: invalid class name and case insensitive filesystem */
public final class C70533Bl implements Iterable {
    public final Context A00;
    public final ArrayList A01 = AnonymousClass000.A13();

    public void A01() {
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.A00.startActivities(intentArr, (Bundle) null);
            return;
        }
        throw AnonymousClass000.A0n("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public static C70533Bl A00(Context context) {
        return new C70533Bl(context);
    }

    public void A02(Activity activity) {
        Intent intent;
        Intent intent2;
        Intent component;
        if (((activity instanceof AnonymousClass1FM) && (intent = AnonymousClass1HK.A00((Activity) ((AnonymousClass1FM) activity))) != null) || (intent = AnonymousClass1HK.A00(activity)) != null) {
            ComponentName component2 = intent.getComponent();
            if (component2 == null) {
                component2 = intent.resolveActivity(this.A00.getPackageManager());
            }
            ArrayList arrayList = this.A01;
            int size = arrayList.size();
            try {
                Context context = this.A00;
                String A02 = AnonymousClass1HK.A02(component2, context);
                if (A02 != null) {
                    ComponentName componentName = new ComponentName(component2.getPackageName(), A02);
                    if (AnonymousClass1HK.A02(componentName, context) == null) {
                        intent2 = Intent.makeMainActivity(componentName);
                    } else {
                        intent2 = C17880vN.A0A().setComponent(componentName);
                    }
                    while (intent2 != null) {
                        arrayList.add(size, intent2);
                        ComponentName component3 = intent2.getComponent();
                        String A022 = AnonymousClass1HK.A02(component3, context);
                        if (A022 == null) {
                            break;
                        }
                        ComponentName componentName2 = new ComponentName(component3.getPackageName(), A022);
                        if (AnonymousClass1HK.A02(componentName2, context) == null) {
                            component = Intent.makeMainActivity(componentName2);
                        } else {
                            component = C17880vN.A0A().setComponent(componentName2);
                        }
                    }
                }
                arrayList.add(intent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Deprecated
    public Iterator iterator() {
        return this.A01.iterator();
    }

    public C70533Bl(Context context) {
        this.A00 = context;
    }
}
