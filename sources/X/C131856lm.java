package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6lm  reason: invalid class name and case insensitive filesystem */
public abstract class C131856lm {
    public final AnonymousClass1LU A00;

    public final boolean A00(Context context, Uri uri, Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("package_names");
        if (stringArrayList == null || uri == null) {
            return false;
        }
        Intent A07 = AnonymousClass3MY.A07(uri);
        A07.addFlags(268435456);
        A07.setData(uri);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A07, 65536);
            C18070vi.A0X(queryIntentActivities);
            if (!(queryIntentActivities instanceof Collection) || !queryIntentActivities.isEmpty()) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        String str = activityInfo.packageName;
                        if (stringArrayList.contains(str)) {
                            C18070vi.A0b(str);
                            C18070vi.A0d(str, 3);
                            Intent intent = new Intent(A07);
                            intent.setComponent(new ComponentName(str, activityInfo.name));
                            try {
                                C180869Og.A00(context, intent);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return false;
    }

    public C131856lm(AnonymousClass1LU r1) {
        this.A00 = r1;
    }
}
