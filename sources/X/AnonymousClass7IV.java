package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7IV  reason: invalid class name */
public final class AnonymousClass7IV implements C1607289r {
    public final C139516yy A00;
    public volatile List A01;

    public AnonymousClass7IV(C56572hg r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2.A00(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBh(java.util.List r12) {
        /*
            r11 = this;
            r8 = 0
            X.C18070vi.A0d(r12, r8)
            X.C17960vV.A00()
            java.util.List r0 = X.C29431cG.A0t(r12)
            r11.A01 = r0
            java.util.List r7 = r11.A01
            if (r7 == 0) goto L_0x00dd
            X.6yy r5 = r11.A00
            java.lang.String r6 = "recent_stickers"
            X.00H r0 = r5.A01
            X.1au r2 = X.C108985cd.A0S(r0)
            X.1xA r4 = r2.BD0()     // Catch:{ all -> 0x00d3 }
            java.lang.String r3 = "is_avocado = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00cc }
            boolean r0 = r5.A02     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "1"
        L_0x002b:
            r1[r8] = r0     // Catch:{ all -> 0x00cc }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00cc }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "CLEAR_RECENT_STICKER_TABLE"
            r5.A04(r6, r3, r0, r1)     // Catch:{ all -> 0x00cc }
            java.util.Iterator r10 = r7.iterator()     // Catch:{ all -> 0x00cc }
        L_0x003b:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r8 = r10.next()     // Catch:{ all -> 0x00cc }
            X.7Ic r8 = (X.C144637Ic) r8     // Catch:{ all -> 0x00cc }
            X.6pg r9 = r8.A01     // Catch:{ all -> 0x00cc }
            X.77d r7 = r9.A04     // Catch:{ all -> 0x00cc }
            android.content.ContentValues r3 = X.C17880vN.A08()     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "plaintext_hash"
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "entry_weight"
            float r0 = r8.A00     // Catch:{ all -> 0x00cc }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "hash_of_image_part"
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            X.C109005cf.A0K(r3, r7)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "file_size"
            int r0 = r7.A00     // Catch:{ all -> 0x00cc }
            X.C17880vN.A18(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "width"
            int r0 = r7.A03     // Catch:{ all -> 0x00cc }
            X.C17880vN.A18(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "height"
            int r0 = r7.A02     // Catch:{ all -> 0x00cc }
            X.C17880vN.A18(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r7.A09     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "is_first_party"
            boolean r0 = r7.A0P     // Catch:{ all -> 0x00cc }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "is_avocado"
            boolean r0 = r7.A0N     // Catch:{ all -> 0x00cc }
            X.C17880vN.A18(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r8 = "last_sticker_sent_ts"
            long r0 = r9.A00     // Catch:{ all -> 0x00cc }
            X.C17880vN.A19(r3, r8, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "avatar_template_id"
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "is_fun_sticker"
            boolean r0 = r7.A0J     // Catch:{ all -> 0x00cc }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "is_lottie"
            boolean r0 = r7.A02()     // Catch:{ all -> 0x00cc }
            X.C50072Ta.A00(r3, r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = "accessibility_text"
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x00cc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "saveWeightedStickerIdentifierToDB/REPLACE_RECENT_STICKERS"
            r5.A07(r6, r0, r3)     // Catch:{ all -> 0x00cc }
            goto L_0x003b
        L_0x00c1:
            java.lang.String r0 = "0"
            goto L_0x002b
        L_0x00c5:
            r4.A00()     // Catch:{ all -> 0x00cc }
            r4.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00da
        L_0x00cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00da:
            r2.close()
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IV.CBh(java.util.List):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass8AP BHM(Object obj, float f) {
        C133896pg r2 = (C133896pg) obj;
        C18070vi.A0d(r2, 0);
        return new C144637Ic(r2, f);
    }

    public ArrayList Bd5() {
        C17960vV.A00();
        ArrayList A012 = this.A00.A01();
        this.A01 = A012;
        return A012;
    }
}
