package com.whatsapp.businessupsell;

import X.AFV;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C170888qp;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C189759jn;
import X.C21446AkD;
import X.C25491Cgm;
import X.C36361nl;
import X.C36401np;
import X.C36721oM;
import X.C39441t5;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C89874dA;
import X.C90994ey;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.TextEmojiLabel;

public final class BusinessProfileEducation extends AnonymousClass1FY {
    public C36361nl A00;
    public AnonymousClass18K A01;
    public AnonymousClass129 A02;
    public C36401np A03;
    public C189759jn A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;

    public BusinessProfileEducation() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(2131624381);
        C18070vi.A0X(findViewById(2131432209));
        C89874dA.A00(AnonymousClass3MY.A0H(this, 2131429132), this, 6);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131428488);
        C39441t5 r2 = new C39441t5(this.A0E);
        if (AnonymousClass000.A1T(getIntent().getIntExtra("key_extra_verified_level", -1), 3)) {
            r2.A00 = new C21446AkD(this, 34);
        }
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            C36721oM r7 = (C36721oM) C18070vi.A0E(r0);
            String stringExtra = getIntent().getStringExtra("key_extra_business_name");
            boolean A1T = AnonymousClass000.A1T(getIntent().getIntExtra("key_extra_verified_level", -1), 3);
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 5295);
            if (!A1T || stringExtra == null || A052) {
                string = getString(2131887123);
            } else {
                string = C17880vN.A0q(this, Html.escapeHtml(stringExtra), AnonymousClass3MW.A1a(), 0, 2131887124);
            }
            C18070vi.A0b(string);
            r7.A00(this, textEmojiLabel, string, "learn-more", "about-chatting-with-businesses");
            AnonymousClass3Ma.A1K(textEmojiLabel, this.A08);
            AnonymousClass3MY.A0H(this, 2131436585).setOnClickListener(new AFV(this));
            A03(this, 1);
            if (AnonymousClass000.A1T(getIntent().getIntExtra("key_extra_verified_level", -1), 3)) {
                AnonymousClass00H r02 = this.A07;
                if (r02 != null) {
                    C25491Cgm.A00((C25491Cgm) r02.get(), C17880vN.A0i(), C72453Mb.A0x(getIntent(), "key_extra_business_jid"), 3, 4);
                    return;
                }
                C18070vi.A11("metaVerifiedInteractionLogger");
                throw null;
            }
            return;
        }
        C18070vi.A11("contextualHelpUtils");
        throw null;
    }

    public static final void A03(BusinessProfileEducation businessProfileEducation, int i) {
        C170888qp r1 = new C170888qp();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = 11;
        AnonymousClass18K r0 = businessProfileEducation.A01;
        if (r0 != null) {
            r0.CC7(r1);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A05 = AnonymousClass3MX.A10(r2);
            this.A06 = C000200d.A00(A0K.A0m);
            this.A02 = AnonymousClass3Ma.A0t(r2);
            this.A00 = AnonymousClass3Ma.A0L(r2);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A07 = C000200d.A00(A0K.A4s);
            this.A04 = (C189759jn) r2.AdV.get();
            this.A01 = AnonymousClass3Ma.A0g(r2);
        }
    }

    public BusinessProfileEducation(int i) {
        this.A08 = false;
        C90994ey.A00(this, 21);
    }
}
