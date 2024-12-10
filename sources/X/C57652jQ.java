package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.2jQ  reason: invalid class name and case insensitive filesystem */
public final class C57652jQ {
    public final AnonymousClass1RK A00;
    public final AnonymousClass11S A01;
    public final C19830z4 A02;
    public final AnonymousClass00H A03;

    public final boolean A00() {
        AnonymousClass1A3 r0;
        Iterator it = this.A00.A06().iterator();
        while (true) {
            if (!it.hasNext()) {
                r0 = AnonymousClass1A3.A01;
                break;
            }
            DeviceJid deviceJid = ((C88344Zh) it.next()).A08;
            C18070vi.A0X(deviceJid);
            if (C62832s4.A00(deviceJid)) {
                r0 = new AnonymousClass1A3(deviceJid);
                break;
            }
        }
        C18070vi.A0X(r0);
        return AnonymousClass000.A1W(r0.A00);
    }

    public C57652jQ(AnonymousClass11S r1, C19830z4 r2, AnonymousClass1RK r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }
}
