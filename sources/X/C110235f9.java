package X;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;
import java.util.Map;

/* renamed from: X.5f9  reason: invalid class name and case insensitive filesystem */
public final class C110235f9 extends BaseAdapter {
    public List A00 = AnonymousClass000.A13();
    public final Context A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final C18000vb A05;
    public final AnonymousClass1KW A06;
    public final C18030ve A07;
    public final C32011gU A08;
    public final C18010vc A09;
    public final C132886no A0A;
    public final C126456cl A0B;
    public final AnonymousClass7NF A0C;
    public final C32021gV A0D;
    public final Map A0E;
    public final boolean A0F;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: com.whatsapp.WaTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: com.whatsapp.WaTextView} */
    /* JADX WARNING: type inference failed for: r22v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0405, code lost:
        if (X.C446824j.A02(r4.A0D(), 20) != false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x045d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A07, 12340) == false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0469, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A07, 11428) != false) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x046b, code lost:
        r5 = r6.A0D;
        r1 = r2.A07;
        r0 = r6.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04df, code lost:
        if (r6 == 37) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x022a, code lost:
        if (r0 > 0) goto L_0x0174;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02f3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27) {
        /*
            r24 = this;
            r20 = r26
            r0 = 2
            r4 = r27
            X.C18070vi.A0d(r4, r0)
            r3 = r24
            if (r26 != 0) goto L_0x04e9
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r4)
            r1 = 2131626140(0x7f0e089c, float:1.8879508E38)
            r0 = 0
            android.view.View r20 = X.AnonymousClass3MX.A0B(r2, r4, r1, r0)
            X.6kE r2 = new X.6kE
            r0 = r20
            r2.<init>(r0, r3)
            r0.setTag(r2)
        L_0x0022:
            java.util.List r0 = r3.A00
            r1 = r25
            X.206 r4 = X.AnonymousClass3MW.A0k(r0, r1)
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            boolean r0 = r4 instanceof X.C441822l
            if (r0 == 0) goto L_0x0420
            X.5f9 r1 = r2.A0A
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0420
            android.content.Context r1 = r1.A01
            r0 = r4
            X.22l r0 = (X.C441822l) r0
            int r0 = X.C124106Xb.A00(r1, r0)
            android.graphics.drawable.LayerDrawable r1 = X.C124116Xc.A00(r1, r0)
            com.whatsapp.status.ContactStatusThumbnail r0 = r2.A07
            r0.setImageDrawable(r1)
        L_0x004a:
            java.lang.String r0 = ""
            android.text.SpannableStringBuilder r22 = X.AnonymousClass3MW.A09(r0)
            X.5f9 r7 = r2.A0A
            X.0z4 r0 = r7.A04
            boolean r21 = r0.A2U()
            android.widget.TextView r9 = r2.A04
            android.view.View r0 = r2.A00
            r23 = r0
            android.content.Context r6 = r23.getContext()
            android.content.Context r5 = r23.getContext()
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0w(r5, r6, r9, r1, r0)
            boolean r19 = X.AnonymousClass25A.A0p(r4)
            r8 = 0
            r6 = 8
            if (r19 == 0) goto L_0x026a
            r9.setVisibility(r3)
            r1 = 2131889345(0x7f120cc1, float:1.941335E38)
        L_0x007e:
            r9.setText(r1)
        L_0x0081:
            java.util.Map r9 = r7.A0E
            X.205 r11 = r4.A0v
            boolean r10 = r9.containsKey(r11)
            if (r10 == 0) goto L_0x0267
            android.content.Context r5 = r23.getContext()
            r1 = 2130970064(0x7f0405d0, float:1.7548828E38)
            r0 = 2131101205(0x7f060615, float:1.7814813E38)
            int r1 = X.AnonymousClass1YL.A00(r5, r1, r0)
        L_0x0099:
            r0 = r23
            r0.setBackgroundResource(r1)
            X.6cl r0 = r7.A0B
            X.C18070vi.A0W(r11)
            com.whatsapp.status.playback.MyStatusesActivity r5 = r0.A00
            java.util.Set r0 = r5.A13
            boolean r1 = r0.remove(r11)
            com.whatsapp.components.SelectionCheckView r0 = r2.A06
            if (r1 == 0) goto L_0x0262
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.796 r0 = new X.796
            r0.<init>(r2, r10)
            r1.addOnPreDrawListener(r0)
        L_0x00bb:
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x025f
            r0 = r4
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = r0.A02
        L_0x00c4:
            if (r19 == 0) goto L_0x0108
            android.widget.ProgressBar r5 = r2.A03
            r5.setVisibility(r3)
            android.widget.ImageView r10 = r2.A02
            r10.setVisibility(r6)
            android.view.View r8 = r2.A01
            r8.setVisibility(r6)
            com.whatsapp.WaTextView r0 = r2.A05
            r11 = r0
        L_0x00d8:
            r0.setVisibility(r6)
        L_0x00db:
            int r1 = r4.A0D()
            r0 = 20
            if (r1 != r0) goto L_0x00fe
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00fe
            X.0ve r2 = r7.A07
            r1 = 9678(0x25ce, float:1.3562E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00fe
            r8.setVisibility(r3)
            r5.setVisibility(r6)
            r10.setVisibility(r6)
        L_0x00fe:
            r10.setTag(r4)
            r11.setTag(r4)
            r8.setTag(r4)
            return r20
        L_0x0108:
            if (r1 == 0) goto L_0x011b
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x011b
            boolean r0 = r4 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0240
            r0 = r4
            X.21W r0 = (X.AnonymousClass21W) r0
            boolean r0 = X.AnonymousClass72Z.A03(r0)
            if (r0 == 0) goto L_0x0240
        L_0x011b:
            boolean r0 = r9.isEmpty()
            r12 = 1
            r0 = r0 ^ 1
            android.widget.ImageView r10 = r2.A02
            if (r0 == 0) goto L_0x0233
            r10.setVisibility(r6)
        L_0x0129:
            java.util.HashMap r0 = r5.A0z
            java.lang.Number r15 = X.C108945cZ.A1D(r11, r0)
            com.whatsapp.WaTextView r11 = r2.A05
            r11.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r8, r8)
            if (r15 != 0) goto L_0x0145
            r11.setVisibility(r6)
            com.whatsapp.status.playback.MyStatusesActivity.A0y(r4, r5, r3)
        L_0x013c:
            android.widget.ProgressBar r5 = r2.A03
            r5.setVisibility(r6)
        L_0x0141:
            android.view.View r0 = r2.A01
            r8 = r0
            goto L_0x00d8
        L_0x0145:
            r11.setVisibility(r3)
            android.content.Context r5 = r7.A01
            android.content.res.Resources r13 = r5.getResources()
            r1 = 2131755491(0x7f1001e3, float:1.9141863E38)
            int r14 = r15.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r3] = r15
            java.lang.String r0 = r13.getQuantityString(r1, r14, r0)
            r11.setContentDescription(r0)
            if (r21 == 0) goto L_0x0226
            android.content.res.Resources r13 = r5.getResources()
            r1 = 2131755303(0x7f100127, float:1.9141481E38)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r3] = r15
            java.lang.String r22 = r13.getQuantityString(r1, r14, r0)
            X.C18070vi.A0X(r22)
        L_0x0174:
            r0 = r22
            r11.setText(r0)
        L_0x0179:
            X.8BG r0 = X.C63892tr.A01(r4)
            if (r0 == 0) goto L_0x022e
            int r0 = r0.BXt()
            if (r0 <= 0) goto L_0x022e
            X.0ve r13 = r7.A07
            r1 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r13, r1)
            if (r0 == 0) goto L_0x022e
            r0 = 2131233300(0x7f080a14, float:1.8082734E38)
            android.graphics.drawable.Drawable r14 = X.C24261Jm.A00(r5, r0)
            if (r14 == 0) goto L_0x013c
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167978(0x7f070aea, float:1.7950245E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.setBounds(r3, r3, r0, r0)
            X.0vb r13 = r7.A05
            boolean r0 = X.AnonymousClass3MW.A1Z(r13)
            r1 = r8
            if (r0 == 0) goto L_0x01b2
            r1 = r14
        L_0x01b2:
            boolean r0 = X.AnonymousClass3MY.A1b(r13)
            if (r0 != 0) goto L_0x01b9
            r14 = r8
        L_0x01b9:
            r11.setCompoundDrawables(r1, r8, r14, r8)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r11.setCompoundDrawablePadding(r0)
            r8 = 2131896396(0x7f12284c, float:1.9427652E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.CharSequence r0 = r11.getText()
            java.lang.String r0 = X.C17880vN.A0q(r5, r0, r1, r3, r8)
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r0)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.CharSequence r0 = r11.getContentDescription()
            r8.append(r0)
            r0 = 32
            r8.append(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131896344(0x7f122818, float:1.9427547E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r8)
            r11.setContentDescription(r0)
            java.lang.String r1 = X.C18070vi.A0H(r12)
            r0 = 8226(0x2022, float:1.1527E-41)
            int r8 = X.AnonymousClass1YF.A0C(r1, r0, r3, r3)
            r1 = 2130970341(0x7f0406e5, float:1.754939E38)
            r0 = 2131101313(0x7f060681, float:1.7815032E38)
            int r1 = X.AnonymousClass3Ma.A00(r5, r1, r0)
            r0 = -1
            if (r8 == r0) goto L_0x0221
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r5.<init>(r1)
            int r1 = r8 + 1
            r0 = 17
            r12.setSpan(r5, r8, r1, r0)
        L_0x0221:
            r11.setText(r12)
            goto L_0x013c
        L_0x0226:
            int r0 = r22.length()
            if (r0 <= 0) goto L_0x0179
            goto L_0x0174
        L_0x022e:
            r11.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r8, r8)
            goto L_0x013c
        L_0x0233:
            r10.setVisibility(r3)
            android.content.Context r1 = r7.A01
            r0 = 2131892383(0x7f12189f, float:1.9419513E38)
            X.AnonymousClass3MY.A0w(r1, r10, r0)
            goto L_0x0129
        L_0x0240:
            android.widget.ImageView r10 = r2.A02
            r10.setVisibility(r6)
            com.whatsapp.WaTextView r11 = r2.A05
            r11.setVisibility(r6)
            boolean r0 = r1.A0f
            android.widget.ProgressBar r5 = r2.A03
            if (r0 == 0) goto L_0x0255
            r5.setVisibility(r3)
            goto L_0x0141
        L_0x0255:
            r5.setVisibility(r6)
            android.view.View r8 = r2.A01
            r8.setVisibility(r3)
            goto L_0x00db
        L_0x025f:
            r1 = r8
            goto L_0x00c4
        L_0x0262:
            r0.A04(r10, r3)
            goto L_0x00bb
        L_0x0267:
            r1 = 0
            goto L_0x0099
        L_0x026a:
            r1 = 4
            int r0 = r4.A0D()
            boolean r0 = X.C446824j.A02(r0, r1)
            if (r0 == 0) goto L_0x03e2
            int r0 = X.C72453Mb.A07(r21)
            r9.setVisibility(r0)
            long r0 = r4.A0H
            r10 = 0
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x0286
            long r0 = r4.A0I
        L_0x0286:
            X.11P r10 = r7.A03
            X.0vb r5 = r7.A05
            java.lang.String r0 = X.C108965cb.A0q(r10, r5, r0)
            android.text.SpannableStringBuilder r10 = X.AnonymousClass3MW.A09(r0)
            X.6no r12 = r7.A0A
            r11 = 1
            r5 = 2
            X.00H r0 = r12.A03
            int r1 = X.AnonymousClass72B.A00(r0)
            if (r1 == r11) goto L_0x0353
            if (r1 == r5) goto L_0x0353
            r0 = 3
            if (r1 != r0) goto L_0x0334
            X.00H r0 = r12.A02
            java.lang.Object r14 = r0.get()
            X.1x5 r14 = (X.C41801x5) r14
            android.content.Context r13 = X.AnonymousClass3MY.A04(r9)
            int r18 = r9.getLineHeight()
            android.content.res.Resources r11 = r9.getResources()
            android.content.Context r5 = r9.getContext()
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            int r17 = X.AnonymousClass3Ma.A01(r5, r11, r1, r0)
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131103156(0x7f060db4, float:1.781877E38)
            int r16 = r1.getColor(r0)
            X.6Re r11 = X.C122646Re.FACEBOOK
            boolean r0 = r14.A05(r11, r4)
            if (r0 == 0) goto L_0x0347
            r5 = 2131233617(0x7f080b51, float:1.8083377E38)
            r1 = r17
        L_0x02e2:
            r0 = r18
            android.text.SpannableStringBuilder r0 = X.AnonymousClass6YA.A00(r13, r0, r5, r1)
            r12.append(r0)
        L_0x02eb:
            X.6Re r15 = X.C122646Re.INSTAGRAM
            boolean r0 = r14.A05(r15, r4)
            if (r0 == 0) goto L_0x033b
            r0 = 2131233618(0x7f080b52, float:1.8083379E38)
        L_0x02f6:
            r5 = r17
            r1 = r18
            android.text.SpannableStringBuilder r0 = X.AnonymousClass6YA.A00(r13, r1, r0, r5)
            r12.append(r0)
        L_0x0301:
            boolean r0 = r14.A04(r11, r4)
            if (r0 != 0) goto L_0x030d
            boolean r0 = r14.A04(r15, r4)
            if (r0 == 0) goto L_0x0331
        L_0x030d:
            r0 = 32
            android.text.SpannableStringBuilder r14 = r12.append(r0)
            r0 = 2131898364(0x7f122ffc, float:1.9431644E38)
            java.lang.String r0 = X.C18070vi.A0F(r13, r0)
            android.text.SpannableStringBuilder r11 = X.AnonymousClass3MW.A09(r0)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r0 = r16
            r5.<init>(r0)
            int r1 = r11.length()
            r0 = 33
            r11.setSpan(r5, r3, r1, r0)
            r14.append(r11)
        L_0x0331:
            r10.append(r12)
        L_0x0334:
            if (r21 == 0) goto L_0x03db
            r9.setText(r10)
            goto L_0x0081
        L_0x033b:
            boolean r0 = r14.A04(r15, r4)
            if (r0 == 0) goto L_0x0301
            r0 = 2131233618(0x7f080b52, float:1.8083379E38)
            r17 = r16
            goto L_0x02f6
        L_0x0347:
            boolean r0 = r14.A04(r11, r4)
            if (r0 == 0) goto L_0x02eb
            r5 = 2131233617(0x7f080b51, float:1.8083377E38)
            r1 = r16
            goto L_0x02e2
        L_0x0353:
            X.00H r1 = r12.A05
            X.1x7 r0 = X.C108945cZ.A12(r1)
            boolean r0 = r0.A05(r4)
            if (r0 == 0) goto L_0x039d
            r1.get()
            android.content.Context r13 = X.AnonymousClass3MY.A04(r9)
            int r12 = r9.getLineHeight()
            android.content.res.Resources r11 = r9.getResources()
            android.content.Context r5 = r9.getContext()
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            int r1 = X.AnonymousClass3Ma.A01(r5, r11, r1, r0)
            r0 = 2131232284(0x7f08061c, float:1.8080673E38)
            android.text.SpannableStringBuilder r0 = X.AnonymousClass6YI.A00(r13, r12, r0, r1)
            r10.append(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131899427(0x7f123423, float:1.94338E38)
        L_0x0392:
            java.lang.String r0 = r1.getString(r0)
            r5.append(r0)
            r9.setContentDescription(r5)
            goto L_0x0334
        L_0x039d:
            X.1x7 r0 = X.C108945cZ.A12(r1)
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x0334
            r1.get()
            android.content.Context r13 = X.AnonymousClass3MY.A04(r9)
            int r12 = r9.getLineHeight()
            android.content.res.Resources r11 = r9.getResources()
            android.content.Context r5 = r9.getContext()
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            int r1 = X.AnonymousClass3Ma.A01(r5, r11, r1, r0)
            r0 = 2131232285(0x7f08061d, float:1.8080675E38)
            android.text.SpannableStringBuilder r0 = X.AnonymousClass6YI.A00(r13, r12, r0, r1)
            r10.append(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131899428(0x7f123424, float:1.9433802E38)
            goto L_0x0392
        L_0x03db:
            r0 = r22
            r0.append(r10)
            goto L_0x0081
        L_0x03e2:
            r9.setVisibility(r3)
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x03f8
            r0 = r4
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x03f8
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x03f8
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x0407
        L_0x03f8:
            int r1 = r4.A0D()
            r0 = 20
            boolean r0 = X.C446824j.A02(r1, r0)
            r1 = 2131895762(0x7f1225d2, float:1.9426366E38)
            if (r0 == 0) goto L_0x007e
        L_0x0407:
            r0 = 2131895761(0x7f1225d1, float:1.9426364E38)
            r9.setText(r0)
            android.content.Context r10 = r23.getContext()
            android.content.Context r5 = r23.getContext()
            r1 = 2130971379(0x7f040af3, float:1.7551495E38)
            r0 = 2131102602(0x7f060b8a, float:1.7817647E38)
            X.C72463Mc.A0w(r5, r10, r9, r1, r0)
            goto L_0x0081
        L_0x0420:
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x043e
            r0 = r4
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = X.AnonymousClass3Ma.A0M(r0)
            boolean r6 = r0.A01()
            X.5f9 r0 = r2.A0A
            X.1gV r5 = r0.A0D
            com.whatsapp.status.ContactStatusThumbnail r1 = r2.A07
            X.7NF r0 = r0.A0C
            if (r6 != 0) goto L_0x0471
            r5.A0E(r1, r4, r0)
            goto L_0x004a
        L_0x043e:
            boolean r0 = r4 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0476
            X.5f9 r6 = r2.A0A
            r1 = r4
            X.210 r1 = (X.AnonymousClass210) r1
            byte[] r0 = r1.A1A()
            if (r0 == 0) goto L_0x0476
            X.205 r0 = r1.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x045f
            X.0ve r5 = r6.A07
            r1 = 12340(0x3034, float:1.7292E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 != 0) goto L_0x046b
        L_0x045f:
            X.0ve r5 = r6.A07
            r1 = 11428(0x2ca4, float:1.6014E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0476
        L_0x046b:
            X.1gV r5 = r6.A0D
            com.whatsapp.status.ContactStatusThumbnail r1 = r2.A07
            X.7NF r0 = r6.A0C
        L_0x0471:
            r5.A0D(r1, r4, r0)
            goto L_0x004a
        L_0x0476:
            int r6 = r4.A0u
            if (r6 != 0) goto L_0x04c7
            X.5f9 r1 = r2.A0A
            X.1gU r0 = r1.A08
            java.lang.String r14 = X.AnonymousClass74F.A05(r0, r4)
            r0 = r4
            X.210 r0 = (X.AnonymousClass210) r0
            com.whatsapp.TextData r9 = r0.A02
            android.content.Context r7 = r1.A01
            X.1KW r11 = r1.A06
            X.11C r10 = r1.A02
            X.0vc r12 = r1.A09
            if (r14 == 0) goto L_0x049d
            int r1 = r14.length()
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 <= r0) goto L_0x049d
            java.lang.String r14 = X.C108955ca.A0q(r3, r0, r14)
        L_0x049d:
            android.view.View r0 = r2.A00
            android.content.Context r1 = X.AnonymousClass3MY.A04(r0)
            if (r9 == 0) goto L_0x04ad
            int r0 = r9.fontStyle
            android.graphics.Typeface r8 = X.AnonymousClass74F.A04(r1, r0)
            if (r8 != 0) goto L_0x04af
        L_0x04ad:
            android.graphics.Typeface r8 = android.graphics.Typeface.SANS_SERIF
        L_0x04af:
            X.C18070vi.A0s(r7, r11, r10, r12)
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            X.6Ia r6 = new X.6Ia
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.status.ContactStatusThumbnail r5 = r2.A07
            float r1 = r5.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r6.A00 = r1
            r5.setImageDrawable(r6)
            goto L_0x004a
        L_0x04c7:
            com.whatsapp.status.ContactStatusThumbnail r5 = r2.A07
            r0 = 1
            if (r6 == r0) goto L_0x04e1
            r0 = 3
            if (r6 == r0) goto L_0x04e1
            r0 = 15
            r1 = 2131232325(0x7f080645, float:1.8080756E38)
            if (r6 == r0) goto L_0x04e4
            r0 = 23
            if (r6 == r0) goto L_0x04e1
            r0 = 37
            r1 = 2131231230(0x7f0801fe, float:1.8078535E38)
            if (r6 != r0) goto L_0x04e4
        L_0x04e1:
            r1 = 2131232351(0x7f08065f, float:1.8080809E38)
        L_0x04e4:
            r5.setImageResource(r1)
            goto L_0x004a
        L_0x04e9:
            java.lang.Object r2 = r20.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.status.playback.MyStatusesAdapter.ViewHolder"
            X.C18070vi.A0z(r2, r0)
            X.6kE r2 = (X.C130926kE) r2
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110235f9.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C110235f9(Context context, AnonymousClass11C r3, AnonymousClass11P r4, C19830z4 r5, C18000vb r6, AnonymousClass1KW r7, C18030ve r8, C32011gU r9, C18010vc r10, C132886no r11, C126456cl r12, AnonymousClass7NF r13, C32021gV r14, Map map, boolean z) {
        C108985cd.A1D(map, r11);
        this.A07 = r8;
        this.A01 = context;
        this.A0E = map;
        this.A0A = r11;
        this.A06 = r7;
        this.A0C = r13;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A0D = r14;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A0F = z;
        this.A0B = r12;
    }
}
