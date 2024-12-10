package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.3PT  reason: invalid class name */
public final class AnonymousClass3PT extends FrameLayout implements AnonymousClass009 {
    public C107245Yy A00;
    public AnonymousClass4SU A01;
    public C106955Xv A02;
    public C76803oS A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final AnonymousClass1FU A06;
    public final C28931bI A07;
    public final FrameLayout A08;

    public final void setGroupChatInfoViewModelFactory$app_product_community_community(C106955Xv r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaCardUpdateHelperFactory$app_product_community_community(C107245Yy r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1FU getActivity() {
        return this.A06;
    }

    public final C106955Xv getGroupChatInfoViewModelFactory$app_product_community_community() {
        C106955Xv r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatInfoViewModelFactory");
        throw null;
    }

    public final C107245Yy getMediaCardUpdateHelperFactory$app_product_community_community() {
        C107245Yy r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaCardUpdateHelperFactory");
        throw null;
    }

    public AnonymousClass3PT(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z;
            this.A02 = (C106955Xv) r1.A49.get();
            this.A00 = (C107245Yy) r1.A3y.get();
        }
        this.A06 = AnonymousClass3MZ.A0P(context);
        View inflate = View.inflate(context, 2131624407, this);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A08 = frameLayout;
        C28931bI A002 = C28931bI.A00(frameLayout, 2131432376);
        this.A07 = A002;
        A002.A02().setVisibility(0);
        C72473Md.A10(this);
        C28931bI r5 = this.A07;
        ((AnonymousClass48V) r5.A02()).setTitleTextColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971673, 2131102765));
        ((AnonymousClass48V) r5.A02()).setSeeMoreColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971673, 2131102765));
        r5.A02().setPadding(0, 0, 0, 0);
    }
}
