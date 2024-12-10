package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1Nb;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass46t;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C217217d;
import X.C23321Fo;
import X.C27641Ww;
import X.C42551yM;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C87824Xf;
import X.C90094dW;
import X.C91034f2;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

public class SettingsNotifications extends AnonymousClass46t implements C23321Fo {
    public static final int[] A0z = {2131888469, 2131888472, 2131888471, 2131888473, 2131888369, 2131888368, 2131888367, 2131888470};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public ViewStub A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public SwitchCompat A0C;
    public SwitchCompat A0D;
    public SwitchCompat A0E;
    public SwitchCompat A0F;
    public SwitchCompat A0G;
    public SwitchCompat A0H;
    public SwitchCompat A0I;
    public AnonymousClass1Nb A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public View A0T;
    public View A0U;
    public View A0V;
    public View A0W;
    public View A0X;
    public View A0Y;
    public View A0Z;
    public View A0a;
    public View A0b;
    public View A0c;
    public View A0d;
    public View A0e;
    public View A0f;
    public View A0g;
    public View A0h;
    public ViewGroup A0i;
    public ViewGroup A0j;
    public ViewGroup A0k;
    public TextView A0l;
    public TextView A0m;
    public TextView A0n;
    public TextView A0o;
    public TextView A0p;
    public TextView A0q;
    public TextView A0r;
    public TextView A0s;
    public boolean A0t;
    public String[] A0u;
    public String[] A0v;
    public String[] A0w;
    public String[] A0x;
    public String[] A0y;

    public SettingsNotifications() {
        this(0);
    }

