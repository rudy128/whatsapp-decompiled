package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AJ0 implements C22410B6p {
    public void BCd(Context context, String str, String str2) {
        ArrayList arrayList;
        ApplicationInfo applicationInfo;
        List emptyList = Collections.emptyList();
        try {
            C18070vi.A0d(str, 1);
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128));
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            C18070vi.A0b(applicationInfo);
            Bundle bundle = applicationInfo.metaData;
            arrayList = emptyList;
            if (bundle != null) {
                arrayList = emptyList;
                if (bundle.size() > 0) {
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        if (A0v.contains(".fbpermission.")) {
                            A13.add(A0v);
                        }
                    }
                    arrayList = A13;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            arrayList = Collections.emptyList();
        }
        if (!arrayList.contains(str2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Caller '");
            A10.append(str);
            A10.append("' has not declared the FbPermission: '");
            A10.append(str2);
            throw new C21585AmZ(AnonymousClass000.A0y("' in its AndroidManifest.xml", A10));
        }
    }
}
