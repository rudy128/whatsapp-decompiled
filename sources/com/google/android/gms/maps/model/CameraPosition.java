package com.google.android.gms.maps.model;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;
import X.BE8;
import X.C26293Cx2;
import X.CYH;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class CameraPosition extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraPosition) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                if (!(this.A03.equals(cameraPosition.A03) && Float.floatToIntBits(this.A02) == Float.floatToIntBits(cameraPosition.A02) && Float.floatToIntBits(this.A01) == Float.floatToIntBits(cameraPosition.A01) && Float.floatToIntBits(this.A00) == Float.floatToIntBits(cameraPosition.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        CYH cyh = new CYH(this);
        cyh.A00(this.A03, "target");
        cyh.A00(Float.valueOf(this.A02), "zoom");
        cyh.A00(Float.valueOf(this.A01), "tilt");
        cyh.A00(Float.valueOf(this.A00), "bearing");
        return cyh.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r9 > 90.0f) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraPosition(com.google.android.gms.maps.model.LatLng r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "camera target must not be null."
            X.C18210vx.A02(r7, r0)
            r1 = 1
            r4 = 0
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.BE6.A1T(r1, r9, r4)
            java.lang.String r0 = "Tilt needs to be between 0 and 90 inclusive: %s"
            if (r2 == 0) goto L_0x0036
            r6.A03 = r7
            r6.A02 = r8
            float r9 = r9 + r3
            r6.A01 = r9
            double r4 = (double) r10
            r2 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0032
            float r10 = r10 % r1
            float r10 = r10 + r1
        L_0x0032:
            float r10 = r10 % r1
            r6.A00 = r10
            return
        L_0x0036:
            java.lang.IllegalArgumentException r0 = X.BE8.A0X(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CameraPosition.<init>(com.google.android.gms.maps.model.LatLng, float, float, float):void");
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        A1a[0] = this.A03;
        BE8.A1J(A1a, this.A02);
        BE8.A1K(A1a, this.A01);
        return AnonymousClass000.A0P(Float.valueOf(this.A00), A1a, 3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A09(parcel, this.A03, 2, i, false);
        float f = this.A02;
        BE7.A0z(3, parcel);
        parcel.writeFloat(f);
        float f2 = this.A01;
        BE7.A0z(4, parcel);
        parcel.writeFloat(f2);
        float f3 = this.A00;
        BE7.A0z(5, parcel);
        parcel.writeFloat(f3);
        C26293Cx2.A05(parcel, A002);
    }
}
