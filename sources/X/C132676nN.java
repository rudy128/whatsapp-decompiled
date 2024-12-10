package X;

/* renamed from: X.6nN  reason: invalid class name and case insensitive filesystem */
public class C132676nN {
    public CharSequence A00 = "";
    public Runnable A01;
    public final AnonymousClass1KB A02;
    public final C111185ii A03;

    public void A00(CharSequence charSequence) {
        CharSequence charSequence2 = this.A00;
        C18070vi.A0d(charSequence, 1);
        if (charSequence2.length() <= 20 || charSequence.length() <= 20) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                this.A02.A0I(runnable);
            }
            this.A00 = charSequence;
            AnonymousClass7RQ r3 = new AnonymousClass7RQ(this, charSequence, 29);
            this.A01 = r3;
            this.A02.A0K(r3, 200);
        }
    }

    public C132676nN(AnonymousClass1KB r2, C111185ii r3) {
        this.A02 = r2;
        this.A03 = r3;
    }
}
