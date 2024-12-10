package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.73X  reason: invalid class name */
public final class AnonymousClass73X {
    public final C132526mx A00;
    public final AnonymousClass1NM A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05 = C217517g.A00(16387);
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A04(X.AnonymousClass1BI r9, X.AnonymousClass206 r10, java.io.File r11, java.io.File r12) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.String r0 = r11.getAbsolutePath()
            java.lang.String r1 = X.C64062u9.A09(r0)
            java.lang.String r0 = "opus"
            boolean r1 = X.C18070vi.A18(r1, r0)
            java.lang.String r0 = "Invalid file type for voice note file. Use opus"
            X.C17960vV.A0G(r1, r0)
            java.lang.String r1 = "mounted"
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00a2
            java.io.File r4 = A00(r9, r8)
            if (r4 == 0) goto L_0x00a2
            java.io.File r3 = A01(r9, r8)
            java.lang.String r7 = ":;:"
            if (r10 != 0) goto L_0x0056
            java.io.File r2 = A02(r9, r8)
            if (r2 == 0) goto L_0x0042
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x0042
            r2.delete()
        L_0x0042:
            X.1NM r1 = r8.A01
            boolean r0 = X.C64062u9.A0N(r1, r11, r4)
            if (r0 == 0) goto L_0x00a2
            if (r12 == 0) goto L_0x0051
            if (r3 == 0) goto L_0x0051
            X.C64062u9.A0N(r1, r12, r3)
        L_0x0051:
            android.util.Pair r0 = X.C108945cZ.A0N(r4, r3)
            return r0
        L_0x0056:
            java.io.File r6 = A02(r9, r8)
            if (r6 != 0) goto L_0x0062
            java.lang.String r0 = "draftvoicenotecache/savequotedmessage/quoted message file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0042
        L_0x0062:
            X.205 r2 = r10.A0v
            X.C18070vi.A0W(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x009b }
            X.1BI r0 = r2.A00     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = X.C22971Dz.A06(r0)     // Catch:{ IOException -> 0x009b }
            r1.append(r0)     // Catch:{ IOException -> 0x009b }
            r1.append(r7)     // Catch:{ IOException -> 0x009b }
            boolean r0 = r2.A02     // Catch:{ IOException -> 0x009b }
            r1.append(r0)     // Catch:{ IOException -> 0x009b }
            r1.append(r7)     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x009b }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x009b }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r6)     // Catch:{ IOException -> 0x009b }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ all -> 0x0094 }
            r2.write(r0)     // Catch:{ all -> 0x0094 }
            r2.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x0042
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x009b }
            throw r0     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/savequotedmessage/ "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0042
        L_0x00a2:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r5, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73X.A04(X.1BI, X.206, java.io.File, java.io.File):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C128816gj A05(X.AnonymousClass1BI r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Boolean r0 = X.C17960vV.A01
            java.io.File r5 = A00(r12, r11)
            if (r5 == 0) goto L_0x007f
            boolean r0 = r5.exists()
            r9 = 1
            if (r0 != r9) goto L_0x007f
            java.io.File r4 = A01(r12, r11)
            java.io.File r1 = A02(r12, r11)
            r10 = 0
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.exists()
            if (r0 != r9) goto L_0x0078
            java.io.FileInputStream r0 = X.C108945cZ.A18(r1)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
            r8.<init>(r0)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
            long r0 = r1.length()     // Catch:{ all -> 0x0067 }
            int r2 = (int) r0     // Catch:{ all -> 0x0067 }
            byte[] r0 = new byte[r2]     // Catch:{ all -> 0x0067 }
            r8.readFully(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = ":;:"
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0067 }
            r7 = 2
            r0 = 4
            java.util.List r6 = X.AnonymousClass1YF.A0S(r3, r1, r0)     // Catch:{ all -> 0x0067 }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = X.C17880vN.A0w(r6, r2)     // Catch:{ all -> 0x0067 }
            X.1BI r3 = r1.A02(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = X.C17880vN.A0w(r6, r9)     // Catch:{ all -> 0x0067 }
            boolean r2 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = X.C17880vN.A0w(r6, r7)     // Catch:{ all -> 0x0067 }
            X.205 r1 = new X.205     // Catch:{ all -> 0x0067 }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x0067 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
            goto L_0x0079
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
            throw r0     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0072 }
        L_0x006e:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/getquotedmessagekey/ "
            goto L_0x0075
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/getquotedmessagekey/"
        L_0x0075:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0078:
            r1 = r10
        L_0x0079:
            X.6gj r0 = new X.6gj
            r0.<init>(r1, r5, r4)
            return r0
        L_0x007f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73X.A05(X.1BI):X.6gj");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C64062u9.A0Q(r0) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass1BI r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Boolean r0 = X.C17960vV.A01
            java.io.File r0 = A00(r5, r4)
            java.io.File r1 = A01(r5, r4)
            if (r0 == 0) goto L_0x0017
            boolean r0 = X.C64062u9.A0Q(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            X.C64062u9.A0Q(r1)
        L_0x001d:
            java.io.File r2 = A02(r5, r4)
            if (r2 == 0) goto L_0x002d
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x002d
            r2.delete()
        L_0x002d:
            if (r3 == 0) goto L_0x003f
            X.00H r0 = r4.A05
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 33
            X.4om r0 = new X.4om
            r0.<init>(r5, r1)
            r2.notifyAllObservers(r0)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73X.A06(X.1BI):void");
    }

    public static final File A03(AnonymousClass73X r4) {
        File A002 = C124296Xu.A00(C108945cZ.A0E(r4.A03), r4.A04, r4.A06, "Cached Voice Notes");
        if (A002 == null) {
            Log.e("draftvoicenotecache/getcachedvoicenotefile/problem creating directory ");
        }
        return A002;
    }

    public AnonymousClass73X(AnonymousClass1NM r3, AnonymousClass11P r4, AnonymousClass118 r5, AnonymousClass1NN r6, C18030ve r7, C132526mx r8, AnonymousClass00H r9) {
        C18070vi.A0w(r5, r4, r7, r8, r3);
        C18070vi.A0l(r9, r6);
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r7;
        this.A00 = r8;
        this.A01 = r3;
        this.A06 = r9;
        r6.registerObserver(new AnonymousClass7FG(this, 3));
    }

    public static final File A00(AnonymousClass1BI r5, AnonymousClass73X r6) {
        File A032 = A03(r6);
        if (A032 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1J(r5, A1b, 0);
        A1b[1] = "opus";
        return C17880vN.A0e(A032, C108955ca.A12(locale, "%s.%s", Arrays.copyOf(A1b, 2)));
    }

    public static final File A01(AnonymousClass1BI r5, AnonymousClass73X r6) {
        File A032 = A03(r6);
        if (A032 == null) {
            return null;
        }
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1J(r5, A1b, 0);
        A1b[1] = "viz";
        return C17880vN.A0e(A032, C108955ca.A12(locale, "%s.%s", Arrays.copyOf(A1b, 2)));
    }

    public static final File A02(AnonymousClass1BI r4, AnonymousClass73X r5) {
        File A032 = A03(r5);
        if (A032 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1J(r4, A1a, 0);
        return C17880vN.A0e(A032, C108955ca.A12(locale, "%s.txt", Arrays.copyOf(A1a, 1)));
    }
}