    public static int A0Q(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
        r0 = r4.A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        X.AnonymousClass4Yv.A01(r4, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r1.setText(A0z[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        r0 = r4.A0x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r1.setText(r0[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C5k(int r5, int r6) {
        /*
            r4 = this;
            r3 = 7
            switch(r5) {
                case 9: goto L_0x0005;
                case 10: goto L_0x001a;
                case 11: goto L_0x002e;
                case 12: goto L_0x0061;
                case 13: goto L_0x0075;
                case 14: goto L_0x008b;
                case 15: goto L_0x00c8;
                default: goto L_0x0004;
            }
        L_0x0004:
            return
        L_0x0005:
            r4.A06 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0y
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1Nb.A0B(r2, r0, r1)
            android.widget.TextView r1 = r4.A0s
            goto L_0x00e9
        L_0x001a:
            r4.A05 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0w
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1Nb.A09(r2, r0, r1)
            android.widget.TextView r1 = r4.A0r
            goto L_0x0088
        L_0x002e:
            java.lang.String[] r0 = r4.A0u
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004d
        L_0x0044:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x00a9
        L_0x004d:
            r4.A04 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0u
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1Nb.A08(r2, r0, r1)
            android.widget.TextView r1 = r4.A0q
            goto L_0x00c0
        L_0x0061:
            r4.A03 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0y
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1Nb.A0B(r2, r0, r1)
            android.widget.TextView r1 = r4.A0p
            goto L_0x00e9
        L_0x0075:
            r4.A02 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0w
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1Nb.A09(r2, r0, r1)
            android.widget.TextView r1 = r4.A0o
        L_0x0088:
            java.lang.String[] r0 = r4.A0v
            goto L_0x00eb
        L_0x008b:
            java.lang.String[] r0 = r4.A0u
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00a1:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ad
        L_0x00a9:
            X.AnonymousClass4Yv.A01(r4, r3)
            return
        L_0x00ad:
            r4.A01 = r6
            X.1Nb r2 = r4.A0J
            java.lang.String[] r0 = r4.A0u
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1Nb.A08(r2, r0, r1)
            android.widget.TextView r1 = r4.A0n
        L_0x00c0:
            int[] r0 = A0z
            r0 = r0[r6]
            r1.setText(r0)
            return
        L_0x00c8:
            r4.A00 = r6
            X.1Nb r3 = r4.A0J
            java.lang.String[] r0 = r4.A0y
            r0 = r0[r6]
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.1yM r1 = X.AnonymousClass1Nb.A01(r3, r0)
            java.lang.String r0 = r1.A0G
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e7
            r1.A0G = r2
            X.AnonymousClass1Nb.A07(r1, r3)
        L_0x00e7:
            android.widget.TextView r1 = r4.A0m
        L_0x00e9:
            java.lang.String[] r0 = r4.A0x
        L_0x00eb:
            r0 = r0[r6]
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsNotifications.C5k(int, int):void");
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        if (i == 7) {
            r2 = AnonymousClass4a6.A00(this);
            r2.A0D(2131891600);
            r2.A0Z((DialogInterface.OnClickListener) null, 2131899286);
        } else if (i != 8) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass4a6.A00(this);
            r2.A0D(2131895949);
            C73203Rj.A0B(r2, this, 13, 2131895305);
            r2.A0X((DialogInterface.OnClickListener) null, 2131898766);
        }
        return r2.create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00de, code lost:
        if (r11.A08.A0H().hasVibrator() == false) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0V(com.whatsapp.settings.SettingsNotifications r11) {
        /*
            X.1Nb r0 = r11.A0J
            X.1yM r4 = r0.A0W()
            X.1Nb r0 = r11.A0J
            X.1yM r3 = r0.A0V()
            X.1Nb r0 = r11.A0J
            X.1yM r2 = r0.A0Y()
            java.lang.String r0 = r4.A07()
            r11.A0O = r0
            java.lang.String r1 = r4.A08()
            java.lang.String[] r0 = r11.A0y
            int r0 = A0Q(r1, r0)
            r11.A06 = r0
            java.lang.String r1 = r4.A06()
            java.lang.String[] r0 = r11.A0w
            int r0 = A0Q(r1, r0)
            r11.A05 = r0
            java.lang.String r1 = r4.A05()
            java.lang.String[] r0 = r11.A0u
            int r0 = A0Q(r1, r0)
            r11.A04 = r0
            boolean r0 = r4.A0C()
            r11.A0R = r0
            java.lang.String r0 = r3.A07()
            r11.A0N = r0
            java.lang.String r1 = r3.A08()
            java.lang.String[] r0 = r11.A0y
            int r0 = A0Q(r1, r0)
            r11.A03 = r0
            java.lang.String r1 = r3.A06()
            java.lang.String[] r0 = r11.A0w
            int r0 = A0Q(r1, r0)
            r11.A02 = r0
            java.lang.String r1 = r3.A05()
            java.lang.String[] r0 = r11.A0u
            int r0 = A0Q(r1, r0)
            r11.A01 = r0
            boolean r0 = r3.A0C()
            r11.A0P = r0
            java.lang.String r0 = r4.A03()
            r11.A0M = r0
            java.lang.String r1 = r4.A04()
            java.lang.String[] r0 = r11.A0y
            int r0 = A0Q(r1, r0)
            r11.A00 = r0
            X.1yM r0 = r4.A02()
            boolean r9 = r0.A0R
            X.1yM r0 = r3.A02()
            boolean r0 = r0.A0R
            r11.A0Q = r0
            X.1yM r0 = r2.A02()
            boolean r0 = r0.A0R
            r11.A0S = r0
            android.view.View r1 = r11.A0V
            r0 = 10
            X.C90094dW.A00(r1, r11, r0)
            androidx.appcompat.widget.SwitchCompat r1 = r11.A0C
            X.0z4 r0 = r11.A0A
            boolean r0 = r0.A2I()
            r1.setChecked(r0)
            android.widget.TextView r0 = r11.A0B
            r6 = 0
            r0.setVisibility(r6)
            android.widget.TextView r1 = r11.A0B
            java.lang.String r0 = r11.A0O
            java.lang.String r0 = X.C217217d.A06(r11, r0)
            r1.setText(r0)
            android.view.View r1 = r11.A0d
            r0 = 27
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0d
            java.lang.String r5 = "Button"
            X.AnonymousClass1Y5.A07(r0, r5)
            X.11C r0 = r11.A08
            android.os.Vibrator r0 = r0.A0H()
            if (r0 == 0) goto L_0x00e0
            X.11C r0 = r11.A08
            android.os.Vibrator r0 = r0.A0H()
            boolean r0 = r0.hasVibrator()
            r10 = 1
            if (r0 != 0) goto L_0x00e1
        L_0x00e0:
            r10 = 0
        L_0x00e1:
            r4 = 8
            r3 = -1
            if (r10 == 0) goto L_0x0310
            android.widget.TextView r0 = r11.A0s
            r0.setVisibility(r6)
            int r2 = r11.A06
            if (r2 == r3) goto L_0x00f8
            android.widget.TextView r1 = r11.A0s
            java.lang.String[] r0 = r11.A0x
            r0 = r0[r2]
            r1.setText(r0)
        L_0x00f8:
            android.view.View r1 = r11.A0h
            r0 = 11
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0h
            X.AnonymousClass1Y5.A07(r0, r5)
        L_0x0104:
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r0 < r8) goto L_0x02fd
            r2 = 2130971172(0x7f040a24, float:1.7551075E38)
            r1 = 2130971190(0x7f040a36, float:1.7551111E38)
            r0 = 2131102526(0x7f060b3e, float:1.7817492E38)
            int r0 = X.AnonymousClass1YL.A00(r11, r1, r0)
            int r1 = X.C28281Zt.A00(r11, r2, r0)
            android.widget.TextView r0 = r11.A0l
            r0.setTextColor(r1)
            android.widget.TextView r0 = r11.A0r
            r0.setTextColor(r1)
            android.widget.TextView r1 = r11.A0r
            r0 = 2131894705(0x7f1221b1, float:1.9424222E38)
            r1.setText(r0)
            android.view.View r1 = r11.A0e
            r0 = 12
        L_0x0131:
            X.C90094dW.A00(r1, r11, r0)
            int r2 = r11.A04
            if (r2 == r3) goto L_0x0141
            android.widget.TextView r1 = r11.A0q
            int[] r0 = A0z
            r0 = r0[r2]
            r1.setText(r0)
        L_0x0141:
            android.view.View r1 = r11.A0c
            r0 = 14
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0c
            X.AnonymousClass1Y5.A07(r0, r5)
            android.view.View r0 = r11.A0b
            r0.setVisibility(r6)
            androidx.appcompat.widget.SwitchCompat r2 = r11.A0F
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r11.A0R
            X.AnonymousClass46t.A03(r2, r1, r0)
            android.view.View r0 = r11.A0b
            r7 = 15
            X.C90094dW.A00(r0, r11, r7)
            android.view.ViewGroup r0 = r11.A0j
            r0.setVisibility(r6)
            androidx.appcompat.widget.SwitchCompat r1 = r11.A0H
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.AnonymousClass46t.A03(r1, r0, r9)
            android.view.ViewGroup r1 = r11.A0j
            r0 = 16
            X.C90094dW.A00(r1, r11, r0)
            android.view.ViewGroup r0 = r11.A0i
            r0.setVisibility(r6)
            androidx.appcompat.widget.SwitchCompat r2 = r11.A0E
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r11.A0Q
            X.AnonymousClass46t.A03(r2, r1, r0)
            android.view.ViewGroup r1 = r11.A0i
            r0 = 17
            X.C90094dW.A00(r1, r11, r0)
            android.widget.TextView r1 = r11.A0A
            java.lang.String r0 = r11.A0N
            java.lang.String r0 = X.C217217d.A06(r11, r0)
            r1.setText(r0)
            android.view.View r1 = r11.A0Y
            r0 = 18
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0Y
            X.AnonymousClass1Y5.A07(r0, r5)
            if (r10 == 0) goto L_0x02f6
            int r2 = r11.A03
            if (r2 == r3) goto L_0x01b0
            android.widget.TextView r1 = r11.A0p
            java.lang.String[] r0 = r11.A0x
            r0 = r0[r2]
            r1.setText(r0)
        L_0x01b0:
            android.view.View r1 = r11.A0a
            r0 = 20
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0a
            X.AnonymousClass1Y5.A07(r0, r5)
        L_0x01bc:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r8) goto L_0x02e0
            android.view.View r0 = r11.A0Z
            r0.setVisibility(r4)
        L_0x01c5:
            int r2 = r11.A01
            if (r2 == r3) goto L_0x01d2
            android.widget.TextView r1 = r11.A0n
            int[] r0 = A0z
            r0 = r0[r2]
            r1.setText(r0)
        L_0x01d2:
            android.view.View r1 = r11.A0X
            r0 = 22
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0X
            X.AnonymousClass1Y5.A07(r0, r5)
            android.view.View r0 = r11.A0W
            r0.setVisibility(r6)
            androidx.appcompat.widget.SwitchCompat r2 = r11.A0D
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r11.A0P
            X.AnonymousClass46t.A03(r2, r1, r0)
            android.view.View r1 = r11.A0W
            r0 = 23
            X.C90094dW.A00(r1, r11, r0)
            android.widget.TextView r1 = r11.A09
            java.lang.String r0 = r11.A0M
            java.lang.String r0 = X.C217217d.A06(r11, r0)
            r1.setText(r0)
            android.view.View r1 = r11.A0T
            r0 = 24
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0T
            X.AnonymousClass1Y5.A07(r0, r5)
            if (r10 == 0) goto L_0x02d9
            int r2 = r11.A00
            if (r2 == r3) goto L_0x0219
            android.widget.TextView r1 = r11.A0m
            java.lang.String[] r0 = r11.A0x
            r0 = r0[r2]
            r1.setText(r0)
        L_0x0219:
            android.view.View r1 = r11.A0U
            r0 = 25
            X.C90094dW.A00(r1, r11, r0)
            android.view.View r0 = r11.A0U
            X.AnonymousClass1Y5.A07(r0, r5)
        L_0x0225:
            android.view.View r0 = r11.A0f
            if (r0 == 0) goto L_0x028d
            android.view.View r0 = r11.A0g
            if (r0 == 0) goto L_0x028d
            android.view.ViewGroup r0 = r11.A0k
            if (r0 == 0) goto L_0x028d
            androidx.appcompat.widget.SwitchCompat r0 = r11.A0I
            if (r0 == 0) goto L_0x028d
            X.0ve r2 = r11.A0E
            r1 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x028d
            android.view.View r0 = r11.A0f
            r0.setVisibility(r6)
            android.view.View r2 = r11.A0g
            boolean r0 = r2 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0273
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            boolean r1 = X.AnonymousClass3MX.A1U(r11)
            r0 = 2131626571(0x7f0e0a4b, float:1.8880382E38)
            if (r1 == 0) goto L_0x025a
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x025a:
            r2.setLayoutResource(r0)
            android.view.View r0 = r11.A0g
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            r11.A0g = r1
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x02cc
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131896303(0x7f1227ef, float:1.9427463E38)
            r1.setHeaderText((int) r0)
        L_0x0273:
            android.view.View r0 = r11.A0g
            r0.setVisibility(r6)
            android.view.ViewGroup r0 = r11.A0k
            r0.setVisibility(r6)
            androidx.appcompat.widget.SwitchCompat r2 = r11.A0I
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r11.A0S
            X.AnonymousClass46t.A03(r2, r1, r0)
            android.view.ViewGroup r1 = r11.A0k
            r0 = 26
            X.C90094dW.A00(r1, r11, r0)
        L_0x028d:
            X.0ve r2 = r11.A0E
            r1 = 10760(0x2a08, float:1.5078E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02cb
            r0 = 2131435692(0x7f0b20ac, float:1.8493233E38)
            android.view.View r3 = r11.findViewById(r0)
            if (r3 == 0) goto L_0x02cb
            boolean r0 = r3 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x02ac
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        L_0x02ac:
            r0 = 2131435693(0x7f0b20ad, float:1.8493235E38)
            android.view.View r2 = r11.findViewById(r0)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto L_0x02c6
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r11)
            java.lang.String r0 = "status_reminder_notifications_muted"
            boolean r0 = r1.getBoolean(r0, r6)
            r0 = r0 ^ 1
            r2.setChecked(r0)
        L_0x02c6:
            if (r3 == 0) goto L_0x02cb
            X.AnonymousClass3MZ.A1P(r3, r11, r2, r7)
        L_0x02cb:
            return
        L_0x02cc:
            boolean r0 = r1 instanceof com.whatsapp.WaTextView
            if (r0 == 0) goto L_0x0273
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131896303(0x7f1227ef, float:1.9427463E38)
            r1.setText(r0)
            goto L_0x0273
        L_0x02d9:
            android.view.View r0 = r11.A0U
            r0.setVisibility(r4)
            goto L_0x0225
        L_0x02e0:
            int r2 = r11.A02
            if (r2 == r3) goto L_0x02ed
            android.widget.TextView r1 = r11.A0o
            java.lang.String[] r0 = r11.A0v
            r0 = r0[r2]
            r1.setText(r0)
        L_0x02ed:
            android.view.View r1 = r11.A0Z
            r0 = 21
            X.C90094dW.A00(r1, r11, r0)
            goto L_0x01c5
        L_0x02f6:
            android.view.View r0 = r11.A0a
            r0.setVisibility(r4)
            goto L_0x01bc
        L_0x02fd:
            int r2 = r11.A05
            if (r2 == r3) goto L_0x030a
            android.widget.TextView r1 = r11.A0r
            java.lang.String[] r0 = r11.A0v
            r0 = r0[r2]
            r1.setText(r0)
        L_0x030a:
            android.view.View r1 = r11.A0e
            r0 = 13
            goto L_0x0131
        L_0x0310:
            android.view.View r0 = r11.A0h
            r0.setVisibility(r4)
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsNotifications.A0V(com.whatsapp.settings.SettingsNotifications):void");
    }

    public void A2y() {
        if (!this.A0t) {
            this.A0t = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A0J = AnonymousClass3MZ.A11(r2);
            this.A0L = C000200d.A00(A0K2.A5o);
            this.A0K = C000200d.A00(r2.AEN);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String A062;
        String str;
        TextView textView;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2 || i == 3) && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A062 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A062 = C217217d.A06(this, (String) null);
                str = "Silent";
            }
            if (i == 1) {
                this.A0O = str;
                AnonymousClass1Nb.A0A(this.A0J, "individual_chat_defaults", str);
                textView = this.A0B;
            } else if (i != 2) {
                this.A0M = str;
                AnonymousClass1Nb r2 = this.A0J;
                C42551yM A012 = AnonymousClass1Nb.A01(r2, "individual_chat_defaults");
                if (!TextUtils.equals(str, A012.A0F)) {
                    A012.A0F = str;
                    AnonymousClass1Nb.A07(A012, r2);
                }
                textView = this.A09;
            } else {
                this.A0N = str;
                AnonymousClass1Nb.A0A(this.A0J, "group_chat_defaults", str);
                textView = this.A0A;
            }
            textView.setText(A062);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131899415);
        setContentView(2131626570);
        boolean A1T = C72473Md.A1T(this);
        boolean A1U = AnonymousClass3MX.A1U(this);
        ViewStub A0G2 = AnonymousClass3MX.A0G(this, 2131432679);
        if (A1U) {
            ((WDSSectionHeader) AnonymousClass3MY.A0G(A0G2, 2131627597)).setHeaderText(2131893066);
            ((WDSSectionHeader) AnonymousClass3MY.A0G(AnonymousClass3MX.A0G(this, 2131431269), 2131627597)).setHeaderText(2131893065);
            ((WDSSectionHeader) AnonymousClass3MY.A0G(AnonymousClass3MX.A0G(this, 2131428711), 2131627597)).setHeaderText(2131893064);
        } else {
            ((TextView) AnonymousClass3MY.A0G(A0G2, 2131626571)).setText(2131893066);
            ((TextView) AnonymousClass3MY.A0G(AnonymousClass3MX.A0G(this, 2131431269), 2131626571)).setText(2131893065);
            ((TextView) AnonymousClass3MY.A0G(AnonymousClass3MX.A0G(this, 2131428711), 2131626571)).setText(2131893064);
        }
        if (C18020vd.A05(C18040vf.A02, this.A0E, 8841)) {
            ViewStub A0H2 = AnonymousClass3MX.A0H(this, 2131436596);
            this.A08 = A0H2;
            A0H2.inflate();
            View findViewById = findViewById(2131428040);
            View findViewById2 = findViewById(2131428039);
            this.A07 = findViewById2;
            if (findViewById2 instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) findViewById2;
                int i = 2131626571;
                if (AnonymousClass3MX.A1U(this)) {
                    i = 2131627597;
                }
                viewStub.setLayoutResource(i);
                View inflate = ((ViewStub) this.A07).inflate();
                this.A07 = inflate;
                C27641Ww.A03(inflate, getResources().getDimensionPixelSize(2131168781), AnonymousClass3MZ.A01(this, 2131168781));
                View view = this.A07;
                if (view instanceof WDSSectionHeader) {
                    ((WDSSectionHeader) view).setHeaderText(2131895848);
                } else if (view instanceof WaTextView) {
                    ((TextView) view).setText(2131895848);
                }
            }
            SwitchCompat switchCompat = (SwitchCompat) findViewById(2131433206);
            this.A0G = switchCompat;
            switchCompat.setChecked(C72453Mb.A0M(this).getBoolean("pref_unread_message_clear_notification", A1T));
            C90094dW.A00(findViewById, this, 19);
            AnonymousClass1Y5.A07(findViewById, "Switch");
        }
        this.A0V = findViewById(2131429620);
        this.A0C = (SwitchCompat) findViewById(2131429621);
        View findViewById3 = findViewById(2131433212);
        this.A0d = findViewById3;
        this.A0B = C17880vN.A0E(findViewById3, 2131434760);
        View findViewById4 = findViewById(2131436736);
        this.A0h = findViewById4;
        this.A0s = C17880vN.A0E(findViewById4, 2131434760);
        View findViewById5 = findViewById(2131433981);
        this.A0e = findViewById5;
        this.A0l = C17880vN.A0E(findViewById5, 2131434761);
        TextView A0E2 = C17880vN.A0E(this.A0e, 2131434760);
        this.A0r = A0E2;
        A0E2.setVisibility(0);
        View findViewById6 = findViewById(2131433208);
        this.A0c = findViewById6;
        TextView A0E3 = C17880vN.A0E(findViewById6, 2131434760);
        this.A0q = A0E3;
        A0E3.setVisibility(0);
        this.A0b = findViewById(2131431458);
        this.A0F = (SwitchCompat) findViewById(2131431459);
        View findViewById7 = findViewById(2131431272);
        this.A0Y = findViewById7;
        TextView A0E4 = C17880vN.A0E(findViewById7, 2131434760);
        this.A0A = A0E4;
        A0E4.setVisibility(0);
        View findViewById8 = findViewById(2131431313);
        this.A0a = findViewById8;
        TextView A0E5 = C17880vN.A0E(findViewById8, 2131434760);
        this.A0p = A0E5;
        A0E5.setVisibility(0);
        View findViewById9 = findViewById(2131431282);
        this.A0Z = findViewById9;
        TextView A0E6 = C17880vN.A0E(findViewById9, 2131434760);
        this.A0o = A0E6;
        A0E6.setVisibility(0);
        View findViewById10 = findViewById(2131431271);
        this.A0X = findViewById10;
        TextView A0E7 = C17880vN.A0E(findViewById10, 2131434760);
        this.A0n = A0E7;
        A0E7.setVisibility(0);
        this.A0W = findViewById(2131431259);
        this.A0D = (SwitchCompat) findViewById(2131431260);
        View findViewById11 = findViewById(2131428745);
        this.A0T = findViewById11;
        TextView A0E8 = C17880vN.A0E(findViewById11, 2131434760);
        this.A09 = A0E8;
        A0E8.setVisibility(0);
        View findViewById12 = findViewById(2131428756);
        this.A0U = findViewById12;
        TextView A0E9 = C17880vN.A0E(findViewById12, 2131434760);
        this.A0m = A0E9;
        A0E9.setVisibility(0);
        this.A0j = AnonymousClass3MX.A0F(this, 2131434333);
        this.A0i = AnonymousClass3MX.A0F(this, 2131431290);
        this.A0H = (SwitchCompat) findViewById(2131434369);
        this.A0E = (SwitchCompat) findViewById(2131431291);
        this.A0f = findViewById(2131430084);
        this.A0g = findViewById(2131435660);
        this.A0k = AnonymousClass3MX.A0F(this, 2131435687);
        this.A0I = (SwitchCompat) findViewById(2131435690);
        Resources resources = getResources();
        this.A0x = resources.getStringArray(2130903079);
        this.A0y = resources.getStringArray(2130903080);
        this.A0v = resources.getStringArray(2130903068);
        this.A0w = resources.getStringArray(2130903069);
        this.A0u = resources.getStringArray(2130903064);
        A0V(this);
        ((C87824Xf) this.A0L.get()).A02(this.A00, "notifications", C72453Mb.A0w(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2131432618, 0, 2131895948).setShowAsAction(0);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432618) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass4Yv.A01(this, 8);
        return true;
    }

    public void onStart() {
        super.onStart();
        AnonymousClass1Nb r2 = this.A0J;
        if (r2.A00 != null) {
            boolean A0D2 = AnonymousClass1Nb.A0D(r2, "individual_chat_defaults");
            boolean A0D3 = AnonymousClass1Nb.A0D(r2, "group_chat_defaults");
            if (A0D2 || A0D3) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                A0V(this);
            }
        }
    }

    public SettingsNotifications(int i) {
        this.A0t = false;
        C91034f2.A00(this, 18);
    }
}
