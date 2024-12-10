package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6z8  reason: invalid class name and case insensitive filesystem */
public final class C139606z8 {
    public int A00;
    public C20245ADd A01;
    public List A02 = C18460wS.A00;
    public final int A03;
    public final TextView A04;
    public final AnonymousClass1GP A05;
    public final AnonymousClass86T A06;
    public final C18000vb A07;
    public final C18030ve A08;
    public final AnonymousClass1F9 A09;
    public final C137136uy A0A;
    public final C137146uz A0B;

    public C139606z8(TextView textView, AnonymousClass1GP r3, AnonymousClass1F9 r4, C137136uy r5, AnonymousClass86T r6, C137146uz r7, C18000vb r8, C18030ve r9, int i) {
        C18070vi.A0d(textView, 2);
        C18070vi.A0l(r9, r8);
        this.A03 = i;
        this.A04 = textView;
        this.A09 = r4;
        this.A05 = r3;
        this.A06 = r6;
        this.A08 = r9;
        this.A07 = r8;
        this.A0A = r5;
        this.A0B = r7;
    }

    public final void A01(C20245ADd aDd, AnonymousClass77B r13, List list, int i, boolean z) {
        List list2 = list;
        C18070vi.A0d(list, 2);
        this.A02 = list;
        if (i < 0 || i >= list.size() || !((AnonymousClass77A) list.get(i)).A03) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onTextOptionsReady: provided selectedItem=");
            A10.append(i);
            C17890vO.A19(A10, " is outside of data bounds.");
            i = 0;
        }
        this.A00 = i;
        C20245ADd aDd2 = aDd;
        this.A01 = aDd;
        A00(this);
        boolean A022 = A02();
        TextView textView = this.A04;
        if (A022) {
            textView.setVisibility(0);
            AnonymousClass77B r6 = r13;
            if (!C18020vd.A05(C18040vf.A02, this.A08, 8798)) {
                this.A05.A0t(new AnonymousClass7A6(aDd, this, r13), this.A09, "text.option.selection.request.key");
            }
            textView.setOnClickListener(new AnonymousClass78F(this, r6, list2, aDd2, 1, z));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
        this.A05.A0u("text.option.selection.request.key");
    }

    public static final void A00(C139606z8 r7) {
        boolean z;
        String str;
        String str2;
        Object strikethroughSpan;
        if (AnonymousClass000.A1a(r7.A02)) {
            AnonymousClass77A r0 = (AnonymousClass77A) C29431cG.A0f(r7.A02, r7.A00);
            if (r0 != null) {
                z = r0.A01;
                str = r0.A00.A00();
            } else {
                z = false;
                str = "";
            }
            TextView textView = r7.A04;
            Context context = textView.getContext();
            Context context2 = textView.getContext();
            if (z) {
                C72463Mc.A0w(context2, context, textView, 2130970831, 2131102246);
                textView.setText(str);
                return;
            }
            C72463Mc.A0w(context2, context, textView, 2130969369, 2131100372);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C18000vb r3 = r7.A07;
            if (AnonymousClass3MW.A1Z(r3)) {
                spannableStringBuilder.append(8207);
            }
            boolean A052 = C18020vd.A05(C18040vf.A02, r7.A08, 8798);
            spannableStringBuilder.append(C27641Ww.A02(str));
            Context context3 = textView.getContext();
            if (A052) {
                C18070vi.A0X(context3);
                str2 = "   ";
            } else {
                C18070vi.A0X(context3);
                str2 = " • ";
            }
            spannableStringBuilder.append(C27641Ww.A01(r3, str2));
            spannableStringBuilder.append(context3.getString(2131894798));
            int A0F = AnonymousClass1YF.A0F(spannableStringBuilder, str, 0, false);
            if (A0F <= 0) {
                A0F = 0;
            }
            if (A052) {
                strikethroughSpan = spannableStringBuilder;
            } else {
                strikethroughSpan = new StrikethroughSpan();
            }
            spannableStringBuilder.setSpan(strikethroughSpan, A0F, str.length() + A0F, 33);
            textView.setText(new SpannedString(spannableStringBuilder));
            return;
        }
        r7.A04.setText((CharSequence) null);
    }

    public final boolean A02() {
        List<AnonymousClass77A> list = this.A02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            int i = 0;
            for (AnonymousClass77A r0 : list) {
                if (r0.A03 && (i = i + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
            if (i > 15) {
                return true;
            }
        }
        return false;
    }
}
