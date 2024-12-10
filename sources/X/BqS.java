package X;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;
import java.util.Iterator;

public abstract class BqS extends AnonymousClass3uL {
    public int A00 = 0;
    public final View A01 = AnonymousClass1HF.A06(this, 2131436800);
    public final WaTextView A02 = ((WaTextView) AnonymousClass1HF.A06(this, 2131436802));
    public final ViewOnceDownloadProgressView A03 = ((ViewOnceDownloadProgressView) AnonymousClass1HF.A06(this, 2131436796));
    public final View A04 = AnonymousClass1HF.A06(this, 2131432248);

    private void A01() {
        Integer[] numArr = new Integer[5];
        numArr[0] = 2131895332;
        AnonymousClass000.A1M(numArr, 2131897929);
        AnonymousClass3Ma.A1S(numArr, 2131897948);
        C17890vO.A1G(numArr, 2131897916);
        AnonymousClass3Ma.A1T(numArr, 2131897928);
        Iterator it = Arrays.asList(numArr).iterator();
        while (it.hasNext()) {
            String string = getContext().getString(C72453Mb.A0H(it));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            getContext();
            spannableStringBuilder.setSpan(new C22628BGo(), 0, string.length(), 0);
            this.A00 = Math.max(this.A00, (int) Layout.getDesiredWidth(spannableStringBuilder, this.A02.getPaint())) + getResources().getDimensionPixelSize(2131166159);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public static void A02(ViewOnceDownloadProgressView viewOnceDownloadProgressView, AnonymousClass21V r5, int i, boolean z) {
        int i2;
        Context context;
        int i3;
        int i4;
        int i5;
        Context context2;
        int i6;
        if (i == 0 || i == 1) {
            i2 = 2131232409;
            context = viewOnceDownloadProgressView.getContext();
            i3 = 2130971720;
            viewOnceDownloadProgressView.A00(i2, -1, AnonymousClass4Z9.A00(context, i3));
        } else {
            if (i == 2) {
                i4 = 2131232411;
            } else if (i == 3) {
                i2 = 2131232412;
                context = viewOnceDownloadProgressView.getContext();
                i3 = 2130971719;
                viewOnceDownloadProgressView.A00(i2, -1, AnonymousClass4Z9.A00(context, i3));
            } else {
                i4 = 2131232410;
            }
            if (z) {
                i4 = 2131232411;
                i5 = 2131231887;
                context2 = viewOnceDownloadProgressView.getContext();
                i6 = 2130971720;
            } else {
                i5 = 2131231887;
                context2 = viewOnceDownloadProgressView.getContext();
                i6 = 2130971719;
            }
            viewOnceDownloadProgressView.A00(i4, i5, AnonymousClass4Z9.A00(context2, i6));
        }
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            C88564a8.A01(viewOnceDownloadProgressView.A01, r5, viewOnceDownloadProgressView.A04);
        }
        viewOnceDownloadProgressView.setVisibility(0);
    }

    public void A2t() {
        this.A03.A00(2131231887, -1, 2131102856);
        WaTextView waTextView = this.A02;
        waTextView.setTextColor(getResources().getColor(2131102856));
        waTextView.A0K();
        A2u();
        this.A01.setVisibility(0);
        AnonymousClass3MY.A0w(getContext(), waTextView, getMediaTypeDescriptionString());
    }

    public void A2u() {
        if (this.A00 == 0) {
            A01();
        }
        this.A02.setWidth(this.A00);
    }

    public void A2v() {
        if (this.A0l.Bew(getFMessage())) {
            C42491yG.A08(this.A04, -1);
        }
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass21V);
        super.setFMessage(r2);
    }

    public BqS(Context context, C108875cR r3, AnonymousClass21V r4) {
        super(context, r3, r4);
    }

