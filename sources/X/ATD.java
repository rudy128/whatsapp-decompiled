package X;

public class ATD implements B83, B85, AnonymousClass3LE, C436820m {
    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C61402pc.A00(r4, "scheduled_call_type", "creation");
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r10) {
        C179789Jx r4;
        if (r10 instanceof C444323k) {
            C444223j r102 = (C444223j) r10;
            int i = r102.A00;
            String str = r102.A02;
            long j = r102.A01;
            AnonymousClass8X8 r5 = a2m.A00;
            C164918aH r0 = ((C166418cr) r5.A00).scheduledCallCreationMessage_;
            if (r0 == null) {
                r0 = C164918aH.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            if (i == 0) {
                r4 = C179789Jx.UNKNOWN;
            } else if (i == 1) {
                r4 = C179789Jx.VOICE;
            } else if (i == 2) {
                r4 = C179789Jx.VIDEO;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unexpected type (");
                A10.append(i);
                throw AnonymousClass001.A12(")", A10);
            }
            C164918aH r1 = (C164918aH) C17880vN.A0G(A0O);
            int i2 = C164918aH.CALL_TYPE_FIELD_NUMBER;
            r1.callType_ = r4.value;
            r1.bitField0_ |= 2;
            C164918aH r12 = (C164918aH) C17880vN.A0G(A0O);
            str.getClass();
            r12.bitField0_ |= 4;
            r12.title_ = str;
            C164918aH r13 = (C164918aH) C17880vN.A0G(A0O);
            r13.bitField0_ |= 1;
            r13.scheduledTimestampMs_ = j;
            C166418cr A0M = AnonymousClass8BS.A0M(r5);
            C164918aH r02 = (C164918aH) A0O.A0C();
            r02.getClass();
            A0M.scheduledCallCreationMessage_ = r02;
            A0M.bitField1_ |= 65536;
            return;
        }
        throw AnonymousClass000.A0k("FMessageScheduledCallProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r8) {
        /*
            r7 = this;
            X.8cr r2 = r8.A08
            int r1 = r2.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0077
            X.8aH r5 = r2.scheduledCallCreationMessage_
            if (r5 != 0) goto L_0x000f
            X.8aH r5 = X.C164918aH.DEFAULT_INSTANCE
        L_0x000f:
            X.C17960vV.A07(r5)
            X.205 r2 = r8.A0A
            long r0 = r8.A03
            X.23k r4 = new X.23k
            r4.<init>(r2, r0)
            int r6 = r5.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r6)
            r3 = 0
            if (r0 == 0) goto L_0x0066
            long r0 = r5.scheduledTimestampMs_
            r4.A01 = r0
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0046
            int r1 = r5.callType_
            if (r1 == 0) goto L_0x0052
            r0 = 1
            if (r1 == r0) goto L_0x004f
            r0 = 2
            if (r1 != r0) goto L_0x0052
            X.9Jx r0 = X.C179789Jx.VIDEO
        L_0x0038:
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r3) goto L_0x0044
            r0 = 2
            if (r2 != r1) goto L_0x0044
            r0 = 1
        L_0x0044:
            r4.A00 = r0
        L_0x0046:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r5.title_
            r4.A02 = r0
            return r4
        L_0x004f:
            X.9Jx r0 = X.C179789Jx.VOICE
            goto L_0x0038
        L_0x0052:
            X.9Jx r0 = X.C179789Jx.UNKNOWN
            goto L_0x0038
        L_0x0055:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageScheduledCall/missing title; message.key="
            X.AnonymousClass8BT.A1H(r4, r0, r1)
            X.C17890vO.A0w(r1)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r3)
            throw r0
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageScheduledCall/missing scheduledTimeStampMs; message.key="
            X.AnonymousClass8BT.A1H(r4, r0, r1)
            X.C17890vO.A0w(r1)
            X.1hd r0 = X.AnonymousClass8BR.A0o(r3)
            throw r0
        L_0x0077:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATD.CBG(X.A6d):X.206");
    }
}
