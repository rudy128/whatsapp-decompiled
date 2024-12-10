package X;

/* renamed from: X.2qr  reason: invalid class name and case insensitive filesystem */
public class C62142qr {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r5.inlineInitialPayloadInE2EeMsg_ == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r5.supportCallLogHistory_ == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if (r5.supportBotUserAgentChatHistory_ == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
        if (r5.supportCagReactionsAndPolls_ == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0090, code lost:
        if (r5.supportRecentSyncChunkMessageCountTuning_ == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        if (r5.supportHostedGroupMsg_ == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b0, code lost:
        if (r5.supportFbidBotChatHistory_ == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c0, code lost:
        if (r5.supportBizHostedMsg_ == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d0, code lost:
        if (r5.supportAddOnHistorySyncMigration_ == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62142qr(X.AnonymousClass2BW r5) {
        /*
            r4 = this;
            r4.<init>()
            r3 = 0
            if (r5 == 0) goto L_0x00ec
            int r0 = r5.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00ec
            int r0 = r5.fullSyncDaysLimit_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0012:
            r4.A00 = r0
            if (r5 == 0) goto L_0x00e9
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00e9
            int r0 = r5.fullSyncSizeMbLimit_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0022:
            r4.A01 = r0
            if (r5 == 0) goto L_0x00e6
            int r0 = r5.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00e6
            int r0 = r5.storageQuotaMb_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r4.A03 = r0
            r2 = 1
            if (r5 == 0) goto L_0x0042
            int r0 = r5.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0042
            boolean r1 = r5.inlineInitialPayloadInE2EeMsg_
            r0 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r4.A04 = r0
            if (r5 == 0) goto L_0x0053
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0053
            int r0 = r5.recentSyncDaysLimit_
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0053:
            r4.A02 = r3
            if (r5 == 0) goto L_0x0062
            int r0 = r5.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0062
            boolean r1 = r5.supportCallLogHistory_
            r0 = 1
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r4.A09 = r0
            if (r5 == 0) goto L_0x0072
            int r0 = r5.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0072
            boolean r1 = r5.supportBotUserAgentChatHistory_
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r4.A07 = r0
            if (r5 == 0) goto L_0x0082
            int r0 = r5.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0082
            boolean r1 = r5.supportCagReactionsAndPolls_
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r4.A08 = r0
            if (r5 == 0) goto L_0x0092
            int r0 = r5.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0092
            boolean r1 = r5.supportRecentSyncChunkMessageCountTuning_
            r0 = 1
            if (r1 != 0) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            r4.A0D = r0
            if (r5 == 0) goto L_0x00a2
            int r0 = r5.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00a2
            boolean r1 = r5.supportHostedGroupMsg_
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r4.A0B = r0
            if (r5 == 0) goto L_0x00b2
            int r0 = r5.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r5.supportFbidBotChatHistory_
            r0 = 1
            if (r1 != 0) goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r4.A0A = r0
            if (r5 == 0) goto L_0x00c2
            int r0 = r5.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00c2
            boolean r1 = r5.supportBizHostedMsg_
            r0 = 1
            if (r1 != 0) goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            r4.A06 = r0
            if (r5 == 0) goto L_0x00d2
            int r0 = r5.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00d2
            boolean r1 = r5.supportAddOnHistorySyncMigration_
            r0 = 1
            if (r1 != 0) goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            r4.A05 = r0
            if (r5 == 0) goto L_0x00e4
            int r0 = r5.bitField0_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r5.supportMessageAssociation_
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            r4.A0C = r2
            return
        L_0x00e4:
            r2 = 0
            goto L_0x00e1
        L_0x00e6:
            r0 = r3
            goto L_0x0032
        L_0x00e9:
            r0 = r3
            goto L_0x0022
        L_0x00ec:
            r0 = r3
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62142qr.<init>(X.2BW):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("fullSyncDaysLimit: ");
        A10.append(this.A00);
        A10.append(", fullSyncSizeMbLimit: ");
        A10.append(this.A01);
        A10.append(", storageQuotaMb: ");
        A10.append(this.A03);
        A10.append(", inlineInitialHistSyncPayloadEnabled: ");
        A10.append(this.A04);
        A10.append(", recentSyncDaysLimit: ");
        A10.append(this.A02);
        A10.append(", supportCallLogHistory: ");
        A10.append(this.A09);
        A10.append(", supportBotUserAgentChatHistory: ");
        A10.append(this.A07);
        A10.append(", supportCagReactionsAndPolls: ");
        A10.append(this.A08);
        A10.append(", supportRecentSyncChunkMessageCountTuning: ");
        A10.append(this.A0D);
        A10.append(", supportHostedGroupMsg: ");
        A10.append(this.A0B);
        A10.append(", supportBizHostedMsg: ");
        A10.append(this.A06);
        return A10.toString();
    }

    public C62142qr(Integer num, Integer num2, Integer num3, Integer num4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A07 = z;
        this.A08 = z2;
        this.A00 = num;
        this.A01 = num2;
        this.A03 = num3;
        this.A04 = z8;
        this.A02 = num4;
        this.A09 = z7;
        this.A0D = z3;
        this.A0B = z4;
        this.A0A = z5;
        this.A06 = z6;
        this.A05 = z9;
        this.A0C = z10;
    }
}
