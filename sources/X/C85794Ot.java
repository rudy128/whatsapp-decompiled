package X;

import com.whatsapp.calling.areffects.state.CallArEffectsStateHolder$productSessionInfo$4;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.4Ot  reason: invalid class name and case insensitive filesystem */
public final class C85794Ot {
    public String A00 = "";
    public final C88054Yd A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C23421Fz A04;
    public final AnonymousClass1G4 A05 = AnonymousClass3MW.A18(new AnonymousClass4YJ((String) null, false, false));
    public final AnonymousClass1G1 A06;

    public C85794Ot(C88054Yd r7, VoipCameraManager voipCameraManager, AnonymousClass00H r9, Integer num, AnonymousClass1OX r11) {
        C18070vi.A0w(voipCameraManager, r9, r11, num, r7);
        this.A01 = r7;
        C27182DXr dXr = new C27182DXr(AnonymousClass1D6.A01(new AnonymousClass4Y4((AnonymousClass4T2) null, ""), new AnonymousClass4Y4((AnonymousClass4T2) null, "")), new CallArEffectsStateHolder$productSessionInfo$4((C30391dr) null), new C99464sr(C26092CsA.A02(new C99454sq(new C99454sq(r7.A06.getValue(), 8), 9)), r9, 1));
        this.A04 = dXr;
        this.A03 = AnonymousClass1DF.A00(num, new AnonymousClass5C5(voipCameraManager));
        this.A06 = AnonymousClass4Z7.A01("", r11, new C99454sq(dXr, 10), AnonymousClass4ZC.A00);
        this.A02 = AnonymousClass1DF.A00(num, new AnonymousClass5PF(this, voipCameraManager, r11));
    }
}
