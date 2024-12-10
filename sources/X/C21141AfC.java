package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AfC  reason: case insensitive filesystem */
public class C21141AfC implements C28608E9z {
    public int A00 = 0;
    public CallGridViewModel A01;
    public DRB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1HQ A04;
    public final C18030ve A05;
    public final VoipCameraManager A06;
    public final AnonymousClass00H A07;
    public final Map A08 = AnonymousClass8BR.A17();
    public final ConcurrentHashMap A09 = AnonymousClass8BR.A17();
    public final AtomicInteger A0A = new AtomicInteger(0);
    public final C185769d7 A0B;
    public final C184289ai A0C = new C184289ai(this);
    public final C219217x A0D;
    public final AnonymousClass1DC A0E;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9Pv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v1, types: [com.whatsapp.voipcalling.GlVideoRenderer, java.lang.Object] */
    public static DRB A00(C21141AfC afC, UserJid userJid, boolean z) {
        C21141AfC afC2 = afC;
        UserJid userJid2 = userJid;
        if (afC.A02 != null && C40811vJ.A0K(afC.A03, userJid)) {
            return afC.A02;
        }
        Map map = afC.A08;
        if (map.containsKey(userJid)) {
            Object obj = map.get(userJid);
            C17960vV.A07(obj);
            return (DRB) obj;
        }
        C17900vP.A0Y(userJid, "voip/VideoPortManager/getVideoPort creating port for ", AnonymousClass000.A10());
        C185769d7 r1 = afC.A0B;
        C18030ve r6 = r1.A01;
        DRB drb = new DRB(new Object(), afC2, r6, userJid2, afC.A0E, new Object(), !r1.A00.A0O(userJid), z);
        if (C40811vJ.A0K(afC2.A03, userJid2)) {
            afC2.A02 = drb;
            return drb;
        }
        map.put(userJid2, drb);
        return drb;
    }

    public void Ble(int i) {
    }

    public void BnX(VoipPhysicalCamera voipPhysicalCamera, int i) {
    }

    public void Bp6(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public void BzX() {
    }

    public static void A01(DRB drb, C21141AfC afC) {
        if (afC.A00 >= 10) {
            Log.e("voip/VideoPortManager/setVideoPort failed to setup self port");
            AnonymousClass7R9 r4 = new AnonymousClass7R9((Object) afC, 5);
            if (C18020vd.A05(C18040vf.A02, afC.A05, 7585)) {
                Voip.setAsyncCaptureFailed();
                C184289ai r3 = afC.A0C;
                synchronized (r3) {
                    Handler handler = r3.A00;
                    if (handler != null) {
                        handler.postDelayed(r4, 0);
                    }
                }
                return;
            }
            r4.run();
            return;
        }
        Log.i("voip/VideoPortManager/setVideoPort failed for self, retrying");
        C184289ai r42 = afC.A0C;
        AnonymousClass7RL r32 = new AnonymousClass7RL(afC, drb, 13);
        synchronized (r42) {
            Handler handler2 = r42.A00;
            if (handler2 != null) {
                handler2.postDelayed(r32, 500);
            }
        }
    }

    public static void A02(DRB drb, C21141AfC afC) {
        int videoPreviewPort;
        UserJid userJid = drb.A0D;
        if (C40811vJ.A0K(afC.A03, userJid)) {
            if (AnonymousClass74H.A0A(afC.A0D, afC.A0E, true)) {
                Log.w("voip/VideoPortManager/ camera permissions not granted, unable to set video preview port");
                return;
            }
            C184289ai r4 = afC.A0C;
            synchronized (r4) {
                if (r4.A00 == null) {
                    r4.A00 = new Handler(Looper.getMainLooper(), new AnonymousClass75Y(r4.A01, 3));
                }
            }
            if (AnonymousClass1HR.A00((AnonymousClass1HR) afC.A04)) {
                Log.i("VoipNative/setVideoPreviewPort skipping as call ended or ending");
                videoPreviewPort = 670007;
            } else {
                videoPreviewPort = Voip.setVideoPreviewPort(drb);
            }
            afC.A0A.set(videoPreviewPort);
            afC.A00++;
            if (!C18020vd.A05(C18040vf.A02, afC.A05, 7585)) {
                if (videoPreviewPort == 0) {
                    afC.A06.addCameraErrorListener(afC);
                    afC.A00 = 0;
                    return;
                }
            } else if (videoPreviewPort == 0) {
                return;
            }
            A01(drb, afC);
            return;
        }
        C21434Ak1 ak1 = new C21434Ak1(afC, userJid, drb, 30);
        if (C18020vd.A05(C18040vf.A02, afC.A05, 7807)) {
            ((C200710s) afC.A07.get()).execute(ak1);
        } else {
            ak1.run();
        }
    }

    public static void A03(C21141AfC afC) {
        AnonymousClass1HR r2 = (AnonymousClass1HR) afC.A04;
        if (AnonymousClass1HR.A00(r2)) {
            Log.i("VoipNative/setVideoPreviewPort skipping as call ended or ending");
        } else {
            Voip.setVideoPreviewPort((VideoPort) null);
        }
        if (AnonymousClass1HR.A00(r2)) {
            Log.i("VoipNative/setVideoPreviewSize skipping as call ended or ending");
        } else {
            Voip.setVideoPreviewSize(0, 0);
        }
        afC.A06.removeCameraErrorListener(afC);
        C184289ai r22 = afC.A0C;
        synchronized (r22) {
            Handler handler = r22.A00;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                r22.A00 = null;
            }
        }
    }

