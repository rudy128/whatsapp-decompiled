package X;

/* renamed from: X.6lK  reason: invalid class name and case insensitive filesystem */
public final class C131576lK {
    public final AnonymousClass1Cd A00;

    public C131576lK(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C441822l r14) {
        /*
            r13 = this;
            java.lang.String r8 = "transcription_segment"
            r5 = 0
            X.1Cd r0 = r13.A00
            X.1au r6 = r0.A05()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0081 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0081 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0081 }
            long r1 = r14.A0x     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "message_row_id = ?"
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0081 }
            X.C17880vN.A1V(r3, r5, r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "DELETE_TRANSCRIPTION_SEGMENTS_SQL"
            r7.A04(r8, r4, r0, r3)     // Catch:{ all -> 0x0081 }
            X.25F r0 = r14.A01     // Catch:{ all -> 0x0081 }
            X.229 r0 = r0.A02     // Catch:{ all -> 0x0081 }
            X.7LE r0 = (X.AnonymousClass7LE) r0     // Catch:{ all -> 0x0081 }
            r12 = 0
            if (r0 == 0) goto L_0x007d
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0081 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0030:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0081 }
            X.6t3 r10 = (X.C135966t3) r10     // Catch:{ all -> 0x0081 }
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "message_row_id"
            X.C17880vN.A19(r9, r0, r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "substring_start"
            int r0 = r10.A03     // Catch:{ all -> 0x0081 }
            X.C17880vN.A18(r9, r3, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "substring_length"
            int r0 = r10.A02     // Catch:{ all -> 0x0081 }
            X.C17880vN.A18(r9, r3, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "timestamp"
            int r3 = r10.A04     // Catch:{ all -> 0x0081 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0081 }
            r5 = -1
            if (r3 != r5) goto L_0x005f
            r0 = r12
        L_0x005f:
            r9.put(r4, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "duration"
            int r3 = r10.A01     // Catch:{ all -> 0x0081 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0081 }
            if (r3 != r5) goto L_0x006d
            r0 = r12
        L_0x006d:
            r9.put(r4, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "confidence"
            int r0 = r10.A00     // Catch:{ all -> 0x0081 }
            X.C17880vN.A18(r9, r3, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "INSERT_TRANSCRIPTION_SEGMENT_SQL"
            r7.A06(r8, r0, r9)     // Catch:{ all -> 0x0081 }
            goto L_0x0030
        L_0x007d:
            r6.close()
            return
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131576lK.A00(X.22l):void");
    }
}
