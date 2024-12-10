package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class A6H {
    public final AnonymousClass1LA A00;
    public final AnonymousClass11C A01;
    public final AXS A02;
    public final AZ6 A03;
    public final AnonymousClass1QE A04;
    public final A0B A05;

    private String A01(SubscriptionInfo subscriptionInfo) {
        boolean isEmpty;
        String A012;
        if (Build.VERSION.SDK_INT < 29) {
            return subscriptionInfo.getIccId();
        }
        AnonymousClass1QE r2 = this.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Sub Id : ");
        AnonymousClass8BV.A1F(r2, A10, subscriptionInfo.getSubscriptionId());
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(subscriptionInfo.getSubscriptionId());
        AXS axs = this.A02;
        synchronized (axs) {
            isEmpty = true ^ TextUtils.isEmpty(AXS.A09(axs, "device_binding_sim_iccid")[0]);
        }
        if (isEmpty) {
            A012 = "";
        } else {
            A012 = C17970vW.A01(this.A01.A0O());
        }
        return AnonymousClass000.A0y(A012, A102);
    }

    public int A03(C175758zE r19, String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        this.A04.A06("IndiaUpiSimSwapDetectionUtils : Check sim on version >= 22");
        SubscriptionManager A0J = this.A01.A0J();
        if (A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null || activeSubscriptionInfoList.isEmpty()) {
            this.A04.A06("IndiaUpiSimSwapDetectionUtils : No subscription info found");
            return 1;
        }
        String A0H = this.A02.A0H();
        JSONObject A15 = C17880vN.A15();
        JSONObject A152 = C17880vN.A15();
        int i = 1;
        boolean z = false;
        int i2 = 0;
        for (SubscriptionInfo next : activeSubscriptionInfoList) {
            JSONObject A153 = C17880vN.A15();
            JSONObject A154 = C17880vN.A15();
            String A012 = A01(next);
            String number = next.getNumber();
            AnonymousClass1QE r15 = this.A04;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("checkSimWithWaRegisteredNumberIsInstalled simId : ");
            A10.append(C20088A6q.A01(A012));
            A10.append(" | storedId : ");
            AnonymousClass8BV.A1E(r15, C20088A6q.A01(A0H), A10);
            boolean A002 = A0B.A00(this.A00, this.A03, number, str);
            AnonymousClass1QE r152 = this.A04;
            if (A002) {
                r152.A06("Phone matched");
                return 0;
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("checkSimWithWaRegisteredNumberIsInstalled Phone number not matched | sim number : ");
            A102.append(number);
            A102.append(" | waNumber : ");
            AnonymousClass8BV.A1E(r152, str, A102);
            if (TextUtils.isEmpty(number) && (TextUtils.isEmpty(A012) || TextUtils.isEmpty(A0H) || TextUtils.equals(A012, A0H))) {
                i = 0;
            }
            if (!z) {
                z = TextUtils.equals(A012, A0H);
            }
            try {
                A153.put("slotIndex", next.getSimSlotIndex());
                A153.put("simPhoneNumber", number);
                A153.put("storedId", A0H);
                A153.put("simId", A012);
                A153.put("waPhoneNumber", str);
                A154.put("isSimNumberEmpty", TextUtils.isEmpty(number));
                A154.put("isSimIdEmpty", TextUtils.isEmpty(A012));
                A154.put("isStoredIdEmpty", TextUtils.isEmpty(A0H));
                A154.put("isSimIdMatched", TextUtils.equals(A012, A0H));
                A154.put("isAddPaymentAttempted", z);
                A15.put(AnonymousClass001.A1I("subIndex_", AnonymousClass000.A10(), i2), A154);
                A152.put(AnonymousClass001.A1I("subIndex_", AnonymousClass000.A10(), i2), A153);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i2++;
        }
        if (i != 0 && z && activeSubscriptionInfoList.size() > 1) {
            i = 2;
        }
        this.A04.A06(AnonymousClass001.A1I("Fallback to ICCID match ", AnonymousClass000.A10(), i));
        if (i != 0) {
            C175758zE r2 = r19;
            r2.A02 = A152;
            r2.A03 = A15;
            r2.A00("SIM_SWAP", (List) null);
        }
        return i;
    }

    public String A04(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        SubscriptionManager A0J = this.A01.A0J();
        if (!(A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null)) {
            int A0B = this.A02.A0B();
            int i = 0;
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (A0B == next.getSubscriptionId()) {
                    i = next.getSimSlotIndex();
                }
                String A012 = A01(next);
                if (A0B.A00(this.A00, this.A03, next.getNumber(), str)) {
                    this.A04.A04("iccid matched number");
                    return A012;
                }
            }
            if (activeSubscriptionInfoList.size() > 0) {
                this.A04.A04("no matching phone number found, storing the selected iccid");
                return A01(activeSubscriptionInfoList.get(i));
            }
        }
        return null;
    }

    public A6H(AnonymousClass11C r1, AnonymousClass1QE r2, AnonymousClass1LA r3, A0B a0b, AZ6 az6, AXS axs) {
        this.A01 = r1;
        this.A04 = r2;
        this.A00 = r3;
        this.A05 = a0b;
        this.A03 = az6;
        this.A02 = axs;
    }

    public static SmsManager A00(int i) {
        return SmsManager.getSmsManagerForSubscriptionId(i);
    }

    public static List A02(Context context) {
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        ArrayList A13 = AnonymousClass000.A13();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() == 2) {
            A13.add(((SubscriptionInfo) C108955ca.A0p(activeSubscriptionInfoList)).getNumber());
            A13.add(activeSubscriptionInfoList.get(1).getNumber());
        }
        return A13;
    }
}
