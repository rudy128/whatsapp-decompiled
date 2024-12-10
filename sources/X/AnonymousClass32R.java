package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.32R  reason: invalid class name */
public class AnonymousClass32R implements AnonymousClass20p {
    public final C42341y1 A00;

    public AnonymousClass32R(C42341y1 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bes(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        Class<AnonymousClass21L> cls = AnonymousClass21L.class;
        if (!(r5 instanceof AnonymousClass21L)) {
            String A0U = C17890vO.A0U(r5);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r5, name, A0U, C17890vO.A0W(str), str);
        }
        C20083A6j A01 = this.A00.A01((AnonymousClass21K) r5);
        if (A01 == null || !A01.A0J()) {
            return false;
        }
        return true;
    }

    public AnonymousClass21L A00(C59652mf r5, AnonymousClass21L r6) {
        return new AnonymousClass21L(r5.A01, r5.A00);
    }

    public AnonymousClass206 BHO(C59652mf r7, AnonymousClass206 r8) {
        boolean A15 = C18070vi.A15(r8, r7);
        Class<AnonymousClass21L> cls = AnonymousClass21L.class;
        if (!(r8 instanceof AnonymousClass21L)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass21L r2 = (AnonymousClass21L) r8;
        AnonymousClass21L A002 = A00(r7, r2);
        C20285AEt aEt = null;
        if (r2.A11(2097152)) {
            C20285AEt aEt2 = r2.A00;
            if (aEt2 != null) {
                Parcel obtain = Parcel.obtain();
                C18070vi.A0X(obtain);
                obtain.writeParcelable(aEt2, A15);
                obtain.setDataPosition(A15);
                Parcelable A08 = AnonymousClass3Ma.A08(obtain, C20285AEt.class);
                obtain.recycle();
                aEt = (C20285AEt) A08;
            }
            A002.CIS(aEt);
            return A002;
        }
        boolean z = !AnonymousClass1EG.A0H(C20120A8f.A04(r8));
        C20285AEt aEt3 = r2.A00;
        if (z) {
            if (aEt3 != null) {
                Parcel obtain2 = Parcel.obtain();
                C18070vi.A0X(obtain2);
                obtain2.writeParcelable(aEt3, A15 ? 1 : 0);
                obtain2.setDataPosition(A15);
                Parcelable A082 = AnonymousClass3Ma.A08(obtain2, C20285AEt.class);
                obtain2.recycle();
                aEt3 = (C20285AEt) A082;
                if (aEt3 != null) {
                    aEt3.A0C = null;
                    C20277AEk aEk = aEt3.A06;
                    if (aEk != null) {
                        aEk.A03.clear();
                    }
                }
            } else {
                aEt3 = null;
            }
        }
        A002.CIS(aEt3);
        return A002;
    }
}
