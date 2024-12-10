package X;

import com.whatsapp.components.PhoneNumberEntry;

/* renamed from: X.ALs  reason: case insensitive filesystem */
public final /* synthetic */ class C20455ALs implements C107025Yc {
    public final /* synthetic */ PhoneNumberEntry A00;

    public final boolean C8U(int i) {
        PhoneNumberEntry phoneNumberEntry = this.A00;
        String[] A01 = PhoneNumberEntry.A01(phoneNumberEntry.A00, phoneNumberEntry.A04, i, false);
        if (A01 == null) {
            return false;
        }
        phoneNumberEntry.A01.setText(A01[0]);
        phoneNumberEntry.A02.setText(A01[1]);
        return true;
    }

    public /* synthetic */ C20455ALs(PhoneNumberEntry phoneNumberEntry) {
        this.A00 = phoneNumberEntry;
    }
}
