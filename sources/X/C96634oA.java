package X;

import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;
import com.whatsapp.registration.EULA;

/* renamed from: X.4oA  reason: invalid class name and case insensitive filesystem */
public class C96634oA implements C108095b7 {
    public final int A00;
    public final Object A01;

    public C96634oA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BwW() {
        C86154Qk r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r0 = ((EULA) ((AnonymousClass6LF) obj).A01).A0H;
        } else {
            r0 = ((LinkedUsersActivity) obj).A02;
            if (r0 == null) {
                C18070vi.A11("languageSelectorLoggingPreReg");
                throw null;
            }
        }
        r0.A00();
    }

    public void BwY() {
        C86154Qk r2;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r2 = ((EULA) ((AnonymousClass6LF) obj).A01).A0H;
        } else {
            r2 = ((LinkedUsersActivity) obj).A02;
            if (r2 == null) {
                C18070vi.A11("languageSelectorLoggingPreReg");
                throw null;
            }
        }
        r2.A01 = true;
        r2.A00 = System.currentTimeMillis();
    }
}
