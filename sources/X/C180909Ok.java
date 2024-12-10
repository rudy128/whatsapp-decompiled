package X;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Ok  reason: invalid class name and case insensitive filesystem */
public abstract class C180909Ok {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.9NB] */
    public static AnonymousClass9NB A00(Intent intent) {
        Object obj;
        Uri uri;
        JSONObject A15 = C17880vN.A15();
        ArrayList A13 = AnonymousClass000.A13();
        A15.put("action", intent.getAction());
        A15.put("package", intent.getPackage());
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, intent.getType());
        Uri data = intent.getData();
        if (data != null) {
            A13.add(data);
            String scheme = data.getScheme();
            String authority = data.getAuthority();
            String str = null;
            if (!TextUtils.isEmpty(data.getPath())) {
                str = "/";
                if (!data.getPath().equals(str)) {
                    str = "/--sanitized--";
                }
            }
            A15.put("data", C197119wB.A00(authority, str, AnonymousClass7B7.A00(data), scheme));
        }
        ClipData A00 = C180899Oj.A00(intent);
        if (A00 != null) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (int i = 0; i < A00.getItemCount(); i++) {
                ClipData.Item itemAt = A00.getItemAt(i);
                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                    A13.add(uri);
                    String scheme2 = uri.getScheme();
                    String authority2 = uri.getAuthority();
                    String str2 = null;
                    if (!TextUtils.isEmpty(uri.getPath())) {
                        str2 = "/";
                        if (!uri.getPath().equals(str2)) {
                            str2 = "/--sanitized--";
                        }
                    }
                    A1A.put(C197119wB.A00(authority2, str2, AnonymousClass7B7.A00(uri), scheme2));
                }
            }
            A15.put("clip_data", A1A);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            JSONArray A1A2 = AnonymousClass8BR.A1A();
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                AnonymousClass8BS.A1J(it, A1A2);
            }
            A15.put("categories", A1A2);
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            AnonymousClass8BS.A1C(component, "component_name", A15);
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            AnonymousClass8BS.A1C(sourceBounds, "source_bounds", A15);
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.size() > 0) {
            JSONArray A1A3 = AnonymousClass8BR.A1A();
            Iterator<String> it2 = extras.keySet().iterator();
            while (it2.hasNext()) {
                String A0v = C17880vN.A0v(it2);
                JSONObject A152 = C17880vN.A15();
                try {
                    obj = extras.get(A0v);
                } catch (BadParcelableException unused) {
                    obj = null;
                }
                String str3 = "";
                if (obj != null) {
                    str3 = obj.getClass().getCanonicalName();
                }
                A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0v);
                A152.put("value_type", str3);
                if (obj != null) {
                    URLUtil.isValidUrl(obj.toString());
                }
                A1A3.put(A152);
            }
            A15.put("extra_names", A1A3);
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            A15.put("selector", A00(selector).A01);
        }
        if (intent.getFlags() > 0) {
            A15.put("flags", intent.getFlags());
        }
        ? obj2 = new Object();
        obj2.A01 = A15;
        obj2.A00 = A13;
        return obj2;
    }
}
