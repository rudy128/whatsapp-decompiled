package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.BbW  reason: case insensitive filesystem */
public class C23117BbW extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C23117BbW
            r3 = 0
            if (r0 == 0) goto L_0x000f
            X.BbW r5 = (X.C23117BbW) r5
            java.util.List r2 = r4.A00
            java.util.List r1 = r5.A00
            if (r2 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x001e
        L_0x000f:
            return r3
        L_0x0010:
            if (r1 == 0) goto L_0x000f
            boolean r0 = r2.containsAll(r1)
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x000f
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23117BbW.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        HashSet A12;
        List list = this.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        if (list == null) {
            A12 = null;
        } else {
            A12 = AnonymousClass8BR.A12(list);
        }
        return AnonymousClass000.A0P(A12, A1a, 0);
    }

    public C23117BbW(List list) {
        this.A00 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A0C(parcel, this.A00, 1, false);
        C26293Cx2.A05(parcel, A002);
    }
}
