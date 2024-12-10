package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bdf  reason: case insensitive filesystem */
public class C23229Bdf extends C23024Ba0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C0X A00;
    public final String A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (obj instanceof C23229Bdf) {
            C23229Bdf bdf = (C23229Bdf) obj;
            if (C25332Cdd.A01(this.A00, bdf.A00) && C25332Cdd.A01(this.A01, bdf.A01)) {
                if (DJ0.A0H(bdf.A02, Integer.valueOf(this.A02))) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A00, 3);
        A1b[1] = this.A01;
        AnonymousClass3Ma.A1S(A1b, this.A02);
        return Arrays.hashCode(A1b);
    }

    public C23229Bdf(int i, String str, int i2) {
        try {
            for (C0X c0x : C0X.values()) {
                if (i == c0x.zzb) {
                    this.A00 = c0x;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new C1Z(i);
        } catch (C1Z e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CQA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.CQA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.CQA, java.lang.Object] */
    public String toString() {
        String A0x = C108955ca.A0x(this);
        ? obj = new Object();
        if (A0x != null) {
            String valueOf = String.valueOf(this.A00.zzb);
            ? obj2 = new Object();
            obj.A00 = obj2;
            obj2.A01 = valueOf;
            obj2.A02 = "errorCode";
            String str = this.A01;
            if (str != null) {
                ? obj3 = new Object();
                obj2.A00 = obj3;
                obj3.A01 = str;
                obj3.A02 = "errorMessage";
            }
            return CB9.A00(obj, A0x);
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 2, this.A00.zzb);
        C26293Cx2.A0A(parcel, this.A01, 3, false);
        C26293Cx2.A06(parcel, 4, this.A02);
        C26293Cx2.A05(parcel, A002);
    }
}
