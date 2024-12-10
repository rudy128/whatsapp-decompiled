package X;

import android.content.Context;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0vy  reason: invalid class name and case insensitive filesystem */
public class C18220vy {
    public static final Object A0A = new Object();
    public static final Map A0B = new AnonymousClass00O(0);
    public final Context A00;
    public final C18230vz A01;
    public final C18410wM A02;
    public final C18320wC A03;
    public final C18290w6 A04;
    public final String A05;
    public final List A06 = new CopyOnWriteArrayList();
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final List A08 = new CopyOnWriteArrayList();
    public final AtomicBoolean A09 = new AtomicBoolean();

    public static C18220vy A00() {
        C18220vy r1;
        synchronized (A0A) {
            r1 = (C18220vy) A0B.get("[DEFAULT]");
            if (r1 != null) {
                ((C18500wX) r1.A04.get()).A01();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(AnonymousClass2WK.A00());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C18220vy A01(android.content.Context r15) {
        /*
            java.lang.Object r6 = A0A
            monitor-enter(r6)
            java.util.Map r3 = A0B     // Catch:{ all -> 0x0111 }
            java.lang.String r4 = "[DEFAULT]"
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0014
            X.0vy r0 = A00()     // Catch:{ all -> 0x0111 }
        L_0x0011:
            monitor-exit(r6)     // Catch:{ all -> 0x0111 }
            goto L_0x0109
        L_0x0014:
            X.C18210vx.A00(r15)     // Catch:{ all -> 0x0111 }
            android.content.res.Resources r2 = r15.getResources()     // Catch:{ all -> 0x0111 }
            r0 = 2131898796(0x7f1231ac, float:1.943252E38)
            java.lang.String r5 = r2.getResourcePackageName(r0)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = "google_app_id"
            java.lang.String r1 = "string"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x002f
            r8 = 0
            goto L_0x0033
        L_0x002f:
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x0033:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "FirebaseApp"
            java.lang.String r0 = "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0111 }
            monitor-exit(r6)     // Catch:{ all -> 0x0111 }
            goto L_0x010a
        L_0x0043:
            java.lang.String r0 = "google_api_key"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x004d
            r9 = 0
            goto L_0x0051
        L_0x004d:
            java.lang.String r9 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x0051:
            java.lang.String r0 = "firebase_database_url"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x005b
            r10 = 0
            goto L_0x005f
        L_0x005b:
            java.lang.String r10 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x005f:
            java.lang.String r0 = "ga_trackingId"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0069
            r11 = 0
            goto L_0x006d
        L_0x0069:
            java.lang.String r11 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x006d:
            java.lang.String r0 = "gcm_defaultSenderId"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0077
            r12 = 0
            goto L_0x007b
        L_0x0077:
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x007b:
            java.lang.String r0 = "google_storage_bucket"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0085
            r13 = 0
            goto L_0x0089
        L_0x0085:
            java.lang.String r13 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x0089:
            java.lang.String r0 = "project_id"
            int r0 = r2.getIdentifier(r0, r1, r5)     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x0093
            r14 = 0
            goto L_0x0097
        L_0x0093:
            java.lang.String r14 = r2.getString(r0)     // Catch:{ all -> 0x0111 }
        L_0x0097:
            X.0vz r7 = new X.0vz     // Catch:{ all -> 0x0111 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0111 }
            android.content.Context r0 = r15.getApplicationContext()     // Catch:{ all -> 0x0111 }
            boolean r0 = r0 instanceof android.app.Application     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00ca
            android.content.Context r5 = r15.getApplicationContext()     // Catch:{ all -> 0x0111 }
            android.app.Application r5 = (android.app.Application) r5     // Catch:{ all -> 0x0111 }
            java.util.concurrent.atomic.AtomicReference r1 = X.C18250w1.A00     // Catch:{ all -> 0x0111 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x00ca
            X.0w1 r2 = new X.0w1     // Catch:{ all -> 0x0111 }
            r2.<init>()     // Catch:{ all -> 0x0111 }
            r0 = 0
            boolean r0 = X.AnonymousClass00N.A00(r0, r2, r1)     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00ca
            X.C18260w2.A00(r5)     // Catch:{ all -> 0x0111 }
            X.0w2 r1 = X.C18260w2.A04     // Catch:{ all -> 0x0111 }
            monitor-enter(r1)     // Catch:{ all -> 0x0111 }
            java.util.ArrayList r0 = r1.A01     // Catch:{ all -> 0x010c }
            r0.add(r2)     // Catch:{ all -> 0x010c }
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
        L_0x00ca:
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0111 }
            android.content.Context r0 = r15.getApplicationContext()     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x00d8
            android.content.Context r15 = r15.getApplicationContext()     // Catch:{ all -> 0x0111 }
        L_0x00d8:
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x010f }
            r2 = r0 ^ 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010f }
            r1.<init>()     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "FirebaseApp name "
            r1.append(r0)     // Catch:{ all -> 0x010f }
            r1.append(r4)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = " already exists!"
            r1.append(r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010f }
            X.C18210vx.A08(r2, r0)     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "Application context cannot be null."
            X.C18210vx.A02(r15, r0)     // Catch:{ all -> 0x010f }
            X.0vy r0 = new X.0vy     // Catch:{ all -> 0x010f }
            r0.<init>(r15, r7, r4)     // Catch:{ all -> 0x010f }
            r3.put(r4, r0)     // Catch:{ all -> 0x010f }
            A03(r0)     // Catch:{ all -> 0x0111 }
            goto L_0x0011
        L_0x0109:
            return r0
        L_0x010a:
            r0 = 0
            return r0
        L_0x010c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            goto L_0x0110
        L_0x010f:
            r0 = move-exception
        L_0x0110:
            throw r0     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0111 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220vy.A01(android.content.Context):X.0vy");
    }

    public static void A02(C18220vy r1) {
        C18210vx.A08(!r1.A09.get(), "FirebaseApp was deleted");
    }

    public static void A03(C18220vy r5) {
        HashMap hashMap;
        Context context = r5.A00;
        if (!C18380wJ.A00(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            A02(r5);
            sb.append(r5.A05);
            Log.i("FirebaseApp", sb.toString());
            C451026c.A00(context);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        A02(r5);
        String str = r5.A05;
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        C18410wM r4 = r5.A02;
        A02(r5);
        boolean equals = "[DEFAULT]".equals(str);
        if (AnonymousClass00N.A00((Object) null, Boolean.valueOf(equals), r4.A06)) {
            synchronized (r4) {
                hashMap = new HashMap(r4.A03);
            }
            C18410wM.A00(r4, hashMap, equals);
        }
        ((C18500wX) r5.A04.get()).A01();
    }

    public String A04() {
        StringBuilder sb = new StringBuilder();
        A02(this);
        sb.append(C19630ye.A00(this.A05.getBytes(Charset.defaultCharset())));
        sb.append("+");
        A02(this);
        sb.append(C19630ye.A00(this.A01.A01.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18220vy)) {
            return false;
        }
        String str = this.A05;
        C18220vy r3 = (C18220vy) obj;
        A02(r3);
        return str.equals(r3.A05);
    }

    public int hashCode() {
        return this.A05.hashCode();
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A05, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        cyh.A00(this.A01, "options");
        return cyh.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.0wI, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bd A[LOOP:1: B:23:0x00b7->B:25:0x00bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18220vy(android.content.Context r10, X.C18230vz r11, java.lang.String r12) {
        /*
            r9 = this;
            r9.<init>()
            r5 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r9.A07 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r9.A09 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r9.A06 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r9.A08 = r0
            X.C18210vx.A00(r10)
            r9.A00 = r10
            X.C18210vx.A03(r12)
            r9.A05 = r12
            r9.A01 = r11
            X.0vv r2 = com.google.firebase.provider.FirebaseInitProvider.startupTime
            java.lang.String r0 = "Firebase"
            android.os.Trace.beginSection(r0)
            java.lang.String r3 = "ComponentDiscovery"
            android.os.Trace.beginSection(r3)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r6 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.content.pm.PackageManager r4 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00a5 }
            if (r4 != 0) goto L_0x004b
            java.lang.String r0 = "Context has no PackageManager."
        L_0x0047:
            android.util.Log.w(r3, r0)     // Catch:{ NameNotFoundException -> 0x00a5 }
            goto L_0x00aa
        L_0x004b:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00a5 }
            r1.<init>(r10, r6)     // Catch:{ NameNotFoundException -> 0x00a5 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r4.getServiceInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00a5 }
            if (r0 != 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00a5 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x00a5 }
            r1.append(r6)     // Catch:{ NameNotFoundException -> 0x00a5 }
            java.lang.String r0 = " has no service info."
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x00a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x00a5 }
            goto L_0x0047
        L_0x006a:
            android.os.Bundle r6 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00a5 }
            if (r6 == 0) goto L_0x00aa
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x007b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r6.get(r3)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x007b
            r0 = 31
            java.lang.String r0 = r3.substring(r0)
            r4.add(r0)
            goto L_0x007b
        L_0x00a5:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r3, r0)
        L_0x00aa:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r3, r0)
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x00b3:
            java.util.Iterator r3 = r4.iterator()
        L_0x00b7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0w7 r0 = new X.0w7
            r0.<init>(r1)
            r8.add(r0)
            goto L_0x00b7
        L_0x00cc:
            android.os.Trace.endSection()
            java.lang.String r0 = "Runtime"
            android.os.Trace.beginSection(r0)
            X.0w8 r7 = X.C18310w8.A02
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.addAll(r8)
            com.google.firebase.FirebaseCommonRegistrar r1 = new com.google.firebase.FirebaseCommonRegistrar
            r1.<init>()
            X.2wq r0 = new X.2wq
            r0.<init>(r1, r5)
            r6.add(r0)
            com.google.firebase.concurrent.ExecutorsRegistrar r1 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r1.<init>()
            X.2wq r0 = new X.2wq
            r0.<init>(r1, r5)
            r6.add(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0wD r0 = X.C18330wD.A00(r1, r10, r0)
            r4.add(r0)
            java.lang.Class<X.0vy> r1 = X.C18220vy.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0wD r0 = X.C18330wD.A00(r1, r9, r0)
            r4.add(r0)
            java.lang.Class<X.0vz> r1 = X.C18230vz.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0wD r0 = X.C18330wD.A00(r1, r11, r0)
            r4.add(r0)
            X.0wI r3 = new X.0wI
            r3.<init>()
            boolean r0 = X.C18380wJ.A00(r10)
            if (r0 == 0) goto L_0x013c
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.firebase.provider.FirebaseInitProvider.currentlyInitializing
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x013c
            java.lang.Class<X.0vv> r1 = X.C18190vv.class
            java.lang.Class[] r0 = new java.lang.Class[r5]
            X.0wD r0 = X.C18330wD.A00(r1, r2, r0)
            r4.add(r0)
        L_0x013c:
            X.0wM r2 = new X.0wM
            r2.<init>(r3, r6, r4, r7)
            r9.A02 = r2
            android.os.Trace.endSection()
            X.2wr r1 = new X.2wr
            r1.<init>(r10, r9, r5)
            X.0wC r0 = new X.0wC
            r0.<init>(r1)
            r9.A03 = r0
            java.lang.Class<X.0wX> r0 = X.C18500wX.class
            X.0w6 r0 = r2.BXj(r0)
            r9.A04 = r0
            X.0x5 r1 = new X.0x5
            r1.<init>(r9)
            A02(r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A07
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x016c
            X.0w2 r0 = X.C18260w2.A04
        L_0x016c:
            java.util.List r0 = r9.A06
            r0.add(r1)
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220vy.<init>(android.content.Context, X.0vz, java.lang.String):void");
    }
}
