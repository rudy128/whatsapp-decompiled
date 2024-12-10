package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.77e  reason: invalid class name and case insensitive filesystem */
public final class C1418477e implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1416376j(1);
    public Object A00;
    public final AnonymousClass87L A01;
    public final Class A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C1418477e r4 = (C1418477e) obj;
            if (!C18070vi.A18(this.A03, r4.A03) || !C18070vi.A18(this.A01, r4.A01) || !C18070vi.A18(this.A02, r4.A02) || !C42171xk.A00(this.A00, r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A03;
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return AnonymousClass000.A0P(this.A00, objArr, 3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        AnonymousClass87L r2 = this.A01;
        C18070vi.A0d(r2, 0);
        if (r2 instanceof C144717Ik) {
            parcel.writeInt(1);
        } else if (r2 instanceof C144727Il) {
            parcel.writeInt(2);
        } else if (r2 instanceof C144707Ij) {
            parcel.writeInt(3);
            throw AnonymousClass000.A0s("getClass");
        } else {
            throw new AssertionError("[PrivacyPolicy] Unknown executor written to parcel");
        }
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A00);
    }

    public final boolean A00() {
        boolean isEmpty;
        int length;
        Object obj = this.A00;
        if (obj == null) {
            return true;
        }
        Boolean bool = C17960vV.A01;
        if (obj instanceof String) {
            length = ((CharSequence) obj).length();
        } else if (obj instanceof Object[]) {
            length = ((Object[]) obj).length;
        } else {
            if (obj instanceof Collection) {
                isEmpty = ((Collection) obj).isEmpty();
            } else if (obj instanceof Map) {
                isEmpty = ((Map) obj).isEmpty();
            } else {
                throw new UnsupportedOperationException("empty check not implemented for class type");
            }
            if (isEmpty) {
                return true;
            }
            return false;
        }
        if (length == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String BCO = this.A01.BCO(this.A00);
        if (BCO == null) {
            return "null";
        }
        return BCO;
    }

    public C1418477e(AnonymousClass87L r3, Object obj, String str) {
        this.A03 = str;
        this.A01 = r3;
        C17960vV.A07(obj);
        Class<?> cls = obj.getClass();
        C18070vi.A0z(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.loggingpolicy.PrivacyItemValue>");
        this.A02 = cls;
        this.A00 = obj;
    }

    public C1418477e(AnonymousClass87L r2, Class cls, Object obj, String str) {
        C18070vi.A0d(cls, 3);
        this.A03 = str;
        this.A01 = r2;
        this.A02 = cls;
        this.A00 = obj;
    }

    public C1418477e(Parcel parcel) {
        Object obj;
        String readString = parcel.readString();
        C17960vV.A07(readString);
        this.A03 = readString;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            obj = new Object();
        } else if (readInt == 2) {
            obj = new Object();
        } else if (readInt == 3) {
            obj = new Object();
            Class cls = (Class) parcel.readValue(Class.class.getClassLoader());
            if (cls == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            } else if (AnonymousClass3Ma.A08(parcel, cls) == null) {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            throw new AssertionError("[PrivacyPolicy] Unknown executor read from parcel");
        }
        this.A01 = (AnonymousClass87L) obj;
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        C17960vV.A07(readValue);
        Class cls2 = (Class) readValue;
        this.A02 = cls2;
        this.A00 = parcel.readValue(cls2.getClassLoader());
    }
}
