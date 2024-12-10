package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

/* renamed from: X.Adx  reason: case insensitive filesystem */
public class C21067Adx implements B9T {
    public static final Object A0N = new AnonymousClass75N(0);
    public static final boolean A0O = C108975cc.A1C(Build.VERSION.SDK_INT, 28);
    public int A00;
    public int A01;
    public boolean A02 = false;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final AnonymousClass1KB A0A;
    public final AnonymousClass1HQ A0B;
    public final AnonymousClass9O5 A0C;
    public final AnonymousClass8C8 A0D;
    public final A99 A0E;
    public final AnonymousClass1VR A0F;
    public final AnonymousClass1VM A0G;
    public final C29831cw A0H;
    public final AnonymousClass11C A0I;
    public final C18030ve A0J;
    public final AnonymousClass8CB A0K;
    public final C200710s A0L;
    public final AnonymousClass1DC A0M;

    public C21067Adx(Context context, AnonymousClass1KB r10, AnonymousClass1HQ r11, A99 a99, AnonymousClass1VM r13, C29831cw r14, AnonymousClass11C r15, C18030ve r16, AnonymousClass8CB r17, AnonymousClass1DC r18, AnonymousClass10I r19) {
        AnonymousClass9O5 r0;
        AnonymousClass8lN r2;
        A99 a992 = a99;
        this.A0E = a99;
        this.A0J = r16;
        this.A0A = r10;
        this.A09 = context;
        AnonymousClass1HQ r3 = r11;
        this.A0B = r11;
        AnonymousClass1DC r7 = r18;
        this.A0M = r7;
        this.A0I = r15;
        this.A0H = r14;
        this.A0K = r17;
        AnonymousClass1VM r6 = r13;
        this.A0G = r13;
        this.A0L = C200710s.A00(r19);
        C17900vP.A0Y(this, "voip/audio_route/create ", AnonymousClass000.A10());
        C184259af r22 = new C184259af(r11, this);
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new AnonymousClass8lK(r15);
        } else {
            r0 = new AnonymousClass8lJ(context, r14, r15);
        }
        r0.A00 = r22;
        this.A0C = r0;
        this.A0D = new AnonymousClass8C8(this);
        if (!A0O) {
            r2 = null;
        } else {
            r2 = new AnonymousClass8lN(r3, this, a992, r6, r7);
        }
        this.A0F = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r6.isAudioChat() != false) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r5 = this;
            r4 = 0
            boolean r1 = r6.isBotCall
            r0 = 1
            if (r1 == 0) goto L_0x0007
            return r0
        L_0x0007:
            com.whatsapp.jid.GroupJid r0 = r6.groupJid
            if (r0 != 0) goto L_0x0012
            boolean r0 = r6.isAudioChat()
            r3 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            X.0ve r2 = r5.A0J
            r1 = 8631(0x21b7, float:1.2095E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r6.videoEnabled
            if (r1 == 0) goto L_0x002f
            if (r0 != 0) goto L_0x002d
            boolean r0 = r5.A01()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r4 = 1
        L_0x002e:
            return r4
        L_0x002f:
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r6.callLinkToken
            if (r0 != 0) goto L_0x002d
            boolean r0 = r5.A01()
            if (r0 != 0) goto L_0x002d
            if (r3 == 0) goto L_0x002e
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21067Adx.A0E(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r2 < 3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A01() {
        /*
            r5 = this;
            android.content.Context r0 = r5.A09
            X.1Jq r1 = X.AnonymousClass1IP.A02(r0)
            r4 = 0
            if (r1 == 0) goto L_0x0030
            android.content.Context r0 = X.C23671He.A00(r0)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.screenLayout
            r2 = r0 & 15
            int r1 = r1.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r1 <= r0) goto L_0x0023
            r0 = 3
            r1 = 1
            if (r2 >= r0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            r0 = 2131034122(0x7f05000a, float:1.7678753E38)
            boolean r0 = r3.getBoolean(r0)
            if (r1 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            r4 = 1
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21067Adx.A01():boolean");
    }

    public /* synthetic */ void A03() {
        String str;
        String str2;
        boolean z = true;
        boolean A1S = AnonymousClass000.A1S(this.A00, 4);
        CallInfo BO3 = this.A0B.BO3();
        if (BO3 == null) {
            str = null;
        } else {
            str = BO3.callId;
        }
        C161328Ct A0R = this.A0E.A0R(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/toggleHeadset ");
        if (A1S) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A10.append(str2);
        A10.append(" using telecom: ");
        if (A0R == null) {
            z = false;
        }
        C17900vP.A0r(A10, z);
        if (!A0O || A0R == null) {
            AudioManager A0D2 = this.A0I.A0D();
            if (A0D2 != null && A1S && AnonymousClass112.A08()) {
                try {
                    AudioDeviceInfo A002 = C181229Pq.A00(A0D2);
                    if (A002 != null) {
                        A0D2.setCommunicationDevice(A002);
                        A07(BO3, (Boolean) null);
                        return;
                    }
                    Log.i("voip/audio_route/toggleHeadset no headset connected");
                } catch (Exception e) {
                    Log.e((Throwable) e);
                }
            }
        } else if (A1S && A0R.A0C()) {
            A0R.A07(4);
        }
    }

    public void A04(CallInfo callInfo) {
        if (callInfo != null && callInfo.callState != CallState.NONE) {
            C21431Ajy.A00(this.A0L, this, callInfo, 4);
        }
    }

    public void A07(CallInfo callInfo, Boolean bool) {
        this.A0L.execute(new C21434Ak1(this, callInfo, bool, 18));
    }

    public void A08(CallInfo callInfo, Boolean bool) {
        AudioManager A0D2;
        int i;
        if (bool != null) {
            this.A03 = bool.booleanValue();
        }
        if (callInfo != null && callInfo.callState != CallState.NONE && (A0D2 = this.A0I.A0D()) != null) {
            int i2 = this.A00;
            C161328Ct A0R = this.A0E.A0R(callInfo.callId);
            boolean z = true;
            if (this.A03 || !A0O || A0R == null || !A0R.A0A()) {
                if (A0D2.isBluetoothScoOn()) {
                    i = 3;
                } else if (!A0D2.isSpeakerphoneOn() || this.A04) {
                    i = 2;
                    if (this.A0C.A03()) {
                        i = 4;
                    }
                } else {
                    this.A00 = 1;
                    if (i2 != 1) {
                        this.A08 = false;
                    }
                    z = false;
                }
                this.A00 = i;
                z = false;
            } else {
                Integer A042 = A0R.A04();
                if (A042 != null) {
                    this.A00 = A042.intValue();
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/audio_route/updateAudioRoute: [");
            A10.append(Voip.A06(i2));
            A10.append(" -> ");
            A10.append(Voip.A06(this.A00));
            A10.append("], using telecom: ");
            A10.append(z);
            A10.append(", ");
            StringBuilder A102 = AnonymousClass000.A10();
            if (z) {
                A102.append("CallAudioState: ");
                A102.append(A0R.A05());
            } else {
                A102.append("Bluetooth: [ScoAudioState: ");
                A102.append(AnonymousClass8C8.A00(this.A01));
                A102.append(", ScoOn: ");
                A102.append(A0D2.isBluetoothScoOn());
                A102.append("], Speaker: ");
                A102.append(A0D2.isSpeakerphoneOn());
            }
            AnonymousClass8BS.A1D(A102, A10);
            A10.append(", fallBackToNonTelecomToSyncAudioRoute: ");
            A10.append(this.A03);
            C17900vP.A0Y(this, ", ", A10);
            this.A04 = false;
            this.A0A.A0J(new C21470Akb((Object) this, this.A00, 23, (Object) callInfo));
        }
    }

    public void A09(CallInfo callInfo, boolean z) {
        String str;
        String str2;
        int i;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C161328Ct A0R = this.A0E.A0R(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/changeBluetoothState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A10.append(str2);
        A10.append(" using telecom: ");
        C17900vP.A0r(A10, AnonymousClass000.A1W(A0R));
        if (!A0O || A0R == null) {
            AudioManager A0D2 = this.A0I.A0D();
            if (A0D2 != null) {
                if (z) {
                    try {
                        if (A0D2.isBluetoothScoOn()) {
                            Log.i("voip/audio_route/changeBluetoothState startBluetoothSco when isBluetoothScoOn is true");
                        }
                        A0D2.startBluetoothSco();
                        A0D2.setBluetoothScoOn(true);
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                    }
                } else {
                    A0D2.setBluetoothScoOn(false);
                    A0D2.stopBluetoothSco();
                }
                A07(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        if (z) {
            i = 3;
        } else {
            i = 2;
            if (A0R.A0C()) {
                i = 4;
            }
        }
        A0R.A07(i);
    }

    public void A0A(CallInfo callInfo, boolean z) {
        this.A0L.execute(new AnonymousClass7RF(this, callInfo, 15, z));
    }

    public /* synthetic */ void A0B(CallInfo callInfo, boolean z) {
        String str;
        String str2;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        C161328Ct A0R = this.A0E.A0R(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/changeSpeakerphoneState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A10.append(str2);
        A10.append(" using telecom: ");
        int i = 1;
        C17900vP.A0r(A10, AnonymousClass000.A1W(A0R));
        if (!A0O || A0R == null) {
            AudioManager A0D2 = this.A0I.A0D();
            if (A0D2 != null) {
                A0D2.setSpeakerphoneOn(z);
                A07(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        if (!z) {
            i = 2;
            if (A0R.A0C()) {
                i = 4;
            }
            if (A0R.A04() != null && i == 2 && A0R.A04().intValue() == 2) {
                A07(callInfo, (Boolean) null);
            }
        }
        A0R.A07(i);
    }

    public void A0C(boolean z) {
        AudioManager A0D2 = this.A0I.A0D();
        if (A0D2 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/audio_route/muteOsMicrophone call from: ");
            A10.append(A00());
            A10.append(", mute: ");
            A10.append(z);
            A10.append(", isMicrophoneMute was ");
            C17900vP.A0r(A10, A0D2.isMicrophoneMute());
            A0D2.setMicrophoneMute(z);
        }
    }

    public /* synthetic */ void A0D(boolean z) {
        if (!z) {
            AnonymousClass9O5 r1 = this.A0C;
            r1.A01 = r1.A03();
            r1.A00();
            this.A0K.A02(this);
            Intent A012 = this.A0H.A01(this.A09, this.A0D, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), true);
            if (A012 != null) {
                this.A01 = A012.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
            AudioManager A0D2 = this.A0I.A0D();
            if (A0D2 != null && AnonymousClass112.A08() && C181229Pq.A00(A0D2) != null) {
                this.A05 = true;
                this.A04 = true;
                A07(this.A0B.BO3(), (Boolean) null);
            }
        }
    }

    public boolean A0F(String str) {
        C161328Ct A0R = this.A0E.A0R(str);
        if (A0O && A0R != null && A0R.A0A()) {
            return A0R.A0B();
        }
        AudioManager A0D2 = this.A0I.A0D();
        BluetoothHeadset bluetoothHeadset = this.A0K.A00;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        try {
            if (!defaultAdapter.isEnabled() || A0D2 == null) {
                return false;
            }
            if (AnonymousClass112.A08()) {
                if (!C137466vV.A00(A0D2).isEmpty()) {
                    return true;
                }
                return false;
            } else if (bluetoothHeadset == null) {
                return false;
            } else {
                List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
                C18070vi.A0X(connectedDevices);
                if (AnonymousClass000.A1a(connectedDevices)) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public boolean A0G(String str) {
        C161328Ct A0R = this.A0E.A0R(str);
        if (A0O && A0R != null && A0R.A0A()) {
            return A0R.A0C();
        }
        if (this.A00 == 4) {
            return true;
        }
        if (!this.A05 || !AnonymousClass112.A08()) {
            return false;
        }
        return true;
    }

    private String A00() {
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(C17890vO.A0U(this))) {
                z = true;
            } else if (z) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(stackTraceElement.getClassName());
                A10.append("/");
                return AnonymousClass000.A0y(stackTraceElement.getMethodName(), A10);
            }
        }
        return null;
    }

    public void A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/resetAudioManager ");
        A10.append(this);
        A10.append(", telecom: ");
        C17900vP.A0r(A10, this.A06);
        if (!this.A06) {
            AudioManager A0D2 = this.A0I.A0D();
            if (A0D2 != null) {
                A0D2.setSpeakerphoneOn(false);
            }
            A09((CallInfo) null, false);
        }
        this.A00 = 2;
        AudioManager A0D3 = this.A0I.A0D();
        if (!this.A06 && A0D3 != null) {
            this.A0L.execute(new C21431Ajy(this, A0D3, 5));
        }
    }

    public /* synthetic */ void A05(CallInfo callInfo) {
        boolean A032;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/autoChooseAudioRoute from: ");
        A10.append(A00());
        A10.append(", call state: ");
        C17900vP.A0b(callInfo.callState, A10);
        C161328Ct A0R = this.A0E.A0R(callInfo.callId);
        if (A0F(callInfo.callId)) {
            C21431Ajy.A00(this.A0L, this, callInfo, 6);
            if (A0O && A0R != null && A0R.A0A()) {
                if (C18020vd.A05(C18040vf.A02, this.A0J, 3825)) {
                    A08(callInfo, AnonymousClass000.A0h());
                    return;
                }
            }
            A09(callInfo, true);
            return;
        }
        if (!A0O || A0R == null || !A0R.A0A()) {
            A032 = this.A0C.A03();
        } else {
            A032 = A0R.A0D();
        }
        if (A032) {
            A07(callInfo, (Boolean) null);
        } else {
            A0A(callInfo, A0E(callInfo));
        }
    }

    public void A06(CallInfo callInfo, Boolean bool) {
        A07(callInfo, bool);
        C21431Ajy.A00(this.A0L, this, callInfo, 2);
    }

    public void Bmk(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/audio_route/onBluetoothHeadsetConnectionStateChanged state: ");
        C17890vO.A1A(A10, C196909vq.A00(i));
        if (i != 0) {
            if (i == 2) {
                A04(this.A0B.BO3());
                return;
            } else if (i != 3) {
                return;
            }
        }
        A09(this.A0B.BO3(), false);
    }
}
