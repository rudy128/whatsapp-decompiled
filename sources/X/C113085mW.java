package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/* renamed from: X.5mW  reason: invalid class name and case insensitive filesystem */
public class C113085mW extends C42011xT {
    public final CheckBox A00;
    public final TextView A01;

    public C113085mW(View view) {
        super(view);
        this.A01 = AnonymousClass3Ma.A0E(view, 2131432430);
        CheckBox checkBox = (CheckBox) C18070vi.A05(view, 2131432431);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(2131895595));
        checkBox.setOnCheckedChangeListener(new AnonymousClass79N());
    }
}
