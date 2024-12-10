package X;

/* renamed from: X.256  reason: invalid class name */
public final class AnonymousClass256 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass256(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r12, X.C49702Rn r13) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.205 r6 = r12.A0v
            X.1BI r2 = r6.A00
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x014a
            X.00H r0 = r11.A00
            java.lang.Object r1 = r0.get()
            X.2iA r1 = (X.C56872iA) r1
            r8 = 0
            boolean r0 = X.C22971Dz.A0a(r2)
            if (r0 == 0) goto L_0x0139
            X.1Cd r0 = r1.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012f }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "SELECT status_distribution_mode, is_mentioned, status_mentions, status_mention_source, cannot_receive_reactions, cannot_be_ranked, has_embedded_music,status_attribution_type  FROM status_message_info WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x012f }
            long r0 = r12.A0x     // Catch:{ all -> 0x012f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x012f }
            r3[r8] = r0     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "GET_STATUS_DISTRIBUTION_MODE"
            android.database.Cursor r3 = r5.A0A(r4, r0, r3)     // Catch:{ all -> 0x012f }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0124
            boolean r0 = r6.A02     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "status_distribution_mode"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            int r4 = r3.getInt(r1)     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x006d
            r0 = 1
            if (r4 == r0) goto L_0x006d
            r0 = 2
            if (r4 == r0) goto L_0x006d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "StatusMessageDistributionModeStore/fillStatusDistributionMode unexpected db value="
            r1.append(r0)     // Catch:{ all -> 0x0128 }
            r1.append(r4)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0128 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0077
        L_0x006d:
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x0128 }
            X.36j r0 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            r0.A00 = r1     // Catch:{ all -> 0x0128 }
        L_0x0077:
            java.lang.String r0 = "is_mentioned"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "status_mentions"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "status_mention_source"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            X.36j r7 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            java.lang.String r10 = r3.getString(r1)     // Catch:{ all -> 0x0128 }
            r4 = 0
            if (r10 == 0) goto L_0x00b0
            java.lang.Class<X.1BI> r9 = X.AnonymousClass1BI.class
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = ","
            r1[r8] = r0     // Catch:{ all -> 0x0128 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r10, r1, r8)     // Catch:{ all -> 0x0128 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            X.C22971Dz.A0G(r9, r0, r1)     // Catch:{ all -> 0x0128 }
            boolean r0 = r1 instanceof java.util.Set     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00b0
            r4 = r1
        L_0x00b0:
            r7.A05 = r4     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r6)     // Catch:{ all -> 0x0128 }
            r7.A09 = r0     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = r3.getString(r5)     // Catch:{ all -> 0x0128 }
            r5 = 0
            if (r6 == 0) goto L_0x00d9
            java.lang.Class<X.1BI> r4 = X.AnonymousClass1BI.class
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = ","
            r1[r8] = r0     // Catch:{ all -> 0x0128 }
            java.util.List r0 = X.AnonymousClass1YF.A0S(r6, r1, r8)     // Catch:{ all -> 0x0128 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            X.C22971Dz.A0G(r4, r0, r1)     // Catch:{ all -> 0x0128 }
            boolean r0 = r1 instanceof java.util.Set     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00d9
            r5 = r1
        L_0x00d9:
            r7.A04 = r5     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "cannot_receive_reactions"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            X.36j r1 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r0)     // Catch:{ all -> 0x0128 }
            r1.A07 = r0     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "cannot_be_ranked"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            X.36j r1 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r0)     // Catch:{ all -> 0x0128 }
            r1.A06 = r0     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "has_embedded_music"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            X.36j r1 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            boolean r0 = X.AnonymousClass24X.A01(r3, r0)     // Catch:{ all -> 0x0128 }
            r1.A08 = r0     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "status_attribution_type"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0128 }
            X.6RJ r1 = X.AnonymousClass6WE.A00(r0)     // Catch:{ all -> 0x0128 }
            X.36j r0 = X.C63672tV.A01(r12)     // Catch:{ all -> 0x0128 }
            r0.A02 = r1     // Catch:{ all -> 0x0128 }
        L_0x0124:
            r3.close()     // Catch:{ all -> 0x012f }
            goto L_0x0136
        L_0x0128:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ all -> 0x012f }
        L_0x012f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0136:
            r2.close()
        L_0x0139:
            if (r13 == 0) goto L_0x014a
            java.lang.Class<X.256> r1 = X.AnonymousClass256.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass256.CCZ(X.206, X.2Rn):void");
    }
}
