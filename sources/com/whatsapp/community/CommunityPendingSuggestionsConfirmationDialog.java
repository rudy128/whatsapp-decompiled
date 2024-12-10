package com.whatsapp.community;

import X.AnonymousClass1FL;
import X.AnonymousClass1M9;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4at;
import X.AnonymousClass4bA;
import X.AnonymousClass5X9;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C24921Me;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public final class CommunityPendingSuggestionsConfirmationDialog extends Hilt_CommunityPendingSuggestionsConfirmationDialog {
    public AnonymousClass5X9 A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        C17960vV.A07(context);
        this.A00 = (AnonymousClass5X9) context;
    }

    public Dialog A27(Bundle bundle) {
        String A0F;
        int i;
        String str;
        AnonymousClass1FL A1D = A1D();
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        int i2 = A15().getInt("dialogId");
        int i3 = A15().getInt("availableGroups");
        int i4 = A15().getInt("totalPendingGroups");
        if (i2 == 0) {
            A0F = C18070vi.A0F(A1D, 2131888592);
            i = 2131888590;
        } else if (i2 != 1) {
            if (i2 == 2) {
                A0F = C18070vi.A0F(A1D, 2131888594);
                i = 2131888593;
            }
            AnonymousClass4bA.A00(A002, this, 4, 2131898766);
            A002.A0L(new AnonymousClass4at(this, i2, 1), A1D.getString(2131888591));
            return AnonymousClass3MY.A0L(A002);
        } else {
            String A0F2 = C18070vi.A0F(A1D, 2131888594);
            Resources resources = A1D.getResources();
            Object[] objArr = new Object[2];
            C17880vN.A1T(objArr, i3, 0);
            C17880vN.A1T(objArr, i4, 1);
            str = resources.getQuantityString(2131755065, i4, objArr);
            C18070vi.A0X(str);
            A002.setTitle(A0F2);
            A002.A0S(str);
            AnonymousClass4bA.A00(A002, this, 4, 2131898766);
            A002.A0L(new AnonymousClass4at(this, i2, 1), A1D.getString(2131888591));
            return AnonymousClass3MY.A0L(A002);
        }
        str = C18070vi.A0F(A1D, i);
        A002.setTitle(A0F);
        A002.A0S(str);
        AnonymousClass4bA.A00(A002, this, 4, 2131898766);
        A002.A0L(new AnonymousClass4at(this, i2, 1), A1D.getString(2131888591));
        return AnonymousClass3MY.A0L(A002);
    }
}
