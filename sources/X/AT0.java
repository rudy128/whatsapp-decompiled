package X;

public final class AT0 implements B83, B85, C436820m {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.23U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.21g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.23U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.23U} */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0137, code lost:
        if (r0 != false) goto L_0x00aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r17) {
        /*
            r16 = this;
            r4 = 0
            r5 = r17
            X.C18070vi.A0d(r5, r4)
            X.8cr r10 = r5.A08
            int r1 = r10.bitField0_
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004e
            X.8bJ r3 = r10.listResponseMessage_
            if (r3 != 0) goto L_0x0015
            X.8bJ r3 = X.C165538bJ.DEFAULT_INSTANCE
        L_0x0015:
            X.C17960vV.A07(r3)
            X.205 r2 = r5.A0A
            long r0 = r5.A03
            X.21g r8 = new X.21g
            r8.<init>(r2, r0)
            X.C18070vi.A0b(r3)
            X.C18070vi.A0d(r3, r4)
            java.lang.String r4 = r3.title_
            java.lang.String r5 = r3.description_
            X.8Xi r0 = r3.singleSelectReply_
            if (r0 != 0) goto L_0x0031
            X.8Xi r0 = X.C164048Xi.DEFAULT_INSTANCE
        L_0x0031:
            java.lang.String r6 = r0.selectedRowId_
            X.C18070vi.A0X(r6)
            int r1 = r3.listType_
            if (r1 == 0) goto L_0x004b
            r0 = 1
            if (r1 != r0) goto L_0x004b
            X.9Jf r0 = X.AnonymousClass9Jf.SINGLE_SELECT
        L_0x003f:
            int r7 = r0.value
            r2 = 0
            X.AEb r1 = new X.AEb
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A00 = r1
        L_0x004a:
            return r8
        L_0x004b:
            X.9Jf r0 = X.AnonymousClass9Jf.UNKNOWN
            goto L_0x003f
        L_0x004e:
            int r0 = r10.bitField1_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0179
            r0 = r16
            X.190 r9 = r0.A00
            X.205 r6 = r5.A0A
            long r1 = r5.A03
            int r7 = r5.A00
            X.00H r4 = r0.A02
            X.8ag r5 = r10.interactiveResponseMessage_
            if (r5 != 0) goto L_0x0066
            X.8ag r5 = X.C165158ag.DEFAULT_INSTANCE
        L_0x0066:
            int r3 = r5.interactiveResponseMessageCase_
            if (r3 == 0) goto L_0x014d
            r0 = 2
            if (r3 == r0) goto L_0x0149
            r0 = 0
        L_0x006e:
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            if (r0 != r11) goto L_0x0146
            java.lang.Object r0 = r4.get()
            X.11S r0 = (X.AnonymousClass11S) r0
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0146
            int r3 = r5.interactiveResponseMessageCase_
            r0 = 2
            if (r3 != r0) goto L_0x0142
            java.lang.Object r0 = r5.interactiveResponseMessage_
            X.8a9 r0 = (X.C164838a9) r0
        L_0x0087:
            java.lang.String r3 = "call_permission_request"
            java.lang.String r0 = r0.name_
            boolean r15 = r3.equals(r0)
        L_0x008f:
            boolean r13 = r6.A02
            int r3 = r5.interactiveResponseMessageCase_
            if (r3 == 0) goto L_0x013e
            r0 = 2
            if (r3 == r0) goto L_0x0099
            r11 = 0
        L_0x0099:
            java.lang.String r8 = "FMessageInteractiveResponseFactory/isUnknownInteractiveMessage"
            r4 = 0
            r14 = 1
            if (r11 == 0) goto L_0x013b
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r11 == r0) goto L_0x013b
            int r12 = r11.intValue()
            if (r12 == r4) goto L_0x011f
            r11 = -1
        L_0x00aa:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "message: "
            r3.append(r0)
            int r12 = 1 - r12
            if (r12 == 0) goto L_0x011c
            java.lang.String r0 = "NATIVE_FLOW_RESPONSE_MESSAGE"
        L_0x00b9:
            r3.append(r0)
            java.lang.String r0 = ", version: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r3, r11)
        L_0x00c2:
            r9.A0G(r8, r0, r4)
        L_0x00c5:
            if (r14 != 0) goto L_0x0151
            if (r15 != 0) goto L_0x0151
            int r0 = r5.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0119
            X.8Z4 r3 = r5.body_
            r0 = r3
            if (r3 != 0) goto L_0x00d6
            X.8Z4 r3 = X.AnonymousClass8Z4.DEFAULT_INSTANCE
        L_0x00d6:
            java.lang.String r8 = r3.text_
            if (r0 != 0) goto L_0x00dc
            X.8Z4 r0 = X.AnonymousClass8Z4.DEFAULT_INSTANCE
        L_0x00dc:
            int r3 = r0.format_
            if (r3 == 0) goto L_0x0116
            r0 = 1
            if (r3 != r0) goto L_0x0116
            X.9Je r7 = X.AnonymousClass9Je.EXTENSIONS_1
        L_0x00e5:
            int r0 = r5.interactiveResponseMessageCase_
            r3 = 2
            if (r0 != r3) goto L_0x016e
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0165
            int r0 = r5.interactiveResponseMessageCase_
            if (r0 != r3) goto L_0x0114
            java.lang.Object r0 = r5.interactiveResponseMessage_
            X.8a9 r0 = (X.C164838a9) r0
            java.lang.String r5 = r0.name_
            java.lang.String r4 = r0.paramsJson_
            int r0 = r0.version_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AE2 r3 = new X.AE2
            r3.<init>(r0, r5, r4)
        L_0x0107:
            X.AEb r0 = new X.AEb
            r0.<init>(r7, r3, r8)
            X.21g r8 = new X.21g
            r8.<init>(r6, r1)
            r8.A00 = r0
            return r8
        L_0x0114:
            r3 = 0
            goto L_0x0107
        L_0x0116:
            X.9Je r7 = X.AnonymousClass9Je.DEFAULT
            goto L_0x00e5
        L_0x0119:
            r8 = 0
            r7 = 0
            goto L_0x00e5
        L_0x011c:
            java.lang.String r0 = "INTERACTIVERESPONSEMESSAGE_NOT_SET"
            goto L_0x00b9
        L_0x011f:
            r0 = 2
            if (r3 != r0) goto L_0x0133
            java.lang.Object r0 = r5.interactiveResponseMessage_
            X.8a9 r0 = (X.C164838a9) r0
        L_0x0126:
            int r11 = r0.version_
            r3 = 3
            boolean r0 = X.C108975cc.A1D(r11, r3)
            if (r13 != 0) goto L_0x0136
            if (r11 >= r3) goto L_0x0136
            goto L_0x00aa
        L_0x0133:
            X.8a9 r0 = X.C164838a9.DEFAULT_INSTANCE
            goto L_0x0126
        L_0x0136:
            r14 = r0
            if (r0 == 0) goto L_0x00c5
            goto L_0x00aa
        L_0x013b:
            java.lang.String r0 = "messageCase null/not_set"
            goto L_0x00c2
        L_0x013e:
            java.lang.Integer r11 = X.AnonymousClass00R.A01
            goto L_0x0099
        L_0x0142:
            X.8a9 r0 = X.C164838a9.DEFAULT_INSTANCE
            goto L_0x0087
        L_0x0146:
            r15 = 0
            goto L_0x008f
        L_0x0149:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x006e
        L_0x014d:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x006e
        L_0x0151:
            byte[] r10 = r10.A0M()
            r11 = 2
            X.23U r8 = new X.23U
            r12 = r7
            r13 = r1
            r9 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            if (r15 == 0) goto L_0x004a
            r0 = 10003(0x2713, float:1.4017E-41)
            r8.A00 = r0
            return r8
        L_0x0165:
            r1 = 26
            java.lang.String r0 = "NFM response message is required body"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected value: "
            java.lang.IllegalStateException r0 = X.AnonymousClass8BX.A0W(r0, r1, r4)
            throw r0
        L_0x0179:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AT0.CBG(X.A6d):X.206");
    }

    public AT0(AnonymousClass190 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r3) {
        C18070vi.A0h(r3, a2m);
        C438721g r32 = (C438721g) r3;
        AnonymousClass3M5 A002 = ((C190809lY) this.A01.get()).A00(r32);
        if (A002 != null) {
            A002.BDa(a2m, r32);
        }
    }
}
