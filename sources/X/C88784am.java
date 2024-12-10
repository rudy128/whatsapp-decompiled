package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import com.whatsapp.events.EventCreateOrEditFragment;
import java.util.Calendar;

/* renamed from: X.4am  reason: invalid class name and case insensitive filesystem */
public class C88784am implements TimePickerDialog.OnTimeSetListener {
    public final int A00;
    public final Object A01;

    public C88784am(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        WaEditText waEditText;
        C18000vb r1;
        Calendar calendar;
        switch (this.A00) {
            case 0:
                ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) this.A01;
                scheduleCallFragment.A0F.set(11, i);
                scheduleCallFragment.A0F.set(12, i2);
                waEditText = scheduleCallFragment.A04;
                r1 = scheduleCallFragment.A0A;
                calendar = scheduleCallFragment.A0F;
                break;
            case 1:
                EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this.A01;
                EventCreateOrEditFragment.A05(eventCreateOrEditFragment);
                C18100vl r3 = eventCreateOrEditFragment.A0t;
                ((Calendar) AnonymousClass3MX.A14(r3)).set(11, i);
                ((Calendar) AnonymousClass3MX.A14(r3)).set(12, i2);
                WaEditText waEditText2 = eventCreateOrEditFragment.A0B;
                if (waEditText2 != null) {
                    C18000vb r12 = eventCreateOrEditFragment.A0H;
                    if (r12 != null) {
                        waEditText2.setText(A8I.A03(r12, (Calendar) AnonymousClass3MX.A14(r3)));
                    } else {
                        AnonymousClass3MW.A1M();
                        throw null;
                    }
                }
                EventCreateOrEditFragment.A02(eventCreateOrEditFragment);
                return;
            default:
                EventCreateOrEditFragment eventCreateOrEditFragment2 = (EventCreateOrEditFragment) this.A01;
                C18100vl r2 = eventCreateOrEditFragment2.A0s;
                ((Calendar) AnonymousClass3MX.A14(r2)).set(11, i);
                ((Calendar) AnonymousClass3MX.A14(r2)).set(12, i2);
                waEditText = eventCreateOrEditFragment2.A08;
                if (waEditText != null) {
                    r1 = eventCreateOrEditFragment2.A0H;
                    if (r1 != null) {
                        calendar = (Calendar) AnonymousClass3MX.A14(r2);
                        break;
                    } else {
                        AnonymousClass3MW.A1M();
                        throw null;
                    }
                } else {
                    return;
                }
        }
        waEditText.setText(A8I.A03(r1, calendar));
    }
}
