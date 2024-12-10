package X;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.8IB  reason: invalid class name */
public class AnonymousClass8IB extends C39711tW {
    public final /* synthetic */ MaterialButton A00;
    public final /* synthetic */ MaterialCalendar A01;
    public final /* synthetic */ C161768Hr A02;

    public AnonymousClass8IB(MaterialButton materialButton, MaterialCalendar materialCalendar, C161768Hr r3) {
        this.A01 = materialCalendar;
        this.A02 = r3;
        this.A00 = materialButton;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.A00.getText());
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1Q;
        MaterialCalendar materialCalendar = this.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) materialCalendar.A04.getLayoutManager();
        if (i < 0) {
            A1Q = linearLayoutManager.A1O();
        } else {
            A1Q = linearLayoutManager.A1Q();
        }
        C161768Hr r1 = this.A02;
        materialCalendar.A09 = r1.A0V(A1Q);
        MaterialButton materialButton = this.A00;
        C21349Aie A0V = r1.A0V(A1Q);
        String str = A0V.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, A0V.A06.getTimeInMillis(), 8228);
        }
        materialButton.setText(str);
    }
}
