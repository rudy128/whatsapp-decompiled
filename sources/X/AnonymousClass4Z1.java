package X;

import android.os.Bundle;
import com.whatsapp.mute.ui.MuteDialogFragment;
import java.util.Collection;

/* renamed from: X.4Z1  reason: invalid class name */
public abstract class AnonymousClass4Z1 {
    public static final MuteDialogFragment A00(AnonymousClass1BI r4) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, r4, "jid");
        A0D.putInt("mute_entry_point", 1);
        A0D.putBoolean("is_mute_call", true);
        muteDialogFragment.A1R(A0D);
        return muteDialogFragment;
    }

    public static final MuteDialogFragment A01(AnonymousClass1BI r4, C32961i2 r5) {
        C18070vi.A0d(r4, 0);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, r4, "jid");
        A0D.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A1R(A0D);
        return muteDialogFragment;
    }

    public static final MuteDialogFragment A02(C32961i2 r5, Collection collection) {
        C18070vi.A0d(collection, 0);
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A17(A0D, "jids", collection);
        A0D.putBoolean("mute_in_conversation_fragment", true);
        A0D.putInt("mute_entry_point", r5.ordinal());
        muteDialogFragment.A1R(A0D);
        return muteDialogFragment;
    }
}
