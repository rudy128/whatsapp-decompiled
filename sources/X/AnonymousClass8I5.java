package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: X.8I5  reason: invalid class name */
public class AnonymousClass8I5 extends C40611uz {
    public final Calendar A00 = A8Y.A07((Calendar) null);
    public final Calendar A01 = A8Y.A07((Calendar) null);
    public final /* synthetic */ MaterialCalendar A02;

    public AnonymousClass8I5(MaterialCalendar materialCalendar) {
        this.A02 = materialCalendar;
    }

    public void A04(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        int i;
        int width;
        RecyclerView recyclerView2 = recyclerView;
        C38391rD r8 = recyclerView2.A0B;
        if (r8 instanceof AnonymousClass8HY) {
            C38251qy layoutManager = recyclerView2.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                AnonymousClass8HY r82 = (AnonymousClass8HY) r8;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                MaterialCalendar materialCalendar = this.A02;
                Iterator it = AnonymousClass000.A13().iterator();
                while (it.hasNext()) {
                    C19760yx r1 = (C19760yx) it.next();
                    Object obj2 = r1.A00;
                    if (!(obj2 == null || (obj = r1.A01) == null)) {
                        Calendar calendar = this.A01;
                        calendar.setTimeInMillis(C17880vN.A05(obj2));
                        Calendar calendar2 = this.A00;
                        calendar2.setTimeInMillis(C17880vN.A05(obj));
                        int i2 = calendar.get(1);
                        MaterialCalendar materialCalendar2 = r82.A00;
                        int i3 = i2 - materialCalendar2.A06.A06.A04;
                        int i4 = calendar2.get(1) - materialCalendar2.A06.A06.A04;
                        View A0j = gridLayoutManager.A0j(i3);
                        View A0j2 = gridLayoutManager.A0j(i4);
                        int i5 = gridLayoutManager.A00;
                        int i6 = i3 / i5;
                        int i7 = i4 / i5;
                        for (int i8 = i6; i8 <= i7; i8++) {
                            View A0j3 = gridLayoutManager.A0j(gridLayoutManager.A00 * i8);
                            if (A0j3 != null) {
                                int top = A0j3.getTop() + materialCalendar.A07.A07.A04.top;
                                int bottom = A0j3.getBottom() - materialCalendar.A07.A07.A04.bottom;
                                if (i8 == i6) {
                                    i = A0j.getLeft() + (A0j.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i8 == i7) {
                                    width = A0j2.getLeft() + (A0j2.getWidth() / 2);
                                } else {
                                    width = recyclerView2.getWidth();
                                }
                                canvas.drawRect((float) i, (float) top, (float) width, (float) bottom, materialCalendar.A07.A00);
                            }
                        }
                    }
                }
            }
        }
    }
}
