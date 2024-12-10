package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass10E;
import X.AnonymousClass1K1;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_AudioChatBottomSheetDialog extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A02() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            AudioChatBottomSheetDialog audioChatBottomSheetDialog = (AudioChatBottomSheetDialog) this;
            C36241nZ r1 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r1.A2Q;
            audioChatBottomSheetDialog.A09 = C72473Md.A0U(r2, r2.A00, audioChatBottomSheetDialog);
            audioChatBottomSheetDialog.A03 = AnonymousClass3MZ.A0N(r2);
            AnonymousClass1K1 r12 = r1.A2O;
            audioChatBottomSheetDialog.A0H = C000200d.A00(r12.A0O);
            audioChatBottomSheetDialog.A0I = C000200d.A00(r12.A0P);
            audioChatBottomSheetDialog.A07 = (AnonymousClass1V9) r2.A1e.get();
            audioChatBottomSheetDialog.A04 = AnonymousClass10E.A17(r2);
            audioChatBottomSheetDialog.A0J = AnonymousClass3MX.A11(r2);
            audioChatBottomSheetDialog.A0G = AnonymousClass10E.AL1(r2);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A02();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1p(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A02()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.Hilt_AudioChatBottomSheetDialog.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A02();
        A2E();
    }
}
