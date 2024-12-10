package com.whatsapp.invites;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass12M;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1PU;
import X.AnonymousClass23S;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass42Q;
import X.AnonymousClass4SZ;
import X.AnonymousClass5a5;
import X.C000200d;
import X.C17960vV;
import X.C18000vb;
import X.C24921Me;
import X.C25231Nk;
import X.C27201Vd;
import X.C37451pZ;
import X.C55082fB;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import X.C95444mF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicReference;

public class ViewGroupInviteActivity extends AnonymousClass1FY implements AnonymousClass5a5 {
    public int A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public TextView A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C37451pZ A07;
    public C27201Vd A08;
    public AnonymousClass118 A09;
    public C18000vb A0A;
    public AnonymousClass1CJ A0B;
    public AnonymousClass1NN A0C;
    public AnonymousClass1MZ A0D;
    public AnonymousClass12M A0E;
    public AnonymousClass4SZ A0F;
    public UserJid A0G;
    public C55082fB A0H;
    public AnonymousClass23S A0I;
    public AnonymousClass1PU A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public Runnable A0M;
    public boolean A0N;
    public View A0O;
    public ViewGroup A0P;
    public TextView A0Q;
    public boolean A0R;
    public final AtomicReference A0S;
    public final C25231Nk A0T;

    public ViewGroupInviteActivity() {
        this(0);
        this.A0S = new AtomicReference((Object) null);
        this.A0T = new C95444mF(this, 17);
    }

    public void C47(UserJid userJid) {
        this.A04.setText(2131895355);
        this.A02.setVisibility(0);
        this.A01.setVisibility(4);
        AnonymousClass10I r1 = this.A05;
        AnonymousClass11P r5 = this.A05;
        AnonymousClass1KB r4 = this.A05;
        AnonymousClass12M r6 = this.A0E;
        Object obj = this.A0S.get();
        C17960vV.A07(obj);
        AnonymousClass3MW.A1T(new AnonymousClass42Q(r4, r5, r6, this, (AnonymousClass1EC) obj, userJid), r1, 0);
    }

    public static void A03(ViewGroupInviteActivity viewGroupInviteActivity, int i) {
        viewGroupInviteActivity.A0Q.setText(i);
        viewGroupInviteActivity.A02.setVisibility(4);
        viewGroupInviteActivity.A0P.setVisibility(0);
        viewGroupInviteActivity.A01.setVisibility(4);
        viewGroupInviteActivity.A0O.setVisibility(8);
    }

