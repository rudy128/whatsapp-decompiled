package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AEn  reason: case insensitive filesystem */
public final class C20279AEn implements Parcelable {
    public static final Map A0W;
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public long A01;
    public long A02;
    public C22565BDa A03;
    public C20266ADy A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final AnonymousClass1KJ A0A;
    public final AES A0B;
    public final AE0 A0C;
    public final AEU A0D;
    public final ADZ A0E;
    public final AE1 A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final byte[] A0U;
    public final String A0V;

    public C20279AEn(AnonymousClass1KJ r3, C22565BDa bDa, AES aes, C20266ADy aDy, AE0 ae0, AEU aeu, ADZ adz, AE1 ae1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2, List list3, List list4, List list5, byte[] bArr, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(str2, 4);
        C18070vi.A0d(aeu, 10);
        this.A0U = bArr;
        this.A0L = str;
        this.A0F = ae1;
        this.A0K = str2;
        this.A0H = str3;
        this.A0M = str4;
        this.A0A = r3;
        this.A0V = str5;
        this.A0I = str6;
        this.A0D = aeu;
        this.A08 = str7;
        this.A00 = i;
        this.A07 = str8;
        this.A06 = str9;
        this.A02 = j;
        this.A0S = z;
        this.A0N = list;
        this.A0O = list2;
        this.A09 = z2;
        this.A0Q = list3;
        this.A0E = adz;
        this.A0G = str10;
        this.A03 = bDa;
        this.A0P = list4;
        this.A01 = j2;
        this.A05 = str11;
        this.A0B = aes;
        this.A0C = ae0;
        this.A0R = list5;
        this.A0T = z3;
        this.A04 = aDy;
        this.A0J = str12;
    }

    public final ARR A02(AE1 ae1) {
        C18070vi.A0d(ae1, 0);
        long abs = Math.abs(ae1.A01);
        int i = ae1.A00;
        AnonymousClass1KJ r0 = this.A0A;
        if (i <= 0) {
            i = 1;
        }
        C17960vV.A07(r0);
        C18070vi.A0X(r0);
        return C196669vR.A00(r0, i, abs);
    }

    public final String A05(C18000vb r3) {
        C18070vi.A0d(r3, 0);
        C22565BDa bDa = this.A03;
        if (bDa == null) {
            return null;
        }
        AnonymousClass1KJ r1 = this.A0A;
        C17960vV.A07(r1);
        return r1.BLd(r3, ((ARR) bDa).A02.A00);
    }

    public final String A06(C18000vb r3) {
        C18070vi.A0d(r3, 0);
        String A072 = A07(r3, this.A0F);
        if (A072 != null) {
            return A072;
        }
        AnonymousClass1KJ r1 = this.A0A;
        C17960vV.A07(r1);
        return r1.BLd(r3, BigDecimal.ZERO);
    }

