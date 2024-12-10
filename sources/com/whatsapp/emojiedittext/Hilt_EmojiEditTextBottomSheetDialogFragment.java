package com.whatsapp.emojiedittext;

import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C008803x;
import X.C008903z;
import X.C17880vN;
import X.C24051Ir;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.emojiedittext.customstickerpack.Hilt_CustomStickerPackRenameDialog;

public abstract class Hilt_EmojiEditTextBottomSheetDialogFragment extends BottomSheetDialogFragment implements AnonymousClass009 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C17880vN.A0p();
    public volatile C008803x A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0X = r0
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A00()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.emojiedittext.Hilt_EmojiEditTextBottomSheetDialogFragment.A1p(android.app.Activity):void");
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (this instanceof Hilt_CustomStickerPackRenameDialog) {
            Hilt_CustomStickerPackRenameDialog hilt_CustomStickerPackRenameDialog = (Hilt_CustomStickerPackRenameDialog) this;
            if (!hilt_CustomStickerPackRenameDialog.A00) {
                hilt_CustomStickerPackRenameDialog.A00 = true;
                C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(hilt_CustomStickerPackRenameDialog);
                AnonymousClass10E r4 = r3.A2Q;
                hilt_CustomStickerPackRenameDialog.A0F = AnonymousClass10E.A8r(r4);
                hilt_CustomStickerPackRenameDialog.A05 = AnonymousClass10E.A12(r4);
                AnonymousClass10G r2 = r4.A00;
                hilt_CustomStickerPackRenameDialog.A0H = AnonymousClass3Ma.A0w(r2);
                hilt_CustomStickerPackRenameDialog.A04 = AnonymousClass3MY.A0N(r4);
                hilt_CustomStickerPackRenameDialog.A0C = AnonymousClass3Ma.A0f(r4);
                hilt_CustomStickerPackRenameDialog.A0B = AnonymousClass3MZ.A0t(r4);
                hilt_CustomStickerPackRenameDialog.A07 = AnonymousClass3Ma.A0a(r4);
                hilt_CustomStickerPackRenameDialog.A09 = AnonymousClass10E.A6Q(r4);
                hilt_CustomStickerPackRenameDialog.A0J = C000200d.A00(r2.A1c);
                hilt_CustomStickerPackRenameDialog.A08 = AnonymousClass3Ma.A0c(r4);
                hilt_CustomStickerPackRenameDialog.A0G = AnonymousClass3Ma.A0r(r4);
                hilt_CustomStickerPackRenameDialog.A0K = C000200d.A00(r2.A1h);
                hilt_CustomStickerPackRenameDialog.A0E = C36241nZ.A0T(r3);
                hilt_CustomStickerPackRenameDialog.A0A = C72463Mc.A0c(r2);
            }
        } else if (!this.A02) {
            this.A02 = true;
            EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = (EmojiEditTextBottomSheetDialogFragment) this;
            C36241nZ r32 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r42 = r32.A2Q;
            emojiEditTextBottomSheetDialogFragment.A0F = AnonymousClass10E.A8r(r42);
            emojiEditTextBottomSheetDialogFragment.A05 = AnonymousClass10E.A12(r42);
            AnonymousClass10G r22 = r42.A00;
            emojiEditTextBottomSheetDialogFragment.A0H = AnonymousClass3Ma.A0w(r22);
            emojiEditTextBottomSheetDialogFragment.A04 = AnonymousClass3MY.A0N(r42);
            emojiEditTextBottomSheetDialogFragment.A0C = AnonymousClass3Ma.A0f(r42);
            emojiEditTextBottomSheetDialogFragment.A0B = AnonymousClass3MZ.A0t(r42);
            emojiEditTextBottomSheetDialogFragment.A07 = AnonymousClass3Ma.A0a(r42);
            emojiEditTextBottomSheetDialogFragment.A09 = AnonymousClass10E.A6Q(r42);
            emojiEditTextBottomSheetDialogFragment.A0J = C000200d.A00(r22.A1c);
            emojiEditTextBottomSheetDialogFragment.A08 = AnonymousClass3Ma.A0c(r42);
            emojiEditTextBottomSheetDialogFragment.A0G = AnonymousClass3Ma.A0r(r42);
            emojiEditTextBottomSheetDialogFragment.A0K = C000200d.A00(r22.A1h);
            emojiEditTextBottomSheetDialogFragment.A0E = C36241nZ.A0T(r32);
            emojiEditTextBottomSheetDialogFragment.A0A = C72463Mc.A0c(r22);
        }
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C008803x(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A01(this, super.BQR());
    }
}
