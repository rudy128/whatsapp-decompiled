package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.ABt  reason: case insensitive filesystem */
public final class C20209ABt implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pS r3 = new AnonymousClass8pS();
        r3.A09 = parcel.readString();
        Class<C1418477e> cls = C1418477e.class;
        r3.A02 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A04 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A06 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A03 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A07 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        boolean z = false;
        r3.A0I = AnonymousClass000.A1T(parcel.readInt(), 1);
        r3.A05 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A03 = parcel.readString();
        r3.A04 = parcel.readString();
        r3.A08 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A0E = parcel.readString();
        r3.A0B = parcel.readString();
        r3.A01 = parcel.readInt();
        r3.A0C = parcel.readString();
        r3.A0D = parcel.readString();
        ArrayList A13 = AnonymousClass000.A13();
        parcel.readStringList(A13);
        r3.A0F = A13;
        int readInt = parcel.readInt();
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            r3.A09 = bArr;
        }
        r3.A06 = parcel.readString();
        r3.A01 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A02 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r3.A00 = parcel.readLong();
        r3.A07 = AnonymousClass000.A1T(parcel.readInt(), 1);
        r3.A08 = AnonymousClass000.A1T(parcel.readInt(), 1);
        r3.A0A = parcel.readString();
        r3.A0K = AnonymousClass000.A1T(parcel.readInt(), 1);
        r3.A0H = AnonymousClass000.A1T(parcel.readInt(), 1);
        r3.A0G = AnonymousClass000.A1T(parcel.readInt(), 1);
        if (parcel.readInt() == 1) {
            z = true;
        }
        r3.A0J = z;
        return r3;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pS[i];
    }
}
