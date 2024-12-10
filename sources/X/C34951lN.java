package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import com.whatsapp.waffle.accountlinking.clientcache.WaffleClientCacheImpl$maybeClearExpiredCacheAndForceSync$1;
import com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher;
import com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheDataFetcher$fetchCacheData$1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lN  reason: invalid class name and case insensitive filesystem */
public class C34951lN {
    public static final String A08;
    public SharedPreferences A00;
    public Boolean A01;
    public final AnonymousClass11P A02;
    public final C34961lO A03;
    public final C18030ve A04;
    public final C18010vc A05;
    public final AnonymousClass10I A06;
    public final WaffleCacheDataFetcher A07;

    public C34951lN(C34961lO r2, AnonymousClass11P r3, C18030ve r4, C18010vc r5, AnonymousClass10I r6, WaffleCacheDataFetcher waffleCacheDataFetcher) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r5, 5);
        this.A02 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r2;
        this.A05 = r5;
        this.A07 = waffleCacheDataFetcher;
    }

    public static final synchronized void A01(C34951lN r4) {
        synchronized (r4) {
            r4.A04().edit().putLong("last_cache_update_time", AnonymousClass11P.A01(r4.A02)).apply();
        }
    }

    public static final synchronized void A02(C34951lN r1, String str) {
        synchronized (r1) {
            r1.A04().edit().remove(str).apply();
        }
    }

    public final synchronized SharedPreferences A04() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A05(A08);
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return sharedPreferences;
    }

    public Boolean A05() {
        if (!A07() || A03(this)) {
            return null;
        }
        return Boolean.valueOf(A04().getBoolean("is_paused", false));
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19620yd.A09);
        sb.append("_waffle_client_cache");
        A08 = sb.toString();
    }

    public static /* synthetic */ AnonymousClass6U6 A00(C34951lN r12) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("WaffleClientCacheImpl/fetchDataFromServer called by ");
        sb.append("wa_android_waffle");
        C18070vi.A0d(sb.toString(), 0);
        WaffleCacheDataFetcher waffleCacheDataFetcher = r12.A07;
        C34971lQ r0 = waffleCacheDataFetcher.A00;
        if (r0 != null) {
            AnonymousClass00H r10 = waffleCacheDataFetcher.A06;
            if (r10 != null) {
                AnonymousClass00H r11 = waffleCacheDataFetcher.A05;
                if (r11 != null) {
                    AnonymousClass10E r1 = r0.A00.A00;
                    AnonymousClass181 r4 = (AnonymousClass181) r1.AA9.get();
                    C19830z4 r5 = (C19830z4) r1.ABl.get();
                    AnonymousClass00H A002 = C000200d.A00(r1.A0n);
                    AnonymousClass6U6 r13 = (AnonymousClass6U6) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new WaffleCacheDataFetcher$fetchCacheData$1(waffleCacheDataFetcher, new AnonymousClass6O2(r4, r5, (C18030ve) r1.A04.get(), (C31611fq) r1.A4Q.get(), (AnonymousClass11W) r1.ABB.get(), A002, r10, r11), (C30391dr) null));
                    if (r13 instanceof AnonymousClass6OA) {
                        Object obj = ((AnonymousClass6OA) r13).A00;
                        if (obj == null) {
                            Log.w(C31081ez.A00("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onSuccess Empty response, clearing cache"));
                            r12.A04().edit().clear().apply();
                        } else {
                            C62432rO r3 = (C62432rO) obj;
                            synchronized (r12) {
                                SharedPreferences.Editor edit = r12.A04().edit();
                                String str2 = r3.A00;
                                edit.putString("crossposting_destination", str2).putString("crossposting_destination_fb", str2).putString("crossposting_destination_ig", r3.A01).putLong("last_cache_update_time", AnonymousClass11P.A01(r12.A02)).apply();
                            }
                        }
                        return new AnonymousClass6OA(true);
                    } else if ((r13 instanceof AnonymousClass6OB) || (r13 instanceof AnonymousClass6O9)) {
                        C18070vi.A0z(r13, "null cannot be cast to non-null type com.whatsapp.waffle.coroutine.AwaitResult.Error<com.whatsapp.waffle.accountlinking.clientcache.graphql.WaffleCacheQueryResponse?>");
                        return new AnonymousClass6OB(((AnonymousClass6OB) r13).A00, true);
                    } else {
                        throw new AnonymousClass3EW();
                    }
                } else {
                    str = "waffleLinkedRequestExecutorLazy";
                }
            } else {
                str = "wfalManagerLazy";
            }
        } else {
            str = "graphqlRequestFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final boolean A03(C34951lN r7) {
        long j = r7.A04().getLong("last_cache_update_time", 0);
        long A002 = (long) C18020vd.A00(C18040vf.A02, r7.A04, 1101);
        if (j == 0 || AnonymousClass11P.A01(r7.A02) - j <= TimeUnit.HOURS.toMillis(A002)) {
            return false;
        }
        r7.A04().edit().clear().apply();
        AnonymousClass4GT.A00(AnonymousClass1OR.A00, new WaffleClientCacheImpl$maybeClearExpiredCacheAndForceSync$1(r7, (C30391dr) null));
        return true;
    }

    public void A06(Boolean bool) {
        if (A07()) {
            synchronized (this) {
                if (bool == null) {
                    A02(this, "is_paused");
                } else {
                    A04().edit().putBoolean("is_paused", bool.booleanValue()).apply();
                }
                A01(this);
            }
        }
    }

    public final boolean A07() {
        Boolean bool = this.A01;
        if (bool == null) {
            Boolean bool2 = C17970vW.A03;
            bool = false;
            this.A01 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        if ("wa_android_waffle".length() != 0) {
            String A012 = C18020vd.A01(C18040vf.A02, this.A04, 1010);
            C18070vi.A0X(A012);
            if (A012.length() == 0) {
                return false;
            }
            try {
                JSONArray jSONArray = new JSONObject(A012).getJSONArray("client_cache");
                C18070vi.A0b(jSONArray);
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    try {
                        if ("wa_android_waffle".equalsIgnoreCase(jSONArray.getString(i))) {
                            return true;
                        }
                        i++;
                    } catch (JSONException e) {
                        C17960vV.A0B(e);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
