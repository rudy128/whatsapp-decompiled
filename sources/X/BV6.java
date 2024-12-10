package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$decreaseBrightness$1;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.util.concurrent.CancellationException;

public abstract class BV6 extends C05050Qf implements C17110tl {
    public DFL A00;
    public final long A01;
    public final boolean A02;

    public static Integer A01(DOZ doz, DFL dfl, int i) {
        DFL A09 = dfl.A09(i);
        if (A09 != null) {
            return Integer.valueOf(C25340Cdz.A01(doz, A09, 0));
        }
        return null;
    }

    public C17110tl A0D() {
        return this;
    }

    public BV6(DOZ doz, DFL dfl) {
        super(AnonymousClass00R.A01);
        this.A01 = (long) dfl.A04;
        this.A00 = dfl;
        this.A02 = !C26272CwJ.A08(doz);
        AnonymousClass0Ij[] r3 = {new AnonymousClass0Ij(new C26829DFl(doz, this), this), new AnonymousClass0Ij(new C23685Bns(doz, this), this)};
        int i = 0;
        do {
            A0L(r3[i]);
            i++;
        } while (i < 2);
    }

    public long A0C() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C6e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.C5H] */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Object, X.C5H] */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Object, X.C5H] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, X.C5H] */
    /* JADX WARNING: type inference failed for: r2v50, types: [java.lang.Object, X.CMs] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030d, code lost:
        if (r2 != false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0455, code lost:
        if (r3.A0I(58, false) != false) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0643, code lost:
        if (r1.equals("front") != false) goto L_0x0645;
     */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06f9 A[SYNTHETIC, Splitter:B:292:0x06f9] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0877  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0M(android.view.View r23, X.DOZ r24, X.DFL r25, java.lang.Object r26) {
        /*
            r22 = this;
            r4 = r26
            r14 = r23
            r15 = r22
            boolean r0 = r15 instanceof X.C23708BoF
            if (r0 == 0) goto L_0x0020
            X.BoF r15 = (X.C23708BoF) r15
            X.DFL r3 = r15.A00
            java.lang.String r2 = X.BE7.A0e(r3)
            r1 = 35
            r0 = 0
            boolean r1 = r3.A0I(r1, r0)
            X.Cqj r0 = r15.A01
            r0.A03(r14, r2, r1)
        L_0x001e:
            r0 = 0
            return r0
        L_0x0020:
            boolean r1 = r15 instanceof X.C23707BoE
            r0 = r24
            if (r1 == 0) goto L_0x009b
            X.BoE r15 = (X.C23707BoE) r15
            X.DFL r3 = r15.A00
            r1 = 52
            r2 = 1
            boolean r18 = r3.A0I(r1, r2)
            r1 = 56
            boolean r17 = r3.A0I(r1, r2)
            r1 = 59
            r5 = 0
            boolean r19 = r3.A0I(r1, r5)
            r1 = 44
            java.util.List r1 = r3.A0G(r1)
            java.util.Iterator r9 = r1.iterator()
            r8 = 0
            r16 = r8
            r15 = r8
            r7 = 0
            r6 = 0
        L_0x004e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x007d
            X.DFL r4 = X.BE6.A0d(r9)
            java.lang.String r2 = "regular"
            java.lang.String r1 = X.BE7.A0e(r4)
            if (r1 == 0) goto L_0x0061
            r2 = r1
        L_0x0061:
            java.lang.String r1 = "hd"
            boolean r3 = r2.equals(r1)
            r2 = 35
            r1 = 41
            if (r3 == 0) goto L_0x008a
            android.net.Uri r16 = X.BEA.A0K(r4)
            int r7 = r4.A04(r1, r5)
            int r6 = r4.A04(r2, r5)
        L_0x0079:
            if (r16 == 0) goto L_0x004e
            if (r15 == 0) goto L_0x004e
        L_0x007d:
            android.content.Context r0 = r0.A00
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r0)
            if (r23 == 0) goto L_0x0089
            if (r15 != 0) goto L_0x0658
            if (r16 != 0) goto L_0x0658
        L_0x0089:
            return r8
        L_0x008a:
            android.net.Uri r15 = X.BEA.A0K(r4)
            if (r7 == 0) goto L_0x0092
            if (r6 != 0) goto L_0x0079
        L_0x0092:
            int r7 = r4.A04(r1, r5)
            int r6 = r4.A04(r2, r5)
            goto L_0x0079
        L_0x009b:
            boolean r1 = r15 instanceof X.C23706BoD
            if (r1 == 0) goto L_0x0131
            X.BoD r15 = (X.C23706BoD) r15
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            X.DFL r5 = r15.A00
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            android.net.Uri r1 = X.C25865CnY.A00(r0, r5)
            if (r1 == 0) goto L_0x012f
            java.lang.String r3 = r1.toString()
        L_0x00b3:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r7 = 0
            if (r1 != 0) goto L_0x012d
            java.lang.String r1 = "^data:image/(png|jpeg|jpg|gif);base64,([A-Za-z0-9+/=]+)$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r2 = r1.matcher(r3)
            boolean r1 = r2.find()
            if (r1 == 0) goto L_0x012d
            r1 = 2
            java.lang.String r6 = r2.group(r1)
        L_0x00cf:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r11 = 0
            if (r1 != 0) goto L_0x06c4
            if (r6 != 0) goto L_0x06c4
            r1 = 44
            X.E8A r1 = r5.A0A(r1)
            if (r1 == 0) goto L_0x00e5
            X.6wb r7 = new X.6wb
            r7.<init>(r0, r5, r1)
        L_0x00e5:
            X.C26272CwJ.A04(r0, r5)
            boolean r1 = r4 instanceof android.graphics.Rect
            if (r1 == 0) goto L_0x012b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x00ee:
            X.Cqj r8 = r15.A01
            android.net.Uri r10 = android.net.Uri.parse(r3)
            java.lang.String r2 = "static.whatsapp.net"
            java.lang.String r1 = r10.getHost()
            boolean r9 = r2.equals(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = r10.getHost()
            r2.append(r1)
            java.lang.String r1 = r10.getPath()
            if (r9 == 0) goto L_0x0116
            r2.append(r1)
            java.lang.String r1 = r10.getQuery()
        L_0x0116:
            java.lang.String r21 = X.AnonymousClass000.A0y(r1, r2)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2 = 0
            X.A3z r1 = X.C20030A3z.A01
            android.net.Uri r1 = X.AnonymousClass9OR.A00(r3, r2)
            java.lang.String r20 = r1.toString()
            goto L_0x066a
        L_0x012b:
            r4 = r11
            goto L_0x00ee
        L_0x012d:
            r6 = r7
            goto L_0x00cf
        L_0x012f:
            r3 = 0
            goto L_0x00b3
        L_0x0131:
            boolean r1 = r15 instanceof X.C23705BoC
            if (r1 == 0) goto L_0x01ae
            X.BoC r15 = (X.C23705BoC) r15
            X.DFL r3 = r15.A00
            java.lang.String r1 = X.BE7.A0f(r3)
            java.lang.String r5 = "image"
            r2 = 45
            java.lang.String r2 = r3.A0D(r2)
            if (r2 == 0) goto L_0x0148
            r5 = r2
        L_0x0148:
            r2 = 43
            java.lang.String r9 = r3.A0D(r2)
            r2 = 46
            java.lang.String r8 = r3.A0D(r2)
            java.lang.String r11 = X.BE7.A0i(r3)
            X.COM r4 = new X.COM
            r4.<init>(r0, r3)
            java.lang.ref.WeakReference r7 = X.AnonymousClass3MW.A0z(r0)
            java.lang.ref.WeakReference r3 = X.AnonymousClass3MW.A0z(r3)
            r2 = 0
            X.D6N r6 = new X.D6N
            r6.<init>(r3, r7, r2)
            X.CsU r3 = r15.A01
            android.content.Context r13 = r0.A00
            r3.A00 = r2
            X.DOZ r7 = r4.A00
            X.DFL r0 = r4.A01
            java.lang.Object r7 = X.C26272CwJ.A04(r7, r0)
            X.C25344Ce3.A00(r7)
            X.CUD r7 = (X.CUD) r7
            X.C17960vV.A07(r7)
            android.util.DisplayMetrics r10 = X.C108965cb.A07()
            int r0 = r10.heightPixels
            r7.A01 = r0
            int r0 = r10.widthPixels
            r7.A02 = r0
            r0 = 2131428239(0x7f0b038f, float:1.8478117E38)
            android.view.ViewGroup r12 = X.AnonymousClass3MW.A0C(r14, r0)
            java.lang.String r0 = "front"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x01aa
            r10 = 1
            r7.A00 = r10
        L_0x019f:
            int r1 = android.hardware.Camera.getNumberOfCameras()
            int r0 = r10 + 1
            if (r1 >= r0) goto L_0x0715
            r10 = 0
            goto L_0x0715
        L_0x01aa:
            r10 = 0
            r7.A00 = r2
            goto L_0x019f
        L_0x01ae:
            boolean r1 = r15 instanceof X.C23709BoG
            if (r1 == 0) goto L_0x0203
            X.BoG r15 = (X.C23709BoG) r15
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            X.C18070vi.A0h(r14, r0)
            X.CTN r4 = r15.A04
            X.17r r1 = r4.A06
            java.io.File r2 = r1.A09()
            java.lang.String r1 = "TEMP_SELFIE.jpg"
            java.io.File r3 = X.C17880vN.A0e(r2, r1)
            X.CMs r2 = new X.CMs
            r2.<init>()
            boolean r1 = r15.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r1
            java.lang.String r1 = r3.getCanonicalPath()
            r2.A01 = r1
            X.D3v r5 = new X.D3v
            r5.<init>((X.C24849CMs) r2)
            android.content.Context r2 = r0.A00
            X.COL r1 = r15.A02
            X.CLj r0 = r15.A03
            r3 = 0
            X.CkI r6 = new X.CkI
            r6.<init>(r2, r5, r1, r0)
            r15.A00 = r6
            r6.A00 = r14
            X.EDL r7 = r6.A02
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.cameracore.litecamera.LiteCameraController"
            if (r7 != 0) goto L_0x07a5
            X.CLj r2 = r6.A08
            r0 = 0
            X.DAa r1 = new X.DAa
            r1.<init>(r6, r0)
            X.BoG r0 = r2.A00
            X.EDL r7 = r0.A01
            goto L_0x0789
        L_0x0203:
            boolean r1 = r15 instanceof X.C23704BoB
            r3 = r25
            if (r1 == 0) goto L_0x022c
            X.BoB r15 = (X.C23704BoB) r15
            X.03P r14 = (X.AnonymousClass03P) r14
            X.Cqj r4 = r15.A01
            X.CCX.A00(r14, r0, r3, r4)
            X.DFL r2 = r15.A00
            r1 = 46
            X.DFL r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x0223
            int r0 = X.C25340Cdz.A00(r0, r1)
            r14.setTextColor(r0)
        L_0x0223:
            com.whatsapp.TextEmojiLabel r14 = (com.whatsapp.TextEmojiLabel) r14
            X.0ve r0 = r4.A05
            X.AnonymousClass3Ma.A1L(r0, r14)
            goto L_0x001e
        L_0x022c:
            boolean r1 = r15 instanceof X.C23695Bo2
            if (r1 == 0) goto L_0x0244
            r1 = 35
            X.E8A r4 = r3.A0A(r1)
            if (r4 == 0) goto L_0x001e
            r2 = 44
        L_0x023a:
            X.AkM r1 = new X.AkM
            r1.<init>(r3, r4, r0, r2)
            r14.post(r1)
            goto L_0x001e
        L_0x0244:
            boolean r1 = r15 instanceof X.C23694Bo1
            if (r1 == 0) goto L_0x0253
            r1 = 35
            X.E8A r4 = r3.A0A(r1)
            if (r4 == 0) goto L_0x001e
            r2 = 43
            goto L_0x023a
        L_0x0253:
            boolean r1 = r15 instanceof X.C23700Bo7
            if (r1 == 0) goto L_0x026d
            X.Bo7 r15 = (X.C23700Bo7) r15
            X.03P r14 = (X.AnonymousClass03P) r14
            X.Cqj r2 = r15.A00
            android.text.SpannableStringBuilder r1 = X.C25914CoY.A00(r0, r3)
            X.C25914CoY.A01(r1, r14, r0, r3, r2)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r14.setMovementMethod(r0)
            goto L_0x001e
        L_0x026d:
            boolean r1 = r15 instanceof X.C23703BoA
            if (r1 == 0) goto L_0x0314
            X.BoA r15 = (X.C23703BoA) r15
            r1 = 40
            r5 = -1
            int r2 = r3.A04(r1, r5)
            r1 = 38
            int r9 = r3.A04(r1, r5)
            r1 = 42
            int r4 = r3.A04(r1, r5)
            r1 = 35
            int r5 = r3.A04(r1, r5)
            X.DFL r7 = r15.A00
            r3 = 36
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7.A03(r3, r1)
            r1 = 41
            X.E8A r1 = r7.A0A(r1)
            r8 = 0
            if (r1 == 0) goto L_0x0312
            X.CQS r3 = new X.CQS
            r3.<init>(r0, r7, r1)
        L_0x02a4:
            r0 = 2131428255(0x7f0b039f, float:1.847815E38)
            android.view.View r7 = X.AnonymousClass1HF.A06(r14, r0)
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r7 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r7
            float r2 = (float) r2
            float r1 = (float) r9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e9
            r7.A01 = r2
            r7.A00 = r1
            float r0 = r7.A03
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x02ce
            float r0 = r7.A02
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x02ce
            r7.A03 = r2
            r7.A02 = r1
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x02ce:
            float r0 = r7.A03
            float r1 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0310
            r7.A03 = r1
            r2 = 1
        L_0x02d9:
            float r0 = r7.A02
            float r1 = r7.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x030d
            r7.A02 = r1
        L_0x02e3:
            r7.invalidate()
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x02e9:
            float r2 = (float) r4
            float r1 = (float) r5
            float r0 = r7.A01
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0305
            float r0 = r7.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0305
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0305
            r7.A03 = r2
            r7.A02 = r1
            r7.invalidate()
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.A02(r7)
        L_0x0305:
            X.DOk r0 = new X.DOk
            r0.<init>(r3, r6)
            r7.A05 = r0
            return r8
        L_0x030d:
            if (r2 == 0) goto L_0x02e9
            goto L_0x02e3
        L_0x0310:
            r2 = 0
            goto L_0x02d9
        L_0x0312:
            r3 = r8
            goto L_0x02a4
        L_0x0314:
            boolean r1 = r15 instanceof X.C23699Bo6
            if (r1 == 0) goto L_0x0338
            r1 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r14, r1)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            X.DFL r1 = X.BE7.A0O(r3)
            if (r4 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            int r2 = X.C25340Cdz.A00(r0, r1)
            android.graphics.drawable.Drawable r1 = r4.getIndeterminateDrawable()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r2, r0)
            goto L_0x001e
        L_0x0338:
            boolean r1 = r15 instanceof X.C23698Bo5
            if (r1 == 0) goto L_0x0345
            X.Bo5 r15 = (X.C23698Bo5) r15
            X.Cqj r1 = r15.A00
            X.AnonymousClass9PZ.A00(r14, r0, r3, r1)
            goto L_0x001e
        L_0x0345:
            boolean r1 = r15 instanceof X.C23697Bo4
            if (r1 == 0) goto L_0x0352
            X.Bo4 r15 = (X.C23697Bo4) r15
            X.Cqj r1 = r15.A00
            X.C123746Vr.A00(r14, r0, r3, r1)
            goto L_0x001e
        L_0x0352:
            boolean r1 = r15 instanceof X.C23693Bo0
            if (r1 == 0) goto L_0x038c
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r14 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r14
            X.C18070vi.A0n(r14, r0, r3)
            X.0Mk r4 = (X.C04240Mk) r4
            java.lang.Object r2 = X.C26272CwJ.A04(r0, r3)
            X.DNQ r2 = (X.DNQ) r2
            if (r2 == 0) goto L_0x0808
            r2.A00 = r14
            X.D76 r1 = new X.D76
            r1.<init>(r0, r3, r2)
            r14.A0E = r1
            boolean r0 = r2.A01
            r14.setRefreshing(r0)
            int r3 = r14.getChildCount()
            r2 = 0
        L_0x0378:
            if (r2 >= r3) goto L_0x0801
            android.view.View r1 = r14.getChildAt(r2)
            boolean r0 = r1 instanceof X.C01920By
            if (r0 == 0) goto L_0x0389
            X.0By r1 = (X.C01920By) r1
            r1.setRenderTree(r4)
            goto L_0x001e
        L_0x0389:
            int r2 = r2 + 1
            goto L_0x0378
        L_0x038c:
            boolean r1 = r15 instanceof X.C23702Bo9
            if (r1 == 0) goto L_0x0406
            X.Bo9 r15 = (X.C23702Bo9) r15
            r4 = 0
            X.C18070vi.A0e(r14, r4, r3)
            X.DOZ r1 = r15.A00
            X.DFL r0 = r15.A01
            java.lang.Object r0 = X.BE9.A0l(r1, r0)
            X.CiJ r0 = (X.C25579CiJ) r0
            r0.A00 = r14
            X.0vl r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.CWp r5 = (X.C25080CWp) r5
            r0 = 44
            boolean r0 = r3.A0I(r0, r4)
            if (r0 == 0) goto L_0x03fa
            X.BIv r6 = r5.A02
            boolean r0 = r6.isShowing()
            if (r0 == 0) goto L_0x03ea
            X.0vl r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.Cpy r0 = (X.C25984Cpy) r0
            X.0Mk r2 = r0.A02(r14, r3)
            if (r2 == 0) goto L_0x03e6
            android.view.View r1 = r6.getContentView()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView"
            X.C18070vi.A0z(r1, r0)
            X.0By r1 = (X.C01920By) r1
            r1.setRenderTree(r2)
            X.CbA r0 = r5.A00
            if (r0 == 0) goto L_0x03e6
            android.graphics.RectF r1 = r0.A02
            float r0 = r1.left
            int r2 = (int) r0
            float r0 = r1.top
            int r1 = (int) r0
            r0 = -1
            r6.update(r2, r1, r0, r0)
        L_0x03e6:
            r5.A01 = r4
            goto L_0x001e
        L_0x03ea:
            X.CbA r0 = r5.A00
            if (r0 == 0) goto L_0x03e6
            android.graphics.RectF r2 = r0.A02
            float r0 = r2.left
            int r1 = (int) r0
            float r0 = r2.top
            int r0 = (int) r0
            r6.A01(r14, r1, r0)
            goto L_0x03e6
        L_0x03fa:
            X.BIv r0 = r5.A02
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x03e6
            r5.A00()
            goto L_0x03e6
        L_0x0406:
            boolean r1 = r15 instanceof X.C23692Bnz
            if (r1 == 0) goto L_0x0422
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r2 = 0
            X.C18070vi.A0d(r14, r2)
            X.C18070vi.A0j(r0, r3)
            X.DFL r1 = X.BE7.A0O(r3)
            if (r1 == 0) goto L_0x001e
            int r0 = X.C25340Cdz.A01(r0, r1, r2)
            r14.setColorFilter(r0)
            goto L_0x001e
        L_0x0422:
            boolean r1 = r15 instanceof X.C23691Bny
            if (r1 != 0) goto L_0x001e
            boolean r1 = r15 instanceof X.C23696Bo3
            if (r1 == 0) goto L_0x0437
            X.BHh r14 = (X.C22645BHh) r14
            X.C18070vi.A0h(r14, r0)
            X.0Mi r4 = (X.C04220Mi) r4
            r14.setRenderResult(r4, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0437:
            boolean r1 = r15 instanceof X.C23690Bnx
            if (r1 == 0) goto L_0x050e
            X.Bnx r15 = (X.C23690Bnx) r15
            r1 = 35
            r2 = 0
            boolean r5 = r3.A0I(r1, r2)
            r1 = 51
            boolean r1 = r3.A0I(r1, r2)
            r6 = 1
            if (r1 != 0) goto L_0x0457
            r1 = 58
            boolean r1 = r3.A0I(r1, r2)
            r19 = 0
            if (r1 == 0) goto L_0x0459
        L_0x0457:
            r19 = 1
        L_0x0459:
            r1 = 36
            X.E8A r18 = r3.A0A(r1)
            r2 = r14
            X.E9c r2 = (X.C28588E9c) r2
            r1 = r2
            X.BIR r1 = (X.BIR) r1
            android.widget.Switch r4 = r1.A00
            r4.setChecked(r5)
            r1 = 38
            boolean r1 = r3.A0I(r1, r6)
            r14.setEnabled(r1)
            if (r19 != 0) goto L_0x0477
            if (r18 == 0) goto L_0x0485
        L_0x0477:
            X.D5T r13 = new X.D5T
            r20 = r5
            r17 = r3
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r4.setOnCheckedChangeListener(r13)
        L_0x0485:
            android.content.Context r10 = r0.A00
            r1 = 40
            X.DFL r1 = r3.A09(r1)
            r14 = 0
            if (r1 != 0) goto L_0x0505
            r11 = r14
        L_0x0491:
            r1 = 41
            java.lang.Integer r9 = A01(r0, r3, r1)
            r1 = 43
            java.lang.Integer r13 = A01(r0, r3, r1)
            r1 = 48
            java.lang.Integer r12 = A01(r0, r3, r1)
            r1 = 42
            java.lang.Integer r8 = A01(r0, r3, r1)
            r1 = 46
            java.lang.Integer r7 = A01(r0, r3, r1)
            r1 = 45
            java.lang.Integer r6 = A01(r0, r3, r1)
            r1 = 50
            java.lang.Integer r5 = A01(r0, r3, r1)
            r1 = 44
            java.lang.Integer r4 = A01(r0, r3, r1)
            r1 = 49
            java.lang.Integer r1 = A01(r0, r3, r1)
            if (r13 != 0) goto L_0x04fd
            if (r8 != 0) goto L_0x04fd
            if (r12 != 0) goto L_0x04ce
            r12 = r11
        L_0x04ce:
            if (r7 != 0) goto L_0x04d1
            r7 = r9
        L_0x04d1:
            android.content.res.ColorStateList r0 = X.C25900CoC.A00(r10, r11, r9, r12, r7)
            r2.CL7(r0)
        L_0x04d8:
            if (r6 != 0) goto L_0x04f5
            if (r4 != 0) goto L_0x04f5
            if (r5 != 0) goto L_0x04df
            r5 = r11
        L_0x04df:
            if (r1 != 0) goto L_0x04e2
            r1 = r9
        L_0x04e2:
            android.content.res.ColorStateList r0 = X.C25900CoC.A01(r10, r11, r9, r5, r1)
            r2.CLB(r0)
        L_0x04e9:
            r1 = 59
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.A03(r1, r0)
            r2.CL6(r0)
            return r14
        L_0x04f5:
            android.content.res.ColorStateList r0 = X.C25900CoC.A01(r10, r6, r4, r5, r1)
            r2.CLB(r0)
            goto L_0x04e9
        L_0x04fd:
            android.content.res.ColorStateList r0 = X.C25900CoC.A00(r10, r13, r8, r12, r7)
            r2.CL7(r0)
            goto L_0x04d8
        L_0x0505:
            int r1 = X.C25340Cdz.A00(r0, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            goto L_0x0491
        L_0x050e:
            boolean r1 = r15 instanceof X.C23689Bnw
            if (r1 == 0) goto L_0x0556
            X.BIg r14 = (X.C22656BIg) r14
            r6 = 0
            X.C18070vi.A0d(r14, r6)
            X.C18070vi.A0j(r0, r3)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = 35
            X.DFL r2 = r3.A09(r4)
            r3 = 24
            if (r2 == 0) goto L_0x0542
            r1 = 36
            java.lang.String r1 = r2.A0D(r1)     // Catch:{ 9HX -> 0x0538 }
            if (r1 != 0) goto L_0x0530
            goto L_0x0535
        L_0x0530:
            float r1 = X.A90.A01(r1)     // Catch:{ 9HX -> 0x0538 }
            goto L_0x0537
        L_0x0535:
            r1 = 1103101952(0x41c00000, float:24.0)
        L_0x0537:
            int r3 = (int) r1     // Catch:{ 9HX -> 0x0538 }
        L_0x0538:
            X.DFL r1 = r2.A09(r4)
            if (r1 == 0) goto L_0x0542
            int r5 = X.C25340Cdz.A01(r0, r1, r6)
        L_0x0542:
            android.content.Context r0 = r0.A00
            X.BFD r2 = new X.BFD
            r2.<init>(r0, r5, r3)
            boolean r1 = r2 instanceof android.graphics.drawable.Animatable
            r0 = 0
            if (r1 == 0) goto L_0x054f
            r0 = r2
        L_0x054f:
            r14.A00 = r0
            r14.setImageDrawable(r2)
            goto L_0x05fa
        L_0x0556:
            boolean r1 = r15 instanceof X.C23688Bnv
            if (r1 == 0) goto L_0x061d
            X.BIg r14 = (X.C22656BIg) r14
            r10 = 0
            X.C18070vi.A0d(r14, r10)
            X.C18070vi.A0j(r0, r3)
            r1 = 40
            int r11 = r3.A04(r1, r10)
            r8 = 35
            X.DFL r5 = r3.A09(r8)
            java.lang.String r2 = "4.0dp"
            r9 = 36
            java.lang.String r1 = r3.A0D(r9)
            if (r1 == 0) goto L_0x057a
            r2 = r1
        L_0x057a:
            r1 = 41
            X.DFL r4 = r3.A09(r1)
            r1 = 38
            X.DFL r7 = r3.A09(r1)
            java.lang.String r6 = "rectangle"
            java.lang.String r1 = X.BE7.A0i(r3)
            if (r1 == 0) goto L_0x058f
            r6 = r1
        L_0x058f:
            if (r5 == 0) goto L_0x0596
            int r12 = X.C25340Cdz.A01(r0, r5, r10)
            goto L_0x0597
        L_0x0596:
            r12 = -1
        L_0x0597:
            float r10 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x059c }
            goto L_0x05aa
        L_0x059c:
            r2 = move-exception
            java.lang.String r1 = "CDSGlimmerViewUtils"
            X.C25913CoX.A02(r1, r2)
            android.content.Context r2 = r0.A00
            r1 = 1082130432(0x40800000, float:4.0)
            float r10 = X.C24515C7j.A00(r2, r1)
        L_0x05aa:
            r3 = 1056964608(0x3f000000, float:0.5)
            r1 = 1050253722(0x3e99999a, float:0.3)
            if (r4 == 0) goto L_0x0613
            float r2 = r4.A03(r9, r1)
            float r1 = r4.A03(r8, r3)
            X.C5H r5 = new X.C5H
            r5.<init>()
            r5.A01 = r2
            r5.A00 = r1
        L_0x05c2:
            r4 = 1038174126(0x3de147ae, float:0.11)
            r1 = 1032268546(0x3d872b02, float:0.066)
            if (r7 == 0) goto L_0x0609
            float r3 = r7.A03(r9, r1)
            float r1 = r7.A03(r8, r4)
            X.C5H r2 = new X.C5H
            r2.<init>()
            r2.A01 = r3
            r2.A00 = r1
        L_0x05db:
            java.lang.String r1 = "circle"
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x0606
            java.lang.Integer r9 = X.AnonymousClass00R.A00
        L_0x05e5:
            boolean r0 = r0.A03
            X.BFB r6 = new X.BFB
            r8 = r2
            r13 = r0
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r6 instanceof android.graphics.drawable.Animatable
            r0 = 0
            if (r1 == 0) goto L_0x05f5
            r0 = r6
        L_0x05f5:
            r14.A00 = r0
            r14.setImageDrawable(r6)
        L_0x05fa:
            android.graphics.drawable.Animatable r0 = r14.A00
            if (r0 == 0) goto L_0x0601
            r0.start()
        L_0x0601:
            r0 = 1
            r14.A01 = r0
            goto L_0x001e
        L_0x0606:
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            goto L_0x05e5
        L_0x0609:
            X.C5H r2 = new X.C5H
            r2.<init>()
            r2.A01 = r1
            r2.A00 = r4
            goto L_0x05db
        L_0x0613:
            X.C5H r5 = new X.C5H
            r5.<init>()
            r5.A01 = r1
            r5.A00 = r3
            goto L_0x05c2
        L_0x061d:
            boolean r1 = r15 instanceof X.C23701Bo8
            if (r1 == 0) goto L_0x080f
            X.Bo8 r15 = (X.C23701Bo8) r15
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            X.C18070vi.A0n(r14, r0, r3)
            X.EDL r2 = r15.A00
            if (r2 != 0) goto L_0x0636
            X.E3m r1 = r15.A01
            android.content.Context r0 = r0.A00
            X.EDL r2 = r1.BHX(r0)
            r15.A00 = r2
        L_0x0636:
            java.lang.String r1 = X.BE7.A0d(r3)
            if (r1 == 0) goto L_0x0645
            java.lang.String r0 = "front"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0646
        L_0x0645:
            r0 = 1
        L_0x0646:
            X.C18070vi.A0b(r2)
            r2.CJA(r0)
            android.view.View r0 = r2.BOA()
            r14.addView(r0)
            r2.CG0()
            goto L_0x001e
        L_0x0658:
            r0 = 2131436764(0x7f0b24dc, float:1.8495408E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.videoplayback.BloksVideoPlayerView r0 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r0
            X.CbG r14 = new X.CbG
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A03(r1, r14)
            return r8
        L_0x066a:
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r14)     // Catch:{ Exception -> 0x06a0 }
            android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x06a0 }
            java.lang.String r1 = "flow_id"
            boolean r1 = r2.hasExtra(r1)     // Catch:{ Exception -> 0x06a0 }
            if (r1 == 0) goto L_0x06a0
            java.lang.String r1 = "flow_message_version"
            boolean r1 = r2.hasExtra(r1)     // Catch:{ Exception -> 0x06a0 }
            if (r1 == 0) goto L_0x06a0
            android.net.Uri r3 = android.net.Uri.parse(r20)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = r3.getHost()
            r2.append(r1)
            java.lang.String r1 = r3.getPath()
            r2.append(r1)
            java.lang.String r1 = r3.getQuery()
            java.lang.String r21 = X.AnonymousClass000.A0y(r1, r2)
        L_0x06a0:
            X.00H r3 = r8.A07
            java.lang.Object r1 = r3.get()
            X.74k r1 = (X.AnonymousClass74k) r1
            r16 = r1
            r17 = r4
            r18 = r14
            r19 = r7
            r16.A01(r17, r18, r19, r20, r21)
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r14)
            android.app.Application r2 = r1.getApplication()
            java.lang.Object r1 = r3.get()
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            r2.registerActivityLifecycleCallbacks(r1)
        L_0x06c4:
            r1 = 46
            X.DFL r1 = r5.A09(r1)
            r4 = 0
            if (r1 == 0) goto L_0x0709
            java.lang.String r3 = X.BE7.A0e(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x06e0
            X.Cqj r2 = r15.A01
            byte[] r1 = android.util.Base64.decode(r3, r4)
            r2.A04(r14, r1)
        L_0x06e0:
            java.lang.String r1 = X.BE7.A0g(r5)
            if (r1 != 0) goto L_0x06f9
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x06e8:
            r14.setScaleType(r4)
            X.DFL r1 = X.BE7.A0O(r5)
            if (r1 == 0) goto L_0x06f8
            int r0 = X.C25340Cdz.A00(r0, r1)
            r14.setColorFilter(r0)
        L_0x06f8:
            return r11
        L_0x06f9:
            android.widget.ImageView$ScaleType r4 = X.A90.A08(r1)     // Catch:{ 9HX -> 0x06fe }
            goto L_0x06e8
        L_0x06fe:
            r3 = move-exception
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r2 = "WaRcCoreBloksImageComponentBinderUtils"
            java.lang.String r1 = "Failed to parse Image scaleType"
            X.C25913CoX.A00(r0, r2, r1, r3)
            goto L_0x06e8
        L_0x0709:
            if (r6 == 0) goto L_0x06e0
            X.Cqj r2 = r15.A01
            byte[] r1 = android.util.Base64.decode(r6, r4)
            r2.A04(r14, r1)
            goto L_0x06e0
        L_0x0715:
            android.hardware.Camera r0 = android.hardware.Camera.open(r10)     // Catch:{ Exception -> 0x071a }
            goto L_0x0725
        L_0x071a:
            r10 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CAMERA EXPECTION"
            X.C17900vP.A0X(r10, r0, r1)
            r0 = 0
        L_0x0725:
            r7.A03 = r0
            r7.A08 = r5
            r7.A07 = r9
            r7.A09 = r8
            r7.A0C = r2
            r7.A0A = r2
            r0 = 2131428797(0x7f0b05bd, float:1.8479249E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.bloks.BloksCameraOverlay r0 = (com.whatsapp.bloks.BloksCameraOverlay) r0
            r7.A05 = r0
            android.hardware.Camera r10 = r7.A03
            int r9 = r7.A00
            int r8 = r7.A02
            int r2 = r7.A01
            r1 = 0
            X.Bq5 r0 = new X.Bq5
            r0.<init>(r13)
            r0.A02 = r10
            r0.A01 = r8
            r0.A00 = r2
            r0.A00 = r9
            r7.A06 = r0
            com.whatsapp.bloks.BloksCameraOverlay r0 = r7.A05
            X.C17960vV.A05(r0)
            if (r11 != 0) goto L_0x075d
            java.lang.String r11 = "original"
        L_0x075d:
            r0.A00(r11)
            r12.removeAllViews()
            X.Bq5 r0 = r7.A06
            r12.addView(r0)
            X.Bq5 r0 = r7.A06
            X.C17960vV.A05(r0)
            r0.getDisplayOrientation()
            r0 = 2131435443(0x7f0b1fb3, float:1.8492728E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r14, r0)
            X.Cy9 r9 = new X.Cy9
            r9.<init>(r6, r7, r3)
            X.D4m r8 = new X.D4m
            r11 = r7
            r12 = r3
            r13 = r5
            r10 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
            return r1
        L_0x0789:
            r7.CK7(r1)     // Catch:{ all -> 0x079f }
            r1 = 921600(0xe1000, float:1.291437E-39)
            r7.CLM(r1)     // Catch:{ all -> 0x079f }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r7.CJv(r0)     // Catch:{ all -> 0x079f }
            r7.CK8(r1)     // Catch:{ all -> 0x079f }
            r0 = 1
            r7.CJm(r0)     // Catch:{ all -> 0x079f }
            goto L_0x07a3
        L_0x079f:
            r0 = move-exception
            X.C30691eM.A00(r0)
        L_0x07a3:
            r6.A02 = r7
        L_0x07a5:
            X.C18070vi.A0z(r7, r5)
            r0 = 1
            r7.CJA(r0)     // Catch:{ all -> 0x07af }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x07af }
            goto L_0x07b4
        L_0x07af:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x07b4:
            java.lang.Throwable r2 = X.C30671eK.A00(r0)
            if (r2 == 0) goto L_0x07c1
            java.lang.String r1 = "AESelfieViewProvider"
            java.lang.String r0 = "Unable to set initial camera facing"
            X.C26294Cx6.A09(r1, r0, r2)
        L_0x07c1:
            android.content.Context r5 = r6.A05
            android.view.View r1 = r7.BOA()
            android.widget.FrameLayout r0 = r6.A00
            if (r0 == 0) goto L_0x07ce
            r0.addView(r1)
        L_0x07ce:
            X.D3v r2 = r6.A06
            X.0wl r1 = X.C23871Hy.A00
            X.DAS r0 = new X.DAS
            r0.<init>(r5, r2, r6, r1)
            r6.A01 = r0
            com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager r0 = r0.A02
            r6.A03 = r0
            r7.CG0()
            android.app.Activity r2 = X.C25687CkI.A00(r5, r6)
            X.1IR r0 = X.AnonymousClass1IN.A00
            X.1OY r1 = X.AnonymousClass1OW.A02(r0)
            com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1 r0 = new com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1
            r0.<init>(r2, r3)
            X.AnonymousClass3MX.A1Q(r0, r1)
            android.content.Context r1 = r4.A05
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            X.C18070vi.A0z(r1, r0)
            android.app.Application r1 = (android.app.Application) r1
            android.app.Application$ActivityLifecycleCallbacks r0 = r4.A04
            r1.registerActivityLifecycleCallbacks(r0)
            return r3
        L_0x0801:
            java.lang.String r0 = "SwipeRefreshLayout does not contain RenderTreeHostView child"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0808:
            java.lang.String r0 = "PTR container defines a controller but none was found"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x080f:
            X.Bnu r15 = (X.C23687Bnu) r15
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            r4 = 0
            X.C18070vi.A0d(r14, r4)
            X.C18070vi.A0j(r0, r3)
            java.lang.Object r6 = X.C26272CwJ.A04(r0, r3)
            X.COz r6 = (X.C24906COz) r6
            r2 = 43
            r1 = 0
            float r1 = r3.A03(r2, r1)
            java.lang.Float r10 = java.lang.Float.valueOf(r1)
            r1 = 40
            java.util.List r9 = r3.A0G(r1)
            r1 = 46
            java.util.List r8 = X.BE7.A0s(r3, r1)
            r1 = 45
            boolean r4 = r3.A0I(r1, r4)
            r2 = 48
            r1 = 8
            int r2 = r3.A04(r2, r1)
            r7 = 0
            r1 = 50
            X.C6e r5 = new X.C6e
            r5.<init>()
            r5.A02 = r10
            r5.A04 = r9
            r5.A03 = r8
            r5.A05 = r4
            r5.A00 = r1
            r5.A01 = r2
            if (r6 == 0) goto L_0x0866
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r6.A01
            if (r1 != 0) goto L_0x0871
            X.D5B r1 = new X.D5B
            r1.<init>(r14, r15, r6)
            r6.A01 = r1
        L_0x0866:
            android.view.ViewTreeObserver r2 = r14.getViewTreeObserver()
            if (r6 == 0) goto L_0x08a2
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r6.A01
        L_0x086e:
            r2.addOnGlobalLayoutListener(r1)
        L_0x0871:
            int r1 = r14.getChildCount()
            if (r1 <= 0) goto L_0x08da
            android.view.View r2 = X.C60242nd.A00(r14)
            java.lang.String r1 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.C18070vi.A0z(r2, r1)
            X.BJ9 r2 = (X.BJ9) r2
            r15.A01 = r2
            java.util.List r2 = r5.A04
            if (r6 == 0) goto L_0x08a0
            X.C6e r1 = r6.A02
            if (r1 == 0) goto L_0x08a0
            java.util.List r1 = r1.A04
        L_0x088e:
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 != 0) goto L_0x08c2
            java.lang.String r4 = "parametricSlider"
            if (r6 == 0) goto L_0x08ab
            X.BJ9 r2 = r15.A01
            if (r2 != 0) goto L_0x08a4
            X.C18070vi.A11(r4)
            throw r7
        L_0x08a0:
            r1 = r7
            goto L_0x088e
        L_0x08a2:
            r1 = r7
            goto L_0x086e
        L_0x08a4:
            int r1 = r14.getHeight()
            r2.A02(r6, r1)
        L_0x08ab:
            java.lang.Float r1 = r5.A02
            if (r1 == 0) goto L_0x08c2
            float r2 = r1.floatValue()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            X.BJ9 r1 = r15.A01
            if (r1 != 0) goto L_0x08bf
            X.C18070vi.A11(r4)
            throw r7
        L_0x08bf:
            r1.setProgress(r2)
        L_0x08c2:
            X.D5V r1 = new X.D5V
            r1.<init>(r15, r0, r3)
            r15.A00 = r1
            X.BJ9 r0 = r15.A01
            if (r0 != 0) goto L_0x08d3
            java.lang.String r0 = "parametricSlider"
            X.C18070vi.A11(r0)
            throw r7
        L_0x08d3:
            r0.setOnSeekBarChangeListener(r1)
            if (r6 == 0) goto L_0x08da
            r6.A02 = r5
        L_0x08da:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BV6.A0M(android.view.View, X.DOZ, X.DFL, java.lang.Object):java.lang.Object");
    }

    public void A0N(View view, DOZ doz, DFL dfl) {
        if (this instanceof C23712BoJ) {
            C18070vi.A0d(view, 0);
            BIG big = (BIG) view;
            big.hashCode();
            AnonymousClass1OB r1 = big.A02;
            if (r1 != null) {
                r1.BEM((CancellationException) null);
            }
            C22699BLb bLb = big.A00;
            if (bLb != null) {
                bLb.A0S();
                big.removeAllViews();
            }
        } else if (this instanceof C23693Bo0) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
            C18070vi.A0d(swipeRefreshLayout, 0);
            int childCount = swipeRefreshLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = swipeRefreshLayout.getChildAt(i);
                if (childAt instanceof C01920By) {
                    ((C01920By) childAt).setRenderTree((C04240Mk) null);
                    SwipeRefreshLayout.A04(swipeRefreshLayout, false, false);
                    return;
                }
            }
            throw AnonymousClass000.A0n("SwipeRefreshLayout does not contain RenderTreeHostView child");
        } else if (this instanceof C23702Bo9) {
            C23702Bo9 bo9 = (C23702Bo9) this;
            C18100vl r12 = ((C25579CiJ) BE9.A0l(bo9.A00, bo9.A01)).A04;
            ((C25080CWp) r12.getValue()).A00();
            ((C25080CWp) r12.getValue()).A01 = false;
        } else if (this instanceof C23710BoH) {
            AbsSeekBar absSeekBar = (AbsSeekBar) view;
            CUL cul = (CUL) C26272CwJ.A04(doz, dfl);
            if (cul != null) {
                absSeekBar.setThumb(cul.A08);
                cul.A0D = null;
                cul.A0E = null;
                cul.A07 = 0;
                cul.A03 = 0;
                cul.A00 = 0;
                cul.A02 = 0;
                cul.A05 = 0;
                cul.A04 = 0;
                cul.A06 = 0;
                cul.A08 = null;
                cul.A09 = null;
                cul.A0A = null;
                cul.A0B = null;
                cul.A0C = null;
                return;
            }
            throw AnonymousClass8BR.A0w("SliderController is null even though a controller is defined");
        } else if (this instanceof C23696Bo3) {
            C23696Bo3 bo3 = (C23696Bo3) this;
            C22645BHh bHh = (C22645BHh) view;
            C18070vi.A0i(bHh, dfl);
            bHh.setRenderResult((C04220Mi) null, (DOZ) null);
            String A0e = BE7.A0e(dfl);
            if (A0e != null) {
                bo3.A00.post(new C21452AkJ(3, A0e, bHh));
            }
        } else if (this instanceof C23690Bnx) {
            ((C28588E9c) view).CL6(1.0f);
        } else if (this instanceof C23687Bnu) {
            ViewGroup viewGroup = (ViewGroup) view;
            C18070vi.A0n(viewGroup, doz, dfl);
            if (viewGroup.getChildCount() > 0) {
                View A002 = C60242nd.A00(viewGroup);
                C18070vi.A0z(A002, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            }
            C24906COz cOz = (C24906COz) C26272CwJ.A04(doz, dfl);
            if (cOz != null) {
                cOz.A02 = null;
                cOz.A01 = null;
                cOz.A00 = null;
            }
        }
    }

    public void A0O(View view, DOZ doz, DFL dfl) {
        if (this instanceof C23708BoF) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) AnonymousClass1HF.A06(view, 2131436771);
            videoSurfaceView.A05();
            VideoSurfaceView.A03(videoSurfaceView, false);
        } else if (this instanceof C23707BoE) {
            ((C23707BoE) this).A01.A02(view);
        } else if (this instanceof C23706BoD) {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable((Drawable) null);
            imageView.setTag((Object) null);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setColorFilter((ColorFilter) null);
            imageView.setScaleX(1.0f);
        } else if (this instanceof C23705BoC) {
            CUD cud = (CUD) C26272CwJ.A04(doz, ((C23705BoC) this).A00);
            C26109CsU.A02(cud);
            Camera camera = cud.A03;
            if (camera != null) {
                camera.release();
                cud.A03 = null;
            }
        } else if (this instanceof C23712BoJ) {
            C18070vi.A0d(view, 0);
            view.hashCode();
        } else if (this instanceof C23709BoG) {
            C23709BoG boG = (C23709BoG) this;
            ViewGroup viewGroup = (ViewGroup) view;
            C18070vi.A0d(viewGroup, 0);
            C25687CkI ckI = boG.A00;
            if (ckI != null) {
                EDL edl = ckI.A02;
                if (edl != null) {
                    edl.destroy();
                }
                Activity A002 = C25687CkI.A00(ckI.A05, ckI);
                AnonymousClass3MX.A1Q(new AESelfieViewProvider$decreaseBrightness$1(A002, (C30391dr) null), BE6.A18());
                ckI.A02 = null;
                DAS das = ckI.A01;
                if (das != null) {
                    AnonymousClass1OW.A04((CancellationException) null, das.A05);
                    das.A02.destroy();
                }
                ckI.A01 = null;
            }
            viewGroup.removeAllViews();
            CTN ctn = boG.A04;
            ctn.A01 = null;
            ctn.A00 = null;
            ctn.A03 = null;
            ctn.A02 = null;
            Context context = ctn.A05;
            C18070vi.A0z(context, "null cannot be cast to non-null type android.app.Application");
            ((Application) context).unregisterActivityLifecycleCallbacks(ctn.A04);
        } else if (this instanceof C23704BoB) {
            ((TextView) view).setText("");
        } else if (!(this instanceof C23695Bo2) && !(this instanceof C23694Bo1)) {
            if (this instanceof C23700Bo7) {
                AnonymousClass03P r7 = (AnonymousClass03P) view;
                r7.setText("");
                r7.setGravity(8388659);
                r7.setMovementMethod((MovementMethod) null);
                ((TextEmojiLabel) r7).setLinkHandler((C39441t5) null);
            } else if (!(this instanceof C23703BoA) && !(this instanceof C23699Bo6)) {
                if (this instanceof C23698Bo5) {
                    ((RecyclerView) AnonymousClass1HF.A06(view, 2131434428)).setAdapter((C38391rD) null);
                } else if (this instanceof C23697Bo4) {
                } else {
                    if (this instanceof C23693Bo0) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                        C18070vi.A0d(swipeRefreshLayout, 0);
                        swipeRefreshLayout.A0E = null;
                    } else if (this instanceof C23702Bo9) {
                        C23702Bo9 bo9 = (C23702Bo9) this;
                        Object A04 = C26272CwJ.A04(bo9.A00, bo9.A01);
                        C28111Yx.A02(A04);
                        C18070vi.A0X(A04);
                        ((C25579CiJ) A04).A00 = null;
                    } else if (this instanceof C23692Bnz) {
                        ImageView imageView2 = (ImageView) view;
                        C18070vi.A0d(imageView2, 0);
                        imageView2.clearColorFilter();
                    } else if (!(this instanceof C23691Bny) && !(this instanceof C23696Bo3)) {
                        if (this instanceof C23690Bnx) {
                            ((BIR) ((C28588E9c) view)).A00.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                        } else if ((this instanceof C23689Bnw) || (this instanceof C23688Bnv)) {
                            C22656BIg bIg = (C22656BIg) view;
                            C18070vi.A0d(bIg, 0);
                            Animatable animatable = bIg.A00;
                            if (animatable != null) {
                                animatable.stop();
                            }
                            bIg.A01 = false;
                        } else if (this instanceof C23701Bo8) {
                            C23701Bo8 bo8 = (C23701Bo8) this;
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            C18070vi.A0h(viewGroup2, doz);
                            viewGroup2.removeAllViews();
                            EDL edl2 = bo8.A00;
                            if (edl2 == null) {
                                edl2 = bo8.A01.BHX(doz.A00);
                                bo8.A00 = edl2;
                            }
                            C18070vi.A0b(edl2);
                            edl2.pause();
                        } else {
                            ViewGroup viewGroup3 = (ViewGroup) view;
                            C18070vi.A0d(viewGroup3, 0);
                            if (viewGroup3.getChildCount() > 0) {
                                View A003 = C60242nd.A00(viewGroup3);
                                C18070vi.A0z(A003, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                                ((SeekBar) A003).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean A0P(Object obj, Object obj2) {
        if (this instanceof C23693Bo0) {
            return AnonymousClass3Ma.A1Z(obj, obj2);
        }
        return this.A02;
    }

    public /* synthetic */ C22821Di BVg() {
        return null;
    }

    public /* synthetic */ AnonymousClass0HX BXH() {
        if (this instanceof C23696Bo3) {
            return AnonymousClass0C1.A00;
        }
        return AnonymousClass0C0.A00;
    }

    public /* synthetic */ Class BXG() {
        return getClass();
    }
}
