package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Rn  reason: invalid class name and case insensitive filesystem */
public final class C26281Rn {
    public final AnonymousClass1DT A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1PS A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass00H A06;

    public C26281Rn(AnonymousClass1KB r2, AnonymousClass11E r3, AnonymousClass11P r4, AnonymousClass1PS r5, AnonymousClass18K r6, AnonymousClass00H r7) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r3, 5);
        C18070vi.A0d(r5, 6);
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r5.A00;
    }

    public final void A00() {
        Log.i("DisappearingModeManager/getDisappearingModeSetting");
        AnonymousClass00H r4 = this.A06;
        String A0B = ((AnonymousClass1OZ) r4.get()).A0B();
        ((AnonymousClass1OZ) r4.get()).A0N(new C693736y(this, 0), new C29621ca("iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B), new AnonymousClass1MD("xmlns", "disappearing_mode"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")}), A0B, 296, 20000);
    }
}
