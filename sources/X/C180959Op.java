package X;

import android.bluetooth.BluetoothSocket;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/* renamed from: X.9Op  reason: invalid class name and case insensitive filesystem */
public abstract class C180959Op {
    public static final C162508Qv A00(BluetoothSocket bluetoothSocket) {
        C24276ByZ byZ;
        int connectionType = bluetoothSocket.getConnectionType();
        if (connectionType == 1) {
            byZ = C24276ByZ.BtcRfcomm;
        } else if (connectionType == 3) {
            byZ = C24276ByZ.BleL2Cap;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Error occurred attempting to map bluetooth socket connection type to transport type.Connection type ");
            A10.append(bluetoothSocket.getConnectionType());
            throw C17880vN.A0f(AnonymousClass000.A0y(" is unsupported!  Currently only support values are [1 : TYPE_RFCOMM ,and 2: TYPE_L2CAP]", A10));
        }
        return new C162508Qv(byZ, new BufferedInputStream(bluetoothSocket.getInputStream(), DefaultCrypto.BUFFER_SIZE), new BufferedOutputStream(bluetoothSocket.getOutputStream(), DefaultCrypto.BUFFER_SIZE), (Integer) null);
    }
}
