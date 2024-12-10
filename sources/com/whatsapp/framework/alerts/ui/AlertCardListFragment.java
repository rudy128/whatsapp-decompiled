package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass12Q;
import X.AnonymousClass1QG;
import X.AnonymousClass3MX;
import X.AnonymousClass3TK;
import X.AnonymousClass5SS;
import X.AnonymousClass8HX;
import X.C18070vi;
import X.C217517g;
import X.C24071It;
import X.C38391rD;
import X.C74473bj;
import X.C91644g1;
import X.C91664g3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class AlertCardListFragment extends Hilt_AlertCardListFragment {
    public AnonymousClass1QG A00;
    public AnonymousClass8HX A01;
    public AnonymousClass3TK A02;
    public RecyclerView A03;
    public final C74473bj A04 = ((C74473bj) AnonymousClass12Q.A01(16463));
    public final AnonymousClass00H A05 = C217517g.A00(16464);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624183, viewGroup, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1rD, X.8HX] */
    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        this.A03 = (RecyclerView) AnonymousClass3MX.A0C(view, 2131427754);
        ArrayList A13 = AnonymousClass000.A13();
        ? r1 = new C38391rD();
        r1.A00 = this;
        r1.A01 = A13;
        r1.A01 = AnonymousClass000.A13();
        this.A01 = r1;
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null) {
            C18070vi.A11("alertsList");
            throw null;
        } else {
            recyclerView.setAdapter(r1);
        }
    }

    public void A1u() {
        super.A1u();
        AnonymousClass3TK r0 = this.A02;
        if (r0 != null) {
            r0.A00.A0E(r0.A01.A04());
            AnonymousClass3TK r02 = this.A02;
            if (r02 != null) {
                C91644g1.A00(this, r02.A00, new AnonymousClass5SS(this), 32);
                return;
            }
        }
        C18070vi.A11("alertListViewModel");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A02 = (AnonymousClass3TK) new C24071It(new C91664g3(this, 3), A1D()).A00(AnonymousClass3TK.class);
    }
}
