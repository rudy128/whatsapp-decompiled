package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.10k  reason: invalid class name and case insensitive filesystem */
public class C199910k implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public Map A04 = new HashMap();
    public boolean A05;
    public final int A06;
    public final AnonymousClass10Y A07;
    public final C199810j A08;
    public final AnonymousClass10X A09;
    public final AnonymousClass10Z A0A;
    public final AnonymousClass00H A0B;
    public final Object A0C = new Object();
    public final Object A0D = new Object();
    public final String A0E = UUID.randomUUID().toString();
    public final String A0F;
    public final Map A0G = new HashMap();
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final Handler A0K = new Handler(Looper.getMainLooper());

    private void A00() {
        if (this.A0J && !this.A05 && !this.A0H) {
            Boolean bool = C17960vV.A01;
        }
        while (!this.A05) {
            try {
                this.A0C.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    private void A01() {
        A00();
        ((C200010l) this.A0B.get()).A00(this.A0F, "get");
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A0C) {
            A01();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A0C) {
            A00();
        }
        return new C24041Iq(this);
    }

    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A0C) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        synchronized (this.A0C) {
            A01();
            try {
                Boolean bool = (Boolean) this.A04.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return z;
    }

    public float getFloat(String str, float f) {
        synchronized (this.A0C) {
            A00();
            try {
                Float f2 = (Float) this.A04.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return f;
    }

    public int getInt(String str, int i) {
        synchronized (this.A0C) {
            A01();
            try {
                Integer num = (Integer) this.A04.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return i;
    }

    public long getLong(String str, long j) {
        synchronized (this.A0C) {
            A01();
            try {
                Long l = (Long) this.A04.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return j;
    }

    public String getString(String str, String str2) {
        synchronized (this.A0C) {
            A01();
            try {
                String str3 = (String) this.A04.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return str2;
    }

    public Set getStringSet(String str, Set set) {
        synchronized (this.A0C) {
            A01();
            try {
                Set set2 = (Set) this.A04.get(str);
                if (set2 != null) {
                    set = set2;
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0E;
        Handler handler = this.A0K;
        synchronized (this.A0C) {
            Map map = this.A0G;
            C17960vV.A07(str);
            WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                map.put(str, weakHashMap);
            }
            C17960vV.A07(onSharedPreferenceChangeListener);
            C17960vV.A07(handler);
            weakHashMap.put(onSharedPreferenceChangeListener, handler);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0E;
        synchronized (this.A0C) {
            Map map = this.A0G;
            C17960vV.A07(str);
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                C17960vV.A07(onSharedPreferenceChangeListener);
                map2.remove(onSharedPreferenceChangeListener);
            }
        }
    }

    public C199910k(AnonymousClass10Y r5, C199810j r6, AnonymousClass10X r7, AnonymousClass10Z r8, AnonymousClass00H r9, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A0F = str;
        this.A08 = r6;
        this.A0J = z;
        this.A0H = z2;
        this.A0I = z3;
        this.A09 = r7;
        this.A06 = i;
        this.A07 = r5;
        this.A0A = r8;
        this.A0B = r9;
        C200010l r3 = (C200010l) r9.get();
        Boolean valueOf = Boolean.valueOf(r8.A03);
        if ((r3.A01 == null || r3.A00 == null) && C18070vi.A18(valueOf, true)) {
            r3.A01 = new ConcurrentHashMap();
            r3.A00 = new ConcurrentHashMap();
            r3.A02 = new ConcurrentHashMap();
            r3.A03 = true;
        }
        synchronized (this.A0C) {
            this.A05 = false;
        }
        this.A09.A00(new C448925e(this, 2), this.A06, false);
    }
}
