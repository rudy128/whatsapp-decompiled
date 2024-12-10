package X;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.PickerFragment;
import java.util.Iterator;

/* renamed from: X.9Nt  reason: invalid class name and case insensitive filesystem */
public abstract class C180749Nt {
    public void A00() {
        AnonymousClass8RF r0 = (AnonymousClass8RF) this;
        int i = r0.A00;
        Object obj = r0.A01;
        if (i != 0) {
            Iterator it = ((PickerFragment) obj).A00.iterator();
            while (it.hasNext()) {
                ((C180749Nt) it.next()).A00();
            }
            return;
        }
        ((MaterialDatePicker) obj).A02.setEnabled(false);
    }

    public void A01(Object obj) {
        AnonymousClass8RF r1 = (AnonymousClass8RF) this;
        if (r1.A00 != 0) {
            Iterator it = ((PickerFragment) r1.A01).A00.iterator();
            while (it.hasNext()) {
                ((C180749Nt) it.next()).A01(obj);
            }
            return;
        }
        MaterialDatePicker materialDatePicker = (MaterialDatePicker) r1.A01;
        materialDatePicker.A2F(materialDatePicker.A2E());
        materialDatePicker.A02.setEnabled(AnonymousClass000.A1W(((AJN) MaterialDatePicker.A01(materialDatePicker)).A01));
    }
}
