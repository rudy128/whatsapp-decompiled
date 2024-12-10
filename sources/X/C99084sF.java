package X;

import android.view.View;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.4sF  reason: invalid class name and case insensitive filesystem */
public class C99084sF implements C18080vj, C18090vk {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C99084sF(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 2:
                return new AnonymousClass4ZZ(AnonymousClass3Ma.A0g(((C84304Iz) this.A02).A00.A01), this.A01);
            case 3:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A02;
                contactPickerFragment.A1g.A00(this.A01, 4);
                contactPickerFragment.A2F();
                return null;
            case 4:
                return AnonymousClass1HF.A06((View) this.A02, this.A01);
            default:
                AnonymousClass3XH r3 = (AnonymousClass3XH) this.A02;
                int i = this.A01;
                r3.A01 = "";
                r3.A00 = i;
                r3.A03.invoke(r3.A02.get(i));
                r3.notifyDataSetChanged();
                return C27621Wu.A00;
        }
    }
}
