package X;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Ct  reason: invalid class name and case insensitive filesystem */
public final class C161328Ct extends Connection {
    public AnonymousClass1VN A00;
    public String A01;
    public List A02;
    public final C18100vl A03;
    public final C18030ve A04;
    public final AnonymousClass1DC A05;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2 != 3) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(int r2) {
        /*
            r1 = 4
            r0 = 1
            if (r2 == r0) goto L_0x000f
            r1 = 2
            if (r2 == r1) goto L_0x000a
            r0 = 3
            if (r2 == r0) goto L_0x000f
        L_0x000a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x000f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161328Ct.A00(int):java.lang.Integer");
    }

    public static void A02(AnonymousClass10T r2, Object obj, String str) {
        r2.notifyAllObservers(new AnonymousClass35P(0, str, obj));
    }

    public final void A09(String str) {
        C18070vi.A0d(str, 0);
        this.A01 = str;
    }

    public void onAvailableCallEndpointsChanged(List list) {
        C18070vi.A0d(list, 0);
        this.A02 = list;
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        C18070vi.A0d(callAudioState, 0);
        if (!A03()) {
            C17900vP.A0Y(callAudioState, "voip/SelfManagedConnection/onCallAudioStateChanged ", AnonymousClass000.A10());
            super.onCallAudioStateChanged(callAudioState);
            AnonymousClass1VN r1 = this.A00;
            if (r1 != null) {
                r1.A0D(callAudioState, this.A01);
            }
        }
    }

    public void onCallEndpointChanged(CallEndpoint callEndpoint) {
        C18070vi.A0d(callEndpoint, 0);
        if (A03()) {
            C17900vP.A0Y(callEndpoint, "voip/SelfManagedConnection/onCallEndpointChanged ", AnonymousClass000.A10());
            super.onCallEndpointChanged(callEndpoint);
            AnonymousClass1VN r1 = this.A00;
            if (r1 != null) {
                r1.A0E(callEndpoint, this.A01);
            }
        }
    }

    public void onExtrasChanged(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onExtrasChanged(bundle);
    }

    private final boolean A03() {
        C18030ve r2 = this.A04;
        if (!AnonymousClass112.A0A() || !C18020vd.A05(C18040vf.A02, r2, 9808)) {
            return false;
        }
        return true;
    }

    public final void A08(int i) {
        if (this.A00 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/SelfManagedConnection/setDisconnected ");
            A10.append(this.A01);
            C17900vP.A0j(", cause: ", A10, i);
            setDisconnected(new DisconnectCause(i));
            destroy();
            AnonymousClass1VN r0 = this.A00;
            if (r0 != null) {
                r0.A0I(this);
            }
            this.A00 = null;
            this.A02 = null;
        }
    }

    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    public void onAnswer(int i) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            A02(r2, AnonymousClass00R.A0C, this.A01);
        }
        setActive();
    }

    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            A02(r2, AnonymousClass00R.A0Y, this.A01);
        }
        A08(2);
    }

    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            C20738AWt.A00(r2, this.A01, 2);
        }
    }

    public C161328Ct(AnonymousClass1VN r2, C18030ve r3, AnonymousClass1DC r4, AnonymousClass10I r5, String str) {
        C18070vi.A0j(r3, r5);
        C18070vi.A0d(r4, 4);
        this.A04 = r3;
        this.A01 = str;
        this.A05 = r4;
        this.A00 = r2;
        this.A03 = AnonymousClass1DF.A01(new C21874Au0(r5));
    }

    public static final Integer A01(CallEndpoint callEndpoint) {
        int endpointType = callEndpoint.getEndpointType();
        int i = 2;
        if (endpointType != 1) {
            if (endpointType == 2) {
                return 3;
            }
            i = 4;
            if (endpointType != 3) {
                if (endpointType != 4) {
                    return null;
                }
                return 1;
            }
        }
        return Integer.valueOf(i);
    }

    public Integer A04() {
        if (A03()) {
            CallEndpoint currentCallEndpoint = getCurrentCallEndpoint();
            if (currentCallEndpoint != null) {
                return A01(currentCallEndpoint);
            }
            return null;
        }
        CallAudioState callAudioState = getCallAudioState();
        if (callAudioState == null) {
            return null;
        }
        int route = callAudioState.getRoute();
        int i = 2;
        if (route != 1) {
            i = 3;
            if (route != 2) {
                i = 4;
                if (route != 4) {
                    if (route != 8) {
                        return null;
                    }
                    return 1;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public String A05() {
        CallEndpoint callAudioState;
        boolean A032 = A03();
        StringBuilder A10 = AnonymousClass000.A10();
        if (A032) {
            A10.append("currentCallEndPoint = ");
            callAudioState = getCurrentCallEndpoint();
        } else {
            A10.append("callAudioState = ");
            callAudioState = getCallAudioState();
        }
        return C17890vO.A0V(callAudioState, A10);
    }

    public final String A06() {
        return this.A01;
    }

    public void A07(int i) {
        Integer num;
        Object obj;
        if (A03()) {
            List list = this.A02;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int endpointType = ((CallEndpoint) obj).getEndpointType();
                    Integer A002 = A00(i);
                    if (A002 != null && endpointType == A002.intValue()) {
                        break;
                    }
                }
                CallEndpoint callEndpoint = (CallEndpoint) obj;
                if (callEndpoint != null) {
                    requestCallEndpointChange(callEndpoint, (C200710s) this.A03.getValue(), new AAO());
                    return;
                }
                return;
            }
            return;
        }
        int i2 = 1;
        if (i == 1) {
            i2 = 8;
        } else if (i != 2) {
            if (i != 3) {
                i2 = 4;
            } else {
                num = 2;
                setAudioRoute(num.intValue());
            }
        }
        num = Integer.valueOf(i2);
        if (num == null) {
            return;
        }
        setAudioRoute(num.intValue());
    }

    public boolean A0A() {
        if ((!A03() || getCurrentCallEndpoint() == null) && getCallAudioState() == null) {
            return false;
        }
        return true;
    }

    public boolean A0B() {
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        if (A03()) {
            List<CallEndpoint> list = this.A02;
            if (list == null) {
                return false;
            }
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (CallEndpoint endpointType : list) {
                if (endpointType.getEndpointType() == 2) {
                    return true;
                }
            }
            return false;
        } else if (!AnonymousClass112.A05() || (callAudioState = getCallAudioState()) == null || (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) == null || !(!supportedBluetoothDevices.isEmpty())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A0C() {
        if (A03()) {
            List<CallEndpoint> list = this.A02;
            if (list == null) {
                return false;
            }
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (CallEndpoint endpointType : list) {
                if (endpointType.getEndpointType() == 3) {
                    return true;
                }
            }
            return false;
        }
        CallAudioState callAudioState = getCallAudioState();
        if (callAudioState == null || (callAudioState.getSupportedRouteMask() & 4) == 0) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        int route;
        int i;
        if (A03()) {
            CallEndpoint currentCallEndpoint = getCurrentCallEndpoint();
            if (currentCallEndpoint == null) {
                return false;
            }
            route = currentCallEndpoint.getEndpointType();
            i = 3;
        } else {
            CallAudioState callAudioState = getCallAudioState();
            if (callAudioState == null) {
                return false;
            }
            route = callAudioState.getRoute();
            i = 4;
        }
        if (route == i) {
            return true;
        }
        return false;
    }

    public void onHold() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/SelfManagedConnection/onHold, AudioModeIsVoip: ");
        C17900vP.A0r(A10, getAudioModeIsVoip());
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            A02(r2, AnonymousClass00R.A00, this.A01);
        }
        setOnHold();
    }

    public void onReject(String str) {
        C17900vP.A0f("voip/SelfManagedConnection/onReject ", str, C18070vi.A0K(str));
        onReject();
    }

    public void onStateChanged(int i) {
        C17900vP.A0j("voip/SelfManagedConnection/onStateChanged ", AnonymousClass000.A10(), i);
        super.onStateChanged(i);
    }

    public void onUnhold() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/SelfManagedConnection/onUnhold, AudioModeIsVoip: ");
        C17900vP.A0r(A10, getAudioModeIsVoip());
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            A02(r2, AnonymousClass00R.A01, this.A01);
        }
        setAudioModeIsVoip(true);
        setActive();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelfManagedConnection: ");
        return AnonymousClass000.A0y(this.A01, A10);
    }

    public void onAnswer() {
        onAnswer(0);
    }

    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        AnonymousClass1VN r2 = this.A00;
        if (r2 != null) {
            A02(r2, AnonymousClass00R.A0N, this.A01);
        }
        A08(6);
    }
}