    public final String A07(C18000vb r6, AE1 ae1) {
        C18070vi.A0d(r6, 0);
        if (ae1 == null || ae1.A01 == 0) {
            return null;
        }
        ARR A022 = A02(ae1);
        AnonymousClass1KJ r1 = this.A0A;
        C17960vV.A07(r1);
        return r1.BLd(r6, A022.A02.A00);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20279AEn) {
                C20279AEn aEn = (C20279AEn) obj;
                if (!C18070vi.A18(this.A0U, aEn.A0U) || !C18070vi.A18(this.A0L, aEn.A0L) || !C18070vi.A18(this.A0F, aEn.A0F) || !C18070vi.A18(this.A0K, aEn.A0K) || !C18070vi.A18(this.A0H, aEn.A0H) || !C18070vi.A18(this.A0M, aEn.A0M) || !C18070vi.A18(this.A0A, aEn.A0A) || !C18070vi.A18(this.A0V, aEn.A0V) || !C18070vi.A18(this.A0I, aEn.A0I) || !C18070vi.A18(this.A0D, aEn.A0D) || !C18070vi.A18(this.A08, aEn.A08) || this.A00 != aEn.A00 || !C18070vi.A18(this.A07, aEn.A07) || !C18070vi.A18(this.A06, aEn.A06) || this.A02 != aEn.A02 || this.A0S != aEn.A0S || !C18070vi.A18(this.A0N, aEn.A0N) || !C18070vi.A18(this.A0O, aEn.A0O) || this.A09 != aEn.A09 || !C18070vi.A18(this.A0Q, aEn.A0Q) || !C18070vi.A18(this.A0E, aEn.A0E) || !C18070vi.A18(this.A0G, aEn.A0G) || !C18070vi.A18(this.A03, aEn.A03) || !C18070vi.A18(this.A0P, aEn.A0P) || this.A01 != aEn.A01 || !C18070vi.A18(this.A05, aEn.A05) || !C18070vi.A18(this.A0B, aEn.A0B) || !C18070vi.A18(this.A0C, aEn.A0C) || !C18070vi.A18(this.A0R, aEn.A0R) || this.A0T != aEn.A0T || !C18070vi.A18(this.A04, aEn.A04) || !C18070vi.A18(this.A0J, aEn.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByteArray(this.A0U);
        parcel.writeString(this.A0L);
        AnonymousClass8BX.A10(parcel, this.A0F, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0M);
        AnonymousClass1KJ r1 = this.A0A;
        if (r1 != null) {
            AnonymousClass1KJ[] r0 = AnonymousClass1KI.A01;
            parcel.writeParcelable(r1, i);
        }
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0I);
        this.A0D.writeToParcel(parcel, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A02);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        List list = this.A0N;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                AnonymousClass8BU.A14(parcel, A0r, i);
            }
        }
        List list2 = this.A0O;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r2 = C108985cd.A0r(parcel, list2);
            while (A0r2.hasNext()) {
                ((C20267ADz) A0r2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        List list3 = this.A0Q;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r3 = C108985cd.A0r(parcel, list3);
            while (A0r3.hasNext()) {
                ((C20251ADj) A0r3.next()).writeToParcel(parcel, i);
            }
        }
        ADZ adz = this.A0E;
        if (adz == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adz.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A03, i);
        parcel.writeStringList(this.A0P);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A0B, i);
        AE0 ae0 = this.A0C;
        if (ae0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ae0.writeToParcel(parcel, i);
        }
        List list4 = this.A0R;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r4 = C108985cd.A0r(parcel, list4);
            while (A0r4.hasNext()) {
                ((C20928Abi) A0r4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        C20266ADy aDy = this.A04;
        if (aDy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDy.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0J);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        LinkedHashMap A13 = C17880vN.A13();
        A0W = A13;
        Integer[] numArr = new Integer[8];
        numArr[0] = 2;
        numArr[1] = 7;
        numArr[2] = 8;
        numArr[3] = 5;
        numArr[4] = 6;
        numArr[5] = 3;
        Integer A0f = C108955ca.A0f();
        numArr[6] = A0f;
        A00(4, 1, A13, numArr, 7);
        Integer[] numArr2 = new Integer[7];
        numArr2[0] = 7;
        numArr2[1] = 8;
        numArr2[2] = 5;
        numArr2[3] = 6;
        numArr2[4] = 3;
        numArr2[5] = A0f;
        A00(4, 2, A13, numArr2, 6);
        Integer[] numArr3 = new Integer[7];
        numArr3[0] = 2;
        numArr3[1] = 8;
        numArr3[2] = 5;
        numArr3[3] = 6;
        numArr3[4] = 3;
        numArr3[5] = A0f;
        A00(4, 7, A13, numArr3, 6);
        Integer[] numArr4 = new Integer[7];
        numArr4[0] = 2;
        numArr4[1] = 7;
        numArr4[2] = 8;
        numArr4[3] = 6;
        numArr4[4] = A0f;
        numArr4[5] = 3;
        A00(4, 5, A13, numArr4, 6);
        Integer[] numArr5 = new Integer[7];
        numArr5[0] = 2;
        numArr5[1] = 7;
        numArr5[2] = 8;
        numArr5[3] = 5;
        numArr5[4] = 3;
        numArr5[5] = A0f;
        A00(4, 6, A13, numArr5, 6);
        Integer[] numArr6 = new Integer[6];
        numArr6[0] = 7;
        numArr6[1] = 6;
        numArr6[2] = 5;
        numArr6[3] = A0f;
        numArr6[4] = 3;
        A00(4, 8, A13, numArr6, 5);
        Integer[] numArr7 = new Integer[6];
        numArr7[0] = 7;
        numArr7[1] = 8;
        numArr7[2] = 6;
        numArr7[3] = 5;
        numArr7[4] = 3;
        A00(4, A0f, A13, numArr7, 5);
    }

    public static void A00(Object obj, Object obj2, Map map, Object[] objArr, int i) {
        objArr[i] = obj;
        map.put(obj2, C200410p.A0S(objArr));
    }

    public final int A01() {
        String str = this.A0M;
        if ("digital-goods".equals(str)) {
            return 1;
        }
        return AnonymousClass8BU.A00("physical-goods".equals(str) ? 1 : 0);
    }

    public final BDZ A03(Class cls, String str) {
        String str2;
        BDZ bdz;
        List<C20251ADj> list = this.A0Q;
        if (list != null && !list.isEmpty()) {
            for (C20251ADj aDj : list) {
                if (aDj != null) {
                    str2 = aDj.A01;
                } else {
                    str2 = null;
                }
                if (str.equalsIgnoreCase(str2) && aDj != null && (bdz = aDj.A00) != null && cls.isInstance(bdz)) {
                    return (BDZ) cls.cast(bdz);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (r3 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04() {
        /*
            r7 = this;
            java.lang.String r2 = r7.A0V
            if (r2 == 0) goto L_0x000a
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00a9
        L_0x000a:
            java.util.List r1 = r7.A0Q
            if (r1 == 0) goto L_0x00a9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00a9
            java.util.Iterator r6 = r1.iterator()
        L_0x0018:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r3 = r6.next()
            X.ADj r3 = (X.C20251ADj) r3
            r4 = 0
            if (r3 == 0) goto L_0x003a
            X.BDZ r5 = r3.A00
            if (r5 == 0) goto L_0x003b
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "upi_merchant_configuration"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003b
            X.Abn r5 = (X.C20933Abn) r5
            java.lang.String r1 = r5.A01
        L_0x0039:
            return r1
        L_0x003a:
            r5 = r4
        L_0x003b:
            boolean r0 = r5 instanceof X.C20926Abg
            if (r0 == 0) goto L_0x0058
            java.lang.String r1 = "cards"
            java.lang.String r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0070
            X.BDZ r0 = r3.A00
            X.Abg r0 = (X.C20926Abg) r0
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0018
        L_0x0051:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0039
            goto L_0x0018
        L_0x0058:
            if (r3 != 0) goto L_0x0070
            r0 = r4
        L_0x005b:
            boolean r0 = r0 instanceof X.C20936Abq
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = "payment_gateway"
            java.lang.String r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a6
            X.BDZ r0 = r3.A00
            X.Abq r0 = (X.C20936Abq) r0
            java.lang.String r1 = r0.A00
            goto L_0x0051
        L_0x0070:
            X.BDZ r0 = r3.A00
            goto L_0x005b
        L_0x0073:
            if (r3 != 0) goto L_0x00a6
            r0 = r4
        L_0x0076:
            boolean r0 = r0 instanceof X.C20930Abk
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = "upi_merchant_vpa"
            java.lang.String r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008f
            X.BDZ r0 = r3.A00
            X.Abk r0 = (X.C20930Abk) r0
            X.Abl r0 = r0.A01
        L_0x008a:
            java.lang.String r1 = r0.A00
            return r1
        L_0x008d:
            if (r3 == 0) goto L_0x0091
        L_0x008f:
            X.BDZ r4 = r3.A00
        L_0x0091:
            boolean r0 = r4 instanceof X.C20929Abj
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = "upi_intent_link"
            java.lang.String r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            X.BDZ r0 = r3.A00
            X.Abj r0 = (X.C20929Abj) r0
            X.Abl r0 = r0.A01
            goto L_0x008a
        L_0x00a6:
            X.BDZ r0 = r3.A00
            goto L_0x0076
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20279AEn.A04():java.lang.String");
    }

    public final boolean A08() {
        AE1 ae1 = this.A0F;
        if (ae1 == null || ae1.A01 == 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        byte[] bArr = this.A0U;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        String str = this.A0K;
        AEU aeu = this.A0D;
        long j = this.A02;
        return ((AnonymousClass0DV.A00((((((((AnonymousClass001.A0K(this.A01, (((((((((AnonymousClass0DV.A00((((AnonymousClass0DV.A00(AnonymousClass001.A0K(j, (((((((AnonymousClass000.A0N(aeu, (((((((((C17890vO.A02(str, ((((hashCode * 31) + C17900vP.A00(this.A0L)) * 31) + AnonymousClass001.A0k(this.A0F)) * 31) + C17900vP.A00(this.A0H)) * 31) + C17900vP.A00(this.A0M)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + C17900vP.A00(this.A0V)) * 31) + C17900vP.A00(this.A0I)) * 31) + C17900vP.A00(this.A08)) * 31) + this.A00) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A06)) * 31), this.A0S) + AnonymousClass001.A0k(this.A0N)) * 31) + AnonymousClass001.A0k(this.A0O)) * 31, this.A09) + AnonymousClass001.A0k(this.A0Q)) * 31) + AnonymousClass001.A0k(this.A0E)) * 31) + C17900vP.A00(this.A0G)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A0P)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + AnonymousClass001.A0k(this.A0R)) * 31, this.A0T) + AnonymousClass001.A0k(this.A04)) * 31) + C108955ca.A06(this.A0J);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutInfoContent(thumbnail=");
        C17890vO.A1C(A10, this.A0U);
        A10.append(", title=");
        A10.append(this.A0L);
        A10.append(", totalAmount=");
        A10.append(this.A0F);
        A10.append(", referenceId=");
        A10.append(this.A0K);
        A10.append(", orderRequestId=");
        A10.append(this.A0H);
        A10.append(", type=");
        A10.append(this.A0M);
        A10.append(", currency=");
        A10.append(this.A0A);
        A10.append(", paymentConfiguration=");
        A10.append(this.A0V);
        A10.append(", paymentType=");
        A10.append(this.A0I);
        A10.append(", order=");
        A10.append(this.A0D);
        A10.append(", transactionId=");
        A10.append(this.A08);
        A10.append(", transactionStatus=");
        A10.append(this.A00);
        A10.append(", paymentStatus=");
        A10.append(this.A07);
        A10.append(", nonNativePaymentMethod=");
        A10.append(this.A06);
        A10.append(", paymentUpdateTimestamp=");
        A10.append(this.A02);
        A10.append(", isInteractive=");
        A10.append(this.A0S);
        A10.append(", beneficiaries=");
        A10.append(this.A0N);
        A10.append(", externalPaymentConfigurations=");
        A10.append(this.A0O);
        A10.append(", maybePaidExternally=");
        A10.append(this.A09);
        A10.append(", paymentSettings=");
        A10.append(this.A0Q);
        A10.append(", orderInstallmentData=");
        A10.append(this.A0E);
        A10.append(", additionalNote=");
        A10.append(this.A0G);
        A10.append(", paidAmount=");
        A10.append(this.A03);
        A10.append(", nativePaymentMethods=");
        A10.append(this.A0P);
        A10.append(", orderUpdatedTimestampMs=");
        A10.append(this.A01);
        A10.append(", loggingId=");
        A10.append(this.A05);
        A10.append(", shippingInfo=");
        A10.append(this.A0B);
        A10.append(", flowConfiguration=");
        A10.append(this.A0C);
        A10.append(", preferredPaymentMethods=");
        A10.append(this.A0R);
        A10.append(", sharePaymentStatus=");
        A10.append(this.A0T);
        A10.append(", coupon=");
        A10.append(this.A04);
        A10.append(", preferredPaymentSettingType=");
        return C17900vP.A0B(this.A0J, A10);
    }
}
