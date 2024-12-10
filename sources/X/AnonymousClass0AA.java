package X;

import java.util.List;

/* renamed from: X.0AA  reason: invalid class name */
public final class AnonymousClass0AA extends C02170Cz {
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05;
    public float A06;
    public long A07 = C05100Qk.A05;
    public C17040te A08;
    public String A09 = "";
    public List A0A = AnonymousClass0GD.A00;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D = true;
    public float[] A0E;
    public C22821Di A0F;
    public final List A0G = AnonymousClass000.A13();
    public final C22821Di A0H = new C10830iy(this);

    private final void A00(long j) {
        if (this.A0D) {
            long j2 = C05100Qk.A05;
            if (j != j2) {
                long j3 = this.A07;
                if (j3 == j2) {
                    this.A07 = j;
                    return;
                }
                List list = AnonymousClass0GD.A00;
                if (C05100Qk.A04(j3) != C05100Qk.A04(j) || C05100Qk.A03(j3) != C05100Qk.A03(j) || C05100Qk.A02(j3) != C05100Qk.A02(j)) {
                    this.A0D = false;
                    this.A07 = j2;
                }
            }
        }
    }

    private final void A01(C03380Hv r3) {
        if (this.A0D && r3 != null) {
            if (r3 instanceof AnonymousClass09Y) {
                A00(((AnonymousClass09Y) r3).A00);
                return;
            }
            this.A0D = false;
            this.A07 = C05100Qk.A05;
        }
    }

    public static final void A02(AnonymousClass0AA r2, C02170Cz r3) {
        if (r3 instanceof AnonymousClass0A9) {
            AnonymousClass0A9 r32 = (AnonymousClass0A9) r3;
            r2.A01(r32.A09);
            r2.A01(r32.A0A);
        } else if (r3 instanceof AnonymousClass0AA) {
            AnonymousClass0AA r33 = (AnonymousClass0AA) r3;
            if (!r33.A0D || !r2.A0D) {
                r2.A0D = false;
                r2.A07 = C05100Qk.A05;
                return;
            }
            r2.A00(r33.A07);
        }
    }

    public void A05(C17770vC r16) {
        if (this.A0C) {
            float[] fArr = this.A0E;
            if (fArr == null) {
                fArr = C05040Qd.A08();
                this.A0E = fArr;
            } else {
                C05040Qd.A04(fArr);
            }
            float f = this.A05;
            float f2 = this.A00;
            float f3 = f2 + f;
            float f4 = this.A06;
            float f5 = this.A01;
            C05040Qd.A05(fArr, f3, f4 + f5);
            double d = (((double) this.A02) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f6 = fArr[0];
            float f7 = fArr[4];
            float A002 = AnonymousClass000.A00(cos, f6, sin, f7);
            float f8 = -sin;
            float A003 = AnonymousClass000.A00(f8, f6, f7, cos);
            float f9 = fArr[1];
            float f10 = fArr[5];
            float A004 = AnonymousClass000.A00(cos, f9, sin, f10);
            float A005 = AnonymousClass000.A00(f8, f9, f10, cos);
            float f11 = fArr[2];
            float f12 = fArr[6];
            float A006 = AnonymousClass000.A00(cos, f11, sin, f12);
            float A007 = AnonymousClass000.A00(f8, f11, f12, cos);
            float f13 = fArr[3];
            float f14 = fArr[7];
            float A008 = AnonymousClass000.A00(cos, f13, sin, f14);
            float A009 = AnonymousClass000.A00(f8, f13, cos, f14);
            fArr[0] = A002;
            fArr[1] = A004;
            fArr[2] = A006;
            fArr[3] = A008;
            AnonymousClass001.A1U(fArr, A003, A005, A007, A009);
            float f15 = this.A03;
            float f16 = this.A04;
            AnonymousClass000.A1J(fArr, f15, 0);
            AnonymousClass000.A1J(fArr, f15, 1);
            AnonymousClass000.A1J(fArr, f15, 2);
            AnonymousClass000.A1J(fArr, f15, 3);
            AnonymousClass000.A1J(fArr, f16, 4);
            AnonymousClass000.A1J(fArr, f16, 5);
            AnonymousClass000.A1J(fArr, f16, 6);
            AnonymousClass000.A1J(fArr, f16, 7);
            AnonymousClass000.A1J(fArr, 1.0f, 8);
            AnonymousClass000.A1J(fArr, 1.0f, 9);
            AnonymousClass000.A1J(fArr, 1.0f, 10);
            AnonymousClass000.A1J(fArr, 1.0f, 11);
            C05040Qd.A05(fArr, -f2, -f5);
            this.A0C = false;
        }
        if (this.A0B) {
            if (AnonymousClass000.A1a(this.A0A)) {
                C17040te r1 = this.A08;
                if (r1 == null) {
                    r1 = AnonymousClass0WS.A00();
                    this.A08 = r1;
                }
                AnonymousClass0LK.A01(r1, this.A0A);
            }
            this.A0B = false;
        }
        C17770vC r7 = r16;
        AnonymousClass0t6 BQs = r7.BQs();
        long BZL = BQs.BZL();
        C16800tF A0010 = AnonymousClass0WZ.A00(BQs);
        float[] fArr2 = this.A0E;
        if (fArr2 != null) {
            ((C05890Wc) A0010).A00.BOJ().BFU(fArr2);
        }
        C17040te r12 = this.A08;
        if (AnonymousClass000.A1a(this.A0A) && r12 != null) {
            ((C05890Wc) A0010).A00.BOJ().BEz(r12);
        }
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C02170Cz) list.get(i)).A05(r7);
        }
        AnonymousClass001.A1P(BQs, BZL);
    }

    public final void A07(C02170Cz r3, int i) {
        List list = this.A0G;
        if (i < list.size()) {
            list.set(i, r3);
        } else {
            list.add(r3);
        }
        A02(this, r3);
        r3.A06(this.A0H);
        A03();
    }

    public C22821Di A04() {
        return this.A0F;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VGroup: ");
        A10.append(this.A09);
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            A10.append("\t");
            A10.append(obj.toString());
            A10.append("\n");
        }
        return A10.toString();
    }

    public void A06(C22821Di r1) {
        this.A0F = r1;
    }
}
