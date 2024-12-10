package com.whatsapp.conversationslist;

import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass5QC;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C19620yd;
import X.C24291Jp;
import X.C28281Zt;
import X.C28931bI;
import X.C29201bm;
import X.C39541tF;
import X.C41461wR;
import X.C49822Sb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C89924dF;
import X.C91004ez;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public final class InteropConversationsActivity extends AnonymousClass1FY implements C29201bm {
    public C28931bI A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;

    public InteropConversationsActivity() {
        this(0);
        this.A04 = AnonymousClass1DF.A01(AnonymousClass5QC.A00);
    }

    public String BYl() {
        return null;
    }

    public Drawable BYm() {
        return null;
    }

    public String BaZ() {
        return null;
    }

    public void C81(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C81(r2);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
    }

    public void C82(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C82(r2);
        C72473Md.A0o(this);
    }

    public /* synthetic */ void CI2(ImageView imageView) {
        C49822Sb.A00(imageView);
    }

    public /* synthetic */ void CKb() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = C000200d.A00(A0L.A5U);
            this.A02 = C000200d.A00(r1.A2r);
        }
    }

    public /* synthetic */ boolean BBu() {
        return false;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public /* synthetic */ String BYn() {
        return null;
    }

    public /* synthetic */ void BxX(int i, int i2) {
        this.A04.getValue();
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(getPackageName(), "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity");
        startActivity(A0A);
    }

    public void C4p() {
    }

    public /* synthetic */ boolean C4q() {
        return false;
    }

    public void onStart() {
        String str;
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            if (((C39541tF) r0.get()).A00()) {
                AnonymousClass00H r02 = this.A02;
                if (r02 == null) {
                    str = "interopUtility";
                } else if (!((C41461wR) r02.get()).A00.A06()) {
                    C28931bI r03 = this.A00;
                    if (r03 != null) {
                        r03.A02().setVisibility(0);
                        Drawable BUL = BUL();
                        String string = getString(2131892000);
                        if (string != null) {
                            C28931bI r04 = this.A00;
                            if (r04 != null) {
                                r04.A02().setContentDescription(string);
                            }
                        }
                        if (BUL != null) {
                            C28931bI r05 = this.A00;
                            if (r05 != null) {
                                ((ImageView) r05.A02()).setImageDrawable(BUL);
                            }
                        }
                        C28931bI r06 = this.A00;
                        if (r06 != null) {
                            C89924dF.A00(r06.A02(), this, 21);
                            super.onStart();
                            return;
                        }
                    }
                    C18070vi.A11("startConversationFab");
                    throw null;
                }
            }
            C28931bI r07 = this.A00;
            if (r07 != null) {
                C72463Mc.A1G(r07);
                super.onStart();
                return;
            }
            C18070vi.A11("startConversationFab");
            throw null;
        }
        str = "interopRolloutManager";
        C18070vi.A11(str);
        throw null;
    }

    public String BUK() {
        return getString(2131892000);
    }

    public Drawable BUL() {
        return C24291Jp.A00((Resources.Theme) null, getResources(), 2131233377);
    }

    public String BUM() {
        return getString(2131896293);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624063);
        this.A00 = AnonymousClass3Ma.A0x(this, 2131435589);
        C72473Md.A18(this);
        AnonymousClass3MY.A0t(this, 2131896869);
    }

    public InteropConversationsActivity(int i) {
        this.A03 = false;
        C91004ez.A00(this, 40);
    }
}
