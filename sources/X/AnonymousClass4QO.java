package X;

/* renamed from: X.4QO  reason: invalid class name */
public final class AnonymousClass4QO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C85434Nj A01;
    public final /* synthetic */ Integer A02;

    public AnonymousClass4QO(C85434Nj r1, Integer num, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = num;
    }

    public void A00(boolean z) {
        AnonymousClass00H r0 = this.A01.A02;
        if (r0 != null) {
            AnonymousClass4MC r5 = (AnonymousClass4MC) r0.get();
            int i = this.A00;
            Integer num = this.A02;
            Boolean valueOf = Boolean.valueOf(z);
            C81433zE r3 = new C81433zE();
            r3.A02 = Integer.valueOf(i);
            if (num != null) {
                r3.A01 = num;
            }
            if (C18020vd.A05(C18040vf.A02, r5.A00, 8823) && valueOf != null) {
                r3.A00 = valueOf;
            }
            r5.A01.CC4(r3);
            return;
        }
        C18070vi.A11("settingsLogger");
        throw null;
    }
}
