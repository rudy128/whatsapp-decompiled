package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ir  reason: invalid class name and case insensitive filesystem */
public final class C33461ir {
    public C33501iv A00;
    public final AnonymousClass11P A01;
    public final C18010vc A02;
    public final AnonymousClass00H A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap(4);
    public final C18100vl A05 = new C18110vm(new C33471is(this));

    public C33461ir(AnonymousClass11P r3, C18010vc r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static final synchronized SharedPreferences.Editor A00(C33461ir r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            edit = ((SharedPreferences) r1.A05.getValue()).edit();
            C18070vi.A0X(edit);
        }
        return edit;
    }

    public final void A04(Integer num, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        A01(this);
        C39551tG r2 = (C39551tG) this.A04.get(Integer.valueOf(i));
        if (r2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("PrivacyDisclosureStore/updatedisclosure invalid disclosureId = ");
            sb.append(i);
            Log.e(sb.toString());
            return;
        }
        int i4 = r2.A01;
        if (z || C39751ta.A00.A00(i4, i2)) {
            r2.A01 = i2;
        }
        if (i2 == 5) {
            r2.A04 = AnonymousClass11P.A01(this.A01) / 1000;
        } else if (i2 == 0) {
            r2.A05 = AnonymousClass11P.A01(this.A01) / 1000;
        }
        if (str != null) {
            r2.A07 = str;
        }
        if (str2 != null) {
            r2.A06 = str2;
        }
        if (num != null) {
            r2.A03 = num.intValue();
        }
        if (str3.length() > 0) {
            r2.A08 = str3;
        }
        if (i3 != -1) {
            r2.A00 = 1;
        }
        A05(r2, i);
        C33501iv r1 = this.A00;
        if (r1 != null) {
            synchronized (r1.A08) {
                if (r1.A0G && i == r1.A0E) {
                    r1.A0G = false;
                    r1.A0E = 0;
                    Object obj = r1.A08;
                    C18070vi.A0z(obj, "null cannot be cast to non-null type java.lang.Object");
                    obj.notify();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.1tG, java.lang.Object] */
    public static final void A01(C33461ir r18) {
        C33461ir r3 = r18;
        ConcurrentHashMap concurrentHashMap = r3.A04;
        if (concurrentHashMap.isEmpty()) {
            synchronized (r3) {
                SharedPreferences sharedPreferences = (SharedPreferences) r3.A05.getValue();
                C18070vi.A0X(sharedPreferences);
                Map<String, ?> all = sharedPreferences.getAll();
                C18070vi.A0z(all, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                for (Map.Entry next : all.entrySet()) {
                    String str = (String) next.getKey();
                    if (!AnonymousClass1YE.A0A(str, "repeat_last_index_", false) && !AnonymousClass1YE.A0A(str, "repeat_last_ts_", false)) {
                        try {
                            Integer valueOf = Integer.valueOf((String) next.getKey());
                            C18070vi.A0X(valueOf);
                            int intValue = valueOf.intValue();
                            try {
                                if (!(next.getValue() instanceof String)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("PrivacyDisclosureStore/loadFromFile bad value for disclosure = ");
                                    sb.append((String) next.getKey());
                                    Log.e(sb.toString());
                                } else {
                                    Object value = next.getValue();
                                    C18070vi.A0z(value, "null cannot be cast to non-null type kotlin.String");
                                    JSONObject jSONObject = new JSONObject((String) value);
                                    int i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                    int i2 = jSONObject.getInt("stage");
                                    int optInt = jSONObject.optInt("version", 1);
                                    long j = jSONObject.getLong("activatedTimeInSecond");
                                    long j2 = jSONObject.getLong("acceptedTimeInSecond");
                                    String string = jSONObject.getString("deepLink");
                                    String string2 = jSONObject.getString("content");
                                    String optString = jSONObject.optString("language");
                                    int optInt2 = jSONObject.optInt("rolloutMode", 0);
                                    if (i2 < -1 || i2 > 1000) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("PrivacyDisclosureStore/loadFromFile bad stage value for disclosure = ");
                                        sb2.append(intValue);
                                        Log.e(sb2.toString());
                                        A00(r3).remove((String) next.getKey()).apply();
                                    } else {
                                        C18070vi.A0b(string);
                                        C18070vi.A0b(string2);
                                        C18070vi.A0b(optString);
                                        C18070vi.A0d(string, 5);
                                        C18070vi.A0d(string2, 6);
                                        C18070vi.A0d(optString, 9);
                                        ? obj = new Object();
                                        obj.A02 = i;
                                        obj.A01 = i2;
                                        obj.A05 = j;
                                        obj.A04 = j2;
                                        obj.A07 = string;
                                        obj.A06 = string2;
                                        obj.A03 = optInt;
                                        obj.A00 = optInt2;
                                        obj.A08 = optString;
                                        concurrentHashMap.put(valueOf, obj);
                                    }
                                }
                            } catch (JSONException e) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("PrivacyDisclosureStore/loadFromFile bad json ");
                                sb3.append(e);
                                Log.e(sb3.toString());
                                A00(r3).remove((String) next.getKey()).apply();
                            } catch (NumberFormatException e2) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("PrivacyDisclosureStore/loadFromFile corrupted number ");
                                sb4.append(e2);
                                Log.e(sb4.toString());
                                A00(r3).remove((String) next.getKey()).apply();
                            }
                        } catch (NumberFormatException unused) {
                            Log.e("PrivacyDisclosureStore disclosure id key is corrupted");
                            A00(r3).remove((String) next.getKey()).apply();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1tG, java.lang.Object] */
    public final void A03(int i, int i2, int i3, int i4, int i5) {
        long j;
        C33501iv r1;
        A01(this);
        if (i2 == 0) {
            j = AnonymousClass11P.A01(this.A01) / 1000;
        } else {
            j = -1;
        }
        ? obj = new Object();
        obj.A02 = i3;
        obj.A01 = i2;
        obj.A05 = j;
        obj.A04 = -1;
        obj.A07 = "";
        obj.A06 = "";
        obj.A03 = i4;
        obj.A00 = i5;
        obj.A08 = "";
        if (A05(obj, i) && (r1 = this.A00) != null) {
            synchronized (r1.A09) {
                if (r1.A0H && i == r1.A0F) {
                    r1.A0H = false;
                    r1.A0F = 0;
                    Object obj2 = r1.A09;
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type java.lang.Object");
                    obj2.notify();
                }
            }
        }
    }

    public final int A02(int i) {
        A01(this);
        C39551tG r0 = (C39551tG) this.A04.get(Integer.valueOf(i));
        if (r0 != null) {
            return r0.A01;
        }
        throw new IllegalArgumentException("Disclosure is not eligible for current user");
    }

    public final boolean A05(C39551tG r5, int i) {
        StringBuilder sb;
        String str;
        A01(this);
        this.A04.put(Integer.valueOf(i), r5);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A02);
            jSONObject.put("stage", r5.A01);
            jSONObject.put("version", r5.A03);
            jSONObject.put("rolloutMode", r5.A00);
            jSONObject.put("activatedTimeInSecond", r5.A05);
            jSONObject.put("acceptedTimeInSecond", r5.A04);
            jSONObject.put("deepLink", r5.A07);
            jSONObject.put("content", r5.A06);
            jSONObject.put("language", r5.A08);
            A00(this).putString(String.valueOf(i), jSONObject.toString()).apply();
            return true;
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str = "PrivacyDisclosureStore/savedisclosure JEX ";
            sb.append(str);
            sb.append(e);
            Log.e(sb.toString());
            return false;
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder();
            str = "PrivacyDisclosureStore/savedisclosure exception:";
            sb.append(str);
            sb.append(e);
            Log.e(sb.toString());
            return false;
        }
    }
}
