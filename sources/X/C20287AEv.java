package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AEv  reason: case insensitive filesystem */
public class C20287AEv implements Parcelable, B7B {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public long A01;
    public ADH A02;
    public AEJ A03;
    public AE5 A04;
    public AE6 A05;
    public ADX A06;
    public A6S A07;
    public String A08;
    public BigDecimal A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public final C20255ADn A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;

    public final void A00(AnonymousClass22Q r4) {
        C18070vi.A0d(r4, 0);
        r4.A06 = this.A0H;
        r4.A0A = this.A08;
        r4.A04 = this.A0E;
        A6S a6s = this.A07;
        if (a6s != null) {
            r4.A03 = a6s.A00;
            BigDecimal bigDecimal = this.A09;
            r4.A0B = bigDecimal;
            AE5 ae5 = this.A04;
            if (ae5 != null) {
                r4.A0C = AnonymousClass9PG.A00(ae5, bigDecimal, new Date());
            }
        }
        r4.A08 = this.A0J;
        r4.A07 = this.A0G;
        r4.A09 = this.A0I;
        r4.A00 = this.A0A.size();
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20287AEv(X.ADH r30, X.C20255ADn r31, X.AEJ r32, X.AE5 r33, X.AE6 r34, X.A6S r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.math.BigDecimal r43, java.util.List r44, java.util.List r45, int r46, long r47, boolean r49, boolean r50) {
        /*
            r29 = this;
            r15 = r37
            r14 = r36
            r3 = r44
            r0 = r47
            X.C18070vi.A0j(r14, r15)
            r12 = 0
            r6 = r29
            r20 = r42
            r19 = r41
            r18 = r40
            r17 = r39
            r16 = r38
            r8 = r31
            r11 = r34
            r28 = r50
            r27 = r49
            r24 = r46
            r10 = r33
            r5 = r45
            r9 = r32
            r2 = r43
            r7 = r30
            r13 = r35
            r21 = r2
            r22 = r3
            r23 = r5
            r25 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            if (r43 == 0) goto L_0x005a
            if (r35 == 0) goto L_0x005a
            r6.A09 = r2
            r6.A07 = r13
        L_0x0041:
            boolean r2 = r6.A02()
            if (r2 == 0) goto L_0x004b
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x004b:
            r6.A0A = r3
            r3 = 0
            int r2 = (r47 > r3 ? 1 : (r47 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0055
            r0 = 99
        L_0x0055:
            r6.A01 = r0
            r6.A0B = r5
            return
        L_0x005a:
            r6.A09 = r12
            r6.A07 = r12
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20287AEv.<init>(X.ADH, X.ADn, X.AEJ, X.AE5, X.AE6, X.A6S, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.util.List, java.util.List, int, long, boolean, boolean):void");
    }

    public final boolean A01() {
        AEJ aej = this.A03;
        if ((aej == null || aej.A00 == 0) && !A02() && !this.A0C) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        String str = this.A0F;
        if ("FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r2 = this;
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x000f
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20287AEv.A03():boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20287AEv) {
            C20287AEv aEv = (C20287AEv) obj;
            if (AnonymousClass1EG.A0I(this.A0H, aEv.A0H) && AnonymousClass1EG.A0I(this.A08, aEv.A08) && AnonymousClass1EG.A0I(this.A0E, aEv.A0E) && C18070vi.A18(this.A07, aEv.A07) && C18070vi.A18(this.A09, aEv.A09) && this.A01 == aEv.A01 && AnonymousClass1EG.A0I(this.A0G, aEv.A0G) && AnonymousClass1EG.A0I(this.A0I, aEv.A0I) && AnonymousClass1EG.A0I(this.A0J, aEv.A0J) && C18070vi.A18(this.A03, aEv.A03) && C18070vi.A18(this.A04, aEv.A04) && C18070vi.A18(this.A0A, aEv.A0A) && C18070vi.A18(this.A0B, aEv.A0B) && this.A0K == aEv.A0K && this.A0C == aEv.A0C && this.A00 == aEv.A00 && C18070vi.A18(this.A0D, aEv.A0D) && C18070vi.A18(this.A05, aEv.A05)) {
                return C18070vi.A18(this.A06, aEv.A06);
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[18];
        objArr[0] = this.A0H;
        objArr[1] = this.A08;
        objArr[2] = this.A0E;
        objArr[3] = this.A09;
        objArr[4] = this.A07;
        objArr[5] = this.A0G;
        objArr[6] = this.A0I;
        objArr[7] = this.A0J;
        objArr[8] = this.A0A;
        objArr[9] = this.A0B;
        objArr[10] = this.A03;
        objArr[11] = this.A04;
        objArr[12] = Long.valueOf(this.A01);
        objArr[13] = Boolean.valueOf(this.A0C);
        objArr[14] = Integer.valueOf(this.A00);
        objArr[15] = this.A0D;
        objArr[16] = this.A05;
        return AnonymousClass000.A0P(this.A06, objArr, 17);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        if (this instanceof C168138iN) {
            C168138iN r1 = (C168138iN) this;
            C18070vi.A0d(parcel, 0);
            parcel.writeParcelable(r1.A00, i);
            parcel.writeInt(r1.A01 ? 1 : 0);
            return;
        }
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0E);
        BigDecimal bigDecimal = this.A09;
        if (bigDecimal != null) {
            str = bigDecimal.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        A6S a6s = this.A07;
        if (a6s != null) {
            str2 = a6s.A00;
        } else {
            str2 = null;
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        Iterator A0r = C108985cd.A0r(parcel, this.A0A);
        while (A0r.hasNext()) {
            ((AEI) A0r.next()).writeToParcel(parcel, i);
        }
        Iterator A0r2 = C108985cd.A0r(parcel, this.A0B);
        while (A0r2.hasNext()) {
            ((AnonymousClass773) A0r2.next()).writeToParcel(parcel, i);
        }
        AEJ aej = this.A03;
        if (aej == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aej.writeToParcel(parcel, i);
        }
        AE5 ae5 = this.A04;
        if (ae5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ae5.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        C20255ADn aDn = this.A0D;
        if (aDn == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDn.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A01);
        AE6 ae6 = this.A05;
        if (ae6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ae6.writeToParcel(parcel, i);
        }
        ADX adx = this.A06;
        if (adx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adx.writeToParcel(parcel, i);
        }
        ADH adh = this.A02;
        if (adh == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        adh.writeToParcel(parcel, i);
    }

    public void CIx(ADX adx) {
        this.A06 = adx;
    }

    public C20287AEv(ADH adh, C20255ADn aDn, AEJ aej, AE5 ae5, AE6 ae6, ADX adx, A6S a6s, String str, String str2, String str3, String str4, String str5, String str6, String str7, BigDecimal bigDecimal, List list, List list2, int i, long j, boolean z, boolean z2) {
        this.A0H = str;
        this.A08 = str2;
        this.A0E = str3;
        this.A09 = bigDecimal;
        this.A07 = a6s;
        this.A0G = str4;
        this.A0I = str5;
        this.A0J = str6;
        this.A0A = list;
        this.A0B = list2;
        this.A03 = aej;
        this.A04 = ae5;
        this.A0F = str7;
        this.A0K = z;
        this.A0C = z2;
        this.A00 = i;
        this.A0D = aDn;
        this.A01 = j;
        this.A05 = ae6;
        this.A06 = adx;
        this.A02 = adh;
    }
}
