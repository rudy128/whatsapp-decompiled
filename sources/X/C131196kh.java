package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.6kh  reason: invalid class name and case insensitive filesystem */
public final class C131196kh {
    public ExpressionsSearchView A00(String str, int i) {
        ExpressionsSearchView expressionsSearchView = new ExpressionsSearchView();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("arg_search_opener", i);
        A0D.putString("contextual_suggestion_query", str);
        expressionsSearchView.A1R(A0D);
        return expressionsSearchView;
    }
}
