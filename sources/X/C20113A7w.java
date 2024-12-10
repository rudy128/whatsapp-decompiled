package X;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.JsonReader;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.A7w  reason: case insensitive filesystem */
public class C20113A7w {
    public static final long A0L = 30000;
    public static final String A0M = "GoogleMigrateIntegrationManager/";
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C22611Cn A02;
    public final C196179ua A03;
    public final AnonymousClass190 A04;
    public final C218617r A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1WZ A07;
    public final C24621La A08;
    public final A7Y A09;
    public final C20038A4h A0A;
    public final A8W A0B;
    public final C58802lH A0C;
    public final C33841jT A0D;
    public final C197959xY A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H = AnonymousClass12Q.A00(AnonymousClass2UB.class);
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J = C221618v.A00(C20029A3y.class);
    public final AtomicBoolean A0K = C108965cb.A0w();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r15 = this;
            monitor-enter(r15)
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x01ef
            java.util.concurrent.CountDownLatch r0 = r15.A01     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x01ef
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x01f6 }
            r0.<init>()     // Catch:{ all -> 0x01f6 }
            r15.A00 = r0     // Catch:{ all -> 0x01f6 }
            r3 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x01f6 }
            r0.<init>(r3)     // Catch:{ all -> 0x01f6 }
            r15.A01 = r0     // Catch:{ all -> 0x01f6 }
            monitor-exit(r15)     // Catch:{ all -> 0x01f6 }
            X.00H r0 = r15.A0J
            java.lang.Object r1 = r0.get()
            X.A3y r1 = (X.C20029A3y) r1
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x01ec }
            r0.clear()     // Catch:{ all -> 0x01ec }
            monitor-exit(r1)     // Catch:{ all -> 0x01ec }
            X.00H r0 = r15.A0I
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 30
            X.C20735AWq.A00(r1, r0)
            r2 = 0
            X.A4h r4 = r15.A0A     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.00H r0 = r4.A07     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.10T r1 = X.C17880vN.A0V(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.BDR r0 = r4.A03     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.00H r0 = r4.A06     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.10T r1 = X.C17880vN.A0V(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.9Xj r0 = r4.A04     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.00H r0 = r4.A08     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.10T r1 = X.C17880vN.A0V(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.B8H r0 = r4.A05     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1.registerObserver(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.1Cn r0 = r15.A02     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.9nf r6 = r0.A00()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            boolean r0 = r6.A00()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x0090
            r15.A03()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r15.A0E()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.A7Y r1 = r15.A09     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1.A0E(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.A8W r1 = r15.A0B     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1.A0B(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r15.A04(r6)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.1La r1 = r15.A08     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            java.lang.String r0 = "cross_platform_migration_completed"
            r1.A04(r0, r3)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.1La r5 = r15.A08     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            java.lang.String r4 = "cross_platform_migration_completed_timestamp"
            X.11P r0 = r15.A06     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r5.A05(r4, r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            goto L_0x013d
        L_0x0090:
            X.190 r5 = r15.A04     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            java.lang.String r4 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            java.lang.String r0 = "failed to initialize db, result = "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r5.A0G(r4, r0, r3)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.00H r0 = r15.A0I     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            java.lang.Object r4 = r0.get()     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            X.2LQ r4 = (X.AnonymousClass2LQ) r4     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            r1 = 302(0x12e, float:4.23E-43)
            r0 = 7
            X.C20736AWr.A00(r4, r1, r0)     // Catch:{ OperationCanceledException -> 0x012c, Exception -> 0x00b1 }
            goto L_0x013c
        L_0x00b1:
            r6 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x01e0 }
            boolean r0 = r6 instanceof X.B8K     // Catch:{ all -> 0x01e0 }
            if (r0 == 0) goto L_0x00c2
            r0 = r6
            X.B8K r0 = (X.B8K) r0     // Catch:{ all -> 0x01e0 }
            int r3 = r0.BUv()     // Catch:{ all -> 0x01e0 }
        L_0x00c2:
            X.9xY r0 = r15.A0E     // Catch:{ all -> 0x01e0 }
            android.content.SharedPreferences r1 = X.C197959xY.A00(r0)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r4 = 0
            java.lang.String r10 = r1.getString(r0, r4)     // Catch:{ all -> 0x01e0 }
            X.9xY r0 = r15.A0E     // Catch:{ all -> 0x01e0 }
            android.content.SharedPreferences r1 = X.C197959xY.A00(r0)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r11 = r1.getString(r0, r4)     // Catch:{ all -> 0x01e0 }
            X.00H r0 = r15.A0G     // Catch:{ all -> 0x01e0 }
            X.A8V r7 = X.AnonymousClass8BR.A0q(r0)     // Catch:{ all -> 0x01e0 }
            r0 = 302(0x12e, float:4.23E-43)
            r1 = 1
            if (r3 == r0) goto L_0x00f7
            r0 = 202(0xca, float:2.83E-43)
            if (r3 == r0) goto L_0x00f7
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x00f7
            r0 = 201(0xc9, float:2.82E-43)
            if (r3 == r0) goto L_0x00f7
            if (r3 == r1) goto L_0x00f7
            java.lang.String r8 = "google_migrate_recoverable_error"
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r8 = "google_migrate_unrecoverable_error"
        L_0x00f9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e0 }
            r1.append(r3)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = ";"
            java.lang.String r9 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ all -> 0x01e0 }
            r12 = 0
            r7.A0M(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01e0 }
            X.190 r5 = r15.A04     // Catch:{ all -> 0x01e0 }
            java.lang.String r4 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e0 }
            r1.append(r3)     // Catch:{ all -> 0x01e0 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ all -> 0x01e0 }
            r5.A0E(r4, r0, r6)     // Catch:{ all -> 0x01e0 }
            X.00H r0 = r15.A0I     // Catch:{ all -> 0x01e0 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x01e0 }
            X.2LQ r1 = (X.AnonymousClass2LQ) r1     // Catch:{ all -> 0x01e0 }
            r0 = 7
            X.C20736AWr.A00(r1, r3, r0)     // Catch:{ all -> 0x01e0 }
            goto L_0x0131
        L_0x012c:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01e0 }
        L_0x0131:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            goto L_0x0148
        L_0x013c:
            r3 = 0
        L_0x013d:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            r2 = r3
        L_0x0148:
            X.00H r0 = r15.A0I
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 4
            X.C20737AWs.A00(r1, r0, r2)
            r15.A01()
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData(); stats=\n"
            r9.append(r0)
            X.00H r0 = r15.A0J
            java.lang.Object r3 = r0.get()
            X.A3y r3 = (X.C20029A3y) r3
            java.lang.String r11 = "\n"
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "prefetched/file/success"
            int r2 = X.C20029A3y.A00(r3, r0)
            java.lang.String r0 = "prefetched/file/failed"
            int r1 = X.C20029A3y.A00(r3, r0)
            int r14 = r2 + r1
            java.lang.String r0 = "import/chat/skipped"
            int r13 = X.C20029A3y.A00(r3, r0)
            java.lang.String r0 = "import/msg/success"
            int r12 = X.C20029A3y.A00(r3, r0)
            java.lang.String r0 = "import/msg/failed"
            int r8 = X.C20029A3y.A00(r3, r0)
            java.lang.String r0 = "import/msg/skipped"
            int r7 = X.C20029A3y.A00(r3, r0)
            int r6 = r12 + r8
            int r6 = r6 + r7
            java.lang.String r0 = "import/msg/file/success"
            int r5 = X.C20029A3y.A00(r3, r0)
            java.lang.String r0 = "import/msg/file/failed"
            int r4 = X.C20029A3y.A00(r3, r0)
            int r3 = r5 + r4
            java.lang.String r0 = "Prefetched files: success="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r2 = ", failed="
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ", total="
            X.AnonymousClass000.A1E(r1, r11, r10, r14)
            java.lang.String r0 = "Chats: skipped="
            X.AnonymousClass000.A1E(r0, r11, r10, r13)
            java.lang.String r0 = "Messages: success="
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = ", skipped="
            X.AnonymousClass000.A1E(r0, r2, r10, r7)
            r10.append(r8)
            X.AnonymousClass000.A1E(r1, r11, r10, r6)
            java.lang.String r0 = "Message files: success="
            X.AnonymousClass000.A1E(r0, r2, r10, r5)
            r10.append(r4)
            java.lang.String r0 = X.AnonymousClass001.A1I(r1, r10, r3)
            X.C17890vO.A1A(r9, r0)
            return
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            throw r1
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ec }
            throw r0
        L_0x01ef:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/Import already running, cannot start another import."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20113A7w.A0A():void");
    }

    public boolean A0G() {
        try {
            return C108975cc.A1B(this.A08.A00("cross_platform_migration_completed", 0));
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A01 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20113A7w.A0H():boolean");
    }

    private void A01() {
        Log.i("GoogleMigrateIntegrationManager/cleanUpAfterImportCompleted()");
        this.A08.A04("cross_migration_data_cleanup_needed", 1);
        C20038A4h a4h = this.A0A;
        C17880vN.A0V(a4h.A07).unregisterObserver(a4h.A03);
        C17880vN.A0V(a4h.A06).unregisterObserver(a4h.A04);
        C17880vN.A0V(a4h.A08).unregisterObserver(a4h.A05);
        synchronized (this) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    private void A02() {
        A04(this.A02.A00());
    }

    private void A03() {
        if (!this.A0D.A0G()) {
            throw new AnonymousClass9HZ(301, "GoogleMigrateIntegrationManager/can not find jabber Id");
        }
    }

    public int A05() {
        int i;
        C20038A4h a4h = this.A0A;
        synchronized (a4h) {
            i = a4h.A00;
        }
        return i;
    }

    public int A06() {
        int i;
        C20038A4h a4h = this.A0A;
        synchronized (a4h) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GoogleMigrate/getCurrentScreen = ");
            C17900vP.A0o(A10, a4h.A01);
            i = a4h.A01;
        }
        return i;
    }

    public void A07() {
        CountDownLatch countDownLatch;
        Log.i("GoogleMigrateIntegrationManager/cancelImport()");
        boolean z = true;
        if (!this.A0K.getAndSet(true)) {
            synchronized (this) {
                if (this.A00 == null || this.A01 == null) {
                    Log.i("GoogleMigrateIntegrationManager/cancellationSignal or importCompleted is null");
                    A00();
                } else {
                    z = false;
                }
                countDownLatch = this.A01;
                if (this.A00 != null) {
                    Log.i("GoogleMigrateIntegrationManager/cancelImport()/cancellationSignal.cancel");
                    this.A00.cancel();
                }
            }
            if (z) {
                C20735AWq.A00(C17880vN.A0V(this.A0I), 29);
                A01();
                return;
            }
            try {
                C20735AWq.A00((AnonymousClass2LQ) this.A0I.get(), 31);
                if (countDownLatch != null) {
                    countDownLatch.await(A0L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                C20736AWr.A00((AnonymousClass2LQ) this.A0I.get(), 2, 7);
                Log.e("GoogleMigrateIntegrationManager/cancelImportProcess()/InterruptedException", e);
            } catch (Throwable th) {
                A00();
                C20735AWq.A00(C17880vN.A0V(this.A0I), 29);
                A01();
                this.A0K.set(false);
                throw th;
            }
            A00();
            C20735AWq.A00(C17880vN.A0V(this.A0I), 29);
            A01();
            this.A0K.set(false);
            return;
        }
        Log.e("GoogleMigrateIntegrationManager/concurrent cancelImport requested, not supported");
        throw AnonymousClass000.A0n("Multiple concurrent operations are not supported.");
    }

    public void A08() {
        Parcel obtain;
        Parcel obtain2;
        if (this.A08.A01("cross_migration_data_cleanup_needed", 0) == 1) {
            this.A09.A09();
            if (this.A03.A03()) {
                try {
                    try {
                        AnonymousClass9A0 A012 = this.A03.A01();
                        try {
                            AJ1 aj1 = (AJ1) ((IAppDataReaderService) A012.A00());
                            obtain = Parcel.obtain();
                            obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                            AnonymousClass000.A18(aj1.A00, obtain, obtain2, 4);
                            obtain2.recycle();
                            obtain.recycle();
                            A012.close();
                        } catch (Throwable th) {
                            A012.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        throw new IOException(e);
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                } catch (IOException e2) {
                    this.A04.A0E("xpm-integration-delete-failed", AnonymousClass001.A1E(e2, "failed to delete remote data: ", AnonymousClass000.A10()), e2);
                    Log.e("GoogleMigrateIntegrationManager/deferredCleanup()/could not delete all data from Google Migrate");
                }
            }
            this.A08.A03("cross_migration_data_cleanup_needed");
            return;
        }
        Log.i("GoogleMigrateIntegrationManager/deferredCleanup()/does not need to cleanup");
    }

    public void A09() {
        this.A03.A03();
    }

    public void A0B() {
        this.A02.A00();
    }

    public void A0C() {
        C20038A4h a4h = this.A0A;
        synchronized (a4h) {
            a4h.A01 = 0;
        }
    }

    public void A0D() {
        this.A07.A01();
        this.A02.A02();
    }

    public void A0E() {
        JsonReader A0E2;
        IOException iOException;
        Log.i("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()");
        try {
            ParcelFileDescriptor A002 = this.A03.A00("migration/metadata.json");
            try {
                FileInputStream fileInputStream = new FileInputStream(A002.getFileDescriptor());
                try {
                    this.A0H.get();
                    A0E2 = C108985cd.A0E(fileInputStream);
                    A0E2.beginObject();
                    String str = null;
                    String str2 = null;
                    while (A0E2.hasNext()) {
                        if ("attemptInfo".equals(A0E2.nextName())) {
                            A0E2.beginObject();
                            while (A0E2.hasNext()) {
                                String nextName = A0E2.nextName();
                                if ("attemptCompletionTime".equals(nextName)) {
                                    str2 = Double.toString(A0E2.nextDouble());
                                } else if ("attemptID".equals(nextName)) {
                                    str = A0E2.nextString();
                                }
                            }
                            A0E2.endObject();
                        } else {
                            A0E2.skipValue();
                        }
                    }
                    A0E2.endObject();
                    if (str == null) {
                        iOException = C17880vN.A0f("Invalid metadata file: iOSFunnelId is missing.");
                    } else if (str2 != null) {
                        A0E2.close();
                        C17880vN.A1E(C197959xY.A00(this.A0E).edit(), "google_migrate_ios_export_duration", str2);
                        C17880vN.A1E(C197959xY.A00(this.A0E).edit(), "google_migrate_ios_funnel_id", str);
                        fileInputStream.close();
                        A002.close();
                        return;
                    } else {
                        iOException = C17880vN.A0f("Invalid metadata file: iOSExportDuration is missing.");
                    }
                    throw iOException;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (A002 != null) {
                    A002.close();
                }
                throw th2;
            }
        } catch (IOException e) {
            Log.e("GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()/", e);
            this.A04.A0E("xpm-integration-no-funnel-id", "saveLoggingInfoFromiOS;", e);
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }

    public void A0F(int i) {
        try {
            C20735AWq.A00((AnonymousClass2LQ) this.A0I.get(), 28);
            A0D();
        } finally {
            C20736AWr.A00(C17880vN.A0V(this.A0I), i, 8);
        }
    }

    public C20113A7w(AnonymousClass11P r2, AnonymousClass190 r3, C218617r r4, AnonymousClass00H r5, A7Y a7y, A8W a8w, C24621La r8, AnonymousClass00H r9, C196179ua r10, C33841jT r11, C20038A4h a4h, AnonymousClass00H r13, C58802lH r14, AnonymousClass1WZ r15, C22611Cn r16, C197959xY r17) {
        this.A06 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A0G = r5;
        this.A0F = r9;
        this.A09 = a7y;
        this.A0B = a8w;
        this.A08 = r8;
        this.A03 = r10;
        this.A0D = r11;
        this.A0A = a4h;
        this.A0I = r13;
        this.A0C = r14;
        this.A07 = r15;
        this.A02 = r16;
        this.A0E = r17;
    }

    private void A00() {
        A0D();
        File A0J2 = this.A05.A0J();
        C64062u9.A0K(A0J2, (Set) null);
        String[] list = A0J2.list();
        if (!(list == null || list.length == 0)) {
            this.A04.A0G(A0M, "cancelImport/could not delete media folder", false);
            Log.e("GoogleMigrateIntegrationManager/cleanUpAfterCancellation()/could not delete media folder");
        }
        A02();
    }

    private void A04(C192039nf r2) {
        if (r2.A00()) {
            C58802lH r0 = this.A0C;
            r0.A00();
            r0.A01();
        }
    }
}
