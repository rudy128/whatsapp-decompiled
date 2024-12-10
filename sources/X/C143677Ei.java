package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.7Ei  reason: invalid class name and case insensitive filesystem */
public class C143677Ei implements C37661pv {
    public final int A00;
    public final Object A01;

    public C143677Ei(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BAZ(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        if (this.A00 != 0) {
            SearchFragment searchFragment = (SearchFragment) this.A01;
            View view = searchFragment.A0B;
            if (searchFragment.A1n() != null && view != null) {
                C23520Bik A002 = C23520Bik.A00((Context) null, view.findViewById(2131434888), charSequence, 0);
                A002.A0G(charSequence2, onClickListener);
                A002.A0E(AnonymousClass3MZ.A02(searchFragment.A1n(), searchFragment.A1n(), 2130971311, 2131102579));
                A002.A0C(new C114415ql(searchFragment, 1));
                searchFragment.A07 = A002;
                A002.A08();
                return;
            }
            return;
        }
        AnonymousClass01E r3 = (AnonymousClass01E) this.A01;
        if (!r3.isFinishing() && !r3.isDestroyed()) {
            C23520Bik A003 = C23520Bik.A00((Context) null, r3.findViewById(16908290), charSequence, 0);
            A003.A0G(charSequence2, onClickListener);
            A003.A0E(AnonymousClass3Ma.A00(r3, 2130971311, 2131102579));
            A003.A08();
        }
    }
}
