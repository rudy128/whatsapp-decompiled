package X;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* renamed from: X.6GE  reason: invalid class name */
public abstract class AnonymousClass6GE extends C110375fP {
    public C72043Kk A00;
    public AnonymousClass1VW A01;
    public AnonymousClass11C A02;
    public AnonymousClass1CJ A03;
    public C18010vc A04;
    public AnonymousClass00H A05;

    public abstract CardView getCardView();

    public abstract TextView getFollowersView();

    public abstract C42141xh getNameViewController();

    public abstract ImageView getThumbnailView();

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setNewsletterNumberFormatter(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(C72043Kk r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatsCache");
        throw null;
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final AnonymousClass00H getNewsletterNumberFormatter() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterNumberFormatter");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C72043Kk getTextEmojiLabelViewControllerFactory() {
        C72043Kk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("textEmojiLabelViewControllerFactory");
        throw null;
    }
}
