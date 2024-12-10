package com.whatsapp.newsletterenforcements.client;

import X.AnonymousClass00H;
import X.AnonymousClass442;
import X.AnonymousClass443;
import X.AnonymousClass444;
import X.AnonymousClass445;
import X.AnonymousClass446;
import X.C18070vi;
import X.C20125A8k;
import X.C72453Mb;
import X.C89314cG;
import X.C89324cH;
import X.C89424cR;
import X.C89434cS;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;
import java.util.List;
import org.json.JSONObject;

public final class NewsletterEnforcementsClient {
    public final AnonymousClass00H A00;

    public NewsletterEnforcementsClient(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass445 A01(NewsletterBaseEnforcementDataImpl newsletterBaseEnforcementDataImpl) {
        C89424cR r6;
        C89324cH r0;
        NewsletterBaseEnforcementDataImpl.EnforcementExtraData enforcementExtraData = (NewsletterBaseEnforcementDataImpl.EnforcementExtraData) newsletterBaseEnforcementDataImpl.A09(NewsletterBaseEnforcementDataImpl.EnforcementExtraData.class, "enforcement_extra_data");
        String str = null;
        if (enforcementExtraData != null) {
            r6 = A07(enforcementExtraData);
        } else {
            r6 = null;
        }
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_state");
        GraphQLXWA2AppealReason A002 = A00(newsletterBaseEnforcementDataImpl, graphQLXWA2AppealState);
        String optString = newsletterBaseEnforcementDataImpl.A00.optString("enforcement_id");
        String A0F = newsletterBaseEnforcementDataImpl.A0F("appeal_creation_time");
        GraphQLXWA2EnforcementSource graphQLXWA2EnforcementSource = (GraphQLXWA2EnforcementSource) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2EnforcementSource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_source");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        C18070vi.A0X(graphQLXWA2ViolationCategory);
        if (!(r6 == null || (r0 = r6.A01) == null)) {
            str = r0.A00;
        }
        return new AnonymousClass445(A002, graphQLXWA2AppealState, graphQLXWA2EnforcementSource, graphQLXWA2ViolationCategory, r6, A0F, optString, str, (List) null);
    }

    public static final AnonymousClass444 A02(NewsletterBaseEnforcementDataImpl newsletterBaseEnforcementDataImpl, String str) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_state");
        GraphQLXWA2AppealReason A002 = A00(newsletterBaseEnforcementDataImpl, graphQLXWA2AppealState);
        String optString = newsletterBaseEnforcementDataImpl.A00.optString("enforcement_id");
        String A0F = newsletterBaseEnforcementDataImpl.A0F("appeal_creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        return new AnonymousClass444(A002, graphQLXWA2AppealState, (GraphQLXWA2EnforcementSource) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2EnforcementSource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_source"), graphQLXWA2ViolationCategory, A06(newsletterBaseEnforcementDataImpl, graphQLXWA2ViolationCategory), A0F, optString, str);
    }

    public static final AnonymousClass446 A03(NewsletterBaseEnforcementDataImpl newsletterBaseEnforcementDataImpl, String str) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_state");
        GraphQLXWA2AppealReason A002 = A00(newsletterBaseEnforcementDataImpl, graphQLXWA2AppealState);
        String optString = newsletterBaseEnforcementDataImpl.A00.optString("enforcement_id");
        String A0F = newsletterBaseEnforcementDataImpl.A0F("appeal_creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        return new AnonymousClass446(A002, graphQLXWA2AppealState, (GraphQLXWA2EnforcementSource) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2EnforcementSource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_source"), graphQLXWA2ViolationCategory, A06(newsletterBaseEnforcementDataImpl, graphQLXWA2ViolationCategory), A0F, optString, str, (List) null);
    }

    public static final AnonymousClass442 A04(NewsletterBaseEnforcementDataImpl newsletterBaseEnforcementDataImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_state");
        GraphQLXWA2AppealReason A002 = A00(newsletterBaseEnforcementDataImpl, graphQLXWA2AppealState);
        String A0z = C72453Mb.A0z(newsletterBaseEnforcementDataImpl, "enforcement_id");
        String A0F = newsletterBaseEnforcementDataImpl.A0F("appeal_creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        return new AnonymousClass442(A002, graphQLXWA2AppealState, (GraphQLXWA2EnforcementSource) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2EnforcementSource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_source"), graphQLXWA2ViolationCategory, A06(newsletterBaseEnforcementDataImpl, graphQLXWA2ViolationCategory), A0F, A0z);
    }

    public static final AnonymousClass443 A05(NewsletterBaseEnforcementDataImpl newsletterBaseEnforcementDataImpl) {
        GraphQLXWA2AppealState graphQLXWA2AppealState = (GraphQLXWA2AppealState) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2AppealState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_state");
        GraphQLXWA2AppealReason A002 = A00(newsletterBaseEnforcementDataImpl, graphQLXWA2AppealState);
        String optString = newsletterBaseEnforcementDataImpl.A00.optString("enforcement_id");
        String A0F = newsletterBaseEnforcementDataImpl.A0F("appeal_creation_time");
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = (GraphQLXWA2ViolationCategory) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2ViolationCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_violation_category");
        return new AnonymousClass443(A002, graphQLXWA2AppealState, (GraphQLXWA2EnforcementSource) newsletterBaseEnforcementDataImpl.A0D(GraphQLXWA2EnforcementSource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "enforcement_source"), graphQLXWA2ViolationCategory, A06(newsletterBaseEnforcementDataImpl, graphQLXWA2ViolationCategory), A0F, optString);
    }

    public static final C89424cR A07(NewsletterBaseEnforcementDataImpl.EnforcementExtraData enforcementExtraData) {
        C89314cG r4;
        C89434cS r3;
        String optString;
        C20125A8k A09 = enforcementExtraData.A09(NewsletterBaseEnforcementDataImpl.EnforcementExtraData.AppealExtraData.class, "appeal_extra_data");
        C89324cH r6 = null;
        if (A09 != null) {
            r4 = new C89314cG(A09.A0F("appeal_form_url"));
        } else {
            r4 = null;
        }
        C20125A8k A092 = enforcementExtraData.A09(NewsletterBaseEnforcementDataImpl.EnforcementExtraData.IpViolationReportData.class, "ip_violation_report_data");
        if (A092 != null) {
            JSONObject jSONObject = A092.A00;
            String optString2 = jSONObject.optString("report_fbid");
            C18070vi.A0X(optString2);
            String optString3 = jSONObject.optString("reporter_name");
            C18070vi.A0X(optString3);
            String optString4 = jSONObject.optString("reporter_email");
            C18070vi.A0X(optString4);
            String optString5 = jSONObject.optString("appeal_form_url");
            C18070vi.A0X(optString5);
            r3 = new C89434cS(optString2, optString3, optString4, optString5);
        } else {
            r3 = null;
        }
        C20125A8k A093 = enforcementExtraData.A09(NewsletterBaseEnforcementDataImpl.EnforcementExtraData.EnforcementTargetData.class, "enforcement_target_data");
        if (A093 != null) {
            JSONObject jSONObject2 = A093.A00;
            if (jSONObject2.optString("__typename").hashCode() != 699438389) {
                optString = null;
            } else {
                optString = new C20125A8k(jSONObject2).A00.optString("server_msg_id");
            }
            r6 = new C89324cH(optString);
        }
        return new C89424cR(r4, r6, r3);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C29681ch r8, X.C89494cY r9, java.lang.String r10, X.C30391dr r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C100464uY
            if (r0 == 0) goto L_0x00be
            r4 = r11
            X.4uY r4 = (X.C100464uY) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00be
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 != r3) goto L_0x00cc
            java.lang.Object r9 = r4.L$0
            X.4cY r9 = (X.C89494cY) r9
            X.C30691eM.A01(r2)
        L_0x0024:
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "xwa2_create_channel_enforcement_appeal"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateEnforcementAppealResponseImpl$Xwa2CreateChannelEnforcementAppeal> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateEnforcementAppealResponseImpl.Xwa2CreateChannelEnforcementAppeal.class
            X.A8k r0 = r2.A09(r0, r1)
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r1.<init>(r0)
            boolean r0 = r9 instanceof X.AnonymousClass443
            if (r0 == 0) goto L_0x0043
            X.443 r1 = A05(r1)
        L_0x003d:
            java.lang.String r0 = "null cannot be cast to non-null type T of com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient.createAppeal"
            X.C18070vi.A0z(r1, r0)
            return r1
        L_0x0043:
            boolean r0 = r9 instanceof X.AnonymousClass444
            if (r0 == 0) goto L_0x0050
            X.444 r9 = (X.AnonymousClass444) r9
            java.lang.String r0 = r9.A04
            X.444 r1 = A02(r1, r0)
            goto L_0x003d
        L_0x0050:
            boolean r0 = r9 instanceof X.AnonymousClass446
            if (r0 == 0) goto L_0x005d
            X.446 r9 = (X.AnonymousClass446) r9
            java.lang.String r0 = r9.A07
            X.446 r1 = A03(r1, r0)
            goto L_0x003d
        L_0x005d:
            boolean r0 = r9 instanceof X.AnonymousClass445
            if (r0 == 0) goto L_0x0066
            X.445 r1 = A01(r1)
            goto L_0x003d
        L_0x0066:
            boolean r0 = r9 instanceof X.AnonymousClass442
            if (r0 == 0) goto L_0x00c5
            X.442 r1 = A04(r1)
            goto L_0x003d
        L_0x006f:
            X.C30691eM.A01(r2)
            java.lang.String r2 = r9.A06()
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            X.A7K r6 = new X.A7K
            r6.<init>()
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = "channel_id"
            r6.A07(r0, r1)
            boolean r1 = X.AnonymousClass000.A1W(r1)
            java.lang.String r0 = "enforcement_id"
            r6.A07(r0, r2)
            java.lang.String r0 = "reason"
            r6.A07(r0, r10)
            boolean r0 = X.AnonymousClass000.A1W(r10)
            X.C199610h.A07(r1)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateEnforcementAppealResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateEnforcementAppealResponseImpl.class
            java.lang.String r0 = "NewsletterCreateEnforcementAppeal"
            X.AIj r1 = new X.AIj
            r1.<init>(r6, r2, r0)
            X.00H r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.4Pr r0 = (X.C85984Pr) r0
            r4.L$0 = r9
            r4.label = r3
            java.lang.Object r2 = r0.A00(r1, r4)
            if (r2 != r5) goto L_0x0024
            return r5
        L_0x00be:
            X.4uY r4 = new X.4uY
            r4.<init>(r7, r11)
            goto L_0x0012
        L_0x00c5:
            r0 = 0
            X.4tL r1 = new X.4tL
            r1.<init>(r0)
            throw r1
        L_0x00cc:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient.A08(X.1ch, X.4cY, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v11, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: type inference failed for: r0v40, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea A[LOOP:1: B:32:0x00e4->B:34:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[LOOP:2: B:36:0x0107->B:38:0x010d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C29681ch r13, X.C30391dr r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C100024tq
            if (r0 == 0) goto L_0x00d2
            r5 = r14
            X.4tq r5 = (X.C100024tq) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d2
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x00a0
            if (r0 != r4) goto L_0x01d1
            X.C30691eM.A01(r2)
        L_0x0020:
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "xwa2_channel_enforcements"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.class
            X.A8k r2 = r2.A09(r0, r1)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "suspensions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$Suspensions> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.Suspensions.class
            X.1IX r0 = r2.A0A(r0, r1)
            if (r0 == 0) goto L_0x00d9
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r0.iterator()
        L_0x0043:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.A8k r0 = (X.C20125A8k) r0
            X.C18070vi.A0b(r0)
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r3.<init>(r0)
            java.lang.String r1 = "enforcement_extra_data"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl$EnforcementExtraData> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl.EnforcementExtraData.class
            X.A8k r3 = r3.A09(r0, r1)
            if (r3 == 0) goto L_0x009c
            java.lang.String r1 = "ip_violation_report_data"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl$EnforcementExtraData$IpViolationReportData> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl.EnforcementExtraData.IpViolationReportData.class
            X.A8k r0 = r3.A09(r0, r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = "enforcement_target_data"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl$EnforcementExtraData$EnforcementTargetData> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl.EnforcementExtraData.EnforcementTargetData.class
            X.A8k r1 = r3.A09(r0, r1)
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "__typename"
            org.json.JSONObject r3 = r1.A00
            java.lang.String r0 = r3.optString(r0)
            int r1 = r0.hashCode()
            r0 = 699438389(0x29b09535, float:7.8418534E-14)
            if (r1 != r0) goto L_0x009c
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl$EnforcementExtraData$EnforcementTargetData$InlineXWA2ChannelServerMsgData r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl$EnforcementExtraData$EnforcementTargetData$InlineXWA2ChannelServerMsgData
            r0.<init>(r3)
            java.lang.String r1 = "server_msg_id"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            if (r0 == 0) goto L_0x009c
            r4.add(r6)
            goto L_0x0043
        L_0x009c:
            r5.add(r6)
            goto L_0x0043
        L_0x00a0:
            X.C30691eM.A01(r2)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r1 = r13.getRawString()
            java.lang.String r0 = "channel_id"
            r3.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.class
            java.lang.String r0 = "NewsletterEnforcements"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.00H r0 = r12.A00
            java.lang.Object r0 = r0.get()
            X.4Pr r0 = (X.C85984Pr) r0
            r5.label = r4
            java.lang.Object r2 = r0.A00(r1, r5)
            if (r2 != r6) goto L_0x0020
            return r6
        L_0x00d2:
            X.4tq r5 = new X.4tq
            r5.<init>(r12, r14)
            goto L_0x0012
        L_0x00d9:
            X.0wS r5 = X.C18460wS.A00
            r4 = r5
        L_0x00dc:
            java.util.ArrayList r7 = X.C29351c6.A0E(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x00e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r3.next()
            X.A8k r0 = (X.C20125A8k) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r0.<init>(r1)
            X.443 r0 = A05(r0)
            r7.add(r0)
            goto L_0x00e4
        L_0x00ff:
            java.util.ArrayList r10 = X.C29351c6.A0E(r4)
            java.util.Iterator r3 = r4.iterator()
        L_0x0107:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r3.next()
            X.A8k r0 = (X.C20125A8k) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r0.<init>(r1)
            X.445 r0 = A01(r0)
            r10.add(r0)
            goto L_0x0107
        L_0x0122:
            java.lang.String r1 = "violating_messages"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$ViolatingMessages> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.ViolatingMessages.class
            X.1IX r0 = r2.A0A(r0, r1)
            if (r0 == 0) goto L_0x015d
            java.util.ArrayList r9 = X.C29351c6.A0E(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0134:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r3 = r4.next()
            X.A8k r3 = (X.C20125A8k) r3
            java.lang.String r1 = "base_enforcement_data"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$ViolatingMessages$BaseEnforcementData> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.ViolatingMessages.BaseEnforcementData.class
            X.A8k r0 = r3.A09(r0, r1)
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r1.<init>(r0)
            java.lang.String r0 = "server_msg_id"
            java.lang.String r0 = X.C72453Mb.A0z(r3, r0)
            X.446 r0 = A03(r1, r0)
            r9.add(r0)
            goto L_0x0134
        L_0x015d:
            X.0wS r9 = X.C18460wS.A00
        L_0x015f:
            java.lang.String r1 = "geosuspensions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$Geosuspensions> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.Geosuspensions.class
            X.1IX r0 = r2.A0A(r0, r1)
            if (r0 == 0) goto L_0x019a
            java.util.ArrayList r8 = X.C29351c6.A0E(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0171:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r3 = r4.next()
            X.A8k r3 = (X.C20125A8k) r3
            java.lang.String r1 = "base_enforcement_data"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$Geosuspensions$BaseEnforcementData> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.Geosuspensions.BaseEnforcementData.class
            X.A8k r0 = r3.A09(r0, r1)
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r1.<init>(r0)
            java.lang.String r0 = "country_code"
            java.lang.String r0 = X.C72453Mb.A0z(r3, r0)
            X.444 r0 = A02(r1, r0)
            r8.add(r0)
            goto L_0x0171
        L_0x019a:
            X.0wS r8 = X.C18460wS.A00
        L_0x019c:
            java.lang.String r1 = "profile_picture_deletions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl$Xwa2ChannelEnforcements$ProfilePictureDeletions> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterEnforcementsResponseImpl.Xwa2ChannelEnforcements.ProfilePictureDeletions.class
            X.1IX r0 = r2.A0A(r0, r1)
            if (r0 == 0) goto L_0x01c9
            java.util.ArrayList r11 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r2.next()
            X.A8k r0 = (X.C20125A8k) r0
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterBaseEnforcementDataImpl
            r0.<init>(r1)
            X.442 r0 = A04(r0)
            r11.add(r0)
            goto L_0x01ae
        L_0x01c9:
            X.0wS r11 = X.C18460wS.A00
        L_0x01cb:
            X.4VA r6 = new X.4VA
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x01d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient.A09(X.1ch, X.1dr):java.lang.Object");
    }

    public static GraphQLXWA2AppealReason A00(C20125A8k a8k, Object obj) {
        C18070vi.A0X(obj);
        return (GraphQLXWA2AppealReason) a8k.A0D(GraphQLXWA2AppealReason.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "appeal_reason");
    }

    public static C89424cR A06(C20125A8k a8k, Object obj) {
        C18070vi.A0X(obj);
        NewsletterBaseEnforcementDataImpl.EnforcementExtraData enforcementExtraData = (NewsletterBaseEnforcementDataImpl.EnforcementExtraData) a8k.A09(NewsletterBaseEnforcementDataImpl.EnforcementExtraData.class, "enforcement_extra_data");
        if (enforcementExtraData != null) {
            return A07(enforcementExtraData);
        }
        return null;
    }
}
