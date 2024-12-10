package X;

/* renamed from: X.7E3  reason: invalid class name */
public class AnonymousClass7E3 implements C1606489j {
    public final /* synthetic */ AnonymousClass70L A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass7E3(AnonymousClass70L r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void BkO() {
        this.A00.A0H.requestPermission();
    }

    public void C4G(String str) {
        AnonymousClass70L r4 = this.A00;
        r4.A05.A0G("ContactFormSaveContactController: unable to save contact", AnonymousClass001.A1H("Failed to save contact: ", str, AnonymousClass000.A10()), false);
        r4.A06.A0J(new C146437Pc(this, 44));
    }

    public void C4K() {
        AnonymousClass70L r3 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r3.A0M, 9930) && r3.A0Q == null) {
            r3.A0A.A00(r3.A0G.A05());
        }
        if (!this.A01) {
            r3.A06.A0J(new C146437Pc(this, 45));
        }
    }
}
