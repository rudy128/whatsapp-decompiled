package X;

import java.util.HashMap;

/* renamed from: X.Ajk  reason: case insensitive filesystem */
public final /* synthetic */ class C21417Ajk implements Runnable {
    public final /* synthetic */ C19995A2i A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ AnonymousClass8AB A02;
    public final /* synthetic */ C187029f9 A03;
    public final /* synthetic */ ADL A04;
    public final /* synthetic */ BCH A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public final void run() {
        String str;
        long j;
        C19943A0a a0a;
        String str2;
        C19995A2i a2i = this.A00;
        ADL adl = this.A04;
        String str3 = this.A07;
        String str4 = this.A08;
        C187029f9 r4 = this.A03;
        String str5 = this.A09;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        BCH bch = this.A05;
        AnonymousClass8AB r13 = this.A02;
        AnonymousClass705 r16 = this.A01;
        String str6 = this.A06;
        HashMap hashMap = null;
        if (adl != null) {
            str = adl.A02;
            j = adl.A01;
        } else {
            str = "PRELOAD";
            j = 0;
        }
        if (!AnonymousClass026.A00(str, "ASYNC_COMPONENT")) {
            C18070vi.A0d(str3, 0);
            String str7 = (String) ((C20000A2o) a2i.A08.get()).A01(new C178139By((C197789xG) a2i.A09.get(), str3, str4), str, j);
            if (str7 != null) {
                r4.A03 = true;
                int length = str7.length();
                HashMap A11 = C17880vN.A11();
                A11.put("EVENT_PARAM_UNCOMPRESSED_SIZE", String.valueOf(length));
                a2i.A05.A02(str5, "PAYLOAD_SIZE", A11);
                if (z2) {
                    a2i.A01(r4, adl, bch, str7, z);
                    return;
                }
                return;
            }
        }
        if (z2) {
            a0a = a2i.A05;
            str2 = "REQUEST_START";
        } else {
            hashMap = C17880vN.A11();
            hashMap.put("EVENT_PARAM_APP_ID", str3);
            hashMap.put("EVENT_PARAM_BLOKS_PARAMS", str4);
            a0a = a2i.A05;
            str2 = "PREFETCH_REQUEST_START";
        }
        a0a.A02(str5, str2, hashMap);
        C19995A2i a2i2 = a2i;
        C187029f9 r17 = r4;
        r13.CBv(new AU3(a2i2, r16, r17, adl, bch, str5, str3, str4, str6, z, z2));
    }

    public /* synthetic */ C21417Ajk(C19995A2i a2i, AnonymousClass705 r2, AnonymousClass8AB r3, C187029f9 r4, ADL adl, BCH bch, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A00 = a2i;
        this.A04 = adl;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = r4;
        this.A09 = str3;
        this.A0A = z;
        this.A0B = z2;
        this.A05 = bch;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str4;
    }
}
