package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaEditText;
import com.whatsapp.expressions.BaseExpressionsTray;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.4nA  reason: invalid class name and case insensitive filesystem */
public class C96014nA implements C1605588y {
    public final /* synthetic */ AnonymousClass4aY A00;

    public C96014nA(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public void CAy(String str) {
        String str2;
        AnonymousClass4aY r3 = this.A00;
        BaseExpressionsTray baseExpressionsTray = r3.A3C;
        if (baseExpressionsTray == null || !baseExpressionsTray.A1e()) {
            int A01 = AnonymousClass4aY.A01(r3);
            if (!C18020vd.A05(C18040vf.A02, r3.A3F, 3403) || !r3.A6k) {
                str2 = null;
            } else {
                str2 = r3.A3Z.getStringText();
                A01 = 8;
            }
            ExpressionsSearchView A002 = r3.A3E.A00(str2, A01);
            r3.A3C = A002;
            A002.A0L = r3.A3R;
            A002.A0R = str;
            A002.A0N = r3.A7l;
            A002.A0J = new C96144nN(r3);
            A002.A0E = new C95964n5(this);
            C34001jj r2 = new C34001jj(AnonymousClass3MW.A0K(r3));
            r2.A0B(r3.A3C, "expressions_search_dialog_fragment");
            r2.A02();
            return;
        }
        ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) r3.A3C;
        expressionsSearchView.A0S = true;
        WaEditText waEditText = expressionsSearchView.A0B;
        if (waEditText != null) {
            waEditText.setText(str);
            waEditText.clearFocus();
        }
    }

    public void CNn() {
        AnonymousClass4aY r3 = this.A00;
        BottomSheetBehavior bottomSheetBehavior = r3.A0i;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            AnonymousClass4aY.A12(r3);
            return;
        }
        r3.A70 = true;
        bottomSheetBehavior.A0W(4);
    }
}
