package X;

import java.util.Map;

/* renamed from: X.9l1  reason: invalid class name and case insensitive filesystem */
public final class C190489l1 {
    public final AnonymousClass00H A00;
    public final AnonymousClass9WB A01;
    public final Map A02;

    public final void A00(C184139aT r13, C184149aU r14, C193029pQ r15, boolean z) {
        int i;
        String str;
        String str2;
        int i2 = 1;
        C17960vV.A0D(!C22781De.A03());
        Object A0w = AnonymousClass000.A0w(this.A02, 551495536);
        if (A0w != null) {
            C30101dO r10 = (C30101dO) A0w;
            if (z) {
                i = 4;
                str = "XFAM_NTA";
            } else {
                i = 3;
                str = "XFAM_WFS";
            }
            C24360Bzv bzv = (C24360Bzv) C20017A3j.A00(new C22011AwD(r15, str), i);
            String str3 = (String) C20017A3j.A00(new C22010AwC(r15, str), i);
            r10.A05((String) null, "FETCH_PHONE_NUMBER_START", 551495536);
            r10.A01(true, "is_re_reg");
            C24360Bzv bzv2 = C24360Bzv.INSTAGRAM;
            if (bzv == bzv2 || bzv == C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER) {
                str2 = "ig";
            } else {
                str2 = "fb";
            }
            r10.A01(str2, "source_app");
            AnonymousClass9WB r1 = this.A01;
            if (!(bzv == bzv2 || bzv == C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER)) {
                i2 = 0;
            }
            AnonymousClass10E r0 = r1.A00.A00;
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass11W A0e = AnonymousClass8BU.A0e(r0);
            new AnonymousClass6OW(C108965cb.A0H(r0), AnonymousClass3Ma.A0c(r0), A8r, C108955ca.A0X(r0), A0e, C108945cZ.A14(r0), str3, i2).CBv(new AU1(r13, r14, this, r10, bzv));
            return;
        }
        throw C17880vN.A0g();
    }

    public C190489l1(AnonymousClass9WB r1, AnonymousClass00H r2, Map map) {
        C18070vi.A0o(r2, r1, map);
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = map;
    }
}
