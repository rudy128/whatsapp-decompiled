package X;

import com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager;
import com.whatsapp.util.Log;

/* renamed from: X.4pp  reason: invalid class name and case insensitive filesystem */
public final class C97654pp implements C108555bt {
    public final CompanionRegOverSideChannelV2Manager A00;
    public final AnonymousClass5a1 A01;
    public final C57572jI A02;

    public void C00(String str, int i) {
        StringBuilder A19 = AnonymousClass3MZ.A19(str, 2);
        A19.append("CompanionRegistrationHelper/onError ");
        A19.append(i);
        Log.w(AnonymousClass001.A1H(" with reason ", str, A19));
        this.A01.BpF();
    }

    public void BrR() {
        AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
        r3.A05.A0J(new C146447Pd(r3, 26));
    }

    public void Bw6() {
        Log.w("CompanionRegistrationHelper/onInvalidDeviceTime");
        this.A01.BpF();
    }

    public void Bw7() {
        Log.w("CompanionRegistrationHelper/onInvalidQrCode");
        this.A01.BpF();
    }

    public void C01() {
        AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
        r3.A05.A0J(new C146447Pd(r3, 24));
    }

    public void C35() {
        Log.w("CompanionRegistrationHelper/onRemovedAllDevices");
        this.A01.BpF();
    }

    public void C8G() {
        Log.w("CompanionRegistrationHelper/onSyncdDeleteAllError");
        this.A01.BpF();
    }

    public C97654pp(C56632hm r2, CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, AnonymousClass5a1 r4) {
        C18070vi.A0j(companionRegOverSideChannelV2Manager, r2);
        this.A00 = companionRegOverSideChannelV2Manager;
        this.A01 = r4;
        this.A02 = r2.A00(this);
    }
}
