package X;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* renamed from: X.8Hr  reason: invalid class name and case insensitive filesystem */
public class C161768Hr extends C38391rD {
    public final int A00;
    public final ADU A01;
    public final BDX A02;
    public final C22354B4h A03;

    public long A0M(int i) {
        Calendar A06 = A8Y.A06(this.A01.A06.A06);
        A06.add(2, i);
        return new C21349Aie(A06).A06.getTimeInMillis();
    }

    public int A0Q() {
        return this.A01.A02;
    }

    public int A0U(C21349Aie aie) {
        C21349Aie aie2 = this.A01.A06;
        if (aie2.A06 instanceof GregorianCalendar) {
            return ((aie.A04 - aie2.A04) * 12) + (aie.A03 - aie2.A03);
        }
        throw AnonymousClass000.A0k("Only Gregorian calendars are supported.");
    }

    public C21349Aie A0V(int i) {
        Calendar A06 = A8Y.A06(this.A01.A06.A06);
        A06.add(2, i);
        return new C21349Aie(A06);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C161888Id r82 = (C161888Id) r8;
        ADU adu = this.A01;
        Calendar A06 = A8Y.A06(adu.A06.A06);
        A06.add(2, i);
        C21349Aie aie = new C21349Aie(A06);
        TextView textView = r82.A00;
        String str = aie.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, aie.A06.getTimeInMillis(), 8228);
            aie.A00 = str;
        }
        textView.setText(str);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) r82.A01.findViewById(2131432778);
        if (materialCalendarGridView.A00() == null || !aie.equals(materialCalendarGridView.A00().A04)) {
            AnonymousClass8DE r1 = new AnonymousClass8DE(adu, this.A02, aie);
            materialCalendarGridView.setNumColumns(aie.A02);
            materialCalendarGridView.setAdapter(r1);
        } else {
            materialCalendarGridView.invalidate();
            AnonymousClass8DE A002 = materialCalendarGridView.A00();
            Iterator it = A002.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass8DE.A01(materialCalendarGridView, A002, C17890vO.A07(it));
            }
            BDX bdx = A002.A03;
            if (bdx != null) {
                AJN ajn = (AJN) bdx;
                Iterator it2 = AnonymousClass8BX.A0i(ajn).iterator();
                while (it2.hasNext()) {
                    AnonymousClass8DE.A01(materialCalendarGridView, A002, C17890vO.A07(it2));
                }
                A002.A01 = AnonymousClass8BX.A0i(ajn);
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C20311AFt(materialCalendarGridView, this, 0));
    }

    public C161768Hr(Context context, ADU adu, BDX bdx, C22354B4h b4h) {
        int i;
        C21349Aie aie = adu.A06;
        C21349Aie aie2 = adu.A05;
        C21349Aie aie3 = adu.A00;
        if (aie.A06.compareTo(aie3.A06) > 0) {
            throw AnonymousClass000.A0k("firstPage cannot be after currentPage");
        } else if (aie3.A06.compareTo(aie2.A06) <= 0) {
            int dimensionPixelSize = AnonymousClass8DE.A05 * context.getResources().getDimensionPixelSize(2131167805);
            if (MaterialDatePicker.A03(context, 16843277)) {
                i = context.getResources().getDimensionPixelSize(2131167805);
            } else {
                i = 0;
            }
            this.A00 = dimensionPixelSize + i;
            this.A01 = adu;
            this.A02 = bdx;
            this.A03 = b4h;
            A0K(true);
        } else {
            throw AnonymousClass000.A0k("currentPage cannot be after lastPage");
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) AnonymousClass3MZ.A0D(viewGroup).inflate(2131626086, viewGroup, false);
        if (!MaterialDatePicker.A03(viewGroup.getContext(), 16843277)) {
            return new C161888Id(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C38491rN(-1, this.A00));
        return new C161888Id(linearLayout, true);
    }
}
