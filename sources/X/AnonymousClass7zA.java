package X;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7zA  reason: invalid class name */
public final class AnonymousClass7zA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zA(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
        CoordinatorLayout coordinatorLayout = searchFunStickersBottomSheet.A05;
        if (coordinatorLayout != null) {
            C23520Bik A01 = C23520Bik.A01(coordinatorLayout, 2131890559, 0);
            BIE bie = A01.A0J;
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bie);
            int dimensionPixelSize = AnonymousClass3MZ.A09(searchFunStickersBottomSheet).getDimensionPixelSize(2131168774);
            A0P.setMargins(dimensionPixelSize, A0P.topMargin, dimensionPixelSize, AnonymousClass3MZ.A09(searchFunStickersBottomSheet).getDimensionPixelSize(2131168777));
            bie.setLayoutParams(A0P);
            A01.A08();
        }
        return C27621Wu.A00;
    }
}
