package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.5nO  reason: invalid class name and case insensitive filesystem */
public class C113625nO extends C42011xT implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C112135kz A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113625nO(View view, C112135kz r3) {
        super(view);
        this.A05 = r3;
        this.A01 = view;
        this.A00 = view.findViewById(2131430861);
        this.A02 = AnonymousClass3MW.A0H(view, 2131430862);
        this.A04 = (SelectionCheckView) view.findViewById(2131435130);
        this.A03 = C17880vN.A0E(view, 2131430855);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        int A052 = A05();
        if (A052 == -1) {
            return;
        }
        if (A052 <= 0 || this.A05.A01[A052 - 1] != null) {
            AnonymousClass740 r3 = this.A05.A09;
            if (A052 != r3.A01) {
                r3.A08(new AnonymousClass7RM((Object) this, A052, 15), new AnonymousClass7RM((Object) this, A052, 16), A052);
            }
        }
    }
}
