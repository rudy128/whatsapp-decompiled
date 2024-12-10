package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2To  reason: invalid class name and case insensitive filesystem */
public abstract class C50212To {
    public static final void A00(C438521e r3, C438521e r4) {
        C18070vi.A0d(r3, 0);
        boolean A11 = r3.A11(2097152);
        C20285AEt aEt = r3.A00;
        if (A11) {
            if (aEt != null) {
                Parcel obtain = Parcel.obtain();
                C18070vi.A0X(obtain);
                obtain.writeParcelable(aEt, 0);
                obtain.setDataPosition(0);
                Parcelable readParcelable = obtain.readParcelable(C20285AEt.class.getClassLoader());
                obtain.recycle();
                aEt = (C20285AEt) readParcelable;
            } else {
                aEt = null;
            }
        }
        r4.A00 = aEt;
    }
}
