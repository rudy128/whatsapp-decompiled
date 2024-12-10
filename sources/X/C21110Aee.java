package X;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.Aee  reason: case insensitive filesystem */
public class C21110Aee implements C38531rR {
    public final int A00;

    public C21110Aee(int i) {
        this.A00 = i;
    }

    public final void Bvu(View view) {
        int i;
        int i2 = this.A00;
        TextView textView = (TextView) view;
        List list = C42011xT.A0I;
        switch (i2) {
            case 0:
                i = 2131887956;
                break;
            case 1:
                i = 2131887962;
                break;
            default:
                i = 2131896960;
                break;
        }
        textView.setText(i);
    }
}