    public void A05() {
        C184289ai r2 = this.A0C;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        }
    }

    public void A06() {
        DRB drb = this.A02;
        if (drb == null) {
            Log.w("voip/VideoPortManager/startCameraPreview no self video port");
            return;
        }
        if (AnonymousClass000.A1Y(C24617CCd.A00(drb.A0A, AnonymousClass000.A0h(), new C27132DVt((Object) drb, 22))) || drb.A05 != null) {
            A02(drb, this);
        } else {
            drb.A09 = false;
        }
    }

    public void A07(UserJid userJid) {
        if (C40811vJ.A0K(this.A03, userJid)) {
            DRB drb = this.A02;
            if (drb != null) {
                drb.release();
                this.A02 = null;
                return;
            }
            return;
        }
        Map map = this.A08;
        if (map.containsKey(userJid)) {
            C17900vP.A0Y(userJid, "voip/VideoPortManager/releaseVideoPort releasing port for ", AnonymousClass000.A10());
            Object obj = map.get(userJid);
            C17960vV.A07(obj);
            ((DRB) obj).release();
            map.remove(userJid);
        }
    }

    public void BtT() {
        C184289ai r2 = this.A0C;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.sendEmptyMessage(1);
            }
        }
    }

    public C21141AfC(AnonymousClass11S r3, AnonymousClass1HQ r4, C185769d7 r5, C219217x r6, C18030ve r7, AnonymousClass1DC r8, AnonymousClass10I r9, VoipCameraManager voipCameraManager) {
        this.A05 = r7;
        this.A03 = r3;
        this.A04 = r4;
        this.A0E = r8;
        this.A0B = r5;
        this.A06 = voipCameraManager;
        this.A0D = r6;
        this.A07 = C18150vq.A01(new C21516AlP(r9, 2));
    }

    public void A04() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/VideoPortManager/releaseAllVideoPorts releasing ");
        Map map = this.A08;
        A10.append(map.size());
        C17890vO.A1A(A10, " remaining ports");
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            ((DRB) C17890vO.A0P(A15)).release();
        }
        map.clear();
        DRB drb = this.A02;
        if (drb != null) {
            drb.release();
            this.A02 = null;
        }
        C184289ai r2 = this.A0C;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                r2.A00 = null;
            }
        }
        this.A00 = 0;
        this.A0A.set(0);
    }

    public void C5E() {
        A05();
    }

    public void C9W() {
        A05();
    }
}
