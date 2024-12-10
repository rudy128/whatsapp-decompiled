package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4fn  reason: invalid class name and case insensitive filesystem */
public class C91504fn implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C91504fn(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final void Bo9(Object obj) {
        int i;
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            String str = this.A03;
            TextView textView = (TextView) this.A02;
            AnonymousClass6TT r6 = (AnonymousClass6TT) obj;
            if ((r6 instanceof C119886Ah) && (i = ((C119886Ah) r6).A00) >= 0) {
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass000.A1L(A1a, i);
                str = context.getString(2131896065, A1a);
            }
            textView.setText(str);
            return;
        }
        String str2 = this.A03;
        C88454Zt.A01((View) this.A02, (C88454Zt) this.A01, str2);
    }
}
