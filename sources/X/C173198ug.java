package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.8ug  reason: invalid class name and case insensitive filesystem */
public final class C173198ug extends AnonymousClass2SE {
    public final AnonymousClass1CJ A00;
    public final C35681md A01;
    public final AnonymousClass00H A02;

    public C173198ug(AnonymousClass1CJ r1, C35681md r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public Class A00() {
        return NotificationNewsletterStateChangeResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterStateChange";
    }

    public void A02(C172768tz r10) {
        C20125A8k A002 = C199129zU.A00(r10);
        Class<NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange> cls = NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.class;
        String A08 = C20125A8k.A08(A002.A09(cls, "xwa2_notify_newsletter_on_state_change"));
        if (A08 != null) {
            try {
                AnonymousClass25J r0 = C29681ch.A03;
                C29681ch A003 = AnonymousClass25J.A00(A08);
                AnonymousClass4aS.A06(this.A00, A003);
                NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State state = (NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) ((NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) A002.A09(cls, "xwa2_notify_newsletter_on_state_change")).A09(NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class, "state");
                if (state != null) {
                    GraphQLXWA2NewsletterStateType graphQLXWA2NewsletterStateType = GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    GraphQLXWA2NewsletterStateType graphQLXWA2NewsletterStateType2 = (GraphQLXWA2NewsletterStateType) state.A0D(graphQLXWA2NewsletterStateType, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (graphQLXWA2NewsletterStateType2 != null) {
                        int ordinal = graphQLXWA2NewsletterStateType2.ordinal();
                        if (ordinal == 4) {
                            this.A01.A08(A003);
                            return;
                        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                            A6V a6v = (A6V) this.A02.get();
                            NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange xwa2NotifyNewsletterOnStateChange = (NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) A002.A09(cls, "xwa2_notify_newsletter_on_state_change");
                            C18070vi.A0X(xwa2NotifyNewsletterOnStateChange);
                            C46162Dk A0C = ((C20131A8r) a6v.A07.get()).A0C(new AVA(xwa2NotifyNewsletterOnStateChange), A003);
                            if (A0C == null) {
                                a6v.A06("Failed to convert newsletter suspend into NewsletterInfo");
                                return;
                            } else {
                                a6v.A03(A0C);
                                return;
                            }
                        }
                    }
                    state.A0D(graphQLXWA2NewsletterStateType, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
            } catch (Exception e) {
                C17900vP.A0X(e, "NewsletterNotificationStateChangeHandler/error ", AnonymousClass000.A10());
            }
        }
    }
}
