package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AEt  reason: case insensitive filesystem */
public final class C20285AEt implements Parcelable {
    public static final C189139iZ A0G = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public View.OnClickListener A01;
    public C20279AEn A02;
    public AEY A03;
    public C20242ADa A04;
    public AEE A05;
    public C20277AEk A06;
    public AER A07;
    public ADF A08;
    public ADG A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;

    public C20285AEt(AEY aey, C20277AEk aEk) {
        this((View.OnClickListener) null, (C20279AEn) null, aey, (C20242ADa) null, (AEE) null, aEk, (AER) null, (ADF) null, (ADG) null, (String) null, (String) null, (String) null, (String) null, (String) null, C18460wS.A00, 10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20285AEt) {
                C20285AEt aEt = (C20285AEt) obj;
                if (this.A00 != aEt.A00 || !C18070vi.A18(this.A05, aEt.A05) || !C18070vi.A18(this.A0B, aEt.A0B) || !C18070vi.A18(this.A0C, aEt.A0C) || !C18070vi.A18(this.A0A, aEt.A0A) || !C18070vi.A18(this.A0F, aEt.A0F) || !C18070vi.A18(this.A07, aEt.A07) || !C18070vi.A18(this.A0E, aEt.A0E) || !C18070vi.A18(this.A03, aEt.A03) || !C18070vi.A18(this.A02, aEt.A02) || !C18070vi.A18(this.A08, aEt.A08) || !C18070vi.A18(this.A06, aEt.A06) || !C18070vi.A18(this.A04, aEt.A04) || !C18070vi.A18(this.A09, aEt.A09) || !C18070vi.A18(this.A01, aEt.A01) || !C18070vi.A18(this.A0D, aEt.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        AEE aee = this.A05;
        if (aee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aee.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        Iterator A0r = C108985cd.A0r(parcel, this.A0F);
        while (A0r.hasNext()) {
            ((AE4) A0r.next()).writeToParcel(parcel, i);
        }
        AER aer = this.A07;
        if (aer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aer.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A03, i);
        C20279AEn aEn = this.A02;
        if (aEn == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aEn.writeToParcel(parcel, i);
        }
        ADF adf = this.A08;
        if (adf == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adf.writeToParcel(parcel, i);
        }
        C20277AEk aEk = this.A06;
        if (aEk == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aEk.writeToParcel(parcel, i);
        }
        C20242ADa aDa = this.A04;
        if (aDa == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDa.writeToParcel(parcel, i);
        }
        ADG adg = this.A09;
        if (adg == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adg.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.A01);
        parcel.writeString(this.A0D);
    }

    public final String A00() {
        C20253ADl aDl;
        C20277AEk aEk = this.A06;
        if (aEk == null || (aDl = (C20253ADl) C29431cG.A0c(aEk.A03)) == null) {
            return null;
        }
        return aDl.A01.A02;
    }

    public final String A01() {
        C20253ADl aDl;
        C20277AEk aEk = this.A06;
        if (aEk == null || (aDl = (C20253ADl) C29431cG.A0c(aEk.A03)) == null) {
            return null;
        }
        return aDl.A01.A00;
    }

    public final boolean A02() {
        if (this.A02 == null || this.A00 != 3) {
            return false;
        }
        if (AnonymousClass8BU.A1S(this, "review_and_pay") || !AnonymousClass8BU.A1S(this, "review_order") || !AnonymousClass8BU.A1S(this, "payment_method") || !AnonymousClass8BU.A1S(this, "payment_status")) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        int i = this.A00;
        if ((i == 5 || i == 9) && this.A06 != null) {
            return true;
        }
        return false;
    }

    public final byte[] A05() {
        byte[] bArr;
        int i;
        AER aer = this.A07;
        if (aer != null && ((i = this.A00) == 2 || i == 6)) {
            return aer.A01.A02;
        }
        C20279AEn aEn = this.A02;
        if (aEn != null && this.A00 == 3) {
            return aEn.A0U;
        }
        AEE aee = this.A05;
        if (aee == null || (bArr = aee.A03) == null) {
            return null;
        }
        return bArr;
    }

    public int hashCode() {
        return ((((((((((((((((((AnonymousClass000.A0N(this.A0F, ((((((((this.A00 * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17900vP.A00(this.A0B)) * 31) + C17900vP.A00(this.A0C)) * 31) + C17900vP.A00(this.A0A)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + C17900vP.A00(this.A0E)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C108955ca.A06(this.A0D);
    }

    public final boolean A03() {
        C20277AEk aEk;
        if (!A04() || (aEk = this.A06) == null || aEk.A01 != 3) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InteractiveMessageContent(messageType=");
        A10.append(this.A00);
        A10.append(", header=");
        A10.append(this.A05);
        A10.append(", description=");
        A10.append(this.A0B);
        A10.append(", footer=");
        A10.append(this.A0C);
        A10.append(", buttonText=");
        A10.append(this.A0A);
        A10.append(", sections=");
        A10.append(this.A0F);
        A10.append(", productListInfo=");
        A10.append(this.A07);
        A10.append(", templateId=");
        A10.append(this.A0E);
        A10.append(", paymentInfoContent=");
        A10.append(this.A03);
        A10.append(", checkoutInfoContent=");
        A10.append(this.A02);
        A10.append(", shopContent=");
        A10.append(this.A08);
        A10.append(", nativeFlowContent=");
        A10.append(this.A06);
        A10.append(", carouselContent=");
        A10.append(this.A04);
        A10.append(", singleProductInfo=");
        A10.append(this.A09);
        A10.append(", onClickListener=");
        A10.append(this.A01);
        A10.append(", hsmTag=");
        return C17900vP.A0B(this.A0D, A10);
    }

    public C20285AEt(C20242ADa aDa, AEE aee, String str, String str2) {
        this((View.OnClickListener) null, (C20279AEn) null, (AEY) null, aDa, aee, (C20277AEk) null, (AER) null, (ADF) null, (ADG) null, str, str2, (String) null, (String) null, (String) null, C18460wS.A00, 7);
    }

    public C20285AEt(View.OnClickListener onClickListener, C20279AEn aEn, AEY aey, C20242ADa aDa, AEE aee, C20277AEk aEk, AER aer, ADF adf, ADG adg, String str, String str2, String str3, String str4, String str5, List list, int i) {
        this.A00 = i;
        this.A05 = aee;
        this.A0B = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A0F = list;
        this.A07 = aer;
        this.A0E = str4;
        this.A03 = aey;
        this.A02 = aEn;
        this.A08 = adf;
        this.A06 = aEk;
        this.A04 = aDa;
        this.A09 = adg;
        this.A01 = onClickListener;
        this.A0D = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20285AEt(X.C20279AEn r18, X.AEE r19, X.C20277AEk r20, java.lang.String r21, java.lang.String r22) {
        /*
            r17 = this;
            r0 = 4
            r2 = r18
            X.C18070vi.A0d(r2, r0)
            r1 = 0
            r16 = 3
            X.0wS r15 = X.C18460wS.A00
            r0 = r17
            r5 = r19
            r6 = r20
            r10 = r21
            r11 = r22
            r3 = r1
            r4 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20285AEt.<init>(X.AEn, X.AEE, X.AEk, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20285AEt(X.C20279AEn r18, X.AEE r19, X.C20277AEk r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r17 = this;
            r0 = 4
            r6 = r20
            r12 = r23
            X.C108965cb.A1O(r12, r0, r6)
            r1 = 0
            r16 = 5
            X.0wS r15 = X.C18460wS.A00
            r0 = r17
            r2 = r18
            r5 = r19
            r10 = r21
            r11 = r22
            r3 = r1
            r4 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r13 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20285AEt.<init>(X.AEn, X.AEE, X.AEk, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
