package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1AP;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6UV;
import X.AnonymousClass78O;
import X.AnonymousClass877;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C120346Di;
import X.C120356Dj;
import X.C120366Dk;
import X.C120376Dl;
import X.C120386Dm;
import X.C120396Dn;
import X.C120406Do;
import X.C120416Dp;
import X.C120426Dq;
import X.C120436Dr;
import X.C18070vi;
import X.C28081Yu;
import X.C72453Mb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.WaImageView;
import java.util.Iterator;

public final class AvatarStickersCategoriesView extends FrameLayout {
    public AnonymousClass877 A00;
    public AnonymousClass6UV A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final WaImageView A0B;
    public final WaImageView A0C;
    public final WaImageView A0D;
    public final WaImageView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final WaImageView A0K;
    public final WaImageView A0L;
    public final WaImageView A0M;
    public final WaImageView A0N;
    public final WaImageView A0O;
    public final WaImageView A0P;
    public final WaImageView A0Q;
    public final WaImageView A0R;
    public final WaImageView A0S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        LayoutInflater.from(context).inflate(2131624248, this, true);
        this.A07 = C18070vi.A05(this, 2131434386);
        this.A0G = C108965cb.A0I(this, 2131434387);
        this.A0P = C108965cb.A0I(this, 2131434392);
        this.A09 = C18070vi.A05(this, 2131435571);
        this.A0I = C108965cb.A0I(this, 2131435572);
        this.A0R = C108965cb.A0I(this, 2131435578);
        this.A04 = C18070vi.A05(this, 2131431347);
        this.A0D = C108965cb.A0I(this, 2131431348);
        this.A0M = C108965cb.A0I(this, 2131431349);
        this.A05 = C18070vi.A05(this, 2131432230);
        this.A0E = C108965cb.A0I(this, 2131432231);
        this.A0N = C108965cb.A0I(this, 2131432232);
        this.A06 = C18070vi.A05(this, 2131434329);
        this.A0F = C108965cb.A0I(this, 2131434330);
        this.A0O = C108965cb.A0I(this, 2131434336);
        this.A03 = C18070vi.A05(this, 2131431226);
        this.A0C = C108965cb.A0I(this, 2131431227);
        this.A0L = C108965cb.A0I(this, 2131431228);
        this.A02 = C18070vi.A05(this, 2131428944);
        this.A0B = C108965cb.A0I(this, 2131428945);
        this.A0K = C108965cb.A0I(this, 2131428946);
        this.A08 = C18070vi.A05(this, 2131434771);
        this.A0H = C108965cb.A0I(this, 2131434772);
        this.A0Q = C108965cb.A0I(this, 2131434773);
        this.A0A = C18070vi.A05(this, 2131436258);
        this.A0J = C108965cb.A0I(this, 2131436259);
        this.A0S = C108965cb.A0I(this, 2131436260);
        AnonymousClass78O.A00(this.A07, this, 18);
        AnonymousClass78O.A00(this.A09, this, 19);
        AnonymousClass78O.A00(this.A04, this, 20);
        AnonymousClass78O.A00(this.A05, this, 21);
        AnonymousClass78O.A00(this.A08, this, 22);
        AnonymousClass78O.A00(this.A06, this, 23);
        AnonymousClass78O.A00(this.A03, this, 24);
        AnonymousClass78O.A00(this.A02, this, 25);
        AnonymousClass78O.A00(this.A0A, this, 14);
        A02(this.A0G, 2131886891);
        A02(this.A0I, 2131886890);
        A02(this.A0D, 2131890264);
        A02(this.A0E, 2131890266);
        A02(this.A0F, 2131890267);
        A02(this.A0C, 2131890263);
        A02(this.A0B, 2131890261);
        A02(this.A0H, 2131890269);
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131165414);
        Iterator it = AnonymousClass1AP.A03(this.A0G, this.A0I, this.A0D, this.A0E, this.A0H, this.A0F, this.A0C, this.A0B, this.A0J).iterator();
        while (it.hasNext()) {
            View A0E2 = AnonymousClass3MX.A0E(it);
            A0E2.getLayoutParams().width = dimensionPixelSize;
            AnonymousClass3MX.A1F(A0E2, dimensionPixelSize);
        }
    }

    public static final void setRecentEnabled$lambda$3(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        C18070vi.A0d(avatarStickersCategoriesView, 0);
        AnonymousClass877 r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A03) != null) {
            C108955ca.A1H(coordinatorLayout, 2131889745, 0);
        }
    }

    public static final void setStarredEnabled$lambda$5(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        C18070vi.A0d(avatarStickersCategoriesView, 0);
        AnonymousClass877 r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A03) != null) {
            C108955ca.A1H(coordinatorLayout, 2131889748, 0);
        }
    }

    public final void setCategorySelectionListener(AnonymousClass877 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setSelectedCategory(AnonymousClass6UV r7) {
        C18070vi.A0d(r7, 0);
        C72453Mb.A1D(A01(this.A01));
        WaImageView A002 = A00(this.A01);
        if (A002 != null) {
            C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3MZ.A02(getContext(), getContext(), 2130969505, 2131101222)), A002);
        }
        this.A01 = r7;
        WaImageView A012 = A01(r7);
        if (A012 != null) {
            A012.setVisibility(0);
        }
        WaImageView A003 = A00(r7);
        if (A003 != null) {
            C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971949, 2131103049)), A003);
        }
    }

    private final WaImageView A00(AnonymousClass6UV r2) {
        if (C18070vi.A18(r2, C120406Do.A00)) {
            return this.A0G;
        }
        if (C18070vi.A18(r2, C120426Dq.A00)) {
            return this.A0I;
        }
        if (C18070vi.A18(r2, C120376Dl.A00)) {
            return this.A0D;
        }
        if (C18070vi.A18(r2, C120386Dm.A00)) {
            return this.A0E;
        }
        if (C18070vi.A18(r2, C120346Di.A00) || C18070vi.A18(r2, C120416Dp.A00)) {
            return this.A0H;
        }
        if (C18070vi.A18(r2, C120396Dn.A00)) {
            return this.A0F;
        }
        if (C18070vi.A18(r2, C120366Dk.A00)) {
            return this.A0C;
        }
        if (C18070vi.A18(r2, C120356Dj.A00)) {
            return this.A0B;
        }
        if (C18070vi.A18(r2, C120436Dr.A00)) {
            return this.A0J;
        }
        return null;
    }

    private final WaImageView A01(AnonymousClass6UV r2) {
        if (C18070vi.A18(r2, C120406Do.A00)) {
            return this.A0P;
        }
        if (C18070vi.A18(r2, C120426Dq.A00)) {
            return this.A0R;
        }
        if (C18070vi.A18(r2, C120376Dl.A00)) {
            return this.A0M;
        }
        if (C18070vi.A18(r2, C120386Dm.A00)) {
            return this.A0N;
        }
        if (C18070vi.A18(r2, C120346Di.A00) || C18070vi.A18(r2, C120416Dp.A00)) {
            return this.A0Q;
        }
        if (C18070vi.A18(r2, C120396Dn.A00)) {
            return this.A0O;
        }
        if (C18070vi.A18(r2, C120366Dk.A00)) {
            return this.A0L;
        }
        if (C18070vi.A18(r2, C120356Dj.A00)) {
            return this.A0K;
        }
        if (C18070vi.A18(r2, C120436Dr.A00)) {
            return this.A0S;
        }
        return null;
    }

    public final void setRecentEnabled(boolean z) {
        C28081Yu.A00(ColorStateList.valueOf(C108985cd.A03(this)), this.A0G);
        View view = this.A07;
        int i = 16;
        if (z) {
            i = 15;
        }
        AnonymousClass78O.A00(view, this, i);
    }

    public final void setStarredEnabled(boolean z) {
        C28081Yu.A00(ColorStateList.valueOf(C108985cd.A03(this)), this.A0I);
        View view = this.A09;
        int i = 17;
        if (z) {
            i = 13;
        }
        AnonymousClass78O.A00(view, this, i);
    }

    public final void setTogetherVisible(boolean z) {
        this.A0A.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public static final void A02(WaImageView waImageView, int i) {
        waImageView.setContentDescription(C108975cc.A0b(waImageView.getContext(), AnonymousClass3Ma.A11(waImageView, i), AnonymousClass3MW.A1a(), 2131886899));
    }

    public static final void setClickListeners$lambda$10(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120416Dp.A00);
        }
    }

    public static final void setClickListeners$lambda$11(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120396Dn.A00);
        }
    }

    public static final void setClickListeners$lambda$12(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120366Dk.A00);
        }
    }

    public static final void setClickListeners$lambda$13(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120356Dj.A00);
        }
    }

    public static final void setClickListeners$lambda$14(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120436Dr.A00);
        }
    }

    public static final void setClickListeners$lambda$6(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120406Do.A00);
        }
    }

    public static final void setClickListeners$lambda$7(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120426Dq.A00);
        }
    }

    public static final void setClickListeners$lambda$8(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120376Dl.A00);
        }
    }

    public static final void setClickListeners$lambda$9(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120386Dm.A00);
        }
    }

    public static final void setRecentEnabled$lambda$2(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120406Do.A00);
        }
    }

    public static final void setStarredEnabled$lambda$4(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        AnonymousClass877 A0O2 = C108955ca.A0O(avatarStickersCategoriesView);
        if (A0O2 != null) {
            A0O2.Bo3(C120426Dq.A00);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
