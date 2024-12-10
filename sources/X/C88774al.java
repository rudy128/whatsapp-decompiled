package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import com.whatsapp.events.EventCreateOrEditFragment;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: X.4al  reason: invalid class name and case insensitive filesystem */
public class C88774al implements DatePickerDialog.OnDateSetListener {
    public final int A00;
    public final Object A01;

    public C88774al(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        EventCreateOrEditFragment eventCreateOrEditFragment;
        String format;
        WaEditText waEditText;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        switch (this.A00) {
            case 0:
                ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) this.A01;
                scheduleCallFragment.A0F.set(i, i2, i3);
                scheduleCallFragment.A03.setText(DateFormat.getDateInstance(2, scheduleCallFragment.A0A.A0N()).format(scheduleCallFragment.A0F.getTime()));
                return;
            case 1:
                AnonymousClass4aY r3 = (AnonymousClass4aY) this.A01;
                r3.A4c.CGF(new C21461AkS(r3, i4, i5, i6, 2));
                return;
            case 2:
                eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A01;
                EventCreateOrEditFragment.A05(eventCreateOrEditFragment);
                C18100vl r2 = eventCreateOrEditFragment.A0t;
                ((Calendar) AnonymousClass3MX.A14(r2)).set(i, i2, i3);
                C18000vb r0 = eventCreateOrEditFragment.A0H;
                if (r0 != null) {
                    format = DateFormat.getDateInstance(2, r0.A0N()).format(((Calendar) AnonymousClass3MX.A14(r2)).getTime());
                    waEditText = eventCreateOrEditFragment.A0A;
                    break;
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            default:
                eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A01;
                C18100vl r22 = eventCreateOrEditFragment.A0s;
                ((Calendar) AnonymousClass3MX.A14(r22)).set(i, i2, i3);
                C18000vb r02 = eventCreateOrEditFragment.A0H;
                if (r02 != null) {
                    format = DateFormat.getDateInstance(2, r02.A0N()).format(((Calendar) AnonymousClass3MX.A14(r22)).getTime());
                    waEditText = eventCreateOrEditFragment.A07;
                    break;
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
        }
        if (waEditText != null) {
            waEditText.setText(format);
        }
        EventCreateOrEditFragment.A02(eventCreateOrEditFragment);
    }
}
