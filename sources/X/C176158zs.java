package X;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* renamed from: X.8zs  reason: invalid class name and case insensitive filesystem */
public final class C176158zs extends AnonymousClass90I implements C22579BDz, C22545BCc, AnonymousClass8BF, C22578BDy {
    public String A00;
    public final C145217Kk A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C195329tA A04;
    public final /* synthetic */ AZK A05;

    public boolean BAd(String str) {
        return this.A05.BAd(str);
    }

    public void BDM(boolean z) {
        this.A01.BDM(z);
    }

    public Fragment BV2(String str, String str2, String str3, Map map, Map map2, int i) {
        C18070vi.A0d(str, 0);
        C72473Md.A1M(map, str3, map2, 2);
        return this.A01.BV2(str, str2, str3, map, map2, i);
    }

    public void Bc9(String str, String str2) {
        this.A05.Bc9(str, str2);
    }

    public void BcA(String str, Map map) {
        this.A05.BcA(str, map);
    }

    public void CAl(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        this.A01.CAl(str, str2, str3, str4, str5, str6, map, map2, i);
    }

    public void CAx(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        this.A01.CAx(num, str, str2, str3, str4, str5, str6, map, map2, i, i2, z);
    }

    public void CCI(C191549mm r8, String str, Map map, int i) {
        C18070vi.A0d(map, 0);
        C195329tA r1 = this.A04;
        Object obj = map.get("app_id");
        AnonymousClass8BR.A1I(obj);
        r1.A02(r8, (String) obj, str, A00(map), i);
    }

    public static final Map A00(Map map) {
        Integer num;
        Map map2;
        String A0e = C108975cc.A0e(AnonymousClass8BW.A0g("fetch_channel", map));
        if (A0e.equals("GRAPHQL")) {
            num = AnonymousClass00R.A00;
        } else if (A0e.equals("STATIC")) {
            num = AnonymousClass00R.A01;
        } else {
            throw AnonymousClass000.A0k(A0e);
        }
        if (num.intValue() != 0) {
            Object obj = map.get("fetch_channel_params");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Object obj2 = ((Map) obj).get("static_url");
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("should_load_bloks_through_cdn", true, r2, 0);
            AnonymousClass1D6.A03("static_url", obj2, r2, 1);
            return AnonymousClass1D7.A0B(r2);
        }
        Object obj3 = map.get("bloks_server_params");
        if (!(obj3 instanceof Map) || (map2 = (Map) obj3) == null) {
            return AnonymousClass1D7.A0I();
        }
        return map2;
    }

    public void BLG(Map map) {
        ((C192729ot) this.A02.get()).A00(map);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C176158zs(AnonymousClass9W3 r2, C189309is r3, AZK azk, C145217Kk r5, C176198zw r6, C195329tA r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        super(r2, r3, r6);
        C72473Md.A1I(r8, r9);
        C18070vi.A0d(r2, 5);
        C108965cb.A1P(r6, 7, r3);
        this.A03 = r8;
        this.A04 = r7;
        this.A02 = r9;
        this.A01 = r5;
        this.A05 = azk;
    }
}
