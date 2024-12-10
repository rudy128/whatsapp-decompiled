package X;

import android.view.View;
import android.widget.ImageView;

public class AQ3 implements C22539BBw {
    public View.OnClickListener A00;
    public ImageView A01;

    public void A00(Integer num) {
        ImageView imageView;
        int i;
        if (!(this instanceof C1768896a)) {
            if (num == null || 2 != num.intValue()) {
                imageView = this.A01;
                i = 2131231682;
            } else {
                imageView = this.A01;
                i = 2131232506;
            }
            imageView.setImageResource(i);
        }
    }

    public /* bridge */ /* synthetic */ void BD6(Object obj) {
        if (!(this instanceof C1768896a)) {
            A00((Integer) obj);
        }
    }

    public int BTw() {
        if (!(this instanceof C1768896a)) {
            return 2131626951;
        }
        if (((C1768896a) this) instanceof AnonymousClass96Z) {
            return 2131626358;
        }
        return 2131626385;
    }

    public void CA8(View view) {
        if (this instanceof C1768896a) {
            C1768896a r2 = (C1768896a) this;
            r2.A00 = view;
            AFR.A00(view, r2, 42);
            r2.A00.setEnabled(false);
            r2.A00.setClickable(false);
            return;
        }
        ImageView A0G = AnonymousClass3MW.A0G(view, 2131435193);
        this.A01 = A0G;
        AFR.A00(A0G, this, 41);
    }
}
