package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminInviteResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.jid.UserJid;

/* renamed from: X.43f  reason: invalid class name and case insensitive filesystem */
public final class C821443f extends AMB {
    public C85194Ml A00;
    public final C29681ch A01;
    public final UserJid A02;
    public final C20131A8r A03;

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        C85194Ml r2;
        String optString;
        Long A04;
        C22821Di r4;
        Object r3;
        C20125A8k A09;
        C18070vi.A0d(a8k, 0);
        if (!this.A01) {
            Class<NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate> cls = NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.class;
            C20125A8k A092 = a8k.A09(cls, "xwa2_newsletter_admin_invite_create");
            Enum enumR = null;
            if (!(A092 == null || (A09 = A092.A09(NewsletterAdminInviteResponseImpl.Xwa2NewsletterAdminInviteCreate.State.class, "state")) == null)) {
                enumR = A09.A0D(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }
            if (enumR != GraphQLXWA2NewsletterStateType.ACTIVE) {
                r2 = this.A00;
                if (r2 != null) {
                    new C175068xw("Channel is not active", 0);
                } else {
                    return;
                }
            } else {
                C20125A8k A093 = a8k.A09(cls, "xwa2_newsletter_admin_invite_create");
                if (!(A093 == null || (optString = A093.A00.optString("invite_expiration_time")) == null || (A04 = AnonymousClass1YD.A04(optString)) == null)) {
                    long longValue = A04.longValue() * 1000;
                    if (Long.valueOf(longValue) != null) {
                        C85194Ml r0 = this.A00;
                        if (r0 != null) {
                            r4 = r0.A01;
                            r3 = new C821843p(r0.A00, longValue);
                            r4.invoke(r3);
                        }
                        return;
                    }
                }
                r2 = this.A00;
                if (r2 != null) {
                    new C175058xv("Expiration timestamp is null");
                } else {
                    return;
                }
            }
            r4 = r2.A01;
            r3 = new C821743o(r2.A00);
            r4.invoke(r3);
        }
    }

    public boolean A04(A6Z a6z) {
        C85194Ml r0;
        C18070vi.A0d(a6z, 0);
        if (!this.A01 && (r0 = this.A00) != null) {
            C181499Qs.A00(a6z);
            r0.A01.invoke(new C821743o(r0.A00));
        }
        return false;
    }

    public AnonymousClass5WY A00() {
        A7K a7k = new A7K();
        String rawString = this.A01.getRawString();
        a7k.A07("newsletter_id", rawString);
        boolean A1W = AnonymousClass000.A1W(rawString);
        String rawString2 = this.A03.A0G(this.A02).getRawString();
        a7k.A07("user_id", rawString2);
        boolean A1W2 = AnonymousClass000.A1W(rawString2);
        C199610h.A07(A1W);
        C199610h.A07(A1W2);
        return new AIj(a7k, NewsletterAdminInviteResponseImpl.class, "NewsletterAdminInvite");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C821443f(AnonymousClass1PY r1, C29681ch r2, UserJid userJid, AnonymousClass5Y9 r4, C20131A8r a8r, C85194Ml r6, AnonymousClass10I r7) {
        super(r1, r4, r7);
        C18070vi.A0s(r7, r1, r4, a8r);
        this.A03 = a8r;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r6;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
