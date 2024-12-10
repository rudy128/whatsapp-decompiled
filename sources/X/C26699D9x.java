package X;

/* renamed from: X.D9x  reason: case insensitive filesystem */
public final class C26699D9x implements C28652ECm {
    public final C28652ECm A00;
    public final C24793CKm A01;
    public final /* synthetic */ C26029Cqn A02;

    public C26699D9x(C28652ECm eCm, C26029Cqn cqn, C24793CKm cKm) {
        this.A02 = cqn;
        this.A00 = eCm;
        this.A01 = cKm;
    }

    public void Bt8(int i, int i2, String str, String str2) {
        this.A00.Bt8(i, i2, str, str2);
        if (this.A01 != null) {
            C24578C9z.A00(str2);
            C25922Cog.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", BE6.A1Z());
        }
    }

    public void C61(EA9 ea9, DSC dsc) {
        this.A00.C61(ea9, dsc);
    }

    public void C62(EA9 ea9, DSC dsc) {
        this.A00.C62(ea9, dsc);
    }

    public void C63(EA9 ea9, DSC dsc, DSC dsc2, Integer num) {
        this.A00.C63(ea9, dsc, dsc2, num);
    }

    public void C6K(EA9 ea9, String str, long j, long j2) {
        this.A00.C6K(ea9, str, j, j2);
    }
}
