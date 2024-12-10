package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.8HY  reason: invalid class name */
public class AnonymousClass8HY extends C38391rD {
    public final MaterialCalendar A00;

    public int A0Q() {
        return this.A00.A06.A03;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C62072qk r3;
        MaterialCalendar materialCalendar = this.A00;
        int i2 = materialCalendar.A06.A06.A04 + i;
        TextView textView = ((AnonymousClass8IU) r10).A00;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        Context context = textView.getContext();
        int i3 = 2131899220;
        if (A8Y.A05().get(1) == i2) {
            i3 = 2131899219;
        }
        textView.setContentDescription(AnonymousClass8BS.A0l(valueOf, context.getString(i3), new Object[1], 0));
        C188209h3 r6 = materialCalendar.A07;
        Calendar A05 = A8Y.A05();
        if (A05.get(1) == i2) {
            r3 = r6.A06;
        } else {
            r3 = r6.A07;
        }
        Iterator it = AnonymousClass8BX.A0i((AJN) materialCalendar.A08).iterator();
        while (it.hasNext()) {
            A05.setTimeInMillis(C17890vO.A07(it));
            if (A05.get(1) == i2) {
                r3 = r6.A04;
            }
        }
        r3.A01(textView);
        textView.setOnClickListener(new C90104dX(this, i2, 0));
    }

    public AnonymousClass8HY(MaterialCalendar materialCalendar) {
        this.A00 = materialCalendar;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass8IU((TextView) AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626090));
    }
}
