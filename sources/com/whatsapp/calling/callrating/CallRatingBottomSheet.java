package com.whatsapp.calling.callrating;

import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass86E;
import X.C101475Ct;
import X.C105065Qo;
import X.C105075Qp;
import X.C18070vi;
import X.C18100vl;
import X.C28281Zt;
import X.C72463Mc;
import X.C74503bm;
import X.C89874dA;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class CallRatingBottomSheet extends BottomSheetDialogFragment implements AnonymousClass86E {
    public View A00;
    public WaTextView A01;
    public NonDraggableBottomSheetBehaviour A02;
    public WDSButton A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C101475Ct(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624448, viewGroup);
        if (inflate == null) {
            return null;
        }
        View[] viewArr = new View[2];
        viewArr[0] = AnonymousClass1HF.A06(inflate, 2131429138);
        Iterator it = C18070vi.A0O(AnonymousClass1HF.A06(inflate, 2131433187), viewArr, 1).iterator();
        while (it.hasNext()) {
            C89874dA.A00(AnonymousClass3MX.A0E(it), this, 35);
        }
        this.A01 = AnonymousClass3MW.A0T(inflate, 2131436243);
        this.A00 = AnonymousClass1HF.A06(inflate, 2131428345);
        WDSButton A0q = AnonymousClass3MW.A0q(inflate, 2131435883);
        C89874dA.A00(A0q, this, 36);
        this.A03 = A0q;
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(AnonymousClass1HF.A06(inflate, 2131428345));
        C18070vi.A0z(A022, "null cannot be cast to non-null type com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour<@[FlexibleNullability] android.view.View?>");
        NonDraggableBottomSheetBehaviour nonDraggableBottomSheetBehaviour = (NonDraggableBottomSheetBehaviour) A022;
        nonDraggableBottomSheetBehaviour.A0W(3);
        nonDraggableBottomSheetBehaviour.A0d(true);
        nonDraggableBottomSheetBehaviour.A0c(true);
        nonDraggableBottomSheetBehaviour.A0h = false;
        nonDraggableBottomSheetBehaviour.A00 = false;
        this.A02 = nonDraggableBottomSheetBehaviour;
        Dialog dialog = this.A03;
        if (dialog != null) {
            C28281Zt.A03(2131102739, dialog);
        }
        C18100vl r5 = this.A04;
        AnonymousClass3MY.A1K(A1G(), AnonymousClass3MX.A0Z(r5).A06, new C105065Qo(this), 20);
        AnonymousClass3MY.A1K(A1G(), AnonymousClass3MX.A0Z(r5).A04, new C105075Qp(this), 20);
        AnonymousClass3MY.A1K(A1G(), AnonymousClass3MX.A0Z(r5).A05, AnonymousClass3MW.A16(this, 4), 20);
        return inflate;
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public void A1v() {
        super.A1v();
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C72463Mc.A0L(A17()));
        C18070vi.A0X(A022);
        A022.A0W(3);
    }

    public void A1z(Bundle bundle) {
        Window window;
        super.A1z(bundle);
        A2A(0, 2132083058);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && (window = A1B.getWindow()) != null) {
            window.setStatusBarColor(0);
        }
    }

    public Dialog A27(Bundle bundle) {
        return new C74503bm(A14(), AnonymousClass3MX.A0Z(this.A04), A25());
    }
}
