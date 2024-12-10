package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.3Za  reason: invalid class name and case insensitive filesystem */
public abstract class C74233Za extends C42011xT {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;

    public void A0B(AnonymousClass4SJ r5, C86884Tl r6) {
        C18070vi.A0d(r6, 0);
        TextView textView = this.A02;
        C89514ca r1 = r6.A01;
        textView.setText(r1.A03);
        String str = r1.A04;
        r5.A00(AnonymousClass03S.A01(this.A00.getContext(), 2131233676), this.A01, str);
    }

    public C74233Za(View view) {
        super(view);
        this.A00 = view;
        this.A02 = C72453Mb.A0W(view, 2131431835);
        this.A01 = (ImageView) AnonymousClass3MX.A0C(view, 2131431833);
    }
}
