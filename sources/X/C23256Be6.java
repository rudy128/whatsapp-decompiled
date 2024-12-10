package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.Be6  reason: case insensitive filesystem */
public final class C23256Be6 extends C23219BdV {
    public static final AnonymousClass00P A06;
    public static final Parcelable.Creator CREATOR = new Object();
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.00O, X.00P] */
    static {
        ? r2 = new AnonymousClass00O(0);
        A06 = r2;
        r2.put("registered", C23196Bcq.A00("registered", 2));
        r2.put("in_progress", C23196Bcq.A00("in_progress", 3));
        r2.put("success", C23196Bcq.A00("success", 4));
        r2.put("failed", C23196Bcq.A00("failed", 5));
        r2.put("escrowed", C23196Bcq.A00("escrowed", 6));
    }

    public C23256Be6(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A05);
        C26293Cx2.A0B(parcel, this.A00, 2);
        C26293Cx2.A0B(parcel, this.A01, 3);
        C26293Cx2.A0B(parcel, this.A02, 4);
        C26293Cx2.A0B(parcel, this.A03, 5);
        C26293Cx2.A0B(parcel, this.A04, 6);
        C26293Cx2.A05(parcel, A002);
    }

    public C23256Be6() {
        this.A05 = 1;
    }
}
