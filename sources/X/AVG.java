package X;

import java.util.Set;

public final class AVG implements C72443Lz {
    public final AnonymousClass11S A00;
    public final AnonymousClass11Q A01;

    public Set CGJ() {
        return C200410p.A0S(new AnonymousClass9IM[]{AnonymousClass9IM.COMMON_ENC, AnonymousClass9IM.PARTICIPANTS, AnonymousClass9IM.BONSAI});
    }

    public AVG(AnonymousClass11S r1, AnonymousClass11Q r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BLq(C196049uN r5, C195829ty r6, A1O a1o) {
        C18070vi.A0i(a1o, r5);
        if (this.A00.A0N() && r5.A00 > 0) {
            byte[] A03 = this.A01.A03();
            C17960vV.A07(A03);
            A1O.A00(a1o, new C29621ca("device-identity", A03, (AnonymousClass1MD[]) null));
        }
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.COMPANION_MODE_ADV;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
