package X;

import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.2pG  reason: invalid class name and case insensitive filesystem */
public final class C61182pG {
    public final AnonymousClass00H A00;

    public C61182pG(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final boolean A00(C61182pG r2) {
        CallInfo A01 = ((C88054Yd) r2.A00.get()).A01();
        if (A01 == null || !A01.isBotCall) {
            return false;
        }
        return true;
    }
}
