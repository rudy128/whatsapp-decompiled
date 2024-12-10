package X;

import com.whatsapp.search.SearchFragment;

/* renamed from: X.5ql  reason: invalid class name and case insensitive filesystem */
public class C114415ql extends C114375qh {
    public final int A00;
    public final Object A01;

    public C114415ql(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        switch (this.A00) {
            case 1:
                return;
            case 3:
                A00((C23520Bik) obj);
                return;
            default:
                super.A00(obj);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void A01(Object obj, int i) {
        if (1 - this.A00 != 0) {
            A03((C23520Bik) obj, i);
        } else {
            ((SearchFragment) this.A01).A07 = null;
        }
    }
}
