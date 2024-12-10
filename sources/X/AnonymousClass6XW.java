package X;

import android.os.Bundle;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;

/* renamed from: X.6XW  reason: invalid class name */
public abstract class AnonymousClass6XW {
    public static final StatusAudienceSelectorShareSheetFragment A00(AnonymousClass77K r4, AnonymousClass727 r5, AnonymousClass8AT r6, AnonymousClass6RU r7) {
        C18070vi.A0d(r5, 0);
        StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment = new StatusAudienceSelectorShareSheetFragment(r6);
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_entry_point", r7.toString());
        r5.A04(A0D, r4);
        statusAudienceSelectorShareSheetFragment.A1R(A0D);
        return statusAudienceSelectorShareSheetFragment;
    }
}
