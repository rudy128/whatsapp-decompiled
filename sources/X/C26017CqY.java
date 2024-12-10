package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqY  reason: case insensitive filesystem */
public class C26017CqY {
    @Deprecated
    public static final C26017CqY A0Q;
    public static final C26017CqY A0R;
    @Deprecated
    public static final E0X CREATOR = new C26654D8d(4);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final C201110w A0G;
    public final C199410f A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26017CqY cqY = (C26017CqY) obj;
            if (!(this.A06 == cqY.A06 && this.A05 == cqY.A05 && this.A04 == cqY.A04 && this.A03 == cqY.A03 && this.A0A == cqY.A0A && this.A09 == cqY.A09 && this.A08 == cqY.A08 && this.A07 == cqY.A07 && this.A0P == cqY.A0P && this.A0F == cqY.A0F && this.A0E == cqY.A0E && this.A0L.equals(cqY.A0L) && this.A0D == cqY.A0D && this.A0I.equals(cqY.A0I) && this.A0B == cqY.A0B && this.A02 == cqY.A02 && this.A01 == cqY.A01 && this.A0J.equals(cqY.A0J) && this.A0K.equals(cqY.A0K) && this.A0C == cqY.A0C && this.A00 == cqY.A00 && this.A0O == cqY.A0O && this.A0N == cqY.A0N && this.A0M == cqY.A0M && this.A0G.equals(cqY.A0G) && this.A0H.equals(cqY.A0H))) {
                return false;
            }
        }
        return true;
    }

    static {
        C26017CqY cqY = new C26017CqY(new CUU());
        A0R = cqY;
        A0Q = cqY;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A0H, AnonymousClass000.A0N(this.A0G, (((((((((((((((((((((((((((((((((((((((((((((((31 + this.A06) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0P ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + this.A0L.hashCode()) * 31) + this.A0D) * 31) + this.A0I.hashCode()) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31) + this.A0J.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0C) * 31) + this.A00) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + (this.A0M ? 1 : 0)) * 31));
    }

    public C26017CqY(Parcel parcel) {
        ClassLoader classLoader = C26017CqY.class.getClassLoader();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0E = parcel.readInt();
        this.A0P = AnonymousClass000.A1O(parcel.readInt());
        ArrayList A13 = AnonymousClass000.A13();
        parcel.readList(A13, classLoader);
        this.A0L = AnonymousClass1IX.copyOf((Collection) A13);
        this.A0D = parcel.readInt();
        ArrayList A132 = AnonymousClass000.A13();
        parcel.readList(A132, classLoader);
        this.A0I = AnonymousClass1IX.copyOf((Collection) A132);
        this.A0B = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        ArrayList A133 = AnonymousClass000.A13();
        parcel.readList(A133, classLoader);
        this.A0J = AnonymousClass1IX.copyOf((Collection) A133);
        ArrayList A134 = AnonymousClass000.A13();
        parcel.readList(A134, classLoader);
        this.A0K = AnonymousClass1IX.copyOf((Collection) A134);
        this.A0C = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A0O = AnonymousClass000.A1O(parcel.readInt());
        this.A0N = AnonymousClass000.A1O(parcel.readInt());
        this.A0M = AnonymousClass000.A1O(parcel.readInt());
        HashMap A11 = C17880vN.A11();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Parcelable A082 = AnonymousClass3Ma.A08(parcel, D3X.class);
            parcel.readParcelable(D3F.class.getClassLoader());
            A11.put(A082, (Object) null);
        }
        this.A0G = C201110w.copyOf((Map) A11);
        ArrayList A135 = AnonymousClass000.A13();
        parcel.readList(A135, classLoader);
        this.A0H = C199410f.copyOf((Collection) A135);
    }

    public C26017CqY(CUU cuu) {
        this.A06 = cuu.A06;
        this.A05 = cuu.A05;
        this.A04 = cuu.A04;
        this.A03 = cuu.A03;
        this.A0A = cuu.A0A;
        this.A09 = cuu.A09;
        this.A08 = cuu.A08;
        this.A07 = cuu.A07;
        this.A0F = cuu.A0F;
        this.A0E = cuu.A0E;
        this.A0P = cuu.A0P;
        this.A0L = cuu.A0L;
        this.A0D = cuu.A0D;
        this.A0I = cuu.A0I;
        this.A0B = cuu.A0B;
        this.A02 = cuu.A02;
        this.A01 = cuu.A01;
        this.A0J = cuu.A0J;
        this.A0K = cuu.A0K;
        this.A0C = cuu.A0C;
        this.A00 = cuu.A00;
        this.A0O = cuu.A0O;
        this.A0N = cuu.A0N;
        this.A0M = cuu.A0M;
        this.A0G = C201110w.copyOf((Map) cuu.A0G);
        this.A0H = C199410f.copyOf((Collection) cuu.A0H);
    }
}
