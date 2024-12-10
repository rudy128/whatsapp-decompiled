package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10T;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass181;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass779;
import X.AnonymousClass7KW;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C122946Sn;
import X.C1423379b;
import X.C155047s7;
import X.C155057s8;
import X.C166598dA;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C19880zA;
import X.C20017A3j;
import X.C21429Ajw;
import X.C26302CxJ;
import X.C30131dR;
import X.C35511mM;
import X.C72463Mc;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public final class AccountLinkingNativeAuthActivity extends AnonymousClass1FY {
    public C19880zA A00;
    public AnonymousClass181 A01;
    public AnonymousClass118 A02;
    public AnonymousClass779 A03;
    public C35511mM A04;
    public C30131dR A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;

    private final SpannableStringBuilder A03(Runnable runnable, String str, String str2, int i) {
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = A09.getSpanStart(uRLSpan);
                    int spanEnd = A09.getSpanEnd(uRLSpan);
                    int spanFlags = A09.getSpanFlags(uRLSpan);
                    A09.removeSpan(uRLSpan);
                    A09.setSpan(new C166598dA(this, runnable, i), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A09;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624126);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("fb_app_user_entity_as_parcel");
        if (parcelableExtra != null) {
            this.A03 = (AnonymousClass779) parcelableExtra;
            AnonymousClass3MZ.A1M(AnonymousClass3MY.A0H(this, 2131429383), this, 22);
            C20017A3j.A01(new C155047s7(this), 2);
            C20017A3j.A01(new C155057s8(this), 2);
            AnonymousClass3MZ.A1M(findViewById(2131429138), this, 21);
            TextView A0L = AnonymousClass3MX.A0L(this, 2131429997);
            A0L.setText(A03(new C21429Ajw(this, 6), AnonymousClass3MY.A0m(getResources(), 2131886424), "log-in", A0L.getCurrentTextColor()));
            AnonymousClass3Ma.A1I(A0L, this.A0E);
            AnonymousClass3MY.A1X(getResources().getString(2131886426), AnonymousClass3MX.A0L(this, 2131430037));
            C18030ve r11 = this.A0E;
            AnonymousClass1KB r8 = this.A05;
            AnonymousClass1L9 r7 = this.A01;
            AnonymousClass11C r10 = this.A08;
            String string = getResources().getString(2131886427);
            C26302CxJ.A0K(this, this.A03.A00("https://faq.whatsapp.com/help/whatsapp/517414157043660"), r7, r8, (TextEmojiLabel) findViewById(2131430038), r10, r11, string, "learn-more");
            AnonymousClass3Ma.A1I(AnonymousClass3MX.A0L(this, 2131430038), this.A0E);
            TextView A0L2 = AnonymousClass3MX.A0L(this, 2131430036);
            A0L2.setText(A03(new C21429Ajw(this, 7), AnonymousClass3MY.A0m(getResources(), 2131886425), "privacy-policy", getResources().getColor(C72463Mc.A02(A0L2.getContext()))));
            AnonymousClass3Ma.A1I(A0L2, this.A0E);
            C30131dR r1 = this.A05;
            if (r1 != null) {
                r1.A04("SEE_NATIVE_AUTH");
            } else {
                C18070vi.A11("xFamilyUserFlowLogger");
                throw null;
            }
        } else {
            throw C17880vN.A0g();
        }
    }

    public static final void A0Q(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity, Integer num, Integer num2, boolean z) {
        AnonymousClass00H r0 = accountLinkingNativeAuthActivity.A07;
        if (r0 != null) {
            ((AnonymousClass10T) C18070vi.A0E(r0)).notifyAllObservers(new AnonymousClass7KW((C122946Sn) null, num, num2, z));
            accountLinkingNativeAuthActivity.finish();
            return;
        }
        C18070vi.A11("accountLinkingResultObservers");
        throw null;
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A06 = C000200d.A00(A0K.A01);
            this.A07 = C000200d.A00(r1.A5V);
            this.A04 = C108965cb.A0h(A0A);
            this.A01 = C108965cb.A0H(A0A);
            this.A02 = AnonymousClass3MZ.A0l(A0A);
            this.A00 = C19880zA.A01(r1.AEq());
            this.A05 = (C30131dR) A0A.Anv.get();
        }
    }

    public AccountLinkingNativeAuthActivity(int i) {
        this.A08 = false;
        C1423379b.A00(this, 25);
    }

    public AccountLinkingNativeAuthActivity() {
        this(0);
    }
}
