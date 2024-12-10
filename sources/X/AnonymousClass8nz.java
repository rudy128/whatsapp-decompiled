package X;

import android.app.Activity;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.8nz  reason: invalid class name */
public abstract class AnonymousClass8nz extends C196289ul {
    public final AnonymousClass00H A00;

    public void A0H(Activity activity, AnonymousClass5XY r7, Jid jid, C20271AEe aEe, String str, String str2, long j) {
        if (aEe.A00 != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("commerce", A0G(activity, aEe));
            ((C183069Wu) this.A00.get()).A00.A00(AnonymousClass00R.A00, "DEFAULT_JOB_ID", "DEFAULT_NAMESPACE", A11);
        }
    }

    public AnonymousClass8nz(AnonymousClass00H r2) {
        this.A00 = r2;
        Boolean bool = C17960vV.A01;
    }

    public HashMap A0G(Activity activity, C20271AEe aEe) {
        AnonymousClass1E7 contact;
        String A0K;
        HashMap A11 = C17880vN.A11();
        HashMap A112 = C17880vN.A11();
        C108885cS A01 = C88404Zo.A01(activity);
        if (!(A01 == null || (contact = A01.getContact()) == null)) {
            String A0L = contact.A0L();
            AnonymousClass1E7 contact2 = A01.getContact();
            if (A0L != null) {
                A0K = contact2.A0L();
            } else if (contact2.A0K() != null) {
                A0K = A01.getContact().A0K();
            }
            A112.put("business_name", A0K);
        }
        A11.put("business_info", A112);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add("address_message_validate");
        A13.add("configure_top_bar");
        A13.add("extension_message_response");
        A13.add("fetch_catalog");
        A13.add("show_error");
        A11.put("supported_actions", A13);
        A11.put(A07(), A3M.A01(aEe.A00));
        return A11;
    }
}
