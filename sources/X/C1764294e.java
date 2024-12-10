package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.94e  reason: invalid class name and case insensitive filesystem */
public final class C1764294e extends AnonymousClass8IQ {
    public final ViewGroup A00;
    public final WaImageView A01;
    public final C20005A2v A02;
    public final C18000vb A03;
    public final C32021gV A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final C18030ve A09;
    public final AnonymousClass10I A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C183399Yc r23) {
        /*
            r22 = this;
            r1 = r23
            r9 = 0
            X.C18070vi.A0d(r1, r9)
            X.94A r1 = (X.AnonymousClass94A) r1
            X.AET r8 = r1.A01
            X.21K r0 = r1.A02
            r20 = r0
            X.AEt r0 = r20.BPK()
            if (r0 == 0) goto L_0x0114
            X.AEn r7 = r0.A02
        L_0x0016:
            X.AEI r0 = r1.A00
            r19 = r0
            r6 = r22
            com.whatsapp.WaImageView r5 = r6.A01
            android.content.res.Resources r3 = X.AnonymousClass000.A0Y(r5)
            com.whatsapp.WaTextView r1 = r6.A08
            java.lang.String r0 = r8.A04
            r1.setText(r0)
            int r14 = r8.A01
            r4 = 1
            if (r14 <= 0) goto L_0x003f
            com.whatsapp.WaTextView r2 = r6.A06
            r1 = 2131893277(0x7f121c1d, float:1.9421326E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C17880vN.A1T(r0, r14, r9)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.setText(r0)
        L_0x003f:
            r10 = 8
            if (r7 == 0) goto L_0x0066
            X.AE1 r12 = r8.A03
            com.whatsapp.WaTextView r11 = r6.A05
            if (r12 != 0) goto L_0x00cc
            X.AE1 r13 = r8.A02
            long r2 = r13.A01
            long r0 = (long) r14
            long r2 = r2 * r0
            int r12 = r13.A00
            java.lang.String r0 = r13.A02
            X.AE1 r1 = new X.AE1
            r1.<init>(r2, r12, r0)
            X.0vb r0 = r6.A03
            java.lang.String r0 = r7.A07(r0, r1)
            r11.setText(r0)
            com.whatsapp.WaTextView r0 = r6.A07
            r0.setVisibility(r10)
        L_0x0066:
            java.util.List r0 = r8.A07
            r18 = r0
            X.0ve r12 = r6.A09
            r0 = 8798(0x225e, float:1.2329E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r12, r0)
            if (r0 == 0) goto L_0x0117
            if (r18 == 0) goto L_0x0117
            android.view.ViewGroup r13 = r6.A00
            r13.setVisibility(r9)
            r13.removeAllViews()
            int r0 = r18.size()
            r10 = 2
            int r17 = java.lang.Math.min(r10, r0)
            r3 = 0
        L_0x008a:
            r0 = r17
            if (r3 >= r0) goto L_0x011c
            r0 = r18
            java.lang.Object r0 = r0.get(r3)
            X.ADk r0 = (X.C20252ADk) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            r21 = r0
            android.view.View r0 = r6.A0H
            r2 = r0
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            com.whatsapp.WaTextView r14 = new com.whatsapp.WaTextView
            r14.<init>(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r14.setTextSize(r10, r0)
            android.content.res.Resources r16 = X.AnonymousClass000.A0Y(r2)
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r9] = r1
            r0 = 2131893278(0x7f121c1e, float:1.9421328E38)
            r2 = r21
            r1 = r16
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r1, r2, r15, r4, r0)
            X.C18070vi.A0X(r0)
            r14.setText(r0)
            r13.addView(r14)
            int r3 = r3 + 1
            goto L_0x008a
        L_0x00cc:
            long r0 = r12.A01
            long r2 = (long) r14
            long r0 = r0 * r2
            int r14 = r12.A00
            java.lang.String r12 = r12.A02
            X.AE1 r13 = new X.AE1
            r13.<init>(r0, r14, r12)
            X.0vb r12 = r6.A03
            java.lang.String r0 = r7.A07(r12, r13)
            r11.setText(r0)
            com.whatsapp.WaTextView r11 = r6.A07
            r11.setVisibility(r9)
            X.AE1 r14 = r8.A02
            long r0 = r14.A01
            long r0 = r0 * r2
            int r13 = r14.A00
            java.lang.String r3 = r14.A02
            X.AE1 r2 = new X.AE1
            r2.<init>(r0, r13, r3)
            java.lang.String r0 = r7.A07(r12, r2)
            if (r0 == 0) goto L_0x010f
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
            r0 = r3
        L_0x010f:
            r11.setText(r0)
            goto L_0x0066
        L_0x0114:
            r7 = 0
            goto L_0x0016
        L_0x0117:
            android.view.ViewGroup r0 = r6.A00
            r0.setVisibility(r10)
        L_0x011c:
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "custom-item"
            boolean r0 = X.AnonymousClass1YE.A0A(r1, r0, r9)
            if (r0 == 0) goto L_0x0145
            android.content.Context r2 = X.C108945cZ.A0D(r6)
            r1 = 2131231926(0x7f0804b6, float:1.8079947E38)
            r0 = 2131102016(0x7f060940, float:1.7816458E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            X.C18070vi.A0X(r0)
            r5.setImageDrawable(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            return
        L_0x0145:
            if (r19 == 0) goto L_0x0159
            X.A2v r3 = r6.A02
            r1 = 2
            X.ANY r0 = new X.ANY
            r0.<init>(r1)
            r6 = 0
            r4 = r5
            r5 = r19
            r7 = r0
            r8 = r1
            r3.A04(r4, r5, r6, r7, r8)
            return
        L_0x0159:
            r0 = 7581(0x1d9d, float:1.0623E-41)
            boolean r0 = X.C18020vd.A05(r11, r12, r0)
            if (r0 == 0) goto L_0x017b
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x017b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x017b
            X.C17960vV.A07(r1)
            X.9Ay r2 = new X.9Ay
            r2.<init>(r5, r1)
            X.10I r1 = r6.A0A
            java.lang.String[] r0 = new java.lang.String[r9]
            r1.CGD(r2, r0)
            return
        L_0x017b:
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            X.AEU r0 = r7.A0D
            java.util.List r1 = r0.A09
            int r0 = r7.A01()
            if (r0 != r4) goto L_0x01a3
            if (r1 == 0) goto L_0x01a3
            int r0 = r1.size()
            if (r0 != r4) goto L_0x01a3
            r0 = 5
            X.AeF r2 = new X.AeF
            r2.<init>(r6, r0)
            X.1gV r1 = r6.A04
            r0 = r20
            X.206 r0 = (X.AnonymousClass206) r0
            r1.A0D(r5, r0, r2)
            return
        L_0x01a3:
            A00(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764294e.A0B(X.9Yc):void");
    }

    public C1764294e(View view, C20005A2v a2v, C18000vb r4, C18030ve r5, C32021gV r6, AnonymousClass10I r7) {
        super(view);
        this.A02 = a2v;
        this.A03 = r4;
        this.A04 = r6;
        this.A09 = r5;
        this.A0A = r7;
        this.A01 = C108965cb.A0I(view, 2131431848);
        this.A08 = AnonymousClass3Ma.A0N(view, 2131431850);
        this.A06 = AnonymousClass3Ma.A0N(view, 2131431841);
        this.A05 = AnonymousClass3Ma.A0N(view, 2131431840);
        this.A07 = AnonymousClass3Ma.A0N(view, 2131431846);
        this.A00 = (ViewGroup) C18070vi.A05(view, 2131436665);
    }

    public static final void A00(C1764294e r3) {
        Drawable A022 = AnonymousClass4aX.A02(C108945cZ.A0D(r3), 2131232303, 2131102016);
        C18070vi.A0X(A022);
        WaImageView waImageView = r3.A01;
        waImageView.setImageDrawable(A022);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
