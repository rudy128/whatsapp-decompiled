package X;

/* renamed from: X.8pt  reason: invalid class name and case insensitive filesystem */
public final class C170458pt extends C170598qH implements C22443B7z {
    public final long A00;
    public final boolean A01;
    public final String[] A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170458pt(X.C19999A2n r15, X.AnonymousClass1BI r16, java.lang.String r17, long r18, long r20, boolean r22, boolean r23) {
        /*
            r14 = this;
            r10 = 2
            X.2rJ r5 = X.C62382rJ.A03
            java.lang.String r9 = "regular_high"
            r4 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r11 = r20
            r13 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            r3 = r22
            r14.A01 = r3
            r0 = r18
            r14.A00 = r0
            java.lang.String[] r2 = new java.lang.String[r10]
            r1 = 0
            java.lang.String r0 = "mute"
            r2[r1] = r0
            java.lang.String r1 = r7.getRawString()
            r0 = 1
            r2[r0] = r1
            r14.A02 = r2
            r0 = r22 ^ 1
            r14.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170458pt.<init>(X.A2n, X.1BI, java.lang.String, long, long, boolean, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = C164998aQ.DEFAULT_INSTANCE.A0N();
        boolean z = this.A01;
        C164998aQ r1 = (C164998aQ) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        if (z) {
            long j = this.A00;
            C164998aQ r12 = (C164998aQ) C17880vN.A0G(A0N);
            r12.bitField0_ |= 2;
            r12.muteEndTimestamp_ = j;
        }
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        C164998aQ r13 = (C164998aQ) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0O.muteAction_ = r13;
        A0O.bitField0_ |= 8;
        return A08;
    }

    public boolean Bgp() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "MuteChatMutation {\n          rowId = ", A10);
        C20126A8l.A00(this, ",\n          chatJid = ", A10);
        A10.append(",\n          muteEndTimestamp = ");
        A10.append(this.A00);
        A10.append(",\n          isMuted = ");
        A10.append(this.A01);
        C20126A8l.A02(this, ",\n          timestamp = ", A10);
        C20126A8l.A03(this, ",\n          areDependenciesMissing = ", A10);
        C20126A8l.A04(this, ",\n          operation = ", A10);
        C20126A8l.A01(this, ",\n          collectionName = ", A10);
        C20126A8l.A06(this, ",\n          keyId = ", A10);
        return AnonymousClass8BW.A0k("\n      }", A10);
    }
}
