package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDeviceMountState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.facebook.wearable.applinks.AppLinkDeviceStateResponse;
import com.facebook.wearable.applinks.IAppLinkDeviceStateCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* renamed from: X.BFp  reason: case insensitive filesystem */
public final class C22609BFp extends Binder implements IAppLinkDeviceStateCallback {
    public final /* synthetic */ Cw1 A00;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22609BFp(Cw1 cw1) {
        this();
        this.A00 = cw1;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        C4F c4f;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
                if (i == 2) {
                    Parcelable.Creator creator = AppLinkDeviceStateResponse.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    AppLinkDeviceStateResponse appLinkDeviceStateResponse = (AppLinkDeviceStateResponse) obj;
                    C18070vi.A0d(appLinkDeviceStateResponse, 0);
                    byte[] bArr = appLinkDeviceStateResponse.serviceUUID;
                    C18070vi.A0W(bArr);
                    ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    UUID uuid = new UUID(order.getLong(), order.getLong());
                    ByteBuffer order2 = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN);
                    BEA.A1T(order2, uuid);
                    byte[] array = order2.array();
                    C18070vi.A0X(array);
                    UUID A0v = BEA.A0v(array);
                    Cw1 cw1 = this.A00;
                    AppLinkDeviceHardwareState appLinkDeviceHardwareState = appLinkDeviceStateResponse.deviceHardwareState;
                    if (appLinkDeviceHardwareState != null) {
                        switch (appLinkDeviceHardwareState.ordinal()) {
                            case 0:
                                c4f = C23782BpR.A00;
                                break;
                            case 1:
                                c4f = C23781BpQ.A00;
                                break;
                            case 2:
                                c4f = C23789BpY.A00;
                                break;
                            case 3:
                                c4f = C23791Bpa.A00;
                                break;
                            case 4:
                                c4f = C23792Bpb.A00;
                                break;
                            case 5:
                                c4f = C23793Bpc.A00;
                                break;
                            default:
                                throw AnonymousClass3MW.A14();
                        }
                    } else {
                        AppLinkDevicePeakPowerState appLinkDevicePeakPowerState = appLinkDeviceStateResponse.devicePeakPowerState;
                        if (appLinkDevicePeakPowerState != null) {
                            switch (appLinkDevicePeakPowerState.ordinal()) {
                                case 0:
                                    c4f = C23783BpS.A00;
                                    break;
                                case 1:
                                    c4f = C23785BpU.A00;
                                    break;
                                case 2:
                                    c4f = C23786BpV.A00;
                                    break;
                                case 3:
                                    c4f = C23787BpW.A00;
                                    break;
                                case 4:
                                    c4f = C23784BpT.A00;
                                    break;
                                case 5:
                                    c4f = C23788BpX.A00;
                                    break;
                                default:
                                    throw AnonymousClass3MW.A14();
                            }
                        } else {
                            AppLinkDeviceMountState appLinkDeviceMountState = appLinkDeviceStateResponse.deviceMountState;
                            if (appLinkDeviceMountState != null) {
                                int ordinal = appLinkDeviceMountState.ordinal();
                                if (ordinal == 0) {
                                    c4f = C23790BpZ.A00;
                                } else if (ordinal == 1) {
                                    c4f = C23794Bpd.A00;
                                } else {
                                    throw AnonymousClass3MW.A14();
                                }
                            } else {
                                AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus = appLinkDeviceStateResponse.deviceConnectionStatus;
                                if (appLinkDeviceConnectionStatus != null) {
                                    int ordinal2 = appLinkDeviceConnectionStatus.ordinal();
                                    if (ordinal2 == 0) {
                                        c4f = C23778BpN.A00;
                                    } else if (ordinal2 == 1) {
                                        c4f = C23779BpO.A00;
                                    } else if (ordinal2 == 2) {
                                        c4f = C23780BpP.A00;
                                    } else if (ordinal2 == 3) {
                                        c4f = C23795Bpe.A00;
                                    }
                                }
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    }
                    BTV btv = new BTV(c4f, A0v);
                    C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(btv, "onDeviceStateUpdate: status=", AnonymousClass000.A10()));
                    C22821Di r0 = cw1.A07;
                    if (r0 != null) {
                        r0.invoke(btv);
                    }
                    if (appLinkDeviceStateResponse.deviceConnectionStatus == AppLinkDeviceConnectionStatus.CONNECTED) {
                        C18090vk r02 = cw1.A01;
                        if (r02 != null) {
                            r02.invoke();
                        }
                        cw1.A01 = null;
                        return true;
                    }
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
            }
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public C22609BFp() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkDeviceStateCallback");
    }
}