    public void A2y() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r2 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L2, r2, this, r2.A5A);
            this.A09 = AnonymousClass3MZ.A0l(A0L2);
            this.A0B = AnonymousClass3Ma.A0d(A0L2);
            this.A08 = AnonymousClass3MZ.A0i(A0L2);
            this.A0L = C000200d.A00(A0L2.A6N);
            this.A05 = AnonymousClass10E.A4z(A0L2);
            this.A06 = AnonymousClass3MZ.A0g(A0L2);
            this.A0A = AnonymousClass10E.A6Q(A0L2);
            this.A0J = AnonymousClass3MZ.A12(A0L2);
            this.A0K = AnonymousClass3MX.A12(A0L2);
            this.A0E = AnonymousClass3Ma.A0h(A0L2);
            this.A0C = AnonymousClass3Ma.A0e(A0L2);
            this.A0D = AnonymousClass3MY.A0V(A0L2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        if (r15.A0I.A00 != 1) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r15 = r25
            r0 = r26
            super.onCreate(r0)
            android.content.Intent r5 = r15.getIntent()
            java.lang.String r4 = "from_me"
            boolean r1 = r5.hasExtra(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0078
            java.lang.String r3 = "key_remote_jid"
            boolean r1 = r5.hasExtra(r3)
            if (r1 == 0) goto L_0x0078
            java.lang.String r2 = "key_id"
            boolean r1 = r5.hasExtra(r2)
            if (r1 == 0) goto L_0x0078
            boolean r1 = r5.getBooleanExtra(r4, r0)
            r15.A0N = r1
            java.lang.String r1 = r5.getStringExtra(r3)
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A02(r1)
            r15.A0G = r1
            java.lang.String r1 = "group_type"
            int r1 = r5.getIntExtra(r1, r0)
            r15.A00 = r1
            com.whatsapp.jid.UserJid r4 = r15.A0G
            if (r4 == 0) goto L_0x0078
            boolean r3 = r15.A0N
            java.lang.String r1 = r5.getStringExtra(r2)
            X.205 r2 = new X.205
            r2.<init>(r4, r1, r3)
            X.00H r1 = r15.A0K
            X.206 r3 = X.AnonymousClass1W2.A01(r2, r1)
            boolean r1 = r3 instanceof X.AnonymousClass23S
            if (r1 == 0) goto L_0x0078
            X.23S r3 = (X.AnonymousClass23S) r3
            r15.A0I = r3
            java.util.concurrent.atomic.AtomicReference r2 = r15.A0S
            X.1EC r1 = r3.A02
            r2.set(r1)
            java.lang.Object r1 = r2.get()
            r4 = 1
            if (r1 != 0) goto L_0x007c
            X.1KB r2 = r15.A05
            X.23S r0 = r15.A0I
            int r1 = r0.A00
            r0 = 2131890292(0x7f121074, float:1.9415272E38)
            if (r1 == r4) goto L_0x0075
        L_0x0072:
            r0 = 2131890291(0x7f121073, float:1.941527E38)
        L_0x0075:
            r2.A08(r0, r4)
        L_0x0078:
            r15.finish()
            return
        L_0x007c:
            X.23S r2 = r15.A0I
            X.205 r1 = r2.A0v
            X.1BI r1 = r1.A00
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A01(r1)
            X.1EC r6 = r2.A02
            if (r6 == 0) goto L_0x009e
            java.lang.String r8 = r2.A06
            if (r8 == 0) goto L_0x009e
            if (r7 == 0) goto L_0x009e
            long r9 = r2.A01
            X.2fB r5 = new X.2fB
            r5.<init>(r6, r7, r8, r9)
        L_0x0097:
            r15.A0H = r5
            if (r5 != 0) goto L_0x00a0
            X.1KB r2 = r15.A05
            goto L_0x0072
        L_0x009e:
            r5 = 0
            goto L_0x0097
        L_0x00a0:
            r1 = 2131898700(0x7f12314c, float:1.9432325E38)
            r15.setTitle(r1)
            r1 = 2131627363(0x7f0e0d63, float:1.8881988E38)
            r15.setContentView((int) r1)
            r2 = 2131431799(0x7f0b1177, float:1.8485337E38)
            r1 = 2131431799(0x7f0b1177, float:1.8485337E38)
            android.view.View r7 = r15.findViewById(r2)
            r2 = 2131428018(0x7f0b02b2, float:1.8477669E38)
            android.view.View r6 = r15.findViewById(r2)
            android.view.ViewTreeObserver r5 = r7.getViewTreeObserver()
            r3 = 2
            X.4e5 r2 = new X.4e5
            r2.<init>(r15, r7, r6, r3)
            r5.addOnGlobalLayoutListener(r2)
            X.1Vd r3 = r15.A08
            java.lang.String r2 = "view-group-invite-activity"
            X.1pZ r2 = r3.A06(r15, r2)
            r15.A07 = r2
            r2 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.ViewGroup r2 = X.AnonymousClass3MX.A0F(r15, r2)
            r15.A02 = r2
            r2 = 2131431263(0x7f0b0f5f, float:1.848425E38)
            android.view.ViewGroup r2 = X.AnonymousClass3MX.A0F(r15, r2)
            r15.A01 = r2
            r2 = 2131430516(0x7f0b0c74, float:1.8482735E38)
            android.view.ViewGroup r2 = X.AnonymousClass3MX.A0F(r15, r2)
            r15.A0P = r2
            r2 = 2131434197(0x7f0b1ad5, float:1.8490201E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r15, r2)
            r15.A04 = r2
            r2 = 2131430532(0x7f0b0c84, float:1.8482768E38)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r15, r2)
            r15.A0Q = r2
            r2 = 2131431280(0x7f0b0f70, float:1.8484285E38)
            android.widget.ImageView r2 = X.AnonymousClass3MX.A0I(r15, r2)
            r15.A03 = r2
            r2 = 2131431281(0x7f0b0f71, float:1.8484287E38)
            android.view.View r2 = r15.findViewById(r2)
            r15.A0O = r2
            X.11P r11 = r15.A05
            X.0ve r10 = r15.A0E
            X.1CJ r9 = r15.A0B
            X.1M9 r8 = r15.A05
            X.1Me r7 = r15.A06
            X.0vb r6 = r15.A0A
            X.1PU r5 = r15.A0J
            X.1pZ r3 = r15.A07
            r2 = 2131431809(0x7f0b1181, float:1.8485358E38)
            android.view.ViewGroup r16 = X.AnonymousClass3MX.A0F(r15, r2)
            X.4SZ r14 = new X.4SZ
            r18 = r7
            r19 = r3
            r20 = r11
            r21 = r6
            r22 = r9
            r23 = r10
            r24 = r5
            r17 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15.A0F = r14
            r14.A00 = r0
            r2 = 2131431804(0x7f0b117c, float:1.8485348E38)
            android.view.View r3 = r15.findViewById(r2)
            r2 = 34
            X.C89954dI.A00(r3, r15, r2)
            r2 = 2131431788(0x7f0b116c, float:1.8485315E38)
            android.widget.TextView r5 = X.AnonymousClass3MX.A0L(r15, r2)
            r2 = 43
            X.C825148g.A00(r5, r15, r2)
            boolean r2 = r15.A0N
            if (r2 == 0) goto L_0x01cb
            r3 = 2131895346(0x7f122432, float:1.9425522E38)
        L_0x0162:
            r5.setText(r3)
            r2 = 2131433257(0x7f0b1729, float:1.8488295E38)
            android.view.View r3 = r15.findViewById(r2)
            r2 = 35
            X.C89954dI.A00(r3, r15, r2)
            r2 = 2131431961(0x7f0b1219, float:1.8485666E38)
            X.C72463Mc.A19(r15, r2)
            X.1NN r3 = r15.A0C
            X.1Nk r2 = r15.A0T
            r3.registerObserver(r2)
            r2 = 2131430849(0x7f0b0dc1, float:1.848341E38)
            android.view.View r3 = r15.findViewById(r2)
            r2 = 36
            X.C89954dI.A00(r3, r15, r2)
            X.10I r3 = r15.A05
            X.11P r9 = r15.A05
            X.0ve r13 = r15.A0E
            X.11S r6 = r15.A02
            X.118 r10 = r15.A09
            X.1CJ r11 = r15.A0B
            X.00H r2 = r15.A0L
            X.1OZ r16 = X.C17880vN.A0U(r2)
            X.1M9 r7 = r15.A05
            X.1Me r8 = r15.A06
            X.12M r14 = r15.A0E
            X.1MZ r12 = r15.A0D
            X.23S r4 = r15.A0I
            X.2fB r2 = r15.A0H
            X.C17960vV.A07(r2)
            X.49k r5 = new X.49k
            r18 = r4
            r17 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass3MW.A1T(r5, r3, r0)
            X.C72483Me.A0b(r15)
            android.view.animation.AlphaAnimation r4 = X.C72463Mc.A0Q()
            r2 = 150(0x96, double:7.4E-322)
            r4.setDuration(r2)
            android.view.View r0 = r15.findViewById(r1)
            r0.startAnimation(r4)
            return
        L_0x01cb:
            X.23S r2 = r15.A0I
            int r2 = r2.A00
            r3 = 2131891519(0x7f12153f, float:1.941776E38)
            if (r2 != r4) goto L_0x0162
            r3 = 2131891523(0x7f121543, float:1.9417768E38)
            goto L_0x0162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.invites.ViewGroupInviteActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0M;
        if (runnable != null) {
            this.A05.A0I(runnable);
            this.A0M = null;
        }
        this.A0C.unregisterObserver(this.A0T);
        this.A07.A02();
    }

    public ViewGroupInviteActivity(int i) {
        this.A0R = false;
        C91014f0.A00(this, 37);
    }
}
