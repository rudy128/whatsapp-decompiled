package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.78S  reason: invalid class name */
public class AnonymousClass78S implements View.OnClickListener {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public AnonymousClass78S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A00 = obj7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A0L, 4905) != false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r17) {
        /*
            r16 = this;
            r10 = r16
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x026b;
                case 1: goto L_0x024c;
                case 2: goto L_0x01da;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r10.A00
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r10.A06
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r10.A00 = r1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r10.A04
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
            r1.addOnGlobalLayoutListener(r0)
        L_0x001e:
            java.lang.Object r0 = r10.A06
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r10.A02
            int[] r3 = (int[]) r3
            r0.getLocationOnScreen(r3)
            java.lang.Object r2 = r10.A03
            int[] r2 = (int[]) r2
            r1 = 0
            r0 = r3[r1]
            r2[r1] = r0
            r7 = 1
            r0 = r3[r7]
            r2[r7] = r0
            java.lang.Object r6 = r10.A07
            X.0Iy r6 = (X.C03610Iy) r6
            X.01m r5 = r6.A03
            r5.clear()
            java.lang.Object r4 = r10.A05
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r4
            r3 = r4
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r3
            java.util.List r1 = r3.A0w
            if (r1 == 0) goto L_0x011e
            int r0 = r3.A00
            java.lang.Object r0 = X.C29431cG.A0f(r1, r0)
            X.206 r0 = (X.AnonymousClass206) r0
            if (r0 == 0) goto L_0x011e
            X.70K r8 = r3.A2G(r0)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0064
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0064
            X.C137526vb.A01(r5, r7)
        L_0x0064:
            boolean r0 = r3.A13
            if (r0 == 0) goto L_0x0147
            boolean r0 = r8 instanceof X.C120906Gm
            if (r0 == 0) goto L_0x0147
            X.6Gm r8 = (X.C120906Gm) r8
            X.206 r3 = r8.A07
            X.36j r0 = X.C63672tV.A02(r3)
            if (r0 == 0) goto L_0x0094
            java.util.Set r0 = r0.A05
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0094
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x0094
            r2 = 2131432630(0x7f0b14b6, float:1.8487023E38)
            r1 = 2131892016(0x7f121730, float:1.9418768E38)
            r0 = 2131233361(0x7f080a51, float:1.8082857E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C120906Gm.A00(r5, r8, r0, r2, r1)
        L_0x0094:
            X.36j r0 = X.C63672tV.A02(r3)
            if (r0 == 0) goto L_0x0135
            boolean r0 = r0.A08
            if (r0 != r7) goto L_0x0135
        L_0x009e:
            if (r3 == 0) goto L_0x00ec
            X.1Lc r9 = r8.A0M
            boolean r0 = r9.A09(r3)
            if (r0 == 0) goto L_0x00c7
            X.72B r11 = r8.A0C
            java.util.List r2 = X.C18070vi.A0M(r3)
            X.6Re r1 = X.C122646Re.FACEBOOK
            r0 = 7
            boolean r0 = r11.A04(r1, r2, r0, r7)
            if (r0 == 0) goto L_0x00c7
            r2 = 2131432627(0x7f0b14b3, float:1.8487017E38)
            r1 = 2131892013(0x7f12172d, float:1.9418762E38)
            r0 = 2131233617(0x7f080b51, float:1.8083377E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C120906Gm.A00(r5, r8, r0, r2, r1)
        L_0x00c7:
            boolean r0 = r9.A09(r3)
            if (r0 == 0) goto L_0x00ec
            X.72B r9 = r8.A0C
            java.util.List r2 = X.C18070vi.A0M(r3)
            X.6Re r1 = X.C122646Re.INSTAGRAM
            r0 = 7
            boolean r0 = r9.A04(r1, r2, r0, r7)
            if (r0 == 0) goto L_0x00ec
            r2 = 2131432628(0x7f0b14b4, float:1.8487019E38)
            r1 = 2131892014(0x7f12172e, float:1.9418764E38)
            r0 = 2131233618(0x7f080b52, float:1.8083379E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C120906Gm.A00(r5, r8, r0, r2, r1)
        L_0x00ec:
            X.11S r0 = r8.A02
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x010e
            X.11Q r0 = r8.A04
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x011e
            X.0ve r2 = r8.A0L
            r1 = 4905(0x1329, float:6.873E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x011e
        L_0x010e:
            r2 = 2131432582(0x7f0b1486, float:1.8486926E38)
            r1 = 2131898874(0x7f1231fa, float:1.9432678E38)
            r0 = 2131233273(0x7f0809f9, float:1.8082679E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C120906Gm.A00(r5, r8, r0, r2, r1)
        L_0x011e:
            X.79k r0 = new X.79k
            r0.<init>(r10)
            r6.A00 = r0
            X.79l r0 = new X.79l
            r0.<init>(r10, r7)
            r6.A01 = r0
            r6.A00()
            r4.A07 = r7
            r4.A27()
            return
        L_0x0135:
            r2 = 2131432588(0x7f0b148c, float:1.8486938E38)
            r1 = 2131892011(0x7f12172b, float:1.9418758E38)
            r0 = 2131231930(0x7f0804ba, float:1.8079955E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C120906Gm.A00(r5, r8, r0, r2, r1)
            goto L_0x009e
        L_0x0147:
            com.whatsapp.jid.UserJid r1 = r3.A0N
            if (r1 == 0) goto L_0x01cb
            X.1Nb r0 = r3.A0Q
            if (r0 == 0) goto L_0x01d3
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0U
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0159:
            boolean r0 = X.C18070vi.A19(r0, r7)
            r2 = 2131432563(0x7f0b1473, float:1.8486887E38)
            r1 = 2131892368(0x7f121890, float:1.9419482E38)
            if (r0 == 0) goto L_0x016b
            r2 = 2131432573(0x7f0b147d, float:1.8486907E38)
            r1 = 2131897328(0x7f122bf0, float:1.9429542E38)
        L_0x016b:
            r0 = 2131232146(0x7f080592, float:1.8080393E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r0, r2, r1)
            com.whatsapp.jid.UserJid r1 = r3.A0N
            boolean r0 = X.C22971Dz.A0Y(r1)
            if (r0 == 0) goto L_0x011e
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 == r0) goto L_0x011e
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0189
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x01a9
        L_0x0189:
            r2 = 0
            r1 = 2131432562(0x7f0b1472, float:1.8486885E38)
            r0 = 2131899167(0x7f12331f, float:1.9433272E38)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r2, r1, r0)
            r1 = 2131432576(0x7f0b1480, float:1.8486913E38)
            r0 = 2131898713(0x7f123159, float:1.9432352E38)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r2, r1, r0)
            X.1DC r0 = r3.A0U
            if (r0 == 0) goto L_0x01cd
            r1 = 2131432575(0x7f0b147f, float:1.8486911E38)
            r0 = 2131899576(0x7f1234b8, float:1.9434102E38)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r2, r1, r0)
        L_0x01a9:
            r2 = 2131432552(0x7f0b1468, float:1.8486865E38)
            r1 = 2131897875(0x7f122e13, float:1.9430652E38)
            r0 = 2131232010(0x7f08050a, float:1.8080117E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r0, r2, r1)
            r2 = 2131432617(0x7f0b14a9, float:1.8486997E38)
            r1 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r0 = 2131232349(0x7f08065d, float:1.8080805E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A04(r5, r3, r0, r2, r1)
            goto L_0x011e
        L_0x01cb:
            r0 = 0
            goto L_0x0159
        L_0x01cd:
            java.lang.String r0 = "systemFeatures"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01d3:
            java.lang.String r0 = "chatSettingsStore"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01da:
            java.lang.Object r9 = r10.A02
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r8 = r10.A03
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            java.lang.Object r7 = r10.A04
            X.1pj r7 = (X.C37551pj) r7
            java.lang.Object r6 = r10.A05
            X.0vd r6 = (X.C18020vd) r6
            java.lang.Object r5 = r10.A06
            X.1oh r5 = (X.C36931oh) r5
            java.lang.Object r4 = r10.A07
            X.1FR r4 = (X.AnonymousClass1FR) r4
            java.lang.Object r3 = r10.A00
            android.app.Activity r3 = (android.app.Activity) r3
            X.C17960vV.A07(r8)
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass3MZ.A0x(r8)
            X.C17960vV.A07(r10)
            boolean r2 = r7.A0P(r10)
            java.lang.String r1 = "block_header_chat"
            r12 = 0
            boolean r0 = r8.A0C()
            if (r2 != 0) goto L_0x0244
            if (r0 == 0) goto L_0x022c
            android.content.Context r2 = r9.getContext()
            android.content.Context r9 = r9.getContext()
            X.C18070vi.A0d(r6, r12)
            r1 = 6185(0x1829, float:8.667E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r13 = X.C18020vd.A05(r0, r6, r1)
            java.lang.String r11 = "biz_block_header_chat"
            r15 = r12
            r14 = r12
            android.content.Intent r0 = X.AnonymousClass1LU.A1E(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x030d
        L_0x022c:
            X.4SO r1 = r5.BGI(r10, r1)
            r0 = 1
            r1.A04 = r0
            r1.A05 = r12
            r1.A01(r12, r0)
            X.6jc r0 = r1.A00()
            com.whatsapp.blockui.BlockConfirmationDialogFragment r0 = X.C123736Vq.A00(r0)
            r4.CMl(r0)
            return
        L_0x0244:
            if (r0 == 0) goto L_0x0248
            java.lang.String r1 = "biz_block_header_chat"
        L_0x0248:
            r7.A0H(r3, r8, r1, r12)
            return
        L_0x024c:
            java.lang.Object r5 = r10.A03
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r10.A04
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            java.lang.Object r3 = r10.A05
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            java.lang.Object r2 = r10.A06
            X.2qD r2 = (X.C61762qD) r2
            java.lang.Object r1 = r10.A07
            X.5XK r1 = (X.AnonymousClass5XK) r1
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            X.AnonymousClass4ZE.A00(r5, r3, r4, r1, r2)
            r0.A28()
            return
        L_0x026b:
            java.lang.Object r1 = r10.A07
            X.1VD r1 = (X.AnonymousClass1VD) r1
            X.1VC r0 = r1.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0283
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r1 = r1.A00()
            java.lang.Object r0 = r10.A05
            X.1GP r0 = (X.AnonymousClass1GP) r0
            X.C20098A7b.A01(r1, r0)
            return
        L_0x0283:
            java.lang.Object r0 = r10.A06
            X.1o1 r0 = (X.C36511o1) r0
            r3 = 7
            r0.A00(r3)
            java.lang.Object r11 = r10.A03
            X.1pj r11 = (X.C37551pj) r11
            java.lang.Object r7 = r10.A04
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r7.A06(r6)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r11.A0P(r0)
            java.lang.String r9 = "Required value was null."
            r8 = 0
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r5 = r10.A02
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.Context r4 = r5.getApplicationContext()
            r3 = 2131897293(0x7f122bcd, float:1.9429471E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.Object r0 = r10.A00
            X.1Me r0 = (X.C24921Me) r0
            java.lang.String r0 = r0.A0I(r7)
            r2 = 0
            java.lang.String r1 = X.C17880vN.A0q(r4, r0, r1, r2, r3)
            com.whatsapp.jid.Jid r0 = r7.A06(r6)
            if (r0 == 0) goto L_0x02d8
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.4iA r0 = X.C87374Vi.A00(r5, r11, r0)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = X.C87374Vi.A01(r0, r1, r2, r2)
            java.lang.Object r0 = r10.A05
            X.1GP r0 = (X.AnonymousClass1GP) r0
            r1.A2C(r0, r8)
            return
        L_0x02d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r9)
            throw r0
        L_0x02dd:
            X.1E7 r1 = r7.A0I
            X.1BI r0 = r7.A0J
            boolean r0 = r0 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x02f3
            if (r1 == 0) goto L_0x02f3
            com.whatsapp.jid.Jid r0 = r1.A06(r6)
            if (r0 == 0) goto L_0x02f3
            java.lang.String r0 = r0.getRawString()
            if (r0 != 0) goto L_0x02fd
        L_0x02f3:
            com.whatsapp.jid.Jid r0 = r7.A06(r6)
            if (r0 == 0) goto L_0x0311
            java.lang.String r0 = r0.getRawString()
        L_0x02fd:
            java.lang.Object r2 = r10.A02
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r1 = r2.getApplicationContext()
            java.util.List r0 = X.C18070vi.A0M(r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A1i(r1, r0, r3)
        L_0x030d:
            r2.startActivity(r0)
            return
        L_0x0311:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78S.onClick(android.view.View):void");
    }

    public AnonymousClass78S(Activity activity, AnonymousClass1GP r3, C37551pj r4, C24921Me r5, AnonymousClass1E7 r6, C36511o1 r7, AnonymousClass1VD r8) {
        this.A01 = 0;
        C18070vi.A0s(r8, r7, r4, r5);
        C18070vi.A0l(r6, r3);
        this.A07 = r8;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = r5;
        this.A02 = activity;
        this.A04 = r6;
        this.A05 = r3;
    }

    public AnonymousClass78S(Context context, View view, C18000vb r9, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A01 = 3;
        View view2 = view;
        this.A06 = view;
        this.A05 = statusPlaybackBaseFragment;
        this.A02 = new int[2];
        this.A03 = new int[2];
        this.A07 = new C03610Iy(context, view2, AnonymousClass3MY.A1b(r9) ? 5 : 3, 0, 2132084381);
        this.A04 = new AnonymousClass793(this, 20);
    }
}
