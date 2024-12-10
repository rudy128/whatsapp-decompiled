package X;

import android.os.Parcel;

/* renamed from: X.Bcq  reason: case insensitive filesystem */
public class C23196Bcq extends DJ0 {
    public static final C26459Czy CREATOR = new Object();
    public C23105BbK A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C28449E1p A04;
    public final Class A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;

    public static C23196Bcq A00(String str, int i) {
        return new C23196Bcq((Class) null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(Integer.valueOf(this.A0A), "versionCode");
        cyh.A00(Integer.valueOf(this.A01), "typeIn");
        cyh.A00(Boolean.valueOf(this.A08), "typeInArray");
        cyh.A00(Integer.valueOf(this.A02), "typeOut");
        cyh.A00(Boolean.valueOf(this.A09), "typeOutArray");
        cyh.A00(this.A06, "outputFieldName");
        cyh.A00(Integer.valueOf(this.A03), "safeParcelFieldId");
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        cyh.A00(str, "concreteTypeName");
        Class cls = this.A05;
        if (cls != null) {
            cyh.A00(cls.getCanonicalName(), "concreteType.class");
        }
        C28449E1p e1p = this.A04;
        if (e1p != null) {
            cyh.A00(e1p.getClass().getCanonicalName(), "converterName");
        }
        return cyh.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C23175BcV bcV;
        int A012 = C26293Cx2.A01(parcel, this.A0A);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A08(parcel, 3, this.A08);
        C26293Cx2.A06(parcel, 4, this.A02);
        C26293Cx2.A08(parcel, 5, this.A09);
        C26293Cx2.A0A(parcel, this.A06, 6, false);
        C26293Cx2.A06(parcel, 7, this.A03);
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        C26293Cx2.A0A(parcel, str, 8, false);
        C28449E1p e1p = this.A04;
        if (e1p == null) {
            bcV = null;
        } else if (e1p instanceof C23212BdN) {
            bcV = new C23175BcV((C23212BdN) e1p);
        } else {
            throw AnonymousClass000.A0k("Unsupported safe parcelable field converter class.");
        }
        C26293Cx2.A09(parcel, bcV, 9, i, false);
        C26293Cx2.A05(parcel, A012);
    }

    public C23196Bcq(C23175BcV bcV, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A0A = i;
        this.A01 = i2;
        this.A08 = z;
        this.A02 = i3;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i4;
        C23212BdN bdN = null;
        if (str2 == null) {
            this.A05 = null;
            this.A07 = null;
        } else {
            this.A05 = C23220BdW.class;
            this.A07 = str2;
        }
        if (bcV == null || (bdN = bcV.A01) != null) {
            this.A04 = bdN;
            return;
        }
        throw AnonymousClass000.A0n("There was no converter wrapped in this ConverterWrapper.");
    }

    public C23196Bcq(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A0A = 1;
        this.A01 = i;
        this.A08 = z;
        this.A02 = i2;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i3;
        this.A05 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A07 = canonicalName;
        this.A04 = null;
    }
}
