package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.8CB  reason: invalid class name */
public final class AnonymousClass8CB extends BroadcastReceiver implements AnonymousClass191, BluetoothProfile.ServiceListener {
    public BluetoothHeadset A00;
    public AudioDeviceCallback A01;
    public WeakReference A02;
    public int A03 = -1;
    public final Context A04;
    public final C29831cw A05;
    public final AnonymousClass11C A06;
    public final Set A07;

    public /* synthetic */ void Blg() {
    }

    public void onReceive(Context context, Intent intent) {
        C18070vi.A0d(intent, 1);
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BluetoothHeadsetMonitor/bluetoothConnectionReceiver [");
            A10.append(C196909vq.A00(intExtra2));
            A10.append(" -> ");
            A10.append(C196909vq.A00(intExtra));
            Log.i(C17890vO.A0c(A10, ']'));
            if (intExtra != intExtra2) {
                A01(this, intExtra);
            }
        }
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C21067Adx adx;
        List<BluetoothDevice> connectedDevices;
        C18070vi.A0d(bluetoothProfile, 1);
        if (i == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            this.A00 = bluetoothHeadset;
            WeakReference weakReference = this.A02;
            if (weakReference != null) {
                adx = (C21067Adx) weakReference.get();
                if (adx != null && !adx.A02) {
                    if (bluetoothHeadset != null) {
                        AudioManager A0D = this.A06.A0D();
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("BluetoothHeadsetMonitor/onServiceConnected ");
                        A10.append(bluetoothHeadset);
                        A10.append(", devices: ");
                        if (AnonymousClass112.A08()) {
                            connectedDevices = C196909vq.A01(A0D);
                        } else {
                            connectedDevices = bluetoothHeadset.getConnectedDevices();
                        }
                        A10.append(connectedDevices);
                        C17900vP.A0Y(adx, ", ", A10);
                        adx.A04(adx.A0B.BO3());
                        return;
                    }
                    return;
                }
            } else {
                adx = null;
            }
            C17900vP.A0Z(adx, "BluetoothHeadsetMonitor/onServiceConnected VoipInterface already Destroyed ", AnonymousClass000.A10());
        }
    }

    public void onServiceDisconnected(int i) {
        C21067Adx adx;
        if (i == 1) {
            WeakReference weakReference = this.A02;
            if (weakReference != null) {
                adx = (C21067Adx) weakReference.get();
            } else {
                adx = null;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BluetoothHeadsetMonitor/onServiceDisconnected ");
            A10.append(this.A00);
            C17900vP.A0Y(adx, ", ", A10);
            this.A00 = null;
            if (adx == null || adx.A02) {
                C17900vP.A0Z(adx, "BluetoothHeadsetMonitor/onServiceDisconnected VoipInterface already Destroyed ", AnonymousClass000.A10());
            } else {
                adx.A09(adx.A0B.BO3(), false);
            }
        }
    }

    private final void A00() {
        this.A01 = new AnonymousClass8CN(this);
    }

    public static final void A01(AnonymousClass8CB r1, int i) {
        if (r1.A03 != i) {
            r1.A03 = i;
            for (B9T Bmk : r1.A07) {
                Bmk.Bmk(i);
            }
        }
    }

    public final void A02(B9T b9t) {
        Set set = this.A07;
        if (set.isEmpty()) {
            if (AnonymousClass112.A08()) {
                AudioManager A0D = this.A06.A0D();
                if (A0D != null) {
                    A00();
                    AudioDeviceCallback audioDeviceCallback = this.A01;
                    if (audioDeviceCallback != null) {
                        A0D.registerAudioDeviceCallback(audioDeviceCallback, (Handler) null);
                    } else {
                        throw C17880vN.A0g();
                    }
                }
            } else {
                this.A05.A01(this.A04, this, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"), true);
            }
        }
        set.add(b9t);
    }

    public final void A03(B9T b9t) {
        Set set = this.A07;
        if (set.remove(b9t) && set.isEmpty()) {
            if (AnonymousClass112.A08()) {
                AudioManager A0D = this.A06.A0D();
                if (A0D != null) {
                    AudioDeviceCallback audioDeviceCallback = this.A01;
                    if (audioDeviceCallback != null) {
                        A0D.unregisterAudioDeviceCallback(audioDeviceCallback);
                        return;
                    }
                    throw C17880vN.A0g();
                }
                return;
            }
            this.A05.A02(this, this.A04);
        }
    }

    public AnonymousClass8CB(Context context, C29831cw r3, AnonymousClass11C r4) {
        C18070vi.A0k(r4, r3);
        this.A04 = context;
        this.A06 = r4;
        this.A05 = r3;
        Set newSetFromMap = Collections.newSetFromMap(AnonymousClass8BR.A17());
        C18070vi.A0X(newSetFromMap);
        this.A07 = newSetFromMap;
    }

    public void Ba9() {
    }

    public void Blf() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                defaultAdapter.getProfileProxy(this.A04, this, 1);
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
        } else {
            Log.e("BluetoothHeadsetMonitor/init failed to get bluetoothAdapter");
        }
    }
}
