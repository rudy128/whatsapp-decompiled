package X;

public final class CY4 {
    public final AnonymousClass1Cd A00;

    public CY4(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7LG r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.1Cd r0 = r8.A00     // Catch:{ SQLiteConstraintException -> 0x008f }
            X.1au r4 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x008f }
            X.CM2 r0 = r9.A04     // Catch:{ all -> 0x0088 }
            int r1 = r0.A00     // Catch:{ all -> 0x0088 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0088 }
            r0 = 0
            if (r1 != r0) goto L_0x0016
            r7 = 0
        L_0x0016:
            X.Cho r0 = r9.A02     // Catch:{ all -> 0x0088 }
            int r0 = r0.A00     // Catch:{ all -> 0x0088 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0021
            r6 = 0
        L_0x0021:
            X.Cho r0 = r9.A03     // Catch:{ all -> 0x0088 }
            int r0 = r0.A00     // Catch:{ all -> 0x0088 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            int r0 = r9.A01     // Catch:{ all -> 0x0088 }
            r2 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0088 }
        L_0x0035:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0088 }
            r5.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0088 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "waveform"
            byte[] r0 = r9.A08     // Catch:{ all -> 0x0088 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "background_color"
            int r0 = r9.A00     // Catch:{ all -> 0x0088 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0088 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "transcription_status"
            r5.put(r0, r7)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "transcription_request_locale"
            r5.put(r0, r6)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "transcription_locale"
            r5.put(r0, r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "transcription_confidence_threshold"
            r5.put(r0, r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "transcription_feedback_submitted"
            boolean r0 = r9.A07     // Catch:{ all -> 0x0088 }
            X.C50072Ta.A00(r5, r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "transcription_id"
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x0088 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0088 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0088 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "audio_data"
            java.lang.String r1 = "INSERT_AUDIO_DATA_SQL"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x0088 }
            r4.close()     // Catch:{ SQLiteConstraintException -> 0x008f }
            return
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteConstraintException -> 0x008f }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x008f }
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "WaveformMessageStore/insertWaveform/"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CY4.A00(X.7LG, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0135, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0138, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C441822l r14) {
        /*
            r13 = this;
            r7 = 0
            X.C18070vi.A0d(r14, r7)
            long r4 = r14.A0x
            X.1Cd r0 = r13.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0132 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "\n          SELECT\n            message_row_id,\n            waveform,\n            background_color,\n            transcription_status,\n            transcription_request_locale,\n            transcription_locale,\n            transcription_confidence_threshold,\n            transcription_feedback_submitted,\n            transcription_id\n          FROM audio_data\n          WHERE message_row_id = ?\n        "
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0132 }
            r1[r7] = r0     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "GET_AUDIO_DATA_SQL"
            android.database.Cursor r3 = r6.A0A(r3, r0, r1)     // Catch:{ all -> 0x0132 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0132 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x012b }
            r4 = 0
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "waveform"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            byte[] r9 = r3.getBlob(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "background_color"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            int r10 = r3.getInt(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "transcription_status"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            java.lang.Integer r0 = X.AnonymousClass24X.A00(r3, r0)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00d1
            int r1 = r0.intValue()     // Catch:{ all -> 0x012b }
            X.Bvt r7 = X.C24127Bvt.A00     // Catch:{ all -> 0x012b }
            r0 = 0
            if (r1 == r0) goto L_0x00d9
            X.Bvm r7 = X.C24120Bvm.A00     // Catch:{ all -> 0x012b }
            r0 = -1
            if (r1 == r0) goto L_0x00d9
            X.Bvl r7 = X.C24119Bvl.A00     // Catch:{ all -> 0x012b }
            r0 = -4
            if (r1 == r0) goto L_0x00d9
            X.Bvn r7 = X.C24121Bvn.A00     // Catch:{ all -> 0x012b }
            r0 = -2
            if (r1 == r0) goto L_0x00d9
            X.Bvr r7 = X.C24125Bvr.A00     // Catch:{ all -> 0x012b }
            r0 = -3
            if (r1 == r0) goto L_0x00d9
            X.Bvs r7 = X.C24126Bvs.A00     // Catch:{ all -> 0x012b }
            r0 = -5
            if (r1 == r0) goto L_0x00d9
            X.BvU r7 = X.C24102BvU.A00     // Catch:{ all -> 0x012b }
            r0 = 2
            if (r1 == r0) goto L_0x00d9
            X.BvV r7 = X.C24103BvV.A00     // Catch:{ all -> 0x012b }
            r0 = 3
            if (r1 == r0) goto L_0x00d9
            X.BvX r7 = X.C24105BvX.A00     // Catch:{ all -> 0x012b }
            r0 = 4
            if (r1 == r0) goto L_0x00d9
            X.Bvb r7 = X.C24109Bvb.A00     // Catch:{ all -> 0x012b }
            r0 = 5
            if (r1 == r0) goto L_0x00d9
            X.Bva r7 = X.C24108Bva.A00     // Catch:{ all -> 0x012b }
            r0 = 6
            if (r1 == r0) goto L_0x00d9
            X.Bvf r7 = X.C24113Bvf.A00     // Catch:{ all -> 0x012b }
            r0 = 7
            if (r1 == r0) goto L_0x00d9
            X.Bvd r7 = X.C24111Bvd.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvc r7 = X.C24110Bvc.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bve r7 = X.C24112Bve.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvk r7 = X.C24118Bvk.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvi r7 = X.C24116Bvi.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvj r7 = X.C24117Bvj.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvg r7 = X.C24114Bvg.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.BvY r7 = X.C24106BvY.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.BvZ r7 = X.C24107BvZ.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            X.Bvh r7 = X.C24115Bvh.A00     // Catch:{ all -> 0x012b }
            int r0 = r7.A00     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00d9
            if (r1 <= 0) goto L_0x00d4
            X.BvT r7 = new X.BvT     // Catch:{ all -> 0x012b }
            r7.<init>(r1)     // Catch:{ all -> 0x012b }
            goto L_0x00d9
        L_0x00d1:
            X.Bvt r7 = X.C24127Bvt.A00     // Catch:{ all -> 0x012b }
            goto L_0x00d9
        L_0x00d4:
            X.Bvp r7 = new X.Bvp     // Catch:{ all -> 0x012b }
            r7.<init>(r1)     // Catch:{ all -> 0x012b }
        L_0x00d9:
            X.CXq r1 = X.C25550Cho.A02     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "transcription_request_locale"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            java.lang.Integer r0 = X.AnonymousClass24X.A00(r3, r0)     // Catch:{ all -> 0x012b }
            X.Cho r5 = r1.A00(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "transcription_locale"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            java.lang.Integer r0 = X.AnonymousClass24X.A00(r3, r0)     // Catch:{ all -> 0x012b }
            X.Cho r6 = r1.A00(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "transcription_confidence_threshold"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            r11 = 0
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x0108
            int r11 = r3.getInt(r1)     // Catch:{ all -> 0x012b }
        L_0x0108:
            java.lang.String r0 = "transcription_feedback_submitted"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            boolean r12 = X.AnonymousClass24X.A01(r3, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "transcription_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r8 = r3.getString(r0)     // Catch:{ all -> 0x012b }
            X.7LG r4 = new X.7LG     // Catch:{ all -> 0x012b }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x012b }
        L_0x0121:
            r3.close()     // Catch:{ all -> 0x0132 }
            r2.close()
            r14.A1H(r4)
            return
        L_0x012b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CY4.A01(X.22l):void");
    }
}
