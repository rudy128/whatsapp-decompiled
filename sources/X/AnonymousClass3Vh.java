package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;

/* renamed from: X.3Vh  reason: invalid class name */
public final class AnonymousClass3Vh extends AnonymousClass1J2 implements C108565bu {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C95444mF A01 = new C95444mF(this, 6);
    public final C34511kb A02;
    public final C19830z4 A03;
    public final AnonymousClass1MZ A04;
    public final C18030ve A05;
    public final AnonymousClass126 A06;
    public final C42211xo A07;
    public final AnonymousClass1EC A08;
    public final C24901Mc A09;
    public final C41731wy A0A = new C41731wy((Object) null);
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D = C217517g.A00(49498);

    public void Bl0() {
    }

    public void Bmg(int i) {
    }

    public void C4F() {
    }

    public void C60(int i) {
    }

    public void A0S() {
        AnonymousClass10T A0V = C17880vN.A0V(this.A0D);
        C95444mF r1 = this.A01;
        A0V.unregisterObserver(r1);
        C17880vN.A0V(this.A0C).unregisterObserver(r1);
    }

    public void Bta(int i) {
        this.A0A.A0E(AnonymousClass4CQ.SHOW_EXIT_DIALOG_FROM_SUSPICIOUS_CHAT_FOOTER);
    }

    public void BzJ() {
        AnonymousClass1EC A042 = this.A02.A04(this.A08);
        this.A00.A0E(C77023p0.A00);
        if (A042 != null) {
            this.A09.A08(A042, 1);
        }
    }

    public AnonymousClass3Vh(C34511kb r3, C19830z4 r4, AnonymousClass1MZ r5, C18030ve r6, AnonymousClass126 r7, C42211xo r8, AnonymousClass1EC r9, C24901Mc r10, AnonymousClass10I r11, AnonymousClass00H r12) {
        C18070vi.A0w(r6, r11, r10, r7, r8);
        C72483Me.A16(r4, r3, r5, r12, 7);
        this.A05 = r6;
        this.A0B = r11;
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A0C = r12;
    }

    public SpannableStringBuilder BFg(Context context, String str) {
        boolean A15 = C18070vi.A15(context, str);
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] A1b = C72473Md.A1b(fromHtml, A15 ? 1 : 0);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("group-privacy-settings".equals(uRLSpan.getURL())) {
                    int spanStart = A092.getSpanStart(uRLSpan);
                    int spanEnd = A092.getSpanEnd(uRLSpan);
                    int spanFlags = A092.getSpanFlags(uRLSpan);
                    A092.removeSpan(uRLSpan);
                    A092.setSpan(new C74643c8(context, this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return A092;
    }
}
