package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.AbL  reason: case insensitive filesystem */
public class C20905AbL implements C22521BBe {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20905AbL(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r6.containsKey("error") == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Btu(X.C19980A1q r5, java.util.Map r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x00c6;
                case 2: goto L_0x007e;
                case 3: goto L_0x006e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A03
            X.Af0 r1 = (X.C21132Af0) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r1.A0B(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsV2Action/execute()/onFailure() - Flow terminated with failure. Error present: "
            r2.append(r0)
            if (r6 == 0) goto L_0x0025
            java.lang.String r0 = "error"
            boolean r1 = r6.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            X.C17900vP.A0r(r2, r0)
            java.lang.Object r0 = r4.A03
            X.8ny r0 = (X.C170018ny) r0
            X.00H r0 = r0.A0O
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.A2M r2 = (X.A2M) r2
            java.lang.String r1 = "flow_error"
            r0 = 0
            r2.A03(r1, r0, r0)
            if (r6 == 0) goto L_0x006c
            java.lang.String r0 = "error"
            java.lang.Object r0 = r6.get(r0)
        L_0x0043:
            boolean r0 = r0 instanceof X.C19976A1m
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "error"
            java.lang.Object r3 = r6.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.phoenix.api.error.FdsError"
            X.C18070vi.A0z(r3, r0)
            X.A1m r3 = (X.C19976A1m) r3
            java.lang.Object r0 = r4.A02
            android.content.Intent r0 = (android.content.Intent) r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = "extra_error_message"
            java.lang.String r0 = r3.A01
            r2.putExtra(r1, r0)
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            r0.startActivity(r2)
            return
        L_0x006c:
            r0 = 0
            goto L_0x0043
        L_0x006e:
            java.lang.Object r2 = r4.A03
            X.90O r2 = (X.AnonymousClass90O) r2
            java.lang.Object r1 = r4.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r4.A01
            X.9jP r0 = (X.C189539jP) r0
            X.AnonymousClass90O.A00(r0, r2, r5, r1, r6)
            return
        L_0x007e:
            if (r6 == 0) goto L_0x0097
            java.lang.Object r3 = r4.A03
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r3
            java.lang.Object r2 = r4.A02
            X.A2N r2 = (X.A2N) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0097
            boolean r0 = X.AnonymousClass8BX.A1X(r6, r1)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines.A07(r2, r3, r0)
        L_0x0097:
            java.lang.Object r0 = r4.A01
            X.BBe r0 = (X.C22521BBe) r0
            if (r0 == 0) goto L_0x00a0
            r0.Btu(r5, r6)
        L_0x00a0:
            java.lang.Object r3 = r4.A03
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines) r3
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.9XH r0 = (X.AnonymousClass9XH) r0
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.00H r0 = r3.A0J
            X.A6h r2 = X.AnonymousClass8BR.A0V(r0)
            int r1 = r3.A00
            r0 = 3
            r2.A08(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0P
            r0 = 0
            r1.set(r0)
            X.00H r0 = r3.A0G
            goto L_0x010d
        L_0x00c6:
            if (r6 == 0) goto L_0x00df
            java.lang.Object r3 = r4.A03
            X.A8c r3 = (X.C20119A8c) r3
            java.lang.Object r2 = r4.A02
            X.A2N r2 = (X.A2N) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x00df
            boolean r0 = X.AnonymousClass8BX.A1X(r6, r1)
            X.C20119A8c.A04(r3, r2, r0)
        L_0x00df:
            java.lang.Object r0 = r4.A01
            X.BBe r0 = (X.C22521BBe) r0
            if (r0 == 0) goto L_0x00e8
            r0.Btu(r5, r6)
        L_0x00e8:
            java.lang.Object r3 = r4.A03
            X.A8c r3 = (X.C20119A8c) r3
            X.00H r0 = r3.A0E
            java.lang.Object r0 = r0.get()
            X.9XH r0 = (X.AnonymousClass9XH) r0
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.00H r0 = r3.A0L
            X.A6h r2 = X.AnonymousClass8BR.A0V(r0)
            int r1 = r3.A00
            r0 = 3
            r2.A08(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0R
            r0 = 0
            r1.set(r0)
            X.00H r0 = r3.A0I
        L_0x010d:
            X.A6h r0 = X.AnonymousClass8BR.A0V(r0)
            X.19T r0 = r0.A04
            r0.CGw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20905AbL.Btu(X.A1q, java.util.Map):void");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.B5z] */
    public void C7V(Map map) {
        AnonymousClass00H r5;
        AtomicBoolean atomicBoolean;
        C20081A6h A0V;
        int i;
        short s;
        Map map2;
        boolean z;
        Object obj;
        Map map3;
        Object obj2;
        String str;
        Object obj3;
        Boolean bool;
        String str2;
        short s2;
        C172058si A0T;
        String str3;
        Map map4;
        boolean z2;
        Object obj4;
        Map map5;
        Object obj5;
        String str4;
        Object obj6;
        Boolean bool2;
        Map map6 = map;
        switch (this.A00) {
            case 0:
                Log.i("FlowsLogger/FlowsV2Action/execute()/onSuccess() - Flow terminated successfully");
                if (map == null) {
                    ((A2M) C18070vi.A0E(((C170018ny) this.A03).A0O)).A03("user_interrupted", true, false);
                    return;
                }
                return;
            case 1:
                C22521BBe bBe = (C22521BBe) this.A01;
                if (bBe != null) {
                    bBe.C7V(map6);
                }
                C20119A8c a8c = (C20119A8c) this.A03;
                A2N a2n = (A2N) this.A02;
                AnonymousClass00H r7 = a8c.A0D;
                UserJid userJid = a2n.A02;
                AnonymousClass4FP r6 = (AnonymousClass4FP) ((A5S) r7.get()).A04(userJid);
                long j = a2n.A01;
                if (j == -1) {
                    if (r6 != null) {
                        str2 = r6.A08;
                    } else {
                        str2 = null;
                    }
                    if (C18070vi.A18(str2, a2n.A05)) {
                        C822444b r2 = (C822444b) r7.get();
                        AnonymousClass4FP r1 = (AnonymousClass4FP) r2.A04(userJid);
                        if (r1 != null) {
                            r1.A0C = true;
                            r2.A08(r1);
                            C822444b.A00(r2);
                        }
                    }
                }
                ((AnonymousClass9XH) a8c.A0E.get()).A00.clear();
                C108985cd.A0c(a8c.A0O, a2n.A03).A02(new Object());
                if (map != null && !map6.isEmpty() && map6.containsKey("data")) {
                    Object obj7 = map6.get("data");
                    if ((obj7 instanceof Map) && (map2 = (Map) obj7) != null && map2.containsKey("extension_message_response") && (map2.get("extension_message_response") instanceof Map)) {
                        Object obj8 = map2.get("extension_message_response");
                        C18070vi.A0z(obj8, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        if (((Map) obj8).containsKey("params")) {
                            Object obj9 = map6.get("data_channel_navigation");
                            if (!(obj9 instanceof Boolean) || (bool = (Boolean) obj9) == null) {
                                z = true;
                            } else {
                                z = bool.booleanValue();
                            }
                            Map A0u = AnonymousClass8BS.A0u("data", map6);
                            Map map7 = null;
                            if (A0u != null) {
                                obj = A0u.get("extension_message_response");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Map) {
                                map3 = (Map) obj;
                                if (map3 != null) {
                                    obj2 = map3.get("body");
                                }
                                obj2 = null;
                            } else {
                                map3 = null;
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str = (String) obj2;
                            } else {
                                str = null;
                            }
                            if (map3 != null) {
                                obj3 = map3.get("params");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof Map) {
                                map7 = (Map) obj3;
                            }
                            JSONObject jSONObject = new JSONObject(map7);
                            C33251iW r8 = (C33251iW) a8c.A0P.get();
                            if (str == null) {
                                str = "";
                            }
                            r8.A0U(userJid, (Integer) null, str, "galaxy_message", jSONObject.toString(), a2n.A06, j);
                            a8c.A0C.CGF(new AnonymousClass7RF(a8c, a2n, 33, z));
                            A0V = AnonymousClass8BR.A0V(a8c.A0L);
                            i = a8c.A00;
                            s = 2;
                            A0V.A08(i, s);
                            r5 = a8c.A0I;
                            AnonymousClass8BR.A0T(r5).A0F(a2n.A05.hashCode(), s);
                            atomicBoolean = a8c.A0R;
                            break;
                        }
                    }
                }
                A0V = AnonymousClass8BR.A0V(a8c.A0L);
                i = a8c.A00;
                s = 22;
                A0V.A08(i, s);
                r5 = a8c.A0I;
                AnonymousClass8BR.A0T(r5).A0F(a2n.A05.hashCode(), s);
                atomicBoolean = a8c.A0R;
                break;
            case 2:
                C22521BBe bBe2 = (C22521BBe) this.A01;
                if (bBe2 != null) {
                    bBe2.C7V(map6);
                }
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.A03;
                ((AnonymousClass9XH) phoenixFlowsManagerWithCoroutines.A0C.get()).A00.clear();
                if (map != null && !map6.isEmpty() && map6.containsKey("data")) {
                    Object obj10 = map6.get("data");
                    if ((obj10 instanceof Map) && (map4 = (Map) obj10) != null && map4.containsKey("extension_message_response") && (map4.get("extension_message_response") instanceof Map)) {
                        Object obj11 = map4.get("extension_message_response");
                        C18070vi.A0z(obj11, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        if (((Map) obj11).containsKey("params")) {
                            Object obj12 = map6.get("data_channel_navigation");
                            if (!(obj12 instanceof Boolean) || (bool2 = (Boolean) obj12) == null) {
                                z2 = true;
                            } else {
                                z2 = bool2.booleanValue();
                            }
                            A2N a2n2 = (A2N) this.A02;
                            Map A0u2 = AnonymousClass8BS.A0u("data", map6);
                            Map map8 = null;
                            if (A0u2 != null) {
                                obj4 = A0u2.get("extension_message_response");
                            } else {
                                obj4 = null;
                            }
                            if (obj4 instanceof Map) {
                                map5 = (Map) obj4;
                                if (map5 != null) {
                                    obj5 = map5.get("body");
                                }
                                obj5 = null;
                            } else {
                                map5 = null;
                                obj5 = null;
                            }
                            if (obj5 instanceof String) {
                                str4 = (String) obj5;
                            } else {
                                str4 = null;
                            }
                            if (map5 != null) {
                                obj6 = map5.get("params");
                            } else {
                                obj6 = null;
                            }
                            if (obj6 instanceof Map) {
                                map8 = (Map) obj6;
                            }
                            JSONObject jSONObject2 = new JSONObject(map8);
                            C33251iW r52 = (C33251iW) phoenixFlowsManagerWithCoroutines.A0N.get();
                            UserJid userJid2 = a2n2.A02;
                            long j2 = a2n2.A01;
                            if (str4 == null) {
                                str4 = "";
                            }
                            r52.A0U(userJid2, (Integer) null, str4, "galaxy_message", jSONObject2.toString(), a2n2.A06, j2);
                            PhoenixFlowsManagerWithCoroutines.A04(a2n2, phoenixFlowsManagerWithCoroutines, 2, z2);
                            PhoenixFlowsManagerWithCoroutines.A07(a2n2, phoenixFlowsManagerWithCoroutines, true);
                            s2 = 2;
                            AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0J).A08(phoenixFlowsManagerWithCoroutines.A00, 2);
                            r5 = phoenixFlowsManagerWithCoroutines.A0G;
                            A0T = AnonymousClass8BR.A0T(r5);
                            str3 = a2n2.A05;
                            A0T.A0F(str3.hashCode(), s2);
                            atomicBoolean = phoenixFlowsManagerWithCoroutines.A0P;
                            break;
                        }
                    }
                }
                s2 = 22;
                AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0J).A08(phoenixFlowsManagerWithCoroutines.A00, 22);
                r5 = phoenixFlowsManagerWithCoroutines.A0G;
                A0T = AnonymousClass8BR.A0T(r5);
                str3 = ((A2N) this.A02).A05;
                A0T.A0F(str3.hashCode(), s2);
                atomicBoolean = phoenixFlowsManagerWithCoroutines.A0P;
                break;
            case 3:
                AnonymousClass90O.A00((C189539jP) this.A01, (AnonymousClass90O) this.A03, (C19980A1q) null, (Map) this.A02, map6);
                return;
            default:
                ((C192469oR) this.A01).A00.A01.A0L.remove("PaymentData");
                if (map == null) {
                    AnonymousClass8BS.A1F("BrazilCardPhoenixHelper", "launchPhoenixFlow :: terminalParams is null");
                    ((C21132Af0) this.A03).A0B(false);
                    return;
                }
                Object obj13 = map6.get("error");
                if (obj13 instanceof C19976A1m) {
                    ((B9C) this.A02).Bum((int) ((C19976A1m) obj13).A00);
                    ((C21132Af0) this.A03).A0B(false);
                } else if (obj13 instanceof Map) {
                    ((B9C) this.A02).Bum(AnonymousClass000.A0M(((Map) obj13).get("code")));
                } else {
                    ((B9C) this.A02).Bum(0);
                    ((C21132Af0) this.A03).A0B(true);
                }
                ((C21132Af0) this.A03).A0B(true);
                return;
        }
        atomicBoolean.set(false);
        AnonymousClass8BR.A0V(r5).A04.CGw();
    }
}
