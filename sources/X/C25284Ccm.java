package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.Ccm  reason: case insensitive filesystem */
public class C25284Ccm {
    public CVJ A00;
    public final IGoogleMapDelegate A01;

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Cyz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C25134CZk A00() {
        /*
            r5 = this;
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = r5.A01     // Catch:{ RemoteException -> 0x002e }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x002e }
            r0 = 26
            android.os.Parcel r4 = X.C26399Cyz.A02(r1, r0)     // Catch:{ RemoteException -> 0x002e }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x002e }
            if (r3 != 0) goto L_0x0012
            r1 = 0
            goto L_0x001e
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x002e }
            boolean r0 = r1 instanceof com.google.android.gms.maps.internal.IProjectionDelegate     // Catch:{ RemoteException -> 0x002e }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.maps.internal.IProjectionDelegate r1 = (com.google.android.gms.maps.internal.IProjectionDelegate) r1     // Catch:{ RemoteException -> 0x002e }
        L_0x001e:
            r4.recycle()     // Catch:{ RemoteException -> 0x002e }
            X.CZk r0 = new X.CZk     // Catch:{ RemoteException -> 0x002e }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x002e }
            goto L_0x002d
        L_0x0027:
            X.BgG r1 = new X.BgG     // Catch:{ RemoteException -> 0x002e }
            r1.<init>(r3, r2)     // Catch:{ RemoteException -> 0x002e }
            goto L_0x001e
        L_0x002d:
            return r0
        L_0x002e:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25284Ccm.A00():X.CZk");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Cyz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.CVJ A01() {
        /*
            r5 = this;
            X.CVJ r0 = r5.A00     // Catch:{ RemoteException -> 0x0035 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = r5.A01     // Catch:{ RemoteException -> 0x0035 }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x0035 }
            r0 = 25
            android.os.Parcel r4 = X.C26399Cyz.A02(r1, r0)     // Catch:{ RemoteException -> 0x0035 }
            android.os.IBinder r3 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x0035 }
            if (r3 != 0) goto L_0x0016
            r1 = 0
            goto L_0x0022
        L_0x0016:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r1 = r3.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0035 }
            boolean r0 = r1 instanceof com.google.android.gms.maps.internal.IUiSettingsDelegate     // Catch:{ RemoteException -> 0x0035 }
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.maps.internal.IUiSettingsDelegate r1 = (com.google.android.gms.maps.internal.IUiSettingsDelegate) r1     // Catch:{ RemoteException -> 0x0035 }
        L_0x0022:
            r4.recycle()     // Catch:{ RemoteException -> 0x0035 }
            X.CVJ r0 = new X.CVJ     // Catch:{ RemoteException -> 0x0035 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0035 }
            r5.A00 = r0     // Catch:{ RemoteException -> 0x0035 }
            goto L_0x0033
        L_0x002d:
            X.BgH r1 = new X.BgH     // Catch:{ RemoteException -> 0x0035 }
            r1.<init>(r3, r2)     // Catch:{ RemoteException -> 0x0035 }
            goto L_0x0022
        L_0x0033:
            return r0
        L_0x0034:
            return r0
        L_0x0035:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25284Ccm.A01():X.CVJ");
    }

    public final CameraPosition A02() {
        Parcelable parcelable;
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A01, 1);
            Parcelable.Creator creator = CameraPosition.CREATOR;
            if (A02.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(A02);
            }
            CameraPosition cameraPosition = (CameraPosition) parcelable;
            A02.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final C25280Ccd A03(C23100BbF bbF) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A05 = cyz.A05(11, C26399Cyz.A01(bbF, cyz));
            C28636EBq A002 = C23400BgR.A00(A05.readStrongBinder());
            A05.recycle();
            if (A002 != null) {
                return new C25280Ccd(A002);
            }
            return null;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A04() {
        try {
            C26399Cyz.A03((C26399Cyz) this.A01, 94);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A05() {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeFloat(16.0f);
            cyz.A06(93, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A06(int i) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeInt(i);
            cyz.A06(16, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A07(int i, int i2, int i3, int i4) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeInt(i);
            A04.writeInt(i2);
            A04.writeInt(i3);
            A04.writeInt(i4);
            cyz.A06(39, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A08(CLK clk) {
        try {
            C18210vx.A02(clk, "CameraUpdate must not be null.");
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(5, C26399Cyz.A00(clk.A00, cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A09(CLK clk) {
        try {
            C18210vx.A02(clk, "CameraUpdate must not be null.");
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(4, C26399Cyz.A00(clk.A00, cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0A(CLK clk, E2G e2g) {
        C23393BgK bgK;
        IBinder iBinder;
        try {
            C18210vx.A02(clk, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = clk.A00;
            if (e2g == null) {
                bgK = null;
            } else {
                bgK = new C23393BgK(e2g);
            }
            C26399Cyz cyz = (C26399Cyz) iGoogleMapDelegate;
            Parcel A002 = C26399Cyz.A00(iObjectWrapper, cyz);
            if (bgK == null) {
                iBinder = null;
            } else {
                iBinder = bgK.asBinder();
            }
            A002.writeStrongBinder(iBinder);
            cyz.A06(6, A002);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0B(CLK clk, E2G e2g) {
        C23393BgK bgK;
        IBinder iBinder;
        try {
            C18210vx.A02(clk, "CameraUpdate must not be null.");
            IGoogleMapDelegate iGoogleMapDelegate = this.A01;
            IObjectWrapper iObjectWrapper = clk.A00;
            if (e2g == null) {
                bgK = null;
            } else {
                bgK = new C23393BgK(e2g);
            }
            C26399Cyz cyz = (C26399Cyz) iGoogleMapDelegate;
            Parcel A002 = C26399Cyz.A00(iObjectWrapper, cyz);
            A002.writeInt(400);
            if (bgK == null) {
                iBinder = null;
            } else {
                iBinder = bgK.asBinder();
            }
            A002.writeStrongBinder(iBinder);
            cyz.A06(7, A002);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0C(E5W e5w) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(33, C26399Cyz.A00(new C23396BgN(e5w), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0D(E5X e5x) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(99, C26399Cyz.A00(new C23398BgP(e5x), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0E(E5Y e5y) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(96, C26399Cyz.A00(new C23397BgO(e5y), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0F(E2H e2h) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(32, C26399Cyz.A00(new C23395BgM(e2h), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0G(E5Z e5z) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(28, C26399Cyz.A00(new C23399BgQ(e5z), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0H(E2I e2i) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            cyz.A06(30, C26399Cyz.A00(new C23392BgJ(e2i), cyz));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public void A0I(C23031Ba7 ba7) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A05 = cyz.A05(91, C26399Cyz.A01(ba7, cyz));
            A05.readInt();
            A05.recycle();
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0J(boolean z) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeInt(z ? 1 : 0);
            Parcel A05 = cyz.A05(20, A04);
            A05.readInt();
            A05.recycle();
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0K(boolean z) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeInt(z ? 1 : 0);
            cyz.A06(22, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final void A0L(boolean z) {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A01;
            Parcel A04 = cyz.A04();
            A04.writeInt(z ? 1 : 0);
            cyz.A06(18, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public final boolean A0M() {
        try {
            Parcel A02 = C26399Cyz.A02((C26399Cyz) this.A01, 17);
            boolean A1O = AnonymousClass000.A1O(A02.readInt());
            A02.recycle();
            return A1O;
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }

    public C25284Ccm(IGoogleMapDelegate iGoogleMapDelegate) {
        C18210vx.A00(iGoogleMapDelegate);
        this.A01 = iGoogleMapDelegate;
    }
}
