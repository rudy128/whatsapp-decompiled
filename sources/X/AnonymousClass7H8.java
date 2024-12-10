package X;

import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;

/* renamed from: X.7H8  reason: invalid class name */
public abstract class AnonymousClass7H8 implements C160878Ah {
    public Cursor A00;
    public boolean A01;
    public boolean A02;
    public final Uri A03;
    public final WamediaManager A04;
    public final AnonymousClass11B A05;
    public final String A06;
    public final int A07;
    public final C002100z A08;
    public final C18030ve A09;
    public final AnonymousClass1Q5 A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.8B2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.8B2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.8B2} */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r24v5, types: [X.7H1] */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r24v6, types: [X.65a] */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0244, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0245, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0246, code lost:
        com.whatsapp.util.Log.e("MediaList/getMedia/StaleDataException", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0217, code lost:
        if (r8 != 81) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x023a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023f, code lost:
        com.whatsapp.util.Log.e("MediaList/getMedia/IllegalStateException", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass8B2 A01(int r37) {
        /*
            r36 = this;
            r4 = 0
            r3 = r36
            monitor-enter(r3)     // Catch:{ StaleDataException -> 0x0245, IllegalStateException -> 0x023e }
            android.database.Cursor r0 = r3.A00     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0239
            boolean r1 = r3.A01     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x0021
            boolean r1 = r0.isClosed()     // Catch:{ all -> 0x023b }
            r0 = 1
            if (r1 == r0) goto L_0x0239
            android.database.Cursor r0 = r3.A00     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x001a
            r0.requery()     // Catch:{ all -> 0x023b }
        L_0x001a:
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x023b }
            android.database.Cursor r0 = r3.A00     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0239
        L_0x0021:
            r11 = r37
            boolean r1 = r0.moveToPosition(r11)     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x0239
            boolean r1 = r0.isClosed()     // Catch:{ all -> 0x023b }
            if (r1 != 0) goto L_0x0239
            boolean r1 = r3 instanceof X.C1187965b     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x009a
            r5 = r3
            X.65b r5 = (X.C1187965b) r5     // Catch:{ all -> 0x023b }
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x023b }
            r6 = 1
            java.lang.String r15 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 2
            long r19 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r7 = 0
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0054
            r6 = 6
            long r19 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
        L_0x0054:
            r6 = 5
            java.lang.String r16 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 7
            long r21 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            if (r15 == 0) goto L_0x0088
            com.whatsapp.media.WamediaManager r6 = r5.A04     // Catch:{ all -> 0x023b }
            java.io.File r0 = X.C108945cZ.A17(r15)     // Catch:{ all -> 0x023b }
            boolean r0 = r6.hasGifTag(r0)     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x0088
            X.11B r14 = r5.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r13 = r5.A02(r1)     // Catch:{ all -> 0x023b }
            r0 = 3
            X.C18070vi.A0d(r13, r0)     // Catch:{ all -> 0x023b }
            X.65Y r12 = new X.65Y     // Catch:{ all -> 0x023b }
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19, r21)     // Catch:{ all -> 0x023b }
        L_0x007d:
            X.00z r1 = r3.A08     // Catch:{ all -> 0x023b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x023b }
            r1.A08(r0, r12)     // Catch:{ all -> 0x023b }
            goto L_0x0237
        L_0x0088:
            X.11B r14 = r5.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r13 = r5.A02(r1)     // Catch:{ all -> 0x023b }
            boolean r0 = r5.A00     // Catch:{ all -> 0x023b }
            X.65a r12 = new X.65a     // Catch:{ all -> 0x023b }
            r17 = r1
            r23 = r0
            r12.<init>(r13, r14, r15, r16, r17, r19, r21, r23)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x009a:
            boolean r1 = r3 instanceof X.AnonymousClass65e     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x00e1
            r5 = r3
            X.65e r5 = (X.AnonymousClass65e) r5     // Catch:{ all -> 0x023b }
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x023b }
            r6 = 2
            long r20 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r7 = 0
            int r6 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ba
            r6 = 7
            long r20 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r6
        L_0x00ba:
            X.11B r14 = r5.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r13 = r5.A02(r1)     // Catch:{ all -> 0x023b }
            r6 = 1
            java.lang.String r15 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 6
            java.lang.String r16 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 4
            int r17 = r0.getInt(r6)     // Catch:{ all -> 0x023b }
            r6 = 8
            long r22 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            boolean r0 = r5.A00     // Catch:{ all -> 0x023b }
            X.65Z r12 = new X.65Z     // Catch:{ all -> 0x023b }
            r18 = r1
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x00e1:
            boolean r1 = r3 instanceof X.AnonymousClass65d     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x0124
            r5 = 0
            long r1 = r0.getLong(r5)     // Catch:{ all -> 0x023b }
            r6 = 2
            long r20 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r7 = 0
            int r6 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00fe
            r6 = 7
            long r20 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r6
        L_0x00fe:
            X.11B r14 = r3.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r13 = r3.A02(r1)     // Catch:{ all -> 0x023b }
            r6 = 1
            java.lang.String r15 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 6
            java.lang.String r16 = r0.getString(r6)     // Catch:{ all -> 0x023b }
            r6 = 4
            int r17 = r0.getInt(r6)     // Catch:{ all -> 0x023b }
            r6 = 8
            long r22 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            X.65Z r12 = new X.65Z     // Catch:{ all -> 0x023b }
            r18 = r1
            r24 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x0124:
            boolean r1 = r3 instanceof X.AnonymousClass65f     // Catch:{ all -> 0x023b }
            if (r1 == 0) goto L_0x01ee
            r7 = r3
            X.65f r7 = (X.AnonymousClass65f) r7     // Catch:{ all -> 0x023b }
            r2 = 0
            boolean r1 = r0.isClosed()     // Catch:{ all -> 0x023b }
            r10 = 0
            if (r1 != 0) goto L_0x0219
            long r1 = r0.getLong(r2)     // Catch:{ all -> 0x023b }
            r9 = 1
            java.lang.String r15 = r0.getString(r9)     // Catch:{ all -> 0x023b }
            r5 = 5
            long r20 = r0.getLong(r5)     // Catch:{ all -> 0x023b }
            r12 = 0
            int r5 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0150
            r5 = 4
            long r20 = r0.getLong(r5)     // Catch:{ all -> 0x023b }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r5
        L_0x0150:
            r5 = 2
            java.lang.String r6 = r0.getString(r5)     // Catch:{ all -> 0x023b }
            r8 = 3
            int r5 = r0.getInt(r8)     // Catch:{ all -> 0x023b }
            r12 = 7
            long r22 = r0.getLong(r12)     // Catch:{ all -> 0x023b }
            if (r15 == 0) goto L_0x0165
            java.io.File r10 = X.C108945cZ.A17(r15)     // Catch:{ all -> 0x023b }
        L_0x0165:
            if (r5 != r8) goto L_0x018e
            com.whatsapp.media.WamediaManager r0 = r7.A04     // Catch:{ all -> 0x023b }
            boolean r0 = r0.hasGifTag(r10)     // Catch:{ all -> 0x023b }
            if (r0 != 0) goto L_0x01ad
            X.11B r5 = r7.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r25 = r7.A02(r1)     // Catch:{ all -> 0x023b }
            boolean r0 = r7.A00     // Catch:{ all -> 0x023b }
            X.65a r12 = new X.65a     // Catch:{ all -> 0x023b }
            r24 = r12
            r26 = r5
            r27 = r15
            r28 = r6
            r29 = r1
            r31 = r20
            r33 = r22
            r35 = r0
            r24.<init>(r25, r26, r27, r28, r29, r31, r33, r35)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x018e:
            java.lang.String r5 = "image/gif"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x023b }
            if (r5 == 0) goto L_0x01d3
            if (r10 == 0) goto L_0x01d3
            X.DRK.A04(r10)     // Catch:{ IOException -> 0x01d3 }
            X.6gF r5 = X.DRK.A04(r10)     // Catch:{ IOException -> 0x01cd, OutOfMemoryError -> 0x01a7 }
            boolean r5 = r5.A02     // Catch:{ IOException -> 0x01cd, OutOfMemoryError -> 0x01a7 }
            r5 = r5 ^ 1
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x01d3
            goto L_0x01ad
        L_0x01a7:
            r5 = move-exception
            java.lang.String r0 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x023b }
        L_0x01ad:
            X.11B r5 = r7.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r0 = r7.A02(r1)     // Catch:{ all -> 0x023b }
            X.C18070vi.A0d(r0, r8)     // Catch:{ all -> 0x023b }
            X.65Y r12 = new X.65Y     // Catch:{ all -> 0x023b }
            r24 = r12
            r25 = r0
            r26 = r5
            r27 = r15
            r28 = r6
            r29 = r1
            r31 = r20
            r33 = r22
            r24.<init>(r25, r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x01cd:
            r8 = move-exception
            java.lang.String r5 = "LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException"
            com.whatsapp.util.Log.e(r5, r8)     // Catch:{ all -> 0x023b }
        L_0x01d3:
            X.11B r5 = r7.A05     // Catch:{ all -> 0x023b }
            android.net.Uri r13 = r7.A02(r1)     // Catch:{ all -> 0x023b }
            r8 = 6
            int r17 = r0.getInt(r8)     // Catch:{ all -> 0x023b }
            boolean r0 = r7.A00     // Catch:{ all -> 0x023b }
            X.65Z r12 = new X.65Z     // Catch:{ all -> 0x023b }
            r14 = r5
            r16 = r6
            r18 = r1
            r24 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x01ee:
            r9 = 1
            java.lang.String r6 = r0.getString(r9)     // Catch:{ all -> 0x023b }
            if (r6 == 0) goto L_0x0219
            r1 = 2
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x023b }
            r5 = 5
            int r8 = r0.getInt(r5)     // Catch:{ all -> 0x023b }
            java.io.File r7 = X.C108945cZ.A17(r6)     // Catch:{ all -> 0x023b }
            if (r8 == r9) goto L_0x0206
            goto L_0x020d
        L_0x0206:
            X.64z r12 = new X.64z     // Catch:{ all -> 0x023b }
            r12.<init>(r4, r7, r1)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x020d:
            r5 = 3
            r6 = 6
            if (r8 == r5) goto L_0x0229
            r5 = 13
            if (r8 == r5) goto L_0x021b
            r5 = 81
            if (r8 == r5) goto L_0x0229
        L_0x0219:
            r12 = r4
            goto L_0x0237
        L_0x021b:
            long r17 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            X.652 r12 = new X.652     // Catch:{ all -> 0x023b }
            r13 = r4
            r14 = r7
            r15 = r1
            r12.<init>(r13, r14, r15, r17)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x0229:
            long r17 = r0.getLong(r6)     // Catch:{ all -> 0x023b }
            X.654 r12 = new X.654     // Catch:{ all -> 0x023b }
            r13 = r4
            r14 = r7
            r15 = r1
            r12.<init>(r13, r14, r15, r17)     // Catch:{ all -> 0x023b }
            goto L_0x007d
        L_0x0237:
            monitor-exit(r3)     // Catch:{ StaleDataException -> 0x0245, IllegalStateException -> 0x023e }
            return r12
        L_0x0239:
            monitor-exit(r3)     // Catch:{ StaleDataException -> 0x0245, IllegalStateException -> 0x023e }
            return r4
        L_0x023b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ StaleDataException -> 0x0245, IllegalStateException -> 0x023e }
            throw r0     // Catch:{ StaleDataException -> 0x0245, IllegalStateException -> 0x023e }
        L_0x023e:
            r1 = move-exception
            java.lang.String r0 = "MediaList/getMedia/IllegalStateException"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0245:
            r1 = move-exception
            java.lang.String r0 = "MediaList/getMedia/StaleDataException"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H8.A01(int):X.8B2");
    }

    public final Uri A02(long j) {
        try {
            Uri uri = this.A03;
            if (ContentUris.parseId(uri) == j) {
                return uri;
            }
            Log.e("MediaList/id mismatch");
            return uri;
        } catch (NumberFormatException unused) {
            Uri withAppendedId = ContentUris.withAppendedId(this.A03, j);
            C18070vi.A0b(withAppendedId);
            return withAppendedId;
        }
    }

    public final String A03() {
        String str;
        if (this.A07 == 1) {
            str = " ASC";
        } else {
            str = " DESC";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end");
        A10.append(str);
        return AnonymousClass001.A1H(", _id", str, A10);
    }

    public AnonymousClass8B2 BUY(int i) {
        AnonymousClass8B2 r1 = (AnonymousClass8B2) this.A08.A04(Integer.valueOf(i));
        if (r1 != null || C22781De.A03()) {
            return r1;
        }
        return A01(i);
    }

    public void CFP() {
        Cursor cursor;
        if ((this instanceof AnonymousClass65c) && (cursor = this.A00) != null) {
            cursor.deactivate();
            this.A01 = true;
        }
    }

    public void close() {
        try {
            Cursor cursor = this.A00;
            if (cursor != null) {
                cursor.deactivate();
                this.A01 = true;
            }
        } catch (IllegalStateException e) {
            Log.e("MediaList/exception while deactivating cursor", e);
        }
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.close();
        }
        this.A00 = null;
    }

    public int getCount() {
        Cursor cursor = this.A00;
        if (cursor == null) {
            return 0;
        }
        if (this.A01) {
            if (cursor.isClosed()) {
                return 0;
            }
            Cursor cursor2 = this.A00;
            if (cursor2 != null) {
                cursor2.requery();
            }
            this.A01 = false;
            cursor = this.A00;
            if (cursor == null) {
                return 0;
            }
        }
        return cursor.getCount();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass65c) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof AnonymousClass65c) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.65d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.65d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.65e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.65d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.65d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.65d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.65d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7H8(android.net.Uri r13, X.AnonymousClass11C r14, X.C18030ve r15, com.whatsapp.media.WamediaManager r16, X.AnonymousClass1Q5 r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r12 = this;
            r12.<init>()
            r12.A09 = r15
            r0 = r16
            r12.A04 = r0
            r0 = r17
            r12.A0A = r0
            r0 = 512(0x200, float:7.175E-43)
            X.00z r1 = new X.00z
            r1.<init>(r0)
            r12.A08 = r1
            X.11B r3 = X.C108955ca.A0d(r14)
            X.C18070vi.A0X(r3)
            r12.A05 = r3
            r0 = r19
            r12.A07 = r0
            r4 = r13
            r12.A03 = r13
            r0 = r18
            r12.A06 = r0
            r0 = r20
            r12.A02 = r0
            r0 = r12
            boolean r2 = r12 instanceof X.C1187965b
            if (r2 == 0) goto L_0x0058
            X.65b r0 = (X.C1187965b) r0
            X.11B r2 = r0.A05
            android.content.ContentResolver r2 = r2.A00
            android.net.Uri r3 = r0.A03
            java.lang.String[] r4 = X.C124376Yc.A00
            java.lang.String r5 = r0.A04()
            r6 = 0
            java.lang.String r7 = r0.A03()
            android.database.Cursor r0 = android.provider.MediaStore.Images.Media.query(r2, r3, r4, r5, r6, r7)
        L_0x004a:
            r12.A00 = r0
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "MediaList/createCursor returns null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0053:
            r0 = 0
            r1.A07(r0)
            return
        L_0x0058:
            boolean r2 = r12 instanceof X.AnonymousClass65e
            if (r2 == 0) goto L_0x0086
            X.65e r0 = (X.AnonymousClass65e) r0
            X.11B r2 = r0.A05
            android.content.ContentResolver r6 = r2.A00
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r8 = X.C124596Yy.A01
            java.lang.String r9 = r0.A04()
            java.lang.String r5 = r0.A06
            if (r5 == 0) goto L_0x0083
            java.lang.String[] r4 = X.C124596Yy.A00
            r3 = 2
            r2 = 3
            java.lang.String[] r10 = new java.lang.String[r2]
        L_0x0074:
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r10, r2, r3)
            r10[r3] = r5
        L_0x007a:
            java.lang.String r11 = r0.A03()
            android.database.Cursor r0 = android.provider.MediaStore.Images.Media.query(r6, r7, r8, r9, r10, r11)
            goto L_0x004a
        L_0x0083:
            java.lang.String[] r10 = X.C124596Yy.A00
            goto L_0x007a
        L_0x0086:
            boolean r2 = r12 instanceof X.AnonymousClass65d
            if (r2 == 0) goto L_0x00a7
            X.65d r0 = (X.AnonymousClass65d) r0
            X.11B r2 = r0.A05
            android.content.ContentResolver r6 = r2.A00
            android.net.Uri r7 = r0.A03
            java.lang.String[] r8 = X.C124586Yx.A01
            java.lang.String r9 = r0.A04()
            java.lang.String r5 = r0.A06
            if (r5 == 0) goto L_0x00a4
            java.lang.String[] r4 = X.C124586Yx.A00
            r3 = 1
            java.lang.String[] r10 = X.C17880vN.A1Z()
            goto L_0x0074
        L_0x00a4:
            java.lang.String[] r10 = X.C124586Yx.A00
            goto L_0x007a
        L_0x00a7:
            boolean r2 = r12 instanceof X.AnonymousClass65f
            if (r2 == 0) goto L_0x00ca
            X.65f r0 = (X.AnonymousClass65f) r0
            X.11B r3 = r0.A05
            android.net.Uri r4 = r0.A03
            java.lang.String[] r5 = X.C124356Ya.A00
            java.lang.String r6 = X.AnonymousClass65f.A00(r0)
            java.lang.String r2 = r0.A06
            if (r2 != 0) goto L_0x00c5
            r7 = 0
        L_0x00bc:
            java.lang.String r8 = r0.A03()
            android.database.Cursor r0 = r3.A03(r4, r5, r6, r7, r8)
            goto L_0x004a
        L_0x00c5:
            java.lang.String[] r7 = X.C108975cc.A1b(r2)
            goto L_0x00bc
        L_0x00ca:
            java.lang.String[] r5 = X.C124536Ys.A00
            r6 = 0
            java.lang.String r8 = r12.A03()
            r7 = r6
            android.database.Cursor r0 = r3.A03(r4, r5, r6, r7, r8)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H8.<init>(android.net.Uri, X.11C, X.0ve, com.whatsapp.media.WamediaManager, X.1Q5, java.lang.String, int, boolean):void");
    }

    public AnonymousClass8B2 CCk(int i) {
        C17960vV.A00();
        try {
            return A01(i);
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaGalleryList/processMediaAt/position = ");
            A10.append(i);
            C17900vP.A0X(e, " ; e = ", A10);
            return null;
        }
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1P(getCount());
    }
}
