package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass3Ma;
import X.AnonymousClass86X;
import X.C138816xk;
import X.C138826xl;
import X.C18070vi;
import X.C19760yx;
import X.C199029zJ;
import X.C26209Cul;
import X.C34001jj;
import X.C72473Md;
import X.CXY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.wabloks.base.BkFragment;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.Stack;

public final class BkBottomSheetContainerFragment extends Hilt_BkBottomSheetContainerFragment {
    public C19760yx A00;
    public AnonymousClass86X A01;
    public AnonymousClass00H A02;
    public LinearLayout A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627507, viewGroup, false);
        this.A03 = (LinearLayout) AnonymousClass1HF.A06(inflate, 2131436949);
        C19760yx r0 = this.A00;
        if (!(r0 == null || (obj = r0.A00) == null || (obj2 = r0.A01) == null)) {
            A2M((BkFragment) obj, (String) obj2, false, false);
        }
        return inflate;
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || !bundle2.getBoolean("restore_saved_instance", false)) {
            C34001jj A0H = AnonymousClass3Ma.A0H(A1D());
            A0H.A07(this);
            A0H.A02();
        }
        super.A20(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        if (this.A01 != null) {
            AnonymousClass1FL A1D = A1D();
            C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.wabloks.ui.WaBloksActivity");
            WaBloksActivity waBloksActivity = (WaBloksActivity) A1D;
            AnonymousClass86X r1 = this.A01;
            if (!(r1 == null || r1.BM3() == null)) {
                CXY cxy = waBloksActivity.A01;
                C26209Cul.A05(C199029zJ.A01, r1.BM3(), cxy);
            }
        }
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            ((C138826xl) r0.get()).A00(A1D());
            Stack stack = C138816xk.A01;
            if (!stack.isEmpty()) {
                stack.pop();
            }
            super.onDismiss(dialogInterface);
            return;
        }
        C18070vi.A11("bkBottomSheetManagerFactory");
        throw null;
    }

    public final void A2M(BkFragment bkFragment, String str, boolean z, boolean z2) {
        Integer valueOf;
        C18070vi.A0h(bkFragment, str);
        LinearLayout linearLayout = this.A03;
        if (linearLayout != null && (valueOf = Integer.valueOf(linearLayout.getId())) != null) {
            AnonymousClass1GP A1E = A1E();
            C18070vi.A0X(A1E);
            C34001jj r1 = new C34001jj(A1E);
            if (z) {
                r1.A0H(str);
            }
            if (z2) {
                C72473Md.A19(r1);
            }
            r1.A0D(bkFragment, str, valueOf.intValue());
            r1.A01();
        }
    }
}
