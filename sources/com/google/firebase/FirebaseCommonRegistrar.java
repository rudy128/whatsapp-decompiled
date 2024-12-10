package com.google.firebase;

import X.C18220vy;
import X.C18330wD;
import X.C18340wE;
import X.C18350wG;
import X.C18490wW;
import X.C18500wX;
import X.C18510wa;
import X.C18520wb;
import X.C18530wc;
import X.C18660ww;
import X.C18670wy;
import X.C18680wz;
import X.C65512wc;
import X.C65522wd;
import X.C65532we;
import X.C65662wu;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static C18330wD A00(C18670wy r5, String str) {
        C18340wE r4 = new C18340wE(C18530wc.class, new Class[0]);
        r4.A01 = 1;
        r4.A01(new C18490wW(Context.class, 1, 0));
        r4.A02 = new C65532we(0, str, r5);
        return r4.A00();
    }

    public List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Class<C18660ww> cls = C18660ww.class;
        C18340wE r5 = new C18340wE((Class) cls, new Class[0]);
        r5.A01(new C18490wW(C18530wc.class, 2, 0));
        r5.A02 = new C65512wc(7);
        arrayList.add(r5.A00());
        C18350wG r6 = new C18350wG(Background.class, Executor.class);
        Class<C18500wX> cls2 = C18500wX.class;
        C18340wE r52 = new C18340wE((Class) cls2, cls2, cls2);
        r52.A01(new C18490wW(Context.class, 1, 0));
        r52.A01(new C18490wW(C18220vy.class, 1, 0));
        r52.A01(new C18490wW(C18510wa.class, 2, 0));
        r52.A01(new C18490wW((Class) cls, 1, 1));
        r52.A01(new C18490wW(r6, 1, 0));
        r52.A02 = new C65522wd(r6, 2);
        arrayList.add(r52.A00());
        arrayList.add(C18520wb.A00("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C18520wb.A00("fire-core", "20.4.2"));
        arrayList.add(C18520wb.A00("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        arrayList.add(C18520wb.A00("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        arrayList.add(C18520wb.A00("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        arrayList.add(A00(new C65662wu(0), "android-target-sdk"));
        arrayList.add(A00(new C65662wu(1), "android-min-sdk"));
        arrayList.add(A00(new C65662wu(2), "android-platform"));
        arrayList.add(A00(new C65662wu(3), "android-installer"));
        try {
            str = C18680wz.A00.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(C18520wb.A00("kotlin", str));
        }
        return arrayList;
    }

    public static /* synthetic */ String A01(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        return String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String A02(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (Build.VERSION.SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }
}
