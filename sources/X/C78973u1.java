package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3u1  reason: invalid class name and case insensitive filesystem */
public class C78973u1 extends C78403sk implements AnonymousClass5XH {
    public C19880zA A00;
    public C19880zA A01;
    public C19880zA A02;
    public C19880zA A03;
    public C32191gn A04;
    public AnonymousClass496 A05;
    public AnonymousClass1VP A06;
    public C203411t A07;
    public C27191Vc A08;
    public AnonymousClass4Q5 A09;
    public SharePhoneNumberRowViewModel A0A;
    public AnonymousClass11P A0B;
    public AnonymousClass1TD A0C;
    public AnonymousClass1TA A0D;
    public C27081Uq A0E;
    public C56882iB A0F;
    public AnonymousClass1R5 A0G;
    public AnonymousClass1PU A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public final View.OnClickListener A0U = new C89904dD(this, 30);
    public final TextView A0V;

    public boolean A2Z() {
        return false;
    }

    public boolean A2c() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if ((r8 instanceof X.AnonymousClass2MD) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x028a, code lost:
        if (X.AnonymousClass000.A1P(r1.A00) == ((X.C35771mm) r9.A1f.get()).A08(r3)) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0300, code lost:
        if (r4 != 86) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0343, code lost:
        if (r0 != false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x037c, code lost:
        if (r1 == 5) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x038f, code lost:
        if (r1 != 5) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (r13 != 2131233337) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (r4 != 67) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r11 = X.C26302CxJ.A0C(r9.A0C, r9.A1M, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0627, code lost:
        if (r11 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0629, code lost:
        r11 = android.text.Html.fromHtml(r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014c, code lost:
        if (r0 == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0183, code lost:
        if (r0 != false) goto L_0x0185;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09() {
        /*
            r18 = this;
            r9 = r18
            X.206 r8 = r9.A0I
            X.20i r8 = (X.C436420i) r8
            r7 = 0
            r9.setClickable(r7)
            android.widget.TextView r6 = r9.A0V
            float r0 = r9.getDividerFontSize()
            r6.setTextSize(r0)
            int r0 = r8.A0D()
            r1 = -1
            if (r0 != r1) goto L_0x0025
            int r0 = r8.A0u
            if (r0 != r1) goto L_0x0025
        L_0x001e:
            r0 = 2131890320(0x7f121090, float:1.9415328E38)
            r6.setText(r0)
            return
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r9.getBackgroundDrawable()
            if (r0 == 0) goto L_0x002e
            r6.setBackground(r0)
        L_0x002e:
            android.content.Context r1 = r9.getContext()
            int r0 = r9.getTextColor()
            X.AnonymousClass3MX.A1C(r1, r6, r0)
            X.1gn r0 = r9.A04     // Catch:{ all -> 0x0754 }
            r5 = 1
            java.lang.String r4 = r0.A0S(r8, r5)     // Catch:{ all -> 0x0754 }
            android.content.Context r3 = r9.getContext()
            android.text.TextPaint r2 = r6.getPaint()
            r1 = 1067869798(0x3fa66666, float:1.3)
            X.1KW r0 = r9.A15
            java.lang.CharSequence r11 = X.C43251zV.A04(r3, r2, r0, r4, r1)
            int r4 = r8.A00
            r1 = 164(0xa4, float:2.3E-43)
            r10 = 68
            r12 = 56
            r13 = 156(0x9c, float:2.19E-43)
            r0 = 11
            r3 = 67
            r2 = 146(0x92, float:2.05E-43)
            if (r4 == r5) goto L_0x074e
            if (r4 == r0) goto L_0x074e
            if (r4 == r3) goto L_0x006f
            r0 = 69
            if (r4 != r0) goto L_0x03ce
            boolean r0 = r8 instanceof X.AnonymousClass2MD
            if (r0 == 0) goto L_0x0559
        L_0x006f:
            boolean r0 = r9 instanceof X.AnonymousClass3t2
            if (r0 == 0) goto L_0x0310
            r0 = 2131232015(0x7f08050f, float:1.8080127E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            android.content.Context r10 = r9.getContext()
            r1 = 2130969245(0x7f04029d, float:1.7547166E38)
            r0 = 2131100250(0x7f06025a, float:1.7812876E38)
            int r0 = X.AnonymousClass1YL.A00(r10, r1, r0)
            android.util.Pair r1 = X.C17890vO.A0E(r12, r0)
        L_0x008c:
            java.lang.Object r0 = r1.first
            int r13 = X.AnonymousClass000.A0M(r0)
            java.lang.Object r0 = r1.second
            int r12 = X.AnonymousClass000.A0M(r0)
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 != 0) goto L_0x00d3
            X.0ve r10 = r9.A0F
            r1 = 7131(0x1bdb, float:9.993E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x00b8
            r0 = 2131232015(0x7f08050f, float:1.8080127E38)
            if (r13 == r0) goto L_0x00d3
            r0 = 2131233337(0x7f080a39, float:1.8082809E38)
            if (r13 == r0) goto L_0x00d3
        L_0x00b8:
            android.content.Context r0 = r9.getContext()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass03S.A01(r0, r13)
            X.C17960vV.A07(r1)
            int r0 = X.AnonymousClass3MY.A02(r9, r12)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass4aX.A08(r1, r0)
        L_0x00cb:
            android.text.TextPaint r0 = r6.getPaint()
            java.lang.CharSequence r11 = X.C72813Np.A03(r0, r10, r11)
        L_0x00d3:
            if (r4 == r2) goto L_0x00d7
            if (r4 != r3) goto L_0x00df
        L_0x00d7:
            X.11C r1 = r9.A0C
            X.0vc r0 = r9.A1M
            java.lang.CharSequence r11 = X.C26302CxJ.A0C(r1, r0, r11)
        L_0x00df:
            r6.setText(r11)
            r0 = 18
            if (r4 == r0) goto L_0x01a6
            r0 = 96
            if (r4 == r0) goto L_0x01a6
            r0 = 57
            if (r4 == r0) goto L_0x01a6
            r0 = 71
            if (r4 == r0) goto L_0x01a6
            r0 = 28
            if (r4 != r0) goto L_0x0304
            X.11S r0 = r9.A0U
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r8 instanceof X.AnonymousClass2MN
            if (r0 == 0) goto L_0x01a6
            r0 = r8
            X.2MN r0 = (X.AnonymousClass2MN) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = X.AnonymousClass3Ma.A1X(r8, r0)
            if (r0 == 0) goto L_0x01a6
        L_0x010d:
            boolean r0 = X.AnonymousClass25A.A0u(r8)
            if (r0 != 0) goto L_0x01a6
            r0 = 61
            if (r4 == r0) goto L_0x01a6
            r0 = 69
            if (r4 == r0) goto L_0x01a6
            r0 = 62
            if (r4 == r0) goto L_0x01a6
            r0 = 37
            if (r4 == r0) goto L_0x01a6
            r0 = 39
            if (r4 == r0) goto L_0x01a6
            r0 = 40
            if (r4 == r0) goto L_0x01a6
            r0 = 41
            if (r4 == r0) goto L_0x01a6
            r0 = 44
            if (r4 == r0) goto L_0x01a6
            r0 = 70
            if (r4 == r0) goto L_0x01a6
            r0 = 117(0x75, float:1.64E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 68
            if (r4 == r0) goto L_0x01a6
            r0 = 58
            if (r4 != r0) goto L_0x0263
            boolean r0 = r8 instanceof X.AnonymousClass2MI
            if (r0 == 0) goto L_0x014e
            r0 = r8
            X.2MI r0 = (X.AnonymousClass2MI) r0
            boolean r0 = r0.A00
        L_0x014c:
            if (r0 != 0) goto L_0x01a6
        L_0x014e:
            boolean r0 = r8.A17()
            if (r0 == 0) goto L_0x0174
            X.1BI r1 = r8.A0H()
            if (r1 == 0) goto L_0x0174
            X.11S r0 = r9.A0U
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x0174
            boolean r0 = X.C22971Dz.A0f(r8)
            if (r0 == 0) goto L_0x0174
            r0 = 15
            if (r4 == r0) goto L_0x0174
            r0 = 16
            if (r4 == r0) goto L_0x0174
            r0 = 56
            if (r4 != r0) goto L_0x01a6
        L_0x0174:
            X.11S r1 = r9.A0U
            X.1MZ r3 = r9.A0z
            X.1BI r0 = r8.A0H()
            if (r0 == 0) goto L_0x0185
            boolean r0 = r1.A0O(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0186
        L_0x0185:
            r1 = 0
        L_0x0186:
            r0 = 56
            if (r4 != r0) goto L_0x025d
            if (r1 != 0) goto L_0x01a6
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            X.1EC r0 = X.AnonymousClass3MY.A0b(r0)
            boolean r0 = r3.A0K(r0)
            if (r0 != 0) goto L_0x01a6
        L_0x019a:
            boolean r0 = r8 instanceof X.AnonymousClass98B
            if (r0 == 0) goto L_0x01af
            r0 = 77
            if (r4 == r0) goto L_0x01a6
            r0 = 78
            if (r4 != r0) goto L_0x01af
        L_0x01a6:
            android.view.View$OnClickListener r0 = r9.A0U
            r6.setOnClickListener(r0)
            X.AnonymousClass3MW.A1Q(r6)
            return
        L_0x01af:
            r0 = 11
            if (r4 == r0) goto L_0x01a6
            r0 = 20
            if (r4 == r0) goto L_0x01a6
            r0 = 93
            if (r4 == r0) goto L_0x01a6
            r0 = 94
            if (r4 == r0) goto L_0x01a6
            r0 = 97
            if (r4 == r0) goto L_0x01a6
            r0 = 99
            if (r4 == r0) goto L_0x01a6
            r0 = 79
            if (r4 == r0) goto L_0x01a6
            r0 = 134(0x86, float:1.88E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 138(0x8a, float:1.93E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 137(0x89, float:1.92E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 101(0x65, float:1.42E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 102(0x66, float:1.43E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 103(0x67, float:1.44E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 107(0x6b, float:1.5E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 171(0xab, float:2.4E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 115(0x73, float:1.61E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 114(0x72, float:1.6E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 113(0x71, float:1.58E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 140(0x8c, float:1.96E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 141(0x8d, float:1.98E-43)
            if (r4 == r0) goto L_0x01a6
            if (r4 == r2) goto L_0x01a6
            r0 = 145(0x91, float:2.03E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 150(0x96, float:2.1E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 151(0x97, float:2.12E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 147(0x93, float:2.06E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 156(0x9c, float:2.19E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 155(0x9b, float:2.17E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 157(0x9d, float:2.2E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 158(0x9e, float:2.21E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 172(0xac, float:2.41E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 162(0xa2, float:2.27E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 164(0xa4, float:2.3E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 169(0xa9, float:2.37E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 170(0xaa, float:2.38E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 173(0xad, float:2.42E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 177(0xb1, float:2.48E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 0
            r6.setOnClickListener(r0)
            r6.setClickable(r7)
            return
        L_0x025d:
            r0 = 59
            if (r4 != r0) goto L_0x019a
            goto L_0x01a6
        L_0x0263:
            r0 = 153(0x99, float:2.14E-43)
            if (r4 != r0) goto L_0x028e
            boolean r0 = r8 instanceof X.AnonymousClass2MK
            if (r0 == 0) goto L_0x014e
            r1 = r8
            X.2MK r1 = (X.AnonymousClass2MK) r1
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3Ma.A0o(r1)
            if (r3 == 0) goto L_0x014e
            int r0 = r1.A01
            if (r0 != 0) goto L_0x014e
            int r0 = r1.A00
            boolean r1 = X.AnonymousClass000.A1P(r0)
            X.00H r0 = r9.A1f
            java.lang.Object r0 = r0.get()
            X.1mm r0 = (X.C35771mm) r0
            boolean r0 = r0.A08(r3)
            if (r1 != r0) goto L_0x014e
            goto L_0x01a6
        L_0x028e:
            r0 = 175(0xaf, float:2.45E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 174(0xae, float:2.44E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 27
            if (r4 == r0) goto L_0x01a6
            r0 = 131(0x83, float:1.84E-43)
            if (r4 == r0) goto L_0x01a6
            r0 = 73
            if (r4 == r0) goto L_0x01a6
            r0 = 74
            if (r4 == r0) goto L_0x01a6
            r0 = 83
            if (r4 == r0) goto L_0x01a6
            r0 = 84
            if (r4 == r0) goto L_0x01a6
            r0 = 85
            if (r4 == r0) goto L_0x01a6
            r0 = 14
            if (r4 != r0) goto L_0x02c7
            X.0ve r1 = r9.A0F
            r0 = r8
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.C32191gn.A0I(r1, r0)
            goto L_0x014c
        L_0x02c7:
            r0 = 12
            if (r4 != r0) goto L_0x02ee
            X.0ve r1 = r9.A0F
            r0 = r8
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            boolean r0 = X.C32191gn.A0I(r1, r0)
            if (r0 != 0) goto L_0x01a6
            X.1gn r0 = r9.A04
            boolean r0 = r0.A0U(r8, r5)
            if (r0 != 0) goto L_0x01a6
            X.1CJ r1 = r9.A0E
            X.1MZ r0 = r9.A0z
            boolean r0 = X.C62822s3.A00(r1, r0, r8)
            goto L_0x014c
        L_0x02ee:
            r0 = 75
            if (r4 == r0) goto L_0x01a6
            r0 = 100
            if (r4 == r0) goto L_0x01a6
            r0 = 95
            if (r4 == r0) goto L_0x01a6
            r0 = 76
            if (r4 == r0) goto L_0x01a6
            r0 = 86
            if (r4 == r0) goto L_0x01a6
            goto L_0x014e
        L_0x0304:
            r0 = 10
            if (r4 == r0) goto L_0x01a6
            if (r4 == r3) goto L_0x01a6
            r0 = 21
            if (r4 == r0) goto L_0x01a6
            goto L_0x010d
        L_0x0310:
            X.205 r0 = r8.A0v
            X.1BI r10 = r0.A00
            X.1MB r0 = r9.A1A
            boolean r0 = r0.A03(r10)
            if (r0 != 0) goto L_0x0399
            X.0ve r0 = r9.A0F
            boolean r0 = X.C43381zi.A01(r0, r10)
            if (r0 != 0) goto L_0x0399
            X.12L r0 = r9.A17
            boolean r0 = X.C42761yh.A01(r0, r10)
            if (r0 != 0) goto L_0x0399
            if (r4 != r3) goto L_0x0362
            boolean r0 = r8 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x03a7
            r0 = r8
            X.2MC r0 = (X.AnonymousClass2MC) r0
            int r1 = r0.A00
            X.0ve r0 = r9.A0F
            boolean r0 = X.C43381zi.A00(r0, r10)
            switch(r1) {
                case 5: goto L_0x0345;
                case 6: goto L_0x0345;
                case 7: goto L_0x0345;
                case 8: goto L_0x0345;
                case 9: goto L_0x0345;
                case 10: goto L_0x0345;
                case 11: goto L_0x0340;
                case 12: goto L_0x0340;
                case 13: goto L_0x0340;
                case 14: goto L_0x0340;
                case 15: goto L_0x0345;
                case 16: goto L_0x0345;
                case 17: goto L_0x0345;
                default: goto L_0x0340;
            }
        L_0x0340:
            r12 = 2131232072(0x7f080548, float:1.8080243E38)
            if (r0 == 0) goto L_0x0348
        L_0x0345:
            r12 = 2131232015(0x7f08050f, float:1.8080127E38)
        L_0x0348:
            boolean r0 = X.C22971Dz.A0S(r10)
            android.content.Context r10 = r9.getContext()
            if (r0 != 0) goto L_0x0392
            switch(r1) {
                case 5: goto L_0x0392;
                case 6: goto L_0x0392;
                case 7: goto L_0x0392;
                case 8: goto L_0x0392;
                case 9: goto L_0x0392;
                case 10: goto L_0x0392;
                case 11: goto L_0x0355;
                case 12: goto L_0x0355;
                case 13: goto L_0x0355;
                case 14: goto L_0x0355;
                case 15: goto L_0x0392;
                case 16: goto L_0x0392;
                case 17: goto L_0x0392;
                default: goto L_0x0355;
            }
        L_0x0355:
            r1 = 2131100266(0x7f06026a, float:1.7812909E38)
        L_0x0358:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            android.util.Pair r1 = X.C17890vO.A0E(r0, r1)
            goto L_0x008c
        L_0x0362:
            r0 = 69
            if (r4 != r0) goto L_0x03a7
            boolean r0 = r8 instanceof X.AnonymousClass2MD
            if (r0 == 0) goto L_0x03a7
            r0 = r8
            X.2MD r0 = (X.AnonymousClass2MD) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 == r0) goto L_0x037e
            r0 = 3
            if (r1 == r0) goto L_0x037e
            r0 = 4
            if (r1 == r0) goto L_0x037e
            r0 = 5
            r12 = 2131232072(0x7f080548, float:1.8080243E38)
            if (r1 != r0) goto L_0x0381
        L_0x037e:
            r12 = 2131232015(0x7f08050f, float:1.8080127E38)
        L_0x0381:
            android.content.Context r10 = r9.getContext()
            r0 = 2
            if (r1 == r0) goto L_0x0392
            r0 = 3
            if (r1 == r0) goto L_0x0392
            r0 = 4
            if (r1 == r0) goto L_0x0392
            r0 = 5
            if (r1 == r0) goto L_0x0392
            goto L_0x0355
        L_0x0392:
            r1 = 2130970505(0x7f040789, float:1.7549722E38)
            r0 = 2131101875(0x7f0608b3, float:1.7816172E38)
            goto L_0x03c5
        L_0x0399:
            r12 = 2131233337(0x7f080a39, float:1.8082809E38)
            android.content.Context r10 = r9.getContext()
            r1 = 2130969252(0x7f0402a4, float:1.754718E38)
            r0 = 2131100262(0x7f060266, float:1.78129E38)
            goto L_0x03c5
        L_0x03a7:
            boolean r0 = X.AnonymousClass25A.A0f(r8)
            if (r0 == 0) goto L_0x03ca
            boolean r0 = r8 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x03ca
            r0 = r8
            X.2MC r0 = (X.AnonymousClass2MC) r0
            int r0 = r0.A00
            if (r0 == 0) goto L_0x03ca
            r12 = 2131232015(0x7f08050f, float:1.8080127E38)
            android.content.Context r10 = r9.getContext()
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100265(0x7f060269, float:1.7812907E38)
        L_0x03c5:
            int r1 = X.AnonymousClass1YL.A00(r10, r1, r0)
            goto L_0x0358
        L_0x03ca:
            r12 = 2131232072(0x7f080548, float:1.8080243E38)
            goto L_0x0355
        L_0x03ce:
            if (r4 == r2) goto L_0x006f
            if (r4 == r13) goto L_0x006f
            r0 = 32
            if (r4 == r0) goto L_0x0714
            r0 = 31
            if (r4 == r0) goto L_0x0714
            if (r4 == r12) goto L_0x0732
            r0 = 59
            if (r4 == r0) goto L_0x0732
            if (r4 == r10) goto L_0x0732
            r0 = 70
            if (r4 != r0) goto L_0x042b
            boolean r0 = r8 instanceof X.AnonymousClass2MM
            if (r0 == 0) goto L_0x001e
            X.496 r0 = r9.A05
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r12 = r8
            X.2MM r12 = (X.AnonymousClass2MM) r12
            android.content.Context r10 = r9.getContext()
            if (r0 == 0) goto L_0x0414
            r13 = 2131232346(0x7f08065a, float:1.8080799E38)
        L_0x03fc:
            android.content.Context r12 = r9.getContext()
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A04(r12, r10, r1, r0, r13)
            android.text.TextPaint r0 = r6.getPaint()
            java.lang.CharSequence r11 = X.C72813Np.A03(r0, r1, r11)
            goto L_0x00df
        L_0x0414:
            int r1 = r12.A00
            r0 = 2
            if (r1 == r0) goto L_0x0427
            r0 = 3
            if (r1 == r0) goto L_0x0427
            boolean r0 = r12.A02
            r13 = 2131231742(0x7f0803fe, float:1.8079574E38)
            if (r0 == 0) goto L_0x03fc
            r13 = 2131232399(0x7f08068f, float:1.8080906E38)
            goto L_0x03fc
        L_0x0427:
            r13 = 2131233309(0x7f080a1d, float:1.8082752E38)
            goto L_0x03fc
        L_0x042b:
            if (r4 != r1) goto L_0x0486
            android.text.TextPaint r11 = r6.getPaint()
            r0 = r8
            X.2MF r0 = (X.AnonymousClass2MF) r0
            java.lang.String r14 = r0.A01
            android.content.Context r13 = r9.getContext()
            r12 = 2131892401(0x7f1218b1, float:1.941955E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "\""
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r14, r1)
            java.lang.String r10 = X.C17880vN.A0q(r13, r0, r10, r7, r12)
            r1 = 1152647168(0x44b40000, float:1440.0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r13 = android.text.TextUtils.ellipsize(r10, r11, r1, r0)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.content.Context r1 = r9.getContext()
            r0 = 2131892403(0x7f1218b3, float:1.9419553E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r12 = X.AnonymousClass3MW.A09(r0)
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r5)
            int r1 = r12.length()
            r0 = 33
            r12.setSpan(r10, r7, r1, r0)
            android.text.SpannableStringBuilder r1 = r11.append(r13)
            java.lang.String r0 = "\" "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r0.append(r12)
            goto L_0x00df
        L_0x0486:
            r0 = 169(0xa9, float:2.37E-43)
            if (r4 == r0) goto L_0x0692
            r0 = 170(0xaa, float:2.38E-43)
            if (r4 == r0) goto L_0x0692
            r0 = 162(0xa2, float:2.27E-43)
            if (r4 != r0) goto L_0x0508
            r0 = r8
            X.2MG r0 = (X.AnonymousClass2MG) r0
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            long r0 = r0.A01
            r11.setTimeInMillis(r0)
            X.0vb r10 = r9.A0D
            java.lang.String r10 = X.A8I.A03(r10, r11)
            X.0vb r12 = r9.A0D
            X.11Y r11 = X.AnonymousClass11X.A00
            java.lang.String r13 = r11.A06(r12, r0)
            X.0vb r12 = r9.A0D
            X.11P r0 = r9.A0B
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.String r15 = r11.A06(r12, r0)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            android.content.Context r1 = r9.getContext()
            r0 = 2131892406(0x7f1218b6, float:1.941956E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r12 = X.AnonymousClass3MW.A09(r0)
            android.text.style.StyleSpan r14 = new android.text.style.StyleSpan
            r14.<init>(r5)
            int r1 = r12.length()
            r0 = 33
            r12.setSpan(r14, r7, r1, r0)
            boolean r0 = r13.equals(r15)
            java.lang.String r1 = " "
            android.content.res.Resources r15 = X.AnonymousClass000.A0Y(r9)
            if (r0 == 0) goto L_0x04fe
            r14 = 2131892405(0x7f1218b5, float:1.9419557E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r10
        L_0x04ed:
            java.lang.String r0 = r15.getString(r14, r0)
            android.text.SpannableStringBuilder r0 = r11.append(r0)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            r0.append(r12)
            goto L_0x00df
        L_0x04fe:
            r14 = 2131892404(0x7f1218b4, float:1.9419555E38)
            java.lang.Object[] r0 = X.AnonymousClass3MX.A1b(r10, r7)
            r0[r5] = r13
            goto L_0x04ed
        L_0x0508:
            r0 = 96
            if (r4 != r0) goto L_0x052b
            boolean r0 = r8 instanceof X.C1771197i
        L_0x050e:
            if (r0 == 0) goto L_0x00df
            android.content.Context r1 = r9.getContext()
            r0 = 2131231856(0x7f080470, float:1.8079805E38)
            android.graphics.drawable.Drawable r13 = X.AnonymousClass3MX.A06(r1, r0)
            android.content.Context r12 = r9.getContext()
            android.content.Context r10 = r9.getContext()
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
            goto L_0x072d
        L_0x052b:
            r0 = 97
            if (r4 != r0) goto L_0x053e
            r9.getContext()
            X.0zA r0 = r9.A03
            r0.A03()
            java.lang.String r0 = "getSmbChatAssignmentIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x053e:
            r0 = 99
            if (r4 != r0) goto L_0x0545
            boolean r0 = r8 instanceof X.AnonymousClass988
            goto L_0x050e
        L_0x0545:
            r0 = 117(0x75, float:1.64E-43)
            if (r4 == r0) goto L_0x0685
            r0 = 121(0x79, float:1.7E-43)
            if (r4 == r0) goto L_0x0685
            r0 = 134(0x86, float:1.88E-43)
            if (r4 != r0) goto L_0x0559
            r12 = 2131100225(0x7f060241, float:1.7812825E38)
            r13 = 2131233381(0x7f080a65, float:1.8082898E38)
            goto L_0x00b8
        L_0x0559:
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 147(0x93, float:2.06E-43)
            if (r4 == r0) goto L_0x0633
            r0 = 155(0x9b, float:2.17E-43)
            if (r4 == r0) goto L_0x0633
            r0 = 157(0x9d, float:2.2E-43)
            if (r4 != r0) goto L_0x05be
            android.content.Context r10 = r9.getContext()
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100265(0x7f060269, float:1.7812907E38)
            int r10 = X.AnonymousClass1YL.A00(r10, r1, r0)
            r13 = 2131233268(0x7f0809f4, float:1.8082669E38)
            X.0ve r1 = r9.A0F
            r0 = 10379(0x288b, float:1.4544E-41)
            X.0vf r12 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x0591
            X.0ve r1 = r9.A0F
            r0 = 10388(0x2894, float:1.4557E-41)
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 != 0) goto L_0x0591
            r13 = 2131233270(0x7f0809f6, float:1.8082673E38)
        L_0x0591:
            android.content.Context r0 = r9.getContext()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass03S.A01(r0, r13)
            X.C17960vV.A07(r1)
            int r0 = X.AnonymousClass3MY.A02(r9, r10)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass4aX.A08(r1, r0)
            X.0ve r1 = r9.A0F
            r0 = 10379(0x288b, float:1.4544E-41)
            boolean r0 = X.C18020vd.A05(r12, r1, r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "i "
            java.lang.String r0 = X.AnonymousClass001.A1E(r11, r0, r1)
            android.text.Spanned r11 = android.text.Html.fromHtml(r0)
            goto L_0x00cb
        L_0x05be:
            r0 = 158(0x9e, float:2.21E-43)
            if (r4 != r0) goto L_0x05ee
            android.content.Context r10 = r9.getContext()
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100265(0x7f060269, float:1.7812907E38)
            int r12 = X.AnonymousClass1YL.A00(r10, r1, r0)
            r13 = 2131233268(0x7f0809f4, float:1.8082669E38)
            X.0ve r1 = r9.A0F
            r0 = 10379(0x288b, float:1.4544E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 == 0) goto L_0x00b8
            X.0ve r1 = r9.A0F
            r0 = 10388(0x2894, float:1.4557E-41)
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 != 0) goto L_0x00b8
            r13 = 2131233270(0x7f0809f6, float:1.8082673E38)
            goto L_0x00b8
        L_0x05ee:
            r0 = 172(0xac, float:2.41E-43)
            if (r4 != r0) goto L_0x0623
            r13 = r8
            X.464 r13 = (X.AnonymousClass464) r13
            android.content.Context r12 = r9.getContext()
            r11 = 2131889155(0x7f120c03, float:1.9412966E38)
            java.lang.Object[] r10 = X.AnonymousClass3MW.A1b()
            X.1gn r0 = r9.A04
            java.lang.String r0 = r0.A0O(r13)
            r10[r7] = r0
            X.1gn r0 = r9.A04
            X.1gU r1 = r0.A0B
            java.lang.String r0 = r13.A00
            X.C18070vi.A0d(r1, r7)
            int r1 = X.AnonymousClass4X8.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0620
            java.lang.String r0 = "Instagram"
        L_0x061a:
            java.lang.String r11 = X.C17880vN.A0q(r12, r0, r10, r5, r11)
            goto L_0x00df
        L_0x0620:
            java.lang.String r0 = "Facebook"
            goto L_0x061a
        L_0x0623:
            r0 = 153(0x99, float:2.14E-43)
            if (r4 != r0) goto L_0x00d3
            if (r11 == 0) goto L_0x00df
            java.lang.String r0 = r11.toString()
            android.text.Spanned r11 = android.text.Html.fromHtml(r0)
            goto L_0x00df
        L_0x0633:
            X.1gh r10 = r9.A1Y
            android.content.Context r14 = r9.getContext()
            android.text.TextPaint r12 = r6.getPaint()
            r0 = 155(0x9b, float:2.17E-43)
            boolean r0 = X.AnonymousClass000.A1T(r4, r0)
            X.1gi r10 = (X.C32141gi) r10
            X.C18070vi.A0e(r11, r5, r12)
            if (r0 != 0) goto L_0x00df
            X.00H r0 = r10.A02
            boolean r0 = X.C72463Mc.A1V(r0)
            r1 = 2131233337(0x7f080a39, float:1.8082809E38)
            if (r0 == 0) goto L_0x0658
            r1 = 2131233269(0x7f0809f5, float:1.808267E38)
        L_0x0658:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()
            java.lang.String r0 = "i "
            java.lang.String r0 = X.AnonymousClass001.A1E(r11, r0, r13)
            android.text.Spanned r13 = android.text.Html.fromHtml(r0)
            X.118 r0 = r10.A00
            android.content.Context r11 = r0.A00
            android.graphics.drawable.Drawable r10 = X.AnonymousClass3MX.A06(r11, r1)
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
            int r0 = X.AnonymousClass3MZ.A02(r14, r11, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A08(r10, r0)
            java.lang.CharSequence r11 = X.C72813Np.A03(r12, r0, r13)
            X.C18070vi.A0b(r11)
            goto L_0x00df
        L_0x0685:
            android.content.Context r1 = r9.getContext()
            r0 = 2131233223(0x7f0809c7, float:1.8082577E38)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass3MX.A06(r1, r0)
            goto L_0x00cb
        L_0x0692:
            r11 = r8
            X.2MQ r11 = (X.AnonymousClass2MQ) r11
            com.whatsapp.jid.UserJid r0 = r11.A0I()
            if (r0 == 0) goto L_0x0711
            X.1M9 r1 = r9.A0j
            com.whatsapp.jid.UserJid r0 = r11.A0I()
            X.C17960vV.A07(r0)
            X.1E7 r12 = r1.A0E(r0)
            if (r12 == 0) goto L_0x0711
            X.11S r0 = r9.A0U
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r12)
            if (r0 == 0) goto L_0x06fa
            android.content.Context r1 = r9.getContext()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r13 = r1.getString(r0)
        L_0x06bd:
            android.content.Context r14 = r9.getContext()
            int r15 = r11.A00
            r16 = 0
            r12 = 170(0xaa, float:2.38E-43)
            long r0 = r11.A00
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 != r12) goto L_0x06f1
            r0 = 2131890063(0x7f120f8f, float:1.9414807E38)
            if (r10 == 0) goto L_0x06d5
            r0 = 2131890062(0x7f120f8e, float:1.9414805E38)
        L_0x06d5:
            java.lang.String r12 = r14.getString(r0)
            java.lang.Object[] r10 = X.AnonymousClass3MX.A1b(r13, r7)
            java.lang.String r0 = r11.A01
            r10[r5] = r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r0 = X.AnonymousClass1EG.A0K(r10)
            java.lang.String r0 = java.lang.String.format(r1, r12, r0)
            android.text.Spanned r11 = android.text.Html.fromHtml(r0)
            goto L_0x00df
        L_0x06f1:
            r0 = 2131890148(0x7f120fe4, float:1.941498E38)
            if (r10 == 0) goto L_0x06d5
            r0 = 2131890147(0x7f120fe3, float:1.9414978E38)
            goto L_0x06d5
        L_0x06fa:
            X.1Me r1 = r9.A0l
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            int r10 = r1.A0B(r0)
            X.0vb r1 = r9.A0D
            X.1Me r0 = r9.A0l
            java.lang.String r0 = r0.A0U(r12, r10, r7)
            java.lang.String r13 = r1.A0F(r0)
            goto L_0x06bd
        L_0x0711:
            java.lang.String r13 = ""
            goto L_0x06bd
        L_0x0714:
            android.content.Context r1 = r9.getContext()
            r0 = 2131231775(0x7f08041f, float:1.807964E38)
            android.graphics.drawable.Drawable r13 = X.AnonymousClass3MX.A06(r1, r0)
            android.content.Context r12 = r9.getContext()
            android.content.Context r10 = r9.getContext()
            r1 = 2130969253(0x7f0402a5, float:1.7547183E38)
            r0 = 2131100263(0x7f060267, float:1.7812903E38)
        L_0x072d:
            int r0 = X.AnonymousClass1YL.A00(r10, r1, r0)
            goto L_0x0744
        L_0x0732:
            android.content.Context r1 = r9.getContext()
            r0 = 2131231888(0x7f080490, float:1.807987E38)
            android.graphics.drawable.Drawable r13 = X.AnonymousClass3MX.A06(r1, r0)
            android.content.Context r12 = r9.getContext()
            r0 = 2131100225(0x7f060241, float:1.7812825E38)
        L_0x0744:
            int r0 = X.C19740yt.A00(r12, r0)
            android.graphics.drawable.Drawable r10 = X.AnonymousClass4aX.A08(r13, r0)
            goto L_0x00cb
        L_0x074e:
            java.lang.CharSequence r11 = r9.A1p(r11)
            goto L_0x00df
        L_0x0754:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973u1.A09():void");
    }

    private boolean A0A() {
        AnonymousClass1EC A0n;
        AnonymousClass1EC A0i = AnonymousClass3MW.A0i(this.A0I.A0v.A00);
        if (A0i == null || !this.A0E.A0R(A0i) || (A0n = C72453Mb.A0n(A0i, this.A0L)) == null) {
            return false;
        }
        this.A07.CAo(getContext(), this, A0n);
        return true;
    }

    private boolean A0C(C436420i r6, String str) {
        C48392Mh r62 = (C48392Mh) r6;
        if (!C32191gn.A0I(this.A0F, r62.A01.size())) {
            return false;
        }
        List list = r62.A01;
        C18070vi.A0h(str, list);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = new GroupChangedParticipantsBottomSheet();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("changed_participants_title", str);
        A0D2.putStringArrayList("changed_participants", C22971Dz.A0B(list));
        groupChangedParticipantsBottomSheet.A1R(A0D2);
        ((AnonymousClass1FU) AnonymousClass3Ma.A05(this)).CMk(groupChangedParticipantsBottomSheet, (String) null);
        return true;
    }

    private C202411j getPhoneNumberSharedBridge() {
        return (C202411j) AnonymousClass3MW.A0c(this.A1s).A01(C202411j.class);
    }

    private C202611l getSharePhoneNumberBridge() {
        return (C202611l) AnonymousClass3MW.A0c(this.A1s).A01(C202611l.class);
    }

    private AnonymousClass12O getVoipErrorFragmentBridge() {
        return (AnonymousClass12O) AnonymousClass3MW.A0c(this.A1s).A01(AnonymousClass12O.class);
    }

    private void setupBizCallbackOnClick(C436420i r9, long j, Activity activity, String str) {
        AnonymousClass9IT r0;
        AnonymousClass1BI r5 = r9.A0v.A00;
        if (r5 != null) {
            String str2 = r5.user;
            String A0I2 = ((C61342pW) this.A0K.get()).A00.A0I(10638);
            C18070vi.A0X(A0I2);
            if (AnonymousClass1YF.A0Y(A0I2, str2, false)) {
                Context context = getContext();
                C193559qI r02 = (C193559qI) ((C183999aF) this.A0J.get()).A00.A02((UserJid) r5);
                if (r02 != null) {
                    r0 = r02.A00.A00;
                } else {
                    r0 = null;
                }
                AnonymousClass9IT r2 = AnonymousClass9IT.YES;
                boolean A1Z = AnonymousClass000.A1Z(r0, r2);
                if (j > AnonymousClass11P.A01(this.A0B)) {
                    if (!A1Z) {
                        r2 = AnonymousClass9IT.NO;
                    }
                    String obj = new A2Y(r2, Long.valueOf(((C183989aE) this.A0K.get()).A00)).A00().toString();
                    Intent A0A2 = C17880vN.A0A();
                    A0A2.setClassName(context.getPackageName(), "com.whatsapp.bizintegrity.callpermission.BizCallbackActivity");
                    AnonymousClass3MY.A12(A0A2, r5, "chat_jid");
                    A0A2.putExtra("user_selected_reply_action", obj);
                    A0A2.putExtra("call_id", str);
                    context.startActivity(A0A2);
                    return;
                }
                String A0Q2 = this.A04.A0Q(r9);
                C73203Rj A002 = AnonymousClass4a6.A00(activity);
                int i = 2131887001;
                if (A1Z) {
                    i = 2131887002;
                }
                A002.A0S(C72473Md.A0j(context, A0Q2, i));
                A002.A0L((DialogInterface.OnClickListener) null, context.getString(2131899286));
                AnonymousClass3MY.A1G(A002);
            }
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A09();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025e, code lost:
        r3.CGN(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0261, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031c, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0320, code lost:
        if ((r5 instanceof X.C48362Me) == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0322, code lost:
        r7 = ((X.C48382Mg) r5).A19(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0329, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0335, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A0F, 4345) == false) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0339, code lost:
        if (r10 != 108) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033b, code lost:
        r5 = (X.C48362Me) r5;
        r6 = r5.A1E(3);
        r3 = r5.A1C(2).size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034a, code lost:
        if (r3 != 1) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x034c, code lost:
        if (r6 == null) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034e, code lost:
        r5 = ((X.A2B) r6.get(0)).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035e, code lost:
        if (r2.A0E.A0P(r5) == false) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0366, code lost:
        if (r2.A0z.A0J(r5) == false) goto L_0x0ac8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0368, code lost:
        r2.A07.CAt(r1, r5, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x036d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0370, code lost:
        if (r10 != 77) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0372, code lost:
        r5 = (X.AnonymousClass98B) r5;
        r6 = X.C17880vN.A10(r5.A03);
        r3 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037d, code lost:
        r7 = ((X.AnonymousClass98B) r5).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ad, code lost:
        if (r3 != null) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03bc, code lost:
        r2.A07.CAm(r1, X.C110885hR.A0A(r1, 2131430949), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0482, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0484, code lost:
        r1 = (X.AnonymousClass1FU) r1;
        r3 = new com.whatsapp.conversation.conversationrow.Hilt_BusinessTransitionInfoDialogFragment();
        r2 = X.C17880vN.A0D();
        r2.putString("message", r5);
        r2.putInt("transitionId", r4);
        r2.putInt("systemAction", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x049e, code lost:
        if (r6 == null) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04a0, code lost:
        X.AnonymousClass3MY.A15(r2, r6, "jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a5, code lost:
        r3.A1R(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04f0, code lost:
        r0 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04f2, code lost:
        r5 = X.AnonymousClass3MW.A0x(r3, r9, r0, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x056a, code lost:
        r1.CMl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x056d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06ff, code lost:
        r1.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0702, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x070d, code lost:
        if (r2.A0U.A0O(r5.A0H()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        setupBizCallbackOnClick(r5, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x078d, code lost:
        if (r2.A19.A0n(r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x078f, code lost:
        r3 = X.AnonymousClass1LU.A0o(getContext(), r6, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07aa, code lost:
        if (A0C(r5, r1.getString(2131891134)) == false) goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07ad, code lost:
        r0 = A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07b1, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07d6, code lost:
        r2.A0Q.A08(getContext(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x07df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x080d, code lost:
        r9 = r1;
        X.C83744Gm.A00(r8, r9, r6, r11, r12, r5, r3, 1, r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0819, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0853, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0856, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a5d, code lost:
        r4 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a7a, code lost:
        r4 = X.C17880vN.A0q(r1, ((X.AnonymousClass2MB) r5).A00, new java.lang.Object[1], 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a84, code lost:
        r2 = new com.whatsapp.conversation.conversationrow.Hilt_VerifiedBusinessInfoDialogFragment();
        r1 = X.C17880vN.A0D();
        r1.putString("message", r4);
        r2.A1R(r1);
        r3.CMk(r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a98, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0ac8, code lost:
        r3 = r2.A07;
        r1 = (X.AnonymousClass1FU) r1;
        r1.getClass();
        r3.CAv(r5, new X.AnonymousClass3AT(r1, 1), 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0ad8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0ad9, code lost:
        r2.A07.CAm(r1, X.C110885hR.A0A(r1, 2131430949), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0ae5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0b06, code lost:
        r1.CMk(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0b09, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0b62, code lost:
        if (r3 == 1) goto L_0x0b64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0be8, code lost:
        r1 = (X.AnonymousClass1FU) r1;
        r3 = X.C83834Gv.A00(false, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0c0c, code lost:
        X.AnonymousClass3MY.A11(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0c0f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0c10, code lost:
        r2.A0S.A08(2131887934, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0c18, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0c34, code lost:
        r1.CMk(r3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0c37, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A2i() {
        /*
            r18 = this;
            r2 = r18
            X.206 r5 = r2.A0I
            X.20i r5 = (X.C436420i) r5
            X.1BI r6 = X.AnonymousClass205.A00(r5)
            android.content.Context r1 = r2.getContext()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r1 = X.AnonymousClass1L9.A01(r1, r0)
            X.01E r1 = (X.AnonymousClass01E) r1
            int r10 = r5.A00
            r7 = 4
            r9 = 2
            r0 = 1
            r4 = 0
            r8 = 0
            switch(r10) {
                case 4: goto L_0x07ad;
                case 5: goto L_0x07ad;
                case 6: goto L_0x0020;
                case 7: goto L_0x07ad;
                case 8: goto L_0x0020;
                case 9: goto L_0x0020;
                case 10: goto L_0x0020;
                case 11: goto L_0x07e0;
                case 12: goto L_0x0740;
                case 13: goto L_0x07ad;
                case 14: goto L_0x079f;
                case 15: goto L_0x0020;
                case 16: goto L_0x0020;
                case 17: goto L_0x0020;
                case 18: goto L_0x0c19;
                case 19: goto L_0x0020;
                case 20: goto L_0x0711;
                case 21: goto L_0x0bf8;
                case 22: goto L_0x0a74;
                case 23: goto L_0x0a62;
                case 24: goto L_0x0a57;
                case 25: goto L_0x0a50;
                case 26: goto L_0x0a49;
                case 27: goto L_0x06e9;
                case 28: goto L_0x069b;
                case 29: goto L_0x0020;
                case 30: goto L_0x0020;
                case 31: goto L_0x0020;
                case 32: goto L_0x0020;
                case 33: goto L_0x0020;
                case 34: goto L_0x0a42;
                case 35: goto L_0x0a3b;
                case 36: goto L_0x0a34;
                case 37: goto L_0x0a07;
                case 38: goto L_0x0020;
                case 39: goto L_0x0a07;
                case 40: goto L_0x0020;
                case 41: goto L_0x0020;
                case 42: goto L_0x0020;
                case 43: goto L_0x0020;
                case 44: goto L_0x0a07;
                case 45: goto L_0x0020;
                case 46: goto L_0x09d1;
                case 47: goto L_0x0984;
                case 48: goto L_0x0971;
                case 49: goto L_0x0969;
                case 50: goto L_0x0961;
                case 51: goto L_0x0020;
                case 52: goto L_0x0020;
                case 53: goto L_0x0020;
                case 54: goto L_0x0020;
                case 55: goto L_0x0959;
                case 56: goto L_0x0677;
                case 57: goto L_0x0bf1;
                case 58: goto L_0x0657;
                case 59: goto L_0x063c;
                case 60: goto L_0x0020;
                case 61: goto L_0x0454;
                case 62: goto L_0x061c;
                case 63: goto L_0x0020;
                case 64: goto L_0x0020;
                case 65: goto L_0x0020;
                case 66: goto L_0x0020;
                case 67: goto L_0x0515;
                case 68: goto L_0x04fa;
                case 69: goto L_0x03f2;
                case 70: goto L_0x03c9;
                case 71: goto L_0x0bf1;
                case 72: goto L_0x0020;
                case 73: goto L_0x0bcc;
                case 74: goto L_0x0ba6;
                case 75: goto L_0x03a5;
                case 76: goto L_0x0383;
                case 77: goto L_0x031a;
                case 78: goto L_0x0317;
                case 79: goto L_0x0307;
                case 80: goto L_0x0020;
                case 81: goto L_0x07ad;
                case 82: goto L_0x07ad;
                case 83: goto L_0x07b4;
                case 84: goto L_0x0783;
                case 85: goto L_0x0783;
                case 86: goto L_0x0b74;
                case 87: goto L_0x0020;
                case 88: goto L_0x0020;
                case 89: goto L_0x0020;
                case 90: goto L_0x0020;
                case 91: goto L_0x02cf;
                case 92: goto L_0x02cf;
                case 93: goto L_0x0b74;
                case 94: goto L_0x0b74;
                case 95: goto L_0x02c0;
                case 96: goto L_0x0938;
                case 97: goto L_0x0051;
                case 98: goto L_0x0020;
                case 99: goto L_0x0287;
                case 100: goto L_0x0317;
                case 101: goto L_0x03b0;
                case 102: goto L_0x0783;
                case 103: goto L_0x0051;
                case 104: goto L_0x0783;
                case 105: goto L_0x0020;
                case 106: goto L_0x0020;
                case 107: goto L_0x026e;
                case 108: goto L_0x031a;
                case 109: goto L_0x031a;
                case 110: goto L_0x0020;
                case 111: goto L_0x0020;
                case 112: goto L_0x0262;
                case 113: goto L_0x0262;
                case 114: goto L_0x0262;
                case 115: goto L_0x0020;
                case 116: goto L_0x0020;
                case 117: goto L_0x024e;
                case 118: goto L_0x0020;
                case 119: goto L_0x0020;
                case 120: goto L_0x07b4;
                case 121: goto L_0x0020;
                case 122: goto L_0x0020;
                case 123: goto L_0x0020;
                case 124: goto L_0x0020;
                case 125: goto L_0x03b0;
                case 126: goto L_0x0020;
                case 127: goto L_0x0020;
                case 128: goto L_0x0262;
                case 129: goto L_0x0020;
                case 130: goto L_0x0020;
                case 131: goto L_0x0929;
                case 132: goto L_0x0020;
                case 133: goto L_0x0020;
                case 134: goto L_0x022e;
                case 135: goto L_0x0020;
                case 136: goto L_0x0020;
                case 137: goto L_0x020e;
                case 138: goto L_0x020e;
                case 139: goto L_0x0020;
                case 140: goto L_0x01e4;
                case 141: goto L_0x01e4;
                case 142: goto L_0x0020;
                case 143: goto L_0x0020;
                case 144: goto L_0x0020;
                case 145: goto L_0x01be;
                case 146: goto L_0x091d;
                case 147: goto L_0x01a9;
                case 148: goto L_0x0020;
                case 149: goto L_0x0020;
                case 150: goto L_0x08b6;
                case 151: goto L_0x08b6;
                case 152: goto L_0x0020;
                case 153: goto L_0x0171;
                case 154: goto L_0x0020;
                case 155: goto L_0x0159;
                case 156: goto L_0x012a;
                case 157: goto L_0x010a;
                case 158: goto L_0x00f7;
                case 159: goto L_0x0020;
                case 160: goto L_0x0020;
                case 161: goto L_0x0020;
                case 162: goto L_0x00c2;
                case 163: goto L_0x0020;
                case 164: goto L_0x00c2;
                case 165: goto L_0x0020;
                case 166: goto L_0x0020;
                case 167: goto L_0x07e0;
                case 168: goto L_0x0020;
                case 169: goto L_0x00ac;
                case 170: goto L_0x00ac;
                case 171: goto L_0x0020;
                case 172: goto L_0x085b;
                case 173: goto L_0x0833;
                case 174: goto L_0x0099;
                case 175: goto L_0x008d;
                case 176: goto L_0x0020;
                case 177: goto L_0x082a;
                default: goto L_0x0020;
            }
        L_0x0020:
            X.206 r5 = r2.A0I
            X.20i r5 = (X.C436420i) r5
            android.content.Context r1 = r2.getContext()
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r3 = X.C18050vg.A01(r1, r0)
            X.1FB r3 = (X.AnonymousClass1FB) r3
            if (r3 == 0) goto L_0x0051
            boolean r0 = X.AnonymousClass25A.A0g(r5)
            if (r0 == 0) goto L_0x0071
            r0 = r5
            X.2MN r0 = (X.AnonymousClass2MN) r0
            com.whatsapp.jid.UserJid r7 = r0.A00
        L_0x003d:
            java.lang.String r6 = ""
            if (r7 != 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/getdialogitems/remote_resource is null! "
        L_0x0047:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass25A.A0D(r5)
            X.C17900vP.A0f(r0, r6, r1)
        L_0x0051:
            return
        L_0x0052:
            X.205 r0 = r5.A0v
            X.1BI r4 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x081a
            boolean r0 = X.C22971Dz.A0T(r7)
            if (r0 == 0) goto L_0x081a
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0I(r4)
            if (r0 != 0) goto L_0x081a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/getdialogitems/remote_resource is lid "
            goto L_0x0047
        L_0x0071:
            X.205 r1 = r5.A0v
            X.1BI r0 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0086
            int r1 = r5.A0D()
            r0 = 6
            if (r1 != r0) goto L_0x008b
        L_0x0086:
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass126.A03(r5)
            goto L_0x003d
        L_0x008b:
            r7 = 0
            goto L_0x003d
        L_0x008d:
            boolean r0 = r5 instanceof X.C1772197s
            if (r0 == 0) goto L_0x0051
            r0 = r5
            X.97s r0 = (X.C1772197s) r0
            long r3 = r0.A00
            java.lang.String r0 = r0.A01
            goto L_0x00a4
        L_0x0099:
            boolean r0 = r5 instanceof X.C1772297t
            if (r0 == 0) goto L_0x0051
            r0 = r5
            X.97t r0 = (X.C1772297t) r0
            long r3 = r0.A00
            java.lang.String r0 = r0.A01
        L_0x00a4:
            r6 = r3
            r8 = r1
            r9 = r0
            r4 = r2
            r4.setupBizCallbackOnClick(r5, r6, r8, r9)
            return
        L_0x00ac:
            r0 = r5
            X.2MQ r0 = (X.AnonymousClass2MQ) r0
            if (r0 == 0) goto L_0x0051
            long r3 = r0.A00
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            X.10I r3 = r2.A1X
            X.4rb r0 = new X.4rb
            r0.<init>(r2, r5, r1, r7)
            goto L_0x025e
        L_0x00c2:
            boolean r0 = r5 instanceof X.AnonymousClass2MG
            if (r0 == 0) goto L_0x00ee
            X.2MG r5 = (X.AnonymousClass2MG) r5
            long r0 = r5.A00
        L_0x00ca:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            if (r1 == 0) goto L_0x0051
            X.00H r0 = r2.A1x
            X.1W6 r0 = X.C17880vN.A0c(r0)
            long r3 = r1.longValue()
            X.1W2 r0 = r0.A01
            X.206 r4 = r0.A03(r3)
            if (r4 == 0) goto L_0x0051
            X.1KB r3 = r2.A0S
            r1 = 3
            X.4rl r0 = new X.4rl
            r0.<init>(r2, r4, r1)
            r3.A0J(r0)
            return
        L_0x00ee:
            boolean r0 = r5 instanceof X.AnonymousClass2MF
            if (r0 == 0) goto L_0x0051
            X.2MF r5 = (X.AnonymousClass2MF) r5
            long r0 = r5.A00
            goto L_0x00ca
        L_0x00f7:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.Integer r4 = X.AnonymousClass00R.A0Y
            r7 = 0
            r6 = r8
            r2 = r8
            r5 = r8
            r3 = r8
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r3 = X.AnonymousClass4GY.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0c34
        L_0x010a:
            X.0ve r4 = r2.A0F
            r3 = 5869(0x16ed, float:8.224E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x0051
            X.206 r0 = r2.A0I
            X.1BI r2 = X.AnonymousClass205.A00(r0)
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r3 = X.AnonymousClass4GZ.A00(r2, r0)
            goto L_0x0c34
        L_0x012a:
            X.0zA r0 = r2.A0K
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0051
            X.0ve r5 = r2.A0F
            r3 = 9944(0x26d8, float:1.3935E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r0, r5, r3)
            X.0zA r0 = r2.A0K
            r0.A03()
            X.1FU r1 = (X.AnonymousClass1FU) r1
            if (r3 == 0) goto L_0x014f
            X.C18070vi.A0d(r1, r4)
            com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet r0 = new com.whatsapp.inappsupport.ui.nux.SupportAIEmbodimentBottomSheet
            r0.<init>()
            goto L_0x056a
        L_0x014f:
            X.C18070vi.A0d(r1, r4)
            com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet r0 = new com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet
            r0.<init>()
            goto L_0x056a
        L_0x0159:
            boolean r3 = r1 instanceof X.AnonymousClass1FU
            if (r3 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1M9 r6 = r2.A0j
            X.205 r3 = r5.A0v
            X.1BI r3 = r3.A00
            X.1E7 r3 = r6.A0E(r3)
            if (r3 != 0) goto L_0x0a99
            java.lang.String r0 = "ConversationRowDivider/handleWabaiEducationThirdPartyTapAction/Null contact"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0171:
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A00(r6)
            boolean r1 = r5 instanceof X.AnonymousClass2MK
            if (r1 == 0) goto L_0x0051
            if (r8 == 0) goto L_0x0051
            X.2MK r5 = (X.AnonymousClass2MK) r5
            int r6 = r5.A00
            int r1 = r5.A01
            if (r1 != 0) goto L_0x0051
            X.00H r1 = r2.A0S
            r1.get()
            android.content.Context r3 = r2.getContext()
            boolean r1 = X.AnonymousClass000.A1P(r6)
            java.lang.String r10 = "system_event_message"
            X.C138056wS.A00(r3, r8, r10, r1)
            X.00H r1 = r2.A0T
            java.lang.Object r7 = r1.get()
            X.1ml r7 = (X.C35761ml) r7
            boolean r12 = X.AnonymousClass000.A1P(r6)
            r9 = 0
            r11 = r9
            r13 = r0
            r14 = r4
            r7.A01(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x01a9:
            X.0ve r5 = r2.A0F
            X.C18070vi.A0d(r5, r4)
            r3 = 4873(0x1309, float:6.829E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r5, r3)
            if (r1 == 0) goto L_0x0051
            X.1gh r1 = r2.A1Y
            r1.CAw(r0)
            return
        L_0x01be:
            X.1EC r1 = X.AnonymousClass3MW.A0i(r6)
            X.1CJ r0 = r2.A0E
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x0051
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0051
            X.00H r0 = r2.A0L
            X.1EC r1 = X.C72453Mb.A0n(r1, r0)
            if (r1 == 0) goto L_0x0051
            android.content.Context r0 = r2.getContext()
            android.content.Intent r0 = X.AnonymousClass1LU.A1A(r0, r1)
            goto L_0x0c0c
        L_0x01e4:
            X.1EC r6 = X.AnonymousClass3MY.A0b(r6)
            X.126 r3 = r2.A19
            boolean r3 = r3.A0o(r6)
            if (r3 != 0) goto L_0x078f
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131895681(0x7f122581, float:1.9426202E38)
            r7 = 2131895679(0x7f12257f, float:1.9426198E38)
            r8 = 2131895680(0x7f122580, float:1.94262E38)
            r9 = 2131898766(0x7f12318e, float:1.943246E38)
            X.4gi r4 = new X.4gi
            r4.<init>(r1, r2, r0)
            r0 = 3
            X.4gf r5 = new X.4gf
            r5.<init>(r0)
            r3.A3y(r4, r5, r6, r7, r8, r9)
            return
        L_0x020e:
            X.1EC r1 = X.AnonymousClass3MW.A0i(r6)
            if (r1 == 0) goto L_0x0051
            X.00H r0 = r2.A0L
            X.1EC r1 = X.C72453Mb.A0n(r1, r0)
            if (r1 == 0) goto L_0x0051
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0051
            android.content.Context r0 = r2.getContext()
            android.content.Intent r0 = X.AnonymousClass1LU.A19(r0, r1)
            goto L_0x0c0c
        L_0x022e:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.1ch r6 = (X.C29681ch) r6
            X.1CJ r0 = r2.A0E
            X.1ci r3 = r0.A0A(r6)
            X.2Dk r3 = (X.C46162Dk) r3
            if (r3 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.00H r0 = r2.A1s
            X.17w r2 = X.AnonymousClass3MW.A0c(r0)
            boolean r0 = r3.A0P()
            X.C1403070w.A00(r1, r2, r6, r0)
            return
        L_0x024e:
            boolean r0 = r5 instanceof X.AnonymousClass2MO
            if (r0 == 0) goto L_0x0051
            X.1EC r4 = X.AnonymousClass3MY.A0b(r6)
            X.10I r3 = r2.A1X
            r1 = 5
            X.4rb r0 = new X.4rb
            r0.<init>(r2, r5, r4, r1)
        L_0x025e:
            r3.CGN(r0)
            return
        L_0x0262:
            boolean r3 = r5 instanceof X.C48352Md
            if (r3 == 0) goto L_0x0051
            X.2Mg r5 = (X.C48382Mg) r5
            com.whatsapp.jid.GroupJid r3 = r5.A19(r0)
            goto L_0x03ad
        L_0x026e:
            boolean r3 = r5 instanceof X.C48332Mb
            if (r3 == 0) goto L_0x0051
            X.2Mg r5 = (X.C48382Mg) r5
            com.whatsapp.jid.GroupJid r3 = r5.A19(r0)
            if (r3 == 0) goto L_0x0051
            X.11t r2 = r2.A07
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)
            r2.CAo(r1, r0, r3)
            return
        L_0x0287:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.1EC r5 = X.AnonymousClass3MY.A0b(r6)
            X.1MZ r0 = r2.A0z
            boolean r4 = r0.A0K(r5)
            X.10I r3 = r2.A1X
            r0 = 5
            X.C98814rl.A00(r3, r2, r5, r0)
            X.00H r0 = r2.A1s
            X.17w r2 = X.AnonymousClass3MW.A0c(r0)
            if (r4 == 0) goto L_0x02b3
            java.lang.Class<X.11k> r0 = X.C202511k.class
            r2.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            r2.<init>()
            java.lang.String r0 = "PhoneNumberSharedInCAGBottomSheet"
        L_0x02af:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            goto L_0x0b06
        L_0x02b3:
            java.lang.Class<X.11h> r0 = X.C202211h.class
            r2.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet
            r2.<init>()
            java.lang.String r0 = "PhoneNumberHiddenInCAGBottomSheet"
            goto L_0x02af
        L_0x02c0:
            X.1EC r6 = X.AnonymousClass3MY.A0b(r6)
            X.126 r1 = r2.A19
            int r1 = r1.A0K(r6)
            if (r1 == r0) goto L_0x0787
            if (r1 == r7) goto L_0x0787
            return
        L_0x02cf:
            X.1MZ r3 = r2.A0z
            X.C18070vi.A0d(r3, r4)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.1BI r0 = r5.A0H()
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            X.1EC r0 = X.C42941yz.A00(r0)
            X.C17960vV.A07(r0)
            boolean r0 = r3.A0K(r0)
            if (r1 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            X.1L9 r3 = r2.A0Q
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r3.A08(r1, r0)
            return
        L_0x0307:
            boolean r0 = r5 instanceof X.C48392Mh
            if (r0 == 0) goto L_0x0051
            X.11S r1 = r2.A0U
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass126.A03(r5)
            boolean r0 = r1.A0O(r0)
            goto L_0x07b1
        L_0x0317:
            boolean r3 = r5 instanceof X.AnonymousClass98B
            goto L_0x031c
        L_0x031a:
            boolean r3 = r5 instanceof X.C48362Me
        L_0x031c:
            if (r3 == 0) goto L_0x0051
            boolean r3 = r5 instanceof X.C48362Me
            if (r3 == 0) goto L_0x037d
            r3 = r5
            X.2Mg r3 = (X.C48382Mg) r3
            com.whatsapp.jid.GroupJid r7 = r3.A19(r0)
        L_0x0329:
            if (r7 == 0) goto L_0x0051
            X.0ve r8 = r2.A0F
            r6 = 4345(0x10f9, float:6.089E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r8, r6)
            if (r3 == 0) goto L_0x0ad9
            r3 = 108(0x6c, float:1.51E-43)
            if (r10 != r3) goto L_0x036e
            X.2Me r5 = (X.C48362Me) r5
            r3 = 3
            java.util.List r6 = r5.A1E(r3)
            java.util.ArrayList r3 = r5.A1C(r9)
            int r3 = r3.size()
        L_0x034a:
            if (r3 != r0) goto L_0x0ad9
            if (r6 == 0) goto L_0x0ad9
            java.lang.Object r0 = r6.get(r4)
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r5 = r0.A02
            X.1CJ r0 = r2.A0E
            boolean r0 = r0.A0P(r5)
            r4 = 9
            if (r0 == 0) goto L_0x0ac8
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0J(r5)
            if (r0 == 0) goto L_0x0ac8
            X.11t r0 = r2.A07
            r0.CAt(r1, r5, r4)
            return
        L_0x036e:
            r3 = 77
            if (r10 != r3) goto L_0x0ad9
            X.98B r5 = (X.AnonymousClass98B) r5
            java.util.Set r3 = r5.A03
            java.util.ArrayList r6 = X.C17880vN.A10(r3)
            int r3 = r5.A00
            goto L_0x034a
        L_0x037d:
            r3 = r5
            X.98B r3 = (X.AnonymousClass98B) r3
            X.1EC r7 = r3.A01
            goto L_0x0329
        L_0x0383:
            boolean r3 = r1 instanceof X.AnonymousClass1FU
            if (r3 == 0) goto L_0x0051
            boolean r3 = r5.A17()
            if (r3 == 0) goto L_0x03a3
            X.1BI r3 = r5.A0H()
            if (r3 == 0) goto L_0x03a3
            X.11S r2 = r2.A0U
            boolean r2 = r2.A0O(r3)
            if (r2 == 0) goto L_0x03a3
        L_0x039b:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment r3 = com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment.A00(r0)
            goto L_0x0c34
        L_0x03a3:
            r0 = 0
            goto L_0x039b
        L_0x03a5:
            boolean r0 = r5 instanceof X.AnonymousClass2MW
            if (r0 == 0) goto L_0x0051
            X.2MW r5 = (X.AnonymousClass2MW) r5
            com.whatsapp.jid.GroupJid r3 = r5.A01
        L_0x03ad:
            if (r3 != 0) goto L_0x03bc
            return
        L_0x03b0:
            boolean r3 = r5 instanceof X.AnonymousClass98U
            if (r3 == 0) goto L_0x0051
            X.2Mg r5 = (X.C48382Mg) r5
            com.whatsapp.jid.GroupJid r3 = r5.A19(r0)
            if (r3 == 0) goto L_0x0051
        L_0x03bc:
            X.11t r2 = r2.A07
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)
            r2.CAm(r1, r0, r3)
            return
        L_0x03c9:
            boolean r1 = r5 instanceof X.AnonymousClass2MM
            if (r1 == 0) goto L_0x0051
            r1 = r5
            X.2MM r1 = (X.AnonymousClass2MM) r1
            java.lang.String r8 = r1.A01
            if (r8 == 0) goto L_0x0051
            X.4iu r7 = new X.4iu
            r7.<init>(r2, r5)
            X.1TD r6 = r2.A0C
            X.1TA r5 = r2.A0D
            r1 = -1
            X.496 r3 = new X.496
            r3.<init>(r7, r6, r5, r1)
            r2.A05 = r3
            X.10I r1 = r2.A1X
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r8
            r1.CGM(r3, r0)
            r2.A1u()
            return
        L_0x03f2:
            X.2MD r5 = (X.AnonymousClass2MD) r5
            int r4 = r5.A00
            android.content.res.Resources r5 = X.AnonymousClass000.A0Y(r2)
            if (r4 == r0) goto L_0x0448
            r3 = 2131894771(0x7f1221f3, float:1.9424356E38)
            if (r4 == r9) goto L_0x044f
            r3 = 3
            if (r4 == r3) goto L_0x044c
            r3 = 2131894769(0x7f1221f1, float:1.9424352E38)
            if (r4 == r7) goto L_0x044f
            r3 = 5
            if (r4 == r3) goto L_0x0444
            r5 = 0
        L_0x040d:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x0051
            X.0ve r7 = r2.A0F
            r3 = 7131(0x1bdb, float:9.993E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r7, r3)
            if (r2 == 0) goto L_0x0484
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r3 = new com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet
            r3.<init>()
            r2 = 3
            X.1D6[] r7 = new X.AnonymousClass1D6[r2]
            java.lang.String r5 = X.C72463Mc.A0n(r6)
            java.lang.String r2 = "jid"
            X.C72463Mc.A1H(r2, r5, r7)
            java.lang.String r2 = "arg_transition_id"
            X.C72463Mc.A1N(r7, r4, r0, r2)
            java.lang.String r0 = "arg_message_action"
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r10)
            r7[r9] = r0
            X.AnonymousClass3MX.A1I(r3, r7)
            goto L_0x0c34
        L_0x0444:
            r3 = 2131894768(0x7f1221f0, float:1.942435E38)
            goto L_0x044f
        L_0x0448:
            r3 = 2131894770(0x7f1221f2, float:1.9424354E38)
            goto L_0x044f
        L_0x044c:
            r3 = 2131894766(0x7f1221ee, float:1.9424346E38)
        L_0x044f:
            java.lang.String r5 = r5.getString(r3)
            goto L_0x040d
        L_0x0454:
            X.1M9 r3 = r2.A0j
            X.1E7 r3 = r3.A0E(r6)
            X.2lf r3 = r3.A0H
            if (r3 == 0) goto L_0x04f7
            X.1Me r4 = r2.A0l
            X.1M9 r3 = r2.A0j
            X.1E7 r3 = r3.A0E(r6)
            boolean r3 = r4.A0i(r3)
            if (r3 != 0) goto L_0x04f7
        L_0x046c:
            X.2MD r5 = (X.AnonymousClass2MD) r5
            java.lang.String r9 = r5.A01
            int r4 = r5.A00
            X.12L r3 = r2.A17
            android.content.Context r2 = r2.getContext()
            r7 = 0
            r5 = 1
            switch(r4) {
                case 1: goto L_0x04dc;
                case 2: goto L_0x04ce;
                case 3: goto L_0x04dc;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04dc;
                case 6: goto L_0x04ce;
                case 7: goto L_0x04ce;
                case 8: goto L_0x04b6;
                case 9: goto L_0x04b6;
                case 10: goto L_0x04e9;
                case 11: goto L_0x04e9;
                case 12: goto L_0x04e9;
                case 13: goto L_0x04b6;
                case 14: goto L_0x04b6;
                case 15: goto L_0x04dc;
                case 16: goto L_0x04b6;
                case 17: goto L_0x04b6;
                case 18: goto L_0x04e9;
                case 19: goto L_0x04e9;
                case 20: goto L_0x04e9;
                case 21: goto L_0x047d;
                case 22: goto L_0x04e9;
                case 23: goto L_0x04b6;
                case 24: goto L_0x047d;
                case 25: goto L_0x04e9;
                case 26: goto L_0x04e9;
                case 27: goto L_0x047d;
                case 28: goto L_0x04b6;
                case 29: goto L_0x04b6;
                case 30: goto L_0x04aa;
                case 31: goto L_0x04b6;
                case 32: goto L_0x04e9;
                case 33: goto L_0x04b6;
                default: goto L_0x047d;
            }
        L_0x047d:
            r5 = 0
        L_0x047e:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0051
        L_0x0484:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r3 = new com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "message"
            r2.putString(r0, r5)
            java.lang.String r0 = "transitionId"
            r2.putInt(r0, r4)
            java.lang.String r0 = "systemAction"
            r2.putInt(r0, r10)
            if (r6 == 0) goto L_0x04a5
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A15(r2, r6, r0)
        L_0x04a5:
            r3.A1R(r2)
            goto L_0x0c34
        L_0x04aa:
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131887219(0x7f120473, float:1.9409039E38)
            java.lang.String r5 = r2.getString(r0)
            goto L_0x047e
        L_0x04b6:
            if (r6 == 0) goto L_0x04c6
            boolean r0 = X.C1402170l.A00(r3, r6)
            if (r0 == 0) goto L_0x04c6
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131888783(0x7f120a8f, float:1.9412211E38)
            goto L_0x04f0
        L_0x04c6:
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131887220(0x7f120474, float:1.940904E38)
            goto L_0x04f0
        L_0x04ce:
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131887226(0x7f12047a, float:1.9409053E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r9 = X.C27641Ww.A02(r9)
            goto L_0x04f2
        L_0x04dc:
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131887224(0x7f120478, float:1.940905E38)
            if (r0 == 0) goto L_0x04f0
            r2 = 2131887225(0x7f120479, float:1.9409051E38)
            goto L_0x04f0
        L_0x04e9:
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131887218(0x7f120472, float:1.9409037E38)
        L_0x04f0:
            java.lang.Object[] r0 = new java.lang.Object[r5]
        L_0x04f2:
            java.lang.String r5 = X.AnonymousClass3MW.A0x(r3, r9, r0, r7, r2)
            goto L_0x047e
        L_0x04f7:
            r0 = 0
            goto L_0x046c
        L_0x04fa:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.00H r0 = r2.A0N
            java.lang.Object r0 = r0.get()
            X.2ij r0 = (X.C57222ij) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0051
            android.content.Intent r0 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r1, r0, r9)
            goto L_0x06ff
        L_0x0515:
            boolean r3 = r1 instanceof X.AnonymousClass1FU
            if (r3 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.00H r3 = r2.A1h
            X.1Ps r10 = X.AnonymousClass3MW.A0W(r3)
            X.205 r3 = r5.A0v
            X.1BI r3 = r3.A00
            boolean r10 = r10.A0D(r3)
            if (r10 == 0) goto L_0x0542
            boolean r10 = r5 instanceof X.AnonymousClass2MC
            if (r10 == 0) goto L_0x0542
            r10 = r5
            X.2MC r10 = (X.AnonymousClass2MC) r10
            int r11 = r10.A00
            r10 = 15
            if (r11 != r10) goto L_0x0542
            X.00H r2 = r2.A1h
            X.1Ps r2 = X.AnonymousClass3MW.A0W(r2)
            r2.A09(r1, r0)
            return
        L_0x0542:
            X.1MB r10 = r2.A1A
            boolean r10 = r10.A03(r6)
            if (r10 == 0) goto L_0x056e
            X.0zA r10 = r2.A0K
            boolean r10 = r10.A07()
            if (r10 == 0) goto L_0x056e
            X.0ve r12 = r2.A0F
            r11 = 9944(0x26d8, float:1.3935E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r10 = X.C18020vd.A05(r10, r12, r11)
            if (r10 == 0) goto L_0x056e
            X.0zA r2 = r2.A0K
            r2.A03()
            X.C18070vi.A0d(r1, r4)
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r0 = X.C83844Gw.A00(r4, r0)
        L_0x056a:
            r1.CMl(r0)
            return
        L_0x056e:
            X.0ve r10 = r2.A0F
            r4 = 1071(0x42f, float:1.501E-42)
            X.0vf r11 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r11, r10, r4)
            if (r4 == 0) goto L_0x05d6
            if (r3 == 0) goto L_0x05d6
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r17 = r4.equals(r3)
            X.0ve r4 = r2.A0F
            boolean r16 = X.C43381zi.A01(r4, r3)
            X.1MB r4 = r2.A1A
            boolean r15 = r4.A03(r3)
            X.12L r4 = r2.A17
            boolean r14 = X.C1402170l.A00(r4, r3)
            X.1M9 r4 = r2.A0j
            X.1E7 r13 = r4.A0E(r3)
            X.11S r4 = r2.A0U
            r4.A0I()
            X.1E8 r12 = r4.A0D
            boolean r4 = X.C22971Dz.A0e(r3)
            if (r4 == 0) goto L_0x05c5
            boolean r4 = r3 instanceof X.AnonymousClass1E9
            if (r4 == 0) goto L_0x05c5
            X.1MZ r10 = r2.A0z
            r4 = r3
            X.1E9 r4 = (X.AnonymousClass1E9) r4
            boolean r4 = r10.A0M(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x05d6
        L_0x05b8:
            boolean r0 = X.C22971Dz.A0S(r6)
            if (r0 == 0) goto L_0x0ae6
            com.whatsapp.interop.ui.InteropSystemAboutBottomSheet r3 = new com.whatsapp.interop.ui.InteropSystemAboutBottomSheet
            r3.<init>()
            goto L_0x0c34
        L_0x05c5:
            boolean r4 = X.C22971Dz.A0d(r3)
            if (r4 == 0) goto L_0x0603
            X.1PM r10 = r2.A0k
            r4 = r3
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r4 = r10.A04(r4)
            if (r4 == 0) goto L_0x0603
        L_0x05d6:
            X.0ve r4 = r2.A0F
            boolean r4 = X.C43381zi.A00(r4, r6)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r5 instanceof X.AnonymousClass2MC
            if (r4 == 0) goto L_0x0051
            X.2MC r5 = (X.AnonymousClass2MC) r5
            int r4 = r5.A00
            X.0ve r10 = r2.A0F
            r5 = 7131(0x1bdb, float:9.993E-42)
            boolean r5 = X.C18020vd.A05(r11, r10, r5)
            if (r5 != 0) goto L_0x0b0a
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C72473Md.A0H(r6)
            java.lang.String r0 = "business_state_id"
            r2.putInt(r0, r4)
            r3.A1R(r2)
            goto L_0x0c34
        L_0x0603:
            if (r13 == 0) goto L_0x05d6
            boolean r4 = r13.A0C()
            if (r4 != 0) goto L_0x05d6
            if (r12 == 0) goto L_0x05d6
            boolean r4 = r12.A0C()
            if (r4 != 0) goto L_0x05d6
            if (r17 != 0) goto L_0x05d6
            if (r16 != 0) goto L_0x05d6
            if (r14 != 0) goto L_0x05d6
            if (r15 != 0) goto L_0x05d6
            goto L_0x05b8
        L_0x061c:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.0ve r2 = r2.A0F
            r0 = 1071(0x42f, float:1.501E-42)
            r2.A0N(r0)
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C72473Md.A0H(r6)
            java.lang.String r0 = "provider_category"
            r2.putInt(r0, r4)
            r3.A1R(r2)
            goto L_0x0c34
        L_0x063c:
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0051
            X.206 r0 = r2.A0I
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3Ma.A0o(r0)
            X.C17960vV.A07(r4)
            X.4Q5 r3 = r2.A09
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1CJ r0 = r2.A0E
            int r0 = r0.A04(r4)
            r3.A00(r1, r4, r0, r9)
            return
        L_0x0657:
            boolean r0 = r5 instanceof X.AnonymousClass2MI
            if (r0 == 0) goto L_0x0051
            X.2MI r5 = (X.AnonymousClass2MI) r5
            boolean r3 = r5.A00
            X.00H r0 = r2.A1g
            X.1pj r2 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r6)
            boolean r0 = r2.A0P(r0)
            if (r3 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0677:
            X.1EC r4 = X.AnonymousClass3MY.A0b(r6)
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0K(r4)
            if (r0 == 0) goto L_0x0703
            android.content.Context r1 = r2.getContext()
            android.content.Context r3 = r2.getContext()
            X.1M9 r0 = r2.A0j
            X.1E7 r0 = r0.A0E(r4)
            X.C17960vV.A07(r0)
            int r0 = r0.A04
            android.content.Intent r0 = X.AnonymousClass1LU.A0c(r3, r4, r0, r9)
            goto L_0x06ff
        L_0x069b:
            X.2MN r5 = (X.AnonymousClass2MN) r5
            X.1M9 r3 = r2.A0j
            com.whatsapp.jid.UserJid r0 = r5.A01
            X.C17960vV.A07(r0)
            X.1E7 r3 = r3.A0H(r0)
            X.1Me r0 = r2.A0l
            java.lang.String r3 = r0.A0I(r3)
            X.11S r0 = r2.A0U
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06cc
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r6)
            X.C17960vV.A07(r2)
            com.whatsapp.jid.UserJid r0 = r5.A00
            X.C17960vV.A07(r0)
            com.whatsapp.conversation.ChangeNumberNotificationDialogFragment r3 = com.whatsapp.conversation.ChangeNumberNotificationDialogFragment.A00(r2, r0, r3)
            goto L_0x0c34
        L_0x06cc:
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r6)
            com.whatsapp.jid.UserJid r0 = r5.A00
            if (r0 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0051
            com.whatsapp.jid.UserJid r0 = r5.A00
            android.content.Intent r2 = X.C72473Md.A0A(r1, r0, r4)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r0 = r2.addFlags(r0)
            goto L_0x06ff
        L_0x06e9:
            java.lang.String r3 = r5.A0P()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0703
            X.1M9 r2 = r2.A0j
            X.1E7 r2 = r2.A0H(r6)
            X.1BI r2 = r2.A0J
            android.content.Intent r0 = X.AnonymousClass1LU.A13(r1, r2, r4, r0, r0)
        L_0x06ff:
            r1.startActivity(r0)
            return
        L_0x0703:
            X.11S r1 = r2.A0U
            X.1BI r0 = r5.A0H()
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0051
            goto L_0x0020
        L_0x0711:
            X.1gn r3 = r2.A04
            X.2dZ r3 = r3.A0J(r5, r8, r0)
            X.1EC r6 = X.AnonymousClass3MW.A0i(r6)
            if (r6 == 0) goto L_0x0051
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x0051
            X.1GP r8 = r1.getSupportFragmentManager()
            X.00H r2 = r2.A0L
            X.1EC r11 = X.C72453Mb.A0n(r6, r2)
            java.util.List r12 = java.util.Collections.emptyList()
            r2 = 12
            X.4sD r5 = new X.4sD
            r5.<init>(r2)
            r2 = 11
            X.4sU r3 = new X.4sU
            r3.<init>(r2)
            r7 = 5
            goto L_0x080d
        L_0x0740:
            r3 = 2131890880(0x7f1212c0, float:1.9416464E38)
            java.lang.String r3 = r1.getString(r3)
            boolean r3 = r2.A0C(r5, r3)
            if (r3 != 0) goto L_0x0051
            X.1EC r6 = X.AnonymousClass3MW.A0i(r6)
            if (r6 == 0) goto L_0x0798
            X.1CJ r8 = r2.A0E
            X.1MZ r3 = r2.A0z
            boolean r3 = X.C62822s3.A00(r8, r3, r5)
            if (r3 != 0) goto L_0x078f
            X.1gn r3 = r2.A04
            boolean r3 = r3.A0U(r5, r0)
            if (r3 == 0) goto L_0x0798
            X.1GP r8 = r1.getSupportFragmentManager()
            X.00H r2 = r2.A0L
            X.1EC r11 = X.C72453Mb.A0n(r6, r2)
            java.util.List r12 = java.util.Collections.emptyList()
            r2 = 10
            X.4sD r5 = new X.4sD
            r5.<init>(r2)
            r2 = 9
            X.4sU r3 = new X.4sU
            r3.<init>(r2)
            goto L_0x080d
        L_0x0783:
            X.1EC r6 = X.AnonymousClass3MY.A0b(r6)
        L_0x0787:
            X.126 r0 = r2.A19
            boolean r0 = r0.A0n(r6)
            if (r0 == 0) goto L_0x0051
        L_0x078f:
            android.content.Context r0 = r2.getContext()
            android.content.Intent r3 = X.AnonymousClass1LU.A0o(r0, r6, r9)
            goto L_0x07d6
        L_0x0798:
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x079f
            return
        L_0x079f:
            r0 = 2131891134(0x7f1213be, float:1.941698E38)
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = r2.A0C(r5, r0)
            if (r0 == 0) goto L_0x07ad
            return
        L_0x07ad:
            boolean r0 = r2.A0A()
        L_0x07b1:
            if (r0 == 0) goto L_0x0020
            return
        L_0x07b4:
            X.1EC r4 = X.AnonymousClass3MY.A0b(r6)
            X.1MZ r0 = r2.A0z
            boolean r0 = r0.A0K(r4)
            if (r0 == 0) goto L_0x0051
            android.content.Context r0 = r2.getContext()
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A12(r3, r4, r0)
        L_0x07d6:
            X.1L9 r1 = r2.A0Q
            android.content.Context r0 = r2.getContext()
            r1.A08(r0, r3)
            return
        L_0x07e0:
            X.1gn r3 = r2.A04
            X.2dZ r3 = r3.A0K(r5, r0)
            X.1EC r6 = X.AnonymousClass3MW.A0i(r6)
            if (r6 == 0) goto L_0x0051
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x0051
            X.1GP r8 = r1.getSupportFragmentManager()
            X.00H r2 = r2.A0L
            X.1EC r11 = X.C72453Mb.A0n(r6, r2)
            java.util.List r12 = java.util.Collections.emptyList()
            r2 = 11
            X.4sD r5 = new X.4sD
            r5.<init>(r2)
            r2 = 10
            X.4sU r3 = new X.4sU
            r3.<init>(r2)
            r7 = 3
        L_0x080d:
            r13 = r5
            r14 = r3
            r15 = r0
            r16 = r7
            r17 = r4
            r10 = r6
            r9 = r1
            X.C83744Gm.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x081a:
            X.1MZ r1 = r2.A0z
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass3MW.A0f(r4)
            X.1DT r1 = r1.A03(r7, r0)
            r0 = 34
            X.C91624fz.A00(r3, r1, r0)
            return
        L_0x082a:
            X.00H r0 = r2.A1q
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "community-hidden-groups"
            goto L_0x0853
        L_0x0833:
            X.2Mh r5 = (X.C48392Mh) r5
            java.util.List r3 = r5.A01
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0843
            java.lang.Object r8 = r3.get(r4)
            X.1BI r8 = (X.AnonymousClass1BI) r8
        L_0x0843:
            X.11S r0 = r2.A0U
            boolean r0 = r0.A0O(r8)
            if (r0 == 0) goto L_0x0857
            X.00H r0 = r2.A1q
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "community-becoming-owner"
        L_0x0853:
            r2.A01(r1, r0)
            return
        L_0x0857:
            r2.A0A()
            return
        L_0x085b:
            X.464 r5 = (X.AnonymousClass464) r5
            X.0zA r0 = r2.A01
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0899
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0899
            X.00H r0 = r2.A0I
            java.lang.Object r3 = r0.get()
            X.4QU r3 = (X.AnonymousClass4QU) r3
            X.1gU r1 = r2.A1D
            java.lang.String r0 = r5.A00
            X.C18070vi.A0d(r1, r4)
            int r0 = X.AnonymousClass4X8.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00(r6, r0, r7)
            X.00H r0 = r2.A0I
            java.lang.Object r0 = r0.get()
            X.4QU r0 = (X.AnonymousClass4QU) r0
            r0.A00 = r6
            X.0zA r0 = r2.A01
            r0.A03()
            java.lang.String r0 = "newInstance"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0899:
            X.00H r0 = r2.A0I
            java.lang.Object r3 = r0.get()
            X.4QU r3 = (X.AnonymousClass4QU) r3
            X.1gU r1 = r2.A1D
            java.lang.String r0 = r5.A00
            X.C18070vi.A0d(r1, r4)
            int r0 = X.AnonymousClass4X8.A00(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 12
            r3.A00(r6, r1, r0)
            return
        L_0x08b6:
            java.lang.String r0 = "ConversationRowDivider/handleHistorySettingTapAction"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1MZ r1 = r2.A0z
            X.0ve r3 = r2.A0F
            X.206 r0 = r2.A0I
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.1EC r0 = X.AnonymousClass3MW.A0i(r0)
            if (r0 == 0) goto L_0x090c
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x090c
            r1 = 5191(0x1447, float:7.274E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x090c
            android.content.Context r1 = r2.getContext()
            X.206 r0 = r2.A0I
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.1EC r4 = X.C42941yz.A00(r0)
            X.C17960vV.A07(r4)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.HistorySettingActivity"
            android.content.Intent r1 = r3.setClassName(r1, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass3MY.A12(r1, r4, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r2)
            r0.startActivity(r1)
            return
        L_0x090c:
            android.content.Context r0 = r2.getContext()
            X.1FU r1 = X.AnonymousClass3MZ.A0P(r0)
            com.whatsapp.components.GroupHistoryBottomSheet r0 = new com.whatsapp.components.GroupHistoryBottomSheet
            r0.<init>()
            r1.CMk(r0, r8)
            return
        L_0x091d:
            X.00H r0 = r2.A1h
            X.1Ps r0 = X.AnonymousClass3MW.A0W(r0)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0.A09(r1, r4)
            return
        L_0x0929:
            X.11t r2 = r2.A07
            X.1EC r6 = (X.AnonymousClass1EC) r6
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)
            r2.CAp(r1, r0, r6)
            return
        L_0x0938:
            X.00H r0 = r2.A1u
            r0.get()
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r5 = r2.A0A
            X.1wy r4 = X.AnonymousClass3MW.A0o()
            boolean r0 = r6 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x094e
            X.10I r3 = r5.A04
            r0 = 26
            X.C98714rb.A00(r3, r5, r6, r4, r0)
        L_0x094e:
            r3 = 10
            X.4fm r0 = new X.4fm
            r0.<init>(r1, r2, r3)
            r4.A0A(r1, r0)
            return
        L_0x0959:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131897993(0x7f122e89, float:1.9430891E38)
            goto L_0x0a7a
        L_0x0961:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r0 = 2131897991(0x7f122e87, float:1.9430887E38)
            goto L_0x0a5d
        L_0x0969:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131897997(0x7f122e8d, float:1.94309E38)
            goto L_0x0a7a
        L_0x0971:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r2 = r2.equals(r6)
            r6 = 2131898002(0x7f122e92, float:1.943091E38)
            if (r2 == 0) goto L_0x0a7a
            r6 = 2131898304(0x7f122fc0, float:1.9431522E38)
            goto L_0x0a7a
        L_0x0984:
            X.1M9 r3 = r2.A0j
            X.1E7 r7 = r3.A0E(r6)
            X.1Me r3 = r2.A0l
            boolean r3 = r3.A0i(r7)
            if (r3 != 0) goto L_0x09bd
            X.2lf r3 = r7.A0H
            if (r3 == 0) goto L_0x09bd
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.0vb r7 = r2.A0D
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r2 = r2.equals(r6)
            r6 = 2131887223(0x7f120477, float:1.9409047E38)
            if (r2 == 0) goto L_0x09a9
            r6 = 2131898307(0x7f122fc3, float:1.9431528E38)
        L_0x09a9:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.2MB r5 = (X.AnonymousClass2MB) r5
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.C27641Ww.A02(r0)
            java.lang.String r0 = X.C17880vN.A0q(r1, r0, r2, r4, r6)
            java.lang.String r4 = X.C27641Ww.A01(r7, r0)
            goto L_0x0a84
        L_0x09bd:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.0vb r7 = r2.A0D
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r2 = r2.equals(r6)
            r6 = 2131887222(0x7f120476, float:1.9409045E38)
            if (r2 == 0) goto L_0x09a9
            r6 = 2131898306(0x7f122fc2, float:1.9431526E38)
            goto L_0x09a9
        L_0x09d1:
            r6 = r1
            X.1FU r6 = (X.AnonymousClass1FU) r6
            X.0vb r7 = r2.A0D
            r3 = 2131887221(0x7f120475, float:1.9409043E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.2MB r5 = (X.AnonymousClass2MB) r5
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.C27641Ww.A02(r0)
            java.lang.String r0 = X.C17880vN.A0q(r1, r0, r2, r4, r3)
            java.lang.String r1 = X.C27641Ww.A01(r7, r0)
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r3 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "message"
            r2.putString(r0, r1)
            java.lang.String r1 = "system_action"
            r0 = 46
            r2.putInt(r1, r0)
            r3.A1R(r2)
            r6.CMk(r3, r8)
            return
        L_0x0a07:
            X.1R5 r0 = r2.A0G
            android.content.Context r4 = r2.getContext()
            X.2MH r5 = (X.AnonymousClass2MH) r5
            X.1QS r0 = r0.A09
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWx()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            X.205 r2 = r5.A02
            boolean r0 = X.AnonymousClass000.A1W(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "Remote request message key is not specified."
            X.C17960vV.A08(r1, r0)
            X.AnonymousClass4aU.A00(r3, r2)
            r4.startActivity(r3)
            return
        L_0x0a34:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131898006(0x7f122e96, float:1.9430918E38)
            goto L_0x0a7a
        L_0x0a3b:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r0 = 2131898014(0x7f122e9e, float:1.9430934E38)
            goto L_0x0a5d
        L_0x0a42:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131898010(0x7f122e9a, float:1.9430926E38)
            goto L_0x0a7a
        L_0x0a49:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r0 = 2131897990(0x7f122e86, float:1.9430885E38)
            goto L_0x0a5d
        L_0x0a50:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131897996(0x7f122e8c, float:1.9430897E38)
            goto L_0x0a7a
        L_0x0a57:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r0 = 2131898001(0x7f122e91, float:1.9430907E38)
        L_0x0a5d:
            java.lang.String r4 = r1.getString(r0)
            goto L_0x0a84
        L_0x0a62:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.PhoneUserJid.WHATSAPP_CAPS_SURVEY
            boolean r2 = r2.equals(r6)
            r6 = 2131898008(0x7f122e98, float:1.9430922E38)
            if (r2 == 0) goto L_0x0a7a
            r6 = 2131898305(0x7f122fc1, float:1.9431524E38)
            goto L_0x0a7a
        L_0x0a74:
            r3 = r1
            X.1FU r3 = (X.AnonymousClass1FU) r3
            r6 = 2131898012(0x7f122e9c, float:1.943093E38)
        L_0x0a7a:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.2MB r5 = (X.AnonymousClass2MB) r5
            java.lang.String r0 = r5.A00
            java.lang.String r4 = X.C17880vN.A0q(r1, r0, r2, r4, r6)
        L_0x0a84:
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r2 = new com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "message"
            r1.putString(r0, r4)
            r2.A1R(r1)
            r3.CMk(r2, r8)
            return
        L_0x0a99:
            X.1Vc r2 = r2.A08
            java.io.FileInputStream r5 = r2.A05(r3, r0)
            java.lang.String r2 = r3.A0L()
            X.C18070vi.A0d(r1, r4)
            com.whatsapp.wabai.SystemMessage3PBottomSheet r4 = new com.whatsapp.wabai.SystemMessage3PBottomSheet
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "ARG_BOT_NAME"
            r3.putString(r0, r2)
            if (r5 == 0) goto L_0x0ac6
            byte[] r2 = X.C196989vy.A01(r5)
        L_0x0aba:
            java.lang.String r0 = "ARG_PHOTO_STREAM"
            r3.putByteArray(r0, r2)
            r4.A1R(r3)
            r1.CMl(r4)
            return
        L_0x0ac6:
            r2 = 0
            goto L_0x0aba
        L_0x0ac8:
            X.11t r3 = r2.A07
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r1.getClass()
            r2 = 1
            X.3AT r0 = new X.3AT
            r0.<init>(r1, r2)
            r3.CAv(r5, r0, r4)
            return
        L_0x0ad9:
            X.11t r2 = r2.A07
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)
            r2.CAm(r1, r0, r7)
            return
        L_0x0ae6:
            int r4 = r3.getType()
            r0 = 3
            r3 = 2
            if (r4 == r0) goto L_0x0af2
            boolean r3 = X.C17890vO.A1R(r4)
        L_0x0af2:
            X.11S r0 = r2.A0U
            boolean r0 = r0.A0O(r6)
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A04 = r0
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r2 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r3)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getCanonicalName()
        L_0x0b06:
            r1.CMk(r2, r0)
            return
        L_0x0b0a:
            if (r4 == 0) goto L_0x0b37
            if (r4 == r0) goto L_0x0b37
            if (r4 == r9) goto L_0x0b37
            r0 = 3
            if (r4 == r0) goto L_0x0b37
            if (r4 == r7) goto L_0x0b37
        L_0x0b15:
            java.lang.String r7 = "jid"
            r2 = 0
            X.C18070vi.A0d(r6, r2)
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r3 = new com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet
            r3.<init>()
            X.1D6[] r5 = new X.AnonymousClass1D6[r9]
            java.lang.String r0 = r6.getRawString()
            X.AnonymousClass1D6.A03(r7, r0, r5, r2)
            java.lang.String r0 = "business_state_id"
            X.1D6 r2 = X.AnonymousClass1D6.A00(r0, r4)
            r0 = 1
            r5[r0] = r2
            X.AnonymousClass3MX.A1I(r3, r5)
            goto L_0x0c34
        L_0x0b37:
            X.00H r0 = r2.A0R
            java.lang.Object r5 = r0.get()
            X.4Nu r5 = (X.C85544Nu) r5
            X.1MB r0 = r5.A02
            boolean r0 = r0.A03(r6)
            if (r0 != 0) goto L_0x0b15
            X.0ve r0 = r5.A00
            boolean r0 = X.C43381zi.A01(r0, r6)
            if (r0 != 0) goto L_0x0b15
            X.12L r0 = r5.A01
            boolean r0 = X.C42761yh.A01(r0, r6)
            if (r0 != 0) goto L_0x0b15
            if (r3 == 0) goto L_0x0b72
            int r3 = r3.getType()
            r0 = 3
            r4 = 2
            if (r3 == r0) goto L_0x0b64
            r4 = 1
            if (r3 != r4) goto L_0x0b72
        L_0x0b64:
            X.11S r0 = r2.A0U
            boolean r0 = r0.A0O(r6)
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A04 = r0
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r4)
            goto L_0x0c34
        L_0x0b72:
            r4 = 0
            goto L_0x0b64
        L_0x0b74:
            X.C17960vV.A07(r6)
            X.1EC r5 = X.AnonymousClass3MW.A0i(r6)
            if (r5 == 0) goto L_0x0b9d
            X.1CJ r3 = r2.A0E
            boolean r3 = r3.A0R(r5)
            if (r3 == 0) goto L_0x0b9d
            X.00H r3 = r2.A0L
            X.1EC r7 = X.C72453Mb.A0n(r5, r3)
            if (r7 == 0) goto L_0x0b9d
            X.11t r5 = r2.A07
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r1.findViewById(r3)
            boolean r1 = r5.CAq(r1, r3, r7)
            if (r1 == 0) goto L_0x0b9d
            return
        L_0x0b9d:
            android.content.Context r1 = r2.getContext()
            android.content.Intent r0 = X.AnonymousClass1LU.A13(r1, r6, r0, r4, r0)
            goto L_0x0c0c
        L_0x0ba6:
            X.1EC r5 = X.AnonymousClass3MY.A0b(r6)
            X.1MZ r3 = r2.A0z
            boolean r3 = r3.A0K(r5)
            if (r3 == 0) goto L_0x0c10
            X.1CJ r3 = r2.A0E
            X.1ci r3 = r3.A0A(r5)
            if (r3 == 0) goto L_0x0bc3
            X.1cn r3 = r3.A0h
            if (r3 == 0) goto L_0x0bc3
            int r3 = r3.A00
            if (r3 != r0) goto L_0x0bc3
            goto L_0x0be8
        L_0x0bc3:
            android.content.Context r0 = r2.getContext()
            android.content.Intent r0 = X.AnonymousClass1LU.A0Z(r0, r5)
            goto L_0x0c0c
        L_0x0bcc:
            X.1EC r5 = X.AnonymousClass3MY.A0b(r6)
            X.1MZ r3 = r2.A0z
            boolean r3 = r3.A0K(r5)
            if (r3 == 0) goto L_0x0c10
            X.1CJ r2 = r2.A0E
            X.1ci r2 = r2.A0A(r5)
            if (r2 == 0) goto L_0x0bef
            X.1cn r2 = r2.A0h
            if (r2 == 0) goto L_0x0bef
            int r2 = r2.A00
            if (r2 != r0) goto L_0x0bef
        L_0x0be8:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.growthlock.InviteLinkUnavailableDialogFragment r3 = X.C83834Gv.A00(r4, r0)
            goto L_0x0c34
        L_0x0bef:
            r0 = 0
            goto L_0x0be8
        L_0x0bf1:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment r3 = com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A00(r5)
            goto L_0x0c34
        L_0x0bf8:
            X.1MZ r1 = r2.A0z
            X.1EC r0 = X.AnonymousClass3MY.A0b(r6)
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0c10
            android.content.Context r0 = r2.getContext()
            android.content.Intent r0 = X.AnonymousClass1LU.A0Z(r0, r6)
        L_0x0c0c:
            X.AnonymousClass3MY.A11(r0, r2)
            return
        L_0x0c10:
            X.1KB r1 = r2.A0S
            r0 = 2131887934(0x7f12073e, float:1.941049E38)
            r1.A08(r0, r4)
            return
        L_0x0c19:
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment r3 = new com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment
            r3.<init>()
            android.os.Bundle r4 = X.C17880vN.A0D()
            X.1BI r2 = X.AnonymousClass205.A00(r5)
            X.1BI r0 = r5.A0H()
            if (r0 == 0) goto L_0x0c2f
            r2 = r0
        L_0x0c2f:
            java.lang.String r0 = "participant_jid"
            X.C72463Mc.A11(r4, r3, r2, r0)
        L_0x0c34:
            r1.CMk(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973u1.A2i():void");
    }

    public /* synthetic */ void A2j(AnonymousClass01E r4, AnonymousClass4EP r5) {
        DialogFragment A002;
        String str;
        if (r4 instanceof AnonymousClass1FU) {
            if (r5 instanceof C80073wV) {
                getPhoneNumberSharedBridge();
                C80073wV r52 = (C80073wV) r5;
                A002 = AnonymousClass4G5.A00(r52.A00, r52.A01);
                str = "PhoneNumberSharedBottomSheet";
            } else {
                getSharePhoneNumberBridge();
                AnonymousClass1BI r2 = ((C80063wU) r5).A00;
                C18070vi.A0d(r2, 0);
                A002 = AnonymousClass4G6.A00(r2, 6);
                str = "SharePhoneNumberBottomSheet";
            }
            ((AnonymousClass1FU) r4).CMk(A002, str);
        }
    }

    public /* synthetic */ void A2k(AnonymousClass1EC r13, C436420i r14) {
        AnonymousClass11P r4 = this.A0B;
        Context context = getContext();
        AnonymousClass1KB r1 = this.A0S;
        long j = ((AnonymousClass2MO) r14).A01;
        AnonymousClass1VP r2 = this.A06;
        AnonymousClass1TD r5 = this.A0C;
        C27081Uq r7 = this.A0E;
        C63982u1.A05(context, r1, r2, getVoipErrorFragmentBridge(), r4, r5, this.A0D, r7, r13, 8, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r3 == 3) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A2l(X.C436420i r6, X.C178119Bw r7) {
        /*
            r5 = this;
            X.2MM r6 = (X.AnonymousClass2MM) r6
            int r3 = r6.A00
            r4 = 0
            if (r7 == 0) goto L_0x001f
            X.2Q4 r0 = r7.A0E
            if (r0 == 0) goto L_0x001f
            X.1VP r3 = r5.A06
            android.content.Context r2 = r5.getContext()
            r1 = 8
            X.1VQ r3 = (X.AnonymousClass1VQ) r3
            r0 = 0
            r3.BhC(r2, r7, r1, r0)
        L_0x0019:
            r5.A05 = r4
            r5.A1u()
            return
        L_0x001f:
            android.app.Activity r2 = X.AnonymousClass3Ma.A05(r5)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            r5.getVoipErrorFragmentBridge()
            r0 = 2
            if (r3 == r0) goto L_0x0030
            r0 = 3
            r1 = 12
            if (r3 != r0) goto L_0x0032
        L_0x0030:
            r1 = 33
        L_0x0032:
            X.4Rb r0 = new X.4Rb
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r0, r1)
            r2.CMk(r0, r4)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973u1.A2l(X.20i, X.9Bw):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (X.C22971Dz.A0S(r4) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r1 == 155) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ff, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((X.AnonymousClass73F) r5.A0M.get()).A03, 10379) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 instanceof X.C1770597a) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getBackgroundDrawable() {
        /*
            r5 = this;
            X.206 r3 = r5.A0I
            X.20i r3 = (X.C436420i) r3
            X.205 r0 = r3.A0v
            X.1BI r4 = r0.A00
            X.1MB r0 = r5.A1A
            boolean r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x0029
            int r1 = r3.A00
            r0 = 67
            if (r1 != r0) goto L_0x001a
            boolean r0 = r3 instanceof X.AnonymousClass2MC
            if (r0 != 0) goto L_0x011f
        L_0x001a:
            boolean r0 = r3 instanceof X.C48392Mh
            if (r0 != 0) goto L_0x0022
            boolean r0 = r3 instanceof X.C1770597a
            if (r0 == 0) goto L_0x00c7
        L_0x0022:
            X.5bZ r0 = r5.A09
            android.graphics.drawable.Drawable r0 = r0.BQF()
            return r0
        L_0x0029:
            X.0ve r0 = r5.A0F
            boolean r0 = X.C43381zi.A01(r0, r4)
            if (r0 != 0) goto L_0x011f
            int r1 = r3.A00
            r0 = 67
            if (r1 != r0) goto L_0x004b
            boolean r0 = r3 instanceof X.AnonymousClass2MC
            r2 = 1
            if (r0 == 0) goto L_0x0095
            X.12L r0 = r5.A17
            boolean r0 = X.C42761yh.A01(r0, r4)
            if (r0 != 0) goto L_0x011f
            boolean r0 = X.C22971Dz.A0S(r4)
            if (r0 == 0) goto L_0x004c
            goto L_0x0022
        L_0x004b:
            r2 = 0
        L_0x004c:
            r0 = 69
            if (r1 != r0) goto L_0x0074
            boolean r0 = r3 instanceof X.AnonymousClass2MD
            if (r0 == 0) goto L_0x0074
            X.2MD r3 = (X.AnonymousClass2MD) r3
            int r2 = r3.A00
            X.5bZ r1 = r5.A09
            r0 = 2
            if (r2 == r0) goto L_0x0103
            r0 = 3
            if (r2 == r0) goto L_0x0103
            r0 = 4
            if (r2 == r0) goto L_0x0103
            r0 = 5
            if (r2 == r0) goto L_0x0103
            X.4iP r1 = (X.C93084iP) r1
            X.0vp r0 = r1.A04
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x0074:
            if (r2 == 0) goto L_0x0095
            X.2MC r3 = (X.AnonymousClass2MC) r3
            int r2 = r3.A00
            X.0ve r0 = r5.A0F
            boolean r1 = X.C43381zi.A00(r0, r4)
            X.5bZ r0 = r5.A09
            switch(r2) {
                case 5: goto L_0x0111;
                case 6: goto L_0x0111;
                case 7: goto L_0x0111;
                case 8: goto L_0x0111;
                case 9: goto L_0x0111;
                case 10: goto L_0x0111;
                case 11: goto L_0x0085;
                case 12: goto L_0x0085;
                case 13: goto L_0x0085;
                case 14: goto L_0x0085;
                case 15: goto L_0x0111;
                case 16: goto L_0x0111;
                case 17: goto L_0x0111;
                default: goto L_0x0085;
            }
        L_0x0085:
            if (r1 != 0) goto L_0x0111
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A04
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x0095:
            boolean r0 = A0B(r3)
            if (r0 == 0) goto L_0x00ab
            X.5bZ r0 = r5.A09
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A04
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x00ab:
            boolean r0 = X.AnonymousClass25A.A0u(r3)
            if (r0 != 0) goto L_0x00c7
            boolean r0 = X.AnonymousClass25A.A0d(r3)
            if (r0 != 0) goto L_0x00c7
            boolean r0 = X.AnonymousClass25A.A0f(r3)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r3 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x00d7
            X.2MC r3 = (X.AnonymousClass2MC) r3
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00d7
        L_0x00c7:
            X.5bZ r0 = r5.A09
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A01
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x00d7:
            java.util.Set r0 = X.AnonymousClass2WQ.A01
            r0 = 147(0x93, float:2.06E-43)
            if (r1 == r0) goto L_0x00ed
            r0 = 155(0x9b, float:2.17E-43)
            if (r1 != r0) goto L_0x0022
        L_0x00e1:
            android.content.Context r1 = r5.getContext()
            r0 = 2131231284(0x7f080234, float:1.8078645E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            return r0
        L_0x00ed:
            X.00H r0 = r5.A0M
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            X.0ve r2 = r0.A03
            r1 = 10379(0x288b, float:1.4544E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e1
            goto L_0x0022
        L_0x0103:
            X.4iP r1 = (X.C93084iP) r1
            X.0vp r0 = r1.A03
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x0111:
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A03
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        L_0x011f:
            X.5bZ r0 = r5.A09
            X.4iP r0 = (X.C93084iP) r0
            X.0vp r0 = r0.A03
            java.lang.Object r0 = X.C72463Mc.A0m(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.C18070vi.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973u1.getBackgroundDrawable():android.graphics.drawable.Drawable");
    }

    public C436420i getFMessage() {
        return (C436420i) this.A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r0 != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if (r1 != 5) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        if (((X.AnonymousClass2MC) r2).A00 == 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r2 instanceof X.C1770597a) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTextColor() {
        /*
            r4 = this;
            X.206 r2 = r4.A0I
            X.20i r2 = (X.C436420i) r2
            X.205 r0 = r2.A0v
            X.1BI r3 = r0.A00
            X.1MB r0 = r4.A1A
            boolean r0 = r0.A03(r3)
            if (r0 == 0) goto L_0x0031
            int r1 = r2.A00
            r0 = 67
            if (r1 != r0) goto L_0x001a
            boolean r0 = r2 instanceof X.AnonymousClass2MC
            if (r0 != 0) goto L_0x0099
        L_0x001a:
            boolean r0 = r2 instanceof X.C48392Mh
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2 instanceof X.C1770597a
            if (r0 == 0) goto L_0x00ba
        L_0x0022:
            android.content.Context r2 = r4.getContext()
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
        L_0x002c:
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            return r0
        L_0x0031:
            X.0ve r0 = r4.A0F
            boolean r0 = X.C43381zi.A01(r0, r3)
            if (r0 != 0) goto L_0x0099
            X.12L r0 = r4.A17
            boolean r0 = X.C42761yh.A01(r0, r3)
            if (r0 != 0) goto L_0x0099
            int r1 = r2.A00
            r0 = 67
            if (r1 != r0) goto L_0x006b
            boolean r0 = r2 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.C22971Dz.A0S(r3)
            if (r0 != 0) goto L_0x0099
            X.2MC r2 = (X.AnonymousClass2MC) r2
            int r1 = r2.A00
            android.content.Context r2 = r4.getContext()
            X.0ve r0 = r4.A0F
            boolean r0 = X.C43381zi.A00(r0, r3)
            switch(r1) {
                case 5: goto L_0x0064;
                case 6: goto L_0x0064;
                case 7: goto L_0x0064;
                case 8: goto L_0x0064;
                case 9: goto L_0x0064;
                case 10: goto L_0x0064;
                case 11: goto L_0x0062;
                case 12: goto L_0x0062;
                case 13: goto L_0x0062;
                case 14: goto L_0x0062;
                case 15: goto L_0x0064;
                case 16: goto L_0x0064;
                case 17: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            if (r0 == 0) goto L_0x0087
        L_0x0064:
            r1 = 2130970505(0x7f040789, float:1.7549722E38)
            r0 = 2131101875(0x7f0608b3, float:1.7816172E38)
            goto L_0x002c
        L_0x006b:
            r0 = 69
            if (r1 != r0) goto L_0x008e
            boolean r0 = r2 instanceof X.AnonymousClass2MD
            if (r0 == 0) goto L_0x008e
            X.2MD r2 = (X.AnonymousClass2MD) r2
            int r1 = r2.A00
            android.content.Context r2 = r4.getContext()
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 == r0) goto L_0x0064
            r0 = 4
            if (r1 == r0) goto L_0x0064
            r0 = 5
            if (r1 == r0) goto L_0x0064
        L_0x0087:
            r1 = 2130968884(0x7f040134, float:1.7546434E38)
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            goto L_0x002c
        L_0x008e:
            boolean r0 = A0B(r2)
            if (r0 == 0) goto L_0x009e
            android.content.Context r2 = r4.getContext()
            goto L_0x0087
        L_0x0099:
            android.content.Context r2 = r4.getContext()
            goto L_0x0064
        L_0x009e:
            boolean r0 = X.AnonymousClass25A.A0u(r2)
            if (r0 != 0) goto L_0x00ba
            boolean r0 = X.AnonymousClass25A.A0d(r2)
            if (r0 != 0) goto L_0x00ba
            boolean r0 = X.AnonymousClass25A.A0f(r2)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r2 instanceof X.AnonymousClass2MC
            if (r0 == 0) goto L_0x0022
            X.2MC r2 = (X.AnonymousClass2MC) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0022
        L_0x00ba:
            android.content.Context r2 = r4.getContext()
            r1 = 2130968877(0x7f04012d, float:1.754642E38)
            r0 = 2131099954(0x7f060132, float:1.7812276E38)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78973u1.getTextColor():int");
    }

    public void onDetachedFromWindow() {
        AnonymousClass496 r1 = this.A05;
        if (r1 != null) {
            r1.A0B(true);
            this.A05 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C436420i);
        this.A0I = r2;
    }

    public C78973u1(Context context, C108875cR r4, C436420i r5) {
        super(context, r4, r5);
        A1M();
        setClickable(false);
        setImportantForAccessibility(2);
        this.A0V = C17880vN.A0E(this, 2131431625);
        A09();
    }

    public static boolean A0B(C436420i r2) {
        int i;
        if (AnonymousClass25A.A0n(r2) || ((AnonymousClass25A.A0f(r2) && (r2 instanceof AnonymousClass2MC) && ((AnonymousClass2MC) r2).A00 == 0) || AnonymousClass25A.A0h(r2) || AnonymousClass25A.A0i(r2) || (i = r2.A00) == 62 || i == 63)) {
            return true;
        }
        return false;
    }

    public void A1u() {
        A09();
        AnonymousClass3uP.A0h(this, false);
    }

    public int getCenteredLayoutId() {
        return 2131624811;
    }

    public int getIncomingLayoutId() {
        return 2131624811;
    }

    public int getOutgoingLayoutId() {
        return 2131624811;
    }
}
