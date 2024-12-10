package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.8ny  reason: invalid class name and case insensitive filesystem */
public final class C170018ny extends AnonymousClass8nz {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;

    public static final void A02(C170018ny r6, UserJid userJid, C193199ph r8, String str, String str2) {
        UserJid userJid2 = userJid;
        C193199ph r2 = r8;
        String str3 = str;
        String str4 = str2;
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r6.A00), 5764)) {
            ((PhoenixFlowsManagerWithCoroutines) r6.A0E.get()).A0B(userJid2, r2, str3, str4, false);
        } else {
            ((C20119A8c) r6.A0D.get()).A08(userJid2, r2, str3, str4, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.9tm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r3 = 0
            r7 = 1
            X.00H r4 = r8.A00
            X.0vd r2 = X.C17880vN.A0P(r4)
            r1 = 5936(0x1730, float:8.318E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0065
            long r5 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x0057 }
            r1 = 3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            X.00H r0 = r8.A06
            X.A5U r0 = X.AnonymousClass8BR.A0S(r0)
            r3 = 0
            X.9dK r0 = r0.A03(r3, r10)
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 == 0) goto L_0x002f
            r3 = r1
        L_0x0045:
            X.9tm r3 = (X.C195709tm) r3
            if (r3 == 0) goto L_0x0056
            java.lang.Object r0 = X.C18070vi.A0E(r4)
            X.0ve r0 = (X.C18030ve) r0
            boolean r0 = X.A4O.A00(r0, r3)
            r0 = r0 ^ 1
            return r0
        L_0x0056:
            return r7
        L_0x0057:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsV2Action/openWebPoweredFlow/Error - "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0065:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170018ny.A0I(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00da, code lost:
        if (r7.A00() == null) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r27, X.C170018ny r28, com.whatsapp.jid.UserJid r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.Map r35, long r36) {
        /*
            r2 = r28
            X.00H r0 = r2.A0S
            android.content.Intent r0 = X.AnonymousClass3MZ.A06(r0)
            r5 = r27
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r1 = "com.whatsapp.flows.phoenix.PhoenixFlowsBottomSheetActivity"
            r0.setClassName(r3, r1)
            java.lang.String r3 = "fds_observer_id"
            r1 = r34
            r0.putExtra(r3, r1)
            java.lang.String r3 = "extra_business_jid"
            r11 = r29
            X.AnonymousClass3MY.A12(r0, r11, r3)
            r3 = 603979776(0x24000000, float:2.7755576E-17)
            r0.setFlags(r3)
            java.lang.String r16 = r11.getRawString()
            r28 = 0
            r15 = r32
            r4 = r35
            r20 = r36
            r12 = r2
            r13 = r0
            r14 = r28
            r17 = r4
            r18 = r20
            r12.A01(r13, r14, r15, r16, r17, r18)
            X.00H r3 = r2.A09
            java.lang.Object r6 = X.C18070vi.A0E(r3)
            X.8si r6 = (X.C172058si) r6
            java.lang.String r27 = "message_cta"
            r3 = 0
            r13 = r30
            r16 = r33
            r22 = r6
            r23 = r11
            r24 = r13
            r25 = r15
            r26 = r16
            r29 = r3
            r22.A0G(r23, r24, r25, r26, r27, r28, r29)
            r5.startActivity(r0)
            X.00H r10 = r2.A0I
            X.A2X r6 = X.C108985cd.A0c(r10, r1)
            java.lang.String r7 = "mode"
            java.lang.Object r8 = r4.get(r7)
            java.lang.String r7 = "draft"
            boolean r23 = X.C18070vi.A18(r8, r7)
            X.A2X r9 = X.C108985cd.A0c(r10, r1)
            java.lang.Class<X.Aed> r8 = X.C21109Aed.class
            X.AeM r7 = new X.AeM
            r24 = r7
            r25 = r2
            r26 = r11
            r27 = r13
            r28 = r15
            r29 = r16
            r30 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r9.A01(r7, r8, r2)
            X.A2X r9 = X.C108985cd.A0c(r10, r1)
            java.lang.Class<X.Aea> r8 = X.C21106Aea.class
            r30 = 1
            X.AeM r7 = new X.AeM
            r24 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r9.A01(r7, r8, r2)
            java.lang.Object r7 = r10.get()
            X.A2V r7 = (X.A2V) r7
            X.A2X r9 = r7.A00()
            java.lang.Class<X.Aec> r8 = X.C21108Aec.class
            X.AeI r7 = new X.AeI
            r7.<init>(r2, r13)
            r9.A01(r7, r8, r2)
            java.lang.String r7 = "flow_token"
            java.lang.String r14 = X.AnonymousClass8BW.A0g(r7, r4)
            X.00H r7 = r2.A0E
            java.lang.Object r7 = r7.get()
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r7 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r7
            X.9ph r9 = X.AnonymousClass9Q7.A00(r15, r13)
            X.00H r7 = r7.A0L
            java.lang.Object r8 = r7.get()
            X.9nm r8 = (X.C192089nm) r8
            java.lang.String r7 = r9.A00
            X.9p2 r7 = r8.A00(r7)
            if (r7 == 0) goto L_0x00dc
            java.lang.String r7 = r7.A00()
            r22 = 1
            if (r7 != 0) goto L_0x00de
        L_0x00dc:
            r22 = 0
        L_0x00de:
            java.lang.String r7 = "flow_action"
            java.lang.String r18 = X.AnonymousClass8BW.A0f(r7, r4)
            java.lang.String r7 = "flow_action_payload"
            java.util.Map r19 = X.AnonymousClass8BW.A0v(r7, r4)
            X.A2N r10 = new X.A2N
            r12 = r31
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23)
            X.AbL r1 = new X.AbL
            r1.<init>(r5, r0, r2, r3)
            X.AwU r4 = new X.AwU
            r4.<init>(r1, r2, r10)
            java.lang.Class<X.AeT> r1 = X.C21099AeT.class
            X.AeH r0 = new X.AeH
            r0.<init>(r4, r3)
            r6.A01(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170018ny.A00(android.app.Activity, X.8ny, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):void");
    }

    private final void A01(Intent intent, AnonymousClass5XY r6, String str, String str2, Map map, long j) {
        int i;
        Object obj = map.get("flow_id");
        if (obj != null) {
            intent.putExtra("chat_id", str2);
            intent.putExtra("message_id", str);
            intent.putExtra("action_name", "galaxy_message");
            intent.putExtra("message_row_id", j);
            intent.putExtra("user_locale", ((C18000vb) this.A0Q.get()).A06());
            intent.putExtra("flow_id", (String) obj);
            intent.putExtra("flow_token", C17880vN.A0s("flow_token", map));
            intent.putExtra("flow_message_version", C17880vN.A0s("flow_message_version", map));
            if (r6 instanceof C94854lI) {
                Integer num = ((C94854lI) r6).A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                intent.putExtra("message_card_index", i);
                return;
            }
            return;
        }
        throw C17880vN.A0g();
    }

    public void A0H(Activity activity, AnonymousClass5XY r34, Jid jid, C20271AEe aEe, String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        Map map;
        Activity activity2 = activity;
        String str6 = str2;
        String str7 = str6;
        AnonymousClass3Ma.A1O(activity2, 0, str7);
        AnonymousClass5XY r22 = r34;
        Jid jid2 = jid;
        C20271AEe aEe2 = aEe;
        String str8 = str;
        long j2 = j;
        super.A0H(activity2, r22, jid2, aEe2, str8, str7, j2);
        if (Build.VERSION.SDK_INT == 26) {
            new C190009kE().A00(activity2);
        }
        InputMethodManager A0N2 = ((AnonymousClass11C) this.A0G.get()).A0N();
        View currentFocus = activity2.getCurrentFocus();
        if (!(currentFocus == null || A0N2 == null)) {
            A0N2.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        Activity A002 = C18050vg.A00(activity2);
        HashMap A012 = A3M.A01(aEe2.A00);
        if (A002 != null && A012.containsKey("flow_id") && A012.containsKey("flow_token") && A012.containsKey("flow_cta")) {
            if (new C41661wr("\\d+").A03(String.valueOf(A012.get("flow_id")))) {
                AnonymousClass3MX.A0x(this.A0L).CGF(new C146487Ph(this, j2, 10));
                UserJid A003 = C22941Dw.A00(jid2);
                if (A003 == null) {
                    Log.e("FlowsLogger/FlowsV2Action/execute() - cannot launch flow without business jid");
                    return;
                }
                String A004 = AnonymousClass9Q6.A00(A012);
                String A1G = C108945cZ.A1G("flow_id", A012);
                String A0f = C108985cd.A0f();
                ((C192229o1) this.A05.get()).A01(A003);
                A2X A0c = C108985cd.A0c(this.A0I, A0f);
                if (A004 == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                } else if (A1G != null) {
                    if (A0I(A004, A1G)) {
                        try {
                            boolean A18 = C18070vi.A18(A012.get("mode"), "draft");
                            String str9 = aEe2.A00;
                            if (str9 == null) {
                                str9 = "";
                            }
                            C17880vN.A16(str9).put("business_jid", A003.user);
                            Intent A062 = AnonymousClass3MZ.A06(this.A0S);
                            A062.setClassName(A002.getPackageName(), "com.whatsapp.flows.webview.WaFlowsWebViewBottomsheetModalActivity");
                            String str10 = str8;
                            A01(A062, r22, str10, A003.getRawString(), A012, j2);
                            AnonymousClass00H r15 = this.A09;
                            ((C172058si) C18070vi.A0E(r15)).A0G(A003, A1G, str10, str6, "message_cta", "web", false);
                            A062.putExtra("flow_message_version", A004);
                            A062.putExtra("session_id", str6);
                            A062.putExtra("is_draft", A18);
                            Object obj = A012.get("flow_action");
                            if (obj instanceof String) {
                                str3 = (String) obj;
                            } else {
                                str3 = null;
                            }
                            A062.putExtra("flow_action", str3);
                            A062.putExtra("business_jid", A003.user);
                            A062.putExtra("observer_id", A0f);
                            Object obj2 = A012.get("flow_action_payload");
                            if (!(obj2 instanceof Map) || (map = (Map) obj2) == null) {
                                str4 = null;
                            } else {
                                str4 = AnonymousClass8BU.A0s(map);
                            }
                            A062.putExtra("flow_action_payload", str4);
                            Object obj3 = A012.get("flow_cta");
                            if (obj3 instanceof String) {
                                str5 = (String) obj3;
                            } else {
                                str5 = null;
                            }
                            A062.putExtra("flow_cta", str5);
                            A062.getExtras();
                            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A00), 8418)) {
                                AnonymousClass8BR.A0V(r15).A0B(Integer.valueOf(A1G.hashCode()), "native_screen_start");
                            }
                            activity2.startActivity(A062);
                        } catch (JSONException e) {
                            Log.e(C17900vP.A0C("FlowsLogger/FlowsV2Action/execute() - Error during json payload parsing: ", AnonymousClass000.A10(), e), e);
                        }
                        A0c.A01(new C21093AeN(activity2, this, A003, A1G, A004, str8, str6, A0f, A012, j2), AnonymousClass7NJ.class, this);
                    } else {
                        A00(activity2, this, A003, A1G, A004, str8, str6, A0f, A012, j2);
                    }
                    A0c.A01(new C21090AeK(this, A0c, A0f), C21095AeP.class, this);
                } else {
                    throw AnonymousClass000.A0k("Required value was null.");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170018ny(X.AnonymousClass00H r32, X.AnonymousClass00H r33, X.AnonymousClass00H r34, X.AnonymousClass00H r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38, X.AnonymousClass00H r39, X.AnonymousClass00H r40, X.AnonymousClass00H r41, X.AnonymousClass00H r42, X.AnonymousClass00H r43, X.AnonymousClass00H r44, X.AnonymousClass00H r45, X.AnonymousClass00H r46, X.AnonymousClass00H r47, X.AnonymousClass00H r48, X.AnonymousClass00H r49, X.AnonymousClass00H r50, X.AnonymousClass00H r51, X.AnonymousClass00H r52, X.AnonymousClass00H r53, X.AnonymousClass00H r54, X.AnonymousClass00H r55, X.AnonymousClass00H r56, X.AnonymousClass00H r57, X.AnonymousClass00H r58, X.AnonymousClass00H r59, X.AnonymousClass00H r60) {
        /*
            r31 = this;
            r30 = r32
            r29 = r33
            r28 = r34
            r27 = r35
            r26 = r36
            r4 = r30
            r3 = r29
            r2 = r28
            r1 = r27
            r0 = r26
            X.C18070vi.A0w(r4, r3, r2, r1, r0)
            r25 = r37
            r15 = r38
            r24 = r39
            r23 = r40
            r22 = r41
            r3 = r25
            r2 = r24
            r1 = r23
            r0 = r22
            X.C18070vi.A0x(r3, r15, r2, r1, r0)
            r17 = r46
            r19 = r44
            r18 = r45
            r21 = r42
            r20 = r43
            r4 = r21
            r3 = r20
            r2 = r19
            r1 = r18
            r0 = r17
            X.C18070vi.A0y(r4, r3, r2, r1, r0)
            r16 = r47
            r13 = r48
            r12 = r49
            r11 = r50
            r0 = r16
            X.C18070vi.A0t(r0, r13, r12, r11)
            r14 = r51
            r10 = r52
            r9 = r53
            r8 = r54
            X.C18070vi.A0u(r14, r10, r9, r8)
            r4 = r58
            r5 = r57
            r7 = r55
            r6 = r56
            X.C18070vi.A0v(r7, r6, r5, r4)
            r0 = 28
            r3 = r59
            X.C18070vi.A0d(r3, r0)
            r0 = 29
            r2 = r60
            X.C18070vi.A0d(r2, r0)
            r1 = r31
            r1.<init>(r15)
            r0 = r30
            r1.A0Q = r0
            r0 = r29
            r1.A00 = r0
            r0 = r28
            r1.A0P = r0
            r0 = r27
            r1.A0G = r0
            r0 = r26
            r1.A0I = r0
            r0 = r25
            r1.A0J = r0
            r1.A0R = r15
            r0 = r24
            r1.A0D = r0
            r0 = r23
            r1.A0E = r0
            r0 = r22
            r1.A0O = r0
            r0 = r21
            r1.A09 = r0
            r0 = r20
            r1.A06 = r0
            r0 = r19
            r1.A0C = r0
            r0 = r18
            r1.A03 = r0
            r0 = r17
            r1.A05 = r0
            r0 = r16
            r1.A01 = r0
            r1.A04 = r13
            r1.A0S = r12
            r1.A0K = r11
            r1.A0N = r14
            r1.A0A = r10
            r1.A07 = r9
            r1.A08 = r8
            r1.A0F = r7
            r1.A0B = r6
            r1.A0L = r5
            r1.A0H = r4
            r1.A02 = r3
            r1.A0M = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170018ny.<init>(X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H):void");
    }
}
