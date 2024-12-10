package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1np  reason: invalid class name and case insensitive filesystem */
public class C36401np {
    public final Context A00;
    public final C36391no A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1KB A04;
    public final C36361nl A05;
    public final AnonymousClass11C A06;
    public final C19830z4 A07;
    public final C32011gU A08;
    public final AnonymousClass1QO A09;
    public final AnonymousClass1QS A0A;
    public final AnonymousClass00H A0B;

    public static final void A00(Spannable spannable, AnonymousClass1QO r6, AnonymousClass1QS r7) {
        Pattern BWh;
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r6, 2);
        if (r6.A03() && (BWh = r7.A06().BWh()) != null) {
            Matcher matcher = BWh.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = AnonymousClass712.A00(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), AnonymousClass712.A01, spannable);
                Object obj = A002.first;
                C18070vi.A0W(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = A002.second;
                C18070vi.A0W(obj2);
                int intValue2 = ((Number) obj2).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append("wapay://pay/");
                sb.append(spannable.subSequence(intValue, intValue2));
                spannable.setSpan(new URLSpan(sb.toString()), intValue, intValue2, 0);
            }
        }
    }

    public static final void A01(Spannable spannable, AnonymousClass1QO r6, AnonymousClass1QS r7) {
        Pattern BWk;
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r6, 2);
        if (r6.A03() && (BWk = r7.A06().BWk()) != null) {
            Matcher matcher = BWk.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = AnonymousClass712.A00(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), AnonymousClass712.A01, spannable);
                Object obj = A002.first;
                C18070vi.A0W(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = A002.second;
                C18070vi.A0W(obj2);
                int intValue2 = ((Number) obj2).intValue();
                spannable.setSpan(new URLSpan(spannable.subSequence(intValue, intValue2).toString()), intValue, intValue2, 0);
            }
        }
    }

    public SpannableString A04(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Context context2 = context;
        C38541rS r0 = (C38541rS) this.A02.get();
        if (context == null) {
            context2 = this.A00;
        }
        return r0.A03(context2, str, runnableArr, strArr, strArr2);
    }

    public SpannableStringBuilder A06(Context context, Runnable runnable, String str, String str2, int i) {
        Context context2 = context;
        C38541rS r0 = (C38541rS) this.A02.get();
        if (context == null) {
            context2 = this.A00;
        }
        return r0.A04(context2, runnable, str, str2, i);
    }

    public SpannableStringBuilder A07(Context context, String str, Map map, int i) {
        Context context2 = context;
        this.A02.get();
        if (context == null) {
            context2 = this.A00;
        }
        C18070vi.A0d(context2, 0);
        C18070vi.A0d(str, 1);
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Map map2 = map;
                if (map2.containsKey(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C74683cC(context2, uRLSpan, map2, i, 1), spanStart, spanEnd, spanFlags);
                } else {
                    Log.w("LinkifierUtils/linkifyWithOnClickMap/url with no mapping");
                }
            }
        }
        return spannableStringBuilder;
    }

    public void A09(Spannable spannable, String str, boolean z) {
        try {
            Linkify.addLinks(spannable, 2);
            if (z) {
                C86664So[] r5 = (C86664So[]) spannable.getSpans(0, spannable.length(), C86664So.class);
                if (r5 != null) {
                    for (C86664So r1 : r5) {
                        int spanStart = spannable.getSpanStart(r1);
                        int spanEnd = spannable.getSpanEnd(r1);
                        String str2 = r1.A00;
                        spannable.removeSpan(r1);
                        spannable.setSpan(new URLSpan(str2), spanStart, spanEnd, 33);
                    }
                }
            } else {
                this.A08.A05(spannable);
            }
            A02(spannable, str);
            AnonymousClass1QS r12 = this.A0A;
            AnonymousClass1QO r0 = this.A09;
            A00(spannable, r0, r12);
            A01(spannable, r0, r12);
            Matcher matcher = AnonymousClass2W0.A00.matcher(spannable);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                spannable.setSpan(new URLSpan(spannable.subSequence(start, end).toString()), start, end, 0);
            }
            if (C18020vd.A05(C18040vf.A02, ((C52382ap) this.A0B.get()).A00, 6151)) {
                StringBuilder sb = new StringBuilder();
                sb.append("(?:");
                sb.append("R\\$|\\$|S\\/|S\\/\\.|Rp|₪|د\\.إ|TL");
                sb.append(")\\s*\\d+([.,]\\d{2})?\\b");
                Matcher matcher2 = Pattern.compile(sb.toString()).matcher(spannable);
                while (matcher2.find()) {
                    Pair A002 = AnonymousClass712.A00(new Pair(Integer.valueOf(matcher2.start()), Integer.valueOf(matcher2.end())), AnonymousClass712.A01, spannable);
                    Object obj = A002.first;
                    C18070vi.A0W(obj);
                    int intValue = ((Number) obj).intValue();
                    Object obj2 = A002.second;
                    C18070vi.A0W(obj2);
                    int intValue2 = ((Number) obj2).intValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("order:");
                    sb2.append(spannable.subSequence(intValue, intValue2));
                    spannable.setSpan(new URLSpan(sb2.toString()), intValue, intValue2, 0);
                }
            }
        } catch (Exception unused) {
        }
    }

    public SpannableString A03(Context context, String str) {
        this.A02.get();
        if (context == null) {
            context = this.A00;
        }
        return C38541rS.A00(context, str);
    }

    public void A08(Context context, Spannable spannable) {
        Context context2;
        try {
            Linkify.addLinks(spannable, 10);
            this.A08.A05(spannable);
            A02(spannable, this.A07.A0l());
            AnonymousClass1QS r1 = this.A0A;
            AnonymousClass1QO r0 = this.A09;
            A00(spannable, r0, r1);
            A01(spannable, r0, r1);
        } catch (Exception unused) {
        }
        ArrayList A0H = C26302CxJ.A0H(spannable);
        if (A0H != null && !A0H.isEmpty()) {
            Iterator it = A0H.iterator();
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                String url = uRLSpan.getURL();
                if (context != null) {
                    context2 = context;
                } else {
                    context2 = this.A00;
                }
                spannable.setSpan(new C74703cE(context2, this.A05, this.A04, this.A06, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
            }
            Iterator it2 = A0H.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
        }
    }

    public C36401np(AnonymousClass1KB r2, C36361nl r3, AnonymousClass11C r4, AnonymousClass118 r5, C19830z4 r6, C36391no r7, C32011gU r8, AnonymousClass1QO r9, AnonymousClass1QS r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A00 = r5.A00;
        this.A04 = r2;
        this.A08 = r8;
        this.A05 = r3;
        this.A01 = r7;
        this.A03 = r12;
        this.A02 = r11;
        this.A06 = r4;
        this.A0A = r10;
        this.A07 = r6;
        this.A0B = r13;
        this.A09 = r9;
        Boolean bool = C17960vV.A01;
    }

    public static void A02(Spannable spannable, String str) {
        C42771yi A002 = C42771yi.A00();
        AnonymousClass3D6 r4 = new AnonymousClass3D6(C49322Qa.A01, A002, spannable, A002.A0I(Integer.parseInt(str)));
        while (r4.hasNext()) {
            C59212lw r0 = (C59212lw) r4.next();
            int i = r0.A00;
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i + r0.A01.length()));
            if (!AnonymousClass712.A01(pair, spannable)) {
                pair = AnonymousClass712.A00(pair, AnonymousClass712.A02, spannable);
                if (!AnonymousClass712.A01(pair, spannable)) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(spannable.subSequence(((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
            spannable.setSpan(new URLSpan(sb.toString()), ((Number) pair.first).intValue(), ((Number) pair.second).intValue(), 33);
        }
    }

    public SpannableStringBuilder A05(Context context, Runnable runnable, String str, String str2) {
        return A06(context, runnable, str, str2, AnonymousClass1YL.A00(context, 2130968627, 2131099690));
    }
}
