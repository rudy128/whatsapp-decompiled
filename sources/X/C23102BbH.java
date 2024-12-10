package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.BbH  reason: case insensitive filesystem */
public class C23102BbH extends DJ0 {
    public static final C23191Bcl[] A0E = new C23191Bcl[0];
    public static final Scope[] A0F = new Scope[0];
    public static final Parcelable.Creator CREATOR = new Object();
    public Account A00;
    public Bundle A01;
    public IBinder A02;
    public String A03;
    public boolean A04;
    public C23191Bcl[] A05;
    public C23191Bcl[] A06;
    public Scope[] A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final String A0C;
    public final boolean A0D;

    public C23102BbH(Account account, Bundle bundle, IBinder iBinder, String str, String str2, C23191Bcl[] bclArr, C23191Bcl[] bclArr2, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Account account2;
        Object cyt;
        Parcelable parcelable;
        scopeArr = scopeArr == null ? A0F : scopeArr;
        bundle = bundle == null ? C17880vN.A0D() : bundle;
        bclArr = bclArr == null ? A0E : bclArr;
        bclArr2 = bclArr2 == null ? A0E : bclArr2;
        int i5 = i;
        this.A08 = i5;
        this.A09 = i2;
        this.A0A = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A03 = "com.google.android.gms";
        } else {
            this.A03 = str;
        }
        if (i5 < 2) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    cyt = (IAccountAccessor) queryLocalInterface;
                } else {
                    cyt = new C26393Cyt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                }
                account2 = null;
                if (cyt != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        C23327BfF bfF = (C23327BfF) cyt;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(bfF.A00);
                        Parcel A002 = bfF.A00(2, obtain);
                        Parcelable.Creator creator = Account.CREATOR;
                        if (A002.readInt() == 0) {
                            parcelable = null;
                        } else {
                            parcelable = (Parcelable) creator.createFromParcel(A002);
                        }
                        Account account3 = (Account) parcelable;
                        A002.recycle();
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                account2 = null;
            }
            this.A00 = account2;
        } else {
            this.A02 = iBinder;
            this.A00 = account;
        }
        this.A07 = scopeArr;
        this.A01 = bundle;
        this.A05 = bclArr;
        this.A06 = bclArr2;
        this.A0D = z;
        this.A0B = i4;
        this.A04 = z2;
        this.A0C = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        D39.A00(parcel, this, i);
    }
}
