package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityResponse;
import com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: X.BFo  reason: case insensitive filesystem */
public final class C22608BFo extends Binder implements IAppLinkDeviceIdentityResponseCallback {
    public final /* synthetic */ Cw1 A00;
    public final /* synthetic */ C22821Di A01;
    public final /* synthetic */ AnonymousClass1OS A02;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22608BFo(Cw1 cw1, C22821Di r2, AnonymousClass1OS r3) {
        this();
        this.A00 = cw1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                if (i == 2) {
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(AppLinkDeviceIdentityResponse.CREATOR);
                    C18070vi.A0d(createTypedArrayList, 0);
                    if (createTypedArrayList.isEmpty()) {
                        C26294Cx6.A09("lam:LinkedAppManager", "getDeviceIdentity: onResult empty. Retry.", (Throwable) null);
                    }
                    AppLinkDeviceIdentityResponse appLinkDeviceIdentityResponse = (AppLinkDeviceIdentityResponse) createTypedArrayList.get(AnonymousClass000.A0Q(createTypedArrayList));
                    byte[] bArr = appLinkDeviceIdentityResponse.serviceUUID;
                    C18070vi.A0W(bArr);
                    UUID A0v = BEA.A0v(bArr);
                    byte[] bArr2 = appLinkDeviceIdentityResponse.devicePublicKey;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("serviceUUID=");
                    A10.append(A0v);
                    A10.append(" devicePublicKey=");
                    C18070vi.A0b(bArr2);
                    C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass000.A0y(C200410p.A0J(Ds6.A00, bArr2), A10));
                    this.A02.invoke(A0v, bArr2);
                    return true;
                } else if (i == 3) {
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("getDeviceIdentity: onError ");
                    A102.append(readInt);
                    A102.append(". ");
                    A102.append(readString);
                    C26294Cx6.A09("lam:LinkedAppManager", C17890vO.A0c(A102, '.'), (Throwable) null);
                    C22821Di r1 = this.A01;
                    Object A0w = AnonymousClass000.A0w(C24361Bzw.A00, readInt);
                    if (A0w == null) {
                        A0w = C24361Bzw.UNKNOWN;
                    }
                    r1.invoke(A0w);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public C22608BFo() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceIdentityResponseCallback");
    }
}
