package X;

import android.content.Context;
import android.os.Trace;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.lang.reflect.Method;

/* renamed from: X.1DA  reason: invalid class name */
public class AnonymousClass1DA {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C22701Cw A03;
    public final C22671Ct A04;
    public final AnonymousClass19D A05;
    public final AnonymousClass10I A06;
    public final JniBridge A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass190 A0A;
    public final AnonymousClass11C A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass1D9 A0D;
    public final AnonymousClass1D1 A0E;

    public synchronized void A01() {
        if (this.A00) {
            JniBridge jniBridge = this.A07;
            JniBridge.jvidispatchI();
            JniBridge.jvidispatchIO(0, (NativeHolder) jniBridge.wajContext.get());
            this.A00 = false;
        }
    }

    public synchronized void A02(Context context) {
        if (!this.A01) {
            Log.i("WaMsysSetup/bootstrap");
            synchronized (com.facebook.msys.mci.Log.class) {
                try {
                    Method method = AnonymousClass1CH.A03;
                    Trace.beginSection("registerLogger");
                    if (!com.facebook.msys.mci.Log.sRegistered) {
                        com.facebook.msys.mci.Log.registerLoggerNative(823, 5, false, 5);
                        com.facebook.msys.mci.Log.setLogLevel(4);
                        com.facebook.msys.mci.Log.sRegistered = true;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            Proxies.configure(new ProxyProvider(new AnonymousClass1ET(new C65272w8(this, 0), new C65272w8(this, 1))));
            Execution.initialize();
            try {
                FileManager.initialize(context.getCacheDir());
                NativeHolder nativeHolder = (NativeHolder) this.A07.wajContext.getAndSet((NativeHolder) JniBridge.jvidispatchO(0));
                if (nativeHolder != null) {
                    nativeHolder.release();
                }
                this.A01 = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.msys.mci.NotificationCenterInternal, com.facebook.msys.mci.NotificationCenter, java.lang.Object] */
    public static synchronized void A00(Context context, AnonymousClass181 r14, C220418j r15, AnonymousClass11W r16, AnonymousClass10I r17, AnonymousClass1DA r18) {
        NotificationCenter notificationCenter;
        AnonymousClass1DA r5 = r18;
        synchronized (r5) {
            if (!r5.A02) {
                AnonymousClass00H r4 = r5.A09;
                C23051Ei r3 = (C23051Ei) r4.get();
                ? notificationCenterInternal = new NotificationCenterInternal(false);
                synchronized (r3) {
                    C17960vV.A07(notificationCenterInternal);
                    r3.A00 = notificationCenterInternal;
                }
                AnonymousClass11W r11 = r16;
                String A022 = r11.A02();
                C23051Ei r32 = (C23051Ei) r4.get();
                synchronized (r32) {
                    notificationCenter = r32.A00;
                    C17960vV.A07(notificationCenter);
                }
                AnonymousClass181 r7 = r14;
                NetworkSession networkSession = new NetworkSession(A022, notificationCenter, new C23081El(r7, r5.A05, r5.A0D, r15, r11, r17, context.getCacheDir()));
                C23121Eq r33 = (C23121Eq) r5.A08.get();
                synchronized (r33) {
                    C17960vV.A07(networkSession);
                    r33.A00 = networkSession;
                }
                r5.A02 = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03(X.AnonymousClass181 r22, X.AnonymousClass118 r23, X.C19830z4 r24, X.C18000vb r25, X.C220418j r26, X.AnonymousClass11W r27, X.AnonymousClass10I r28, java.lang.String r29, java.lang.String r30) {
        /*
            r21 = this;
            r3 = r21
            monitor-enter(r3)
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x008c }
            boolean r0 = r3.A00     // Catch:{ all -> 0x008c }
            r4 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/already bootstrapped, skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x008c }
            goto L_0x007c
        L_0x0013:
            r0 = r23
            android.content.Context r15 = r0.A00     // Catch:{ all -> 0x008c }
            r3.A02(r15)     // Catch:{ all -> 0x008c }
            r16 = r22
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r3
            A00(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x008c }
            com.whatsapp.wamsys.JniBridge r6 = r3.A07     // Catch:{ all -> 0x008c }
            X.00H r0 = r3.A08     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x008c }
            X.1Eq r2 = (X.C23121Eq) r2     // Catch:{ all -> 0x008c }
            monitor-enter(r2)     // Catch:{ all -> 0x008c }
            com.facebook.msys.mci.NetworkSession r1 = r2.A00     // Catch:{ all -> 0x0089 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x008c }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x008c }
            r5 = 0
            long r1 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r5, r1, r0)     // Catch:{ all -> 0x008c }
            r7 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            java.lang.String r9 = r25.A05()     // Catch:{ all -> 0x008c }
            java.lang.String r10 = r25.A04()     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r24.A0j()     // Catch:{ all -> 0x008c }
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x008c }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x008c }
            com.facebook.simplejni.NativeHolder r14 = (com.facebook.simplejni.NativeHolder) r14     // Catch:{ all -> 0x008c }
            r11 = r29
            r13 = r30
            com.whatsapp.wamsys.JniBridge.jvidispatchIIOOOOOO(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x008c }
            r1 = 6
            java.util.concurrent.atomic.AtomicReference r0 = r6.wajContext     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x008c }
            com.facebook.simplejni.NativeHolder r0 = (com.facebook.simplejni.NativeHolder) r0     // Catch:{ all -> 0x008c }
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r1, r15, r0)     // Catch:{ all -> 0x008c }
            com.facebook.msys.mci.JsonSerialization.initialize()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x008c }
            r3.A00 = r4     // Catch:{ all -> 0x008c }
        L_0x007c:
            monitor-exit(r3)
            return r4
        L_0x007e:
            X.190 r2 = r3.A0A     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "WCRManager init failure"
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/failed to initialize WCRManager"
            r2.A0G(r1, r0, r4)     // Catch:{ all -> 0x008c }
            monitor-exit(r3)
            return r5
        L_0x0089:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DA.A03(X.181, X.118, X.0z4, X.0vb, X.18j, X.11W, X.10I, java.lang.String, java.lang.String):boolean");
    }

    public AnonymousClass1DA(C22701Cw r1, AnonymousClass190 r2, AnonymousClass11C r3, AnonymousClass11P r4, C22671Ct r5, AnonymousClass19D r6, AnonymousClass1D9 r7, AnonymousClass10I r8, AnonymousClass1D1 r9, JniBridge jniBridge, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A0C = r4;
        this.A0A = r2;
        this.A06 = r8;
        this.A07 = jniBridge;
        this.A03 = r1;
        this.A0D = r7;
        this.A0B = r3;
        this.A0E = r9;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r11;
        this.A09 = r12;
    }
}
