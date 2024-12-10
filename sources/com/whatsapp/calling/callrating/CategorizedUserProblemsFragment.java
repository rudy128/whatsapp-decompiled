package com.whatsapp.calling.callrating;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1KW;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass487;
import X.AnonymousClass4T7;
import X.C101495Cv;
import X.C101505Cw;
import X.C101515Cx;
import X.C1418577f;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C38391rD;
import X.C72453Mb;
import X.C85644Oe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.ArrayList;

public final class CategorizedUserProblemsFragment extends Hilt_CategorizedUserProblemsFragment {
    public AnonymousClass00H A00;
    public View A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C101495Cv(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C101505Cw(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C101515Cx(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624450, false);
    }

    public void A21(Bundle bundle, View view) {
        View view2 = view;
        C18070vi.A0d(view2, 0);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view2, 2131436642);
        int i = 0;
        AnonymousClass1Xr.A05(A0Q, false);
        AnonymousClass3Ma.A15(view2.getContext(), A0Q);
        A0Q.setAdapter((C38391rD) this.A03.getValue());
        View findViewById = view2.findViewById(2131436640);
        C18100vl r5 = this.A04;
        CallRatingViewModel A0Z = AnonymousClass3MX.A0Z(r5);
        int A0I = C72453Mb.A0I(this.A02);
        ArrayList arrayList = A0Z.A0D;
        if (A0I >= arrayList.size() || ((AnonymousClass4T7) arrayList.get(A0I)).A00 != AnonymousClass00R.A0C) {
            i = 8;
        } else {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                C85644Oe r4 = (C85644Oe) r0.get();
                WaEditText waEditText = (WaEditText) AnonymousClass3MX.A0C(view2, 2131436639);
                CallRatingViewModel A0Z2 = AnonymousClass3MX.A0Z(r5);
                C72453Mb.A1H(waEditText, new C1418577f[C18070vi.A17(waEditText, A0Z2)], EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0);
                C18030ve r12 = r4.A04;
                AnonymousClass1KW r11 = r4.A03;
                waEditText.addTextChangedListener(new AnonymousClass487(waEditText, A0Z2, r4.A00, r4.A01, r4.A02, r11, r12, r4.A05));
            } else {
                C18070vi.A11("userFeedbackTextFilter");
                throw null;
            }
        }
        findViewById.setVisibility(i);
        this.A01 = findViewById;
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
    }
}
