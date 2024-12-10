package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.8wY  reason: invalid class name and case insensitive filesystem */
public class C174298wY extends C174358we {
    public Object A00;
    public String A01;
    public String A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public final int A06;
    public final LatLng A07;
    public final C22494BAb A08;
    public final C22435B7r A09;
    public final BD3 A0A;
    public final AF0 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A0B.equals(((C174298wY) obj).A0B);
    }

    public int hashCode() {
        return this.A0B.hashCode();
    }

    public String toString() {
        return this.A0B.toString();
    }

    public C174298wY(LatLng latLng, C22494BAb bAb, C22435B7r b7r, BD3 bd3, AF0 af0, int i, int i2, boolean z, boolean z2) {
        super(i);
        this.A06 = i2;
        this.A0C = z;
        this.A0B = af0;
        this.A07 = latLng;
        this.A08 = bAb;
        this.A0D = z2;
        this.A09 = b7r;
        this.A0A = bd3;
        String str = af0.A04;
        if (str != null) {
            this.A01 = str.replaceAll("(\\n){2,}", "\n");
        }
    }
}
