package X;

import android.content.Intent;
import android.graphics.Color;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A72 {
    public static final Set A02 = C200410p.A0S(new C21339AiQ[]{C25473CgS.A0l, C25473CgS.A0m, C25473CgS.A0n});
    public final C18030ve A00;
    public final C34501ka A01;

    public static final ArrayList A01(Intent intent) {
        if (!intent.hasExtra("tappable_areas")) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tappable_areas");
        JSONArray jSONArray = new JSONArray(stringArrayListExtra);
        if (stringArrayListExtra != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                AnonymousClass8BR.A1I(obj);
                JSONObject A16 = C17880vN.A16((String) obj);
                JSONArray jSONArray2 = A16.getJSONArray("xPoints");
                ArrayList A0t = C108965cb.A0t(jSONArray2);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    Object obj2 = jSONArray2.get(i2);
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Double");
                    A0t.add(obj2);
                }
                JSONArray jSONArray3 = A16.getJSONArray("yPoints");
                ArrayList A0t2 = C108965cb.A0t(jSONArray3);
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    Object obj3 = jSONArray3.get(i3);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Double");
                    A0t2.add(obj3);
                }
                A13.add(new AnonymousClass774(A16.getString("attributionUrl"), A0t, A0t2));
            }
        }
        return A13;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.BA8] */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.B6p] */
    /* JADX WARNING: type inference failed for: r0v73 */
    /* JADX WARNING: type inference failed for: r0v74 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r3 = (android.app.Activity) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1 = new X.C21588Amc(X.AnonymousClass001.A1I("Unable to get packageInfo for uid ", X.AnonymousClass000.A10(), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0175, code lost:
        if (r1 == false) goto L_0x0177;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00ca */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed A[Catch:{ SecurityException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[Catch:{ SecurityException -> 0x024b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(android.content.Context r10, android.content.Intent r11, X.A72 r12) {
        /*
            X.0ve r2 = r12.A00
            r1 = 12107(0x2f4b, float:1.6966E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0254
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.HashMap r7 = X.C17880vN.A11()
            java.util.Set r1 = A02
            java.lang.String r0 = "com.instagram.android"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r0)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.util.Iterator r2 = r1.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r6)
            r3.put(r1, r0)
            goto L_0x0030
        L_0x0042:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r3)
            X.A2W r2 = new X.A2W
            r2.<init>(r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x024d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x005c
            X.A2W r2 = new X.A2W
            r2.<init>(r7)
        L_0x005c:
            X.A5J r3 = X.C196399uz.A00(r10, r11)     // Catch:{ SecurityException -> 0x024b }
            if (r3 == 0) goto L_0x0077
            int r1 = android.os.Binder.getCallingPid()     // Catch:{ SecurityException -> 0x024b }
            int r0 = android.os.Process.myPid()     // Catch:{ SecurityException -> 0x024b }
            if (r1 == r0) goto L_0x00df
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ SecurityException -> 0x024b }
            int r0 = r3.A00     // Catch:{ SecurityException -> 0x024b }
            if (r1 == r0) goto L_0x00df
            android.os.Binder.getCallingUid()     // Catch:{ SecurityException -> 0x024b }
        L_0x0077:
            boolean r0 = r10 instanceof android.app.Activity     // Catch:{ SecurityException -> 0x024b }
            if (r0 == 0) goto L_0x0090
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r1 = r3.getCallingPackage()     // Catch:{ SecurityException -> 0x024b }
            if (r1 != 0) goto L_0x00da
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x024b }
            r0 = 34
            if (r1 < r0) goto L_0x0090
            java.lang.String r1 = r3.getLaunchedFromPackage()     // Catch:{ SecurityException -> 0x024b }
            if (r1 != 0) goto L_0x00da
        L_0x0090:
            int r1 = android.os.Binder.getCallingPid()     // Catch:{ SecurityException -> 0x024b }
            int r0 = android.os.Process.myPid()     // Catch:{ SecurityException -> 0x024b }
            if (r1 != r0) goto L_0x00a2
            java.lang.String r0 = "Invalid Caller Identity (null)"
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x024b }
        L_0x00a1:
            throw r1     // Catch:{ SecurityException -> 0x024b }
        L_0x00a2:
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ SecurityException -> 0x024b }
            r6 = 1
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ca }
            java.lang.String[] r1 = r0.getPackagesForUid(r3)     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r1 == 0) goto L_0x00c2
            int r0 = r1.length     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r0 == 0) goto L_0x00c2
            r0 = 0
            r1 = r1[r0]     // Catch:{ NameNotFoundException -> 0x00ca }
            r0 = 64
            X.9oY r0 = X.C180919Ol.A00(r10, r1, r0)     // Catch:{ NameNotFoundException -> 0x00ca }
            X.A5J r3 = X.A5J.A01(r0, r6)     // Catch:{ NameNotFoundException -> 0x00ca }
            goto L_0x00df
        L_0x00c2:
            java.lang.String r1 = "Unable to get package names for uid $uid"
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x00ca }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x00ca }
            throw r0     // Catch:{ NameNotFoundException -> 0x00ca }
        L_0x00ca:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "Unable to get packageInfo for uid "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ SecurityException -> 0x024b }
            X.Amc r1 = new X.Amc     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x00da:
            r0 = 1
            X.A5J r3 = X.A5J.A00(r10, r1, r0)     // Catch:{ SecurityException -> 0x024b }
        L_0x00df:
            boolean r0 = r4.isEmpty()     // Catch:{ SecurityException -> 0x024b }
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = r3.A01     // Catch:{ SecurityException -> 0x024b }
            boolean r0 = r4.contains(r0)     // Catch:{ SecurityException -> 0x024b }
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "Missing required Caller Domains "
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            r1.append(r4)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = " from caller "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ SecurityException -> 0x024b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x0105:
            X.9xz r1 = X.C198219xz.A03     // Catch:{ SecurityException -> 0x024b }
            if (r1 != 0) goto L_0x011c
            java.lang.Class<X.9xz> r0 = X.C198219xz.class
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x024b }
            X.9xz r1 = X.C198219xz.A03     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x0117
            X.9xz r1 = new X.9xz     // Catch:{ all -> 0x0119 }
            r1.<init>(r10)     // Catch:{ all -> 0x0119 }
            X.C198219xz.A03 = r1     // Catch:{ all -> 0x0119 }
        L_0x0117:
            monitor-exit(r0)     // Catch:{ all -> 0x0119 }
            goto L_0x011c
        L_0x0119:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0119 }
            goto L_0x00a1
        L_0x011c:
            java.lang.String r9 = r10.getPackageName()     // Catch:{ SecurityException -> 0x024b }
            r6 = 0
            android.content.Context r8 = r1.A00     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = r8.getPackageName()     // Catch:{ SecurityException -> 0x024b }
            boolean r0 = r0.equals(r9)     // Catch:{ SecurityException -> 0x024b }
            if (r0 == 0) goto L_0x0154
            java.util.concurrent.atomic.AtomicReference r7 = r1.A02     // Catch:{ SecurityException -> 0x024b }
            java.lang.Object r4 = r7.get()     // Catch:{ SecurityException -> 0x024b }
            X.9Uc r4 = (X.C182369Uc) r4     // Catch:{ SecurityException -> 0x024b }
            if (r4 != 0) goto L_0x0149
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A01     // Catch:{ SecurityException -> 0x024b }
            int r1 = r0.getAndIncrement()     // Catch:{ SecurityException -> 0x024b }
            X.A5J r0 = X.A5J.A00(r8, r9, r6)     // Catch:{ SecurityException -> 0x024b }
            X.9Uc r4 = new X.9Uc     // Catch:{ SecurityException -> 0x024b }
            r4.<init>(r0, r1)     // Catch:{ SecurityException -> 0x024b }
            r7.set(r4)     // Catch:{ SecurityException -> 0x024b }
        L_0x0149:
            X.A5J r0 = r4.A00     // Catch:{ SecurityException -> 0x024b }
            java.util.List r1 = r0.A04     // Catch:{ SecurityException -> 0x024b }
            boolean r0 = r1.isEmpty()     // Catch:{ SecurityException -> 0x024b }
            if (r0 == 0) goto L_0x0166
            goto L_0x0164
        L_0x0154:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A01     // Catch:{ SecurityException -> 0x024b }
            int r1 = r0.getAndIncrement()     // Catch:{ SecurityException -> 0x024b }
            X.A5J r0 = X.A5J.A00(r8, r9, r6)     // Catch:{ SecurityException -> 0x024b }
            X.9Uc r4 = new X.9Uc     // Catch:{ SecurityException -> 0x024b }
            r4.<init>(r0, r1)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x0149
        L_0x0164:
            r1 = 0
            goto L_0x016c
        L_0x0166:
            java.lang.Object r1 = X.C108955ca.A0p(r1)     // Catch:{ SecurityException -> 0x024b }
            X.AiQ r1 = (X.C21339AiQ) r1     // Catch:{ SecurityException -> 0x024b }
        L_0x016c:
            java.util.Set r0 = X.BVL.A0b     // Catch:{ SecurityException -> 0x024b }
            if (r1 == 0) goto L_0x0177
            boolean r1 = r0.contains(r1)     // Catch:{ SecurityException -> 0x024b }
            r0 = 1
            if (r1 != 0) goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            boolean r0 = r2.A02(r3, r0)     // Catch:{ SecurityException -> 0x024b }
            if (r0 == 0) goto L_0x022e
            boolean r0 = r5.isEmpty()     // Catch:{ SecurityException -> 0x024b }
            if (r0 != 0) goto L_0x0247
            java.lang.Class<X.9jw> r4 = X.C189839jw.class
            monitor-enter(r4)     // Catch:{ SecurityException -> 0x024b }
            X.AIu r2 = new X.AIu     // Catch:{ all -> 0x022a }
            r2.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x022a }
            X.AiQ r1 = X.C20084A6l.A02(r10, r0)     // Catch:{ all -> 0x022a }
            java.util.Set r0 = X.BVL.A0b     // Catch:{ all -> 0x022a }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x01a7
            X.AJ0 r0 = new X.AJ0     // Catch:{ all -> 0x022a }
            r0.<init>()     // Catch:{ all -> 0x022a }
        L_0x01a1:
            X.9jw r8 = new X.9jw     // Catch:{ all -> 0x022a }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x022a }
            goto L_0x01ad
        L_0x01a7:
            X.AIz r0 = new X.AIz     // Catch:{ all -> 0x022a }
            r0.<init>()     // Catch:{ all -> 0x022a }
            goto L_0x01a1
        L_0x01ad:
            monitor-exit(r4)     // Catch:{ SecurityException -> 0x024b }
            int r1 = r5.size()     // Catch:{ SecurityException -> 0x024b }
            r0 = 1
            if (r1 != r0) goto L_0x01d8
            java.lang.String r4 = X.C108945cZ.A1H(r5, r6)     // Catch:{ SecurityException -> 0x024b }
            r8.A00(r10, r3, r4)     // Catch:{ AmZ -> 0x01be }
            goto L_0x0247
        L_0x01be:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "Missing or unable to evaluate FbPermission '"
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            r1.append(r4)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "' from caller "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ SecurityException -> 0x024b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0, r2)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x01d8:
            java.util.Iterator r7 = r5.iterator()     // Catch:{ SecurityException -> 0x024b }
        L_0x01dc:
            boolean r0 = r7.hasNext()     // Catch:{ SecurityException -> 0x024b }
            if (r0 == 0) goto L_0x0211
            java.lang.String r6 = X.C17880vN.A0v(r7)     // Catch:{ SecurityException -> 0x024b }
            r8.A00(r10, r3, r6)     // Catch:{ AmZ -> 0x01ea }
            goto L_0x0247
        L_0x01ea:
            r4 = move-exception
            X.BA8 r2 = r8.A00     // Catch:{ SecurityException -> 0x024b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "FBPermission '"
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            r1.append(r6)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "' was not granted to package '"
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = r3.A02()     // Catch:{ SecurityException -> 0x024b }
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "'"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "FbPermission"
            r2.CFI(r0, r1, r4)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x01dc
        L_0x0211:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "Missing at least one required FBPermission (of multiple defined) "
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            r1.append(r5)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = " from caller "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ SecurityException -> 0x024b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x022a:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x022e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "Caller Identity '"
            r1.append(r0)     // Catch:{ SecurityException -> 0x024b }
            r1.append(r3)     // Catch:{ SecurityException -> 0x024b }
            java.lang.String r0 = "' is not trusted"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ SecurityException -> 0x024b }
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x024b }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x024b }
            goto L_0x00a1
        L_0x0247:
            r5.isEmpty()     // Catch:{ SecurityException -> 0x024b }
            goto L_0x0254
        L_0x024b:
            r0 = 0
            return r0
        L_0x024d:
            java.lang.String r0 = "TrustedCaller needs to be configured with either a TrustedApp or list of trusted packages"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0254:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A72.A02(android.content.Context, android.content.Intent, X.A72):boolean");
    }

    public A72(C18030ve r1, C34501ka r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final Integer A00(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e) {
            Log.e("StatusApiHelper/parseColor/failed to parse color", e);
            return null;
        }
    }
}
