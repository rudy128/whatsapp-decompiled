package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Cc  reason: invalid class name and case insensitive filesystem */
public class C143127Cc implements C107105Yk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C143127Cc(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CQ7() {
        if (this.A00 != 0) {
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
            AnonymousClass3MW.A0V(contactPickerFragment.A24).A0I(contactPickerFragment.A1B(), (UserJid) C72453Mb.A0m((AnonymousClass1E7) this.A02));
            return;
        }
        C114635rQ r3 = (C114635rQ) this.A01;
        AnonymousClass3MW.A0V(r3.A0B).A0I(r3, (UserJid) C72453Mb.A0m((AnonymousClass1E7) this.A02));
    }
}
