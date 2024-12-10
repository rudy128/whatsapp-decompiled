package X;

import java.util.Set;

/* renamed from: X.32i  reason: invalid class name and case insensitive filesystem */
public final class C681732i implements C25341Nv {
    public final C32641hW A00;

    public C681732i(C32641hW r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof AnonymousClass210) || !r3.A0z(32768)) {
            return false;
        }
        return true;
    }

    public Set BZv() {
        return C18070vi.A0P(C20952Ac6.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r14) {
        /*
            r13 = this;
            X.206 r3 = X.C18070vi.A08(r14)
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "Attempting to load favicon data for non text message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000e:
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r3.A0z(r0)
            if (r0 == 0) goto L_0x0104
            X.1hW r0 = r13.A00
            long r5 = r3.A0x
            X.1hU r0 = r0.A00
            X.1Cd r0 = r0.A01
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fd }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "\n        SELECT\n        _id,\n        message_row_id,\n        direct_path,\n        media_key,\n        media_key_timestamp,\n        enc_thumb_hash,\n        thumb_hash,\n        thumb_width,\n        thumb_height,\n        transferred,\n        micro_thumbnail,\n        insert_timestamp,\n        handle,\n        type\n        FROM mms_metadata\n        WHERE message_row_id = ?\n        "
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00fd }
            r6 = 0
            r1[r6] = r0     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "GET_MMS_THUMBNAIL_METADATA_SQL"
            android.database.Cursor r4 = r7.A0A(r4, r0, r1)     // Catch:{ all -> 0x00fd }
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ all -> 0x00f6 }
        L_0x003f:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "_id"
            int r7 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            r0 = -1
            long r0 = X.AnonymousClass1Eu.A02(r4, r7, r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "type"
            int r8 = r4.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x00f6 }
            X.2Qz r7 = X.C49572Qz.WEB_THUMBNAIL     // Catch:{ all -> 0x00f6 }
            int r7 = r7.value     // Catch:{ all -> 0x00f6 }
            int r7 = X.AnonymousClass1Eu.A00(r4, r8, r7)     // Catch:{ all -> 0x00f6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x007b
            int r12 = r7.intValue()     // Catch:{ all -> 0x00f6 }
            X.2Qz[] r11 = X.C49572Qz.values()     // Catch:{ all -> 0x00f6 }
            int r10 = r11.length     // Catch:{ all -> 0x00f6 }
            r9 = 0
        L_0x0070:
            if (r9 >= r10) goto L_0x007b
            r8 = r11[r9]     // Catch:{ all -> 0x00f6 }
            int r7 = r8.value     // Catch:{ all -> 0x00f6 }
            if (r7 == r12) goto L_0x007c
            int r9 = r9 + 1
            goto L_0x0070
        L_0x007b:
            r8 = 0
        L_0x007c:
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x00f6 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x00f6 }
            X.36w r7 = new X.36w     // Catch:{ all -> 0x00f6 }
            r7.<init>(r8, r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "direct_path"
            java.lang.String r0 = X.C17890vO.A0S(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A05 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "media_key"
            byte[] r0 = X.C17890vO.A1X(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A0B = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "media_key_timestamp"
            int r9 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            r0 = 0
            long r0 = X.AnonymousClass1Eu.A02(r4, r9, r0)     // Catch:{ all -> 0x00f6 }
            r7.A02 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "enc_thumb_hash"
            java.lang.String r0 = X.C17890vO.A0S(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A06 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "thumb_hash"
            java.lang.String r0 = X.C17890vO.A0S(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A09 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "thumb_width"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            int r0 = X.AnonymousClass1Eu.A00(r4, r0, r6)     // Catch:{ all -> 0x00f6 }
            r7.A01 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "thumb_height"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            int r0 = X.AnonymousClass1Eu.A00(r4, r0, r6)     // Catch:{ all -> 0x00f6 }
            r7.A00 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "transferred"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            boolean r0 = X.AnonymousClass1Eu.A06(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A0A = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "micro_thumbnail"
            byte[] r0 = X.C17890vO.A1X(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A0C = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "handle"
            java.lang.String r0 = X.C17890vO.A0S(r4, r0)     // Catch:{ all -> 0x00f6 }
            r7.A07 = r0     // Catch:{ all -> 0x00f6 }
            r5.put(r8, r7)     // Catch:{ all -> 0x00f6 }
            goto L_0x003f
        L_0x00f2:
            r4.close()     // Catch:{ all -> 0x00fd }
            goto L_0x0106
        L_0x00f6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0104:
            r0 = 0
            goto L_0x0116
        L_0x0106:
            r2.close()
            X.2Qz r0 = X.C49572Qz.FAVICON
            java.lang.Object r1 = r5.get(r0)
            X.36w r1 = (X.C693536w) r1
            X.Ac6 r0 = new X.Ac6
            r0.<init>(r1)
        L_0x0116:
            X.210 r3 = (X.AnonymousClass210) r3
            X.C196869vm.A01(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C681732i.Bhl(X.25F):void");
    }
}
