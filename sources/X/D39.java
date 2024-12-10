package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public final class D39 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        Scope[] scopeArr = C23102BbH.A0F;
        Bundle A0D = C17880vN.A0D();
        C23191Bcl[] bclArr = C23102BbH.A0E;
        String str = null;
        C23191Bcl[] bclArr2 = bclArr;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 2:
                    i2 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 3:
                    i3 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 4:
                    str = C26300CxD.A0D(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C26300CxD.A09(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C26300CxD.A0R(parcel2, Scope.CREATOR, readInt);
                    break;
                case 7:
                    A0D = C26300CxD.A08(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) C26300CxD.A0A(parcel2, Account.CREATOR, readInt);
                    break;
                case 10:
                    bclArr = (C23191Bcl[]) C26300CxD.A0R(parcel2, C23191Bcl.CREATOR, readInt);
                    break;
                case 11:
                    bclArr2 = (C23191Bcl[]) C26300CxD.A0R(parcel2, C23191Bcl.CREATOR, readInt);
                    break;
                case 12:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 13:
                    i4 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 14:
                    z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel2, readInt));
                    break;
                case 15:
                    str2 = C26300CxD.A0D(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23102BbH(account, A0D, iBinder, str, str2, bclArr, bclArr2, scopeArr, i, i2, i3, i4, z, z2);
    }

    public static void A00(Parcel parcel, C23102BbH bbH, int i) {
        int A00 = C26293Cx2.A00(parcel);
        C26293Cx2.A06(parcel, 1, bbH.A08);
        C26293Cx2.A06(parcel, 2, bbH.A09);
        C26293Cx2.A06(parcel, 3, bbH.A0A);
        C26293Cx2.A0A(parcel, bbH.A03, 4, false);
        C26293Cx2.A04(bbH.A02, parcel, 5);
        C26293Cx2.A0F(parcel, bbH.A07, 6, i);
        C26293Cx2.A03(bbH.A01, parcel, 7);
        C26293Cx2.A09(parcel, bbH.A00, 8, i, false);
        C26293Cx2.A0F(parcel, bbH.A05, 10, i);
        C26293Cx2.A0F(parcel, bbH.A06, 11, i);
        C26293Cx2.A08(parcel, 12, bbH.A0D);
        C26293Cx2.A06(parcel, 13, bbH.A0B);
        C26293Cx2.A08(parcel, 14, bbH.A04);
        C26293Cx2.A0A(parcel, bbH.A0C, 15, false);
        C26293Cx2.A05(parcel, A00);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23102BbH[i];
    }
}
