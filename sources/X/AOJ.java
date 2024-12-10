package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

public final class AOJ implements B7T {
    public final View A00;

    public AOJ(View view) {
        C18070vi.A0d(view, 1);
        View findViewById = view.findViewById(2131436208);
        this.A00 = findViewById;
        AnonymousClass1Y5.A0A(view, true);
        if (findViewById instanceof WaTextView) {
            C43421zm.A04((TextView) findViewById);
        }
    }

    public void Bmb(B7U b7u) {
        int i;
        int i2 = ((AOP) b7u).A00;
        if (i2 == 0) {
            i = 2131887188;
        } else if (i2 != 1) {
            i = 2131887195;
            if (i2 != 2) {
                i = 2131887186;
            }
        } else {
            i = 2131887187;
        }
        View view = this.A00;
        if (view instanceof WaTextView) {
            ((TextView) view).setText(i);
        } else if (view instanceof WDSSectionHeader) {
            ((WDSSectionHeader) view).setHeaderText(i);
        }
    }
}
