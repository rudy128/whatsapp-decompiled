package X;

import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;

/* renamed from: X.7Bw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143067Bw implements C107025Yc {
    public final /* synthetic */ AnonymousClass70Q A00;

    public final boolean C8U(int i) {
        AnonymousClass70Q r5 = this.A00;
        String[] A01 = PhoneNumberEntry.A01(r5.A07, r5.A0A, i, true);
        if (A01 == null) {
            return false;
        }
        String str = A01[0];
        C18070vi.A0U(str);
        r5.A08(str);
        WaEditText waEditText = r5.A04;
        if (waEditText != null) {
            waEditText.setText(A01[1]);
            WaEditText waEditText2 = r5.A04;
            if (waEditText2 != null) {
                waEditText2.setSelection(waEditText2.length());
                return true;
            }
        }
        C18070vi.A11("phoneField");
        throw null;
    }

    public /* synthetic */ C143067Bw(AnonymousClass70Q r1) {
        this.A00 = r1;
    }
}
