package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2jO  reason: invalid class name and case insensitive filesystem */
public final class C57632jO {
    public final /* synthetic */ DeviceJid A00;
    public final /* synthetic */ C35121lg A01;
    public final /* synthetic */ String A02;

    public C57632jO(DeviceJid deviceJid, C35121lg r2, String str) {
        this.A01 = r2;
        this.A00 = deviceJid;
        this.A02 = str;
    }

    public void A00(Exception exc) {
        C31081ez.A01(C17900vP.A0C("WafflePrimaryDeviceManager/onNonceRequestFromCompanion/fetchNonce/error ", AnonymousClass000.A10(), exc));
    }
}
