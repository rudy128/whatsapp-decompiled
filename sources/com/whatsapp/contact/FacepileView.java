package com.whatsapp.contact;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C39351sv;
import X.C43531zx;
import X.C72463Mc;
import X.C72473Md;
import X.C84144If;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

public class FacepileView extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public FacepileItemMaskView A05;
    public C18000vb A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public final List A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final void A00() {
        setClipToPadding(false);
        setClipChildren(false);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        boolean A1Z = AnonymousClass3MW.A1Z(getWaLocale());
        int i = this.A04;
        if (A1Z) {
            if (paddingRight < i) {
                paddingRight = i;
            }
        } else if (paddingLeft < i) {
            paddingLeft = i;
        }
        C72463Mc.A15(this, paddingLeft, paddingRight);
        int i2 = 0;
        for (Object next : this.A0B) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            View view = (View) next;
            ThumbnailButton thumbnailButton = (ThumbnailButton) AnonymousClass1HF.A06(view, 2131435568);
            if (!this.A09) {
                thumbnailButton.A00 = (float) this.A0A;
                thumbnailButton.A02 = this.A00;
            } else {
                thumbnailButton.A00 = 0.0f;
            }
            thumbnailButton.getLayoutParams().width = this.A01;
            ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
            int i4 = this.A01;
            layoutParams.height = i4;
            thumbnailButton.A01 = (float) (i4 / 2);
            A03(view, i2);
            i2 = i3;
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    public boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    private final void A01() {
        int i = this.A03;
        FacepileItemMaskView facepileItemMaskView = this.A05;
        if (i > 0) {
            if (facepileItemMaskView == null) {
                View inflate = AnonymousClass3MZ.A0D(this).inflate(2131626269, this, false);
                C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.contact.FacepileItemMaskView");
                facepileItemMaskView = (FacepileItemMaskView) inflate;
                this.A05 = facepileItemMaskView;
                if (facepileItemMaskView == null) {
                    return;
                }
            }
            int i2 = this.A02;
            facepileItemMaskView.A00 = i2;
            A03(facepileItemMaskView, i2);
            TextView A0J = AnonymousClass3MW.A0J(facepileItemMaskView, 2131433730);
            Context context = getContext();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, this.A03, 0);
            AnonymousClass3MY.A0y(context, A0J, A1a, 2131890287);
            if (facepileItemMaskView.getParent() == null) {
                addView(facepileItemMaskView, this.A02);
            }
        } else if (facepileItemMaskView != null) {
            removeView(facepileItemMaskView);
        }
    }

    private final void A02() {
        List list = this.A0B;
        list.clear();
        FacepileItemMaskView facepileItemMaskView = this.A05;
        if (facepileItemMaskView != null) {
            removeView(facepileItemMaskView);
        }
        int i = this.A03;
        int childCount = getChildCount();
        if (i > 0) {
            childCount--;
        }
        int i2 = this.A02;
        if (i2 < childCount) {
            int childCount2 = getChildCount();
            while (true) {
                childCount2--;
                i2 = this.A02;
                if (childCount2 < i2) {
                    break;
                }
                removeViewAt(childCount2);
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getChildCount() <= i3) {
                AnonymousClass3MZ.A0D(this).inflate(getLayout(), this, true);
            }
            View childAt = getChildAt(i3);
            if (childAt instanceof FacepileItemMaskView) {
                ((FacepileItemMaskView) childAt).A00 = i3;
            }
            C18070vi.A0b(childAt);
            list.add(childAt);
        }
        A01();
    }

    private final void setContactBorderColor(int i) {
        this.A00 = i;
        if (i == 0) {
            this.A09 = true;
        }
        A00();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getContactBorderSize() {
        return this.A0A;
    }

    public final int getContactIconSize() {
        return this.A01;
    }

    public final int getContactsSize() {
        return this.A02;
    }

    public int getLayout() {
        if (this.A09) {
            return 2131625300;
        }
        return 2131625299;
    }

    public final int getNotInFacepileCount() {
        return this.A03;
    }

    public final FacepileItemMaskView getNotInFacepileCountView() {
        return this.A05;
    }

    public final int getOverlapSize() {
        return this.A04;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public final void setContactBorderSize(int i) {
        this.A0A = i;
        A00();
    }

    public final void setContactIconSize(int i) {
        this.A01 = i;
        A00();
    }

    public final void setContactsSize(int i) {
        this.A02 = i;
        A02();
        A00();
    }

    public final void setNotInFacepileCount(int i) {
        this.A03 = i;
        A01();
    }

    public final void setOverlapSize(int i) {
        this.A04 = i;
        A00();
    }

    private final void A03(View view, int i) {
        int i2;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i5 = 0;
        if (AnonymousClass3MW.A1Z(getWaLocale())) {
            i2 = 0;
        } else if (!this.A09 || i <= 0) {
            i2 = -this.A04;
        } else {
            i2 = (-this.A04) + this.A0A;
        }
        if (!AnonymousClass3MW.A1Z(getWaLocale())) {
            i3 = 0;
        } else if (!this.A09 || i <= 0) {
            i3 = -this.A04;
        } else {
            i3 = (-this.A04) + this.A0A;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i4 = 0;
        } else {
            i4 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i5 = marginLayoutParams.bottomMargin;
        }
        C43531zx.A03(view, new C39351sv(i2, i4, i3, i5));
    }

    public final WaImageView A04(int i) {
        if (i < getChildCount()) {
            return AnonymousClass3MW.A0R((View) this.A0B.get(i), 2131435568);
        }
        return null;
    }

    public final Resources getRes() {
        Resources A0Y = AnonymousClass000.A0Y(this);
        C18070vi.A0X(A0Y);
        return A0Y;
    }

    public final void setNotInFacepileCountView(FacepileItemMaskView facepileItemMaskView) {
        this.A05 = facepileItemMaskView;
    }

    public int getNumNotInFacepileLayout() {
        return 2131626269;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A0B = AnonymousClass000.A13();
        Resources A0Y = AnonymousClass000.A0Y(this);
        C18070vi.A0X(A0Y);
        this.A04 = A0Y.getDimensionPixelSize(2131166782);
        Resources A0Y2 = AnonymousClass000.A0Y(this);
        C18070vi.A0X(A0Y2);
        this.A0A = A0Y2.getDimensionPixelSize(2131166780);
        Resources A0Y3 = AnonymousClass000.A0Y(this);
        C18070vi.A0X(A0Y3);
        this.A01 = A0Y3.getDimensionPixelSize(2131166784);
        this.A00 = AnonymousClass3Ma.A00(context, 2130969555, 2131100586);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, C84144If.A0A, 0, 0);
            C18070vi.A0X(obtainStyledAttributes);
            try {
                Resources A0Y4 = AnonymousClass000.A0Y(this);
                C18070vi.A0X(A0Y4);
                setOverlapSize(obtainStyledAttributes.getDimensionPixelSize(4, A0Y4.getDimensionPixelSize(2131166782)));
                Resources A0Y5 = AnonymousClass000.A0Y(this);
                C18070vi.A0X(A0Y5);
                setContactIconSize(obtainStyledAttributes.getDimensionPixelSize(2, A0Y5.getDimensionPixelSize(2131166784)));
                setContactBorderColor(obtainStyledAttributes.getColor(0, AnonymousClass3MZ.A02(getContext(), getContext(), 2130969555, 2131100586)));
                if (this.A00 == 0) {
                    this.A09 = true;
                }
                Resources A0Y6 = AnonymousClass000.A0Y(this);
                C18070vi.A0X(A0Y6);
                setContactBorderSize(obtainStyledAttributes.getDimensionPixelSize(1, A0Y6.getDimensionPixelSize(2131166780)));
                setContactsSize(obtainStyledAttributes.getInt(3, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        A02();
        A00();
    }

    public /* synthetic */ FacepileView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
