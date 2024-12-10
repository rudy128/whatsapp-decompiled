package X;

import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.util.Iterator;

/* renamed from: X.6zr  reason: invalid class name and case insensitive filesystem */
public final class C140046zr {
    public final C25311Ns A00;
    public final C136726uI A01 = new C136726uI();
    public final C25271No A02;
    public final AnonymousClass70H A03;
    public final C132096mC A04;
    public final C139856zY A05;
    public volatile boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1418377d A01(java.lang.String r6) {
        /*
            r5 = this;
            r1 = 0
            X.C18070vi.A0d(r6, r1)
            X.6zY r0 = r5.A05
            java.lang.String[] r3 = X.C17880vN.A1a(r6, r1)
            X.00H r0 = r0.A00
            X.1at r4 = X.C108975cc.A0F(r0)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0042 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER"
            android.database.Cursor r3 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0042 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r0 == 0) goto L_0x0028
            X.6uA r2 = X.C139856zY.A00(r3)     // Catch:{ all -> 0x003b }
        L_0x0028:
            r3.close()     // Catch:{ all -> 0x0042 }
            r4.close()
            if (r2 != 0) goto L_0x0032
            r0 = 0
            return r0
        L_0x0032:
            X.70H r1 = r5.A03
            X.1Ns r0 = r5.A00
            X.77d r0 = X.C124166Xh.A00(r0, r1, r2)
            return r0
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140046zr.A01(java.lang.String):X.77d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            X.C17960vV.A00()
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0012
            X.6uI r0 = r6.A01
            boolean r5 = r0.A03(r7)
            return r5
        L_0x0012:
            X.6zY r0 = r6.A05
            r5 = 1
            java.lang.String[] r4 = new java.lang.String[r5]
            r4[r1] = r7
            X.00H r0 = r0.A00
            X.1at r3 = X.C108975cc.A0F(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0041 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "checkStickerHashIsStarred/QUERY_STARRED_STICKER"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x0041 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x003a }
            if (r0 > 0) goto L_0x0033
            r5 = 0
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r5
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140046zr.A03(java.lang.String):boolean");
    }

    public static final void A00(C140046zr r7) {
        if (!r7.A06) {
            C136726uI r4 = r7.A01;
            synchronized (r4) {
                if (!r7.A06) {
                    C139856zY r6 = r7.A05;
                    Iterator it = r6.A01(Integer.MAX_VALUE, 0).iterator();
                    while (it.hasNext()) {
                        C136656uA r3 = (C136656uA) it.next();
                        if (r3.A01 == null) {
                            try {
                                r3.A01 = r7.A04.A00(r3.A0C, r3.A0E);
                                r6.A02(r3);
                            } catch (FileNotFoundException e) {
                                Log.e("StarredStickers/calculateImageHash/could not get internally managed media file for sticker, dropping it from starred", e);
                                r6.A03(r3.A0C);
                            }
                        }
                        r4.A01(r3.A0C, r3.A01);
                    }
                    r7.A06 = true;
                }
            }
        }
    }

    public C140046zr(C25311Ns r2, C25271No r3, AnonymousClass70H r4, C132096mC r5, C139856zY r6) {
        C18070vi.A0o(r4, r6, r3);
        C18070vi.A0d(r2, 5);
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r2;
    }

    public final void A02(String str) {
        C17960vV.A00();
        A00(this);
        C136726uI r1 = this.A01;
        r1.A02(str, r1.A00(str));
        this.A05.A03(str);
    }
}
