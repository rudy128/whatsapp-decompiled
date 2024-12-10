package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.72j  reason: invalid class name and case insensitive filesystem */
public final class C1406472j {
    public int A00;
    public int A01;
    public TextView A02;
    public StatusPlaybackContactFragment A03;
    public List A04 = C18460wS.A00;
    public final C24641Lc A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final Runnable A0B;

    public C1406472j(C24641Lc r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        int A0G = C72453Mb.A0G(r3, r4, 1);
        C72473Md.A1M(r5, r6, r7, 3);
        C18070vi.A0d(r8, 6);
        this.A05 = r3;
        this.A09 = r4;
        this.A08 = r5;
        this.A06 = r6;
        this.A0A = r7;
        this.A07 = r8;
        this.A0B = AnonymousClass7RI.A00(this, A0G);
    }

    public static final SpannableStringBuilder A00(AnonymousClass77U r8, C1406472j r9, String str, int i, boolean z) {
        Context A1n;
        Drawable A002;
        int i2;
        Resources A092;
        Context context;
        TextView textView = r9.A02;
        if (textView == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StatusPlaybackContactFragment statusPlaybackContactFragment = r9.A03;
        if (!(statusPlaybackContactFragment == null || (A1n = statusPlaybackContactFragment.A1n()) == null || (A002 = C24261Jm.A00(A1n, i)) == null)) {
            spannableStringBuilder.append(' ');
            StatusPlaybackContactFragment statusPlaybackContactFragment2 = r9.A03;
            if (statusPlaybackContactFragment2 == null || (A092 = AnonymousClass3MZ.A09(statusPlaybackContactFragment2)) == null) {
                i2 = -1;
            } else {
                StatusPlaybackContactFragment statusPlaybackContactFragment3 = r9.A03;
                if (statusPlaybackContactFragment3 != null) {
                    context = statusPlaybackContactFragment3.A1n();
                } else {
                    context = null;
                }
                i2 = AnonymousClass3Ma.A01(context, A092, 2130971957, 2131103410);
            }
            int lineHeight = textView.getLineHeight();
            A002.setBounds(0, 0, (A002.getIntrinsicWidth() * lineHeight) / A002.getIntrinsicHeight(), lineHeight);
            A002.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
            A002.setAutoMirrored(false);
            C27831Xu.A0G(textView.getLayoutDirection(), A002);
            spannableStringBuilder.setSpan(new ImageSpan(A002), 0, 1, 33);
        }
        SpannableStringBuilder A093 = AnonymousClass3MW.A09(spannableStringBuilder);
        A093.append(' ');
        A093.append(str);
        int length = A093.length();
        int length2 = A093.length() - str.length();
        if (r8 != null) {
            if (C18020vd.A05(C18040vf.A02, r9.A05.A01, 10970)) {
                String str2 = r8.A02;
                if (str2 != null) {
                    if ((!AnonymousClass1YF.A0T(str2)) && !z) {
                        length = str2.length() + length2;
                    }
                    return A093;
                }
                Log.e("TopAttributionManager/maybeSetupHeaderCTA/music author is null");
                return A093;
            }
        }
        A093.setSpan(new StyleSpan(1), length2, length, 18);
        return A093;
    }

    public static final C139986zl A01(C1406472j r3) {
        if (r3.A04.isEmpty()) {
            return null;
        }
        if (r3.A00 >= Math.min(r3.A04.size(), 2)) {
            r3.A00 = 0;
        }
        List list = r3.A04;
        int i = r3.A00;
        r3.A00 = i + 1;
        return (C139986zl) list.get(i);
    }

    public static final void A02(C1406472j r4, C139986zl r5) {
        TextView textView = r4.A02;
        if (textView != null) {
            textView.setText(r5.A01);
            textView.setVisibility(0);
            textView.setContentDescription(r5.A03);
            View.OnClickListener onClickListener = r5.A00;
            if (onClickListener != null) {
                textView.setOnClickListener(onClickListener);
            }
            if (r4.A04.size() > 1 && r4.A01 < 2) {
                if (C18020vd.A05(C18040vf.A02, r4.A05.A01, 11818)) {
                    textView.postDelayed(r4.A0B, 3000);
                }
            }
        }
    }
}
