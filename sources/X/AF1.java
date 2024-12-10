package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public final class AF1 implements Parcelable, BCm, C22405B6i {
    public static final Parcelable.Creator CREATOR = new Object();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05;
    public float A06;
    public float A07 = -1.0f;
    public int A08 = -1;
    public boolean A09;
    public boolean A0A;
    public final C20291AEz A0B;

    public AF1(C20291AEz aEz, float f, float f2, boolean z) {
        C18070vi.A0d(aEz, 2);
        this.A09 = z;
        this.A0B = aEz;
        this.A06 = f;
        this.A05 = f2;
    }

    public final float A00(Context context) {
        AF0 af0;
        C18070vi.A0d(context, 0);
        if (this.A04 == -1.0f) {
            C20291AEz aEz = this.A0B;
            if (aEz.A03 != null) {
                Rect A072 = AnonymousClass3MW.A07();
                int A012 = C62762rw.A01(context, 120.0f);
                Paint A013 = C197559wt.A01(context);
                String str = aEz.A09.A01;
                A013.getTextBounds(str, 0, str.length(), A072);
                float min = (float) Math.min(A072.width(), A012);
                float f = this.A04;
                if (f < min) {
                    f = min;
                }
                this.A04 = f;
                float f2 = this.A03;
                float height = (float) A072.height();
                if (f2 < height) {
                    f2 = height;
                }
                this.A03 = f2;
            }
        }
        if (this.A01 == -1.0f && (af0 = this.A0B.A03) != null) {
            Rect A073 = AnonymousClass3MW.A07();
            int A014 = C62762rw.A01(context, 120.0f);
            Paint A002 = C197559wt.A00(context);
            String str2 = af0.A0I;
            A002.getTextBounds(str2, 0, str2.length(), A073);
            float min2 = (float) Math.min(A073.width(), A014);
            float f3 = this.A01;
            if (f3 < min2) {
                f3 = min2;
            }
            this.A01 = f3;
            float f4 = this.A00;
            float height2 = (float) A073.height();
            if (f4 < height2) {
                f4 = height2;
            }
            this.A00 = f4;
        }
        float f5 = this.A04;
        float f6 = this.A01;
        if (f5 < f6) {
            return f6;
        }
        return f5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.marker.BusinessMarkerData");
                if (!C18070vi.A18(this.A0B.A0A, ((AF1) obj).A0B.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        this.A0B.writeToParcel(parcel, i);
        parcel.writeFloat(this.A06);
        parcel.writeFloat(this.A05);
    }

    public void BDm(Location location) {
        this.A0B.BDm(location);
    }

    public double BQl() {
        return this.A0B.A00;
    }

    public C20269AEc BXJ() {
        C20291AEz aEz = this.A0B;
        return new C20269AEc(aEz.A06, aEz.A07);
    }

    public Double BXO() {
        return this.A0B.A05;
    }

    public Double BXP() {
        return Double.valueOf(this.A0B.A08);
    }

    public void CK4(Double d) {
        this.A0B.A05 = d;
    }

    public int hashCode() {
        return this.A0B.A0A.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessMarkerData(isSelected=");
        A10.append(this.A09);
        A10.append(", mapBusinessProfile=");
        A10.append(this.A0B);
        A10.append(", showRegularMarkerFromZoom=");
        A10.append(this.A06);
        A10.append(", showCompactMarkerFromZoom=");
        A10.append(this.A05);
        return AnonymousClass001.A1J(A10);
    }
}
