package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1eU  reason: invalid class name and case insensitive filesystem */
public final class C30771eU extends C30741eR {
    public final AnonymousClass00H A00;
    public final AnonymousClass11P A01;

    public C30771eU(AnonymousClass11P r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public AnonymousClass8oQ A02(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        try {
            return (AnonymousClass8oQ) ((C48102Le) this.A00.get()).A04(userJid);
        } catch (Exception e) {
            Log.e("ExternalEntryPointController/getEntryPoint", e);
            return null;
        }
    }
}
