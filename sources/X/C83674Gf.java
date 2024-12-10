package X;

import android.os.Bundle;
import com.whatsapp.events.EventResponseBottomSheet;

/* renamed from: X.4Gf  reason: invalid class name and case insensitive filesystem */
public abstract class C83674Gf {
    public static final EventResponseBottomSheet A00(C445823z r3, C49552Qx r4, int i) {
        Bundle A0D = C17880vN.A0D();
        AnonymousClass4aU.A0A(A0D, r3.A0v);
        A0D.putInt("EXISTING_RESPONSE_EXTRA", r4.value);
        A0D.putBoolean("ALLOW_GUESTS_EXTRA", r3.A07);
        A0D.putInt("EXISTING_RESPONSE_GUEST_COUNT_EXTRA", i);
        EventResponseBottomSheet eventResponseBottomSheet = new EventResponseBottomSheet();
        eventResponseBottomSheet.A1R(A0D);
        return eventResponseBottomSheet;
    }
}
