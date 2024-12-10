package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: X.6uC  reason: invalid class name and case insensitive filesystem */
public final class C136676uC {
    public Resources A00;
    public View A01;
    public View A02;
    public Animation A03;
    public AnonymousClass1KB A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass1HS A07;
    public AnonymousClass1M9 A08;
    public C24921Me A09;
    public C128396fv A0A;
    public C133166oH A0B;
    public AnonymousClass87F A0C;
    public UserJid A0D;
    public C139306yc A0E;
    public QrScannerOverlay A0F;
    public WaQrScannerView A0G;
    public final Charset A0H;
    public final Map A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b2, code lost:
        if (X.AnonymousClass1PJ.A02(r2, r3) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0145 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b9 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c1 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cb A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fe A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0108 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0133 A[Catch:{ 1PN -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013b A[Catch:{ 1PN -> 0x0180 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C127136dr A00(byte[] r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.6fv r3 = r6.A0A
            r2 = 0
            if (r3 == 0) goto L_0x004a
            X.6oH r0 = r6.A0B
            if (r0 == 0) goto L_0x0189
            X.1P3 r1 = r0.A01
            com.facebook.simplejni.NativeHolder r0 = r3.A00
            if (r0 == 0) goto L_0x0060
            X.1PK r0 = r1.A00
            X.0ve r2 = r0.A00
            r0 = 7469(0x1d2d, float:1.0466E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r1, r2, r0)
            r0 = 7587(0x1da3, float:1.0632E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            if (r4 != 0) goto L_0x0051
            if (r1 != 0) goto L_0x0054
            com.facebook.simplejni.NativeHolder r1 = r3.A00
            r0 = 3
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r0, r1, r7)
        L_0x0030:
            int r1 = (int) r2
            boolean r0 = X.AnonymousClass000.A1P(r1)
            X.5yc r2 = new X.5yc
            r2.<init>(r0, r1)
        L_0x003a:
            int r1 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x004a
            r0 = -4
            if (r1 != r0) goto L_0x004b
            java.lang.String r0 = "idverification/invalidprotobuf"
        L_0x0047:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004a:
            return r2
        L_0x004b:
            r0 = -1
            if (r1 != r0) goto L_0x004a
            java.lang.String r0 = "idverification/versionmismatch"
            goto L_0x0047
        L_0x0051:
            r0 = r4
            if (r1 == 0) goto L_0x0055
        L_0x0054:
            r0 = 2
        L_0x0055:
            r4 = r4 | r0
            com.facebook.simplejni.NativeHolder r3 = r3.A00
            r2 = 19
            long r0 = (long) r4
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIOO(r2, r0, r3, r7)
            goto L_0x0030
        L_0x0060:
            X.8aa r2 = r3.A02     // Catch:{ 1PN -> 0x0180 }
            X.8aa r0 = X.C165098aa.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r7)     // Catch:{ 1PN -> 0x0180 }
            X.8aa r3 = (X.C165098aa) r3     // Catch:{ 1PN -> 0x0180 }
            int r1 = r3.bitField0_     // Catch:{ 1PN -> 0x0180 }
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0177
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0177
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0177
            int r1 = r3.version_     // Catch:{ 1PN -> 0x0180 }
            int r0 = r2.version_     // Catch:{ 1PN -> 0x0180 }
            if (r1 != r0) goto L_0x0177
            X.8Zk r0 = r2.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0084
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x0084:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x008c
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x008c:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            r5 = 1
            if (r0 == 0) goto L_0x00b4
            X.8Zk r0 = r2.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x009b
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x009b:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00a3
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00a3:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00ad
            r4 = -2
            goto L_0x00b5
        L_0x00ad:
            boolean r0 = X.AnonymousClass1PJ.A02(r2, r3)     // Catch:{ 1PN -> 0x0180 }
            r4 = 1
            if (r0 != 0) goto L_0x00b5
        L_0x00b4:
            r4 = 2
        L_0x00b5:
            X.8Zk r0 = r2.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00bb
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00bb:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00c3
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00c3:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 == 0) goto L_0x00f2
            X.8Zk r0 = r2.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00d1
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00d1:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00d9
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00d9:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00ea
            r1 = -2
            r0 = 0
            X.5yb r2 = new X.5yb     // Catch:{ 1PN -> 0x0180 }
            r2.<init>(r0, r1)     // Catch:{ 1PN -> 0x0180 }
            goto L_0x003a
        L_0x00ea:
            boolean r0 = X.AnonymousClass1PJ.A01(r2, r3)     // Catch:{ 1PN -> 0x0180 }
            int r4 = X.C72453Mb.A04(r0)
        L_0x00f2:
            X.8Zk r0 = r2.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x00f8
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x00f8:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0100
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x0100:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 == 0) goto L_0x012f
            X.8Zk r0 = r2.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x010e
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x010e:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0116
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x0116:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0127
            r1 = -3
            r0 = 0
            X.5yb r2 = new X.5yb     // Catch:{ 1PN -> 0x0180 }
            r2.<init>(r0, r1)     // Catch:{ 1PN -> 0x0180 }
            goto L_0x003a
        L_0x0127:
            boolean r0 = X.AnonymousClass1PJ.A02(r2, r3)     // Catch:{ 1PN -> 0x0180 }
            int r4 = X.C72453Mb.A04(r0)
        L_0x012f:
            X.8Zk r0 = r2.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0135
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x0135:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.remoteFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x013d
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x013d:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 == 0) goto L_0x016c
            X.8Zk r0 = r2.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x014b
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x014b:
            X.DSQ r1 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            X.8Zk r0 = r3.localFingerprint_     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0153
            X.8Zk r0 = X.C164588Zk.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0180 }
        L_0x0153:
            X.DSQ r0 = r0.identifier_     // Catch:{ 1PN -> 0x0180 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x0164
            r1 = -3
            r0 = 0
            X.5yb r2 = new X.5yb     // Catch:{ 1PN -> 0x0180 }
            r2.<init>(r0, r1)     // Catch:{ 1PN -> 0x0180 }
            goto L_0x003a
        L_0x0164:
            boolean r0 = X.AnonymousClass1PJ.A01(r2, r3)     // Catch:{ 1PN -> 0x0180 }
            if (r0 != 0) goto L_0x016b
            r5 = 2
        L_0x016b:
            r4 = r5
        L_0x016c:
            r0 = 1
            if (r4 == r0) goto L_0x0170
            r0 = 0
        L_0x0170:
            X.5yb r2 = new X.5yb     // Catch:{ 1PN -> 0x0180 }
            r2.<init>(r0, r4)     // Catch:{ 1PN -> 0x0180 }
            goto L_0x003a
        L_0x0177:
            r1 = -1
            r0 = 0
            X.5yb r2 = new X.5yb     // Catch:{ 1PN -> 0x0180 }
            r2.<init>(r0, r1)     // Catch:{ 1PN -> 0x0180 }
            goto L_0x003a
        L_0x0180:
            r1 = -4
            r0 = 0
            X.5yb r2 = new X.5yb
            r2.<init>(r0, r1)
            goto L_0x003a
        L_0x0189:
            java.lang.String r0 = "fingerprintUtil"
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136676uC.A00(byte[]):X.6dr");
    }

