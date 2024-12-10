package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64OutputStream;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0wX  reason: invalid class name and case insensitive filesystem */
public class C18500wX {
    public final Context A00;
    public final C18290w6 A01;
    public final C18290w6 A02;
    public final Set A03;
    public final Executor A04;

    public /* synthetic */ String A00() {
        ArrayList arrayList;
        SharedPreferences sharedPreferences;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            Object obj = this.A01.get();
            C19660yh r8 = (C19660yh) obj;
            synchronized (obj) {
                arrayList = new ArrayList();
                sharedPreferences = r8.A00;
                for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                    if (next.getValue() instanceof Set) {
                        HashSet hashSet = new HashSet((Set) next.getValue());
                        hashSet.remove(C19660yh.A00(r8, System.currentTimeMillis()));
                        if (!hashSet.isEmpty()) {
                            arrayList.add(new AnonymousClass2AQ((String) next.getKey(), new ArrayList(hashSet)));
                        }
                    }
                }
                sharedPreferences.edit().putLong("fire-global", System.currentTimeMillis()).commit();
            }
            synchronized (obj) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                int i = 0;
                for (Map.Entry next2 : sharedPreferences.getAll().entrySet()) {
                    if (next2.getValue() instanceof Set) {
                        String A002 = C19660yh.A00(r8, System.currentTimeMillis());
                        String str = (String) next2.getKey();
                        if (((Set) next2.getValue()).contains(A002)) {
                            HashSet hashSet2 = new HashSet();
                            hashSet2.add(A002);
                            i++;
                            edit.putStringSet(str, hashSet2);
                        } else {
                            edit.remove(str);
                        }
                    }
                }
                if (i == 0) {
                    edit.remove("fire-count");
                } else {
                    edit.putLong("fire-count", (long) i);
                }
                edit.commit();
            }
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C49602Rd r4 = (C49602Rd) arrayList.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", ((AnonymousClass2AQ) r4).A00);
                jSONObject.put("dates", new JSONArray(((AnonymousClass2AQ) r4).A01));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes(DefaultCrypto.UTF_8));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString(DefaultCrypto.UTF_8);
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    public C18500wX(Context context, C18290w6 r3, String str, Set set, Executor executor) {
        this.A01 = new C19650yg(context, str);
        this.A03 = set;
        this.A04 = executor;
        this.A02 = r3;
        this.A00 = context;
    }

    public void A01() {
        if (this.A03.size() <= 0 || (!C18380wJ.A00(this.A00))) {
            Tasks.forResult((Object) null);
        } else {
            Tasks.call(this.A04, new AnonymousClass3DB(this, 0));
        }
    }
}
