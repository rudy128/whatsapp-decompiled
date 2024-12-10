package X;

/* renamed from: X.1hW  reason: invalid class name and case insensitive filesystem */
public final class C32641hW {
    public final C32621hU A00;
    public final C32631hV A01;
    public final C18030ve A02;

    public C32641hW(C32621hU r2, C32631hV r3, C18030ve r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x017e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C693536w r16, long r17) {
        /*
            r15 = this;
            r0 = 0
            r3 = r16
            X.C18070vi.A0d(r3, r0)
            X.2Qz r0 = r3.A0D
            X.2Qz r4 = X.C49572Qz.FAVICON
            if (r0 == r4) goto L_0x00a9
            X.1hV r5 = r15.A01
            X.1Cd r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x00a4 }
            X.1au r6 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x00a4 }
            r0 = 10
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x009a }
            r4.<init>(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x009a }
            r4.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x009a }
            X.C63432t4.A01(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "media_key"
            byte[] r0 = r3.A0B     // Catch:{ all -> 0x009a }
            X.C63432t4.A03(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "media_key_timestamp"
            long r0 = r3.A02     // Catch:{ all -> 0x009a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009a }
            r4.put(r2, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "enc_thumb_hash"
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x009a }
            X.C63432t4.A01(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "thumb_hash"
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x009a }
            X.C63432t4.A01(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "thumb_width"
            int r0 = r3.A01     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r4.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "thumb_height"
            int r0 = r3.A00     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r4.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "transferred"
            boolean r0 = r3.A0A     // Catch:{ all -> 0x009a }
            X.C63432t4.A02(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "micro_thumbnail"
            byte[] r0 = r3.A0C     // Catch:{ all -> 0x009a }
            X.C63432t4.A03(r4, r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "insert_timestamp"
            X.11P r0 = r5.A00     // Catch:{ all -> 0x009a }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x009a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009a }
            r4.put(r2, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "handle"
            java.lang.String r0 = r3.A07     // Catch:{ all -> 0x009a }
            r4.put(r1, r0)     // Catch:{ all -> 0x009a }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "mms_thumbnail_metadata"
            java.lang.String r1 = "INSERT_MMS_THUMBNAIL_METADATA_SQL"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x009a }
            r6.close()     // Catch:{ SQLiteConstraintException -> 0x00a4 }
            return
        L_0x009a:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00a4 }
        L_0x00a3:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            java.lang.String r0 = "MmsThumbnailMetadataMessageStore/insertMmsThumbnailMetadata/"
            goto L_0x0182
        L_0x00a9:
            X.0ve r2 = r15.A02
            r1 = 9584(0x2570, float:1.343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0186
            X.1hU r2 = r15.A00
            r8 = 0
            r7 = 1
            r0 = 13
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>(r0)
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r10.put(r1, r0)
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r3.A05
            X.C63432t4.A01(r10, r1, r0)
            java.lang.String r1 = "media_key"
            byte[] r0 = r3.A0B
            X.C63432t4.A03(r10, r1, r0)
            long r0 = r3.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_key_timestamp"
            r10.put(r0, r1)
            java.lang.String r1 = "enc_thumb_hash"
            java.lang.String r0 = r3.A06
            X.C63432t4.A01(r10, r1, r0)
            java.lang.String r1 = "thumb_hash"
            java.lang.String r0 = r3.A09
            X.C63432t4.A01(r10, r1, r0)
            int r0 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "thumb_width"
            r10.put(r0, r1)
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "thumb_height"
            r10.put(r0, r1)
            java.lang.String r1 = "transferred"
            boolean r0 = r3.A0A
            X.C63432t4.A02(r10, r1, r0)
            java.lang.String r1 = "micro_thumbnail"
            byte[] r0 = r3.A0C
            X.C63432t4.A03(r10, r1, r0)
            X.11P r0 = r2.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "insert_timestamp"
            r10.put(r0, r1)
            java.lang.String r1 = "handle"
            java.lang.String r0 = r3.A07
            r10.put(r1, r0)
            int r0 = r4.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r10.put(r0, r1)
            long r0 = r3.A04
            X.1Cd r2 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x017f }
            X.1au r4 = r2.A05()     // Catch:{ SQLiteConstraintException -> 0x017f }
            r5 = -1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0155
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0178 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0178 }
            java.lang.String r1 = "mms_metadata"
            java.lang.String r0 = "INSERT_MMS_METADATA_SQL"
            r2.A05(r1, r0, r10)     // Catch:{ all -> 0x0178 }
            goto L_0x0174
        L_0x0155:
            java.lang.String r3 = "_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0178 }
            r10.put(r3, r2)     // Catch:{ all -> 0x0178 }
            r2 = r4
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0178 }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x0178 }
            java.lang.String r11 = "mms_metadata"
            java.lang.String r12 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r7]     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0178 }
            r14[r8] = r0     // Catch:{ all -> 0x0178 }
            java.lang.String r13 = "UPDATE_MMS_METADATA_SQL"
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0178 }
        L_0x0174:
            r4.close()     // Catch:{ SQLiteConstraintException -> 0x017f }
            return
        L_0x0178:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteConstraintException -> 0x017f }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x017f }
        L_0x017f:
            r1 = move-exception
            java.lang.String r0 = "MmsMetadataMessageStore/insertOrUpdateMmsMetadata/"
        L_0x0182:
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32641hW.A01(X.36w, long):void");
    }

    public final int A00(C28791au r8, long j) {
        C23141Ev r6 = ((C28801av) r8).A02;
        String valueOf = String.valueOf(j);
        return r6.A04("mms_metadata", "message_row_id = ?", "deleteMmsMetadataOlderThan/DELETE_MMS_METADATA_BY_MESSAGE_ID", new String[]{valueOf}) + r6.A04("mms_thumbnail_metadata", "message_row_id = ?", "deleteMmsThumbnailMetadataOlderThan/DELETE_MMS_THUMBNAIL_METADATA_BY_MESSAGE_ID", new String[]{valueOf});
    }
}
