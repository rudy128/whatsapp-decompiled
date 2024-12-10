package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9iS  reason: invalid class name and case insensitive filesystem */
public abstract class C189069iS {
    public static JSONObject A02(AnonymousClass8o6 r3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seq_id", r3.A00);
        jSONObject.put("event_type", r3.A01);
        jSONObject.put("message_type", r3.A02);
        return jSONObject;
    }

    public JSONObject A03() {
        String str;
        String str2;
        if (this instanceof AnonymousClass8o6) {
            AnonymousClass8o6 r4 = (AnonymousClass8o6) this;
            if (r4 instanceof AnonymousClass8o3) {
                AnonymousClass8o3 r42 = (AnonymousClass8o3) r4;
                try {
                    JSONObject A02 = A02(r42);
                    A02.put("contains_url", r42.A00);
                    return A02;
                } catch (JSONException e) {
                    e = e;
                    str = "ConversationSketchTextEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r4 instanceof AnonymousClass8o5) {
                AnonymousClass8o5 r43 = (AnonymousClass8o5) r4;
                try {
                    JSONObject A022 = A02(r43);
                    A022.put("interactive_type", r43.A02);
                    A022.put("has_header", r43.A0B);
                    if (r43.A0B) {
                        A022.put("header_type", r43.A01);
                        A022.put("header_contains_url", r43.A0C);
                    }
                    A022.put("has_body", r43.A09);
                    if (r43.A09) {
                        A022.put("body_contains_url", r43.A07);
                    }
                    A022.put("has_footer", r43.A0A);
                    if (r43.A0A) {
                        A022.put("footer_contains_url", r43.A08);
                    }
                    List list = r43.A05;
                    if (list != null && list.size() > 0) {
                        JSONArray A1A = AnonymousClass8BR.A1A();
                        Iterator it = r43.A05.iterator();
                        while (it.hasNext()) {
                            AnonymousClass8BS.A1J(it, A1A);
                        }
                        A022.put("button_id_hashes", A1A);
                    }
                    List list2 = r43.A06;
                    if (list2 != null && list2.size() > 0) {
                        JSONArray A1A2 = AnonymousClass8BR.A1A();
                        for (List it2 : r43.A06) {
                            JSONArray A1A3 = AnonymousClass8BR.A1A();
                            Iterator it3 = it2.iterator();
                            while (it3.hasNext()) {
                                AnonymousClass8BS.A1J(it3, A1A3);
                            }
                            A1A2.put(A1A3);
                        }
                        A022.put("row_id_hashes", A1A2);
                    }
                    String str3 = r43.A03;
                    if (str3 != null) {
                        A022.put("list_reply_id_hash", str3);
                    }
                    String str4 = r43.A00;
                    if (str4 != null) {
                        A022.put("button_reply_id_hash", str4);
                    }
                    String str5 = r43.A04;
                    if (str5 == null) {
                        return A022;
                    }
                    A022.put("order_status", str5);
                    return A022;
                } catch (JSONException e2) {
                    e = e2;
                    str = "ConversationSketchInteractiveEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r4 instanceof AnonymousClass8o4) {
                AnonymousClass8o4 r44 = (AnonymousClass8o4) r4;
                try {
                    JSONObject A023 = A02(r44);
                    String str6 = r44.A01;
                    if (str6 != null) {
                        A023.put("header_type", str6);
                    }
                    String str7 = r44.A02;
                    if (str7 != null) {
                        A023.put("template_id_hash", str7);
                    }
                    List list3 = r44.A03;
                    if (list3 != null && list3.size() > 0) {
                        JSONArray A1A4 = AnonymousClass8BR.A1A();
                        Iterator it4 = r44.A03.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass8BS.A1J(it4, A1A4);
                        }
                        A023.put("button_id_hashes", A1A4);
                    }
                    String str8 = r44.A00;
                    if (str8 == null) {
                        return A023;
                    }
                    A023.put("template_button_reply_selected_id_hash", str8);
                    return A023;
                } catch (JSONException e3) {
                    e = e3;
                    str = "ConversationSketchHSMEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else {
                try {
                    return A02(r4);
                } catch (JSONException e4) {
                    e = e4;
                    str = "ConversationSketchEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            }
        } else if (this instanceof AnonymousClass8o0) {
            AnonymousClass8o0 r45 = (AnonymousClass8o0) this;
            try {
                JSONObject A15 = C17880vN.A15();
                AnonymousClass8o1 r0 = r45.A00;
                if (r0 != null) {
                    A15.put("current_conversation", r0.A03());
                }
                JSONArray A1A5 = AnonymousClass8BR.A1A();
                for (C189069iS A03 : r45.A01) {
                    A1A5.put(A03.A03());
                }
                A15.put("completed_conversations", A1A5);
                return A15;
            } catch (JSONException e5) {
                e = e5;
                str = "ConversationSketchConversationMerchantList: toJsonString threw: ";
                Log.w(str, e);
                return null;
            }
        } else {
            AnonymousClass8o1 r46 = (AnonymousClass8o1) this;
            try {
                JSONObject A152 = C17880vN.A15();
                A152.put("start_ts", r46.A00);
                A152.put("conversation_id", r46.A02);
                A152.put("business_jid", r46.A03);
                JSONArray A12 = AnonymousClass8BT.A12(r46.A01, "msgs_skipped_count", A152);
                for (C189069iS A032 : r46.A04) {
                    JSONObject A033 = A032.A03();
                    if (A033 == null) {
                        str2 = null;
                    } else {
                        str2 = A033.toString();
                    }
                    A12.put(str2);
                }
                A152.put("msg_events", A12);
                return A152;
            } catch (JSONException e6) {
                e = e6;
                str = "ConversationSketchConversation: toJsonString threw: ";
                Log.w(str, e);
                return null;
            }
        }
    }
}
