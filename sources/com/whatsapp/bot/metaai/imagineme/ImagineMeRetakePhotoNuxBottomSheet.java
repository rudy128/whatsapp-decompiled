package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass3MZ;
import X.C139436yq;
import X.C18070vi;
import X.C18090vk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90584eJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.LinearLayoutCompat;

public final class ImagineMeRetakePhotoNuxBottomSheet extends Hilt_ImagineMeRetakePhotoNuxBottomSheet {
    public LinearLayoutCompat A00;
    public AnonymousClass00H A01;
    public C18090vk A02;
    public final ViewTreeObserver.OnGlobalLayoutListener A03 = new C90584eJ((Object) this, 5);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        if (A1q == null) {
            return null;
        }
        C72483Me.A0m(A1q, this);
        C72473Md.A13(A1q, this);
        return A1q;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = (LinearLayoutCompat) AnonymousClass1HF.A06(view, 2131432729);
        AnonymousClass3MZ.A1H(AnonymousClass1HF.A06(view, 2131434665), this, 31);
        AnonymousClass3MZ.A1H(AnonymousClass1HF.A06(view, 2131434667), this, 32);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.A03);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A28();
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A25() {
        return 2132084859;
    }

    public int A2F() {
        return 2131625583;
    }
}
