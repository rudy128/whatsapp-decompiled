package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.28k  reason: invalid class name and case insensitive filesystem */
public final class C453028k extends C42011xT {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final /* synthetic */ AnonymousClass28H A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C453028k(View view, AnonymousClass28H r7) {
        super(view);
        this.A03 = r7;
        View findViewById = view.findViewById(2131436091);
        C18070vi.A0X(findViewById);
        TextView textView = (TextView) findViewById;
        this.A01 = textView;
        View findViewById2 = view.findViewById(2131436512);
        C18070vi.A0X(findViewById2);
        this.A02 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(2131429509);
        C18070vi.A0X(findViewById3);
        this.A00 = (LinearLayout) findViewById3;
        textView.setMaxWidth(C22339B3q.A00(((double) Resources.getSystem().getDisplayMetrics().widthPixels) * 0.6d));
    }
}
