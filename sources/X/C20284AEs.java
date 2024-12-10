package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.AEs  reason: case insensitive filesystem */
public abstract class C20284AEs implements Parcelable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public long A05;
    public long A06;
    public C63572tK A07 = C63572tK.A0G;
    public C170278pb A08;
    public C1418477e A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public byte[] A0D;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.8pK, X.AEs] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.AEs, X.8pP] */
    public static C20284AEs A01(C63572tK r4, String str, String str2, String str3, int i) {
        C20284AEs aEs;
        if (i != 1) {
            if (i == 2) {
                C20284AEs aEs2 = new C20284AEs();
                C17960vV.A07(r4);
                aEs2.A07 = r4;
                aEs2.A05 = -1;
                aEs2.A06 = -1;
                aEs2.A00 = 0;
                aEs2.A01 = 0;
                aEs2.A0A = str2;
                aEs2.A0B(str3);
                aEs2.A0B = str;
                return aEs2;
            } else if (i == 3) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                LinkedHashSet linkedHashSet = r4.A05;
                ? aEs3 = new C20284AEs();
                aEs3.A01 = linkedHashSet;
                C17960vV.A07(r4);
                aEs3.A07 = r4;
                aEs3.A01 = 0;
                aEs3.A00 = 0;
                aEs3.A0A = str2;
                aEs3.A0B(str3);
                aEs3.A0D(r4, bigDecimal);
                aEs3.A08 = null;
                return aEs3;
            } else if (!(i == 4 || i == 6 || i == 8)) {
                if (i != 10) {
                    return null;
                }
                C20284AEs aEs4 = new C20284AEs();
                C17960vV.A07(r4);
                aEs4.A07 = r4;
                aEs4.A0A = str2;
                aEs = aEs4;
                aEs.A0B(str3);
                return aEs;
            }
        }
        int A012 = C20085A6m.A01(str);
        ? aEs5 = new C20284AEs();
        aEs5.A01 = A012;
        aEs5.A00 = i;
        aEs5.A0B = str;
        C17960vV.A07(r4);
        aEs5.A07 = r4;
        aEs5.A01 = 0;
        aEs5.A00 = 0;
        aEs5.A03 = 0;
        aEs5.A02 = 0;
        aEs5.A0A = str2;
        aEs = aEs5;
        if (str3 == null) {
            return aEs5;
        }
        aEs.A0B(str3);
        return aEs;
    }

    public void A07(int i) {
        int A052;
        if (i != 1 || this.A07.A01 == (A052 = A05())) {
            this.A00 = i;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: ");
        A10.append(A052);
        throw AnonymousClass001.A12(" in country cannot be legacy primary account type", A10);
    }

    public void A08(int i) {
        int A052;
        if (i != 1 || this.A07.A00 == (A052 = A05())) {
            this.A01 = i;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: ");
        A10.append(A052);
        throw AnonymousClass001.A12(" in country cannot be legacy primary account type", A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = ((X.C20284AEs) r4).A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0019
            boolean r1 = r4 instanceof X.C20284AEs
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.AEs r4 = (X.C20284AEs) r4
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r3.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            r2 = 0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20284AEs.equals(java.lang.Object):boolean");
    }

    public static Object A02(C20284AEs aEs) {
        C1418477e r0 = aEs.A09;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public int A05() {
        if (this instanceof AnonymousClass8pP) {
            return 3;
        }
        if (this instanceof AnonymousClass8pM) {
            return 9;
        }
        if (this instanceof AnonymousClass8pO) {
            return 5;
        }
        if (this instanceof AnonymousClass8pL) {
            return 10;
        }
        if (this instanceof AnonymousClass8pK) {
            return ((AnonymousClass8pK) this).A00;
        }
        if (this instanceof AnonymousClass8pN) {
            return 2;
        }
        return 0;
    }

    public Bitmap A06() {
        byte[] bArr;
        int A052;
        if (((this instanceof AnonymousClass8pQ) || (A052 = A05()) == 1 || A052 == 2 || A052 == 3 || A052 == 4 || A052 == 6 || A052 == 7) && (bArr = this.A0D) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public void A0A(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07.A03);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        byte[] bArr = this.A0D;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A0D;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeByte(AnonymousClass000.A1W(this.A08) ? (byte) 1 : 0);
        C170278pb r0 = this.A08;
        if (r0 != null) {
            parcel.writeParcelable(r0, 0);
        }
    }

    public int hashCode() {
        String str = this.A0A;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.8pK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.8pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.8pO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.8pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.8pM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.8pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.8pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.8pQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.8pQ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass8pP
            if (r0 == 0) goto L_0x0043
            r3 = r4
            X.8pP r3 = (X.AnonymousClass8pP) r3
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1KN r0 = r3.A0C()
            java.lang.String r0 = r0.toString()
            r5.writeString(r0)
            java.util.LinkedHashSet r0 = r3.A01
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()
        L_0x001e:
            r5.writeInt(r0)
            java.util.LinkedHashSet r0 = r3.A01
            if (r0 != 0) goto L_0x0027
            X.1Om r0 = X.C25511Om.A00
        L_0x0027:
            java.util.Iterator r2 = r0.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r1 = r2.next()
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            X.1KJ[] r0 = X.AnonymousClass1KI.A01
            r5.writeParcelable(r1, r6)
            goto L_0x002b
        L_0x003d:
            r0 = 0
            goto L_0x001e
        L_0x003f:
            r3.A0A(r5, r6)
            return
        L_0x0043:
            boolean r0 = r4 instanceof X.AnonymousClass8pM
            if (r0 == 0) goto L_0x0057
            r1 = r4
            X.8pM r1 = (X.AnonymousClass8pM) r1
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r0 = r1.A00
        L_0x0050:
            r5.writeString(r0)
        L_0x0053:
            r1.A0A(r5, r6)
            return
        L_0x0057:
            boolean r0 = r4 instanceof X.AnonymousClass8pO
            if (r0 == 0) goto L_0x007e
            r1 = r4
            X.8pO r1 = (X.AnonymousClass8pO) r1
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r0 = r1.A02
            r5.writeString(r0)
            boolean r0 = r1.A03
            byte r0 = (byte) r0
            r5.writeByte(r0)
            boolean r0 = r1.A04
            byte r0 = (byte) r0
            r5.writeByte(r0)
            java.lang.String r0 = r1.A01
            r5.writeString(r0)
            int r0 = r1.A00
        L_0x007a:
            r5.writeInt(r0)
            goto L_0x0053
        L_0x007e:
            boolean r0 = r4 instanceof X.AnonymousClass8pL
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r4 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x0095
            r1 = r4
            X.8pK r1 = (X.AnonymousClass8pK) r1
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r0 = r1.A01
            r5.writeInt(r0)
            int r0 = r1.A00
            goto L_0x007a
        L_0x0095:
            boolean r0 = r4 instanceof X.AnonymousClass8pN
            if (r0 != 0) goto L_0x00c1
            r1 = r4
            X.8pQ r1 = (X.AnonymousClass8pQ) r1
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.77e r0 = r1.A00
            r5.writeParcelable(r0, r6)
            java.lang.String r0 = r1.A01
            r5.writeString(r0)
            java.lang.String r0 = r1.A02
            r5.writeString(r0)
            java.lang.String r0 = r1.A06
            r5.writeString(r0)
            java.lang.String r0 = r1.A03
            r5.writeString(r0)
            java.lang.String r0 = r1.A05
            r5.writeString(r0)
            java.lang.String r0 = r1.A04
            goto L_0x0050
        L_0x00c1:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r4.A0A(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20284AEs.writeToParcel(android.os.Parcel, int):void");
    }

    public static int A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1211756856:
                    if (str.equals("VERIFIED")) {
                        return 3;
                    }
                    break;
                case 35394935:
                    if (str.equals("PENDING")) {
                        return 1;
                    }
                    break;
                case 2066319421:
                    if (str.equals("FAILED")) {
                        return 2;
                    }
                    break;
            }
        }
        return 0;
    }

    public static String A03(int i) {
        switch (i) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 8:
                return "Prepaid";
            default:
                return null;
        }
    }

    public static ArrayList A04(C63572tK r5, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            if (C137476vW.A01(r5.A09, A0P.A05())) {
                if (A0P.A01 == 2) {
                    A13.add(0, A0P);
                } else {
                    A13.add(A0P);
                }
            }
        }
        return A13;
    }

    public void A09(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A07 = C63572tK.A00(C108955ca.A0y(parcel.readString().trim()));
        this.A09 = (C1418477e) AnonymousClass3Ma.A08(parcel, C1418477e.class);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0D = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0D = bArr;
            parcel.readByteArray(bArr);
        }
        this.A08 = null;
        if (parcel.readByte() == 1) {
            this.A08 = (C170278pb) AnonymousClass3Ma.A08(parcel, C64502us.class);
        }
    }

    public void A0B(String str) {
        this.A09 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str, "bankName");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("credential-id: ");
        A10.append(this.A0A);
        A10.append(" country: ");
        A10.append(this.A07.A03);
        A10.append(" issuerName: ");
        A10.append(this.A0B);
        A10.append(" payment-mode: ");
        A10.append(this.A01);
        A10.append(" payout-mode: ");
        A10.append(this.A00);
        A10.append(" merchant-credential-id: ");
        A10.append(this.A0C);
        A10.append(" payout-verification-status: ");
        A10.append(this.A04);
        A10.append(" countrydata: ");
        return C17890vO.A0V(this.A08, A10);
    }
}
