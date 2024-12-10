package X;

import com.whatsapp.util.Log;

public abstract class AMB implements C107095Yj {
    public C172758ty A00;
    public boolean A01;
    public AnonymousClass10I A02;
    public final AnonymousClass1PY A03;
    public final AnonymousClass5Y9 A04;

    public void cancel() {
        this.A01 = true;
        C172758ty r0 = this.A00;
        if (r0 != null) {
            r0.cancel(true);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput, com.facebook.graphql.calls.GraphQlCallInput] */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0265, code lost:
        if (r3.length == 0) goto L_0x0267;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5WY A00() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C175148y8
            if (r0 == 0) goto L_0x006a
            r6 = r7
            X.8y8 r6 = (X.C175148y8) r6
            X.9IW r0 = r6.A04
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0067
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState.VERIFIED
        L_0x0012:
            java.lang.String r3 = r0.toString()
            X.C18070vi.A0b(r3)
            X.A7K r4 = X.A7K.A00()
            X.1ch r0 = r6.A05
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            r4.A07(r0, r1)
            boolean r5 = X.AnonymousClass000.A1W(r1)
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "updated_verification"
            X.8Kx r3 = X.C162478Kx.A00(r2, r3, r0)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "description"
            X.8Kx r2 = X.C162478Kx.A00(r2, r1, r0)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "name"
            X.C162478Kx.A01(r2, r1, r0)
            byte[] r1 = r6.A03
            if (r1 == 0) goto L_0x0051
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            java.lang.String r0 = "picture"
            X.C162478Kx.A01(r2, r1, r0)
        L_0x0051:
            java.lang.String r0 = "updated_metadata"
            r3.A06(r2, r0)
            java.lang.String r0 = "update_verification_input"
            X.C108975cc.A0z(r3, r4, r0)
            X.C199610h.A07(r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl.class
            java.lang.String r0 = "NewsletterUpdateVerification"
            X.AIj r0 = X.AIj.A00(r4, r1, r0)
            return r0
        L_0x0067:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState.UNVERIFIED
            goto L_0x0012
        L_0x006a:
            boolean r0 = r7 instanceof X.C175128y6
            if (r0 == 0) goto L_0x009f
            r4 = r7
            X.8y6 r4 = (X.C175128y6) r4
            X.A7K r3 = X.A7K.A00()
            X.1ch r0 = r4.A01
            boolean r2 = X.A7K.A03(r3, r0)
            X.A8r r1 = r4.A03
            com.whatsapp.jid.UserJid r0 = r4.A02
            com.whatsapp.jid.UserJid r0 = r1.A0G(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "user_id"
            r3.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r2)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterChangeOwnerResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterChangeOwnerResponseImpl.class
            java.lang.String r0 = "NewsletterChangeOwner"
            X.AIj r0 = X.AIj.A00(r3, r1, r0)
            return r0
        L_0x009f:
            boolean r0 = r7 instanceof X.C175158y9
            if (r0 == 0) goto L_0x00e9
            r5 = r7
            X.8y9 r5 = (X.C175158y9) r5
            X.A7K r4 = X.A7K.A00()
            X.1ch r0 = r5.A07
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            r4.A07(r0, r1)
            boolean r3 = X.AnonymousClass000.A1W(r1)
            long r0 = r5.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "serverId"
            r4.A07(r0, r1)
            boolean r2 = X.AnonymousClass000.A1W(r1)
            java.lang.Integer r1 = r5.A08
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "limit"
            r4.A05(r1, r0)
        L_0x00d1:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "vote_hash"
            r4.A07(r0, r1)
        L_0x00da:
            X.C199610h.A07(r3)
            X.C199610h.A07(r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.class
            java.lang.String r0 = "NewsletterPollVoterList"
            X.AIj r0 = X.AIj.A00(r4, r1, r0)
            return r0
        L_0x00e9:
            boolean r0 = r7 instanceof X.C175088y2
            if (r0 == 0) goto L_0x012a
            r5 = r7
            X.8y2 r5 = (X.C175088y2) r5
            X.A7K r3 = X.A7K.A00()
            X.9ju r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "description"
            X.8Kx r2 = X.C162478Kx.A00(r4, r1, r0)
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "name"
            X.C162478Kx.A01(r2, r1, r0)
            byte[] r1 = r5.A05
            if (r1 == 0) goto L_0x0113
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            java.lang.String r0 = "picture"
            X.C162478Kx.A01(r2, r1, r0)
        L_0x0113:
            java.lang.String r0 = "metadata"
            X.8Kx r1 = r4.A00()
            r1.A06(r2, r0)
            java.lang.String r0 = "newsletter_input"
            X.C108975cc.A0z(r1, r3, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl.class
            java.lang.String r0 = "NewsletterCreateVerified"
            X.AIj r0 = X.AIj.A00(r3, r1, r0)
            return r0
        L_0x012a:
            boolean r0 = r7 instanceof X.C175118y5
            if (r0 == 0) goto L_0x015f
            r4 = r7
            X.8y5 r4 = (X.C175118y5) r4
            X.A7K r3 = X.A7K.A00()
            X.1ch r0 = r4.A01
            boolean r2 = X.A7K.A03(r3, r0)
            X.A8r r1 = r4.A03
            com.whatsapp.jid.UserJid r0 = r4.A02
            com.whatsapp.jid.UserJid r0 = r1.A0G(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "user_id"
            r3.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r2)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl.class
            java.lang.String r0 = "NewsletterAdminInviteRevoke"
            X.AIj r0 = X.AIj.A00(r3, r1, r0)
            return r0
        L_0x015f:
            boolean r0 = r7 instanceof X.C175108y4
            if (r0 == 0) goto L_0x0194
            r4 = r7
            X.8y4 r4 = (X.C175108y4) r4
            X.A7K r3 = X.A7K.A00()
            X.1ch r0 = r4.A01
            boolean r2 = X.A7K.A03(r3, r0)
            X.A8r r1 = r4.A03
            com.whatsapp.jid.UserJid r0 = r4.A02
            com.whatsapp.jid.UserJid r0 = r1.A0G(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "user_id"
            r3.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r2)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl.class
            java.lang.String r0 = "NewsletterAdminDemote"
            X.AIj r0 = X.AIj.A00(r3, r1, r0)
            return r0
        L_0x0194:
            boolean r0 = r7 instanceof X.C175098y3
            if (r0 == 0) goto L_0x01b1
            r0 = r7
            X.8y3 r0 = (X.C175098y3) r0
            X.A7K r2 = X.A7K.A00()
            X.1ch r0 = r0.A01
            boolean r0 = X.A7K.A03(r2, r0)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl.class
            java.lang.String r0 = "NewsletterAcceptAdminInvite"
            X.AIj r0 = X.AIj.A00(r2, r1, r0)
            return r0
        L_0x01b1:
            boolean r0 = r7 instanceof X.C175168yA
            if (r0 == 0) goto L_0x0225
            r4 = r7
            X.8yA r4 = (X.C175168yA) r4
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput r3 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput
            r3.<init>()
            X.1ch r2 = r4.A04
            if (r2 != 0) goto L_0x01fa
            java.lang.String r1 = r4.A0A
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "key"
            r3.A05(r0, r1)
            X.1i5 r0 = r4.A03
            X.2Dk r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x01db
            X.9Ig r0 = r0.A02
            X.C181509Qt.A00(r0, r3)
        L_0x01db:
            X.A8r r1 = r4.A08
            X.9yl r0 = r4.A07
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r1 = r1.A0F(r3, r0)
        L_0x01e3:
            boolean r0 = r1.A01
            X.C199610h.A07(r0)
            X.A7K r2 = r1.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.class
            java.lang.String r0 = "NewsletterMetadata"
            X.AIj r2 = X.AIj.A00(r2, r1, r0)
            java.lang.String r1 = r4.A09
            java.lang.String r0 = "type"
            r3.A05(r0, r1)
            return r2
        L_0x01fa:
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "key"
            r3.A05(r0, r1)
            X.1CJ r0 = r4.A02
            X.1ci r2 = X.AnonymousClass1CJ.A00(r0, r2)
            boolean r0 = r2 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0223
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x0216
            X.9Ig r0 = r2.A02
            X.C181509Qt.A00(r0, r3)
        L_0x0216:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x01db
            X.A8r r1 = r4.A08
            X.9yl r0 = r4.A07
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r1 = r1.A0E(r2, r3, r0)
            goto L_0x01e3
        L_0x0223:
            r2 = 0
            goto L_0x0216
        L_0x0225:
            boolean r0 = r7 instanceof X.C175078y1
            if (r0 == 0) goto L_0x0236
            X.A7K r2 = X.A7K.A00()
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl.class
            java.lang.String r0 = "NewsletterSubscribed"
            X.AIj r0 = X.AIj.A00(r2, r1, r0)
            return r0
        L_0x0236:
            r3 = r7
            X.8y7 r3 = (X.C175138y7) r3
            X.9ju r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "description"
            X.8Kx r4 = X.C162478Kx.A00(r2, r1, r0)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "name"
            X.C162478Kx.A01(r4, r1, r0)
            byte[] r3 = r3.A05
            if (r3 == 0) goto L_0x0258
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r3, r0)
            java.lang.String r0 = "picture"
            X.C162478Kx.A01(r4, r1, r0)
        L_0x0258:
            X.A7K r2 = X.A7K.A00()
            java.lang.String r0 = "newsletter_input"
            X.C108975cc.A0z(r4, r2, r0)
            if (r3 == 0) goto L_0x0267
            int r1 = r3.length
            r0 = 0
            if (r1 != 0) goto L_0x0268
        L_0x0267:
            r0 = 1
        L_0x0268:
            java.lang.Boolean r1 = X.C108945cZ.A1A(r0)
            java.lang.String r0 = "fetch_image"
            r2.A06(r0, r1)
            java.lang.String r0 = "fetch_preview"
            r2.A06(r0, r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateResponseImpl.class
            java.lang.String r0 = "NewsletterCreate"
            X.AIj r0 = X.AIj.A00(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMB.A00():X.5WY");
    }

    public void A01() {
        boolean z;
        if (!this.A01) {
            if ((this instanceof C175118y5) || (this instanceof C175108y4) || (this instanceof C175098y3)) {
                z = true;
            } else {
                z = false;
            }
            AnonymousClass10I r3 = this.A02;
            if (z) {
                String A0x = C108955ca.A0x(this);
                C18070vi.A0X(A0x);
                r3.CGL(new C21356Ail(this, 28), A0x);
                return;
            }
            r3.CGF(new C21356Ail(this, 29));
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields] */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl, X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields] */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl, X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields] */
    /* JADX WARNING: type inference failed for: r0v93, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0305, code lost:
        if (r1 != 3) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f0, code lost:
        X.C18070vi.A0d(r5, 0);
        r5.A02 = X.C179509Ig.GUEST;
        r7.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015f, code lost:
        if (r13 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C20125A8k r17) {
        /*
            r16 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C175148y8
            r5 = r17
            if (r0 == 0) goto L_0x008c
            X.8y8 r3 = (X.C175148y8) r3
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_update_verification"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl$Xwa2NewsletterUpdateVerification> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUpdateVerificationResponseImpl.Xwa2NewsletterUpdateVerification.class
            X.A8k r0 = r5.A09(r0, r1)
            if (r0 == 0) goto L_0x0088
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r0.<init>(r1)
            X.1ch r5 = X.C20125A8k.A05(r0)
            X.A6V r6 = r3.A06
            X.9IW r2 = r3.A04
            r1 = 1
            int r0 = r2.ordinal()
            if (r0 != r1) goto L_0x0089
            java.lang.Integer r4 = X.AnonymousClass00R.A0Y
        L_0x0034:
            X.00H r0 = r6.A08
            X.1i5 r8 = X.AnonymousClass8BR.A0M(r0)
            X.1CJ r0 = r8.A02
            X.1ci r7 = r0.A0A(r5)
            boolean r0 = r7 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x006b
            X.2Dk r7 = (X.C46162Dk) r7
            if (r7 == 0) goto L_0x006b
            r7.A05 = r2
            android.content.ContentValues r2 = X.C17880vN.A08()
            X.9IW r0 = r7.A05
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "verified"
            r2.put(r0, r1)
            X.9IZ r0 = r7.A0M
            int r0 = r0.value
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "verification_source"
            r2.put(r0, r1)
            X.C32991i5.A01(r2, r7, r8)
        L_0x006b:
            X.00H r0 = r6.A07
            java.lang.Object r0 = r0.get()
            X.A8r r0 = (X.C20131A8r) r0
            r0.A0H(r5)
            X.00H r0 = r6.A04
            java.lang.Object r0 = r0.get()
            X.8yV r0 = (X.C175308yV) r0
            r0.A00(r5, r4)
            X.BAy r0 = r3.A00
        L_0x0083:
            if (r0 == 0) goto L_0x0088
            r0.BzD(r5)
        L_0x0088:
            return
        L_0x0089:
            java.lang.Integer r4 = X.AnonymousClass00R.A0j
            goto L_0x0034
        L_0x008c:
            boolean r0 = r3 instanceof X.C175128y6
            if (r0 == 0) goto L_0x00ba
            X.8y6 r3 = (X.C175128y6) r3
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_change_owner"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterChangeOwnerResponseImpl$Xwa2NewsletterChangeOwner> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterChangeOwnerResponseImpl.Xwa2NewsletterChangeOwner.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r5, r0, r1)
            boolean r0 = X.C20131A8r.A09(r0)
            X.BAy r1 = r3.A00
            if (r0 != 0) goto L_0x00b2
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "Transfer ownership failed"
            X.C175068xw.A00(r1, r0, r2)
            return
        L_0x00b2:
            if (r1 == 0) goto L_0x0088
            X.1ch r0 = r3.A01
            r1.BzD(r0)
            return
        L_0x00ba:
            boolean r0 = r3 instanceof X.C175158y9
            if (r0 == 0) goto L_0x01ad
            X.8y9 r3 = (X.C175158y9) r3
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.util.LinkedHashMap r2 = X.C17880vN.A13()
            java.lang.String r1 = "xwa2_newsletters_poll_voter_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl$Xwa2NewslettersPollVoterList> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.class
            X.A8k r4 = r5.A09(r0, r1)
            if (r4 == 0) goto L_0x01a3
            java.lang.String r1 = "votes"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl$Xwa2NewslettersPollVoterList$Votes> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.class
            X.1IX r0 = r4.A0A(r0, r1)
            if (r0 == 0) goto L_0x01a3
            java.util.Iterator r9 = r0.iterator()
        L_0x00e4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01a3
            X.A8k r5 = X.C108945cZ.A0V(r9)
            java.lang.String r0 = "vote_hash"
            java.lang.String r4 = X.C72453Mb.A0z(r5, r0)
            java.lang.String r1 = "voter_list"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl$Xwa2NewslettersPollVoterList$Votes$VoterList> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.class
            X.A8k r5 = r5.A09(r0, r1)
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl$Xwa2NewslettersPollVoterList$Votes$VoterList$Edges> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.Edges.class
            X.1IX r0 = r5.A0A(r0, r1)
            java.util.ArrayList r5 = X.C108965cb.A0t(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x010c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0198
            X.A8k r6 = X.C108945cZ.A0V(r8)
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl$Xwa2NewslettersPollVoterList$Votes$VoterList$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterPollVoterListResponseImpl.Xwa2NewslettersPollVoterList.Votes.VoterList.Edges.Node.class
            X.A8k r0 = r6.A09(r0, r1)
            java.lang.String r1 = X.C20125A8k.A08(r0)
            r7 = 0
            if (r1 == 0) goto L_0x0196
            java.lang.String r0 = "@lid"
            java.lang.String r1 = X.AnonymousClass8BV.A0s(r1, r0)
        L_0x012b:
            java.lang.String r0 = "action_time"
            java.lang.String r0 = r6.A0F(r0)
            if (r0 == 0) goto L_0x0193
            long r14 = java.lang.Long.parseLong(r0)
        L_0x0137:
            X.1yH r0 = X.AnonymousClass1E2.A01
            X.1E2 r12 = r0.A02(r1)
            if (r12 == 0) goto L_0x010c
            X.1Ln r6 = r3.A06
            com.whatsapp.jid.PhoneUserJid r1 = r6.A0E(r12)
            X.11S r0 = r3.A03
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x010c
            com.whatsapp.jid.PhoneUserJid r1 = r6.A0E(r12)
            if (r1 == 0) goto L_0x0191
            X.1M9 r0 = r3.A04
            X.1E7 r11 = r0.A0E(r1)
            if (r11 == 0) goto L_0x0161
            java.lang.String r13 = r11.A0K()
            if (r13 != 0) goto L_0x0169
        L_0x0161:
            r13 = 0
            if (r11 == 0) goto L_0x0172
            java.lang.String r0 = r11.A0c
            if (r0 == 0) goto L_0x0172
            r13 = r0
        L_0x0169:
            X.9se r10 = new X.9se
            r10.<init>(r11, r12, r13, r14)
            r5.add(r10)
            goto L_0x010c
        L_0x0172:
            com.whatsapp.jid.PhoneUserJid r1 = r6.A0E(r12)
            if (r1 == 0) goto L_0x018f
            X.1M9 r0 = r3.A04
            X.1E7 r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x018f
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x018f
            X.1Me r0 = r3.A05
            java.lang.String r13 = r0.A0I(r1)
            if (r13 == 0) goto L_0x018f
            goto L_0x0169
        L_0x018f:
            r11 = r7
            goto L_0x0169
        L_0x0191:
            r11 = 0
            goto L_0x0161
        L_0x0193:
            r14 = 0
            goto L_0x0137
        L_0x0196:
            r1 = r7
            goto L_0x012b
        L_0x0198:
            r0 = 36
            java.util.List r0 = X.C21486Akr.A00(r5, r0)
            r2.put(r4, r0)
            goto L_0x00e4
        L_0x01a3:
            X.BB1 r1 = r3.A00
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = r3.A09
            r1.C7h(r0, r2)
            return
        L_0x01ad:
            boolean r0 = r3 instanceof X.C175088y2
            if (r0 == 0) goto L_0x01eb
            X.8y2 r3 = (X.C175088y2) r3
            r6 = 0
            X.C18070vi.A0d(r5, r6)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_create_verified"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl$Xwa2NewsletterCreateVerified> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateVerifiedResponseImpl.Xwa2NewsletterCreateVerified.class
            X.A8k r0 = r5.A09(r0, r1)
            if (r0 == 0) goto L_0x0088
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r0.<init>(r1)
            X.1ch r4 = X.C20125A8k.A05(r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.A8r r1 = r3.A03
            X.2Dk r0 = r1.A0D(r0, r4, r6)
            r2.add(r0)
            X.1i5 r0 = r3.A02
            r0.A0A(r2)
            r1.A0I(r2)
            X.BAy r0 = r3.A00
            r0.BzD(r4)
            return
        L_0x01eb:
            boolean r0 = r3 instanceof X.C175118y5
            if (r0 == 0) goto L_0x0219
            X.8y5 r3 = (X.C175118y5) r3
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_admin_invite_revoke"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl$Xwa2NewsletterAdminInviteRevoke> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteRevokeResponseImpl.Xwa2NewsletterAdminInviteRevoke.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r5, r0, r1)
            boolean r0 = X.C20131A8r.A09(r0)
            X.BAy r1 = r3.A00
            if (r0 != 0) goto L_0x0211
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "Revoking failed"
            X.C175068xw.A00(r1, r0, r2)
            return
        L_0x0211:
            if (r1 == 0) goto L_0x0088
            X.1ch r0 = r3.A01
            r1.BzD(r0)
            return
        L_0x0219:
            boolean r0 = r3 instanceof X.C175108y4
            if (r0 == 0) goto L_0x0247
            X.8y4 r3 = (X.C175108y4) r3
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_admin_demote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl$Xwa2NewsletterAdminDemote> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminDemoteResponseImpl.Xwa2NewsletterAdminDemote.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r5, r0, r1)
            boolean r0 = X.C20131A8r.A09(r0)
            X.BAy r1 = r3.A00
            if (r0 != 0) goto L_0x023f
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "Demote failed"
            X.C175068xw.A00(r1, r0, r2)
            return
        L_0x023f:
            if (r1 == 0) goto L_0x0088
            X.1ch r0 = r3.A01
            r1.BzD(r0)
            return
        L_0x0247:
            boolean r0 = r3 instanceof X.C175098y3
            if (r0 == 0) goto L_0x0275
            X.8y3 r3 = (X.C175098y3) r3
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_admin_invite_accept"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl$Xwa2NewsletterAdminInviteAccept> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAcceptAdminInviteResponseImpl.Xwa2NewsletterAdminInviteAccept.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r5, r0, r1)
            boolean r0 = X.C20131A8r.A09(r0)
            X.BAy r1 = r3.A00
            if (r0 != 0) goto L_0x026d
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "Invitation accept failed"
            X.C175068xw.A00(r1, r0, r2)
            return
        L_0x026d:
            if (r1 == 0) goto L_0x0088
            X.1ch r0 = r3.A01
            r1.BzD(r0)
            return
        L_0x0275:
            boolean r0 = r3 instanceof X.C175168yA
            if (r0 == 0) goto L_0x031b
            X.8yA r3 = (X.C175168yA) r3
            r7 = 0
            X.C18070vi.A0d(r5, r7)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl$Xwa2Newsletter> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.Xwa2Newsletter.class
            X.A8k r0 = r5.A09(r0, r1)
            if (r0 == 0) goto L_0x0088
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r6 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r6.<init>(r0)
            X.A8r r4 = r3.A08
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r6.BZb()
            r5 = 0
            if (r0 == 0) goto L_0x02d3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.Baq()
        L_0x02a1:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.SUSPENDED
            if (r1 == r0) goto L_0x02d5
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 == r0) goto L_0x02d5
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 == r0) goto L_0x02d5
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.NON_EXISTING
            if (r1 == r0) goto L_0x02d5
            X.1ch r5 = X.C20125A8k.A05(r6)
            X.2Dk r2 = r4.A0D(r6, r5, r7)
            r0 = 1
            X.2Dk[] r0 = new X.C46162Dk[r0]
            r0[r7] = r2
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A05(r0)
            X.1i5 r0 = r3.A03
            r0.A0A(r1)
            r4.A0I(r1)
            X.2lA r0 = r3.A05
            r0.A00(r2)
            X.BAy r0 = r3.A00
            goto L_0x0083
        L_0x02d3:
            r1 = r5
            goto L_0x02a1
        L_0x02d5:
            X.1ch r4 = r3.A04
            if (r4 == 0) goto L_0x02ef
            X.1i5 r2 = r3.A03
            X.1md r0 = r3.A06
            X.9oP r1 = new X.9oP
            r1.<init>(r2, r4, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r6.BZb()
            if (r0 == 0) goto L_0x02ec
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r5 = r0.Baq()
        L_0x02ec:
            r1.A01(r5)
        L_0x02ef:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r6.BZb()
            if (r0 == 0) goto L_0x0307
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.Baq()
            if (r0 == 0) goto L_0x0307
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0318
            r0 = 3
            r2 = 451(0x1c3, float:6.32E-43)
            if (r1 == r0) goto L_0x0308
        L_0x0307:
            r2 = 0
        L_0x0308:
            X.BAy r1 = r3.A00
            if (r1 == 0) goto L_0x0088
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r6.BZb()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C175068xw.A00(r1, r0, r2)
            return
        L_0x0318:
            r2 = 423(0x1a7, float:5.93E-43)
            goto L_0x0308
        L_0x031b:
            boolean r0 = r3 instanceof X.C175078y1
            if (r0 == 0) goto L_0x0413
            X.8y1 r3 = (X.C175078y1) r3
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences$Editor r4 = X.C19830z4.A00(r0)
            java.lang.String r1 = "newsletter_subscriptions_fetched"
            r0 = 1
            X.C17880vN.A1F(r4, r1, r0)
            X.1i5 r9 = r3.A01
            java.util.List r10 = r9.A04()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r1 = "xwa2_newsletter_subscribed"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl$Xwa2NewsletterSubscribed> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribedResponseImpl.Xwa2NewsletterSubscribed.class
            X.1IX r0 = r5.A0A(r0, r1)
            r6 = 0
            if (r0 == 0) goto L_0x03bb
            java.util.Iterator r7 = r0.iterator()
        L_0x034e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03bb
            X.A8k r0 = X.C108945cZ.A0V(r7)
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r4 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r4.<init>(r0)
            X.1ch r5 = X.C20125A8k.A05(r4)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r4.BZb()
            if (r0 == 0) goto L_0x03b9
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r0.Baq()
        L_0x036d:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.DELETED
            if (r1 != r0) goto L_0x03a9
            java.util.Iterator r4 = r10.iterator()
        L_0x0375:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03a7
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r0 = r0.A08()
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 == 0) goto L_0x0375
        L_0x038c:
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x034e
            boolean r0 = r1.A0Q()
            if (r0 == 0) goto L_0x039e
            X.9Ig r0 = X.C179509Ig.GUEST
        L_0x0398:
            r1.A02 = r0
        L_0x039a:
            r0 = 1
            r1.A0A = r0
            goto L_0x034e
        L_0x039e:
            boolean r0 = r1.A0O()
            if (r0 == 0) goto L_0x039a
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED
            goto L_0x0398
        L_0x03a7:
            r1 = r6
            goto L_0x038c
        L_0x03a9:
            X.A8r r0 = r3.A03
            X.2Dk r1 = r0.A0D(r4, r5, r2)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x03b5
            r1.A0C = r2
        L_0x03b5:
            r8.add(r1)
            goto L_0x034e
        L_0x03b9:
            r1 = r6
            goto L_0x036d
        L_0x03bb:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r10.iterator()
        L_0x03c3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03fc
            java.lang.Object r5 = r10.next()
            X.2Dk r5 = (X.C46162Dk) r5
            java.util.Iterator r4 = r8.iterator()
        L_0x03d3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03f0
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r1 = r0.A08()
            X.1BI r0 = r5.A08()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x03d3
            if (r2 != 0) goto L_0x03c3
        L_0x03f0:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.9Ig r0 = X.C179509Ig.GUEST
            r5.A02 = r0
            r7.add(r5)
            goto L_0x03c3
        L_0x03fc:
            r8.addAll(r7)
            r9.A0A(r8)
            X.A8r r0 = r3.A03
            r0.A0I(r8)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0088
            X.1Mn r1 = r3.A02
            java.lang.String r0 = "newsletter_metadata"
            r1.A02(r0, r6)
            return
        L_0x0413:
            X.8y7 r3 = (X.C175138y7) r3
            r4 = 0
            X.C18070vi.A0d(r5, r4)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "xwa2_newsletter_create"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateResponseImpl$Xwa2NewsletterCreate> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterCreateResponseImpl.Xwa2NewsletterCreate.class
            X.A8k r0 = r5.A09(r0, r1)
            if (r0 == 0) goto L_0x0088
            org.json.JSONObject r1 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r0.<init>(r1)
            X.1ch r5 = X.C20125A8k.A05(r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.A8r r1 = r3.A02
            X.2Dk r0 = r1.A0D(r0, r5, r4)
            r2.add(r0)
            X.1i5 r0 = r3.A01
            r0.A0A(r2)
            r1.A0I(r2)
            X.BAy r0 = r3.A00
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMB.A02(X.A8k):void");
    }

    public boolean A04(A6Z a6z) {
        boolean z;
        BB1 bb1;
        Integer num;
        if (this instanceof C175148y8) {
            C175148y8 r5 = (C175148y8) this;
            C18070vi.A0d(a6z, 0);
            Log.e("NewsletterUpdateVerifiedStatusGraphqlHandler/onFailure error");
            if (!r5.A01) {
                if (r5.A04.ordinal() == 1) {
                    num = AnonymousClass00R.A0Y;
                } else {
                    num = AnonymousClass00R.A0j;
                }
                r5.A06.A04(r5.A05, num, C181499Qs.A00(a6z));
                AnonymousClass8BV.A1C(a6z, r5.A00);
            }
            return false;
        }
        if (this instanceof C175128y6) {
            C175128y6 r1 = (C175128y6) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            if (!r1.A01) {
                AnonymousClass8BV.A1C(a6z, r1.A00);
            }
        } else if (this instanceof C175158y9) {
            C175158y9 r4 = (C175158y9) this;
            C18070vi.A0d(a6z, 0);
            if (!r4.A01 && (bb1 = r4.A00) != null) {
                bb1.BtD(r4.A09, C181499Qs.A00(a6z));
            }
            return false;
        } else if (this instanceof C175088y2) {
            C175088y2 r12 = (C175088y2) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            Log.e("NewsletterCreateVerifiedGraphqlHandler/onFailure error");
            if (!r12.A01) {
                r12.A00.onError(C181499Qs.A00(a6z));
                return false;
            }
        } else if (this instanceof C175118y5) {
            C175118y5 r13 = (C175118y5) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            if (!r13.A01) {
                AnonymousClass8BV.A1C(a6z, r13.A00);
                return false;
            }
        } else if (this instanceof C175108y4) {
            C175108y4 r14 = (C175108y4) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            if (!r14.A01) {
                AnonymousClass8BV.A1C(a6z, r14.A00);
                return false;
            }
        } else if (this instanceof C175098y3) {
            C175098y3 r15 = (C175098y3) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            if (!r15.A01) {
                AnonymousClass8BV.A1C(a6z, r15.A00);
                return false;
            }
        } else if (this instanceof C175168yA) {
            C175168yA r6 = (C175168yA) this;
            C18070vi.A0d(a6z, 0);
            if (!r6.A01) {
                C17900vP.A0Y(a6z, "BaseMetadataNewsletterGraphqlJob/onFailure error = ", AnonymousClass000.A10());
                int A002 = A6Z.A00(a6z);
                C29681ch r3 = r6.A04;
                if (r3 != null) {
                    new C192449oP(r6.A03, r3, r6.A06).A00(A002);
                }
                AnonymousClass8BV.A1C(a6z, r6.A00);
            }
            return false;
        } else if (this instanceof C175078y1) {
            C17900vP.A0X(a6z, "GetAllFollowedNewslettersGraphqlHandler/error ", AnonymousClass3MZ.A19(a6z, 0));
            return false;
        } else {
            C175138y7 r16 = (C175138y7) this;
            z = false;
            C18070vi.A0d(a6z, 0);
            Log.e("CreateNewsletterGraphqlJob/onFailure error");
            if (!r16.A01) {
                AnonymousClass8BV.A1C(a6z, r16.A00);
                return false;
            }
        }
        return z;
    }

    public AMB(AnonymousClass1PY r1, AnonymousClass5Y9 r2, AnonymousClass10I r3) {
        this.A02 = r3;
        this.A03 = r1;
        this.A04 = r2;
    }

    public boolean A03() {
        return false;
    }
}
