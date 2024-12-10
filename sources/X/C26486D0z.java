package X;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0z  reason: case insensitive filesystem */
public final class C26486D0z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        C23166BcM bcM = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 2:
                    str2 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 3:
                    str3 = C26300CxD.A0D(parcel, readInt);
                    break;
                case 4:
                    bluetoothDevice = (BluetoothDevice) C26300CxD.A0A(parcel, BluetoothDevice.CREATOR, readInt);
                    break;
                case 5:
                    bArr = C26300CxD.A0O(parcel, readInt);
                    break;
                case 6:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 7:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23189Bcj(bluetoothDevice, bcM, str, str2, str3, bArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23189Bcj[i];
    }
}
