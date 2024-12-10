package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.wearable.mediastream.model.SUPToggleState;
import com.whatsapp.base.WaFragment;
import com.whatsapp.glasses.BluetoothPermissionDialogFragment;
import com.whatsapp.glasses.SUPBottomSheetView;
import com.whatsapp.glasses.layouts.SupToggle;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DOr  reason: case insensitive filesystem */
public final class C26995DOr implements C160958At, B8P {
    public static final Map A0V;
    public static final Set A0W;
    public int A00;
    public Bitmap A01;
    public C28597E9o A02;
    public SUPBottomSheetView A03;
    public C25952CpK A04;
    public SupToggle A05;
    public CallInfo A06;
    public AtomicBoolean A07 = C108965cb.A0w();
    public C18140vp A08;
    public C18090vk A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public String A0D;
    public boolean A0E;
    public final C56542hd A0F;
    public final AnonymousClass1KB A0G;
    public final AnonymousClass1VE A0H;
    public final AnonymousClass118 A0I;
    public final C219217x A0J;
    public final C18000vb A0K;
    public final C18030ve A0L;
    public final C24821CLo A0M;
    public final C25461Oh A0N;
    public final C41731wy A0O;
    public final C41731wy A0P;
    public final AnonymousClass00H A0Q;
    public final C18140vp A0R;
    public final C189759jn A0S;
    public final AnonymousClass10I A0T;
    public final AnonymousClass00H A0U;

    static {
        C0L[] c0lArr = new C0L[7];
        c0lArr[0] = C0L.A0t;
        c0lArr[1] = C0L.A0u;
        c0lArr[2] = C0L.A0s;
        c0lArr[3] = C0L.A0y;
        c0lArr[4] = C0L.A17;
        c0lArr[5] = C0L.A18;
        A0W = BE6.A15(C0L.A0v, c0lArr, 6);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[7];
        C72463Mc.A1N(r2, 2131428261, 0, C0L.A0w);
        C72463Mc.A1N(r2, 2131435928, 1, C0L.A0x);
        C72463Mc.A1N(r2, 2131435929, 2, C0L.A0z);
        C72463Mc.A1N(r2, 2131431153, 3, C0L.A10);
        C72463Mc.A1N(r2, 2131437085, 4, C0L.A1B);
        C72463Mc.A1N(r2, 2131437084, 5, C0L.A1A);
        C72463Mc.A1N(r2, 2131437081, 6, C0L.A19);
        A0V = AnonymousClass1D7.A0B(r2);
    }

    public C26995DOr(C56542hd r17, AnonymousClass1KB r18, AnonymousClass1VE r19, C28597E9o e9o, AnonymousClass118 r21, C219217x r22, C18000vb r23, C18030ve r24, C24821CLo cLo, C25461Oh r26, C189759jn r27, AnonymousClass10I r28, AnonymousClass00H r29, AnonymousClass00H r30, C18140vp r31) {
        AnonymousClass00H r4 = r29;
        C18070vi.A0d(r4, 1);
        C189759jn r6 = r27;
        AnonymousClass118 r12 = r21;
        AnonymousClass1KB r14 = r18;
        C18070vi.A0p(r6, r14, r12);
        C18000vb r10 = r23;
        C18070vi.A0d(r10, 5);
        AnonymousClass00H r3 = r30;
        C25461Oh r7 = r26;
        C18030ve r9 = r24;
        C219217x r11 = r22;
        AnonymousClass1VE r13 = r19;
        C18070vi.A0x(r9, r3, r7, r13, r11);
        AnonymousClass10I r5 = r28;
        C24821CLo cLo2 = cLo;
        C56542hd r15 = r17;
        C18070vi.A0r(cLo2, r15, r5);
        C18140vp r0 = r31;
        C18070vi.A0d(r0, 14);
        this.A0U = r4;
        this.A0S = r6;
        this.A0G = r14;
        this.A0I = r12;
        this.A0K = r10;
        this.A0L = r9;
        this.A0Q = r3;
        this.A0N = r7;
        this.A0H = r13;
        this.A0J = r11;
        this.A0M = cLo2;
        this.A0F = r15;
        this.A0T = r5;
        this.A0R = r0;
        this.A02 = e9o;
        C41731wy r02 = new C41731wy();
        this.A0P = r02;
        this.A0O = r02;
        this.A0A = true;
    }

    public void A05(ViewStub viewStub, A99 a99, int i) {
        this.A0C = i + this.A0I.A00.getResources().getDimensionPixelSize(2131168987);
        this.A0D = this.A0L.A0I(8057);
        this.A07.set(false);
        this.A09 = new DWZ(viewStub, a99, this, 2);
        C197219wL.A01(this.A0N, this, this.A0Q, C41841x9.A04(C18070vi.A0P(C0L.A16), C41841x9.A04(A0W, A0V.keySet())), new DWX(this, 10));
        if (this.A00 == 0) {
            this.A0T.CGN(new C21355Aik(this, 2));
        }
    }

