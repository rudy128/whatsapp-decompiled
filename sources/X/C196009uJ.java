package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9uJ  reason: invalid class name and case insensitive filesystem */
public final class C196009uJ {
    public final long A00;
    public final UserJid A01;
    public final Integer A02;
    public final Integer A03;

    public C196009uJ(UserJid userJid, Integer num, Integer num2, long j) {
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A03 = num;
        this.A02 = num2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196009uJ) {
                C196009uJ r8 = (C196009uJ) obj;
                if (!(C18070vi.A18(this.A01, r8.A01) && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        String str2;
        int A0L = AnonymousClass000.A0L(this.A01);
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = "SMB";
        } else {
            str = "ENTERPRISE";
        }
        int A032 = AnonymousClass8BW.A03(str, intValue, A0L);
        int intValue2 = this.A02.intValue();
        if (intValue2 != 0) {
            str2 = "CALL_COMPLETE";
        } else {
            str2 = "DEEP_CONVERSATION";
        }
        return AnonymousClass001.A0J(this.A00, AnonymousClass8BW.A03(str2, intValue2, A032));
    }

    public final JSONObject A00() {
        String str;
        String str2;
        JSONObject A15 = C17880vN.A15();
        A15.put("business_jid", this.A01.getRawString());
        if (this.A03.intValue() != 0) {
            str = "SMB";
        } else {
            str = "ENTERPRISE";
        }
        A15.put("business_type", str);
        if (this.A02.intValue() != 0) {
            str2 = "CALL_COMPLETE";
        } else {
            str2 = "DEEP_CONVERSATION";
        }
        A15.put("conversion_event_type", str2);
        A15.put("conversion_event_timestamp", this.A00);
        return A15;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SurveyConversionInfo(businessJid=");
        A10.append(this.A01);
        A10.append(", businessType=");
        if (this.A03.intValue() != 0) {
            str = "SMB";
        } else {
            str = "ENTERPRISE";
        }
        A10.append(str);
        A10.append(", conversionEventType=");
        if (this.A02.intValue() != 0) {
            str2 = "CALL_COMPLETE";
        } else {
            str2 = "DEEP_CONVERSATION";
        }
        A10.append(str2);
        A10.append(", conversionEventTimestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
