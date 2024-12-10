package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1Ou  reason: invalid class name and case insensitive filesystem */
public class C25591Ou extends AnonymousClass17A {
    public final C25571Os A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25591Ou(C25571Os r2, AnonymousClass00H r3) {
        super(r3, false);
        C18070vi.A0d(r3, 1);
        this.A00 = r2;
    }

    public void A00(DeviceJid deviceJid) {
        C71363Ez A08 = this.A00.A08(deviceJid);
        try {
            notifyAllObservers(new C20723AWd(deviceJid, 2));
            if (A08 != null) {
                A08.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A01(DeviceJid deviceJid) {
        C71363Ez A08 = this.A00.A08(deviceJid);
        try {
            notifyAllObservers(new C20723AWd(deviceJid, 0));
            if (A08 != null) {
                A08.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }
}