    public WaFragment BNY() {
        BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment = new BluetoothPermissionDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putBoolean("bluetooth", true);
        bluetoothPermissionDialogFragment.A1R(A0D2);
        bluetoothPermissionDialogFragment.A04 = new DWX(this, 9);
        return bluetoothPermissionDialogFragment;
    }

    public void C8Q(int i) {
        C18090vk r0;
        if (i == 3) {
            this.A00--;
        } else {
            Log.e("sup:VOIPGlassesPlugin.kt Network resource download failure!");
        }
        if (this.A00 <= 0 && (r0 = this.A09) != null) {
            r0.invoke();
        }
    }

    public void CIy(float f) {
        float A022 = C28851b7.A02(f, -1.0f, 0.0f);
        SupToggle supToggle = this.A05;
        if (supToggle != null) {
            supToggle.setTranslationX((-A022) * ((float) (supToggle.A04.getWidth() + this.A0C)));
        }
        if (f == -1.0f) {
            this.A0A = false;
            A04(this, false);
            C28597E9o e9o = this.A02;
            if (e9o != null) {
                e9o.CPZ(false);
            }
        } else if (!this.A0A) {
            this.A0A = true;
            A04(this, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r14.A00.A02 == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C25810CmN A00(com.facebook.wearable.mediastream.model.SUPToggleState r14) {
        /*
            X.BXh r0 = X.C22961BXh.A00
            boolean r0 = X.C18070vi.A18(r14, r0)
            if (r0 == 0) goto L_0x001c
            r5 = 0
            r7 = 0
            X.Cm5 r4 = new X.Cm5
            r4.<init>(r5, r7, r7, r7)
            X.CmN r3 = new X.CmN
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r6 = r5
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x001c:
            X.BXg r0 = X.C22960BXg.A00
            boolean r0 = X.C18070vi.A18(r14, r0)
            if (r0 == 0) goto L_0x0026
            r3 = 0
            return r3
        L_0x0026:
            boolean r0 = r14 instanceof X.C22962BXi
            if (r0 == 0) goto L_0x0049
            X.BXi r14 = (X.C22962BXi) r14
            boolean r13 = r14.A00
            r0 = 2131886102(0x7f120016, float:1.9406773E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 0
            java.lang.String r6 = "__external__sup_hint_message_use_glasses"
            r7 = 1
            r8 = 0
            X.Cm5 r4 = new X.Cm5
            r4.<init>(r0, r8, r8, r8)
            X.CmN r3 = new X.CmN
            r10 = r8
            r11 = r8
            r12 = r8
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0049:
            boolean r0 = r14 instanceof X.C22963BXj
            if (r0 == 0) goto L_0x0068
            X.BXj r14 = (X.C22963BXj) r14
            X.BTh r0 = r14.A00
            boolean r12 = r0.A03
            boolean r0 = r0.A04
            r5 = 0
            r8 = 0
            X.Cm5 r4 = new X.Cm5
            r4.<init>(r5, r12, r8, r0)
            r7 = 1
            X.CmN r3 = new X.CmN
            r10 = r7
            r13 = r8
            r6 = r5
            r9 = r7
            r11 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0068:
            boolean r0 = r14 instanceof X.C22959BXf
            if (r0 == 0) goto L_0x00ae
            X.BXf r14 = (X.C22959BXf) r14
            boolean r8 = r14.A01
            r6 = 1
            if (r8 == 0) goto L_0x007a
            X.BTh r0 = r14.A00
            boolean r0 = r0.A02
            r13 = 1
            if (r0 != 0) goto L_0x007b
        L_0x007a:
            r13 = 0
        L_0x007b:
            r5 = 2131898631(0x7f123107, float:1.9432185E38)
            X.BTh r4 = r14.A00
            boolean r3 = r4.A03
            X.CNl r2 = r4.A00
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00ac
            if (r8 != 0) goto L_0x00ac
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x00ac
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x00ac
        L_0x0094:
            boolean r0 = r4.A04
            X.Cm5 r4 = new X.Cm5
            r4.<init>(r2, r3, r6, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "__external__sup_hint_message"
            r7 = 1
            r10 = 0
            X.CmN r3 = new X.CmN
            r12 = r7
            r9 = r8
            r11 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x00ac:
            r6 = 0
            goto L_0x0094
        L_0x00ae:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26995DOr.A00(com.facebook.wearable.mediastream.model.SUPToggleState):X.CmN");
    }

    public static final void A02(C24867CNl cNl, C26995DOr dOr, SupToggle supToggle) {
        SupToggle supToggle2;
        Context context;
        Context context2;
        String A1H;
        if (C18070vi.A18(cNl, C22975BXv.A00)) {
            Uri parse = Uri.parse("stella://");
            dOr.A0U.get();
            C18070vi.A0b(parse);
            Intent A1p = AnonymousClass1LU.A1p(parse);
            if (A5E.A00().A01().A05(supToggle.getContext(), A1p)) {
                return;
            }
        } else if (!C18070vi.A18(cNl, C22976BXw.A00)) {
            if (C18070vi.A18(cNl, C22974BXu.A00)) {
                SupToggle supToggle3 = dOr.A05;
                if (supToggle3 != null && (context2 = supToggle3.getContext()) != null) {
                    A1H = AnonymousClass001.A1H("https://play.google.com/store/apps/details?id=com.whatsapp", "", AnonymousClass000.A10());
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(A1H)), (Bundle) null);
                }
                return;
            }
            String str = dOr.A0D;
            if (str != null && !str.equals("") && (supToggle2 = dOr.A05) != null && (context = supToggle2.getContext()) != null) {
                dOr.A0U.get();
                context.startActivity(AnonymousClass1LU.A1g(context, str, (String) null, false, false), (Bundle) null);
                return;
            }
            return;
        }
        SupToggle supToggle4 = dOr.A05;
        if (supToggle4 != null && (context2 = supToggle4.getContext()) != null) {
            A1H = "https://play.google.com/store/apps/details?id=com.facebook.stella";
            context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(A1H)), (Bundle) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C26995DOr r11) {
        /*
            X.E9o r2 = r11.A02
            if (r2 == 0) goto L_0x005f
            X.1VE r4 = r11.A0H
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r4)
            java.lang.String r3 = "smart_glasses_user_initiated"
            r0 = 0
            boolean r0 = r1.getBoolean(r3, r0)
            if (r0 != 0) goto L_0x0026
            r1 = 1
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1F(r0, r3, r1)
            X.1wy r1 = r11.A0P
            X.Bym r0 = X.C24289Bym.CALL_SHOW_BOTTOM_SHEET
            r1.A0F(r0)
        L_0x0026:
            X.DOs r2 = (X.C26996DOs) r2
            X.Cn1 r3 = X.C24712CGy.A01
            java.lang.String r1 = "sup:SUPDelegate"
            java.lang.String r0 = "Fire on SUP button clicked"
            r3.A01(r1, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState r3 = r2.A01
            boolean r1 = r3 instanceof X.C22962BXi
            r0 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0060
            r2.A0A()
            X.C26996DOs.A05(r2, r0)
        L_0x003f:
            r2.A0C(r4)
        L_0x0042:
            X.0ve r3 = r11.A0L
            r1 = 8623(0x21af, float:1.2083E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x005f
            com.facebook.wearable.mediastream.model.SUPToggleState r1 = r2.A01
            boolean r0 = r1 instanceof X.C22959BXf
            if (r0 != 0) goto L_0x0058
            boolean r0 = r1 instanceof X.C22963BXj
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            X.1wy r1 = r11.A0P
            X.Bym r0 = X.C24289Bym.CALL_SHOW_BANNER_STATUS
            r1.A0F(r0)
        L_0x005f:
            return
        L_0x0060:
            boolean r0 = r3 instanceof X.C22959BXf
            if (r0 == 0) goto L_0x009d
            X.CvH r0 = r2.A0E
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0078
            r0 = r3
            X.BXf r0 = (X.C22959BXf) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0078
            boolean r0 = X.C26996DOs.A08(r2)
            if (r0 != 0) goto L_0x0078
            goto L_0x003f
        L_0x0078:
            X.BXf r3 = (X.C22959BXf) r3
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x009a
            X.BTh r0 = r3.A00
            X.CNl r0 = r0.A00
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x009a
            com.facebook.wearable.mediastream.model.SUPToggleState r5 = r2.A01
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            r6 = 0
            r8 = r6
            r10 = r6
            r7 = r6
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r5.getUpdatedStatusIndicatorAttributes(r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x009a
            r2.A01 = r0
        L_0x009a:
            X.BTh r0 = r3.A00
            goto L_0x00a5
        L_0x009d:
            boolean r0 = r3 instanceof X.C22963BXj
            if (r0 == 0) goto L_0x0042
            X.BXj r3 = (X.C22963BXj) r3
            X.BTh r0 = r3.A00
        L_0x00a5:
            boolean r0 = r0.A03
            r0 = r0 ^ 1
            r2.CPZ(r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26995DOr.A03(X.DOr):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r4 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C26995DOr r12, boolean r13) {
        /*
            X.E9o r0 = r12.A02
            if (r0 == 0) goto L_0x01c4
            X.DOs r0 = (X.C26996DOs) r0
            com.facebook.wearable.mediastream.model.SUPToggleState r1 = r0.A01
            boolean r0 = r12.A0A
            X.CmN r3 = r12.A01(r1, r0)
            if (r3 == 0) goto L_0x0192
            com.whatsapp.glasses.layouts.SupToggle r9 = r12.A05
            if (r9 == 0) goto L_0x0192
            boolean r0 = r3.A00
            r9.setViewVisible(r0)
            boolean r10 = r3.A04
            boolean r0 = r3.A07
            X.Cm5 r2 = r3.A01
            boolean r8 = r2.A02
            boolean r7 = r2.A03
            if (r10 == 0) goto L_0x0112
            com.whatsapp.glasses.layouts.StatusIndicator r4 = r9.A0D
            if (r8 == 0) goto L_0x010b
            r4.setConnecting(r7)
        L_0x002c:
            boolean r4 = r3.A05
            X.CNl r6 = r2.A00
            if (r6 == 0) goto L_0x0108
            java.lang.Integer r1 = r6.A01
        L_0x0034:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r5 = 0
            boolean r11 = X.AnonymousClass000.A1Z(r1, r0)
            android.view.View r1 = r9.A08
            if (r11 != 0) goto L_0x0044
            if (r10 != 0) goto L_0x0044
            r0 = 0
            if (r4 != 0) goto L_0x0046
        L_0x0044:
            r0 = 8
        L_0x0046:
            r1.setVisibility(r0)
            if (r11 != 0) goto L_0x0102
            if (r10 != 0) goto L_0x0102
            android.widget.ImageView r10 = r9.A04
            if (r4 == 0) goto L_0x00fe
            int r1 = r9.A06
        L_0x0053:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r10.setColorFilter(r1, r0)
            if (r4 != 0) goto L_0x00b2
            int r10 = r9.A02
            android.view.View r1 = r9.A09
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r10
            r1.setLayoutParams(r0)
            android.animation.LayoutTransition r11 = r9.getLayoutTransition()
            android.widget.RelativeLayout r10 = r9.A0B
            android.widget.ImageView r0 = r9.A03
            r1 = 8
            r11.hideChild(r10, r0, r1)
            android.widget.ImageView r0 = r9.A03
            r0.setVisibility(r1)
        L_0x0079:
            boolean r0 = r3.A08
            r9.setStatusIndicatorVisibility(r0)
            boolean r11 = r3.A09
            java.lang.Integer r0 = r3.A02
            java.lang.String r10 = r3.A03
            if (r0 == 0) goto L_0x009c
            if (r10 == 0) goto L_0x009c
            X.Cpd r3 = X.C25970Cpd.A03
            android.widget.TextView r1 = r9.A0C
            int r0 = r0.intValue()
            r3.A01(r1, r0, r10)
            android.view.View r1 = r9.A0A
            int r0 = X.C72453Mb.A07(r11)
            r1.setVisibility(r0)
        L_0x009c:
            boolean r0 = r2.A01
            r9.setDoublePressPromptVisibility(r0)
            if (r6 == 0) goto L_0x0183
            com.whatsapp.glasses.layouts.StatusIndicator r11 = r9.A0D
            if (r8 == 0) goto L_0x0130
            android.widget.ImageView r1 = r11.A02
            if (r1 != 0) goto L_0x011b
            java.lang.String r0 = "statusIndicatorCollapsedOutline"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00b2:
            android.widget.ImageView r0 = r9.A03
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0079
            int r10 = r9.A07
            int[] r1 = X.C108945cZ.A1W()
            android.view.View r0 = r9.A09
            int r0 = r0.getHeight()
            r1[r5] = r0
            r0 = 1
            r1[r0] = r10
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofInt(r1)
            r0 = 150(0x96, double:7.4E-322)
            r10.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r10.setInterpolator(r0)
            r1 = 7
            X.CxY r0 = new X.CxY
            r0.<init>(r10, r9, r1)
            r10.addUpdateListener(r0)
            r10.start()
            android.animation.LayoutTransition r11 = r9.getLayoutTransition()
            android.widget.RelativeLayout r10 = r9.A0B
            android.widget.ImageView r1 = r9.A03
            r0 = 8
            r11.showChild(r10, r1, r0)
            android.widget.ImageView r0 = r9.A03
            r0.setVisibility(r5)
            goto L_0x0079
        L_0x00fe:
            int r1 = r9.A01
            goto L_0x0053
        L_0x0102:
            android.widget.ImageView r10 = r9.A04
            int r1 = r9.A00
            goto L_0x0053
        L_0x0108:
            r1 = 0
            goto L_0x0034
        L_0x010b:
            r1 = 0
            r0 = 0
            r4.A05(r1, r0)
            goto L_0x002c
        L_0x0112:
            if (r0 == 0) goto L_0x002c
            com.whatsapp.glasses.layouts.StatusIndicator r0 = r9.A0D
            r0.setConnected(r7)
            goto L_0x002c
        L_0x011b:
            r0 = 8
            r1.setVisibility(r0)
            if (r4 == 0) goto L_0x012e
            float r0 = r11.A0E
        L_0x0124:
            r11.setTranslationY(r0)
            r11.A06(r6, r7)
            com.whatsapp.glasses.layouts.StatusIndicator.A03(r11)
            goto L_0x0133
        L_0x012e:
            r0 = 0
            goto L_0x0124
        L_0x0130:
            r11.A05(r6, r4)
        L_0x0133:
            boolean r0 = r6 instanceof X.BY5
            if (r0 == 0) goto L_0x01e3
            if (r7 == 0) goto L_0x01fe
            X.CkQ r0 = r11.A0M
            r0.A01()
        L_0x013e:
            r0 = 6
            X.78A r4 = new X.78A
            r4.<init>(r12, r9, r6, r0)
            r3 = 1
            boolean r0 = r6 instanceof X.C22977BXx
            if (r0 != 0) goto L_0x01c5
            X.BXm r0 = X.C22966BXm.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01c5
            X.BXw r0 = X.C22976BXw.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01c5
            X.BXu r0 = X.C22974BXu.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01c5
            X.BXv r0 = X.C22975BXv.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01c5
            android.widget.TextView r1 = r11.A0K
            r1.setClickable(r5)
            android.graphics.Typeface r0 = r1.getTypeface()
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r5)
            r1.setTypeface(r0)
            int r0 = r11.A0F
        L_0x017b:
            r1.setTextColor(r0)
            if (r8 == 0) goto L_0x0183
            r11.A06(r6, r7)
        L_0x0183:
            X.0ve r2 = r12.A0L
            r1 = 8623(0x21af, float:1.2083E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0192
            r9.setStatusIndicatorVisibility(r5)
        L_0x0192:
            com.whatsapp.glasses.SUPBottomSheetView r0 = r12.A03
            if (r0 == 0) goto L_0x01aa
            boolean r1 = r0.A1e()
            r0 = 1
            if (r1 != r0) goto L_0x01aa
            boolean r0 = r12.Be0()
            if (r0 == 0) goto L_0x01aa
            com.whatsapp.glasses.SUPBottomSheetView r0 = r12.A03
            if (r0 == 0) goto L_0x01aa
            r0.A28()
        L_0x01aa:
            if (r13 == 0) goto L_0x01c4
            X.1wy r3 = r12.A0P
            X.Bym r0 = X.C24289Bym.CALL_SHOW_CALL_CONTROLS
            r3.A0F(r0)
            X.0ve r2 = r12.A0L
            r1 = 8623(0x21af, float:1.2083E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01c4
            X.Bym r0 = X.C24289Bym.CALL_SHOW_BANNER_STATUS
            r3.A0F(r0)
        L_0x01c4:
            return
        L_0x01c5:
            android.widget.LinearLayout r2 = r11.A03
            r1 = 4
            X.Aik r0 = new X.Aik
            r0.<init>(r11, r1)
            r2.post(r0)
            android.widget.TextView r1 = r11.A0K
            r1.setOnClickListener(r4)
            android.graphics.Typeface r0 = r1.getTypeface()
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            r1.setTypeface(r0)
            int r0 = r11.A00
            goto L_0x017b
        L_0x01e3:
            boolean r0 = r6 instanceof X.C22977BXx
            if (r0 == 0) goto L_0x0209
            if (r7 == 0) goto L_0x01fe
            X.CkQ r2 = r11.A0M
            android.widget.ImageView r0 = r2.A05
            r0.clearColorFilter()
            android.widget.ImageView r0 = r2.A04
            r0.clearColorFilter()
            android.widget.ImageView r1 = r2.A03
            int r0 = r2.A00
            r1.setColorFilter(r0)
            goto L_0x013e
        L_0x01fe:
            android.widget.ImageView r2 = r11.A0H
            int r1 = r11.A0F
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            goto L_0x013e
        L_0x0209:
            boolean r0 = r6 instanceof X.C22964BXk
            if (r0 == 0) goto L_0x013e
            android.widget.TextView r10 = r11.A0J
            android.view.View r0 = r11.A0G
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131898630(0x7f123106, float:1.9432183E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r0 = r6
            X.BXk r0 = (X.C22964BXk) r0
            long r0 = r0.A00
            X.AnonymousClass3MX.A1S(r2, r5, r0)
            java.lang.String r0 = r4.getString(r3, r2)
            r10.setText(r0)
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26995DOr.A04(X.DOr, boolean):void");
    }

    public SUPBottomSheetView BNe() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1DS BZH() {
        return this.A0O;
    }

    public C139936zg BZh() {
        C25810CmN A012;
        C25952CpK cpK;
        int i;
        String str;
        int i2;
        String format;
        String str2;
        String A013;
        AnonymousClass482 r6;
        AnonymousClass482 r5;
        Integer num;
        int i3;
        String str3;
        AnonymousClass482 A002;
        int i4;
        int i5;
        String str4;
        AnonymousClass482 A003;
        String A004;
        String A014;
        long j;
        C28597E9o e9o = this.A02;
        if (!(e9o == null || (A012 = A01(((C26996DOs) e9o).A01, true)) == null || !A012.A00 || (cpK = this.A04) == null)) {
            Bitmap bitmap = this.A01;
            if (A012.A08) {
                if (A012.A04) {
                    i = 2131886095;
                    str = "__external__sup_connecting";
                } else {
                    C25793Cm5 cm5 = A012.A01;
                    if (cm5.A01) {
                        i = 2131886098;
                        str = "__external__sup_double_press_prompt";
                    } else if (A012.A07) {
                        C24867CNl cNl = cm5.A00;
                        if (cNl != null) {
                            if (cNl instanceof C22973BXt) {
                                i5 = 2131886104;
                                str4 = "__external__sup_lost_connection";
                            } else {
                                if (cNl instanceof C22977BXx) {
                                    r6 = C1402670q.A00(C25952CpK.A00(cpK, "__external__sup_poor_connection", 2131886108));
                                    r5 = C1402670q.A00(C25952CpK.A00(cpK, "__external__sup_learn_more", 2131886103));
                                } else {
                                    r5 = null;
                                    if (!(cNl instanceof BY5)) {
                                        if (cNl instanceof BY2) {
                                            i5 = 2131886113;
                                            str4 = "__external__sup_zero_battery";
                                        } else {
                                            if (cNl instanceof C22964BXk) {
                                                long j2 = ((C22964BXk) cNl).A00;
                                                cpK.A01 = Long.valueOf(j2);
                                                String format2 = cpK.A04.A0M().format(((double) j2) / 100.0d);
                                                C18070vi.A0X(format2);
                                                str3 = C25952CpK.A01(cpK, "__external__sup_low_battery_with_battery", format2, 2131886106);
                                            } else {
                                                if (cNl instanceof BY3) {
                                                    j = ((BY3) cNl).A00;
                                                } else if (cNl instanceof BY9) {
                                                    j = ((BY9) cNl).A00;
                                                } else if (cNl instanceof C22970BXq) {
                                                    i5 = 2131886099;
                                                    str4 = "__external__sup_exceed_thermal";
                                                } else if (cNl instanceof C22971BXr) {
                                                    str3 = C25952CpK.A00(cpK, "__external__sup_high_thermal", 2131886101);
                                                } else if (cNl instanceof C22969BXp) {
                                                    r6 = C1402670q.A00(C25952CpK.A00(cpK, "__external__sup_doff", 2131886097));
                                                } else if (cNl instanceof C22968BXo) {
                                                    r6 = C1402670q.A00(C25952CpK.A00(cpK, "__external__sup_doff", 2131886097));
                                                    i3 = cpK.A00;
                                                    num = Integer.valueOf(i3);
                                                    return new C139936zg(bitmap, r6, r5, num);
                                                } else if (cNl instanceof C22979BXz) {
                                                    i5 = 2131886111;
                                                    str4 = "__external__sup_tampering_led";
                                                } else if (cNl instanceof C22967BXn) {
                                                    i5 = 2131886096;
                                                    str4 = "__external__sup_device_error";
                                                } else {
                                                    if (cNl instanceof C22976BXw) {
                                                        A014 = C25952CpK.A01(cpK, "__external__sup_app_update", "Meta View", 2131886081);
                                                    } else if (cNl instanceof C22974BXu) {
                                                        Context context = cpK.A03;
                                                        A014 = C25952CpK.A01(cpK, "__external__sup_app_update", C18070vi.A0F(context.getApplicationContext(), context.getApplicationContext().getApplicationInfo().labelRes), 2131886081);
                                                    } else if (cNl instanceof C22975BXv) {
                                                        A003 = C1402670q.A00(C25952CpK.A00(cpK, "__external__sup_glasses_update", 2131886100));
                                                        A004 = C25952CpK.A00(cpK, "__external__sup_mwa_link", 2131886107);
                                                        r5 = C1402670q.A00(A004);
                                                        num = null;
                                                        return new C139936zg(bitmap, r6, r5, num);
                                                    } else if (cNl instanceof BY1) {
                                                        i5 = 2131886116;
                                                        str4 = "__external__wifi_disabled";
                                                    } else if (cNl instanceof C22972BXs) {
                                                        i5 = 2131886115;
                                                        str4 = "__external__turn_off_wifi_hotspot";
                                                    } else if (cNl instanceof BY0) {
                                                        i5 = 2131886114;
                                                        str4 = "__external__turn_off_vpn";
                                                    }
                                                    A003 = C1402670q.A00(A014);
                                                    A004 = C25952CpK.A00(cpK, "__external__sup_app_store_link", 2131886080);
                                                    r5 = C1402670q.A00(A004);
                                                    num = null;
                                                    return new C139936zg(bitmap, r6, r5, num);
                                                }
                                                cpK.A01 = Long.valueOf(j);
                                            }
                                            A002 = C1402670q.A00(str3);
                                            i4 = cpK.A02;
                                            return new C139936zg(bitmap, A002, (AnonymousClass4ZN) null, Integer.valueOf(i4));
                                        }
                                    }
                                }
                                i3 = cpK.A02;
                                num = Integer.valueOf(i3);
                                return new C139936zg(bitmap, r6, r5, num);
                            }
                            A002 = C1402670q.A00(C25952CpK.A00(cpK, str4, i5));
                            i4 = cpK.A00;
                            return new C139936zg(bitmap, A002, (AnonymousClass4ZN) null, Integer.valueOf(i4));
                        }
                        boolean z = A012.A06;
                        Long l = cpK.A01;
                        if (z) {
                            if (l != null) {
                                i2 = 2131886110;
                                format = cpK.A04.A0M().format(((double) l.longValue()) / 100.0d);
                                C18070vi.A0X(format);
                                str2 = "__external__sup_streaming_with_battery";
                            } else {
                                i = 2131886109;
                                str = "__external__sup_streaming";
                            }
                        } else if (l != null) {
                            i2 = 2131886094;
                            format = cpK.A04.A0M().format(((double) l.longValue()) / 100.0d);
                            C18070vi.A0X(format);
                            str2 = "__external__sup_connected_with_battery";
                        } else {
                            i = 2131886093;
                            str = "__external__sup_connected";
                        }
                        A013 = C25952CpK.A01(cpK, str2, format, i2);
                        return new C139936zg(bitmap, C1402670q.A00(A013), (AnonymousClass4ZN) null, (Integer) null);
                    }
                }
                A013 = C25952CpK.A00(cpK, str, i);
                return new C139936zg(bitmap, C1402670q.A00(A013), (AnonymousClass4ZN) null, (Integer) null);
            }
        }
        return null;
    }

    public View BZs() {
        SupToggle supToggle = this.A05;
        if (supToggle != null) {
            return supToggle.A04;
        }
        return null;
    }

    public boolean Be0() {
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            return C108975cc.A1B(e9o.Be0() ? 1 : 0);
        }
        return false;
    }

    public boolean Be1() {
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            return C108975cc.A1B(((C26996DOs) e9o).A08 ? 1 : 0);
        }
        return false;
    }

    public void BlA() {
        C25810CmN A002;
        C24867CNl cNl;
        SupToggle supToggle;
        C28597E9o e9o = this.A02;
        if (e9o != null && (A002 = A00(((C26996DOs) e9o).A01)) != null && (cNl = A002.A01.A00) != null && (supToggle = this.A05) != null) {
            A02(cNl, this, supToggle);
        }
    }

    public void BmB() {
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            C26996DOs dOs = (C26996DOs) e9o;
            dOs.A07 = true;
            C26226CvH cvH = dOs.A0E;
            if (cvH.A0P) {
                cvH.A0D(AnonymousClass00R.A01);
            }
            CallInfo BO3 = dOs.A0G.BO3();
            if (BO3 != null) {
                C26996DOs.A04(dOs, BO3);
            }
        }
    }

    public void But() {
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            C26996DOs dOs = (C26996DOs) e9o;
            dOs.A07 = false;
            dOs.A0E.A0D(AnonymousClass00R.A02);
            CallInfo BO3 = dOs.A0G.BO3();
            if (BO3 != null) {
                C26996DOs.A04(dOs, BO3);
            }
        }
    }

    public void C0f(TimeInterpolator timeInterpolator, long j, boolean z) {
        float width;
        SupToggle supToggle = this.A05;
        if (supToggle != null) {
            if (z) {
                width = 0.0f;
            } else {
                width = (float) (supToggle.A04.getWidth() + this.A0C);
            }
            if (j == 0) {
                supToggle.setTranslationX(width);
                if (!z) {
                    this.A0A = false;
                    C28597E9o e9o = this.A02;
                    if (e9o != null) {
                        e9o.CPZ(false);
                    }
                } else if (!this.A0A) {
                    this.A0A = true;
                }
                A04(this, false);
                return;
            }
            supToggle.animate().translationX(width).setDuration(j).setInterpolator(timeInterpolator).setListener(new C26306CxP(this, z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r1.A06 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C50(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0E
            if (r4 == r0) goto L_0x002a
            r3.A0E = r4
            if (r4 == 0) goto L_0x000b
            r3.CFn()
        L_0x000b:
            X.E9o r1 = r3.A02
            if (r1 == 0) goto L_0x0026
            X.DOs r1 = (X.C26996DOs) r1
            boolean r0 = r1.A09
            if (r0 == r4) goto L_0x0026
            r1.A09 = r4
            X.CvH r2 = r1.A0E
            if (r4 != 0) goto L_0x0020
            boolean r1 = r1.A06
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r0 = r0 ^ 1
            r2.A0F(r0)
        L_0x0026:
            r0 = 0
            A04(r3, r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26995DOr.C50(boolean):void");
    }

    public void C9P(CallInfo callInfo) {
        if (!AnonymousClass000.A1Y(this.A0R.get())) {
            C28597E9o e9o = this.A02;
            if (e9o == null) {
                Log.i("sup:VOIPGlassesPlugin.kt Sup Delegate is null. Caching call info.");
                this.A06 = callInfo;
            } else {
                e9o.CQY(callInfo);
            }
        }
        A04(this, false);
    }

    public void CFn() {
        SUPToggleState sUPToggleState;
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            sUPToggleState = ((C26996DOs) e9o).A01;
        } else {
            sUPToggleState = null;
        }
        C22961BXh bXh = C22961BXh.A00;
        boolean A18 = C18070vi.A18(sUPToggleState, bXh);
        C28597E9o e9o2 = this.A02;
        if (A18) {
            if (e9o2 != null) {
                C26996DOs dOs = (C26996DOs) e9o2;
                if (C18070vi.A18(dOs.A01, bXh)) {
                    C26996DOs.A01(new C22958BXe(dOs, 0), dOs, "sup:SUPDelegate_ON_DISCOVERED_CALLBACK");
                    dOs.A0C(false);
                }
            }
        } else if (e9o2 != null) {
            e9o2.Byg();
        }
    }

    public void CJ9(boolean z) {
        SUPBottomSheetView sUPBottomSheetView;
        this.A0B = z;
        this.A0G.A0J(new C21355Aik(this, 3));
        SUPBottomSheetView sUPBottomSheetView2 = this.A03;
        if (sUPBottomSheetView2 != null && sUPBottomSheetView2.A1e() && (sUPBottomSheetView = this.A03) != null) {
            sUPBottomSheetView.A28();
        }
    }

    public void CNW() {
        C28597E9o e9o = this.A02;
        if (e9o != null) {
            e9o.CNW();
        }
        A04(this, false);
    }

    public boolean CSB(MotionEvent motionEvent) {
        ImageView imageView;
        SupToggle supToggle = this.A05;
        if (supToggle == null || (imageView = supToggle.A04) == null) {
            return false;
        }
        return AnonymousClass4aO.A05(AnonymousClass3MW.A07(), motionEvent, imageView);
    }

    public void onDestroy() {
        if (!AnonymousClass000.A1Y(this.A0R.get())) {
            CNW();
            C28597E9o e9o = this.A02;
            if (e9o != null) {
                C26996DOs dOs = (C26996DOs) e9o;
                dOs.A02 = null;
                dOs.CNW();
                dOs.A02 = null;
            }
            this.A0M.A00 = null;
            this.A02 = null;
        }
        this.A05 = null;
        this.A03 = null;
        this.A09 = null;
        C25970Cpd.A02 = AnonymousClass1D7.A0I();
    }

    private final C25810CmN A01(SUPToggleState sUPToggleState, boolean z) {
        C28597E9o e9o;
        C25810CmN A002 = A00(sUPToggleState);
        if (A002 == null) {
            return null;
        }
        boolean z2 = false;
        if (A002.A00 && !this.A0B && !this.A0E && z && (e9o = this.A02) != null) {
            C26996DOs dOs = (C26996DOs) e9o;
            if (!dOs.A09 && dOs.A06 && SUPToggleState.hingeOpen && !C18070vi.A19(SUPToggleState.deviceIsReadyToConnect, false)) {
                z2 = true;
            }
        }
        A002.A00 = z2;
        return A002;
    }
}
