package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6yu  reason: invalid class name and case insensitive filesystem */
public final class C139476yu {
    public static final List A02;
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    static {
        String[] strArr = new String[7];
        strArr[0] = "ACCEPT";
        strArr[1] = "START";
        strArr[2] = "DENY";
        strArr[3] = "OK";
        strArr[4] = "DISMISS";
        strArr[5] = "OPTIN";
        A02 = C18070vi.A0O("OPTOUT", strArr, 6);
    }

    public final AnonymousClass77L A01(JSONObject jSONObject) {
        Integer valueOf;
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (C18070vi.A18(optString, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID) && jSONObject.has("v2")) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 6674)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("v2");
                String A0J = C18070vi.A0J("light", jSONObject2);
                if (jSONObject2.has("dark")) {
                    str = jSONObject2.getString("dark");
                }
                C18070vi.A0b(optString);
                return new AnonymousClass77L(AnonymousClass4HG.A00(jSONObject2.optString("role")), AnonymousClass4HH.A00(jSONObject2.optString("style")), (Integer) null, A0J, str, optString, (String) null);
            }
        }
        String A0J2 = C18070vi.A0J("light", jSONObject);
        String optString2 = jSONObject.optString("dark");
        C18070vi.A0b(optString);
        String optString3 = jSONObject.optString("size");
        if (jSONObject.isNull("animationLoopCount")) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(jSONObject.optInt("animationLoopCount"));
        }
        return new AnonymousClass77L((AnonymousClass4DO) null, (AnonymousClass4DP) null, valueOf, A0J2, optString2, optString, optString3);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [X.76n, java.lang.Object] */
    public final C134876rI A00(JSONObject jSONObject, int i) {
        C122906Sj r1;
        Integer num;
        C1416776n r3;
        AnonymousClass771 r15;
        AnonymousClass771 r2;
        JSONObject jSONObject2;
        String str;
        int i2 = i;
        try {
            LinkedHashMap A13 = C17880vN.A13();
            JSONArray jSONArray = jSONObject.getJSONObject("privacy-disclosure").getJSONArray("prompts");
            C18070vi.A0X(jSONArray);
            C21488Akx A04 = A6n.A04(jSONArray);
            while (true) {
                if (A04.hasNext()) {
                    JSONObject jSONObject3 = (JSONObject) A04.next();
                    if (jSONObject3 != null) {
                        String str2 = null;
                        String optString = jSONObject3.optString("footer");
                        if (jSONObject3.has("footerV2")) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject("footerV2");
                            optString = jSONObject4.optString("text");
                            str2 = jSONObject4.optString("size");
                        }
                        AnonymousClass77W r6 = new AnonymousClass77W(optString, str2);
                        String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject3);
                        String A0J2 = C18070vi.A0J("template", jSONObject3);
                        String optString2 = jSONObject3.optString("height");
                        if (C108955ca.A05(optString2) > 0) {
                            num = AnonymousClass6XB.A00(optString2);
                        } else {
                            num = C1418177b.A0E;
                        }
                        AnonymousClass77L A012 = A01(jSONObject3.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON));
                        String optString3 = jSONObject3.optString("title");
                        String optString4 = jSONObject3.optString("body");
                        String str3 = r6.A01;
                        JSONArray optJSONArray = jSONObject3.optJSONArray("bullets");
                        ArrayList A132 = AnonymousClass000.A13();
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            C21488Akx A042 = A6n.A04(optJSONArray);
                            while (A042.hasNext()) {
                                JSONObject jSONObject5 = (JSONObject) A042.next();
                                if (jSONObject5 != null) {
                                    A132.add(new AnonymousClass776(A01(jSONObject5.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)), C18070vi.A0J("text", jSONObject5), jSONObject5.optString("secondaryText")));
                                }
                            }
                        }
                        AnonymousClass776[] r9 = (AnonymousClass776[]) A132.toArray(new AnonymousClass776[0]);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("nav");
                        if (optJSONObject == null) {
                            r3 = null;
                        } else {
                            boolean optBoolean = optJSONObject.optBoolean("dismissButton");
                            ? obj = new Object();
                            obj.A00 = optBoolean;
                            r3 = obj;
                        }
                        JSONObject jSONObject6 = jSONObject3.getJSONObject("primaryButton");
                        if (jSONObject6 == null) {
                            r15 = null;
                        } else {
                            r15 = new AnonymousClass771(C18070vi.A0J("action", jSONObject6), C18070vi.A0J("label", jSONObject6));
                        }
                        C18070vi.A0b(r15);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("secondaryButton");
                        if (optJSONObject2 == null) {
                            r2 = null;
                        } else {
                            r2 = new AnonymousClass771(C18070vi.A0J("action", optJSONObject2), C18070vi.A0J("label", optJSONObject2));
                        }
                        JSONObject optJSONObject3 = jSONObject3.optJSONObject("branding");
                        if (optJSONObject3 != null) {
                            jSONObject2 = optJSONObject3.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                        } else {
                            jSONObject2 = null;
                        }
                        AnonymousClass77L A013 = A01(jSONObject2);
                        JSONObject optJSONObject4 = jSONObject3.optJSONObject("branding");
                        if (optJSONObject4 != null) {
                            str = optJSONObject4.optString("text");
                        } else {
                            str = null;
                        }
                        C1418177b r14 = new C1418177b(r15, r2, A012, A013, r3, num, A0J, A0J2, optString3, optString4, str3, str, r6.A00, r9);
                        String str4 = r14.A0A;
                        if (A13.containsKey(str4)) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Duplicated prompt name ");
                            A10.append(str4);
                            r1 = new C122906Sj(AnonymousClass000.A0y(" in the disclosure", A10));
                            break;
                        }
                        A13.put(str4, r14);
                    }
                } else {
                    ArrayList A133 = AnonymousClass000.A13();
                    String str5 = "START";
                    if (!A13.containsKey(str5)) {
                        r1 = new C122906Sj("The START prompt is not defined in the disclosure");
                    } else {
                        while (true) {
                            String[] strArr = new String[7];
                            strArr[0] = null;
                            strArr[1] = "ACCEPT";
                            strArr[2] = "DENY";
                            strArr[3] = "OK";
                            strArr[4] = "DISMISS";
                            strArr[5] = "OPTIN";
                            if (!C18070vi.A0O("OPTOUT", strArr, 6).contains(str5) && (!A13.isEmpty())) {
                                C1418177b r0 = (C1418177b) A13.get(str5);
                                if (r0 == null) {
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    A102.append("Prompt ");
                                    A102.append(str5);
                                    r1 = new C122906Sj(AnonymousClass000.A0y(" is not defined in the disclosure", A102));
                                    break;
                                }
                                A133.add(r0);
                                A13.remove(str5);
                                str5 = r0.A00.A00;
                            }
                        }
                        return new C134876rI(i2, A133);
                    }
                }
            }
            throw r1;
        } catch (Throwable th) {
            ((C25768Clf) C18070vi.A0E(this.A01)).A02(i2, C17880vN.A0j());
            throw new C122906Sj(th);
        }
    }

    public C139476yu(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
