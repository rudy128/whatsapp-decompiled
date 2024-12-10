package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* renamed from: X.8Id  reason: invalid class name and case insensitive filesystem */
public class C161888Id extends C42011xT {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public C161888Id(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView A0E = C17880vN.A0E(linearLayout, 2131432783);
        this.A00 = A0E;
        AnonymousClass1HF.A0q(A0E, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(2131432778);
        if (!z) {
            A0E.setVisibility(8);
        }
    }
}
