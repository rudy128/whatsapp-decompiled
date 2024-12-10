package com.whatsapp.community;

import X.AnonymousClass10E;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C008703w;
import X.C22621Co;
import X.C36241nZ;
import X.C40251uP;
import X.C40261uQ;
import X.C72453Mb;
import X.C72483Me;
import X.C84284Iw;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_CommunityNewSubgroupSwitcherBottomSheet extends RoundedBottomSheetDialogFragment {
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
            CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = (CommunityNewSubgroupSwitcherBottomSheet) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r2 = r4.A2Q;
            C72483Me.A0v(r2.A00, communityNewSubgroupSwitcherBottomSheet);
            communityNewSubgroupSwitcherBottomSheet.A0F = C000200d.A00(r2.A1K);
            communityNewSubgroupSwitcherBottomSheet.A0B = (C22621Co) r2.A27.get();
            communityNewSubgroupSwitcherBottomSheet.A0G = C000200d.A00(r2.A2A);
            communityNewSubgroupSwitcherBottomSheet.A0H = C000200d.A00(r2.A2F);
            communityNewSubgroupSwitcherBottomSheet.A0C = AnonymousClass3Ma.A0d(r2);
            communityNewSubgroupSwitcherBottomSheet.A0I = C000200d.A00(r2.A2L);
            communityNewSubgroupSwitcherBottomSheet.A0J = C000200d.A00(r2.A2M);
            AnonymousClass1K1 r3 = r4.A2O;
            communityNewSubgroupSwitcherBottomSheet.A00 = (C84284Iw) r3.A1Z.get();
            communityNewSubgroupSwitcherBottomSheet.A04 = AnonymousClass10E.A4z(r2);
            communityNewSubgroupSwitcherBottomSheet.A05 = AnonymousClass3Ma.A0S(r2);
            communityNewSubgroupSwitcherBottomSheet.A09 = AnonymousClass3MZ.A0i(r2);
            communityNewSubgroupSwitcherBottomSheet.A0D = AnonymousClass3Ma.A0e(r2);
            communityNewSubgroupSwitcherBottomSheet.A02 = (C40251uP) r4.A0R.get();
            communityNewSubgroupSwitcherBottomSheet.A0E = AnonymousClass3MY.A0V(r2);
            communityNewSubgroupSwitcherBottomSheet.A0K = C000200d.A00(r2.A4u);
            communityNewSubgroupSwitcherBottomSheet.A0L = AnonymousClass3MX.A11(r2);
            communityNewSubgroupSwitcherBottomSheet.A0M = C000200d.A00(r2.A7s);
            communityNewSubgroupSwitcherBottomSheet.A01 = (C40261uQ) r3.A1n.get();
            communityNewSubgroupSwitcherBottomSheet.A06 = AnonymousClass3MZ.A0g(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_CommunityNewSubgroupSwitcherBottomSheet.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A2E();
    }
}
