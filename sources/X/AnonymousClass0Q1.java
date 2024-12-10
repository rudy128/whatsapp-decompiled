package X;

import android.os.Parcel;
import android.util.Base64;
import java.util.List;

/* renamed from: X.0Q1  reason: invalid class name */
public final class AnonymousClass0Q1 {
    public final Parcel A00;

    public static final C25827Cme A03(List list) {
        Integer num = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            num = Integer.valueOf(num.intValue() | ((C25827Cme) list.get(i)).A00);
        }
        return new C25827Cme(num.intValue());
    }

    private final C25827Cme A01() {
        int readInt = this.A00.readInt();
        C25827Cme A02 = A02();
        boolean A1O = AnonymousClass000.A1O(A02.A00() & readInt);
        C25827Cme A01 = C25289Ccr.A01();
        boolean A1O2 = AnonymousClass000.A1O(readInt & A01.A00());
        if (A1O) {
            if (!A1O2) {
                return A02;
            }
            return A03(AnonymousClass1ZU.A08(A02, A01));
        } else if (A1O2) {
            return A01;
        } else {
            return C25289Ccr.A00();
        }
    }

    private final C26040Cr4 A04() {
        Parcel parcel = this.A00;
        return new C26040Cr4(parcel.readFloat(), parcel.readFloat());
    }

    public final long A05() {
        long j;
        Parcel parcel = this.A00;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j = 4294967296L;
        } else if (readByte == 2) {
            j = 8589934592L;
        } else {
            C25759ClU[] clUArr = C26130Cst.A02;
            return C7B.A00();
        }
        return A00(parcel.readFloat(), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r1 != 1) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        if (r1 == 2) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26053CrN A06() {
        /*
            r9 = this;
            X.0NV r2 = new X.0NV
            r2.<init>()
        L_0x0005:
            android.os.Parcel r3 = r9.A00
            int r0 = r3.dataAvail()
            r7 = 1
            if (r0 <= r7) goto L_0x011d
            byte r6 = r3.readByte()
            r5 = 8
            if (r6 != r7) goto L_0x0025
            int r0 = r3.dataAvail()
            if (r0 < r5) goto L_0x011d
            long r3 = r3.readLong()
            X.0Ek r0 = X.C05100Qk.A06
            r2.A01 = r3
            goto L_0x0005
        L_0x0025:
            r0 = 2
            r4 = 5
            if (r6 != r0) goto L_0x0036
            int r0 = r3.dataAvail()
            if (r0 < r4) goto L_0x011d
            long r0 = r9.A05()
            r2.A02 = r0
            goto L_0x0005
        L_0x0036:
            r0 = 3
            r1 = 4
            if (r6 != r0) goto L_0x0048
            int r0 = r3.dataAvail()
            if (r0 < r1) goto L_0x011d
            X.DSF r0 = r9.A07()
            r2.A03(r0)
            goto L_0x0005
        L_0x0048:
            if (r6 != r1) goto L_0x0062
            int r0 = r3.dataAvail()
            if (r0 < r7) goto L_0x011d
            byte r1 = r3.readByte()
            if (r1 == 0) goto L_0x0059
            r0 = 1
            if (r1 == r7) goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            X.Cma r0 = X.C25823Cma.A00(r0)
            r2.A01(r0)
            goto L_0x0005
        L_0x0062:
            if (r6 != r4) goto L_0x0083
            int r0 = r3.dataAvail()
            if (r0 < r7) goto L_0x011d
            byte r1 = r3.readByte()
            if (r1 == 0) goto L_0x0081
            r0 = 1
            if (r1 == r7) goto L_0x0079
            r0 = 3
            if (r1 == r0) goto L_0x0079
            r0 = 2
            if (r1 != r0) goto L_0x0081
        L_0x0079:
            X.Cmb r0 = X.C25824Cmb.A00(r0)
            r2.A02(r0)
            goto L_0x0005
        L_0x0081:
            r0 = 0
            goto L_0x0079
        L_0x0083:
            r0 = 6
            if (r6 != r0) goto L_0x008e
            java.lang.String r0 = r3.readString()
            r2.A05 = r0
            goto L_0x0005
        L_0x008e:
            r0 = 7
            if (r6 != r0) goto L_0x009f
            int r0 = r3.dataAvail()
            if (r0 < r4) goto L_0x011d
            long r0 = r9.A05()
            r2.A03 = r0
            goto L_0x0005
        L_0x009f:
            if (r6 != r5) goto L_0x00b4
            int r0 = r3.dataAvail()
            if (r0 < r1) goto L_0x011d
            float r0 = r3.readFloat()
            X.Cmc r0 = X.C25825Cmc.A00(r0)
            r2.A04(r0)
            goto L_0x0005
        L_0x00b4:
            r0 = 9
            if (r6 != r0) goto L_0x00c7
            int r0 = r3.dataAvail()
            if (r0 < r5) goto L_0x011d
            X.Cr4 r0 = r9.A04()
            r2.A06(r0)
            goto L_0x0005
        L_0x00c7:
            r0 = 10
            if (r6 != r0) goto L_0x00db
            int r0 = r3.dataAvail()
            if (r0 < r5) goto L_0x011d
            long r3 = r3.readLong()
            X.0Ek r0 = X.C05100Qk.A06
            r2.A00 = r3
            goto L_0x0005
        L_0x00db:
            r0 = 11
            if (r6 != r0) goto L_0x00ee
            int r0 = r3.dataAvail()
            if (r0 < r1) goto L_0x011d
            X.Cme r0 = r9.A01()
            r2.A05(r0)
            goto L_0x0005
        L_0x00ee:
            r0 = 12
            if (r6 != r0) goto L_0x0005
            int r1 = r3.dataAvail()
            r0 = 20
            if (r1 < r0) goto L_0x011d
            X.0NG r0 = X.AnonymousClass0NG.A03
            long r5 = r3.readLong()
            X.0Ek r0 = X.C05100Qk.A06
            float r1 = r3.readFloat()
            float r0 = r3.readFloat()
            long r7 = X.AnonymousClass001.A0p(r1, r0)
            long r0 = X.AnonymousClass0QY.A03
            float r4 = r3.readFloat()
            X.0NG r3 = new X.0NG
            r3.<init>(r4, r5, r7)
            r2.A04 = r3
            goto L_0x0005
        L_0x011d:
            X.CrN r0 = r2.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q1.A06():X.CrN");
    }

    public final DSF A07() {
        return new DSF(this.A00.readInt());
    }

    public AnonymousClass0Q1(String str) {
        Parcel obtain = Parcel.obtain();
        this.A00 = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public static final long A00(float f, long j) {
        return C26054CrP.A01(f, j);
    }

    public static final C25827Cme A02() {
        return C25827Cme.A01;
    }
}
