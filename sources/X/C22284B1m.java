package X;

import java.util.HashMap;

/* renamed from: X.B1m  reason: case insensitive filesystem */
public final class C22284B1m extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $deliveryCallbackFuture;
    public final /* synthetic */ HashMap $protocolErrors;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C184409au $syncInput;
    public final /* synthetic */ AnonymousClass1UP $uniSyncResultDataHandler;
    public final /* synthetic */ C199239zf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22284B1m(C184409au r2, C199239zf r3, AnonymousClass1UP r4, C26981Ug r5, String str, HashMap hashMap) {
        super(1);
        this.this$0 = r3;
        this.$syncInput = r2;
        this.$protocolErrors = hashMap;
        this.$uniSyncResultDataHandler = r4;
        this.$sessionId = str;
        this.$deliveryCallbackFuture = r5;
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [java.lang.Object, X.9ed] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Object, X.9dG] */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0426, code lost:
        if (r2 != 2) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x045e, code lost:
        if (r3 != 3) goto L_0x0460;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33) {
        /*
            r32 = this;
            r3 = r33
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            r6 = r32
            X.9zf r0 = r6.this$0
            r27 = r0
            X.A8k r3 = (X.C20125A8k) r3
            X.9au r5 = r6.$syncInput
            java.util.HashMap r11 = r6.$protocolErrors
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            java.lang.String r2 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r3.A0A(r0, r2)
            if (r0 == 0) goto L_0x0473
            X.1IZ r26 = r0.iterator()
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
        L_0x0034:
            boolean r0 = r26.hasNext()
            if (r0 == 0) goto L_0x0483
            X.A8k r0 = X.C108945cZ.A0V(r26)
            X.9i3 r4 = new X.9i3
            r4.<init>()
            java.lang.String r7 = "jid"
            org.json.JSONObject r8 = r0.A00
            java.lang.String r0 = r8.optString(r7)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BR.A0X(r0)
            r4.A0D = r0
            com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "username_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo> r0 = com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl.UsernameInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0084
            org.json.JSONObject r2 = r0.A00
            int r3 = X.AnonymousClass8BT.A03(r2)
            r0 = 785443910(0x2ed0ec46, float:9.5007155E-11)
            if (r3 == r0) goto L_0x046c
            r3 = 0
        L_0x006c:
            r13 = 1
            if (r3 == 0) goto L_0x0469
            java.lang.String r0 = "username"
            java.lang.String r0 = r3.A0F(r0)
            r4.A0J = r0
            r9 = 1
        L_0x0078:
            int r3 = X.AnonymousClass8BT.A03(r2)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r3 == r0) goto L_0x0442
            r13 = r9
        L_0x0082:
            r25 = r25 | r13
        L_0x0084:
            com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "reachability_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl$ReachabilityInfo> r0 = com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl.ReachabilityInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x00ad
            org.json.JSONObject r3 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r3)
            r0 = 167055303(0x9f50fc7, float:5.899644E-33)
            if (r2 != r0) goto L_0x00ad
            com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl$ReachabilityInfo$InlineXWA2Reachability r2 = new com.whatsapp.infra.graphql.generated.usync.ReachabilityFieldsImpl$ReachabilityInfo$InlineXWA2Reachability
            r2.<init>(r3)
            java.lang.String r0 = "is_reachable"
            boolean r0 = r2.A0G(r0)
            r4.A0M = r0
            r24 = 1
        L_0x00ad:
            com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "lid_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl$LidInfo> r0 = com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl.LidInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x00f3
            org.json.JSONObject r9 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -951723753(0xffffffffc745d917, float:-50649.09)
            if (r2 != r0) goto L_0x043e
            com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl$LidInfo$InlineXWA2Lid r2 = new com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl$LidInfo$InlineXWA2Lid
            r2.<init>(r9)
            java.lang.String r0 = "lid_jid"
            java.lang.String r2 = r2.A0F(r0)
            X.1yH r0 = X.AnonymousClass1E2.A01
            X.1E2 r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x043e
            r4.A0C = r0
            r23 = 1
        L_0x00de:
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 != r0) goto L_0x00f3
            com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl$LidInfo$InlineXWA2ResponseStatus r3 = new com.whatsapp.infra.graphql.generated.usync.LidFieldsImpl$LidInfo$InlineXWA2ResponseStatus
            r3.<init>(r9)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r2 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            r3.A0E(r2, r0)
        L_0x00f3:
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "about_status_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo> r0 = com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl.AboutStatusInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0139
            org.json.JSONObject r10 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r10)
            r0 = 1477240943(0x580ce86f, float:6.1971969E14)
            if (r2 == r0) goto L_0x0437
            r2 = 0
        L_0x010e:
            r9 = 1
            if (r2 == 0) goto L_0x0434
            java.lang.String r0 = "text"
            java.lang.String r0 = r2.A0F(r0)
            r4.A0H = r0
            java.lang.String r0 = "timestamp"
            java.lang.String r0 = r2.A0F(r0)
            if (r0 == 0) goto L_0x0430
            long r2 = java.lang.Long.parseLong(r0)
        L_0x0125:
            r12 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r12
            r4.A08 = r2
            r4.A03 = r9
            r3 = 1
        L_0x012d:
            int r2 = X.AnonymousClass8BT.A03(r10)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 == r0) goto L_0x040a
            r9 = r3
        L_0x0137:
            r22 = r22 | r9
        L_0x0139:
            com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "picture_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl$PictureInfo> r0 = com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl.PictureInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0179
            org.json.JSONObject r10 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r10)
            r0 = -720164095(0xffffffffd5132b01, float:-1.01133069E13)
            if (r2 == r0) goto L_0x0403
            r2 = 0
        L_0x0154:
            r13 = -1
            r9 = 1
            if (r2 == 0) goto L_0x0400
            java.lang.String r0 = "direct_path"
            java.lang.String r0 = r2.A0F(r0)
            r4.A0E = r0
            java.lang.String r0 = X.C20125A8k.A08(r2)
            if (r0 == 0) goto L_0x03fd
            int r0 = java.lang.Integer.parseInt(r0)
        L_0x016a:
            r4.A02 = r0
            r3 = 1
        L_0x016d:
            int r2 = X.AnonymousClass8BT.A03(r10)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 == r0) goto L_0x039a
            r9 = r3
        L_0x0177:
            r21 = r21 | r9
        L_0x0179:
            int r2 = X.AnonymousClass8BT.A03(r8)
            r0 = 561612603(0x2179873b, float:8.454346E-19)
            if (r2 != r0) goto L_0x01b4
            com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "disappearing_mode_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl$DisappearingModeInfo> r0 = com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl.DisappearingModeInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x01b4
            org.json.JSONObject r9 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -1850934510(0xffffffff91acfb12, float:-2.729155E-28)
            if (r2 == r0) goto L_0x0378
            r10 = 0
        L_0x019d:
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 != r0) goto L_0x01b2
            com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl$DisappearingModeInfo$InlineXWA2ResponseStatus r3 = new com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl$DisappearingModeInfo$InlineXWA2ResponseStatus
            r3.<init>(r9)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r2 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            r3.A0E(r2, r0)
        L_0x01b2:
            r20 = r20 | r10
        L_0x01b4:
            int r2 = X.AnonymousClass8BT.A03(r8)
            r0 = -464557285(0xffffffffe44f6b1b, float:-1.5304775E22)
            if (r2 != r0) goto L_0x01f1
            com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "business_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo> r0 = com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl.BusinessInfo.class
            X.A8k r3 = r3.A09(r0, r2)
            com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo r3 = (com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl.BusinessInfo) r3
            if (r3 == 0) goto L_0x01f1
            org.json.JSONObject r12 = r3.A00
            int r2 = X.AnonymousClass8BT.A03(r12)
            r0 = -95673552(0xfffffffffa4c2330, float:-2.6498556E35)
            if (r2 == r0) goto L_0x02f8
            r9 = 0
        L_0x01da:
            int r2 = X.AnonymousClass8BT.A03(r12)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 != r0) goto L_0x01ef
            com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo$InlineXWA2ResponseStatus r3 = new com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo$InlineXWA2ResponseStatus
            r3.<init>(r12)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r2 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            r3.A0E(r2, r0)
        L_0x01ef:
            r18 = r18 | r9
        L_0x01f1:
            com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl r3 = new com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl
            r3.<init>(r8)
            java.lang.String r2 = "devices_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo> r0 = com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl.DevicesInfo.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0223
            org.json.JSONObject r9 = r0.A00
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -484500627(0xffffffffe31f1b6d, float:-2.9350085E21)
            if (r2 == r0) goto L_0x022a
            r8 = 0
        L_0x020c:
            int r2 = X.AnonymousClass8BT.A03(r9)
            r0 = -1731532029(0xffffffff98caeb03, float:-5.2453077E-24)
            if (r2 != r0) goto L_0x0221
            com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2ResponseStatus r3 = new com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2ResponseStatus
            r3.<init>(r9)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r2 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            r3.A0E(r2, r0)
        L_0x0221:
            r19 = r19 | r8
        L_0x0223:
            r0 = r17
            r0.add(r4)
            goto L_0x0034
        L_0x022a:
            com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2Devices r3 = new com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2Devices
            r3.<init>(r9)
            java.lang.String r2 = "devices"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2Devices$Devices> r0 = com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl.DevicesInfo.InlineXWA2Devices.Devices.class
            X.1IX r0 = r3.A0A(r0, r2)
            r8 = 1
            if (r0 == 0) goto L_0x02aa
            java.util.HashMap r10 = X.C17880vN.A11()
            X.1IZ r15 = r0.iterator()
        L_0x0242:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x029e
            X.A8k r14 = X.C108945cZ.A0V(r15)
            org.json.JSONObject r2 = r14.A00
            java.lang.String r12 = r2.optString(r7)
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r12 = r0.A05(r12)
            java.lang.String r0 = "key_index"
            int r0 = r2.optInt(r0)
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.put(r12, r0)
            java.lang.String r13 = "is_hosted"
            boolean r0 = r2.isNull(r13)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0242
            java.lang.String r2 = r2.optString(r7)
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r0.A05(r2)
            boolean r2 = X.C62832s4.A00(r0)
            boolean r0 = r14.A0G(r13)
            if (r2 == r0) goto L_0x0242
            r0 = r27
            X.190 r12 = r0.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sync; isHosted: "
            r2.append(r0)
            boolean r0 = r14.A0G(r13)
            java.lang.String r2 = X.AnonymousClass3MY.A0r(r2, r0)
            java.lang.String r0 = "invalid-hosted-flag"
            r12.A0G(r0, r2, r1)
            goto L_0x0242
        L_0x029e:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02aa
            r4.A0L = r10
            r4.A00 = r8
        L_0x02aa:
            java.lang.String r2 = "key_index_list_v2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl$DevicesInfo$InlineXWA2Devices$KeyIndexListV2> r0 = com.whatsapp.infra.graphql.generated.usync.DevicesFieldsImpl.DevicesInfo.InlineXWA2Devices.KeyIndexListV2.class
            X.A8k r7 = r3.A09(r0, r2)
            if (r7 == 0) goto L_0x020c
            java.lang.String r10 = "timestamp"
            java.lang.String r0 = r7.A0F(r10)
            if (r0 != 0) goto L_0x02cc
            java.lang.String r0 = "required attribute timestamp missing for keyIndexListV2"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = r27
            X.190 r3 = r0.A00
            java.lang.String r2 = "key-index-timestamp-null"
            java.lang.String r0 = "sync"
            r3.A0G(r2, r0, r1)
        L_0x02cc:
            java.lang.String r0 = r7.A0F(r10)
            if (r0 == 0) goto L_0x02da
            r4.A00 = r8
            long r2 = java.lang.Long.parseLong(r0)
            r4.A06 = r2
        L_0x02da:
            java.lang.String r0 = "expected_timestamp"
            java.lang.String r0 = r7.A0F(r0)
            if (r0 == 0) goto L_0x02e8
            long r2 = java.lang.Long.parseLong(r0)
            r4.A05 = r2
        L_0x02e8:
            java.lang.String r0 = "payload"
            java.lang.String r0 = r7.A0F(r0)
            if (r0 == 0) goto L_0x020c
            byte[] r0 = X.C197019w1.A01(r0)
            r4.A0O = r0
            goto L_0x020c
        L_0x02f8:
            com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo$InlineXWA2Business r15 = new com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo$InlineXWA2Business
            r15.<init>(r12)
            X.9ed r10 = new X.9ed
            r10.<init>()
            r10.A01 = r3
            com.whatsapp.jid.UserJid r0 = r4.A0D
            r10.A02 = r0
            X.9dG r9 = new X.9dG
            r9.<init>()
            java.lang.String r14 = "verified_name_nullable"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl$BusinessInfo$InlineXWA2Business$VerifiedNameNullable> r2 = com.whatsapp.infra.graphql.generated.usync.BusinessFieldsImpl.BusinessInfo.InlineXWA2Business.VerifiedNameNullable.class
            X.A8k r3 = r15.A09(r2, r14)
            r13 = 0
            if (r3 == 0) goto L_0x0376
            java.lang.String r0 = "cert"
            java.lang.String r0 = r3.A0F(r0)
            if (r0 == 0) goto L_0x0376
            byte[] r0 = X.C108975cc.A1O(r0)
        L_0x0324:
            r9.A02 = r0
            X.A8k r3 = r15.A09(r2, r14)
            if (r3 == 0) goto L_0x0374
            java.lang.String r0 = "verified_level"
            java.lang.String r0 = X.C72453Mb.A0z(r3, r0)
        L_0x0332:
            X.C17960vV.A07(r0)
            int r0 = X.C50402Uh.A00(r0)
            r9.A00 = r0
            X.A8k r3 = r15.A09(r2, r14)
            if (r3 == 0) goto L_0x0371
            java.lang.String r0 = "host_storage"
            java.lang.String r16 = X.C72453Mb.A0z(r3, r0)
        L_0x0347:
            X.A8k r3 = r15.A09(r2, r14)
            if (r3 == 0) goto L_0x036f
            java.lang.String r0 = "actual_actors"
            java.lang.String r3 = X.C72453Mb.A0z(r3, r0)
        L_0x0353:
            X.A8k r2 = r15.A09(r2, r14)
            if (r2 == 0) goto L_0x035f
            java.lang.String r0 = "privacy_mode_ts"
            java.lang.String r13 = r2.A0F(r0)
        L_0x035f:
            X.1ya r2 = new X.1ya
            r0 = r16
            r2.<init>((java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r13)
            r9.A01 = r2
            r10.A00 = r9
            r4.A09 = r10
            r9 = 1
            goto L_0x01da
        L_0x036f:
            r3 = r13
            goto L_0x0353
        L_0x0371:
            r16 = r13
            goto L_0x0347
        L_0x0374:
            r0 = r13
            goto L_0x0332
        L_0x0376:
            r0 = r13
            goto L_0x0324
        L_0x0378:
            com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl$DisappearingModeInfo$InlineXWA2DisappearingMode r2 = new com.whatsapp.infra.graphql.generated.usync.DisappearingModeFieldsImpl$DisappearingModeInfo$InlineXWA2DisappearingMode
            r2.<init>(r9)
            java.lang.String r0 = "duration"
            org.json.JSONObject r2 = r2.A00
            java.lang.String r0 = X.C108955ca.A11(r0, r2)
            int r0 = java.lang.Integer.parseInt(r0)
            r4.A01 = r0
            java.lang.String r0 = "timestamp"
            java.lang.String r0 = X.C108955ca.A11(r0, r2)
            long r2 = java.lang.Long.parseLong(r0)
            r4.A07 = r2
            r10 = 1
            goto L_0x019d
        L_0x039a:
            com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl$PictureInfo$InlineXWA2ResponseStatus r12 = new com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl$PictureInfo$InlineXWA2ResponseStatus
            r12.<init>(r10)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r10 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "status"
            java.lang.Enum r0 = r12.A0E(r10, r3)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r0 = (com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType) r0
            if (r0 == 0) goto L_0x03f8
            int r2 = r0.ordinal()
            if (r2 == r9) goto L_0x03f1
            r0 = 2
            if (r2 == r0) goto L_0x03f1
            r0 = 3
            if (r2 != r0) goto L_0x03f8
            java.util.HashMap r10 = r5.A00
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x03e1
            X.A01 r0 = r5.A01
            java.util.List r2 = r0.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x03e1
            java.util.Iterator r3 = r2.iterator()
        L_0x03cd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03e1
            java.lang.Object r2 = r3.next()
            X.9iB r2 = (X.C188899iB) r2
            com.whatsapp.jid.UserJid r0 = r2.A09
            if (r0 == 0) goto L_0x03cd
            r10.put(r0, r2)
            goto L_0x03cd
        L_0x03e1:
            com.whatsapp.jid.UserJid r0 = r4.A0D
            java.lang.Object r0 = r10.get(r0)
            X.9iB r0 = (X.C188899iB) r0
            if (r0 == 0) goto L_0x0177
            int r0 = r0.A02
            r4.A02 = r0
            goto L_0x0177
        L_0x03f1:
            r4.A02 = r13
            r0 = 0
            r4.A0E = r0
            goto L_0x0177
        L_0x03f8:
            r12.A0E(r10, r3)
            goto L_0x0177
        L_0x03fd:
            r0 = -1
            goto L_0x016a
        L_0x0400:
            r3 = 0
            goto L_0x016d
        L_0x0403:
            com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl$PictureInfo$InlineXWA2PictureURL r2 = new com.whatsapp.infra.graphql.generated.usync.PictureFieldsImpl$PictureInfo$InlineXWA2PictureURL
            r2.<init>(r10)
            goto L_0x0154
        L_0x040a:
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2ResponseStatus r3 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2ResponseStatus
            r3.<init>(r10)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r2 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "status"
            r3.A0E(r2, r0)
            java.lang.Enum r0 = r3.A0E(r2, r0)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r0 = (com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType) r0
            if (r0 == 0) goto L_0x0428
            int r2 = r0.ordinal()
            r0 = 3
            if (r2 == r9) goto L_0x042c
            r0 = 2
            if (r2 == r0) goto L_0x042c
        L_0x0428:
            r4.A03 = r1
            goto L_0x0137
        L_0x042c:
            r4.A03 = r0
            goto L_0x0137
        L_0x0430:
            r2 = 0
            goto L_0x0125
        L_0x0434:
            r3 = 0
            goto L_0x012d
        L_0x0437:
            com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2AboutStatus r2 = new com.whatsapp.infra.graphql.generated.usync.AboutStatusFieldsImpl$AboutStatusInfo$InlineXWA2AboutStatus
            r2.<init>(r10)
            goto L_0x010e
        L_0x043e:
            r23 = 0
            goto L_0x00de
        L_0x0442:
            com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2ResponseStatus r12 = new com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2ResponseStatus
            r12.<init>(r2)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r10 = com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "status"
            java.lang.Enum r0 = r12.A0E(r10, r9)
            com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType r0 = (com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ResponseStatusType) r0
            if (r0 == 0) goto L_0x0460
            int r3 = r0.ordinal()
            r2 = 0
            if (r3 == r13) goto L_0x0465
            r0 = 2
            if (r3 == r0) goto L_0x0465
            r0 = 3
            if (r3 == r0) goto L_0x0082
        L_0x0460:
            r12.A0E(r10, r9)
            goto L_0x0082
        L_0x0465:
            r4.A0J = r2
            goto L_0x0082
        L_0x0469:
            r9 = 0
            goto L_0x0078
        L_0x046c:
            com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2Username r3 = new com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2Username
            r3.<init>(r2)
            goto L_0x006c
        L_0x0473:
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
        L_0x0483:
            java.lang.String r0 = "username"
            java.lang.Object r14 = r11.get(r0)
            X.A00 r14 = (X.A00) r14
            r3 = 0
            if (r25 == 0) goto L_0x049a
            if (r14 == 0) goto L_0x05bb
            java.lang.Long r4 = r14.A02
            java.lang.Integer r2 = r14.A01
        L_0x0494:
            r0 = 1
            X.A00 r14 = new X.A00
            r14.<init>(r2, r4, r0)
        L_0x049a:
            java.lang.String r0 = "reachability"
            java.lang.Object r13 = r11.get(r0)
            X.A00 r13 = (X.A00) r13
            if (r24 == 0) goto L_0x04b0
            if (r13 == 0) goto L_0x05b7
            java.lang.Long r4 = r13.A02
            java.lang.Integer r2 = r13.A01
        L_0x04aa:
            r0 = 1
            X.A00 r13 = new X.A00
            r13.<init>(r2, r4, r0)
        L_0x04b0:
            java.lang.String r0 = "lid"
            java.lang.Object r12 = r11.get(r0)
            X.A00 r12 = (X.A00) r12
            if (r23 == 0) goto L_0x04c6
            if (r12 == 0) goto L_0x05b3
            java.lang.Long r4 = r12.A02
            java.lang.Integer r2 = r12.A01
        L_0x04c0:
            r0 = 1
            X.A00 r12 = new X.A00
            r12.<init>(r2, r4, r0)
        L_0x04c6:
            java.lang.String r0 = "about_status"
            java.lang.Object r10 = r11.get(r0)
            X.A00 r10 = (X.A00) r10
            if (r22 == 0) goto L_0x04dc
            if (r10 == 0) goto L_0x05af
            java.lang.Long r4 = r10.A02
            java.lang.Integer r2 = r10.A01
        L_0x04d6:
            r0 = 1
            X.A00 r10 = new X.A00
            r10.<init>(r2, r4, r0)
        L_0x04dc:
            java.lang.String r0 = "picture"
            java.lang.Object r9 = r11.get(r0)
            X.A00 r9 = (X.A00) r9
            if (r21 == 0) goto L_0x04f2
            if (r9 == 0) goto L_0x05ab
            java.lang.Long r4 = r9.A02
            java.lang.Integer r2 = r9.A01
        L_0x04ec:
            r0 = 1
            X.A00 r9 = new X.A00
            r9.<init>(r2, r4, r0)
        L_0x04f2:
            java.lang.String r0 = "disappearing_mode"
            java.lang.Object r8 = r11.get(r0)
            X.A00 r8 = (X.A00) r8
            if (r20 == 0) goto L_0x0508
            if (r8 == 0) goto L_0x05a7
            java.lang.Long r4 = r8.A02
            java.lang.Integer r2 = r8.A01
        L_0x0502:
            r0 = 1
            X.A00 r8 = new X.A00
            r8.<init>(r2, r4, r0)
        L_0x0508:
            java.lang.String r0 = "devices"
            java.lang.Object r7 = r11.get(r0)
            X.A00 r7 = (X.A00) r7
            if (r19 == 0) goto L_0x051e
            if (r7 == 0) goto L_0x05a3
            java.lang.Long r4 = r7.A02
            java.lang.Integer r2 = r7.A01
        L_0x0518:
            r0 = 1
            X.A00 r7 = new X.A00
            r7.<init>(r2, r4, r0)
        L_0x051e:
            java.lang.String r0 = "business"
            java.lang.Object r5 = r11.get(r0)
            X.A00 r5 = (X.A00) r5
            if (r18 == 0) goto L_0x0534
            if (r5 == 0) goto L_0x05a1
            java.lang.Long r3 = r5.A02
            java.lang.Integer r2 = r5.A01
        L_0x052e:
            r0 = 1
            X.A00 r5 = new X.A00
            r5.<init>(r2, r3, r0)
        L_0x0534:
            X.9i3[] r1 = new X.C188829i3[r1]
            r0 = r17
            java.lang.Object[] r4 = r0.toArray(r1)
            X.9i3[] r4 = (X.C188829i3[]) r4
            java.lang.String r0 = "contact"
            java.lang.Object r15 = r11.get(r0)
            X.A00 r15 = (X.A00) r15
            java.lang.String r0 = "sidelist"
            java.lang.Object r3 = r11.get(r0)
            X.A00 r3 = (X.A00) r3
            java.lang.String r0 = "pay"
            java.lang.Object r2 = r11.get(r0)
            X.A00 r2 = (X.A00) r2
            java.lang.String r0 = "bot"
            java.lang.Object r1 = r11.get(r0)
            X.A00 r1 = (X.A00) r1
            java.lang.String r0 = "text_status"
            java.lang.Object r11 = r11.get(r0)
            X.A00 r11 = (X.A00) r11
            r16 = 0
            X.2n4 r0 = new X.2n4
            r17 = r0
            r18 = r15
            r19 = r3
            r20 = r5
            r21 = r10
            r22 = r9
            r23 = r7
            r24 = r2
            r25 = r8
            r26 = r12
            r27 = r1
            r28 = r14
            r29 = r11
            r30 = r13
            r31 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.2cQ r2 = new X.2cQ
            r2.<init>(r0, r4)
            X.1UP r1 = r6.$uniSyncResultDataHandler
            java.lang.String r0 = r6.$sessionId
            r1.BcR(r2, r0)
            X.1Ug r1 = r6.$deliveryCallbackFuture
            r0 = r16
            r1.BrF(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x05a1:
            r2 = r3
            goto L_0x052e
        L_0x05a3:
            r4 = r3
            r2 = r3
            goto L_0x0518
        L_0x05a7:
            r4 = r3
            r2 = r3
            goto L_0x0502
        L_0x05ab:
            r4 = r3
            r2 = r3
            goto L_0x04ec
        L_0x05af:
            r4 = r3
            r2 = r3
            goto L_0x04d6
        L_0x05b3:
            r4 = r3
            r2 = r3
            goto L_0x04c0
        L_0x05b7:
            r4 = r3
            r2 = r3
            goto L_0x04aa
        L_0x05bb:
            r4 = r3
            r2 = r3
            goto L_0x0494
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22284B1m.invoke(java.lang.Object):java.lang.Object");
    }
}
