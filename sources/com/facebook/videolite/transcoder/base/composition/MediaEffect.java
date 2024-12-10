package com.facebook.videolite.transcoder.base.composition;

import X.AnonymousClass000;
import X.BW5;
import X.BW6;
import X.C17880vN;
import X.C18070vi;
import X.C28607E9y;
import X.C6M;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class MediaEffect {
    public final List A00 = AnonymousClass000.A13();

    public JSONObject A01() {
        JSONObject jSONObject;
        Object obj;
        String str;
        if (this instanceof BW5) {
            BW5 bw5 = (BW5) this;
            jSONObject = C17880vN.A15();
            try {
                jSONObject.put("class", "VolumeEffect");
            } catch (JSONException unused) {
            }
            obj = Float.valueOf(bw5.A00);
            str = "volumedB";
        } else {
            BW6 bw6 = (BW6) this;
            jSONObject = C17880vN.A15();
            try {
                jSONObject.put("class", "GlRendererMediaEffect");
            } catch (JSONException unused2) {
            }
            C28607E9y e9y = bw6.A00;
            if (e9y == null) {
                C18070vi.A11("glRenderer");
                throw null;
            }
            try {
                jSONObject.put("GLRenderer", e9y.BY8());
            } catch (JSONException unused3) {
            }
            obj = AnonymousClass000.A0h();
            str = "mShouldOverrideFrameRate";
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused4) {
        }
        return jSONObject;
    }

    public static void A00(Iterator it, JSONArray jSONArray) {
        C6M c6m = (C6M) it.next();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mTargetTimeRange", c6m.A00.A04());
        jSONObject.put("mMediaEffect", c6m.A01.A01());
        jSONArray.put(jSONObject);
    }
}
