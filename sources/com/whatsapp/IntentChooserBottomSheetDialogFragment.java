package com.whatsapp;

import X.AFE;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3WT;
import X.AnonymousClass86E;
import X.C111655k7;
import X.C1424879q;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C24261Jm;
import X.C27051Un;
import X.C27831Xu;
import X.C70603Bt;
import X.C89464cV;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment implements AnonymousClass86E {
    public int A00;
    public int A01;
    public Bundle A02 = null;
    public C18030ve A03;
    public C27051Un A04;
    public AnonymousClass10I A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public Integer A08;
    public Integer A09 = null;
    public ArrayList A0A;

    public void A1v() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 6849) && this.A00 == 14) {
            this.A05.CGF(new C70603Bt(this, 18));
        }
        super.A1v();
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        View inflate = layoutInflater.inflate(2131625717, viewGroup, false);
        Bundle A15 = A15();
        this.A00 = A15.getInt("request_code");
        ArrayList parcelableArrayList = A15.getParcelableArrayList("choosable_intents");
        C17960vV.A07(parcelableArrayList);
        this.A0A = C17880vN.A10(parcelableArrayList);
        this.A01 = A15.getInt("title_resource");
        if (A15.containsKey("subtitle_resource")) {
            this.A09 = Integer.valueOf(A15.getInt("subtitle_resource"));
        }
        if (A15.containsKey("logging_extras")) {
            this.A02 = A15.getBundle("logging_extras");
        }
        if (A15.containsKey("parent_fragment")) {
            this.A08 = Integer.valueOf(A15.getInt("parent_fragment"));
        }
        TextView A0E = C17880vN.A0E(inflate, 2131436208);
        TextView A0E2 = C17880vN.A0E(inflate, 2131435885);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(inflate, 2131431753);
        A0Q.setLayoutManager(new C111655k7(A14(), this));
        ArrayList arrayList = this.A0A;
        ArrayList A0z = C17880vN.A0z(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C89464cV r1 = (C89464cV) it.next();
            if (r1.A04) {
                A0z.add(r1);
                it.remove();
            }
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(2131436270);
        if (toolbar != null) {
            Drawable A002 = C24261Jm.A00(A14(), 2131231821);
            if (A002 != null) {
                Drawable A022 = C27831Xu.A02(A002);
                C27831Xu.A0C(A022, AnonymousClass3MZ.A09(this).getColor(2131101222));
                toolbar.setNavigationIcon(A022);
                toolbar.setNavigationContentDescription(2131898783);
                toolbar.setNavigationOnClickListener(new AFE(this, 33));
            }
            Iterator it2 = A0z.iterator();
            while (it2.hasNext()) {
                C89464cV r9 = (C89464cV) it2.next();
                Drawable A003 = C24261Jm.A00(A14(), r9.A05);
                if (!(A003 == null || (num = r9.A02) == null)) {
                    A003 = C27831Xu.A02(A003);
                    C27831Xu.A0C(A003, num.intValue());
                }
                toolbar.getMenu().add(0, r9.A00, 0, r9.A06).setIcon(A003).setIntent(r9.A07).setShowAsAction(r9.A01);
            }
            toolbar.A0C = new C1424879q(this, 0);
        }
        A0Q.setAdapter(new AnonymousClass3WT(this, this.A0A));
        A0E.setText(this.A01);
        AnonymousClass1Y5.A0A(A0E, true);
        if (this.A09 == null) {
            A0E2.setVisibility(8);
        } else {
            A0E2.setVisibility(0);
            A0E2.setText(this.A09.intValue());
        }
        if (A2L()) {
            inflate.setBackground((Drawable) null);
        }
        return inflate;
    }
}
