package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard;
import java.text.NumberFormat;

/* renamed from: X.4Xk  reason: invalid class name and case insensitive filesystem */
public final class C87874Xk {
    public AnonymousClass1E7 A00;
    public final AnonymousClass1KB A01;
    public final NewsletterDetailsCard A02;
    public final AnonymousClass11C A03;
    public final C18000vb A04;
    public final C95424mD A05;
    public final C86454Rr A06;

    public static final String A00(C87874Xk r8, C46162Dk r9) {
        String quantityString;
        boolean A002 = r8.A06.A00(r9);
        NewsletterDetailsCard newsletterDetailsCard = r8.A02;
        if (A002) {
            quantityString = newsletterDetailsCard.getContext().getString(2131892899);
        } else {
            Resources A0Y = AnonymousClass000.A0Y(newsletterDetailsCard);
            long j = r9.A0G;
            Object[] A1a = AnonymousClass3MW.A1a();
            String format = NumberFormat.getInstance(r8.A04.A0N()).format(j);
            C18070vi.A0X(format);
            A1a[0] = format;
            quantityString = A0Y.getQuantityString(2131755281, (int) j, A1a);
        }
        C18070vi.A0b(quantityString);
        return quantityString;
    }

    public final void A01(C46162Dk r5) {
        String A002;
        C86924Tp A022;
        C46162Dk r0;
        if (r5.A0A) {
            A002 = C18070vi.A0F(this.A02.getContext(), 2131892555);
        } else {
            String str = r5.A0R;
            if (str == null || str.length() == 0 || (A002 = C17890vO.A0Z(str, AnonymousClass000.A10(), '@')) == null) {
                A002 = A00(this, r5);
            }
        }
        NewsletterDetailsCard newsletterDetailsCard = this.A02;
        newsletterDetailsCard.A0B.setTextDirection(5);
        newsletterDetailsCard.setSubTitle(A002);
        newsletterDetailsCard.setTitleOnLongClickListener((View.OnLongClickListener) null);
        AnonymousClass1E7 r02 = this.A00;
        if (r02 == null) {
            C18070vi.A11("waContact");
            throw null;
        }
        AnonymousClass1BI r1 = r02.A0J;
        if (r1 != null && (A022 = this.A05.A02(r1)) != null && (r0 = A022.A00) != null) {
            newsletterDetailsCard.setupActionButtons(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1 == 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass1E7 r6) {
        /*
            r5 = this;
            r5.A00 = r6
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r3 = r5.A02
            r3.setContact(r6)
            X.1BI r1 = r6.A0J
            if (r1 == 0) goto L_0x0027
            X.4mD r0 = r5.A05
            X.4Tp r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0027
            X.2Dk r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            java.lang.String r4 = r0.A0T
            if (r4 == 0) goto L_0x0027
            X.1KB r2 = r5.A01
            X.11C r1 = r5.A03
            X.4dn r0 = new X.4dn
            r0.<init>(r2, r1, r4)
            r3.setTitleOnLongClickListener(r0)
        L_0x0027:
            X.1BI r1 = r6.A0J
            if (r1 == 0) goto L_0x0089
            X.4mD r0 = r5.A05
            X.4Tp r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0089
            X.2Dk r2 = r0.A00
            if (r2 == 0) goto L_0x0089
            java.lang.String r0 = r2.A0R
            if (r0 == 0) goto L_0x0042
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r0 = 8
        L_0x0044:
            r3.setContactChatStatusVisibility(r0)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = A00(r5, r2)
            r3.setContactChatStatus(r0)
        L_0x0050:
            r5.A01(r2)
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x0089
            X.4Rr r0 = r5.A06
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0089
            r3.getWamoSubIntegrationInterface()
            java.lang.String r0 = "wamoSubStatusButton"
            com.whatsapp.wds.components.actiontile.WDSActionTile r1 = r3.A04
            if (r1 != 0) goto L_0x006d
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x006d:
            r0 = 8
            r1.setVisibility(r0)
            X.9Ig r1 = r2.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0080
            r3.A06()
            return
        L_0x0080:
            boolean r0 = r2.A0P()
            if (r0 != 0) goto L_0x0089
            r3.A05()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87874Xk.A02(X.1E7):void");
    }

    public C87874Xk(AnonymousClass1KB r1, NewsletterDetailsCard newsletterDetailsCard, AnonymousClass11C r3, C18000vb r4, C81743zj r5, C95424mD r6, C86454Rr r7) {
        C18070vi.A0p(r1, r3, r4);
        C72473Md.A1J(r6, r7);
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = newsletterDetailsCard;
        newsletterDetailsCard.A0Q = r5;
    }
}
