package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;

/* renamed from: X.9uZ  reason: invalid class name and case insensitive filesystem */
public class C196169uZ {
    public final AnonymousClass11S A00;
    public final C196129uV A01;
    public final C196139uW A02;
    public final AnonymousClass11P A03;
    public final A0A A04;
    public final AnonymousClass19K A05;
    public final SecureRandom A06;

    public void A00() {
        C196129uV r1 = this.A01;
        C187719gG A012 = r1.A01();
        Log.i("ExportEncryptionManager/copyPrefetchedKeyToActiveKey");
        if (A012 != null) {
            C17880vN.A1E(AnonymousClass8BV.A06(r1.A01).putString("/export/enc/active/owner", A012.A01.getRawString()).putString("/export/enc/active/version", A012.A05).putString("/export/enc/active/account_hash", A012.A02).putString("/export/enc/active/server_salt", A012.A04).putLong("/export/enc/active/last_fetch_time", A012.A00), "/export/enc/active/seed", A012.A03);
            Log.i("ExportEncryptionManager/copiedPrefetchedKeyToActiveKey");
            return;
        }
        throw new C173668vV(101, "Active encryption key info is missing.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = new X.A1B();
        r3 = X.AnonymousClass00R.A01;
        r0.A00 = r3;
        r2 = r0.A01();
        r0 = new X.C196269uj(com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class);
        r0.A03(r2);
        X.AnonymousClass8BR.A0D(r4.A05).A07((X.C162248Jv) r0.A00(), r3, "export-key-prefetch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            X.11S r1 = r4.A00
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, user in companion mode"
        L_0x000a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x000e:
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r1)
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, no user logged in"
            goto L_0x000a
        L_0x0017:
            monitor-enter(r4)
            X.9uV r0 = r4.A01     // Catch:{ all -> 0x0057 }
            X.9gG r0 = r0.A01()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.A04(r1, r0)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); skip scheduling, encryption key is already prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0057 }
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            return
        L_0x002d:
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            X.A1B r0 = new X.A1B
            r0.<init>()
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            r0.A00 = r3
            X.A6e r2 = r0.A01()
            java.lang.Class<com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker> r1 = com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class
            X.8Jt r0 = new X.8Jt
            r0.<init>(r1)
            r0.A03(r2)
            X.9cO r2 = r0.A00()
            X.8Jv r2 = (X.C162248Jv) r2
            X.19K r0 = r4.A05
            X.A7W r1 = X.AnonymousClass8BR.A0D(r0)
            java.lang.String r0 = "export-key-prefetch"
            r1.A07(r2, r3, r0)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196169uZ.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r4 = new byte[32];
        r3.A06.nextBytes(r4);
        r1 = android.util.Base64.encodeToString(r4, 2);
        r11 = r3.A04;
        r12 = r11.A00;
        r13 = X.AnonymousClass11S.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r13 == null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r6 = android.util.Base64.decode(r1, 2);
        r9 = new java.util.concurrent.CountDownLatch(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r11.A01.A01(X.AnonymousClass00R.A01, new X.C70573Bq(r9, 28), r6, new byte[16]) == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.A0A.A00(r21, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r9.getCount() > 0) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r1 = X.AnonymousClass11S.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r1 == null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r1.equals(r13) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r4 = X.AnonymousClass000.A13();
        r9 = X.C17890vO.A0i(new java.util.HashMap(((X.AnonymousClass9j8) r11.A03.get()).A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r9.hasNext() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r1 = X.AnonymousClass000.A16(r9);
        r5 = (X.C192219o0) r1.getKey();
        r8 = (X.C190569lA) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        if (java.util.Arrays.equals(r8.A01, r6) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        r14 = r5.A00;
        r5 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d1, code lost:
        if (r5 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        r5 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r14 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r7 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r5 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r4.add(new X.C187719gG(r13, r14, android.util.Base64.encodeToString(r6, 2), android.util.Base64.encodeToString(r7, 2), android.util.Base64.encodeToString(r5, 2), java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        r7 = java.util.Arrays.copyOf(r5, r5.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        X.C21486Akr.A01(34, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r4.isEmpty() != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        r6 = (X.C187719gG) X.AnonymousClass8BS.A0Y(r4);
        r2 = X.AnonymousClass11S.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        if (r2 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); user logged out while waiting for encryption key";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0118, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        if (r1 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0123, code lost:
        if (A04(r2, r1) == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        com.whatsapp.util.Log.i("ExportEncryptionManager/maybeGenerateEncryptionKey(); concurrent conflict, encryption key was prefetched recently");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        r1 = r6.A01;
        r1.getRawString();
        r9 = r6.A05;
        r8 = r6.A02;
        r7 = r6.A04;
        X.C17880vN.A1E(X.AnonymousClass8BV.A06(r0.A01).putString("/export/enc/prefetched/owner", r1.getRawString()).putString("/export/enc/prefetched/version", r9).putString("/export/enc/prefetched/account_hash", r8).putString("/export/enc/prefetched/server_salt", r7).putLong("/export/enc/prefetched/last_fetch_time", r6.A00), "/export/enc/prefetched/seed", r6.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        throw new X.C173668vV(101, "Failed to create a key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017e, code lost:
        throw new X.AnonymousClass9HZ(301, "User changed while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        throw new X.AnonymousClass9HZ(301, "User was logged out while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018e, code lost:
        throw new X.C173668vV(103, "Failed to create a key, timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0197, code lost:
        throw new X.C173668vV("Failed to create a key, interrupted.", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a1, code lost:
        throw new X.C173668vV(102, "Not connected to server, cannot create keys.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a9, code lost:
        throw new X.AnonymousClass9HZ(301, "Cannot create encryption key when user is not logged in.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.os.CancellationSignal r21) {
        /*
            r20 = this;
            r3 = r20
            X.11S r2 = r3.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.AnonymousClass11S.A00(r2)
            if (r4 != 0) goto L_0x0010
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); skipped key prefetching, no user is logged in"
        L_0x000c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0010:
            java.lang.System.currentTimeMillis()
            monitor-enter(r3)
            X.9uV r0 = r3.A01     // Catch:{ all -> 0x01aa }
            X.9gG r1 = r0.A01()     // Catch:{ all -> 0x01aa }
            if (r1 == 0) goto L_0x0041
            boolean r1 = r3.A04(r4, r1)     // Catch:{ all -> 0x01aa }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); skipped key prefetching, key is already prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01aa }
            monitor-exit(r3)     // Catch:{ all -> 0x01aa }
            goto L_0x0117
        L_0x002a:
            java.lang.String r1 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); reset prefetched key, a different user is now logged in or key is older"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x01aa }
            r0.A04()     // Catch:{ all -> 0x01aa }
            X.A0A r1 = r3.A04     // Catch:{ all -> 0x01aa }
            X.00H r1 = r1.A03     // Catch:{ all -> 0x01aa }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01aa }
            X.9j8 r1 = (X.AnonymousClass9j8) r1     // Catch:{ all -> 0x01aa }
            java.util.Map r1 = r1.A00     // Catch:{ all -> 0x01aa }
            r1.clear()     // Catch:{ all -> 0x01aa }
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x01aa }
            r1 = 32
            byte[] r4 = new byte[r1]
            java.security.SecureRandom r1 = r3.A06
            r1.nextBytes(r4)
            r5 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r5)
            X.A0A r11 = r3.A04
            X.11S r12 = r11.A00
            com.whatsapp.jid.PhoneUserJid r13 = X.AnonymousClass11S.A00(r12)
            r4 = 301(0x12d, float:4.22E-43)
            if (r13 == 0) goto L_0x01a2
            byte[] r6 = android.util.Base64.decode(r1, r5)
            r1 = 16
            byte[] r10 = new byte[r1]
            r1 = 1
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r1)
            X.1Vs r8 = r11.A01
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            r5 = 28
            X.3Bq r1 = new X.3Bq
            r1.<init>(r9, r5)
            boolean r1 = r8.A01(r7, r1, r6, r10)
            if (r1 == 0) goto L_0x0198
            r5 = 103(0x67, float:1.44E-43)
            r1 = r21
            X.A0A.A00(r1, r9)     // Catch:{ InterruptedException -> 0x018f }
            long r9 = r9.getCount()
            r7 = 0
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0187
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r12)
            if (r1 == 0) goto L_0x017f
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0177
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.00H r1 = r11.A03
            java.lang.Object r1 = r1.get()
            X.9j8 r1 = (X.AnonymousClass9j8) r1
            java.util.Map r5 = r1.A00
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r5)
            java.util.Iterator r9 = X.C17890vO.A0i(r1)
        L_0x00af:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00fc
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r9)
            java.lang.Object r5 = r1.getKey()
            X.9o0 r5 = (X.C192219o0) r5
            java.lang.Object r8 = r1.getValue()
            X.9lA r8 = (X.C190569lA) r8
            byte[] r1 = r8.A01
            boolean r1 = java.util.Arrays.equals(r1, r6)
            if (r1 == 0) goto L_0x00af
            java.lang.String r14 = r5.A00
            byte[] r5 = r5.A01
            if (r5 != 0) goto L_0x00f6
            r7 = 0
        L_0x00d4:
            byte[] r5 = r8.A02
            if (r14 == 0) goto L_0x00af
            if (r7 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00af
            r1 = 2
            java.lang.String r15 = android.util.Base64.encodeToString(r6, r1)
            java.lang.String r16 = android.util.Base64.encodeToString(r7, r1)
            java.lang.String r17 = android.util.Base64.encodeToString(r5, r1)
            long r18 = java.lang.System.currentTimeMillis()
            X.9gG r12 = new X.9gG
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4.add(r12)
            goto L_0x00af
        L_0x00f6:
            int r1 = r5.length
            byte[] r7 = java.util.Arrays.copyOf(r5, r1)
            goto L_0x00d4
        L_0x00fc:
            r1 = 34
            X.C21486Akr.A01(r1, r4)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x016d
            java.lang.Object r6 = X.AnonymousClass8BS.A0Y(r4)
            X.9gG r6 = (X.C187719gG) r6
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A00(r2)
            if (r2 != 0) goto L_0x0118
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); user logged out while waiting for encryption key"
            goto L_0x000c
        L_0x0117:
            return
        L_0x0118:
            monitor-enter(r3)
            X.9gG r1 = r0.A01()     // Catch:{ all -> 0x016a }
            if (r1 == 0) goto L_0x012c
            boolean r1 = r3.A04(r2, r1)     // Catch:{ all -> 0x016a }
            if (r1 == 0) goto L_0x012c
            java.lang.String r0 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); concurrent conflict, encryption key was prefetched recently"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016a }
        L_0x012a:
            monitor-exit(r3)     // Catch:{ all -> 0x016a }
            goto L_0x0169
        L_0x012c:
            com.whatsapp.jid.UserJid r1 = r6.A01     // Catch:{ all -> 0x016a }
            r1.getRawString()     // Catch:{ all -> 0x016a }
            java.lang.String r9 = r6.A05     // Catch:{ all -> 0x016a }
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x016a }
            java.lang.String r7 = r6.A04     // Catch:{ all -> 0x016a }
            long r4 = r6.A00     // Catch:{ all -> 0x016a }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x016a }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BV.A06(r0)     // Catch:{ all -> 0x016a }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "/export/enc/prefetched/owner"
            android.content.SharedPreferences$Editor r1 = r2.putString(r0, r1)     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "/export/enc/prefetched/version"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r9)     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "/export/enc/prefetched/account_hash"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r8)     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "/export/enc/prefetched/server_salt"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r7)     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "/export/enc/prefetched/last_fetch_time"
            android.content.SharedPreferences$Editor r2 = r1.putLong(r0, r4)     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "/export/enc/prefetched/seed"
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x016a }
            X.C17880vN.A1E(r2, r1, r0)     // Catch:{ all -> 0x016a }
            goto L_0x012a
        L_0x0169:
            return
        L_0x016a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016a }
            throw r0
        L_0x016d:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Failed to create a key."
            X.8vV r0 = new X.8vV
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x0177:
            java.lang.String r1 = "User changed while waiting for encryption key."
            X.9HZ r0 = new X.9HZ
            r0.<init>((int) r4, (java.lang.String) r1)
            throw r0
        L_0x017f:
            java.lang.String r1 = "User was logged out while waiting for encryption key."
            X.9HZ r0 = new X.9HZ
            r0.<init>((int) r4, (java.lang.String) r1)
            throw r0
        L_0x0187:
            java.lang.String r1 = "Failed to create a key, timed out."
            X.8vV r0 = new X.8vV
            r0.<init>((int) r5, (java.lang.String) r1)
            throw r0
        L_0x018f:
            r2 = move-exception
            java.lang.String r1 = "Failed to create a key, interrupted."
            X.8vV r0 = new X.8vV
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x0198:
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "Not connected to server, cannot create keys."
            X.8vV r0 = new X.8vV
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x01a2:
            java.lang.String r1 = "Cannot create encryption key when user is not logged in."
            X.9HZ r0 = new X.9HZ
            r0.<init>((int) r4, (java.lang.String) r1)
            throw r0
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196169uZ.A02(android.os.CancellationSignal):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.os.CancellationSignal r11, java.util.zip.ZipOutputStream r12, boolean r13) {
        /*
            r10 = this;
            X.9uV r0 = r10.A01
            X.9gG r6 = r0.A00()
            if (r6 == 0) goto L_0x01bf
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata(); generating metadata with:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r1 = r10.A00
            r1.A0I()
            com.whatsapp.Me r0 = r1.A00
            r3 = 0
            if (r0 == 0) goto L_0x00b0
            java.lang.String r2 = r0.jabber_id
        L_0x0019:
            com.whatsapp.Me r0 = r1.A07()
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = r0.jabber_id
        L_0x0021:
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();    current user:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       current user: "
            X.C17900vP.A0f(r0, r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       old user: "
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();    key info:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       user         = "
            r1.append(r0)
            com.whatsapp.jid.UserJid r4 = r6.A01
            java.lang.String r0 = r4.getRawString()
            X.C17890vO.A1A(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       version      = "
            r1.append(r0)
            java.lang.String r7 = r6.A05
            X.C17890vO.A1A(r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       account_hash = "
            r1.append(r0)
            java.lang.String r5 = r6.A02
            X.C17890vO.A1A(r1, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       server_salt  = "
            r1.append(r0)
            java.lang.String r2 = r6.A04
            X.C17890vO.A1A(r1, r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       last_fetched = "
            r3.append(r0)
            long r0 = r6.A00
            X.C17890vO.A16(r3, r0)
            java.lang.String r6 = X.C17890vO.A0Q()
            java.lang.String r4 = X.C199379zt.A00(r4)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();   data info: "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       data_id      = "
            X.C17900vP.A0f(r0, r6, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       source_id    = "
            X.C17900vP.A0f(r0, r4, r1)
            java.util.HashMap r0 = X.C17880vN.A11()
            X.AiF r3 = new X.AiF
            r3.<init>(r0, r12)
            goto L_0x00b3
        L_0x00b0:
            r2 = r3
            goto L_0x0019
        L_0x00b3:
            X.9lG r0 = new X.9lG     // Catch:{ all -> 0x01b5 }
            r0.<init>(r7, r5, r2)     // Catch:{ all -> 0x01b5 }
            java.lang.String r5 = "AES-GCM-v1"
            X.9zt r2 = new X.9zt     // Catch:{ all -> 0x01b5 }
            r2.<init>(r0, r5, r6, r4)     // Catch:{ all -> 0x01b5 }
            android.util.JsonWriter r4 = r3.A01     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "data_id"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01b5 }
            r4.value(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x01b5 }
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = "source_id"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            r4.value(r1)     // Catch:{ all -> 0x01b5 }
        L_0x00d7:
            java.lang.String r0 = "scheme"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            r4.value(r5)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "key_id"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            r4.beginObject()     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "version"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            X.9lG r2 = r2.A00     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x01b5 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x01b5 }
            long r0 = (long) r0     // Catch:{ all -> 0x01b5 }
            r4.value(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "account_hash"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x01b5 }
            r4.value(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "server_salt"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01b5 }
            r4.value(r0)     // Catch:{ all -> 0x01b5 }
            r4.endObject()     // Catch:{ all -> 0x01b5 }
            if (r13 == 0) goto L_0x01b1
            java.lang.String r0 = "files"
            r4.name(r0)     // Catch:{ all -> 0x01b5 }
            r4.beginArray()     // Catch:{ all -> 0x01b5 }
            r7 = 0
        L_0x011a:
            r11.throwIfCanceled()     // Catch:{ all -> 0x01a7 }
            X.9uW r0 = r10.A02     // Catch:{ all -> 0x01a7 }
            X.9zK r0 = r0.A00     // Catch:{ all -> 0x01a7 }
            r9 = 1000(0x3e8, float:1.401E-42)
            X.A0s r0 = r0.A00     // Catch:{ all -> 0x01a7 }
            X.1at r8 = r0.A01()     // Catch:{ all -> 0x01a7 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01a0 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x01a0 }
            java.lang.String r5 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC  LIMIT ?, ?"
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x01a0 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01a0 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x01a0 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x01a0 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_ALL_PAGED"
            android.database.Cursor r5 = X.C18070vi.A04(r6, r5, r0, r2)     // Catch:{ all -> 0x01a0 }
            X.9vY r2 = X.C199039zK.A01     // Catch:{ all -> 0x01a0 }
            r1 = 2
            X.ARn r0 = new X.ARn     // Catch:{ all -> 0x01a0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x01a0 }
            X.Akw r6 = new X.Akw     // Catch:{ all -> 0x01a0 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x01a0 }
            r8.close()     // Catch:{ all -> 0x01a7 }
            r5 = 0
        L_0x0159:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x018b
            r11.throwIfCanceled()     // Catch:{ all -> 0x0196 }
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0196 }
            X.9gH r1 = (X.C187729gH) r1     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = r1.A03     // Catch:{ all -> 0x0196 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x0188
            java.lang.String r1 = r1.A04     // Catch:{ all -> 0x0196 }
            r4.beginObject()     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "path"
            r4.name(r0)     // Catch:{ all -> 0x0196 }
            r4.value(r1)     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "iv"
            r4.name(r0)     // Catch:{ all -> 0x0196 }
            r4.value(r2)     // Catch:{ all -> 0x0196 }
            r4.endObject()     // Catch:{ all -> 0x0196 }
        L_0x0188:
            int r5 = r5 + 1
            goto L_0x0159
        L_0x018b:
            r6.close()     // Catch:{ all -> 0x01a7 }
            int r7 = r7 + 1000
            if (r5 > 0) goto L_0x011a
            r4.endArray()     // Catch:{ all -> 0x01b5 }
            goto L_0x01b1
        L_0x0196:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x019b }
            goto L_0x019f
        L_0x019b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01a7 }
        L_0x019f:
            throw r1     // Catch:{ all -> 0x01a7 }
        L_0x01a0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r1 = move-exception
            r4.endArray()     // Catch:{ all -> 0x01ac }
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01b5 }
        L_0x01b0:
            throw r1     // Catch:{ all -> 0x01b5 }
        L_0x01b1:
            r3.close()
            return
        L_0x01b5:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x01ba }
            throw r2
        L_0x01ba:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)
            throw r2
        L_0x01bf:
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = "Active encryption key info is missing."
            X.8vV r2 = new X.8vV
            r2.<init>((int) r1, (java.lang.String) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196169uZ.A03(android.os.CancellationSignal, java.util.zip.ZipOutputStream, boolean):void");
    }

    public C196169uZ(AnonymousClass11S r1, AnonymousClass11P r2, A0A a0a, C196129uV r4, C196139uW r5, AnonymousClass19K r6, SecureRandom secureRandom) {
        this.A03 = r2;
        this.A00 = r1;
        this.A01 = r4;
        this.A05 = r6;
        this.A06 = secureRandom;
        this.A04 = a0a;
        this.A02 = r5;
    }

    public boolean A04(UserJid userJid, C187719gG r9) {
        long abs = Math.abs(System.currentTimeMillis() - r9.A00);
        boolean A1O = AnonymousClass000.A1O(userJid.equals(r9.A01) ? 1 : 0);
        boolean A19 = C108975cc.A19((abs > 604800000 ? 1 : (abs == 604800000 ? 0 : -1)));
        if (!A1O || !A19) {
            return false;
        }
        return true;
    }
}
