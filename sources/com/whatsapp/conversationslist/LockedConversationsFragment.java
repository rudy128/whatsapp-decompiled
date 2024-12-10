package com.whatsapp.conversationslist;

import X.AnonymousClass02n;
import X.AnonymousClass1BI;
import X.AnonymousClass1RK;
import X.AnonymousClass1TK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass5HF;
import X.AnonymousClass5SF;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C29351c6;
import X.C31191fA;
import X.C39631tO;
import X.C49402Qi;
import X.C70633Bw;
import X.C72453Mb;
import X.C91064f5;
import X.C98284qs;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LockedConversationsFragment extends Hilt_LockedConversationsFragment {
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass02n A03;

    public void A22(Menu menu, MenuInflater menuInflater) {
    }

    public int A26() {
        return 8;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        if (!C17880vN.A1W(C17880vN.A0C(((AnonymousClass1TK) AnonymousClass3MW.A0Y(this.A2x).A0B.get()).A02), "has_suppressed_banner")) {
            Object obj = this.A2x.get();
            AnonymousClass5HF r4 = new AnonymousClass5HF(this);
            Resources A09 = AnonymousClass3MZ.A09(this);
            C18070vi.A0X(A09);
            this.A03 = CDw(new C91064f5(A09, obj, r4, 0), new Object());
        }
        super.A1z(bundle);
    }

    public List A28() {
        if (!AnonymousClass3MW.A0Y(this.A2x).A0L()) {
            return C18460wS.A00;
        }
        ArrayList A0A = this.A1K.A0A();
        ArrayList A0D = C29351c6.A0D(A0A);
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (this.A2R.A0y(A0Q)) {
                this.A2f.CGF(new C70633Bw(this, A0Q, 22));
            }
            A0D.add(new C39631tO(A0Q, 2));
        }
        return A0D;
    }

    public void A2C() {
        if (!C17880vN.A1X(AnonymousClass3MW.A0Y(this.A2x).A05.A01)) {
            int A0D = C72453Mb.A0D(this.A00);
            View view = this.A01;
            if (view != null) {
                view.setVisibility(A0D);
            }
            View view2 = this.A1f.A00;
            if (view2 != null) {
                view2.setVisibility(A0D);
            }
            if (A1B() != null && this.A02 == null) {
                this.A02 = A2L(2131625203);
            }
        } else {
            C72453Mb.A1D(this.A02);
            C72453Mb.A1C(this.A1f.A00);
            C31191fA A0Y = AnonymousClass3MW.A0Y(this.A2x);
            AnonymousClass5SF r3 = new AnonymousClass5SF(this);
            if (C17880vN.A1W(C17880vN.A0C(((AnonymousClass1TK) A0Y.A0B.get()).A02), "has_suppressed_banner")) {
                r3.invoke(C49402Qi.NO_BANNER);
            } else {
                ((AnonymousClass1RK) A0Y.A0D.get()).A04().A09(new C98284qs(A0Y, r3, 1));
            }
        }
        super.A2C();
    }
}
