package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1L4;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8Eu;
import X.AnonymousClass8F9;
import X.AnonymousClass8ID;
import X.AnonymousClass9VK;
import X.C108945cZ;
import X.C173758vg;
import X.C174168wL;
import X.C17880vN;
import X.C18030ve;
import X.C20334AGq;
import X.C20335AGr;
import X.C22801Dg;
import X.C39711tW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import java.util.ArrayList;
import java.util.Collection;

public class BusinessApiHomeFragment extends Hilt_BusinessApiHomeFragment {
    public RecyclerView A00;
    public AnonymousClass9VK A01;
    public C173758vg A02;
    public AnonymousClass8F9 A03;
    public C18030ve A04;
    public AnonymousClass1L4 A05;
    public AnonymousClass00H A06;
    public final C39711tW A07 = new AnonymousClass8ID(this, 4);

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        A25().A02 = this;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        int i = A15().getInt("arg_home_view_state");
        AnonymousClass8F9 r0 = (AnonymousClass8F9) AnonymousClass8BR.A0C(new AnonymousClass8Eu(bundle, this, this.A01, A15().getString("entrypoint_type"), i), this).A00(AnonymousClass8F9.class);
        this.A03 = r0;
        C20334AGq.A00(this, r0.A0G, 49);
        this.A03.A06.A0A(this, new C20335AGr(this, 0));
    }

    public void A20(Bundle bundle) {
        AnonymousClass8F9 r0 = this.A03;
        r0.A07.A04("arg_home_view_state", Integer.valueOf(r0.A00));
    }

    public void A26() {
        AnonymousClass8F9 r5 = this.A03;
        if (r5.A00 == 0) {
            r5.A00 = 1;
            C22801Dg r4 = r5.A05;
            if (r4.A06() != null) {
                ArrayList A10 = C17880vN.A10((Collection) r4.A06());
                if (A10.isEmpty() || !(A10.get(0) instanceof C174168wL)) {
                    A10.add(0, new C174168wL(r5.A01));
                }
                AnonymousClass3MX.A1J(r5.A0G, 3);
                r4.A0F(A10);
                return;
            }
            return;
        }
        AnonymousClass3MX.A1K(r5.A0G, 4);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(2131624267, viewGroup, false);
        RecyclerView A0U = C108945cZ.A0U(inflate, 2131431475);
        this.A00 = A0U;
        A0U.setPadding(A0U.getPaddingLeft(), 0, this.A00.getPaddingRight(), this.A00.getPaddingBottom());
        this.A00.setLayoutManager(new LinearLayoutManager(A1n(), 1, false));
        if (A15().getInt("arg_home_view_state") == 1) {
            this.A00.A0t(this.A07);
        }
        this.A00.setAdapter(this.A02);
        this.A03.A05.A0A(A1G(), new C20334AGq(this, 47));
        this.A03.A0B.A01.A0A(A1G(), new C20334AGq(this, 48));
        return inflate;
    }

    public void A1r() {
        super.A1r();
        A25().A02 = null;
    }

    public void A1x(Context context) {
        super.A1x(context);
        A25().A02 = this;
    }

    public BusinessApiSearchActivity A25() {
        if (A1D() instanceof BusinessApiSearchActivity) {
            return (BusinessApiSearchActivity) A1D();
        }
        throw AnonymousClass000.A0n("BusinessApiHomeFragment should be attached to BusinessApiSearchActivity");
    }
}
