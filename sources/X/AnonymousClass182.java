package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.182  reason: invalid class name */
public class AnonymousClass182 {
    public AnonymousClass18K A00 = null;
    public Map A01 = null;
    public SharedPreferences A02;
    public SharedPreferences A03;
    public final AnonymousClass11P A04;
    public final C18010vc A05;

    private synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A03;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A05("psid_store");
            this.A03 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public static synchronized SharedPreferences A01(AnonymousClass182 r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A02;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A05.A05("ps_mini_buffer_sequence_number_store");
                r2.A02 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public synchronized String A03(int i) {
        String str;
        IllegalArgumentException illegalArgumentException;
        if (i == 0) {
            str = "00000000-0000-0000-0000-000000000000";
        } else {
            Map map = this.A01;
            if (map == null) {
                map = A04();
                this.A01 = map;
            }
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                C55332fb r5 = (C55332fb) this.A01.get(valueOf);
                if (r5 != null) {
                    int i2 = r5.A04;
                    if (i2 == -1) {
                        str = r5.A03;
                    } else {
                        long A012 = AnonymousClass11P.A01(this.A04) / 86400000;
                        if (A012 - r5.A02 >= ((long) i2)) {
                            String str2 = r5.A03;
                            r5.A03 = UUID.randomUUID().toString();
                            r5.A02 = A012;
                            r5.A00 = 0;
                            r5.A01 = A012;
                            this.A01.put(valueOf, r5);
                            A05(r5, valueOf);
                            A01(this).edit().remove(str2).apply();
                            A02(2, i, i2);
                        }
                        str = r5.A03;
                    }
                } else {
                    illegalArgumentException = new IllegalArgumentException("Invalid psIdKey");
                }
            } else {
                illegalArgumentException = new IllegalArgumentException("Invalid psIdKey");
            }
            throw illegalArgumentException;
        }
        return str;
    }

    public synchronized Map A04() {
        Map<String, ?> all = A00().getAll();
        this.A01 = new HashMap();
        for (Map.Entry next : all.entrySet()) {
            try {
                Integer valueOf = Integer.valueOf((String) next.getKey());
                try {
                    JSONObject jSONObject = new JSONObject((String) next.getValue());
                    this.A01.put(valueOf, new C55332fb(jSONObject.getString("psIdValue"), jSONObject.getInt("rotationInDays"), jSONObject.getInt("beaconEvtNumber"), jSONObject.getLong("lastRotationTimeUtcDay"), jSONObject.optLong("beaconUpdateDay", 0)));
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("psidstore/loadFromFile bad json ");
                    sb.append(e);
                    Log.e(sb.toString());
                    A00().edit().remove((String) next.getKey()).apply();
                }
            } catch (NumberFormatException unused) {
                Log.e("psidstore/loadfromfile ps-id key is corrupted");
            }
        }
        return this.A01;
    }

    public synchronized void A05(C55332fb r5, Integer num) {
        Map map = this.A01;
        if (map == null) {
            map = A04();
            this.A01 = map;
        }
        if (!map.containsKey(num)) {
            throw new IllegalArgumentException("Invalid PS-ID key");
        } else if (r5 == null) {
            this.A01.remove(num);
            A00().edit().remove(num.toString()).apply();
        } else {
            this.A01.put(num, r5);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("psIdValue", r5.A03);
                jSONObject.put("rotationInDays", r5.A04);
                jSONObject.put("lastRotationTimeUtcDay", r5.A02);
                jSONObject.put("beaconEvtNumber", r5.A00);
                jSONObject.put("beaconUpdateDay", r5.A01);
                A00().edit().putString(num.toString(), jSONObject.toString()).apply();
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("psidstore/updatePsIdRecord JEX ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        return;
    }

    private void A02(int i, int i2, int i3) {
        if (this.A00 != null) {
            AnonymousClass2FZ r2 = new AnonymousClass2FZ();
            r2.A00 = Integer.valueOf(i);
            r2.A01 = Long.valueOf((long) i2);
            r2.A02 = Long.valueOf((long) i3);
            this.A00.CC4(r2);
        }
    }

    public synchronized void A06(List list, String str) {
        int i;
        List list2;
        String str2;
        int i2;
        synchronized (this) {
            Map map = this.A01;
            if (map == null) {
                map = A04();
                this.A01 = map;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = map.keySet().iterator();
            while (true) {
                i = 0;
                list2 = list;
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                while (true) {
                    if (i < list2.size()) {
                        if (num.intValue() == ((C54332dy) list2.get(i)).A00) {
                            break;
                        }
                        i++;
                    } else {
                        arrayList.add(num);
                        break;
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Integer num2 = (Integer) arrayList.get(i3);
                C55332fb r0 = (C55332fb) this.A01.get(num2);
                if (r0 != null) {
                    i2 = r0.A04;
                    A01(this).edit().remove(r0.A03).apply();
                } else {
                    i2 = 0;
                }
                A05((C55332fb) null, num2);
                A02(3, num2.intValue(), i2);
            }
            long A012 = AnonymousClass11P.A01(this.A04);
            long currentTimeMillis = System.currentTimeMillis() / 86400000;
            while (i < list2.size()) {
                C54332dy r5 = (C54332dy) list2.get(i);
                if (!this.A01.containsKey(Integer.valueOf(r5.A00))) {
                    if (str == null || r5.A00 != 113760892) {
                        str2 = UUID.randomUUID().toString();
                        A02(1, r5.A00, r5.A01);
                    } else {
                        str2 = str;
                    }
                    C55332fb r11 = new C55332fb(str2, r5.A01, 0, A012 / 86400000, currentTimeMillis);
                    this.A01.put(Integer.valueOf(r5.A00), r11);
                    A05(r11, Integer.valueOf(r5.A00));
                }
                i++;
            }
        }
    }

    public AnonymousClass182(AnonymousClass11P r2, C18010vc r3) {
        this.A04 = r2;
        this.A05 = r3;
    }
}
