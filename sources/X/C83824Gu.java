package X;

import android.os.Bundle;
import com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet;
import com.whatsapp.groupenforcements.ui.Hilt_GroupSuspendBottomSheet;

/* renamed from: X.4Gu  reason: invalid class name and case insensitive filesystem */
public abstract class C83824Gu {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.whatsapp.groupenforcements.ui.Hilt_GroupSuspendBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet] */
    public static final GroupSuspendBottomSheet A00(C106965Xw r2, AnonymousClass1EC r3, boolean z, boolean z2) {
        C18070vi.A0d(r3, 2);
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("hasMe", z);
        A0D.putBoolean("isMeAdmin", z2);
        AnonymousClass3MY.A15(A0D, r3, "suspendedEntityId");
        ? hilt_GroupSuspendBottomSheet = new Hilt_GroupSuspendBottomSheet();
        hilt_GroupSuspendBottomSheet.A1R(A0D);
        hilt_GroupSuspendBottomSheet.A02 = r2;
        return hilt_GroupSuspendBottomSheet;
    }
}
