package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8hw  reason: invalid class name and case insensitive filesystem */
public class C167888hw extends C167898hx {
    public final AnonymousClass190 A00;
    public final BAM A01;
    public final C188519hY A02;
    public final C19949A0g A03;
    public final AnonymousClass1OZ A04;
    public final C20004A2u A05;
    public final A6T A06;
    public final AnonymousClass11E A07;

    public C167888hw(AnonymousClass190 r2, C26911Ty r3, BAM bam, A6T a6t, AnonymousClass11E r6, C188519hY r7, C19949A0g a0g, AnonymousClass1OZ r9, C20004A2u a2u) {
        super(r3, r7.A08);
        this.A06 = a6t;
        this.A00 = r2;
        this.A05 = a2u;
        this.A04 = r9;
        this.A02 = r7;
        this.A07 = r6;
        this.A01 = bam;
        this.A03 = a0g;
    }

    public static void A00(C167888hw r1) {
        C222119a A002;
        if (r1.A02.A09 == null && (A002 = C20004A2u.A00(r1.A05, "catalog_collections_view_tag")) != null) {
            A002.A06("datasource_catalog");
        }
    }

    public boolean A07() {
        if (!this.A07.A09()) {
            StringBuilder A11 = AnonymousClass000.A11("app/sendGetBizProductCatalog jid=");
            A11.append(this.A02.A08);
            C17890vO.A1A(A11, " failed");
            return false;
        }
        C20997Acp.A01(this.A01, this);
        StringBuilder A112 = AnonymousClass000.A11("app/sendGetBizProductCatalog jid=");
        A112.append(this.A02.A08);
        C17890vO.A1A(A112, " success");
        return true;
    }

    public void BrD(String str) {
        A00(this);
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A01.Btn(this.A02, -1);
    }

    public void C7Z(C29621ca r6, String str) {
        A00(this);
        C188519hY r4 = this.A02;
        UserJid userJid = r4.A08;
        A6T a6t = this.A06;
        AN5 A022 = a6t.A02(r6);
        a6t.A05(this.A01, userJid, r6);
        if (A022 != null) {
            this.A01.C7c(A022, r4);
            return;
        }
        this.A01.Btn(r4, 0);
        this.A00.A0G("RequestBizProductCatalogProtocolHelper/get product catalog error", "error_code=0", true);
    }
}
