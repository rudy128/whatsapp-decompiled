package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6q8  reason: invalid class name and case insensitive filesystem */
public class C134156q8 {
    public final C22801Dg A00;
    public final C22801Dg A01;
    public final C22801Dg A02;
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final C131326ku A06;
    public final AnonymousClass1M9 A07;
    public final C24921Me A08;
    public final AnonymousClass1QB A09;
    public final AnonymousClass1WR A0A;
    public final AnonymousClass18K A0B;
    public final AnonymousClass19Y A0C;
    public final C34141jz A0D;
    public final C62112qo A0E;
    public final AnonymousClass10I A0F;
    public final AtomicBoolean A0G;
    public final AnonymousClass11P A0H;
    public volatile C42621yT A0I = null;

    public void A00() {
        Pair A0E2;
        if (!this.A0G.get()) {
            C22801Dg r4 = this.A02;
            if (r4.A06() != null) {
                Object obj = ((Pair) r4.A06()).first;
                Number number = (Number) ((Pair) r4.A06()).second;
                if (number != null) {
                    AnonymousClass1DT r1 = this.A03;
                    if (r1.A06() != null && C72463Mc.A0A(r1) != -1) {
                        A0E2 = C17890vO.A0E(obj, number.intValue() + 1);
                    } else if (Boolean.TRUE.equals(obj)) {
                        A0E2 = C17890vO.A0E(Boolean.FALSE, 0);
                    } else {
                        return;
                    }
                    r4.A0F(A0E2);
                }
            }
        }
    }

    public void A01(boolean z) {
        Boolean bool;
        this.A04.A0F(Boolean.TRUE);
        this.A01.A0F(new C139096yD());
        C22801Dg r2 = this.A02;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        r2.A0F(C17890vO.A0E(bool, 0));
        this.A0D.A0F = true;
    }

    public C134156q8(AnonymousClass1DS r8, AnonymousClass1DS r9, AnonymousClass1DS r10, AnonymousClass1DS r11, AnonymousClass1DS r12, C131326ku r13, AnonymousClass1M9 r14, C24921Me r15, AnonymousClass11P r16, C18000vb r17, AnonymousClass1QB r18, AnonymousClass18K r19, AnonymousClass19Y r20, C62112qo r21, CW0 cw0, AnonymousClass10I r23) {
        C22801Dg A0R = C108945cZ.A0R();
        this.A00 = A0R;
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A01 = A0R2;
        C22801Dg A0R3 = C108945cZ.A0R();
        this.A02 = A0R3;
        this.A0G = new AtomicBoolean();
        this.A0A = new AnonymousClass7FH(this, 5);
        this.A0F = r23;
        C34141jz r1 = new C34141jz(r17);
        r1.A01 = 100;
        this.A0D = r1;
        this.A0H = r16;
        this.A0B = r19;
        this.A07 = r14;
        this.A08 = r15;
        this.A09 = r18;
        C62112qo r4 = r21;
        this.A0E = r4;
        this.A0C = r20;
        this.A06 = r13;
        A01(false);
        C1424979r.A01(A0R, A0R2, cw0, this, 4);
        AnonymousClass7AR.A02(A0R3, A0R, this, 2);
        AnonymousClass7AR.A02(r9, A0R3, this, 3);
        AnonymousClass7AR.A02(r8, A0R3, this, 4);
        AnonymousClass7AR.A02(r10, A0R3, this, 5);
        A0R3.A0H(r11, new AnonymousClass7AH(r4, this, 12));
        AnonymousClass7AR.A02(r12, A0R3, this, 6);
    }
}
