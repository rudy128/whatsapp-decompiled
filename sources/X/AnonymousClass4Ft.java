package X;

import android.os.Bundle;

/* renamed from: X.4Ft  reason: invalid class name */
public abstract class AnonymousClass4Ft {
    public static final Bundle A00(AnonymousClass1EC r5, Boolean bool, int i) {
        AnonymousClass4Cl r1;
        C17900vP.A0j("CallConfirmationSheetViewModel/creating bundle for group callFromUi: ", AnonymousClass000.A10(), i);
        if (C18070vi.A19(bool, true)) {
            r1 = AnonymousClass4Cl.Video;
        } else if (C18070vi.A19(bool, false)) {
            r1 = AnonymousClass4Cl.Audio;
        } else {
            r1 = AnonymousClass4Cl.Both;
        }
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
        AnonymousClass1D6.A03("call_type", r1, r2, 0);
        AnonymousClass1D6.A03("group_jid", r5, r2, 1);
        r2[2] = AnonymousClass1D6.A00("call_from_ui", i);
        return AnonymousClass9O6.A00(r2);
    }
}
