package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class BPC extends C26017CqY implements Parcelable {
    @Deprecated
    public static final BPC A09;
    public static final BPC A0A;
    public static final Parcelable.Creator CREATOR = D3B.A00(21);
    public final int A00;
    public final SparseArray A01;
    public final SparseBooleanArray A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x00be
            r2 = 0
            if (r11 == 0) goto L_0x00bd
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x00bd
            boolean r0 = super.equals(r11)
            if (r0 == 0) goto L_0x00bd
            X.BPC r11 = (X.BPC) r11
            boolean r1 = r10.A04
            boolean r0 = r11.A04
            if (r1 != r0) goto L_0x00b1
            boolean r1 = r10.A05
            boolean r0 = r11.A05
            if (r1 != r0) goto L_0x00b1
            boolean r1 = r10.A08
            boolean r0 = r11.A08
            if (r1 != r0) goto L_0x00b1
            boolean r1 = r10.A07
            boolean r0 = r11.A07
            if (r1 != r0) goto L_0x00b1
            int r1 = r10.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x00b1
            boolean r1 = r10.A03
            boolean r0 = r11.A03
            if (r1 != r0) goto L_0x00b1
            android.util.SparseBooleanArray r4 = r10.A02
            android.util.SparseBooleanArray r3 = r11.A02
            int r2 = r4.size()
            int r0 = r3.size()
            if (r0 != r2) goto L_0x00b1
            r1 = 0
        L_0x004b:
            if (r1 >= r2) goto L_0x005a
            int r0 = r4.keyAt(r1)
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x00b1
            int r1 = r1 + 1
            goto L_0x004b
        L_0x005a:
            android.util.SparseArray r8 = r10.A01
            android.util.SparseArray r7 = r11.A01
            int r6 = r8.size()
            int r0 = r7.size()
            if (r0 != r6) goto L_0x00b1
            r5 = 0
        L_0x0069:
            if (r5 >= r6) goto L_0x00b6
            int r0 = r8.keyAt(r5)
            int r0 = r7.indexOfKey(r0)
            if (r0 < 0) goto L_0x00b1
            java.lang.Object r2 = r8.valueAt(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r7.valueAt(r0)
            java.util.Map r4 = (java.util.Map) r4
            int r1 = r2.size()
            int r0 = r4.size()
            if (r0 != r1) goto L_0x00b1
            java.util.Iterator r3 = X.AnonymousClass000.A15(r2)
        L_0x008f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r3)
            java.lang.Object r2 = r1.getKey()
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            if (r0 != 0) goto L_0x008f
        L_0x00b1:
            r9 = 0
            return r9
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x0069
        L_0x00b6:
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 != r0) goto L_0x00b1
            return r9
        L_0x00bd:
            return r2
        L_0x00be:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPC.equals(java.lang.Object):boolean");
    }

    static {
        BPC bpc = new BPC(new BPB());
        A0A = bpc;
        A09 = bpc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0E);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeList(this.A0L);
        parcel.writeInt(this.A0D);
        parcel.writeList(this.A0I);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A0J);
        parcel.writeList(this.A0K);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        C201110w r2 = this.A0G;
        parcel.writeInt(r2.size());
        AnonymousClass1IZ it = r2.keySet().iterator();
        while (it.hasNext()) {
            D3X d3x = (D3X) it.next();
            parcel.writeParcelable(d3x, i);
            parcel.writeParcelable((Parcelable) r2.get(d3x), i);
        }
        parcel.writeIntArray(C25336Cdv.A01(this.A0H));
        SparseArray sparseArray = this.A01;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                parcel.writeParcelable((Parcelable) A16.getKey(), 0);
                parcel.writeParcelable((Parcelable) A16.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public BPC(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put(AnonymousClass3Ma.A08(parcel, C26539D3a.class), AnonymousClass3Ma.A08(parcel, D3Y.class));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.A01 = sparseArray;
        this.A02 = parcel.readSparseBooleanArray();
        this.A04 = AnonymousClass000.A1O(parcel.readInt());
        this.A05 = AnonymousClass000.A1O(parcel.readInt());
        this.A08 = AnonymousClass000.A1O(parcel.readInt());
        this.A07 = AnonymousClass000.A1O(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A03 = AnonymousClass000.A1O(parcel.readInt());
        this.A06 = AnonymousClass000.A1O(parcel.readInt());
    }

    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + this.A00) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0);
    }

    public BPC(BPB bpb) {
        super((CUU) bpb);
        this.A01 = bpb.A07;
        this.A02 = bpb.A08;
        this.A04 = bpb.A02;
        this.A05 = bpb.A03;
        this.A08 = bpb.A06;
        this.A07 = bpb.A05;
        this.A00 = bpb.A00;
        this.A03 = bpb.A01;
        this.A06 = bpb.A04;
    }
}
