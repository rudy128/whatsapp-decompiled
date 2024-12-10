package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A2o  reason: case insensitive filesystem */
public class C20000A2o {
    public AnonymousClass9AW A00;
    public final C002100z A01;

    public Object A01(C180629Nh r10, String str, long j) {
        AnonymousClass9Z5 A002 = A00(str);
        AnonymousClass9NR r7 = (AnonymousClass9NR) A002.A00.A04(r10.A00());
        if (r7 != null) {
            if (j <= 0 || r7.A00 >= j) {
                long j2 = r7.A01;
                if (j2 == -1 || System.currentTimeMillis() < r7.A00 + j2) {
                    Object obj = r7.A02;
                    if (obj != null) {
                        return obj;
                    }
                }
            }
            A05(r10, str);
        }
        return null;
    }

    private AnonymousClass9Z5 A00(String str) {
        AnonymousClass9Z5 r0;
        C002100z r3 = this.A01;
        AnonymousClass9Z5 r02 = (AnonymousClass9Z5) r3.A04(str);
        if (r02 != null) {
            return r02;
        }
        synchronized (r3) {
            r0 = (AnonymousClass9Z5) r3.A04(str);
            if (r0 == null) {
                AnonymousClass9AW r03 = this.A00;
                int A02 = C24191Jf.A02(r03.A02, r03.A03);
                int i = 50;
                if (A02 < 2016) {
                    i = 10;
                    if (A02 >= 2014) {
                        i = 30;
                    }
                }
                r0 = new AnonymousClass9Z5(str, i);
                r3.A08(str, r0);
            }
        }
        return r0;
    }

    public Map A02() {
        AnonymousClass9Z5 r0 = (AnonymousClass9Z5) this.A01.A04("ASYNC_COMPONENT");
        if (r0 != null) {
            return r0.A00.A06();
        }
        return C17880vN.A11();
    }

