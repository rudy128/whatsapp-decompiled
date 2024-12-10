package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.DeviceJid;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6lG  reason: invalid class name and case insensitive filesystem */
public final class C131536lG {
    public final AnonymousClass00H A00;

    public C131536lG(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(DeviceJid deviceJid) {
        C18070vi.A0d(deviceJid, 0);
        LinkedHashSet A14 = C17880vN.A14();
        AnonymousClass00H r3 = this.A00;
        SharedPreferences A0C = C17880vN.A0C(((COS) r3.get()).A01);
        C25511Om r1 = C25511Om.A00;
        Set<String> stringSet = A0C.getStringSet("registered_devices", r1);
        if (stringSet == null) {
            stringSet = r1;
        }
        A14.addAll(stringSet);
        A14.remove(deviceJid.getRawStringWithNoAgent());
        C17890vO.A0A(((COS) r3.get()).A01).putStringSet("registered_devices", A14).apply();
        String rawStringWithNoAgent = deviceJid.getRawStringWithNoAgent();
        C18070vi.A0d(rawStringWithNoAgent, 0);
        C17880vN.A1B(C17890vO.A0A(((COS) r3.get()).A01), AnonymousClass001.A1H("chat_lock_support_level:", rawStringWithNoAgent, AnonymousClass000.A10()));
    }
}
