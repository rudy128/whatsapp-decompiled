package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.7Lg  reason: invalid class name and case insensitive filesystem */
public final class C145437Lg implements AnonymousClass8AH {
    public final /* synthetic */ C136676uC A00;

    public /* synthetic */ void C2I(Map map) {
    }

    public C145437Lg(C136676uC r1) {
        this.A00 = r1;
    }

    public void BnR(int i) {
        String str;
        AnonymousClass1KB r1;
        int i2;
        Log.e("idverification/cameraerror");
        C136676uC r3 = this.A00;
        AnonymousClass1HS r0 = r3.A07;
        if (r0 != null) {
            if (r0.A03()) {
                r1 = r3.A04;
                if (r1 != null) {
                    i2 = 2131889961;
                }
                str = "globalUI";
            } else {
                if (i != 2) {
                    r1 = r3.A04;
                    if (r1 != null) {
                        i2 = 2131887932;
                    }
                    str = "globalUI";
                }
                r3.A02((Runnable) null);
                return;
            }
            r1.A08(i2, 1);
            r3.A02((Runnable) null);
            return;
        }
        str = "voidCallState";
        C18070vi.A11(str);
        throw null;
    }

    public void C1j() {
        String str;
        View view;
        View view2;
        C136676uC r2 = this.A00;
        WaQrScannerView waQrScannerView = r2.A0G;
        boolean z = false;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            z = true;
        }
        if (z && ((view2 = r2.A02) == null || view2.getVisibility() != 8)) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            r2.A03 = translateAnimation;
            translateAnimation.setInterpolator(new AccelerateInterpolator());
            Animation animation = r2.A03;
            if (animation != null) {
                Resources resources = r2.A00;
                if (resources != null) {
                    animation.setDuration((long) resources.getInteger(17694721));
                }
                C18070vi.A11("resources");
                throw null;
            }
            View view3 = r2.A02;
            if (view3 != null) {
                view3.startAnimation(r2.A03);
            }
            Animation animation2 = r2.A03;
            if (animation2 != null) {
                C114545r0.A00(animation2, r2, 5);
            }
            View view4 = r2.A02;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        C139306yc r1 = r2.A0E;
        if (r1 != null) {
            UserJid userJid = r2.A0D;
            if (userJid == null) {
                str = "jid";
            } else {
                if (r1.A00(userJid)) {
                    view = r2.A01;
                } else {
                    AlphaAnimation A0Q = C72463Mc.A0Q();
                    Resources resources2 = r2.A00;
                    if (resources2 != null) {
                        A0Q.setDuration((long) resources2.getInteger(17694720));
                        WaTextView waTextView = r2.A06;
                        if (waTextView != null) {
                            waTextView.startAnimation(A0Q);
                        }
                        view = r2.A06;
                    }
                    C18070vi.A11("resources");
                    throw null;
                }
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
        } else {
            str = "keyTransparencyManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        r1 = r1.getString(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C2H(java.lang.String r9) {
        /*
            r8 = this;
            X.6uC r3 = r8.A00
            android.view.animation.Animation r0 = r3.A03
            if (r0 == 0) goto L_0x0112
            boolean r0 = r0.hasEnded()
            r6 = 1
            if (r0 != r6) goto L_0x0112
            if (r9 == 0) goto L_0x010b
            java.nio.charset.Charset r0 = r3.A0H     // Catch:{ all -> 0x0016 }
            byte[] r1 = X.C18070vi.A1A(r9, r0)     // Catch:{ all -> 0x0016 }
            goto L_0x001b
        L_0x0016:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x001b:
            java.lang.Throwable r0 = X.C30671eK.A00(r1)
            if (r0 != 0) goto L_0x010b
            byte[] r1 = (byte[]) r1
            X.6dr r4 = r3.A00(r1)
            X.1Me r2 = r3.A09
            if (r2 == 0) goto L_0x00e1
            X.1M9 r1 = r3.A08
            if (r1 == 0) goto L_0x00dd
            com.whatsapp.jid.UserJid r0 = r3.A0D
            if (r0 != 0) goto L_0x003a
            java.lang.String r7 = "jid"
        L_0x0035:
            X.C18070vi.A11(r7)
            goto L_0x0116
        L_0x003a:
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r5 = X.AnonymousClass3MY.A0q(r2, r0)
            if (r4 == 0) goto L_0x0112
            boolean r0 = r4.A01
            if (r0 != r6) goto L_0x0050
            X.87F r0 = r3.A0C
            if (r0 == 0) goto L_0x00d9
            r0.C2K(r6)
            return
        L_0x0050:
            boolean r0 = r4 instanceof X.C116775yb
            if (r0 != r6) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "idverification/handleV1QrCodeError result = "
            X.C17900vP.A0Z(r4, r0, r1)
            int r2 = r4.A00
            r0 = -4
            if (r2 == r0) goto L_0x010b
            r0 = -3
            java.lang.String r1 = "resources"
            r4 = 0
            if (r2 == r0) goto L_0x00e5
            r0 = -2
            if (r2 == r0) goto L_0x00ed
            r0 = 2
            if (r2 == r0) goto L_0x00d1
            return
        L_0x006f:
            boolean r0 = r4 instanceof X.C116785yc
            if (r0 != r6) goto L_0x0112
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "idverification/handleV3QrCodeError result = "
            X.C17900vP.A0Z(r4, r0, r1)
            int r0 = r4.A00
            r4 = 0
            java.lang.String r7 = "resources"
            switch(r0) {
                case -38: goto L_0x00d1;
                case -37: goto L_0x00d1;
                case -36: goto L_0x00d1;
                case -35: goto L_0x00d1;
                case -34: goto L_0x00d1;
                case -33: goto L_0x00c9;
                case -32: goto L_0x0084;
                case -31: goto L_0x00c9;
                case -30: goto L_0x00c9;
                case -29: goto L_0x00c9;
                case -28: goto L_0x00c1;
                case -27: goto L_0x0084;
                case -26: goto L_0x00c1;
                case -25: goto L_0x00d1;
                case -24: goto L_0x00c1;
                case -23: goto L_0x0084;
                case -22: goto L_0x00b9;
                case -21: goto L_0x00b1;
                case -20: goto L_0x00b1;
                case -19: goto L_0x00b1;
                case -18: goto L_0x00b1;
                case -17: goto L_0x00b9;
                case -16: goto L_0x00d1;
                case -15: goto L_0x00d1;
                case -14: goto L_0x00d1;
                case -13: goto L_0x00a9;
                case -12: goto L_0x00a1;
                case -11: goto L_0x0099;
                case -10: goto L_0x008d;
                case -9: goto L_0x0085;
                default: goto L_0x0084;
            }
        L_0x0084:
            return
        L_0x0085:
            android.content.res.Resources r1 = r3.A00
            if (r1 == 0) goto L_0x0035
            r0 = 2131890424(0x7f1210f8, float:1.941554E38)
            goto L_0x0094
        L_0x008d:
            android.content.res.Resources r1 = r3.A00
            if (r1 == 0) goto L_0x0035
            r0 = 2131890423(0x7f1210f7, float:1.9415537E38)
        L_0x0094:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x00fa
        L_0x0099:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890422(0x7f1210f6, float:1.9415535E38)
            goto L_0x00f4
        L_0x00a1:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890421(0x7f1210f5, float:1.9415533E38)
            goto L_0x00f4
        L_0x00a9:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890418(0x7f1210f2, float:1.9415527E38)
            goto L_0x00f4
        L_0x00b1:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890419(0x7f1210f3, float:1.941553E38)
            goto L_0x00f4
        L_0x00b9:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890416(0x7f1210f0, float:1.9415523E38)
            goto L_0x00f4
        L_0x00c1:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890417(0x7f1210f1, float:1.9415525E38)
            goto L_0x00f4
        L_0x00c9:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0035
            r1 = 2131890420(0x7f1210f4, float:1.9415531E38)
            goto L_0x00f4
        L_0x00d1:
            X.87F r0 = r3.A0C
            if (r0 == 0) goto L_0x00d9
            r0.C2K(r4)
            return
        L_0x00d9:
            java.lang.String r7 = "listener"
            goto L_0x0035
        L_0x00dd:
            java.lang.String r7 = "contactManager"
            goto L_0x0035
        L_0x00e1:
            java.lang.String r7 = "waContactNames"
            goto L_0x0035
        L_0x00e5:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0113
            r1 = 2131897780(0x7f122db4, float:1.943046E38)
            goto L_0x00f4
        L_0x00ed:
            android.content.res.Resources r2 = r3.A00
            if (r2 == 0) goto L_0x0113
            r1 = 2131897779(0x7f122db3, float:1.9430457E38)
        L_0x00f4:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = X.AnonymousClass3MW.A0x(r2, r5, r0, r4, r1)
        L_0x00fa:
            X.C18070vi.A0X(r1)
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x0104
            r0.setText(r1)
        L_0x0104:
            com.whatsapp.WaTextView r0 = r3.A05
            if (r0 == 0) goto L_0x010b
            r0.setVisibility(r4)
        L_0x010b:
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0G
            if (r0 == 0) goto L_0x0112
            r0.CFY()
        L_0x0112:
            return
        L_0x0113:
            X.C18070vi.A11(r1)
        L_0x0116:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145437Lg.C2H(java.lang.String):void");
    }
}