    public void A1u() {
        super.A1u();
        A2v();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2v();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2w(android.view.View r7, int r8, boolean r9) {
        /*
            r6 = this;
            X.AnonymousClass1Y5.A01(r7)
            r0 = 1
            r7.setImportantForAccessibility(r0)
            if (r8 == 0) goto L_0x0118
            if (r8 == r0) goto L_0x0120
            r2 = 0
            r1 = 2
            if (r8 == r1) goto L_0x00f9
            r0 = 3
            if (r8 == r0) goto L_0x00e5
            if (r9 != 0) goto L_0x0110
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.AnonymousClass3MY.A0w(r1, r7, r0)
            X.1rL r0 = r6.A0D
            r7.setOnClickListener(r0)
            r0 = 2131887592(0x7f1205e8, float:1.9409795E38)
        L_0x0027:
            X.AnonymousClass1Y5.A02(r7, r0)
        L_0x002a:
            X.AnonymousClass3uP.A0W(r7, r6)
            r2 = r6
            boolean r0 = r6 instanceof X.C23816BqR
            if (r0 == 0) goto L_0x00d4
            r0 = 3
            if (r8 != r0) goto L_0x0096
            com.whatsapp.WaTextView r5 = r6.A02
            r6.getContext()
            android.content.Context r1 = r6.getContext()
            r0 = 2131895332(0x7f122424, float:1.9425494E38)
        L_0x0041:
            java.lang.String r4 = r1.getString(r0)
            java.util.HashMap r0 = X.C26302CxJ.A01
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r4)
            X.BGo r2 = new X.BGo
            r2.<init>()
            r1 = 0
            int r0 = r4.length()
            r3.setSpan(r2, r1, r0, r1)
            r5.setText(r3)
        L_0x005c:
            if (r9 == 0) goto L_0x0080
            r0 = 3
            if (r8 != r0) goto L_0x0080
            com.whatsapp.WaTextView r4 = r6.A02
            android.content.res.Resources r3 = r6.getResources()
            android.content.Context r2 = r4.getContext()
            r1 = 2130971949(0x7f040d2d, float:1.755265E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r0 = X.AnonymousClass3Ma.A01(r2, r3, r1, r0)
        L_0x0075:
            r4.setTextColor(r0)
            r4.A0L()
            r0 = 0
            r7.setVisibility(r0)
            return
        L_0x0080:
            com.whatsapp.WaTextView r4 = r6.A02
            android.content.Context r2 = r6.getContext()
            android.content.Context r1 = r6.getContext()
            r0 = 2130971720(0x7f040c48, float:1.7552186E38)
            int r0 = X.AnonymousClass4Z9.A00(r1, r0)
            int r0 = X.C19740yt.A00(r2, r0)
            goto L_0x0075
        L_0x0096:
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeString()
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            r0 = 8203(0x200b, float:1.1495E-41)
            android.text.SpannableStringBuilder r4 = r5.append(r0)
            r0 = 2
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r0)
            int r0 = r5.length()
            int r2 = r0 + -1
            int r0 = r5.length()
            int r1 = r0 + -1
            r0 = 0
            r4.setSpan(r3, r2, r1, r0)
            com.whatsapp.WaTextView r2 = r6.A02
            r2.setText(r5)
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            goto L_0x005c
        L_0x00d4:
            X.BqP r2 = (X.C23814BqP) r2
            com.whatsapp.WaTextView r5 = r2.A02
            r2.getContext()
            android.content.Context r1 = r2.getContext()
            int r0 = r2.getMediaTypeString()
            goto L_0x0041
        L_0x00e5:
            android.content.Context r0 = r6.getContext()
            r1 = 2131895332(0x7f122424, float:1.9425494E38)
            X.AnonymousClass3MY.A0w(r0, r7, r1)
            X.1rL r0 = r6.A0E
            r7.setOnClickListener(r0)
            X.AnonymousClass1Y5.A02(r7, r1)
            goto L_0x002a
        L_0x00f9:
            if (r9 != 0) goto L_0x0110
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.AnonymousClass3MY.A0w(r1, r7, r0)
            X.1rL r0 = r6.A0F
            r6.setViewMessageOnClickListener(r7, r0)
            r0 = 2131897860(0x7f122e04, float:1.9430621E38)
            goto L_0x0027
        L_0x0110:
            r7.setOnClickListener(r2)
            r7.setImportantForAccessibility(r1)
            goto L_0x002a
        L_0x0118:
            android.content.Context r1 = r6.getContext()
            r0 = 2131896784(0x7f1229d0, float:1.942844E38)
            goto L_0x0127
        L_0x0120:
            android.content.Context r1 = r6.getContext()
            r0 = 2131896783(0x7f1229cf, float:1.9428437E38)
        L_0x0127:
            X.AnonymousClass3MY.A0w(r1, r7, r0)
            X.1rL r0 = r6.A0C
            r7.setOnClickListener(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqS.A2w(android.view.View, int, boolean):void");
    }

    public int getCenteredLayoutId() {
        return 2131624959;
    }

    public int getIncomingLayoutId() {
        return 2131624959;
    }

    public int getMediaTypeDescriptionString() {
        AnonymousClass215 r1 = (AnonymousClass215) getFMessage();
        boolean z = r1 instanceof C441122e;
        int Bbc = r1.Bbc();
        if (z) {
            if (Bbc == 1) {
                return 2131897951;
            }
            if (Bbc != 2) {
                return 2131897949;
            }
            return 2131897950;
        } else if (Bbc == 1) {
            return 2131897932;
        } else {
            if (Bbc != 2) {
                return 2131897930;
            }
            return 2131897931;
        }
    }

    public int getMediaTypeString() {
        AnonymousClass21V fMessage = getFMessage();
        if (fMessage instanceof C441122e) {
            return 2131897948;
        }
        if (fMessage instanceof C444523m) {
            return 2131897956;
        }
        return 2131897929;
    }

    public int getOutgoingLayoutId() {
        return 2131624960;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A01();
        A2u();
    }

    public void setViewMessageOnClickListener(View view, C38471rL r2) {
        view.setOnClickListener(r2);
    }
}
