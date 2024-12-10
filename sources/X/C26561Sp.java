package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Sp  reason: invalid class name and case insensitive filesystem */
public final class C26561Sp implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        byte[] bArr = C26551So.A10;
        C26551So A01 = C63972u0.A01((AnonymousClass1BI) null, parcel.readInt(), parcel.readInt());
        C18070vi.A0X(A01);
        return A01;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C26551So[i];
    }
}
