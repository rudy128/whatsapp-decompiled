package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Bcx  reason: case insensitive filesystem */
public final class C23203Bcx extends DJ0 {
    public static final C23203Bcx A04 = new C23203Bcx(0);
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public C23203Bcx(int i, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i);
    }

    public boolean A00() {
        return (this.A01 == 0 || this.A02 == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C23203Bcx) {
                C23203Bcx bcx = (C23203Bcx) obj;
                if (this.A01 != bcx.A01 || !C25332Cdd.A01(this.A02, bcx.A02) || !C25332Cdd.A01(this.A03, bcx.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        CYH cyh = new CYH(this);
        int i = this.A01;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case 22:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case 23:
                            str = "API_DISABLED";
                            break;
                        case 24:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("UNKNOWN_ERROR_CODE(");
                            A10.append(i);
                            str = AnonymousClass8BU.A0q(A10);
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        cyh.A00(str, "statusCode");
        cyh.A00(this.A02, "resolution");
        cyh.A00(this.A03, "message");
        return cyh.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A012 = C26293Cx2.A01(parcel, this.A00);
        C26293Cx2.A06(parcel, 2, this.A01);
        C26293Cx2.A09(parcel, this.A02, 3, i, false);
        C26293Cx2.A0A(parcel, this.A03, 4, false);
        C26293Cx2.A05(parcel, A012);
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A01);
        A1a[1] = this.A02;
        return AnonymousClass000.A0P(this.A03, A1a, 2);
    }

    public C23203Bcx(int i) {
        this((PendingIntent) null, (String) null, 1, i);
    }

    public C23203Bcx(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }
}
