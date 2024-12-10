package X;

import android.os.Bundle;
import com.whatsapp.reachouttimelock.Hilt_ReachoutTimelockInfoBottomSheet;
import com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet;

/* renamed from: X.4HZ  reason: invalid class name */
public abstract class AnonymousClass4HZ {
    /* JADX WARNING: type inference failed for: r0v1, types: [com.whatsapp.reachouttimelock.Hilt_ReachoutTimelockInfoBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet] */
    public static final ReachoutTimelockInfoBottomSheet A00(boolean z) {
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("show_full_height", z);
        ? hilt_ReachoutTimelockInfoBottomSheet = new Hilt_ReachoutTimelockInfoBottomSheet();
        hilt_ReachoutTimelockInfoBottomSheet.A1R(A0D);
        return hilt_ReachoutTimelockInfoBottomSheet;
    }
}
