package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import java.util.Calendar;

/* renamed from: X.9OQ  reason: invalid class name */
public abstract class AnonymousClass9OQ {
    public static void A00(Context context, DOZ doz, C23736Boh boh, E8A e8a, E8A e8a2, Calendar calendar, boolean z) {
        int i = 2132083098;
        if (z) {
            i = 2132083097;
        }
        Context context2 = context;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context2, i, new A9L(boh, e8a, calendar), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(context2.getString(2131899486));
        timePickerDialog.setButton(-1, context2.getString(2131898870), timePickerDialog);
        if (!(e8a2 == null || boh == null)) {
            timePickerDialog.setOnCancelListener(new A9P(doz, boh, e8a2, 0));
        }
        timePickerDialog.show();
    }
}
