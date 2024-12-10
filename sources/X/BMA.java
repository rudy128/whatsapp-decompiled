package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BMA extends C39711tW {
    public static final ViewGroup.MarginLayoutParams A01;
    public CW6 A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        View A0j;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int A1O = linearLayoutManager.A1O();
        if (A1O != -1 && (A0j = linearLayoutManager.A0j(A1O)) != null) {
            if (A0j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = AnonymousClass3MW.A0B(A0j);
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A01 == 0) {
                height = A0j.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (linearLayoutManager.A07.getLayoutDirection() == 0) {
                    top = A0j.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A0j.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A0j.getHeight() + marginLayoutParams.topMargin;
                top = A0j.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            float f = 0.0f;
            if (height != 0) {
                f = ((float) i4) / ((float) height);
            }
            CW6 cw6 = this.A00;
            C20046A4p a4p = new C20046A4p();
            DOZ doz = cw6.A00;
            a4p.A03(doz, 0);
            a4p.A03(Integer.valueOf(A1O), 1);
            a4p.A03(C25343Ce2.A00((double) f), 2);
            C25681CkC.A03(doz, cw6.A01, BE7.A0R(a4p, Integer.valueOf(i4), 3), cw6.A02);
        }
    }
}
