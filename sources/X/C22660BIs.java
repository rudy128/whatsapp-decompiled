package X;

import android.widget.LinearLayout;

/* renamed from: X.BIs  reason: case insensitive filesystem */
public abstract class C22660BIs extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public static AnonymousClass10G A00(AnonymousClass10E r2, C18030ve r3, C24136Bw2 bw2) {
        bw2.A05 = r3;
        bw2.A0B = C000200d.A00(r2.AYQ);
        bw2.A00 = (AnonymousClass1KB) r2.A4b.get();
        bw2.A01 = (C34531kd) r2.A9m.get();
        bw2.A02 = (C33251iW) r2.ABA.get();
        bw2.A0A = (C32021gV) r2.A6k.get();
        bw2.A04 = (C219217x) r2.ABj.get();
        bw2.A07 = (C32431hB) r2.A66.get();
        AnonymousClass10G r1 = r2.A00;
        bw2.A08 = (C139246yW) r1.AD7.get();
        bw2.A03 = (C31131f4) r2.A6M.get();
        bw2.A06 = (C32861hs) r2.Agw.get();
        bw2.A0C = C000200d.A00(r1.A3f);
        return r1;
    }

    public void A04() {
        if (this instanceof C24134Bw0) {
            C24134Bw0 bw0 = (C24134Bw0) this;
            if (!bw0.A0D) {
                bw0.A0D = true;
                C27691Xc A0O = AnonymousClass3MY.A0O(bw0);
                AnonymousClass10E r3 = A0O.A10;
                AnonymousClass10G A002 = A00(r3, AnonymousClass10E.A8q(r3), bw0);
                bw0.A00 = (AnonymousClass11S) r3.A63.get();
                bw0.A02 = BE9.A0Y(r3);
                bw0.A01 = AnonymousClass10E.A50(r3);
                bw0.A05 = AnonymousClass10E.A6R(r3);
                bw0.A06 = (C25931Qe) r3.A3z.get();
                bw0.A0C = C000200d.A00(A002.A41);
                bw0.A07 = (C28537E6l) A0O.A07.get();
                bw0.A03 = (C134196qC) A002.A38.get();
            }
        } else if (this instanceof C24135Bw1) {
            C24135Bw1 bw1 = (C24135Bw1) this;
            if (!bw1.A0C) {
                bw1.A0C = true;
                C27691Xc A0O2 = AnonymousClass3MY.A0O(bw1);
                AnonymousClass10E r32 = A0O2.A10;
                AnonymousClass10G A003 = A00(r32, AnonymousClass10E.A8q(r32), bw1);
                bw1.A01 = AnonymousClass10E.A50(r32);
                bw1.A02 = BE9.A0Y(r32);
                bw1.A06 = (C25931Qe) r32.A3z.get();
                bw1.A00 = (AnonymousClass11S) r32.A63.get();
                bw1.A03 = (C134196qC) A003.A38.get();
                bw1.A07 = (C28537E6l) A0O2.A07.get();
                bw1.A0B = C000200d.A00(A003.A41);
                bw1.A05 = AnonymousClass10E.A6R(r32);
            }
        } else {
            C24133Bvz bvz = (C24133Bvz) this;
            if (!bvz.A05) {
                bvz.A05 = true;
                AnonymousClass10E r2 = AnonymousClass3MY.A0O(bvz).A10;
                AnonymousClass10G A004 = A00(r2, AnonymousClass10E.A8q(r2), bvz);
                bvz.A02 = AnonymousClass10E.A6R(r2);
                bvz.A01 = (C134196qC) A004.A38.get();
                bvz.A04 = C000200d.A00(A004.A41);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
