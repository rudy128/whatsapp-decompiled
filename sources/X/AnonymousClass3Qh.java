package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.chatinfo.view.custom.ContactDetailsCard;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;

/* renamed from: X.3Qh  reason: invalid class name */
public abstract class AnonymousClass3Qh extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(C19880zA r1, AnonymousClass10E r2, AnonymousClass10G r3, C27691Xc r4, ContactDetailsCard contactDetailsCard) {
        contactDetailsCard.A0M = (C31191fA) r2.A25.get();
        contactDetailsCard.A0C = r1;
        contactDetailsCard.A0T = (C30921ej) r2.A8H.get();
        contactDetailsCard.A0N = (AnonymousClass1M2) r2.A2e.get();
        contactDetailsCard.A0S = (AnonymousClass1QJ) r2.A8F.get();
        contactDetailsCard.A0W = (C191769n9) r3.A3l.get();
        contactDetailsCard.A0G = (AnonymousClass4PS) r4.A0z.A1F.get();
    }

    public void A02() {
        if (this instanceof NewsletterDetailsCard) {
            NewsletterDetailsCard newsletterDetailsCard = (NewsletterDetailsCard) this;
            if (!newsletterDetailsCard.A06) {
                newsletterDetailsCard.A06 = true;
                C27691Xc A0O = AnonymousClass3MY.A0O(newsletterDetailsCard);
                AnonymousClass10E r4 = A0O.A10;
                newsletterDetailsCard.A0P = AnonymousClass10E.A8r(r4);
                newsletterDetailsCard.A0F = AnonymousClass3MY.A0N(r4);
                AnonymousClass10G r3 = r4.A00;
                newsletterDetailsCard.A0b = AnonymousClass3MY.A0e(r3);
                newsletterDetailsCard.A0H = AnonymousClass10E.A17(r4);
                newsletterDetailsCard.A0R = AnonymousClass3MY.A0Z(r4);
                newsletterDetailsCard.A0L = AnonymousClass3MZ.A0W(r4);
                newsletterDetailsCard.A0E = AnonymousClass3MZ.A0N(r4);
                newsletterDetailsCard.A0X = (AnonymousClass1R2) r4.A8L.get();
                C19890zB r1 = C19890zB.A00;
                newsletterDetailsCard.A0D = r1;
                newsletterDetailsCard.A0c = AnonymousClass3MZ.A13(r4);
                A00(r1, r4, r3, A0O, newsletterDetailsCard);
                newsletterDetailsCard.A0J = AnonymousClass3MZ.A0T(r3);
                newsletterDetailsCard.A0a = (AnonymousClass4YE) r3.AD4.get();
                newsletterDetailsCard.A0d = C000200d.A00(r4.ABV);
                newsletterDetailsCard.A03 = AnonymousClass3Ma.A0d(r4);
                newsletterDetailsCard.A05 = C000200d.A00(r3.A3Q);
                newsletterDetailsCard.A02 = r1;
            }
        } else if (!this.A01) {
            this.A01 = true;
            ContactDetailsCard contactDetailsCard = (ContactDetailsCard) this;
            C27691Xc r5 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r42 = r5.A10;
            contactDetailsCard.A0P = AnonymousClass10E.A8r(r42);
            contactDetailsCard.A0F = AnonymousClass3MY.A0N(r42);
            AnonymousClass10G r32 = r42.A00;
            contactDetailsCard.A0b = AnonymousClass3MY.A0e(r32);
            contactDetailsCard.A0H = AnonymousClass10E.A17(r42);
            contactDetailsCard.A0R = AnonymousClass3MY.A0Z(r42);
            contactDetailsCard.A0L = AnonymousClass3MZ.A0W(r42);
            contactDetailsCard.A0E = AnonymousClass3MZ.A0N(r42);
            contactDetailsCard.A0X = (AnonymousClass1R2) r42.A8L.get();
            C19890zB r12 = C19890zB.A00;
            contactDetailsCard.A0D = r12;
            contactDetailsCard.A0c = AnonymousClass3MZ.A13(r42);
            A00(r12, r42, r32, r5, contactDetailsCard);
            contactDetailsCard.A0J = AnonymousClass3MZ.A0T(r32);
            contactDetailsCard.A0a = (AnonymousClass4YE) r32.AD4.get();
            contactDetailsCard.A0d = C000200d.A00(r42.ABV);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3Qh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }
}
