package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1ch  reason: invalid class name and case insensitive filesystem */
public final class C29681ch extends AnonymousClass1BI implements Parcelable {
    public static final C22921Du A02 = C22921Du.A01();
    public static final AnonymousClass25J A03 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public boolean A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29681ch(String str) {
        super(str);
        C18070vi.A0d(str, 1);
        this.A01 = str;
    }

    public int describeContents() {
        return 0;
    }

    public int getType() {
        return 21;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
    }

    public static final boolean A00(AnonymousClass1BI r3) {
        C29681ch r32;
        if (r3 instanceof C29681ch) {
            r32 = (C29681ch) r3;
        } else {
            r32 = null;
        }
        if (r32 == null || !r32.A00) {
            return false;
        }
        return true;
    }

    public String getServer() {
        return "newsletter";
    }
}
