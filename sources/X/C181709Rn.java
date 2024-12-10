package X;

import java.util.Map;

/* renamed from: X.9Rn  reason: invalid class name and case insensitive filesystem */
public abstract class C181709Rn {
    public static final C59772mr A00(Map map) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (map == null || (charSequence = (CharSequence) map.get("btn_primary_text")) == null || charSequence.length() == 0 || (charSequence2 = (CharSequence) map.get("btn_primary_url")) == null || charSequence2.length() == 0) {
            return null;
        }
        return new C59772mr(map);
    }
}
