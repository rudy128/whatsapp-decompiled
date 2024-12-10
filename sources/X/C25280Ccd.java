package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.Ccd  reason: case insensitive filesystem */
public final class C25280Ccd {
    public final C28636EBq A00;

    public LatLng A00() {
        Parcelable parcelable;
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A00, 4);
            Parcelable.Creator creator = LatLng.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            LatLng latLng = (LatLng) parcelable;
            A02.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public Object A01() {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            return C23228Bde.A00(C23331BfJ.A02(cyz.A04(), cyz, 30));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A02() {
        try {
            C26399Cyz.A03((C26399Cyz) this.A00, 12);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A03() {
        try {
            C26399Cyz.A03((C26399Cyz) this.A00, 11);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A04(CLL cll) {
        C26399Cyz cyz;
        Parcel parcel;
        if (cll == null) {
            try {
                cyz = (C26399Cyz) this.A00;
                parcel = cyz.A04();
                parcel.writeStrongBinder((IBinder) null);
            } catch (RemoteException e) {
                throw C27226Da5.A00(e);
            }
        } else {
            IObjectWrapper iObjectWrapper = cll.A00;
            cyz = (C26399Cyz) this.A00;
            parcel = C26399Cyz.A00(iObjectWrapper, cyz);
        }
        cyz.A06(18, parcel);
    }

    public void A05(LatLng latLng) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            cyz.A06(3, C26399Cyz.A01(latLng, cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A06(Object obj) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            cyz.A06(29, C26399Cyz.A00(new C23228Bde(obj), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A07(String str) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A04 = cyz.A04();
            A04.writeString(str);
            cyz.A06(5, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A08(boolean z) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A04 = cyz.A04();
            A04.writeInt(z ? 1 : 0);
            cyz.A06(14, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public boolean A09() {
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A00, 15);
            boolean A1O = AnonymousClass000.A1O(A02.readInt());
            A02.recycle();
            return A1O;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25280Ccd)) {
            return false;
        }
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A05 = cyz.A05(16, C26399Cyz.A00(((C25280Ccd) obj).A00, cyz));
            boolean A1O = AnonymousClass000.A1O(A05.readInt());
            A05.recycle();
            return A1O;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public int hashCode() {
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A00, 17);
            int readInt = A02.readInt();
            A02.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public C25280Ccd(C28636EBq eBq) {
        C18210vx.A00(eBq);
        this.A00 = eBq;
    }
}
