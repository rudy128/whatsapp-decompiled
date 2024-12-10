package X;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Csl  reason: case insensitive filesystem */
public abstract class C26123Csl {
    public static final AtomicInteger A05 = new AtomicInteger();
    public static final Object A06 = C17880vN.A0p();
    public static final AtomicReference A07 = new AtomicReference();
    public static volatile C24431C3g A08;
    public final C25559Chx A00;
    public final String A01;
    public final Object A02;
    public volatile int A03 = -1;
    public volatile Object A04;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.DJD, X.E5L, java.lang.Object] */
    public static void A00(Context context) {
        Context context2;
        if (A08 == null && context != null) {
            synchronized (A06) {
                if (A08 == null) {
                    C24431C3g c3g = A08;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (c3g == null || ((C23259Be9) c3g).A00 != context) {
                        synchronized (C25684CkF.class) {
                            try {
                                Map map = C25684CkF.A07;
                                Iterator A0l = C17890vO.A0l(map);
                                while (A0l.hasNext()) {
                                    C25684CkF ckF = (C25684CkF) A0l.next();
                                    ckF.A00.unregisterContentObserver(ckF.A01);
                                }
                                map.clear();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        synchronized (CF3.class) {
                            try {
                                Map map2 = CF3.A00;
                                Iterator A0l2 = C17890vO.A0l(map2);
                                if (!A0l2.hasNext()) {
                                    map2.clear();
                                } else {
                                    A0l2.next();
                                    throw AnonymousClass000.A0s("zzb");
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        synchronized (C25657Cjn.class) {
                            try {
                                C25657Cjn cjn = C25657Cjn.A02;
                                if (!(cjn == null || (context2 = cjn.A00) == null || cjn.A01 == null)) {
                                    context2.getContentResolver().unregisterContentObserver(C25657Cjn.A02.A01);
                                }
                                C25657Cjn.A02 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        DJC djc = new DJC(context);
                        ? obj = new Object();
                        obj.A01 = djc;
                        A08 = new C23259Be9(context, obj);
                        A05.incrementAndGet();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:56|57|58|59|60|61|62|63|64|78|79) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|(5:34|35|36|37|38)|40|41) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:112|113|114|115|116|117|118|119|(1:128)) */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x012e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x012f, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0132, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0133, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(r8)), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bb, code lost:
        android.os.Binder.restoreCallingIdentity(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        android.os.StrictMode.setThreadPolicy(r3);
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0122 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00ae */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0133 A[ExcHandler: IllegalStateException | NullPointerException | SecurityException (r3v7 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:114:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x017f A[SYNTHETIC, Splitter:B:160:0x017f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:59:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02() {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = A05
            int r6 = r0.get()
            int r0 = r14.A03
            if (r0 >= r6) goto L_0x0191
            monitor-enter(r14)
            int r0 = r14.A03     // Catch:{ all -> 0x018e }
            if (r0 >= r6) goto L_0x018c
            X.C3g r8 = A08     // Catch:{ all -> 0x018e }
            X.BeF r7 = X.C23265BeF.A00     // Catch:{ all -> 0x018e }
            r4 = 0
            if (r8 == 0) goto L_0x0034
            r0 = r8
            X.Be9 r0 = (X.C23259Be9) r0     // Catch:{ all -> 0x018e }
            X.E5L r0 = r0.A01     // Catch:{ all -> 0x018e }
            java.lang.Object r7 = r0.CT0()     // Catch:{ all -> 0x018e }
            X.DRR r7 = (X.DRR) r7     // Catch:{ all -> 0x018e }
            boolean r1 = r7 instanceof X.C23264BeE     // Catch:{ all -> 0x018e }
            if (r1 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x002d
            goto L_0x0036
        L_0x002d:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x0034:
            r5 = r4
            goto L_0x005f
        L_0x0036:
            r0 = r7
            X.BeE r0 = (X.C23264BeE) r0     // Catch:{ all -> 0x018e }
            java.lang.Object r5 = r0.zza     // Catch:{ all -> 0x018e }
            X.CLI r5 = (X.CLI) r5     // Catch:{ all -> 0x018e }
            X.Chx r0 = r14.A00     // Catch:{ all -> 0x018e }
            android.net.Uri r0 = r0.A00     // Catch:{ all -> 0x018e }
            java.lang.String r3 = ""
            java.lang.String r2 = r14.A01     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x018e }
            X.00O r0 = r5.A00     // Catch:{ all -> 0x018e }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x018e }
            X.00O r1 = (X.AnonymousClass00O) r1     // Catch:{ all -> 0x018e }
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = r3.concat(r2)     // Catch:{ all -> 0x018e }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ all -> 0x018e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x018e }
        L_0x005f:
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            if (r8 == 0) goto L_0x017f
            X.Chx r11 = r14.A00     // Catch:{ all -> 0x018e }
            android.net.Uri r10 = r11.A00     // Catch:{ all -> 0x018e }
            if (r10 == 0) goto L_0x0163
            X.Be9 r8 = (X.C23259Be9) r8     // Catch:{ all -> 0x018e }
            android.content.Context r2 = r8.A00     // Catch:{ all -> 0x018e }
            boolean r0 = X.C25439Cfm.A00(r2, r10)     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0095
            android.content.ContentResolver r9 = r2.getContentResolver()     // Catch:{ all -> 0x018e }
            X.DTU r3 = X.DTU.A00     // Catch:{ all -> 0x018e }
            java.lang.Class<X.CkF> r8 = X.C25684CkF.class
            monitor-enter(r8)     // Catch:{ all -> 0x018e }
            java.util.Map r1 = X.C25684CkF.A07     // Catch:{ all -> 0x0091 }
            java.lang.Object r13 = r1.get(r10)     // Catch:{ all -> 0x0091 }
            X.CkF r13 = (X.C25684CkF) r13     // Catch:{ all -> 0x0091 }
            if (r13 != 0) goto L_0x008f
            X.CkF r0 = new X.CkF     // Catch:{ SecurityException -> 0x008f }
            r0.<init>(r9, r10, r3)     // Catch:{ SecurityException -> 0x008f }
            r1.put(r10, r0)     // Catch:{ SecurityException -> 0x008e }
        L_0x008e:
            r13 = r0
        L_0x008f:
            monitor-exit(r8)     // Catch:{ all -> 0x0091 }
            goto L_0x0096
        L_0x0091:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0091 }
            goto L_0x0183
        L_0x0095:
            r13 = r4
        L_0x0096:
            if (r13 == 0) goto L_0x00ec
            java.lang.String r12 = r14.A01     // Catch:{ all -> 0x018e }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x00db
            java.lang.Object r10 = r13.A02     // Catch:{ all -> 0x018e }
            monitor-enter(r10)     // Catch:{ all -> 0x018e }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x00d5
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x00d7 }
            java.util.Map r0 = r13.A00()     // Catch:{ SecurityException -> 0x00ae }
            goto L_0x00d0
        L_0x00ae:
            long r8 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf }
            java.util.Map r0 = r13.A00()     // Catch:{ all -> 0x00ba }
            android.os.Binder.restoreCallingIdentity(r8)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf }
            goto L_0x00d0
        L_0x00ba:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r8)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf }
            throw r0     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf, SQLiteException | IllegalStateException | SecurityException -> 0x00bf }
        L_0x00bf:
            java.lang.String r1 = "ConfigurationContentLdr"
            java.lang.String r0 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00cb }
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d7 }
            r0 = 0
            goto L_0x00d3
        L_0x00cb:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d0:
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x00d7 }
        L_0x00d3:
            r13.A06 = r0     // Catch:{ all -> 0x00d7 }
        L_0x00d5:
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x00db
        L_0x00d7:
            r3 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x0183
        L_0x00db:
            if (r0 != 0) goto L_0x00e1
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x018e }
        L_0x00e1:
            java.lang.String r0 = X.C17880vN.A0s(r12, r0)     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r1 = r14.A03(r0)     // Catch:{ all -> 0x018e }
            goto L_0x00ed
        L_0x00ec:
            r1 = r4
        L_0x00ed:
            if (r1 != 0) goto L_0x0155
            boolean r0 = r11.A01     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x014e
            java.lang.Class<X.Cjn> r1 = X.C25657Cjn.class
            monitor-enter(r1)     // Catch:{ all -> 0x018e }
            X.Cjn r3 = X.C25657Cjn.A02     // Catch:{ all -> 0x014b }
            if (r3 != 0) goto L_0x0109
            java.lang.String r0 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r0 = X.C196309up.A00(r2, r0)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x010b
            X.Cjn r3 = new X.Cjn     // Catch:{ all -> 0x014b }
            r3.<init>(r2)     // Catch:{ all -> 0x014b }
        L_0x0107:
            X.C25657Cjn.A02 = r3     // Catch:{ all -> 0x014b }
        L_0x0109:
            monitor-exit(r1)     // Catch:{ all -> 0x014b }
            goto L_0x0111
        L_0x010b:
            X.Cjn r3 = new X.Cjn     // Catch:{ all -> 0x014b }
            r3.<init>()     // Catch:{ all -> 0x014b }
            goto L_0x0107
        L_0x0111:
            java.lang.String r8 = r14.A01     // Catch:{ all -> 0x018e }
            android.content.Context r0 = r3.A00     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0143
            boolean r0 = X.C26087Cs5.A01(r0)     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = r3.A00(r8)     // Catch:{ SecurityException -> 0x0122 }
            goto L_0x0144
        L_0x0122:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133 }
            java.lang.String r0 = r3.A00(r8)     // Catch:{ all -> 0x012e }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133 }
            goto L_0x0144
        L_0x012e:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133 }
            throw r0     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133, IllegalStateException | NullPointerException | SecurityException -> 0x0133 }
        L_0x0133:
            r3 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "GservicesLoader"
            java.lang.String r0 = "Unable to read GServices for: "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x018e }
            android.util.Log.e(r1, r0, r3)     // Catch:{ all -> 0x018e }
        L_0x0143:
            r0 = r4
        L_0x0144:
            if (r0 == 0) goto L_0x014e
            java.lang.Object r4 = r14.A03(r0)     // Catch:{ all -> 0x018e }
            goto L_0x014e
        L_0x014b:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x014b }
            goto L_0x0183
        L_0x014e:
            if (r4 != 0) goto L_0x0151
            goto L_0x0153
        L_0x0151:
            r1 = r4
            goto L_0x0155
        L_0x0153:
            java.lang.Object r1 = r14.A02     // Catch:{ all -> 0x018e }
        L_0x0155:
            boolean r0 = r7 instanceof X.C23264BeE     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x015b
            r0 = 1
            goto L_0x015c
        L_0x015b:
            r0 = 0
        L_0x015c:
            if (r0 == 0) goto L_0x0188
            if (r5 != 0) goto L_0x0184
            java.lang.Object r1 = r14.A02     // Catch:{ all -> 0x018e }
            goto L_0x0188
        L_0x0163:
            boolean r0 = X.C26087Cs5.A00()     // Catch:{ all -> 0x018e }
            r3 = 0
            if (r0 != 0) goto L_0x0183
            java.lang.Class<X.CF3> r2 = X.CF3.class
            monitor-enter(r2)     // Catch:{ all -> 0x018e }
            java.util.Map r0 = X.CF3.A00     // Catch:{ all -> 0x017c }
            r0.get(r4)     // Catch:{ all -> 0x017c }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x017c }
            throw r4     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017c }
            goto L_0x0183
        L_0x017f:
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x018e }
        L_0x0183:
            throw r3     // Catch:{ all -> 0x018e }
        L_0x0184:
            java.lang.Object r1 = r14.A03(r5)     // Catch:{ all -> 0x018e }
        L_0x0188:
            r14.A04 = r1     // Catch:{ all -> 0x018e }
            r14.A03 = r6     // Catch:{ all -> 0x018e }
        L_0x018c:
            monitor-exit(r14)     // Catch:{ all -> 0x018e }
            goto L_0x0191
        L_0x018e:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x018e }
            throw r0
        L_0x0191:
            java.lang.Object r0 = r14.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26123Csl.A02():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C23263BeD
            if (r0 == 0) goto L_0x001e
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            r0 = 3
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            X.BeN r0 = X.C23273BeN.A01(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid byte[] value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x001e:
            boolean r0 = r3 instanceof X.C23262BeC
            if (r0 == 0) goto L_0x003b
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x002e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x002e }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x002e }
            return r0
        L_0x002e:
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid double value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x003b:
            boolean r0 = r3 instanceof X.C23261BeB
            if (r0 == 0) goto L_0x0064
            java.util.regex.Pattern r0 = X.C25469CgO.A09
            boolean r0 = X.AnonymousClass8BU.A1V(r4, r0)
            if (r0 == 0) goto L_0x004d
            r0 = 1
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x004d:
            java.util.regex.Pattern r0 = X.C25469CgO.A0A
            boolean r0 = X.AnonymousClass8BU.A1V(r4, r0)
            if (r0 == 0) goto L_0x0057
            r0 = 0
            goto L_0x0048
        L_0x0057:
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid boolean value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        L_0x0064:
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0070 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0070 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0070 }
            return r0
        L_0x0070:
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid long value for "
            A01(r4, r0, r2, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26123Csl.A03(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C26123Csl(C25559Chx chx, Object obj, String str) {
        if (chx.A00 != null) {
            this.A00 = chx;
            this.A01 = str;
            this.A02 = obj;
            return;
        }
        throw AnonymousClass000.A0k("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void A01(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(": ");
        sb.append((String) obj);
        Log.e("PhenotypeFlag", sb.toString());
    }
}
