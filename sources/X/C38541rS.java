package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;

/* renamed from: X.1rS  reason: invalid class name and case insensitive filesystem */
public final class C38541rS {
    public final AnonymousClass1L8 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11C A02;

    public C38541rS(AnonymousClass1L8 r2, AnonymousClass1KB r3, AnonymousClass11C r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final SpannableString A00(Context context, String str) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new C72843Ns(context, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
            }
        }
        return spannableString;
    }

    public static final SpannableStringBuilder A01(Context context, Runnable runnable, String str) {
        C18070vi.A0d(str, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C74713cF(context, runnable, AnonymousClass1YL.A00(context, 2130971981, 2131101293), 4), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A02(Context context, Runnable runnable, String str, String str2, int i, boolean z) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C39391t0(context, runnable, i, z), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableString A03(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Runnable runnable;
        Context context2 = context;
        C18070vi.A0d(context2, 0);
        String str2 = str;
        C18070vi.A0d(str2, 1);
        SpannableString spannableString = new SpannableString(Html.fromHtml(str2));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            for (int i = 0; i < length; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (C18070vi.A18(strArr[i], uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    if (runnableArr != null) {
                        runnable = runnableArr[i];
                    } else {
                        runnable = null;
                    }
                    spannableString.removeSpan(uRLSpan);
                    C74703cE r10 = new C74703cE(context2, this.A00, this.A01, this.A02, (AnonymousClass206) null, strArr2[i]);
                    if (runnable != null) {
                        r10.A04(new C92114gm(runnable, 6));
                    }
                    spannableString.setSpan(r10, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableString;
    }

    public final SpannableStringBuilder A04(Context context, Runnable runnable, String str, String str2, int i) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        Runnable runnable2 = runnable;
        C18070vi.A0d(runnable, 5);
        return A02(context, runnable2, str, str2, i, true);
    }
}
