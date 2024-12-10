package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8CA  reason: invalid class name */
public class AnonymousClass8CA extends BroadcastReceiver {
    public final Context A00;
    public final C27411Vz A01;
    public final C29831cw A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final C190019kF A05;
    public final AnonymousClass11C A06;

    public static void A02(AnonymousClass8CA r2) {
        boolean isPowerSaveMode;
        AnonymousClass11C r1 = r2.A06;
        AnonymousClass11C.A0P = true;
        PowerManager A0G = r1.A0G();
        AnonymousClass11C.A0P = false;
        if (A0G == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0G.isPowerSaveMode();
        }
        r2.A05.A01 = Boolean.valueOf(isPowerSaveMode);
    }

    public AnonymousClass8CA(Context context, C27411Vz r2, C190019kF r3, C29831cw r4, AnonymousClass11C r5, C18030ve r6, AnonymousClass18K r7) {
        this.A00 = context;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r5;
        this.A01 = r2;
        this.A02 = r4;
        this.A05 = r3;
    }

    public static Object A00(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof CharSequence) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character)) {
            return obj;
        }
        if (cls.isArray()) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                A1A.put(A00(Array.get(obj, i)));
            }
            return A1A;
        } else if (obj instanceof List) {
            JSONArray A1A2 = AnonymousClass8BR.A1A();
            for (Object A002 : (List) obj) {
                A1A2.put(A00(A002));
            }
            return A1A2;
        } else if (obj instanceof Bundle) {
            return A01((Bundle) obj);
        } else {
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                JSONObject A15 = C17880vN.A15();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    A15.put(Integer.toString(sparseArray.keyAt(i2)), A00(sparseArray.valueAt(i2)));
                }
                return A15;
            }
            JSONObject A152 = C17880vN.A15();
            A152.put("class", cls.getCanonicalName());
            AnonymousClass8BS.A1C(obj, "string", A152);
            return A152;
        }
    }

    public static JSONObject A01(Bundle bundle) {
        JSONObject A15 = C17880vN.A15();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            Object obj = bundle.get(A0v);
            if (A0v == null) {
                A0v = "null";
            }
            A15.put(A0v, A00(obj));
        }
        return A15;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    AnonymousClass1W0 r2 = new AnonymousClass1W0(intent);
                    C27411Vz r1 = this.A01;
                    if (!r1.A00.equals(r2)) {
                        r1.A00 = r2;
                        AnonymousClass35V.A00(r1, r2, 1);
                        C17900vP.A0Y(r2, "battery changed; newEvent=", AnonymousClass000.A10());
                        return;
                    }
                    return;
                }
                break;
            case -1209048666:
                if (action.equals("com.samsung.android.action.WARNING_NOTIFICATION")) {
                    String str = intent.getPackage();
                    if (str == null || str.equals(context.getPackageName())) {
                        C170928qt r22 = new C170928qt();
                        if (intent.getDataString() != null) {
                            r22.A00 = intent.getDataString();
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            extras.keySet();
                            try {
                                r22.A01 = extras.toString();
                                r22.A02 = A01(extras).toString();
                            } catch (BadParcelableException | JSONException e) {
                                Log.e("battery-receiver/samsung-warning/unable-to-serialize-extras", e);
                            }
                        }
                        this.A04.CC7(r22);
                        return;
                    }
                    return;
                }
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    A02(this);
                    return;
                }
                break;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unexpected action: ");
        throw AnonymousClass001.A12(intent.getAction(), A10);
    }
}
