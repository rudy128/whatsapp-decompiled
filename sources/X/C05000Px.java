package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
public abstract class C05000Px {
    public static Resources A00;
    public static C04150Ma A01;
    public static List A02;

    public static void A04(Context context) {
        List A022 = A02(context);
        if (!A022.isEmpty()) {
            Object obj = A022.get(0);
            Object[] array = A022.subList(1, A022.size()).toArray(new String[(A022.size() - 1)]);
            Method method = AnonymousClass0GX.A01;
            Class cls = AnonymousClass0GX.A00;
            Object invoke = method.invoke(cls, new Object[0]);
            Field declaredField = cls.getDeclaredField("mResourceImpls");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            ArrayMap arrayMap2 = new ArrayMap(arrayMap.size());
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it);
                Object key = A16.getKey();
                Class cls2 = AnonymousClass0GJ.A00;
                if (((String) A01(cls2, key, "mResDir")).equals((Object) null)) {
                    A05(cls2, key, obj, "mResDir");
                    A05(cls2, key, array, "mSplitResDirs");
                    arrayMap2.put(key, A16.getValue());
                }
            }
            A05(cls, method.invoke(cls, new Object[0]), arrayMap2, "mResourceImpls");
        }
    }

    public static C04150Ma A00(Context context) {
        if (A01 == null) {
            List A022 = A02(context);
            C04150Ma r7 = new C04150Ma();
            A01 = r7;
            for (Object next : A022) {
                if (AnonymousClass000.A0M(C04150Ma.A02.invoke(r7.A00, new Object[]{next})) == 0) {
                    throw new RuntimeException("Unable to add resources.");
                }
            }
            C04150Ma.A03.invoke(r7.A00, new Object[0]);
        }
        return A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(android.content.Context r7) {
        /*
            java.util.List r6 = A02
            if (r6 != 0) goto L_0x00bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "/data/local/tmp/exopackage/"
            r1.append(r0)
            java.lang.String r0 = r7.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/resources"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            r3 = 0
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00b0 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00b0 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b0 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00b0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00ae }
        L_0x0035:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x00b8
            java.lang.String r0 = " "
            java.lang.String[] r7 = r4.split(r0)     // Catch:{ all -> 0x00ae }
            int r1 = r7.length     // Catch:{ all -> 0x00ae }
            r0 = 2
            java.lang.String r3 = ")"
            if (r1 != r0) goto L_0x0088
            r0 = 0
            r1 = r7[r0]     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "resources"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ae }
            r0 = 1
            r0 = r7[r0]     // Catch:{ all -> 0x00ae }
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = ".apk"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00ae }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ae }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00ae }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            r6.add(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0035
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "resources don't exist... ("
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = X.AnonymousClass001.A1H(r4, r3, r1)     // Catch:{ all -> 0x00ae }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ae }
            r1.<init>(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x00ad
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Bad metadata for resources... ("
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = X.AnonymousClass001.A1H(r4, r3, r1)     // Catch:{ all -> 0x00ae }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ae }
            r1.<init>(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x00ad
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Unrecognized resource type: ("
            r1.append(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = X.AnonymousClass001.A1H(r4, r3, r1)     // Catch:{ all -> 0x00ae }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ae }
            r1.<init>(r0)     // Catch:{ all -> 0x00ae }
        L_0x00ad:
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            goto L_0x00b2
        L_0x00b0:
            r0 = move-exception
            r2 = r3
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()
        L_0x00b7:
            throw r0
        L_0x00b8:
            r2.close()
            A02 = r6
        L_0x00bd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05000Px.A02(android.content.Context):java.util.List");
    }

    public static void A03(Context context) {
        Collection<Reference> collection;
        ApplicationInfo applicationInfo;
        try {
            Log.e("ResourcesLoader", "Updating more internals for ResourcesLoader.");
            int i = Build.VERSION.SDK_INT;
            List A022 = A02(context);
            if (!A022.isEmpty()) {
                if (i >= 24) {
                    Class<?> cls = Class.forName("android.webkit.WebViewFactory");
                    Method declaredMethod = cls.getDeclaredMethod("getWebViewContextAndSetProvider", new Class[0]);
                    declaredMethod.setAccessible(true);
                    applicationInfo = ((Context) declaredMethod.invoke(cls, new Object[0])).getApplicationInfo();
                } else {
                    Class<?> cls2 = Class.forName("android.webkit.WebViewFactory");
                    Method declaredMethod2 = cls2.getDeclaredMethod("getWebViewPackageName", new Class[0]);
                    declaredMethod2.setAccessible(true);
                    applicationInfo = context.getPackageManager().getPackageInfo((String) declaredMethod2.invoke(cls2, new Object[0]), 128).applicationInfo;
                }
                List singletonList = Collections.singletonList(applicationInfo.sourceDir);
                C04150Ma A002 = A00(context);
                for (Object next : singletonList) {
                    if (((Integer) C04150Ma.A01.invoke(A002.A00, new Object[]{next})).intValue() == 0) {
                        e = new RuntimeException("Unable to add resources.");
                        throw e;
                    }
                }
                C04150Ma.A03.invoke(A002.A00, new Object[0]);
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                String[] strArr = applicationInfo2.sharedLibraryFiles;
                if (strArr != null) {
                    linkedHashSet.addAll(Arrays.asList(strArr));
                }
                linkedHashSet.addAll(singletonList);
                applicationInfo2.sharedLibraryFiles = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                String str = (String) A022.get(0);
                Object[] objArr = new String[(A022.size() - 1)];
                for (int i2 = 1; i2 < A022.size(); i2++) {
                    objArr[i2 - 1] = A022.get(i2);
                }
                Object invoke = AnonymousClass0GW.A01.invoke((Object) null, new Object[0]);
                ArrayList A13 = AnonymousClass000.A13();
                int i3 = 0;
                String[] strArr2 = {"mPackages", "mResourcePackages"};
                do {
                    for (Reference reference : ((ArrayMap) A01(AnonymousClass0GW.A00, invoke, strArr2[i3])).values()) {
                        Object obj = reference.get();
                        if (obj != null) {
                            A13.add(new AnonymousClass0MY(obj));
                        }
                    }
                    i3++;
                } while (i3 < 2);
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    Object obj2 = ((AnonymousClass0MY) it.next()).A00;
                    Class cls3 = AnonymousClass0MY.A01;
                    if (((Context) A01(cls3, obj2, "mApplication")) == context) {
                        Field declaredField = cls3.getDeclaredField("mResDir");
                        declaredField.setAccessible(true);
                        declaredField.set(obj2, str);
                        Field declaredField2 = cls3.getDeclaredField("mSplitResDirs");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj2, objArr);
                    }
                }
            }
            if (i >= 24) {
                A04(context);
            }
            A00 = context.getPackageManager().getResourcesForApplication(context.getPackageName());
            C04150Ma A003 = A00(context);
            try {
                Method method = AnonymousClass0GX.A01;
                Class cls4 = AnonymousClass0GX.A00;
                Object invoke2 = method.invoke(cls4, new Object[0]);
                if (Build.VERSION.SDK_INT < 24) {
                    collection = ((ArrayMap) A01(cls4, invoke2, "mActiveResources")).values();
                } else {
                    collection = (Collection) A01(cls4, invoke2, "mResourceReferences");
                }
                if (collection == null) {
                    try {
                        collection = ((HashMap) A01(AnonymousClass0GW.A00, AnonymousClass0GW.A01.invoke((Object) null, new Object[0]), "mActiveResources")).values();
                    } catch (Exception e) {
                        e = new RuntimeException(e);
                    }
                }
                for (Reference reference2 : collection) {
                    Resources resources = (Resources) reference2.get();
                    if (resources != null) {
                        AssetManager assetManager = A003.A00;
                        try {
                            A05(Resources.class, resources, assetManager, "mAssets");
                        } catch (NoSuchFieldException unused) {
                            Object A012 = A01(Resources.class, resources, "mResourcesImpl");
                            A05(A012.getClass(), A012, assetManager, "mAssets");
                        }
                        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
            } catch (Exception e3) {
                e = new RuntimeException(e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public static Object A01(Class cls, Object obj, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static void A05(Class cls, Object obj, Object obj2, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
