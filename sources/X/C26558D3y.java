package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.D3y  reason: case insensitive filesystem */
public final class C26558D3y implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final ConcurrentHashMap A00;
    public final ConcurrentHashMap A01;
    public final ConcurrentHashMap A02;
    public final ConcurrentHashMap A03;
    public final ConcurrentHashMap A04;
    public final ConcurrentHashMap A05;
    public final ConcurrentHashMap A06;
    public final ConcurrentHashMap A07;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        ConcurrentHashMap concurrentHashMap = this.A03;
        parcel.writeInt(concurrentHashMap.size());
        Iterator A0i = C17890vO.A0i(concurrentHashMap);
        while (A0i.hasNext()) {
            parcel.writeFloat(AnonymousClass000.A04(BEB.A0W(parcel, A0i)));
        }
        ConcurrentHashMap concurrentHashMap2 = this.A02;
        parcel.writeInt(concurrentHashMap2.size());
        Iterator A0i2 = C17890vO.A0i(concurrentHashMap2);
        while (A0i2.hasNext()) {
            parcel.writeFloatArray((float[]) BEB.A0W(parcel, A0i2));
        }
        ConcurrentHashMap concurrentHashMap3 = this.A04;
        parcel.writeInt(concurrentHashMap3.size());
        Iterator A0i3 = C17890vO.A0i(concurrentHashMap3);
        while (A0i3.hasNext()) {
            parcel.writeInt(AnonymousClass000.A0M(BEB.A0W(parcel, A0i3)));
        }
        ConcurrentHashMap concurrentHashMap4 = this.A00;
        parcel.writeInt(concurrentHashMap4.size());
        Iterator A0i4 = C17890vO.A0i(concurrentHashMap4);
        while (A0i4.hasNext()) {
            parcel.writeInt(AnonymousClass000.A1Y(BEB.A0W(parcel, A0i4)) ? 1 : 0);
        }
        ConcurrentHashMap concurrentHashMap5 = this.A05;
        parcel.writeInt(concurrentHashMap5.size());
        Iterator A0i5 = C17890vO.A0i(concurrentHashMap5);
        while (A0i5.hasNext()) {
            parcel.writeString((String) BEB.A0W(parcel, A0i5));
        }
        ConcurrentHashMap concurrentHashMap6 = this.A06;
        parcel.writeInt(concurrentHashMap6.size());
        Iterator A0i6 = C17890vO.A0i(concurrentHashMap6);
        while (A0i6.hasNext()) {
            parcel.writeString((String) BEB.A0W(parcel, A0i6));
        }
        ConcurrentHashMap concurrentHashMap7 = this.A07;
        parcel.writeInt(concurrentHashMap7.size());
        Iterator A0i7 = C17890vO.A0i(concurrentHashMap7);
        while (A0i7.hasNext()) {
            parcel.writeString((String) BEB.A0W(parcel, A0i7));
        }
        ConcurrentHashMap concurrentHashMap8 = this.A01;
        parcel.writeInt(concurrentHashMap8.size());
        Iterator A0i8 = C17890vO.A0i(concurrentHashMap8);
        while (A0i8.hasNext()) {
            parcel.writeParcelable((Parcelable) BEB.A0W(parcel, A0i8), i);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C26558D3y) {
            C26558D3y d3y = (C26558D3y) obj;
            if (C18070vi.A18(this.A03, d3y.A03)) {
                ConcurrentHashMap concurrentHashMap = this.A02;
                ConcurrentHashMap concurrentHashMap2 = d3y.A02;
                if (concurrentHashMap.size() == concurrentHashMap2.size()) {
                    Iterator A0i = C17890vO.A0i(concurrentHashMap);
                    while (true) {
                        if (A0i.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A0i);
                            if (!Arrays.equals((float[]) A16.getValue(), (float[]) concurrentHashMap2.get(A16.getKey()))) {
                                break;
                            }
                        } else if (!C18070vi.A18(this.A04, d3y.A04) || !C18070vi.A18(this.A00, d3y.A00) || !C18070vi.A18(this.A05, d3y.A05) || !C18070vi.A18(this.A06, d3y.A06) || !C18070vi.A18(this.A07, d3y.A07) || !C18070vi.A18(this.A01, d3y.A01)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A03.hashCode();
        Iterator A0i = C17890vO.A0i(this.A02);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            hashCode = C17890vO.A02(C17880vN.A0x(A16), hashCode * 31) + Arrays.hashCode((float[]) A16.getValue());
        }
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A04, hashCode * 31))))));
    }

    public C26558D3y(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, ConcurrentHashMap concurrentHashMap4, ConcurrentHashMap concurrentHashMap5, ConcurrentHashMap concurrentHashMap6, ConcurrentHashMap concurrentHashMap7, ConcurrentHashMap concurrentHashMap8) {
        this.A03 = concurrentHashMap;
        this.A02 = concurrentHashMap2;
        this.A04 = concurrentHashMap3;
        this.A00 = concurrentHashMap4;
        this.A05 = concurrentHashMap5;
        this.A06 = concurrentHashMap6;
        this.A07 = concurrentHashMap7;
        this.A01 = concurrentHashMap8;
    }

    public C26558D3y() {
        this(AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17(), AnonymousClass8BR.A17());
    }
}
