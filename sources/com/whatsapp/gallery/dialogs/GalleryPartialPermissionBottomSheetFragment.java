package com.whatsapp.gallery.dialogs;

import X.AnonymousClass1HF;
import X.C139436yq;
import X.C18070vi;
import X.C18090vk;
import X.C89944dH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class GalleryPartialPermissionBottomSheetFragment extends Hilt_GalleryPartialPermissionBottomSheetFragment {
    public C18090vk A00;
    public C18090vk A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625418, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C89944dH.A00(AnonymousClass1HF.A06(view, 2131435095), this, 29);
        C89944dH.A00(AnonymousClass1HF.A06(view, 2131431156), this, 30);
    }

    public void A2I(C139436yq r3) {
        C18070vi.A0d(r3, 0);
        r3.A00.A01 = -1;
    }
}
