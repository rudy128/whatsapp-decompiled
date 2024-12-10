package X;

/* renamed from: X.7IS  reason: invalid class name */
public final class AnonymousClass7IS implements AnonymousClass8AO {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection BL5(java.lang.String r8, int r9, boolean r10) {
        /*
            r7 = this;
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            java.util.LinkedHashSet r6 = X.C17880vN.A14()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String[] r3 = X.C17880vN.A1Z()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)
            r0 = 37
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            r3[r2] = r0
            r0 = 1
            X.C17880vN.A1S(r3, r9, r0)
            java.lang.String r2 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag LIKE ? ORDER BY weight DESC LIMIT ?"
            X.00H r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
            X.1at r5 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005e }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_AVATAR_SEARCH_TAG"
            android.database.Cursor r3 = r1.A0A(r2, r0, r3)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0057 }
        L_0x0039:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = r3.getString(r2)     // Catch:{ all -> 0x0057 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0057 }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0039
            r4.add(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0039
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x005e }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
            goto L_0x0069
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0069:
            java.util.ArrayList r2 = X.C29351c6.A0D(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007b
            X.C139726zL.A00(r2, r1)
            goto L_0x0071
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IS.BL5(java.lang.String, int, boolean):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEs() {
        /*
            r5 = this;
            X.00H r0 = r5.A01
            X.1au r4 = X.C108985cd.A0S(r0)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x001a }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x001a }
            r2 = 0
            java.lang.String r1 = "AvatarStickerSearchDictionaryTable/clearAll/CLEAR_ALL"
            java.lang.String r0 = "avatar_sticker_search_dictionary"
            r3.A04(r0, r2, r1, r2)     // Catch:{ all -> 0x001a }
            r4.close()
            return
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IS.BEs():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r4 = this;
            X.00H r0 = r4.A01
            X.1at r3 = X.C108975cc.A0F(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "SELECT EXISTS(SELECT 1 FROM avatar_sticker_search_dictionary) AS has_records"
            java.lang.String r0 = "GET_COUNT_AVATAR_STICKER_SEARCH_TAGS"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x002f }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "has_records"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r2.close()     // Catch:{ all -> 0x002f }
            r3.close()
            return r0
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IS.getCount():int");
    }

    public AnonymousClass7IS(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.util.Collection BL6(java.lang.String[] r9) {
        /*
            r8 = this;
            java.util.LinkedHashSet r6 = X.C17880vN.A14()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r9, r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x0013:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r3 = r7.next()
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r0 = r3.length
            java.lang.String r2 = X.AnonymousClass1H2.A00(r0)
            java.lang.StringBuilder r1 = X.C108955ca.A15(r2)
            java.lang.String r0 = "SELECT DISTINCT sticker_id FROM avatar_sticker_search_dictionary WHERE tag IN "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ORDER BY weight DESC"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            X.00H r0 = r8.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
            X.1at r5 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0072 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "DISTINCT_INSTRUCTION_FROM_MULTIPLE_AVATAR_SEARCH_TAGS"
            android.database.Cursor r3 = r1.A0A(r2, r0, r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "sticker_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006b }
        L_0x004d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = r3.getString(r2)     // Catch:{ all -> 0x006b }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x006b }
            boolean r0 = r6.add(r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x004d
            r4.add(r1)     // Catch:{ all -> 0x006b }
            goto L_0x004d
        L_0x0064:
            r3.close()     // Catch:{ all -> 0x0072 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
            goto L_0x0013
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007d:
            java.util.ArrayList r2 = X.C29351c6.A0D(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008f
            X.C139726zL.A00(r2, r1)
            goto L_0x0085
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IS.BL6(java.lang.String[]):java.util.Collection");
    }

    public void CJF(boolean z) {
    }
}
