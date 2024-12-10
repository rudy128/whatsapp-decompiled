package X;

import android.os.Bundle;
import com.whatsapp.events.EventInfoBottomSheet;

/* renamed from: X.4Ge  reason: invalid class name and case insensitive filesystem */
public abstract class C83664Ge {
    public static final EventInfoBottomSheet A00(C445823z r4, C82954Cu r5, C82984Cx r6) {
        String rawString;
        C18070vi.A0i(r4, r6);
        Bundle A0D = C17880vN.A0D();
        AnonymousClass205 r0 = r4.A0v;
        AnonymousClass4aU.A0A(A0D, r0);
        AnonymousClass1BI r02 = r0.A00;
        if (!(r02 == null || (rawString = r02.getRawString()) == null)) {
            A0D.putString("jid", rawString);
        }
        AnonymousClass206 A0K = r4.A0K();
        if (A0K != null) {
            A0D.putLong("extra_quoted_message_row_id", A0K.A0x);
        }
        if (r5 != null) {
            A0D.putString("INITIAL_STEP_KEY", r5.toString());
        }
        A0D.putString("SOURCE_KEY", r6.toString());
        EventInfoBottomSheet eventInfoBottomSheet = new EventInfoBottomSheet();
        eventInfoBottomSheet.A1R(A0D);
        return eventInfoBottomSheet;
    }
}
