package X;

import android.os.Binder;
import android.os.IBinder;
import com.whatsapp.instrumentation.InstrumentationInterface;
import com.whatsapp.instrumentation.api.InstrumentationService;

/* renamed from: X.8CW  reason: invalid class name */
public class AnonymousClass8CW extends Binder implements InstrumentationInterface {
    public final /* synthetic */ InstrumentationService A00;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8CW(InstrumentationService instrumentationService) {
        this();
        this.A00 = instrumentationService;
    }

    public static void A00(C173378uy r8, AnonymousClass1BI r9, AnonymousClass19T r10) {
        r10.markerPoint(494340037, "send_message_end");
        r8.A02.A00(r9, 3, 3, true, true, false);
        r10.markerPoint(494340037, "mark_chat_as_read_end");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0d45 in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public boolean onTransact(int r44, android.os.Parcel r45, android.os.Parcel r46, int r47) {
        /*
            r43 = this;
            java.lang.String r3 = "com.whatsapp.instrumentation.InstrumentationInterface"
            r0 = 1
            r2 = r43
            r5 = r44
            r4 = r45
            r42 = r46
            if (r5 < r0) goto L_0x164d
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r1) goto L_0x1648
            r4.enforceInterface(r3)
            if (r5 == r0) goto L_0x15cb
            r1 = 2
            if (r5 != r1) goto L_0x164d
            java.lang.String r10 = r4.readString()
            java.util.concurrent.atomic.AtomicInteger r1 = com.whatsapp.instrumentation.api.InstrumentationService.A08
            int r8 = r1.getAndIncrement()
            com.whatsapp.instrumentation.api.InstrumentationService r3 = r2.A00
            X.19T r1 = r3.A03
            r7 = 494346103(0x1d771f77, float:3.2706445E-21)
            r1.markerStart(r7, r8)
            X.1op r1 = r3.A02
            X.2nF r11 = r1.A00()
            r11.A00()
            X.19T r2 = r3.A03
            java.lang.String r1 = "enforce_trusted_package_end"
            r2.markerPoint((int) r7, (int) r8, (java.lang.String) r1)
            android.os.Binder.clearCallingIdentity()
            X.19T r2 = r3.A03
            java.lang.String r1 = "clear_calling_identity_end"
            r2.markerPoint((int) r7, (int) r8, (java.lang.String) r1)
            X.9i5 r5 = r3.A00     // Catch:{ Exception -> 0x15bb }
            X.1CM r1 = r5.A0Q     // Catch:{ Exception -> 0x15bb }
            boolean r1 = r1.A04()     // Catch:{ Exception -> 0x15bb }
            java.lang.String r18 = "failure_reason"     // Catch:{ Exception -> 0x15bb }
            if (r1 != 0) goto L_0x0071     // Catch:{ Exception -> 0x15bb }
            X.19T r3 = r5.A0P     // Catch:{ Exception -> 0x15bb }
            java.lang.String r2 = "Client is not registered"     // Catch:{ Exception -> 0x15bb }
            r1 = r18     // Catch:{ Exception -> 0x15bb }
            r3.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x15bb }
            r1 = 3     // Catch:{ Exception -> 0x15bb }
            r3.markerEnd(r7, r8, r1)     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "RequestHandler/request client is not registered"     // Catch:{ Exception -> 0x15bb }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x15bb }
            r1 = 7     // Catch:{ Exception -> 0x15bb }
            org.json.JSONObject r9 = X.A3R.A06(r2, r1)     // Catch:{ Exception -> 0x15bb }
        L_0x006b:
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x15bb }
            goto L_0x1656     // Catch:{ Exception -> 0x15bb }
        L_0x0071:
            X.19T r6 = r5.A0P     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "client_registration_check_end"     // Catch:{ Exception -> 0x15bb }
            r6.markerPoint((int) r7, (int) r8, (java.lang.String) r1)     // Catch:{ Exception -> 0x15bb }
            X.1TM r1 = r5.A02     // Catch:{ Exception -> 0x15bb }
            X.18O r2 = r1.A00     // Catch:{ Exception -> 0x15bb }
            X.18R r1 = X.AnonymousClass18O.A0G     // Catch:{ Exception -> 0x15bb }
            boolean r1 = r2.A09(r1)     // Catch:{ Exception -> 0x15bb }
            java.lang.String r9 = "Feature is disabled!"     // Catch:{ Exception -> 0x15bb }
            if (r1 != 0) goto L_0x0099     // Catch:{ Exception -> 0x15bb }
            r1 = r18     // Catch:{ Exception -> 0x15bb }
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r9)     // Catch:{ Exception -> 0x15bb }
            r2 = 3     // Catch:{ Exception -> 0x15bb }
            r6.markerEnd(r7, r8, r2)     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "RequestHandler/request service not enabled"     // Catch:{ Exception -> 0x15bb }
        L_0x0091:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x15bb }
            org.json.JSONObject r9 = X.A3R.A06(r9, r2)     // Catch:{ Exception -> 0x15bb }
            goto L_0x006b     // Catch:{ Exception -> 0x15bb }
        L_0x0099:
            X.11S r1 = r5.A00     // Catch:{ Exception -> 0x15bb }
            r1.A0I()     // Catch:{ Exception -> 0x15bb }
            X.1E8 r4 = r1.A0D     // Catch:{ Exception -> 0x15bb }
            if (r4 == 0) goto L_0x00b8     // Catch:{ Exception -> 0x15bb }
            X.2qe r3 = r5.A0N     // Catch:{ Exception -> 0x15bb }
            X.1TM r1 = r3.A01     // Catch:{ Exception -> 0x15bb }
            X.18O r2 = r1.A00     // Catch:{ Exception -> 0x15bb }
            X.18Q r1 = X.AnonymousClass18O.A0o     // Catch:{ Exception -> 0x15bb }
            int r2 = r2.A04(r1)     // Catch:{ Exception -> 0x15bb }
            r1 = 20     // Catch:{ Exception -> 0x15bb }
            if (r2 == r1) goto L_0x00c4     // Catch:{ Exception -> 0x15bb }
            boolean r1 = r3.A00(r4)     // Catch:{ Exception -> 0x15bb }
            if (r1 != 0) goto L_0x00c4     // Catch:{ Exception -> 0x15bb }
        L_0x00b8:
            r1 = r18     // Catch:{ Exception -> 0x15bb }
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r9)     // Catch:{ Exception -> 0x15bb }
            r2 = 3     // Catch:{ Exception -> 0x15bb }
            r6.markerEnd(r7, r8, r2)     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "RequestHandler/request service not enabled for this number"     // Catch:{ Exception -> 0x15bb }
            goto L_0x0091     // Catch:{ Exception -> 0x15bb }
        L_0x00c4:
            java.lang.String r1 = "feature_eligibility_check_end"     // Catch:{ Exception -> 0x15bb }
            r6.markerPoint((int) r7, (int) r8, (java.lang.String) r1)     // Catch:{ Exception -> 0x15bb }
            X.194 r1 = r5.A01     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r1 = r1.A01()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r1 != 0) goto L_0x1576     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            org.json.JSONObject r12 = X.C17880vN.A16(r10)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "action"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r2 = r12.getString(r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r4 = "header"
            org.json.JSONObject r10 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x156d }
            java.lang.String r3 = "protocol_version"     // Catch:{ JSONException -> 0x156d }
            int r3 = r10.getInt(r3)     // Catch:{ JSONException -> 0x156d }
            if (r3 < r0) goto L_0x156d     // Catch:{ JSONException -> 0x156d }
            java.lang.String r3 = "enforce_protocol_version_end"
            r6.markerPoint((int) r7, (int) r8, (java.lang.String) r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r13 = "get_request_token"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r13)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x0152     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r1 = 2     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerEnd(r7, r8, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.2kS r9 = r5.A0O     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r4 = r11.A01     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            monitor-enter(r9)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.1HY r10 = r9.A00     // Catch:{ all -> 0x1580 }
            java.lang.String r3 = "request/token"     // Catch:{ all -> 0x1580 }
            java.lang.String r2 = X.AnonymousClass1HY.A01(r4, r3)     // Catch:{ all -> 0x1580 }
            android.content.SharedPreferences r1 = X.AnonymousClass1HY.A00(r10)     // Catch:{ all -> 0x1580 }
            java.lang.String r5 = X.C17880vN.A0r(r1, r2)     // Catch:{ all -> 0x1580 }
            if (r5 != 0) goto L_0x0138     // Catch:{ all -> 0x1580 }
            byte[] r1 = X.AnonymousClass8BX.A1Y()     // Catch:{ all -> 0x1580 }
            java.lang.String r5 = X.AnonymousClass8BT.A0x(r1)     // Catch:{ all -> 0x1580 }
            java.lang.String r2 = X.AnonymousClass1HY.A01(r4, r3)     // Catch:{ all -> 0x1580 }
            java.lang.String r1 = "request/token_ts"     // Catch:{ all -> 0x1580 }
            java.lang.String r4 = X.AnonymousClass1HY.A01(r4, r1)     // Catch:{ all -> 0x1580 }
            android.content.SharedPreferences r1 = X.AnonymousClass1HY.A00(r10)     // Catch:{ all -> 0x1580 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x1580 }
            android.content.SharedPreferences$Editor r3 = r1.putString(r2, r5)     // Catch:{ all -> 0x1580 }
            X.11P r1 = r10.A01     // Catch:{ all -> 0x1580 }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x1580 }
            X.C17880vN.A1D(r3, r4, r1)     // Catch:{ all -> 0x1580 }
        L_0x0138:
            monitor-exit(r9)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "request_token"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r2.put(r1, r5)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "success"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r9.put(r1, r0)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "result"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r9.put(r1, r2)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x006b     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x0152:
            java.lang.String r3 = "announce_user_opt_out"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r15 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r15 != 0) goto L_0x018a     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            org.json.JSONObject r10 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r4 = "authorization_token"     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r3 = ""     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r10 = r10.optString(r4, r3)     // Catch:{ JSONException -> 0x0181 }
            if (r10 == 0) goto L_0x0181     // Catch:{ JSONException -> 0x0181 }
            X.2kS r4 = r5.A0O     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r3 = r11.A01     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r4.A00(r3, r10)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 != 0) goto L_0x018a     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "RequestHandler/request invalid authorization token"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r2 = 4     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "Request is not authorized!"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.9LG r3 = new X.9LG     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.<init>(r2, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1582     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x0181:
            java.lang.String r1 = "Authorization token is missing."     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.9LG r3 = new X.9LG     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.<init>(r0, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1582     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x018a:
            X.9Xd r4 = r5.A0C     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            int r10 = r2.hashCode()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 711383033(0x2a66d7f9, float:2.0503034E-13)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r10 == r3) goto L_0x01a0     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 771140814(0x2df6acce, float:2.8043703E-11)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r10 == r3) goto L_0x01ae     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 1673427744(0x63be7b20, float:7.027507E21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r10 == r3) goto L_0x01b0     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x01b6     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01a0:
            java.lang.String r3 = "get_call_state"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01b6     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01a8:
            java.lang.String r3 = "enforce_authorization_token_end"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerPoint((int) r7, (int) r8, (java.lang.String) r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x01d2     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01ae:
            java.lang.String r13 = "access_contacts"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01b0:
            boolean r3 = r2.equals(r13)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 != 0) goto L_0x01a8     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01b6:
            X.1HY r4 = r4.A00     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r13 = r11.A01     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r3 = "metadata/last_active_time"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r14 = X.AnonymousClass1HY.A01(r13, r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            android.content.SharedPreferences r3 = X.AnonymousClass1HY.A00(r4)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            android.content.SharedPreferences$Editor r13 = r3.edit()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.11P r3 = r4.A01     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            long r3 = X.AnonymousClass11P.A01(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.C17880vN.A1D(r13, r14, r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x01a8     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01d2:
            switch(r10) {
                case -1086836443: goto L_0x0232;
                case -731595268: goto L_0x0226;
                case -624136624: goto L_0x021a;
                case 100344454: goto L_0x020e;
                case 711383033: goto L_0x0202;
                case 819681071: goto L_0x01f6;
                case 1759298208: goto L_0x01ea;
                case 2060915200: goto L_0x01de;
                default: goto L_0x01d5;
            }     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01d5:
            r17 = 0     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01d7:
            r16 = 1     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            switch(r10) {
                case -1472535883: goto L_0x14b2;
                case -1368724237: goto L_0x140b;
                case -1086836443: goto L_0x1345;
                case -731595268: goto L_0x1292;
                case -624136624: goto L_0x0b5f;
                case -555816913: goto L_0x0a9e;
                case -328085250: goto L_0x0a41;
                case -241377379: goto L_0x0a38;
                case 100344454: goto L_0x08b2;
                case 107666154: goto L_0x084d;
                case 565287780: goto L_0x14c1;
                case 628187957: goto L_0x0776;
                case 711383033: goto L_0x06d3;
                case 771140814: goto L_0x0677;
                case 819681071: goto L_0x05be;
                case 1267102644: goto L_0x0576;
                case 1331833598: goto L_0x0566;
                case 1759298208: goto L_0x04e3;
                case 1912051456: goto L_0x0440;
                case 2060915200: goto L_0x024b;
                default: goto L_0x01dc;
            }     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01dc:
            goto L_0x14de     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01de:
            java.lang.String r3 = "start_voip_call"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494345332(0x1d771c74, float:3.2704888E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01ea:
            java.lang.String r3 = "mute_unmute_mic"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494341024(0x1d770ba0, float:3.2696188E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x01f6:
            java.lang.String r3 = "toggle_call_bluetooth_audio"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494348122(0x1d77275a, float:3.2710522E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x0202:
            java.lang.String r3 = "get_call_state"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494341755(0x1d770e7b, float:3.2697664E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x020e:
            java.lang.String r3 = "inbox"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494346323(0x1d772053, float:3.270689E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x021a:
            java.lang.String r3 = "send_message"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x0226:
            java.lang.String r3 = "get_call_history"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494339437(0x1d77056d, float:3.2692983E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x023d     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x0232:
            java.lang.String r3 = "toggle_call_video"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r3 = r2.equals(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r3 == 0) goto L_0x01d5     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = 494350975(0x1d77327f, float:3.2716284E-21)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x023d:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r17 == 0) goto L_0x01d7     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            int r3 = r17.intValue()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerStart(r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x01d7     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x024b:
            java.lang.String r1 = "start_voip_call"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uv r13 = r5.A0I     // Catch:{ all -> 0x1554 }
            java.lang.String r25 = "stop_instrumentation_service_end"     // Catch:{ all -> 0x1554 }
            java.lang.String r24 = "stop_instrumentation_service_start"     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ all -> 0x1554 }
            java.util.HashSet r12 = X.C17880vN.A12()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "contact_ids"     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r23 = r3.optJSONArray(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "seci_ids"     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r14 = r3.optJSONArray(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r22 = "empty contact"     // Catch:{ all -> 0x1554 }
            java.lang.String r21 = "requesthandler/handle-start-voip-call cannot place group calls yet"     // Catch:{ all -> 0x1554 }
            java.lang.String r20 = "requesthandler/handle-start-voip-call request included an empty contact"     // Catch:{ all -> 0x1554 }
            java.lang.String r10 = "Group calling is disabled"     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = "Bad request - start_voip_call"     // Catch:{ all -> 0x1554 }
            java.lang.String r5 = "fail_reason"     // Catch:{ all -> 0x1554 }
            r4 = 494345332(0x1d771c74, float:3.2704888E-21)     // Catch:{ all -> 0x1554 }
            if (r23 == 0) goto L_0x02d4     // Catch:{ all -> 0x1554 }
            int r1 = r23.length()     // Catch:{ SecurityException -> 0x041c }
            if (r1 <= 0) goto L_0x02d4     // Catch:{ SecurityException -> 0x041c }
            r14 = 0     // Catch:{ SecurityException -> 0x041c }
        L_0x0287:
            int r1 = r23.length()     // Catch:{ SecurityException -> 0x041c }
            if (r14 >= r1) goto L_0x0321     // Catch:{ SecurityException -> 0x041c }
            r1 = r23     // Catch:{ SecurityException -> 0x041c }
            java.lang.String r19 = r1.getString(r14)     // Catch:{ SecurityException -> 0x041c }
            boolean r1 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SecurityException -> 0x041c }
            if (r1 == 0) goto L_0x02a9     // Catch:{ SecurityException -> 0x041c }
            com.whatsapp.util.Log.w((java.lang.String) r20)     // Catch:{ SecurityException -> 0x041c }
            X.19T r3 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            r1 = r22     // Catch:{ SecurityException -> 0x041c }
            r3.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ SecurityException -> 0x041c }
            org.json.JSONObject r9 = X.A3R.A06(r9, r0)     // Catch:{ SecurityException -> 0x041c }
            goto L_0x1502     // Catch:{ SecurityException -> 0x041c }
        L_0x02a9:
            X.A0q r3 = r13.A07     // Catch:{ SecurityException -> 0x041c }
            X.A4q r1 = r3.A00     // Catch:{ SecurityException -> 0x041c }
            r15 = r1     // Catch:{ SecurityException -> 0x041c }
            r1 = r19     // Catch:{ SecurityException -> 0x041c }
            java.lang.String r1 = r15.A02(r11, r1)     // Catch:{ SecurityException -> 0x041c }
            X.1E7 r1 = X.C19959A0q.A00(r3, r1)     // Catch:{ SecurityException -> 0x041c }
            boolean r3 = r1.A0F()     // Catch:{ SecurityException -> 0x041c }
            if (r3 == 0) goto L_0x02ce     // Catch:{ SecurityException -> 0x041c }
            com.whatsapp.util.Log.w((java.lang.String) r21)     // Catch:{ SecurityException -> 0x041c }
            X.19T r1 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            r1.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r10)     // Catch:{ SecurityException -> 0x041c }
            r1 = 23     // Catch:{ SecurityException -> 0x041c }
            org.json.JSONObject r9 = X.A3R.A06(r10, r1)     // Catch:{ SecurityException -> 0x041c }
            goto L_0x1502     // Catch:{ SecurityException -> 0x041c }
        L_0x02ce:
            r12.add(r1)     // Catch:{ SecurityException -> 0x041c }
            int r14 = r14 + 1     // Catch:{ SecurityException -> 0x041c }
            goto L_0x0287     // Catch:{ SecurityException -> 0x041c }
        L_0x02d4:
            if (r14 == 0) goto L_0x040a     // Catch:{ SecurityException -> 0x041c }
            int r1 = r14.length()     // Catch:{ SecurityException -> 0x041c }
            if (r1 <= 0) goto L_0x040a     // Catch:{ SecurityException -> 0x041c }
            r3 = 0     // Catch:{ SecurityException -> 0x041c }
        L_0x02dd:
            int r1 = r14.length()     // Catch:{ SecurityException -> 0x041c }
            if (r3 >= r1) goto L_0x0321     // Catch:{ SecurityException -> 0x041c }
            java.lang.String r19 = r14.getString(r3)     // Catch:{ SecurityException -> 0x041c }
            boolean r1 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SecurityException -> 0x041c }
            if (r1 == 0) goto L_0x02fd     // Catch:{ SecurityException -> 0x041c }
            com.whatsapp.util.Log.w((java.lang.String) r20)     // Catch:{ SecurityException -> 0x041c }
            X.19T r3 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            r1 = r22     // Catch:{ SecurityException -> 0x041c }
            r3.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ SecurityException -> 0x041c }
            org.json.JSONObject r9 = X.A3R.A06(r9, r0)     // Catch:{ SecurityException -> 0x041c }
            goto L_0x1502     // Catch:{ SecurityException -> 0x041c }
        L_0x02fd:
            X.A0q r15 = r13.A07     // Catch:{ SecurityException -> 0x041c }
            r1 = r19     // Catch:{ SecurityException -> 0x041c }
            X.1E7 r1 = r15.A01(r11, r1)     // Catch:{ SecurityException -> 0x041c }
            boolean r15 = r1.A0F()     // Catch:{ SecurityException -> 0x041c }
            if (r15 == 0) goto L_0x031b     // Catch:{ SecurityException -> 0x041c }
            com.whatsapp.util.Log.w((java.lang.String) r21)     // Catch:{ SecurityException -> 0x041c }
            X.19T r1 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            r1.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r10)     // Catch:{ SecurityException -> 0x041c }
            r1 = 23     // Catch:{ SecurityException -> 0x041c }
            org.json.JSONObject r9 = X.A3R.A06(r10, r1)     // Catch:{ SecurityException -> 0x041c }
            goto L_0x1502     // Catch:{ SecurityException -> 0x041c }
        L_0x031b:
            r12.add(r1)     // Catch:{ SecurityException -> 0x041c }
            int r3 = r3 + 1     // Catch:{ SecurityException -> 0x041c }
            goto L_0x02dd     // Catch:{ SecurityException -> 0x041c }
        L_0x0321:
            X.19T r3 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            java.lang.String r1 = "contact list prepared"     // Catch:{ SecurityException -> 0x041c }
            r3.markerPoint(r4, r1)     // Catch:{ SecurityException -> 0x041c }
            X.17x r1 = r13.A06     // Catch:{ all -> 0x1554 }
            boolean r1 = r1.A0E()     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x03f8     // Catch:{ all -> 0x1554 }
            X.195 r1 = r13.A01     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            boolean r1 = r1.A00     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            if (r1 != 0) goto L_0x0345     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "foreground_app_start"     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r3.markerPoint(r4, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            X.A48 r1 = r13.A09     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            X.A48.A00(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "foreground_app_end"     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r3.markerPoint(r4, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0345:
            X.11P r9 = r13.A04     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            X.11S r1 = r13.A02     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r10 = X.AnonymousClass1PP.A00(r1, r9, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r9 = 2     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            X.Al3 r1 = new X.Al3     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r1.<init>(r13, r12, r10, r9)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.util.concurrent.FutureTask r9 = new java.util.concurrent.FutureTask     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r9.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            android.os.Handler r1 = r13.A00     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r1.post(r9)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.Object r1 = r9.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            int r9 = r1.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "start_call_on_ui_thread_future_finished"     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r3.markerPoint(r4, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            X.A4q r1 = r13.A08     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r10 = r1.A03(r11, r10)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            if (r9 == 0) goto L_0x03a2     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            switch(r9) {
                case 2: goto L_0x037b;
                case 3: goto L_0x0380;
                case 4: goto L_0x0385;
                case 5: goto L_0x038a;
                case 6: goto L_0x038f;
                case 7: goto L_0x0394;
                case 8: goto L_0x0399;
                case 9: goto L_0x0399;
                default: goto L_0x0377;
            }     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0377:
            r9 = 5     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "Service internal error! start_voip_call"     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x037b:
            r9 = 13     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "Can't initiate a call when a pending call exists."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0380:
            r9 = 14     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "Unable to perform requested operation as terms of service have not been accepted."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0385:
            r9 = 12     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "WhatsApp needs an internet connection to perform this operation."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x038a:
            r9 = 11     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "The requested contact is blocked."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x038f:
            r9 = 15     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "Video calling is disabled."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0394:
            r9 = 9     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "WhatsApp requires voice permissions for this operation."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x039d     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x0399:
            r9 = 10     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "Can't initiate a call when already in a call."     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x039d:
            org.json.JSONObject r9 = X.A3R.A06(r1, r9)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x03d5     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
        L_0x03a2:
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            java.lang.String r1 = "call_id"     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            org.json.JSONObject r1 = r9.put(r1, r10)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            org.json.JSONObject r9 = X.A3R.A05(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            goto L_0x03d5     // Catch:{ InterruptedException | ExecutionException -> 0x03b1 }
            r10 = move-exception
            java.lang.String r1 = "requesthandler/handle-start-voip-call caught exception"
            com.whatsapp.util.Log.w(r1, r10)     // Catch:{ all -> 0x03e6 }
            java.lang.String r1 = r10.getMessage()     // Catch:{ all -> 0x03e6 }
            if (r1 != 0) goto L_0x03ca     // Catch:{ all -> 0x03e6 }
            java.lang.String r1 = "Exception"     // Catch:{ all -> 0x03e6 }
        L_0x03bf:
            r3.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x03e6 }
            java.lang.String r5 = "Service internal error! start_voip_call"     // Catch:{ all -> 0x03e6 }
            r1 = 5     // Catch:{ all -> 0x03e6 }
            org.json.JSONObject r9 = X.A3R.A06(r5, r1)     // Catch:{ all -> 0x03e6 }
            goto L_0x03d5     // Catch:{ all -> 0x03e6 }
        L_0x03ca:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03e6 }
            java.lang.String r1 = "Exception:"     // Catch:{ all -> 0x03e6 }
            java.lang.String r1 = X.C17900vP.A0C(r1, r9, r10)     // Catch:{ all -> 0x03e6 }
            goto L_0x03bf     // Catch:{ all -> 0x03e6 }
        L_0x03d5:
            r1 = r24
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x1554 }
            X.A48 r1 = r13.A09     // Catch:{ all -> 0x1554 }
            X.A48.A01(r1, r0)     // Catch:{ all -> 0x1554 }
            r1 = r25     // Catch:{ all -> 0x1554 }
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r2 = move-exception     // Catch:{ all -> 0x1554 }
            r1 = r24     // Catch:{ all -> 0x1554 }
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x1554 }
            X.A48 r1 = r13.A09     // Catch:{ all -> 0x1554 }
            X.A48.A01(r1, r0)     // Catch:{ all -> 0x1554 }
            r1 = r25     // Catch:{ all -> 0x1554 }
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x084c     // Catch:{ all -> 0x1554 }
        L_0x03f8:
            java.lang.String r1 = "requesthandler/handle-start-voip-call insufficient permissions for call"     // Catch:{ all -> 0x1554 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = "WhatsApp requires voice permissions for this operation."     // Catch:{ all -> 0x1554 }
            r3.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r9)     // Catch:{ all -> 0x1554 }
            r1 = 9     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x040a:
            java.lang.String r1 = "requesthandler/handle-start-voip-call request did not include a contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x041c }
            X.19T r3 = r13.A0A     // Catch:{ SecurityException -> 0x041c }
            java.lang.String r1 = "no contact"     // Catch:{ SecurityException -> 0x041c }
            r3.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ SecurityException -> 0x041c }
            org.json.JSONObject r9 = X.A3R.A06(r9, r0)     // Catch:{ SecurityException -> 0x041c }
            goto L_0x1502     // Catch:{ SecurityException -> 0x041c }
            r11 = move-exception
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an invalid contact"
            com.whatsapp.util.Log.w(r1, r11)     // Catch:{ all -> 0x1554 }
            X.19T r10 = r13.A0A     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = r11.getMessage()     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x0435     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "SecurityException"     // Catch:{ all -> 0x1554 }
        L_0x042c:
            r10.markerAnnotate((int) r4, (java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r9, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0435:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "SecurityException:"     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = X.C17900vP.A0C(r1, r3, r11)     // Catch:{ all -> 0x1554 }
            goto L_0x042c     // Catch:{ all -> 0x1554 }
        L_0x0440:
            java.lang.String r1 = "mark_message_read"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uo r4 = r5.A0D     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "message_id"
            java.lang.String r3 = r3.getString(r1)     // Catch:{ SecurityException -> 0x04d5 }
            X.9o4 r1 = r4.A01     // Catch:{ SecurityException -> 0x04d5 }
            X.206 r5 = r1.A00(r11, r3)     // Catch:{ SecurityException -> 0x04d5 }
            X.205 r1 = r5.A0v     // Catch:{ SecurityException -> 0x04d5 }
            X.1BI r1 = r1.A00     // Catch:{ SecurityException -> 0x04d5 }
            X.C17960vV.A07(r1)     // Catch:{ SecurityException -> 0x04d5 }
            X.1Co r12 = r4.A00     // Catch:{ SecurityException -> 0x04d5 }
            r26 = 0     // Catch:{ SecurityException -> 0x04d5 }
            X.1CJ r3 = r12.A00     // Catch:{ SecurityException -> 0x04d5 }
            X.1ci r11 = r3.A0A(r1)     // Catch:{ SecurityException -> 0x04d5 }
            if (r11 != 0) goto L_0x0482     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r3 = "ChatManager/setChatPartiallySeen/nochat "     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r1 = X.AnonymousClass001.A1E(r1, r3, r4)     // Catch:{ SecurityException -> 0x04d5 }
        L_0x0479:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ SecurityException -> 0x04d5 }
        L_0x047c:
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ SecurityException -> 0x04d5 }
            goto L_0x1502     // Catch:{ SecurityException -> 0x04d5 }
        L_0x0482:
            long r9 = r11.A0S     // Catch:{ SecurityException -> 0x04d5 }
            long r3 = r5.A0y     // Catch:{ SecurityException -> 0x04d5 }
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))     // Catch:{ SecurityException -> 0x04d5 }
            if (r13 < 0) goto L_0x048d     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r1 = "ChatManager/setChatPartiallySeen/message already seen"     // Catch:{ SecurityException -> 0x04d5 }
            goto L_0x0479     // Catch:{ SecurityException -> 0x04d5 }
        L_0x048d:
            X.00H r9 = r12.A01     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.Object r3 = r9.get()     // Catch:{ SecurityException -> 0x04d5 }
            X.1as r3 = (X.C28771as) r3     // Catch:{ SecurityException -> 0x04d5 }
            X.1NJ r10 = r3.A0C     // Catch:{ SecurityException -> 0x04d5 }
            long r3 = r5.A0y     // Catch:{ SecurityException -> 0x04d5 }
            int r22 = r10.A01(r1, r3)     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r3 = "ChatManager/setChatPartiallySeen "     // Catch:{ SecurityException -> 0x04d5 }
            r4.append(r3)     // Catch:{ SecurityException -> 0x04d5 }
            r4.append(r1)     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r3 = "/"     // Catch:{ SecurityException -> 0x04d5 }
            r4.append(r3)     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.String r3 = r11.A0B()     // Catch:{ SecurityException -> 0x04d5 }
            X.C17890vO.A1A(r4, r3)     // Catch:{ SecurityException -> 0x04d5 }
            java.lang.Object r3 = r9.get()     // Catch:{ SecurityException -> 0x04d5 }
            X.1as r3 = (X.C28771as) r3     // Catch:{ SecurityException -> 0x04d5 }
            X.1NJ r9 = r3.A0C     // Catch:{ SecurityException -> 0x04d5 }
            long r3 = r5.A0y     // Catch:{ SecurityException -> 0x04d5 }
            int r23 = r9.A03(r1, r3)     // Catch:{ SecurityException -> 0x04d5 }
            int r22 = r22 - r23     // Catch:{ SecurityException -> 0x04d5 }
            r24 = 3     // Catch:{ SecurityException -> 0x04d5 }
            r19 = r12     // Catch:{ SecurityException -> 0x04d5 }
            r20 = r1     // Catch:{ SecurityException -> 0x04d5 }
            r21 = r5     // Catch:{ SecurityException -> 0x04d5 }
            r25 = r0     // Catch:{ SecurityException -> 0x04d5 }
            r27 = r26     // Catch:{ SecurityException -> 0x04d5 }
            X.C22621Co.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ SecurityException -> 0x04d5 }
            goto L_0x047c     // Catch:{ SecurityException -> 0x04d5 }
            r3 = move-exception
            java.lang.String r1 = "MarkMessageReadRequest/ caught exception"
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - mark_message_read"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x04e3:
            java.lang.String r1 = "mute_unmute_mic"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8up r10 = r5.A0F     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = "Bad request - mute_unmute_mic"     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r10.A01     // Catch:{ Exception -> 0x055a }
            X.0ve r5 = r1.A01     // Catch:{ Exception -> 0x055a }
            r3 = 6408(0x1908, float:8.98E-42)     // Catch:{ Exception -> 0x055a }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x055a }
            boolean r1 = X.C18020vd.A05(r1, r5, r3)     // Catch:{ Exception -> 0x055a }
            if (r1 != 0) goto L_0x0504     // Catch:{ Exception -> 0x055a }
            r1 = 3     // Catch:{ Exception -> 0x055a }
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ Exception -> 0x055a }
            goto L_0x1502     // Catch:{ Exception -> 0x055a }
        L_0x0504:
            java.lang.String r1 = "payload"     // Catch:{ Exception -> 0x055a }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ Exception -> 0x055a }
            java.lang.String r1 = "call_id"     // Catch:{ Exception -> 0x055a }
            java.lang.String r5 = r3.getString(r1)     // Catch:{ Exception -> 0x055a }
            X.A4q r1 = r10.A02     // Catch:{ Exception -> 0x055a }
            java.lang.String r5 = r1.A02(r11, r5)     // Catch:{ Exception -> 0x055a }
            X.1HQ r1 = r10.A00     // Catch:{ Exception -> 0x055a }
            com.whatsapp.voipcalling.CallInfo r1 = r1.BO3()     // Catch:{ Exception -> 0x055a }
            if (r1 == 0) goto L_0x0550     // Catch:{ Exception -> 0x055a }
            java.lang.String r1 = r1.callId     // Catch:{ Exception -> 0x055a }
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x055a }
            if (r1 == 0) goto L_0x0550     // Catch:{ Exception -> 0x055a }
            java.lang.String r1 = "mute_request_type"     // Catch:{ Exception -> 0x055a }
            java.lang.String r3 = r3.optString(r1)     // Catch:{ Exception -> 0x055a }
            java.lang.String r1 = "mute"     // Catch:{ Exception -> 0x055a }
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x055a }
            if (r1 == 0) goto L_0x053d     // Catch:{ Exception -> 0x055a }
            com.whatsapp.voipcalling.Voip.muteCall(r0)     // Catch:{ Exception -> 0x055a }
        L_0x0537:
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ Exception -> 0x055a }
            goto L_0x1502     // Catch:{ Exception -> 0x055a }
        L_0x053d:
            java.lang.String r1 = "unmute"     // Catch:{ Exception -> 0x055a }
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x055a }
            if (r1 == 0) goto L_0x054a     // Catch:{ Exception -> 0x055a }
            r1 = 0     // Catch:{ Exception -> 0x055a }
            com.whatsapp.voipcalling.Voip.muteCall(r1)     // Catch:{ Exception -> 0x055a }
            goto L_0x0537     // Catch:{ Exception -> 0x055a }
        L_0x054a:
            org.json.JSONObject r9 = X.A3R.A06(r4, r0)     // Catch:{ Exception -> 0x055a }
            goto L_0x1502     // Catch:{ Exception -> 0x055a }
        L_0x0550:
            java.lang.String r3 = "There is no call with that call id"     // Catch:{ Exception -> 0x055a }
            r1 = 17     // Catch:{ Exception -> 0x055a }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ Exception -> 0x055a }
            goto L_0x1502     // Catch:{ Exception -> 0x055a }
            r3 = move-exception
            java.lang.String r1 = "MuteUnmuteMicRequest/handleRequest Error: "
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r4, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0566:
            java.lang.String r1 = "reject_call"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uw r1 = r5.A0M     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = r1.A00(r11, r12)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0576:
            java.lang.String r1 = "hera_engine_data"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8un r5 = r5.A0A     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r5.A01     // Catch:{ all -> 0x1554 }
            X.0ve r4 = r1.A01     // Catch:{ all -> 0x1554 }
            r3 = 9246(0x241e, float:1.2956E-41)     // Catch:{ all -> 0x1554 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x05ad     // Catch:{ all -> 0x1554 }
            X.0zA r4 = r5.A00     // Catch:{ all -> 0x1554 }
            boolean r1 = r4.A07()     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x05ad     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "encoded_stream"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r3.getString(r1)     // Catch:{ all -> 0x1554 }
            if (r3 != 0) goto L_0x05af     // Catch:{ all -> 0x1554 }
            r1 = 1     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = "Bad request - "     // Catch:{ all -> 0x1554 }
        L_0x05a7:
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x05ad:
            r1 = 3     // Catch:{ all -> 0x1554 }
            goto L_0x05a7     // Catch:{ all -> 0x1554 }
        L_0x05af:
            r1 = 2     // Catch:{ all -> 0x1554 }
            android.util.Base64.decode(r3, r1)     // Catch:{ all -> 0x1554 }
            r4.A03()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "onDataReceived"     // Catch:{ all -> 0x1554 }
            java.lang.NullPointerException r2 = X.AnonymousClass000.A0s(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x084c     // Catch:{ all -> 0x1554 }
        L_0x05be:
            java.lang.String r1 = "toggle_call_bluetooth_audio"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uz r1 = r5.A0J     // Catch:{ all -> 0x1554 }
            X.1TM r3 = r1.A04     // Catch:{ all -> 0x1554 }
            X.0ve r5 = r3.A01     // Catch:{ all -> 0x1554 }
            r4 = 6408(0x1908, float:8.98E-42)     // Catch:{ all -> 0x1554 }
            X.0vf r3 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r3 = X.C18020vd.A05(r3, r5, r4)     // Catch:{ all -> 0x1554 }
            if (r3 != 0) goto L_0x05d9     // Catch:{ all -> 0x1554 }
            r1 = 3     // Catch:{ all -> 0x1554 }
            goto L_0x0667     // Catch:{ all -> 0x1554 }
        L_0x05d9:
            r5 = 0     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "payload"
            org.json.JSONObject r4 = r12.getJSONObject(r3)     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = "call_id"     // Catch:{ Exception -> 0x0657 }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ Exception -> 0x0657 }
            X.A4q r3 = r1.A05     // Catch:{ Exception -> 0x0657 }
            java.lang.String r11 = r3.A02(r11, r4)     // Catch:{ Exception -> 0x0657 }
            X.19T r10 = r1.A06     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = "read_payload_end"     // Catch:{ Exception -> 0x0657 }
            r4 = 494348122(0x1d77275a, float:3.2710522E-21)     // Catch:{ Exception -> 0x0657 }
            r10.markerPoint(r4, r3)     // Catch:{ Exception -> 0x0657 }
            X.1HQ r3 = r1.A02     // Catch:{ Exception -> 0x0657 }
            com.whatsapp.voipcalling.CallInfo r3 = r3.BO3()     // Catch:{ Exception -> 0x0657 }
            r9 = 17     // Catch:{ Exception -> 0x0657 }
            if (r3 == 0) goto L_0x0648     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = r3.callId     // Catch:{ Exception -> 0x0657 }
            boolean r3 = r11.equals(r3)     // Catch:{ Exception -> 0x0657 }
            if (r3 == 0) goto L_0x0648     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = "get_call_info_end"     // Catch:{ Exception -> 0x0657 }
            r10.markerPoint(r4, r3)     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = "bind_voice_service_start"     // Catch:{ Exception -> 0x0657 }
            r10.markerPoint(r4, r3)     // Catch:{ Exception -> 0x0657 }
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch     // Catch:{ Exception -> 0x0657 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0657 }
            r1.A01 = r3     // Catch:{ Exception -> 0x0657 }
            X.1V7 r10 = r1.A03     // Catch:{ Exception -> 0x0657 }
            r10.A01(r1)     // Catch:{ Exception -> 0x0657 }
            java.util.concurrent.CountDownLatch r12 = r1.A01     // Catch:{ Exception -> 0x0657 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0657 }
            r3 = 3000(0xbb8, double:1.482E-320)     // Catch:{ Exception -> 0x0657 }
            boolean r4 = r12.await(r3, r11)     // Catch:{ Exception -> 0x0657 }
            X.A99 r3 = r1.A00     // Catch:{ Exception -> 0x0657 }
            if (r3 == 0) goto L_0x0636     // Catch:{ Exception -> 0x0657 }
            if (r4 == 0) goto L_0x0636     // Catch:{ Exception -> 0x0657 }
            r3.A0c()     // Catch:{ Exception -> 0x0657 }
            org.json.JSONObject r9 = X.A3R.A05(r5)     // Catch:{ Exception -> 0x0657 }
            goto L_0x0641     // Catch:{ Exception -> 0x0657 }
        L_0x0636:
            java.lang.String r3 = "ToggleCallBluetoothAudioRequest/handleRequest voice service is not present"     // Catch:{ Exception -> 0x0657 }
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ Exception -> 0x0657 }
            java.lang.String r3 = "There is no call with that call id - no voice service"     // Catch:{ Exception -> 0x0657 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r9)     // Catch:{ Exception -> 0x0657 }
        L_0x0641:
            r1.A00 = r5     // Catch:{ all -> 0x1554 }
            r10.A02(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0648:
            java.lang.String r3 = "There is no call with that call id"
            org.json.JSONObject r9 = X.A3R.A06(r3, r9)     // Catch:{ Exception -> 0x0657 }
            r1.A00 = r5     // Catch:{ all -> 0x1554 }
            X.1V7 r3 = r1.A03     // Catch:{ all -> 0x1554 }
            r3.A02(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r4 = move-exception
            java.lang.String r3 = "ToggleCallBluetoothAudioRequest/handleRequest caught exception"
            com.whatsapp.util.Log.w(r3, r4)     // Catch:{ all -> 0x066d }
            r1.A00 = r5     // Catch:{ all -> 0x1554 }
            X.1V7 r3 = r1.A03     // Catch:{ all -> 0x1554 }
            r3.A02(r1)     // Catch:{ all -> 0x1554 }
            r1 = 2     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = "Request is not implemented yet!"     // Catch:{ all -> 0x1554 }
        L_0x0667:
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r2 = move-exception     // Catch:{ all -> 0x1554 }
            r1.A00 = r5     // Catch:{ all -> 0x1554 }
            X.1V7 r3 = r1.A03     // Catch:{ all -> 0x1554 }
            r3.A02(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x084c     // Catch:{ all -> 0x1554 }
        L_0x0677:
            java.lang.String r1 = "access_contacts"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uk r4 = r5.A04     // Catch:{ all -> 0x1554 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x1554 }
            android.net.Uri r1 = X.C182309Tw.A00     // Catch:{ all -> 0x1554 }
            X.C18070vi.A0Z(r1)     // Catch:{ all -> 0x1554 }
            r3.add(r1)     // Catch:{ all -> 0x1554 }
            X.1os r5 = r4.A00     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = r11.A01     // Catch:{ all -> 0x1554 }
            X.1op r1 = r5.A01     // Catch:{ all -> 0x1554 }
            r1.A02(r9)     // Catch:{ all -> 0x1554 }
            java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x1554 }
        L_0x069a:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x06cd     // Catch:{ all -> 0x1554 }
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x1554 }
            android.net.Uri r4 = (android.net.Uri) r4     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "com.whatsapp.provider.instrumentation"     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = r4.getAuthority()     // Catch:{ all -> 0x1554 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x06bc     // Catch:{ all -> 0x1554 }
            X.118 r1 = r5.A00     // Catch:{ all -> 0x1554 }
            android.content.Context r3 = r1.A00     // Catch:{ all -> 0x1554 }
            r1 = 129(0x81, float:1.81E-43)     // Catch:{ all -> 0x1554 }
            r3.grantUriPermission(r9, r4, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x069a     // Catch:{ all -> 0x1554 }
        L_0x06bc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Unexpected authority in URI: "     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = X.AnonymousClass001.A1E(r4, r1, r2)     // Catch:{ all -> 0x1554 }
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ all -> 0x1554 }
            r2.<init>(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x084c     // Catch:{ all -> 0x1554 }
        L_0x06cd:
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x06d3:
            java.lang.String r1 = "get_call_state"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8v0 r14 = r5.A07     // Catch:{ all -> 0x1554 }
            X.19T r13 = r14.A09     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "trigger_type"     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "request"     // Catch:{ all -> 0x1554 }
            r5 = 494341755(0x1d770e7b, float:3.2697664E-21)     // Catch:{ all -> 0x1554 }
            r13.markerAnnotate((int) r5, (java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x1554 }
            X.0vp r1 = r14.A0C     // Catch:{ all -> 0x1554 }
            java.lang.Object r12 = r1.get()     // Catch:{ all -> 0x1554 }
            com.whatsapp.voipcalling.CallState r12 = (com.whatsapp.voipcalling.CallState) r12     // Catch:{ all -> 0x1554 }
            X.0vp r1 = r14.A0B     // Catch:{ all -> 0x1554 }
            java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x1554 }
            com.whatsapp.voipcalling.CallInfo r10 = (com.whatsapp.voipcalling.CallInfo) r10     // Catch:{ all -> 0x1554 }
            X.1TM r9 = r14.A06     // Catch:{ all -> 0x1554 }
            X.0ve r4 = r9.A01     // Catch:{ all -> 0x1554 }
            r3 = 6408(0x1908, float:8.98E-42)     // Catch:{ all -> 0x1554 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x071d     // Catch:{ all -> 0x1554 }
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE     // Catch:{ all -> 0x1554 }
            if (r12 != r1) goto L_0x0749     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "unbind_voice_service_start"     // Catch:{ all -> 0x1554 }
            r13.markerPoint(r5, r1)     // Catch:{ all -> 0x1554 }
            X.1V7 r1 = r14.A03     // Catch:{ all -> 0x1554 }
            r1.A02(r14)     // Catch:{ all -> 0x1554 }
            r1 = 0     // Catch:{ all -> 0x1554 }
            r14.A00 = r1     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "unbind_voice_service_end"     // Catch:{ all -> 0x1554 }
            r13.markerPoint(r5, r1)     // Catch:{ all -> 0x1554 }
        L_0x071d:
            X.11S r15 = r14.A02     // Catch:{ all -> 0x1554 }
            X.A99 r5 = r14.A00     // Catch:{ all -> 0x1554 }
            X.1M9 r4 = r14.A04     // Catch:{ all -> 0x1554 }
            X.1Me r3 = r14.A05     // Catch:{ all -> 0x1554 }
            X.A4q r1 = r14.A08     // Catch:{ all -> 0x1554 }
            X.A0q r14 = r14.A07     // Catch:{ all -> 0x1554 }
            r19 = r15     // Catch:{ all -> 0x1554 }
            r20 = r5     // Catch:{ all -> 0x1554 }
            r21 = r4     // Catch:{ all -> 0x1554 }
            r22 = r3     // Catch:{ all -> 0x1554 }
            r23 = r9     // Catch:{ all -> 0x1554 }
            r24 = r14     // Catch:{ all -> 0x1554 }
            r25 = r1     // Catch:{ all -> 0x1554 }
            r26 = r13     // Catch:{ all -> 0x1554 }
            r27 = r11     // Catch:{ all -> 0x1554 }
            r28 = r10     // Catch:{ all -> 0x1554 }
            r29 = r12     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r1 = X.C173398v0.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A05(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0749:
            X.A99 r1 = r14.A00     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x071d     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "bind_voice_service_start"     // Catch:{ all -> 0x1554 }
            r13.markerPoint(r5, r1)     // Catch:{ all -> 0x1554 }
            X.1V7 r1 = r14.A03     // Catch:{ all -> 0x1554 }
            r1.A01(r14)     // Catch:{ all -> 0x1554 }
            java.lang.Runnable r3 = r14.A01     // Catch:{ all -> 0x1554 }
            if (r3 == 0) goto L_0x0763     // Catch:{ all -> 0x1554 }
            X.10I r1 = r14.A0A     // Catch:{ all -> 0x1554 }
            r1.CEz(r3)     // Catch:{ all -> 0x1554 }
            r1 = 0     // Catch:{ all -> 0x1554 }
            r14.A01 = r1     // Catch:{ all -> 0x1554 }
        L_0x0763:
            X.10I r5 = r14.A0A     // Catch:{ all -> 0x1554 }
            r3 = 20     // Catch:{ all -> 0x1554 }
            X.7Pd r1 = new X.7Pd     // Catch:{ all -> 0x1554 }
            r1.<init>(r14, r3)     // Catch:{ all -> 0x1554 }
            r3 = 60000(0xea60, double:2.9644E-319)     // Catch:{ all -> 0x1554 }
            X.25d r1 = r5.CGv(r1, r3)     // Catch:{ all -> 0x1554 }
            r14.A01 = r1     // Catch:{ all -> 0x1554 }
            goto L_0x071d     // Catch:{ all -> 0x1554 }
        L_0x0776:
            java.lang.String r1 = "accept_call"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8ut r9 = r5.A03     // Catch:{ all -> 0x1554 }
            java.lang.String r15 = "WhatsApp requires voice permissions for this operation."     // Catch:{ all -> 0x1554 }
            java.lang.String r14 = "Group calling is disabled"     // Catch:{ all -> 0x1554 }
            java.lang.String r13 = "There is no call with that call id"     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "There is no incoming call"     // Catch:{ all -> 0x1554 }
            r5 = 2     // Catch:{ all -> 0x1554 }
            r4 = 494340632(0x1d770a18, float:3.2695396E-21)     // Catch:{ all -> 0x1554 }
            r21 = 0     // Catch:{ all -> 0x1554 }
            X.19T r3 = r9.A05     // Catch:{ all -> 0x0843 }
            r3.markerStart(r4)     // Catch:{ all -> 0x0843 }
            java.lang.String r10 = "payload"     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r12 = r12.getJSONObject(r10)     // Catch:{ all -> 0x0843 }
            X.1HQ r10 = r9.A01     // Catch:{ all -> 0x0843 }
            r20 = r10     // Catch:{ all -> 0x0843 }
            r10 = r20     // Catch:{ all -> 0x0843 }
            X.1HR r10 = (X.AnonymousClass1HR) r10     // Catch:{ all -> 0x0843 }
            X.0ve r10 = r10.A00     // Catch:{ all -> 0x0843 }
            com.whatsapp.voipcalling.CallState r10 = com.whatsapp.voipcalling.Voip.A03(r10)     // Catch:{ all -> 0x0843 }
            boolean r19 = com.whatsapp.voipcalling.Voip.A0A(r10)     // Catch:{ all -> 0x0843 }
            java.lang.String r10 = "fail_reason"
            if (r19 != 0) goto L_0x07ba
            r3.markerAnnotate((int) r4, (java.lang.String) r10, (java.lang.String) r1)     // Catch:{ all -> 0x0843 }
            r10 = 18     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r10)     // Catch:{ all -> 0x0843 }
            goto L_0x083d     // Catch:{ all -> 0x0843 }
        L_0x07ba:
            java.lang.String r1 = "call_id"     // Catch:{ all -> 0x0843 }
            java.lang.String r12 = r12.getString(r1)     // Catch:{ all -> 0x0843 }
            X.A4q r1 = r9.A04     // Catch:{ all -> 0x0843 }
            java.lang.String r1 = r1.A02(r11, r12)     // Catch:{ all -> 0x0843 }
            com.whatsapp.voipcalling.CallInfo r12 = r20.BO3()     // Catch:{ all -> 0x0843 }
            if (r12 == 0) goto L_0x0834     // Catch:{ all -> 0x0843 }
            java.lang.String r11 = r12.callId     // Catch:{ all -> 0x0843 }
            boolean r11 = r1.equals(r11)     // Catch:{ all -> 0x0843 }
            if (r11 == 0) goto L_0x0834     // Catch:{ all -> 0x0843 }
            boolean r11 = r12.isGroupCall     // Catch:{ all -> 0x0843 }
            if (r11 != 0) goto L_0x082a     // Catch:{ all -> 0x0843 }
            boolean r11 = r12.isJoinableGroupCall     // Catch:{ all -> 0x0843 }
            if (r11 != 0) goto L_0x082a     // Catch:{ all -> 0x0843 }
            boolean r13 = r12.videoEnabled     // Catch:{ all -> 0x0843 }
            X.1DC r12 = r9.A06     // Catch:{ all -> 0x0843 }
            X.17x r11 = r9.A03     // Catch:{ all -> 0x0843 }
            boolean r14 = r11.A0E()     // Catch:{ all -> 0x0843 }
            if (r14 == 0) goto L_0x0820     // Catch:{ all -> 0x0843 }
            boolean r11 = X.AnonymousClass74H.A0A(r11, r12, r13)     // Catch:{ all -> 0x0843 }
            if (r11 != 0) goto L_0x0820     // Catch:{ all -> 0x0843 }
            X.118 r10 = r9.A02     // Catch:{ all -> 0x0843 }
            android.content.Context r10 = r10.A00     // Catch:{ all -> 0x0843 }
            X.195 r11 = r9.A00     // Catch:{ all -> 0x0843 }
            boolean r11 = r11.A00     // Catch:{ all -> 0x0843 }
            r27 = r11 ^ 1     // Catch:{ all -> 0x0843 }
            X.1LU r22 = new X.1LU     // Catch:{ all -> 0x0843 }
            r22.<init>()     // Catch:{ all -> 0x0843 }
            java.lang.String r24 = X.AnonymousClass6Z8.A00     // Catch:{ all -> 0x0843 }
            r26 = 3     // Catch:{ all -> 0x0843 }
            r23 = r10     // Catch:{ all -> 0x0843 }
            r25 = r1     // Catch:{ all -> 0x0843 }
            android.content.Intent r11 = r22.A22(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0843 }
            java.lang.String r1 = "start_activity_start"     // Catch:{ all -> 0x0843 }
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x0843 }
            r10.startActivity(r11)     // Catch:{ all -> 0x0843 }
            java.lang.String r1 = "start_activity_end"     // Catch:{ all -> 0x0843 }
            r3.markerPoint(r4, r1)     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ all -> 0x081c }
            r1 = 2     // Catch:{ all -> 0x081c }
            goto L_0x083e     // Catch:{ all -> 0x081c }
            r2 = move-exception
            r21 = 1
            goto L_0x0844
        L_0x0820:
            r3.markerAnnotate((int) r4, (java.lang.String) r10, (java.lang.String) r15)     // Catch:{ all -> 0x0843 }
            r1 = 9     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r9 = X.A3R.A06(r15, r1)     // Catch:{ all -> 0x0843 }
            goto L_0x083d     // Catch:{ all -> 0x0843 }
        L_0x082a:
            r3.markerAnnotate((int) r4, (java.lang.String) r10, (java.lang.String) r14)     // Catch:{ all -> 0x0843 }
            r1 = 23     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r9 = X.A3R.A06(r14, r1)     // Catch:{ all -> 0x0843 }
            goto L_0x083d     // Catch:{ all -> 0x0843 }
        L_0x0834:
            r3.markerAnnotate((int) r4, (java.lang.String) r10, (java.lang.String) r13)     // Catch:{ all -> 0x0843 }
            r1 = 17     // Catch:{ all -> 0x0843 }
            org.json.JSONObject r9 = X.A3R.A06(r13, r1)     // Catch:{ all -> 0x0843 }
        L_0x083d:
            r1 = 3     // Catch:{ all -> 0x0843 }
        L_0x083e:
            r3.markerEnd(r4, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r2 = move-exception
        L_0x0844:
            X.19T r1 = r9.A05     // Catch:{ all -> 0x1554 }
            if (r21 != 0) goto L_0x0849     // Catch:{ all -> 0x1554 }
            r5 = 3     // Catch:{ all -> 0x1554 }
        L_0x0849:
            r1.markerEnd(r4, r5)     // Catch:{ all -> 0x1554 }
        L_0x084c:
            throw r2     // Catch:{ all -> 0x1554 }
        L_0x084d:
            java.lang.String r1 = "mark_voice_message_played"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8ur r10 = r5.A0E     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r10.A01     // Catch:{ all -> 0x1554 }
            X.0ve r4 = r1.A01     // Catch:{ all -> 0x1554 }
            r3 = 5650(0x1612, float:7.917E-42)     // Catch:{ all -> 0x1554 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x086c     // Catch:{ all -> 0x1554 }
            r1 = 3     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x086c:
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "message_id"
            java.lang.String r3 = r3.getString(r1)     // Catch:{ SecurityException -> 0x08a4 }
            X.9o4 r1 = r10.A02     // Catch:{ SecurityException -> 0x08a4 }
            X.206 r3 = r1.A00(r11, r3)     // Catch:{ SecurityException -> 0x08a4 }
            int r1 = r3.A09     // Catch:{ SecurityException -> 0x08a4 }
            if (r1 == r0) goto L_0x088c     // Catch:{ SecurityException -> 0x08a4 }
            java.lang.String r3 = "Message requested is not of the correct type. mark_voice_message_played"     // Catch:{ SecurityException -> 0x08a4 }
            r1 = 26     // Catch:{ SecurityException -> 0x08a4 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ SecurityException -> 0x08a4 }
            goto L_0x1502     // Catch:{ SecurityException -> 0x08a4 }
        L_0x088c:
            boolean r1 = X.C62842s5.A02(r3)     // Catch:{ SecurityException -> 0x08a4 }
            X.1h1 r5 = r10.A00     // Catch:{ SecurityException -> 0x08a4 }
            X.205 r4 = r3.A0v     // Catch:{ SecurityException -> 0x08a4 }
            X.30j r3 = new X.30j     // Catch:{ SecurityException -> 0x08a4 }
            r3.<init>(r0, r10, r1)     // Catch:{ SecurityException -> 0x08a4 }
            r1 = 9     // Catch:{ SecurityException -> 0x08a4 }
            r5.A01(r3, r4, r1)     // Catch:{ SecurityException -> 0x08a4 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ SecurityException -> 0x08a4 }
            goto L_0x1502     // Catch:{ SecurityException -> 0x08a4 }
            r3 = move-exception
            java.lang.String r1 = "MarkMessageReadRequest/ caught exception"
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - mark_voice_message_played"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x08b2:
            java.lang.String r1 = "inbox"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.2Ja r9 = r5.A0B     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r9.A02     // Catch:{ all -> 0x1554 }
            X.0ve r4 = r1.A01     // Catch:{ all -> 0x1554 }
            r3 = 8366(0x20ae, float:1.1723E-41)     // Catch:{ all -> 0x1554 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x08d3     // Catch:{ all -> 0x1554 }
            r3 = 3     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Feature is disabled!inbox"     // Catch:{ all -> 0x1554 }
        L_0x08cd:
            org.json.JSONObject r9 = X.A3R.A06(r1, r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x08d3:
            X.11S r1 = r9.A00     // Catch:{ all -> 0x1554 }
            com.whatsapp.jid.PhoneUserJid r15 = X.AnonymousClass11S.A00(r1)     // Catch:{ all -> 0x1554 }
            if (r15 != 0) goto L_0x08df     // Catch:{ all -> 0x1554 }
            r3 = 4     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Request is not authorized!inbox"     // Catch:{ all -> 0x1554 }
            goto L_0x08cd     // Catch:{ all -> 0x1554 }
        L_0x08df:
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r4 = r12.getJSONObject(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r12 = "request_type"     // Catch:{ all -> 0x1554 }
            java.lang.String r5 = "snapshot"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r4.optString(r12, r5)     // Catch:{ all -> 0x1554 }
            X.19T r10 = r9.A04     // Catch:{ all -> 0x1554 }
            r1 = 494346323(0x1d772053, float:3.270689E-21)     // Catch:{ all -> 0x1554 }
            r10.markerAnnotate((int) r1, (java.lang.String) r12, (java.lang.String) r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "thread"     // Catch:{ all -> 0x1554 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x099e     // Catch:{ all -> 0x1554 }
            boolean r1 = r3.equals(r5)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x0907     // Catch:{ all -> 0x1554 }
            r3 = 1     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - inbox"     // Catch:{ all -> 0x1554 }
            goto L_0x08cd     // Catch:{ all -> 0x1554 }
        L_0x0907:
            java.lang.String r12 = "thread_count"     // Catch:{ all -> 0x1554 }
            r13 = 5     // Catch:{ all -> 0x1554 }
            int r1 = r4.optInt(r12, r13)     // Catch:{ all -> 0x1554 }
            r5 = 10     // Catch:{ all -> 0x1554 }
            int r1 = java.lang.Math.min(r1, r5)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "message_count"     // Catch:{ all -> 0x1554 }
            int r4 = r4.optInt(r3, r13)     // Catch:{ all -> 0x1554 }
            int r19 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x1554 }
            r14 = 494346323(0x1d772053, float:3.270689E-21)     // Catch:{ all -> 0x1554 }
            r10.markerAnnotate((int) r14, (java.lang.String) r12, (int) r1)     // Catch:{ all -> 0x1554 }
            r4 = r19     // Catch:{ all -> 0x1554 }
            r10.markerAnnotate((int) r14, (java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x1554 }
            X.A4q r4 = r9.A03     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r15.getRawString()     // Catch:{ all -> 0x1554 }
            java.lang.String r13 = r4.A03(r11, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "fetch_threads_start"     // Catch:{ all -> 0x1554 }
            r10.markerPoint(r14, r3)     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r12 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x1554 }
            X.1CJ r3 = r9.A01     // Catch:{ all -> 0x1554 }
            java.util.Collection r3 = r3.A0H()     // Catch:{ all -> 0x1554 }
            java.util.ArrayList r4 = X.C17880vN.A10(r3)     // Catch:{ all -> 0x1554 }
            r3 = 33     // Catch:{ all -> 0x1554 }
            X.C21486Akr.A01(r3, r4)     // Catch:{ all -> 0x1554 }
            int r3 = r4.size()     // Catch:{ all -> 0x1554 }
            int r3 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x1554 }
            r1 = 0     // Catch:{ all -> 0x1554 }
            java.util.List r3 = r4.subList(r1, r3)     // Catch:{ all -> 0x1554 }
            X.1ci[] r1 = new X.C29691ci[r1]     // Catch:{ all -> 0x1554 }
            java.lang.Object[] r5 = r3.toArray(r1)     // Catch:{ all -> 0x1554 }
            X.1ci[] r5 = (X.C29691ci[]) r5     // Catch:{ all -> 0x1554 }
            int r1 = r5.length     // Catch:{ all -> 0x1554 }
            r20 = r1     // Catch:{ all -> 0x1554 }
            r4 = 0     // Catch:{ all -> 0x1554 }
        L_0x0964:
            r1 = r20     // Catch:{ all -> 0x1554 }
            if (r4 >= r1) goto L_0x0985     // Catch:{ all -> 0x1554 }
            r3 = r5[r4]     // Catch:{ all -> 0x1554 }
            r1 = r19     // Catch:{ all -> 0x1554 }
            java.util.List r1 = X.C47602Ja.A00(r3, r9, r11, r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r15 = X.C47602Ja.A02(r3, r9, r11, r13)     // Catch:{ all -> 0x1554 }
            if (r15 == 0) goto L_0x0982     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "message_list"     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r1 = X.C47602Ja.A01(r1)     // Catch:{ all -> 0x1554 }
            r15.put(r3, r1)     // Catch:{ all -> 0x1554 }
            r12.put(r15)     // Catch:{ all -> 0x1554 }
        L_0x0982:
            int r4 = r4 + 1     // Catch:{ all -> 0x1554 }
            goto L_0x0964     // Catch:{ all -> 0x1554 }
        L_0x0985:
            java.lang.String r1 = "fetch_threads_end"     // Catch:{ all -> 0x1554 }
            r10.markerPoint(r14, r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "threads"     // Catch:{ all -> 0x1554 }
            r3.put(r1, r12)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "viewer_id"     // Catch:{ all -> 0x1554 }
            r3.put(r1, r13)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A05(r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x099e:
            java.lang.String r1 = "message_count"     // Catch:{ all -> 0x1554 }
            r14 = 5     // Catch:{ all -> 0x1554 }
            int r5 = r4.optInt(r1, r14)     // Catch:{ all -> 0x1554 }
            r3 = 10     // Catch:{ all -> 0x1554 }
            int r13 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x1554 }
            r12 = 494346323(0x1d772053, float:3.270689E-21)     // Catch:{ all -> 0x1554 }
            r10.markerAnnotate((int) r12, (java.lang.String) r1, (int) r13)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "thread_id"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r4.optString(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "contact_id"     // Catch:{ all -> 0x1554 }
            r4.optString(r1)     // Catch:{ all -> 0x1554 }
            X.A4q r1 = r9.A03     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = r15.getRawString()     // Catch:{ all -> 0x1554 }
            java.lang.String r5 = r1.A03(r11, r4)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r1.A02(r11, r3)     // Catch:{ 11T -> 0x0a2a }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x0a2a }
            X.1BI r3 = X.C22931Dv.A01(r3)     // Catch:{ 11T -> 0x0a2a }
            java.lang.String r1 = "fetch_chat_info_start"
            r10.markerPoint(r12, r1)     // Catch:{ all -> 0x1554 }
            X.1CJ r1 = r9.A01     // Catch:{ all -> 0x1554 }
            X.1ci r4 = r1.A0A(r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "Service internal error! thread_id"     // Catch:{ all -> 0x1554 }
            if (r4 != 0) goto L_0x09ea     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "InboxRequest/handleThreadRequest/chat_info_not_found"     // Catch:{ all -> 0x1554 }
        L_0x09e1:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r14)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x09ea:
            java.lang.String r1 = "create_thread_header_start"     // Catch:{ all -> 0x1554 }
            r10.markerPoint(r12, r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r1 = X.C47602Ja.A02(r4, r9, r11, r5)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x09f8     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "InboxRequest/handleThreadRequest/could_not_create_thread_json"     // Catch:{ all -> 0x1554 }
            goto L_0x09e1     // Catch:{ all -> 0x1554 }
        L_0x09f8:
            java.lang.String r3 = "fetch_message_list_start"     // Catch:{ all -> 0x1554 }
            r10.markerPoint(r12, r3)     // Catch:{ all -> 0x1554 }
            java.util.List r3 = X.C47602Ja.A00(r4, r9, r11, r13)     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = "message_list"     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r3 = X.C47602Ja.A01(r3)     // Catch:{ all -> 0x1554 }
            r1.put(r4, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "fetch_message_list_end"     // Catch:{ all -> 0x1554 }
            r10.markerPoint(r12, r3)     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r4 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x1554 }
            r4.put(r1)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "threads"     // Catch:{ all -> 0x1554 }
            r3.put(r1, r4)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "viewer_id"     // Catch:{ all -> 0x1554 }
            r3.put(r1, r5)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A05(r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r3 = move-exception     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "InboxRequest/handleThreadRequest"     // Catch:{ all -> 0x1554 }
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - thread_id"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0a38:
            java.lang.String r3 = "stop_voice_message_playback"     // Catch:{ all -> 0x1554 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x1554 }
            if (r3 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            goto L_0x0aa6     // Catch:{ all -> 0x1554 }
        L_0x0a41:
            java.lang.String r1 = "get_encrypted_cache_key"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8um r5 = r5.A08     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r5.A00     // Catch:{ all -> 0x1554 }
            X.0ve r4 = r1.A01     // Catch:{ all -> 0x1554 }
            r3 = 8075(0x1f8b, float:1.1315E-41)     // Catch:{ all -> 0x1554 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x0a62     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "Request is not implemented yet!"     // Catch:{ all -> 0x1554 }
            r1 = 2     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0a62:
            X.1HY r5 = r5.A01     // Catch:{ all -> 0x1554 }
            java.lang.String r10 = r11.A01     // Catch:{ all -> 0x1554 }
            java.lang.String r9 = "encrypted_cache/key"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = X.AnonymousClass1HY.A01(r10, r9)     // Catch:{ all -> 0x1554 }
            android.content.SharedPreferences r1 = X.AnonymousClass1HY.A00(r5)     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = X.C17880vN.A0r(r1, r3)     // Catch:{ all -> 0x1554 }
            if (r4 != 0) goto L_0x0a8f     // Catch:{ all -> 0x1554 }
            r1 = 32     // Catch:{ all -> 0x1554 }
            byte[] r1 = X.AnonymousClass8BV.A1a(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = X.C108955ca.A14(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = X.AnonymousClass1HY.A01(r10, r9)     // Catch:{ all -> 0x1554 }
            android.content.SharedPreferences r1 = X.AnonymousClass1HY.A00(r5)     // Catch:{ all -> 0x1554 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x1554 }
            X.C17880vN.A1E(r1, r3, r4)     // Catch:{ all -> 0x1554 }
        L_0x0a8f:
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "encrypted_cache_key"     // Catch:{ all -> 0x1554 }
            r3.put(r1, r4)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A05(r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0a9e:
            java.lang.String r3 = "play_voice_message"     // Catch:{ all -> 0x1554 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x1554 }
            if (r3 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
        L_0x0aa6:
            X.8uu r14 = r5.A0G     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r12.getString(r1)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "stop_voice_message_playback"     // Catch:{ all -> 0x1554 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x0acb     // Catch:{ all -> 0x1554 }
            X.7Mo r1 = r14.A00     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x0ac5     // Catch:{ all -> 0x1554 }
            r1.A0A()     // Catch:{ Exception -> 0x0abc }
            goto L_0x0ac5     // Catch:{ Exception -> 0x0abc }
            r3 = 5
            java.lang.String r1 = "Service internal error! "
            org.json.JSONObject r9 = X.A3R.A06(r1, r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0ac5:
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x0acb:
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x1554 }
            r13.<init>(r0)     // Catch:{ all -> 0x1554 }
            r9 = 0     // Catch:{ all -> 0x1554 }
            X.19T r10 = r14.A05     // Catch:{ Exception -> 0x0b4d }
            r5 = 494342675(0x1d771213, float:3.2699522E-21)     // Catch:{ Exception -> 0x0b4d }
            r10.markerStart(r5)     // Catch:{ Exception -> 0x0b4d }
            X.1TM r1 = r14.A03     // Catch:{ Exception -> 0x0b4d }
            X.0ve r4 = r1.A01     // Catch:{ Exception -> 0x0b4d }
            r3 = 5650(0x1612, float:7.917E-42)     // Catch:{ Exception -> 0x0b4d }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x0b4d }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ Exception -> 0x0b4d }
            if (r1 != 0) goto L_0x0afc     // Catch:{ Exception -> 0x0b4d }
            java.lang.String r3 = "Feature is disabled!play_voice_message"     // Catch:{ Exception -> 0x0b4d }
            r1 = 3     // Catch:{ Exception -> 0x0b4d }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ Exception -> 0x0b4d }
        L_0x0aee:
            java.lang.String r1 = "success"     // Catch:{ Exception -> 0x0b4d }
            boolean r1 = r9.getBoolean(r1)     // Catch:{ Exception -> 0x0b4d }
            r1 = r1 ^ 1     // Catch:{ Exception -> 0x0b4d }
            if (r1 == 0) goto L_0x0b40     // Catch:{ Exception -> 0x0b4d }
            r13.countDown()     // Catch:{ Exception -> 0x0b4d }
            goto L_0x0b40     // Catch:{ Exception -> 0x0b4d }
        L_0x0afc:
            java.lang.String r1 = "payload"     // Catch:{ Exception -> 0x0b4d }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ Exception -> 0x0b4d }
            java.lang.String r1 = "message_id"
            java.lang.String r3 = r3.getString(r1)     // Catch:{ SecurityException -> 0x0b39 }
            X.9o4 r1 = r14.A04     // Catch:{ SecurityException -> 0x0b39 }
            X.206 r4 = r1.A00(r11, r3)     // Catch:{ SecurityException -> 0x0b39 }
            java.lang.String r1 = "read_payload_end"     // Catch:{ SecurityException -> 0x0b39 }
            r10.markerPoint(r5, r1)     // Catch:{ SecurityException -> 0x0b39 }
            boolean r1 = r4 instanceof X.C441822l     // Catch:{ SecurityException -> 0x0b39 }
            if (r1 == 0) goto L_0x0b30     // Catch:{ SecurityException -> 0x0b39 }
            r1 = r4     // Catch:{ SecurityException -> 0x0b39 }
            X.22l r1 = (X.C441822l) r1     // Catch:{ SecurityException -> 0x0b39 }
            boolean r1 = r1.A1L()     // Catch:{ SecurityException -> 0x0b39 }
            if (r1 == 0) goto L_0x0b30     // Catch:{ SecurityException -> 0x0b39 }
            X.1KB r5 = r14.A01     // Catch:{ SecurityException -> 0x0b39 }
            r3 = 6     // Catch:{ SecurityException -> 0x0b39 }
            X.7R0 r1 = new X.7R0     // Catch:{ SecurityException -> 0x0b39 }
            r1.<init>(r14, r4, r13, r3)     // Catch:{ SecurityException -> 0x0b39 }
            r5.A0J(r1)     // Catch:{ SecurityException -> 0x0b39 }
            org.json.JSONObject r9 = X.A3R.A05(r9)     // Catch:{ SecurityException -> 0x0b39 }
            goto L_0x0aee     // Catch:{ SecurityException -> 0x0b39 }
        L_0x0b30:
            java.lang.String r3 = "Message requested is not of the correct type. play_voice_message"     // Catch:{ SecurityException -> 0x0b39 }
            r1 = 26     // Catch:{ SecurityException -> 0x0b39 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ SecurityException -> 0x0b39 }
            goto L_0x0aee     // Catch:{ SecurityException -> 0x0b39 }
            java.lang.String r1 = "Bad request - play_voice_message"
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ Exception -> 0x0b4d }
            goto L_0x0aee     // Catch:{ Exception -> 0x0b4d }
        L_0x0b40:
            X.10I r4 = r14.A06     // Catch:{ all -> 0x1554 }
            r3 = 5     // Catch:{ all -> 0x1554 }
            X.7R0 r1 = new X.7R0     // Catch:{ all -> 0x1554 }
            r1.<init>(r14, r13, r9, r3)     // Catch:{ all -> 0x1554 }
            r4.CGF(r1)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
            r1 = move-exception
            r13.countDown()     // Catch:{ all -> 0x0b52 }
            throw r1     // Catch:{ all -> 0x0b52 }
            r4 = move-exception
            X.10I r3 = r14.A06     // Catch:{ all -> 0x1554 }
            r2 = 5     // Catch:{ all -> 0x1554 }
            X.7R0 r1 = new X.7R0     // Catch:{ all -> 0x1554 }
            r1.<init>(r14, r13, r9, r2)     // Catch:{ all -> 0x1554 }
            r3.CGF(r1)     // Catch:{ all -> 0x1554 }
            throw r4     // Catch:{ all -> 0x1554 }
        L_0x0b5f:
            java.lang.String r1 = "send_message"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uy r1 = r5.A0H     // Catch:{ all -> 0x1554 }
            java.lang.String r20 = "Bad request - send_message"     // Catch:{ all -> 0x1554 }
            java.lang.String r25 = "plain_text"     // Catch:{ all -> 0x1554 }
            java.lang.String r10 = "media_type"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r5 = r12.getJSONObject(r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "contact_id"     // Catch:{ all -> 0x1554 }
            java.lang.String r12 = r5.optString(r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = "seci_id"     // Catch:{ all -> 0x1554 }
            java.lang.String r3 = r5.optString(r3)     // Catch:{ all -> 0x1554 }
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 != 0) goto L_0x0bbf     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.A0q r4 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.A4q r3 = r4.A00     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = r3.A02(r11, r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1E7 r11 = X.C19959A0q.A00(r4, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0b93:
            X.1BI r12 = X.C72463Mc.A0g(r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r3 = r11.A0F()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r3 == 0) goto L_0x0bcc     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1BI r4 = r11.A0J     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r3 = r4 instanceof X.AnonymousClass1EC     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r3 == 0) goto L_0x0bcc     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1MZ r3 = r1.A07     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r3 = r3.A0J(r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r3 == 0) goto L_0x0bb5     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1PU r3 = r1.A0G     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r3 = r3.A01(r11, r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r3 == 0) goto L_0x0bcc     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0bb5:
            java.lang.String r3 = "You can't send a message to this group"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 16     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0bbf:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 != 0) goto L_0x1278     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.A0q r4 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1E7 r11 = r4.A01(r11, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0b93     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0bcc:
            X.00H r3 = r1.A0I     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1pj r3 = X.AnonymousClass3MW.A0V(r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r3 = r3.A0P(r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r3 == 0) goto L_0x0be6     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = "The requested contact is blocked."     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 11     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0be6:
            X.9gE r3 = r1.A0A     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1NK r4 = r3.A04     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r11 = r4.A09(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r11 != 0) goto L_0x0bff     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "system-messages-handler/new chat initiated"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = "User tries to start a new thread which would produce a system message"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 22     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0bff:
            boolean r4 = r4.A09(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 != 0) goto L_0x0c14     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "system-messages-handler/new chat initiated"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0c0a:
            java.lang.String r3 = "There is a critical unread system message in the thread"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 20     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0c14:
            X.1Co r4 = r3.A01     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = r4.A0B(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x0cdc     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1CJ r4 = r3.A02     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            long r29 = r4.A07(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.122 r4 = r3.A03     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r28 = 100     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r31 = -1     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r26 = r4     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r27 = r12     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.2dp r19 = r26.BUp(r27, r28, r29, r31)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = r19
            android.database.Cursor r11 = r4.A00     // Catch:{ all -> 0x0cce }
            if (r11 == 0) goto L_0x0cdc     // Catch:{ all -> 0x0cce }
            boolean r4 = r11.moveToFirst()     // Catch:{ all -> 0x0cce }
            if (r4 != 0) goto L_0x0c3e     // Catch:{ all -> 0x0cce }
            goto L_0x0cd9     // Catch:{ all -> 0x0cce }
        L_0x0c3e:
            X.00H r4 = r3.A05     // Catch:{ all -> 0x0cce }
            X.1W6 r4 = X.C17880vN.A0c(r4)     // Catch:{ all -> 0x0cce }
            X.206 r4 = r4.A02(r11, r12)     // Catch:{ all -> 0x0cce }
            if (r4 == 0) goto L_0x0cb2     // Catch:{ all -> 0x0cce }
            long r13 = r4.A0x     // Catch:{ all -> 0x0cce }
            int r15 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))     // Catch:{ all -> 0x0cce }
            if (r15 == 0) goto L_0x0cb2     // Catch:{ all -> 0x0cce }
            long r14 = r4.A0I     // Catch:{ all -> 0x0cce }
            X.11P r13 = r3.A00     // Catch:{ all -> 0x0cce }
            long r23 = X.AnonymousClass11P.A01(r13)     // Catch:{ all -> 0x0cce }
            r21 = 86400000(0x5265c00, double:4.2687272E-316)     // Catch:{ all -> 0x0cce }
            long r23 = r23 - r21     // Catch:{ all -> 0x0cce }
            int r13 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))     // Catch:{ all -> 0x0cce }
            if (r13 < 0) goto L_0x0cb2     // Catch:{ all -> 0x0cce }
            boolean r13 = r4 instanceof X.C442822v     // Catch:{ all -> 0x0cce }
            if (r13 != 0) goto L_0x0cc9     // Catch:{ all -> 0x0cce }
            boolean r13 = r4 instanceof X.C436420i     // Catch:{ all -> 0x0cce }
            if (r13 == 0) goto L_0x0cb2     // Catch:{ all -> 0x0cce }
            X.20i r4 = (X.C436420i) r4     // Catch:{ all -> 0x0cce }
            int r13 = r4.A00     // Catch:{ all -> 0x0cce }
            X.00H r4 = X.AnonymousClass2WQ.A00     // Catch:{ all -> 0x0cce }
            r4 = 22     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 23     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 24     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 25     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 26     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 34     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 35     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 36     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 46     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 47     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 48     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 49     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 50     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 55     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 62     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            r4 = 63     // Catch:{ all -> 0x0cce }
            if (r13 == r4) goto L_0x0cc4     // Catch:{ all -> 0x0cce }
            switch(r13) {
                case 4: goto L_0x0cb9;
                case 12: goto L_0x0cb9;
                case 18: goto L_0x0cb9;
                case 20: goto L_0x0cb9;
                case 27: goto L_0x0cb9;
                case 52: goto L_0x0cb9;
                case 56: goto L_0x0cb9;
                case 57: goto L_0x0cb9;
                case 59: goto L_0x0cb9;
                case 67: goto L_0x0cb9;
                case 71: goto L_0x0cb9;
                case 79: goto L_0x0cb9;
                case 80: goto L_0x0cb9;
                case 90: goto L_0x0cb9;
                case 106: goto L_0x0cb9;
                case 123: goto L_0x0cb9;
                case 124: goto L_0x0cb9;
                case 126: goto L_0x0cb9;
                case 127: goto L_0x0cb9;
                case 130: goto L_0x0cb9;
                case 131: goto L_0x0cb9;
                case 144: goto L_0x0cb9;
                case 149: goto L_0x0cb9;
                default: goto L_0x0cb2;
            }     // Catch:{ all -> 0x0cce }
        L_0x0cb2:
            boolean r4 = r11.moveToNext()     // Catch:{ all -> 0x0cce }
            if (r4 != 0) goto L_0x0c3e     // Catch:{ all -> 0x0cce }
            goto L_0x0cd9     // Catch:{ all -> 0x0cce }
        L_0x0cb9:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cce }
            java.lang.String r1 = "system-messages-handler/critical message "     // Catch:{ all -> 0x0cce }
            java.lang.String r1 = X.AnonymousClass001.A1I(r1, r3, r13)     // Catch:{ all -> 0x0cce }
            goto L_0x0cc6     // Catch:{ all -> 0x0cce }
        L_0x0cc4:
            java.lang.String r1 = "system-messages-handler/critical message"     // Catch:{ all -> 0x0cce }
        L_0x0cc6:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0cce }
        L_0x0cc9:
            r11.close()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0c0a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = r19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            android.database.Cursor r1 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x0cd8     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1.close()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0cd8:
            throw r3     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0cd9:
            r11.close()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0cdc:
            X.19T r3 = r1.A0F     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r4 = "contact_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r11 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerPoint(r11, r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r13 = r5.optString(r10, r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.util.ArrayList r19 = X.AnonymousClass000.A13()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r14 = "media_uri"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = r5.has(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x0d09     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.Object r4 = r5.get(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = r4 instanceof java.lang.String     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x0d26     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r14 = r5.optString(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = r19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4.add(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d09:
            java.lang.String r4 = "message"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r28 = r5.optString(r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r14 = "media_quality"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = -1     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            int r4 = r5.optInt(r14, r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r14 = "visualization_data"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONArray r24 = r5.optJSONArray(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r5 = "read_payload_end"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerPoint(r11, r5)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            int r15 = r13.hashCode()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0d3a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d26:
            org.json.JSONArray r15 = r5.optJSONArray(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r15 == 0) goto L_0x0d09     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r14 = 0     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d2d:
            int r4 = r15.length()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r14 >= r4) goto L_0x0d09     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = r19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            int r14 = X.AnonymousClass8BU.A05(r4, r15, r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0d2d     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d3a:
            java.lang.String r5 = "voice_message"
            java.lang.String r14 = "video"
            java.lang.String r11 = "photo"
            switch(r15) {
                case 106642994: goto L_0x0d45;
                case 112202875: goto L_0x1154;
                case 354039290: goto L_0x0e80;
                case 1021751938: goto L_0x0e3f;
                default: goto L_0x0d43;
            }     // Catch:{ all -> 0x1554 }
        L_0x0d43:
            goto L_0x126f     // Catch:{ all -> 0x1554 }
        L_0x0d45:
            boolean r5 = r13.equals(r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r5 == 0) goto L_0x126f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r5 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerAnnotate((int) r5, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r13 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r9 = "SendMessageRequest/sendmedia/sendimages/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r10 = r19.isEmpty()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r10 == 0) goto L_0x0d63     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  photo uris list is empty"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d63:
            X.17x r10 = r1.A06     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.Integer r11 = r10.A05()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.Integer r10 = X.AnonymousClass00R.A00     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r11 == r10) goto L_0x0d77     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = 24     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Missing media permission to send media Messages"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d71:
            org.json.JSONObject r9 = X.A3R.A06(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0d77:
            java.lang.String r10 = "permission_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerPoint(r5, r10)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r11 = 5     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.C173378uy.A00(r1)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.util.Iterator r19 = r19.iterator()     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0d84:
            boolean r10 = r19.hasNext()     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r10 == 0) goto L_0x0df5     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r14 = X.C17880vN.A0v(r19)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            boolean r10 = android.text.TextUtils.isEmpty(r14)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r10 == 0) goto L_0x0d9c     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "Bad request -  photo uri is empty"     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0d9c:
            java.lang.String r10 = "parse_uri_start"     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r5, r10)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            android.net.Uri r22 = android.net.Uri.parse(r14)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r10 = "parse_uri_end"     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r5, r10)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            X.1kd r15 = r1.A00     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.util.List r30 = java.util.Collections.singletonList(r12)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r10 = -1     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r23 = 0     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == r10) goto L_0x0dca     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r10 = 0     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == 0) goto L_0x0dcd     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r10 = 1     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == r0) goto L_0x0dcd     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r10 = 2     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == r10) goto L_0x0dcd     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r10 = 3     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == r10) goto L_0x0dcd     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r10 = "SendMessageRequest/sendmedia/translateMediaQuality/ Unknown media quality: "     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            X.C17900vP.A0k(r10, r14, r4)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0dca:
            r26 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x0dd1     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0dcd:
            java.lang.Integer r26 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0dd1:
            r34 = 0     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r25 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r27 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r29 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r31 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r32 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r33 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r36 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r37 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r38 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r39 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r40 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r41 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r21 = r15     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r24 = r23     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r35 = r34     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r21.A04(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x0d84     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
        L_0x0df5:
            A00(r1, r12, r3)     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x0dfe, 1iX -> 0x0e24, OutOfMemoryError -> 0x0e1a, SecurityException -> 0x0e2b, NullPointerException | SecurityException -> 0x1284 }
            r3 = move-exception
            com.whatsapp.util.Log.e(r9, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x0e39     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "No space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r1 = r3.contains(r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x0e39     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = 19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0d71     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r13, r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e(r9, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  file not an image"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x0e33     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "sendmedia/sendimages/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  URI inaccessible"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e33:
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e39:
            org.json.JSONObject r9 = X.A3R.A06(r13, r11)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e3f:
            r4 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = r13.equals(r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x126f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r5 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerAnnotate((int) r5, (java.lang.String) r10, (java.lang.String) r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = android.text.TextUtils.isEmpty(r28)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x0e5d     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  message is empty"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e5d:
            X.C173378uy.A00(r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.1iW r4 = r1.A01     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.util.List r29 = java.util.Collections.singletonList(r12)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r31 = 0     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r25 = 0     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r27 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r30 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r24 = r4     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r26 = r25     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r32 = r31     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r24.A0O(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            A00(r1, r12, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A05(r25)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e80:
            boolean r4 = r13.equals(r5)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x126f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r11 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerAnnotate((int) r11, (java.lang.String) r10, (java.lang.String) r5)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r23 = "SendMessageRequest/sendVoiceMessage/ empty URI"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = r19.isEmpty()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x0e9f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e((java.lang.String) r23)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  voice message uris list is empty"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0e9f:
            X.1TM r4 = r1.A08     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.0ve r5 = r4.A01     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = 5649(0x1611, float:7.916E-42)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.0vf r10 = X.C18040vf.A02     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r4 = X.C18020vd.A05(r10, r5, r4)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 != 0) goto L_0x0eb5     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "SendMessageRequest/sendVoiceMessage/ feature disabled"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 3     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x114a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x0eb5:
            X.C173378uy.A00(r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.util.Iterator r22 = r19.iterator()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x0ebc:
            boolean r4 = r22.hasNext()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == 0) goto L_0x1125     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = X.C17880vN.A0v(r22)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r4 == 0) goto L_0x0ed7     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.e((java.lang.String) r23)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "Bad request -  voice message uri is empty"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x0ed7:
            android.net.Uri r9 = android.net.Uri.parse(r5)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.2rc r21 = new X.2rc     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r21.<init>()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.1Sl r5 = r1.A0H     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r4 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.io.File r19 = r5.A0j(r9, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r4 = "parse_uri_end"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r11, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.9b8 r9 = r1.A0B     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            boolean r4 = r19.canRead()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r4 != 0) goto L_0x0f16     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.9xP r4 = r9.A00     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "emitFileNotExistsError"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r3 = "PTT_VALIDATION_FILE_NOT_EXIST"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r1 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.C197869xP.A00(r4, r3, r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x0f01:
            java.lang.String r1 = "isValidVoiceMessageFile file validation failed"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x0f06:
            java.lang.String r1 = "SendMessageRequest/sendVoiceMessage/ file validation failed"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r19.delete()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "Bad request -  voice message file validation failed"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x0f16:
            long r4 = r19.length()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r14 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r13 <= 0) goto L_0x102d     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r14 = 2000000(0x1e8480, double:9.881313E-318)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r13 > 0) goto L_0x102d     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = r19.getAbsolutePath()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.00H r4 = r9.A01     // Catch:{ OggAnalyzerException -> 0x100f }
            r4.get()     // Catch:{ OggAnalyzerException -> 0x100f }
            com.whatsapp.media.OggAnalyzer$OggFileReport r13 = com.whatsapp.media.OggAnalyzer.examineOggStream(r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            boolean r4 = r13.isAudioStreamOpus     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r4 != 0) goto L_0x0f46     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitNotOpusError"     // Catch:{ OggAnalyzerException -> 0x100f }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_NOT_OPUS"     // Catch:{ OggAnalyzerException -> 0x100f }
            r1 = 0     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f42:
            X.C197869xP.A00(r10, r3, r1)     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f06     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f46:
            float r4 = r13.fileDurationSeconds     // Catch:{ OggAnalyzerException -> 0x100f }
            r5 = 1065353216(0x3f800000, float:1.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 >= 0) goto L_0x0f62     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitDurationTooShortError durationSeconds="     // Catch:{ OggAnalyzerException -> 0x100f }
            r3.append(r1)     // Catch:{ OggAnalyzerException -> 0x100f }
            r3.append(r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            X.AnonymousClass8BT.A1M(r3)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_DURATION_MIN"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f7b     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f62:
            r5 = 1133903872(0x43960000, float:300.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 <= 0) goto L_0x0fa3     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitDurationTooLongError durationSeconds="     // Catch:{ OggAnalyzerException -> 0x100f }
            r3.append(r1)     // Catch:{ OggAnalyzerException -> 0x100f }
            r3.append(r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            X.AnonymousClass8BT.A1M(r3)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_DURATION_MAX"     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f7b:
            r1 = 1202241536(0x47a8c000, float:86400.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r1 <= 0) goto L_0x0f85     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "P1D-P1Y"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f85:
            r1 = 1135869952(0x43b40000, float:360.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r1 <= 0) goto L_0x0f8e     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "PT6M-P1D"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f8e:
            r1 = 1133903872(0x43960000, float:300.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r1 <= 0) goto L_0x0f97     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "PT5M-PT6M"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0f97:
            r1 = 1065353216(0x3f800000, float:1.0)     // Catch:{ OggAnalyzerException -> 0x100f }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r1 <= 0) goto L_0x0fa0     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "PT1S-PT5M"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fa0:
            java.lang.String r1 = "PT0S-PT1S"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fa3:
            int r5 = r13.numberOfStreams     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 == r0) goto L_0x0fb9     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitMultipleStreamsError streamsCount="     // Catch:{ OggAnalyzerException -> 0x100f }
            X.C17900vP.A0k(r1, r3, r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_MULTIPLE_STREAMS"     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fb4:
            java.lang.String r1 = java.lang.Integer.toString(r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0f42     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fb9:
            int r5 = r13.samplingRate     // Catch:{ OggAnalyzerException -> 0x100f }
            r4 = 48000(0xbb80, float:6.7262E-41)     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 == r4) goto L_0x0fd2     // Catch:{ OggAnalyzerException -> 0x100f }
            r4 = 16000(0x3e80, float:2.2421E-41)     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 == r4) goto L_0x0fd2     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitSamplingRateError samplingRateHz="     // Catch:{ OggAnalyzerException -> 0x100f }
            X.C17900vP.A0k(r1, r3, r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_SAMPLING_RATE"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0fb4     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fd2:
            int r5 = r13.channels     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r5 == r0) goto L_0x0fe4     // Catch:{ OggAnalyzerException -> 0x100f }
            X.9xP r10 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r1 = "emitChannelsCountError channelsCount="     // Catch:{ OggAnalyzerException -> 0x100f }
            X.C17900vP.A0k(r1, r3, r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r3 = "PTT_VALIDATION_CHANNELS"     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x0fb4     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0fe4:
            X.9xP r13 = r9.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            X.1TM r4 = r13.A00     // Catch:{ OggAnalyzerException -> 0x100f }
            X.0ve r5 = r4.A01     // Catch:{ OggAnalyzerException -> 0x100f }
            r4 = 6076(0x17bc, float:8.514E-42)     // Catch:{ OggAnalyzerException -> 0x100f }
            boolean r4 = X.C18020vd.A05(r10, r5, r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            if (r4 != 0) goto L_0x0ff8     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r4 = "emitSuccess suppressed"     // Catch:{ OggAnalyzerException -> 0x100f }
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x1054     // Catch:{ OggAnalyzerException -> 0x100f }
        L_0x0ff8:
            java.lang.String r4 = "emitSuccess"     // Catch:{ OggAnalyzerException -> 0x100f }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            X.19T r13 = r13.A01     // Catch:{ OggAnalyzerException -> 0x100f }
            r5 = 494345136(0x1d771bb0, float:3.2704492E-21)     // Catch:{ OggAnalyzerException -> 0x100f }
            r13.markerStart(r5)     // Catch:{ OggAnalyzerException -> 0x100f }
            java.lang.String r4 = "is_success"     // Catch:{ OggAnalyzerException -> 0x100f }
            r13.markerAnnotate((int) r5, (java.lang.String) r4, (boolean) r0)     // Catch:{ OggAnalyzerException -> 0x100f }
            r4 = 2     // Catch:{ OggAnalyzerException -> 0x100f }
            r13.markerEnd(r5, r4)     // Catch:{ OggAnalyzerException -> 0x100f }
            goto L_0x1054     // Catch:{ OggAnalyzerException -> 0x100f }
            r3 = move-exception
            java.lang.String r1 = "isValidVoiceMessageFile failed to parse file"
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.9xP r5 = r9.A00     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            int r4 = r3.errorCode     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "emitOpusParsingError errorCode="     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.C17900vP.A0k(r1, r3, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r3 = "PTT_VALIDATION_PARSING"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.C197869xP.A00(r5, r3, r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x0f06     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x102d:
            X.9xP r11 = r9.A00     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "emitFileSizeError fileSizeBytes="     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = X.C17890vO.A0a(r1, r3, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r3 = "PTT_VALIDATION_FILE_SIZE"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            double r9 = (double) r4     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            double r9 = r9 / r12     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            double r4 = java.lang.Math.ceil(r9)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            double r4 = r4 * r12     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            long r4 = java.lang.Math.round(r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.C197869xP.A00(r11, r3, r1)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x0f01     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x1054:
            java.lang.String r4 = "file_validation_end"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r11, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.00H r4 = r1.A0J     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r4.get()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r4 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r24 != 0) goto L_0x1062     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x10a9     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x1062:
            int r15 = r24.length()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r15 < r0) goto L_0x109e     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r5 = 10000(0x2710, float:1.4013E-41)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r15 > r5) goto L_0x109e     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.util.ArrayList r9 = X.C17880vN.A0z(r15)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r14 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x1071:
            r5 = r24
            int r13 = r5.getInt(r14)     // Catch:{ JSONException -> 0x108f }
            if (r13 < 0) goto L_0x1085     // Catch:{ JSONException -> 0x108f }
            r5 = 100     // Catch:{ JSONException -> 0x108f }
            if (r13 > r5) goto L_0x1085     // Catch:{ JSONException -> 0x108f }
            X.C17890vO.A1D(r9, r13)     // Catch:{ JSONException -> 0x108f }
            int r14 = r14 + 1     // Catch:{ JSONException -> 0x108f }
            if (r14 >= r15) goto L_0x10af     // Catch:{ JSONException -> 0x108f }
            goto L_0x1071     // Catch:{ JSONException -> 0x108f }
        L_0x1085:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x108f }
            java.lang.String r5 = "isValidValue value is outside expected range: "     // Catch:{ JSONException -> 0x108f }
            X.C17900vP.A0k(r5, r9, r13)     // Catch:{ JSONException -> 0x108f }
            goto L_0x10ae     // Catch:{ JSONException -> 0x108f }
            r13 = move-exception
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = "parseVoiceMessageVisualizationData invalid integer at position "     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = X.AnonymousClass001.A1I(r5, r9, r14)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            com.whatsapp.util.Log.w(r5, r13)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x10ae     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x109e:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = "parseVoiceMessageVisualizationData jsonDataLen="     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = X.AnonymousClass001.A1I(r5, r9, r15)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x10ab     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10a9:
            java.lang.String r5 = "parseVoiceMessageVisualizationData jsonVisualizationData is null"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10ab:
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10ae:
            r9 = r4     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10af:
            r5 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            if (r9 == 0) goto L_0x10f4     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.9N3 r4 = r1.A0C     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r9.size()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.17y r4 = r4.A00     // Catch:{ IOException -> 0x10e5 }
            X.17z r13 = r4.A00     // Catch:{ IOException -> 0x10e5 }
            java.lang.String r4 = ""     // Catch:{ IOException -> 0x10e5 }
            java.io.File r4 = r13.A01(r4)     // Catch:{ IOException -> 0x10e5 }
            java.io.FileOutputStream r13 = X.C108945cZ.A19(r4)     // Catch:{ IOException -> 0x10e5 }
            java.util.Iterator r14 = r9.iterator()     // Catch:{ IOException -> 0x10e1 }
        L_0x10c9:
            boolean r9 = r14.hasNext()     // Catch:{ IOException -> 0x10e1 }
            if (r9 == 0) goto L_0x10dd     // Catch:{ IOException -> 0x10e1 }
            java.lang.Object r9 = r14.next()     // Catch:{ IOException -> 0x10e1 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ IOException -> 0x10e1 }
            int r9 = r9.intValue()     // Catch:{ IOException -> 0x10e1 }
            r13.write(r9)     // Catch:{ IOException -> 0x10e1 }
            goto L_0x10c9     // Catch:{ IOException -> 0x10e1 }
        L_0x10dd:
            r13.close()     // Catch:{ IOException -> 0x10e1 }
            goto L_0x10ec     // Catch:{ IOException -> 0x10e1 }
            r9 = move-exception
            java.lang.String r4 = "Unexpected error writing or flushing visualization data to disk"
            goto L_0x10e8
            r9 = move-exception
            java.lang.String r4 = "generateVoiceMessageVisualizationFile/ Failed to create or open temporary file for visualization data"
        L_0x10e8:
            com.whatsapp.util.Log.e(r4, r9)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r4 = r5     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10ec:
            r4.getAbsolutePath()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r9 = "generate_voice_visualization_end"     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r11, r9)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x10f4:
            r13 = r19     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r9 = r21     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r9.A0G = r13     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.1he r9 = r1.A0D     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.11P r13 = r1.A04     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            long r30 = X.AnonymousClass11P.A01(r13)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r29 = r19.getName()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            long r32 = r19.length()     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r34 = 0     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r25 = r9     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r26 = r21     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r27 = r12     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r28 = r5     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.22l r13 = r25.A00(r26, r27, r28, r29, r30, r32, r34)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            int r9 = X.C26511Sk.A03(r19)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r13.A0D = r9     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            X.70C r9 = r1.A0E     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            r9.A01(r5, r13, r4)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x0ebc     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
        L_0x1125:
            A00(r1, r12, r3)     // Catch:{ IOException -> 0x112e, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = move-exception     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "SendMessageRequest/sendmedia/sendvoicemessage/share-failed/ "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x1150     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "No space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r1 = r3.contains(r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x1150     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r9 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x114a:
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x1150:
            r1 = 5     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r9 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x114a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x1154:
            boolean r4 = r13.equals(r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r4 == 0) goto L_0x126f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r4 = 494340037(0x1d7707c5, float:3.2694195E-21)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerAnnotate((int) r4, (java.lang.String) r10, (java.lang.String) r14)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r5 = 1     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r9 = r19.isEmpty()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r9 == 0) goto L_0x116f     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Bad request -  video uris list is empty"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x1169:
            org.json.JSONObject r9 = X.A3R.A06(r1, r5)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x116f:
            X.17x r5 = r1.A06     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.Integer r9 = r5.A05()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.Integer r5 = X.AnonymousClass00R.A00     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r9 == r5) goto L_0x117e     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r5 = 24     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Missing media permission to send media Messages"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1169     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x117e:
            java.lang.String r5 = "permission_checks_end"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3.markerPoint(r4, r5)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            X.C173378uy.A00(r1)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            java.util.Iterator r19 = r19.iterator()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x118a:
            boolean r5 = r19.hasNext()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            if (r5 == 0) goto L_0x1243     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r9 = X.C17880vN.A0v(r19)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            if (r5 == 0) goto L_0x11a2     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r1 = "Bad request -  video uri is empty"     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x11a2:
            java.lang.String r5 = "parse_uri_start"     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r4, r5)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            java.lang.String r5 = "parse_uri_end"     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r3.markerPoint(r4, r5)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            X.1kd r15 = r1.A00     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            java.util.List r29 = java.util.Collections.singletonList(r12)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r14 = 0     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            X.11C r5 = r1.A03     // Catch:{ IOException -> 0x11fc, all -> 0x122d }
            X.11B r5 = r5.A0O()     // Catch:{ IOException -> 0x11fc, all -> 0x122d }
            java.io.InputStream r11 = r5.A07(r9)     // Catch:{ IOException -> 0x11fc, all -> 0x122d }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            java.lang.String r9 = "temp_"     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            r5.append(r9)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            java.lang.String r9 = X.C17880vN.A0u(r5, r9)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            X.118 r5 = r1.A05     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            java.io.File r5 = X.C108945cZ.A16(r5)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            java.io.File r27 = java.io.File.createTempFile(r9, r14, r5)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            java.io.FileOutputStream r10 = X.C108945cZ.A19(r27)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            r5 = 4096(0x1000, float:5.74E-42)     // Catch:{ IOException -> 0x11f9, all -> 0x1231 }
            byte[] r9 = new byte[r5]     // Catch:{ IOException -> 0x11f7 }
        L_0x11e4:
            int r5 = r11.read(r9)     // Catch:{ IOException -> 0x11f7 }
            r13 = -1     // Catch:{ IOException -> 0x11f7 }
            if (r5 == r13) goto L_0x11f0     // Catch:{ IOException -> 0x11f7 }
            r13 = 0     // Catch:{ IOException -> 0x11f7 }
            r10.write(r9, r13, r5)     // Catch:{ IOException -> 0x11f7 }
            goto L_0x11e4     // Catch:{ IOException -> 0x11f7 }
        L_0x11f0:
            r11.close()     // Catch:{ IOException -> 0x1214 }
            r10.close()     // Catch:{ IOException -> 0x1214 }
            goto L_0x1218     // Catch:{ IOException -> 0x1214 }
            r5 = move-exception
            goto L_0x11ff
            r5 = move-exception
            r10 = r14
            goto L_0x11ff
            r5 = move-exception
            r11 = r14
            r10 = r14
        L_0x11ff:
            r5.printStackTrace()     // Catch:{ all -> 0x122f }
            if (r11 == 0) goto L_0x1207     // Catch:{ all -> 0x122f }
            r11.close()     // Catch:{ IOException -> 0x120d }
        L_0x1207:
            if (r10 == 0) goto L_0x1211     // Catch:{ IOException -> 0x120d }
            r10.close()     // Catch:{ IOException -> 0x120d }
            goto L_0x1211     // Catch:{ IOException -> 0x120d }
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x1211:
            r27 = r14     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1218     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r5 = move-exception     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r5.printStackTrace()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x1218:
            r30 = 0     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r24 = r14     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r25 = r14     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r26 = r14     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r32 = r30     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r22 = r15     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r23 = r14     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r31 = r30     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r22.A0A(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x118a     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r3 = move-exception
            goto L_0x1242
            r3 = move-exception
            goto L_0x1233
            r3 = move-exception
            r10 = r14
        L_0x1233:
            if (r11 == 0) goto L_0x1238
            r11.close()     // Catch:{ IOException -> 0x123e }
        L_0x1238:
            if (r10 == 0) goto L_0x1242     // Catch:{ IOException -> 0x123e }
            r10.close()     // Catch:{ IOException -> 0x123e }
            goto L_0x1242     // Catch:{ IOException -> 0x123e }
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x1242:
            throw r3     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
        L_0x1243:
            A00(r1, r12, r3)     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            goto L_0x1502     // Catch:{ IOException -> 0x124c, NullPointerException | SecurityException -> 0x1284 }
            r3 = move-exception
            java.lang.String r1 = "sendmedia/sendvideos/share-failed/ "
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x126a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "No space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            boolean r1 = r3.contains(r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            if (r1 == 0) goto L_0x126a     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r5 = 19     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Device doesn't have enough free space"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1169     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x126a:
            r5 = 5     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            java.lang.String r1 = "Service internal error! "     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1169     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x126f:
            java.lang.String r3 = "Request is not implemented yet!"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r1 = 2     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
        L_0x1278:
            java.lang.String r1 = "Bad request -  - no contact ID or seci ID"     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            goto L_0x1502     // Catch:{ NullPointerException | SecurityException -> 0x1284, IllegalStateException -> 0x1280 }
            r3 = move-exception
            java.lang.String r1 = "requesthandler/send-message encryption key not present"
            goto L_0x1287
            r3 = move-exception
            java.lang.String r1 = "requesthandler/send-message invalid contact ID"
        L_0x1287:
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1554 }
            r1 = r20     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x1292:
            java.lang.String r1 = "get_call_history"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uq r9 = r5.A06     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r9.A01     // Catch:{ Exception -> 0x1336 }
            X.0ve r4 = r1.A01     // Catch:{ Exception -> 0x1336 }
            r3 = 7900(0x1edc, float:1.107E-41)     // Catch:{ Exception -> 0x1336 }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x1336 }
            boolean r1 = X.C18020vd.A05(r1, r4, r3)     // Catch:{ Exception -> 0x1336 }
            if (r1 != 0) goto L_0x12b3     // Catch:{ Exception -> 0x1336 }
            java.lang.String r3 = "Feature is disabled!get_call_history"     // Catch:{ Exception -> 0x1336 }
            r1 = 3     // Catch:{ Exception -> 0x1336 }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ Exception -> 0x1336 }
            goto L_0x1502     // Catch:{ Exception -> 0x1336 }
        L_0x12b3:
            java.lang.String r1 = "payload"     // Catch:{ Exception -> 0x1336 }
            org.json.JSONObject r4 = r12.getJSONObject(r1)     // Catch:{ Exception -> 0x1336 }
            java.lang.String r3 = "count"     // Catch:{ Exception -> 0x1336 }
            r1 = 10     // Catch:{ Exception -> 0x1336 }
            int r3 = r4.optInt(r3, r1)     // Catch:{ Exception -> 0x1336 }
            r1 = 25     // Catch:{ Exception -> 0x1336 }
            int r12 = java.lang.Math.min(r1, r3)     // Catch:{ Exception -> 0x1336 }
            X.19T r5 = r9.A03     // Catch:{ Exception -> 0x1336 }
            java.lang.String r1 = "load_call_from_db_start"     // Catch:{ Exception -> 0x1336 }
            r4 = 494339437(0x1d77056d, float:3.2692983E-21)     // Catch:{ Exception -> 0x1336 }
            r5.markerPoint(r4, r1)     // Catch:{ Exception -> 0x1336 }
            X.1TD r10 = r9.A00     // Catch:{ Exception -> 0x1336 }
            r3 = 0     // Catch:{ Exception -> 0x1336 }
            r1 = 0     // Catch:{ Exception -> 0x1336 }
            java.util.ArrayList r3 = r10.A09(r1, r3, r12)     // Catch:{ Exception -> 0x1336 }
            java.lang.String r1 = "load_call_from_db_end"     // Catch:{ Exception -> 0x1336 }
            r5.markerPoint(r4, r1)     // Catch:{ Exception -> 0x1336 }
            org.json.JSONArray r5 = X.AnonymousClass8BR.A1A()     // Catch:{ Exception -> 0x1336 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x1336 }
        L_0x12e6:
            boolean r1 = r12.hasNext()     // Catch:{ Exception -> 0x1336 }
            if (r1 == 0) goto L_0x1327     // Catch:{ Exception -> 0x1336 }
            java.lang.Object r4 = r12.next()     // Catch:{ Exception -> 0x1336 }
            X.9Bw r4 = (X.C178119Bw) r4     // Catch:{ Exception -> 0x1336 }
            org.json.JSONObject r10 = X.C17880vN.A15()     // Catch:{ Exception -> 0x1336 }
            X.A0q r3 = r9.A02     // Catch:{ Exception -> 0x1336 }
            X.4cT r1 = r4.A09()     // Catch:{ Exception -> 0x1336 }
            com.whatsapp.jid.UserJid r1 = r1.A01     // Catch:{ Exception -> 0x1336 }
            java.lang.String r3 = r3.A02(r1, r11)     // Catch:{ Exception -> 0x1336 }
            java.lang.String r1 = "contact_id"     // Catch:{ Exception -> 0x1336 }
            r10.put(r1, r3)     // Catch:{ Exception -> 0x1336 }
            X.4cT r1 = r4.A04     // Catch:{ Exception -> 0x1336 }
            boolean r3 = r1.A03     // Catch:{ Exception -> 0x1336 }
            boolean r1 = r4.A0Q()     // Catch:{ Exception -> 0x1336 }
            if (r3 == 0) goto L_0x1313     // Catch:{ Exception -> 0x1336 }
            r3 = 2     // Catch:{ Exception -> 0x1336 }
            goto L_0x1317     // Catch:{ Exception -> 0x1336 }
        L_0x1313:
            r3 = 1     // Catch:{ Exception -> 0x1336 }
            if (r1 == 0) goto L_0x1317     // Catch:{ Exception -> 0x1336 }
            r3 = 3     // Catch:{ Exception -> 0x1336 }
        L_0x1317:
            java.lang.String r1 = "call_event_state"     // Catch:{ Exception -> 0x1336 }
            r10.put(r1, r3)     // Catch:{ Exception -> 0x1336 }
            java.lang.String r1 = "timestamp"     // Catch:{ Exception -> 0x1336 }
            long r3 = r4.A01     // Catch:{ Exception -> 0x1336 }
            r10.put(r1, r3)     // Catch:{ Exception -> 0x1336 }
            r5.put(r10)     // Catch:{ Exception -> 0x1336 }
            goto L_0x12e6     // Catch:{ Exception -> 0x1336 }
        L_0x1327:
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ Exception -> 0x1336 }
            java.lang.String r1 = "call_history_entries"     // Catch:{ Exception -> 0x1336 }
            r3.put(r1, r5)     // Catch:{ Exception -> 0x1336 }
            org.json.JSONObject r9 = X.A3R.A05(r3)     // Catch:{ Exception -> 0x1336 }
            goto L_0x1502     // Catch:{ Exception -> 0x1336 }
            r3 = move-exception
            java.lang.String r1 = "GetCallHistoryRequest/ caught exception"
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ all -> 0x1554 }
            r3 = 5     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Service internal error! get_call_history"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x1345:
            java.lang.String r1 = "toggle_call_video"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8us r5 = r5.A0K     // Catch:{ all -> 0x1554 }
            java.lang.String r4 = "Bad request - toggle_call_video"     // Catch:{ all -> 0x1554 }
            X.1TM r1 = r5.A01     // Catch:{ Exception -> 0x13ff }
            X.0ve r10 = r1.A01     // Catch:{ Exception -> 0x13ff }
            r3 = 6408(0x1908, float:8.98E-42)     // Catch:{ Exception -> 0x13ff }
            X.0vf r1 = X.C18040vf.A02     // Catch:{ Exception -> 0x13ff }
            boolean r1 = X.C18020vd.A05(r1, r10, r3)     // Catch:{ Exception -> 0x13ff }
            if (r1 != 0) goto L_0x1366     // Catch:{ Exception -> 0x13ff }
            r1 = 3     // Catch:{ Exception -> 0x13ff }
            org.json.JSONObject r9 = X.A3R.A06(r9, r1)     // Catch:{ Exception -> 0x13ff }
            goto L_0x1502     // Catch:{ Exception -> 0x13ff }
        L_0x1366:
            java.lang.String r1 = "payload"     // Catch:{ Exception -> 0x13ff }
            org.json.JSONObject r3 = r12.getJSONObject(r1)     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = "call_id"     // Catch:{ Exception -> 0x13ff }
            java.lang.String r9 = r3.getString(r1)     // Catch:{ Exception -> 0x13ff }
            X.A4q r1 = r5.A02     // Catch:{ Exception -> 0x13ff }
            java.lang.String r9 = r1.A02(r11, r9)     // Catch:{ Exception -> 0x13ff }
            X.1HQ r5 = r5.A00     // Catch:{ Exception -> 0x13ff }
            com.whatsapp.voipcalling.CallInfo r10 = r5.BO3()     // Catch:{ Exception -> 0x13ff }
            if (r10 == 0) goto L_0x13f5     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = r10.callId     // Catch:{ Exception -> 0x13ff }
            boolean r1 = r9.equals(r1)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13f5     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = "toggle_video_type"     // Catch:{ Exception -> 0x13ff }
            java.lang.String r9 = r3.optString(r1)     // Catch:{ Exception -> 0x13ff }
            X.6qE r3 = r10.self     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = "turn_on"     // Catch:{ Exception -> 0x13ff }
            boolean r1 = r1.equals(r9)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13c5     // Catch:{ Exception -> 0x13ff }
            X.6qE r1 = r10.getDefaultPeerInfo()     // Catch:{ Exception -> 0x13ff }
            if (r3 == 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            boolean r1 = r1.A0B     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            int r3 = r3.A08     // Catch:{ Exception -> 0x13ff }
            r1 = 6     // Catch:{ Exception -> 0x13ff }
            boolean r1 = X.AnonymousClass000.A1T(r3, r1)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13bf     // Catch:{ Exception -> 0x13ff }
            X.1HR r5 = (X.AnonymousClass1HR) r5     // Catch:{ Exception -> 0x13ff }
            boolean r1 = X.AnonymousClass1HR.A00(r5)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13bb     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = "VoipNative/turnCameraOn skipping as call ended or ending"     // Catch:{ Exception -> 0x13ff }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x13ff }
            goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
        L_0x13bb:
            com.whatsapp.voipcalling.Voip.turnCameraOn()     // Catch:{ Exception -> 0x13ff }
            goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
        L_0x13bf:
            if (r3 != 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            com.whatsapp.voipcalling.Voip.requestVideoUpgrade()     // Catch:{ Exception -> 0x13ff }
            goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
        L_0x13c5:
            java.lang.String r1 = "turn_off"     // Catch:{ Exception -> 0x13ff }
            boolean r1 = r1.equals(r9)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13ef     // Catch:{ Exception -> 0x13ff }
            if (r3 == 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            int r3 = r3.A08     // Catch:{ Exception -> 0x13ff }
            if (r3 == 0) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
            if (r3 == r0) goto L_0x13d8     // Catch:{ Exception -> 0x13ff }
            r1 = 2     // Catch:{ Exception -> 0x13ff }
            if (r3 != r1) goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
        L_0x13d8:
            X.1HR r5 = (X.AnonymousClass1HR) r5     // Catch:{ Exception -> 0x13ff }
            boolean r1 = X.AnonymousClass1HR.A00(r5)     // Catch:{ Exception -> 0x13ff }
            if (r1 == 0) goto L_0x13eb     // Catch:{ Exception -> 0x13ff }
            java.lang.String r1 = "VoipNative/turnCameraOff skipping as call ended or ending"     // Catch:{ Exception -> 0x13ff }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x13ff }
        L_0x13e5:
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ Exception -> 0x13ff }
            goto L_0x1502     // Catch:{ Exception -> 0x13ff }
        L_0x13eb:
            com.whatsapp.voipcalling.Voip.turnCameraOff()     // Catch:{ Exception -> 0x13ff }
            goto L_0x13e5     // Catch:{ Exception -> 0x13ff }
        L_0x13ef:
            org.json.JSONObject r9 = X.A3R.A06(r4, r0)     // Catch:{ Exception -> 0x13ff }
            goto L_0x1502     // Catch:{ Exception -> 0x13ff }
        L_0x13f5:
            java.lang.String r3 = "There is no call with that call id"     // Catch:{ Exception -> 0x13ff }
            r1 = 17     // Catch:{ Exception -> 0x13ff }
            org.json.JSONObject r9 = X.A3R.A06(r3, r1)     // Catch:{ Exception -> 0x13ff }
            goto L_0x1502     // Catch:{ Exception -> 0x13ff }
            r3 = move-exception
            java.lang.String r1 = "ToggleCallVideoRequest/handleRequest Error: "
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r4, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x140b:
            java.lang.String r1 = "get_unread_messages"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8ux r5 = r5.A09     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "payload"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.AnonymousClass8BW.A0w(r1, r12)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "time_limit_ms"     // Catch:{ all -> 0x1554 }
            r3 = 86400000(0x5265c00, double:4.2687272E-316)     // Catch:{ all -> 0x1554 }
            long r3 = r9.optLong(r1, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "contact_id"     // Catch:{ all -> 0x1554 }
            java.lang.String r12 = r9.optString(r1)     // Catch:{ all -> 0x1554 }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x1554 }
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x1448     // Catch:{ all -> 0x1554 }
            X.A0q r9 = r5.A03     // Catch:{ SecurityException -> 0x14a5 }
            X.A4q r1 = r9.A00     // Catch:{ SecurityException -> 0x14a5 }
            java.lang.String r1 = r1.A02(r11, r12)     // Catch:{ SecurityException -> 0x14a5 }
            X.1E7 r1 = X.C19959A0q.A00(r9, r1)     // Catch:{ SecurityException -> 0x14a5 }
            X.1BI r1 = X.C72463Mc.A0g(r1)     // Catch:{ SecurityException -> 0x14a5 }
            X.C173368ux.A00(r5, r1, r10, r3)     // Catch:{ SecurityException -> 0x14a5 }
            goto L_0x1478     // Catch:{ SecurityException -> 0x14a5 }
        L_0x1448:
            X.1Nd r1 = r5.A00     // Catch:{ all -> 0x1554 }
            X.1Nb r12 = r5.A05     // Catch:{ all -> 0x1554 }
            java.util.ArrayList r1 = r1.A0C(r12)     // Catch:{ all -> 0x1554 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x1554 }
        L_0x1454:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x1478     // Catch:{ all -> 0x1554 }
            X.1BI r9 = X.C17880vN.A0Q(r13)     // Catch:{ all -> 0x1554 }
            X.1Co r1 = r5.A01     // Catch:{ all -> 0x1554 }
            boolean r1 = r1.A0B(r9)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x1454     // Catch:{ all -> 0x1554 }
            boolean r1 = r12.A0x(r9)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x1454     // Catch:{ all -> 0x1554 }
            X.1CJ r1 = r5.A02     // Catch:{ all -> 0x1554 }
            boolean r1 = r1.A0Q(r9)     // Catch:{ all -> 0x1554 }
            if (r1 != 0) goto L_0x1454     // Catch:{ all -> 0x1554 }
            X.C173368ux.A00(r5, r9, r10, r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1454     // Catch:{ all -> 0x1554 }
        L_0x1478:
            r1 = 32     // Catch:{ all -> 0x1554 }
            X.C21486Akr.A01(r1, r10)     // Catch:{ all -> 0x1554 }
            org.json.JSONArray r9 = X.AnonymousClass8BR.A1A()     // Catch:{ SecurityException -> 0x14a1 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SecurityException -> 0x14a1 }
        L_0x1485:
            boolean r1 = r10.hasNext()     // Catch:{ SecurityException -> 0x14a1 }
            if (r1 == 0) goto L_0x149c     // Catch:{ SecurityException -> 0x14a1 }
            X.206 r4 = X.C17880vN.A0Y(r10)     // Catch:{ SecurityException -> 0x14a1 }
            X.2Jd r3 = r5.A04     // Catch:{ SecurityException -> 0x14a1 }
            r1 = 0     // Catch:{ SecurityException -> 0x14a1 }
            org.json.JSONObject r1 = r3.A08(r4, r11, r1)     // Catch:{ SecurityException -> 0x14a1 }
            if (r1 == 0) goto L_0x1485     // Catch:{ SecurityException -> 0x14a1 }
            r9.put(r1)     // Catch:{ SecurityException -> 0x14a1 }
            goto L_0x1485     // Catch:{ SecurityException -> 0x14a1 }
        L_0x149c:
            org.json.JSONObject r9 = X.A3R.A05(r9)     // Catch:{ SecurityException -> 0x14a1 }
            goto L_0x1502     // Catch:{ SecurityException -> 0x14a1 }
            r3 = 5
            java.lang.String r1 = "Service internal error! get_unread_messages"
            goto L_0x14ad
            java.lang.String r1 = "requesthandler/get-unread-messages invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1554 }
            r3 = 1     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - send_message"     // Catch:{ all -> 0x1554 }
        L_0x14ad:
            org.json.JSONObject r9 = X.A3R.A06(r1, r3)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x14b2:
            java.lang.String r1 = "hang_up_call"     // Catch:{ all -> 0x1554 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x1554 }
            if (r1 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8uw r1 = r5.A0L     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = r1.A00(r11, r12)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x14c1:
            if (r15 == 0) goto L_0x14de     // Catch:{ all -> 0x1554 }
            X.8ul r1 = r5.A05     // Catch:{ all -> 0x1554 }
            X.1pE r3 = r1.A00     // Catch:{ Exception -> 0x14d1 }
            java.lang.String r1 = r11.A01     // Catch:{ Exception -> 0x14d1 }
            r3.A00(r1)     // Catch:{ Exception -> 0x14d1 }
            org.json.JSONObject r9 = X.A3R.A04()     // Catch:{ Exception -> 0x14d1 }
            goto L_0x1502     // Catch:{ Exception -> 0x14d1 }
            r3 = move-exception
            java.lang.String r1 = "AnnounceUserOptOutRequest/handleRequest Error revoking access: "
            com.whatsapp.util.Log.e(r1, r3)     // Catch:{ all -> 0x1554 }
            java.lang.String r1 = "Bad request - announce_user_opt_out"     // Catch:{ all -> 0x1554 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1554 }
            goto L_0x1502     // Catch:{ all -> 0x1554 }
        L_0x14de:
            java.lang.String r3 = "Bad request -  no matching action"
            r1 = r18
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ all -> 0x1550 }
            r1 = 3     // Catch:{ all -> 0x1550 }
            r6.markerEnd(r7, r8, r1)     // Catch:{ all -> 0x1550 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1550 }
            java.lang.String r1 = "RequestHandler/handleRequest unhandled action = "     // Catch:{ all -> 0x1550 }
            X.C17900vP.A0g(r1, r2, r3)     // Catch:{ all -> 0x1550 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1550 }
            java.lang.String r1 = "Bad request - "     // Catch:{ all -> 0x1550 }
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r2, r3)     // Catch:{ all -> 0x1550 }
            org.json.JSONObject r9 = X.A3R.A06(r1, r0)     // Catch:{ all -> 0x1550 }
            r16 = 0     // Catch:{ all -> 0x1550 }
        L_0x1502:
            if (r17 == 0) goto L_0x152b     // Catch:{ all -> 0x1550 }
            int r11 = r17.intValue()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r10 = 3     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r5 = "Service internal error! "     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r4 = "fail_reason"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "success"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r1 = r9.getBoolean(r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r1 != 0) goto L_0x1523     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "error_message"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r3 = r9.optString(r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r1 = r3.isEmpty()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r1 != 0) goto L_0x1525     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r5 = r3     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1525     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1523:
            r10 = 2     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1528     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1525:
            r6.markerAnnotate((int) r11, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1528:
            r6.markerEnd(r11, r10)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x152b:
            if (r16 == 0) goto L_0x1531     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r1 = 2     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerEnd(r7, r8, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1531:
            java.lang.String r1 = "error_message"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r4 = r9.optString(r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            boolean r1 = r4.isEmpty()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            if (r1 != 0) goto L_0x006b     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "RequestHandler/handleRequest failed. action="     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.append(r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.append(r2)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = ", error="     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.C17900vP.A0g(r1, r4, r3)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x006b     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r4 = move-exception
            r16 = 0
            goto L_0x1555
            r4 = move-exception
        L_0x1555:
            if (r17 == 0) goto L_0x1566
            int r3 = r17.intValue()     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r2 = "Service internal error! "     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "fail_reason"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerAnnotate((int) r3, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r1 = 3     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerEnd(r3, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1566:
            if (r16 == 0) goto L_0x156c     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r1 = 2     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r6.markerEnd(r7, r8, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x156c:
            throw r4     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x156d:
            r2 = 6     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "This protocol version is no longer supported."     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.9LG r3 = new X.9LG     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.<init>(r2, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1582     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1576:
            r2 = 21     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            java.lang.String r1 = "This version of WhatsApp is no longer supported. Please download the latest version"     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            X.9LG r3 = new X.9LG     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3.<init>(r2, r1)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            goto L_0x1582     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = move-exception     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            monitor-exit(r9)     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
        L_0x1582:
            throw r3     // Catch:{ 9LG -> 0x15a5, all -> 0x1583 }
            r3 = move-exception
            java.lang.String r2 = "Caught unexpected throwable"
            r1 = r18
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x15bb }
            r1 = 3     // Catch:{ Exception -> 0x15bb }
            r6.markerEnd(r7, r8, r1)     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "RequestHandler/handleRequest caught exception handling request"     // Catch:{ Exception -> 0x15bb }
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ Exception -> 0x15bb }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = "Service internal error! "     // Catch:{ Exception -> 0x15bb }
            java.lang.String r2 = X.C17900vP.A0C(r1, r2, r3)     // Catch:{ Exception -> 0x15bb }
            r1 = 5     // Catch:{ Exception -> 0x15bb }
            org.json.JSONObject r9 = X.A3R.A06(r2, r1)     // Catch:{ Exception -> 0x15bb }
            goto L_0x006b     // Catch:{ Exception -> 0x15bb }
            r3 = move-exception     // Catch:{ Exception -> 0x15bb }
            java.lang.String r2 = "Caught request exception"     // Catch:{ Exception -> 0x15bb }
            r1 = r18     // Catch:{ Exception -> 0x15bb }
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x15bb }
            r1 = 3     // Catch:{ Exception -> 0x15bb }
            r6.markerEnd(r7, r8, r1)     // Catch:{ Exception -> 0x15bb }
            int r2 = r3.errorCode     // Catch:{ Exception -> 0x15bb }
            java.lang.String r1 = r3.message     // Catch:{ Exception -> 0x15bb }
            org.json.JSONObject r9 = X.A3R.A06(r1, r2)     // Catch:{ Exception -> 0x15bb }
            goto L_0x006b     // Catch:{ Exception -> 0x15bb }
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/request error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x15cb:
            com.whatsapp.instrumentation.api.InstrumentationService r2 = r2.A00
            X.1op r1 = r2.A02
            X.2nF r1 = r1.A00()
            r1.A00()
            android.os.Binder.clearCallingIdentity()
            X.9em r6 = r2.A01     // Catch:{ Exception -> 0x1638 }
            X.11S r1 = r6.A00     // Catch:{ JSONException -> 0x162f }
            r1.A0I()     // Catch:{ JSONException -> 0x162f }
            X.1E8 r4 = r1.A0D     // Catch:{ JSONException -> 0x162f }
            if (r4 == 0) goto L_0x15fa     // Catch:{ JSONException -> 0x162f }
            X.2qe r3 = r6.A02     // Catch:{ JSONException -> 0x162f }
            X.1TM r1 = r3.A01     // Catch:{ JSONException -> 0x162f }
            X.18O r2 = r1.A00     // Catch:{ JSONException -> 0x162f }
            X.18Q r1 = X.AnonymousClass18O.A0o     // Catch:{ JSONException -> 0x162f }
            int r2 = r2.A04(r1)     // Catch:{ JSONException -> 0x162f }
            r1 = 20     // Catch:{ JSONException -> 0x162f }
            if (r2 == r1) goto L_0x1607     // Catch:{ JSONException -> 0x162f }
            boolean r1 = r3.A00(r4)     // Catch:{ JSONException -> 0x162f }
            if (r1 != 0) goto L_0x1607     // Catch:{ JSONException -> 0x162f }
        L_0x15fa:
            java.lang.String r1 = "ServiceState/get-service-state service not enabled for this number"     // Catch:{ JSONException -> 0x162f }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ JSONException -> 0x162f }
            java.lang.String r2 = "Feature is disabled!"     // Catch:{ JSONException -> 0x162f }
            r1 = 3     // Catch:{ JSONException -> 0x162f }
            org.json.JSONObject r5 = X.A3R.A06(r2, r1)     // Catch:{ JSONException -> 0x162f }
            goto L_0x162a     // Catch:{ JSONException -> 0x162f }
        L_0x1607:
            X.1CM r1 = r6.A03     // Catch:{ JSONException -> 0x162f }
            boolean r4 = r1.A04()     // Catch:{ JSONException -> 0x162f }
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x162f }
            java.lang.String r1 = "version"     // Catch:{ JSONException -> 0x162f }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x162f }
            java.lang.String r3 = "enabled"     // Catch:{ JSONException -> 0x162f }
            X.1TM r1 = r6.A01     // Catch:{ JSONException -> 0x162f }
            X.18O r2 = r1.A00     // Catch:{ JSONException -> 0x162f }
            X.18R r1 = X.AnonymousClass18O.A0G     // Catch:{ JSONException -> 0x162f }
            boolean r1 = r2.A09(r1)     // Catch:{ JSONException -> 0x162f }
            r5.put(r3, r1)     // Catch:{ JSONException -> 0x162f }
            java.lang.String r1 = "registered"     // Catch:{ JSONException -> 0x162f }
            r5.put(r1, r4)     // Catch:{ JSONException -> 0x162f }
        L_0x162a:
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x1638 }
            goto L_0x1656     // Catch:{ Exception -> 0x1638 }
            r2 = move-exception     // Catch:{ Exception -> 0x1638 }
            java.lang.String r1 = "Service internal error! "     // Catch:{ Exception -> 0x1638 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x1638 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x1638 }
            throw r0     // Catch:{ Exception -> 0x1638 }
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/getState error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x1648:
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 == r1) goto L_0x1659
        L_0x164d:
            r1 = r47
            r0 = r42
            boolean r0 = super.onTransact(r5, r4, r0, r1)
            return r0
        L_0x1656:
            r42.writeNoException()
        L_0x1659:
            r1 = r42
            r1.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CW.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public AnonymousClass8CW() {
        attachInterface(this, "com.whatsapp.instrumentation.InstrumentationInterface");
    }
}
