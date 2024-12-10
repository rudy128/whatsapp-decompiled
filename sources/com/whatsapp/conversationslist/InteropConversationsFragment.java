package com.whatsapp.conversationslist;

import X.AnonymousClass10I;
import X.AnonymousClass18K;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass2DK;
import X.AnonymousClass3I8;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C18110vm;
import X.C24791Lr;
import X.C24921Me;
import X.C37291pH;
import X.C37451pZ;
import X.C37551pj;
import X.C37611pq;
import X.C39541tF;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public final class InteropConversationsFragment extends Hilt_InteropConversationsFragment {
    public final C18100vl A00 = new C18110vm(AnonymousClass3I8.A00);

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass10I r12 = this.A2f;
        C18070vi.A0W(r12);
        AnonymousClass18K r9 = this.A27;
        C18070vi.A0W(r9);
        AnonymousClass1M9 r3 = this.A18;
        C18070vi.A0W(r3);
        C24921Me r4 = this.A1A;
        C18070vi.A0W(r4);
        C18000vb r8 = this.A1t;
        C18070vi.A0W(r8);
        C24791Lr r5 = this.A1C;
        C18070vi.A0W(r5);
        C37551pj r2 = (C37551pj) C18070vi.A0E(this.A2m);
        C37451pZ r6 = this.A1D;
        C18070vi.A0W(r6);
        AnonymousClass2DK r1 = new AnonymousClass2DK(r2, r3, r4, r5, r6, this, r8, r9, (C39541tF) C18070vi.A0E(this.A3E), (C37611pq) C18070vi.A0E(this.A3Y), r12, ((C37291pH) this.A3S.get()).A01.A0A(20240306));
        this.A1d = r1;
        r1.A01 = false;
    }

    public boolean A24(MenuItem menuItem) {
        Intent A0A;
        C18070vi.A0d(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == 2131436118) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                this.A3c.get();
                A0A = AnonymousClass1LU.A09(A1B);
            }
            return true;
        } else if (itemId != 2131436117) {
            return super.A24(menuItem);
        } else {
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 != null) {
                this.A3c.get();
                A0A = C17880vN.A0A();
                A0A.setClassName(A1B2.getPackageName(), "com.whatsapp.blocklist.BlockList");
            }
            return true;
        }
        A1k(A0A);
        return true;
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0h(menu, menuInflater);
        menuInflater.inflate(2131820597, menu);
    }
}
