package com.whatsapp.bot.home;

import X.AnonymousClass118;
import X.AnonymousClass1FL;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass7AT;
import X.AnonymousClass7D2;
import X.AnonymousClass831;
import X.C108945cZ;
import X.C112705lu;
import X.C115105tP;
import X.C128296fl;
import X.C131346kw;
import X.C148397hN;
import X.C148407hO;
import X.C155167sJ;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C24921Me;
import X.C37801q9;
import X.C57642jP;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;

public final class AiHomeFragment extends Hilt_AiHomeFragment {
    public C131346kw A00;
    public C57642jP A01;
    public C24921Me A02;
    public AnonymousClass118 A03;
    public final C18100vl A04;
    public final Map A05 = C17880vN.A13();

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setTitle(2131886620);
        }
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(view, 2131432249);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n());
        recyclerView.setLayoutManager(linearLayoutManager);
        C18100vl r2 = this.A04;
        List list = C108945cZ.A0b(r2).A0E;
        C37801q9 A1G = A1G();
        C131346kw r0 = this.A00;
        if (r0 != null) {
            C128296fl r9 = new C128296fl(A1G, r0);
            C57642jP r8 = this.A01;
            if (r8 != null) {
                C115105tP r7 = new C115105tP(r8, r9, new AnonymousClass7D2(this, 0), list, this.A05);
                recyclerView.setAdapter(r7);
                AnonymousClass7AT.A01(A1G(), C108945cZ.A0b(r2).A01, new AnonymousClass831(linearLayoutManager, recyclerView, this, r7), 6);
                recyclerView.A0t(new C112705lu(linearLayoutManager, this, 0));
                return;
            }
            str = "aiHomeUtil";
        } else {
            str = "botPhotoLoaderFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public AiHomeFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiHomeViewModel.class);
        this.A04 = C99274sY.A00(new C148397hN(this), new C148407hO(this), new C155167sJ(this), A15);
    }
}