    public void A05(C180629Nh r6, String str) {
        AnonymousClass9Z5 r0 = (AnonymousClass9Z5) this.A01.A04(str);
        if (r0 != null) {
            r0.A00.A05(r6.A00());
        }
        AnonymousClass9AW r02 = this.A00;
        String A002 = r6.A00();
        A4A a4a = r02.A01;
        String A0Z = C17890vO.A0Z(A002, AnonymousClass000.A11(str), ':');
        AiK A003 = A4A.A00(a4a);
        if (A003 == null) {
            Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
        } else {
            try {
                A003.A0C(A0Z);
            } catch (IOException unused) {
                Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
            }
        }
        a4a.A00.remove(C17890vO.A0Z(A002, AnonymousClass000.A11(str), ':'));
        A4A.A01(a4a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.00z, X.8E3] */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.9NR] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.9Nn] */
    public C20000A2o(AnonymousClass9AW r16) {
        InputStreamReader inputStreamReader;
        ? r1 = new C002100z(10);
        this.A01 = r1;
        r1.A00 = new C21142AfD();
        AnonymousClass9AW r12 = r16;
        this.A00 = r12;
        r12.A00 = new AnonymousClass9Z4(this);
        A4A a4a = r12.A01;
        AiK A002 = A4A.A00(a4a);
        if (A002 != null) {
            HashMap A11 = C17880vN.A11();
            try {
                JSONArray jSONArray = new JSONArray(C108955ca.A0C(a4a.A01, "bloks").getString("bk_cache_lookup_map", "{}"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String obj = jSONArray.get(i).toString();
                    if (!(obj == null || obj.length() == 0)) {
                        try {
                            JSONObject A16 = C17880vN.A16(obj);
                            String string = A16.getString("shard-key");
                            String string2 = A16.getString("entry-key");
                            long j = A16.getLong("expiration-time");
                            long j2 = A16.getLong("create-time");
                            C18070vi.A0b(string);
                            C18070vi.A0b(string2);
                            C18070vi.A0j(string, string2);
                            ? obj2 = new Object();
                            obj2.A03 = string;
                            obj2.A02 = string2;
                            obj2.A01 = j;
                            obj2.A00 = j2;
                            if (System.currentTimeMillis() > j + j2) {
                                String A0Z = C17890vO.A0Z(string2, AnonymousClass000.A11(string), ':');
                                AiK A003 = A4A.A00(a4a);
                                if (A003 == null) {
                                    Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
                                } else {
                                    try {
                                        A003.A0C(A0Z);
                                    } catch (IOException unused) {
                                        Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
                                    }
                                }
                            } else {
                                A11.put(C17890vO.A0Z(string2, AnonymousClass000.A11(string), ':'), obj2);
                            }
                        } catch (JSONException unused2) {
                            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/fromJsonString threw exception");
                        }
                    }
                }
            } catch (JSONException unused3) {
                Log.e("BkCacheSaveOnDiskHelper/syncLookUpMapToDisk parsing lookUpMap from disk threw exception");
            }
            a4a.A00 = A11;
            A4A.A01(a4a);
            Iterator A0l = C17890vO.A0l(a4a.A00);
            while (A0l.hasNext()) {
                C180689Nn r10 = (C180689Nn) A0l.next();
                try {
                    StringBuilder A10 = AnonymousClass000.A10();
                    String str = r10.A03;
                    C108975cc.A14(A10, str);
                    C21326AiB A0B = A002.A0B(AnonymousClass000.A0y(r10.A02, A10));
                    if (A0B != null) {
                        inputStreamReader = new InputStreamReader(A0B.A00[0], AiK.A0E);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            stringWriter.write(cArr, 0, read);
                        }
                        String obj3 = stringWriter.toString();
                        inputStreamReader.close();
                        if (!(obj3 == null || obj3.length() == 0)) {
                            C178129Bx r6 = new C178129Bx(r10);
                            long j3 = r10.A01;
                            long j4 = r10.A00;
                            ? obj4 = new Object();
                            obj4.A02 = obj3;
                            obj4.A01 = j3;
                            obj4.A00 = j4;
                            obj4.A03 = false;
                            A03(r6, obj4, str);
                        }
                    } else {
                        Log.i("BkCacheSaveOnDiskHelper/initDiskCache snapshot is null");
                    }
                } catch (IOException unused4) {
                    Log.e("BkCacheSaveOnDiskHelper/initDiskCache unable to fetch content from disk");
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.9Nn] */
    public void A03(C180629Nh r10, AnonymousClass9NR r11, String str) {
        AnonymousClass9HU r2;
        String str2;
        A00(str).A00.A08(r10.A00(), r11);
        if ((r11.A02 instanceof String) && r11.A03) {
            AnonymousClass9AW r0 = this.A00;
            String A002 = r10.A00();
            A4A a4a = r0.A01;
            AiK A003 = A4A.A00(a4a);
            if (A003 == null) {
                str2 = "BkCacheSaveOnDiskHelper/saveOnDisk disk cache is not setup for bk cache";
            } else {
                Object obj = r11.A02;
                if (obj == null) {
                    str2 = "BkCacheSaveOnDiskHelper/saveOnDisk invalid value in CacheValue";
                } else {
                    try {
                        StringBuilder A10 = AnonymousClass000.A10();
                        C108975cc.A14(A10, str);
                        C192399oK A004 = AiK.A00(A003, AnonymousClass000.A0y(A002, A10));
                        String str3 = (String) obj;
                        OutputStreamWriter outputStreamWriter = null;
                        try {
                            r2 = A004.A00();
                            try {
                                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(r2, AiK.A0E);
                                try {
                                    outputStreamWriter2.write(str3);
                                    AiK.A06(outputStreamWriter2);
                                    AiK.A06(r2);
                                    A004.A01();
                                    Map map = a4a.A00;
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    C108975cc.A14(A102, str);
                                    String A0y = AnonymousClass000.A0y(A002, A102);
                                    long j = r11.A01;
                                    long j2 = r11.A00;
                                    C18070vi.A0j(str, A002);
                                    ? obj2 = new Object();
                                    obj2.A03 = str;
                                    obj2.A02 = A002;
                                    obj2.A01 = j;
                                    obj2.A00 = j2;
                                    map.put(A0y, obj2);
                                    A4A.A01(a4a);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    outputStreamWriter = outputStreamWriter2;
                                    AiK.A06(outputStreamWriter);
                                    AiK.A06(r2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                AiK.A06(outputStreamWriter);
                                AiK.A06(r2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = null;
                            AiK.A06(outputStreamWriter);
                            AiK.A06(r2);
                            throw th;
                        }
                    } catch (IOException unused) {
                        Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to save the bk-cache");
                        return;
                    }
                }
            }
            Log.e(str2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.9NR] */
    public void A04(C180629Nh r7, Object obj, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        ? obj2 = new Object();
        obj2.A02 = obj;
        obj2.A01 = -1;
        obj2.A00 = currentTimeMillis;
        obj2.A03 = false;
        A03(r7, obj2, str);
    }
}
