package com.whatsapp.conversation;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass2XS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4K6;
import X.C000200d;
import X.C008703w;
import X.C36241nZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentsBottomSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A2E() {
        if (!this.A02) {
            this.A02 = true;
            CommentsBottomSheet commentsBottomSheet = (CommentsBottomSheet) this;
            C36241nZ r5 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r5.A2Q;
            AnonymousClass10G r4 = r2.A00;
            commentsBottomSheet.A0G = C72473Md.A0U(r2, r4, commentsBottomSheet);
            AnonymousClass1K1 r3 = r5.A2O;
            commentsBottomSheet.A0N = C000200d.A00(r3.A06);
            commentsBottomSheet.A0O = C000200d.A00(r3.A5a);
            commentsBottomSheet.A01 = (AnonymousClass4K6) r5.A0a.get();
            commentsBottomSheet.A04 = AnonymousClass10E.A4z(r2);
            commentsBottomSheet.A05 = AnonymousClass3MZ.A0i(r2);
            commentsBottomSheet.A0P = AnonymousClass3MX.A10(r2);
            commentsBottomSheet.A0B = AnonymousClass3MZ.A0m(r2);
            commentsBottomSheet.A0C = AnonymousClass3MZ.A0n(r2);
            commentsBottomSheet.A0F = AnonymousClass3Ma.A0f(r2);
            commentsBottomSheet.A0E = C72463Mc.A0c(r4);
            commentsBottomSheet.A0J = AnonymousClass10E.AIT(r2);
            commentsBottomSheet.A02 = AnonymousClass10E.A12(r2);
            commentsBottomSheet.A0H = AnonymousClass3MY.A0X(r2);
            commentsBottomSheet.A0M = r3.A22();
            commentsBottomSheet.A0Q = AnonymousClass3MZ.A1B(r2);
            commentsBottomSheet.A0D = AnonymousClass3MZ.A0q(r2);
            commentsBottomSheet.A0K = AnonymousClass3MY.A0e(r4);
            commentsBottomSheet.A0R = AnonymousClass3MZ.A1C(r2);
            commentsBottomSheet.A03 = AnonymousClass10E.A17(r2);
            commentsBottomSheet.A00 = (AnonymousClass2XS) r3.A9Y.get();
            commentsBottomSheet.A09 = AnonymousClass3Ma.A0c(r2);
            commentsBottomSheet.A0I = AnonymousClass3Ma.A0r(r2);
            commentsBottomSheet.A07 = AnonymousClass3Ma.A0a(r2);
            commentsBottomSheet.A08 = AnonymousClass10E.A6O(r2);
            commentsBottomSheet.A0L = AnonymousClass10E.AL1(r2);
            commentsBottomSheet.A0A = AnonymousClass10E.A6Q(r2);
        }
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
            r2.A00()
            r2.A2E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.Hilt_CommentsBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
