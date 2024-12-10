package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.94t  reason: invalid class name and case insensitive filesystem */
public abstract class C1765794t extends AnonymousClass8IR {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09 = AnonymousClass000.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1765794t(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        View view2 = this.A0H;
        this.A06 = AnonymousClass3MW.A0J(view2, 2131431358);
        this.A01 = AnonymousClass3MW.A0C(view2, 2131435068);
        this.A03 = AnonymousClass3MW.A0G(view2, 2131435069);
        this.A05 = AnonymousClass3MW.A0J(view2, 2131435070);
        this.A02 = C108945cZ.A0P(view2, 2131429750);
        this.A04 = AnonymousClass3MX.A0K(view2, 2131432090);
    }

    public void A0C() {
        ViewGroup viewGroup;
        View.OnClickListener onClickListener;
        List list = this.A09;
        int i = 0;
        if (list.size() > 2) {
            viewGroup = this.A01;
            viewGroup.setVisibility(0);
            this.A05.setText(this.A08);
            onClickListener = this.A00;
        } else {
            if (!list.isEmpty()) {
                i = 8;
                this.A01.setVisibility(8);
            } else if (this.A02.getChildCount() <= 0) {
                viewGroup = this.A01;
                viewGroup.setVisibility(0);
                this.A05.setText(this.A07);
                onClickListener = null;
            }
            this.A02.setVisibility(i);
            return;
        }
        viewGroup.setOnClickListener(onClickListener);
    }
}
