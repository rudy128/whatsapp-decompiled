package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Cvd  reason: case insensitive filesystem */
public abstract class C26240Cvd {
    public static Context A05;
    public static final Object A06 = C17880vN.A0p();
    public static volatile Boolean A07;
    public final String A00;
    public final String A01;
    public final CQ7 A02;
    public final Object A03;
    public volatile C25987Cq1 A04 = null;

    public static void A02(Context context) {
        Context applicationContext;
        if (A05 == null) {
            synchronized (A06) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (A05 != context) {
                    A07 = null;
                }
                A05 = context;
            }
        }
    }

    public static final /* synthetic */ Boolean A00(String str) {
        Object obj;
        ContentResolver contentResolver = A05.getContentResolver();
        boolean z = false;
        Class<C26100CsK> cls = C26100CsK.class;
        synchronized (cls) {
            C26100CsK.A01(contentResolver);
            obj = C26100CsK.A00;
        }
        HashMap hashMap = C26100CsK.A02;
        boolean z2 = false;
        synchronized (cls) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    z2 = obj2;
                }
            } else {
                z2 = null;
            }
        }
        Boolean bool = (Boolean) z2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            String A002 = C26100CsK.A00(contentResolver, str);
            if (A002 != null && !A002.equals("")) {
                if (AnonymousClass8BU.A1V(A002, C26100CsK.A05)) {
                    z = true;
                } else if (!AnonymousClass8BU.A1V(A002, C26100CsK.A06)) {
                    StringBuilder A0u = BE6.A0u("attempt to read gservices key ");
                    A0u.append(str);
                    A0u.append(" (value \"");
                    A0u.append(A002);
                    Log.w("Gservices", AnonymousClass000.A0y("\") as boolean", A0u));
                }
                bool = Boolean.valueOf(z);
            }
            synchronized (cls) {
                if (obj == C26100CsK.A00) {
                    hashMap.put(str, bool);
                    C26100CsK.A01.remove(str);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    private final Object A01() {
        Object obj;
        long clearCallingIdentity;
        if (!A04("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) {
            Uri uri = this.A02.A00;
            if (uri != null) {
                if (this.A04 == null) {
                    ContentResolver contentResolver = A05.getContentResolver();
                    ConcurrentHashMap concurrentHashMap = C25987Cq1.A07;
                    C25987Cq1 cq1 = (C25987Cq1) concurrentHashMap.get(uri);
                    if (cq1 == null) {
                        cq1 = new C25987Cq1(contentResolver, uri);
                        C25987Cq1 cq12 = (C25987Cq1) concurrentHashMap.putIfAbsent(uri, cq1);
                        if (cq12 == null) {
                            cq1.A00.registerContentObserver(cq1.A02, false, cq1.A01);
                        } else {
                            cq1 = cq12;
                        }
                    }
                    this.A04 = cq1;
                }
                C25987Cq1 cq13 = this.A04;
                try {
                    obj = cq13.A01().get(this.A00);
                } catch (SecurityException unused) {
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    obj = cq13.A01().get(this.A00);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
                String str = (String) obj;
                if (str != null) {
                    return A06(str);
                }
            }
        } else {
            String valueOf = String.valueOf(this.A00);
            Log.w("PhenotypeFlag", BE9.A0o("Bypass reading Phenotype values for flag: ", valueOf, valueOf.length()));
        }
        return null;
    }

    public static boolean A03() {
        String str;
        if (A07 == null) {
            Context context = A05;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (Binder.getCallingPid() == Process.myPid()) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            if (C196309up.A01(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", str, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
                z = true;
            }
            A07 = Boolean.valueOf(z);
        }
        return A07.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05() {
        /*
            r4 = this;
            android.content.Context r0 = A05
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r4.A01()
            if (r0 != 0) goto L_0x0040
            boolean r0 = A03()
            if (r0 == 0) goto L_0x0041
            android.content.Context r0 = A05     // Catch:{ SecurityException -> 0x001d }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x001d }
            java.lang.String r0 = r4.A01     // Catch:{ SecurityException -> 0x001d }
            java.lang.String r0 = X.C26100CsK.A00(r1, r0)     // Catch:{ SecurityException -> 0x001d }
            goto L_0x0036
        L_0x001d:
            long r2 = android.os.Binder.clearCallingIdentity()
            android.content.Context r0 = A05     // Catch:{ all -> 0x002e }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ all -> 0x002e }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x002e }
            java.lang.String r0 = X.C26100CsK.A00(r1, r0)     // Catch:{ all -> 0x002e }
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)
            throw r0
        L_0x0033:
            android.os.Binder.restoreCallingIdentity(r2)
        L_0x0036:
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r4.A06(r0)
        L_0x003c:
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = r4.A03
        L_0x0040:
            return r0
        L_0x0041:
            r0 = 0
            goto L_0x003c
        L_0x0043:
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26240Cvd.A05():java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.BxF} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.CQ8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A06(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C23292Beg
            if (r0 == 0) goto L_0x00c3
            r2 = r12
            X.Beg r2 = (X.C23292Beg) r2
            java.lang.Object r3 = r2.A02     // Catch:{ IOException | IllegalArgumentException -> 0x00a2 }
            monitor-enter(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00a2 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x009f }
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x009b
            r0 = 3
            byte[] r9 = android.util.Base64.decode(r13, r0)     // Catch:{ all -> 0x009f }
            X.Bex r1 = X.C23309Bex.zzbir     // Catch:{ all -> 0x009f }
            r0 = 4
            java.lang.Object r8 = r1.A04(r0)     // Catch:{ all -> 0x009f }
            X.Beh r8 = (X.C23293Beh) r8     // Catch:{ all -> 0x009f }
            X.Cjp r5 = X.C25659Cjp.A02     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            java.lang.Class r4 = r8.getClass()     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            X.EAC r6 = r5.A00(r4)     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            int r11 = r9.length     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            X.CQ8 r7 = new X.CQ8     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            r7.<init>()     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            r10 = 0
            r6.CTA(r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            X.EAC r0 = r5.A00(r4)     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            r0.CTR(r8)     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            int r0 = r8.zzex     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            if (r0 != 0) goto L_0x006d
            r0 = 1
            java.lang.Object r0 = r8.A04(r0)     // Catch:{ all -> 0x009f }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ all -> 0x009f }
            byte r1 = r0.byteValue()     // Catch:{ all -> 0x009f }
            r0 = 1
            if (r1 == r0) goto L_0x0095
            if (r1 == 0) goto L_0x005e
            X.EAC r0 = r5.A00(r4)     // Catch:{ all -> 0x009f }
            boolean r1 = r0.CTk(r8)     // Catch:{ all -> 0x009f }
            r0 = 2
            r8.A04(r0)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x005e
            goto L_0x0095
        L_0x005e:
            X.DZv r0 = new X.DZv     // Catch:{ all -> 0x009f }
            r0.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x009f }
            X.BxF r1 = new X.BxF     // Catch:{ all -> 0x009f }
            r1.<init>(r0)     // Catch:{ all -> 0x009f }
            goto L_0x0092
        L_0x006d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            r0.<init>()     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
            throw r0     // Catch:{ IOException -> 0x0073, IndexOutOfBoundsException -> 0x008b }
        L_0x0073:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x009f }
            boolean r0 = r0 instanceof X.C24203BxF     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0081
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x009f }
            goto L_0x0094
        L_0x0081:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x009f }
            X.BxF r1 = new X.BxF     // Catch:{ all -> 0x009f }
            r1.<init>(r0)     // Catch:{ all -> 0x009f }
            goto L_0x0092
        L_0x008b:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.BxF r1 = new X.BxF     // Catch:{ all -> 0x009f }
            r1.<init>(r0)     // Catch:{ all -> 0x009f }
        L_0x0092:
            r1.zzkw = r8     // Catch:{ all -> 0x009f }
        L_0x0094:
            throw r1     // Catch:{ all -> 0x009f }
        L_0x0095:
            X.Bex r8 = (X.C23309Bex) r8     // Catch:{ all -> 0x009f }
            r2.A01 = r13     // Catch:{ all -> 0x009f }
            r2.A00 = r8     // Catch:{ all -> 0x009f }
        L_0x009b:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x009f }
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            return r0
        L_0x009f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x00a2 }
        L_0x00a2:
            java.lang.String r3 = "PhenotypeFlag"
            java.lang.String r2 = r2.A00
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = X.BEA.A0s(r13, r0)
            java.lang.String r0 = "Invalid byte[] value for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r1)
            android.util.Log.e(r3, r0)
            r0 = 0
            return r0
        L_0x00c3:
            boolean r0 = r12 instanceof X.C23291Bef
            if (r0 == 0) goto L_0x00c8
            return r13
        L_0x00c8:
            java.util.regex.Pattern r0 = X.C26100CsK.A05
            boolean r0 = X.AnonymousClass8BU.A1V(r13, r0)
            if (r0 == 0) goto L_0x00d6
            r0 = 1
        L_0x00d1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00d6:
            java.util.regex.Pattern r0 = X.C26100CsK.A06
            boolean r0 = X.AnonymousClass8BU.A1V(r13, r0)
            if (r0 == 0) goto L_0x00e0
            r0 = 0
            goto L_0x00d1
        L_0x00e0:
            java.lang.String r2 = r12.A00
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 28
            java.lang.StringBuilder r1 = X.BEA.A0s(r13, r0)
            java.lang.String r0 = "Invalid boolean value for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r13, r1)
            java.lang.String r0 = "PhenotypeFlag"
            android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26240Cvd.A06(java.lang.String):java.lang.Object");
    }

    public C26240Cvd(CQ7 cq7, Object obj, String str) {
        if (cq7.A00 != null) {
            this.A02 = cq7;
            this.A01 = BEB.A0e(String.valueOf(cq7.A01), str);
            this.A00 = BEB.A0e(String.valueOf(cq7.A02), str);
            this.A03 = obj;
            return;
        }
        throw AnonymousClass000.A0k("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static boolean A04(String str) {
        Boolean bool;
        long clearCallingIdentity;
        if (!A03()) {
            return false;
        }
        try {
            bool = A00(str);
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            bool = A00(str);
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        return bool.booleanValue();
    }
}
