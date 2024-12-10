package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0vd  reason: invalid class name and case insensitive filesystem */
public abstract class C18020vd {
    public Handler A00;
    public C146747Ql A01;
    public AnonymousClass18K A02;
    public final SharedPreferences A03;
    public final AnonymousClass10U A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap(512);
    public final ConcurrentHashMap A09 = new ConcurrentHashMap(512);

    public synchronized void A0L(SharedPreferences.Editor editor, Set set) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", set);
        editor.apply();
        if (!A05(C18040vf.A02, this, 12391)) {
            AnonymousClass188 r3 = (AnonymousClass188) this.A07.get();
            String join = TextUtils.join(",", set);
            C18070vi.A0d(r3, 0);
            r3.CHx(join, 5029, 0);
            r3.CHx(join, 5029, 1);
            r3.CHx(join, 5029, 3);
            r3.CHx(join, 5029, 2);
        }
    }

    public static void A03(Intent intent, AnonymousClass1E7 r3, C18020vd r4) {
        if (A05(C18040vf.A01, r4, 8573)) {
            intent.putExtra("extra_contact_is_lid", C22971Dz.A0U(r3.A0J));
        }
    }

    public static boolean A04(C88654aI r2) {
        return A05(C18040vf.A02, r2.A02.A00, 9064);
    }

    public static boolean A06(C18020vd r2) {
        return A05(C18040vf.A02, r2, 4921);
    }

    public static boolean A07(C32821ho r2) {
        C18030ve r22 = r2.A01;
        C18070vi.A0d(r22, 0);
        return A05(C18040vf.A02, r22, 11380);
    }

    public float A0E(int i) {
        return A0F(C18040vf.A02, i);
    }

    public int A0G(int i) {
        return A00(C18040vf.A02, this, i);
    }

    public Object A0H(C18040vf r3, int i) {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof AnonymousClass19D) {
            concurrentHashMap = ((AnonymousClass19D) this).A01;
        } else if (r3.A00) {
            concurrentHashMap = this.A08;
        } else {
            concurrentHashMap = this.A09;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    public String A0I(int i) {
        return A01(C18040vf.A02, this, i);
    }

    public JSONObject A0J(int i) {
        return A02(C18040vf.A02, this, i);
    }

    public void A0K() {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof AnonymousClass19D) {
            concurrentHashMap = ((AnonymousClass19D) this).A01;
        } else {
            concurrentHashMap = this.A09;
        }
        concurrentHashMap.clear();
    }

    public void A0M(String str) {
        AnonymousClass016 r5;
        if (!(this instanceof AnonymousClass19D)) {
            SharedPreferences sharedPreferences = this.A03;
            String string = sharedPreferences.getString(str, (String) null);
            if (!TextUtils.isEmpty(string)) {
                Set<String> stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                if (stringSet == null) {
                    r5 = new AnonymousClass016(0);
                } else {
                    r5 = new AnonymousClass016((Collection) stringSet);
                }
                if (!r5.contains(string)) {
                    r5.add(string);
                    A0L(sharedPreferences.edit(), r5);
                    C18040vf r4 = C18040vf.A02;
                    if (A05(r4, this, 3099)) {
                        if (this.A00 == null) {
                            this.A00 = new Handler(Looper.getMainLooper());
                            this.A01 = new C146747Ql(this, 18);
                        }
                        long millis = TimeUnit.SECONDS.toMillis((long) A00(r4, this, 3100));
                        this.A00.removeCallbacks(this.A01);
                        this.A00.postDelayed(this.A01, millis);
                    }
                    if (A05(r4, this, 10230)) {
                        C61542pr r6 = (C61542pr) this.A06.get();
                        r6.A02.get();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (C18070vi.A18(C17960vV.A01, true) || elapsedRealtime - r6.A00 < 1000) {
                            Handler handler = r6.A01;
                            handler.removeCallbacksAndMessages((Object) null);
                            handler.postDelayed(new C146797Qq(r6, r5, 6), 1000);
                            return;
                        }
                        C61542pr.A00(r6, r5, false);
                    }
                }
            }
        }
    }

    public boolean A0N(int i) {
        return A05(C18040vf.A02, this, i);
    }

    public boolean A0O(C18040vf r2) {
        return A05(r2, this, 9331);
    }

    public C18020vd(AnonymousClass10U r3, C18010vc r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, String str) {
        this.A05 = r5;
        this.A04 = r3;
        this.A07 = r6;
        this.A03 = r4.A05(str);
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C18040vf r4, X.C18020vd r5, int r6) {
        /*
            java.lang.Object r0 = r5.A0H(r4, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            monitor-enter(r5)
            java.lang.Object r0 = r5.A0H(r4, r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x001c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "_expo_key"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            r5.A0M(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r5 instanceof X.C18030ve     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0076
            r0 = r5
            X.0ve r0 = (X.C18030ve) r0     // Catch:{ all -> 0x0096 }
            X.10w r0 = r0.A02     // Catch:{ all -> 0x0096 }
        L_0x0039:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007f
            android.content.SharedPreferences r2 = r5.A03     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0096 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0096 }
            int r2 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r5 instanceof X.AnonymousClass19D     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0069
            r0 = r5
            X.19D r0 = (X.AnonymousClass19D) r0     // Catch:{ all -> 0x0096 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A01     // Catch:{ all -> 0x0096 }
        L_0x0060:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            goto L_0x007e
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A09     // Catch:{ all -> 0x0096 }
            goto L_0x0060
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0067
        L_0x0076:
            r0 = r5
            X.19D r0 = (X.AnonymousClass19D) r0     // Catch:{ all -> 0x0096 }
            X.0ve r0 = r0.A00     // Catch:{ all -> 0x0096 }
            X.10w r0 = r0.A02     // Catch:{ all -> 0x0096 }
            goto L_0x0039
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "Unknown IntField: "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0096 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0096 }
            r0.<init>(r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020vd.A00(X.0vf, X.0vd, int):int");
    }

    public static String A01(C18040vf r4, C18020vd r5, int i) {
        String str;
        C201110w r0;
        ConcurrentHashMap concurrentHashMap;
        String str2 = (String) r5.A0H(r4, i);
        if (str2 != null) {
            return str2;
        }
        synchronized (r5) {
            str = (String) r5.A0H(r4, i);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                r5.A0M(sb.toString());
                if (r5 instanceof C18030ve) {
                    r0 = ((C18030ve) r5).A04;
                } else {
                    r0 = ((AnonymousClass19D) r5).A00.A04;
                }
                Integer valueOf = Integer.valueOf(i);
                String str3 = (String) r0.get(valueOf);
                if (str3 != null) {
                    str = r5.A03.getString(Integer.toString(i), str3);
                    if (str != null) {
                        if (r4.A00) {
                            concurrentHashMap = r5.A08;
                        } else if (r5 instanceof AnonymousClass19D) {
                            concurrentHashMap = ((AnonymousClass19D) r5).A01;
                        } else {
                            concurrentHashMap = r5.A09;
                        }
                        concurrentHashMap.put(valueOf, str);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown StringField: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return str;
    }

    public static JSONObject A02(C18040vf r6, C18020vd r7, int i) {
        C201110w r0;
        ConcurrentHashMap concurrentHashMap;
        JSONObject jSONObject = (JSONObject) r7.A0H(r6, i);
        if (jSONObject != null) {
            return jSONObject;
        }
        synchronized (r7) {
            JSONObject jSONObject2 = (JSONObject) r7.A0H(r6, i);
            if (jSONObject2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                r7.A0M(sb.toString());
                if (r7 instanceof C18030ve) {
                    r0 = ((C18030ve) r7).A03;
                } else {
                    r0 = ((AnonymousClass19D) r7).A00.A03;
                }
                Integer valueOf = Integer.valueOf(i);
                String str = (String) r0.get(valueOf);
                if (str != null) {
                    String num = Integer.toString(i);
                    SharedPreferences sharedPreferences = r7.A03;
                    String string = sharedPreferences.getString(num, (String) null);
                    if (!TextUtils.isEmpty(string)) {
                        str = string;
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject(str);
                        if (r6.A00) {
                            concurrentHashMap = r7.A08;
                        } else if (r7 instanceof AnonymousClass19D) {
                            concurrentHashMap = ((AnonymousClass19D) r7).A01;
                        } else {
                            concurrentHashMap = r7.A09;
                        }
                        concurrentHashMap.put(valueOf, jSONObject3);
                        return jSONObject3;
                    } catch (JSONException e) {
                        sharedPreferences.edit().remove(num).apply();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("AbstractABProps/invalid json format for property; prefKey=");
                        sb2.append(num);
                        sb2.append("; value=");
                        sb2.append(str);
                        Log.e(sb2.toString(), e);
                        jSONObject2 = new JSONObject();
                        return jSONObject2;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown JsonField: ");
                    sb3.append(i);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C18040vf r4, X.C18020vd r5, int r6) {
        /*
            java.lang.Object r0 = r5.A0H(r4, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.booleanValue()
            return r0
        L_0x000d:
            monitor-enter(r5)
            java.lang.Object r0 = r5.A0H(r4, r6)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "_expo_key"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            r5.A0M(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r5 instanceof X.C18030ve     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0076
            r0 = r5
            X.0ve r0 = (X.C18030ve) r0     // Catch:{ all -> 0x0096 }
            X.10w r0 = r0.A00     // Catch:{ all -> 0x0096 }
        L_0x0039:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007f
            android.content.SharedPreferences r2 = r5.A03     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0096 }
            boolean r2 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r5 instanceof X.AnonymousClass19D     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0069
            r0 = r5
            X.19D r0 = (X.AnonymousClass19D) r0     // Catch:{ all -> 0x0096 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A01     // Catch:{ all -> 0x0096 }
        L_0x0060:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            goto L_0x007e
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A09     // Catch:{ all -> 0x0096 }
            goto L_0x0060
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0067
        L_0x0076:
            r0 = r5
            X.19D r0 = (X.AnonymousClass19D) r0     // Catch:{ all -> 0x0096 }
            X.0ve r0 = r0.A00     // Catch:{ all -> 0x0096 }
            X.10w r0 = r0.A00     // Catch:{ all -> 0x0096 }
            goto L_0x0039
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "Unknown BooleanField: "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0096 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0096 }
            r0.<init>(r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020vd.A05(X.0vf, X.0vd, int):boolean");
    }

    public float A0F(C18040vf r5, int i) {
        C201110w r0;
        float f;
        ConcurrentHashMap concurrentHashMap;
        Number number = (Number) A0H(r5, i);
        if (number != null) {
            return number.floatValue();
        }
        synchronized (this) {
            Float f2 = (Float) A0H(r5, i);
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                A0M(sb.toString());
                if (this instanceof C18030ve) {
                    r0 = ((C18030ve) this).A01;
                } else {
                    r0 = ((AnonymousClass19D) this).A00.A01;
                }
                Integer valueOf = Integer.valueOf(i);
                Float f3 = (Float) r0.get(valueOf);
                if (f3 != null) {
                    f = this.A03.getFloat(Integer.toString(i), f3.floatValue());
                    if (this instanceof AnonymousClass19D) {
                        concurrentHashMap = ((AnonymousClass19D) this).A01;
                    } else {
                        concurrentHashMap = this.A09;
                    }
                    concurrentHashMap.put(valueOf, Float.valueOf(f));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown FloatField: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return f;
    }
}
