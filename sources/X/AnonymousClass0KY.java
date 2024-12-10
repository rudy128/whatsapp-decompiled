package X;

import android.os.Parcel;

/* renamed from: X.0KY  reason: invalid class name */
public final class AnonymousClass0KY {
    public Parcel A00 = Parcel.obtain();

    public final void A00(long j) {
        long A002 = C26130Cst.A00(j);
        byte b = 0;
        if (!AnonymousClass000.A1P((A002 > 0 ? 1 : (A002 == 0 ? 0 : -1)))) {
            if (A002 == 4294967296L) {
                b = 1;
            } else if (A002 == 8589934592L) {
                b = 2;
            }
        }
        this.A00.writeByte(b);
        if (C26130Cst.A00(j) != 0) {
            this.A00.writeFloat(AnonymousClass001.A01(j));
        }
    }

    public final void A01(C26053CrN crN) {
        long A02 = crN.A02();
        long j = C05100Qk.A05;
        if (A02 != j) {
            this.A00.writeByte((byte) 1);
            this.A00.writeLong(crN.A02());
        }
        long A03 = crN.A03();
        C25759ClU[] clUArr = C26130Cst.A02;
        if (A03 != C7B.A00()) {
            this.A00.writeByte((byte) 2);
            A00(A03);
        }
        DSF A09 = crN.A09();
        if (A09 != null) {
            this.A00.writeByte((byte) 3);
            A02(A09);
        }
        C25823Cma A07 = crN.A07();
        if (A07 != null) {
            int A01 = A07.A01();
            this.A00.writeByte((byte) 4);
            boolean z = false;
            if (A01 == 0) {
                z = true;
            }
            byte b = 0;
            if (!z && A01 == 1) {
                b = 1;
            }
            this.A00.writeByte(b);
        }
        C25824Cmb A08 = crN.A08();
        if (A08 != null) {
            int A012 = A08.A01();
            this.A00.writeByte((byte) 5);
            boolean z2 = false;
            if (A012 == 0) {
                z2 = true;
            }
            byte b2 = 0;
            if (!z2) {
                if (A012 == 1) {
                    b2 = 1;
                } else if (A012 == 2) {
                    b2 = 2;
                } else if (A012 == 3) {
                    b2 = 3;
                }
            }
            this.A00.writeByte(b2);
        }
        String A0D = crN.A0D();
        if (A0D != null) {
            this.A00.writeByte((byte) 6);
            this.A00.writeString(A0D);
        }
        long A04 = crN.A04();
        if (A04 != C7B.A00()) {
            this.A00.writeByte((byte) 7);
            A00(A04);
        }
        C25825Cmc A0A = crN.A0A();
        if (A0A != null) {
            float A013 = A0A.A01();
            this.A00.writeByte((byte) 8);
            this.A00.writeFloat(A013);
        }
        C26040Cr4 A0C = crN.A0C();
        if (A0C != null) {
            this.A00.writeByte((byte) 9);
            A04(A0C);
        }
        long A014 = crN.A01();
        if (A014 != j) {
            this.A00.writeByte((byte) 10);
            this.A00.writeLong(A014);
        }
        C25827Cme A0B = crN.A0B();
        if (A0B != null) {
            this.A00.writeByte((byte) 11);
            A03(A0B);
        }
        AnonymousClass0NG A05 = crN.A05();
        if (A05 != null) {
            this.A00.writeByte((byte) 12);
            this.A00.writeLong(A05.A01);
            long j2 = A05.A02;
            this.A00.writeFloat(AnonymousClass0QY.A01(j2));
            this.A00.writeFloat(AnonymousClass0QY.A02(j2));
            this.A00.writeFloat(A05.A00);
        }
    }

    public final void A02(DSF dsf) {
        this.A00.writeInt(dsf.A00());
    }

    public final void A03(C25827Cme cme) {
        this.A00.writeInt(cme.A00());
    }

    public final void A04(C26040Cr4 cr4) {
        this.A00.writeFloat(cr4.A00());
        this.A00.writeFloat(cr4.A01());
    }
}
