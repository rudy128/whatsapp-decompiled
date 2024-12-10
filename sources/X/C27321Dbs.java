package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Dbs  reason: case insensitive filesystem */
public final class C27321Dbs extends HashMap<String, String> {
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && !(obj instanceof String)) {
            return false;
        }
        if (obj2 == null || (obj2 instanceof String)) {
            return super.remove(obj, obj2);
        }
        return false;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.get(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof String)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public C27321Dbs(Cursor cursor, int i, int i2, int i3) {
        String str;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, cursor.getString(i));
        put("profile_pic_url", cursor.getString(i2));
        put("resolver_type", "content_provider");
        if (i3 != -1) {
            str = cursor.getString(i3);
        } else {
            str = "FXAccountItemHoldoutStatusNoData";
        }
        put("upsell_holdout_status", str);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return null;
    }
}
