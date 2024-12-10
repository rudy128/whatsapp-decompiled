package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.A0M;
import X.A25;
import X.A2N;
import X.A4O;
import X.ADL;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass118;
import X.AnonymousClass11E;
import X.AnonymousClass11P;
import X.AnonymousClass122;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass1PM;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21K;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.AnonymousClass9Q5;
import X.B9G;
import X.C108945cZ;
import X.C108965cb;
import X.C170638qQ;
import X.C172048sh;
import X.C17880vN;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C185899dK;
import X.C18600wl;
import X.C193199ph;
import X.C194949sY;
import X.C195709tm;
import X.C196109uT;
import X.C198939zA;
import X.C19979A1p;
import X.C20081A6h;
import X.C20130A8q;
import X.C20253ADl;
import X.C20277AEk;
import X.C20285AEt;
import X.C20901AbH;
import X.C20905AbL;
import X.C217517g;
import X.C22521BBe;
import X.C26911Ty;
import X.C27191Vc;
import X.C30391dr;
import X.C30801eX;
import X.C42741yf;
import X.C56582hh;
import X.C60082nM;
import X.C62242r5;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class PhoenixFlowsManagerWithCoroutines {
    public int A00;
    public C20130A8q A01;
    public final C56582hh A02;
    public final C26911Ty A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass1PM A05;
    public final C27191Vc A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final C196109uT A09;
    public final C18030ve A0A;
    public final C170638qQ A0B;
    public final AnonymousClass00H A0C = C217517g.A00(32870);
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L = C217517g.A00(49488);
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AtomicBoolean A0P = C108965cb.A0w();
    public final C18600wl A0Q;
    public final AnonymousClass1OX A0R;
    public final AnonymousClass11E A0S;
    public final C18000vb A0T;
    public final C30801eX A0U;
    public final AnonymousClass122 A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final C18600wl A0Y;

    public static final void A06(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, B9G b9g, C22521BBe bBe, C193199ph r15, String str, Map map, boolean z) {
        ADL adl;
        Bitmap bitmap;
        String str2;
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines2 = phoenixFlowsManagerWithCoroutines;
        phoenixFlowsManagerWithCoroutines.A01 = phoenixFlowsManagerWithCoroutines.A02.A00(r15);
        UserJid userJid = a2n.A02;
        HashMap A11 = C17880vN.A11();
        C42741yf A012 = phoenixFlowsManagerWithCoroutines.A05.A01(userJid);
        if (!(A012 == null || (str2 = A012.A08) == null)) {
            A11.put("business_name", str2);
        }
        if (C18020vd.A05(C18040vf.A02, phoenixFlowsManagerWithCoroutines.A0A, 4078)) {
            AnonymousClass1E7 A0E2 = phoenixFlowsManagerWithCoroutines.A04.A0E(userJid);
            Context context = phoenixFlowsManagerWithCoroutines.A08.A00;
            float dimension = context.getResources().getDimension(2131168737);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166219);
            if (A0E2 != null) {
                bitmap = phoenixFlowsManagerWithCoroutines.A06.BX4(context, A0E2, "PhoenixFlowsManagerWithCoroutines.getBusinessProfileLogo", dimension, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A15 = C108945cZ.A15();
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, A15);
            }
            String encodeToString = Base64.encodeToString(A15.toByteArray(), 0);
            if (encodeToString != null) {
                A11.put("business_profile_logo", encodeToString);
            }
        }
        C20130A8q a8q = phoenixFlowsManagerWithCoroutines.A01;
        if (a8q == null) {
            C18070vi.A11("fdsManager");
            throw null;
        }
        a8q.A0F(A11);
        A04(a2n, phoenixFlowsManagerWithCoroutines, 0, !A0A(a2n.A06, a2n.A04));
        AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0J).A0B(Integer.valueOf(phoenixFlowsManagerWithCoroutines.A00), "startFlow");
        boolean z2 = z;
        if (z) {
            adl = new ADL(1000, "PHOENIX", false);
        } else {
            adl = null;
        }
        C20130A8q a8q2 = phoenixFlowsManagerWithCoroutines2.A01;
        if (a8q2 == null) {
            C18070vi.A11("fdsManager");
            throw null;
        }
        a8q2.A0C(new C20901AbH(phoenixFlowsManagerWithCoroutines2, b9g, 1), new C20905AbL(bBe, a2n, phoenixFlowsManagerWithCoroutines2, 2), adl, a2n.A05, str, a2n.A03, map, z2);
    }

    public static final boolean A0A(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            Log.w(C17900vP.A0C("SFlowsLogger/PhoenixFlowsManagerWithCoroutines/isFlowInitWithoutDataChannel()/Error - ", AnonymousClass000.A10(), e));
        }
        return false;
    }

    public final void A0B(UserJid userJid, C193199ph r11, String str, String str2, boolean z) {
        AnonymousClass3MX.A1Q(new PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1(this, userJid, r11, str, str2, (C30391dr) null, z), this.A0R);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.B9G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.A2N r26, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r27, X.C195709tm r28, X.B9G r29, X.C22521BBe r30, java.lang.String r31, X.C30391dr r32) {
        /*
            r3 = r32
            r7 = r27
            r8 = r26
            r20 = r31
            r21 = r29
            r6 = r30
            boolean r0 = r3 instanceof X.C21713Aog
            if (r0 == 0) goto L_0x0250
            r5 = r3
            X.Aog r5 = (X.C21713Aog) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0250
            int r2 = r2 - r1
            r5.label = r2
        L_0x001e:
            java.lang.Object r1 = r5.result
            X.1g4 r22 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r9 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r4) goto L_0x0073
            if (r0 != r9) goto L_0x0257
            boolean r13 = r5.Z$0
            java.lang.Object r12 = r5.L$6
            X.9ph r12 = (X.C193199ph) r12
            java.lang.Object r11 = r5.L$5
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r6 = r5.L$4
            X.BBe r6 = (X.C22521BBe) r6
            java.lang.Object r0 = r5.L$3
            r21 = r0
            r0 = r21
            X.B9G r0 = (X.B9G) r0
            r21 = r0
            java.lang.Object r0 = r5.L$2
            r20 = r0
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            java.lang.Object r8 = r5.L$1
            X.A2N r8 = (X.A2N) r8
            java.lang.Object r7 = r5.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r7 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r7
            X.C30691eM.A01(r1)
        L_0x0059:
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0241
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "UNKNOWN"
        L_0x006b:
            java.lang.String r0 = r8.A05
            A08(r7, r6, r1, r0)
        L_0x0070:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0073:
            X.C30691eM.A01(r1)
            goto L_0x0070
        L_0x0077:
            X.C30691eM.A01(r1)
            java.lang.String r0 = r8.A05
            r24 = r0
            X.00H r0 = r7.A0C
            java.lang.Object r10 = r0.get()
            X.9XH r10 = (X.AnonymousClass9XH) r10
            X.1D6[] r2 = new X.AnonymousClass1D6[r9]
            java.lang.String r1 = "chat_jid"
            com.whatsapp.jid.UserJid r0 = r8.A02
            r23 = r0
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            r11 = 0
            r2[r11] = r0
            java.lang.String r0 = "key_msg_id"
            java.lang.String r3 = r8.A08
            X.AnonymousClass1D6.A03(r0, r3, r2, r4)
            java.util.LinkedHashMap r1 = X.AnonymousClass1D7.A0B(r2)
            X.C18070vi.A0d(r1, r11)
            java.util.HashMap r0 = r10.A00
            r0.clear()
            r0.putAll(r1)
            r0 = 17
            X.1D6[] r1 = new X.AnonymousClass1D6[r0]
            java.lang.String r12 = "action"
            java.lang.String r10 = r8.A06
            java.lang.String r2 = r8.A04
            boolean r0 = A0A(r10, r2)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = "navigate"
        L_0x00bd:
            X.AnonymousClass1D6.A03(r12, r0, r1, r11)
            java.lang.String r19 = "action_payload"
            boolean r0 = A0A(r10, r2)
            if (r0 == 0) goto L_0x01e7
            java.util.Map r12 = r8.A0A
            java.lang.String r18 = "screen"
            r17 = 0
            if (r12 == 0) goto L_0x01e3
            r0 = r18
            java.lang.Object r16 = r12.get(r0)
        L_0x00d6:
            java.lang.String r14 = "data"
            if (r12 == 0) goto L_0x00de
            java.lang.Object r17 = r12.get(r14)
        L_0x00de:
            X.1D6[] r13 = new X.AnonymousClass1D6[r9]
            X.1D6[] r15 = new X.AnonymousClass1D6[r9]
            java.lang.String r0 = "name"
            r12 = r0
            r0 = r16
            X.AnonymousClass1D6.A03(r12, r0, r15, r11)
            java.lang.String r0 = "type"
            r12 = r0
            r0 = r18
            X.AnonymousClass1D6.A03(r12, r0, r15, r4)
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A0B(r15)
            java.lang.String r0 = "next"
            X.AnonymousClass1D6.A03(r0, r12, r13, r11)
            r0 = r17
            X.AnonymousClass1D6.A03(r14, r0, r13, r4)
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A0B(r13)
        L_0x0104:
            r0 = r19
            X.AnonymousClass1D6.A03(r0, r12, r1, r4)
            java.lang.String r0 = "message_id"
            X.AnonymousClass1D6.A03(r0, r3, r1, r9)
            java.lang.String r12 = "session_id"
            java.lang.String r0 = r8.A09
            r18 = r0
            X.C72463Mc.A1J(r12, r0, r1)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r12 = "wae"
            java.lang.String r0 = X.AnonymousClass001.A1H(r12, r0, r13)
            X.C18070vi.A0d(r0, r11)
            java.lang.String r12 = X.AnonymousClass8BY.A0Y(r0)
            X.C18070vi.A0X(r12)
            java.lang.String r0 = "product_qpl_session_id"
            X.AnonymousClass8BW.A1L(r0, r12, r1)
            r12 = r23
            r0 = r24
            X.A2N.A00(r8, r12, r10, r0, r1)
            java.lang.String r13 = "extension_status"
            r15 = r28
            java.lang.String r12 = r15.A00
            X.1D6 r13 = X.AnonymousClass1D6.A01(r13, r12)
            r0 = 11
            r1[r0] = r13
            X.0vb r0 = r7.A0T
            java.lang.String r13 = r0.A06()
            java.lang.String r0 = "user_locale"
            X.1D6 r13 = X.AnonymousClass1D6.A01(r0, r13)
            r0 = 12
            r1[r0] = r13
            X.1D6[] r13 = new X.AnonymousClass1D6[r9]
            java.lang.String r14 = "type"
            java.lang.String r0 = "modal"
            X.AnonymousClass1D6.A03(r14, r0, r13, r11)
            java.lang.String r11 = "modal_type"
            java.lang.String r0 = "bottom_sheet"
            X.AnonymousClass1D6.A03(r11, r0, r13, r4)
            java.util.LinkedHashMap r11 = X.AnonymousClass1D7.A0B(r13)
            java.lang.String r0 = "style"
            java.util.Map r0 = X.C108975cc.A0h(r0, r11)
            X.AnonymousClass8BY.A1V(r1, r0)
            int r0 = r15.A01
            java.lang.Integer r11 = X.AnonymousClass3MW.A0v(r0)
            java.lang.String r0 = "flow_json_version"
            X.1D6 r11 = X.AnonymousClass1D6.A01(r0, r11)
            r0 = 16
            r1[r0] = r11
            java.util.LinkedHashMap r11 = X.AnonymousClass1D7.A0B(r1)
            java.lang.String r0 = "DRAFT"
            boolean r13 = X.C18070vi.A18(r12, r0)
            r0 = r24
            X.9ph r12 = X.AnonymousClass9Q7.A00(r3, r0)
            X.00H r0 = r7.A0L
            r16 = r0
            java.lang.Object r0 = r16.get()
            X.9nm r0 = (X.C192089nm) r0
            java.lang.String r15 = r12.A00
            X.9p2 r0 = r0.A00(r15)
            if (r13 == 0) goto L_0x0202
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0202
            X.0ve r0 = r7.A0A
            r14 = r0
            r1 = 4819(0x12d3, float:6.753E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r1)
            if (r0 == 0) goto L_0x01f9
            java.lang.String r2 = r8.A03
            X.0wl r1 = r7.A0Y
            r32 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1 r0 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$startFlowInternal$2$1
            r23 = r0
            r24 = r8
            r25 = r7
            r26 = r21
            r27 = r6
            r28 = r12
            r29 = r2
            r30 = r20
            r31 = r11
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.L$0 = r2
            r5.label = r4
            java.lang.Object r1 = X.C30451dy.A00(r5, r1, r0)
            r0 = r22
            if (r1 != r0) goto L_0x0070
            return r22
        L_0x01e3:
            r16 = r17
            goto L_0x00d6
        L_0x01e7:
            java.lang.String r0 = "INIT"
            java.util.Map r12 = X.C108975cc.A0h(r12, r0)
            java.lang.String r0 = "business_payload"
            java.util.Map r12 = X.C108975cc.A0h(r0, r12)
            goto L_0x0104
        L_0x01f5:
            java.lang.String r0 = "INIT"
            goto L_0x00bd
        L_0x01f9:
            java.lang.Object r0 = r16.get()
            X.9nm r0 = (X.C192089nm) r0
            r0.A01(r15)
        L_0x0202:
            boolean r0 = A0A(r10, r2)
            if (r0 == 0) goto L_0x0241
            X.00H r0 = r7.A0E
            X.A5U r14 = X.AnonymousClass8BR.A0S(r0)
            r5.L$0 = r7
            r5.L$1 = r8
            r0 = r20
            r5.L$2 = r0
            r0 = r21
            r5.L$3 = r0
            r5.L$4 = r6
            r5.L$5 = r11
            r5.L$6 = r12
            r5.Z$0 = r13
            r5.label = r9
            X.3Dp r1 = X.C108975cc.A0k(r5)
            X.B3W r0 = new X.B3W
            r0.<init>(r1)
            r15 = r23
            r16 = r24
            r17 = r3
            r19 = r0
            r14.A06(r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.A00()
            r0 = r22
            if (r1 != r0) goto L_0x0059
            return r22
        L_0x0241:
            r0 = r8
            r1 = r7
            r2 = r21
            r3 = r6
            r4 = r12
            r5 = r20
            r6 = r11
            r7 = r13
            A06(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0070
        L_0x0250:
            X.Aog r5 = new X.Aog
            r5.<init>(r7, r3)
            goto L_0x001e
        L_0x0257:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A00(X.A2N, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines, X.9tm, X.B9G, X.BBe, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        if (r1 == r5) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0121 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.A2N r17, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r18, X.C195709tm r19, X.B9G r20, X.C22521BBe r21, X.C30391dr r22) {
        /*
            r3 = r22
            r10 = r18
            r11 = r17
            r9 = r19
            r8 = r20
            r7 = r21
            boolean r0 = r3 instanceof X.C21707Aoa
            if (r0 == 0) goto L_0x0037
            r6 = r3
            X.Aoa r6 = (X.C21707Aoa) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r6.label = r2
        L_0x001e:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r13 = 4
            r12 = 3
            r4 = 1
            r3 = 2
            if (r0 == 0) goto L_0x003d
            if (r0 == r4) goto L_0x0091
            if (r0 == r3) goto L_0x0127
            if (r0 == r12) goto L_0x0127
            if (r0 == r13) goto L_0x0127
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0037:
            X.Aoa r6 = new X.Aoa
            r6.<init>(r10, r3)
            goto L_0x001e
        L_0x003d:
            X.C30691eM.A01(r1)
            X.00H r0 = r10.A0K
            java.lang.Object r2 = r0.get()
            X.8sg r2 = (X.C172038sg) r2
            java.lang.String r1 = r11.A05
            int r0 = r1.hashCode()
            java.lang.Integer r18 = X.AnonymousClass00R.A0C
            java.lang.String r14 = r11.A08
            r16 = r14
            java.lang.String r15 = r11.A09
            boolean r14 = r11.A0B
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r14)
            com.whatsapp.jid.UserJid r14 = r11.A02
            r21 = r15
            r22 = r0
            r19 = r1
            r20 = r16
            r15 = r2
            r16 = r14
            r15.A0F(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r14 = r9.A00
            java.lang.String r2 = "DRAFT"
            boolean r2 = X.C18070vi.A18(r14, r2)
            if (r2 != 0) goto L_0x00f9
            X.00H r2 = r10.A0F
            java.lang.Object r2 = r2.get()
            X.9o2 r2 = (X.C192239o2) r2
            r6.L$0 = r10
            r6.L$1 = r11
            r6.L$2 = r9
            r6.L$3 = r8
            r6.L$4 = r7
            r6.label = r4
            java.lang.Object r1 = r2.A01(r1, r6, r0)
            if (r1 != r5) goto L_0x00a8
        L_0x0090:
            return r5
        L_0x0091:
            java.lang.Object r7 = r6.L$4
            X.BBe r7 = (X.C22521BBe) r7
            java.lang.Object r8 = r6.L$3
            X.B9G r8 = (X.B9G) r8
            java.lang.Object r9 = r6.L$2
            X.9tm r9 = (X.C195709tm) r9
            java.lang.Object r11 = r6.L$1
            X.A2N r11 = (X.A2N) r11
            java.lang.Object r10 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r10 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r10
            X.C30691eM.A01(r1)
        L_0x00a8:
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r0 = r1.first
            boolean r13 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            X.00H r0 = r10.A0G
            X.A6h r1 = X.AnonymousClass8BR.A0V(r0)
            java.lang.String r0 = r11.A05
            int r2 = r0.hashCode()
            java.lang.String r0 = "psl_cache_hit"
            r1.A07(r2, r0, r13)
            r1 = 0
            if (r13 == 0) goto L_0x00ec
            X.00H r0 = r10.A0K
            X.A6h r0 = X.AnonymousClass8BR.A0V(r0)
            r0.A08(r2, r3)
            if (r4 == 0) goto L_0x0122
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.L$3 = r1
            r6.L$4 = r1
            r6.label = r3
            r13 = r9
            r14 = r8
            r15 = r7
            r16 = r4
            r17 = r6
            r12 = r10
            java.lang.Object r0 = A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x011f
        L_0x00ec:
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.L$3 = r1
            r6.L$4 = r1
            r6.label = r12
            goto L_0x0107
        L_0x00f9:
            X.00H r1 = r10.A0G
            X.A6h r3 = X.AnonymousClass8BR.A0V(r1)
            r2 = 0
            java.lang.String r1 = "psl_cache_hit"
            r3.A07(r0, r1, r2)
            r6.label = r13
        L_0x0107:
            X.0wl r0 = r10.A0Q
            r18 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2 r12 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2
            r15 = r9
            r16 = r8
            r17 = r7
            r13 = r11
            r14 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = X.C30451dy.A00(r6, r0, r12)
            if (r0 == r5) goto L_0x0090
            X.1Wu r0 = X.C27621Wu.A00
        L_0x011f:
            if (r0 != r5) goto L_0x012a
            return r5
        L_0x0122:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x0127:
            X.C30691eM.A01(r1)
        L_0x012a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A01(X.A2N, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines, X.9tm, X.B9G, X.BBe, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.A2N r12, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r13, X.B9G r14, X.C22521BBe r15, X.C30391dr r16, int r17) {
        /*
            r9 = r16
            r5 = r13
            r6 = r12
            r4 = r14
            r3 = r15
            r7 = r17
            boolean r0 = r9 instanceof X.C21706AoZ
            if (r0 == 0) goto L_0x00d3
            r2 = r9
            X.AoZ r2 = (X.C21706AoZ) r2
            int r8 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r1
            if (r0 == 0) goto L_0x00d3
            int r8 = r8 - r1
            r2.label = r8
        L_0x001a:
            java.lang.Object r12 = r2.result
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            int r8 = r2.label
            r0 = 2
            r9 = 1
            if (r8 == 0) goto L_0x002e
            if (r8 == r9) goto L_0x0061
            if (r8 != r0) goto L_0x00da
            X.C30691eM.A01(r12)
        L_0x002b:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x002e:
            X.C30691eM.A01(r12)
            java.lang.String r13 = r6.A05
            X.00H r8 = r5.A0E
            X.A5U r10 = X.AnonymousClass8BR.A0S(r8)
            java.lang.Integer r12 = X.AnonymousClass3MW.A0v(r7)
            com.whatsapp.jid.UserJid r11 = r6.A02
            java.lang.String r14 = r6.A08
            java.lang.String r15 = r6.A09
            r2.L$0 = r5
            r2.L$1 = r6
            r2.L$2 = r4
            r2.L$3 = r3
            r2.I$0 = r7
            r2.label = r9
            r17 = 0
            X.0wl r8 = r10.A06
            r16 = 0
            com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r9 = new com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r12 = X.C30451dy.A00(r2, r8, r9)
            if (r12 != r1) goto L_0x0076
            return r1
        L_0x0061:
            int r7 = r2.I$0
            java.lang.Object r3 = r2.L$3
            X.BBe r3 = (X.C22521BBe) r3
            java.lang.Object r4 = r2.L$2
            X.B9G r4 = (X.B9G) r4
            java.lang.Object r6 = r2.L$1
            X.A2N r6 = (X.A2N) r6
            java.lang.Object r5 = r2.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r5 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r5
            X.C30691eM.A01(r12)
        L_0x0076:
            X.9sY r12 = (X.C194949sY) r12
            A05(r6, r5, r12, r7)
            X.9dK r11 = r12.A00
            r10 = 0
            if (r11 == 0) goto L_0x00c6
            java.util.List r7 = r11.A02
            java.util.Iterator r12 = r7.iterator()
        L_0x0086:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x00c1
            java.lang.Object r9 = r12.next()
            r7 = r9
            X.9tm r7 = (X.C195709tm) r7
            java.lang.String r8 = r7.A04
            java.lang.String r7 = r6.A05
            boolean r7 = X.C18070vi.A18(r8, r7)
            if (r7 == 0) goto L_0x0086
        L_0x009d:
            X.9tm r9 = (X.C195709tm) r9
            if (r9 == 0) goto L_0x00c3
            java.lang.String r7 = r9.A03
            r6.A00 = r7
            boolean r7 = A09(r6, r5, r9, r11, r3)
            if (r7 != 0) goto L_0x002b
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.label = r0
            r10 = r3
            r11 = r2
            r7 = r5
            r8 = r9
            r9 = r4
            java.lang.Object r0 = A01(r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L_0x002b
            return r1
        L_0x00c1:
            r9 = r10
            goto L_0x009d
        L_0x00c3:
            java.lang.String r1 = "extensions-invalid-extensions-id"
            goto L_0x00cc
        L_0x00c6:
            java.lang.String r1 = r12.A02
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = "failure"
        L_0x00cc:
            java.lang.String r0 = r6.A05
            A08(r5, r3, r1, r0)
            goto L_0x002b
        L_0x00d3:
            X.AoZ r2 = new X.AoZ
            r2.<init>(r13, r9)
            goto L_0x001a
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A02(X.A2N, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines, X.B9G, X.BBe, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.A2N r16, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r17, X.B9G r18, X.C22521BBe r19, X.C30391dr r20, int r21) {
        /*
            r5 = r20
            r2 = r17
            r1 = r16
            r9 = r18
            r7 = r19
            r8 = r21
            boolean r0 = r5 instanceof X.C21708Aob
            if (r0 == 0) goto L_0x013b
            r6 = r5
            X.Aob r6 = (X.C21708Aob) r6
            int r4 = r6.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x013b
            int r4 = r4 - r3
            r6.label = r4
        L_0x001e:
            java.lang.Object r12 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r11 = r6.label
            r10 = 3
            r4 = 2
            r0 = 1
            r3 = 0
            if (r11 == 0) goto L_0x0036
            if (r11 == r0) goto L_0x006f
            if (r11 == r4) goto L_0x00d0
            if (r11 != r10) goto L_0x0142
            X.C30691eM.A01(r12)
        L_0x0033:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0036:
            X.C30691eM.A01(r12)
            java.lang.String r12 = r1.A05
            X.00H r10 = r2.A0E
            X.A5U r14 = X.AnonymousClass8BR.A0S(r10)
            java.lang.Integer r16 = X.AnonymousClass3MW.A0v(r8)
            com.whatsapp.jid.UserJid r15 = r1.A02
            java.lang.String r11 = r1.A08
            java.lang.String r10 = r1.A09
            r6.L$0 = r2
            r6.L$1 = r1
            r6.L$2 = r9
            r6.L$3 = r7
            r6.I$0 = r8
            r6.label = r0
            r21 = 0
            X.0wl r0 = r14.A06
            r20 = 0
            com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2 r13 = new com.whatsapp.flows.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2
            r19 = r10
            r18 = r11
            r17 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r12 = X.C30451dy.A00(r6, r0, r13)
            if (r12 != r5) goto L_0x0084
            return r5
        L_0x006f:
            int r8 = r6.I$0
            java.lang.Object r7 = r6.L$3
            X.BBe r7 = (X.C22521BBe) r7
            java.lang.Object r9 = r6.L$2
            X.B9G r9 = (X.B9G) r9
            java.lang.Object r1 = r6.L$1
            X.A2N r1 = (X.A2N) r1
            java.lang.Object r2 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r2 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r2
            X.C30691eM.A01(r12)
        L_0x0084:
            X.9sY r12 = (X.C194949sY) r12
            A05(r1, r2, r12, r8)
            X.9dK r11 = r12.A00
            if (r11 == 0) goto L_0x00f1
            java.util.List r0 = r11.A02
            java.util.Iterator r13 = r0.iterator()
        L_0x0093:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r10 = r13.next()
            r0 = r10
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r8 = r0.A04
            java.lang.String r0 = r1.A05
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x0093
        L_0x00aa:
            X.9tm r10 = (X.C195709tm) r10
            if (r10 == 0) goto L_0x00f1
            java.lang.String r0 = r10.A03
            r1.A00 = r0
            boolean r0 = A09(r1, r2, r10, r11, r7)
            if (r0 != 0) goto L_0x0033
            r6.L$0 = r2
            r6.L$1 = r1
            r6.L$2 = r3
            r6.L$3 = r3
            r6.label = r4
            r11 = r9
            r12 = r7
            r13 = r6
            r8 = r1
            r9 = r2
            java.lang.Object r0 = A01(r8, r9, r10, r11, r12, r13)
            if (r0 != r5) goto L_0x00db
            return r5
        L_0x00ce:
            r10 = r3
            goto L_0x00aa
        L_0x00d0:
            java.lang.Object r1 = r6.L$1
            X.A2N r1 = (X.A2N) r1
            java.lang.Object r2 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r2 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r2
            X.C30691eM.A01(r12)
        L_0x00db:
            r6.L$0 = r3
            r6.L$1 = r3
            r0 = 3
            r6.label = r0
            X.0wl r4 = r2.A0Q
            r3 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 r0 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2
            r0.<init>(r1, r2, r3)
            java.lang.Object r0 = X.C30451dy.A00(r6, r4, r0)
            if (r0 != r5) goto L_0x0033
            return r5
        L_0x00f1:
            java.lang.String r12 = r12.A02
            if (r12 != 0) goto L_0x00f7
            java.lang.String r12 = "failure"
        L_0x00f7:
            if (r11 == 0) goto L_0x0110
            java.lang.String r12 = "extensions-invalid-extensions-id"
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x0110
            X.9uT r8 = r2.A09
            com.whatsapp.jid.UserJid r0 = r1.A02
            java.lang.String r6 = r0.user
            java.lang.String r5 = r1.A05
            X.11P r0 = r2.A07
            long r3 = X.AnonymousClass11P.A01(r0)
            r8.A04(r3, r6, r5)
        L_0x0110:
            java.lang.String r9 = r1.A05
            A08(r2, r7, r12, r9)
            X.00H r0 = r2.A0D
            java.lang.Object r3 = r0.get()
            X.A25 r3 = (X.A25) r3
            com.whatsapp.jid.UserJid r6 = r1.A02
            java.lang.String r10 = r1.A08
            java.lang.String r11 = r1.A09
            X.1PM r4 = r2.A05
            X.00H r0 = r2.A0O
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.A0M r5 = (X.A0M) r5
            boolean r0 = r1.A0C
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.String r8 = "galaxy_message"
            r13 = 0
            r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0033
        L_0x013b:
            X.Aob r6 = new X.Aob
            r6.<init>(r2, r5)
            goto L_0x001e
        L_0x0142:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A03(X.A2N, com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines, X.B9G, X.BBe, X.1dr, int):java.lang.Object");
    }

    public static final void A04(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, int i, boolean z) {
        int A002;
        String str;
        A2N a2n2 = a2n;
        UserJid userJid = a2n.A02;
        String str2 = a2n.A08;
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines2 = phoenixFlowsManagerWithCoroutines;
        AnonymousClass206 A022 = AnonymousClass8BR.A0N(phoenixFlowsManagerWithCoroutines2.A0X).A02(AnonymousClass205.A01(userJid, str2, false));
        JSONObject A15 = C17880vN.A15();
        String A012 = A4O.A00.A01(phoenixFlowsManagerWithCoroutines2.A09, str2, false);
        String A0Y2 = AnonymousClass8BY.A0Y(a2n2.A09);
        C18070vi.A0X(A0Y2);
        try {
            A15.put("cta", "galaxy_message");
            A15.put("flow_id", a2n2.A05);
            A15.put("extensions_message_id", A012);
            A15.put("session_id", A0Y2);
            A15.put("data_channel_navigation", z);
            A15.put("extension_restored_from_cache", a2n2.A0C ? 1 : 0);
        } catch (JSONException e) {
            Log.w(C17900vP.A0C("SFlowsLogger/PhoenixFlowsManagerWithCoroutines/reportWamEvent()/Error - ", AnonymousClass000.A10(), e));
        }
        int A003 = AnonymousClass9Q5.A00(phoenixFlowsManagerWithCoroutines2.A05.A01(userJid));
        C60082nM A032 = phoenixFlowsManagerWithCoroutines2.A0U.A03(userJid);
        if (A022 == null) {
            A002 = 1;
        } else {
            A002 = C62242r5.A00(A022, phoenixFlowsManagerWithCoroutines2.A0H);
        }
        A0M a0m = (A0M) phoenixFlowsManagerWithCoroutines2.A0O.get();
        String A0H2 = C18070vi.A0H(A15);
        Integer valueOf = Integer.valueOf(A003);
        String str3 = null;
        if (A032 != null) {
            str3 = A032.A08;
            str = A032.A05;
        } else {
            str = null;
        }
        a0m.A01(userJid, A022, valueOf, A0H2, str3, str, str2, i);
        HashMap A11 = C17880vN.A11();
        A11.put("business_jid", userJid.user);
        A11.put("ext_session_id", A0Y2);
        A11.put("ext_message_id", A012);
        A11.put("biz_platform", valueOf);
        A11.put("message_media_type", Integer.valueOf(A002));
        C20130A8q a8q = phoenixFlowsManagerWithCoroutines2.A01;
        if (a8q == null) {
            C18070vi.A11("fdsManager");
            throw null;
        } else {
            a8q.A0F(A11);
        }
    }

    public static void A05(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C194949sY r5, int i) {
        if (r5.A03) {
            ((C20081A6h) phoenixFlowsManagerWithCoroutines.A0G.get()).A0A(new Integer(a2n.A05.hashCode()));
            ((C20081A6h) phoenixFlowsManagerWithCoroutines.A0J.get()).A0A(new Integer(phoenixFlowsManagerWithCoroutines.A00));
            return;
        }
        ((C172048sh) phoenixFlowsManagerWithCoroutines.A0I.get()).A0G(new Integer(i), r5.A01);
    }

    public static final void A07(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, boolean z) {
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        AnonymousClass206 A022 = AnonymousClass8BR.A0N(phoenixFlowsManagerWithCoroutines.A0X).A02(AnonymousClass205.A01(a2n.A02, a2n.A08, false));
        Object obj = null;
        if ((A022 instanceof AnonymousClass21K) && (r0 = (AnonymousClass21K) A022) != null && (BPK = r0.BPK()) != null && BPK.A00 == 5 && (aEk = BPK.A06) != null) {
            Iterator it = aEk.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AnonymousClass8BW.A1U(next, "galaxy_message")) {
                    obj = next;
                    break;
                }
            }
            C20253ADl aDl = (C20253ADl) obj;
            if (aDl != null) {
                aDl.A00 = z;
            }
            phoenixFlowsManagerWithCoroutines.A0V.CQw(A022);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r7, X.C22521BBe r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r4 = "extensions-features-disabled"
            boolean r0 = r9.equals(r4)
            X.00H r3 = r7.A0J
            if (r0 == 0) goto L_0x0077
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            int r0 = r7.A00
            X.C20081A6h.A01(r1, r0)
            X.00H r5 = r7.A0G
            X.A6h r1 = X.AnonymousClass8BR.A0V(r5)
            int r0 = r10.hashCode()
            X.C20081A6h.A01(r1, r0)
        L_0x0020:
            X.118 r1 = r7.A08
            r0 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.String r6 = X.C18070vi.A0G(r1, r0)
            X.11E r0 = r7.A0S
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x005d
            r0 = 2131890447(0x7f12110f, float:1.9415586E38)
        L_0x0034:
            java.lang.String r6 = X.C18070vi.A0G(r1, r0)
        L_0x0038:
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = "error"
            X.A1m r0 = X.C19976A1m.A00(r6)
            java.util.Map r3 = X.C108975cc.A0h(r1, r0)
            r0 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "ExtensionError"
            X.A1q r0 = new X.A1q
            r0.<init>(r2, r1, r6)
            r8.Btu(r0, r3)
        L_0x0053:
            X.A6h r0 = X.AnonymousClass8BR.A0V(r5)
            X.19T r0 = r0.A04
            r0.CGw()
            return
        L_0x005d:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0073:
            r0 = 2131890453(0x7f121115, float:1.9415598E38)
            goto L_0x0034
        L_0x0077:
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            int r1 = r7.A00
            java.lang.String r0 = "error_message"
            r2.A06(r1, r0, r9)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            int r0 = r7.A00
            r3 = 3
            r1.A08(r0, r3)
            X.00H r5 = r7.A0G
            X.8si r2 = X.AnonymousClass8BR.A0T(r5)
            int r1 = r10.hashCode()
            r0 = 0
            r2.A0E(r1, r9, r0)
            X.8si r0 = X.AnonymousClass8BR.A0T(r5)
            r0.A0F(r1, r3)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A08(com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines, X.BBe, java.lang.String, java.lang.String):void");
    }

    public static final boolean A09(A2N a2n, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C195709tm r14, C185899dK r15, C22521BBe bBe) {
        C19979A1p a1p;
        String str;
        C198939zA r2 = (C198939zA) phoenixFlowsManagerWithCoroutines.A0W.get();
        if (r15 != null) {
            a1p = r15.A01;
        } else {
            a1p = null;
        }
        Integer A012 = r2.A01(r14, a1p, a2n.A06);
        if (A012.intValue() == 0) {
            return false;
        }
        if (A012 == AnonymousClass00R.A0C) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = a2n.A05;
        A08(phoenixFlowsManagerWithCoroutines, bBe, str, str2);
        ((A25) phoenixFlowsManagerWithCoroutines.A0D.get()).A03(phoenixFlowsManagerWithCoroutines.A05, (A0M) C18070vi.A0E(phoenixFlowsManagerWithCoroutines.A0O), a2n.A02, Boolean.valueOf(a2n.A0C), "galaxy_message", str2, a2n.A08, a2n.A09, str, (String) null);
        return true;
    }

    public PhoenixFlowsManagerWithCoroutines(C56582hh r33, C26911Ty r34, AnonymousClass11E r35, AnonymousClass1M9 r36, AnonymousClass1PM r37, C27191Vc r38, AnonymousClass11P r39, AnonymousClass118 r40, C196109uT r41, C18000vb r42, C30801eX r43, AnonymousClass122 r44, C18030ve r45, C170638qQ r46, AnonymousClass00H r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55, AnonymousClass00H r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, C18600wl r60, C18600wl r61, AnonymousClass1OX r62) {
        AnonymousClass00H r18 = r47;
        C56582hh r31 = r33;
        AnonymousClass11P r25 = r39;
        AnonymousClass118 r24 = r40;
        C18030ve r15 = r45;
        C18070vi.A0w(r25, r15, r24, r31, r18);
        AnonymousClass00H r16 = r49;
        AnonymousClass00H r17 = r48;
        AnonymousClass00H r14 = r50;
        AnonymousClass1PM r27 = r37;
        AnonymousClass122 r20 = r44;
        C18070vi.A0x(r20, r17, r16, r14, r27);
        AnonymousClass00H r13 = r51;
        AnonymousClass00H r12 = r52;
        AnonymousClass00H r11 = r53;
        C26911Ty r30 = r34;
        AnonymousClass11E r29 = r35;
        C18070vi.A0y(r30, r13, r29, r12, r11);
        C170638qQ r19 = r46;
        AnonymousClass00H r10 = r54;
        C196109uT r23 = r41;
        C18000vb r22 = r42;
        C18070vi.A0t(r19, r23, r10, r22);
        AnonymousClass00H r8 = r56;
        AnonymousClass00H r9 = r55;
        AnonymousClass1M9 r28 = r36;
        C27191Vc r26 = r38;
        C18070vi.A0u(r9, r8, r26, r28);
        AnonymousClass00H r6 = r58;
        AnonymousClass00H r7 = r57;
        C18600wl r4 = r60;
        AnonymousClass00H r5 = r59;
        C18070vi.A0v(r7, r6, r5, r4);
        C18600wl r3 = r61;
        C18070vi.A0d(r3, 28);
        AnonymousClass1OX r2 = r62;
        C18070vi.A0d(r2, 29);
        C30801eX r21 = r43;
        C18070vi.A0d(r21, 30);
        this.A07 = r25;
        this.A0A = r15;
        this.A08 = r24;
        this.A02 = r31;
        this.A0N = r18;
        this.A0V = r20;
        this.A0D = r17;
        this.A0M = r16;
        this.A0X = r14;
        this.A05 = r27;
        this.A03 = r30;
        this.A0E = r13;
        this.A0S = r29;
        this.A0F = r12;
        this.A0J = r11;
        this.A0B = r19;
        this.A09 = r23;
        this.A0O = r10;
        this.A0T = r22;
        this.A0I = r9;
        this.A0G = r8;
        this.A06 = r26;
        this.A04 = r28;
        this.A0H = r7;
        this.A0K = r6;
        this.A0W = r5;
        this.A0Q = r4;
        this.A0Y = r3;
        this.A0R = r2;
        this.A0U = r21;
    }
}
