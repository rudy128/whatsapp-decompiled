package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.expressions.BaseExpressionsTray;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.7GK  reason: invalid class name */
public final class AnonymousClass7GK implements C1605588y {
    public final /* synthetic */ AnonymousClass74J A00;

    public AnonymousClass7GK(AnonymousClass74J r1) {
        this.A00 = r1;
    }

    public void CAy(String str) {
        AnonymousClass74J r3 = this.A00;
        ExpressionsSearchView A002 = r3.A0R.A00((String) null, r3.A0C());
        r3.A0B = A002;
        if (str != null) {
            A002.A0R = str;
        }
        A002.A0E = new AnonymousClass7GG(r3);
        AnonymousClass875 r0 = r3.A0C;
        if (r0 != null) {
            r0.CNG(A002);
        }
        BaseExpressionsTray baseExpressionsTray = r3.A0B;
        if (baseExpressionsTray != null) {
            ExpressionsSearchView expressionsSearchView = (ExpressionsSearchView) baseExpressionsTray;
            expressionsSearchView.A0N = r3.A0H;
            expressionsSearchView.A0J = r3.A0F;
        }
    }

    public void CNn() {
        AnonymousClass74J r3 = this.A00;
        BottomSheetBehavior bottomSheetBehavior = r3.A06;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            AnonymousClass74J.A06(r3);
            return;
        }
        r3.A0L = true;
        bottomSheetBehavior.A0W(4);
    }
}
