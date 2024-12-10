package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.ANt  reason: case insensitive filesystem */
public class C20508ANt implements BD0, BAG {
    public Context A00;
    public CatalogMediaCard A01;
    public AEW A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass1L9 A07;
    public final AnonymousClass1KB A08;
    public final AnonymousClass11S A09;
    public final C196149uX A0A;
    public final C26911Ty A0B;
    public final C195529tU A0C;
    public final C20114A7x A0D;
    public final C19957A0o A0E;
    public final C190289kg A0F;
    public final C19880zA A0G;
    public final C47962Kq A0H;
    public final CatalogManager A0I;
    public final C85424Ni A0J;
    public final AnonymousClass10I A0K;

    private void A00() {
        Activity A002 = AnonymousClass1L9.A00(this.A00);
        if (A002 instanceof C22368B4w) {
            C168648jP r2 = (C168648jP) ((C22368B4w) A002);
            r2.A4d().A01 = true;
            C28931bI r1 = r2.A0e;
            if (r1 != null) {
                r1.A04(8);
            }
        }
    }

    public void BBd() {
        if (!this.A06) {
            this.A01.A07.A07((View.OnClickListener) null, 3);
            this.A06 = true;
        }
    }

    public void BL3(UserJid userJid, int i) {
        this.A0I.A0D(userJid, i);
    }

    public int BXe(UserJid userJid) {
        return this.A0D.A04(userJid);
    }

    public C107705aS BaN(C20287AEv aEv, UserJid userJid, boolean z) {
        return new C21074Ae4(aEv, this, userJid, z);
    }

    public boolean BcZ(UserJid userJid) {
        return this.A0D.A0O(userJid);
    }

    public void BdP(UserJid userJid) {
        if (this.A03 != null) {
            this.A01.A07.setTitle(this.A00.getString(2131887951));
            this.A01.A07.setTitleTextColor(AnonymousClass3Ma.A00(this.A00, 2130968969, 2131100028));
            int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(2131168330);
            this.A01.A07.A05(dimensionPixelSize, dimensionPixelSize);
        }
        this.A01.A07.setSeeMoreClickListener(new C21071Ae1(this, userJid));
        this.A01.A07.setCatalogBrandingDrawable((Drawable) null);
    }

    public void BuB(UserJid userJid, int i) {
        CatalogMediaCard catalogMediaCard;
        int i2;
        if (C42171xk.A00(this.A01.A06, userJid) && !this.A0D.A0P(this.A01.A06)) {
            C17900vP.A0k("CatalogMediaCard/requestCatalogProductsFromBeginning/FetchFailed/Error: ", AnonymousClass000.A10(), i);
            if (i == 406) {
                catalogMediaCard = this.A01;
                i2 = 2131887976;
            } else {
                catalogMediaCard = this.A01;
                if (i == 404) {
                    i2 = 2131887974;
                } else {
                    i2 = 2131888010;
                    if (i == -1) {
                        i2 = 2131887975;
                    }
                }
            }
            catalogMediaCard.setError(i2);
        }
    }

    public void BuC(UserJid userJid, boolean z, boolean z2) {
        if (C42171xk.A00(this.A01.A06, userJid)) {
            BuR(userJid);
        }
    }

    public void BuR(UserJid userJid) {
        C20114A7x a7x = this.A0D;
        int A042 = a7x.A04(userJid);
        CatalogMediaCard catalogMediaCard = this.A01;
        if (A042 != catalogMediaCard.A00) {
            catalogMediaCard.A00 = A042;
            boolean A0P = a7x.A0P(userJid);
            AEW aew = this.A02;
            if (!A0P) {
                if (aew != null && aew.A0Z) {
                    C20044A4n a4n = new C20044A4n(aew);
                    a4n.A0W = false;
                    this.A02 = a4n.A01();
                    C21450AkH.A01(this.A0K, this, userJid, 11);
                }
                Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
                this.A01.A07.setError(this.A00.getString(2131887974));
                A00();
            } else {
                if (aew != null && !aew.A0Z) {
                    C20044A4n a4n2 = new C20044A4n(aew);
                    a4n2.A0W = true;
                    this.A02 = a4n2.A01();
                    C21450AkH.A01(this.A0K, this, userJid, 12);
                }
                ArrayList A002 = this.A01.A00(userJid, this.A00.getString(2131887569), a7x.A0D(userJid), this.A04);
                if (A002.isEmpty()) {
                    A00();
                }
                this.A01.A03(A002);
            }
            AEW aew2 = this.A02;
            if (aew2 == null || aew2.A0Z || a7x.A0P(userJid)) {
                this.A01.setVisibility(0);
            } else {
                this.A01.setVisibility(8);
            }
            if (!this.A05) {
                this.A05 = true;
            }
        }
    }

    public boolean CM1() {
        AEW aew = this.A02;
        if (aew == null || !aew.A0Z) {
            return true;
        }
        return false;
    }

    public void cleanup() {
        this.A0H.unregisterObserver(this);
    }

    public C20508ANt(C19880zA r1, AnonymousClass1L9 r2, AnonymousClass1KB r3, AnonymousClass11S r4, C196149uX r5, C26911Ty r6, C195529tU r7, C47962Kq r8, C20114A7x a7x, CatalogManager catalogManager, C85424Ni r11, C19957A0o a0o, C190289kg r13, AnonymousClass10I r14) {
        this.A08 = r3;
        this.A09 = r4;
        this.A0G = r1;
        this.A07 = r2;
        this.A0J = r11;
        this.A0K = r14;
        this.A0B = r6;
        this.A0I = catalogManager;
        this.A0D = a7x;
        this.A0H = r8;
        this.A0F = r13;
        this.A0A = r5;
        this.A0E = a0o;
        this.A0C = r7;
        r8.registerObserver(this);
    }
}
