package X;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.74l  reason: invalid class name and case insensitive filesystem */
public class C1411374l implements DatePickerDialog.OnDateSetListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1411374l(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.A00 != 0) {
            C136146tL r2 = (C136146tL) this.A01;
            Date A002 = A3L.A00(i, i2, i3);
            C18070vi.A0X(A002);
            long time = A002.getTime();
            C135236rs r1 = new C135236rs(String.valueOf(time), r2.A04, r2.A05);
            WaFlowsViewModel waFlowsViewModel = ((FlowsWebBottomSheetContainer) this.A02).A0B;
            if (waFlowsViewModel == null) {
                C18070vi.A11("waFlowsViewModel");
            } else {
                waFlowsViewModel.A03.A0E(r1);
                return;
            }
        } else {
            C116665yQ r3 = (C116665yQ) this.A01;
            Context context = (Context) this.A02;
            Calendar calendar = r3.A02;
            if (calendar != null) {
                calendar.set(1, i);
                Calendar calendar2 = r3.A02;
                if (calendar2 != null) {
                    calendar2.set(2, i2);
                    Calendar calendar3 = r3.A02;
                    if (calendar3 != null) {
                        calendar3.set(5, i3);
                        C1411574n r5 = new C1411574n(r3);
                        Calendar calendar4 = r3.A02;
                        if (calendar4 != null) {
                            int i4 = calendar4.get(11);
                            Calendar calendar5 = r3.A02;
                            if (calendar5 != null) {
                                new TimePickerDialog(context, r5, i4, calendar5.get(12), false).show();
                                return;
                            }
                        }
                    }
                }
            }
            C18070vi.A11("pendingReminderDateTime");
        }
        throw null;
    }
}
