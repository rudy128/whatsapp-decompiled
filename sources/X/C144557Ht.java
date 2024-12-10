package X;

import com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel;
import java.util.List;

/* renamed from: X.7Ht  reason: invalid class name and case insensitive filesystem */
public final class C144557Ht implements AnonymousClass87D {
    public final /* synthetic */ GifExpressionsSearchViewModel A00;

    public C144557Ht(GifExpressionsSearchViewModel gifExpressionsSearchViewModel) {
        this.A00 = gifExpressionsSearchViewModel;
    }

    public void C3w(C133816pX r5) {
        Object obj;
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GifExpressionsSearchViewModel/handleResult/ size=");
        List list = r5.A04;
        A10.append(list.size());
        A10.append(" isFailed=");
        C17900vP.A0r(A10, r5.A01);
        if (r5.A01) {
            obj = AnonymousClass601.A00;
        } else if (list.size() == 0) {
            obj = C117545zy.A00;
        } else {
            obj = C117555zz.A00;
        }
        C17900vP.A0Y(obj, "GifExpressionsSearchViewModel/setGifExpressionsViewState/", AnonymousClass000.A10());
        gifExpressionsSearchViewModel.A02.A0F(obj);
    }
}
