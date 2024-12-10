package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0DQ  reason: invalid class name */
public abstract class AnonymousClass0DQ {
    public static String A00(Context context, List list, boolean z) {
        ArrayList arrayList;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = AnonymousClass000.A13();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        List<String> list2 = arrayList;
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            list2 = arrayList;
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                list2 = arrayList2;
                if (list != null) {
                    arrayList2.addAll(list);
                    list2 = arrayList2;
                }
            }
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : list2) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }
}
