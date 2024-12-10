package X;

import android.text.Editable;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.9AJ  reason: invalid class name */
public class AnonymousClass9AJ extends C64632v5 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AJ(int i, String str, Object obj) {
        super(str);
        this.A00 = i;
        this.A01 = obj;
    }

    public synchronized void afterTextChanged(Editable editable) {
        if (this.A00 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        synchronized (this) {
            super.afterTextChanged(editable);
            C180599Ne r1 = ((PhoneNumberEntry) this.A01).A03;
            if (r1 != null && (r1 instanceof AnonymousClass8nC)) {
                AnonymousClass8nC r12 = (AnonymousClass8nC) r1;
                if (2 - r12.A00 == 0) {
                    ((RegisterPhone) r12.A01).A4p();
                }
            }
        }
    }
}
