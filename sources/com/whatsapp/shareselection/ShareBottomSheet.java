package com.whatsapp.shareselection;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C100955Aj;
import X.C18000vb;
import X.C18070vi;
import X.C73513Wg;
import X.C91634g0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class ShareBottomSheet extends Hilt_ShareBottomSheet {
    public RecyclerView A00;
    public C18000vb A01;
    public C73513Wg A02;
    public ShareActionsViewModel A03;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = (RecyclerView) AnonymousClass1HF.A06(view, 2131435382);
        ShareActionsViewModel shareActionsViewModel = (ShareActionsViewModel) AnonymousClass3MW.A0N(this).A00(ShareActionsViewModel.class);
        shareActionsViewModel.A0T();
        C91634g0.A00(this, shareActionsViewModel.A01, new C100955Aj(this, 10), 36);
        this.A03 = shareActionsViewModel;
        Context A14 = A14();
        C18000vb r0 = this.A01;
        if (r0 != null) {
            C73513Wg r1 = new C73513Wg(A14, r0, shareActionsViewModel);
            this.A02 = r1;
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setAdapter(r1);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public int A2F() {
        return 2131626941;
    }
}
