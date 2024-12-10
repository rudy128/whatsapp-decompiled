package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.6C1  reason: invalid class name */
public class AnonymousClass6C1 extends AnonymousClass8IR {
    public final ImageView A00;
    public final TextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6C1(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = AnonymousClass3MW.A0G(view, 2131431496);
        this.A01 = AnonymousClass3MW.A0J(view, 2131436044);
    }

    public void A0B(C183409Yd r6) {
        AnonymousClass6C6 r62 = (AnonymousClass6C6) r6;
        ImageView imageView = this.A00;
        View view = this.A0H;
        AnonymousClass4aX.A0B(view.getContext(), imageView, r62.A00, r62.A01);
        this.A01.setText(r62.A02);
        view.setOnClickListener(r62.A03);
    }
}
