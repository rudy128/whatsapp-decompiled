package X;

/* renamed from: X.AeH  reason: case insensitive filesystem */
public class C21087AeH implements B9W {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ba, code lost:
        r4.A0B(java.lang.Integer.valueOf(r0), "renderScreen");
        r3.set(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02f9, code lost:
        r3.CGF(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0191, code lost:
        ((X.C192689oo) r1.A04.get()).A01.A03(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        r0.A01.A04(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtO(java.lang.Object r15) {
        /*
            r14 = this;
            r4 = r15
            int r0 = r14.A00
            switch(r0) {
                case 1: goto L_0x0288;
                case 2: goto L_0x0255;
                case 3: goto L_0x021a;
                case 4: goto L_0x00e2;
                case 5: goto L_0x03e8;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0047;
                case 8: goto L_0x0321;
                case 9: goto L_0x0319;
                case 10: goto L_0x030f;
                case 11: goto L_0x0006;
                case 12: goto L_0x02fd;
                case 13: goto L_0x02d9;
                case 14: goto L_0x02c7;
                case 15: goto L_0x0012;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r14.A01
            X.0vk r1 = (X.C18090vk) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke()
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r3 = r14.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r3 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r3
            X.Aed r4 = (X.C21109Aed) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = "send_fds_iq"
            java.lang.String r0 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.ref.WeakReference r0 = r3.A0X
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r0.get()
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
        L_0x0030:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0436
            if (r2 == 0) goto L_0x003e
            boolean r0 = r2.A1e()
            if (r0 != 0) goto L_0x0011
        L_0x003e:
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            return
        L_0x0045:
            r2 = 0
            goto L_0x0030
        L_0x0047:
            java.lang.Object r3 = r14.A01
            X.9di r3 = (X.C186139di) r3
            X.Aed r4 = (X.C21109Aed) r4
            boolean r2 = X.C72453Mb.A1Z(r4)
            java.lang.String r1 = "native_flow_npci_common_library"
            java.lang.String r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x008a
            r0 = 4
            if (r1 != r0) goto L_0x0011
            X.9YD r3 = r3.A00
            java.lang.String r1 = r4.A03
            X.A1q r2 = r4.A00
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0011
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = r3.A00
            r1.CEx()
            if (r2 == 0) goto L_0x0011
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0011
            int r0 = r0.intValue()
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A0c(r1, r0)
            return
        L_0x008a:
            X.9YD r2 = r3.A00
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0011
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = r2.A00
            r0.CEx()
            r0.A4o()
            r0.finish()
            return
        L_0x00a2:
            java.lang.Object r6 = r14.A01
            X.A8p r6 = (X.C20129A8p) r6
            X.9ba r1 = r6.A04
            boolean r0 = r1 instanceof X.AnonymousClass90N
            if (r0 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.A01
            java.util.Map r0 = r6.A09
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0011
            java.util.Iterator r5 = r0.iterator()
        L_0x00c0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r5.next()
            X.9qy r1 = (X.C193979qy) r1
            X.00H r0 = r6.A0K
            java.lang.Object r4 = r0.get()
            X.9kX r4 = (X.C190199kX) r4
            java.lang.String r3 = r1.A00
            java.util.Map r2 = r1.A01
            int r1 = r6.hashCode()
            java.lang.String r0 = r6.A0M
            r4.A00(r3, r0, r2, r1)
            goto L_0x00c0
        L_0x00e2:
            java.lang.Object r1 = r14.A01
            X.9ot r1 = (X.C192729ot) r1
            X.Aec r4 = (X.C21108Aec) r4
            java.lang.String r5 = r4.A00
            java.util.Map r3 = r4.A02
            java.lang.String r0 = r4.A01
            X.C18070vi.A0W(r0)
            int r6 = java.lang.Integer.parseInt(r0)
            int r0 = r5.hashCode()
            java.lang.String r2 = "prefetchResponse"
            switch(r0) {
                case -2060681962: goto L_0x00ff;
                case -1448417750: goto L_0x010b;
                case -330036277: goto L_0x013f;
                case -226946541: goto L_0x015e;
                case -20769540: goto L_0x0169;
                case 427609089: goto L_0x0187;
                case 450559314: goto L_0x019f;
                case 499865650: goto L_0x01ef;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            return
        L_0x00ff:
            java.lang.String r0 = "CACHE_HIT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "bloksCacheHit"
            goto L_0x0191
        L_0x010b:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.00H r2 = r1.A03
            java.lang.Object r1 = r2.get()
            X.9oo r1 = (X.C192689oo) r1
            java.lang.String r0 = "prefetchPerfTracker"
            r1.A00(r6, r0)
            java.lang.Object r0 = r2.get()
            X.9oo r0 = (X.C192689oo) r0
            java.lang.String r1 = "start"
            X.19a r0 = r0.A01
            r0.A03(r6, r1)
            java.lang.Object r2 = r2.get()
            X.9oo r2 = (X.C192689oo) r2
            java.lang.String r0 = "EVENT_PARAM_APP_ID"
            java.lang.String r1 = X.AnonymousClass8BU.A0p(r0, r3)
            java.lang.String r0 = "app_id"
            r2.A01(r6, r0, r1)
            return
        L_0x013f:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.00H r1 = r1.A03
            java.lang.Object r0 = r1.get()
            X.9oo r0 = (X.C192689oo) r0
            X.19a r0 = r0.A01
            r0.A03(r6, r2)
            java.lang.Object r0 = r1.get()
            X.9oo r0 = (X.C192689oo) r0
            r1 = 467(0x1d3, float:6.54E-43)
            goto L_0x01e9
        L_0x015e:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "bloksPayloadResponse"
            goto L_0x0191
        L_0x0169:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.00H r0 = r1.A03
            java.lang.Object r2 = r0.get()
            X.9oo r2 = (X.C192689oo) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L_0x0011
            X.19T r1 = r2.A02
            int r0 = r2.A00
            r1.markerDrop(r0, r6)
            return
        L_0x0187:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "openScreen"
        L_0x0191:
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.9oo r0 = (X.C192689oo) r0
            X.19a r0 = r0.A01
            r0.A03(r6, r2)
            return
        L_0x019f:
            java.lang.String r0 = "PREFETCH_REQUEST_FAILURE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.00H r4 = r1.A03
            java.lang.Object r0 = r4.get()
            X.9oo r0 = (X.C192689oo) r0
            X.19a r0 = r0.A01
            r0.A03(r6, r2)
            java.lang.String r1 = "EVENT_PARAM_ERROR_CODE"
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r2 = r4.get()
            X.9oo r2 = (X.C192689oo) r2
            java.lang.String r1 = X.AnonymousClass8BU.A0p(r1, r3)
            java.lang.String r0 = "error_code"
            r2.A01(r6, r0, r1)
        L_0x01cb:
            java.lang.String r1 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r2 = r4.get()
            X.9oo r2 = (X.C192689oo) r2
            java.lang.String r1 = X.AnonymousClass8BU.A0p(r1, r3)
            java.lang.String r0 = "error_message"
            r2.A01(r6, r0, r1)
        L_0x01e2:
            java.lang.Object r0 = r4.get()
            X.9oo r0 = (X.C192689oo) r0
            r1 = 3
        L_0x01e9:
            X.19a r0 = r0.A01
            r0.A04(r6, r1)
            return
        L_0x01ef:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = X.C17880vN.A0s(r0, r3)
            if (r0 == 0) goto L_0x0011
            long r7 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r5 = "blok_payload_size"
            if (r0 == 0) goto L_0x0011
            X.00H r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.9oo r0 = (X.C192689oo) r0
            r9 = 1
            X.19a r4 = r0.A01
            r4.A09(r5, r6, r7, r9)
            return
        L_0x021a:
            java.lang.Object r0 = r14.A01
            X.A5D r0 = (X.A5D) r0
            X.AeY r4 = (X.C21104AeY) r4
            X.1QS r1 = r0.A04
            java.lang.String r0 = "FBPAY"
            X.AZ9 r0 = r1.A05(r0)
            X.C17960vV.A07(r0)
            X.BD4 r3 = r0.BRb()
            if (r3 == 0) goto L_0x0011
            X.8sO r2 = r3.BHN()
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.A08 = r0
            java.util.Map r1 = X.A5D.A0G
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.C17880vN.A0s(r0, r1)
            r2.A0b = r0
            java.util.Map r1 = X.A5D.A0H
            java.lang.String r0 = r4.A00
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A07 = r0
            r3.BiH(r2)
            return
        L_0x0255:
            java.lang.Object r2 = r14.A01
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r2 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r2
            X.Aed r4 = (X.C21109Aed) r4
            r5 = 1
            X.C18070vi.A0d(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.A0P
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0279
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0011
        L_0x0279:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0011
            X.00H r0 = r2.A0J
            X.A6h r4 = X.AnonymousClass8BR.A0V(r0)
            int r0 = r2.A00
            goto L_0x02ba
        L_0x0288:
            java.lang.Object r2 = r14.A01
            X.A8c r2 = (X.C20119A8c) r2
            X.Aed r4 = (X.C21109Aed) r4
            r5 = 1
            X.C18070vi.A0d(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.A0R
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0011
        L_0x02ac:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0011
            X.00H r0 = r2.A0L
            X.A6h r4 = X.AnonymousClass8BR.A0V(r0)
            int r0 = r2.A00
        L_0x02ba:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "renderScreen"
            r4.A0B(r1, r0)
            r3.set(r5)
            return
        L_0x02c7:
            java.lang.Object r1 = r14.A01
            X.1FP r1 = (X.AnonymousClass1FP) r1
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            X.10I r3 = r1.A05
            r0 = 31
            X.Ajz r2 = new X.Ajz
            r2.<init>(r15, r1, r0)
            goto L_0x02f9
        L_0x02d9:
            java.lang.Object r1 = r14.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r1 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r1
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            java.lang.ref.WeakReference r0 = r1.A0X
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x02f0
            r0.A28()
        L_0x02f0:
            X.10I r3 = r1.A05
            r0 = 32
            X.Ajz r2 = new X.Ajz
            r2.<init>(r1, r15, r0)
        L_0x02f9:
            r3.CGF(r2)
            return
        L_0x02fd:
            java.lang.Object r1 = r14.A01
            X.9zi r1 = (X.C199269zi) r1
            X.AeX r4 = (X.C21103AeX) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.BCc r1 = r1.A00
            boolean r0 = r4.A00
            r1.BDM(r0)
            return
        L_0x030f:
            java.lang.Object r1 = r14.A01
            X.A6G r1 = (X.A6G) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A04(r0)
            return
        L_0x0319:
            java.lang.Object r1 = r14.A01
            X.A6G r1 = (X.A6G) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x0321:
            java.lang.Object r8 = r14.A01
            X.A6G r8 = (X.A6G) r8
            X.Aea r4 = (X.C21106Aea) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.9YB r0 = r8.A02
            X.A8p r5 = r0.A00
            X.9ba r1 = r5.A04
            boolean r0 = r1 instanceof X.AnonymousClass90N
            r6 = 0
            if (r0 == 0) goto L_0x034d
            X.90N r1 = (X.AnonymousClass90N) r1
            if (r1 == 0) goto L_0x034d
            X.9o7 r2 = r5.A03
            if (r2 != 0) goto L_0x0344
            java.lang.String r0 = "fcsLoadingEventManager"
            X.C18070vi.A11(r0)
            throw r6
        L_0x0344:
            java.lang.String r1 = r1.A00()
            java.lang.String r0 = "onStartLoading"
            r2.A01(r6, r0, r1, r6)
        L_0x034d:
            java.lang.String r0 = "actionPerformed"
            X.C20129A8p.A07(r5, r0)
            java.lang.String r1 = "action_performed"
            java.lang.String r0 = "cancel"
            X.C20129A8p.A08(r5, r1, r0)
            r2 = 4
            X.8zw r0 = r5.A0G
            int r1 = r5.A00
            X.19a r0 = r0.A01
            r0.A04(r1, r2)
            X.9ba r1 = r5.A04
            boolean r0 = r1 instanceof X.AnonymousClass90N
            if (r0 == 0) goto L_0x0399
            X.90N r1 = (X.AnonymousClass90N) r1
            if (r1 == 0) goto L_0x0399
            java.lang.String r1 = r1.A03
            X.2aw r0 = r5.A0I
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            X.9lQ r0 = (X.C190729lQ) r0
            if (r0 == 0) goto L_0x0397
            X.9u9 r1 = r0.A00()
        L_0x037f:
            boolean r0 = r1 instanceof X.AnonymousClass90J
            if (r0 == 0) goto L_0x0399
            X.90J r1 = (X.AnonymousClass90J) r1
            com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment r0 = r1.A00
            if (r0 == 0) goto L_0x0399
            X.5ey r1 = r0.A00
            if (r1 == 0) goto L_0x0399
            boolean r0 = r1.canGoBack()
            if (r0 == 0) goto L_0x0399
            r1.goBack()
            return
        L_0x0397:
            r1 = 0
            goto L_0x037f
        L_0x0399:
            java.lang.String r11 = r4.A00
            if (r11 == 0) goto L_0x03ca
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            r10 = 0
            X.9rt r2 = r8.A03
            boolean r1 = r2.A01(r11)
            boolean r0 = r2.A02(r11)
            if (r0 != 0) goto L_0x03ca
            if (r1 != 0) goto L_0x03ca
            X.9qz r0 = r2.A00()
            java.lang.String r1 = r0.A01
            java.util.Map r0 = r2.A00
            r0.remove(r1)
            java.lang.String r0 = r4.A01
            java.util.LinkedHashMap r9 = X.A6G.A01(r8, r11, r0)
            r5.A06 = r3
            java.lang.String r7 = X.AnonymousClass9RD.A00(r11)
            r8 = r6
            X.C20129A8p.A04(r5, r6, r7, r8, r9, r10)
            return
        L_0x03ca:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r1 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x03e2
        L_0x03d4:
            java.lang.Integer r0 = r8.A00
            if (r0 == 0) goto L_0x03e2
            java.lang.Integer r10 = X.AnonymousClass00R.A00
            java.lang.String r12 = r4.A01
            r13 = r6
            r9 = r6
            r8.A03(r9, r10, r11, r12, r13)
            return
        L_0x03e2:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r8.A04(r0)
            return
        L_0x03e8:
            java.lang.Object r6 = r14.A01
            X.9fi r6 = (X.C187379fi) r6
            X.AeU r4 = (X.C21100AeU) r4
            r5 = 1
            X.C18070vi.A0d(r4, r5)
            java.lang.String r2 = r4.A00
            r4 = 0
        L_0x03f5:
            java.util.Stack r1 = r6.A03
            java.lang.Object r0 = r1.peek()
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 != 0) goto L_0x040c
            java.util.Stack r0 = r6.A04
            r0.pop()
            r1.pop()
            int r4 = r4 + 1
            goto L_0x03f5
        L_0x040c:
            X.9jO r3 = r6.A00
            X.A8p r0 = r3.A00
            X.9YC r2 = r0.A0H
            r1 = 0
        L_0x0413:
            if (r1 >= r4) goto L_0x041d
            java.util.Stack r0 = r2.A00
            r0.pop()
            int r1 = r1 + 1
            goto L_0x0413
        L_0x041d:
            java.util.Stack r0 = r6.A04
            java.lang.Object r0 = X.AnonymousClass8BT.A0s(r0)
            java.util.Deque r0 = (java.util.Deque) r0
            java.lang.Object r1 = r0.pollFirst()
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            r3.A00(r1, r0, r5)
            return
        L_0x0436:
            if (r2 == 0) goto L_0x043b
            r2.A28()
        L_0x043b:
            r3.CEx()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21087AeH.BtO(java.lang.Object):void");
    }

    public C21087AeH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
