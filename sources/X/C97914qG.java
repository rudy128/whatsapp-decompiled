package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4qG  reason: invalid class name and case insensitive filesystem */
public class C97914qG implements C108415bf {
    public TextEmojiLabel A00;
    public WDSButton A01;
    public WDSButton A02;
    public final C108565bu A03;
    public final View A04;
    public final AnonymousClass11C A05;
    public final C18030ve A06;
    public final C38541rS A07;

    public int getType() {
        return 1;
    }

    public void Bd0() {
        this.A04.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CFG(X.AnonymousClass4PI r14) {
        /*
            r13 = this;
            android.view.View r1 = r13.A04
            r0 = 0
            r1.setVisibility(r0)
            android.content.Context r8 = r1.getContext()
            r0 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r1, r0)
            r13.A00 = r0
            r0 = 2131427536(0x7f0b00d0, float:1.8476691E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r1, r0)
            r13.A01 = r0
            r0 = 2131427537(0x7f0b00d1, float:1.8476693E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r1, r0)
            r13.A02 = r0
            int r0 = r14.A0B
            r4 = -1
            if (r0 != 0) goto L_0x0176
            r7 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r6 = 2131895216(0x7f1223b0, float:1.9425259E38)
            r5 = 2131232349(0x7f08065d, float:1.8080805E38)
            r3 = 0
        L_0x0034:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A01
            X.4DG r0 = X.AnonymousClass4DG.DESTRUCTIVE
            r1.setAction(r0)
        L_0x003b:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A01
            r2 = 8
            if (r1 == 0) goto L_0x0051
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r7)
            X.AnonymousClass3MY.A0w(r8, r1, r6)
            X.AnonymousClass1Y5.A02(r1, r7)
            r1.setIcon((int) r5)
        L_0x0051:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A01
            r0 = 37
            X.C90104dX.A00(r1, r13, r3, r0)
        L_0x0058:
            int r0 = r14.A00
            if (r0 != 0) goto L_0x0154
            X.0ve r2 = r13.A06
            r1 = 5263(0x148f, float:7.375E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 2131898687(0x7f12313f, float:1.9432299E38)
            r6 = 2131886470(0x7f120186, float:1.940752E38)
            if (r0 == 0) goto L_0x0074
            r7 = 2131886471(0x7f120187, float:1.9407522E38)
            r6 = 2131886471(0x7f120187, float:1.9407522E38)
        L_0x0074:
            r5 = r7
            r3 = 2131232173(0x7f0805ad, float:1.8080448E38)
            r2 = 0
        L_0x0079:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A02
            if (r1 == 0) goto L_0x008f
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r7)
            if (r6 == 0) goto L_0x0089
            X.AnonymousClass3MY.A0w(r8, r1, r6)
        L_0x0089:
            X.AnonymousClass1Y5.A02(r1, r5)
            r1.setIcon((int) r3)
        L_0x008f:
            com.whatsapp.wds.components.button.WDSButton r1 = r13.A02
            r0 = 38
            X.C90104dX.A00(r1, r13, r2, r0)
        L_0x0096:
            X.0ve r3 = r13.A06
            r1 = 5263(0x148f, float:7.375E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00ba
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A01
            X.4D1 r1 = X.AnonymousClass4D1.SMALL
            r0.setSize(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A02
            r0.setSize(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A01
            X.1Xz r1 = X.C27881Xz.OUTLINE
            r0.setVariant(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A02
            r0.setVariant(r1)
        L_0x00ba:
            int r2 = r14.A07
            if (r2 == r4) goto L_0x0146
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x00fb
            X.1rS r7 = r13.A07
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r11 = "safety-tools"
            r0 = 0
            java.lang.String r10 = X.C17880vN.A0q(r8, r11, r1, r0, r2)
            r1 = 2130968627(0x7f040033, float:1.7545913E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r12 = X.AnonymousClass1YL.A00(r8, r1, r0)
            r0 = 45
            X.7RI r9 = new X.7RI
            r9.<init>(r13, r0)
            android.text.SpannableStringBuilder r5 = r7.A04(r8, r9, r10, r11, r12)
        L_0x00e4:
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            X.AnonymousClass3Ma.A1L(r3, r0)
            com.whatsapp.TextEmojiLabel r1 = r13.A00
            X.11C r0 = r13.A05
            X.AnonymousClass3Ma.A1K(r1, r0)
        L_0x00f0:
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            r0.setText(r5)
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            X.AnonymousClass3MY.A0w(r8, r0, r2)
        L_0x00fa:
            return
        L_0x00fb:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getString(r2)
            r5.append(r6)
            android.content.res.Resources r4 = r8.getResources()
            r1 = 2130969092(0x7f040204, float:1.7546856E38)
            r0 = 2131100134(0x7f0601e6, float:1.781264E38)
            int r1 = X.AnonymousClass3Ma.A01(r8, r4, r1, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r6 = r6.length()
            r4 = 33
            r1 = 0
            r5.setSpan(r0, r1, r6, r4)
            int r0 = r14.A06
            if (r0 != 0) goto L_0x00f0
            X.BGo r0 = new X.BGo
            r0.<init>()
            r5.setSpan(r0, r1, r6, r4)
            int r0 = r14.A05
            java.lang.String r1 = r8.getString(r0)
            X.5bu r0 = r13.A03
            android.text.SpannableStringBuilder r1 = r0.BFg(r8, r1)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r5.append(r0)
            r0.append(r1)
            goto L_0x00e4
        L_0x0146:
            java.lang.String r1 = r14.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fa
            com.whatsapp.TextEmojiLabel r0 = r13.A00
            r0.setText(r1)
            return
        L_0x0154:
            int r0 = r14.A0A
            if (r0 != 0) goto L_0x016f
            int r7 = r14.A09
            if (r7 != r4) goto L_0x016b
            r7 = 2131892996(0x7f121b04, float:1.9420756E38)
            r6 = 2131892998(0x7f121b06, float:1.942076E38)
            r5 = 2131887451(0x7f12055b, float:1.940951E38)
        L_0x0165:
            r3 = 2131231797(0x7f080435, float:1.8079685E38)
            r2 = 1
            goto L_0x0079
        L_0x016b:
            int r6 = r14.A08
            r5 = r7
            goto L_0x0165
        L_0x016f:
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A02
            r0.setVisibility(r2)
            goto L_0x0096
        L_0x0176:
            int r0 = r14.A02
            if (r0 != 0) goto L_0x018a
            int r7 = r14.A01
            if (r7 != r4) goto L_0x0181
            r7 = 2131887168(0x7f120440, float:1.9408935E38)
        L_0x0181:
            r6 = 2131887180(0x7f12044c, float:1.940896E38)
            r5 = 2131231719(0x7f0803e7, float:1.8079527E38)
            r3 = 1
            goto L_0x0034
        L_0x018a:
            int r0 = r14.A04
            if (r0 != 0) goto L_0x01a4
            boolean r0 = r14.A0D
            r7 = 2131890194(0x7f121012, float:1.9415073E38)
            r6 = 2131890196(0x7f121014, float:1.9415077E38)
            if (r0 == 0) goto L_0x019e
            r7 = 2131890178(0x7f121002, float:1.941504E38)
            r6 = 2131890179(0x7f121003, float:1.9415042E38)
        L_0x019e:
            r5 = 2131232077(0x7f08054d, float:1.8080253E38)
            r3 = 2
            goto L_0x0034
        L_0x01a4:
            int r0 = r14.A03
            if (r0 != 0) goto L_0x01b4
            r7 = 2131889490(0x7f120d52, float:1.9413645E38)
            r6 = 2131889498(0x7f120d5a, float:1.9413661E38)
            r5 = 2131231814(0x7f080446, float:1.807972E38)
            r3 = 3
            goto L_0x003b
        L_0x01b4:
            r1 = 8
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A01
            r0.setVisibility(r1)
            r2 = 8
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97914qG.CFG(X.4PI):void");
    }

    public boolean isVisible() {
        return AnonymousClass000.A1P(this.A04.getVisibility());
    }

    public C97914qG(View view, AnonymousClass11C r2, C18030ve r3, C108565bu r4, C38541rS r5) {
        this.A06 = r3;
        this.A07 = r5;
        this.A05 = r2;
        this.A04 = view;
        this.A03 = r4;
    }
}
