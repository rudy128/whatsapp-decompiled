package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.util.Calendar;

public final /* synthetic */ class A9K implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DOZ A01;
    public final /* synthetic */ C23736Boh A02;
    public final /* synthetic */ E8A A03;
    public final /* synthetic */ E8A A04;
    public final /* synthetic */ C197619wz A05;
    public final /* synthetic */ Calendar A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A06;
        boolean z = this.A07;
        Context context = this.A00;
        DOZ doz = this.A01;
        E8A e8a = this.A03;
        E8A e8a2 = this.A04;
        C23736Boh boh = this.A02;
        boolean z2 = this.A08;
        calendar.set(i, i2, i3);
        if (z) {
            AnonymousClass9OQ.A00(context, doz, boh, e8a, e8a2, calendar, z2);
        } else if (boh != null && e8a != null) {
            AnonymousClass8BT.A19(boh, e8a, C108985cd.A0J(String.valueOf(C17880vN.A04(calendar.getTimeInMillis()))).A00);
        }
    }

    public /* synthetic */ A9K(Context context, DOZ doz, C23736Boh boh, E8A e8a, E8A e8a2, C197619wz r6, Calendar calendar, boolean z, boolean z2) {
        this.A06 = calendar;
        this.A07 = z;
        this.A00 = context;
        this.A01 = doz;
        this.A03 = e8a;
        this.A04 = e8a2;
        this.A05 = r6;
        this.A02 = boh;
        this.A08 = z2;
    }
}
