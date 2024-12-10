package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9wp  reason: invalid class name and case insensitive filesystem */
public abstract class C197519wp {
    public static final C002100z A00 = new C002100z(16);
    public static final AnonymousClass00O A01 = new AnonymousClass00O(0);
    public static final Object A02 = C17880vN.A0p();
    public static final ExecutorService A03;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r6 = r9.authority;
        r9 = X.AnonymousClass000.A13();
        r8 = new android.net.Uri.Builder().scheme("content").authority(r6).build();
        r15 = new android.net.Uri.Builder().scheme("content").authority(r6).appendPath("file").build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        r7 = new X.AGR(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        r7 = new X.AGS(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r14 = new java.lang.String[7];
        r14[0] = "_id";
        r14[1] = "file_id";
        r14[2] = "font_ttc_index";
        r14[3] = "font_variation_settings";
        X.C72453Mb.A1T("font_weight", "font_italic", r14);
        r14[6] = "result_code";
        r5 = r7.CD8(r8, r14, new java.lang.String[]{r0.A03});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0101, code lost:
        if (r5 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        if (r5.getCount() <= 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        r4 = r5.getColumnIndex("result_code");
        r9 = X.AnonymousClass000.A13();
        r14 = r5.getColumnIndex("_id");
        r3 = r5.getColumnIndex("file_id");
        r2 = r5.getColumnIndex("font_ttc_index");
        r1 = r5.getColumnIndex("font_weight");
        r0 = r5.getColumnIndex("font_italic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
        if (r5.moveToNext() == false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012c, code lost:
        if (r4 == -1) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        r20 = r5.getInt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        if (r2 == -1) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        r18 = r5.getInt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013e, code lost:
        if (r3 != -1) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0140, code lost:
        r17 = android.content.ContentUris.withAppendedId(r8, r5.getLong(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        r17 = android.content.ContentUris.withAppendedId(r15, r5.getLong(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0152, code lost:
        if (r1 == -1) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0154, code lost:
        r19 = r5.getInt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        r19 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015b, code lost:
        if (r0 == -1) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0162, code lost:
        if (r5.getInt(r0) == 1) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        r9.add(new X.C187099fG(r17, r18, r19, r20, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        r7.close();
        r2 = new X.AnonymousClass9ZP((X.C187099fG[]) r9.toArray(new X.C187099fG[0]), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0186, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018c, code lost:
        r7.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61312pT A00(android.content.Context r20, X.C191219mD r21, java.lang.String r22, int r23) {
        /*
            X.00z r10 = A00
            r0 = r22
            java.lang.Object r2 = r10.A04(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 != 0) goto L_0x01e1
            r8 = 0
            r13 = r20
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01c6 }
            r13.getResources()     // Catch:{ NameNotFoundException -> 0x01c6 }
            r0 = r21
            java.lang.String r4 = r0.A01     // Catch:{ NameNotFoundException -> 0x01c6 }
            r11 = 0
            android.content.pm.ProviderInfo r9 = r5.resolveContentProvider(r4, r11)     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r9 == 0) goto L_0x019e
            java.lang.String r3 = r9.packageName     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r2 = r0.A02     // Catch:{ NameNotFoundException -> 0x01c6 }
            boolean r1 = r3.equals(r2)     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r1 == 0) goto L_0x01ae
            r1 = 64
            android.content.pm.PackageInfo r1 = r5.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.content.pm.Signature[] r4 = r1.signatures     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ NameNotFoundException -> 0x01c6 }
            int r3 = r4.length     // Catch:{ NameNotFoundException -> 0x01c6 }
            r2 = 0
        L_0x0039:
            if (r2 >= r3) goto L_0x0047
            r1 = r4[r2]     // Catch:{ NameNotFoundException -> 0x01c6 }
            byte[] r1 = r1.toByteArray()     // Catch:{ NameNotFoundException -> 0x01c6 }
            r7.add(r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0047:
            java.util.Comparator r6 = X.C181979So.A00     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.Collections.sort(r7, r6)     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.List r5 = r0.A04     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r5 != 0) goto L_0x0054
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x0054:
            int r1 = r5.size()     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r11 >= r1) goto L_0x0190
            java.lang.Object r1 = r5.get(r11)     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.ArrayList r4 = X.C17880vN.A10(r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.util.Collections.sort(r4, r6)     // Catch:{ NameNotFoundException -> 0x01c6 }
            int r2 = r7.size()     // Catch:{ NameNotFoundException -> 0x01c6 }
            int r1 = r4.size()     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r2 != r1) goto L_0x008d
            r3 = 0
        L_0x0072:
            int r1 = r7.size()     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r3 >= r1) goto L_0x0090
            java.lang.Object r2 = r7.get(r3)     // Catch:{ NameNotFoundException -> 0x01c6 }
            byte[] r2 = (byte[]) r2     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.Object r1 = r4.get(r3)     // Catch:{ NameNotFoundException -> 0x01c6 }
            byte[] r1 = (byte[]) r1     // Catch:{ NameNotFoundException -> 0x01c6 }
            boolean r1 = java.util.Arrays.equals(r2, r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            if (r1 == 0) goto L_0x008d
            int r3 = r3 + 1
            goto L_0x0072
        L_0x008d:
            int r11 = r11 + 1
            goto L_0x0054
        L_0x0090:
            java.lang.String r6 = r9.authority     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r4 = "result_code"
            java.lang.String r11 = "font_italic"
            java.lang.String r1 = "font_weight"
            java.lang.String r2 = "font_ttc_index"
            java.lang.String r3 = "file_id"
            java.lang.String r12 = "_id"
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01c6 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r7 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r7)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri$Builder r5 = r5.authority(r6)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri r8 = r5.build()     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01c6 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri$Builder r5 = r5.scheme(r7)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri$Builder r6 = r5.authority(r6)     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r5 = "file"
            android.net.Uri$Builder r5 = r6.appendPath(r5)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.net.Uri r15 = r5.build()     // Catch:{ NameNotFoundException -> 0x01c6 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x01c6 }
            r5 = 24
            if (r6 >= r5) goto L_0x00d8
            X.AGR r7 = new X.AGR     // Catch:{ NameNotFoundException -> 0x01c6 }
            r7.<init>(r13, r8)     // Catch:{ NameNotFoundException -> 0x01c6 }
            goto L_0x00dd
        L_0x00d8:
            X.AGS r7 = new X.AGS     // Catch:{ NameNotFoundException -> 0x01c6 }
            r7.<init>(r13, r8)     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x00dd:
            r5 = 7
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ all -> 0x0186 }
            r6 = 0
            r14[r6] = r12     // Catch:{ all -> 0x0186 }
            r5 = 1
            r14[r5] = r3     // Catch:{ all -> 0x0186 }
            r16 = 2
            r14[r16] = r2     // Catch:{ all -> 0x0186 }
            java.lang.String r17 = "font_variation_settings"
            r16 = 3
            r14[r16] = r17     // Catch:{ all -> 0x0186 }
            X.C72453Mb.A1T(r1, r11, r14)     // Catch:{ all -> 0x0186 }
            r16 = 6
            r14[r16] = r4     // Catch:{ all -> 0x0186 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0186 }
            r5[r6] = r0     // Catch:{ all -> 0x0186 }
            android.database.Cursor r5 = r7.CD8(r8, r14, r5)     // Catch:{ all -> 0x0186 }
            if (r5 == 0) goto L_0x0175
            int r0 = r5.getCount()     // Catch:{ all -> 0x0188 }
            if (r0 <= 0) goto L_0x0172
            int r4 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x0188 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0188 }
            int r14 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x0188 }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x0188 }
            int r2 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x0188 }
            int r1 = r5.getColumnIndex(r1)     // Catch:{ all -> 0x0188 }
            int r0 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x0188 }
        L_0x0125:
            boolean r11 = r5.moveToNext()     // Catch:{ all -> 0x0188 }
            if (r11 == 0) goto L_0x0172
            r11 = -1
            if (r4 == r11) goto L_0x0133
            int r20 = r5.getInt(r4)     // Catch:{ all -> 0x0188 }
            goto L_0x0135
        L_0x0133:
            r20 = 0
        L_0x0135:
            if (r2 == r11) goto L_0x013c
            int r18 = r5.getInt(r2)     // Catch:{ all -> 0x0188 }
            goto L_0x013e
        L_0x013c:
            r18 = 0
        L_0x013e:
            if (r3 != r11) goto L_0x0149
            long r11 = r5.getLong(r14)     // Catch:{ all -> 0x0188 }
            android.net.Uri r17 = android.content.ContentUris.withAppendedId(r8, r11)     // Catch:{ all -> 0x0188 }
            goto L_0x0151
        L_0x0149:
            long r11 = r5.getLong(r3)     // Catch:{ all -> 0x0188 }
            android.net.Uri r17 = android.content.ContentUris.withAppendedId(r15, r11)     // Catch:{ all -> 0x0188 }
        L_0x0151:
            r11 = -1
            if (r1 == r11) goto L_0x0159
            int r19 = r5.getInt(r1)     // Catch:{ all -> 0x0188 }
            goto L_0x015b
        L_0x0159:
            r19 = 400(0x190, float:5.6E-43)
        L_0x015b:
            if (r0 == r11) goto L_0x0164
            int r12 = r5.getInt(r0)     // Catch:{ all -> 0x0188 }
            r11 = 1
            if (r12 == r11) goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            X.9fG r12 = new X.9fG     // Catch:{ all -> 0x0188 }
            r21 = r11
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0188 }
            r9.add(r12)     // Catch:{ all -> 0x0188 }
            goto L_0x0125
        L_0x0172:
            r5.close()     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x0175:
            r7.close()     // Catch:{ NameNotFoundException -> 0x01c6 }
            X.9fG[] r0 = new X.C187099fG[r6]     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.Object[] r0 = r9.toArray(r0)     // Catch:{ NameNotFoundException -> 0x01c6 }
            X.9fG[] r0 = (X.C187099fG[]) r0     // Catch:{ NameNotFoundException -> 0x01c6 }
            X.9ZP r2 = new X.9ZP     // Catch:{ NameNotFoundException -> 0x01c6 }
            r2.<init>(r0, r6)     // Catch:{ NameNotFoundException -> 0x01c6 }
            goto L_0x0196
        L_0x0186:
            r1 = move-exception
            goto L_0x018c
        L_0x0188:
            r1 = move-exception
            r5.close()     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x018c:
            r7.close()     // Catch:{ NameNotFoundException -> 0x01c6 }
            goto L_0x01c5
        L_0x0190:
            r0 = 1
            X.9ZP r2 = new X.9ZP     // Catch:{ NameNotFoundException -> 0x01c6 }
            r2.<init>(r8, r0)     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x0196:
            int r1 = r2.A00
            r4 = -3
            r0 = 1
            if (r1 == 0) goto L_0x01e7
            r0 = -2
            goto L_0x01f9
        L_0x019e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r0 = "No package found for authority: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01c6 }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01c6 }
            goto L_0x01c5
        L_0x01ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r0 = "Found content provider "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x01c6 }
            r1.append(r4)     // Catch:{ NameNotFoundException -> 0x01c6 }
            java.lang.String r0 = ", but package was not "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ NameNotFoundException -> 0x01c6 }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01c6 }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x01c5:
            throw r1     // Catch:{ NameNotFoundException -> 0x01c6 }
        L_0x01c6:
            r1 = -1
            X.2pT r0 = new X.2pT
            r0.<init>((int) r1)
            return r0
        L_0x01cd:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x01ef
            X.1bx r0 = X.C29271bw.A01
            r1 = r23
            android.graphics.Typeface r2 = r0.A05(r13, r3, r1)
            r0 = -3
            if (r2 == 0) goto L_0x01f9
            r0 = r22
            r10.A08(r0, r2)
        L_0x01e1:
            X.2pT r1 = new X.2pT
            r1.<init>((android.graphics.Typeface) r2)
            return r1
        L_0x01e7:
            X.9fG[] r3 = r2.A01
            if (r3 == 0) goto L_0x01f9
            int r2 = r3.length
            if (r2 == 0) goto L_0x01f9
            r1 = 0
        L_0x01ef:
            r0 = r3[r1]
            int r0 = r0.A00
            if (r0 == 0) goto L_0x01cd
            if (r0 < 0) goto L_0x01f8
            r4 = r0
        L_0x01f8:
            r0 = r4
        L_0x01f9:
            X.2pT r1 = new X.2pT
            r1.<init>((int) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197519wp.A00(android.content.Context, X.9mD, java.lang.String, int):X.2pT");
    }
}
