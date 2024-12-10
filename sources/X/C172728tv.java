package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8tv  reason: invalid class name and case insensitive filesystem */
public final class C172728tv extends BaseMexCallback {
    public final A1E A00;
    public final UserJid A01;

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018e, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0191, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C20125A8k r24) {
        /*
            r23 = this;
            r9 = 0
            r2 = r24
            X.C18070vi.A0d(r2, r9)
            java.lang.String r1 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bizintegrity.BizIntegrityQueryResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.bizintegrity.BizIntegrityQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r2.A0A(r0, r1)
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = X.C29431cG.A0b(r0)
            X.A8k r0 = (X.C20125A8k) r0
            if (r0 == 0) goto L_0x01a2
            r12 = r23
            com.whatsapp.jid.UserJid r11 = r12.A01
            java.lang.String r8 = "jid"
            org.json.JSONObject r3 = r0.A00
            java.lang.String r0 = r3.optString(r8)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BR.A0X(r0)
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 == 0) goto L_0x01a2
            int r1 = X.AnonymousClass8BT.A03(r3)
            r0 = -464557285(0xffffffffe44f6b1b, float:-1.5304775E22)
            if (r1 != r0) goto L_0x01a2
            com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl r2 = new com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl
            r2.<init>(r3)
            java.lang.String r1 = "integrity_signals_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl$IntegritySignalsInfo> r0 = com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl.IntegritySignalsInfo.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x01a2
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 1348702766(0x5063922e, float:1.52720323E10)
            if (r1 != r0) goto L_0x01a2
            com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl$IntegritySignalsInfo$InlineXWA2IntegritySignals r0 = new com.whatsapp.infra.graphql.generated.bizintegrity.IntegrityFieldsImpl$IntegritySignalsInfo$InlineXWA2IntegritySignals
            r0.<init>(r2)
            java.lang.String r7 = "dhash"
            java.lang.String r20 = r0.A0F(r7)
            java.lang.String r6 = "fb_linked_page_number_of_likes"
            org.json.JSONObject r2 = r0.A00
            int r1 = r2.optInt(r6)
            java.lang.Long r17 = X.C17880vN.A0n(r1)
            java.lang.String r1 = "ig_linked_age_number_of_followers"
            int r1 = r2.optInt(r1)
            java.lang.Long r18 = X.C17880vN.A0n(r1)
            java.lang.String r5 = "is_banned"
            boolean r1 = r0.A0G(r5)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            java.lang.String r4 = "is_suspicious"
            boolean r1 = r0.A0G(r4)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "join_date_ms"
            java.lang.String r1 = r0.A0F(r3)
            if (r1 == 0) goto L_0x0170
            long r1 = java.lang.Long.parseLong(r1)
        L_0x0092:
            java.lang.Long r19 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "phone_country_code"
            java.lang.String r21 = r0.A0F(r2)
            com.whatsapp.infra.graphql.generated.bizintegrity.enums.GraphQLWABizTrustTier r10 = com.whatsapp.infra.graphql.generated.bizintegrity.enums.GraphQLWABizTrustTier.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "trust_tier"
            java.lang.Enum r0 = r0.A0E(r10, r1)
            java.lang.String r22 = java.lang.String.valueOf(r0)
            X.9tc r0 = new X.9tc
            r13 = r0
            r14 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.A1E r13 = r12.A00
            X.9aH r14 = r13.A02
            com.whatsapp.jid.UserJid r12 = r0.A00
            X.0ve r15 = r14.A01
            r11 = 11064(0x2b38, float:1.5504E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r10 = X.C18020vd.A05(r10, r15, r11)
            if (r10 == 0) goto L_0x01a2
            X.1M9 r10 = r14.A00
            X.1E7 r10 = r10.A0E(r12)
            if (r10 == 0) goto L_0x01a2
            boolean r10 = r10.A0G()
            if (r10 == 0) goto L_0x01a2
            java.util.concurrent.ConcurrentHashMap r14 = r13.A06
            boolean r10 = r14.containsKey(r12)
            if (r10 != 0) goto L_0x00da
            r13.A01(r12)
        L_0x00da:
            java.lang.Object r10 = r14.get(r12)
            X.9tc r10 = (X.C195609tc) r10
            r16 = 1
            if (r10 == 0) goto L_0x00ec
            java.lang.String r11 = r10.A08
            java.lang.String r10 = r0.A08
            boolean r16 = X.AnonymousClass8BR.A1T(r11, r10)
        L_0x00ec:
            r14.put(r12, r0)
            X.9CA r11 = r13.A01
            java.lang.String r10 = "BizIntegritySignalsStore/saveBusinessIntegritySignals"
            com.whatsapp.util.Log.i((java.lang.String) r10)
            android.content.ContentValues r10 = X.C17880vN.A08()
            X.1Lx r14 = r11.A00
            com.whatsapp.jid.UserJid r15 = r14.A00(r12)
            java.lang.String r15 = X.C22971Dz.A06(r15)
            if (r15 == 0) goto L_0x0195
            r10.put(r8, r15)
            java.lang.Long r8 = r0.A05
            r10.put(r3, r8)
            java.lang.String r3 = r0.A08
            r10.put(r1, r3)
            java.lang.Boolean r1 = r0.A02
            boolean r1 = X.C72453Mb.A1Y(r1)
            X.C17880vN.A18(r10, r4, r1)
            java.lang.Boolean r1 = r0.A01
            boolean r1 = X.C72453Mb.A1Y(r1)
            X.C17880vN.A18(r10, r5, r1)
            java.lang.String r1 = r0.A06
            r10.put(r7, r1)
            java.lang.String r1 = r0.A07
            r10.put(r2, r1)
            java.lang.String r2 = "ig_linked_page_number_of_followers"
            java.lang.Long r1 = r0.A04
            r10.put(r2, r1)
            java.lang.Long r1 = r0.A03
            r10.put(r6, r1)
            X.9tc r1 = r11.A0I(r12)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0195
            com.whatsapp.jid.UserJid r0 = r14.A00(r12)
            java.lang.String r4 = X.C22971Dz.A06(r0)
            if (r4 != 0) goto L_0x015b
            java.lang.String r0 = "BizIntegritySignalsStore/getBizIntegritySignals/cannot get business integrity signals by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0154:
            X.1Lt r0 = r11.A00
            X.1au r3 = r0.A06()
            goto L_0x0174
        L_0x015b:
            X.1Lt r0 = r11.A00
            X.1au r3 = r0.A06()
            java.lang.String r2 = "wa_biz_integrity_signals"
            java.lang.String r1 = "wa_biz_integrity_signals.jid = ?"
            java.lang.String[] r0 = X.C17880vN.A1a(r4, r9)     // Catch:{ all -> 0x018b }
            X.C24861Ly.A02(r3, r2, r1, r0)     // Catch:{ all -> 0x018b }
            r3.close()
            goto L_0x0154
        L_0x0170:
            r1 = 0
            goto L_0x0092
        L_0x0174:
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "wa_biz_integrity_signals"
            X.C24861Ly.A00(r10, r3, r0)     // Catch:{ all -> 0x0184 }
            r2.A00()     // Catch:{ all -> 0x0184 }
            r2.close()     // Catch:{ all -> 0x018b }
            goto L_0x0192
        L_0x0184:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x018b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0192:
            r3.close()
        L_0x0195:
            if (r16 == 0) goto L_0x01a2
            X.11A r2 = r13.A05
            r1 = 1
            X.AkI r0 = new X.AkI
            r0.<init>(r13, r12, r1)
            r2.A00(r0)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172728tv.A02(X.A8k):void");
    }

    public C172728tv(A1E a1e, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = a1e;
    }

    public boolean A05(A6Z a6z) {
        return false;
    }
}
