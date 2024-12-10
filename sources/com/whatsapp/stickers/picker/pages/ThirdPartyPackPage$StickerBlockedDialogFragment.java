package com.whatsapp.stickers.picker.pages;

import X.AnonymousClass1EG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.C17960vV;
import X.C73203Rj;
import X.C88814ar;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;

public class ThirdPartyPackPage$StickerBlockedDialogFragment extends Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment {
    public Dialog A27(Bundle bundle) {
        String string = A15().getString("sticker_pack_name");
        C17960vV.A07(string);
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131896530);
        Context A1n = A1n();
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = Html.escapeHtml(string);
        A03.A0S(AnonymousClass1EG.A01(A1n, A1a, 2131896529));
        A03.setPositiveButton(2131896528, new C88814ar(this, 23));
        return AnonymousClass3MX.A0N(new C88814ar(this, 24), A03, 2131898766);
    }
}
