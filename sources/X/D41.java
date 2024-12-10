package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D41 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final E5K A00;

    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.C0j[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.C0j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.C0k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.C0k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.C0k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.C0k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.D41 A00(int r6) {
        /*
            X.C0k r0 = X.C24370C0k.LEGACY_RS1
            int r0 = r0.zzb
            if (r6 != r0) goto L_0x000e
            X.C0k r5 = X.C24370C0k.RS1
        L_0x0008:
            X.D41 r0 = new X.D41
            r0.<init>(r5)
            return r0
        L_0x000e:
            X.C0k[] r4 = X.C24370C0k.values()
            int r2 = r4.length
            r3 = 0
            r1 = 0
        L_0x0015:
            if (r1 >= r2) goto L_0x0020
            r5 = r4[r1]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0020:
            X.C0j[] r2 = X.C24369C0j.values()
            int r1 = r2.length
        L_0x0025:
            if (r3 >= r1) goto L_0x0030
            r5 = r2[r3]
            int r0 = r5.zzb
            if (r0 == r6) goto L_0x0008
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0030:
            X.C1Y r0 = new X.C1Y
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D41.A00(int):X.D41");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof D41) || this.A00.BMk() != ((D41) obj).A00.BMk()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("COSEAlgorithmIdentifier{algorithm=");
        return BEA.A0n(valueOf, A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.BMk());
    }

    public D41(E5K e5k) {
        this.A00 = e5k;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A00, AnonymousClass3MW.A1a(), 0);
    }
}
