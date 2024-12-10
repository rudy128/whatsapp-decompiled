package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.AnonymousClass78O;
import X.C18070vi;
import X.C18090vk;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class StickerMakerChoiceBottomSheet extends WDSBottomSheetDialogFragment {
    public final int A00;
    public final C18090vk A01;
    public final C18090vk A02;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A06 = AnonymousClass1HF.A06(view, 2131436598);
        AnonymousClass1Y5.A07(A06, "Button");
        AnonymousClass78O.A00(A06, this, 41);
        View A062 = AnonymousClass1HF.A06(view, 2131436594);
        AnonymousClass1Y5.A07(A062, "Button");
        AnonymousClass78O.A00(A062, this, 42);
        View A063 = AnonymousClass1HF.A06(view, 2131429143);
        AnonymousClass1Y5.A07(A063, "Button");
        AnonymousClass78O.A00(A063, this, 43);
        AnonymousClass1Y5.A0A(AnonymousClass1HF.A06(view, 2131436208), true);
    }

    public StickerMakerChoiceBottomSheet(C18090vk r2, C18090vk r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 2131627101;
    }

    public StickerMakerChoiceBottomSheet() {
        this((C18090vk) null, (C18090vk) null);
    }
}
