package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ALo  reason: case insensitive filesystem */
public final class C20451ALo implements BCN, AnonymousClass1M6 {
    public final C114465qs A00;
    public final UserJid A01;

    public void Bmt(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        A00(userJid.getPrimaryDevice());
    }

    public /* synthetic */ void Bmw(UserJid userJid) {
    }

    public void BvA(DeviceJid deviceJid) {
        C18070vi.A0d(deviceJid, 0);
        A00(deviceJid);
    }

    public void Bvj(DeviceJid deviceJid) {
        C18070vi.A0d(deviceJid, 0);
        A00(deviceJid);
    }

    public void Bvk(DeviceJid deviceJid) {
    }

    private final void A00(DeviceJid deviceJid) {
        if (C18070vi.A18(this.A01.getPrimaryDevice(), deviceJid)) {
            this.A00.A03((Object) null);
        }
    }

    public C20451ALo(C114465qs r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }

    public void Bvi(DeviceJid deviceJid) {
        A00(deviceJid);
    }
}
