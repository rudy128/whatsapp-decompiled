package X;

import android.view.ViewGroup;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;

/* renamed from: X.3OH  reason: invalid class name */
public abstract class AnonymousClass3OH extends ViewGroup implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A05() {
        C76773oE r3 = (C76773oE) this;
        if (r3 instanceof NewsletterInfoLayout) {
            NewsletterInfoLayout newsletterInfoLayout = (NewsletterInfoLayout) r3;
            if (!newsletterInfoLayout.A00) {
                newsletterInfoLayout.A00 = true;
                C27691Xc A0O = AnonymousClass3MY.A0O(newsletterInfoLayout);
                AnonymousClass10E r1 = A0O.A10;
                A00(r1, r1.A00, A0O, newsletterInfoLayout);
            }
        } else if (r3 instanceof BusinessChatInfoLayout) {
            BusinessChatInfoLayout businessChatInfoLayout = (BusinessChatInfoLayout) r3;
            if (!businessChatInfoLayout.A00) {
                businessChatInfoLayout.A00 = true;
                C27691Xc A0O2 = AnonymousClass3MY.A0O(businessChatInfoLayout);
                AnonymousClass10E r12 = A0O2.A10;
                A00(r12, r12.A00, A0O2, businessChatInfoLayout);
            }
        } else if (!r3.A00) {
            r3.A00 = true;
            C27691Xc r2 = (C27691Xc) AnonymousClass3MX.A0T(r3);
            AnonymousClass10E r13 = r2.A10;
            A00(r13, r13.A00, r2, (ChatInfoLayoutV2) r3);
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

    public static void A00(AnonymousClass10E r1, AnonymousClass10G r2, C27691Xc r3, ChatInfoLayoutV2 chatInfoLayoutV2) {
        chatInfoLayoutV2.A02 = C000200d.A00(r2.A4a);
        chatInfoLayoutV2.A0V = (C18030ve) r1.A04.get();
        chatInfoLayoutV2.A0U = (AnonymousClass1KW) r1.A3d.get();
        chatInfoLayoutV2.A0R = (C24921Me) r1.ABX.get();
        chatInfoLayoutV2.A0Q = (AnonymousClass1VW) r1.A2d.get();
        chatInfoLayoutV2.A0S = (C18000vb) r1.ABz.get();
        chatInfoLayoutV2.A0M = (C72043Kk) r2.A1j.get();
        chatInfoLayoutV2.A0X = (AnonymousClass73F) r1.A2Z.get();
        chatInfoLayoutV2.A0T = (C88504Zz) r3.A0z.A0h.get();
        chatInfoLayoutV2.A0W = (C133736pP) r1.A2Y.get();
        chatInfoLayoutV2.A05 = (AnonymousClass1VW) r1.A2d.get();
    }
}
