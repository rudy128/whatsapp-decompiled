package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public class C38461rK extends FrameLayout implements AnonymousClass009 {
    public View.OnClickListener A00;
    public View A01;
    public View A02;
    public WaImageView A03;
    public WaImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public C18030ve A07;
    public AnonymousClass031 A08;
    public Boolean A09;
    public Integer A0A;
    public String A0B;
    public boolean A0C;
    public final int A0D;
    public final C28931bI A0E;

    public C38461rK(Context context, int i) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            this.A07 = (C18030ve) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A04.get();
        }
        this.A0D = i;
        C28931bI r0 = new C28931bI(LayoutInflater.from(context).inflate(2131624973, this, false));
        this.A0E = r0;
        addView(r0.A01);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContentIndicatorText(String str) {
        View view;
        if (this.A01 != null) {
            if (TextUtils.isEmpty(str)) {
                Log.i("archive/set-content-indicator-to-empty");
                view = this.A02;
            } else {
                this.A02.setVisibility(0);
                boolean equals = "@".equals(str);
                WaImageView waImageView = this.A04;
                if (equals) {
                    waImageView.setVisibility(0);
                    view = this.A05;
                } else {
                    waImageView.setVisibility(8);
                    this.A05.setText(str);
                    this.A05.setVisibility(0);
                    return;
                }
            }
            view.setVisibility(8);
            return;
        }
        this.A0B = str;
    }

    public void setEnableState(boolean z) {
        View view = this.A01;
        if (view != null) {
            view.setClickable(z);
            this.A06.setEnabled(z);
            this.A03.setEnabled(z);
            this.A05.setEnabled(z);
            this.A04.setEnabled(z);
            return;
        }
        this.A09 = Boolean.valueOf(z);
    }

    public void setImportantMessageTag(int i) {
        if (this.A01 != null) {
            this.A04.setTag(Integer.valueOf(i));
        } else {
            this.A0A = Integer.valueOf(i);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            this.A00 = onClickListener;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setVisibility(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00d8
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x00d8
            X.1bI r0 = r4.A0E
            android.view.View r1 = r0.A02()
            r4.A01 = r1
            r0 = 2131427854(0x7f0b020e, float:1.8477336E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r4.A03 = r0
            android.view.View r1 = r4.A01
            r0 = 2131427853(0x7f0b020d, float:1.8477334E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r4.A06 = r0
            android.view.View r1 = r4.A01
            r0 = 2131427848(0x7f0b0208, float:1.8477324E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r4.A05 = r0
            android.view.View r1 = r4.A01
            r0 = 2131429515(0x7f0b088b, float:1.8480705E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r4.A02 = r0
            android.view.View r1 = r4.A01
            r0 = 2131427849(0x7f0b0209, float:1.8477326E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r4.A04 = r0
            X.0ve r0 = r4.A07
            boolean r0 = X.AnonymousClass1J8.A09(r0)
            if (r0 != 0) goto L_0x0058
            com.whatsapp.WaTextView r0 = r4.A06
            X.C43421zm.A04(r0)
        L_0x0058:
            android.view.View r1 = r4.A01
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102457(0x7f060af9, float:1.7817352E38)
            android.content.res.ColorStateList r1 = X.C19740yt.A03(r1, r0)
            com.whatsapp.WaImageView r0 = r4.A03
            X.C28081Yu.A00(r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102501(0x7f060b25, float:1.7817442E38)
            android.content.res.ColorStateList r1 = X.C19740yt.A03(r1, r0)
            com.whatsapp.WaImageView r0 = r4.A04
            X.C28081Yu.A00(r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131102479(0x7f060b0f, float:1.7817397E38)
            android.content.res.ColorStateList r1 = X.C19740yt.A03(r1, r0)
            com.whatsapp.WaTextView r0 = r4.A06
            r0.setTextColor(r1)
            android.content.Context r3 = r4.getContext()
            int r2 = r4.A0D
            r1 = 1
            r0 = 2131102458(0x7f060afa, float:1.7817355E38)
            if (r2 == r1) goto L_0x00e8
            r0 = 2
            if (r2 == r0) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "archive/Unspoorted mode in ArchivePreviewView: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 0
        L_0x00b3:
            com.whatsapp.WaTextView r0 = r4.A05
            r0.setTextColor(r1)
            android.view.View$OnClickListener r0 = r4.A00
            r4.setOnClickListener(r0)
            java.lang.Boolean r0 = r4.A09
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.booleanValue()
            r4.setEnableState(r0)
        L_0x00c8:
            java.lang.Integer r0 = r4.A0A
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.intValue()
            r4.setImportantMessageTag(r0)
        L_0x00d3:
            java.lang.String r0 = r4.A0B
            r4.setContentIndicatorText(r0)
        L_0x00d8:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x00e4
            r0 = 8
            if (r5 == 0) goto L_0x00e1
            r0 = 0
        L_0x00e1:
            r1.setVisibility(r0)
        L_0x00e4:
            return
        L_0x00e5:
            r0 = 2131102501(0x7f060b25, float:1.7817442E38)
        L_0x00e8:
            android.content.res.ColorStateList r1 = X.C19740yt.A03(r3, r0)
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38461rK.setVisibility(boolean):void");
    }
}
