package X;

import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.Aem  reason: case insensitive filesystem */
public class C21118Aem implements AnonymousClass1TI {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C21118Aem(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj;
    }

    public final void accept(Object obj) {
        boolean z;
        C41111vp r1;
        int i;
        if (this.A00 != 0) {
            ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) this.A02;
            int i2 = this.A01;
            AnonymousClass206 r4 = (AnonymousClass206) this.A03;
            if (AnonymousClass000.A1Y(obj)) {
                reactionsTrayViewModel.A02 = i2;
                C32731hf r0 = reactionsTrayViewModel.A0D;
                r0.A00.CC7(C32731hf.A00(C62242r5.A00(r4, r0.A01), C64002u3.A05(r4), 1));
                reactionsTrayViewModel.A0E.A00(r4, AnonymousClass00R.A00, reactionsTrayViewModel.A01);
                r1 = reactionsTrayViewModel.A0F;
                i = 1;
            } else {
                r1 = reactionsTrayViewModel.A0F;
                i = -2;
            }
            AnonymousClass3MX.A1K(r1, i);
            return;
        }
        int i3 = this.A01;
        C21132Af0 af0 = (C21132Af0) this.A03;
        AnonymousClass1D6 r8 = (AnonymousClass1D6) obj;
        C18070vi.A0k(af0, r8);
        AnonymousClass00H r42 = ((C192239o2) this.A02).A01;
        AnonymousClass8BR.A0V(r42).A07(i3, "psl_cache_hit", AnonymousClass000.A1Y(r8.first));
        AnonymousClass8BR.A0V(r42).A0B(Integer.valueOf(i3), "psl_cache_fetch_end");
        String str = null;
        if (AnonymousClass000.A1Y(r8.first)) {
            byte[] bArr = (byte[]) r8.second;
            if (bArr != null) {
                str = C108955ca.A13(bArr);
            }
            z = AnonymousClass000.A0i();
        } else {
            z = false;
        }
        af0.A0B(AnonymousClass1D6.A01(z, str));
    }
}
