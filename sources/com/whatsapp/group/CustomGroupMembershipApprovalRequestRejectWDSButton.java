package com.whatsapp.group;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C19740yt;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;

public final class CustomGroupMembershipApprovalRequestRejectWDSButton extends WDSButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public void setupBackgroundStyle(ColorStateList colorStateList, ColorStateList colorStateList2) {
        C18070vi.A0d(colorStateList, 0);
        ColorStateList A03 = C19740yt.A03(getContext(), 2131101159);
        if (A03 != null) {
            colorStateList = A03;
        }
        super.setupBackgroundStyle(colorStateList, colorStateList2);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        C18070vi.A0d(colorStateList, 0);
        ColorStateList A03 = C19740yt.A03(getContext(), 2131101160);
        if (A03 != null) {
            colorStateList = A03;
        }
        super.setupContentStyle(colorStateList);
    }

    public /* synthetic */ CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
