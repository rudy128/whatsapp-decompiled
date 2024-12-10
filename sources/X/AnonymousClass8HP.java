package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.8HP  reason: invalid class name */
public class AnonymousClass8HP extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MaterialCalendar A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HP(Context context, MaterialCalendar materialCalendar, int i, int i2) {
        super(context, i, false);
        this.A01 = materialCalendar;
        this.A00 = i2;
    }

    public void A1c(C38021qZ r6, int[] iArr) {
        int height;
        int i = this.A00;
        MaterialCalendar materialCalendar = this.A01;
        RecyclerView recyclerView = materialCalendar.A04;
        if (i == 0) {
            iArr[0] = recyclerView.getWidth();
            height = materialCalendar.A04.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            height = materialCalendar.A04.getHeight();
        }
        iArr[1] = height;
    }

    public void A1G(RecyclerView recyclerView, int i) {
        C111685kG r0 = new C111685kG(recyclerView.getContext(), this, 0);
        r0.A00 = i;
        A0e(r0);
    }
}
