package X;

import android.text.TextUtils;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9B4  reason: invalid class name */
public class AnonymousClass9B4 extends A34 {
    public final C24751Ln A00;
    public final AnonymousClass1KH A01;
    public final UserJid A02;
    public final C187429fn A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass8pI r7 = (AnonymousClass8pI) obj;
        C187429fn r0 = this.A03;
        A1K a1k = r0.A03;
        C22376B5f b5f = r0.A02;
        UserJid userJid = r0.A00;
        String str = r0.A04;
        if (b5f != null) {
            C20846AaO aaO = (C20846AaO) b5f;
            if (1 - aaO.A00 == 0) {
                ((ContactPickerFragment) aaO.A01).A0r.CEx();
            }
        }
        if (r7 == null || r7.A03 == null || TextUtils.isEmpty(r7.A09())) {
            A1K.A00(a1k, str, C108965cb.A0s(userJid), true);
            return;
        }
        Runnable runnable = a1k.A02;
        if (runnable != null) {
            if (b5f != null) {
                String A09 = r7.A09();
                C20846AaO aaO2 = (C20846AaO) b5f;
                if (2 - aaO2.A00 == 0) {
                    ((A0Q) aaO2.A01).A00 = A09;
                }
            }
            runnable.run();
        }
    }

    public AnonymousClass9B4(C24751Ln r1, AnonymousClass1KH r2, UserJid userJid, C187429fn r4) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
        this.A03 = r4;
    }
}
