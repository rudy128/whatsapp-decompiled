package X;

import android.widget.BaseAdapter;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.util.List;

/* renamed from: X.3Or  reason: invalid class name and case insensitive filesystem */
public class C73023Or extends BaseAdapter {
    public C59822mw A00;
    public List A01 = AnonymousClass000.A13();
    public final /* synthetic */ CallLogActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C73023Or(CallLogActivity callLogActivity) {
        this.A02 = callLogActivity;
    }

    public int getCount() {
        return C72463Mc.A0C(this.A01);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f5, code lost:
        if (r5.A0S() != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022e, code lost:
        if (r5.A0R() == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            r12 = this;
            if (r14 != 0) goto L_0x024c
            com.whatsapp.calling.callhistory.CallLogActivity r2 = r12.A02
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131624452(0x7f0e0204, float:1.8876084E38)
            android.view.View r14 = X.AnonymousClass3MX.A09(r1, r15, r0)
            X.4RY r0 = new X.4RY
            r0.<init>(r14, r2)
            r14.setTag(r0)
            r1 = 2
            r14.setImportantForAccessibility(r1)
            r1 = 2131434755(0x7f0b1d03, float:1.8491333E38)
            android.view.View r2 = r14.findViewById(r1)
            r1 = 1
            r2.setImportantForAccessibility(r1)
        L_0x0026:
            java.util.List r1 = r12.A01
            java.lang.Object r5 = r1.get(r13)
            X.9Bw r5 = (X.C178119Bw) r5
            X.2mw r4 = r12.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = r0.A0B
            X.0ve r2 = r3.A0E
            X.00H r1 = r3.A0S
            r1.get()
            if (r4 == 0) goto L_0x0232
            r6 = 2131233223(0x7f0809c7, float:1.8082577E38)
        L_0x003e:
            int r1 = X.AnonymousClass4aR.A02(r5)
            android.widget.ImageView r2 = r0.A02
            r2.setImageResource(r6)
            int r1 = X.AnonymousClass3MY.A02(r2, r1)
            X.AnonymousClass4aX.A0D(r2, r1)
            android.widget.TextView r8 = r0.A07
            X.0ve r7 = r3.A0E
            boolean r1 = X.C40811vJ.A0R(r7)
            r6 = 0
            if (r1 == 0) goto L_0x01fc
            boolean r1 = r5.A0R()
            if (r1 != 0) goto L_0x01f7
            boolean r1 = r5.A0U()
            if (r1 == 0) goto L_0x01f1
            r2 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r7, r2)
            if (r1 == 0) goto L_0x01f1
        L_0x006f:
            r2 = 2131892251(0x7f12181b, float:1.9419245E38)
        L_0x0072:
            X.6IR r2 = X.AnonymousClass3MX.A0t(r2)
        L_0x0076:
            android.content.Context r1 = r8.getContext()
            X.AnonymousClass4ZN.A01(r1, r8, r2)
            X.0ve r1 = r3.A0E
            boolean r1 = X.C40811vJ.A0R(r1)
            r7 = 8
            if (r1 == 0) goto L_0x01dd
            int r2 = X.AnonymousClass4aR.A03(r5)
            android.content.Context r1 = r8.getContext()
            X.AnonymousClass3MX.A1C(r1, r8, r2)
            android.widget.ImageView r1 = r0.A01
            r1.setVisibility(r7)
        L_0x0097:
            android.widget.TextView r9 = r0.A05
            android.content.Context r10 = r9.getContext()
            X.11P r8 = r3.A05
            long r1 = r5.A01
            long r1 = r8.A09(r1)
            r8 = 1
            java.lang.String r1 = android.text.format.DateUtils.formatDateTime(r10, r1, r8)
            r9.setText(r1)
            int r9 = r5.A06
            r1 = 5
            if (r9 != r1) goto L_0x01a9
            android.widget.TextView r11 = r0.A06
            X.0vb r10 = r3.A00
            int r1 = r5.A08
            long r1 = (long) r1
            r9 = 0
            java.lang.String r1 = X.C64052u8.A0D(r10, r9, r1)
            r11.setText(r1)
            r11.setVisibility(r6)
            long r1 = r5.A0A
            r10 = 0
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x01c8
            android.widget.TextView r9 = r0.A04
            X.0vb r7 = r3.A00
            java.lang.String r1 = X.C88584aA.A04(r7, r1)
            r9.setText(r1)
            r9.setVisibility(r6)
        L_0x00da:
            if (r4 == 0) goto L_0x0186
            com.whatsapp.jid.UserJid r4 = r4.A05
            X.1Me r2 = r3.A0C
            X.1Nf r1 = r3.A0H
            X.1E7 r1 = r1.A01(r4)
            java.lang.String r2 = X.AnonymousClass3MY.A0q(r2, r1)
            X.11S r1 = r3.A02
            boolean r1 = r1.A0O(r4)
            if (r1 == 0) goto L_0x0182
            r1 = 2131895431(0x7f122487, float:1.9425695E38)
            java.lang.String r6 = r3.getString(r1)
        L_0x00f9:
            if (r6 == 0) goto L_0x010b
            android.widget.TextView r4 = r0.A08
            X.0vb r2 = r3.A00
            java.lang.String r1 = ""
            java.lang.String r1 = X.AnonymousClass1EG.A04(r2, r1, r6)
            r4.setText(r1)
            r4.setContentDescription(r6)
        L_0x010b:
            X.0ve r1 = r3.A0E
            boolean r1 = X.C40811vJ.A0R(r1)
            if (r1 == 0) goto L_0x0133
            boolean r1 = r5.A0R()
            if (r1 == 0) goto L_0x0148
            r6 = 2131887847(0x7f1206e7, float:1.9410313E38)
        L_0x011c:
            r1 = 2131233383(0x7f080a67, float:1.8082902E38)
        L_0x011f:
            android.widget.ImageView r4 = r0.A03
            r4.setImageResource(r1)
            X.AnonymousClass1Y5.A03(r4, r6)
            android.widget.TextView r2 = r0.A09
            r2.setText(r6)
            r1 = 0
            r4.setVisibility(r1)
            r2.setVisibility(r1)
        L_0x0133:
            android.view.View r2 = r0.A00
            r1 = 18
            X.C89994dM.A00(r2, r0, r5, r1)
            X.C90284dp.A00(r2, r0, r5, r8)
            java.util.HashSet r1 = r3.A0p
            boolean r2 = r1.contains(r5)
            r1 = 0
            r0.A00(r2, r1, r1)
            return r14
        L_0x0148:
            boolean r1 = r5.A0U()
            if (r1 == 0) goto L_0x015e
            X.0ve r4 = r3.A0E
            r2 = 6307(0x18a3, float:8.838E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 == 0) goto L_0x015e
            r6 = 2131887843(0x7f1206e3, float:1.9410305E38)
            goto L_0x011c
        L_0x015e:
            boolean r1 = r5.A0S()
            if (r1 == 0) goto L_0x016b
            r6 = 2131887845(0x7f1206e5, float:1.9410309E38)
            r1 = 2131233278(0x7f0809fe, float:1.8082689E38)
            goto L_0x011f
        L_0x016b:
            boolean r1 = r5.A0T()
            if (r1 == 0) goto L_0x0175
            r6 = 2131887751(0x7f120687, float:1.9410118E38)
            goto L_0x011c
        L_0x0175:
            android.widget.ImageView r1 = r0.A03
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A09
            r1.setVisibility(r2)
            goto L_0x0133
        L_0x0182:
            r1 = 2131895430(0x7f122486, float:1.9425693E38)
            goto L_0x01a3
        L_0x0186:
            boolean r1 = r5.A0O()
            if (r1 == 0) goto L_0x010b
            X.4cT r7 = r5.A04
            boolean r1 = r7.A03
            if (r1 != 0) goto L_0x010b
            X.1Me r4 = r3.A0C
            X.1Nf r2 = r3.A0H
            com.whatsapp.jid.UserJid r1 = r7.A01
            X.1E7 r1 = r2.A01(r1)
            java.lang.String r2 = X.AnonymousClass3MY.A0q(r4, r1)
            r1 = 2131891692(0x7f1215ec, float:1.9418111E38)
        L_0x01a3:
            java.lang.String r6 = X.C17890vO.A0R(r3, r2, r8, r6, r1)
            goto L_0x00f9
        L_0x01a9:
            X.4cT r1 = r5.A04
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x01d7
            if (r4 != 0) goto L_0x01d7
            r1 = 2
            if (r9 == r1) goto L_0x01d3
            r1 = 3
            if (r9 == r1) goto L_0x01cf
            r1 = 4
            r2 = 2131898126(0x7f122f0e, float:1.943116E38)
            if (r9 == r1) goto L_0x01c0
            r2 = 2131887621(0x7f120605, float:1.9409854E38)
        L_0x01c0:
            android.widget.TextView r1 = r0.A06
            r1.setText(r2)
            r1.setVisibility(r6)
        L_0x01c8:
            android.widget.TextView r1 = r0.A04
            r1.setVisibility(r7)
            goto L_0x00da
        L_0x01cf:
            r2 = 2131898290(0x7f122fb2, float:1.9431494E38)
            goto L_0x01c0
        L_0x01d3:
            r2 = 2131898252(0x7f122f8c, float:1.9431416E38)
            goto L_0x01c0
        L_0x01d7:
            android.widget.TextView r1 = r0.A06
            r1.setVisibility(r7)
            goto L_0x01c8
        L_0x01dd:
            android.widget.ImageView r8 = r0.A01
            r8.setVisibility(r6)
            boolean r2 = r5.A0J
            r1 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r2 == 0) goto L_0x01ec
            r1 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x01ec:
            r8.setImageResource(r1)
            goto L_0x0097
        L_0x01f1:
            boolean r1 = r5.A0S()
            if (r1 == 0) goto L_0x01fc
        L_0x01f7:
            r2 = 2131896146(0x7f122752, float:1.9427145E38)
            goto L_0x0072
        L_0x01fc:
            if (r4 == 0) goto L_0x0208
            java.lang.String r1 = r4.A00()
            X.482 r2 = X.C1402670q.A00(r1)
            goto L_0x0076
        L_0x0208:
            X.4cT r1 = r5.A04
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0213
            r2 = 2131893425(0x7f121cb1, float:1.9421626E38)
            goto L_0x0072
        L_0x0213:
            int r2 = r5.A06
            r1 = 5
            if (r2 != r1) goto L_0x021d
            r2 = 2131891320(0x7f121478, float:1.9417357E38)
            goto L_0x0072
        L_0x021d:
            int r2 = r5.A06
            r1 = 6
            if (r2 != r1) goto L_0x0227
            r2 = 2131886182(0x7f120066, float:1.9406936E38)
            goto L_0x0072
        L_0x0227:
            boolean r1 = r5.A0R()
            r2 = 2131887846(0x7f1206e6, float:1.941031E38)
            if (r1 != 0) goto L_0x0072
            goto L_0x006f
        L_0x0232:
            boolean r1 = X.C40811vJ.A0R(r2)
            if (r1 == 0) goto L_0x023e
            int r6 = X.C42571yO.A00(r5)
            goto L_0x003e
        L_0x023e:
            X.4cT r1 = r5.A04
            boolean r1 = r1.A03
            r6 = 2131233228(0x7f0809cc, float:1.8082588E38)
            if (r1 == 0) goto L_0x003e
            r6 = 2131233227(0x7f0809cb, float:1.8082586E38)
            goto L_0x003e
        L_0x024c:
            java.lang.Object r0 = r14.getTag()
            X.4RY r0 = (X.AnonymousClass4RY) r0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73023Or.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
