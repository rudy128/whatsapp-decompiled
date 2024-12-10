package X;

import java.util.List;

/* renamed from: X.6FQ  reason: invalid class name */
public final class AnonymousClass6FQ extends AnonymousClass6Fc {
    public C24135Bw1 A00;
    public boolean A01;

    public /* bridge */ /* synthetic */ void A07(AnonymousClass1E7 r7, AnonymousClass1E7 r8, AnonymousClass206 r9, List list) {
        C441822l r5 = (C441822l) r9;
        C18070vi.A0d(r5, 2);
        super.A07(r7, r8, r5, list);
        String A02 = AnonymousClass72W.A02(getContext(), this.A02, this.A03, this.A05, this.A06, r5);
        C18070vi.A0X(A02);
        setContentDescription(A02);
    }

    public void A0A(C441822l r2, List list) {
        super.A08(r2, list);
        C24135Bw1 bw1 = this.A00;
        if (bw1 != null) {
            bw1.setAudioMessage(r2);
        }
    }
}
