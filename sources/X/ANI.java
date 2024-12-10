package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

public final class ANI implements BDO {
    public boolean A00;
    public final C002100z A01 = new C002100z(5);
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;
    public final C26911Ty A04;
    public final C172458tS A05;
    public final C198989zF A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18030ve A0B;

    public static C20114A7x A00(ANI ani, Object obj) {
        C18070vi.A0d(obj, 0);
        return (C20114A7x) ani.A09.get();
    }

    public boolean BgR() {
        C18030ve r2 = this.A0B;
        if (C108955ca.A0v(r2, 265).length() > 0) {
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 832) || !C18020vd.A05(r1, r2, 1062)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ANI(AnonymousClass190 r3, AnonymousClass1KB r4, C26911Ty r5, C18030ve r6, C172458tS r7, C198989zF r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0s(r6, r4, r3, r8);
        C18070vi.A0d(r9, 5);
        C18070vi.A0l(r10, r11);
        C72473Md.A1K(r12, r5);
        this.A0B = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r8;
        this.A07 = r9;
        this.A0A = r10;
        this.A08 = r11;
        this.A05 = r7;
        this.A09 = r12;
        this.A04 = r5;
    }

    public void A01(C22525BBi bBi, String str, Map map, boolean z) {
        bBi.BuK(map);
        if (map != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                AnonymousClass8BS.A1D(C17890vO.A0P(A15), A10);
                A10.append(10);
            }
            this.A02.A0G("ShopManager/requestShopMetadata", A10.toString(), z);
        }
        this.A01.A05(str);
    }

    public void CFZ(C22525BBi bBi, String str) {
        String group;
        boolean A15 = C18070vi.A15(str, bBi);
        try {
            Matcher A002 = C198989zF.A00(this.A06, str);
            if (A002.matches() && (group = A002.group(1)) != null) {
                AnonymousClass77H r0 = (AnonymousClass77H) this.A01.A04(group);
                if (r0 != null) {
                    bBi.BuL(r0);
                    return;
                }
                C172458tS r02 = this.A05;
                r02.A01 = group;
                r02.A00 = "STOREFRONT";
                AnonymousClass8BU.A1E(this.A07, this, bBi, group, 18);
                return;
            }
        } catch (AnonymousClass9LQ e) {
            Log.e((Throwable) e);
        }
        this.A02.A0G("ShopManager/requestShopMetadataByUrl", AnonymousClass001.A1H("Couldn't find shopId: ", str, AnonymousClass000.A10()), A15);
        bBi.BuK(AnonymousClass1D7.A0I());
    }
}
