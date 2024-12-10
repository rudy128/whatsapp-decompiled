package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.3wY  reason: invalid class name and case insensitive filesystem */
public abstract class C80103wY extends AnonymousClass3PN {
    public View A00 = findViewById(2131432936);
    public View A01 = findViewById(2131433994);
    public ViewGroup A02 = AnonymousClass3MW.A0D(this, 2131429510);
    public TextView A03 = C17880vN.A0E(this, 2131431358);
    public AnonymousClass1DC A04;

    public abstract int getNegativeButtonTextResId();

    public abstract int getPositiveButtonIconResId();

    public abstract int getPositiveButtonTextResId();

    public C80103wY(Context context) {
        super(context);
        A00();
        View.inflate(context, 2131624731, this);
        AnonymousClass3MW.A0H(this, 2131433995).setImageResource(getPositiveButtonIconResId());
        TextView A0E = C17880vN.A0E(this, 2131433996);
        TextView A0E2 = C17880vN.A0E(this, 2131432937);
        C43421zm.A04(A0E);
        A0E.setText(getPositiveButtonTextResId());
        C43421zm.A04(A0E2);
        A0E2.setText(getNegativeButtonTextResId());
    }
}
