package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2nM  reason: invalid class name and case insensitive filesystem */
public class C60082nM {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C60082nM r7 = (C60082nM) obj;
            if (!(this.A04.getRawString().equals(r7.A04.getRawString()) && TextUtils.equals(this.A08, r7.A08) && TextUtils.equals(this.A05, r7.A05) && TextUtils.equals(this.A07, r7.A07) && TextUtils.equals(this.A06, r7.A06) && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A09 == r7.A09 && this.A02 == r7.A02 && this.A0A == r7.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A04;
        objArr[1] = this.A08;
        objArr[2] = this.A05;
        objArr[3] = this.A07;
        objArr[4] = this.A06;
        C17890vO.A1Q(objArr, this.A01);
        C17890vO.A1H(objArr, this.A00);
        objArr[7] = Boolean.valueOf(this.A09);
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Long.valueOf(this.A02);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0A), objArr, 10);
    }

    public C60082nM(C56112gv r3) {
        this.A04 = r3.A08;
        this.A08 = r3.A0A;
        this.A05 = r3.A09;
        this.A07 = r3.A03;
        this.A06 = r3.A02;
        this.A01 = r3.A06;
        this.A03 = r3.A07;
        this.A09 = r3.A04;
        this.A00 = r3.A00;
        this.A02 = r3.A01;
        this.A0A = r3.A05;
    }

    public String A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("uj", this.A04.getRawString());
        A15.put("s", this.A08);
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            A15.put("a", str);
        }
        A15.put("ct", this.A01);
        A15.put("lit", this.A03);
        A15.put("hcslm", this.A09);
        int i = this.A00;
        if (i != -1) {
            A15.put("brc", i);
        }
        long j = this.A02;
        if (j != -1) {
            A15.put("fmts", j);
        }
        String str2 = this.A07;
        if (!TextUtils.isEmpty(str2)) {
            A15.put("es", str2);
        }
        String str3 = this.A06;
        if (!TextUtils.isEmpty(str3)) {
            A15.put("em", str3);
        }
        A15.put("wdtb", this.A0A);
        return A15.toString();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EntryPointConversionData{userJid=");
        A10.append(this.A04);
        A10.append(", source='");
        A10.append(this.A08);
        A10.append('\'');
        A10.append(", app='");
        A10.append(this.A05);
        A10.append('\'');
        A10.append(", externalSource='");
        A10.append(this.A07);
        A10.append(", externalMedium='");
        A10.append(this.A06);
        A10.append(", creationTimeMillis=");
        A10.append(this.A01);
        A10.append(", bizCount=");
        A10.append(this.A00);
        A10.append(", hasUserSentLastMessage=");
        A10.append(this.A09);
        A10.append(", lastInteractionTimeMillis=");
        A10.append(this.A03);
        A10.append(", firstMessageTsSeconds=");
        A10.append(this.A02);
        A10.append(", wasDeliveredToBiz=");
        A10.append(this.A0A);
        return C17890vO.A0b(A10);
    }
}
