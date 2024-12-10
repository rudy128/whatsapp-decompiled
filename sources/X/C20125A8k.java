package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.A8k  reason: case insensitive filesystem */
public abstract class C20125A8k {
    public final JSONObject A00;

    public static int A00(C20125A8k a8k, String str) {
        return a8k.A00.optInt(str);
    }

    public static long A01(C20125A8k a8k) {
        return C20099A7c.A04(a8k.A0F("announcement_version"), 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl] */
    public static GroupCommonFragmentImpl A03(C20125A8k a8k) {
        JSONObject jSONObject = a8k.A00;
        C18070vi.A0W(jSONObject);
        return new C20125A8k(jSONObject);
    }

    public static C29681ch A05(C20125A8k a8k) {
        AnonymousClass25J r0 = C29681ch.A03;
        return AnonymousClass25J.A00(a8k.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
    }

    public static AnonymousClass1EC A06(C20125A8k a8k) {
        return C42941yz.A00(C36321nh.A01(a8k.A00.optString("parent_group_jid")));
    }

    public static Integer A07(C20125A8k a8k) {
        return Integer.valueOf(a8k.A00.optInt("total_participants_count"));
    }

    public static String A08(C20125A8k a8k) {
        return a8k.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public final C20125A8k A09(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (C20125A8k) cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{optJSONObject});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1IX A0A(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            org.json.JSONObject r0 = r9.A00
            org.json.JSONArray r8 = r0.optJSONArray(r11)
            r7 = 0
            if (r8 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r5 = 0
            r1[r5] = r0     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r4 = r10.getConstructor(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            X.2AI r3 = new X.2AI     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r2 = 0
        L_0x001c:
            int r0 = r8.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r2 >= r0) goto L_0x0036
            org.json.JSONObject r1 = r8.optJSONObject(r2)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r1 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r0[r5] = r1     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.add((java.lang.Object) r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0036:
            X.1IX r0 = r3.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            return r0
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20125A8k.A0A(java.lang.Class, java.lang.String):X.1IX");
    }

    public final AnonymousClass1IX A0B(Enum enumR, String str) {
        Enum enumR2;
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        AnonymousClass2AI r3 = new AnonymousClass2AI();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (optString == null) {
                enumR2 = enumR;
            } else {
                try {
                    enumR2 = Enum.valueOf(enumR.getClass(), C108955ca.A0y(optString));
                } catch (IllegalArgumentException unused) {
                    enumR2 = enumR;
                }
            }
            r3.add((Object) enumR2);
        }
        return r3.build();
    }

    public final AnonymousClass1IX A0C(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        AnonymousClass2AI r2 = new AnonymousClass2AI();
        for (int i = 0; i < optJSONArray.length(); i++) {
            r2.add((Object) optJSONArray.optString(i));
        }
        return r2.build();
    }

    public final Enum A0D(Enum enumR, String str) {
        String optString = this.A00.optString(str);
        if (optString == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), C108955ca.A0y(optString));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public final Enum A0E(Enum enumR, String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (optString == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), C108955ca.A0y(optString));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public final String A0F(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public final boolean A0G(String str) {
        JSONObject jSONObject = this.A00;
        return jSONObject.optBoolean(str, C17890vO.A1R(jSONObject.optInt(str)));
    }

    public C20125A8k(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    public static C20125A8k A02(C20125A8k a8k, Class cls, String str) {
        C20125A8k A09 = a8k.A09(cls, str);
        C199610h.A04(A09);
        C18070vi.A0X(A09);
        return A09;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl] */
    public static NewsletterMutationResponseFragmentImpl A04(C20125A8k a8k, Class cls, String str) {
        C20125A8k A09 = a8k.A09(cls, str);
        if (A09 != null) {
            return new C20125A8k(A09.A00);
        }
        return null;
    }
}
