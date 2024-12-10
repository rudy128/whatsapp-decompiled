package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.6L3  reason: invalid class name */
public final class AnonymousClass6L3 extends C24741Lm implements AnonymousClass893 {
    public File A00;
    public Executor A01;
    public final AnonymousClass190 A02;
    public final C18030ve A03;
    public final C116065wK A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final C32081gb A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final AnonymousClass10I A09;
    public final String A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A01(X.AnonymousClass6L3 r10) {
        /*
            monitor-enter(r10)
            boolean r0 = X.C22781De.A03()     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00db
            boolean r0 = r10.A0B     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00db
            r10.A0A()     // Catch:{ all -> 0x00dd }
            java.io.File r6 = A00(r10)     // Catch:{ all -> 0x00dd }
            r4 = 1
            if (r6 == 0) goto L_0x00d9
            boolean r0 = r6.exists()     // Catch:{ all -> 0x00dd }
            if (r0 != r4) goto L_0x00d9
            java.lang.String r9 = "file"
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x00c7 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00c7 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00c7 }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00c7 }
            r2.beginObject()     // Catch:{ all -> 0x00c0 }
        L_0x002e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c0 }
            r8 = 0
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = "mappings"
            java.lang.String r0 = r2.nextName()     // Catch:{ all -> 0x00c0 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x002e
            r2.beginArray()     // Catch:{ all -> 0x00c0 }
        L_0x0044:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0081
            r2.beginObject()     // Catch:{ all -> 0x00c0 }
            r7 = r8
            r3 = r8
        L_0x004f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = r2.nextName()     // Catch:{ all -> 0x00c0 }
            boolean r0 = X.C18070vi.A18(r1, r9)     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r7 = r2.nextString()     // Catch:{ all -> 0x00c0 }
            goto L_0x004f
        L_0x0064:
            java.lang.String r0 = "url"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r3 = r2.nextString()     // Catch:{ all -> 0x00c0 }
            goto L_0x004f
        L_0x0071:
            r2.endObject()     // Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x008c
            X.6gA r0 = new X.6gA     // Catch:{ all -> 0x00c0 }
            r0.<init>(r7, r8, r3)     // Catch:{ all -> 0x00c0 }
            r5.add(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x0044
        L_0x0081:
            r2.endArray()     // Catch:{ all -> 0x00c0 }
            goto L_0x002e
        L_0x0085:
            java.lang.String r0 = "field not found: file"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x0092
        L_0x008c:
            java.lang.String r0 = "field not found: url"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x00c0 }
        L_0x0092:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x0093:
            r2.endObject()     // Catch:{ all -> 0x00c0 }
            r2.close()     // Catch:{ IOException -> 0x00c7 }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ IOException -> 0x00c7 }
        L_0x009d:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00c7 }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x00c7 }
            X.6gA r2 = (X.C128506gA) r2     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r0 = r2.A00     // Catch:{ IOException -> 0x00c7 }
            boolean r0 = X.C108975cc.A1M(r0)     // Catch:{ IOException -> 0x00c7 }
            if (r0 == 0) goto L_0x009d
            X.5wK r1 = r10.A04     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x00c7 }
            r1.A0F(r0, r2)     // Catch:{ IOException -> 0x00c7 }
            goto L_0x009d
        L_0x00b9:
            r5.size()     // Catch:{ IOException -> 0x00c7 }
            r6.getAbsolutePath()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00d9
        L_0x00c0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x00c7 }
            throw r0     // Catch:{ IOException -> 0x00c7 }
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "DiskBackedGifCache/init/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00dd }
            X.190 r3 = r10.A02     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "DiskBackedGifCache/load-error"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dd }
            r0 = 0
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x00dd }
        L_0x00d9:
            r10.A0B = r4     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r10)
            return
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L3.A01(X.6L3):void");
    }

    public final synchronized Executor A0A() {
        Executor executor;
        executor = this.A01;
        if (executor == null) {
            executor = C200710s.A00(this.A09);
            this.A01 = executor;
        }
        return executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r6.A04.A00.get() < (java.lang.System.currentTimeMillis() - 60000)) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void C9L(X.C122516Qr r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L_0x0017
            X.5wK r0 = r6.A04     // Catch:{ all -> 0x002d }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A00     // Catch:{ all -> 0x002d }
            long r4 = r0.get()     // Catch:{ all -> 0x002d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002d }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
        L_0x0017:
            X.5wK r2 = r6.A04     // Catch:{ all -> 0x002d }
            r0 = 0
            r2.A0D(r0)     // Catch:{ all -> 0x002d }
            X.1N0 r1 = r2.A02     // Catch:{ all -> 0x002d }
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x002d }
            r0 = 0
            r6.A0B = r0     // Catch:{ all -> 0x002d }
            X.1gb r0 = r6.A06     // Catch:{ all -> 0x002d }
            r2.A0D(r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r6)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6L3.C9L(X.6Qr, boolean):void");
    }

    public static final File A00(AnonymousClass6L3 r4) {
        String str;
        File file = r4.A00;
        if (file != null && file.exists()) {
            return r4.A00;
        }
        File externalCacheDir = r4.A08.A00.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            str = "DiskBackedGifCache/getmappingfile/external cache dir doesn't exit";
        } else {
            File A0e = C17880vN.A0e(externalCacheDir, "gif/gif_cache_mem_store");
            if (A0e.exists() || A0e.mkdirs()) {
                File A0e2 = C17880vN.A0e(A0e, r4.A0A);
                r4.A00 = A0e2;
                return A0e2;
            }
            str = "DiskBackedGifCache/getmappingfile/disk cache dir doesn't exit";
        }
        Log.e(str);
        return null;
    }

    public C128506gA BM6(String str) {
        if (str == null) {
            return null;
        }
        A01(this);
        return this.A04.A0G(str);
    }

    public void CD1(C128506gA r3, String str) {
        if (str != null) {
            A01(this);
            this.A04.A0F(str, r3);
            A0A().execute(C146747Ql.A00(this, 47));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1Lm, X.1Mz, X.5wK] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6L3(AnonymousClass190 r6, C125086aT r7, AnonymousClass11P r8, AnonymousClass118 r9, C18030ve r10, C24571Kv r11, AnonymousClass10I r12, String str, int i) {
        super(r11);
        C18070vi.A0w(r8, r11, r9, r6, r12);
        C18070vi.A0l(r10, r7);
        this.A07 = r8;
        this.A08 = r9;
        this.A02 = r6;
        this.A09 = r12;
        this.A03 = r10;
        this.A0A = str;
        AnonymousClass7DF r4 = new AnonymousClass7DF(this);
        this.A06 = r4;
        AnonymousClass10E r1 = r7.A00.A00;
        C24571Kv r3 = (C24571Kv) r1.ABZ.get();
        AnonymousClass11N r2 = (AnonymousClass11N) r1.A96.get();
        C18070vi.A0j(r3, r2);
        ? r0 = new C25131Mz(r2, r3, "gifmemorycache", i);
        r0.A09();
        this.A04 = r0;
        r0.A0D(r4);
        A09();
    }

    public String BZc() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A14(A10, this.A0A);
        AnonymousClass1N0 r1 = this.A04.A02;
        A10.append(r1.A02());
        A10.append('/');
        return C17880vN.A0t(A10, r1.A01());
    }
}
