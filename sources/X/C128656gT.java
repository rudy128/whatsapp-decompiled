package X;

import java.util.Map;

/* renamed from: X.6gT  reason: invalid class name and case insensitive filesystem */
public final class C128656gT {
    public final AnonymousClass11S A00;
    public final Map A01;
    public final C41661wr A02 = new C41661wr("\\$\\[(.*?)\\]");

    public C128656gT(AnonymousClass11S r5) {
        C18070vi.A0d(r5, 1);
        this.A00 = r5;
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1H("USER.PHONE_NUMBER", new C147967gg(this, 6), r2);
        AnonymousClass1D6.A03("USER.PUSH_NAME", new C147967gg(this, 7), r2, 1);
        this.A01 = AnonymousClass1D7.A0B(r2);
    }
}
