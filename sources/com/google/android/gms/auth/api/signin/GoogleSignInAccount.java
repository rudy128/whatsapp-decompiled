package com.google.android.gms.auth.api.signin;

import X.AnonymousClass8BR;
import X.C17880vN;
import X.C26293Cx2;
import X.C28450E1q;
import X.DJ0;
import X.DJ3;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends DJ0 implements ReflectedParcelable {
    public static final C28450E1q A0D = DJ3.A00;
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public final int A01;
    public final long A02;
    public final Uri A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final Set A0C = C17880vN.A12();

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A08.equals(this.A08)) {
                        HashSet A12 = AnonymousClass8BR.A12(googleSignInAccount.A0B);
                        A12.addAll(googleSignInAccount.A0C);
                        HashSet A122 = AnonymousClass8BR.A12(this.A0B);
                        A122.addAll(this.A0C);
                        if (A12.equals(A122)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A08.hashCode() + 527;
        HashSet A12 = AnonymousClass8BR.A12(this.A0B);
        A12.addAll(this.A0C);
        return (hashCode * 31) + A12.hashCode();
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = uri;
        this.A00 = str5;
        this.A02 = j;
        this.A08 = str6;
        this.A0B = list;
        this.A09 = str7;
        this.A0A = str8;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, this.A01);
        boolean A0L = DJ0.A0L(parcel, this.A04);
        C26293Cx2.A0A(parcel, this.A05, 3, A0L);
        C26293Cx2.A0A(parcel, this.A06, 4, A0L);
        C26293Cx2.A0A(parcel, this.A07, 5, A0L);
        C26293Cx2.A09(parcel, this.A03, 6, i, A0L);
        C26293Cx2.A0A(parcel, this.A00, 7, A0L);
        C26293Cx2.A07(parcel, 8, this.A02);
        C26293Cx2.A0A(parcel, this.A08, 9, A0L);
        C26293Cx2.A0C(parcel, this.A0B, 10, A0L);
        C26293Cx2.A0A(parcel, this.A09, 11, A0L);
        C26293Cx2.A0A(parcel, this.A0A, 12, A0L);
        C26293Cx2.A05(parcel, A002);
    }
}
