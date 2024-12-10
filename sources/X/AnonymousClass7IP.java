package X;

import android.util.Pair;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.7IP  reason: invalid class name */
public final class AnonymousClass7IP implements C1607189q {
    public final AnonymousClass00H A00;
    public final AnonymousClass181 A01;
    public final AnonymousClass1D9 A02;
    public final C220418j A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public InputStream BT5(AnonymousClass8BJ r4) {
        C179229Hb BMP = r4.BMP(this.A01, 0, 35);
        if ("gzip".equals(((AUZ) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(BMP);
        }
        return BMP;
    }

    public static void A00(AnonymousClass7IP r8, Number number, long j) {
        if (number != null) {
            int intValue = number.intValue();
            AnonymousClass00H r2 = r8.A00;
            ((AnonymousClass70I) r2.get()).A01.markerAnnotate(354170068, intValue, AnonymousClass6EE.A00.A00, j);
            ((AnonymousClass70I) r2.get()).A03(intValue, "sticker_mapping_file_download_finished");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r20, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0161, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0168, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0192, code lost:
        if (r0 == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0205, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.CDX.A00(r22, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BcK(java.io.InputStream r28, java.lang.Integer r29, long r30) {
        /*
            r27 = this;
            java.lang.String r12 = ", error: "
            java.lang.String r11 = "mapping_file_parsing_failed"
            java.lang.String r10 = ", filters: "
            r9 = r27
            X.00H r0 = r9.A04
            r26 = r0
            java.lang.String r8 = X.C138886xr.A00(r26)
            X.00H r0 = r9.A06
            r25 = r0
            java.lang.Object r0 = r25.get()
            X.6pN r0 = (X.C133716pN) r0
            java.lang.String r7 = r0.A01()
            X.00H r0 = r9.A07
            r24 = r0
            java.lang.Object r0 = r24.get()
            X.7IR r0 = (X.AnonymousClass7IR) r0
            X.00H r0 = r0.A00
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            X.C17880vN.A1E(r1, r0, r7)
            java.lang.Object r1 = r24.get()
            X.7IR r1 = (X.AnonymousClass7IR) r1
            java.lang.Object r0 = r25.get()
            X.6pN r0 = (X.C133716pN) r0
            java.lang.String r2 = r0.A00()
            X.00H r0 = r1.A00
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C17880vN.A1E(r1, r0, r2)
            r23 = 0
            r14 = 0
            r13 = r29
            r2 = r30
            android.util.JsonReader r22 = X.C108985cd.A0E(r28)     // Catch:{ IOException -> 0x023c, IllegalStateException -> 0x020c }
            r22.beginObject()     // Catch:{ all -> 0x0203 }
            r21 = 1
        L_0x0066:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x01c5
            java.lang.String r4 = r22.nextName()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "revision"
            boolean r0 = X.C18070vi.A18(r4, r0)     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x0097
            java.lang.String r4 = r22.nextString()     // Catch:{ all -> 0x0203 }
            java.lang.Object r0 = r24.get()     // Catch:{ all -> 0x0203 }
            X.7IR r0 = (X.AnonymousClass7IR) r0     // Catch:{ all -> 0x0203 }
            X.C72453Mb.A1R(r4)     // Catch:{ all -> 0x0203 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0203 }
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r0)     // Catch:{ all -> 0x0203 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            X.C17880vN.A1E(r1, r0, r4)     // Catch:{ all -> 0x0203 }
            r23 = 1
            goto L_0x0066
        L_0x0097:
            java.lang.String r0 = "languages"
            boolean r0 = X.C18070vi.A18(r4, r0)     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x0199
            X.00H r0 = r9.A08     // Catch:{ all -> 0x0203 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0203 }
            X.7IS r0 = (X.AnonymousClass7IS) r0     // Catch:{ all -> 0x0203 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0203 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0203 }
            X.6ei r6 = (X.C127656ei) r6     // Catch:{ all -> 0x0203 }
            X.00H r0 = r6.A01     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0169 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x0169 }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x0169 }
            X.1xA r20 = r5.BD0()     // Catch:{ all -> 0x0162 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0159 }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x0159 }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x0159 }
            r1 = 0
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearAll/DELETE_AVATAR_STICKER_SEARCH_TAG"
            java.lang.String r4 = "avatar_sticker_search_dictionary"
            r14.A04(r4, r1, r0, r1)     // Catch:{ all -> 0x0159 }
            r22.beginObject()     // Catch:{ all -> 0x0159 }
        L_0x00d2:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x014b
            r22.nextName()     // Catch:{ all -> 0x0159 }
            r22.beginObject()     // Catch:{ all -> 0x0159 }
        L_0x00de:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0147
            java.lang.String r19 = r22.nextName()     // Catch:{ all -> 0x0159 }
            r22.beginObject()     // Catch:{ all -> 0x0159 }
            java.util.LinkedHashSet r1 = X.C17880vN.A14()     // Catch:{ all -> 0x0159 }
            r22.nextName()     // Catch:{ all -> 0x0159 }
            r22.beginArray()     // Catch:{ all -> 0x0159 }
        L_0x00f5:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r22.nextString()     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = X.AnonymousClass1EG.A06(r0)     // Catch:{ all -> 0x0159 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0159 }
            r1.add(r0)     // Catch:{ all -> 0x0159 }
            goto L_0x00f5
        L_0x010a:
            r22.endArray()     // Catch:{ all -> 0x0159 }
            r22.nextName()     // Catch:{ all -> 0x0159 }
            int r18 = r22.nextInt()     // Catch:{ all -> 0x0159 }
            r22.endObject()     // Catch:{ all -> 0x0159 }
            X.C18070vi.A0b(r19)     // Catch:{ all -> 0x0159 }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ all -> 0x0159 }
        L_0x011e:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r16 = X.C17880vN.A0v(r17)     // Catch:{ all -> 0x0159 }
            android.content.ContentValues r1 = X.C17880vN.A08()     // Catch:{ all -> 0x0159 }
            java.lang.String r15 = "sticker_id"
            r0 = r19
            r1.put(r15, r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r15 = "tag"
            r0 = r16
            r1.put(r15, r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r15 = "weight"
            r0 = r18
            X.C17880vN.A18(r1, r15, r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "insertAvatarStickerTags/REPLACE_AVATAR_STICKER_SEARCH_TAG"
            r14.A07(r4, r0, r1)     // Catch:{ all -> 0x0159 }
            goto L_0x011e
        L_0x0147:
            r22.endObject()     // Catch:{ all -> 0x0159 }
            goto L_0x00d2
        L_0x014b:
            r22.endObject()     // Catch:{ all -> 0x0159 }
            r20.A00()     // Catch:{ all -> 0x0159 }
            r20.close()     // Catch:{ all -> 0x0162 }
            r5.close()     // Catch:{ all -> 0x0169 }
            r0 = 1
            goto L_0x018e
        L_0x0159:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x015b }
        L_0x015b:
            r1 = move-exception
            r0 = r20
            X.CDX.A00(r0, r4)     // Catch:{ all -> 0x0162 }
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x0203 }
            java.lang.Throwable r5 = r0.exception     // Catch:{ all -> 0x0203 }
            if (r5 == 0) goto L_0x018d
            X.00H r0 = r6.A00     // Catch:{ all -> 0x0203 }
            X.6ue r6 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "error: "
            java.lang.String r4 = X.C17900vP.A0C(r0, r1, r5)     // Catch:{ all -> 0x0203 }
            r1 = 3
            java.lang.String r0 = "write_sticker_tags_to_database_failed"
            r6.A02(r1, r0, r4)     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryStore/populatedb/failed"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x0203 }
        L_0x018d:
            r0 = 0
        L_0x018e:
            if (r21 == 0) goto L_0x0194
            r21 = 1
            if (r0 != 0) goto L_0x0196
        L_0x0194:
            r21 = 0
        L_0x0196:
            r14 = 1
            goto L_0x0066
        L_0x0199:
            X.00H r0 = r9.A05     // Catch:{ all -> 0x0203 }
            X.6ue r6 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0203 }
            java.lang.String r5 = "mapping_file_unexpected_field"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "found unexpected field: '"
            r1.append(r0)     // Catch:{ all -> 0x0203 }
            r1.append(r4)     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "' (rev: "
            X.C17900vP.A0c(r0, r8, r10, r7, r1)     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = X.AnonymousClass001.A1J(r1)     // Catch:{ all -> 0x0203 }
            r0 = 3
            r6.A02(r0, r5, r1)     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/unhandled field: "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ all -> 0x0203 }
            goto L_0x0066
        L_0x01c5:
            r22.endObject()     // Catch:{ all -> 0x0203 }
            java.lang.String r5 = "mapping_file_missing_field"
            if (r23 != 0) goto L_0x01e3
            X.00H r0 = r9.A05     // Catch:{ all -> 0x0203 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "mapping file is missing 'revision' field (rev: "
            X.C17900vP.A0c(r0, r8, r10, r7, r1)     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = X.AnonymousClass001.A1J(r1)     // Catch:{ all -> 0x0203 }
            r0 = 3
            r4.A02(r0, r5, r1)     // Catch:{ all -> 0x0203 }
        L_0x01e3:
            if (r14 != 0) goto L_0x01fc
            X.00H r0 = r9.A05     // Catch:{ all -> 0x0203 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "mapping file is missing 'languages' field (rev: "
            X.C17900vP.A0c(r0, r8, r10, r7, r1)     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = X.AnonymousClass001.A1J(r1)     // Catch:{ all -> 0x0203 }
            r0 = 3
            r4.A02(r0, r5, r1)     // Catch:{ all -> 0x0203 }
        L_0x01fc:
            r22.close()     // Catch:{ IOException -> 0x023c, IllegalStateException -> 0x020c }
            A00(r9, r13, r2)
            return r21
        L_0x0203:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r1 = move-exception
            r0 = r22
            X.CDX.A00(r0, r4)     // Catch:{ IOException -> 0x023c, IllegalStateException -> 0x020c }
            throw r1     // Catch:{ IOException -> 0x023c, IllegalStateException -> 0x020c }
        L_0x020c:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/parsing failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0270 }
            java.lang.String r6 = X.C138886xr.A00(r26)     // Catch:{ all -> 0x0270 }
            java.lang.Object r0 = r25.get()     // Catch:{ all -> 0x0270 }
            X.6pN r0 = (X.C133716pN) r0     // Catch:{ all -> 0x0270 }
            java.lang.String r5 = r0.A01()     // Catch:{ all -> 0x0270 }
            X.00H r0 = r9.A05     // Catch:{ all -> 0x0270 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "illegal state exception while parsing (rev: "
            X.C17900vP.A0c(r0, r6, r10, r5, r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = X.C108955ca.A10(r12, r1, r7)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = X.C17900vP.A0B(r0, r1)     // Catch:{ all -> 0x0270 }
            r0 = 3
            r4.A02(r0, r11, r1)     // Catch:{ all -> 0x0270 }
            goto L_0x026b
        L_0x023c:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0270 }
            java.lang.String r6 = X.C138886xr.A00(r26)     // Catch:{ all -> 0x0270 }
            java.lang.Object r0 = r25.get()     // Catch:{ all -> 0x0270 }
            X.6pN r0 = (X.C133716pN) r0     // Catch:{ all -> 0x0270 }
            java.lang.String r5 = r0.A01()     // Catch:{ all -> 0x0270 }
            X.00H r0 = r9.A05     // Catch:{ all -> 0x0270 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "unable to parse mapping file (rev: "
            X.C17900vP.A0c(r0, r6, r10, r5, r1)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = X.C108955ca.A10(r12, r1, r7)     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = X.C17900vP.A0B(r0, r1)     // Catch:{ all -> 0x0270 }
            r0 = 3
            r4.A02(r0, r11, r1)     // Catch:{ all -> 0x0270 }
        L_0x026b:
            A00(r9, r13, r2)
            r0 = 0
            return r0
        L_0x0270:
            r0 = move-exception
            A00(r9, r13, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IP.BcK(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public AnonymousClass7IP(AnonymousClass181 r1, AnonymousClass1D9 r2, C220418j r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r1, r4, r2, r3, r5);
        C18070vi.A0x(r6, r7, r8, r9, r10);
        this.A01 = r1;
        this.A05 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r5;
        this.A09 = r6;
        this.A08 = r7;
        this.A07 = r8;
        this.A06 = r9;
        this.A04 = r10;
    }

    public AUZ BFc(String str, String str2) {
        String str3;
        C17900vP.A0f("AvatarStickerSearchDictionaryNetworkClient/connect/language=", str2, AnonymousClass000.A10());
        this.A09.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        C133716pN r5 = (C133716pN) this.A06.get();
        String A002 = C138886xr.A00(r5.A01);
        String A012 = r5.A01();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarStickerSearchDictionaryNetworkEndpoint/getEndpoint/revision=");
        A10.append(A002);
        C17900vP.A0f(", filters=", A012, A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("https://static.whatsapp.net/wa/static/avatar?cat=avatar_sticker_search");
        A102.append("&lgs=");
        A102.append(str2);
        if (A002 != null) {
            A102.append("&rev=");
            A102.append(A002);
        }
        A102.append("&filter=");
        A102.append(A012);
        if (C18020vd.A05(C18040vf.A02, r5.A00, 4501)) {
            if (r5.A00().length() > 0) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("&country=");
                str3 = AnonymousClass000.A0y(r5.A00(), A103);
                C18070vi.A0X(str3);
            } else {
                str3 = "";
            }
            A102.append(str3);
        }
        return this.A02.A05((Pair) null, this.A03, C18070vi.A0H(A102), str);
    }
}
