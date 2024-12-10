package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.8nV  reason: invalid class name */
public final class AnonymousClass8nV extends AnonymousClass3uP {
    public ViewGroup A00;
    public TextView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public AnonymousClass00H A05;
    public boolean A06;

    public static final void setClickListeners$lambda$0(AnonymousClass8nV r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.A00();
    }

    public static final void setClickListeners$lambda$1(AnonymousClass8nV r1, View view) {
        C18070vi.A0d(r1, 0);
        r1.A00();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A01(this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof C438721g);
        this.A0I = r2;
    }

    public final void setFlowsResponseManagementAction(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0177 A[Catch:{ JSONException -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a5 A[Catch:{ JSONException -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r28 = this;
            r3 = r28
            X.21g r0 = r3.getFMessage()
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x01f4
            X.AE2 r0 = r0.A01     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r0 = r0.A02     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r2 = "wa_flow_response_params"
            org.json.JSONObject r1 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r13 = "flow_id"
            java.lang.String r0 = r1.getString(r13)     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r8 = "response_message"
            java.lang.String r1 = r1.getString(r8)     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            int r0 = r0.length()     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            if (r1 == 0) goto L_0x01f4
            int r0 = r1.length()     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r0 = "response"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            int r0 = r0.length()     // Catch:{ JSONException -> 0x01f0 }
            if (r0 == 0) goto L_0x01f4
            X.21g r0 = r3.getFMessage()
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0098
            X.21g r0 = r3.getFMessage()
            X.205 r0 = r0.A0v
            X.1BI r14 = r0.A00
        L_0x005c:
            X.00H r0 = r3.getFlowsResponseManagementAction()
            java.lang.Object r11 = r0.get()
            X.9fW r11 = (X.C187259fW) r11
            android.content.Context r6 = X.AnonymousClass3MY.A04(r3)
            X.21g r0 = r3.getFMessage()
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x0096
            X.AE2 r1 = r0.A01
        L_0x0074:
            X.21g r0 = r3.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            r23 = r0
            X.C18070vi.A0X(r23)
            java.lang.String r19 = X.C108985cd.A0f()
            X.21g r0 = r3.getFMessage()
            long r4 = r0.A0x
            X.21g r0 = r3.getFMessage()
            X.205 r0 = r0.A0v
            boolean r9 = r0.A02
            java.lang.String r10 = "business_jid"
            goto L_0x00a0
        L_0x0096:
            r1 = 0
            goto L_0x0074
        L_0x0098:
            X.11S r0 = r3.A0U
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r14 = r0.A0E
            goto L_0x005c
        L_0x00a0:
            android.app.Activity r7 = X.AnonymousClass1L9.A00(r6)     // Catch:{ JSONException -> 0x01e1 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ JSONException -> 0x01e1 }
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r14)     // Catch:{ JSONException -> 0x01e1 }
            if (r1 == 0) goto L_0x00b0
            java.lang.String r0 = r1.A02     // Catch:{ JSONException -> 0x01e1 }
            if (r0 != 0) goto L_0x00b2
        L_0x00b0:
            java.lang.String r0 = ""
        L_0x00b2:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONObject r0 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r18 = r0.getString(r13)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r17 = r0.getString(r8)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r16 = X.C108985cd.A0f()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r12 = "3"
            if (r9 == 0) goto L_0x00cd
            java.lang.String r3 = "CONSUMER"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r3 = "SMB"
        L_0x00cf:
            r2 = 0
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r0 = r2
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r0 = r6.user     // Catch:{ JSONException -> 0x01e1 }
        L_0x00d7:
            r1.put(r10, r0)     // Catch:{ JSONException -> 0x01e1 }
            X.00H r0 = r11.A01     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x01e1 }
            X.9o1 r0 = (X.C192229o1) r0     // Catch:{ JSONException -> 0x01e1 }
            r0.A01(r6)     // Catch:{ JSONException -> 0x01e1 }
            X.00H r0 = r11.A04     // Catch:{ JSONException -> 0x01e1 }
            r0.get()     // Catch:{ JSONException -> 0x01e1 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ JSONException -> 0x01e1 }
            r1.<init>()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r15 = r7.getPackageName()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "com.whatsapp.flows.webview.WaFlowsWebViewBottomsheetModalActivity"
            r1.setClassName(r15, r0)     // Catch:{ JSONException -> 0x01e1 }
            X.C18070vi.A0b(r18)     // Catch:{ JSONException -> 0x01e1 }
            boolean r0 = r7 instanceof X.C108885cS     // Catch:{ JSONException -> 0x01e1 }
            if (r0 == 0) goto L_0x016e
            r0 = r7
            X.BCs r0 = (X.C22559BCs) r0     // Catch:{ JSONException -> 0x01e1 }
            X.1E7 r14 = r0.getContact()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r14.A06(r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r14 = X.C22971Dz.A06(r0)     // Catch:{ JSONException -> 0x01e1 }
        L_0x0110:
            java.lang.String r0 = "chat_id"
            r1.putExtra(r0, r14)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r14 = "message_id"
            r0 = r23
            r1.putExtra(r14, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r14 = "action_name"
            java.lang.String r0 = "galaxy_message"
            r1.putExtra(r14, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "message_row_id"
            r1.putExtra(r0, r4)     // Catch:{ JSONException -> 0x01e1 }
            X.00H r0 = r11.A03     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x01e1 }
            X.0vb r0 = (X.C18000vb) r0     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r4 = r0.A06()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "user_locale"
            r1.putExtra(r0, r4)     // Catch:{ JSONException -> 0x01e1 }
            r0 = r18
            r1.putExtra(r13, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "flow_message_version"
            r1.putExtra(r0, r12)     // Catch:{ JSONException -> 0x01e1 }
        L_0x0143:
            X.00H r5 = r11.A02     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Object r0 = r5.get()     // Catch:{ JSONException -> 0x01e1 }
            X.8si r0 = (X.C172058si) r0     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r25 = "message_cta"
            java.lang.String r26 = "web"
            r4 = 1
            r20 = r0
            r21 = r6
            r22 = r18
            r24 = r19
            r27 = r4
            r20.A0G(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ JSONException -> 0x01e1 }
            X.00H r0 = r11.A00     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Object r13 = r0.get()     // Catch:{ JSONException -> 0x01e1 }
            X.0vd r13 = (X.C18020vd) r13     // Catch:{ JSONException -> 0x01e1 }
            r11 = 8418(0x20e2, float:1.1796E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x01e1 }
            boolean r0 = X.C18020vd.A05(r0, r13, r11)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0175
        L_0x016e:
            if (r14 == 0) goto L_0x0143
            java.lang.String r14 = r14.getRawString()     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0110
        L_0x0175:
            if (r0 == 0) goto L_0x018a
            java.lang.Object r11 = r5.get()     // Catch:{ JSONException -> 0x01e1 }
            X.A6h r11 = (X.C20081A6h) r11     // Catch:{ JSONException -> 0x01e1 }
            int r0 = r18.hashCode()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "native_screen_start"
            r11.A0B(r5, r0)     // Catch:{ JSONException -> 0x01e1 }
        L_0x018a:
            java.lang.String r0 = "flow_message_version"
            r1.putExtra(r0, r12)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r5 = "session_id"
            r0 = r19
            r1.putExtra(r5, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r5 = "is_draft"
            r0 = 0
            r1.putExtra(r5, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r5 = "flow_action"
            java.lang.String r0 = "navigate"
            r1.putExtra(r5, r0)     // Catch:{ JSONException -> 0x01e1 }
            if (r6 == 0) goto L_0x01a7
            java.lang.String r2 = r6.user     // Catch:{ JSONException -> 0x01e1 }
        L_0x01a7:
            r1.putExtra(r10, r2)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r2 = "observer_id"
            r0 = r16
            r1.putExtra(r2, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r6 = "flow_action_payload"
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r2 = "screen"
            java.lang.String r0 = "RESPONSE"
            org.json.JSONObject r0 = r5.put(r2, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01e1 }
            r1.putExtra(r6, r0)     // Catch:{ JSONException -> 0x01e1 }
            r0 = r17
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "response_viewer"
            r1.putExtra(r0, r3)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "is_response_flow"
            r1.putExtra(r0, r4)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = "message_is_from_me"
            r1.putExtra(r0, r9)     // Catch:{ JSONException -> 0x01e1 }
            r1.getExtras()     // Catch:{ JSONException -> 0x01e1 }
            r7.startActivity(r1)     // Catch:{ JSONException -> 0x01e1 }
            return
        L_0x01e1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsResponseManagementActionImpl/openFlowsResponseBottomSheet() - Error during json payload parsing: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x01f0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x01f4:
            android.content.Context r2 = r3.getContext()
            r1 = 2131890455(0x7f121117, float:1.9415602E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nV.A00():void");
    }

    public void A1M() {
        if (!this.A06) {
            this.A06 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A05 = C000200d.A00(r1.AFL);
        }
    }

    public C438721g getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractiveResponse");
        return (C438721g) r1;
    }

    public final AnonymousClass00H getFlowsResponseManagementAction() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("flowsResponseManagementAction");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass8nV r3) {
        /*
            X.21g r0 = r3.getFMessage()
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x007e
            X.21g r0 = r3.getFMessage()
            X.AEb r0 = r0.A00
            r1 = 0
            if (r0 == 0) goto L_0x007e
            X.AE2 r0 = r0.A01
            if (r0 == 0) goto L_0x007e
            X.21g r0 = r3.getFMessage()     // Catch:{ JSONException -> 0x0059 }
            X.AEb r0 = r0.A00     // Catch:{ JSONException -> 0x0059 }
            if (r0 == 0) goto L_0x0023
            X.AE2 r0 = r0.A01     // Catch:{ JSONException -> 0x0059 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x0059 }
        L_0x0023:
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r0 = "wa_flow_response_params"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r0 = "title"
            java.lang.String r2 = r1.optString(r0)     // Catch:{ JSONException -> 0x0059 }
            if (r2 == 0) goto L_0x004f
            boolean r0 = X.AnonymousClass1YF.A0T(r2)     // Catch:{ JSONException -> 0x0059 }
            if (r0 != 0) goto L_0x004f
            com.whatsapp.TextEmojiLabel r1 = r3.A03     // Catch:{ JSONException -> 0x0059 }
            if (r1 == 0) goto L_0x0043
            r0 = 0
            r1.setVisibility(r0)     // Catch:{ JSONException -> 0x0059 }
        L_0x0043:
            com.whatsapp.TextEmojiLabel r1 = r3.A03     // Catch:{ JSONException -> 0x0059 }
            if (r1 == 0) goto L_0x005d
            java.lang.CharSequence r0 = r3.A1p(r2)     // Catch:{ JSONException -> 0x0059 }
            r1.setText(r0)     // Catch:{ JSONException -> 0x0059 }
            goto L_0x005d
        L_0x004f:
            com.whatsapp.TextEmojiLabel r1 = r3.A03     // Catch:{ JSONException -> 0x0059 }
            if (r1 == 0) goto L_0x005d
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ JSONException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x005d:
            com.whatsapp.TextEmojiLabel r2 = r3.A02
            if (r2 == 0) goto L_0x0074
            X.21g r1 = r3.getFMessage()
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            java.lang.String r0 = r1.A1B(r0)
            java.lang.CharSequence r0 = r3.A1p(r0)
            r2.setText(r0)
        L_0x0074:
            com.whatsapp.WaImageView r1 = r3.A04
            if (r1 == 0) goto L_0x007e
            r0 = 2131231850(0x7f08046a, float:1.8079793E38)
            r1.setImageResource(r0)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8nV.A01(X.8nV):void");
    }

    public void A1u() {
        A01(this);
        super.A1u();
    }

    public int getCenteredLayoutId() {
        return 2131624827;
    }

    public int getIncomingLayoutId() {
        return 2131624826;
    }

    public int getOutgoingLayoutId() {
        return 2131624827;
    }
}