    public final void A01(View view, AnonymousClass87F r3, UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        this.A0D = userJid;
        this.A0C = r3;
        this.A00 = view.getResources();
        this.A02 = view.findViewById(2131432248);
        this.A0G = (WaQrScannerView) view.findViewById(2131434258);
        this.A0F = (QrScannerOverlay) view.findViewById(2131433364);
        this.A01 = view.findViewById(2131430949);
        this.A06 = AnonymousClass3MW.A0U(view, 2131436721);
        this.A05 = AnonymousClass3MW.A0U(view, 2131430526);
    }

    public final void A02(Runnable runnable) {
        String str;
        View view;
        WaQrScannerView waQrScannerView = this.A0G;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            C139306yc r1 = this.A0E;
            if (r1 != null) {
                UserJid userJid = this.A0D;
                if (userJid == null) {
                    str = "jid";
                } else {
                    if (r1.A00(userJid)) {
                        view = this.A01;
                    } else {
                        view = this.A06;
                    }
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    C108975cc.A0q(this.A02);
                    QrScannerOverlay qrScannerOverlay = this.A0F;
                    if (qrScannerOverlay != null) {
                        qrScannerOverlay.setVisibility(8);
                    }
                    WaTextView waTextView = this.A05;
                    if (waTextView != null) {
                        waTextView.setVisibility(8);
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                    Resources resources = this.A00;
                    if (resources == null) {
                        str = "resources";
                    } else {
                        translateAnimation.setDuration((long) resources.getInteger(17694721));
                        translateAnimation.setAnimationListener(new C114525qy(this, runnable, 1));
                        View view2 = this.A02;
                        if (view2 != null) {
                            view2.startAnimation(translateAnimation);
                            return;
                        }
                        return;
                    }
                }
            } else {
                str = "keyTransparencyManager";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public C136676uC() {
        Charset charset = C26571Sq.A00;
        this.A0H = charset;
        this.A0I = C108975cc.A0h(C24336BzX.A01, charset);
    }
}
