package X;

/* renamed from: X.Don  reason: case insensitive filesystem */
public final class C27951Don extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BXE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27951Don(BXE bxe) {
        super(1);
        this.this$0 = bxe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r6 = r4.A00;
        r4 = r6.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = "request_media_stream_start_unknown_failure";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r4.A04("failure_reason", r0);
        r4.A01(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r5 = new X.C22952BWy(r1);
        r1 = X.AnonymousClass000.A10();
        r1.append("Stream Start Failure - Error: ");
        r1.append(r5.A00);
        r0 = X.BE6.A0u(X.AnonymousClass000.A0y(" -- DUMP STATE:\n\t", r1));
        r6.A05(r0);
        r2.A06("sup:MediaStreamState", r0.toString(), (java.lang.Throwable) null);
        r6.A04(new X.BXU(r5));
        r6.A0N.invoke(r5, X.BNB.A00(r6, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            X.C3X r8 = (X.C3X) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            boolean r0 = r8 instanceof X.C22936BWe
            if (r0 == 0) goto L_0x0016
            X.BXE r0 = r7.this$0
            X.BQm r1 = r0.A00
            X.BXc r0 = X.C22956BXc.A00
            r1.A04(r0)
        L_0x0013:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            boolean r0 = r8 instanceof X.C22933BWb
            if (r0 == 0) goto L_0x00c4
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.BWb r8 = (X.C22933BWb) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: InternalError"
            r2.A05(r1, r0, r3)
            X.BXE r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_INTERNAL_ERROR"
        L_0x002b:
            int r0 = r1.hashCode()
            java.lang.String r5 = "failure_reason"
            switch(r0) {
                case -646453283: goto L_0x00b2;
                case -195374854: goto L_0x00a1;
                case 39350972: goto L_0x0090;
                case 554408463: goto L_0x007f;
                default: goto L_0x0034;
            }
        L_0x0034:
            X.BQm r6 = r4.A00
            X.Cms r4 = r6.A0J
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_unknown_failure"
        L_0x003c:
            r4.A04(r5, r0)
            r0 = 3
            r4.A01(r0)
        L_0x0043:
            X.BWy r5 = new X.BWy
            r5.<init>(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stream Start Failure - Error: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " -- DUMP STATE:\n\t"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.StringBuilder r0 = X.BE6.A0u(r0)
            r6.A05(r0)
            java.lang.String r4 = r0.toString()
            r1 = 0
            java.lang.String r0 = "sup:MediaStreamState"
            r2.A06(r0, r4, r1)
            X.BXU r0 = new X.BXU
            r0.<init>(r5)
            r6.A04(r0)
            X.1OS r1 = r6.A0N
            X.BTj r0 = X.BNB.A00(r6, r3)
            r1.invoke(r5, r0)
            goto L_0x0013
        L_0x007f:
            java.lang.String r0 = "LIVE_STREAM_START_INTERNAL_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.BQm r6 = r4.A00
            X.Cms r4 = r6.A0J
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_internal_failure"
            goto L_0x003c
        L_0x0090:
            java.lang.String r0 = "LIVE_STREAM_START_INVALID_PARAM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.BQm r6 = r4.A00
            X.Cms r4 = r6.A0J
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_invalid_parameter_failure"
            goto L_0x003c
        L_0x00a1:
            java.lang.String r0 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.BQm r6 = r4.A00
            X.Cms r4 = r6.A0J
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_start_unsupported_parameter_failure"
            goto L_0x003c
        L_0x00b2:
            java.lang.String r0 = "LIVE_STREAM_START_DOFF_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.BQm r6 = r4.A00
            X.Cms r4 = r6.A0J
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = "request_media_stream_device_doff"
            goto L_0x003c
        L_0x00c4:
            boolean r0 = r8 instanceof X.C22934BWc
            if (r0 == 0) goto L_0x00db
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.BWc r8 = (X.C22934BWc) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: InvalidParameterError"
            r2.A05(r1, r0, r3)
            X.BXE r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_INVALID_PARAM"
            goto L_0x002b
        L_0x00db:
            boolean r0 = r8 instanceof X.C22935BWd
            if (r0 == 0) goto L_0x00f2
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.BWd r8 = (X.C22935BWd) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: UnsupportedParameterError"
            r2.A05(r1, r0, r3)
            X.BXE r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            goto L_0x002b
        L_0x00f2:
            boolean r0 = r8 instanceof X.C22932BWa
            if (r0 == 0) goto L_0x0013
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:IdleStateDelegate"
            X.BWa r8 = (X.C22932BWa) r8
            java.lang.Throwable r3 = r8.A00
            java.lang.String r0 = "[IDLE]: Start Stream Callback: DeviceDoff. Device cannot start stream!"
            r2.A05(r1, r0, r3)
            X.BXE r4 = r7.this$0
            java.lang.String r1 = "LIVE_STREAM_START_DOFF_ERROR"
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27951Don.invoke(java.lang.Object):java.lang.Object");
    }
}
