package X;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.1nm  reason: invalid class name and case insensitive filesystem */
public class C36371nm implements C36361nl {
    public final AnonymousClass1L9 A00;
    public final C18030ve A01;
    public final C32981i4 A02;
    public final AnonymousClass1LU A03;
    public final C36341nj A04;
    public final AnonymousClass1PU A05;
    public final AnonymousClass00H A06;

    public void CGU(Context context, Uri uri, AnonymousClass206 r4) {
        CGV(context, uri, r4, 0);
    }

    public void CGV(Context context, Uri uri, AnonymousClass206 r9, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("extra_entry_point", 4);
        CGX(context, uri, r9, hashMap, i);
    }

    public void CGW(Context context, Uri uri, AnonymousClass206 r9, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("extra_entry_point", Integer.valueOf(i2));
        hashMap.put("qr_code_camera_source", 5);
        CGX(context, uri, r9, hashMap, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        if (r2 != 6) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CGX(android.content.Context r18, android.net.Uri r19, X.AnonymousClass206 r20, java.util.Map r21, int r22) {
        /*
            r17 = this;
            r9 = r19
            if (r19 != 0) goto L_0x000a
            java.lang.String r0 = "linklauncher/start-activity/uri-is-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            r2 = r17
            X.1nj r7 = r2.A04
            X.2tm r5 = X.AnonymousClass4YQ.A03
            boolean r0 = r5.A07(r9)
            java.lang.String r6 = "extra_entry_point"
            r8 = r18
            r3 = r20
            r4 = r21
            if (r0 == 0) goto L_0x008f
            java.lang.String r13 = r5.A06(r9)
            java.lang.String r0 = "create"
            boolean r0 = X.C63842tm.A03(r9, r5, r0)
            if (r0 == 0) goto L_0x002e
            r7.A01(r8, r9)
            return
        L_0x002e:
            java.lang.String r0 = "directory"
            boolean r1 = X.C63842tm.A03(r9, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x003b
            r7.A03(r8, r9, r0)
            return
        L_0x003b:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x008f
            if (r20 == 0) goto L_0x0068
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass1PT.A02(r0)
        L_0x004b:
            java.lang.Long r0 = r5.A05(r9)
            if (r0 == 0) goto L_0x0065
            long r15 = r0.longValue()
        L_0x0055:
            java.lang.Integer r11 = X.AnonymousClass00R.A00
            if (r1 == 0) goto L_0x0063
            int r14 = r1.intValue()
        L_0x005d:
            r10 = 0
            r12 = r10
            r7.A02(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0063:
            r14 = 0
            goto L_0x005d
        L_0x0065:
            r15 = -1
            goto L_0x0055
        L_0x0068:
            boolean r0 = r4.containsKey(r6)
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r4.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r1 = 3
            r0 = 1
            if (r2 == r0) goto L_0x0086
            r0 = 2
            if (r2 == r0) goto L_0x008d
            if (r2 == r1) goto L_0x008b
            r0 = 6
            r1 = 5
            if (r2 == r0) goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x004b
        L_0x008b:
            r1 = 2
            goto L_0x0086
        L_0x008d:
            r1 = 1
            goto L_0x0086
        L_0x008f:
            java.lang.String r5 = X.C60382nw.A00(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "linklauncher/start-activity/invite-group-activity: "
            r1.append(r0)
            r0 = 4
            java.lang.String r0 = X.AnonymousClass1EG.A0D(r5, r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r8)
            boolean r0 = r1 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x00ce
            X.1FL r1 = (X.AnonymousClass1FL) r1
            X.1Gb r0 = r1.A03
            X.1GO r0 = r0.A00
            X.1GP r2 = r0.A03
            r1 = 1
            r0 = 0
            r3 = r22
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = com.whatsapp.community.JoinGroupBottomSheetFragment.A02(r5, r3, r1, r0)
            X.C20098A7b.A02(r0, r2)
            return
        L_0x00ce:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity"
            android.content.Intent r1 = r3.setClassName(r1, r0)
            java.lang.String r0 = "code"
            r1.putExtra(r0, r5)
            X.1L9 r0 = r2.A00
            r0.A08(r8, r1)
            return
        L_0x00e8:
            X.1i4 r0 = r2.A02
            int r1 = r0.A0E(r9)
            r0 = 1
            if (r1 == r0) goto L_0x012d
            r0 = 2
            android.content.Intent r5 = X.AnonymousClass1LU.A0O(r8, r9, r0)
            boolean r0 = r4.containsKey(r6)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r4.get(r6)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r5.putExtra(r6, r0)
        L_0x0105:
            java.lang.String r1 = "qr_code_camera_source"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r4.get(r1)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r5.putExtra(r1, r0)
        L_0x0116:
            java.lang.String r1 = "extra_call_lobby_entry_point"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r4.get(r1)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r5.putExtra(r1, r0)
        L_0x0127:
            X.1L9 r0 = r2.A00
            r0.A08(r8, r5)
            return
        L_0x012d:
            X.00H r0 = r2.A06
            java.lang.Object r5 = r0.get()
            X.9yT r5 = (X.C198519yT) r5
            if (r18 == 0) goto L_0x0174
            java.util.List r6 = r5.A03
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0174
            r1 = 0
        L_0x0140:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0174
            java.lang.Object r0 = r6.get(r1)
            X.B9a r0 = (X.C22468B9a) r0
            android.content.Intent r4 = r0.CBE(r8, r9)
            if (r4 == 0) goto L_0x0171
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r8)
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.A2V r0 = (X.A2V) r0
            X.A2X r2 = r0.A01(r8)
            java.lang.Class<X.4qi> r1 = X.C98184qi.class
            X.AeL r0 = new X.AeL
            r0.<init>(r4, r5, r3)
            r2.A01(r0, r1, r5)
            X.C198519yT.A00(r8, r4, r5)
            return
        L_0x0171:
            int r1 = r1 + 1
            goto L_0x0140
        L_0x0174:
            if (r20 == 0) goto L_0x01f0
            X.0ve r6 = r2.A01
            r0 = 11720(0x2dc8, float:1.6423E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            if (r0 == 0) goto L_0x01f0
            java.lang.String r9 = r9.toString()
            X.205 r3 = r3.A0v
            java.lang.String r12 = r3.A01
            r10 = 0
            r13 = 1
            r11 = r10
            android.content.Intent r5 = X.AnonymousClass1LU.A1f(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "webview_should_ask_before_close"
            r0 = 0
            r5.putExtra(r1, r0)
            java.lang.String r1 = "message_cta_type"
            java.lang.String r0 = "marketing_msg_webview"
            r5.putExtra(r1, r0)
            r0 = 10466(0x28e2, float:1.4666E-41)
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "clear_webview"
            r5.putExtra(r0, r1)
            r7 = 11115(0x2b6b, float:1.5575E-41)
            boolean r0 = X.C18020vd.A05(r4, r6, r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "webview_open_new_tab_in_external_browser"
            r5.putExtra(r0, r1)
            boolean r1 = X.C18020vd.A05(r4, r6, r7)
            java.lang.String r0 = "show_app_redirection_dialog"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "message_id"
            r5.putExtra(r0, r12)
            r0 = 11383(0x2c77, float:1.5951E-41)
            boolean r1 = X.C18020vd.A05(r4, r6, r0)
            java.lang.String r0 = "report_menu_option"
            r5.putExtra(r0, r1)
            r0 = 12558(0x310e, float:1.7598E-41)
            boolean r1 = X.C18020vd.A05(r4, r6, r0)
            java.lang.String r0 = "user_gesture_check_enabled"
            r5.putExtra(r0, r1)
            X.1BI r0 = r3.A00
            if (r0 == 0) goto L_0x0127
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "webview_receiver_jid"
            r5.putExtra(r0, r1)
            goto L_0x0127
        L_0x01f0:
            X.1L9 r0 = r2.A00
            r0.CGU(r8, r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36371nm.CGX(android.content.Context, android.net.Uri, X.206, java.util.Map, int):void");
    }

    public C36371nm(AnonymousClass1L9 r2, C32981i4 r3, C18030ve r4, AnonymousClass1LU r5, C36341nj r6, AnonymousClass1PU r7, AnonymousClass00H r8) {
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        this.A03 = r5;
        Boolean bool = C17960vV.A01;
    }
}
