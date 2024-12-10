package X;

import android.view.View;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.5TQ  reason: invalid class name */
public final class AnonymousClass5TQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TQ(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ListItemWithLeftIcon listItemWithLeftIcon;
        int i;
        C82774Ca r7 = (C82774Ca) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C18070vi.A0b(r7);
        newsletterInfoActivity.A07 = AnonymousClass3MY.A0C(newsletterInfoActivity, 2131432890);
        newsletterInfoActivity.A0O = (ListItemWithLeftIcon) AnonymousClass3MY.A0C(newsletterInfoActivity, 2131432889);
        int ordinal = r7.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                View view = newsletterInfoActivity.A07;
                if (view != null) {
                    view.setVisibility(0);
                    ListItemWithLeftIcon listItemWithLeftIcon2 = newsletterInfoActivity.A0O;
                    if (listItemWithLeftIcon2 != null) {
                        C74793cj.A01(newsletterInfoActivity, listItemWithLeftIcon2, 2131892824);
                        listItemWithLeftIcon = newsletterInfoActivity.A0O;
                        if (listItemWithLeftIcon != null) {
                            i = 2131232387;
                            listItemWithLeftIcon.setIcon(i);
                        }
                    }
                    C18070vi.A11("mvActionButton");
                    throw null;
                }
            } else if (ordinal == 0) {
                View view2 = newsletterInfoActivity.A07;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            C18070vi.A11("mvActionCard");
            throw null;
        }
        View view3 = newsletterInfoActivity.A07;
        if (view3 != null) {
            view3.setVisibility(0);
            ListItemWithLeftIcon listItemWithLeftIcon3 = newsletterInfoActivity.A0O;
            if (listItemWithLeftIcon3 != null) {
                C74793cj.A01(newsletterInfoActivity, listItemWithLeftIcon3, 2131892860);
                listItemWithLeftIcon = newsletterInfoActivity.A0O;
                if (listItemWithLeftIcon != null) {
                    i = 2131232386;
                    listItemWithLeftIcon.setIcon(i);
                }
            }
            C18070vi.A11("mvActionButton");
            throw null;
        }
        C18070vi.A11("mvActionCard");
        throw null;
        AnonymousClass3MY.A1E(AnonymousClass3MY.A0C(newsletterInfoActivity, 2131432889), r7, newsletterInfoActivity, 16);
        return C27621Wu.A00;
    }
}
