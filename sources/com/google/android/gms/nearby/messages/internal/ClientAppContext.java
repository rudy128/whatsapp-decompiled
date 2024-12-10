package com.google.android.gms.nearby.messages.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.C18210vx;
import X.C26293Cx2;
import X.DJ0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Locale;

public final class ClientAppContext extends DJ0 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    @Deprecated
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof ClientAppContext) {
                    ClientAppContext clientAppContext = (ClientAppContext) obj;
                    String str = this.A02;
                    String str2 = clientAppContext.A02;
                    if (TextUtils.isEmpty(str)) {
                        equals = TextUtils.isEmpty(str2);
                    } else {
                        equals = str.equals(str2);
                    }
                    if (equals) {
                        String str3 = this.A03;
                        String str4 = clientAppContext.A03;
                        if (TextUtils.isEmpty(str3)) {
                            equals2 = TextUtils.isEmpty(str4);
                        } else {
                            equals2 = str3.equals(str4);
                        }
                        if (equals2 && this.A05 == clientAppContext.A05) {
                            String str5 = this.A04;
                            String str6 = clientAppContext.A04;
                            if (TextUtils.isEmpty(str5)) {
                                equals3 = TextUtils.isEmpty(str6);
                            } else {
                                equals3 = str5.equals(str6);
                            }
                            if (!equals3 || this.A01 != clientAppContext.A01) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A02, 5);
        A1b[1] = this.A03;
        AnonymousClass8BU.A1Q(A1b, this.A05);
        A1b[3] = this.A04;
        AnonymousClass3Ma.A1T(A1b, this.A01);
        return Arrays.hashCode(A1b);
    }

    public final String toString() {
        String str = this.A02;
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass000.A1b(str, 5);
        A1b[1] = this.A03;
        AnonymousClass8BU.A1Q(A1b, this.A05);
        A1b[3] = this.A04;
        AnonymousClass3Ma.A1T(A1b, this.A01);
        return String.format(locale, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", A1b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        boolean A0L = DJ0.A0L(parcel, this.A02);
        C26293Cx2.A0A(parcel, this.A03, 3, A0L);
        C26293Cx2.A08(parcel, 4, this.A05);
        C26293Cx2.A06(parcel, 5, this.A01);
        C26293Cx2.A0A(parcel, this.A04, 6, A0L);
        C26293Cx2.A05(parcel, A012);
    }

    public ClientAppContext(String str, String str2, String str3, int i, int i2, boolean z) {
        this.A00 = i;
        C18210vx.A00(str);
        this.A02 = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Locale locale = Locale.US;
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(str2, "0p:", A1b);
            Log.w("NearbyMessages", String.format(locale, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", A1b));
            str2 = "0p:".concat(str2);
        }
        this.A03 = str2;
        this.A05 = z;
        this.A01 = i2;
        this.A04 = str3;
    }
}
