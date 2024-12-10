package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.77t  reason: invalid class name and case insensitive filesystem */
public class C1419977t implements MenuItem.OnActionExpandListener {
    public final int A00;
    public final Object A01;

    public C1419977t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C114635rQ r1 = (C114635rQ) obj;
                r1.A0H = null;
                C114635rQ.A0y(r1);
                return true;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) obj;
                contactPickerFragment.A32 = null;
                ContactPickerFragment.A0H(contactPickerFragment);
                return true;
            default:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) obj;
                phoneContactsSelector.A0X = null;
                phoneContactsSelector.A4c();
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
