package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.6BE  reason: invalid class name */
public final class AnonymousClass6BE extends AnonymousClass6GE implements AnonymousClass009 {
    public AnonymousClass1KW A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final CardView A07;
    public final C42141xh A08;

    public ThumbnailButton getMediaView() {
        return null;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public AnonymousClass6BE(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A03 = AnonymousClass3Ma.A0d(A0O);
            this.A01 = AnonymousClass3MZ.A0e(A0O);
            AnonymousClass10G r1 = A0O.A00;
            this.A05 = C000200d.A00(r1.A3O);
            this.A04 = AnonymousClass3Ma.A0r(A0O);
            this.A02 = AnonymousClass3Ma.A0a(A0O);
            this.A00 = AnonymousClass3MZ.A0T(r1);
            this.A00 = AnonymousClass3Ma.A0f(A0O);
        }
        View inflate = View.inflate(context, 2131626228, this);
        this.A07 = (CardView) inflate.findViewById(2131433047);
        this.A04 = AnonymousClass3MW.A0H(inflate, 2131433051);
        this.A08 = C42141xh.A01(this, getTextEmojiLabelViewControllerFactory(), 2131433050);
        this.A06 = C17880vN.A0E(inflate, 2131433049);
        this.A05 = C17880vN.A0E(inflate, 2131433048);
        View findViewById = inflate.findViewById(2131433046);
        this.A03 = findViewById;
        AnonymousClass3MY.A0v(context, findViewById, C22891Dp.A02 ? 2131231171 : 2131231170);
    }

    public final View getButtonView() {
        return this.A03;
    }

    public CardView getCardView() {
        return this.A07;
    }

    public TextView getFollowersView() {
        return this.A06;
    }

    public C42141xh getNameViewController() {
        return this.A08;
    }

    public ImageView getThumbnailView() {
        return this.A04;
    }
}
