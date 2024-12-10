package X;

import android.app.TimePickerDialog;
import android.widget.Button;
import android.widget.TimePicker;
import java.util.Calendar;

/* renamed from: X.74n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1411574n implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ C116665yQ A00;

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Button button;
        C116665yQ r3 = this.A00;
        Calendar calendar = r3.A02;
        if (calendar != null) {
            calendar.set(11, i);
            Calendar calendar2 = r3.A02;
            if (calendar2 != null) {
                calendar2.set(12, i2);
                Calendar calendar3 = r3.A02;
                if (calendar3 != null) {
                    r3.A03 = calendar3;
                    C010105w r0 = r3.A00;
                    if (r0 != null && (button = r0.A00.A0H) != null) {
                        button.setEnabled(true);
                        return;
                    }
                    return;
                }
            }
        }
        C18070vi.A11("pendingReminderDateTime");
        throw null;
    }

    public /* synthetic */ C1411574n(C116665yQ r1) {
        this.A00 = r1;
    }
}
