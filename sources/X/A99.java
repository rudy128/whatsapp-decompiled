package X;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.calling.crypto.DefaultCryptoCallback;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipantJid;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class A99 {
    public static long A48 = 45000;
    public static String A49;
    public static final ThreadPoolExecutor A4A = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final AtomicInteger A4B = new AtomicInteger();
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08 = -1;
    public long A09 = -1;
    public long A0A;
    public long A0B;
    public long A0C;
    public BroadcastReceiver A0D;
    public BroadcastReceiver A0E;
    public SoundPool A0F;
    public Handler A0G;
    public Handler A0H;
    public Handler A0I;
    public Handler A0J;
    public HandlerThread A0K;
    public PowerManager.WakeLock A0L;
    public PowerManager.WakeLock A0M;
    public PhoneStateListener A0N;
    public Pair A0O;
    public C37241pC A0P;
    public C20075A6b A0Q;
    public C21067Adx A0R;
    public C28597E9o A0S = null;
    public A7S A0T;
    public C58162kF A0U;
    public C19994A2h A0V;
    public OutgoingSignalingHandler A0W;
    public A7v A0X;
    public AnonymousClass9X9 A0Y;
    public C185759d6 A0Z;
    public C185759d6 A0a;
    public C185759d6 A0b;
    public C185759d6 A0c;
    public C185759d6 A0d;
    public VoiceServiceEventCallback A0e;
    public C22558BCr A0f;
    public C195619td A0g;
    public AnonymousClass1VR A0h;
    public C20111A7t A0i;
    public C107215Yv A0j;
    public AnonymousClass4R3 A0k;
    public WamCall A0l;
    public C33691jE A0m;
    public C132116mE A0n;
    public C200710s A0o;
    public C200710s A0p;
    public C200710s A0q;
    public C63282so A0r;
    public Boolean A0s;
    public Integer A0t;
    public Integer A0u;
    public Integer A0v = 1500;
    public Integer A0w;
    public Integer A0x;
    public Integer A0y;
    public Long A0z;
    public Long A10;
    public Long A11;
    public Long A12;
    public Long A13;
    public Object A14;
    public Object A15;
    public Object A16;
    public Runnable A17;
    public String A18 = null;
    public String A19;
    public String A1A;
    public String A1B;
    public Map A1C;
    public Set A1D = C17880vN.A12();
    public ScheduledThreadPoolExecutor A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L = false;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R = false;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h = false;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l = true;
    public boolean A1m;
    public Voip.RecordingInfo[] A1n;
    public C192549oa A1o;
    public Integer A1p;
    public Integer A1q;
    public final Context A1r;
    public final TelephonyManager A1s;
    public final C19880zA A1t;
    public final C19880zA A1u;
    public final C19880zA A1v;
    public final AnonymousClass195 A1w;
    public final AnonymousClass190 A1x;
    public final AnonymousClass2YP A1y;
    public final C51412Ye A1z;
    public final C51422Yf A20;
    public final C218617r A21;
    public final AnonymousClass1KB A22;
    public final AnonymousClass11S A23;
    public final AnonymousClass181 A24;
    public final C23651Hc A25;
    public final C47942Ko A26;
    public final AnonymousClass2PB A27;
    public final C27411Vz A28;
    public final AnonymousClass1HQ A29;
    public final AnonymousClass1VE A2A;
    public final C186599eS A2B;
    public final AnonymousClass1VF A2C;
    public final C175258yP A2D;
    public final AnonymousClass1T9 A2E;
    public final AnonymousClass1VP A2F;
    public final C56752hy A2G;
    public final C1410173y A2H;
    public final C24911Md A2I;
    public final AnonymousClass1V7 A2J;
    public final AnonymousClass1VM A2K;
    public final C21501AlA A2L;
    public final A4u A2M;
    public final A8A A2N;
    public final AnonymousClass71B A2O;
    public final AnonymousClass1VI A2P;
    public final C40961va A2Q;
    public final AnonymousClass1HS A2R;
    public final AnonymousClass11E A2S;
    public final AnonymousClass1M9 A2T;
    public final AnonymousClass1PM A2U;
    public final C24921Me A2V;
    public final C26191Re A2W;
    public final C32951i1 A2X;
    public final AnonymousClass1RW A2Y;
    public final AnonymousClass1R8 A2Z;
    public final C29831cw A2a;
    public final AnonymousClass11C A2b;
    public final AnonymousClass11P A2c;
    public final C27301Vn A2d;
    public final C219217x A2e;
    public final C19830z4 A2f;
    public final C18000vb A2g;
    public final AnonymousClass1P3 A2h;
    public final C70303An A2i;
    public final AnonymousClass1TD A2j;
    public final AnonymousClass121 A2k;
    public final AnonymousClass1TA A2l;
    public final C27081Uq A2m;
    public final C24751Ln A2n;
    public final AnonymousClass1MR A2o;
    public final C18030ve A2p;
    public final C23641Hb A2q;
    public final AnonymousClass126 A2r;
    public final AnonymousClass1D9 A2s;
    public final C217217d A2t;
    public final C26241Rj A2u;
    public final C57322it A2v;
    public final C1602487s A2w;
    public final AnonymousClass1LD A2x;
    public final AnonymousClass1Nb A2y;
    public final C24901Mc A2z;
    public final AnonymousClass1DC A30;
    public final AnonymousClass10I A31;
    public final AnonymousClass1VT A32;
    public final JNIUtils A33;
    public final VoipCameraManager A34;
    public final AnonymousClass00H A35;
    public final AnonymousClass00H A36;
    public final AnonymousClass00H A37;
    public final AnonymousClass00H A38;
    public final AnonymousClass00H A39;
    public final AnonymousClass00H A3A;
    public final AnonymousClass00H A3B = C221618v.A00(C216216s.class);
    public final AnonymousClass00H A3C;
    public final AnonymousClass00H A3D;
    public final AnonymousClass00H A3E;
    public final AnonymousClass00H A3F;
    public final AnonymousClass00H A3G;
    public final AnonymousClass00H A3H;
    public final AnonymousClass00H A3I;
    public final AnonymousClass00H A3J;
    public final AnonymousClass00H A3K;
    public final AnonymousClass00H A3L;
    public final AnonymousClass00H A3M;
    public final AnonymousClass00H A3N;
    public final AnonymousClass00H A3O;
    public final AnonymousClass00H A3P;
    public final AnonymousClass00H A3Q;
    public final AnonymousClass00H A3R;
    public final AnonymousClass00H A3S;
    public final AnonymousClass00H A3T;
    public final AnonymousClass00H A3U = C221618v.A00(ScreenShareResourceManager.class);
    public final AnonymousClass00H A3V;
    public final AnonymousClass00H A3W;
    public final AnonymousClass00H A3X;
    public final AnonymousClass00H A3Y;
    public final AnonymousClass00H A3Z;
    public final Map A3a = C17880vN.A11();
    public final Map A3b = C17880vN.A11();
    public final Map A3c = AnonymousClass8BR.A17();
    public final Map A3d = AnonymousClass8BR.A17();
    public final Map A3e = C17880vN.A11();
    public final Set A3f = C17880vN.A12();
    public final Set A3g = C17880vN.A12();
    public final Set A3h = C17880vN.A12();
    public final Set A3i;
    public final C18140vp A3j;
    public final C18140vp A3k;
    public final boolean A3l;
    public final C190999lr A3m;
    public final AnonymousClass1VK A3n;
    public final AnonymousClass11Q A3o;
    public final C23661Hd A3p;
    public final WhatsAppDynamicExecuTorchLoader A3q;
    public final AnonymousClass1SV A3r;
    public final AnonymousClass1N7 A3s;
    public final WhatsAppDynamicPytorchLoader A3t;
    public final AnonymousClass8CB A3u;
    public final AnonymousClass00H A3v;
    public final AnonymousClass00H A3w;
    public final AnonymousClass00H A3x;
    public final AnonymousClass00H A3y;
    public final AnonymousClass00H A3z;
    public final AnonymousClass00H A40;
    public final AnonymousClass00H A41;
    public final List A42 = AnonymousClass000.A13();
    public volatile int A43 = 0;
    public volatile C194879sR A44;
    public volatile Integer A45;
    public volatile String A46;
    public volatile boolean A47;

    private void A05(C138686xW r16, int i, boolean z, boolean z2) {
        C138686xW r4 = r16;
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        if (C18020vd.A05(C18040vf.A02, this.A2p, 12430)) {
            this.A31.CGS(new C21436Ak3(r4, this, i2, z4, z3), "call_notification_builder");
            return;
        }
        Notification A062 = this.A2H.A06(this.A1r, r4, this.A2J, i2, z4);
        String str = r4.A06;
        C27301Vn r1 = this.A2d;
        if (z) {
            ((AnonymousClass1Vo) r1).BkS(str, 27, A062);
        } else {
            r1.BkR(23, A062);
        }
    }

    public static void A06(A99 a99) {
        a99.A02 = 0;
        a99.A0O = new Pair((Object) null, -1L);
        a99.A1C = new HashMap();
    }

    public static void A0D(A99 a99, CallInfo callInfo, int i) {
        A0E(a99, callInfo, i, false, false, false);
    }

    public synchronized C188749hv A0Q(String str) {
        C188749hv r0;
        Map map = this.A3a;
        r0 = (C188749hv) map.get(str);
        if (r0 == null) {
            r0 = new C188749hv();
            map.put(str, r0);
        }
        return r0;
    }

    public void A0c() {
        this.A1P = true;
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        C17960vV.A07(adx);
        adx.A09(AnonymousClass8BR.A0r(this), true ^ AnonymousClass000.A1T(adx.A00, 3));
    }

    public void A0d() {
        this.A1P = true;
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        C21446AkD.A00(adx.A0L, adx, 41);
    }

    public void A0e() {
        this.A1P = true;
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        C21446AkD.A00(adx.A0L, adx, 43);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r11 == 10) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(int r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            r5 = r10
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r10)
            boolean r0 = X.C40811vJ.A0e(r4)
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "voip/service/acceptCall No active call"
        L_0x000d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0010:
            return
        L_0x0011:
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x0034
            X.0ve r2 = r10.A2p
            r1 = 10402(0x28a2, float:1.4576E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 <= 0) goto L_0x0034
            X.1VP r3 = r10.A2F
            android.content.Context r2 = r10.A1r
            boolean r1 = r4.isAudioChat()
            boolean r0 = r4.isCaller
            boolean r0 = r3.Bff(r2, r1, r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "voip/service/acceptCall No internet connection"
            goto L_0x000d
        L_0x0034:
            r6 = r12
            boolean r8 = X.AnonymousClass8BU.A1U(r4, r12)
            if (r8 == 0) goto L_0x00ba
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x003f:
            boolean r3 = r0.isGroupCall
            if (r3 == 0) goto L_0x0049
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.A06 = r0
        L_0x0049:
            if (r11 == 0) goto L_0x0055
            X.9hv r1 = r10.A0Q(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1.A07 = r0
        L_0x0055:
            if (r8 != 0) goto L_0x0075
            r0 = 1
            r10.A1F = r0
            X.A7v r0 = r10.A0X
            r0.A06()
            X.Adx r2 = r10.A0R
            X.C17960vV.A07(r2)
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0070
            X.C17960vV.A07(r2)
            r0 = 0
            r2.A0A(r4, r0)
        L_0x0070:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r10.A0y(r0, r12)
        L_0x0075:
            r7 = 0
            X.4rc r4 = new X.4rc
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            if (r3 != 0) goto L_0x009f
            X.00H r0 = r10.A3x
            java.lang.Object r3 = r0.get()
            X.6wK r3 = (X.C137976wK) r3
            r0 = 3
            if (r11 == r0) goto L_0x008e
            r0 = 10
            r2 = 0
            if (r11 != r0) goto L_0x008f
        L_0x008e:
            r2 = 1
        L_0x008f:
            r1 = 6
            r0 = 2
            if (r2 != 0) goto L_0x009c
            r0 = 1
            if (r11 == r0) goto L_0x009b
            r0 = 5
            if (r11 == r0) goto L_0x009b
            if (r11 != r1) goto L_0x009f
        L_0x009b:
            r0 = 3
        L_0x009c:
            X.C137976wK.A00(r3, r12, r0, r1)
        L_0x009f:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r10.A1E
            r1 = 100
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.schedule(r4, r1, r0)
            X.0ve r1 = r10.A2p
            java.lang.String r0 = "accept"
            boolean r0 = A0N(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.10I r1 = r10.A31
            r0 = 42
            X.C21452AkJ.A00(r1, r10, r12, r0)
            return
        L_0x00ba:
            r0 = r4
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0o(int, java.lang.String, boolean):void");
    }

    public synchronized void A0v(UserJid userJid, String str) {
        C194879sR r1 = this.A44;
        C217217d r3 = this.A2t;
        r1.A01 = r3.A0O(userJid);
        A0Q(str).A0F = this.A44.A01;
        C18030ve r2 = this.A2p;
        if (C18020vd.A05(C18040vf.A02, r2, 6307) || C18020vd.A05(C18040vf.A01, r2, 9423)) {
            this.A44.A00 = r3.A0N(userJid);
            this.A44.A03 = !((AnonymousClass1Vo) this.A2d).A00.A01();
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/updateDNDAndVoipNotificationChannelState Call Notification State: ");
        C17900vP.A0b(this.A44, A102);
    }

    public void A15(String str, int i, boolean z, boolean z2) {
        AnonymousClass1KB r1;
        int i2;
        C178119Bw A062;
        String str2 = str;
        if (Voip.A03(((AnonymousClass1HR) this.A29).A00) != CallState.NONE) {
            String currentCallId = Voip.getCurrentCallId();
            if (currentCallId != null) {
                A7S a7s = this.A0T;
                if (A7S.A03(a7s.A02.BO3(), currentCallId) && (A062 = a7s.A06(currentCallId)) != null && A062.A0B != null && A062.A0B.A02.equals(str)) {
                    Context context = this.A1r;
                    context.startActivity(AnonymousClass1LU.A1H(context, C108945cZ.A1A(this.A1w.A00), (Boolean) null, true, (Boolean) null, (List) null));
                    return;
                }
            }
            r1 = this.A22;
            i2 = 2131889960;
        } else {
            if (C18020vd.A00(C18040vf.A02, this.A2p, 10402) > 0) {
                if (this.A2F.Bff(this.A1r, false, false)) {
                    return;
                }
            } else if (!this.A2S.A09()) {
                r1 = this.A22;
                i2 = 2131887657;
            }
            C17900vP.A0f("voip/actionPreviewCallLink starting token:", str, AnonymousClass000.A10());
            this.A1E.execute(new C21374Aj3(this, str2, i, 0, z, z2));
            return;
        }
        r1.A08(i2, 0);
    }

    public boolean A1E(GroupJid groupJid, String str, List list, boolean z, boolean z2) {
        List list2 = list;
        if (list.isEmpty()) {
            Log.e("voip/service/addIncomingCallToTelecom peerJids is empty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass1VM r2 = this.A2K;
            if (r2.A0E()) {
                String A052 = AnonymousClass74H.A05(this.A1r, this.A2T, this.A2V, this.A2r, groupJid, this.A2z, list2, z2);
                if (A052 != null) {
                    return r2.A0F((UserJid) list.get(0), str, A052, z);
                }
                Log.w("voip/service/addIncomingCallToTelecom displayName is null");
                return false;
            }
        }
        return false;
    }

    public static int A00(CallInfo callInfo) {
        switch (callInfo.callResult) {
            case 1:
                return AnonymousClass8BU.A01(callInfo.isEndedByMe ? 1 : 0);
            case 2:
                return 6;
            case 3:
            case 7:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                return 8;
            case 4:
            case 8:
            case 9:
                return 5;
            case 5:
                if (callInfo.isCaller) {
                    return 7;
                }
                return 5;
            case 6:
            case 10:
            case 14:
            case 19:
                return 1;
            case 18:
                return 4;
            default:
                return 9;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r1 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r5.A23.A0O(r6.getCreatorJid()) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C19880zA A01(X.A99 r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            X.A7S r2 = r5.A0T
            java.lang.String r1 = r6.callId
            X.1HQ r0 = r2.A02
            com.whatsapp.voipcalling.CallInfo r0 = r0.BO3()
            boolean r0 = X.A7S.A03(r0, r1)
            if (r0 == 0) goto L_0x0016
            X.9Bw r1 = r2.A06(r1)
            if (r1 != 0) goto L_0x0058
        L_0x0016:
            java.lang.String r0 = r6.callId
            boolean r0 = X.A7S.A03(r6, r0)
            if (r0 == 0) goto L_0x0055
            boolean r0 = r6.isCaller
            if (r0 != 0) goto L_0x002f
            X.11S r1 = r5.A23
            com.whatsapp.jid.UserJid r0 = r6.getCreatorJid()
            boolean r0 = r1.A0O(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0030
        L_0x002f:
            r4 = 1
        L_0x0030:
            com.whatsapp.jid.UserJid r0 = r6.getInitialPeerJid()
            X.C17960vV.A07(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService:callStateChangedOnUiThread getCallLog with key[jid="
            X.AnonymousClass8BY.A1D(r6, r0, r1, r4)
            java.lang.String r0 = "]"
            X.C17890vO.A1A(r1, r0)
            X.A7S r3 = r5.A0T
            com.whatsapp.jid.UserJid r2 = r6.getInitialPeerJid()
            java.lang.String r1 = r6.callId
            int r0 = r6.initialGroupTransactionId
            X.9Bw r1 = r3.A05(r2, r1, r0, r4)
            if (r1 != 0) goto L_0x0058
        L_0x0055:
            X.0zB r0 = X.C19890zB.A00
            return r0
        L_0x0058:
            X.1Ha r0 = new X.1Ha
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A01(X.A99, com.whatsapp.voipcalling.CallInfo):X.0zA");
    }

    private void A02() {
        AnonymousClass3MW.A0c(this.A3J).A01(AnonymousClass12O.class);
    }

    private void A03() {
        this.A1o = new C192549oa(this.A28);
        C51412Ye r0 = this.A1z;
        boolean z = this.A3l;
        AnonymousClass10E r02 = r0.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r02);
        AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r02);
        AnonymousClass11S A172 = AnonymousClass10E.A17(r02);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r02);
        AnonymousClass1DC A132 = AnonymousClass3MZ.A13(r02);
        C190529l6 r8 = new C190529l6(AnonymousClass10E.A17(r02), (C41911xI) r02.AAl.get(), AnonymousClass10E.AL1(r02));
        AnonymousClass1VE r14 = (AnonymousClass1VE) r02.ABT.get();
        AnonymousClass1TD r21 = (AnonymousClass1TD) r02.A1m.get();
        AnonymousClass1TA r22 = (AnonymousClass1TA) r02.A5X.get();
        C138426x3 r19 = (C138426x3) r02.AB4.get();
        C27301Vn r20 = (C27301Vn) r02.A9A.get();
        C190529l6 r17 = r8;
        this.A0T = new A7S(A0N2, A172, (AnonymousClass1HQ) r02.A99.get(), r14, (C56752hy) r02.A1g.get(), this, r17, (C21501AlA) r02.A1V.get(), r19, r20, r21, r22, (AnonymousClass1MW) r02.A7u.get(), (C27081Uq) r02.A9g.get(), A8r, A132, AL1, z);
        C51422Yf r03 = this.A20;
        AnonymousClass9j1 r13 = new AnonymousClass9j1(this);
        AnonymousClass10E r04 = r03.A00.A00;
        C18030ve A8r2 = AnonymousClass10E.A8r(r04);
        AnonymousClass18K A0g2 = AnonymousClass3Ma.A0g(r04);
        C58662l3 r18 = (C58662l3) r04.A4N.get();
        C48022Kw r192 = (C48022Kw) r04.A0c.get();
        C25591Ou r15 = (C25591Ou) r04.A54.get();
        C20111A7t a7t = new C20111A7t(r15, (AnonymousClass120) r04.A6z.get(), r13, r18, r192, (AnonymousClass1P3) r04.A9y.get(), (C25581Ot) r04.A9z.get(), (C25571Os) r04.AA0.get(), (C30781eV) r04.A37.get(), (C51952a7) r04.A38.get(), (AnonymousClass2LS) r04.ABC.get(), (AnonymousClass1U5) r04.A3L.get(), A8r2, A0g2, (C34711kx) r04.A7c.get());
        this.A0i = a7t;
        AnonymousClass11P r28 = this.A2c;
        C18030ve r12 = this.A2p;
        AnonymousClass1HQ r6 = this.A29;
        C190999lr r82 = this.A3m;
        AnonymousClass1N7 r7 = this.A3s;
        AnonymousClass00H r4 = this.A3X;
        AnonymousClass1VK r3 = this.A3n;
        AnonymousClass1KB r5 = this.A22;
        this.A0V = new C19994A2h(r5, r6, r82, this, this.A2L, a7t, r3, r28, r12, r7, r4);
        AnonymousClass11S r32 = this.A23;
        AnonymousClass10I r11 = this.A31;
        this.A0W = new OutgoingSignalingHandler(r28, r12, r32, r11, this, r82, a7t, this.A3o, r6);
        Context context = this.A1r;
        AnonymousClass1DC r10 = this.A30;
        AnonymousClass11C r9 = this.A2b;
        this.A0R = new C21067Adx(context, r5, r6, this, this.A2K, this.A2a, r9, r12, this.A3u, r10, r11);
        this.A0e = new VoiceServiceEventCallback(this, this.A2O, this.A3I, this.A3r, this.A3E, this.A3t, this.A3q, this.A40);
        C24901Mc r152 = this.A2z;
        A7S a7s = this.A0T;
        C26241Rj r83 = this.A2u;
        AnonymousClass126 r72 = this.A2r;
        C23651Hc r62 = this.A25;
        C32951i1 r52 = this.A2X;
        C57322it r42 = this.A2v;
        A4u a4u = this.A2M;
        C32951i1 r212 = r52;
        AnonymousClass11P r222 = r28;
        AnonymousClass11E r202 = this.A2S;
        C23651Hc r16 = r62;
        A7S a7s2 = a7s;
        A4u a4u2 = a4u;
        this.A0U = new C58162kF(r16, a7s2, this, a4u2, r202, r212, r222, r12, r72, r83, r42, r152);
        this.A0X = new A7v(context, this, r9, r28, r12, this.A2y, r10, r11);
    }

    public static void A07(A99 a99) {
        C22558BCr bCr;
        Log.i("voip/ear-far");
        C17960vV.A02();
        a99.A1J = false;
        CallInfo A0r2 = AnonymousClass8BR.A0r(a99);
        if (A0r2 != null && A0r2.isEitherSideRequestingUpgrade()) {
            C22558BCr bCr2 = a99.A0f;
            if (bCr2 != null) {
                bCr2.CRo(A0r2);
            }
            C21067Adx adx = a99.A0R;
            C17960vV.A07(adx);
            adx.A06(A0r2, (Boolean) null);
        }
        if (a99.A0M == null && (bCr = a99.A0f) != null) {
            bCr.C2A(false);
        }
    }

    public static void A08(A99 a99) {
        C22558BCr bCr;
        Log.i("voip/ear-near");
        C17960vV.A02();
        a99.A1J = true;
        CallInfo A0r2 = AnonymousClass8BR.A0r(a99);
        if (a99.A1k || (A0r2 != null && A0r2.isEitherSideRequestingUpgrade())) {
            C21067Adx adx = a99.A0R;
            C17960vV.A07(adx);
            boolean z = true;
            if (adx.A00 != 1) {
                z = false;
            }
            if (z) {
                C17960vV.A07(adx);
                adx.A0A(A0r2, false);
            }
            a99.A1k = false;
        }
        if (a99.A0M == null && (bCr = a99.A0f) != null) {
            bCr.C2A(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0255, code lost:
        if (r34 != false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x031b, code lost:
        if (r5.A1b != false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0367, code lost:
        if (r4.callResult == 5) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r4.callWaitingInfo.A01 != 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r5.A2z.A06(X.C72463Mc.A0g(r7)) == false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.A99 r28, X.AnonymousClass1BI r29, com.whatsapp.voipcalling.CallInfo r30, X.C178119Bw r31, com.whatsapp.voipcalling.CallState r32, com.whatsapp.voipcalling.CallState r33, boolean r34) {
        /*
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r6 = 0
            r5 = r28
            r4 = r30
            r3 = r31
            r2 = r32
            r1 = r33
            if (r1 != r0) goto L_0x050a
            if (r31 == 0) goto L_0x0506
            int r0 = r3.A08
            r21 = r0
        L_0x0015:
            r5.A1V = r6
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0l
            if (r0 == 0) goto L_0x04e2
            com.whatsapp.jid.UserJid r20 = r4.getInitialPeerJid()
            X.C17960vV.A07(r20)
            boolean r0 = r4.isCaller
            if (r0 != 0) goto L_0x0039
            boolean r0 = r4.isEndedByMe
            if (r0 != 0) goto L_0x002e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x0039
        L_0x002e:
            if (r34 == 0) goto L_0x0039
            if (r31 == 0) goto L_0x0039
            X.2gu r0 = r4.callWaitingInfo
            int r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r10 = 0
            if (r0 == 0) goto L_0x005d
            X.1M9 r1 = r5.A2T
            r0 = r20
            X.1E7 r7 = r1.A0E(r0)
            if (r7 == 0) goto L_0x005d
            X.2lf r0 = r7.A0H
            if (r0 != 0) goto L_0x005d
            boolean r0 = r5.A1T
            if (r0 != 0) goto L_0x005d
            X.1Mc r1 = r5.A2z
            X.1BI r0 = X.C72463Mc.A0g(r7)
            boolean r0 = r1.A06(r0)
            r19 = 1
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r19 = 0
        L_0x005f:
            java.lang.String r18 = " "
            X.2gu r0 = r4.callWaitingInfo
            int r1 = r0.A01
            r15 = 0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x00aa
            if (r1 != 0) goto L_0x00aa
            if (r34 == 0) goto L_0x00aa
            X.0ve r9 = r5.A2p
            r0 = 3780(0xec4, float:5.297E-42)
            java.lang.String r13 = r9.A0I(r0)
            boolean r0 = X.C24605CBj.A00(r13)
            if (r0 != 0) goto L_0x00aa
            X.11P r0 = r5.A2c
            long r11 = X.AnonymousClass11P.A01(r0)
            X.1VE r0 = r5.A2A
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r0 = "last_app_update_dialog_timestamp"
            long r7 = X.C17890vO.A05(r1, r0)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00a9
            long r11 = r11 - r7
            r1 = 3781(0xec5, float:5.298E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r9, r1)
            r0 = 1
            int r0 = java.lang.Math.max(r1, r0)
            long r0 = (long) r0
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r7
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00aa
        L_0x00a9:
            r15 = r13
        L_0x00aa:
            boolean r0 = r5.A1W
            if (r0 != 0) goto L_0x04de
            X.2gu r0 = r4.callWaitingInfo
            int r7 = r0.A01
            java.lang.Integer r1 = r5.A45
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x04de
            if (r7 != 0) goto L_0x04de
            if (r34 == 0) goto L_0x04de
            if (r1 == 0) goto L_0x04de
            int r9 = r1.intValue()
            r0 = -1
            if (r9 == r0) goto L_0x04de
            X.11P r0 = r5.A2c
            long r11 = X.AnonymousClass11P.A01(r0)
            X.1VE r0 = r5.A2A
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r0 = "last_call_rating_timestamp"
            long r7 = X.C17890vO.A05(r1, r0)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00e4
            long r11 = r11 - r7
            long r7 = X.C17890vO.A03(r9)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x04de
        L_0x00e4:
            r17 = 1
        L_0x00e6:
            X.00H r8 = r5.A36
            r8.get()
            java.lang.String r1 = X.C108985cd.A0f()
            java.lang.String r0 = X.C108985cd.A0f()
            X.9qJ r7 = new X.9qJ
            r7.<init>(r1, r0)
            X.2gu r0 = r4.callWaitingInfo
            int r1 = r0.A01
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 != r0) goto L_0x04da
            if (r1 != 0) goto L_0x04da
            if (r34 == 0) goto L_0x04da
            java.lang.Object r14 = r8.get()
            X.9fQ r14 = (X.C187199fQ) r14
            r16 = 0
            if (r31 == 0) goto L_0x04da
            X.0ve r13 = r14.A03
            r0 = 9830(0x2666, float:1.3775E-41)
            java.lang.String r1 = X.C108955ca.A0v(r13, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0124
            org.json.JSONObject r0 = X.C17880vN.A15()
            java.lang.String r1 = X.C18070vi.A0H(r0)
        L_0x0124:
            org.json.JSONObject r1 = X.C17880vN.A16(r1)
            java.lang.String r0 = "enabled"
            boolean r0 = r1.optBoolean(r0)
            if (r0 == 0) goto L_0x04da
            X.4cT r0 = r3.A04
            com.whatsapp.jid.UserJid r12 = r0.A01
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x04da
            int r0 = r3.A08
            if (r0 <= 0) goto L_0x04da
            boolean r1 = r3.A0O()
            X.1PM r0 = r14.A01
            if (r1 != 0) goto L_0x04da
            boolean r0 = r0.A04(r12)
            if (r0 == 0) goto L_0x04da
            X.8rB r0 = new X.8rB
            r0.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r0.A02 = r11
            java.lang.Integer r9 = X.C17880vN.A0i()
            r0.A01 = r9
            java.lang.String r1 = r7.A00
            r0.A05 = r1
            java.lang.String r8 = "call_survey"
            r0.A04 = r8
            X.18K r1 = r14.A04
            r1.CC7(r0)
            X.8rJ r0 = new X.8rJ
            r0.<init>()
            r0.A02 = r11
            r0.A01 = r9
            java.lang.String r9 = r12.user
            java.lang.Long r9 = X.C108965cb.A0m(r9)
            r0.A03 = r9
            java.lang.String r9 = r7.A01
            r0.A04 = r9
            r0.A06 = r8
            r1.CC7(r0)
            r0 = 9830(0x2666, float:1.3775E-41)
            java.lang.String r1 = X.C108955ca.A0v(r13, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0196
            org.json.JSONObject r0 = X.C17880vN.A15()
            java.lang.String r1 = X.C18070vi.A0H(r0)
        L_0x0196:
            org.json.JSONObject r8 = X.C17880vN.A16(r1)
            java.lang.String r1 = "interval_days"
            r0 = 7
            int r1 = r8.optInt(r1, r0)
            X.9aG r0 = r14.A00
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r9 = X.C17880vN.A0C(r0)
            org.json.JSONObject r0 = X.C17880vN.A15()
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "survey_info"
            java.lang.String r0 = r9.getString(r0, r8)
            org.json.JSONObject r8 = X.C17880vN.A16(r0)
            java.lang.String r0 = "last_impression_timestamp"
            long r8 = r8.optLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            if (r0 != 0) goto L_0x01c9
            r8 = 0
        L_0x01c9:
            X.11P r0 = r14.A02
            long r11 = X.AnonymousClass11P.A01(r0)
            long r11 = r11 - r8
            r8 = 0
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d8
            r11 = 0
        L_0x01d8:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            long r0 = (long) r1
            long r8 = r8.toMillis(r0)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e5
            r16 = 1
        L_0x01e5:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x01ed
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 != r0) goto L_0x0215
        L_0x01ed:
            double r8 = r5.A01
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 != 0) goto L_0x0215
            double r0 = r5.A00
            boolean r11 = java.lang.Double.isNaN(r0)
            if (r11 != 0) goto L_0x0215
            com.whatsapp.fieldstats.events.WamCall r11 = r5.A0l
            double r0 = r0 - r8
            java.lang.Double r8 = java.lang.Double.valueOf(r0)
            r11.callBatteryChangePct = r8
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r5.A01 = r0
            r5.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService callStateChangedOnUIThread to NONE setting battery fieldstat: "
            X.C17900vP.A0Y(r8, r0, r1)
        L_0x0215:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x021d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 != r0) goto L_0x022f
        L_0x021d:
            java.lang.String r0 = r4.callId
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x022f
            X.0ve r1 = r5.A2p
            X.00H r0 = r5.A41
            r0.get()
            X.C40811vJ.A0B(r1)
        L_0x022f:
            if (r31 == 0) goto L_0x03c0
            X.00H r0 = r5.A3v
            java.lang.Object r11 = r0.get()
            X.2pW r11 = (X.C61342pW) r11
            X.4cT r9 = r3.A04
            com.whatsapp.jid.UserJid r8 = r9.A01
            int r0 = r3.A08
            long r0 = (long) r0
            boolean r9 = r9.A03
            boolean r27 = r3.A0O()
            r22 = r11
            r23 = r8
            r24 = r0
            r26 = r9
            boolean r0 = X.C61342pW.A00(r22, r23, r24, r26, r27)
            if (r0 == 0) goto L_0x0257
            r12 = 1
            if (r34 == 0) goto L_0x0258
        L_0x0257:
            r12 = 0
        L_0x0258:
            X.0ve r11 = r5.A2p
            r1 = 8712(0x2208, float:1.2208E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r1)
            if (r0 == 0) goto L_0x029c
            boolean r0 = r5.A1K
            if (r0 != 0) goto L_0x029c
            int r0 = r3.A08
            if (r0 <= 0) goto L_0x029c
            if (r9 != 0) goto L_0x029c
            boolean r1 = r3.A0O()
            X.1PM r0 = r5.A2U
            if (r1 != 0) goto L_0x029c
            boolean r0 = r0.A04(r8)
            if (r0 == 0) goto L_0x029c
            X.00H r0 = r5.A3w
            java.lang.Object r9 = r0.get()
            X.A2A r9 = (X.A2A) r9
            java.lang.Integer r26 = X.AnonymousClass00R.A00
            X.10I r1 = r9.A05
            r27 = 4
            X.Ak4 r0 = new X.Ak4
            r22 = r0
            r23 = r9
            r24 = r8
            r25 = r10
            r28 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r1.CGF(r0)
        L_0x029c:
            if (r12 == 0) goto L_0x03c0
            X.10I r6 = r5.A31
            r0 = 25
            X.Ak1 r1 = new X.Ak1
            r7 = r29
            r1.<init>(r5, r3, r7, r0)
        L_0x02a9:
            r6.CGF(r1)
        L_0x02ac:
            r7 = 1
        L_0x02ad:
            java.util.Map r1 = r5.A3a
            java.lang.String r0 = r4.callId
            r1.remove(r0)
            X.1i1 r1 = r5.A2X
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0l
            java.lang.Integer r0 = r0.callResult
            r1.A0G(r3, r0)
            X.1VF r6 = r5.A2C
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0l
            java.lang.Integer r0 = r0.callResult
            if (r0 == 0) goto L_0x02d2
            int r1 = r0.intValue()
            r0 = 22
            if (r1 != r0) goto L_0x02d2
            X.1VH r0 = X.AnonymousClass1VH.DESKTOP_CALL
            r6.A00(r0)
        L_0x02d2:
            if (r7 == 0) goto L_0x0302
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "callStateChangedOnUIThread to NONE. callOfferElapsedTimeInMillisOnServer: "
            r1.append(r0)
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0l
            java.lang.Long r0 = r0.callOfferElapsedT
            X.C17900vP.A0b(r0, r1)
            X.A4u r6 = r5.A2M
            com.whatsapp.fieldstats.events.WamCall r1 = r5.A0l
            boolean r0 = r5.A1l
            r6.A02(r1, r0)
            java.lang.String r0 = r5.A46
            if (r0 == 0) goto L_0x0302
            X.A8A r8 = r5.A2N
            java.lang.String r7 = r5.A46
            com.whatsapp.fieldstats.events.WamCall r6 = r5.A0l
            X.0ve r1 = r5.A2p
            r0 = 11081(0x2b49, float:1.5528E-41)
            java.lang.Boolean r0 = X.AnonymousClass3MZ.A15(r1, r0)
            r8.A07(r6, r0, r7)
        L_0x0302:
            X.0ve r6 = r5.A2p
            r1 = 8775(0x2247, float:1.2296E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x03bc
            X.BCr r0 = r5.A0f
            if (r0 == 0) goto L_0x031d
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 == 0) goto L_0x031d
            boolean r0 = r5.A1b
            r8 = 1
            if (r0 == 0) goto L_0x031e
        L_0x031d:
            r8 = 0
        L_0x031e:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r2 == r0) goto L_0x03ae
            r5.A0I(r2, r4)
        L_0x0325:
            if (r31 == 0) goto L_0x0399
            X.1VT r1 = r5.A32
            java.lang.String r0 = "voip/notifyCallEnded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 31
            X.C17890vO.A0s(r1, r3, r0)
            X.19r r6 = r1.A00
            java.lang.String r1 = "Calling"
            java.lang.String r0 = "End"
            r6.A02(r1, r0)
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x036d
            boolean r0 = r4.isJoinableGroupCall
            if (r0 != 0) goto L_0x036d
            boolean r0 = r4.isAudioChat()
            int r7 = X.AnonymousClass8BU.A00(r0)
            int r1 = r3.A07
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x0358
            r7 = 3
        L_0x0358:
            X.A7S r6 = r5.A0T
            com.whatsapp.jid.GroupJid r1 = r4.groupJid
            java.lang.String r0 = r4.scheduledId
            r6.A08(r1, r3, r0, r7)
            if (r8 == 0) goto L_0x0369
            int r6 = r4.callResult
            r1 = 5
            r0 = 1
            if (r6 != r1) goto L_0x036a
        L_0x0369:
            r0 = 0
        L_0x036a:
            r5.A0H(r3, r0)
        L_0x036d:
            X.2gu r0 = r4.callWaitingInfo
            int r0 = r0.A01
            boolean r0 = X.C108975cc.A1B(r0)
            r5.A1m = r0
            boolean r0 = r4.isJoinableGroupCall
            if (r0 == 0) goto L_0x0398
            boolean r0 = r4.isCaller
            if (r0 != 0) goto L_0x0398
            int r1 = r4.callResult
            r0 = 4
            if (r1 != r0) goto L_0x0398
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x0398
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 == r0) goto L_0x0398
            boolean r1 = r5.A1a
            r0 = -1
            X.6xW r2 = X.C138686xW.A00(r4, r0, r1)
            r1 = 1
            r0 = 2
            r5.A05(r2, r0, r1, r1)
        L_0x0398:
            return
        L_0x0399:
            boolean r0 = r4.isBCall
            if (r0 != 0) goto L_0x036d
            boolean r0 = r4.isBotCall
            if (r0 == 0) goto L_0x036d
            X.1VT r1 = r5.A32
            java.lang.String r0 = "voip/notifyBotCallEnded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 43
            X.C20735AWq.A00(r1, r0)
            goto L_0x036d
        L_0x03ae:
            boolean r0 = r5.A1i
            r1 = r0 ^ 1
            java.lang.String r0 = "web relay calls should not start fg activity"
            X.C17960vV.A0F(r1, r0)
            r5.A0V()
            goto L_0x0325
        L_0x03bc:
            boolean r8 = r5.A1i
            goto L_0x031e
        L_0x03c0:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            if (r19 == 0) goto L_0x044d
            r1 = -1
            r0 = r21
            if (r0 == r1) goto L_0x044a
            long r0 = X.C17890vO.A03(r21)
        L_0x03cd:
            X.6qE r6 = r4.getDefaultPeerInfo()
            if (r6 == 0) goto L_0x043c
            X.6qE r6 = r4.getDefaultPeerInfo()
            boolean r6 = r6.A0F
            if (r6 == 0) goto L_0x043c
            java.lang.String r12 = "peer-interrupted"
        L_0x03dd:
            android.content.Context r11 = r5.A1r
            java.lang.String r14 = r4.callId
            boolean r13 = r4.isEndedByMe
            boolean r7 = r4.videoEnabled
            boolean r6 = r4.isGroupCallCreatedOnServer
            if (r6 == 0) goto L_0x03ed
            com.whatsapp.jid.UserJid r10 = r4.getCreatorJid()
        L_0x03ed:
            android.content.Intent r9 = X.C17880vN.A0A()
            java.lang.String r15 = r11.getPackageName()
            java.lang.String r6 = "com.whatsapp.calling.spam.CallSpamActivity"
            r9.setClassName(r15, r6)
            java.lang.String r15 = "caller_jid"
            r6 = r20
            X.AnonymousClass3MY.A12(r9, r6, r15)
            java.lang.String r6 = "call_id"
            r9.putExtra(r6, r14)
            java.lang.String r6 = "call_duration"
            r9.putExtra(r6, r0)
            java.lang.String r6 = "call_terminator"
            r9.putExtra(r6, r13)
            java.lang.String r6 = "call_termination_reason"
            r9.putExtra(r6, r12)
            java.lang.String r6 = "call_video"
            r9.putExtra(r6, r7)
            if (r10 == 0) goto L_0x0421
            java.lang.String r6 = "call_creator_jid"
            X.AnonymousClass3MY.A12(r9, r10, r6)
        L_0x0421:
            r9.setFlags(r8)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r6 = "voiceservice starting call spam activity "
            r7.append(r6)
            r6 = r20
            r7.append(r6)
            r6 = r18
            X.C17900vP.A0m(r6, r7, r0)
            r11.startActivity(r9)
            goto L_0x02ac
        L_0x043c:
            X.6qE r6 = r4.self
            if (r6 == 0) goto L_0x0447
            boolean r6 = r6.A0F
            if (r6 == 0) goto L_0x0447
            java.lang.String r12 = "self-interrupted"
            goto L_0x03dd
        L_0x0447:
            java.lang.String r12 = "unknown"
            goto L_0x03dd
        L_0x044a:
            r0 = -1
            goto L_0x03cd
        L_0x044d:
            if (r31 == 0) goto L_0x045c
            if (r16 == 0) goto L_0x045c
            X.10I r6 = r5.A31
            r0 = 27
            X.Ak1 r1 = new X.Ak1
            r1.<init>(r5, r3, r7, r0)
            goto L_0x02a9
        L_0x045c:
            if (r17 == 0) goto L_0x04a0
            android.content.Context r11 = r5.A1r
            com.whatsapp.fieldstats.events.WamCall r0 = r5.A0l
            android.os.Bundle r10 = X.A4u.A00(r0)
            boolean r9 = r5.A1l
            java.lang.String r7 = r5.A46
            android.content.Intent r6 = X.C17880vN.A0A()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.callrating.CallRatingActivity"
            r6.setClassName(r1, r0)
            java.lang.String r0 = "event"
            r6.putExtra(r0, r10)
            java.lang.String r0 = "uploadFieldStat"
            r6.putExtra(r0, r9)
            java.lang.String r0 = "timeSeriesDir"
            r6.putExtra(r0, r7)
            r6.setFlags(r8)
            r11.startActivity(r6)
            X.1VE r6 = r5.A2A
            X.11P r0 = r5.A2c
            long r0 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r7 = X.AnonymousClass3MZ.A08(r6)
            java.lang.String r6 = "last_call_rating_timestamp"
            X.C17880vN.A1D(r7, r6, r0)
            r7 = 0
            goto L_0x02ad
        L_0x04a0:
            boolean r0 = X.C24605CBj.A00(r15)
            if (r0 != 0) goto L_0x02ac
            android.content.Context r9 = r5.A1r
            X.C18070vi.A0d(r9, r6)
            java.lang.String r7 = "feature"
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            android.content.Intent r6 = X.C17880vN.A0A()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipAppUpdateActivity"
            r6.setClassName(r1, r0)
            r6.putExtra(r7, r15)
            r6.setFlags(r8)
            r9.startActivity(r6)
            X.1VE r6 = r5.A2A
            X.11P r0 = r5.A2c
            long r0 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r7 = X.AnonymousClass3MZ.A08(r6)
            java.lang.String r6 = "last_app_update_dialog_timestamp"
            X.C17880vN.A1D(r7, r6, r0)
            goto L_0x02ac
        L_0x04da:
            r16 = 0
            goto L_0x01e5
        L_0x04de:
            r17 = 0
            goto L_0x00e6
        L_0x04e2:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x0302
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r2 == r0) goto L_0x0302
            int r1 = r4.callResult
            r0 = 7
            if (r1 == r0) goto L_0x0302
            boolean r0 = r4.isBCall
            if (r0 != 0) goto L_0x0302
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 == r0) goto L_0x04fb
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r2 != r0) goto L_0x04ff
        L_0x04fb:
            boolean r0 = r5.A47
            if (r0 != 0) goto L_0x0302
        L_0x04ff:
            java.lang.String r0 = "callFieldStat can not be null when call state changed to NONE."
            X.C17960vV.A0F(r6, r0)
            goto L_0x0302
        L_0x0506:
            r21 = -1
            goto L_0x0015
        L_0x050a:
            if (r2 == r0) goto L_0x0510
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r2 != r0) goto L_0x0398
        L_0x0510:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x0398
            X.8yP r1 = r5.A2D
            java.lang.String r0 = r4.callId
            r1.A0D(r0)
            if (r31 == 0) goto L_0x0533
            X.1VT r4 = r5.A32
            java.lang.String r0 = "voip/notifyCallStarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19r r2 = r4.A00
            java.lang.String r1 = "Calling"
            java.lang.String r0 = "Resume"
            r2.A02(r1, r0)
            r0 = 30
            X.C17890vO.A0s(r4, r3, r0)
            return
        L_0x0533:
            boolean r0 = r5.A47
            if (r0 != 0) goto L_0x0398
            boolean r0 = r4.isBotCall
            if (r0 != 0) goto L_0x0398
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "can not find message for call id "
            r1.append(r0)
            java.lang.String r0 = r4.callId
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17960vV.A0F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0A(X.A99, X.1BI, com.whatsapp.voipcalling.CallInfo, X.9Bw, com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallState, boolean):void");
    }

    public static void A0B(A99 a99, DeviceJid deviceJid, boolean z) {
        if (a99.A0W != null || !A0M(a99.A2p)) {
            a99.A0W.maybeSendPendingOffer(deviceJid, Voip.getCurrentCallId());
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a99.A1E;
            if (scheduledThreadPoolExecutor != null) {
                try {
                    scheduledThreadPoolExecutor.execute(new AnonymousClass7RK(20, (Object) deviceJid, z));
                } catch (RejectedExecutionException unused) {
                    Log.w("voip/handleDeviceBecomesInvalid: executor shutdown");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A1J != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.A99 r4, com.whatsapp.voipcalling.CallInfo r5) {
        /*
            boolean r0 = r4.A1I
            r3 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r4.A1J
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            r4.A1I = r2
            X.Adx r0 = r4.A0R
            X.C17960vV.A07(r0)
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0027
            boolean r0 = X.C40811vJ.A0e(r5)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r5.videoEnabled
            if (r0 != 0) goto L_0x0027
            boolean r0 = X.C39761tb.A09()
            if (r0 == 0) goto L_0x0040
        L_0x0027:
            r3 = 0
        L_0x0028:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r4.A1k
            if (r0 != 0) goto L_0x0038
            if (r3 != 0) goto L_0x0038
            A09(r4)
        L_0x0037:
            return
        L_0x0038:
            X.C17960vV.A02()
            android.os.PowerManager$WakeLock r0 = r4.A0M
            if (r0 != 0) goto L_0x0037
            goto L_0x0055
        L_0x0040:
            if (r2 != 0) goto L_0x0027
            boolean r0 = r5.isCaller
            if (r0 != 0) goto L_0x004e
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0B(r0)
            if (r0 != 0) goto L_0x0027
        L_0x004e:
            boolean r0 = r5.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0055:
            r2 = 32
            X.11C r0 = r4.A2b     // Catch:{ Exception -> 0x007c }
            android.os.PowerManager r1 = r0.A0G()     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x0065
            java.lang.String r0 = "voip/service/acquireProximityWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x007c }
            goto L_0x0083
        L_0x0065:
            android.os.PowerManager$WakeLock r0 = r4.A0M     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "VoiceService Proximity"
            android.os.PowerManager$WakeLock r0 = X.C181789Rv.A00(r1, r0, r2)     // Catch:{ Exception -> 0x007c }
            r4.A0M = r0     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x0083
            r0.acquire()     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = "voip/service/acquireProximityWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            r4.A0M = r0
        L_0x0083:
            X.0ve r2 = r4.A2p
            X.0vf r1 = X.C18040vf.A01
            r0 = 6747(0x1a5b, float:9.455E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00a9
            X.10s r2 = r4.A0q
            if (r2 != 0) goto L_0x009b
            X.10I r0 = r4.A31
            X.10s r2 = X.C200710s.A00(r0)
            r4.A0q = r2
        L_0x009b:
            r2.A03()
            r1 = 45
            X.7Pb r0 = new X.7Pb
            r0.<init>(r4, r1)
            r2.execute(r0)
            return
        L_0x00a9:
            X.4R3 r1 = r4.A0k
            X.5Yv r0 = r4.A0j
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0C(X.A99, com.whatsapp.voipcalling.CallInfo):void");
    }

    public static void A0G(A99 a99, CallInfo callInfo, String str, int i) {
        String A0y2;
        Context context;
        int i2;
        C22558BCr bCr;
        C19880zA r1 = a99.A1v;
        if (r1.A07()) {
            C37251pD r2 = (C37251pD) r1.A03();
            if (r2.A01.A00.A09(AnonymousClass18O.A0G)) {
                C37231pB.A00(new AVB(i), r2.A02);
            }
        }
        if (callInfo == null && (callInfo = C40811vJ.A04(a99.A29)) == null) {
            A0y2 = "voip/call/end without call info";
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C17960vV.A02();
            if (i == 25 || i == 24) {
                str = null;
            } else {
                if (!TextUtils.isEmpty(str) || !callInfo.isCaller || callInfo.callState != CallState.CALLING || a99.A1G || SystemClock.elapsedRealtime() - a99.A05 <= 10000) {
                    if (TextUtils.isEmpty(str) && i == 30) {
                        int i3 = (callInfo.callDuration > 0 ? 1 : (callInfo.callDuration == 0 ? 0 : -1));
                        context = a99.A1r;
                        i2 = 2131898120;
                        if (i3 > 0) {
                            i2 = 2131898110;
                        }
                    }
                    if (!(str == null || (bCr = a99.A0f) == null)) {
                        ((VoipActivityV2) bCr).A20 = str;
                        a99.A45 = -1;
                    }
                } else {
                    context = a99.A1r;
                    i2 = 2131898115;
                }
                str = context.getString(i2);
                ((VoipActivityV2) bCr).A20 = str;
                a99.A45 = -1;
            }
            a99.A43 = i;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("voip/call/end without text=");
            A102.append(str);
            A102.append(", reason code=");
            C17900vP.A0o(A102, a99.A43);
            C20111A7t a7t = a99.A0i;
            C17960vV.A07(a7t);
            Future future = a7t.A0I;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a99.A1E;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.execute(new AnonymousClass7RP(a99, i, 33));
            }
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("voip/call/end elapsed ");
            A103.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            A0y2 = AnonymousClass000.A0y(" ms", A103);
        }
        Log.i(A0y2);
    }

    private boolean A0J() {
        C18030ve r2 = this.A2p;
        if (!AnonymousClass112.A0A() || !C18020vd.A05(C18040vf.A02, r2, 9808)) {
            return false;
        }
        this.A0H.removeMessages(63);
        Log.i("voip/service/delaySetAudioRoute");
        Handler handler = this.A0H;
        handler.sendMessageDelayed(Message.obtain(handler, 63), 1000);
        return true;
    }

    public static boolean A0L(A99 a99) {
        CallState A032 = Voip.A03(((AnonymousClass1HR) a99.A29).A00);
        if (A032 == null || A032 == CallState.NONE) {
            return true;
        }
        return false;
    }

    public static boolean A0N(C18030ve r4, String str) {
        String A0I2 = r4.A0I(11682);
        String A0I3 = r4.A0I(11679);
        String[] split = A0I3.split(",");
        if (A0I2.isEmpty() || A0I3.isEmpty() || Arrays.binarySearch(split, str) < 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass8lO A0P() {
        return new AnonymousClass8lO(this, this.A2p);
    }

    public C161328Ct A0R(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return this.A2K.A04(str);
    }

    public void A0U() {
        Object obj;
        Pair pair = this.A0O;
        long A052 = C17880vN.A05(pair.second);
        long j = 0;
        if (A052 > 0 && (obj = pair.first) != null) {
            long A042 = AnonymousClass8BR.A04(A052);
            if (this.A1C.containsKey(obj)) {
                j = C17880vN.A05(this.A1C.get(this.A0O.first));
            }
            AnonymousClass8BT.A1O(this.A0O.first, this.A1C, j + A042);
        }
        this.A0O = C108945cZ.A0N((Object) null, C108955ca.A0m());
    }

    public void A0V() {
        C18030ve r2 = this.A2p;
        if ((C18020vd.A00(C18040vf.A01, r2, 11758) & 1) == 0 || C40811vJ.A0Y(r2)) {
            this.A0J.removeMessages(0);
            this.A0J.sendEmptyMessageDelayed(0, 15000);
            return;
        }
        Log.i("VoiceService/delayStopSelf ignore for singleton voice service");
    }

    public void A0W() {
        Log.i("voip/call/join call link");
        if (AnonymousClass000.A1R(C18020vd.A00(C18040vf.A02, this.A2p, 10402))) {
            if (this.A2F.Bff(this.A1r, false, false)) {
                return;
            }
        } else if (!this.A2S.A09()) {
            this.A22.A06(2131887657, 0);
            return;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A1E;
        AnonymousClass1HQ r2 = this.A29;
        r2.getClass();
        scheduledThreadPoolExecutor.execute(new C146427Pb(r2, 38));
    }

    public void A0Z() {
        long j = this.A09;
        if (j != -1) {
            this.A0C += AnonymousClass8BR.A04(j);
            this.A09 = -1;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0a() {
        Object obj = this.A14;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A14 = null;
        Object obj2 = this.A15;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A15 = null;
        Object obj3 = this.A16;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A16 = null;
    }

    public void A0f() {
        this.A1E.execute(new C21422Ajp(6));
    }

    public void A0g() {
        this.A1E.execute(new C21422Ajp(5));
    }

    public void A0h() {
        Point A012;
        C23661Hd r0 = this.A3p;
        Context context = this.A1r;
        C18070vi.A0d(context, 0);
        C19830z4 r02 = r0.A01;
        Point A0X2 = r02.A0X(0);
        Point A0Y2 = r02.A0Y(0);
        int i = A0X2.x;
        int i2 = A0X2.y;
        int i3 = (i + A0Y2.x) / 2;
        int i4 = (i2 + A0Y2.y) / 2;
        if (i3 == 0 || i4 == 0) {
            A012 = AnonymousClass1IP.A01(context);
            if (A012 == null) {
                Log.e("voip/service/updateVoipScreenSize point is null, Voip.screenSize is not set");
                return;
            }
        } else {
            A012 = new Point(i3, i4);
        }
        Voip.setScreenSize(A012.x, A012.y);
    }

    public void A0i(int i) {
        this.A1E.execute(new C21354Aij(i, 1));
    }

    public void A0k(int i) {
        this.A1E.execute(new C21354Aij(i, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 != null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.intValue() == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        X.C17960vV.A0F(r1, "Bug in loading call lobby entry point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(int r3) {
        /*
            r2 = this;
            java.lang.Integer r0 = r2.A0x
            if (r0 != 0) goto L_0x000c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A0x = r0
            if (r0 == 0) goto L_0x0013
        L_0x000c:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.C17960vV.A0F(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0l(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r18v3, types: [X.AjM] */
    /* JADX WARNING: type inference failed for: r8v9, types: [X.DTB] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c8, code lost:
        switch(r2) {
            case 2: goto L_0x04ea;
            case 3: goto L_0x04db;
            case 4: goto L_0x04c8;
            case 5: goto L_0x04b0;
            case 6: goto L_0x0491;
            case 7: goto L_0x0478;
            case 8: goto L_0x0469;
            case 9: goto L_0x03bf;
            case 10: goto L_0x0328;
            case 11: goto L_0x031d;
            case 12: goto L_0x0304;
            case 13: goto L_0x02df;
            case 14: goto L_0x02c6;
            case 15: goto L_0x0295;
            case 16: goto L_0x023d;
            case 17: goto L_0x022d;
            case 18: goto L_0x0215;
            case 19: goto L_0x020a;
            case 20: goto L_0x01ec;
            case 21: goto L_0x01dc;
            default: goto L_0x01cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cb, code lost:
        A0G(r0, (com.whatsapp.voipcalling.CallInfo) null, r4.getString("end_call_string"), r4.getInt("end_call_reason"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01dc, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r5 = r2.obj;
        X.C17960vV.A07(r5);
        r4 = r0.A1E;
        r3 = 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ec, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r2 = (com.whatsapp.voipcalling.CallLinkInfo) r2.obj;
        r5 = r2.token;
        r4 = r2.videoEnabled;
        r2 = r2.eventStartTimeSec;
        r7 = r0.A1E;
        r8 = new X.DTB(r0, r5, 2, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020a, code lost:
        r4 = r0.A31;
        r3 = new X.C21431Ajy(r0, r13, 39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0215, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021c, code lost:
        if (r2.arg1 == 1) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021f, code lost:
        r0.A1E.execute(new X.AnonymousClass7RK(18, (java.lang.Object) r0, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022d, code lost:
        A4B.getAndIncrement();
        r5 = r13.A01;
        X.C17960vV.A07(r5);
        r4 = r0.A1E;
        r3 = 41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023d, code lost:
        r5 = ((X.AnonymousClass1HR) r0.A29).A00;
        r4 = com.whatsapp.voipcalling.Voip.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0249, code lost:
        if (r0.A1h == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024d, code lost:
        if (r4 == com.whatsapp.voipcalling.CallState.NONE) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0251, code lost:
        if (r4 == com.whatsapp.voipcalling.CallState.PRECALLING) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0253, code lost:
        r6 = r0.A1r;
        r6.startActivity(X.AnonymousClass1LU.A1H(r6, X.C108945cZ.A1A(r0.A1w.A00), (java.lang.Boolean) null, true, (java.lang.Boolean) null, (java.util.List) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026d, code lost:
        if (r0.A1h != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0275, code lost:
        if (com.whatsapp.voipcalling.Voip.A03(r5) != com.whatsapp.voipcalling.CallState.LINK) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0277, code lost:
        r2 = com.whatsapp.voipcalling.Voip.getCallLinkInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027b, code lost:
        if (r2 == null) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027d, code lost:
        r4 = r2.linkState;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027f, code lost:
        if (r4 == 1) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0282, code lost:
        if (r4 != 2) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0284, code lost:
        r0.A0H.removeMessages(50);
        X.AnonymousClass8BT.A17(r0.A0H, 50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0290, code lost:
        r0.A1h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0295, code lost:
        r2 = X.AnonymousClass8BR.A0r(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029a, code lost:
        if (r2 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029c, code lost:
        r5 = r2.groupJid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x029e, code lost:
        if (r5 != null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a0, code lost:
        r5 = r2.getCreatorJid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a4, code lost:
        if (r5 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a6, code lost:
        r0.A2X.A0C(r5, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ac, code lost:
        A0m(0, r4.getInt("call_ui_action", 0), r4.getString("call_id"), (java.lang.String) null);
        r0.A2d.BEJ(7, "VoiceService2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c6, code lost:
        A0E(r0, X.AnonymousClass8BR.A0r(r0), r4.getInt("notification_type", 2), false, false, r4.getBoolean("is_media_projection"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02df, code lost:
        r4 = r13.A01;
        X.C17960vV.A07(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e6, code lost:
        if (r4.arg1 == 1) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e8, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e9, code lost:
        r0.A1E.execute(new X.DTY(r0, 1, X.C17880vN.A05(r4.obj), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02fd, code lost:
        r0.A3G.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0304, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r5 = r2.obj;
        X.C17960vV.A07(r5);
        A15((java.lang.String) r5, r2.arg2, X.AnonymousClass000.A1T(r2.arg1, 1), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031d, code lost:
        r4 = r0.A1E;
        r2 = new X.C21431Ajy(r0, r13, 42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0328, code lost:
        r7 = r13.A02;
        X.C17960vV.A07(r7);
        r7 = (X.C62172qu) r7;
        r5 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0335, code lost:
        if (r5 <= 0) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0337, code lost:
        r0.A11 = java.lang.Long.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x033d, code lost:
        r9 = r7.A09;
        X.C17960vV.A07(r9);
        r2 = r7.A0A;
        X.C17960vV.A07(r2);
        r24 = r2.intValue();
        r8 = r7.A06;
        r5 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x035b, code lost:
        if (com.whatsapp.voipcalling.Voip.A03(((X.AnonymousClass1HR) r0.A29).A00) == com.whatsapp.voipcalling.CallState.NONE) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x035d, code lost:
        com.whatsapp.util.Log.e("voip/actionStartFromCallLog can't start, a call is already ongoing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0364, code lost:
        r4 = X.C40811vJ.A09(r9.A04.A02);
        X.C17900vP.A0f("voip/actionStartFromCallLog starting callId:", r4, X.AnonymousClass000.A10());
        r21 = r9.A0B();
        r6 = X.C17880vN.A12();
        r10 = r21.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0385, code lost:
        if (r10.hasNext() == false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0387, code lost:
        r7 = (X.C178109Bv) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0390, code lost:
        if (r7.A01 != 5) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0392, code lost:
        r3 = r7.A00;
        r2 = com.whatsapp.jid.DeviceJid.Companion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0396, code lost:
        if (r3 == null) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0398, code lost:
        r2 = r3.getPrimaryDevice();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x039c, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03a2, code lost:
        A16(r6);
        r7 = r0.A1E;
        r18 = new X.C21393AjM(r0, r9, r21, r4, r5, r24, 0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ba, code lost:
        r7.execute(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03bf, code lost:
        r10 = r13.A02;
        X.C17960vV.A07(r10);
        r10 = (X.C195209sy) r10;
        r0.A0u = r10.A02;
        ((X.C140076zu) r0.A3X.get()).A02(X.AnonymousClass00R.A01);
        r2 = r10.A01;
        r26 = 0;
        r9 = new com.whatsapp.voipcalling.CallParticipantJid[]{r2};
        r2 = r2.userJid;
        r6 = r10.A03;
        A0u((com.whatsapp.jid.GroupJid) null, r2, r6, true, false, false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fa, code lost:
        if (r0.A1i == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03fc, code lost:
        r3 = r10.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03fe, code lost:
        if (r3 == null) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0400, code lost:
        r2 = r3.size();
        r8 = new java.lang.String[r2];
        r4 = new java.lang.String[r2];
        r11 = X.AnonymousClass000.A15(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0410, code lost:
        if (r11.hasNext() == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0412, code lost:
        r3 = X.AnonymousClass000.A16(r11);
        r8[r26] = r3.getKey();
        r4[r26] = r3.getValue();
        r26 = r26 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0425, code lost:
        r8 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0427, code lost:
        r4 = com.whatsapp.voipcalling.Voip.startCall(r6, r9, false, (com.whatsapp.jid.GroupJid) null, false, (java.lang.String) null, false, false, (java.lang.String) null, 0, false, true, false, true, r8, r4, r10.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x044b, code lost:
        if (r4 == 0) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x044d, code lost:
        X.C17900vP.A0f("voip/actionStartNewOutgoingBotCall failed to start call ", r6, X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0459, code lost:
        if (r4 == 670001) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x045b, code lost:
        A0I(com.whatsapp.voipcalling.CallState.NONE, (com.whatsapp.voipcalling.CallInfo) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0462, code lost:
        r0.A24.A08(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0469, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r5 = r2.obj;
        X.C17960vV.A07(r5);
        r4 = r0.A1E;
        r3 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0478, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r6 = r2.obj;
        X.C17960vV.A07(r6);
        r6 = (java.lang.String) r6;
        r5 = r2.arg2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0489, code lost:
        if (r2.arg1 == 1) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x048b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x048c, code lost:
        A15(r6, r5, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0491, code lost:
        r2 = X.C40811vJ.A0M(r0.A2b);
        r0.A1S = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0499, code lost:
        if (r2 != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x049b, code lost:
        com.whatsapp.util.Log.i("voip/service/cmd/ACTION_REFRESH_APP_BACKGROUND_RESTRICTIONS background restrictions no longer enabled, start FgService");
        A0D(r0, X.AnonymousClass8BR.A0r(r0), r4.getInt("notification_type", 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04b0, code lost:
        r2 = r13.A01;
        X.C17960vV.A07(r2);
        r5 = r2.obj;
        X.C17960vV.A07(r5);
        r4 = r0.A1E;
        r3 = 43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04be, code lost:
        r2 = new X.C21431Ajy(r0, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c3, code lost:
        r4.execute(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d0, code lost:
        if (r0.A2J.A06.get() != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04d2, code lost:
        A0D(r0, X.AnonymousClass8BR.A0r(r0), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04db, code lost:
        r3 = r4.getString("call_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04e1, code lost:
        if (r3 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04e3, code lost:
        r0.A2d.BES(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04ea, code lost:
        r2 = X.C181259Pt.A00(r0.A29, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04f0, code lost:
        if (r2 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04f2, code lost:
        r0.A2D.A0D(r2.callId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0550, code lost:
        r4.CGN(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x055e, code lost:
        if (r1.equals("handle_bcall_command") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        r5 = X.AnonymousClass000.A10();
        r5.append("voip/service/cmd/");
        r5.append(r1);
        r5.append(" elapsed ");
        r5.append(android.os.SystemClock.elapsedRealtime() - r16);
        X.C17890vO.A1A(r5, " ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        if (A0L(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (r1.equals("cancel_scheduled_call_reminder") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r1.equals("edit_call_link_for_event") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        if (r1.equals("show_vc_lobby") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        if (r1.equals("create_call_link") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r1.equals("receive_message") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014b, code lost:
        if (r1.equals("show_voip_activity") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0154, code lost:
        if (r1.equals("reject_call") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015d, code lost:
        if (r1.equals("refresh_notification") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0166, code lost:
        if (r1.equals("create_call_link_for_event") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016e, code lost:
        if (r1.equals("skip_lobby_join_call_link") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r1.equals("handle_push_payload") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017e, code lost:
        if (r1.equals("start_from_call_log") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0186, code lost:
        if (r1.equals("start_bot_call") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018e, code lost:
        if (r1.equals("set_scheduled_call_reminder") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0196, code lost:
        if (r1.equals("preview_call_link") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a0, code lost:
        if (r1.equals("refresh_app_background_restrictions") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a8, code lost:
        if (r1.equals("check_ongoing_calls") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b2, code lost:
        if (r1.equals("start_foreground_service_from_push") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ba, code lost:
        if (r1.equals("reject_group_reminder") == false) goto L_0x00e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0r(X.A69 r36) {
        /*
            r35 = this;
            r13 = r36
            java.lang.String r1 = r13.A03
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/cmd command="
            X.C17900vP.A0Y(r13, r0, r2)
            r0 = r35
            boolean r3 = r0.A1i
            java.lang.String r24 = "cancel_scheduled_call_reminder"
            java.lang.String r23 = "edit_call_link_for_event"
            java.lang.String r22 = "show_vc_lobby"
            java.lang.String r21 = "create_call_link"
            java.lang.String r20 = "refresh_notification"
            java.lang.String r19 = "create_call_link_for_event"
            java.lang.String r15 = "skip_lobby_join_call_link"
            java.lang.String r14 = "handle_push_payload"
            java.lang.String r12 = "start_from_call_log"
            java.lang.String r11 = "start_bot_call"
            java.lang.String r10 = "set_scheduled_call_reminder"
            java.lang.String r9 = "preview_call_link"
            java.lang.String r8 = "check_ongoing_calls"
            java.lang.String r7 = "reject_group_reminder"
            java.lang.String r6 = "start_call"
            java.lang.String r5 = "handle_bcall_command"
            java.lang.String r2 = "receive_message"
            if (r3 != 0) goto L_0x00bd
            X.1HQ r3 = r0.A29
            boolean r3 = r3.BeE()
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r7.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r6.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r12.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r11.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r14.equals(r1)
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = "hangup_call"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r8.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r21
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r19
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r23
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r9.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r15.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r5.equals(r1)
            if (r3 != 0) goto L_0x00bd
            boolean r3 = r10.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r24
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r20
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            r3 = r22
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x00bd
            java.lang.String r0 = "voip/service/cmd/not-started"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00bc:
            return
        L_0x00bd:
            boolean r3 = r0.A1j
            if (r3 == 0) goto L_0x00cc
            java.lang.String r1 = "voip/service/cmd VoiceService is stopping, restart the service with the same command later."
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.util.List r0 = r0.A42
            r0.add(r13)
            return
        L_0x00cc:
            android.os.Bundle r4 = r13.A00
            if (r4 != 0) goto L_0x00d4
            android.os.Bundle r4 = X.C17880vN.A0D()
        L_0x00d4:
            long r16 = android.os.SystemClock.elapsedRealtime()
            int r18 = r1.hashCode()
            r3 = 1
            switch(r18) {
                case -2108450315: goto L_0x055a;
                case -1573659621: goto L_0x04fb;
                case -1304798842: goto L_0x01be;
                case -1257880878: goto L_0x01b6;
                case -1233448890: goto L_0x01ac;
                case -1026884326: goto L_0x01a4;
                case -976156138: goto L_0x019a;
                case -921141884: goto L_0x0192;
                case -889332668: goto L_0x018a;
                case -130648813: goto L_0x0182;
                case 76499387: goto L_0x017a;
                case 383498784: goto L_0x0172;
                case 604322479: goto L_0x016a;
                case 814441949: goto L_0x0160;
                case 1281366991: goto L_0x0157;
                case 1331833598: goto L_0x014e;
                case 1377948940: goto L_0x0145;
                case 1444513451: goto L_0x013e;
                case 1591822776: goto L_0x0135;
                case 1724857030: goto L_0x012c;
                case 1875517419: goto L_0x0123;
                case 2017953372: goto L_0x011a;
                case 2138982608: goto L_0x010e;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            java.lang.String r2 = "voip/service/cmd/unknown-action"
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x00e5:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r16
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "voip/service/cmd/"
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " elapsed "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = " ms"
            X.C17890vO.A1A(r5, r1)
            boolean r1 = A0L(r0)
            if (r1 == 0) goto L_0x00bc
            r0.A0V()
            return
        L_0x010e:
            java.lang.String r2 = "hangup_call"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00e0
            r2 = 22
            goto L_0x01c7
        L_0x011a:
            r2 = r24
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x01dc
            goto L_0x00e0
        L_0x0123:
            r2 = r23
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x01ec
            goto L_0x00e0
        L_0x012c:
            r2 = r22
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x020a
            goto L_0x00e0
        L_0x0135:
            r2 = r21
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0215
            goto L_0x00e0
        L_0x013e:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x022d
            goto L_0x00e0
        L_0x0145:
            java.lang.String r2 = "show_voip_activity"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x023d
            goto L_0x00e0
        L_0x014e:
            java.lang.String r2 = "reject_call"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0295
            goto L_0x00e0
        L_0x0157:
            r2 = r20
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x02c6
            goto L_0x00e0
        L_0x0160:
            r2 = r19
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x02df
            goto L_0x00e0
        L_0x016a:
            boolean r2 = r1.equals(r15)
            if (r2 != 0) goto L_0x0304
            goto L_0x00e0
        L_0x0172:
            boolean r2 = r1.equals(r14)
            if (r2 != 0) goto L_0x031d
            goto L_0x00e0
        L_0x017a:
            boolean r2 = r1.equals(r12)
            if (r2 != 0) goto L_0x0328
            goto L_0x00e0
        L_0x0182:
            boolean r2 = r1.equals(r11)
            if (r2 != 0) goto L_0x03bf
            goto L_0x00e0
        L_0x018a:
            boolean r2 = r1.equals(r10)
            if (r2 != 0) goto L_0x0469
            goto L_0x00e0
        L_0x0192:
            boolean r2 = r1.equals(r9)
            if (r2 != 0) goto L_0x0478
            goto L_0x00e0
        L_0x019a:
            java.lang.String r2 = "refresh_app_background_restrictions"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0491
            goto L_0x00e0
        L_0x01a4:
            boolean r2 = r1.equals(r8)
            if (r2 != 0) goto L_0x04b0
            goto L_0x00e0
        L_0x01ac:
            java.lang.String r2 = "start_foreground_service_from_push"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x04c8
            goto L_0x00e0
        L_0x01b6:
            boolean r2 = r1.equals(r7)
            if (r2 != 0) goto L_0x04db
            goto L_0x00e0
        L_0x01be:
            java.lang.String r2 = "backgrounded_while_pending_call"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00e0
            r2 = 2
        L_0x01c7:
            r5 = 0
            switch(r2) {
                case 2: goto L_0x04ea;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c8;
                case 5: goto L_0x04b0;
                case 6: goto L_0x0491;
                case 7: goto L_0x0478;
                case 8: goto L_0x0469;
                case 9: goto L_0x03bf;
                case 10: goto L_0x0328;
                case 11: goto L_0x031d;
                case 12: goto L_0x0304;
                case 13: goto L_0x02df;
                case 14: goto L_0x02c6;
                case 15: goto L_0x0295;
                case 16: goto L_0x023d;
                case 17: goto L_0x022d;
                case 18: goto L_0x0215;
                case 19: goto L_0x020a;
                case 20: goto L_0x01ec;
                case 21: goto L_0x01dc;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            java.lang.String r2 = "end_call_string"
            java.lang.String r3 = r4.getString(r2)
            java.lang.String r2 = "end_call_reason"
            int r2 = r4.getInt(r2)
            A0G(r0, r5, r3, r2)
            goto L_0x00e5
        L_0x01dc:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r5 = r2.obj
            X.C17960vV.A07(r5)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r3 = 46
            goto L_0x04be
        L_0x01ec:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r2 = r2.obj
            com.whatsapp.voipcalling.CallLinkInfo r2 = (com.whatsapp.voipcalling.CallLinkInfo) r2
            java.lang.String r5 = r2.token
            boolean r4 = r2.videoEnabled
            long r2 = r2.eventStartTimeSec
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r0.A1E
            r11 = 2
            X.DTB r6 = new X.DTB
            r8 = r6
            r9 = r0
            r10 = r5
            r12 = r2
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r14)
            goto L_0x03ba
        L_0x020a:
            X.10I r4 = r0.A31
            r2 = 39
            X.Ajy r3 = new X.Ajy
            r3.<init>(r0, r13, r2)
            goto L_0x0550
        L_0x0215:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            int r2 = r2.arg1
            if (r2 == r3) goto L_0x021f
            r3 = 0
        L_0x021f:
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r0.A1E
            r4 = 18
            X.7RK r2 = new X.7RK
            r2.<init>((int) r4, (java.lang.Object) r0, (boolean) r3)
            r5.execute(r2)
            goto L_0x02fd
        L_0x022d:
            java.util.concurrent.atomic.AtomicInteger r2 = A4B
            r2.getAndIncrement()
            android.os.Message r5 = r13.A01
            X.C17960vV.A07(r5)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r3 = 41
            goto L_0x04be
        L_0x023d:
            X.1HQ r2 = r0.A29
            X.1HR r2 = (X.AnonymousClass1HR) r2
            X.0ve r5 = r2.A00
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.Voip.A03(r5)
            boolean r2 = r0.A1h
            if (r2 == 0) goto L_0x026b
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r4 == r2) goto L_0x026b
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r4 == r2) goto L_0x026b
            android.content.Context r6 = r0.A1r
            X.195 r2 = r0.A1w
            boolean r2 = r2.A00
            java.lang.Boolean r7 = X.C108945cZ.A1A(r2)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r8 = 0
            r11 = r8
            r10 = r8
            android.content.Intent r2 = X.AnonymousClass1LU.A1H(r6, r7, r8, r9, r10, r11)
            r6.startActivity(r2)
        L_0x026b:
            boolean r2 = r0.A1h
            if (r2 != 0) goto L_0x0290
            com.whatsapp.voipcalling.CallState r4 = com.whatsapp.voipcalling.Voip.A03(r5)
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.LINK
            if (r4 != r2) goto L_0x0290
            com.whatsapp.voipcalling.CallLinkInfo r2 = com.whatsapp.voipcalling.Voip.getCallLinkInfo()
            if (r2 == 0) goto L_0x0290
            int r4 = r2.linkState
            if (r4 == r3) goto L_0x0284
            r2 = 2
            if (r4 != r2) goto L_0x0290
        L_0x0284:
            android.os.Handler r2 = r0.A0H
            r3 = 50
            r2.removeMessages(r3)
            android.os.Handler r2 = r0.A0H
            X.AnonymousClass8BT.A17(r2, r3)
        L_0x0290:
            r2 = 0
            r0.A1h = r2
            goto L_0x00e5
        L_0x0295:
            r7 = 7
            com.whatsapp.voipcalling.CallInfo r2 = X.AnonymousClass8BR.A0r(r0)
            if (r2 == 0) goto L_0x02ac
            com.whatsapp.jid.GroupJid r5 = r2.groupJid
            if (r5 != 0) goto L_0x02a6
            com.whatsapp.jid.UserJid r5 = r2.getCreatorJid()
            if (r5 == 0) goto L_0x02ac
        L_0x02a6:
            X.1i1 r3 = r0.A2X
            r2 = 6
            r3.A0C(r5, r2)
        L_0x02ac:
            java.lang.String r2 = "call_id"
            java.lang.String r6 = r4.getString(r2)
            java.lang.String r2 = "call_ui_action"
            r5 = 0
            int r3 = r4.getInt(r2, r5)
            r2 = 0
            r0.A0m(r5, r3, r6, r2)
            X.1Vn r3 = r0.A2d
            java.lang.String r2 = "VoiceService2"
            r3.BEJ(r7, r2)
            goto L_0x00e5
        L_0x02c6:
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r0)
            java.lang.String r3 = "notification_type"
            r2 = 2
            int r6 = r4.getInt(r3, r2)
            java.lang.String r2 = "is_media_projection"
            boolean r9 = r4.getBoolean(r2)
            r7 = 0
            r4 = r0
            r8 = r7
            A0E(r4, r5, r6, r7, r8, r9)
            goto L_0x00e5
        L_0x02df:
            android.os.Message r4 = r13.A01
            X.C17960vV.A07(r4)
            int r2 = r4.arg1
            if (r2 == r3) goto L_0x02e9
            r3 = 0
        L_0x02e9:
            java.lang.Object r2 = r4.obj
            long r8 = X.C17880vN.A05(r2)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r7 = 1
            X.DTY r2 = new X.DTY
            r5 = r2
            r6 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r10)
            r4.execute(r2)
        L_0x02fd:
            X.00H r2 = r0.A3G
            r2.get()
            goto L_0x00e5
        L_0x0304:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r5 = r2.obj
            X.C17960vV.A07(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r2.arg2
            int r2 = r2.arg1
            boolean r2 = X.AnonymousClass000.A1T(r2, r3)
            r0.A15(r5, r4, r2, r3)
            goto L_0x00e5
        L_0x031d:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r3 = 42
            X.Ajy r2 = new X.Ajy
            r2.<init>(r0, r13, r3)
            goto L_0x04c3
        L_0x0328:
            java.lang.Object r7 = r13.A02
            X.C17960vV.A07(r7)
            X.2qu r7 = (X.C62172qu) r7
            long r5 = r7.A01
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x033d
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.A11 = r2
        L_0x033d:
            X.9Bw r9 = r7.A09
            X.C17960vV.A07(r9)
            java.lang.Integer r2 = r7.A0A
            X.C17960vV.A07(r2)
            int r24 = r2.intValue()
            boolean r8 = r7.A06
            java.lang.String r5 = r7.A02
            X.1HQ r2 = r0.A29
            X.1HR r2 = (X.AnonymousClass1HR) r2
            X.0ve r2 = r2.A00
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.Voip.A03(r2)
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r2) goto L_0x0364
            java.lang.String r2 = "voip/actionStartFromCallLog can't start, a call is already ongoing"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x00e5
        L_0x0364:
            X.4cT r2 = r9.A04
            java.lang.String r2 = r2.A02
            java.lang.String r4 = X.C40811vJ.A09(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "voip/actionStartFromCallLog starting callId:"
            X.C17900vP.A0f(r2, r4, r3)
            java.util.ArrayList r21 = r9.A0B()
            java.util.HashSet r6 = X.C17880vN.A12()
            java.util.Iterator r10 = r21.iterator()
        L_0x0381:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x03a2
            java.lang.Object r7 = r10.next()
            X.9Bv r7 = (X.C178109Bv) r7
            int r3 = r7.A01
            r2 = 5
            if (r3 != r2) goto L_0x0381
            com.whatsapp.jid.UserJid r3 = r7.A00
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            if (r3 == 0) goto L_0x03a0
            com.whatsapp.jid.DeviceJid r2 = r3.getPrimaryDevice()
        L_0x039c:
            r6.add(r2)
            goto L_0x0381
        L_0x03a0:
            r2 = 0
            goto L_0x039c
        L_0x03a2:
            r0.A16(r6)
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r0.A1E
            r25 = 0
            X.AjM r6 = new X.AjM
            r18 = r6
            r19 = r0
            r20 = r9
            r22 = r4
            r23 = r5
            r26 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x03ba:
            r7.execute(r6)
            goto L_0x00e5
        L_0x03bf:
            java.lang.Object r10 = r13.A02
            X.C17960vV.A07(r10)
            X.9sy r10 = (X.C195209sy) r10
            java.lang.Integer r2 = r10.A02
            r0.A0u = r2
            X.00H r2 = r0.A3X
            java.lang.Object r3 = r2.get()
            X.6zu r3 = (X.C140076zu) r3
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r3.A02(r2)
            r7 = 1
            com.whatsapp.voipcalling.CallParticipantJid[] r9 = new com.whatsapp.voipcalling.CallParticipantJid[r7]
            com.whatsapp.voipcalling.CallParticipantJid r2 = r10.A01
            r26 = 0
            r9[r26] = r2
            com.whatsapp.jid.UserJid r2 = r2.userJid
            java.lang.String r6 = r10.A03
            r5 = 0
            r20 = 0
            r28 = r7
            r21 = r0
            r22 = r5
            r23 = r2
            r24 = r6
            r25 = r7
            r27 = r26
            r21.A0u(r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r0.A1i
            if (r2 == 0) goto L_0x00e5
            java.util.Map r3 = r10.A04
            if (r3 == 0) goto L_0x0425
            int r2 = r3.size()
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.String[] r4 = new java.lang.String[r2]
            java.util.Iterator r11 = X.AnonymousClass000.A15(r3)
        L_0x040c:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0427
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r11)
            java.lang.Object r2 = r3.getKey()
            r8[r26] = r2
            java.lang.Object r2 = r3.getValue()
            r4[r26] = r2
            int r26 = r26 + 1
            goto L_0x040c
        L_0x0425:
            r8 = r5
            r4 = r5
        L_0x0427:
            com.whatsapp.jid.UserJid r2 = r10.A00
            r23 = r5
            r24 = r20
            r25 = r20
            r26 = r5
            r28 = r20
            r30 = r20
            r31 = r7
            r18 = r6
            r19 = r9
            r21 = r5
            r22 = r20
            r29 = r7
            r32 = r8
            r33 = r4
            r34 = r2
            int r4 = com.whatsapp.voipcalling.Voip.startCall(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r4 == 0) goto L_0x0462
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "voip/actionStartNewOutgoingBotCall failed to start call "
            X.C17900vP.A0f(r2, r6, r3)
            r2 = 670001(0xa3931, float:9.38871E-40)
            if (r4 == r2) goto L_0x00e5
            com.whatsapp.voipcalling.CallState r2 = com.whatsapp.voipcalling.CallState.NONE
            r0.A0I(r2, r5)
            goto L_0x00e5
        L_0x0462:
            X.181 r2 = r0.A24
            r2.A08(r7)
            goto L_0x00e5
        L_0x0469:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r5 = r2.obj
            X.C17960vV.A07(r5)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r3 = 45
            goto L_0x04be
        L_0x0478:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r6 = r2.obj
            X.C17960vV.A07(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r2.arg2
            int r4 = r2.arg1
            r2 = 0
            if (r4 == r3) goto L_0x048c
            r3 = 0
        L_0x048c:
            r0.A15(r6, r5, r3, r2)
            goto L_0x00e5
        L_0x0491:
            X.11C r2 = r0.A2b
            boolean r2 = X.C40811vJ.A0M(r2)
            r0.A1S = r2
            if (r2 != 0) goto L_0x00e5
            java.lang.String r2 = "voip/service/cmd/ACTION_REFRESH_APP_BACKGROUND_RESTRICTIONS background restrictions no longer enabled, start FgService"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r0)
            java.lang.String r3 = "notification_type"
            r2 = 2
            int r2 = r4.getInt(r3, r2)
            A0D(r0, r5, r2)
            goto L_0x00e5
        L_0x04b0:
            android.os.Message r2 = r13.A01
            X.C17960vV.A07(r2)
            java.lang.Object r5 = r2.obj
            X.C17960vV.A07(r5)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.A1E
            r3 = 43
        L_0x04be:
            X.Ajy r2 = new X.Ajy
            r2.<init>(r0, r5, r3)
        L_0x04c3:
            r4.execute(r2)
            goto L_0x00e5
        L_0x04c8:
            X.1V7 r2 = r0.A2J
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A06
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x00e5
            com.whatsapp.voipcalling.CallInfo r2 = X.AnonymousClass8BR.A0r(r0)
            A0D(r0, r2, r3)
            goto L_0x00e5
        L_0x04db:
            java.lang.String r2 = "call_id"
            java.lang.String r3 = r4.getString(r2)
            if (r3 == 0) goto L_0x00e5
            X.1Vn r2 = r0.A2d
            r2.BES(r3)
            goto L_0x00e5
        L_0x04ea:
            X.1HQ r2 = r0.A29
            com.whatsapp.voipcalling.CallInfo r2 = X.C181259Pt.A00(r2, r5)
            if (r2 == 0) goto L_0x00e5
            X.8yP r3 = r0.A2D
            java.lang.String r2 = r2.callId
            r3.A0D(r2)
            goto L_0x00e5
        L_0x04fb:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r6 = r13.A02
            X.C17960vV.A07(r6)
            X.2qu r6 = (X.C62172qu) r6
            int r2 = r6.A07
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A0u = r2
            long r4 = r6.A01
            r7 = 0
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x051e
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.A11 = r2
        L_0x051e:
            java.lang.Integer r2 = r6.A0A
            if (r2 == 0) goto L_0x0524
            r0.A0x = r2
        L_0x0524:
            r2 = 38
            X.Ajy r5 = new X.Ajy
            r5.<init>(r0, r6, r2)
            com.whatsapp.jid.GroupJid r2 = r6.A08
            if (r2 != 0) goto L_0x0555
            boolean r2 = r6.A0E
            if (r2 != 0) goto L_0x0555
            java.util.LinkedHashMap r2 = r6.A0D
            int r2 = r2.size()
            if (r2 != r3) goto L_0x0555
            X.0ve r4 = r0.A2p
            r3 = 5989(0x1765, float:8.392E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x0555
            X.10I r4 = r0.A31
            r2 = 40
            X.Ajy r3 = new X.Ajy
            r3.<init>(r0, r5, r2)
        L_0x0550:
            r4.CGN(r3)
            goto L_0x00e5
        L_0x0555:
            r5.run()
            goto L_0x00e5
        L_0x055a:
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L_0x00e5
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0r(X.A69):void");
    }

    public void A0s(C22558BCr bCr) {
        this.A0f = bCr;
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : this.A2t.A0Q()) {
                if (statusBarNotification.getId() == 27) {
                    this.A2d.BES(statusBarNotification.getTag());
                }
            }
            return;
        }
        Iterator it = this.A2A.A04().iterator();
        while (it.hasNext()) {
            this.A2d.BES(C17880vN.A0v(it));
        }
    }

    public void A0z(Boolean bool) {
        C21431Ajy ajy = new C21431Ajy(this, bool, 44);
        if (C18020vd.A05(C18040vf.A02, this.A2p, 2903)) {
            Log.i("voip/toggleMuteStatus running mute request asynchronously");
            this.A1E.execute(ajy);
            return;
        }
        Log.i("voip/toggleMuteStatus running mute request");
        ajy.run();
    }

    public void A10(Integer num, String str, float f, float f2) {
        if (num != null) {
            float f3 = f;
            float f4 = f2;
            if (C18020vd.A05(C18040vf.A02, this.A2p, 4959)) {
                AnonymousClass2PB r1 = this.A27;
                SoundPool soundPool = this.A0F;
                int intValue = num.intValue();
                C18070vi.A0d(soundPool, 0);
                r1.execute(new C146627Pz(soundPool, (WeakReference) null, f, f2, intValue));
                return;
            }
            this.A0F.play(num.intValue(), f3, f4, 0, 0, 1.0f);
            return;
        }
        C17890vO.A19(AnonymousClass8BW.A0o("VoiceService/playSound/", str), " sound pool has not been loaded successfully");
    }

    public void A11(String str) {
        Log.i("voip/call/reject");
        this.A1E.execute(new C21353Aii(str));
    }

    public void A12(String str) {
        if (!(!C61182pG.A00((C61182pG) this.A3I.get()))) {
            Log.i("voip/showErrorToast prevented by policy, skipping");
        } else {
            Message.obtain(this.A0H, 26, str).sendToTarget();
        }
    }

    public void A14(String str, int i, int i2) {
        C175258yP r4 = this.A2D;
        CallInfo A032 = C175258yP.A03(r4, (CallInfo) null);
        int i3 = i;
        int i4 = i2;
        r4.A04 = new AnonymousClass7PS(str, Integer.valueOf(i3), Integer.valueOf(i4));
        if (A032 != null) {
            Map map = A032.participants;
            boolean isCallFull = A032.isCallFull();
            boolean z = A032.isGroupCall;
            CallState callState = A032.callState;
            boolean z2 = A032.videoEnabled;
            boolean isInLonelyState = A032.isInLonelyState();
            C134216qE r14 = A032.self;
            AnonymousClass1EC A0i2 = AnonymousClass3MW.A0i(A032.groupJid);
            UserJid peerJid = A032.getPeerJid();
            String str2 = A032.callId;
            boolean isSelfRequestingUpgrade = A032.isSelfRequestingUpgrade();
            boolean isEitherSideRequestingUpgrade = A032.isEitherSideRequestingUpgrade();
            UserJid userJid = A032.callLinkCreatorJid;
            int i5 = A032.callLinkState;
            boolean z3 = A032.callEnding;
            String str3 = A032.callLinkToken;
            String str4 = A032.scheduledId;
            boolean isAudioChat = A032.isAudioChat();
            boolean z4 = A032.canRingAll;
            boolean isPhashBasedCall = A032.isPhashBasedCall();
            int i6 = A032.connectedLimit;
            boolean isCallOnHold = A032.isCallOnHold();
            long j = A032.callDuration;
            CallState callState2 = callState;
            String str5 = str2;
            String str6 = str3;
            String str7 = str4;
            int i7 = i5;
            int i8 = i6;
            C134216qE r17 = r14;
            UserJid userJid2 = userJid;
            r4.A02 = new C86534Sa(C201110w.copyOf(map), r17, A0i2, peerJid, userJid2, callState2, str5, str6, str7, i7, i3, i4, i8, A032.callResult, j, isCallFull, z, z2, isInLonelyState, isSelfRequestingUpgrade, isEitherSideRequestingUpgrade, z3, isAudioChat, z4, isPhashBasedCall, isCallOnHold, A032.isLidCall());
        }
    }

    public void A18(List list, int i) {
        if (!(!C61182pG.A00((C61182pG) this.A3I.get()))) {
            Log.i("voip/showErrorDialog prevented by policy, skipping");
        } else {
            this.A22.CGP(new C21470Akb((Object) this, i, 26, (Object) list));
        }
    }

    public void A19(boolean z) {
        C138256wm r2 = (C138256wm) this.A35.get();
        r2.A02 = z;
        C17900vP.A0n("AudioLevelController/applyVoipStackPlaybackMute ", AnonymousClass000.A10(), z);
        C138256wm.A00(r2, (ThreadPoolExecutor) null);
    }

    public void A1A(boolean z, boolean z2) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A1E;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.execute(new C146847Qv(this, 3, z, z2));
        }
    }

    public boolean A1B() {
        if (Build.VERSION.SDK_INT < 28 || !this.A2K.A0C()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0286, code lost:
        r4.notifyAllObservers(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0289, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03f3, code lost:
        if (r0 != 3) goto L_0x0ead;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0403, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0406, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0619, code lost:
        r3.A1E.execute(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x061e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x067e, code lost:
        r1 = X.AnonymousClass8BR.A0r(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0682, code lost:
        if (r1 == null) goto L_0x0ead;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0689, code lost:
        r3.A2D.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x068e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r0.Be0() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x079c, code lost:
        com.whatsapp.voipcalling.VoipActivityV2.A1j(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x079f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x07f5, code lost:
        r6.notifyAllObservers(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x07f8, code lost:
        r6.A0C(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x07fb, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0921, code lost:
        if (r3.A1X != false) goto L_0x0923;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0940, code lost:
        if (r7 == 9) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0999, code lost:
        if (r7 != 8) goto L_0x099b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x099b, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x09e7, code lost:
        r4.notifyAllObservers(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x09ea, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0a18, code lost:
        if (X.C40811vJ.A0e(r4) != false) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0a1a, code lost:
        A0C(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0a1d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0b98, code lost:
        if (r3.A0l.xmppStatus.intValue() != 3) goto L_0x0b9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0bb2, code lost:
        if (r3.A0l.xmppStatus.intValue() != 2) goto L_0x0bb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0bcc, code lost:
        if (r3.A0l.callRelayBindStatus.intValue() != 1) goto L_0x0bce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0be4, code lost:
        if (r3.A0l.callRelayBindStatus.intValue() != 2) goto L_0x0be6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x0ca8, code lost:
        if (r9 == r13) goto L_0x0b3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:0x0e35, code lost:
        if (r19 != null) goto L_0x0a83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x0e81, code lost:
        A0w(X.AnonymousClass8BR.A0r(r3), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x0e88, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x0ead, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0949  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0966  */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x099d  */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x0af5  */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x0cb7  */
    /* JADX WARNING: Removed duplicated region for block: B:796:0x0d15  */
    /* JADX WARNING: Removed duplicated region for block: B:811:0x0d69  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean A1D(android.os.Message r30) {
        /*
            r29 = this;
            r8 = r30
            int r5 = r8.what
            r12 = 28
            r6 = 2
            r4 = 0
            r0 = 0
            r7 = 0
            r2 = 1
            r3 = r29
            switch(r5) {
                case 1: goto L_0x0e58;
                case 2: goto L_0x0011;
                case 3: goto L_0x0e4f;
                case 4: goto L_0x0a39;
                case 5: goto L_0x0a2c;
                case 6: goto L_0x0a1e;
                case 7: goto L_0x09f7;
                case 8: goto L_0x09eb;
                case 9: goto L_0x0011;
                case 10: goto L_0x09b0;
                case 11: goto L_0x07fc;
                case 12: goto L_0x07fc;
                case 13: goto L_0x0011;
                case 14: goto L_0x0a10;
                case 15: goto L_0x07a9;
                case 16: goto L_0x0011;
                case 17: goto L_0x07a0;
                case 18: goto L_0x0737;
                case 19: goto L_0x075d;
                case 20: goto L_0x0011;
                case 21: goto L_0x0011;
                case 22: goto L_0x0011;
                case 23: goto L_0x0720;
                case 24: goto L_0x070a;
                case 25: goto L_0x06cc;
                case 26: goto L_0x06c0;
                case 27: goto L_0x06ac;
                case 28: goto L_0x068f;
                case 29: goto L_0x0e69;
                case 30: goto L_0x061f;
                case 31: goto L_0x05c4;
                case 32: goto L_0x0587;
                case 33: goto L_0x0661;
                case 34: goto L_0x046b;
                case 35: goto L_0x044a;
                case 36: goto L_0x0011;
                case 37: goto L_0x060e;
                case 38: goto L_0x0421;
                case 39: goto L_0x09c2;
                case 40: goto L_0x067e;
                case 41: goto L_0x0407;
                case 42: goto L_0x0332;
                case 43: goto L_0x031b;
                case 44: goto L_0x030a;
                case 45: goto L_0x02fe;
                case 46: goto L_0x02d7;
                case 47: goto L_0x07d6;
                case 48: goto L_0x02b2;
                case 49: goto L_0x029a;
                case 50: goto L_0x028a;
                case 51: goto L_0x0250;
                case 52: goto L_0x01a0;
                case 53: goto L_0x015b;
                case 54: goto L_0x0278;
                case 55: goto L_0x0685;
                case 56: goto L_0x0685;
                case 57: goto L_0x014a;
                case 58: goto L_0x013e;
                case 59: goto L_0x012b;
                case 60: goto L_0x005e;
                case 61: goto L_0x03f6;
                case 62: goto L_0x001f;
                case 63: goto L_0x0012;
                case 64: goto L_0x0ea6;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r7
        L_0x0012:
            X.Adx r1 = r3.A0R
            X.C17960vV.A07(r1)
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            r1.A04(r0)
            return r2
        L_0x001f:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
            if (r1 == 0) goto L_0x002c
            X.E9o r0 = r3.A0S
            if (r0 == 0) goto L_0x002c
            r0.CQY(r1)
        L_0x002c:
            X.BCr r5 = r3.A0f
            if (r5 == 0) goto L_0x0ead
            X.E9o r4 = r3.A0S
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            X.0vp r0 = r5.A24
            boolean r1 = X.C72463Mc.A1Z(r0)
            java.lang.String r0 = "We should only create a VoipSupDelegate if Voice-service-level glasses service is enabled."
            X.C17960vV.A0F(r1, r0)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r5)
            if (r3 == 0) goto L_0x0058
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0058
            com.whatsapp.voipcalling.VoipActivityV2.A1B(r4, r3, r5)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1z(r3, r5)
            if (r0 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2.A28(r5)
            return r2
        L_0x0058:
            java.lang.String r0 = "VoipActivityV2Glasses Service Created but skipping UI since call state is None or null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x005e:
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x011d
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            if (r3 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2.A1M(r3, r4)
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x0076
            X.AfC r0 = r4.A0z
            r0.A06()
        L_0x0076:
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r4.A0i
            if (r0 == 0) goto L_0x011a
            X.1DT r0 = r0.A07
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x011a
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r4.A0i
            X.1DT r0 = r0.A07
            int r0 = X.C72463Mc.A0A(r0)
        L_0x008a:
            com.whatsapp.voipcalling.VoipActivityV2.A1f(r4, r0)
            r4.CQl(r3)
            X.0vp r0 = r4.A23
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x00e8
            X.8At r0 = r4.A0n
            r6 = 1
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.Be0()
            r1 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            X.00H r0 = r4.A1p
            java.lang.Object r0 = r0.get()
            X.4RC r0 = (X.AnonymousClass4RC) r0
            r0.A02 = r1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r5 = r4.A0g
            if (r5 == 0) goto L_0x00d1
            X.8At r1 = r4.A0n
            boolean r0 = r1.Be0()
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r1.Be1()
            if (r0 != 0) goto L_0x00c2
            r6 = 0
        L_0x00c2:
            boolean r0 = r5.A0B
            if (r0 == r6) goto L_0x00d1
            r5.A0B = r6
            X.8yP r0 = r5.A0W
            X.4Sa r0 = r0.A07()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r0, r5, r7)
        L_0x00d1:
            X.00H r0 = r4.A1l
            java.lang.Object r1 = r0.get()
            com.whatsapp.calling.header.CallHeaderStateHolder r1 = (com.whatsapp.calling.header.CallHeaderStateHolder) r1
            X.8At r0 = r4.A0n
            boolean r0 = r0.Be0()
            X.1G4 r1 = r1.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
        L_0x00e8:
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1z(r3, r4)
            if (r0 == 0) goto L_0x00f1
            com.whatsapp.voipcalling.VoipActivityV2.A28(r4)
        L_0x00f1:
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A25(r4)
            if (r0 == 0) goto L_0x0ead
            X.1bI r0 = r4.A1U
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0116
            X.00H r0 = r4.A1n
            java.lang.Object r1 = r0.get()
            X.6kZ r1 = (X.C131136kZ) r1
            X.8At r0 = r4.A0n
            boolean r0 = r0.Be0()
            X.1G4 r1 = r1.A0G
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
        L_0x0116:
            com.whatsapp.voipcalling.VoipActivityV2.A29(r4, r2)
            return r2
        L_0x011a:
            r0 = 0
            goto L_0x008a
        L_0x011d:
            X.E9o r0 = r3.A0S
            if (r0 == 0) goto L_0x0ead
            boolean r0 = r0.Be0()
            if (r0 != 0) goto L_0x0ead
            r3.A1A(r7, r2)
            return r2
        L_0x012b:
            int r4 = r8.arg1
            if (r4 <= 0) goto L_0x0ead
            X.BCr r1 = r3.A0f
            if (r1 == 0) goto L_0x0ead
            android.content.Context r0 = r3.A1r
            java.lang.String r0 = r0.getString(r4)
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            r1.A20 = r0
            return r2
        L_0x013e:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.AfC r0 = r0.A0z
            r0.A05()
            return r2
        L_0x014a:
            X.1VP r4 = r3.A2F
            java.lang.Object r1 = r8.obj
            X.C17960vV.A07(r1)
            X.9Bw r1 = (X.C178119Bw) r1
            android.content.Context r0 = r3.A1r
            X.1VQ r4 = (X.AnonymousClass1VQ) r4
            r4.BhC(r0, r1, r2, r7)
            return r2
        L_0x015b:
            java.lang.Object r5 = r8.obj
            X.C17960vV.A07(r5)
            X.6te r5 = (X.C136336te) r5
            int r1 = r5.A01
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0ead
            if (r0 == r6) goto L_0x016c
            if (r0 != r2) goto L_0x0185
        L_0x016c:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0185
            X.0ve r4 = r3.A2p
            r1 = 4439(0x1157, float:6.22E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0185
            java.lang.Integer r4 = r3.A1p
            java.lang.String r1 = "poorNetwork"
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A10(r4, r1, r0, r0)
        L_0x0185:
            X.8yP r4 = r3.A2D
            X.0ve r3 = r4.A0A
            r1 = 3807(0xedf, float:5.335E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            if (r0 <= 0) goto L_0x0ead
            X.4Sa r0 = r4.A07()
            boolean r0 = r0.A0Q
            X.AWh r1 = new X.AWh
            r1.<init>(r7, r5, r0)
            goto L_0x0286
        L_0x01a0:
            java.lang.Object r10 = r8.obj
            X.C17960vV.A07(r10)
            X.9sQ r10 = (X.C194869sQ) r10
            X.11S r0 = r3.A23
            com.whatsapp.jid.UserJid r8 = r10.A03
            boolean r0 = r0.A0O(r8)
            if (r0 == 0) goto L_0x01c8
            int r0 = r10.A02
            if (r0 != r2) goto L_0x01b6
            r7 = 1
        L_0x01b6:
            r3.A1Y = r7
            if (r7 != 0) goto L_0x01c8
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x01c4
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 != 0) goto L_0x01c8
        L_0x01c4:
            r0 = 0
            r3.A1A(r0, r2)
        L_0x01c8:
            X.8yP r7 = r3.A2D
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x021c
            int r9 = r10.A00
            r5 = 0
            r11 = 1
            if (r9 != r2) goto L_0x01fe
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x01fe
            X.11S r0 = r7.A09
            boolean r0 = r0.A0O(r8)
            if (r0 != 0) goto L_0x01fe
            r7.A05 = r2
            X.0ve r4 = r7.A0A
            r1 = 3207(0xc87, float:4.494E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r4, r1)
            if (r1 <= 0) goto L_0x01fe
            r0 = 1
            if (r1 != r2) goto L_0x01f4
            r0 = 0
        L_0x01f4:
            X.4cJ r1 = new X.4cJ
            r1.<init>(r0, r2)
            r0 = 8
            X.C17890vO.A0s(r7, r1, r0)
        L_0x01fe:
            X.1DC r0 = r7.A0C
            boolean r0 = r0.BgK()
            if (r0 == 0) goto L_0x021c
            int r4 = r10.A02
            if (r4 == r2) goto L_0x0242
            r0 = 3
            if (r4 == r6) goto L_0x0228
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r4 == r0) goto L_0x0222
            java.lang.String r0 = "voip/CallDatasource/Unsupported screen share state: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            X.C17960vV.A0F(r5, r0)
        L_0x021c:
            X.00H r0 = r3.A3G
            r0.get()
            return r2
        L_0x0222:
            java.lang.String r0 = "Screen share failed for "
            X.C17900vP.A0Y(r8, r0, r1)
            goto L_0x021c
        L_0x0228:
            if (r9 == r6) goto L_0x022d
            if (r9 == r0) goto L_0x022d
            r11 = 0
        L_0x022d:
            X.11S r0 = r7.A09
            boolean r0 = r0.A0O(r8)
            if (r0 == 0) goto L_0x023a
            if (r11 == 0) goto L_0x023a
            X.C20736AWr.A00(r7, r9, r5)
        L_0x023a:
            if (r9 == r6) goto L_0x021c
            X.AWk r0 = new X.AWk
            r0.<init>(r8, r2, r5, r5)
            goto L_0x024c
        L_0x0242:
            int r0 = r10.A01
            if (r0 < r6) goto L_0x0247
            r5 = 1
        L_0x0247:
            X.AWk r0 = new X.AWk
            r0.<init>(r8, r2, r2, r5)
        L_0x024c:
            r7.notifyAllObservers(r0)
            goto L_0x021c
        L_0x0250:
            java.lang.Object r5 = r8.obj
            X.C17960vV.A07(r5)
            int r0 = r8.arg1
            if (r0 != r2) goto L_0x026c
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x0ead
            X.1FP r4 = (X.AnonymousClass1FP) r4
            X.10I r3 = r4.A05
            r1 = 10
            X.7RN r0 = new X.7RN
            r0.<init>(r4, r5, r1)
            r3.CGF(r0)
            return r2
        L_0x026c:
            X.8yP r4 = r3.A2D
            X.4Sa r0 = r4.A07()
            X.AWi r1 = new X.AWi
            r1.<init>(r0, r5, r6)
            goto L_0x0286
        L_0x0278:
            X.8yP r4 = r3.A2D
            X.4Sa r0 = r4.A07()
            boolean r3 = r0.A0Q
            r0 = 3
            X.AWs r1 = new X.AWs
            r1.<init>(r3, r0)
        L_0x0286:
            r4.notifyAllObservers(r1)
            return r2
        L_0x028a:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 != 0) goto L_0x0ead
            java.lang.String r0 = "default"
            r3.A11(r0)
            return r2
        L_0x029a:
            int r4 = r8.arg1
            java.lang.Object r1 = r8.obj
            java.lang.String r1 = (java.lang.String) r1
            if (r4 == 0) goto L_0x02a3
            r7 = 1
        L_0x02a3:
            java.lang.String r0 = "voiceservice/end call with dialog/ Reason not set"
            X.C17960vV.A0F(r7, r0)
            X.1HQ r0 = r3.A29
            com.whatsapp.voipcalling.CallInfo r0 = X.C40811vJ.A04(r0)
            A0G(r3, r0, r1, r4)
            return r2
        L_0x02b2:
            int r5 = r8.arg1
            java.lang.Object r4 = r8.obj
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_CLEAN_UP_SELF_MANAGED_CONNECTION disconnectCause="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", callId="
            X.C17900vP.A0f(r0, r4, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r12) goto L_0x0ead
            X.8Ct r0 = r3.A0R(r4)
            if (r0 == 0) goto L_0x0ead
            r0.A08(r5)
            return r2
        L_0x02d7:
            int r0 = r8.arg1
            if (r0 != r2) goto L_0x02dc
            r7 = 1
        L_0x02dc:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            java.lang.Object r5 = r8.obj
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.C17960vV.A07(r5)
            X.8yP r6 = r3.A2D
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x07f8
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r1 = X.C175258yP.A03(r6, r0)
            if (r1 == 0) goto L_0x07f8
            r0 = 0
            X.AWm r3 = new X.AWm
            r3.<init>(r5, r1, r0, r7)
            goto L_0x07f5
        L_0x02fe:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
            if (r1 == 0) goto L_0x0ead
            X.8yP r0 = r3.A2D
            X.C175258yP.A04(r0, r1, r2)
            return r2
        L_0x030a:
            int r1 = r8.arg1
            r3.A1U = r7
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r3.A18(r0, r1)
            r0 = 25
            r3.A0n(r0, r4)
            return r2
        L_0x031b:
            java.lang.Object r1 = r8.obj
            X.8yP r6 = r3.A2D
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x07f8
            com.whatsapp.voipcalling.CallInfo r0 = X.C175258yP.A03(r6, r4)
            if (r0 == 0) goto L_0x07f8
            X.AWi r3 = new X.AWi
            r3.<init>(r0, r1, r2)
            goto L_0x07f5
        L_0x0332:
            java.lang.Object r5 = r8.obj
            com.whatsapp.voipcalling.CallLinkInfo r5 = (com.whatsapp.voipcalling.CallLinkInfo) r5
            int r10 = r8.arg1
            X.C17960vV.A02()
            int r0 = r5.linkState
            r9 = 3
            r8 = 4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            if (r0 != 0) goto L_0x0373
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "callLinkStateChangedOnUiThread to NONE. oldLinkState: "
            X.C17900vP.A0j(r0, r1, r10)
            com.whatsapp.fieldstats.events.WamCall r5 = r3.A0l
            if (r5 == 0) goto L_0x035d
            if (r10 == r9) goto L_0x0356
            if (r10 != r8) goto L_0x035d
        L_0x0356:
            X.A4u r1 = r3.A2M
            boolean r0 = r3.A1l
            r1.A02(r5, r0)
        L_0x035d:
            if (r10 != r8) goto L_0x036f
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.LINK
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            r3.A0I(r1, r0)
            r3.A1T = r7
        L_0x036a:
            r3.A0b = r4
            r3.A0a = r4
            return r2
        L_0x036f:
            r3.A0V()
            goto L_0x036a
        L_0x0373:
            if (r0 != r2) goto L_0x0392
            if (r10 != 0) goto L_0x03a2
            boolean r0 = r3.A1U
            if (r0 != 0) goto L_0x0ead
            android.content.Context r1 = r3.A1r
            boolean r0 = r5.videoEnabled
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            r14 = r13
            r10 = r1
            r15 = r4
            android.content.Intent r0 = X.AnonymousClass1LU.A1H(r10, r11, r12, r13, r14, r15)
            r1.startActivity(r0)
            return r2
        L_0x0392:
            if (r0 != r6) goto L_0x03a2
            if (r10 != r2) goto L_0x03a2
            com.whatsapp.jid.UserJid r0 = r5.creatorJid
            X.C17960vV.A07(r0)
        L_0x039b:
            X.8yP r1 = r3.A2D
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallLinkInfoToCallInfo(r5)
            goto L_0x0403
        L_0x03a2:
            if (r10 == r2) goto L_0x03f3
            if (r10 == r6) goto L_0x03f3
            if (r10 != r9) goto L_0x0ead
            if (r0 != r8) goto L_0x0ead
            r3.A1T = r2
            boolean r0 = r3.A1U
            if (r0 == 0) goto L_0x03c8
            r3.A1U = r7
            android.content.Context r1 = r3.A1r
            boolean r0 = r5.videoEnabled
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            r10 = r1
            r14 = r13
            r15 = r4
            android.content.Intent r0 = X.AnonymousClass1LU.A1H(r10, r11, r12, r13, r14, r15)
            r1.startActivity(r0)
        L_0x03c8:
            X.0ve r0 = r3.A2p
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r3)
            X.C17960vV.A07(r5)
            X.8yP r1 = r3.A2D
            java.lang.String r0 = r5.callId
            r1.A0D(r0)
            com.whatsapp.jid.UserJid r8 = X.C108955ca.A0T(r5)
            boolean r1 = r5.videoEnabled
            java.lang.String r0 = r5.callId
            r13 = r7
            r9 = r0
            r10 = r7
            r11 = r1
            r12 = r2
            r6 = r3
            r7 = r4
            r6.A0u(r7, r8, r9, r10, r11, r12, r13)
            return r2
        L_0x03f3:
            if (r0 != r9) goto L_0x0ead
            goto L_0x039b
        L_0x03f6:
            java.lang.Object r0 = r8.obj
            com.whatsapp.voipcalling.CallLinkInfo r0 = (com.whatsapp.voipcalling.CallLinkInfo) r0
            X.C17960vV.A02()
            X.8yP r1 = r3.A2D
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallLinkInfoToCallInfo(r0)
        L_0x0403:
            r1.A0C(r0)
            return r2
        L_0x0407:
            java.lang.Object r6 = r8.obj
            X.8yP r5 = r3.A2D
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallInfo r3 = X.C175258yP.A03(r5, r4)
            if (r3 == 0) goto L_0x0ead
            r1 = 3
            X.AWi r0 = new X.AWi
            r0.<init>(r3, r6, r1)
            r5.notifyAllObservers(r0)
            return r2
        L_0x0421:
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_RESTORE_AUDIO_ROUTE_AFTER_POTS_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r3)
            if (r5 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            X.Adx r1 = r3.A0R
            X.C17960vV.A07(r1)
            java.lang.String r0 = "voip/audio_route/restoreAudioRouteAfterPOTSCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0446
            r1.A09(r5, r2)
            r1.A07 = r7
            return r2
        L_0x0446:
            r1.A06(r5, r4)
            return r2
        L_0x044a:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0ead
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x0ead
            X.BCr r3 = r3.A0f
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            java.lang.String r0 = r3.A21
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0ead
            boolean r0 = r3.A2B
            if (r0 != 0) goto L_0x0ead
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A01 = r0
            return r2
        L_0x046b:
            com.whatsapp.voipcalling.CallInfo r10 = X.AnonymousClass8BR.A0r(r3)
            if (r10 == 0) goto L_0x0ead
            int r4 = r8.arg1
            if (r4 == 0) goto L_0x0ead
            r9 = 37
            if (r4 == r2) goto L_0x051c
            if (r4 == r6) goto L_0x04f4
            r0 = 3
            if (r4 == r0) goto L_0x0487
            r0 = 4
            if (r4 == r0) goto L_0x04b4
            java.lang.String r0 = "Unknown state for call waiting"
            X.C17960vV.A0F(r7, r0)
            return r2
        L_0x0487:
            X.BCr r5 = r3.A0f
            if (r5 == 0) goto L_0x04ee
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r4 = 0
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x04ee
            X.AfC r0 = r5.A0z
            r0.A06()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r5.A0t
            if (r0 == 0) goto L_0x04ae
            X.1vp r0 = r0.A0A
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x04ae
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r5.A0t
            X.6Qx r0 = X.C122576Qx.PENDING_CALL_NOTIFICATION
            r1.A0T(r0)
        L_0x04ae:
            r5.A22 = r4
            com.whatsapp.voipcalling.VoipActivityV2.A29(r5, r2)
            goto L_0x04ee
        L_0x04b4:
            java.lang.Object r0 = r8.obj
            java.lang.String r0 = (java.lang.String) r0
            X.8Ct r1 = r3.A0R(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r12) goto L_0x04c6
            if (r1 == 0) goto L_0x04c6
            r0 = 6
            r1.A08(r0)
        L_0x04c6:
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x04e4
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            r1 = 0
            boolean r0 = r10.isAudioChat()
            if (r0 == 0) goto L_0x04d6
            r4.finish()
        L_0x04d6:
            java.lang.String r0 = r10.callId
            r4.A21 = r0
            r4.A29 = r7
            com.whatsapp.voipcalling.VoipActivityV2.A1M(r10, r4)
            com.whatsapp.voipcalling.VoipActivityV2.A1N(r10, r4, r7)
            r4.A22 = r1
        L_0x04e4:
            X.8yP r1 = r3.A2D
            java.lang.String r0 = r10.callId
            r1.A0D(r0)
            A0D(r3, r10, r6)
        L_0x04ee:
            android.os.Handler r0 = r3.A0H
            r0.removeMessages(r9)
            return r2
        L_0x04f4:
            X.2gu r0 = r10.callWaitingInfo
            int r0 = r0.A01
            if (r0 != r2) goto L_0x0ead
            X.8yP r0 = r3.A2D
            r0.A0C(r10)
            X.BCr r1 = r3.A0f
            if (r1 == 0) goto L_0x0516
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = r1.A21
            if (r0 == 0) goto L_0x051a
            boolean r0 = X.AnonymousClass8BU.A1U(r10, r0)
            if (r0 == 0) goto L_0x051a
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r10)
        L_0x0513:
            com.whatsapp.voipcalling.VoipActivityV2.A1N(r0, r1, r7)
        L_0x0516:
            A0D(r3, r10, r2)
            return r2
        L_0x051a:
            r0 = r10
            goto L_0x0513
        L_0x051c:
            X.2gu r4 = r10.callWaitingInfo
            int r4 = r4.A01
            if (r4 != r2) goto L_0x0ead
            X.BCr r5 = r3.A0f
            if (r5 == 0) goto L_0x0535
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            r5.A28 = r7
            java.lang.String r4 = "MenuBottomSheet"
            r5.A4j(r4)
            X.2gu r4 = r10.callWaitingInfo
            java.lang.String r4 = r4.A04
            r5.A22 = r4
        L_0x0535:
            java.lang.String r4 = r10.callId
            X.8Ct r4 = r3.A0R(r4)
            boolean r4 = X.AnonymousClass000.A1W(r4)
            if (r4 == 0) goto L_0x0581
            long r4 = android.os.SystemClock.elapsedRealtime()
            r3.A0A = r4
            X.2gu r4 = r10.callWaitingInfo
            java.util.List r11 = r4.A06
            boolean r8 = r4.A08
            java.lang.String r6 = r4.A04
            com.whatsapp.jid.GroupJid r5 = r4.A02
            boolean r4 = r4.A09
            r14 = r11
            r15 = r8
            r16 = r4
            r11 = r3
            r12 = r5
            r13 = r6
            boolean r4 = r11.A1E(r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0581
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0q(r0)
        L_0x0565:
            android.os.Message r4 = new android.os.Message
            r4.<init>()
            r4.what = r9
            X.2gu r1 = r10.callWaitingInfo
            java.lang.String r0 = r1.A04
            r4.obj = r0
            android.os.Handler r3 = r3.A0H
            int r0 = r1.A00
            if (r0 <= r2) goto L_0x057e
            r0 = 23000(0x59d8, double:1.13635E-319)
        L_0x057a:
            r3.sendMessageDelayed(r4, r0)
            return r2
        L_0x057e:
            long r0 = A48
            goto L_0x057a
        L_0x0581:
            r3.A0A = r0
            r3.A0w(r10, r7)
            goto L_0x0565
        L_0x0587:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x067e
            java.lang.String r1 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r1 == 0) goto L_0x067e
            X.BCr r6 = r3.A0f
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            java.lang.String r0 = r6.A21
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x067e
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r6)
            com.whatsapp.voipcalling.VoipActivityV2.A1K(r5, r6)
            if (r5 == 0) goto L_0x067e
            X.A99 r0 = r6.A0u
            if (r0 == 0) goto L_0x05c2
            X.Adx r4 = r0.A0R
            X.C17960vV.A07(r4)
            int r1 = r4.A00
            java.lang.String r0 = r5.callId
            X.C17960vV.A07(r4)
            boolean r0 = r4.A0F(r0)
            if (r0 == 0) goto L_0x05bd
            r7 = 1
        L_0x05bd:
            r6.CQS(r5, r1, r7)
            goto L_0x067e
        L_0x05c2:
            r1 = 0
            goto L_0x05bd
        L_0x05c4:
            java.lang.Object r5 = r8.obj
            if (r5 == 0) goto L_0x0ead
            X.9ah r5 = (X.C184279ah) r5
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r12) goto L_0x05e3
            java.lang.String r0 = r5.A01
            X.8Ct r0 = r3.A0R(r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x05e3
            X.1VM r4 = r3.A2K
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r5.A00
            r4.A0A(r1, r0)
        L_0x05e3:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0601
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            X.BCr r4 = r3.A0f
            java.lang.String r1 = r5.A00
            if (r0 == 0) goto L_0x05f6
            boolean r0 = r0.videoEnabled
            if (r0 == 0) goto L_0x05f6
            r7 = 1
        L_0x05f6:
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            r4.A21 = r1
            if (r7 == 0) goto L_0x0601
            X.AfC r0 = r4.A0z
            r0.A05()
        L_0x0601:
            X.8yP r1 = r3.A2D
            java.lang.String r0 = r5.A00
            r1.A0D(r0)
            X.7RL r1 = new X.7RL
            r1.<init>(r3, r5, r6)
            goto L_0x0619
        L_0x060e:
            java.lang.Object r4 = r8.obj
            java.lang.String r4 = (java.lang.String) r4
            r0 = 43
            X.AkJ r1 = new X.AkJ
            r1.<init>(r0, r4, r3)
        L_0x0619:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r3.A1E
            r0.execute(r1)
            return r2
        L_0x061f:
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x067e
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.C17960vV.A02()
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            boolean r0 = X.C40811vJ.A0e(r1)
            if (r0 == 0) goto L_0x067e
            X.C17960vV.A07(r1)
            com.whatsapp.voipcalling.VoipActivityV2.A1N(r1, r4, r7)
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x067e
            boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x067e
            boolean r0 = r1.isCallOnHold()
            if (r0 == 0) goto L_0x0650
            X.AfC r1 = r4.A0z
            X.DRB r0 = r1.A02
            if (r0 == 0) goto L_0x067e
            X.C21141AfC.A03(r1)
            goto L_0x067e
        L_0x0650:
            X.6qE r0 = r1.self
            int r1 = r0.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x067e
            X.AfC r0 = r4.A0z
            r0.A06()
            goto L_0x067e
        L_0x0661:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x067e
            java.lang.String r4 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r4 == 0) goto L_0x067e
            X.BCr r1 = r3.A0f
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = r1.A21
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x067e
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r1)
            com.whatsapp.voipcalling.VoipActivityV2.A1K(r0, r1)
        L_0x067e:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
            if (r1 == 0) goto L_0x0ead
            goto L_0x0689
        L_0x0685:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
        L_0x0689:
            X.8yP r0 = r3.A2D
            r0.A0C(r1)
            return r2
        L_0x068f:
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_SHOW_INCOMING_CALL_UI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r8.obj
            if (r1 == 0) goto L_0x0ead
            java.lang.String r1 = (java.lang.String) r1
            X.8Ct r0 = r3.A0R(r1)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x0ead
            X.1VR r0 = r3.A0h
            if (r0 == 0) goto L_0x0ead
            r0.A04(r1)
            return r2
        L_0x06ac:
            X.Adx r5 = r3.A0R
            X.C17960vV.A07(r5)
            int r4 = r8.arg1
            X.10s r3 = r5.A0L
            r1 = 27
            X.7RP r0 = new X.7RP
            r0.<init>(r5, r4, r1)
            r3.execute(r0)
            return r2
        L_0x06c0:
            X.1KB r1 = r3.A22
            if (r1 == 0) goto L_0x0ead
            java.lang.Object r0 = r8.obj
            java.lang.String r0 = (java.lang.String) r0
            r1.A0G(r0, r2)
            return r2
        L_0x06cc:
            X.BCr r5 = r3.A0f
            if (r5 == 0) goto L_0x06e4
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            X.C17960vV.A02()
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r5)
            if (r4 == 0) goto L_0x06e4
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x06e4
            com.whatsapp.voipcalling.VoipActivityV2.A1N(r4, r5, r6)
        L_0x06e4:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            if (r4 == 0) goto L_0x0ead
            X.8yP r0 = r3.A2D
            r0.A0C(r4)
            X.2gu r0 = r4.callWaitingInfo
            int r0 = r0.A01
            if (r0 == r2) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0706
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0705
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 != 0) goto L_0x0706
        L_0x0705:
            r6 = 1
        L_0x0706:
            A0D(r3, r4, r6)
            return r2
        L_0x070a:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            if (r4 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            boolean r0 = r4.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0ead
            r3.A0k(r2)
            return r2
        L_0x0720:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            if (r4 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            X.6qE r0 = r4.self
            int r1 = r0.A08
            r0 = 3
            if (r1 != r0) goto L_0x0ead
            r3.A0i(r2)
            return r2
        L_0x0737:
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x0ead
            if (r3 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0ead
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0ead
            boolean r0 = r4.A2F
            if (r0 == 0) goto L_0x0ead
            r0 = 2131887841(0x7f1206e1, float:1.94103E38)
            java.lang.String r0 = r4.getString(r0)
            goto L_0x079c
        L_0x075d:
            X.BCr r4 = r3.A0f
            if (r4 == 0) goto L_0x0ead
            java.lang.Object r5 = r8.obj
            X.1BI r5 = (X.AnonymousClass1BI) r5
            if (r5 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            X.A99 r0 = r4.A0u
            if (r0 == 0) goto L_0x0ead
            if (r3 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0ead
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x0ead
            boolean r0 = r4.A2F
            if (r0 == 0) goto L_0x0ead
            java.util.Map r0 = r3.participants
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0ead
            X.1Me r1 = r4.A15
            X.1M9 r0 = r4.A12
            X.1E7 r0 = r0.A0H(r5)
            java.lang.String r1 = r1.A0I(r0)
            r0 = 2131887814(0x7f1206c6, float:1.9410246E38)
            java.lang.String r0 = X.C17890vO.A0R(r4, r1, r2, r7, r0)
        L_0x079c:
            com.whatsapp.voipcalling.VoipActivityV2.A1j(r4, r0)
            return r2
        L_0x07a0:
            X.9oa r0 = r3.A1o
            double r0 = r0.A00()
            r3.A00 = r0
            return r2
        L_0x07a9:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x07c6
            java.lang.String r5 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r5 == 0) goto L_0x07c6
            X.BCr r1 = r3.A0f
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.String r0 = r1.A21
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x07c6
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r1)
            com.whatsapp.voipcalling.VoipActivityV2.A1K(r0, r1)
        L_0x07c6:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
            X.E9o r0 = r3.A0S
            if (r0 == 0) goto L_0x07d3
            if (r1 == 0) goto L_0x07d3
            r0.CQY(r1)
        L_0x07d3:
            X.8yP r6 = r3.A2D
            goto L_0x07f8
        L_0x07d6:
            java.lang.Object r1 = r8.obj
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            int r0 = r8.arg1
            if (r0 != r2) goto L_0x07df
            r7 = 1
        L_0x07df:
            X.C17960vV.A07(r1)
            X.8yP r6 = r3.A2D
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x07f8
            com.whatsapp.voipcalling.CallInfo r0 = X.C175258yP.A03(r6, r4)
            if (r0 == 0) goto L_0x07f8
            X.AWm r3 = new X.AWm
            r3.<init>(r1, r0, r2, r7)
        L_0x07f5:
            r6.notifyAllObservers(r3)
        L_0x07f8:
            r6.A0C(r4)
            return r2
        L_0x07fc:
            com.whatsapp.voipcalling.CallInfo r5 = X.AnonymousClass8BR.A0r(r3)
            int r12 = r8.what
            int r7 = r8.arg1
            X.C17960vV.A02()
            if (r5 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            r9 = 3
            r10 = 0
            if (r7 != r9) goto L_0x0816
            r5.isPeerRequestingUpgrade()
        L_0x0816:
            X.A7S r11 = r3.A0T
            if (r7 == 0) goto L_0x081c
            if (r7 != r2) goto L_0x0845
        L_0x081c:
            boolean r0 = r5.isGroupCall
            if (r0 != 0) goto L_0x0845
            java.util.Map r0 = r5.participants
            java.util.Set r0 = r0.keySet()
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r0 > r2) goto L_0x0845
            X.0ve r8 = r11.A0C
            r1 = 12680(0x3188, float:1.7768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x09a2
            X.AlA r8 = r11.A07
            r1 = 32
            X.Ajy r0 = new X.Ajy
            r0.<init>(r11, r5, r1)
            r8.execute(r0)
        L_0x0845:
            r8 = 6
            r1 = 11
            if (r12 != r1) goto L_0x0868
            if (r7 != r8) goto L_0x0868
            X.11C r0 = r3.A2b
            android.media.AudioManager r11 = r0.A0D()
            if (r11 == 0) goto L_0x0868
            java.lang.Boolean r0 = r3.A0s
            if (r0 == 0) goto L_0x085e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0868
        L_0x085e:
            boolean r0 = r3.A1C(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0s = r0
        L_0x0868:
            X.E9o r0 = r3.A0S
            if (r0 == 0) goto L_0x086f
            r0.CQY(r5)
        L_0x086f:
            r0 = 7
            r11 = 5
            if (r7 == r0) goto L_0x0936
            if (r7 == r11) goto L_0x0936
            r0 = 9
            if (r7 == r0) goto L_0x0936
            r0 = 8
            if (r7 == r0) goto L_0x0936
            boolean r0 = r5.isEitherSideRequestingUpgrade()
            if (r0 == 0) goto L_0x0887
            boolean r0 = r3.A1J
            if (r0 != 0) goto L_0x08a6
        L_0x0887:
            boolean r0 = r5.isEitherSideRequestingUpgrade()
            if (r0 == 0) goto L_0x0892
            r3.A1k = r10
            A0C(r3, r5)
        L_0x0892:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0899
            r0.CRo(r5)
        L_0x0899:
            X.8yP r0 = r3.A2D
            r0.A0C(r5)
            X.Adx r0 = r3.A0R
            X.C17960vV.A07(r0)
            r0.A06(r5, r4)
        L_0x08a6:
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0930
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x0930
            android.os.Handler r0 = r3.A0H
            r13 = 24
            r0.removeMessages(r13)
            android.os.Handler r12 = r3.A0H
            r0 = 30000(0x7530, double:1.4822E-319)
            r12.sendEmptyMessageDelayed(r13, r0)
            X.A7v r12 = r3.A0X
            com.whatsapp.jid.UserJid r1 = X.C108955ca.A0T(r5)
            long[] r0 = new long[r11]
            r0 = {0, 50, 100, 50, 1000} // fill-array
            r12.A07(r1, r0, r2)
            X.BCr r11 = r3.A0f
            if (r11 == 0) goto L_0x08d7
            r0 = r11
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2I
            if (r0 != 0) goto L_0x0904
        L_0x08d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_PEER_VIDEO_STATE_CHANGED launch incoming request screen, voip activity is "
            X.C17900vP.A0Y(r11, r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            com.whatsapp.jid.UserJid r0 = X.C108955ca.A0T(r5)
            r1.add(r0)
            android.content.Context r11 = r3.A1r
            X.195 r0 = r3.A1w
            boolean r0 = r0.A00
            java.lang.Boolean r12 = X.C108945cZ.A1A(r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r15 = r4
            r13 = r4
            r16 = r1
            android.content.Intent r0 = X.AnonymousClass1LU.A1H(r11, r12, r13, r14, r15, r16)
            r11.startActivity(r0)
        L_0x0904:
            r13 = 2
            if (r7 == r6) goto L_0x0ead
            if (r7 == r8) goto L_0x0ead
            if (r7 != r9) goto L_0x091a
            X.1LD r0 = r3.A2x
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x091a
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x091a
            r13 = 1
        L_0x091a:
            boolean r1 = r3.A1Y
            if (r1 != 0) goto L_0x0923
            boolean r0 = r3.A1X
            r15 = 1
            if (r0 == 0) goto L_0x0927
        L_0x0923:
            r15 = 0
            if (r1 == 0) goto L_0x0927
            r10 = 1
        L_0x0927:
            r14 = 0
            r11 = r3
            r12 = r5
            r16 = r10
            A0E(r11, r12, r13, r14, r15, r16)
            return r2
        L_0x0930:
            X.A7v r0 = r3.A0X
            r0.A06()
            goto L_0x0904
        L_0x0936:
            boolean r0 = r3.A1J
            if (r0 != 0) goto L_0x093c
            r3.A1k = r2
        L_0x093c:
            if (r12 != r1) goto L_0x098b
            r0 = 9
            if (r7 != r0) goto L_0x099b
        L_0x0942:
            r14 = 2131898298(0x7f122fba, float:1.943151E38)
        L_0x0945:
            X.BCr r1 = r3.A0f
            if (r1 == 0) goto L_0x0962
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            if (r14 <= 0) goto L_0x095c
            r1.A2C = r2
            X.0vp r0 = r1.A23
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0975
            X.8Au r0 = r1.A0p
            r0.CA5(r14)
        L_0x095c:
            r1.CRo(r5)
        L_0x095f:
            A0C(r3, r5)
        L_0x0962:
            X.8yP r13 = r3.A2D
            if (r14 <= 0) goto L_0x099d
            r0 = 3000(0xbb8, double:1.482E-320)
            int r12 = r13.size()
            if (r12 <= 0) goto L_0x08a6
            android.os.Handler r12 = r13.A01
            r12.sendEmptyMessageDelayed(r2, r0)
            goto L_0x08a6
        L_0x0975:
            java.lang.String r0 = r1.getString(r14)
            r1.A4o(r0)
            android.os.Handler r0 = r1.A05
            r13 = 10
            r0.removeMessages(r13)
            android.os.Handler r12 = r1.A05
            r0 = 3000(0xbb8, double:1.482E-320)
            r12.sendEmptyMessageDelayed(r13, r0)
            goto L_0x095f
        L_0x098b:
            r0 = 7
            if (r7 == r0) goto L_0x0942
            if (r7 != r11) goto L_0x0994
            r14 = 2131898297(0x7f122fb9, float:1.9431508E38)
            goto L_0x0945
        L_0x0994:
            r0 = 8
            r14 = 2131898296(0x7f122fb8, float:1.9431506E38)
            if (r7 == r0) goto L_0x0945
        L_0x099b:
            r14 = 0
            goto L_0x0945
        L_0x099d:
            r13.A0C(r5)
            goto L_0x08a6
        L_0x09a2:
            X.10I r8 = r11.A0D
            r1 = 33
            X.Ajy r0 = new X.Ajy
            r0.<init>(r11, r5, r1)
            r8.CGN(r0)
            goto L_0x0845
        L_0x09b0:
            java.lang.Object r1 = r8.obj
            X.8yP r4 = r3.A2D
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0ead
            r0 = 10
            X.AWd r3 = new X.AWd
            r3.<init>(r1, r0)
            goto L_0x09e7
        L_0x09c2:
            android.os.Bundle r1 = r8.getData()
            java.lang.String r0 = "participant_jids"
            android.os.Parcelable[] r5 = r1.getParcelableArray(r0)
            android.os.Bundle r1 = r8.getData()
            java.lang.String r0 = "audio_levels"
            int[] r1 = r1.getIntArray(r0)
            if (r5 == 0) goto L_0x0ead
            if (r1 == 0) goto L_0x0ead
            X.8yP r4 = r3.A2D
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0ead
            X.AWi r3 = new X.AWi
            r3.<init>(r1, r5, r7)
        L_0x09e7:
            r4.notifyAllObservers(r3)
            return r2
        L_0x09eb:
            X.BCr r1 = r3.A0f
            if (r1 == 0) goto L_0x0ead
            java.lang.Object r0 = r8.obj
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.videoRenderStarted(r0)
            return r2
        L_0x09f7:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            if (r4 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0ead
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0a0a
            r0.CRo(r4)
        L_0x0a0a:
            X.8yP r0 = r3.A2D
            r0.A0C(r4)
            goto L_0x0a1a
        L_0x0a10:
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r3)
            boolean r0 = X.C40811vJ.A0e(r4)
            if (r0 == 0) goto L_0x0ead
        L_0x0a1a:
            A0C(r3, r4)
            return r2
        L_0x0a1e:
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r3)
            int r0 = r8.arg2
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r3.A0x(r1, r0, r7)
            return r2
        L_0x0a2c:
            java.lang.Object r1 = r8.obj
            X.9Bw r1 = (X.C178119Bw) r1
            int r0 = r8.arg1
            if (r0 <= 0) goto L_0x0a35
            r7 = 1
        L_0x0a35:
            r3.A0H(r1, r7)
            return r2
        L_0x0a39:
            X.1Vn r14 = r3.A2d
            r1 = 7
            java.lang.String r0 = "VoiceService1"
            r14.BEJ(r1, r0)
            com.whatsapp.voipcalling.CallState[] r1 = com.whatsapp.voipcalling.CallState.values()
            int r0 = r8.arg1
            r11 = r1[r0]
            java.lang.Object r10 = r8.obj
            com.whatsapp.voipcalling.CallInfo r10 = (com.whatsapp.voipcalling.CallInfo) r10
            X.C17960vV.A02()
            if (r10 == 0) goto L_0x0ead
            com.whatsapp.voipcalling.CallState r0 = r10.callState
            if (r11 == r0) goto L_0x0ead
            java.lang.String r0 = r10.callId
            X.8Ct r0 = r3.A0R(r0)
            boolean r20 = X.AnonymousClass000.A1W(r0)
            com.whatsapp.voipcalling.CallState r9 = r10.callState
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/callStateChangedOnUIThread from "
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = " to "
            r5.append(r0)
            r5.append(r9)
            java.lang.String r1 = " in UI Main thread. selfManagedConnection = "
            r0 = r20
            X.C17900vP.A0n(r1, r5, r0)
            com.whatsapp.jid.GroupJid r15 = r10.groupJid
            if (r15 == 0) goto L_0x0e31
            r19 = r15
        L_0x0a83:
            X.1VT r7 = r3.A32
            java.lang.String r5 = r10.callId
            X.AWl r1 = new X.AWl
            r0 = r19
            r1.<init>(r0, r9, r5, r2)
            r7.notifyAllObservers(r1)
        L_0x0a91:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r9 != r0) goto L_0x0aa2
            long r0 = r3.A08
            r7 = -1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0aa2
            r0 = 8
            r3.A0j(r0)
        L_0x0aa2:
            com.whatsapp.voipcalling.CallState r13 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            java.lang.String r16 = "refresh_notification"
            r7 = 0
            r5 = 0
            if (r9 != r13) goto L_0x0d02
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r11 == r0) goto L_0x0d0d
            boolean r0 = r3.A1m
            if (r0 != 0) goto L_0x0cd4
            java.util.Set r1 = r3.A3h
            java.lang.String r0 = r10.callId
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0cd0
            boolean r0 = r10.isGroupCall
            if (r0 == 0) goto L_0x0cd0
            X.195 r0 = r3.A1w
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0cd0
            X.0ve r14 = r3.A2p
            r1 = 12245(0x2fd5, float:1.7159E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r14, r1)
            if (r0 <= 0) goto L_0x0cd0
            long r0 = X.AnonymousClass8BR.A05(r14, r1)
            java.util.Set r15 = r3.A3f
            java.lang.String r14 = r10.callId
            r15.add(r14)
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()
            java.lang.String r14 = "voip/callStateChangedOnUIThread delaying showing incoming call by "
            r15.append(r14)
            r15.append(r0)
            java.lang.String r14 = " ms"
            X.C17890vO.A1A(r15, r14)
        L_0x0aef:
            boolean r14 = r3.A1B()
            if (r14 == 0) goto L_0x0cb7
            long r14 = android.os.SystemClock.elapsedRealtime()
            r3.A0A = r14
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0cb0
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r7 = "VoiceService/delayAddIncomingCallToTelecom delay = "
            X.C17900vP.A0m(r7, r8, r0)
            android.os.Handler r7 = r3.A0H
            r8 = 64
            r7.removeMessages(r8)
            android.os.Handler r7 = r3.A0H
            r7.sendEmptyMessageDelayed(r8, r0)
        L_0x0b14:
            X.0ve r8 = r3.A2p
            r0 = 4809(0x12c9, float:6.739E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x0c9a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r11 != r0) goto L_0x0c9a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r9 != r0) goto L_0x0ca8
            X.1V7 r13 = r3.A2J
            X.A69 r1 = new X.A69
            r0 = r16
            r1.<init>(r0)
            r13.A00(r1)
        L_0x0b34:
            boolean r0 = r10.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0b3f
            X.A7v r0 = r3.A0X
            r0.A06()
        L_0x0b3f:
            boolean r0 = r3.A0J()
            if (r0 != 0) goto L_0x0b51
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r9 != r0) goto L_0x0c88
            X.Adx r0 = r3.A0R
            X.C17960vV.A07(r0)
            r0.A04(r10)
        L_0x0b51:
            X.E9o r0 = r3.A0S
            if (r0 == 0) goto L_0x0b58
            r0.CQY(r10)
        L_0x0b58:
            X.BCr r13 = r3.A0f
            if (r13 == 0) goto L_0x0c84
            r0 = r13
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            boolean r0 = r0.A2F
            r18 = r0
            int r4 = r10.callResult
            boolean r0 = r10.isGroupCall
            r1 = 0
            if (r0 != 0) goto L_0x0c00
            if (r4 == 0) goto L_0x0c00
            com.whatsapp.fieldstats.events.WamCall r14 = r3.A0l
            if (r14 == 0) goto L_0x0c00
            java.lang.Integer r0 = r14.xmppStatus
            if (r0 == 0) goto L_0x0c00
            java.lang.Integer r0 = r14.callRelayBindStatus
            if (r0 == 0) goto L_0x0c00
            java.lang.Boolean r0 = r14.callEndReconnecting
            if (r0 == 0) goto L_0x0c00
            r0 = 9165(0x23cd, float:1.2843E-41)
            int r17 = X.C18020vd.A00(r7, r8, r0)
            if (r17 == 0) goto L_0x0c00
            r0 = r17 & 1
            r16 = 8
            if (r0 <= 0) goto L_0x0b9a
            r0 = r16
            if (r4 != r0) goto L_0x0b9a
            com.whatsapp.fieldstats.events.WamCall r0 = r3.A0l
            java.lang.Integer r0 = r0.xmppStatus
            int r14 = r0.intValue()
            r0 = 3
            r15 = 1
            if (r14 == r0) goto L_0x0b9b
        L_0x0b9a:
            r15 = 0
        L_0x0b9b:
            r3.A1K = r15
            if (r15 != 0) goto L_0x0c81
            int r0 = r17 >> 1
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x0bb4
            r0 = r16
            if (r4 != r0) goto L_0x0bb4
            com.whatsapp.fieldstats.events.WamCall r0 = r3.A0l
            java.lang.Integer r0 = r0.xmppStatus
            int r14 = r0.intValue()
            r0 = 1
            if (r14 == r6) goto L_0x0bb5
        L_0x0bb4:
            r0 = 0
        L_0x0bb5:
            r3.A1K = r0
            if (r0 != 0) goto L_0x0c81
            int r0 = r17 >> 2
            r0 = r0 & 1
            r14 = 10
            if (r0 <= 0) goto L_0x0bce
            if (r4 != r14) goto L_0x0bce
            com.whatsapp.fieldstats.events.WamCall r0 = r3.A0l
            java.lang.Integer r0 = r0.callRelayBindStatus
            int r15 = r0.intValue()
            r0 = 1
            if (r15 == r2) goto L_0x0bcf
        L_0x0bce:
            r0 = 0
        L_0x0bcf:
            r3.A1K = r0
            if (r0 != 0) goto L_0x0c81
            int r0 = r17 >> 3
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x0be6
            if (r4 != r14) goto L_0x0be6
            com.whatsapp.fieldstats.events.WamCall r0 = r3.A0l
            java.lang.Integer r0 = r0.callRelayBindStatus
            int r14 = r0.intValue()
            r0 = 1
            if (r14 == r6) goto L_0x0be7
        L_0x0be6:
            r0 = 0
        L_0x0be7:
            r3.A1K = r0
            if (r0 != 0) goto L_0x0c81
            int r0 = r17 >> 7
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x0bfe
            if (r4 != r2) goto L_0x0bfe
            com.whatsapp.fieldstats.events.WamCall r0 = r3.A0l
            java.lang.Boolean r0 = r0.callEndReconnecting
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0bfe
            r1 = 1
        L_0x0bfe:
            r3.A1K = r1
        L_0x0c00:
            r13.BE4(r10, r11, r1)
        L_0x0c03:
            X.8yP r0 = r3.A2D
            r0.A0C(r10)
            r0 = 12059(0x2f1b, float:1.6898E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x0c65
            X.8fd r1 = new X.8fd
            r1.<init>(r3, r10)
            X.Aeq r0 = new X.Aeq
            r21 = r0
            r22 = r3
            r23 = r19
            r24 = r10
            r25 = r11
            r26 = r9
            r27 = r18
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r1.A09(r0)
            X.AlA r0 = r3.A2L
            r0.execute(r1)
        L_0x0c30:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r11 != r0) goto L_0x0c3f
            X.1VE r0 = r3.A2A
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "screen_sharing_backward_compat_shown"
            X.C17880vN.A1F(r1, r0, r5)
        L_0x0c3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r12) goto L_0x0ead
            if (r20 == 0) goto L_0x0ead
            X.1VM r1 = r3.A2K
            java.lang.String r0 = r10.callId
            X.8Ct r3 = r1.A04(r0)
            if (r3 == 0) goto L_0x0ead
            int r1 = r9.ordinal()
            if (r1 == r2) goto L_0x0e4b
            r0 = 10
            if (r1 == r0) goto L_0x0e48
            r0 = 6
            if (r1 == r0) goto L_0x0e48
            r0 = 3
            if (r1 == r0) goto L_0x0e44
            if (r1 == r5) goto L_0x0e39
            r0 = 7
            if (r1 == r0) goto L_0x0e39
            return r2
        L_0x0c65:
            X.0zA r0 = A01(r3, r10)
            java.lang.Object r0 = r0.A04()
            X.9Bw r0 = (X.C178119Bw) r0
            r21 = r3
            r22 = r19
            r23 = r10
            r24 = r0
            r25 = r11
            r26 = r9
            r27 = r18
            A0A(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0c30
        L_0x0c81:
            r1 = 1
            goto L_0x0c00
        L_0x0c84:
            r18 = 0
            goto L_0x0c03
        L_0x0c88:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r9 == r0) goto L_0x0b51
            boolean r0 = r3.A1P
            if (r0 != 0) goto L_0x0b51
            X.Adx r0 = r3.A0R
            X.C17960vV.A07(r0)
            r0.A06(r10, r4)
            goto L_0x0b51
        L_0x0c9a:
            if (r11 != r13) goto L_0x0ca8
            boolean r0 = r3.A1H
            X.1Md r14 = r3.A2I
            java.lang.String r1 = r10.callId
            if (r0 == 0) goto L_0x0cac
            r0 = 4
            r14.A04(r1, r0)
        L_0x0ca8:
            if (r9 == r13) goto L_0x0b3f
            goto L_0x0b34
        L_0x0cac:
            r14.A01(r1)
            goto L_0x0ca8
        L_0x0cb0:
            boolean r0 = r3.A0O(r10, r5)
            if (r0 != 0) goto L_0x0b14
            return r2
        L_0x0cb7:
            r3.A0A = r7
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x0cc2
            r3.A0q(r0)
            goto L_0x0b14
        L_0x0cc2:
            boolean r0 = r3.A1H
            if (r0 == 0) goto L_0x0ccd
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x0cc8:
            r3.A0q(r0)
            goto L_0x0b14
        L_0x0ccd:
            r0 = 0
            goto L_0x0cc8
        L_0x0cd0:
            r0 = 0
            goto L_0x0aef
        L_0x0cd4:
            r3.A1m = r5
            com.whatsapp.jid.UserJid r23 = X.C108955ca.A0T(r10)
            boolean r8 = r10.videoEnabled
            java.lang.String r7 = r10.callId
            boolean r1 = r10.isGroupCall
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            r28 = r5
            r21 = r3
            r22 = r0
            r24 = r7
            r25 = r5
            r26 = r8
            r27 = r1
            r21.A0u(r22, r23, r24, r25, r26, r27, r28)
            A0D(r3, r10, r6)
            r3.A1P = r5
            X.Adx r0 = r3.A0R
            X.C17960vV.A07(r0)
            r0.A04(r10)
            goto L_0x0b14
        L_0x0d02:
            if (r11 != r13) goto L_0x0d0d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r9 != r0) goto L_0x0d0d
            A0D(r3, r10, r6)
            goto L_0x0b14
        L_0x0d0d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r9 != r0) goto L_0x0d69
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r11 != r0) goto L_0x0d69
            r3.A0A = r7
            boolean r0 = r10.isAudioChat()
            if (r0 == 0) goto L_0x0d5b
            if (r15 == 0) goto L_0x0d5b
            X.1KB r7 = r3.A22
            X.1FR r0 = r7.A00
            if (r0 == 0) goto L_0x0d5b
            X.0ve r0 = r3.A2p
            boolean r0 = X.C40811vJ.A0X(r0)
            if (r0 == 0) goto L_0x0d5b
            java.lang.String r1 = r10.callId
            java.lang.String r0 = r3.A19
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0d5b
            X.1FR r8 = r7.A00
            X.00H r14 = r3.A3J
            X.17w r0 = X.AnonymousClass3MW.A0c(r14)
            java.lang.Class<X.17a> r7 = X.C216917a.class
            r0.A01(r7)
            java.lang.String r0 = r10.callId
            X.C18070vi.A0d(r0, r5)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = X.C87394Vk.A00(r0)
            X.17w r0 = X.AnonymousClass3MW.A0c(r14)
            r0.A01(r7)
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r8.CMk(r1, r0)
            goto L_0x0b14
        L_0x0d5b:
            boolean r0 = r3.A1H
            if (r0 == 0) goto L_0x0d66
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x0d61:
            r3.A0q(r0)
            goto L_0x0b14
        L_0x0d66:
            r0 = 0
            goto L_0x0d61
        L_0x0d69:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r9 != r0) goto L_0x0d76
            boolean r0 = r3.A1a
            if (r0 != 0) goto L_0x0d76
            A0D(r3, r10, r6)
            goto L_0x0b14
        L_0x0d76:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r9 != r0) goto L_0x0d83
            r3.A1P = r5
            android.os.Handler r0 = r3.A0H
            r0.removeMessages(r2)
            goto L_0x0b14
        L_0x0d83:
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r9 != r7) goto L_0x0d8d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.BCALL_STARTING
            if (r11 != r0) goto L_0x0d91
            goto L_0x0b14
        L_0x0d8d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r9 != r0) goto L_0x0b14
        L_0x0d91:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r11 != r0) goto L_0x0da3
            boolean r0 = r3.A0J()
            if (r0 != 0) goto L_0x0da3
            X.Adx r0 = r3.A0R
            X.C17960vV.A07(r0)
            r0.A04(r10)
        L_0x0da3:
            X.1V7 r8 = r3.A2J
            X.A69 r1 = new X.A69
            r0 = r16
            r1.<init>(r0)
            r8.A00(r1)
            boolean r0 = r3.A1S
            if (r0 == 0) goto L_0x0dc6
            if (r9 != r7) goto L_0x0db9
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r11 != r0) goto L_0x0dbd
        L_0x0db9:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r11 != r0) goto L_0x0dc6
        L_0x0dbd:
            X.BCr r0 = r3.A0f
            if (r0 == 0) goto L_0x0dc6
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.voipcalling.VoipActivityV2.A1g(r0, r5)
        L_0x0dc6:
            X.00H r0 = r3.A35
            java.lang.Object r8 = r0.get()
            X.6wm r8 = (X.C138256wm) r8
            int r15 = r8.A01
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r15 < r0) goto L_0x0ded
            r0 = 256(0x100, float:3.59E-43)
            if (r15 > r0) goto L_0x0ded
            if (r15 == 0) goto L_0x0ded
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AudioLevelController/applyAudioLevelBase "
            X.C17900vP.A0j(r0, r1, r15)
            int r1 = r8.A00
            int r0 = r8.A01
            int r1 = r1 + r0
            r8.A00 = r1
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r1)
        L_0x0ded:
            if (r20 == 0) goto L_0x0e06
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r12) goto L_0x0e06
            X.1VM r1 = r3.A2K
            java.lang.String r0 = r10.callId
            X.8Ct r1 = r1.A04(r0)
            if (r1 == 0) goto L_0x0e06
            int r0 = r1.getConnectionCapabilities()
            r0 = r0 | 1
            r1.setConnectionCapabilities(r0)
        L_0x0e06:
            if (r9 != r7) goto L_0x0b14
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r11 != r0) goto L_0x0e15
            java.lang.String r7 = r10.callId
            r1 = 51
            java.lang.String r0 = "lonelyStateNotification"
            r14.BEK(r1, r7, r0)
        L_0x0e15:
            com.whatsapp.jid.GroupJid r8 = r10.groupJid
            java.lang.String r7 = r10.scheduledId
            if (r8 == 0) goto L_0x0b14
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0b14
            boolean r0 = r3.A3l
            if (r0 == 0) goto L_0x0b14
            X.10I r1 = r3.A31
            X.AkY r0 = new X.AkY
            r0.<init>(r3, r8, r7, r6)
            r1.CGN(r0)
            goto L_0x0b14
        L_0x0e31:
            com.whatsapp.jid.UserJid r19 = r10.getInitialPeerJid()
            if (r19 == 0) goto L_0x0a91
            goto L_0x0a83
        L_0x0e39:
            int r0 = A00(r10)
            r3.A08(r0)
            r3.setAudioModeIsVoip(r5)
            return r2
        L_0x0e44:
            r3.setRinging()
            return r2
        L_0x0e48:
            r3.setActive()
        L_0x0e4b:
            r3.setAudioModeIsVoip(r2)
            return r2
        L_0x0e4f:
            X.9oa r0 = r3.A1o
            double r0 = r0.A00()
            r3.A01 = r0
            return r2
        L_0x0e58:
            long r4 = r3.A0A
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0e81
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r4)
            r3.A11 = r0
            goto L_0x0e81
        L_0x0e69:
            java.lang.String r4 = "voip/commonHandler/HANDLER_WHAT_OFFLINE_COMPLETE"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            long r5 = r3.A0A
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0e89
            android.os.Handler r4 = r3.A0H
            boolean r4 = r4.hasMessages(r2)
            if (r4 == 0) goto L_0x0e89
            android.os.Handler r0 = r3.A0H
            r0.removeMessages(r2)
        L_0x0e81:
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            r3.A0w(r0, r7)
            return r2
        L_0x0e89:
            long r5 = r3.A0A
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0ead
            android.os.Handler r0 = r3.A0H
            r1 = 64
            boolean r0 = r0.hasMessages(r1)
            if (r0 == 0) goto L_0x0ead
            android.os.Handler r0 = r3.A0H
            r0.removeMessages(r1)
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            r3.A0O(r0, r7)
            return r2
        L_0x0ea6:
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r3)
            r3.A0O(r0, r2)
        L_0x0ead:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A1D(android.os.Message):boolean");
    }

    public boolean A1F(C178119Bw r3) {
        C18030ve r0 = this.A2p;
        AnonymousClass11S r1 = this.A23;
        if (C40811vJ.A0F(r1, r0) || r3.A0W() || r1.A0N()) {
            return true;
        }
        return false;
    }

    private void A04() {
        A09(this);
        C17960vV.A02();
        try {
            if (this.A0L != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0L.release();
                this.A0L = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            this.A0L = null;
        }
    }

    public static void A09(A99 a99) {
        C17960vV.A02();
        try {
            if (a99.A0M != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                a99.A0M.release();
                a99.A0M = null;
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            a99.A0M = null;
        }
        if (C18020vd.A05(C18040vf.A01, a99.A2p, 6747)) {
            C200710s r3 = a99.A0q;
            if (r3 == null) {
                r3 = C200710s.A00(a99.A31);
                a99.A0q = r3;
            }
            r3.A03();
            r3.execute(new C146427Pb(a99.A0k, 39));
        } else {
            a99.A0k.A00((C107215Yv) null);
        }
        a99.A1J = false;
    }

    public static void A0E(A99 a99, CallInfo callInfo, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String str;
        C17960vV.A02();
        CallInfo callInfo2 = callInfo;
        if (callInfo == null || callInfo2.callEnding || callInfo2.callState == CallState.PRECALLING) {
            Log.e("do not create notification, we are not in a active call");
            return;
        }
        A99 a992 = a99;
        if (!(!C61182pG.A00((C61182pG) a992.A3I.get()))) {
            Log.i("VoiceService/startForegroundService policy prevents notification, skipping");
            return;
        }
        boolean hasPendingCall = callInfo2.hasPendingCall();
        if (hasPendingCall || (!a992.A2J.A06.get() && !a992.A1R)) {
            z4 = true;
            C24911Md r2 = a992.A2I;
            if (hasPendingCall) {
                str = callInfo2.callWaitingInfo.A04;
            } else {
                str = callInfo2.callId;
            }
            r2.A03(str, "build_voip_notification");
        } else {
            z4 = false;
        }
        C138686xW A002 = C138686xW.A00(callInfo2, -1, a992.A1a);
        if (z4) {
            C24911Md r22 = a992.A2I;
            String str2 = A002.A06;
            r22.A03(str2, "start_foreground_service");
            if (hasPendingCall) {
                r22.A01(str2);
            }
        }
        int i2 = i;
        if (a992.A1S) {
            Log.i("VoiceService/startForegroundService Background restrictions on");
            a992.A05(A002, i2, false, a992.A1S);
            AnonymousClass1BI r1 = callInfo2.groupJid;
            if (!(r1 == null && (r1 = callInfo2.getCreatorJid()) == null)) {
                a992.A2X.A0C(r1, 0);
            }
        } else {
            C18030ve r23 = a992.A2p;
            C18040vf r12 = C18040vf.A02;
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z3;
            if (C18020vd.A05(r12, r23, 7070)) {
                Notification A062 = a992.A2H.A06(a992.A1r, A002, a992.A2J, i2, a992.A1S);
                if (a992.A0p == null) {
                    a992.A0p = new C200710s(a992.A31, true);
                }
                C27339DcB dcB = new C27339DcB(new C21497Al6(A062, a992, callInfo2, z6, z7, z5));
                AJS ajs = new AJS(A002, a992, callInfo2, i2);
                dcB.BBG(new C70713Cf(ajs, dcB, 7), a992.A0p);
                a992.A0p.execute(dcB);
                return;
            } else if (z || !C18020vd.A05(r12, r23, 12430)) {
                if (!A0K(a992.A2H.A06(a992.A1r, A002, a992.A2J, i2, a992.A1S), a992, z6, callInfo2.videoEnabled, z7, z5)) {
                    Log.i("VoiceService/startForegroundService Failed to start foreground service so notifying using waNotificationManager");
                    a992.A05(A002, i2, false, true);
                    AnonymousClass1BI r13 = callInfo2.groupJid;
                    if (!(r13 == null && (r13 = callInfo2.getCreatorJid()) == null)) {
                        a992.A2X.A0C(r13, 0);
                    }
                } else {
                    return;
                }
            } else {
                if (a992.A0o == null) {
                    a992.A0o = new C200710s(a992.A31, true);
                }
                C27339DcB dcB2 = new C27339DcB(new C21493Al2(A002, a992, i2));
                AJT ajt = new AJT(A002, a992, callInfo2, i2, z6, z7);
                dcB2.BBG(new C70713Cf(ajt, dcB2, 7), a992.A0o);
                a992.A0o.execute(dcB2);
                return;
            }
        }
        a992.A1R = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(X.A99 r13, com.whatsapp.voipcalling.CallInfo r14, long r15) {
        /*
            X.C17960vV.A02()
            if (r14 == 0) goto L_0x00d0
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0010
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r3 = 0
            if (r1 != r0) goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            X.0ve r2 = r13.A2p
            X.0vf r1 = X.C18040vf.A01
            r0 = 8032(0x1f60, float:1.1255E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00c0
            long r7 = com.whatsapp.voipcalling.Voip.getCallDuration()
            X.00H r0 = r13.A3E
            java.lang.Object r0 = r0.get()
            X.4Yd r0 = (X.C88054Yd) r0
            r0.A02(r7)
        L_0x002c:
            if (r3 == 0) goto L_0x0048
            X.1VT r3 = r13.A32
            boolean r9 = r14.videoEnabled
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            boolean r10 = X.AnonymousClass000.A1Z(r1, r0)
            boolean r11 = r14.isAudioChat()
            boolean r12 = r14.isGroupCall
            X.AWp r6 = new X.AWp
            r6.<init>(r7, r9, r10, r11, r12)
            r3.notifyAllObservers(r6)
        L_0x0048:
            X.A7v r3 = r13.A0X
            boolean r0 = r3.A08(r14)
            if (r0 == 0) goto L_0x0056
            int r1 = r3.A00
            int r0 = r3.A06
            if (r1 >= r0) goto L_0x005f
        L_0x0056:
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x005f
            r3.A05()
        L_0x005f:
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x006e
            boolean r0 = r14.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x006e
            r3.A06()
        L_0x006e:
            X.BCr r1 = r13.A0f
            if (r1 == 0) goto L_0x0088
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            X.C17960vV.A02()
            java.lang.String r0 = r1.A21
            if (r0 == 0) goto L_0x0085
            boolean r0 = X.AnonymousClass8BU.A1U(r14, r0)
            if (r0 == 0) goto L_0x0085
            com.whatsapp.voipcalling.CallInfo r14 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r14)
        L_0x0085:
            com.whatsapp.voipcalling.VoipActivityV2.A1K(r14, r1)
        L_0x0088:
            X.8yP r1 = r13.A2D
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00a0
            long r3 = r1.A00
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            X.AWc r0 = new X.AWc
            r0.<init>(r7)
            r1.notifyAllObservers(r0)
            r1.A00 = r15
        L_0x00a0:
            X.9oa r0 = r13.A1o
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r0.A02
            long r5 = r5 - r0
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            r1 = 8437(0x20f5, float:1.1823E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            X.9oa r3 = r13.A1o
            if (r0 != 0) goto L_0x00c4
            r3.A01(r7)
        L_0x00bf:
            return
        L_0x00c0:
            long r7 = r14.callDuration
            goto L_0x002c
        L_0x00c4:
            X.10I r2 = r13.A31
            r1 = 4
            X.7Ph r0 = new X.7Ph
            r0.<init>(r3, r7, r1)
            r2.CGF(r0)
            return
        L_0x00d0:
            java.lang.String r0 = "voip/periodicalUpdateHandler we are not in an active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0F(X.A99, com.whatsapp.voipcalling.CallInfo, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r4.A1Y != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(X.C178119Bw r5, boolean r6) {
        /*
            r4 = this;
            X.C178119Bw.A00(r5)
            int r0 = r5.A09
            r1 = 3
            if (r0 == r1) goto L_0x0028
            int r0 = r5.A07
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 != 0) goto L_0x0028
            X.1VT r3 = r4.A32
            if (r6 != 0) goto L_0x0019
            boolean r0 = r4.A1Y
            r2 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            java.lang.String r0 = "voip/notifyCallMissed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            X.AWh r0 = new X.AWh
            r0.<init>(r1, r5, r2)
            r3.notifyAllObservers(r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0H(X.9Bw, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0239, code lost:
        if (r0.A00 != 2) goto L_0x023b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(com.whatsapp.voipcalling.CallState r13, com.whatsapp.voipcalling.CallInfo r14) {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/stop "
            X.C17900vP.A0Y(r12, r0, r1)
            X.C17960vV.A02()
            r3 = r12
            monitor-enter(r3)
            X.1V7 r1 = r12.A2J     // Catch:{ all -> 0x0317 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A06     // Catch:{ all -> 0x0317 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x002e
            X.118 r0 = r1.A01     // Catch:{ all -> 0x0317 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0317 }
            X.00H r0 = r1.A04     // Catch:{ all -> 0x0317 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0317 }
            X.6ze r1 = (X.C139916ze) r1     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = "voicefgservice/stop-service"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0317 }
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            r1.A03(r2, r0)     // Catch:{ all -> 0x0317 }
        L_0x002e:
            boolean r0 = r12.A1R     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "VoiceService/stopForegroundService cancel via waNotificationManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0317 }
            X.1Vn r2 = r12.A2d     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "VoiceService4"
            r0 = 23
            r2.BEJ(r0, r1)     // Catch:{ all -> 0x0317 }
            r0 = 0
            r12.A1R = r0     // Catch:{ all -> 0x0317 }
        L_0x0043:
            monitor-exit(r3)
            if (r14 == 0) goto L_0x0051
            java.lang.String r3 = r14.callId
            X.1Vn r2 = r12.A2d
            r1 = 51
            java.lang.String r0 = "lonelyStateNotification"
            r2.BEK(r1, r3, r0)
        L_0x0051:
            boolean r0 = r12.A1i
            if (r0 == 0) goto L_0x0316
            long r10 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            r12.A1i = r6
            X.C28291Zu.A01 = r6
            X.0ve r8 = r12.A2p
            r0 = 7175(0x1c07, float:1.0054E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x0075
            X.1VE r0 = r12.A2A
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "e2ee_shown_for_callid"
            X.C17880vN.A1B(r1, r0)
        L_0x0075:
            X.11S r0 = r12.A23
            boolean r0 = X.C40811vJ.A0G(r0, r8)
            if (r0 == 0) goto L_0x009c
            X.1VE r3 = r12.A2A
            boolean r0 = r3.A09()
            if (r0 != 0) goto L_0x009c
            X.0ve r1 = r3.A01
            r0 = 12289(0x3001, float:1.722E-41)
            boolean r2 = X.C18020vd.A05(r7, r1, r0)
            java.lang.String r1 = "hide_return_to_call_text_for_call"
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass3MZ.A08(r3)
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            if (r2 == 0) goto L_0x01c2
            r0.apply()
        L_0x009c:
            r2 = 0
            r12.A0A = r2
            r5 = 0
            r12.A11 = r5
            r12.A1F = r6
            r12.A1J = r6
            r12.A1a = r6
            r12.A1K = r6
            r12.A45 = r5
            r12.A46 = r5
            r12.A0l = r5
            r12.A1n = r5
            r12.A0t = r5
            r0 = 1500(0x5dc, float:2.102E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A0v = r0
            X.A7v r0 = r12.A0X
            if (r0 == 0) goto L_0x00c6
            r0.A02 = r5
            r0.A06()
        L_0x00c6:
            com.whatsapp.calling.service.OutgoingSignalingHandler r0 = r12.A0W
            if (r0 == 0) goto L_0x00cc
            r0.pendingCallOfferStanza = r5
        L_0x00cc:
            X.A7t r0 = r12.A0i
            if (r0 == 0) goto L_0x00d7
            X.2l3 r0 = r0.A03
            java.util.Set r0 = r0.A02
            r0.clear()
        L_0x00d7:
            r12.A0u = r5
            r12.A0z = r5
            r12.A1H = r6
            java.util.Set r0 = r12.A3h
            r0.clear()
            java.util.Set r0 = r12.A3f
            r0.clear()
            r12.A0d = r5
            r12.A0Z = r5
            r12.A0c = r5
            r12.A0b = r5
            r12.A0a = r5
            r12.A1B = r5
            r12.A1A = r5
            r4 = 1
            r12.A1l = r4
            r12.A0y = r5
            r12.A0w = r5
            r12.A1G = r6
            r12.A05 = r2
            r12.A1Q = r6
            X.00H r0 = r12.A35
            java.lang.Object r0 = r0.get()
            X.6wm r0 = (X.C138256wm) r0
            r0.A00 = r6
            r0.A01 = r6
            r12.A43 = r6
            java.util.Map r0 = r12.A3c
            r0.clear()
            java.util.Map r0 = r12.A3d
            r0.clear()
            java.util.Map r0 = r12.A3b
            r0.clear()
            r12.A1b = r6
            r12.A1I = r6
            X.9oa r9 = r12.A1o
            r9.A02 = r2
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r9.A01 = r0
            r9.A00 = r0
            r12.A0C = r2
            r12.A0B = r2
            r0 = -1
            r12.A09 = r0
            r12.A08 = r0
            A06(r12)
            r12.A10 = r5
            r12.A12 = r5
            r12.A1e = r6
            r12.A1d = r6
            r12.A1g = r6
            r12.A1f = r6
            r12.A1O = r6
            r12.A0x = r5
            r12.A07 = r2
            r12.A1N = r6
            r12.A1T = r6
            r12.A1U = r6
            X.00H r0 = r12.A3z
            java.lang.Object r0 = r0.get()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.clear()
            r12.A1W = r6
            java.util.Set r0 = r12.A1D
            r0.clear()
            r12.A47 = r6
            r12.A18 = r5
            r12.A19 = r5
            r12.A1X = r6
            r12.A1Y = r6
            X.1VP r0 = r12.A2F
            X.1VQ r0 = (X.AnonymousClass1VQ) r0
            r0.A01 = r5
            r12.A1P = r6
            android.telephony.TelephonyManager r1 = r12.A1s
            if (r1 != 0) goto L_0x01b4
            java.lang.String r0 = "voip/service/stop telephonyManager=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x017f:
            X.1cw r3 = r12.A2a
            android.content.Context r2 = r12.A1r
            android.content.BroadcastReceiver r0 = r12.A0D
            r3.A02(r0, r2)
            X.Adx r9 = r12.A0R
            if (r9 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/audio_route/onCallStop using telecom:"
            r1.append(r0)
            boolean r0 = r9.A06
            X.C17900vP.A0r(r1, r0)
            r9.A03 = r6
            r0 = 44
            X.AkD r1 = new X.AkD
            r1.<init>(r9, r0)
            X.10s r0 = r9.A0L
            r0.execute(r1)
        L_0x01a8:
            android.content.BroadcastReceiver r0 = r12.A0E
            r3.A02(r0, r2)
            A07(r12)
            r12.A04()
            goto L_0x01c7
        L_0x01b4:
            X.17x r0 = r12.A2e
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x017f
            android.telephony.PhoneStateListener r0 = r12.A0N
            r1.listen(r0, r6)
            goto L_0x017f
        L_0x01c2:
            r0.commit()
            goto L_0x009c
        L_0x01c7:
            X.11C r0 = r12.A2b     // Catch:{ Exception -> 0x01ef }
            android.os.PowerManager r3 = r0.A0G()     // Catch:{ Exception -> 0x01ef }
            if (r3 != 0) goto L_0x01d5
            java.lang.String r0 = "voice/service/turn-on-screen pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x01ef }
            goto L_0x01f3
        L_0x01d5:
            boolean r0 = r3.isScreenOn()     // Catch:{ Exception -> 0x01ef }
            if (r0 != 0) goto L_0x01f3
            java.lang.String r1 = "VoiceService end call"
            r0 = 268435466(0x1000000a, float:2.524358E-29)
            android.os.PowerManager$WakeLock r3 = X.C181789Rv.A00(r3, r1, r0)     // Catch:{ Exception -> 0x01ef }
            if (r3 == 0) goto L_0x01f3
            r0 = 1
            r3.acquire(r0)     // Catch:{ Exception -> 0x01ef }
            r3.release()     // Catch:{ Exception -> 0x01ef }
            goto L_0x01f3
        L_0x01ef:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01f3:
            android.media.SoundPool r0 = r12.A0F
            if (r0 == 0) goto L_0x030d
            X.00H r0 = r12.A3I
            r0.get()
            X.C18070vi.A0d(r13, r6)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r13 == r0) goto L_0x0207
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r13 != r0) goto L_0x030d
        L_0x0207:
            if (r14 == 0) goto L_0x030d
            X.2gu r0 = r14.callWaitingInfo
            if (r0 == 0) goto L_0x030d
            int r0 = r0.A01
            if (r0 != 0) goto L_0x030d
            boolean r0 = r14.isBotCall
            if (r0 != 0) goto L_0x030d
            boolean r0 = r12.A1c
            if (r0 == 0) goto L_0x0303
            X.1VE r0 = r12.A2A
            android.content.SharedPreferences r2 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r1 = "end_call_tone_duration_ms"
            r0 = 500(0x1f4, float:7.0E-43)
            int r3 = r2.getInt(r1, r0)
        L_0x0227:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/playEndCallTone duration: "
            X.C17900vP.A0j(r0, r1, r3)
            X.Adx r0 = r12.A0R
            if (r0 == 0) goto L_0x023b
            int r1 = r0.A00
            r0 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x023d
        L_0x023b:
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x023d:
            java.lang.Integer r1 = r12.A1q
            java.lang.String r0 = "endCall"
            r12.A10(r1, r0, r2, r2)
            android.os.Handler r0 = r12.A0J
            if (r0 == 0) goto L_0x0253
            r0.removeMessages(r4)
            android.os.Handler r2 = r12.A0J
            int r0 = r3 + 100
            long r0 = (long) r0
            r2.sendEmptyMessageDelayed(r4, r0)
        L_0x0253:
            android.os.Handler r0 = r12.A0I
            r0.removeCallbacksAndMessages(r5)
            r0 = 5938(0x1732, float:8.321E-42)
            int r0 = X.C18020vd.A00(r7, r8, r0)
            long r1 = X.C17890vO.A03(r0)
            X.1Hb r0 = r12.A2q
            r0.A00(r1)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f9
            java.lang.Runnable r3 = r12.A17
            if (r3 == 0) goto L_0x0278
            X.10I r0 = r12.A31
            r0.CEz(r3)
            r12.A17 = r5
        L_0x0278:
            X.10I r4 = r12.A31
            r3 = 34
            X.7Pb r0 = new X.7Pb
            r0.<init>(r12, r3)
            X.25d r0 = r4.CGv(r0, r1)
            r12.A17 = r0
        L_0x0287:
            android.os.Handler r0 = r12.A0J
            if (r0 == 0) goto L_0x028e
            r12.A0V()
        L_0x028e:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r10
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/stop elapsed "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " ms"
            X.C17890vO.A1A(r3, r0)
            java.lang.String r1 = "voip/service/stop"
            r2 = 4
            int r0 = com.whatsapp.util.Log.level
            if (r2 > r0) goto L_0x02bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "/total threads count = "
            r1.append(r0)
            int r0 = java.lang.Thread.activeCount()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            com.whatsapp.util.Log.log((int) r2, (java.lang.String) r0)
        L_0x02bf:
            boolean r2 = r12.A1Z
            X.00H r0 = r12.A3y
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            if (r2 == 0) goto L_0x02f3
            java.lang.String r0 = "video_call"
            r1.A01(r0, r6)
        L_0x02d0:
            X.00H r0 = r12.A3D
            java.lang.Object r0 = r0.get()
            X.9mr r0 = (X.C191599mr) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            r0.clear()
            X.E9o r0 = r12.A0S
            if (r0 == 0) goto L_0x0316
            X.DOs r0 = (X.C26996DOs) r0
            r0.A02 = r5
            r0.CNW()
            r0.A02 = r5
            r12.A0S = r5
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r12.A34
            r0.glassesService = r5
            r12.A1L = r6
            return
        L_0x02f3:
            java.lang.String r0 = "voice_call"
            r1.A01(r0, r6)
            goto L_0x02d0
        L_0x02f9:
            boolean r0 = A0L(r12)
            if (r0 == 0) goto L_0x0287
            com.whatsapp.voipcalling.Voip.cleanupUnfinishedCallStats()
            goto L_0x0287
        L_0x0303:
            int r3 = X.C40811vJ.A00(r2)
            if (r3 > 0) goto L_0x0227
            r3 = 500(0x1f4, float:7.0E-43)
            goto L_0x0227
        L_0x030d:
            X.Adx r0 = r12.A0R
            if (r0 == 0) goto L_0x0253
            r0.A02()
            goto L_0x0253
        L_0x0316:
            return
        L_0x0317:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0I(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (X.C196309up.A00(r1, "android.permission.CAMERA") == 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0K(android.app.Notification r9, X.A99 r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            boolean r0 = X.AnonymousClass112.A0A()
            r6 = 1
            r2 = r10
            r8 = r12
            r10 = r14
            if (r0 == 0) goto L_0x007a
            X.0ve r3 = r2.A2p
            X.0vf r1 = X.C18040vf.A01
            r0 = 11757(0x2ded, float:1.6475E-41)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            r4 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x006a
            android.content.Context r1 = r2.A1r
            X.1DC r0 = r2.A30
            if (r12 == 0) goto L_0x0034
            boolean r0 = r0.BcY()
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = X.C196309up.A00(r1, r0)
            r5 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = X.C196309up.A00(r1, r0)
            boolean r7 = X.AnonymousClass000.A1O(r0)
        L_0x003f:
            X.195 r1 = r2.A1w
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0047
            if (r14 == 0) goto L_0x004b
        L_0x0047:
            if (r5 != 0) goto L_0x004b
            if (r7 == 0) goto L_0x007a
        L_0x004b:
            java.util.Locale r3 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            boolean r0 = r1.A00
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            r1 = 0
            r2[r1] = r0
            X.AnonymousClass8BR.A1L(r2, r6, r7)
            r0 = 2
            X.AnonymousClass8BR.A1L(r2, r0, r5)
            r0 = 3
            X.AnonymousClass8BR.A1L(r2, r0, r4)
            java.lang.String r0 = "voiceService/startForegroundService/  Not starting foreground service because app is in background or missing mic/camera permission. isAppInBackground:%b, needMicPermission:%b, needCameraPermission: %b, isUsingPermissionChecker: %b"
            X.C108955ca.A1X(r0, r3, r2)
            return r1
        L_0x006a:
            r4 = 0
            X.1DC r1 = r2.A30
            X.17x r0 = r2.A2e
            boolean r5 = X.AnonymousClass74H.A0A(r0, r1, r12)
            boolean r0 = r0.A0E()
            r7 = r0 ^ 1
            goto L_0x003f
        L_0x007a:
            X.1V7 r1 = r2.A2J
            X.118 r0 = r1.A01
            android.content.Context r5 = r0.A00
            X.00H r0 = r1.A04
            java.lang.Object r6 = r0.get()
            X.6ze r6 = (X.C139916ze) r6
            r4 = r9
            r7 = r11
            r9 = r13
            boolean r0 = com.whatsapp.calling.service.VoiceFGService.A01(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0K(android.app.Notification, X.A99, boolean, boolean, boolean, boolean):boolean");
    }

    public static boolean A0M(C18030ve r2) {
        if (!C40811vJ.A0Y(r2) || (C18020vd.A00(C18040vf.A01, r2, 11758) & 4) == 0) {
            return false;
        }
        return true;
    }

    private boolean A0O(CallInfo callInfo, boolean z) {
        if (!C40811vJ.A0e(callInfo)) {
            Log.e("VoiceService/tryAddIncomingCallToTelecomOrShowIncomingCall no active call");
            return false;
        }
        List peerJids = callInfo.getPeerJids();
        boolean z2 = callInfo.videoEnabled;
        if (A1E(callInfo.groupJid, callInfo.callId, peerJids, z2, callInfo.isAudioChat())) {
            A0q(2000);
            return true;
        }
        long j = 0;
        this.A0A = 0;
        if (C63982u1.A00(this.A1s, this.A2e) != 0) {
            A0m(0, 4, callInfo.callId, "busy");
            return false;
        }
        if (!z && this.A1H) {
            j = 500;
        }
        A0q(j);
        A0D(this, callInfo, 2);
        return true;
    }

    public /* synthetic */ C27621Wu A0S(C21132Af0 af0, GroupJid groupJid, Integer num, String str, String str2, List list, CallParticipantJid[] callParticipantJidArr, int i, boolean z, boolean z2, boolean z3) {
        C161328Ct A0R2;
        int intValue = num.intValue();
        C21132Af0 af02 = af0;
        String str3 = str;
        CallParticipantJid[] callParticipantJidArr2 = callParticipantJidArr;
        if (intValue == 0) {
            AnonymousClass1HQ r4 = this.A29;
            af02.A09(new C21129Aex(this, groupJid, r4.BO3(), str3, str2, callParticipantJidArr2, i, z, z2));
            List list2 = list;
            if (!z2) {
                Context context = this.A1r;
                context.startActivity(AnonymousClass1LU.A1H(context, C108945cZ.A1A(this.A1w.A00), Boolean.valueOf(z3), true, 1, list2));
            }
            this.A1E.execute(new C21467AkY(this, list2, str3, 3));
            A0D(this, r4.BO3(), 2);
            return null;
        }
        C17900vP.A0f("voip/actionStartNewOutgoingCall failed to start call ", str3, AnonymousClass000.A10());
        C21133Af1.A00(af02, callParticipantJidArr2, this, 2);
        if (Build.VERSION.SDK_INT >= 28 && (A0R2 = A0R(str3)) != null) {
            A0R2.A08(9);
        }
        if (intValue != 670001) {
            A0I(CallState.NONE, (CallInfo) null);
        }
        return null;
    }

    public void A0T() {
        AnonymousClass8BX.A18(this);
        this.A1E.execute(new C21422Ajp(3));
    }

    public void A0X() {
        Looper looper;
        AnonymousClass1DS r0;
        C17900vP.A0Y(this, "voip/service/create ", AnonymousClass000.A10());
        C18030ve r10 = this.A2p;
        if (A0M(r10)) {
            Log.i("voip/service/create init() called for singleton");
            A03();
        }
        C18040vf r1 = C18040vf.A01;
        if (C18020vd.A05(r1, r10, 4934) || C18020vd.A05(r1, r10, 8032)) {
            HandlerThread handlerThread = new HandlerThread("voip-periodic-update");
            this.A0K = handlerThread;
            handlerThread.start();
            looper = this.A0K.getLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        this.A0I = new C161238Cj(looper, this);
        this.A0G = new Handler(new AAL(this, 1));
        this.A0J = new Handler(new AAL(this, 2));
        this.A0H = new Handler(new AAL(this, 3));
        AnonymousClass10I r11 = this.A31;
        this.A1E = r11.BHn("VoIP Signaling Thread", 1, false);
        C18040vf r12 = C18040vf.A02;
        int A002 = C18020vd.A00(r12, r10, 3784);
        if (A002 > 0) {
            C63282so r5 = new C63282so(this.A1x, (C33621j7) null, this.A2c, (AnonymousClass1Cd) null, r10, r11, (Runnable) null, C17890vO.A03(A002));
            this.A0r = r5;
            r5.A03("voip-signaling-thread", this.A1E);
            this.A0r.A01();
        }
        AnonymousClass190 r4 = this.A1x;
        AnonymousClass11C r52 = this.A2b;
        this.A0k = new AnonymousClass4R3(r4, r52);
        this.A0N = new C161338Cu(this);
        this.A0D = new C161128Bv(this, 10);
        this.A0E = new C161128Bv(this, 11);
        this.A0j = new C93654jK(this, 1);
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        Log.i("voip/audio_route/init");
        adx.A0K.A02 = AnonymousClass3MW.A0z(adx);
        if (C21067Adx.A0O) {
            adx.A0G.A08(adx.A0F);
        }
        C186599eS r02 = this.A2B;
        C17960vV.A02();
        C22851Dl r42 = r02.A01;
        if (r42 != null) {
            C03190Gy r03 = r02.A00;
            if (r03 == null) {
                r0 = C108965cb.A0D(0);
            } else {
                r0 = r03.A00;
            }
            r0.A0C(r42);
        }
        VoipCameraManager voipCameraManager = this.A34;
        Context context = this.A1r;
        AnonymousClass1HQ r14 = this.A29;
        voipCameraManager.setCaptureDeviceFactory(new C21135Af6(context, r14, (A1P) this.A3T.get(), (ScreenShareResourceManager) this.A3U.get(), r52, r10, this.A30));
        C20111A7t a7t = this.A0i;
        C17960vV.A07(a7t);
        a7t.A05.registerObserver(a7t.A04);
        a7t.A01.registerObserver(a7t.A00);
        a7t.A0A.registerObserver(a7t.A09);
        AnonymousClass1LD r43 = this.A2x;
        this.A1b = r43.A01();
        r43.registerObserver(this.A2w);
        C20457ALu aLu = new C20457ALu(this, 1);
        this.A0P = aLu;
        this.A26.registerObserver(aLu);
        this.A0m = new C21009Ad1(this);
        C17880vN.A0V(this.A3N).registerObserver(this.A0m);
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass8lO A0P2 = A0P();
            this.A0h = A0P2;
            this.A2K.A08(A0P2);
        } else {
            this.A0h = null;
        }
        Voip.setVoipStackLogLevel(C18020vd.A00(r12, r10, 4028));
        Voip.nativeRegisterJNIUtils(this.A33);
        Voip.nativeRegisterEventCallback(this.A0e);
        if (Voip.A00 == null) {
            DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A23);
            Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
            Voip.A00 = defaultCryptoCallback;
        }
        OutgoingSignalingHandler outgoingSignalingHandler = this.A0W;
        Voip.nativeRegisterSignalingXmppCallback(outgoingSignalingHandler);
        Voip.A02 = outgoingSignalingHandler;
        if (Build.VERSION.SDK_INT >= 22) {
            C20075A6b a6b = new C20075A6b(r52.A0E(), r14);
            this.A0Q = a6b;
            a6b.A04();
        } else {
            this.A0Q = null;
        }
        Voip.setEnableAudioEffectAvailabilityCache(C18020vd.A05(r12, r10, 4247));
        if (!C18020vd.A05(r12, r10, 12717) && C18020vd.A05(r12, this.A2O.A00, 4349)) {
            r11.CGF(new C146427Pb(this, 41));
        }
        C28291Zu.A00 = true;
        Log.i("voip/service/created");
    }

    public void A0Y() {
        C20075A6b a6b;
        AnonymousClass1DS r0;
        C17900vP.A0Y(this, "voip/service/destroy ", AnonymousClass000.A10());
        C28291Zu.A00 = false;
        try {
            this.A0X.A06();
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        A0a();
        SoundPool soundPool = this.A0F;
        if (soundPool != null) {
            this.A1q = null;
            this.A1p = null;
            if (C18020vd.A05(C18040vf.A02, this.A2p, 6569)) {
                this.A31.CGF(new C146427Pb(soundPool, 35));
            } else {
                soundPool.release();
            }
            this.A0F = null;
        }
        this.A34.setCaptureDeviceFactory((B60) null);
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        Log.i("voip/audio_route/deinit");
        adx.A02 = true;
        if (C21067Adx.A0O) {
            adx.A0G.A09(adx.A0F);
        }
        adx.A0K.A02 = null;
        C186599eS r02 = this.A2B;
        C17960vV.A02();
        C22851Dl r1 = r02.A01;
        if (r1 != null) {
            C03190Gy r03 = r02.A00;
            if (r03 == null) {
                r0 = C108965cb.A0D(0);
            } else {
                r0 = r03.A00;
            }
            r0.A0D(r1);
        }
        A04();
        if (Build.VERSION.SDK_INT >= 22 && (a6b = this.A0Q) != null) {
            a6b.A03();
            this.A0Q = null;
        }
        Voip.nativeUnregisterJNIUtils();
        Voip.nativeUnregisterEventCallback();
        Voip.nativeUnregisterSignalingXmppCallback();
        Voip.A02 = null;
        if (Voip.A00 != null && A0M(this.A2p)) {
            Voip.nativeUnregisterCryptoCallback();
            Voip.A00 = null;
        }
        C20111A7t a7t = this.A0i;
        C17960vV.A07(a7t);
        a7t.A05.unregisterObserver(a7t.A04);
        a7t.A01.unregisterObserver(a7t.A00);
        a7t.A0A.unregisterObserver(a7t.A09);
        this.A2x.unregisterObserver(this.A2w);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.A1E;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdown();
            this.A1E = null;
            C63282so r12 = this.A0r;
            if (r12 != null) {
                synchronized (r12) {
                    r12.A04.clear();
                    r12.A05.clear();
                    r12.A03.clear();
                    r12.A06.clear();
                }
                this.A0r = null;
            }
        }
        C200710s r04 = this.A0p;
        if (r04 != null) {
            r04.A03();
            this.A0p = null;
        }
        C200710s r05 = this.A0o;
        if (r05 != null) {
            r05.A03();
            this.A0o = null;
        }
        HandlerThread handlerThread = this.A0K;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A0K = null;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/service/destroyed pendingCommands: ");
        List<A69> list = this.A42;
        C17900vP.A0o(A102, list.size());
        C18030ve r6 = this.A2p;
        if (C40811vJ.A0Y(r6)) {
            this.A1j = false;
        }
        for (A69 A002 : list) {
            this.A2J.A00(A002);
        }
        list.clear();
        if (Build.VERSION.SDK_INT >= 28 && this.A0h != null) {
            AnonymousClass1VM r3 = this.A2K;
            C17960vV.A0F(AnonymousClass000.A1P(r3.A01()), "Self managed connections are not disconnected when VoiceService is being destroyed");
            r3.A05();
            r3.A09(this.A0h);
            this.A0h = null;
        }
        this.A26.unregisterObserver(this.A0P);
        C17880vN.A0V(this.A3N).unregisterObserver(this.A0m);
        if (this.A1S && Build.VERSION.SDK_INT >= 28) {
            for (StatusBarNotification id : this.A2t.A0Q()) {
                if (id.getId() == 23) {
                    this.A1x.A0G("VoiceService/onDestroy", "voip/orphannotification", true);
                }
            }
        }
        if (A0M(r6)) {
            Log.i("voip/service/destroyed deinit() called for singleton");
            C20111A7t a7t2 = this.A0i;
            if (a7t2 != null) {
                a7t2.A05.unregisterObserver(a7t2.A04);
                a7t2.A01.unregisterObserver(a7t2.A00);
                a7t2.A0A.unregisterObserver(a7t2.A09);
            }
            this.A0P = null;
            this.A0m = null;
            this.A0i = null;
            this.A0V = null;
            this.A0W = null;
            this.A0R = null;
            this.A0e = null;
            this.A0X = null;
            this.A0G.removeCallbacksAndMessages((Object) null);
            this.A0G = null;
            this.A0I.removeCallbacksAndMessages((Object) null);
            this.A0J.removeCallbacksAndMessages((Object) null);
            this.A0J = null;
            this.A0H.removeCallbacksAndMessages((Object) null);
            this.A0N = null;
            this.A0D = null;
            this.A0E = null;
            this.A0g = null;
            this.A3g.clear();
            this.A3i.clear();
            A4B.set(0);
            this.A1Z = false;
            this.A1m = false;
            this.A1M = false;
            this.A0s = null;
            this.A1V = false;
            this.A03 = 0;
            this.A04 = 0;
        }
    }

    public void A0b() {
        AnonymousClass8BX.A18(this);
        this.A0H.removeMessages(23);
        this.A0H.sendEmptyMessageDelayed(23, 45000);
        this.A1E.execute(new C21422Ajp(4));
    }

    public void A0j(int i) {
        String str;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VoiceService:onMinimizedBannerVisibilityChanged: ");
        if (i == 0) {
            str = "Visible";
        } else {
            str = "Gone";
        }
        C17890vO.A1A(A102, str);
        if (i == 0) {
            this.A08 = System.currentTimeMillis();
            return;
        }
        long j = this.A08;
        if (j != -1) {
            this.A0B += AnonymousClass8BR.A04(j);
            this.A08 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r7 == 11) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r4 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1.A04.equals(r8) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(int r6, int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            com.whatsapp.voipcalling.CallInfo r4 = X.AnonymousClass8BR.A0r(r5)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            X.2gu r1 = r4.callWaitingInfo
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r8)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.String r0 = "voip/call/reject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == 0) goto L_0x0028
            X.9hv r1 = r5.A0Q(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A07 = r0
        L_0x0028:
            if (r2 == 0) goto L_0x005a
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r4)
        L_0x002e:
            boolean r3 = r4.isGroupCall
        L_0x0030:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r5.A1E
            X.Air r0 = new X.Air
            r0.<init>(r8, r9, r6, r2)
            r1.execute(r0)
            if (r3 != 0) goto L_0x0059
            X.00H r0 = r5.A3x
            java.lang.Object r3 = r0.get()
            X.6wK r3 = (X.C137976wK) r3
            r0 = 4
            if (r7 == r0) goto L_0x004c
            r0 = 11
            r2 = 0
            if (r7 != r0) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            r1 = 7
            r0 = 2
            if (r2 != 0) goto L_0x0056
            if (r7 == r0) goto L_0x0055
            if (r7 != r1) goto L_0x0059
        L_0x0055:
            r0 = 3
        L_0x0056:
            X.C137976wK.A00(r3, r8, r0, r1)
        L_0x0059:
            return
        L_0x005a:
            if (r4 == 0) goto L_0x0030
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0m(int, int, java.lang.String, java.lang.String):void");
    }

    public void A0n(int i, String str) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("end_call_reason", i);
        if (str != null) {
            A0D2.putString("end_call_string", str);
        }
        this.A2J.A00(new A69("hangup_call", A0D2));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0p(int r7, java.util.List r8) {
        /*
            r6 = this;
            com.whatsapp.voipcalling.CallInfo r1 = X.AnonymousClass8BR.A0r(r6)
            r5 = 1
            if (r7 == r5) goto L_0x0081
            r0 = 2
            if (r7 == r0) goto L_0x0096
            r1 = 6
            if (r7 == r1) goto L_0x0074
            r0 = 18
            if (r7 == r0) goto L_0x003e
            r0 = 10
            if (r7 == r0) goto L_0x0031
            r0 = 11
            if (r7 == r0) goto L_0x0031
            r0 = 34
            if (r7 == r0) goto L_0x0031
            r0 = 35
            if (r7 == r0) goto L_0x0031
            switch(r7) {
                case 21: goto L_0x004c;
                case 22: goto L_0x004c;
                case 23: goto L_0x004c;
                case 24: goto L_0x004c;
                case 25: goto L_0x003e;
                case 26: goto L_0x004c;
                case 27: goto L_0x003e;
                case 28: goto L_0x0031;
                case 29: goto L_0x0031;
                default: goto L_0x0024;
            }
        L_0x0024:
            r4 = 0
        L_0x0025:
            X.1KB r0 = r6.A22
            X.1FR r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            if (r4 == 0) goto L_0x0030
            r0.CMl(r4)
        L_0x0030:
            return
        L_0x0031:
            r6.A02()
            X.4Rb r0 = new X.4Rb
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r0, r7)
            goto L_0x0025
        L_0x003e:
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.util.ArrayList r1 = X.C17880vN.A10(r8)
            java.lang.String r0 = "user_jids"
            r3.putParcelableArrayList(r0, r1)
            goto L_0x0055
        L_0x004c:
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "finish"
            r3.putBoolean(r0, r5)
        L_0x0055:
            r6.A02()
            X.4Rb r2 = new X.4Rb
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            r1.putAll(r3)
            java.lang.String r0 = "error"
            r1.putInt(r0, r7)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = new com.whatsapp.voipcalling.VoipErrorDialogFragment
            r4.<init>()
            r4.A1R(r1)
            r4.A02 = r2
            goto L_0x0025
        L_0x0074:
            r6.A02()
            X.4Rb r0 = new X.4Rb
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r0, r1)
            goto L_0x0025
        L_0x0081:
            if (r1 == 0) goto L_0x0024
            r6.A02()
            java.util.Map r0 = r1.participants
            int r3 = r0.size()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = new com.whatsapp.voipcalling.VoipErrorDialogFragment
            r4.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            goto L_0x00ab
        L_0x0096:
            if (r1 == 0) goto L_0x0024
            r6.A02()
            java.util.Map r0 = r1.participants
            int r3 = r0.size()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r4 = new com.whatsapp.voipcalling.VoipErrorDialogFragment
            r4.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            r5 = 2
        L_0x00ab:
            java.lang.String r0 = "error"
            r2.putInt(r0, r5)
            java.util.ArrayList r1 = X.C17880vN.A10(r8)
            java.lang.String r0 = "user_jids"
            r2.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "call_size"
            r2.putInt(r0, r3)
            r4.A1R(r2)
            X.4Rb r0 = new X.4Rb
            r0.<init>()
            r4.A02 = r0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0p(int, java.util.List):void");
    }

    public void A0q(long j) {
        C17900vP.A0m("VoiceService/delayShowingIncomingCall delay = ", AnonymousClass000.A10(), j);
        this.A0H.removeMessages(1);
        this.A0H.sendEmptyMessageDelayed(1, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03fe, code lost:
        if (r1 == false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r10 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bf, code lost:
        if (r1.equals(r9.A08.A1r.getString(2131896011)) != false) goto L_0x02c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0u(com.whatsapp.jid.GroupJid r16, com.whatsapp.jid.UserJid r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            r15 = this;
            X.C17960vV.A02()
            r0 = r20
            r15.A1Z = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/start "
            X.C17900vP.A0Y(r15, r0, r1)
            boolean r0 = r15.A1i
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "voip/start/started, do nothing"
        L_0x0016:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0019:
            return
        L_0x001a:
            if (r22 != 0) goto L_0x0040
            X.0ve r1 = r15.A2p
            r0 = 12717(0x31ad, float:1.782E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0040
            X.71B r0 = r15.A2O
            X.0ve r1 = r0.A00
            r0 = 4349(0x10fd, float:6.094E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0040
            X.10I r2 = r15.A31
            r1 = 41
            X.7Pb r0 = new X.7Pb
            r0.<init>(r15, r1)
            r2.CGF(r0)
        L_0x0040:
            r6 = r18
            X.8Ct r0 = r15.A0R(r6)
            boolean r10 = X.AnonymousClass000.A1W(r0)
            if (r10 != 0) goto L_0x0072
            android.telephony.TelephonyManager r3 = r15.A1s
            X.17x r0 = r15.A2e
            int r2 = X.C63982u1.A00(r3, r0)
            if (r19 == 0) goto L_0x0063
            if (r2 == 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/start/cellularCallInProgress "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            goto L_0x0016
        L_0x0063:
            if (r3 == 0) goto L_0x0072
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x0072
            android.telephony.PhoneStateListener r1 = r15.A0N
            r0 = 32
            r3.listen(r1, r0)
        L_0x0072:
            X.Adx r5 = r15.A0R
            X.C17960vV.A07(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r3 = 0
            r2 = 1
            if (r1 < r0) goto L_0x0082
            r4 = 1
            if (r10 != 0) goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/audio_route/onCallStart using telecom:"
            X.C17900vP.A0n(r0, r1, r4)
            r5.A06 = r4
            r5.A04 = r3
            r5.A08 = r3
            r5.A03 = r3
            r0 = 16
            X.7RK r1 = new X.7RK
            r1.<init>((int) r0, (java.lang.Object) r5, (boolean) r4)
            X.10s r0 = r5.A0L
            r0.execute(r1)
            long r13 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/device_info MANUFACTURER: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.append(r0)
            java.lang.String r0 = ", MODEL: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = ", Device: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DEVICE
            r1.append(r0)
            java.lang.String r0 = ", Board: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.BOARD
            r1.append(r0)
            java.lang.String r0 = ", Hardware: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.HARDWARE
            r1.append(r0)
            java.lang.String r0 = ", CPU_API: "
            r1.append(r0)
            java.lang.String r0 = X.C62912sC.A02()
            r1.append(r0)
            java.lang.String r0 = ", OS: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r1.append(r0)
            java.lang.String r0 = ", Build: "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.DISPLAY
            r1.append(r0)
            java.lang.String r0 = ", App: "
            r1.append(r0)
            java.lang.String r9 = "2.24.24.78"
            r1.append(r9)
            java.lang.String r0 = ", PowerSaving: "
            r1.append(r0)
            X.11C r12 = r15.A2b
            android.os.PowerManager r0 = r12.A0G()
            if (r0 != 0) goto L_0x0194
            java.lang.String r0 = "voip/service/start pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0117:
            X.C17900vP.A0r(r1, r0)
            r15.A1J = r3
            r15.A1k = r3
            r15.A1a = r3
            com.whatsapp.voipcalling.Voip$DebugTapType[] r0 = com.whatsapp.voipcalling.Voip.DebugTapType.values()
            int r0 = r0.length
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r0 = new com.whatsapp.voipcalling.Voip.RecordingInfo[r0]
            r15.A1n = r0
            com.whatsapp.calling.service.OutgoingSignalingHandler r0 = r15.A0W
            r7 = 0
            r0.pendingCallOfferStanza = r7
            java.util.Map r0 = r15.A3c
            r0.clear()
            java.util.Map r0 = r15.A3d
            r0.clear()
            X.A7t r0 = r15.A0i
            X.C17960vV.A07(r0)
            X.2l3 r0 = r0.A03
            java.util.Set r0 = r0.A02
            r0.clear()
            if (r22 != 0) goto L_0x01bf
            X.0ve r4 = r15.A2p
            r1 = 5845(0x16d5, float:8.19E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            r15.A1c = r0
            android.content.Context r8 = r15.A1r
            X.10I r5 = r15.A31
            X.1VE r4 = r15.A2A
            if (r0 == 0) goto L_0x0172
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r4)
            java.lang.String r0 = "end_call_tone_duration_last_cached_app_version"
            java.lang.String r0 = r1.getString(r0, r7)
            boolean r0 = X.AnonymousClass026.A00(r0, r9)
            if (r0 != 0) goto L_0x0172
            X.Akb r0 = new X.Akb
            r0.<init>((android.content.Context) r8, (X.AnonymousClass1VE) r4)
            r5.CGF(r0)
        L_0x0172:
            X.1cw r5 = r15.A2a
            android.content.BroadcastReceiver r4 = r15.A0D
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r5.A01(r8, r4, r0, r2)
            android.content.BroadcastReceiver r4 = r15.A0E
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r5.A01(r8, r4, r0, r2)
            X.C17960vV.A02()
            android.os.PowerManager$WakeLock r0 = r15.A0L
            if (r0 != 0) goto L_0x01bf
            goto L_0x019a
        L_0x0194:
            boolean r0 = r0.isPowerSaveMode()
            goto L_0x0117
        L_0x019a:
            android.os.PowerManager r1 = r12.A0G()     // Catch:{ Exception -> 0x01b9 }
            if (r1 != 0) goto L_0x01a6
            java.lang.String r0 = "voip/service/acquirePartialWakeLock pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01bf
        L_0x01a6:
            java.lang.String r0 = "VoiceService"
            android.os.PowerManager$WakeLock r0 = X.C181789Rv.A00(r1, r0, r2)     // Catch:{ Exception -> 0x01b9 }
            r15.A0L = r0     // Catch:{ Exception -> 0x01b9 }
            if (r0 == 0) goto L_0x01bf
            r0.acquire()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "voip/service/acquirePartialWakeLock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01bf
        L_0x01b9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r15.A0L = r7
        L_0x01bf:
            if (r10 != 0) goto L_0x01f7
            if (r22 != 0) goto L_0x01e5
            X.0ve r4 = r15.A2p
            r1 = 10337(0x2861, float:1.4485E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x01e5
            android.media.AudioManager r4 = r12.A0D()
            if (r4 == 0) goto L_0x01e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "audioManager "
            r1.append(r0)
            int r0 = r4.getMode()
            X.C17900vP.A0o(r1, r0)
        L_0x01e5:
            X.Adx r1 = r15.A0R
            X.C17960vV.A07(r1)
            X.11C r0 = r1.A0I
            android.media.AudioManager r4 = r0.A0D()
            if (r4 != 0) goto L_0x0334
            java.lang.String r0 = "result of audio focus for voice call: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01f7:
            if (r19 != 0) goto L_0x0330
            X.1HQ r0 = r15.A29
            X.1HR r0 = (X.AnonymousClass1HR) r0
            X.0ve r0 = r0.A00
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0225
            boolean r0 = r15.A1F
            if (r0 != 0) goto L_0x0225
            X.A7v r9 = r15.A0X
            int r1 = r15.A04
            r0 = 0
            boolean r8 = r9.A08(r7)
            r9.A00 = r3
            r11 = r17
            if (r10 == 0) goto L_0x0267
            if (r1 == 0) goto L_0x0267
            if (r21 == 0) goto L_0x0222
            long[] r0 = r9.A09(r11, r8, r2)
        L_0x0222:
            r9.A07(r11, r0, r3)
        L_0x0225:
            r15.A0u = r7
        L_0x0227:
            if (r22 != 0) goto L_0x039e
            android.os.Handler r4 = r15.A0I
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.sendEmptyMessageDelayed(r3, r0)
            android.media.SoundPool r0 = r15.A0F
            if (r0 == 0) goto L_0x025a
            r15.A1q = r7
            r15.A1p = r7
            java.util.Map r0 = r15.A3e
            r0.clear()
            android.media.SoundPool r5 = r15.A0F
            X.0ve r4 = r15.A2p
            r1 = 6569(0x19a9, float:9.205E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0263
            X.10I r4 = r15.A31
            r5.getClass()
            r1 = 35
            X.7Pb r0 = new X.7Pb
            r0.<init>(r5, r1)
            r4.CGF(r0)
        L_0x025a:
            android.media.SoundPool r1 = new android.media.SoundPool
            r1.<init>(r2, r3, r3)
            r15.A0F = r1
            goto L_0x033d
        L_0x0263:
            r5.release()
            goto L_0x025a
        L_0x0267:
            com.whatsapp.jid.UserJid r4 = com.whatsapp.voipcalling.Voip.getPeerJid()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/ringtone/play, telecom: "
            X.C17900vP.A0n(r0, r1, r10)
            if (r4 != 0) goto L_0x0281
            java.lang.String r0 = "voip/ringtone/play/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x027b:
            if (r21 != 0) goto L_0x0225
            r9.A07(r11, r7, r2)
            goto L_0x0225
        L_0x0281:
            X.11C r0 = r9.A09
            android.media.AudioManager r5 = r0.A0D()
            if (r5 == 0) goto L_0x0299
            int r1 = r5.getRingerMode()
            if (r1 == 0) goto L_0x032c
            if (r1 == r2) goto L_0x0328
            r0 = 2
            if (r1 != r0) goto L_0x0299
            java.lang.String r0 = "voip/ringtone/ringer_mode/normal"
        L_0x0296:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0299:
            boolean r0 = X.A7v.A04(r9)
            if (r0 != 0) goto L_0x027b
            X.1Nb r0 = r9.A0B
            X.1yM r0 = r0.A0a(r4)
            java.lang.String r1 = r0.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02c1
            X.A99 r0 = r9.A08
            android.content.Context r4 = r0.A1r
            r0 = 2131896011(0x7f1226cb, float:1.9426871E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x02c2
        L_0x02c1:
            r4 = 1
        L_0x02c2:
            android.net.Uri r0 = r9.A02
            if (r0 != 0) goto L_0x027b
            if (r4 != 0) goto L_0x027b
            java.lang.String r4 = "/"
            java.lang.String r0 = "android.resource://"
            if (r21 == 0) goto L_0x031e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            android.content.Context r0 = r9.A07
            java.lang.String r0 = r0.getPackageName()
            r1.append(r0)
            r1.append(r4)
            r0 = 2132017177(0x7f140019, float:1.9672625E38)
            if (r8 == 0) goto L_0x02e6
            r0 = 2132017186(0x7f140022, float:1.9672643E38)
        L_0x02e6:
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
        L_0x02ea:
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r9.A02 = r0
            if (r0 == 0) goto L_0x027b
            if (r5 == 0) goto L_0x0315
            if (r10 != 0) goto L_0x0315
            java.lang.String r0 = "voip/ringtone/setmode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r4 = r9.A0A
            r1 = 6570(0x19aa, float:9.207E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x031a
            X.10s r4 = X.A7v.A00(r9)
            r1 = 32
            X.7Pb r0 = new X.7Pb
            r0.<init>(r5, r1)
            r4.execute(r0)
        L_0x0315:
            r9.A05()
            goto L_0x027b
        L_0x031a:
            r5.setMode(r2)
            goto L_0x0315
        L_0x031e:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/ringtone/ "
            X.C17900vP.A0f(r0, r1, r4)
            goto L_0x02ea
        L_0x0328:
            java.lang.String r0 = "voip/ringtone/ringer_mode/vibrate"
            goto L_0x0296
        L_0x032c:
            java.lang.String r0 = "voip/ringtone/ringer_mode/silent"
            goto L_0x0296
        L_0x0330:
            r15.A0z = r7
            goto L_0x0227
        L_0x0334:
            X.10s r1 = r1.A0L
            r0 = 42
            X.C21446AkD.A00(r1, r4, r0)
            goto L_0x01f7
        L_0x033d:
            android.content.Context r8 = r15.A1r     // Catch:{ NotFoundException -> 0x038f }
            r0 = 2132017171(0x7f140013, float:1.9672613E38)
            int r0 = r1.load(r8, r0, r2)     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x038f }
            r15.A1q = r0     // Catch:{ NotFoundException -> 0x038f }
            android.media.SoundPool r1 = r15.A0F     // Catch:{ NotFoundException -> 0x038f }
            r0 = 2132017218(0x7f140042, float:1.9672708E38)
            int r0 = r1.load(r8, r0, r2)     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x038f }
            r15.A1p = r0     // Catch:{ NotFoundException -> 0x038f }
            java.util.Map r5 = r15.A3e     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x038f }
            android.media.SoundPool r1 = r15.A0F     // Catch:{ NotFoundException -> 0x038f }
            r0 = 2132017180(0x7f14001c, float:1.9672631E38)
            int r0 = r1.load(r8, r0, r2)     // Catch:{ NotFoundException -> 0x038f }
            X.C17880vN.A1P(r4, r5, r0)     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NotFoundException -> 0x038f }
            android.media.SoundPool r4 = r15.A0F     // Catch:{ NotFoundException -> 0x038f }
            r0 = 2132017183(0x7f14001f, float:1.9672637E38)
            int r0 = r4.load(r8, r0, r2)     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x038f }
            java.lang.Integer r4 = X.C108975cc.A0S(r1, r0, r5)     // Catch:{ NotFoundException -> 0x038f }
            android.media.SoundPool r1 = r15.A0F     // Catch:{ NotFoundException -> 0x038f }
            r0 = 2132017162(0x7f14000a, float:1.9672595E38)
            int r0 = r1.load(r8, r0, r2)     // Catch:{ NotFoundException -> 0x038f }
            X.C17880vN.A1P(r4, r5, r0)     // Catch:{ NotFoundException -> 0x038f }
            goto L_0x039e
        L_0x038f:
            r1 = move-exception
            java.lang.String r0 = "voip/service/start failed to load call sound set"
            com.whatsapp.util.Log.w(r0, r1)
            r15.A1q = r7
            r15.A1p = r7
            java.util.Map r0 = r15.A3e
            r0.clear()
        L_0x039e:
            X.0ve r5 = r15.A2p
            r0 = 10287(0x282f, float:1.4415E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x051a
            X.9X9 r0 = new X.9X9
            r0.<init>(r15)
            r15.A0Y = r0
            X.10I r7 = r15.A31
            r1 = 44
            X.7Pb r0 = new X.7Pb
            r0.<init>(r15, r1)
            r7.CGF(r0)
        L_0x03bd:
            r0 = 0
            r15.A0B = r0
            r15.A0C = r0
            r0 = -1
            r15.A08 = r0
            r15.A09 = r0
            A06(r15)
            r15.A1i = r2
            X.C28291Zu.A01 = r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r15.A05 = r0
            X.0z4 r0 = r15.A2f
            java.lang.String r7 = X.C223919s.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r6)
            java.lang.String r0 = "session_id_for_voip_call_id"
            X.C17880vN.A1E(r1, r0, r7)
            X.1Mc r7 = r15.A2z
            X.126 r0 = r15.A2r
            r1 = r16
            X.1EC r1 = (X.AnonymousClass1EC) r1
            if (r16 == 0) goto L_0x0400
            X.1MZ r0 = r0.A0O
            boolean r0 = r0.A0O(r1)
            boolean r1 = r7.A09(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0401
        L_0x0400:
            r0 = 0
        L_0x0401:
            r15.A1M = r0
            long r0 = r15.A05
            long r0 = r0 - r13
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r7 = "voip/service/start elapsed "
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = " ms"
            X.C17890vO.A1A(r8, r0)
            java.lang.String r1 = "voip/service/start"
            r7 = 4
            int r0 = com.whatsapp.util.Log.level
            if (r7 > r0) goto L_0x0432
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "/total threads count = "
            r1.append(r0)
            int r0 = java.lang.Thread.activeCount()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            com.whatsapp.util.Log.log((int) r7, (java.lang.String) r0)
        L_0x0432:
            if (r22 != 0) goto L_0x043a
            boolean r0 = X.C40811vJ.A0M(r12)
            if (r0 == 0) goto L_0x043b
        L_0x043a:
            r3 = 1
        L_0x043b:
            r15.A1S = r3
            boolean r3 = r15.A1Z
            X.00H r0 = r15.A3y
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            if (r3 == 0) goto L_0x0516
            java.lang.String r0 = "video_call"
        L_0x044b:
            r1.A01(r0, r2)
            X.00H r0 = r15.A3B
            java.lang.Object r0 = r0.get()
            X.16s r0 = (X.C216216s) r0
            java.util.concurrent.atomic.AtomicLong r3 = r0.A00
            r0 = 0
            r3.set(r0)
            if (r22 != 0) goto L_0x0019
            r0 = 2843(0xb1b, float:3.984E-42)
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x0470
            X.A7S r3 = r15.A0T
            X.10I r1 = r3.A0D
            r0 = 40
            X.C21452AkJ.A00(r1, r3, r6, r0)
        L_0x0470:
            X.1DC r0 = r15.A30
            boolean r0 = r0.BgK()
            if (r0 == 0) goto L_0x0494
            X.00H r0 = r15.A3T
            java.lang.Object r3 = r0.get()
            X.A1P r3 = (X.A1P) r3
            r0 = 0
            r3.A05 = r0
            X.6uK r0 = r3.A0M
            r0.A01()
            X.6uK r0 = r3.A0L
            r0.A01()
            r0 = 0
            r3.A0C = r0
            X.A1P.A00(r3)
        L_0x0494:
            r0 = 3153(0xc51, float:4.418E-42)
            int r0 = X.C18020vd.A00(r4, r5, r0)
            if (r0 < r7) goto L_0x04bc
            X.00H r0 = r15.A3M
            java.lang.Object r3 = r0.get()
            X.9g9 r3 = (X.C187649g9) r3
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A02 = r0
            r3.A01 = r0
            X.6uK r0 = r3.A03
            r0.A01()
            X.6uK r0 = r3.A04
            r0.A01()
            X.6uK r0 = r3.A05
            r0.A01()
        L_0x04bc:
            X.0zA r1 = r15.A1u
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r15.A1L
            if (r0 != 0) goto L_0x0019
            X.0vp r0 = r15.A3k
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0019
            r15.A1L = r2
            java.lang.Object r5 = r1.A03()
            X.6je r5 = (X.C130566je) r5
            r0 = 23
            X.Ali r3 = X.C21535Ali.A00(r15, r0)
            X.0zA r0 = r5.A00
            if (r0 == 0) goto L_0x0504
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0504
            X.0ve r1 = r5.A04
            r0 = 9246(0x241e, float:1.2956E-41)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x0504
            java.lang.String r0 = "VoipGlassesManagerWrapperImpl.kt Initialize Hera plugin"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r5.A06
            r1 = 24
        L_0x04fb:
            X.7Qq r0 = new X.7Qq
            r0.<init>(r5, r3, r1)
            r2.CGF(r0)
            return
        L_0x0504:
            X.0ve r0 = r5.A04
            boolean r0 = X.C40811vJ.A0T(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "VoipGlassesManagerWrapperImpl.kt Checking FOA for MWA/SG presence on service level."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r2 = r5.A06
            r1 = 25
            goto L_0x04fb
        L_0x0516:
            java.lang.String r0 = "voice_call"
            goto L_0x044b
        L_0x051a:
            android.net.wifi.WifiManager r8 = r12.A0F()
            if (r8 == 0) goto L_0x053c
            boolean r0 = r8.isWifiEnabled()
            if (r0 == 0) goto L_0x053c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x053c
            android.net.wifi.WifiInfo r0 = r8.getConnectionInfo()
            int r0 = r0.getRssi()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r15.A13 = r0
            goto L_0x03bd
        L_0x053c:
            r15.A13 = r7
            goto L_0x03bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0u(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid, java.lang.String, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r7.A2z.A06(X.C72463Mc.A0g(r2)) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r7.A1F == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (r7.A1Y != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        if (r7.A1w.A00 == false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(com.whatsapp.voipcalling.CallInfo r21, boolean r22) {
        /*
            r20 = this;
            X.C17960vV.A02()
            r15 = r21
            boolean r0 = X.C40811vJ.A0e(r15)
            r7 = r20
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "voip/commonHandler/HANDLER_WHAT_START_ACTIVITY_FOR_INCOMING_CALL no active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r21 == 0) goto L_0x001c
            X.1Md r2 = r7.A2I
            java.lang.String r1 = r15.callId
            r0 = 4
            r2.A04(r1, r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Enter"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r6 = r15.hasPendingCall()
            com.whatsapp.jid.UserJid r5 = r15.getInitialPeerJid()
            X.C17960vV.A07(r5)
            com.whatsapp.voipcalling.CallState r4 = r15.callState
            boolean r2 = r15.isAudioChat()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r3 = 0
            if (r1 < r0) goto L_0x006f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r4 == r0) goto L_0x006f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r4 == r0) goto L_0x006f
            if (r2 != 0) goto L_0x006e
            if (r6 != 0) goto L_0x006e
            r0 = 29
            if (r1 >= r0) goto L_0x006e
            X.1M9 r0 = r7.A2T
            X.1E7 r2 = r0.A0E(r5)
            X.1Nb r0 = r7.A2y
            boolean r0 = r0.A0x(r5)
            if (r0 != 0) goto L_0x006e
            if (r2 == 0) goto L_0x0100
            X.2lf r0 = r2.A0H
            if (r0 != 0) goto L_0x0100
            boolean r0 = r7.A1T
            if (r0 != 0) goto L_0x0100
            X.1Mc r1 = r7.A2z
            X.1BI r0 = X.C72463Mc.A0g(r2)
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0100
        L_0x006e:
            r3 = 1
        L_0x006f:
            r2 = 1
            r17 = r22
            if (r3 != 0) goto L_0x007a
            boolean r0 = r15.isAudioChat()
            if (r0 == 0) goto L_0x007c
        L_0x007a:
            if (r22 == 0) goto L_0x00be
        L_0x007c:
            X.1VT r1 = r7.A32
            java.lang.String r0 = "voip/notifyShowingIncomingCallUI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 44
            X.C20735AWq.A00(r1, r0)
            android.content.Context r8 = r7.A1r
            X.195 r0 = r7.A1w
            boolean r0 = r0.A00
            java.lang.Boolean r9 = X.C108945cZ.A1A(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            r10 = 0
            r12 = r11
            r13 = r10
            android.content.Intent r2 = X.AnonymousClass1LU.A1H(r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x00fd
            X.2gu r0 = r15.callWaitingInfo
            java.lang.String r1 = r0.A04
        L_0x00a3:
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r1)
            if (r6 != 0) goto L_0x00af
            boolean r0 = r7.A1F
            r1 = 1
            if (r0 != 0) goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            java.lang.String r0 = "callAccepted"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = 6
            r2.putExtra(r1, r0)
            r8.startActivity(r2)
        L_0x00be:
            if (r6 != 0) goto L_0x00df
            com.whatsapp.jid.UserJid r9 = X.C108955ca.A0T(r15)
            boolean r12 = r15.videoEnabled
            java.lang.String r10 = r15.callId
            boolean r13 = r15.isGroupCall
            com.whatsapp.jid.GroupJid r8 = r15.groupJid
            r11 = 0
            r14 = r11
            r7.A0u(r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r7.A0J()
            if (r0 != 0) goto L_0x00df
            X.Adx r0 = r7.A0R
            X.C17960vV.A07(r0)
            r0.A04(r15)
        L_0x00df:
            r16 = 2
            if (r3 == 0) goto L_0x00e5
            r16 = 1
        L_0x00e5:
            if (r6 == 0) goto L_0x00ef
            if (r3 == 0) goto L_0x00ef
            boolean r0 = r7.A1Y
            r18 = 1
            if (r0 == 0) goto L_0x00f1
        L_0x00ef:
            r18 = 0
        L_0x00f1:
            r19 = 0
            r14 = r7
            A0E(r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = "voip/service/startActivityForIncomingCall Exit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00fd:
            java.lang.String r1 = r15.callId
            goto L_0x00a3
        L_0x0100:
            X.195 r0 = r7.A1w
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006f
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0w(com.whatsapp.voipcalling.CallInfo, boolean):void");
    }

    public void A0x(CallInfo callInfo, boolean z, boolean z2) {
        String A0V2;
        CallState callState;
        C17960vV.A02();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/phone-call-in-progress-changed: ");
        A102.append(z);
        if (callInfo == null) {
            A0V2 = null;
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append(", call state: ");
            A0V2 = C17890vO.A0V(callInfo.callState, A103);
        }
        C17890vO.A1A(A102, A0V2);
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        if (callInfo != null && (callState = callInfo.callState) != CallState.NONE) {
            if (!z) {
                if (!z2) {
                    Message obtainMessage = this.A0H.obtainMessage(38);
                    this.A0H.removeMessages(38);
                    this.A0H.sendMessageDelayed(obtainMessage, 2000);
                } else {
                    C18030ve r2 = this.A2p;
                    if (!AnonymousClass112.A0A() || !C18020vd.A05(C18040vf.A02, r2, 9808)) {
                        if (callInfo.videoEnabled) {
                            adx.A06(callInfo, true);
                        } else {
                            adx.A07(callInfo, true);
                        }
                    }
                }
                adx.A0C(false);
            } else if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.RECEIVED_CALL || callState == CallState.REJOINING) {
                A0n(4, (String) null);
                return;
            } else {
                C200710s r1 = adx.A0L;
                C21431Ajy.A00(r1, adx, callInfo, 6);
                C21446AkD.A00(r1, adx, 40);
                this.A1N = true;
            }
            AnonymousClass7RF r3 = new AnonymousClass7RF(this, callInfo, 21, z);
            if (C18020vd.A05(C18040vf.A02, this.A2p, 2903)) {
                this.A1E.execute(r3);
            } else {
                r3.run();
            }
        }
    }

    public void A0y(CallState callState, String str) {
        int i;
        switch (callState.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 10:
                if (!AnonymousClass000.A1W(A0R(str))) {
                    Integer num = this.A0t;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 3;
                    }
                    C21067Adx adx = this.A0R;
                    AudioManager A0D2 = adx.A0I.A0D();
                    if (A0D2 == null) {
                        Log.e("voip/audio_route/updateAudioMode audioManager is null");
                    } else {
                        CallInfo BO3 = adx.A0B.BO3();
                        AnonymousClass7RP r3 = new AnonymousClass7RP(A0D2, i, 28);
                        if (BO3 == null || !BO3.isBotCall) {
                            if (C18020vd.A00(C18040vf.A02, adx.A0J, 12724) <= 0) {
                                r3.run();
                            }
                        }
                        adx.A0L.execute(r3);
                    }
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("voip/updateAudioModeForCallState ");
                    A102.append(callState);
                    C17900vP.A0j(" to ", A102, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A13(String str) {
        C17960vV.A0F(AnonymousClass000.A1W(A0R(str)), "must be called for self managed connection");
        C161328Ct A0R2 = A0R(str);
        if (Build.VERSION.SDK_INT >= 28 && A0R2 != null && A0R2.getState() == 5) {
            A0R2.onUnhold();
        }
    }

    public void A16(Collection collection) {
        if (collection.size() > 0) {
            if (C18020vd.A05(C18040vf.A02, this.A2p, 5249)) {
                this.A31.CGF(new C21431Ajy(this, collection, 49));
            }
        }
    }

    public void A17(List list) {
        DeviceJid deviceJid;
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v2 = C17880vN.A0v(it);
            C178119Bw A062 = this.A0T.A06(A0v2);
            if (!(A062 == null || (deviceJid = A062.A02) == null)) {
                A132.add(A0v2);
                A133.add(deviceJid);
            }
        }
        if (!A132.isEmpty()) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VoiceService/actionCheckOngoingCalls: ongoing calls count=");
            C17900vP.A0o(A102, A132.size());
            Voip.checkOngoingCalls(C17890vO.A1b(A132, 0), (DeviceJid[]) A133.toArray(new DeviceJid[0]));
        }
    }

    public boolean A1C(AudioManager audioManager) {
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        C21067Adx adx = this.A0R;
        C17960vV.A07(adx);
        if (C17890vO.A1R(adx.A00) == isSpeakerphoneOn) {
            return false;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("VoiceService:callEnding audio route mismatch detectecd. current = ");
        A102.append(audioManager.isSpeakerphoneOn());
        A102.append(", Expected = ");
        Log.w(AnonymousClass3MY.A0r(A102, C17890vO.A1R(adx.A00)));
        return true;
    }

    public boolean A1G(String str) {
        return AnonymousClass000.A1W(A0R(str));
    }

    public A99(C19880zA r5, C19880zA r6, C19880zA r7, AnonymousClass195 r8, AnonymousClass190 r9, AnonymousClass2YP r10, C51412Ye r11, C51422Yf r12, C218617r r13, AnonymousClass1KB r14, AnonymousClass11S r15, AnonymousClass181 r16, C23651Hc r17, C47942Ko r18, AnonymousClass2PB r19, C27411Vz r20, AnonymousClass1HQ r21, AnonymousClass1VE r22, AnonymousClass1VF r23, C175258yP r24, AnonymousClass1T9 r25, AnonymousClass1VP r26, C56752hy r27, C1410173y r28, C24911Md r29, C190999lr r30, AnonymousClass1V7 r31, AnonymousClass1VM r32, C21501AlA alA, A4u a4u, A8A a8a, AnonymousClass71B r36, AnonymousClass1VI r37, C40961va r38, AnonymousClass1HS r39, AnonymousClass1VK r40, AnonymousClass11E r41, AnonymousClass1M9 r42, AnonymousClass1PM r43, C24921Me r44, C26191Re r45, C32951i1 r46, AnonymousClass1RW r47, AnonymousClass1R8 r48, AnonymousClass11Q r49, C29831cw r50, AnonymousClass11C r51, AnonymousClass11P r52, AnonymousClass118 r53, C27301Vn r54, C219217x r55, C19830z4 r56, C18000vb r57, AnonymousClass1P3 r58, C70303An r59, AnonymousClass1TD r60, AnonymousClass121 r61, AnonymousClass1TA r62, C27081Uq r63, C24751Ln r64, AnonymousClass1MR r65, C23661Hd r66, WhatsAppDynamicExecuTorchLoader whatsAppDynamicExecuTorchLoader, C18030ve r68, C23641Hb r69, AnonymousClass126 r70, AnonymousClass1SV r71, AnonymousClass1D9 r72, AnonymousClass1N7 r73, C217217d r74, C26241Rj r75, C57322it r76, WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader, AnonymousClass1LD r78, AnonymousClass1Nb r79, C24901Mc r80, AnonymousClass8CB r81, AnonymousClass1DC r82, AnonymousClass10I r83, AnonymousClass1VT r84, JNIUtils jNIUtils, VoipCameraManager voipCameraManager, AnonymousClass00H r87, AnonymousClass00H r88, AnonymousClass00H r89, AnonymousClass00H r90, AnonymousClass00H r91, AnonymousClass00H r92, AnonymousClass00H r93, AnonymousClass00H r94, AnonymousClass00H r95, AnonymousClass00H r96, AnonymousClass00H r97, AnonymousClass00H r98, AnonymousClass00H r99, AnonymousClass00H r100, AnonymousClass00H r101, AnonymousClass00H r102, AnonymousClass00H r103, AnonymousClass00H r104, AnonymousClass00H r105, AnonymousClass00H r106, AnonymousClass00H r107, AnonymousClass00H r108, AnonymousClass00H r109, AnonymousClass00H r110, AnonymousClass00H r111, AnonymousClass00H r112, AnonymousClass00H r113, AnonymousClass00H r114, AnonymousClass00H r115, AnonymousClass00H r116, AnonymousClass00H r117, AnonymousClass00H r118, AnonymousClass00H r119, AnonymousClass00H r120, AnonymousClass00H r121, AnonymousClass00H r122, C18140vp r123, C18140vp r124) {
        A06(this);
        this.A0s = null;
        this.A03 = 0;
        this.A04 = 0;
        this.A3i = Collections.synchronizedSet(C17880vN.A12());
        this.A19 = null;
        this.A1P = false;
        this.A2w = new C21052Adi(this, 0);
        Context context = r53.A00;
        this.A1r = context;
        this.A2J = r31;
        this.A2c = r52;
        this.A2s = r72;
        C18030ve r2 = r68;
        this.A2p = r2;
        this.A22 = r14;
        this.A33 = jNIUtils;
        this.A2Z = r48;
        this.A1x = r9;
        this.A23 = r15;
        this.A31 = r83;
        this.A21 = r13;
        this.A24 = r16;
        this.A29 = r21;
        this.A2F = r26;
        this.A2z = r80;
        this.A1t = r5;
        this.A3N = r87;
        this.A32 = r84;
        this.A26 = r18;
        this.A3O = r88;
        this.A2R = r39;
        this.A2I = r29;
        C175258yP r3 = r24;
        this.A2D = r3;
        this.A2q = r69;
        r3.A03 = this;
        this.A2T = r42;
        this.A3V = r89;
        this.A30 = r82;
        AnonymousClass11C r33 = r51;
        this.A2b = r33;
        this.A2V = r44;
        this.A2g = r57;
        this.A3m = r30;
        this.A3Z = r90;
        this.A3L = r91;
        this.A2u = r75;
        this.A2r = r70;
        this.A25 = r17;
        this.A2O = r36;
        this.A2j = r60;
        this.A2X = r46;
        this.A2y = r79;
        this.A2W = r45;
        this.A2t = r74;
        this.A2h = r58;
        this.A27 = r19;
        this.A2o = r65;
        this.A34 = voipCameraManager;
        this.A2G = r27;
        this.A3I = r95;
        this.A2i = r59;
        this.A3M = r96;
        this.A3s = r73;
        this.A2v = r76;
        this.A2m = r63;
        this.A2e = r55;
        this.A2f = r56;
        this.A28 = r20;
        this.A1z = r11;
        this.A2L = alA;
        this.A3K = r97;
        this.A2l = r62;
        this.A2N = a8a;
        this.A2M = a4u;
        this.A2a = r50;
        this.A3S = r98;
        this.A2A = r22;
        this.A2C = r23;
        this.A2d = r54;
        this.A35 = r99;
        this.A3F = r100;
        this.A3y = r101;
        this.A3x = r94;
        this.A3A = r109;
        this.A2H = r28;
        this.A1v = r6;
        this.A3Q = r105;
        this.A2k = r61;
        this.A3X = r102;
        this.A2x = r78;
        this.A3E = r106;
        this.A3R = r107;
        this.A2P = r37;
        this.A3T = r108;
        this.A1w = r8;
        this.A2S = r41;
        this.A3n = r40;
        this.A39 = r119;
        this.A3G = r110;
        this.A3t = whatsAppDynamicPytorchLoader;
        this.A1y = r10;
        this.A3z = r112;
        this.A2K = r32;
        this.A3W = r113;
        this.A3q = whatsAppDynamicExecuTorchLoader;
        this.A40 = r115;
        this.A3o = r49;
        this.A1s = r33.A0K();
        this.A3p = r66;
        this.A41 = r114;
        this.A2E = r25;
        this.A2n = r64;
        this.A3C = r92;
        this.A3J = r111;
        this.A2B = new C186599eS(context);
        this.A2Q = r38;
        this.A3l = C40811vJ.A0W(r2);
        this.A2Y = r47;
        this.A3D = r93;
        this.A3P = r103;
        this.A3Y = r104;
        this.A3H = r116;
        this.A3j = r123;
        this.A3k = r124;
        this.A1u = r7;
        this.A44 = new C194879sR();
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A00(r1, r2, 8912) > 0) {
            A48 = C17890vO.A03(C18020vd.A00(r1, r2, 8912));
        }
        this.A2U = r43;
        this.A37 = r117;
        this.A3w = r118;
        this.A36 = r120;
        this.A38 = r121;
        this.A3v = r122;
        this.A20 = r12;
        this.A3u = r81;
        this.A3r = r71;
        if (!A0M(r2)) {
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d6, code lost:
        r1.isLidCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d8, code lost:
        r5 = r1.groupCallIsLastSegment;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01da, code lost:
        if (r5 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e0, code lost:
        if (r5.booleanValue() == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e4, code lost:
        if (r0.A0C == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e6, code lost:
        r5 = r8.A08;
        r5 = r5.A0O.A08.A0A(r0.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f2, code lost:
        if (r5 <= 0) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f4, code lost:
        r1.numInvitedParticipants = X.C17880vN.A0n(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        r5 = r9.A2b.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        if (r5 != null) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0202, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0204, code lost:
        r46 = java.lang.Long.valueOf(r62);
        r21 = r7.A08;
        r20 = r7.A04;
        r19 = r7.A03;
        r18 = r7.A09;
        r17 = r7.A0B;
        r14 = r7.A0A;
        r12 = r7.A06;
        r11 = r7.A0E;
        r8.A00(r1, r15, r7.A02, (java.lang.Integer) null, (java.lang.Integer) null, r40, r57, r21, r20, r19, r12, r46, r18, r17, r14, r59, r60, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0249, code lost:
        if (r69 == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x024b, code lost:
        r1.callRandomId = ((X.C191599mr) r9.A3D.get()).A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0259, code lost:
        r1.privacySilenceUnknownCaller = java.lang.Boolean.valueOf(r0.A0R());
        r1.privacyUnknownCaller = X.C108945cZ.A1A(r8.A09.A00(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0271, code lost:
        if (r0.A0C == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0273, code lost:
        r11 = r8.A0A;
        r5 = r0.A0C;
        X.C18070vi.A0d(r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x027f, code lost:
        if (X.C24901Mc.A00(r5, r11) != 1) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0281, code lost:
        r1.privacyUnknownCaller = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0287, code lost:
        r12 = r8.A06;
        r11 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0295, code lost:
        if (X.A7S.A03(r11.A02.BO3(), r3) != false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0297, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0298, code lost:
        r12.A0G(r11, r1.callResult);
        r11 = r8.A05;
        r11.A02(r1, r66);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a4, code lost:
        if (r4 <= 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a6, code lost:
        r5 = new com.whatsapp.fieldstats.events.WamJoinableCall();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ab, code lost:
        if (r69 == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ad, code lost:
        r5.callRandomId = r1.callRandomId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b3, code lost:
        if (r7.A0G == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b5, code lost:
        r5.isRering = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b7, code lost:
        if (r69 == false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b9, code lost:
        r5.joinableDuringCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02bd, code lost:
        if (r0.A0C == null) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bf, code lost:
        r5.isLinkedGroupCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c3, code lost:
        if (r0.A0F == null) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c5, code lost:
        r5.isScheduledCall = true;
        r5.randomScheduledId = java.lang.Long.valueOf(r64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02cd, code lost:
        r5.numConnectedPeers = X.C17880vN.A0n(r4);
        r5.videoEnabled = java.lang.Boolean.valueOf(r68);
        r5.lobbyEntryPoint = 5;
        r5.lobbyExit = X.C17880vN.A0m();
        r5.legacyCallResult = java.lang.Integer.valueOf(r61);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02eb, code lost:
        if (r70 == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ed, code lost:
        r5.isPendingCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ef, code lost:
        if (r16 == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f1, code lost:
        r5.hasSpamDialog = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f7, code lost:
        if (r0.A0W() == false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f9, code lost:
        r5.isVoiceChat = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02fb, code lost:
        if (r71 == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02fd, code lost:
        r5.isPhashBased = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0303, code lost:
        if (r0.A0P() == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0305, code lost:
        r5.isLidCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0307, code lost:
        r0 = r11.A00;
        r0.CC7(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x030c, code lost:
        if (r66 == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x030e, code lost:
        r0.Bio();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0311, code lost:
        r9.A3a.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x031a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031c, code lost:
        r2.A0H.removeMessages(48);
        r2.A0H.obtainMessage(48, 5, 0, r3).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x032d, code lost:
        r11 = r11.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0333, code lost:
        r40 = java.lang.Integer.valueOf(r5.getRingerMode());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033d, code lost:
        com.whatsapp.util.Log.w("VoiceService:postMissedCallEventToFieldStat groupMembersCount error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0344, code lost:
        r1 = new com.whatsapp.fieldstats.events.WamCall();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r11.A09(r8, r9.A0O.A0O(r8)) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        if (r1.callTermReason.intValue() != 16) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A2p, 12126) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (r0.A0R() != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r69 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r54 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r8 = r1.callResult;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if (r8 == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r8.intValue() != 5) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r9 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r9 == 1) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r9 != 2) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A2p, 10916) == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d6, code lost:
        X.C17960vV.A07(r0);
        r9 = X.AnonymousClass000.A13();
        r11 = r0.A0B().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e9, code lost:
        if (r11.hasNext() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        r9.add(((X.C178109Bv) r11.next()).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f7, code lost:
        r21 = X.C40811vJ.A09(r0.A09().A02);
        r20 = com.whatsapp.voipcalling.CallState.NONE;
        r28 = r0.A0O();
        r15 = r7.A01;
        r12 = r0.A0C;
        r35 = r0.A0W();
        X.C178119Bw.A00(r0);
        A05(new X.C138686xW(r12, r15, r20, r21, r9, -1, r0.A09, 0, r14, r28, r0.A0J, false, false, false, r33, false, r35, false), 2, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r8 = r2.A0U;
        r15 = r7.A01;
        r9 = r8.A04;
        r7 = r9.A0Q(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014b, code lost:
        if (r54 != null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0157, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A07, 1939) == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0159, code lost:
        r1 = new com.whatsapp.fieldstats.extension.WamCallExtended();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r1.callResult = java.lang.Integer.valueOf(r61);
        r12 = X.C17880vN.A0i();
        r1.callSide = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r4 <= 0) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016c, code lost:
        r1.groupCallIsLastSegment = true;
        r1.groupCallIsGroupCallInvitee = true;
        r1.numConnectedParticipants = X.C17880vN.A0n(r4);
        r1.fieldStatsRowType = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        r1.videoEnabled = java.lang.Boolean.valueOf(r68);
        r1.callTestBucket = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0180, code lost:
        if (r69 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0182, code lost:
        r1.joinableDuringCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0184, code lost:
        if (r70 == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0186, code lost:
        r1.isPendingCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        if (r0.A0C == null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018c, code lost:
        r1.isLinkedGroupCall = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        r1.incomingCallUiAction = r7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0194, code lost:
        if (r7.A0F == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r12 = r8.participants;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0196, code lost:
        r1.doNotDisturbEnabled = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        r11 = r9.A44;
        r12 = X.AnonymousClass000.A1O(r11.A01 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        if (r11.A00 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a4, code lost:
        r12 = r12 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a8, code lost:
        if (r11.A03 == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01aa, code lost:
        r12 = r12 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        if (r11.A02 == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b0, code lost:
        r12 = r12 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b2, code lost:
        r1.callNotificationState = X.C17880vN.A0n(r12 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ba, code lost:
        if (r0.A0F == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bc, code lost:
        r1.isScheduledCall = true;
        r1.randomScheduledId = java.lang.Long.valueOf(r64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c8, code lost:
        if (r0.A0W() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ca, code lost:
        r1.isVoiceChat = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cc, code lost:
        if (r71 == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ce, code lost:
        r1.isPhashBased = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d4, code lost:
        if (r0.A0P() == false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(com.whatsapp.fieldstats.events.WamCall r54, com.whatsapp.voipcalling.CallGroupInfo r55, X.C178119Bw r56, java.lang.Integer r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, int r61, long r62, long r64, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72) {
        /*
            r53 = this;
            r0 = r56
            r1 = r54
            X.4cT r7 = r0.A04
            boolean r14 = r7.A03
            r6 = 1
            r3 = r14 ^ 1
            java.lang.String r2 = "processMissedIncomingCall should only be called on callee side"
            X.C17960vV.A0F(r3, r2)
            r2 = r53
            X.1Md r4 = r2.A2I
            r10 = 4
            r3 = r58
            r4.A04(r3, r10)
            java.lang.String r4 = "test.name"
            java.lang.String r5 = com.whatsapp.voipcalling.Voip.getVoipParamForCall(r4, r3)
            if (r5 == 0) goto L_0x0028
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            com.whatsapp.voipcalling.Voip.clearVoipParam(r3)
            r4 = 0
            r8 = r55
            if (r55 == 0) goto L_0x004a
            com.whatsapp.voipcalling.CallParticipant[] r12 = r8.participants
            int r11 = r12.length
            if (r11 <= 0) goto L_0x004a
            r13 = 0
        L_0x0037:
            r8 = r12[r4]
            java.lang.String r9 = "connected"
            java.lang.String r8 = r8.state
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0045
            int r13 = r13 + 1
        L_0x0045:
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x0037
            r4 = r13
        L_0x004a:
            com.whatsapp.jid.GroupJid r12 = r0.A0C
            X.1Mc r11 = r2.A2z
            X.126 r9 = r2.A2r
            r8 = r12
            X.1EC r8 = (X.AnonymousClass1EC) r8
            if (r12 == 0) goto L_0x0063
            X.1MZ r9 = r9.A0O
            boolean r9 = r9.A0O(r8)
            boolean r8 = r11.A09(r8, r9)
            r16 = 1
            if (r8 != 0) goto L_0x0065
        L_0x0063:
            r16 = 0
        L_0x0065:
            boolean r8 = r0.A0R()
            if (r8 == 0) goto L_0x0072
            com.whatsapp.jid.GroupJid r8 = r0.A0C
            if (r8 == 0) goto L_0x0072
            r11.A04(r8)
        L_0x0072:
            r13 = 0
            r33 = r69
            if (r69 == 0) goto L_0x0090
            if (r54 == 0) goto L_0x0090
            java.lang.Integer r8 = r1.callResult
            int r8 = r8.intValue()
            if (r8 == r10) goto L_0x0085
            r9 = 9
            if (r8 != r9) goto L_0x0090
        L_0x0085:
            java.lang.Integer r8 = r1.callTermReason
            int r9 = r8.intValue()
            r8 = 16
            r11 = 1
            if (r9 == r8) goto L_0x0091
        L_0x0090:
            r11 = 0
        L_0x0091:
            r10 = 5
            if (r72 == 0) goto L_0x00b5
            if (r69 == 0) goto L_0x00aa
            if (r11 == 0) goto L_0x00a4
            X.0ve r11 = r2.A2p
            r9 = 12126(0x2f5e, float:1.6992E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r8 = X.C18020vd.A05(r8, r11, r9)
            if (r8 != 0) goto L_0x00aa
        L_0x00a4:
            boolean r8 = r0.A0R()
            if (r8 == 0) goto L_0x00b7
        L_0x00aa:
            android.os.Handler r8 = r2.A0H
            r9 = r67
            android.os.Message r8 = android.os.Message.obtain(r8, r10, r9, r13, r0)
            r8.sendToTarget()
        L_0x00b5:
            if (r69 == 0) goto L_0x013d
        L_0x00b7:
            if (r54 == 0) goto L_0x013d
            java.lang.Integer r8 = r1.callResult
            if (r8 == 0) goto L_0x013d
            int r8 = r8.intValue()
            if (r8 != r10) goto L_0x013d
            int r9 = r2.A04
            if (r9 == r6) goto L_0x00ca
            r8 = 2
            if (r9 != r8) goto L_0x013d
        L_0x00ca:
            X.0ve r11 = r2.A2p
            r9 = 10916(0x2aa4, float:1.5297E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r8 = X.C18020vd.A05(r8, r11, r9)
            if (r8 == 0) goto L_0x013d
            X.C17960vV.A07(r0)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = r0.A0B()
            java.util.Iterator r11 = r8.iterator()
        L_0x00e5:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L_0x00f7
            java.lang.Object r8 = r11.next()
            X.9Bv r8 = (X.C178109Bv) r8
            com.whatsapp.jid.UserJid r8 = r8.A00
            r9.add(r8)
            goto L_0x00e5
        L_0x00f7:
            X.4cT r8 = r0.A09()
            java.lang.String r8 = r8.A02
            java.lang.String r21 = X.C40811vJ.A09(r8)
            com.whatsapp.voipcalling.CallState r20 = com.whatsapp.voipcalling.CallState.NONE
            boolean r28 = r0.A0O()
            boolean r8 = r0.A0J
            r17 = r8
            com.whatsapp.jid.UserJid r15 = r7.A01
            com.whatsapp.jid.GroupJid r12 = r0.A0C
            boolean r35 = r0.A0W()
            X.C178119Bw.A00(r0)
            int r11 = r0.A09
            r25 = 0
            r23 = -1
            X.6xW r8 = new X.6xW
            r31 = r13
            r32 = r13
            r34 = r13
            r36 = r13
            r22 = r9
            r24 = r11
            r27 = r14
            r29 = r17
            r30 = r13
            r17 = r8
            r18 = r12
            r19 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9 = 2
            r2.A05(r8, r9, r6, r6)
        L_0x013d:
            X.2kF r8 = r2.A0U
            com.whatsapp.jid.UserJid r15 = r7.A01
            X.A99 r9 = r8.A04
            X.9hv r7 = r9.A0Q(r3)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            if (r54 != 0) goto L_0x018e
            X.0ve r12 = r8.A07
            r11 = 1939(0x793, float:2.717E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r12, r11)
            if (r1 == 0) goto L_0x0344
            com.whatsapp.fieldstats.extension.WamCallExtended r1 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r1.<init>()
        L_0x015e:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r61)
            r1.callResult = r11
            java.lang.Integer r12 = X.C17880vN.A0i()
            r1.callSide = r12
            if (r4 <= 0) goto L_0x0178
            r1.groupCallIsLastSegment = r6
            r1.groupCallIsGroupCallInvitee = r6
            java.lang.Long r11 = X.C17880vN.A0n(r4)
            r1.numConnectedParticipants = r11
            r1.fieldStatsRowType = r12
        L_0x0178:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r68)
            r1.videoEnabled = r11
            r1.callTestBucket = r5
            if (r69 == 0) goto L_0x0184
            r1.joinableDuringCall = r6
        L_0x0184:
            if (r70 == 0) goto L_0x0188
            r1.isPendingCall = r6
        L_0x0188:
            com.whatsapp.jid.GroupJid r5 = r0.A0C
            if (r5 == 0) goto L_0x018e
            r1.isLinkedGroupCall = r6
        L_0x018e:
            java.lang.Integer r5 = r7.A07
            r1.incomingCallUiAction = r5
            boolean r5 = r7.A0F
            if (r5 == 0) goto L_0x0198
            r1.doNotDisturbEnabled = r6
        L_0x0198:
            X.9sR r11 = r9.A44
            boolean r5 = r11.A01
            boolean r12 = X.AnonymousClass000.A1O(r5)
            boolean r5 = r11.A00
            if (r5 == 0) goto L_0x01a6
            r12 = r12 | 2
        L_0x01a6:
            boolean r5 = r11.A03
            if (r5 == 0) goto L_0x01ac
            r12 = r12 | 4
        L_0x01ac:
            boolean r5 = r11.A02
            if (r5 == 0) goto L_0x01b2
            r12 = r12 | 8
        L_0x01b2:
            java.lang.Long r5 = X.C17880vN.A0n(r12)
            r1.callNotificationState = r5
            X.2kW r5 = r0.A0F
            if (r5 == 0) goto L_0x01c4
            r1.isScheduledCall = r6
            java.lang.Long r5 = java.lang.Long.valueOf(r64)
            r1.randomScheduledId = r5
        L_0x01c4:
            boolean r5 = r0.A0W()
            if (r5 == 0) goto L_0x01cc
            r1.isVoiceChat = r6
        L_0x01cc:
            if (r71 == 0) goto L_0x01d0
            r1.isPhashBased = r6
        L_0x01d0:
            boolean r5 = r0.A0P()
            if (r5 == 0) goto L_0x01d8
            r1.isLidCall = r6
        L_0x01d8:
            java.lang.Boolean r5 = r1.groupCallIsLastSegment
            if (r5 == 0) goto L_0x01fa
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01fa
            com.whatsapp.jid.GroupJid r5 = r0.A0C
            if (r5 == 0) goto L_0x01fa
            X.126 r5 = r8.A08
            com.whatsapp.jid.GroupJid r11 = r0.A0C
            X.1MZ r5 = r5.A0O
            X.1MW r5 = r5.A08
            int r5 = r5.A0A(r11)
            if (r5 <= 0) goto L_0x033d
            java.lang.Long r5 = X.C17880vN.A0n(r5)
            r1.numInvitedParticipants = r5
        L_0x01fa:
            X.11C r5 = r9.A2b
            android.media.AudioManager r5 = r5.A0D()
            if (r5 != 0) goto L_0x0333
            r40 = 0
        L_0x0204:
            java.lang.Long r46 = java.lang.Long.valueOf(r62)
            java.lang.Integer r5 = r7.A08
            r21 = r5
            java.lang.Integer r5 = r7.A04
            r20 = r5
            java.lang.Integer r5 = r7.A03
            r19 = r5
            java.lang.Long r5 = r7.A09
            r18 = r5
            java.lang.Long r5 = r7.A0B
            r17 = r5
            java.lang.Long r14 = r7.A0A
            java.lang.Integer r12 = r7.A06
            java.lang.StringBuilder r11 = r7.A0E
            java.lang.Boolean r5 = r7.A02
            r38 = 0
            r41 = r57
            r34 = r8
            r35 = r1
            r36 = r15
            r37 = r5
            r39 = r38
            r42 = r21
            r43 = r20
            r44 = r19
            r45 = r12
            r47 = r18
            r48 = r17
            r49 = r14
            r52 = r11
            r50 = r59
            r51 = r60
            r34.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            if (r69 == 0) goto L_0x0259
            X.00H r5 = r9.A3D
            java.lang.Object r5 = r5.get()
            X.9mr r5 = (X.C191599mr) r5
            java.lang.String r5 = r5.A00(r3)
            r1.callRandomId = r5
        L_0x0259:
            boolean r5 = r0.A0R()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.privacySilenceUnknownCaller = r5
            X.2it r5 = r8.A09
            boolean r5 = r5.A00(r15)
            java.lang.Boolean r5 = X.C108945cZ.A1A(r5)
            r1.privacyUnknownCaller = r5
            com.whatsapp.jid.GroupJid r5 = r0.A0C
            if (r5 == 0) goto L_0x0287
            X.1Mc r11 = r8.A0A
            com.whatsapp.jid.GroupJid r5 = r0.A0C
            X.C18070vi.A0d(r5, r13)
            int r11 = X.C24901Mc.A00(r5, r11)
            r5 = 1
            if (r11 != r5) goto L_0x0287
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)
            r1.privacyUnknownCaller = r5
        L_0x0287:
            X.1i1 r12 = r8.A06
            X.A7S r11 = r8.A03
            X.1HQ r5 = r11.A02
            com.whatsapp.voipcalling.CallInfo r5 = r5.BO3()
            boolean r5 = X.A7S.A03(r5, r3)
            if (r5 != 0) goto L_0x032d
            r11 = 0
        L_0x0298:
            java.lang.Integer r5 = r1.callResult
            r12.A0G(r11, r5)
            X.A4u r11 = r8.A05
            r8 = r66
            r11.A02(r1, r8)
            if (r4 <= 0) goto L_0x0311
            com.whatsapp.fieldstats.events.WamJoinableCall r5 = new com.whatsapp.fieldstats.events.WamJoinableCall
            r5.<init>()
            if (r69 == 0) goto L_0x02b1
            java.lang.String r1 = r1.callRandomId
            r5.callRandomId = r1
        L_0x02b1:
            boolean r1 = r7.A0G
            if (r1 == 0) goto L_0x02b7
            r5.isRering = r6
        L_0x02b7:
            if (r69 == 0) goto L_0x02bb
            r5.joinableDuringCall = r6
        L_0x02bb:
            com.whatsapp.jid.GroupJid r1 = r0.A0C
            if (r1 == 0) goto L_0x02c1
            r5.isLinkedGroupCall = r6
        L_0x02c1:
            X.2kW r1 = r0.A0F
            if (r1 == 0) goto L_0x02cd
            r5.isScheduledCall = r6
            java.lang.Long r1 = java.lang.Long.valueOf(r64)
            r5.randomScheduledId = r1
        L_0x02cd:
            java.lang.Long r1 = X.C17880vN.A0n(r4)
            r5.numConnectedPeers = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r68)
            r5.videoEnabled = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r5.lobbyEntryPoint = r1
            java.lang.Integer r1 = X.C17880vN.A0m()
            r5.lobbyExit = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r61)
            r5.legacyCallResult = r1
            if (r70 == 0) goto L_0x02ef
            r5.isPendingCall = r6
        L_0x02ef:
            if (r16 == 0) goto L_0x02f3
            r5.hasSpamDialog = r6
        L_0x02f3:
            boolean r1 = r0.A0W()
            if (r1 == 0) goto L_0x02fb
            r5.isVoiceChat = r6
        L_0x02fb:
            if (r71 == 0) goto L_0x02ff
            r5.isPhashBased = r6
        L_0x02ff:
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0307
            r5.isLidCall = r6
        L_0x0307:
            X.18K r0 = r11.A00
            r0.CC7(r5)
            if (r66 == 0) goto L_0x0311
            r0.Bio()
        L_0x0311:
            java.util.Map r0 = r9.A3a
            r0.remove(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x032c
            android.os.Handler r0 = r2.A0H
            r1 = 48
            r0.removeMessages(r1)
            android.os.Handler r0 = r2.A0H
            android.os.Message r0 = r0.obtainMessage(r1, r10, r13, r3)
            r0.sendToTarget()
        L_0x032c:
            return
        L_0x032d:
            X.9Bw r11 = r11.A06(r3)
            goto L_0x0298
        L_0x0333:
            int r5 = r5.getRingerMode()
            java.lang.Integer r40 = java.lang.Integer.valueOf(r5)
            goto L_0x0204
        L_0x033d:
            java.lang.String r5 = "VoiceService:postMissedCallEventToFieldStat groupMembersCount error"
            com.whatsapp.util.Log.w((java.lang.String) r5)
            goto L_0x01fa
        L_0x0344:
            com.whatsapp.fieldstats.events.WamCall r1 = new com.whatsapp.fieldstats.events.WamCall
            r1.<init>()
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A99.A0t(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.voipcalling.CallGroupInfo, X.9Bw, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
