package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.5wx  reason: invalid class name and case insensitive filesystem */
public class C116315wx extends C34171k3 {
    public final int A00;
    public final Object A01;

    public C116315wx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(AnonymousClass1BI r5) {
        C29681ch r52;
        switch (this.A00) {
            case 0:
                PopupNotification popupNotification = (PopupNotification) this.A01;
                AnonymousClass1E7 r0 = popupNotification.A0i;
                if (r0 != null && r5 != null && r5.equals(r0.A0J) && !C22971Dz.A0e(r5)) {
                    String A02 = popupNotification.A0A.A02(popupNotification.A0i, true);
                    boolean isEmpty = TextUtils.isEmpty(A02);
                    TextView textView = popupNotification.A08;
                    if (isEmpty) {
                        textView.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(0);
                    popupNotification.A08.setText(A02);
                    return;
                }
                return;
            case 1:
                SearchFragment.A03(r5, (SearchFragment) this.A01);
                return;
            default:
                C18070vi.A0d(r5, 0);
                C131026kO r1 = (C131026kO) this.A01;
                if ((r5 instanceof C29681ch) && (r52 = (C29681ch) r5) != null) {
                    r1.A0A.A0W(r52, (Integer) null);
                    return;
                }
                return;
        }
    }
}
