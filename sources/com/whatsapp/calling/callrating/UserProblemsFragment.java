package com.whatsapp.calling.callrating;

import X.AnonymousClass1DF;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4T7;
import X.C101525Cy;
import X.C18070vi;
import X.C18100vl;
import X.C29351c6;
import X.C73243Sw;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;
import java.util.Iterator;

public final class UserProblemsFragment extends WaFragment {
    public int A00 = -1;
    public ViewPager A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C101525Cy(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624449, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        C18070vi.A0d(view, 0);
        C18100vl r6 = this.A02;
        AnonymousClass3MX.A1J(AnonymousClass3MX.A0Z(r6).A05, 2131889888);
        ViewPager viewPager = (ViewPager) AnonymousClass1HF.A06(view, 2131436643);
        viewPager.getLayoutParams().height = (int) (((double) AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels) * 0.5d);
        AnonymousClass1GP A1E = A1E();
        C18070vi.A0X(A1E);
        ArrayList arrayList = AnonymousClass3MX.A0Z(r6).A0D;
        ArrayList A0D = C29351c6.A0D(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Context context = view.getContext();
            switch (((AnonymousClass4T7) it.next()).A00.intValue()) {
                case 0:
                    i = 2131887850;
                    break;
                case 1:
                    i = 2131887614;
                    break;
                default:
                    i = 2131887813;
                    break;
            }
            A0D.add(C18070vi.A0F(context, i));
        }
        viewPager.setAdapter(new C73243Sw(A1E, A0D));
        this.A01 = viewPager;
        ((TabLayout) AnonymousClass1HF.A06(view, 2131436000)).setupWithViewPager(this.A01);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A00 != configuration.orientation) {
            ViewPager viewPager = this.A01;
            if (viewPager != null) {
                viewPager.getLayoutParams().height = (int) (((double) AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels) * 0.5d);
                viewPager.requestLayout();
            }
            this.A00 = configuration.orientation;
        }
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
    }
}
