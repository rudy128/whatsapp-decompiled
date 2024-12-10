package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6pr  reason: invalid class name and case insensitive filesystem */
public final class C134006pr {
    public final C136386tj A00;
    public final C1407272s A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1KB A06;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0182, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0185, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0189, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.CDX.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0193, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0197, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass725 A00(java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            r22 = this;
            r6 = r23
            r5 = r24
            boolean r4 = X.C18070vi.A16(r6, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/ "
            r1.append(r0)
            int r0 = r6.hashCode()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            X.C17890vO.A1A(r1, r5)
            r2 = r22
            X.00H r1 = r2.A05
            java.lang.Object r0 = r1.get()
            X.702 r0 = (X.AnonymousClass702) r0
            boolean r0 = r0.A04(r6, r5)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/not using sticker cache"
        L_0x0032:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6tj r0 = r2.A00
            X.725 r7 = r0.A00(r6, r5)
        L_0x003b:
            return r7
        L_0x003c:
            X.6tj r0 = r2.A00     // Catch:{ Exception -> 0x0043 }
            X.725 r0 = r0.A01(r6, r5)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r13 = 1
            if (r0 == 0) goto L_0x004e
            boolean r3 = r0.A0P
            if (r3 != r4) goto L_0x004e
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/avoid caching is true"
            goto L_0x0032
        L_0x004e:
            java.lang.Object r3 = r1.get()
            X.702 r3 = (X.AnonymousClass702) r3
            java.lang.String r10 = "authority"
            r12 = 0
            X.00H r3 = r3.A00
            X.1at r3 = X.C108975cc.A0F(r3)
            r7 = r3
            X.1av r7 = (X.C28801av) r7     // Catch:{ all -> 0x0194 }
            X.1Ev r11 = r7.A02     // Catch:{ all -> 0x0194 }
            java.lang.String r9 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs WHERE authority = ? AND sticker_pack_id = ? LIMIT 1"
            r7 = 2
            java.lang.String[] r8 = X.C17880vN.A1b(r6, r5, r7, r4)     // Catch:{ all -> 0x0194 }
            java.lang.String r7 = "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r14 = r11.A0A(r9, r7, r8)     // Catch:{ all -> 0x0194 }
            boolean r8 = r14.moveToNext()     // Catch:{ all -> 0x018d }
            r7 = 0
            if (r8 == 0) goto L_0x00a2
            int r15 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "sticker_pack_id"
            int r16 = r14.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "sticker_pack_name"
            int r17 = r14.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "sticker_pack_publisher"
            int r18 = r14.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "sticker_pack_image_data_hash"
            int r19 = r14.getColumnIndex(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "avoid_cache"
            int r20 = r14.getColumnIndex(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r7 = "is_animated_pack"
            int r21 = r14.getColumnIndex(r7)     // Catch:{ all -> 0x018d }
            X.725 r7 = X.AnonymousClass702.A00(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x018d }
        L_0x00a2:
            r14.close()     // Catch:{ all -> 0x0194 }
            r3.close()
            if (r25 != 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00ec
            if (r7 == 0) goto L_0x00ba
            java.lang.String r8 = r7.A03
            if (r8 == 0) goto L_0x00ba
            java.lang.String r3 = r0.A0I
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00ec
        L_0x00ba:
            java.lang.Object r1 = r1.get()
            X.702 r1 = (X.AnonymousClass702) r1
            r1.A03(r0, r6, r5)
            r7 = r0
            java.lang.String r1 = "ThirdPartyStickerManager/fetchPack/repopulate sticker pack db"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.00H r8 = r2.A04
            java.lang.Object r3 = r8.get()
            X.6ol r3 = (X.C133446ol) r3
            java.lang.String r1 = X.AnonymousClass725.A00(r0)
            r3.A01(r1)
            X.6tj r1 = r2.A00
            byte[] r3 = r1.A02(r0)
            java.lang.Object r1 = r8.get()
            X.6ol r1 = (X.C133446ol) r1
            r1.A00(r0, r3)
        L_0x00e7:
            X.72s r3 = r2.A01
            monitor-enter(r3)
            r1 = 0
            goto L_0x00ee
        L_0x00ec:
            r13 = 0
            goto L_0x00e7
        L_0x00ee:
            java.util.List r8 = X.C1407272s.A01(r3, r6, r5, r1)     // Catch:{ all -> 0x018a }
            monitor-exit(r3)
            X.C18070vi.A0X(r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00fe
            if (r13 == 0) goto L_0x011a
        L_0x00fe:
            X.6tj r0 = r2.A00
            X.725 r0 = r0.A00(r6, r5)
            java.util.List r0 = r0.A07
            X.C18070vi.A0X(r0)
            r3.A02(r6, r5, r0)
            monitor-enter(r3)
            java.util.List r8 = X.C1407272s.A01(r3, r6, r5, r1)     // Catch:{ all -> 0x018a }
            monitor-exit(r3)
            X.C18070vi.A0X(r8)
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/repopulating sticker cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x011a:
            java.util.Iterator r11 = r8.iterator()
        L_0x011e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0161
            X.77d r9 = X.C108945cZ.A0x(r11)
            java.lang.String r10 = r9.A0F
            if (r10 == 0) goto L_0x011e
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.2bD r0 = (X.C52622bD) r0
            X.00H r0 = r0.A00
            X.1at r5 = X.C108975cc.A0F(r0)
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0183 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0183 }
            java.lang.String r3 = "SELECT emojis FROM third_party_sticker_emoji_mapping WHERE plaintext_hash = ?"
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0183 }
            r1[r12] = r10     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "getEmoji/QUERY_EMOJI"
            android.database.Cursor r3 = r6.A0A(r3, r0, r1)     // Catch:{ all -> 0x0183 }
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x017c }
            r0 = 0
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "emojis"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x017c }
        L_0x0158:
            r3.close()     // Catch:{ all -> 0x0183 }
            r5.close()
            r9.A09 = r0
            goto L_0x011e
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/stickerPack = "
            X.C17900vP.A0Y(r7, r0, r1)
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            r7.A07 = r8
            if (r13 == 0) goto L_0x003b
            X.1KB r1 = r2.A06
            r0 = 40
            X.AnonymousClass7RQ.A00(r1, r2, r7, r0)
            return r7
        L_0x017c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x018a:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x018d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            X.CDX.A00(r14, r1)     // Catch:{ all -> 0x0194 }
            throw r0     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134006pr.A00(java.lang.String, java.lang.String, boolean):X.725");
    }

    public final File A01(AnonymousClass725 r8) {
        String str = r8.A05;
        if (str != null) {
            return C108945cZ.A17(str);
        }
        String A002 = AnonymousClass725.A00(r8);
        Pair A003 = C137416vQ.A00(A002);
        if (A003 != null) {
            Object obj = A003.first;
            C18070vi.A0W(obj);
            String str2 = (String) obj;
            Object obj2 = A003.second;
            C18070vi.A0W(obj2);
            String str3 = (String) obj2;
            C18070vi.A0h(str2, str3);
            if (((AnonymousClass702) this.A05.get()).A04(str2, str3)) {
                AnonymousClass00H r4 = this.A04;
                String A0Z = C108995ce.A0Z(A002);
                C18070vi.A0d(A0Z, 0);
                File A004 = C138926xv.A00((C138926xv) C18070vi.A0E(((C133446ol) r4.get()).A00), A0Z);
                if (A004 != null && A004.exists()) {
                    return A004;
                }
                try {
                    C136386tj r3 = this.A00;
                    Object obj3 = A003.first;
                    C18070vi.A0W(obj3);
                    Object obj4 = A003.second;
                    C18070vi.A0W(obj4);
                    AnonymousClass725 A005 = r3.A00((String) obj3, (String) obj4);
                    return ((C133446ol) r4.get()).A00(A005, r3.A02(A005));
                } catch (Exception e) {
                    Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e);
                    return null;
                }
            }
        }
        return null;
    }

    public C134006pr(AnonymousClass1KB r1, C136386tj r2, C1407272s r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r4, r3, r2, r5);
        C18070vi.A0l(r6, r7);
        this.A06 = r1;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r7;
    }
}
