package X;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
public final class C56872iA {
    public final AnonymousClass1Cd A00;

    public C56872iA(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r1 != true) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        if (r1 != true) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012e, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0131, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080 A[SYNTHETIC, Splitter:B:35:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e3 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011b A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0 A[EDGE_INSN: B:88:0x00f0->B:70:0x00f0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass206 r12) {
        /*
            r11 = this;
            boolean r0 = X.C63672tV.A04(r12)
            if (r0 == 0) goto L_0x0132
            X.1Cd r0 = r11.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17890vO.A08()     // Catch:{ all -> 0x012b }
            X.AnonymousClass206.A04(r4, r12)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "status_distribution_mode"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0031
            int r0 = r0.A00     // Catch:{ all -> 0x012b }
        L_0x001e:
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "is_mentioned"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            r10 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0033
            boolean r1 = r0.A09     // Catch:{ all -> 0x012b }
            r0 = 1
            if (r1 == r10) goto L_0x0034
            goto L_0x0033
        L_0x0031:
            r0 = 3
            goto L_0x001e
        L_0x0033:
            r0 = 0
        L_0x0034:
            X.C63432t4.A02(r4, r2, r0)     // Catch:{ all -> 0x012b }
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0046
            java.util.Set r0 = r0.A05     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0046
            int r3 = r0.size()     // Catch:{ all -> 0x012b }
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            r2 = 5
            r9 = 0
            if (r3 > r2) goto L_0x0054
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0077
            java.util.Set r0 = r0.A05     // Catch:{ all -> 0x012b }
            goto L_0x0073
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "Attempted to save "
            r1.append(r0)     // Catch:{ all -> 0x012b }
            r1.append(r3)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = " status mentions, but up to 5 are allowed per status post."
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x012b }
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0077
            java.util.Set r0 = r0.A05     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0077
            java.util.List r0 = X.C29431cG.A0v(r0, r2)     // Catch:{ all -> 0x012b }
        L_0x0073:
            java.lang.String r2 = "status_mentions"
            goto L_0x0079
        L_0x0077:
            r0 = r9
            goto L_0x0073
        L_0x0079:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r0 = r3
            goto L_0x008a
        L_0x0080:
            java.util.ArrayList r1 = X.C22971Dz.A0B(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C29431cG.A0g(r0, r3, r3, r1, r9)     // Catch:{ all -> 0x012b }
        L_0x008a:
            r4.put(r2, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "status_mention_source"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00a4
            java.util.Set r0 = r0.A04     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00a4
            java.util.ArrayList r1 = X.C22971Dz.A0B(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = ","
            java.lang.String r3 = X.C29431cG.A0g(r0, r3, r3, r1, r9)     // Catch:{ all -> 0x012b }
        L_0x00a4:
            r4.put(r2, r3)     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "cannot_receive_reactions"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00b4
            boolean r1 = r0.A07     // Catch:{ all -> 0x012b }
            r0 = 1
            if (r1 == r10) goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            X.C50072Ta.A00(r4, r2, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "cannot_be_ranked"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00c5
            boolean r1 = r0.A06     // Catch:{ all -> 0x012b }
            r0 = 1
            if (r1 == r10) goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            X.C50072Ta.A00(r4, r2, r0)     // Catch:{ all -> 0x012b }
            java.lang.String r8 = "has_embedded_music"
            boolean r0 = r12 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00f0
            r0 = r12
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00f0
            X.2rc r0 = r0.A02     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00f0
            com.whatsapp.InteractiveAnnotation[] r6 = r0.A0b     // Catch:{ all -> 0x012b }
            if (r6 == 0) goto L_0x00f0
            int r3 = r6.length     // Catch:{ all -> 0x012b }
            r2 = 0
            goto L_0x00e1
        L_0x00df:
            int r2 = r2 + 1
        L_0x00e1:
            if (r2 >= r3) goto L_0x00f0
            r0 = r6[r2]     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00ee
            X.2Qq r1 = r0.type     // Catch:{ all -> 0x012b }
        L_0x00e9:
            X.2Qq r0 = X.C49482Qq.MUSIC     // Catch:{ all -> 0x012b }
            if (r1 == r0) goto L_0x00f1
            goto L_0x00df
        L_0x00ee:
            r1 = r9
            goto L_0x00e9
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            X.C50072Ta.A00(r4, r8, r10)     // Catch:{ all -> 0x012b }
            java.lang.String r1 = "status_attribution_type"
            X.36j r0 = X.C63672tV.A02(r12)     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0103
            X.6RJ r0 = r0.A02     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0103
            int r7 = r0.value     // Catch:{ all -> 0x012b }
        L_0x0103:
            X.C17880vN.A18(r4, r1, r7)     // Catch:{ all -> 0x012b }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x012b }
            java.lang.String r2 = "status_message_info"
            java.lang.String r1 = "StatusMessageDistributionModeStore/insertStatusDistributionModeData"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x012b }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0127
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "StatusMessageDistributionModeStore/insertStatusDistributionModeData/insert error, rowId="
            X.AnonymousClass206.A06(r12, r0, r1)     // Catch:{ all -> 0x012b }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x012b }
        L_0x0127:
            r5.close()
            return
        L_0x012b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56872iA.A00(X.206):void");
    }
}
