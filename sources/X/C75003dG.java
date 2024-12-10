package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.3dG  reason: invalid class name and case insensitive filesystem */
public final class C75003dG extends ListItemWithLeftIcon {
    public C33251iW A00;
    public AnonymousClass5Z0 A01;
    public AnonymousClass4RZ A02;
    public C25231Nk A03;
    public AnonymousClass1NN A04;
    public C81723zh A05;
    public AnonymousClass1EC A06;
    public AnonymousClass10I A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final CompoundButton.OnCheckedChangeListener A0A = new C90874em(this, 4);
    public final AnonymousClass1FU A0B;

    public C75003dG(Context context) {
        super(context, (AttributeSet) null);
        A04();
        this.A0B = AnonymousClass3MZ.A0P(context);
        setIcon(2131232143);
        C74793cj.A01(context, this, 2131891999);
        C72473Md.A0y(this);
    }

    public final void setConversationObservers$app_product_community_community(AnonymousClass1NN r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community(AnonymousClass5Z0 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setUserActions$app_product_community_community(C33251iW r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setUserMuteActions$app_product_community_community(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setWaWorkers$app_product_community_community(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final AnonymousClass1FU getActivity() {
        return this.A0B;
    }

    public final AnonymousClass1NN getConversationObservers$app_product_community_community() {
        AnonymousClass1NN r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationObservers");
        throw null;
    }

    public final AnonymousClass5Z0 getMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community() {
        AnonymousClass5Z0 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("muteNotificationsInfoViewUpdateHelperFactory");
        throw null;
    }

    public final C33251iW getUserActions$app_product_community_community() {
        C33251iW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userActions");
        throw null;
    }

    public final AnonymousClass00H getUserMuteActions$app_product_community_community() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userMuteActions");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers$app_product_community_community() {
        AnonymousClass10I r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass1NN conversationObservers$app_product_community_community = getConversationObservers$app_product_community_community();
        C25231Nk r0 = this.A03;
        if (r0 == null) {
            C18070vi.A11("conversationObserver");
            throw null;
        } else {
            conversationObservers$app_product_community_community.unregisterObserver(r0);
        }
    }
}
