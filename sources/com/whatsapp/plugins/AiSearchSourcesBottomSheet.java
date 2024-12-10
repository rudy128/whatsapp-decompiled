package com.whatsapp.plugins;

import X.AnonymousClass1DF;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3TZ;
import X.AnonymousClass4KD;
import X.AnonymousClass4aU;
import X.AnonymousClass5JS;
import X.AnonymousClass5JT;
import X.AnonymousClass5JU;
import X.AnonymousClass8HT;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C38391rD;
import X.C89964dJ;
import X.C91774gE;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class AiSearchSourcesBottomSheet extends Hilt_AiSearchSourcesBottomSheet {
    public AnonymousClass4KD A00;
    public AnonymousClass3TZ A01;
    public AnonymousClass8HT A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5JS(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5JT(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new AnonymousClass5JU(this));

    public void A21(Bundle bundle, View view) {
        ArrayList A042;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C89964dJ.A00(AnonymousClass3MW.A0A(this.A03), this, 4);
        AnonymousClass1Y5.A0A(AnonymousClass3MW.A0A(this.A05), true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n());
        linearLayoutManager.A1Z(1);
        C18100vl r1 = this.A04;
        ((RecyclerView) r1.getValue()).setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = (RecyclerView) r1.getValue();
        AnonymousClass8HT r0 = this.A02;
        if (r0 != null) {
            recyclerView.setAdapter(r0);
            Bundle bundle2 = this.A06;
            if (bundle2 != null && (A042 = AnonymousClass4aU.A04(bundle2)) != null) {
                AnonymousClass4KD r12 = this.A00;
                if (r12 != null) {
                    this.A01 = (AnonymousClass3TZ) C91774gE.A00(this, r12, A042, 16).A00(AnonymousClass3TZ.class);
                    AnonymousClass3MX.A1Q(new AiSearchSourcesBottomSheet$onViewCreated$1(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
                    return;
                }
                C18070vi.A11("searchSourceViewModelFactory");
                throw null;
            }
            return;
        }
        C18070vi.A11("searchSourcesAdapter");
        throw null;
    }

    public void A1s() {
        ((RecyclerView) this.A04.getValue()).setAdapter((C38391rD) null);
        super.A1s();
    }

    public int A2F() {
        return 2131624320;
    }
}
