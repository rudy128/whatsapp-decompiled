package com.whatsapp.conversationslist;

import X.AnonymousClass1FL;
import X.C17880vN;
import X.C89924dF;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ArchivedConversationsFragment extends Hilt_ArchivedConversationsFragment {
    public View A00;

    public void A22(Menu menu, MenuInflater menuInflater) {
        if (!this.A1s.A2Q() || this.A0s.A0N()) {
            super.A22(menu, menuInflater);
        } else {
            menu.add(1, 2131432529, 0, 2131886731);
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432529) {
            return super.A24(menuItem);
        }
        AnonymousClass1FL A1B = A1B();
        if (A1B == null) {
            return true;
        }
        A1k(C17880vN.A0A().setClassName(A1B.getPackageName(), "com.whatsapp.conversationslist.ArchiveNotificationSettingActivity"));
        return true;
    }

    public void A29() {
        AnonymousClass1FL A1B;
        super.A29();
        if (this.A1K.A02() == 0 && (A1B = A1B()) != null) {
            A1B.finish();
        }
    }

    public void A2C() {
        super.A2C();
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.A1s.A2Q() && !this.A0s.A0N()) {
            if (this.A00 == null) {
                View A2L = A2L(2131624216);
                this.A00 = A2L;
                A2L.setOnClickListener(new C89924dF(this, 11));
            }
            TextView A0E = C17880vN.A0E(this.A00, 2131436208);
            int i = 2131886739;
            if (this.A1s.A2R()) {
                i = 2131886738;
            }
            A0E.setText(i);
            this.A00.setVisibility(0);
        }
    }
}
