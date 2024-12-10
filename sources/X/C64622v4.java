package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2v4  reason: invalid class name and case insensitive filesystem */
public class C64622v4 implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new D3B(26);
    public static final long serialVersionUID = 0;
    public List mIdentifiers;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        AnonymousClass1IX copyOf;
        Object[] objArr = new Object[1];
        List list = this.mIdentifiers;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = AnonymousClass1IX.copyOf((Collection) list);
        }
        return AnonymousClass000.A0P(copyOf, objArr, 0);
    }

    public boolean equals(Object obj) {
        AnonymousClass1IX copyOf;
        AnonymousClass1IX copyOf2;
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C64622v4 r3 = (C64622v4) obj;
        List list = this.mIdentifiers;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = AnonymousClass1IX.copyOf((Collection) list);
        }
        List list2 = r3.mIdentifiers;
        if (list2 == null) {
            copyOf2 = null;
        } else {
            copyOf2 = AnonymousClass1IX.copyOf((Collection) list2);
        }
        return C24604CBi.A00(copyOf, copyOf2);
    }

    public String toString() {
        AnonymousClass1IX copyOf;
        AnonymousClass1IX copyOf2;
        List list = this.mIdentifiers;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = AnonymousClass1IX.copyOf((Collection) list);
        }
        if (copyOf == null) {
            return "";
        }
        List list2 = this.mIdentifiers;
        if (list2 == null) {
            copyOf2 = null;
        } else {
            copyOf2 = AnonymousClass1IX.copyOf((Collection) list2);
        }
        return AnonymousClass2SU.A00("", copyOf2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass1IX r0;
        List list;
        List list2 = this.mIdentifiers;
        if (list2 == null || AnonymousClass1IX.copyOf((Collection) list2) == null || (list = this.mIdentifiers) == null) {
            r0 = null;
        } else {
            r0 = AnonymousClass1IX.copyOf((Collection) list);
        }
        parcel.writeStringList(r0);
    }

    public C64622v4() {
        this.mIdentifiers = null;
        this.mIdentifiers = AnonymousClass000.A13();
    }
}
