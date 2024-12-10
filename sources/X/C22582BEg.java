package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.BEg  reason: case insensitive filesystem */
public final class C22582BEg extends BluetoothGattServerCallback {
    public final /* synthetic */ C25685CkG A00;

    public void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
        AnonymousClass3Ma.A1O(bluetoothDevice, 0, bluetoothGattCharacteristic2);
        C25685CkG ckG = this.A00;
        UUID uuid = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gatt characteristic read (");
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1F(bluetoothGattCharacteristic2.getUuid(), A10));
        boolean A18 = C18070vi.A18(bluetoothGattCharacteristic2.getUuid(), C25685CkG.A08);
        BluetoothGattServer bluetoothGattServer = ckG.A00;
        int i3 = i;
        if (A18) {
            if (bluetoothGattServer != null) {
                bluetoothGattServer.sendResponse(bluetoothDevice2, i3, 0, 0, ckG.A06);
            }
        } else if (bluetoothGattServer != null) {
            bluetoothGattServer.sendResponse(bluetoothDevice, i3, 257, 0, (byte[]) null);
        }
    }

    public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        C18070vi.A0d(bluetoothDevice, 0);
        C25685CkG ckG = this.A00;
        UUID uuid = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("connection state changed ");
        A10.append(bluetoothDevice);
        A10.append(" connected=");
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass3MY.A0r(A10, AnonymousClass000.A1T(i2, 2)));
        if (i2 == 0) {
            ckG.A04.remove(bluetoothDevice);
        }
    }

    public void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        byte[] bArr;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        BluetoothGattDescriptor bluetoothGattDescriptor2 = bluetoothGattDescriptor;
        AnonymousClass3Ma.A1O(bluetoothDevice, 0, bluetoothGattDescriptor2);
        C25685CkG ckG = this.A00;
        UUID uuid = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gatt descriptor read (");
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1F(bluetoothGattDescriptor2.getUuid(), A10));
        int i3 = i;
        if (C18070vi.A18(C25685CkG.A07, bluetoothGattDescriptor2.getUuid())) {
            if (ckG.A04.contains(bluetoothDevice)) {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            BluetoothGattServer bluetoothGattServer = ckG.A00;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.sendResponse(bluetoothDevice2, i3, 0, 0, bArr);
                return;
            }
            return;
        }
        BluetoothGattServer bluetoothGattServer2 = ckG.A00;
        if (bluetoothGattServer2 != null) {
            bluetoothGattServer2.sendResponse(bluetoothDevice, i3, 257, 0, (byte[]) null);
        }
    }

    public void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        BluetoothGattServer bluetoothGattServer;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        BluetoothGattDescriptor bluetoothGattDescriptor2 = bluetoothGattDescriptor;
        C18070vi.A0e(bluetoothDevice, 0, bluetoothGattDescriptor2);
        C25685CkG ckG = this.A00;
        UUID uuid = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gatt descriptor write (");
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1F(bluetoothGattDescriptor2.getUuid(), A10));
        int i3 = i;
        if (C18070vi.A18(C25685CkG.A07, bluetoothGattDescriptor2.getUuid())) {
            byte[] bArr2 = bArr;
            if (Arrays.equals(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, bArr2)) {
                C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1E(bluetoothDevice, "subscribe gatt device ", AnonymousClass000.A10()));
                ckG.A04.add(bluetoothDevice);
            } else if (Arrays.equals(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, bArr2)) {
                C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1E(bluetoothDevice, "unsubscribe gatt device ", AnonymousClass000.A10()));
                ckG.A04.remove(bluetoothDevice);
            }
            if (z2 && (bluetoothGattServer = ckG.A00) != null) {
                bluetoothGattServer.sendResponse(bluetoothDevice2, i3, 0, 0, (byte[]) null);
                return;
            }
            return;
        }
        BluetoothGattServer bluetoothGattServer2 = ckG.A00;
        if (bluetoothGattServer2 != null) {
            bluetoothGattServer2.sendResponse(bluetoothDevice, i3, 257, 0, (byte[]) null);
        }
    }

    public void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        C18070vi.A0d(bluetoothDevice, 0);
        UUID uuid = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mtu changed ");
        A10.append(bluetoothDevice);
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1I(" mtu=", A10, i));
    }

    public C22582BEg(C25685CkG ckG) {
        this.A00 = ckG;
    }

    public void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        UUID uuid;
        int i3;
        byte[] bArr2;
        int i4;
        C25685CkG ckG = this.A00;
        UUID uuid2 = C25685CkG.A07;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gatt characteristic write (");
        UUID uuid3 = null;
        if (bluetoothGattCharacteristic != null) {
            uuid = bluetoothGattCharacteristic.getUuid();
        } else {
            uuid = null;
        }
        C26294Cx6.A06("lam:LinkedDeviceManager/gatt", AnonymousClass001.A1F(uuid, A10));
        if (bluetoothGattCharacteristic != null) {
            uuid3 = bluetoothGattCharacteristic.getUuid();
        }
        boolean A18 = C18070vi.A18(uuid3, C25685CkG.A08);
        BluetoothGattServer bluetoothGattServer = ckG.A00;
        if (A18) {
            if (bluetoothGattServer != null) {
                bArr2 = ckG.A06;
                i4 = 0;
                i3 = 0;
            } else {
                return;
            }
        } else if (bluetoothGattServer != null) {
            i3 = 0;
            bArr2 = null;
            i4 = 257;
        } else {
            return;
        }
        bluetoothGattServer.sendResponse(bluetoothDevice, i, i4, i3, bArr2);
    }
}
