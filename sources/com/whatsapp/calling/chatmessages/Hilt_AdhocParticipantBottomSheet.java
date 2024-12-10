package com.whatsapp.calling.chatmessages;

import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4K0;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.calling.callconfirmationsheet.ui.Hilt_AdhocCallConfirmationSheet;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_AdhocParticipantBottomSheet extends WDSBottomSheetDialogFragment {
    public boolean A00;
    public ContextWrapper A01;
    public boolean A02;

    private void A02() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A02 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (this instanceof Hilt_AdhocCallConfirmationSheet) {
            Hilt_AdhocCallConfirmationSheet hilt_AdhocCallConfirmationSheet = (Hilt_AdhocCallConfirmationSheet) this;
            if (!hilt_AdhocCallConfirmationSheet.A00) {
                hilt_AdhocCallConfirmationSheet.A00 = true;
                C36241nZ r2 = (C36241nZ) AnonymousClass3MX.A0S(hilt_AdhocCallConfirmationSheet);
                AnonymousClass10E r1 = r2.A2Q;
                hilt_AdhocCallConfirmationSheet.A08 = C72473Md.A0U(r1, r1.A00, hilt_AdhocCallConfirmationSheet);
                hilt_AdhocCallConfirmationSheet.A03 = AnonymousClass3MZ.A0N(r1);
                hilt_AdhocCallConfirmationSheet.A04 = (AnonymousClass4K0) r2.A0J.get();
                hilt_AdhocCallConfirmationSheet.A09 = AnonymousClass3MZ.A13(r1);
                hilt_AdhocCallConfirmationSheet.A0A = C000200d.A00(r1.ABV);
            }
        } else if (!this.A00) {
            this.A00 = true;
            AdhocParticipantBottomSheet adhocParticipantBottomSheet = (AdhocParticipantBottomSheet) this;
            C36241nZ r3 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r12 = r3.A2Q;
            adhocParticipantBottomSheet.A08 = C72473Md.A0U(r12, r12.A00, adhocParticipantBottomSheet);
            adhocParticipantBottomSheet.A03 = AnonymousClass3MZ.A0N(r12);
            adhocParticipantBottomSheet.A04 = (AnonymousClass4K0) r3.A0J.get();
            adhocParticipantBottomSheet.A09 = AnonymousClass3MZ.A13(r12);
            adhocParticipantBottomSheet.A0A = C000200d.A00(r12.ABV);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A02) {
            return null;
        }
        A02();
        return this.A01;
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
            android.content.ContextWrapper r0 = r2.A01
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.Hilt_AdhocParticipantBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A02();
        A2E();
    }
}
