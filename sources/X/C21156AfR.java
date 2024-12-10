package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AfR  reason: case insensitive filesystem */
public class C21156AfR implements C22468B9a {
    public final int A00;
    public final Object A01;

    public C21156AfR(C187529fx r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final Intent CBE(Context context, Uri uri) {
        Intent intent;
        String str;
        boolean z;
        JSONObject A15;
        boolean z2;
        JSONObject A152;
        int i = this.A00;
        C187529fx r6 = (C187529fx) this.A01;
        if (i != 0) {
            String A0I = C17880vN.A0P(r6.A00).A0I(210);
            intent = null;
            if (!TextUtils.isEmpty(A0I)) {
                JSONObject jSONObject = null;
                r6.A01.get();
                String obj = uri.toString();
                try {
                    JSONObject A16 = C17880vN.A16(A0I);
                    JSONArray jSONArray = A16.getJSONArray("url");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String string = jSONObject2.getString("regex");
                        HashMap A11 = C17880vN.A11();
                        Matcher matcher = Pattern.compile(string, 2).matcher(obj);
                        if (matcher.find()) {
                            int groupCount = matcher.groupCount();
                            if (groupCount >= 1) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("param");
                                int i3 = 0;
                                while (true) {
                                    A11.put(jSONArray2.getJSONObject(i3).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), matcher.group(i3 + 1));
                                    i3++;
                                    if (i3 >= groupCount) {
                                        break;
                                    }
                                }
                            }
                            if (A16.has("opts")) {
                                A152 = A16.getJSONObject("opts");
                            } else {
                                A152 = C17880vN.A15();
                            }
                            if (jSONObject2.has("opts")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("opts");
                                Iterator<String> keys = jSONObject3.keys();
                                while (keys.hasNext()) {
                                    String A0v = C17880vN.A0v(keys);
                                    A152.put(A0v, jSONObject3.get(A0v));
                                }
                            }
                            jSONObject = new JSONObject(A11);
                            z2 = true;
                        } else {
                            i2++;
                        }
                    }
                } catch (JSONException e) {
                    Log.e((Throwable) e);
                }
                z2 = false;
                if (z2 && jSONObject != null) {
                    try {
                        r6.A02.get();
                        JSONObject A153 = C17880vN.A15();
                        return AnonymousClass1LU.A1T(context, "com.bloks.www.minishops.whatsapp.pdp", AnonymousClass8BS.A0k(A153, "params", C108965cb.A0x(jSONObject, "server_params", A153)));
                    } catch (JSONException e2) {
                        e = e2;
                        str = "ShopsLinks.handleShopsPdpLink: Failed to assemble JSON";
                        Log.e(str, e);
                        return intent;
                    }
                }
            }
        } else {
            JSONObject jSONObject4 = null;
            String obj2 = uri.toString();
            AnonymousClass00H r2 = r6.A00;
            String A0I2 = C17880vN.A0P(r2).A0I(265);
            boolean z3 = false;
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r2), 267) && !TextUtils.isEmpty(A0I2)) {
                r6.A01.get();
                try {
                    JSONObject A162 = C17880vN.A16(A0I2);
                    JSONArray jSONArray3 = A162.getJSONArray("url");
                    int i4 = 0;
                    while (true) {
                        if (i4 >= jSONArray3.length()) {
                            break;
                        }
                        JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                        String string2 = jSONObject5.getString("regex");
                        HashMap A112 = C17880vN.A11();
                        Matcher matcher2 = Pattern.compile(string2, 2).matcher(obj2);
                        if (matcher2.find()) {
                            int groupCount2 = matcher2.groupCount();
                            if (groupCount2 >= 1) {
                                JSONArray jSONArray4 = jSONObject5.getJSONArray("param");
                                int i5 = 0;
                                while (true) {
                                    A112.put(jSONArray4.getJSONObject(i5).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), matcher2.group(i5 + 1));
                                    i5++;
                                    if (i5 >= groupCount2) {
                                        break;
                                    }
                                }
                            }
                            if (A162.has("opts")) {
                                A15 = A162.getJSONObject("opts");
                            } else {
                                A15 = C17880vN.A15();
                            }
                            if (jSONObject5.has("opts")) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject("opts");
                                Iterator<String> keys2 = jSONObject6.keys();
                                while (keys2.hasNext()) {
                                    String A0v2 = C17880vN.A0v(keys2);
                                    A15.put(A0v2, jSONObject6.get(A0v2));
                                }
                            }
                            jSONObject4 = new JSONObject(A112);
                            z = true;
                        } else {
                            i4++;
                        }
                    }
                } catch (JSONException e3) {
                    Log.e((Throwable) e3);
                }
                z = false;
                if (z && jSONObject4 != null) {
                    z3 = true;
                }
            }
            intent = null;
            if (z3) {
                try {
                    r6.A02.get();
                    JSONObject A154 = C17880vN.A15();
                    return AnonymousClass1LU.A1T(context, "com.bloks.www.minishops.storefront.wa", AnonymousClass8BS.A0k(A154, "params", C108965cb.A0x(jSONObject4, "server_params", A154)));
                } catch (JSONException e4) {
                    e = e4;
                    str = "ShopsLinks.handleStoreFrontLink: Failed to assemble JSON";
                    Log.e(str, e);
                    return intent;
                }
            }
        }
        return intent;
    }
}
