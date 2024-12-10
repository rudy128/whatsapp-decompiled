package X;

/* renamed from: X.2IZ  reason: invalid class name */
public final class AnonymousClass2IZ extends AnonymousClass39J {
    public final AnonymousClass00H A00;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0133, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r15) {
        /*
            r14 = this;
            r6 = 0
            X.C18070vi.A0d(r15, r6)
            super.BL9(r15)
            X.00H r0 = r14.A00
            java.lang.Object r0 = r0.get()
            X.2iL r0 = (X.C56982iL) r0
            X.22i r15 = (X.C441522i) r15
            X.C18070vi.A0d(r15, r6)
            X.1Cd r0 = r0.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0137 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "\n          SELECT\n            message_row_id,\n            sticker_pack_id,\n            pack_name,\n            pack_description,\n            publisher,\n            tray_icon_file_name,\n            image_data_hash,\n            sticker_pack_size,\n            sticker_pack_origin\n          FROM message_sticker_pack\n          WHERE message_row_id = ?\n        "
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0137 }
            long r0 = r15.A0x     // Catch:{ all -> 0x0137 }
            X.C17880vN.A1V(r4, r6, r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "GET_MESSAGE_STICKER_PACK"
            android.database.Cursor r4 = r5.A0A(r7, r0, r4)     // Catch:{ all -> 0x0137 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x012c }
            r8 = 0
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "pack_name"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "pack_description"
            int r13 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "publisher"
            int r11 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "sticker_pack_id"
            int r12 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "tray_icon_file_name"
            int r10 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "image_data_hash"
            int r9 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "sticker_pack_size"
            int r7 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = "sticker_pack_origin"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x012c }
            r15.A03 = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r13)     // Catch:{ all -> 0x012c }
            r15.A04 = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r12)     // Catch:{ all -> 0x012c }
            r15.A06 = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r11)     // Catch:{ all -> 0x012c }
            r15.A05 = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r10)     // Catch:{ all -> 0x012c }
            r15.A07 = r0     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r4.getString(r9)     // Catch:{ all -> 0x012c }
            r15.A02 = r0     // Catch:{ all -> 0x012c }
            boolean r0 = r4.isNull(r7)     // Catch:{ all -> 0x012c }
            if (r0 != 0) goto L_0x0098
            java.lang.Long r8 = X.C17890vO.A0M(r4, r7)     // Catch:{ all -> 0x012c }
        L_0x0098:
            r15.A01 = r8     // Catch:{ all -> 0x012c }
            java.lang.Integer r0 = X.AnonymousClass24X.A00(r4, r1)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x00ae
            int r1 = r0.intValue()     // Catch:{ all -> 0x012c }
            r0 = 0
            if (r1 == 0) goto L_0x00b0
            r0 = 1
            if (r1 == r3) goto L_0x00b0
            r0 = 2
            if (r1 != r0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r0 = 0
            goto L_0x00b4
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
        L_0x00b4:
            r15.A00 = r0     // Catch:{ all -> 0x012c }
        L_0x00b6:
            r4.close()     // Catch:{ all -> 0x0137 }
            java.lang.String r4 = "\n          SELECT\n            _id,\n            message_row_id,\n            file_name,\n            is_animated,\n            emojis,\n            accessibility_label,\n            is_lottie,\n            mimetype\n          FROM message_sticker_pack_stickers\n          WHERE message_row_id = ?\n        "
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0137 }
            long r0 = r15.A0x     // Catch:{ all -> 0x0137 }
            X.C17880vN.A1V(r3, r6, r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "GET_MESSAGE_STICKER_PACK_STICKERS"
            android.database.Cursor r3 = r5.A0A(r4, r0, r3)     // Catch:{ all -> 0x0137 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0128 }
        L_0x00cc:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "file_name"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "is_animated"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "emojis"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "accessibility_label"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "mimetype"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "is_lottie"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r10 = r3.getString(r9)     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r8)     // Catch:{ all -> 0x0128 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r11 = r3.getString(r7)     // Catch:{ all -> 0x0128 }
            java.lang.String r12 = r3.getString(r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r13 = r3.getString(r5)     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r1)     // Catch:{ all -> 0x0128 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0128 }
            X.6tY r7 = new X.6tY     // Catch:{ all -> 0x0128 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0128 }
            r4.add(r7)     // Catch:{ all -> 0x0128 }
            goto L_0x00cc
        L_0x011f:
            r15.A08 = r4     // Catch:{ all -> 0x0128 }
            r3.close()     // Catch:{ all -> 0x0137 }
            r2.close()
            return
        L_0x0128:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x012a }
        L_0x012a:
            r1 = move-exception
            goto L_0x0133
        L_0x012c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r1 = move-exception
            X.CDX.A00(r4, r0)     // Catch:{ all -> 0x0137 }
            goto L_0x0136
        L_0x0133:
            X.CDX.A00(r3, r0)     // Catch:{ all -> 0x0137 }
        L_0x0136:
            throw r1     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IZ.BL9(X.206):void");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        ((C56982iL) this.A00.get()).A00((C441522i) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass39J.A00(this, r2);
        ((C56982iL) this.A00.get()).A00((C441522i) r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IZ(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r1, r2, r3);
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
