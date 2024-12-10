package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public final /* synthetic */ class A9L implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ C23736Boh A00;
    public final /* synthetic */ E8A A01;
    public final /* synthetic */ Calendar A02;

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Calendar calendar = this.A02;
        C23736Boh boh = this.A00;
        E8A e8a = this.A01;
        calendar.set(11, i);
        calendar.set(12, i2);
        if (boh != null && e8a != null) {
            AnonymousClass8BT.A19(boh, e8a, C108985cd.A0J(String.valueOf(C17880vN.A04(calendar.getTimeInMillis()))).A00);
        }
    }

    public /* synthetic */ A9L(C23736Boh boh, E8A e8a, Calendar calendar) {
        this.A02 = calendar;
        this.A00 = boh;
        this.A01 = e8a;
    }
}
