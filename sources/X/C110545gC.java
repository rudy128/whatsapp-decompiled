package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;

/* renamed from: X.5gC  reason: invalid class name and case insensitive filesystem */
public class C110545gC extends LinearLayout {
    public final TextView A00 = AnonymousClass3Ma.A0E(this, 2131436208);
    public final WaImageView A01 = C108965cb.A0I(this, 2131432093);

    public final void A00(C135676sa r5) {
        this.A00.setText(r5.A02);
        int i = 2131167262;
        if (r5.A01 == 1) {
            i = 2131167263;
        }
        WaImageView waImageView = this.A01;
        waImageView.setLayoutParams(new LinearLayout.LayoutParams(AnonymousClass3Ma.A02(waImageView, i), -2));
        AnonymousClass3Ma.A1B(this, r5, 13);
    }

    public C110545gC(Context context) {
        super(context);
        View.inflate(context, 2131627369, this);
        AnonymousClass3Ma.A18(this, -1, -2);
        setBackgroundResource(2131232942);
        setGravity(16);
        setMinimumHeight(context.getResources().getDimensionPixelOffset(2131168583));
    }

    public final WaImageView getChevron() {
        return this.A01;
    }

    public final TextView getTitle() {
        return this.A00;
    }
}
