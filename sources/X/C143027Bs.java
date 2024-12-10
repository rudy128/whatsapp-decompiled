package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Bs  reason: invalid class name and case insensitive filesystem */
public class C143027Bs implements C72433Ly {
    public boolean A00 = false;
    public final ArrayList A01 = AnonymousClass000.A13();
    public final ArrayList A02 = AnonymousClass000.A13();
    public final /* synthetic */ ContactPickerFragment A03;
    public final /* synthetic */ List A04;

    public boolean BE8() {
        return false;
    }

    public void Bti() {
        this.A00 = true;
    }

    public C143027Bs(ContactPickerFragment contactPickerFragment, List list) {
        this.A03 = contactPickerFragment;
        this.A04 = list;
    }

    private void A00() {
        ArrayList arrayList = this.A02;
        int size = arrayList.size() + this.A01.size();
        ContactPickerFragment contactPickerFragment = this.A03;
        if (size == contactPickerFragment.A33.size()) {
            if (!arrayList.isEmpty() && !this.A00) {
                C142977Bn r0 = contactPickerFragment.A0r;
                r0.A00.CPW(this.A04, 1);
            }
            contactPickerFragment.A2F();
        }
    }

    public void C9f(Uri uri) {
        this.A01.add(uri);
        A00();
    }

    public void C9g(Uri uri) {
        this.A02.add(uri);
        A00();
        C108985cd.A18(this.A03.A1X, 1);
    }
}
