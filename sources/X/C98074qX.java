package X;

/* renamed from: X.4qX  reason: invalid class name and case insensitive filesystem */
public class C98074qX implements C108165bE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1E7 A01;
    public final /* synthetic */ C75403hR A02;

    public C98074qX(AnonymousClass1E7 r1, C75403hR r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public void Byx() {
        AnonymousClass4Yv.A00(this.A02.A02, this.A00);
    }

    public void C11(boolean z) {
        A34 r5;
        AnonymousClass10I r0;
        C75403hR r3 = this.A02;
        AnonymousClass01E r6 = r3.A02;
        int i = this.A00;
        AnonymousClass4Yv.A00(r6, i);
        boolean A1T = AnonymousClass000.A1T(i, 29);
        AnonymousClass1E7 r11 = this.A01;
        boolean z2 = z;
        if (A1T) {
            r0 = r3.A0D;
            r5 = new C826649g(r6, r3.A03, r3.A05, (C72073Kn) null, r3.A07, r11, (Integer) null, (Integer) null, (String) null, (String) null, "chat", true, false, true, z2);
        } else {
            r5 = new AnonymousClass49Y((AnonymousClass1FU) r6, r3.A05, r3.A0C, z2);
            r0 = r3.A0D;
        }
        AnonymousClass3MW.A1T(r5, r0, 0);
    }
}
