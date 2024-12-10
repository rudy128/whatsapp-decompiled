package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.6FV  reason: invalid class name */
public abstract class AnonymousClass6FV extends C116435xG {
    public WaImageView A00;
    public WaImageView A01;
    public View A02;
    public LinearLayout A03;

    public abstract int getMark();

    public int getMarkTintColor() {
        return -1;
    }

    public abstract float getRatio();

    public void setMessage(AnonymousClass21V r3) {
        this.A03 = r3;
        A04(this.A01, this.A00);
    }

    public void setRadius(int i) {
        this.A00 = i;
        if (i > 0) {
            AnonymousClass3MY.A0v(getContext(), this.A02, 2131232923);
            C108965cb.A12(this.A02, -1);
            ((GradientDrawable) this.A02.getBackground()).setCornerRadius((float) i);
        }
    }

    public AnonymousClass6FV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, this);
    }

    public static void A00(Context context, AnonymousClass6FV r3) {
        r3.A00 = r3.getRatio();
        View.inflate(context, 2131626820, r3);
        r3.A02 = AnonymousClass1HF.A06(r3, 2131433364);
        r3.A03 = (LinearLayout) AnonymousClass1HF.A06(r3, 2131428602);
        r3.A01 = AnonymousClass3MW.A0R(r3, 2131435579);
        r3.A00 = AnonymousClass3MW.A0R(r3, 2131431907);
        ImageView A0G = AnonymousClass3MW.A0G(r3, 2131428606);
        Drawable A002 = C24261Jm.A00(context, r3.getMark());
        if (A002 != null) {
            A0G.setImageDrawable(A002);
            r3.A02.setVisibility(0);
        }
    }
}
