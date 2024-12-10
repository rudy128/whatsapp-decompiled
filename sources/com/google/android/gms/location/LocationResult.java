package com.google.android.gms.location;

import X.AnonymousClass001;
import X.BE6;
import X.BE8;
import X.BEA;
import X.C26293Cx2;
import X.DJ0;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends DJ0 implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    public boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List<Location> list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location time : list) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            i = AnonymousClass001.A0J(time.getTime(), i * 31);
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0t = BE6.A0t(BE8.A0C(valueOf) + 27);
        A0t.append("LocationResult[locations: ");
        return BEA.A0m(valueOf, A0t);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0C(parcel, this.A00, 1, false);
        C26293Cx2.A05(parcel, A002);
    }
}
