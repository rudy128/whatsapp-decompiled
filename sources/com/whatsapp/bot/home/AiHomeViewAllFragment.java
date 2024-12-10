package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C143257Cr;
import X.C148477hV;
import X.C148487hW;
import X.C148497hX;
import X.C155207sN;
import X.C155217sO;
import X.C18070vi;
import X.C18100vl;
import X.C38251qy;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class AiHomeViewAllFragment extends BotListFragment {
    public final C18100vl A00;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C143257Cr r2 = (C143257Cr) C108945cZ.A0b(this.A04).A06.A06();
        if (r2 != null) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.setTitle(r2.A02);
            }
            C18100vl r1 = this.A00;
            ((AiHomeViewAllViewModel) r1.getValue()).A00 = r2;
            ((AiHomeViewAllViewModel) r1.getValue()).A0T(AnonymousClass000.A1W(bundle));
        }
    }

    public final void A26() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.A00;
        C38251qy r2 = null;
        if (recyclerView != null) {
            r2 = recyclerView.getLayoutManager();
        }
        if ((r2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r2) != null && linearLayoutManager.A1Q() + 3 >= linearLayoutManager.A0K()) {
            ((AiHomeViewAllViewModel) this.A00.getValue()).A0T(false);
        }
    }

    public AiHomeViewAllFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C148487hW(new C148477hV(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiHomeViewAllViewModel.class);
        this.A00 = C99274sY.A00(new C148497hX(A002), new C155217sO(this, A002), new C155207sN(A002), A15);
    }

    public void A1r() {
        super.A1r();
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isChangingConfigurations()) {
            C108945cZ.A0b(this.A04).A06.A0F((Object) null);
        }
    }
}
