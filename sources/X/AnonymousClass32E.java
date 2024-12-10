package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.32E  reason: invalid class name */
public class AnonymousClass32E implements C436620k {
    public AnonymousClass21L A00(AnonymousClass205 r2, AnonymousClass21L r3, long j) {
        return new AnonymousClass21L(r2, j);
    }

    public /* bridge */ /* synthetic */ AnonymousClass206 BF7(AnonymousClass206 r5, AnonymousClass205 r6, long j) {
        AnonymousClass21L r52 = (AnonymousClass21L) r5;
        boolean A15 = C18070vi.A15(r52, r6);
        AnonymousClass21L A00 = A00(r6, r52, j);
        boolean A11 = r52.A11(2097152);
        C20285AEt aEt = r52.A00;
        if (A11) {
            if (aEt != null) {
                Parcel obtain = Parcel.obtain();
                C18070vi.A0X(obtain);
                obtain.writeParcelable(aEt, A15 ? 1 : 0);
                obtain.setDataPosition(A15);
                Parcelable A08 = AnonymousClass3Ma.A08(obtain, C20285AEt.class);
                obtain.recycle();
                aEt = (C20285AEt) A08;
            } else {
                aEt = null;
            }
        }
        A00.CIS(aEt);
        return A00;
    }
}
