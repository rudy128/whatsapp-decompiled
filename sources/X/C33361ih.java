package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ih  reason: invalid class name and case insensitive filesystem */
public class C33361ih {
    public final AnonymousClass1QD A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final AnonymousClass11P A02;

    private void A00() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.A01.entrySet()) {
                String l = Long.toString(((Number) entry.getKey()).longValue());
                C198769ys r2 = (C198769ys) entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                C62212r1 r8 = r2.A08;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("update_count", r8.A00);
                jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A01);
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject3.toString());
                jSONObject2.put("state", r2.A03);
                jSONObject2.put("title", r2.A0F);
                jSONObject2.put("end_ts", r2.A04);
                jSONObject2.put("locale", r2.A0D);
                jSONObject2.put("start_ts", r2.A06);
                jSONObject2.put("terms_url", r2.A0E);
                jSONObject2.put("description", r2.A0B);
                jSONObject2.put("redeem_limit", r2.A05);
                jSONObject2.put("fine_print_url", r2.A0C);
                jSONObject2.put("interactive_sync_done", r2.A02);
                jSONObject2.put("kill_switch_info_viewed", r2.A00);
                jSONObject2.put("sender_maxed_info_viewed", r2.A01);
                jSONObject2.put("offer_amount", r2.A07.CPM().toString());
                AnonymousClass9N4 r0 = r2.A09;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("min_amount", r0.A00.CPM().toString());
                jSONObject2.put("payment", jSONObject4.toString());
                C197899xS r3 = r2.A0A;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("max_from_sender", r3.A00);
                jSONObject5.put("usync_pay_eligible_offers_includes_current_offer_id", r3.A01);
                jSONObject2.put("receiver", jSONObject5.toString());
                jSONObject.put(l, jSONObject2.toString());
            }
            AnonymousClass1QD r02 = this.A00;
            r02.A03().edit().putString("payment_incentive_offer_details", jSONObject.toString()).apply();
        } catch (JSONException unused) {
            this.A01.clear();
            this.A00.A03().edit().putString("payment_incentive_offer_details", (String) null).apply();
        }
    }

    public C198769ys A01(long j) {
        return (C198769ys) this.A01.get(Long.valueOf(j));
    }

    public void A02() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            if (((C198769ys) ((Map.Entry) it.next()).getValue()).A04 + TimeUnit.DAYS.toSeconds(14) < TimeUnit.MILLISECONDS.toSeconds(AnonymousClass11P.A01(this.A02))) {
                it.remove();
            }
        }
        A00();
    }

    public void A03() {
        AnonymousClass1QD r7 = this.A00;
        String string = r7.A03().getString("payment_incentive_offer_details", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                ConcurrentHashMap concurrentHashMap = this.A01;
                concurrentHashMap.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long A04 = C20099A7c.A04(next, 0);
                    if (A04 > 0) {
                        concurrentHashMap.put(Long.valueOf(A04), new C198769ys(jSONObject.getString(next)));
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentIncentiveOfferMap/loadFromSharedPref failed to load the current offer details");
                this.A01.clear();
                r7.A03().edit().putString("payment_incentive_offer_details", (String) null).apply();
            }
        }
    }

    public C33361ih(AnonymousClass11P r2, AnonymousClass1QD r3) {
        this.A02 = r2;
        this.A00 = r3;
    }

    public void A04(C198769ys r12, long j) {
        A03();
        ConcurrentHashMap concurrentHashMap = this.A01;
        concurrentHashMap.put(Long.valueOf(j), r12);
        for (int size = concurrentHashMap.size() - 2; size > 0; size--) {
            long j2 = 0;
            long j3 = Long.MAX_VALUE;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((Number) entry.getKey()).longValue() != j && ((C198769ys) entry.getValue()).A04 < j3) {
                    j2 = ((Number) entry.getKey()).longValue();
                    j3 = ((C198769ys) entry.getValue()).A04;
                }
            }
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        A00();
    }
}
