package com.whatsapp.backup.google;

import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3TP;
import X.AnonymousClass4a6;
import X.C166908eI;
import X.C18070vi;
import X.C22851Dl;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C90994ey;
import X.C91574fu;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.List;

public final class RestoreTransferSelectorActivity extends C166908eI {
    public AnonymousClass3TP A00;
    public AnonymousClass19D A01;
    public WaTextView A02;
    public boolean A03;
    public final List A04;

    public RestoreTransferSelectorActivity() {
        this(0);
        this.A04 = AnonymousClass000.A13();
    }

    public static final void A03(RestoreTransferSelectorActivity restoreTransferSelectorActivity) {
        Log.i("restore>RestoreTransferSelectorActivity/Skip clicked");
        C73203Rj A002 = AnonymousClass4a6.A00(restoreTransferSelectorActivity);
        A002.A0D(2131889545);
        A002.A0g(restoreTransferSelectorActivity, new C91574fu(restoreTransferSelectorActivity, 5), 2131899432);
        A002.A0e(restoreTransferSelectorActivity, (C22851Dl) null, 2131898766);
        A002.A0T(true);
        AnonymousClass3MY.A1G(A002);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K);
            this.A01 = C72463Mc.A0e(r2);
        }
    }

    public void setTitle(int i) {
        String str;
        int i2 = 2131436280;
        if (this.A0A.A2L()) {
            i2 = 2131436281;
        }
        WaTextView waTextView = this.A02;
        if (waTextView == null) {
            str = "titleTextView";
        } else {
            waTextView.setText(i);
            AnonymousClass19D r0 = this.A01;
            if (r0 != null) {
                A9B.A0T(this, r0, i2);
                return;
            }
            str = "abPreChatdProps";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
        if (r6 == null) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r0 = 2131626743(0x7f0e0af7, float:1.888073E38)
            r10.setContentView((int) r0)
            X.0z4 r0 = r10.A0A
            boolean r1 = r0.A2L()
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            if (r1 == 0) goto L_0x0017
            r0 = 2131436252(0x7f0b22dc, float:1.849437E38)
        L_0x0017:
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0G(r10, r0)
            X.C18070vi.A0b(r0)
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r10.A02 = r1
            r0 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            android.view.View r1 = r10.findViewById(r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            android.content.Context r0 = r10.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            r3 = 0
            if (r0 != 0) goto L_0x004f
            X.01n r0 = X.AnonymousClass3MY.A0K(r10, r1)
            if (r0 == 0) goto L_0x004f
            r0.A0W(r3)
            r0.A0Y(r3)
        L_0x004f:
            r0 = 2131895327(0x7f12241f, float:1.9425484E38)
            r10.setTitle(r0)
            X.02V r4 = r10.BVe()
            X.5Qc r1 = new X.5Qc
            r1.<init>(r10)
            r9 = 0
            r2 = 1
            X.C18070vi.A0d(r4, r3)
            X.05p r0 = new X.05p
            r0.<init>(r1)
            r4.A09(r0, r10)
            r0 = 2131434656(0x7f0b1ca0, float:1.8491132E38)
            android.view.View r5 = X.AnonymousClass3MY.A0C(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r5 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r5
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r10)
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = "backup_time"
            long r0 = r1.getLong(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            if (r4 == 0) goto L_0x013e
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x013e
            X.0vb r4 = r10.A00
            java.lang.String r6 = X.C64052u8.A08(r4, r0)
            r0 = 2131895314(0x7f122412, float:1.9425458E38)
            if (r6 != 0) goto L_0x009a
        L_0x0097:
            r0 = 2131895315(0x7f122413, float:1.942546E38)
        L_0x009a:
            java.lang.String r8 = X.AnonymousClass3MX.A15(r10, r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            if (r6 == 0) goto L_0x00c5
            r0 = 2131895313(0x7f122411, float:1.9425455E38)
            java.lang.String r0 = X.C17890vO.A0R(r10, r6, r2, r3, r0)
            X.C18070vi.A0X(r0)
            r7.append(r0)
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r2)
            int r1 = r0.length()
            r0 = 33
            r7.setSpan(r4, r3, r1, r0)
            java.lang.String r0 = "\n"
            r7.append(r0)
        L_0x00c5:
            r7.append(r8)
            r5.setSubText((java.lang.CharSequence) r7)
            r0 = 2131436416(0x7f0b2380, float:1.8494702E38)
            r4 = 2131436416(0x7f0b2380, float:1.8494702E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r10, r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = (com.whatsapp.wds.components.list.listitem.WDSListItem) r1
            r0 = 2131897124(0x7f122b24, float:1.9429129E38)
            java.lang.String r0 = r10.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1.setSubText((java.lang.CharSequence) r0)
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            if (r6 == 0) goto L_0x0132
            X.C17880vN.A1T(r1, r2, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r2)
        L_0x00f5:
            java.util.List r2 = r10.A04
            r2.add(r5)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r10, r4)
            r2.add(r1)
            r1 = 2131429535(0x7f0b089f, float:1.8480745E38)
            android.view.View r2 = X.AnonymousClass3MY.A0C(r10, r1)
            r1 = 49
            X.AnonymousClass3MZ.A1J(r2, r10, r1)
            r1 = 2131435473(0x7f0b1fd1, float:1.849279E38)
            android.view.View r2 = X.AnonymousClass3MY.A0C(r10, r1)
            X.AFU r1 = new X.AFU
            r1.<init>((java.lang.Object) r10, (int) r3)
            r2.setOnClickListener(r1)
            X.1It r2 = X.AnonymousClass3MW.A0N(r10)
            java.lang.Class<X.3TP> r1 = X.AnonymousClass3TP.class
            X.1J2 r1 = r2.A00(r1)
            X.3TP r1 = (X.AnonymousClass3TP) r1
            r10.A00 = r1
            java.lang.String r4 = "viewModel"
            if (r1 != 0) goto L_0x0141
            X.C18070vi.A11(r4)
            throw r9
        L_0x0132:
            X.C17880vN.A1T(r1, r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r2)
            goto L_0x00f5
        L_0x013e:
            r6 = r9
            goto L_0x0097
        L_0x0141:
            X.1DT r3 = r1.A02
            X.5Qd r2 = new X.5Qd
            r2.<init>(r10)
            r1 = 6
            X.AnonymousClass3MY.A1K(r10, r3, r2, r1)
            X.3TP r5 = r10.A00
            if (r5 != 0) goto L_0x0154
            X.C18070vi.A11(r4)
            throw r9
        L_0x0154:
            boolean r1 = r5.A01
            if (r1 != 0) goto L_0x016f
            int r4 = r0.size()
            r3 = 0
        L_0x015d:
            r2 = 1
            if (r3 >= r4) goto L_0x0168
            int r1 = X.AnonymousClass001.A0n(r0, r3)
            if (r1 != r2) goto L_0x0170
            r5.A00 = r3
        L_0x0168:
            X.1DT r1 = r5.A02
            r1.A0E(r0)
            r5.A01 = r2
        L_0x016f:
            return
        L_0x0170:
            int r3 = r3 + 1
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreTransferSelectorActivity.onCreate(android.os.Bundle):void");
    }

    public RestoreTransferSelectorActivity(int i) {
        this.A03 = false;
        C90994ey.A00(this, 13);
    }
}
