package X;

/* renamed from: X.AeI  reason: case insensitive filesystem */
public final /* synthetic */ class C21088AeI implements B9W {
    public final /* synthetic */ C170018ny A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        r2.A0F(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtO(java.lang.Object r10) {
        /*
            r9 = this;
            X.8ny r2 = r9.A00
            java.lang.String r1 = r9.A01
            X.Aec r10 = (X.C21108Aec) r10
            r0 = 2
            X.C18070vi.A0d(r10, r0)
            java.lang.String r3 = r10.A00
            java.util.Map r6 = r10.A02
            int r4 = r1.hashCode()
            java.lang.String r0 = "EVENT_PARAM_BLOKS_PARAMS"
            java.lang.String r0 = X.C17880vN.A0s(r0, r6)
            r1 = 0
            if (r0 == 0) goto L_0x0171
            java.util.Map r8 = X.C20064A5n.A03(r0)
        L_0x001f:
            int r0 = r3.hashCode()
            java.lang.String r7 = "screen_id"
            java.lang.String r5 = "bloks_request_end"
            switch(r0) {
                case -1448417750: goto L_0x002b;
                case -330036277: goto L_0x0048;
                case -226946541: goto L_0x0068;
                case -20769540: goto L_0x0098;
                case 427609089: goto L_0x00aa;
                case 499865650: goto L_0x00ca;
                case 553649050: goto L_0x0101;
                case 1483529842: goto L_0x013d;
                default: goto L_0x002a;
            }
        L_0x002a:
            return
        L_0x002b:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            if (r8 == 0) goto L_0x0039
            java.lang.Object r1 = r8.get(r7)
        L_0x0039:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            X.00H r0 = r2.A09
            X.8si r0 = X.AnonymousClass8BR.A0T(r0)
            java.util.List r0 = r0.A02
            goto L_0x0064
        L_0x0048:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            if (r8 == 0) goto L_0x0056
            java.lang.Object r1 = r8.get(r7)
        L_0x0056:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            X.00H r0 = r2.A09
            X.8si r0 = X.AnonymousClass8BR.A0T(r0)
            java.util.List r0 = r0.A01
        L_0x0064:
            r0.add(r1)
            return
        L_0x0068:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.00H r3 = r2.A09
            X.A6h r0 = X.AnonymousClass8BR.A0V(r3)
            X.C20081A6h.A02(r0, r5, r4)
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            X.8si r0 = X.AnonymousClass8BR.A0T(r3)
            java.util.List r1 = r0.A02
            java.lang.String r0 = "prefetches_started"
            r2.A0D(r1, r4, r0)
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            X.8si r0 = X.AnonymousClass8BR.A0T(r3)
            java.util.List r1 = r0.A01
            java.lang.String r0 = "prefetches_ended"
            r2.A0D(r1, r4, r0)
            return
        L_0x0098:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.00H r0 = r2.A09
            X.A6h r0 = X.AnonymousClass8BR.A0V(r0)
            X.C20081A6h.A01(r0, r4)
            return
        L_0x00aa:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.00H r0 = r2.A00
            X.0vd r3 = X.C17880vN.A0P(r0)
            r1 = 4510(0x119e, float:6.32E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r3, r1)
            X.00H r0 = r2.A09
            X.8si r2 = X.AnonymousClass8BR.A0T(r0)
            if (r1 != 0) goto L_0x0174
            r0 = 2
            goto L_0x0139
        L_0x00ca:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "EVENT_PARAM_COMPRESSED_SIZE"
            java.lang.String r1 = X.C17880vN.A0s(r0, r6)
            if (r1 == 0) goto L_0x00e9
            X.00H r0 = r2.A09
            X.A6h r5 = X.AnonymousClass8BR.A0V(r0)
            java.lang.String r3 = "bloks_compressed_size"
            long r0 = java.lang.Long.parseLong(r1)
            r5.A05(r4, r3, r0)
        L_0x00e9:
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r1 = X.C17880vN.A0s(r0, r6)
            if (r1 == 0) goto L_0x002a
            X.00H r0 = r2.A09
            X.A6h r3 = X.AnonymousClass8BR.A0V(r0)
            java.lang.String r2 = "bloks_uncompressed_size"
            long r0 = java.lang.Long.parseLong(r1)
            r3.A05(r4, r2, r0)
            return
        L_0x0101:
            java.lang.String r0 = "REQUEST_FAILURE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.00H r3 = r2.A09
            X.A6h r0 = X.AnonymousClass8BR.A0V(r3)
            X.C20081A6h.A02(r0, r5, r4)
            java.lang.String r0 = "EVENT_PARAM_ERROR_CODE"
            java.lang.String r2 = X.C17880vN.A0s(r0, r6)
            if (r2 == 0) goto L_0x0123
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            java.lang.String r0 = "bloks_error_code"
            r1.A06(r4, r0, r2)
        L_0x0123:
            java.lang.String r0 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.String r2 = X.C17880vN.A0s(r0, r6)
            if (r2 == 0) goto L_0x0134
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            java.lang.String r0 = "bloks_error_message"
            r1.A06(r4, r0, r2)
        L_0x0134:
            X.8si r2 = X.AnonymousClass8BR.A0T(r3)
            r0 = 3
        L_0x0139:
            r2.A0F(r4, r0)
            return
        L_0x013d:
            java.lang.String r0 = "REQUEST_START"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
            X.00H r3 = r2.A09
            X.8si r0 = X.AnonymousClass8BR.A0T(r3)
            java.util.List r0 = r0.A02
            r0.clear()
            X.8si r0 = X.AnonymousClass8BR.A0T(r3)
            java.util.List r0 = r0.A01
            r0.clear()
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "bloks_request_start"
            r2.A0B(r1, r0)
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            r1 = 0
            java.lang.String r0 = "bloks_cache_hit"
            r2.A07(r4, r0, r1)
            return
        L_0x0171:
            r8 = r1
            goto L_0x001f
        L_0x0174:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "bloks_render_start"
            r2.A0B(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21088AeI.BtO(java.lang.Object):void");
    }

    public /* synthetic */ C21088AeI(C170018ny r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
