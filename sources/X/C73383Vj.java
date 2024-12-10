package X;

import android.app.Application;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;

/* renamed from: X.3Vj  reason: invalid class name and case insensitive filesystem */
public class C73383Vj extends C24121Iy {
    public final /* synthetic */ ContactsAttachmentSelector A00;

    public C73383Vj(ContactsAttachmentSelector contactsAttachmentSelector) {
        this.A00 = contactsAttachmentSelector;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3T3.class)) {
            ContactsAttachmentSelector contactsAttachmentSelector = this.A00;
            Application application = contactsAttachmentSelector.getApplication();
            AnonymousClass118 r5 = contactsAttachmentSelector.A02;
            AnonymousClass1M9 r3 = contactsAttachmentSelector.A06;
            AnonymousClass11C r4 = contactsAttachmentSelector.A08;
            CW0 cw0 = contactsAttachmentSelector.A03;
            return new AnonymousClass3T3(application, contactsAttachmentSelector.A00, r3, r4, r5, contactsAttachmentSelector.A0F, cw0);
        }
        throw AnonymousClass000.A0k("Invalid viewModel");
    }
}
