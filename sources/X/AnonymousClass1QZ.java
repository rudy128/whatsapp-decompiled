package X;

/* renamed from: X.1QZ  reason: invalid class name */
public final class AnonymousClass1QZ {
    public final AnonymousClass1Cd A00;

    public AnonymousClass1QZ(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass247 r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.1Cd r0 = r6.A00
            X.1au r5 = r0.A05()
            r0 = 3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0052 }
            r4.<init>(r0)     // Catch:{ all -> 0x0052 }
            long r0 = r7.A0x     // Catch:{ all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "message_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0052 }
            long r0 = r7.A02     // Catch:{ all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "image_count"
            r4.put(r0, r1)     // Catch:{ all -> 0x0052 }
            long r0 = r7.A03     // Catch:{ all -> 0x0052 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "video_count"
            r4.put(r0, r1)     // Catch:{ all -> 0x0052 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0052 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "message_album"
            java.lang.String r1 = "AlbumMessageStore/insertOrUpdateMessageAlbum"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x0052 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            r5.close()
            return
        L_0x004a:
            java.lang.String r1 = "AlbumMessageStore/insertOrUpdateMessageAlbum the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0052 }
            r0.<init>(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QZ.A00(X.247):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass247 r7, long r8) {
        /*
            r6 = this;
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            X.1Cd r0 = r6.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004d }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "\n          SELECT\n            message_row_id,\n            image_count,\n            video_count\n          FROM message_album\n          WHERE message_row_id = ?\n        "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004d }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x004d }
            r1[r5] = r0     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "GET_MESSAGE_ALBUM_BY_MESSAGE_ROW_ID"
            android.database.Cursor r4 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x004d }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "image_count"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "video_count"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0046 }
            long r0 = r4.getLong(r1)     // Catch:{ all -> 0x0046 }
            r7.A02 = r0     // Catch:{ all -> 0x0046 }
            long r0 = r4.getLong(r2)     // Catch:{ all -> 0x0046 }
            r7.A03 = r0     // Catch:{ all -> 0x0046 }
        L_0x003f:
            r4.close()     // Catch:{ all -> 0x004d }
            r3.close()
            return
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QZ.A01(X.247, long):void");
    }
}
