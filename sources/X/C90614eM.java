package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts;

/* renamed from: X.4eM  reason: invalid class name and case insensitive filesystem */
public final class C90614eM implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;
    public final /* synthetic */ boolean A01;

    public C90614eM(ChangeNumberNotifyContacts changeNumberNotifyContacts, boolean z) {
        this.A00 = changeNumberNotifyContacts;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        View view = changeNumberNotifyContacts.A02;
        if (view == null) {
            C18070vi.A11("notifyContactsContainer");
        } else {
            AnonymousClass3MX.A1G(view, this);
            SwitchCompat switchCompat = changeNumberNotifyContacts.A04;
            if (switchCompat != null) {
                boolean z = this.A01;
                switchCompat.setChecked(!z);
                SwitchCompat switchCompat2 = changeNumberNotifyContacts.A04;
                if (switchCompat2 != null) {
                    switchCompat2.setChecked(z);
                    return false;
                }
            }
            C18070vi.A11("notifyContactsSwitch");
        }
        throw null;
    }
}
