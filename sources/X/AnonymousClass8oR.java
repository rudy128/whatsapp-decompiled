package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8oR  reason: invalid class name */
public final class AnonymousClass8oR extends AnonymousClass8oT {
    public static final long A0E = TimeUnit.DAYS.toMillis(7);
    public final int A00;
    public final long A01;
    public final AnonymousClass4DN A02;
    public final AnonymousClass1E2 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass9IQ A0C;
    public final String A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8oR(AnonymousClass4DN r2, AnonymousClass9IQ r3, AnonymousClass1E2 r4, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, long j, boolean z, boolean z2) {
        super(userJid, 1);
        C18070vi.A0k(str, str2);
        this.A05 = str;
        this.A06 = str2;
        this.A09 = list;
        this.A01 = j;
        this.A0A = z;
        this.A08 = str3;
        this.A00 = i;
        this.A0B = z2;
        this.A02 = r2;
        this.A0C = r3;
        this.A04 = str4;
        this.A0D = str5;
        this.A07 = str6;
        this.A03 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass8oR r7 = (AnonymousClass8oR) obj;
            if (this.A00 != r7.A00 || !C18070vi.A18(this.A00.getRawString(), r7.A00.getRawString()) || !C18070vi.A18(this.A05, r7.A05) || !C18070vi.A18(this.A06, r7.A06) || !C18070vi.A18(this.A07, r7.A07) || this.A01 != r7.A01 || !C18070vi.A18(this.A08, r7.A08) || this.A00 != r7.A00 || !C18070vi.A18(this.A09, r7.A09) || this.A0A != r7.A0A || this.A0B != r7.A0B || this.A02 != r7.A02 || !C18070vi.A18(this.A04, r7.A04) || !C18070vi.A18(this.A0D, r7.A0D) || this.A0C != r7.A0C || !C18070vi.A18(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        boolean A1b = C72453Mb.A1b(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A05;
        objArr[3] = this.A06;
        objArr[4] = this.A07;
        C17890vO.A1Q(objArr, this.A01);
        objArr[6] = this.A08;
        C17890vO.A1I(objArr, this.A00);
        objArr[8] = Integer.valueOf(AnonymousClass000.A0P(this.A09, new Object[1], A1b ? 1 : 0));
        objArr[9] = Boolean.valueOf(this.A0A);
        objArr[10] = Boolean.valueOf(this.A0B);
        objArr[11] = this.A02;
        objArr[12] = this.A0C;
        objArr[13] = this.A04;
        objArr[14] = this.A0D;
        return AnonymousClass000.A0P(this.A03, objArr, 15);
    }

    public final JSONObject A02() {
        JSONObject A15 = C17880vN.A15();
        A15.put("brj", this.A00.getRawString());
        A15.put("ap", this.A05);
        A15.put("s", this.A06);
        String str = this.A07;
        if (str != null) {
            A15.put("sg", str);
        }
        A15.put("ct", this.A01);
        String str2 = this.A08;
        if (str2.length() > 0) {
            A15.put("tb_t", str2);
            A15.put("tb_a", this.A00);
        }
        List<AnonymousClass4DT> list = this.A09;
        if (list != null) {
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (AnonymousClass4DT r0 : list) {
                A1A.put(r0.label);
            }
            A15.put("cf", A1A);
        }
        A15.put("lrt", this.A0A);
        A15.put("aae", this.A0B);
        A15.put("cdv", this.A02.value);
        A15.put("cs", this.A0C.value);
        String str3 = this.A04;
        if (str3 != null) {
            A15.put("ad_id", str3);
        }
        String str4 = this.A0D;
        if (str4 != null) {
            A15.put("adg_id", str4);
        }
        AnonymousClass1E2 r02 = this.A03;
        if (r02 != null) {
            A15.put("lid", r02.getRawString());
        }
        return A15;
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n        CtwaAdsEntryPoint(\n            businessRemoteJid = ");
        A10.append(this.A00);
        A10.append(",\n            adsPayload = ");
        A10.append(this.A05);
        A10.append(",\n            adsSource = ");
        A10.append(this.A06);
        A10.append(",\n            signals = ");
        A10.append(this.A07);
        A10.append(",\n            clientFilters = ");
        List<AnonymousClass4DT> list = this.A09;
        if (list != null) {
            arrayList = C29351c6.A0D(list);
            for (AnonymousClass4DT r0 : list) {
                arrayList.add(r0.label);
            }
        } else {
            arrayList = null;
        }
        A10.append(arrayList);
        A10.append(",\n            creationTimeMs = ");
        A10.append(this.A01);
        A10.append(",\n            adsLoggingRequiresTos = ");
        A10.append(this.A0A);
        A10.append(",\n            trustBannerType = ");
        A10.append(this.A08);
        A10.append(",\n            trustBannerPerformedAction = ");
        A10.append(this.A00);
        A10.append(",\n            conversionSurface = ");
        A10.append(this.A0C);
        A10.append(",\n            adId = ");
        A10.append(this.A04);
        A10.append(",\n            adGroupId = ");
        A10.append(this.A0D);
        A10.append(",\n            remoteLid = ");
        A10.append(this.A03);
        return AnonymousClass8BW.A0k("\n        )\n    ", A10);
    }
}
