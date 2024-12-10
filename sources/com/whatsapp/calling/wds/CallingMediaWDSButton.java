package com.whatsapp.calling.wds;

import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DG;
import X.AnonymousClass4IY;
import X.C18070vi;
import X.C27881Xz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;

public final class CallingMediaWDSButton extends WDSButton {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallingMediaWDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, AnonymousClass4IY.A02, 0, 0);
            C18070vi.A0X(obtainStyledAttributes);
            try {
                setCallControlMuteIcon(obtainStyledAttributes.getBoolean(0, false));
                this.A01 = obtainStyledAttributes.getBoolean(1, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.A00) {
            setAction(AnonymousClass4DG.MEDIA);
        } else if (this.A01) {
            setAction(AnonymousClass4DG.NORMAL);
            setVariant(C27881Xz.OUTLINE);
        }
    }

    public static final ColorStateList A01(int[] iArr) {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[]{16843623}, new int[]{-16842910}, new int[0]}, iArr);
    }

    public void setupBackgroundStyle(ColorStateList colorStateList, ColorStateList colorStateList2) {
        C18070vi.A0d(colorStateList, 0);
        ColorStateList backgroundColorStateList = getBackgroundColorStateList();
        if (backgroundColorStateList != null) {
            colorStateList = backgroundColorStateList;
        }
        super.setupBackgroundStyle(colorStateList, colorStateList2);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        C18070vi.A0d(colorStateList, 0);
        ColorStateList contentColorStateList = getContentColorStateList();
        if (contentColorStateList != null) {
            colorStateList = contentColorStateList;
        }
        super.setupContentStyle(colorStateList);
    }

    private final ColorStateList getBackgroundColorStateList() {
        int[] iArr;
        int i;
        Context context;
        Context context2;
        int ordinal = this.A07.ordinal();
        if (ordinal == 1) {
            iArr = new int[5];
            iArr[0] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130972007, 2131103383);
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103386, 1);
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103385, 2);
            context2 = getContext();
            i = 2131102993;
        } else if (ordinal == 3) {
            iArr = new int[5];
            iArr[0] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130972007, 2131103383);
            i = 2131103368;
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103368, 1);
            iArr[2] = AnonymousClass3MY.A02(this, 2131103368);
            context2 = getContext();
        } else if (ordinal != 2) {
            return null;
        } else {
            iArr = new int[5];
            iArr[0] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971979, 2131103154);
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103006, 1);
            iArr[2] = AnonymousClass3MY.A02(this, 2131103006);
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103225, 3);
            context = getContext();
            i = 2131103368;
            AnonymousClass3MW.A1O(context, iArr, i, 4);
            return A01(iArr);
        }
        AnonymousClass3MW.A1O(context2, iArr, i, 3);
        context = getContext();
        AnonymousClass3MW.A1O(context, iArr, i, 4);
        return A01(iArr);
    }

    private final ColorStateList getContentColorStateList() {
        int[] iArr;
        int ordinal = this.A07.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            iArr = new int[5];
            Context context = getContext();
            int i = 2131103052;
            if (this.A00) {
                i = 2131103332;
            }
            AnonymousClass3MW.A1O(context, iArr, i, 0);
            iArr[1] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130972007, 2131103383);
            iArr[2] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130972007, 2131103383);
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103225, 3);
            iArr[4] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130972007, 2131103383);
        } else if (ordinal != 2) {
            return null;
        } else {
            int A02 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971979, 2131103154);
            iArr = new int[5];
            iArr[0] = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971982, 2131103160);
            iArr[1] = A02;
            iArr[2] = A02;
            AnonymousClass3MW.A1O(getContext(), iArr, 2131103225, 3);
            iArr[4] = A02;
        }
        return A01(iArr);
    }

    public final void setCallControlMuteIcon(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            ColorStateList contentColorStateList = getContentColorStateList();
            if (contentColorStateList != null) {
                super.setupContentStyle(contentColorStateList);
            }
        }
    }
}
