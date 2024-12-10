package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.ANs  reason: case insensitive filesystem */
public class C20507ANs implements BD0 {
    public AEW A00;
    public boolean A01;
    public final C36361nl A02;
    public final BDO A03;
    public final CatalogMediaCard A04;
    public final AnonymousClass18K A05;
    public final C190369kp A06;
    public final C196149uX A07;
    public final AnonymousClass2L5 A08;
    public final C85424Ni A09;

    public void BBd() {
        if (!this.A01) {
            this.A04.A07.A07((View.OnClickListener) null, 6);
            this.A01 = true;
        }
    }

    public void BL3(UserJid userJid, int i) {
        ANI ani = (ANI) this.A03;
        if (ANI.A00(ani, userJid).A0P(userJid)) {
            C17890vO.A0s(C17880vN.A0V(ani.A0A), userJid, 29);
        } else if (!ani.A00) {
            ani.A00 = true;
            ani.A04.A0D(new C20472AMj(userJid, ani, i), userJid);
        }
    }

    public int BXe(UserJid userJid) {
        return ANI.A00((ANI) this.A03, userJid).A04(userJid);
    }

    public C107705aS BaN(C20287AEv aEv, UserJid userJid, boolean z) {
        return new C21072Ae2(aEv, this);
    }

    public boolean BcZ(UserJid userJid) {
        return ANI.A00((ANI) this.A03, userJid).A0O(userJid);
    }

    public void BdP(UserJid userJid) {
        CatalogMediaCard catalogMediaCard = this.A04;
        AnonymousClass48V r3 = catalogMediaCard.A07;
        r3.setSeeMoreClickListener(new C21070Ae0(this, 0));
        r3.setCatalogBrandingDrawable(C40501uo.A00((Resources.Theme) null, catalogMediaCard.getResources(), 2131232307));
    }

    public void BuR(UserJid userJid) {
        List A0D = ANI.A00((ANI) this.A03, userJid).A0D(userJid);
        if (A0D != null && !A0D.isEmpty()) {
            this.A04.setupThumbnails(userJid, 2131887569, A0D);
        }
    }

    public boolean CM1() {
        return !this.A07.A03(this.A00);
    }

    public void cleanup() {
        this.A08.unregisterObserver(this);
    }

    public C20507ANs(C36361nl r1, C196149uX r2, BDO bdo, CatalogMediaCard catalogMediaCard, C85424Ni r5, AnonymousClass18K r6, AnonymousClass2L5 r7, C190369kp r8) {
        this.A05 = r6;
        this.A02 = r1;
        this.A03 = bdo;
        this.A08 = r7;
        this.A09 = r5;
        this.A04 = catalogMediaCard;
        this.A06 = r8;
        this.A07 = r2;
        r7.registerObserver(this);
    }
}
