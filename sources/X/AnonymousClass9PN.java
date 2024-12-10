package X;

import android.os.Bundle;
import com.whatsapp.biz.education.Hilt_MetaVerifiedEducationBottomSheet;
import com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9PN  reason: invalid class name */
public abstract class AnonymousClass9PN {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.biz.education.Hilt_MetaVerifiedEducationBottomSheet, com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet, androidx.fragment.app.Fragment] */
    public static final MetaVerifiedEducationBottomSheet A00(UserJid userJid, int i) {
        C18070vi.A0d(userJid, 0);
        ? hilt_MetaVerifiedEducationBottomSheet = new Hilt_MetaVerifiedEducationBottomSheet();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, userJid, "biz_owner_jid");
        A0D.putInt("referral", i);
        hilt_MetaVerifiedEducationBottomSheet.A1R(A0D);
        return hilt_MetaVerifiedEducationBottomSheet;
    }
}
