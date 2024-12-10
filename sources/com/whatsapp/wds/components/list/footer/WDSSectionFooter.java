package com.whatsapp.wds.components.list.footer;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3PQ;
import X.AnonymousClass4DZ;
import X.C146787Qp;
import X.C18000vb;
import X.C18070vi;
import X.C72473Md;
import X.C74713cF;
import X.C85384Ne;
import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

public final class WDSSectionFooter extends AnonymousClass3PQ {
    public C18000vb A00;
    public C85384Ne A01;
    public FrameLayout A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r0 = r0.A0E(r1, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WDSSectionFooter(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            r4.<init>(r5, r6)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131627593(0x7f0e0e49, float:1.8882455E38)
            android.view.View r1 = r1.inflate(r0, r4)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.C18070vi.A0z(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r4.A02 = r1
            X.4Ne r0 = new X.4Ne
            r0.<init>(r1)
            r4.A01 = r0
            if (r6 == 0) goto L_0x0049
            int[] r0 = X.AnonymousClass1Y0.A0G
            X.C18070vi.A0Z(r0)
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r2, r2)
            X.0vb r0 = r4.A00
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r0.A0E(r1, r3)
            if (r0 != 0) goto L_0x003c
        L_0x0038:
            java.lang.String r0 = r1.getString(r3)
        L_0x003c:
            r4.setFooterText((java.lang.String) r0)
            boolean r0 = r1.getBoolean(r2, r2)
            r4.setDividerVisibility(r0)
            r1.recycle()
        L_0x0049:
            r4.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.footer.WDSSectionFooter.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static /* synthetic */ void getDividerVisibility$annotations() {
    }

    public static /* synthetic */ void getFooterText$annotations() {
    }

    public static final void setFooterTextWithLink$lambda$2(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        runnable.run();
    }

    public final void setFooterTextWithLink(String str, String str2, AnonymousClass4DZ r16, MovementMethod movementMethod, Runnable runnable) {
        C18070vi.A0d(str, 0);
        MovementMethod movementMethod2 = movementMethod;
        Runnable runnable2 = runnable;
        AnonymousClass4DZ r0 = r16;
        C18070vi.A0s(str2, r0, movementMethod2, runnable2);
        Context A042 = AnonymousClass3MY.A04(this);
        int A002 = AnonymousClass1YL.A00(AnonymousClass3MY.A04(this), r0.linkColor, r0.linkColorLegacy);
        C146787Qp r8 = new C146787Qp(runnable2, 48);
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] A1b = C72473Md.A1b(fromHtml, 0);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = A09.getSpanStart(uRLSpan);
                    int spanEnd = A09.getSpanEnd(uRLSpan);
                    int spanFlags = A09.getSpanFlags(uRLSpan);
                    A09.removeSpan(uRLSpan);
                    A09.setSpan(new C74713cF(A042, r8, A002, 6), spanStart, spanEnd, spanFlags);
                }
            }
        }
        C85384Ne r2 = this.A01;
        WaTextView waTextView = r2.A01;
        if (waTextView == null) {
            waTextView = AnonymousClass3MW.A0U(r2.A02, 2131430963);
            r2.A01 = waTextView;
            if (waTextView == null) {
                return;
            }
        }
        waTextView.setText(A09);
        waTextView.setMovementMethod(movementMethod2);
        C72473Md.A1C(waTextView);
    }

    public final boolean getDividerVisibility() {
        return this.A04;
    }

    public final String getFooterText() {
        return this.A03;
    }

    public final WaTextView getFooterTextView() {
        return this.A01.A01;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A00;
    }

    public final void setDividerVisibility(boolean z) {
        boolean z2 = this.A04;
        int i = 0;
        boolean A1S = AnonymousClass000.A1S(z2 ? 1 : 0, z ? 1 : 0);
        this.A04 = z;
        if (A1S || !this.A05) {
            C85384Ne r2 = this.A01;
            View view = r2.A00;
            if (view == null) {
                if (z) {
                    view = r2.A02.findViewById(2131430073);
                    if (view instanceof ViewStub) {
                        view = ((ViewStub) view).inflate();
                    }
                    r2.A00 = view;
                    if (view == null) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void setFooterText(String str) {
        boolean z = true;
        boolean z2 = !C18070vi.A18(this.A03, str);
        this.A03 = str;
        if (z2 || !this.A05) {
            C85384Ne r2 = this.A01;
            if (str == null) {
                z = false;
            }
            WaTextView waTextView = r2.A01;
            if (waTextView == null) {
                if (z) {
                    waTextView = AnonymousClass3MW.A0U(r2.A02, 2131430963);
                    r2.A01 = waTextView;
                    if (waTextView == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            waTextView.setText(str);
        }
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A00 = r1;
    }

    public /* synthetic */ WDSSectionFooter(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    public final void setFooterText(int i) {
        setFooterText(getResources().getString(i));
    }
}
