package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import com.whatsapp.voipcalling.CallInfo;
import java.util.Iterator;

/* renamed from: X.8C8  reason: invalid class name */
public class AnonymousClass8C8 extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ C21067Adx A02;

    public static String A00(int i) {
        if (i == -1) {
            return "ERROR";
        }
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTED";
        }
        if (i != 2) {
            return "UNKNOWN BLUETOOTH SCO STATE";
        }
        return "CONNECTING";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8C8(C21067Adx adx) {
        this();
        this.A02 = adx;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    C02800Fk.A00(context);
                    this.A01 = true;
                }
            }
        }
        C17960vV.A02();
        if (C17890vO.A1S(intent, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            C21067Adx adx = this.A02;
            int i = adx.A01;
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            adx.A01 = intExtra;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A10.append(A00(i));
            A10.append(" -> ");
            A10.append(A00(intExtra));
            C17890vO.A1A(A10, "]");
            CallInfo BO3 = adx.A0B.BO3();
            int i2 = adx.A01;
            if (i2 == 0) {
                if (i == 2 || i == 1) {
                    adx.A09(BO3, false);
                    adx.A06(BO3, (Boolean) null);
                }
            } else if (i2 == 1) {
                if (AnonymousClass112.A08()) {
                    Iterator it = C137466vV.A00(adx.A0I.A0D()).iterator();
                    while (it.hasNext()) {
                        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it.next();
                        StringBuilder A11 = AnonymousClass000.A11("voip/audio_route/bluetoothScoReceiver device name: ");
                        A11.append(audioDeviceInfo.getProductName());
                        A11.append(", type: ");
                        A11.append(audioDeviceInfo.getType());
                        A11.append(", address: ");
                        C17890vO.A1A(A11, audioDeviceInfo.getAddress());
                    }
                } else {
                    BluetoothHeadset bluetoothHeadset = adx.A0K.A00;
                    if (bluetoothHeadset != null) {
                        for (BluetoothDevice next : bluetoothHeadset.getConnectedDevices()) {
                            if (bluetoothHeadset.isAudioConnected(next)) {
                                BluetoothClass bluetoothClass = next.getBluetoothClass();
                                StringBuilder A112 = AnonymousClass000.A11("voip/audio_route/bluetoothScoReceiver device name: ");
                                A112.append(next.getName());
                                A112.append(", device class:");
                                A112.append(bluetoothClass.getDeviceClass());
                                A112.append(", major class: ");
                                A112.append(bluetoothClass.getMajorDeviceClass());
                                A112.append(", supports AUDIO: ");
                                A112.append(bluetoothClass.hasService(2097152));
                                A112.append(", supports TELEPHONY: ");
                                A112.append(bluetoothClass.hasService(4194304));
                                A112.append(", address: ");
                                C17890vO.A1A(A112, next.getAddress());
                            }
                        }
                    }
                }
            }
            adx.A07(BO3, (Boolean) null);
        }
    }

    public AnonymousClass8C8() {
        this.A01 = false;
        this.A00 = C17880vN.A0p();
    }
}
