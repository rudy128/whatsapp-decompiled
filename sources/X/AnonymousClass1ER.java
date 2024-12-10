package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ER  reason: invalid class name */
public class AnonymousClass1ER extends Handler {
    public File A00;
    public final C219317y A01;
    public final AnonymousClass118 A02;

    public static synchronized void A00(AnonymousClass1ER r8) {
        synchronized (r8) {
            if (r8.A00 == null) {
                File file = new File(r8.A02.A00.getFilesDir(), "network_statistics.json");
                r8.A00 = file;
                if (file.exists()) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(AnonymousClass1EW.A00(file)));
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tx_data");
                            JSONObject jSONObject3 = jSONObject.getJSONObject("rx_data");
                            HashMap hashMap = C61112p9.A00;
                            hashMap.clear();
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(Integer.valueOf(Integer.parseInt(next)), Long.valueOf(jSONObject3.getLong(next)));
                            }
                            HashMap hashMap2 = C61112p9.A01;
                            hashMap2.clear();
                            Iterator<String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                hashMap2.put(Integer.valueOf(Integer.parseInt(next2)), Long.valueOf(jSONObject2.getLong(next2)));
                            }
                        } catch (JSONException e) {
                            Log.e("networkStatsHandler/load: error parsing JSON", e);
                        }
                    } catch (IOException e2) {
                        Log.e("networkStatsHandler/load: I/O error", e2);
                    } catch (JSONException e3) {
                        Log.e("networkStatsHandler/load: JSON error", e3);
                        file.delete();
                    }
                }
            }
        }
    }

    public synchronized void handleMessage(Message message) {
        AnonymousClass2QW r2;
        long j;
        int i;
        long j2;
        int i2;
        A00(this);
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = message.arg1;
                    j2 = (long) message.arg2;
                } else if (i3 == 4) {
                    i = message.arg1;
                    j = message.getData().getLong("long_value");
                } else if (i3 == 5) {
                    i2 = message.arg1;
                    j2 = message.getData().getLong("long_value");
                }
                HashMap hashMap = C61112p9.A00;
                Integer valueOf = Integer.valueOf(i2);
                Long l = (Long) hashMap.get(valueOf);
                if (l == null) {
                    l = 0L;
                }
                hashMap.put(valueOf, Long.valueOf(l.longValue() + j2));
            } else {
                i = message.arg1;
                j = (long) message.arg2;
            }
            HashMap hashMap2 = C61112p9.A01;
            Integer valueOf2 = Integer.valueOf(i);
            Long l2 = (Long) hashMap2.get(valueOf2);
            if (l2 == null) {
                l2 = 0L;
            }
            hashMap2.put(valueOf2, Long.valueOf(l2.longValue() + j));
        } else {
            C17960vV.A07(this.A00);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("rx_data", C61112p9.A00(C61112p9.A00));
                jSONObject.putOpt("tx_data", C61112p9.A00(C61112p9.A01));
                String obj = jSONObject.toString();
                try {
                    r2 = new AnonymousClass2QW(this.A01.A00, this.A00);
                    r2.write(obj.getBytes());
                    r2.close();
                } catch (IOException e) {
                    Log.e("networkStatsHandler/save: error saving", e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            } catch (JSONException e2) {
                Log.e("networkStatistics/save: error converting to JSON", e2);
            }
        }
        return;
        throw th;
    }

    public AnonymousClass1ER(Looper looper, AnonymousClass118 r2, C219317y r3) {
        super(looper);
        this.A02 = r2;
        this.A01 = r3;
    }
}
