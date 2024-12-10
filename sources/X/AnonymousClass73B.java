package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.73B  reason: invalid class name */
public class AnonymousClass73B {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final AnonymousClass737[] A0H;

    public static AnonymousClass73B A01(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                return A00(C17880vN.A16(new String(bArr, C19620yd.A0A)));
            } catch (JSONException unused) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata";
                Log.e(str);
                return null;
            } catch (UnsupportedEncodingException unused2) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata encoding";
                Log.e(str);
                return null;
            }
        }
        return null;
    }

    public Integer A03() {
        int i;
        switch (this.A04) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    public String toString() {
        String obj;
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        AnonymousClass737[] r0 = this.A0H;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(r0).toString();
        }
        stringBuffer.append(obj);
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", isFromStickerMaker=");
        stringBuffer.append(this.A0G);
        stringBuffer.append(", isAvatarSticker=");
        stringBuffer.append(this.A0F);
        stringBuffer.append(", avatarStickerTemplateId=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isAiSticker=");
        stringBuffer.append(this.A0B);
        stringBuffer.append(", isAvatarCountrySticker=");
        stringBuffer.append(this.A0C);
        stringBuffer.append(", isAvatarInstantSticker=");
        stringBuffer.append(this.A0D);
        stringBuffer.append(", stickerMakerSourceType=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", isSocialSticker=");
        stringBuffer.append(this.A0E);
        stringBuffer.append(", accessibilityText=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", avatarStickerStyle=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", avatarStickerRevisionId=");
        stringBuffer.append(this.A06);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public AnonymousClass73B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AnonymousClass737[] r11, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        String A0C2;
        this.A0H = r11;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A09 = str5;
        this.A0A = str4;
        this.A0F = z3;
        this.A07 = str6;
        this.A0G = z2;
        this.A03 = z;
        this.A0B = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A04 = i;
        this.A0E = z7;
        this.A08 = str8;
        this.A06 = str9;
        if (str7 == null) {
            A0C2 = "";
        } else {
            A0C2 = AnonymousClass1EG.A0C(str7, 255);
        }
        this.A05 = A0C2;
    }

    public static AnonymousClass73B A00(JSONObject jSONObject) {
        String str;
        AnonymousClass737[] r1;
        Object opt;
        ArrayList A13 = AnonymousClass000.A13();
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("emojis") && (opt = jSONObject2.opt("emojis")) != null) {
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                for (int i = 0; i < jSONArray.length(); i++) {
                    String optString = jSONArray.optString(i, (String) null);
                    if (optString != null) {
                        A13.add(C137176v2.A00(optString));
                    }
                }
            } else if (opt instanceof String) {
                String str2 = (String) opt;
                int length = str2.length();
                if (length > 2) {
                    for (String str3 : str2.substring(1, length - 1).split(",")) {
                        if (str3 != null) {
                            A13.add(C137176v2.A00(str3));
                        }
                    }
                }
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:");
                Log.w(C17890vO.A0V(opt.getClass(), A10));
            }
        }
        if (jSONObject2.has("sticker-pack-id")) {
            str = jSONObject2.optString("sticker-pack-id", (String) null);
        } else {
            str = null;
        }
        if (!A13.isEmpty()) {
            r1 = (AnonymousClass737[]) A13.toArray(new AnonymousClass737[0]);
        } else {
            r1 = null;
        }
        return new AnonymousClass73B(str, jSONObject2.optString("sticker-pack-name", (String) null), jSONObject2.optString("sticker-pack-publisher", (String) null), jSONObject2.optString("android-app-store-link", (String) null), jSONObject2.optString("ios-app-store-link", (String) null), jSONObject2.optString("avatar-sticker-template-id", (String) null), AnonymousClass1EG.A0C(jSONObject2.optString("accessibility-text", ""), 255), jSONObject2.optString("avatar-sticker-style", (String) null), jSONObject2.optString("avatar-sticker-revision-id", (String) null), r1, jSONObject2.optInt("sticker-maker-source-type", 0), AnonymousClass000.A1T(jSONObject2.optInt("is-first-party-sticker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-from-sticker-maker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-avatar-sticker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-ai-sticker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-avatar-country-sticker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-avatar-instant-sticker", 0), 1), AnonymousClass000.A1T(jSONObject2.optInt("is-avatar-social-sticker", 0), 1));
    }

    public static JSONObject A02(AnonymousClass73B r6) {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("sticker-pack-id", r6.A00);
            A15.put("sticker-pack-name", r6.A01);
            A15.put("sticker-pack-publisher", r6.A02);
            String str = r6.A05;
            if (!TextUtils.isEmpty(str)) {
                A15.put("accessibility-text", str);
            }
            String str2 = r6.A0A;
            if (str2 != null) {
                A15.put("android-app-store-link", str2);
            }
            String str3 = r6.A09;
            if (str3 != null) {
                A15.put("ios-app-store-link", str3);
            }
            AnonymousClass737[] r5 = r6.A0H;
            if (r5 != null) {
                ArrayList A0z = C17880vN.A0z(r4);
                for (AnonymousClass737 A1U : r5) {
                    C108955ca.A1U(A1U, A0z);
                }
                A15.put("emojis", new JSONArray(A0z));
            }
            if (r6.A03) {
                A15.put("is-first-party-sticker", 1);
            }
            if (r6.A0G) {
                A15.put("is-from-sticker-maker", 1);
            }
            if (r6.A0F) {
                A15.put("is-avatar-sticker", 1);
            }
            String str4 = r6.A07;
            if (str4 != null) {
                A15.put("avatar-sticker-template-id", str4);
            }
            if (r6.A0B) {
                A15.put("is-ai-sticker", 1);
            }
            if (r6.A0C) {
                A15.put("is-avatar-country-sticker", 1);
            }
            if (r6.A0D) {
                A15.put("is-avatar-instant-sticker", 1);
            }
            int i = r6.A04;
            if (i != 0) {
                A15.put("sticker-maker-source-type", i);
            }
            if (r6.A0E) {
                A15.put("is-avatar-social-sticker", 1);
            }
            String str5 = r6.A08;
            if (!TextUtils.isEmpty(str5)) {
                A15.put("avatar-sticker-style", str5);
            }
            String str6 = r6.A06;
            if (!TextUtils.isEmpty(str6)) {
                A15.put("avatar-sticker-revision-id", str6);
            }
            return A15;
        } catch (JSONException e) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e);
            return null;
        }
    }

    public byte[] A04() {
        JSONObject A022 = A02(this);
        if (A022 != null) {
            return A022.toString().getBytes();
        }
        return null;
    }
}
