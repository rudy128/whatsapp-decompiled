package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.5r0  reason: invalid class name and case insensitive filesystem */
public class C114545r0 extends C90704eV {
    public final int A00;
    public final Object A01;

    public C114545r0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C114545r0(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r1.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0184;
                case 1: goto L_0x0178;
                case 2: goto L_0x0132;
                case 3: goto L_0x0110;
                case 4: goto L_0x0101;
                case 5: goto L_0x0041;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00da;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00b5;
                case 11: goto L_0x0095;
                case 12: goto L_0x008c;
                case 13: goto L_0x0075;
                case 14: goto L_0x003a;
                case 15: goto L_0x0033;
                case 16: goto L_0x0066;
                case 17: goto L_0x0058;
                case 18: goto L_0x004d;
                case 19: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A01
            X.7OH r3 = (X.AnonymousClass7OH) r3
            r0 = 8
            X.1bI r2 = r3.A0K
            r2.A04(r0)
            r1 = 0
            android.view.ViewGroup r0 = r3.A0E
            r0.setVisibility(r1)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r3.A0H
            r0.setVisibility(r1)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A05
            r0.setProgress(r1)
            android.view.View r0 = r2.A02()
        L_0x0024:
            r0.clearAnimation()
        L_0x0027:
            return
        L_0x0028:
            java.lang.Object r0 = r7.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            X.1bI r0 = r0.A0K
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            goto L_0x0024
        L_0x0033:
            java.lang.Object r0 = r7.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            android.view.View r0 = r0.A0B
            goto L_0x0024
        L_0x003a:
            java.lang.Object r0 = r7.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            android.view.View r0 = r0.A09
            goto L_0x0024
        L_0x0041:
            java.lang.Object r0 = r7.A01
            X.6uC r0 = (X.C136676uC) r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r0.A0G
            if (r0 == 0) goto L_0x0027
            r0.CFY()
            return
        L_0x004d:
            java.lang.Object r0 = r7.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            android.view.ViewGroup r1 = r0.A0E
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x0062
        L_0x0058:
            java.lang.Object r0 = r7.A01
            X.7OH r0 = (X.AnonymousClass7OH) r0
            android.view.View r1 = r0.A0B
            r0 = 1
            r1.setClickable(r0)
        L_0x0062:
            r1.clearAnimation()
            return
        L_0x0066:
            java.lang.Object r1 = r7.A01
            X.7OH r1 = (X.AnonymousClass7OH) r1
            android.view.ViewGroup r0 = r1.A0C
            r0.clearAnimation()
            android.view.View r0 = r1.A08
            r0.requestFocus()
            return
        L_0x0075:
            java.lang.Object r1 = r7.A01
            X.6Mj r1 = (X.C121996Mj) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Runnable r0 = r1.A0K
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A0J
            r1.removeCallbacks(r0)
            r0 = 0
            r1.A00 = r0
            return
        L_0x008c:
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x0095:
            java.lang.Object r3 = r7.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            X.1bI r0 = r3.A0W
            java.lang.String r2 = "templateTooltipView"
            if (r0 == 0) goto L_0x00b1
            android.view.View r1 = r0.A02()
            r0 = 0
            r1.setAlpha(r0)
            X.1bI r1 = r3.A0W
            if (r1 == 0) goto L_0x00b1
            r0 = 8
            r1.A04(r0)
            return
        L_0x00b1:
            X.C18070vi.A11(r2)
            goto L_0x010e
        L_0x00b5:
            java.lang.Object r2 = r7.A01
            X.75M r2 = (X.AnonymousClass75M) r2
            android.view.View r0 = r2.A0D
            int r0 = r0.getHeight()
            X.AnonymousClass75M.A0C(r2, r0)
            r1 = 1
            r0 = 0
            r2.A0X(r0, r1)
            return
        L_0x00c8:
            java.lang.Object r4 = r7.A01
            X.75M r4 = (X.AnonymousClass75M) r4
            android.location.Location r3 = r4.A0H()
            int r2 = r4.A0G()
            r1 = 0
            r0 = 0
            X.AnonymousClass75M.A04(r3, r4, r1, r2, r0)
            return
        L_0x00da:
            java.lang.Object r2 = r7.A01
            X.75M r2 = (X.AnonymousClass75M) r2
            android.view.View r1 = r2.A0D
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            X.AnonymousClass75M.A0C(r2, r0)
            return
        L_0x00ea:
            java.lang.Object r2 = r7.A01
            X.6mj r2 = (X.C132406mj) r2
            android.view.View r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.A00(r0)
            return
        L_0x00fa:
            java.lang.Object r0 = r7.A01
            X.7By r0 = (X.C143087By) r0
            android.view.View r1 = r0.A0B
            goto L_0x017e
        L_0x0101:
            java.lang.Object r0 = r7.A01
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            android.view.View r1 = r0.A01
            if (r1 != 0) goto L_0x017e
            java.lang.String r0 = "securityNotificationView"
            X.C18070vi.A11(r0)
        L_0x010e:
            r0 = 0
            throw r0
        L_0x0110:
            java.lang.Object r2 = r7.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A09
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.A02
            r0.setVisibility(r1)
            android.view.View r0 = r2.A01
            r0.setVisibility(r1)
            r0 = 0
            r2.A09 = r0
            r2.A2H()
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A03(r2)
            r0 = 0
            r2.A0R = r0
            return
        L_0x0132:
            java.lang.Object r6 = r7.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r6 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r6
            r6.A2H()
            android.view.ViewGroup r0 = r6.A02
            int r0 = r0.getHeight()
            r1 = 0
            float r0 = (float) r0
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r1, r1, r0, r1)
            r0 = 150(0x96, double:7.4E-322)
            r5.setDuration(r0)
            android.view.ViewGroup r0 = r6.A02
            r4 = 0
            r0.setVisibility(r4)
            android.view.View r0 = r6.A01
            r0.setVisibility(r4)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0D
            int r3 = r0.getSelectionStart()
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0D
            int r2 = r0.getSelectionEnd()
            com.whatsapp.mentions.MentionableEntry r1 = r6.A0D
            java.lang.String r0 = r1.getStringText()
            r1.setText(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r6.A0D
            r0.setSelection(r3, r2)
            r6.A0S = r4
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r6.A09
            r0.startAnimation(r5)
            return
        L_0x0178:
            java.lang.Object r0 = r7.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            android.view.View r1 = r0.A08
        L_0x017e:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0184:
            java.lang.Object r0 = r7.A01
            X.8A5 r0 = (X.AnonymousClass8A5) r0
            r0.C5f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114545r0.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        View view;
        switch (this.A00) {
            case 9:
                AnonymousClass75M r4 = (AnonymousClass75M) this.A01;
                r4.A0T(r4.A05, Float.valueOf(-0.5f), r4.A07.getHeight(), true);
                return;
            case 10:
                AnonymousClass75M r1 = (AnonymousClass75M) this.A01;
                r1.A0R(r1.A0D.getHeight());
                r1.A0b(true);
                return;
            case 12:
                ((View) this.A01).setAlpha(1.0f);
                return;
            case 14:
                view = ((AnonymousClass7OH) this.A01).A09;
                break;
            case 15:
                view = ((AnonymousClass7OH) this.A01).A0B;
                break;
            case 16:
                view = ((AnonymousClass7OH) this.A01).A0C;
                break;
            case 18:
                return;
            case 19:
                ((AnonymousClass7OH) this.A01).A0K.A04(0);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
        view.setVisibility(0);
    }
}
