package X;

import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;
import java.util.Map;

/* renamed from: X.4qj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98194qj implements C107725aU {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public final void Bwe(String str, Map map) {
        String str2;
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        C18070vi.A0j(str, map);
        C36731oN r1 = userNoticeBottomSheetDialogFragment.A07;
        if (r1 != null) {
            r1.A00(userNoticeBottomSheetDialogFragment.A14(), str, map);
            AnonymousClass00H r0 = userNoticeBottomSheetDialogFragment.A0A;
            if (r0 != null) {
                C26106CsQ csQ = (C26106CsQ) r0.get();
                C48262Lu r02 = userNoticeBottomSheetDialogFragment.A09;
                if (r02 == null) {
                    str2 = "data";
                } else {
                    boolean A02 = r02.A02();
                    int i = 8;
                    if (A02) {
                        i = 5;
                    }
                    C26106CsQ.A00(csQ, i);
                    return;
                }
            } else {
                str2 = "userNoticeLogger";
            }
        } else {
            str2 = "userNoticeActionHandler";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public /* synthetic */ C98194qj(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }
}
