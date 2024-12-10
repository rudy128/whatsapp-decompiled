package com.whatsapp.conversation.comments;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C25241Nl;
import X.C32091gc;
import X.C32981i4;
import X.C36241nZ;
import X.C72453Mb;
import X.C72473Md;
import X.C87794Wz;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_CommentActionsBottomSheet extends WDSBottomSheetDialogFragment {
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
            CommentActionsBottomSheet commentActionsBottomSheet = (CommentActionsBottomSheet) this;
            AnonymousClass10E r2 = ((C36241nZ) AnonymousClass3MX.A0S(this)).A2Q;
            AnonymousClass10G r3 = r2.A00;
            commentActionsBottomSheet.A0M = C72473Md.A0U(r2, r3, commentActionsBottomSheet);
            commentActionsBottomSheet.A0V = C000200d.A00(r2.A0s);
            commentActionsBottomSheet.A0W = C000200d.A00(r2.A13);
            commentActionsBottomSheet.A00 = AnonymousClass3MZ.A0M(r2.A13);
            commentActionsBottomSheet.A0B = AnonymousClass3MZ.A0h(r2);
            commentActionsBottomSheet.A0G = AnonymousClass3Ma.A0d(r2);
            commentActionsBottomSheet.A0J = AnonymousClass3MZ.A0r(r2);
            commentActionsBottomSheet.A08 = AnonymousClass10E.A4z(r2);
            commentActionsBottomSheet.A0K = (C32981i4) r2.A3G.get();
            commentActionsBottomSheet.A0L = AnonymousClass3Ma.A0f(r2);
            commentActionsBottomSheet.A0X = AnonymousClass3MX.A12(r2);
            commentActionsBottomSheet.A01 = AnonymousClass10E.A12(r2);
            commentActionsBottomSheet.A0H = AnonymousClass3MY.A0V(r2);
            commentActionsBottomSheet.A0Y = C000200d.A00(r2.A7f);
            commentActionsBottomSheet.A0Z = C000200d.A00(r2.A5R);
            commentActionsBottomSheet.A0a = C000200d.A00(r2.A5S);
            commentActionsBottomSheet.A0I = AnonymousClass3MZ.A0q(r2);
            commentActionsBottomSheet.A0d = AnonymousClass3MZ.A1B(r2);
            commentActionsBottomSheet.A0e = AnonymousClass3MZ.A1C(r2);
            commentActionsBottomSheet.A06 = AnonymousClass10E.A17(r2);
            commentActionsBottomSheet.A0Q = (C32091gc) r2.A6G.get();
            commentActionsBottomSheet.A0b = C000200d.A00(r2.A6V);
            commentActionsBottomSheet.A0R = (C87794Wz) r3.ADP.get();
            commentActionsBottomSheet.A0S = AnonymousClass3Ma.A0r(r2);
            commentActionsBottomSheet.A0P = AnonymousClass3Ma.A0k(r2);
            commentActionsBottomSheet.A0c = C000200d.A00(r2.AAd);
            commentActionsBottomSheet.A0C = AnonymousClass3Ma.A0a(r2);
            commentActionsBottomSheet.A0D = AnonymousClass10E.A6O(r2);
            commentActionsBottomSheet.A07 = AnonymousClass3MZ.A0U(r2);
            commentActionsBottomSheet.A09 = AnonymousClass3MZ.A0f(r2);
            commentActionsBottomSheet.A0A = AnonymousClass3MZ.A0g(r2);
            commentActionsBottomSheet.A0E = AnonymousClass3Ma.A0c(r2);
            commentActionsBottomSheet.A0U = AnonymousClass10E.AL1(r2);
            commentActionsBottomSheet.A0N = AnonymousClass3Ma.A0g(r2);
            commentActionsBottomSheet.A0O = (C25241Nl) r2.ABr.get();
            commentActionsBottomSheet.A0F = AnonymousClass10E.A6Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.comments.Hilt_CommentActionsBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
