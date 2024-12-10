package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.6BZ  reason: invalid class name */
public final class AnonymousClass6BZ extends C111895kb {
    public final C40431uh A00 = new C40431uh((C40411uf) new C111565jv(5), (C38391rD) this);
    public final C18000vb A01;
    public final AnonymousClass1c4 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6BZ(AnonymousClass1F9 r10, C37451pZ r11, C18000vb r12, AnonymousClass1c4 r13, C132806nc r14, C111205iq r15, boolean z) {
        super(r10, r11, r14, r15, z);
        C18070vi.A0d(r14, 5);
        C18070vi.A0d(r13, 7);
        this.A01 = r12;
        this.A02 = r13;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            return new AnonymousClass6BV(C108995ce.A0K(2131626239, viewGroup), this);
        }
        List list2 = C42011xT.A0I;
        int i2 = 2131626235;
        if (i == 2) {
            i2 = 2131626234;
        }
        return new C113355mx(C108995ce.A0K(i2, viewGroup), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if (r3.isEmpty() != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r13, int r14) {
        /*
            r12 = this;
            X.5mx r13 = (X.C113355mx) r13
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.1uh r0 = r12.A00
            java.util.List r0 = r0.A02
            java.lang.Object r7 = r0.get(r14)
            X.6tS r7 = (X.C136216tS) r7
            X.C18070vi.A0b(r7)
            r2 = 0
            X.C18070vi.A0d(r7, r2)
            X.6BZ r6 = r13.A04
            X.0vb r0 = r6.A01
            java.text.NumberFormat r1 = r0.A0L()
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = r1.format(r0)
            boolean r8 = r7.A05
            boolean r5 = r13 instanceof X.AnonymousClass6BV
            android.widget.TextView r11 = r13.A01
            r3 = 0
            r4 = 1
            if (r8 == 0) goto L_0x0040
            android.content.Context r1 = X.C108945cZ.A0D(r13)
            if (r5 == 0) goto L_0x010a
            r0 = 2131892865(0x7f121a81, float:1.942049E38)
            java.lang.String r9 = r1.getString(r0)
        L_0x0040:
            r11.setText(r9)
            android.widget.TextView r10 = r13.A02
            if (r8 != 0) goto L_0x0049
            r3 = 8
        L_0x0049:
            r10.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r9 = r13.A03
            java.lang.String r1 = r7.A03
            r0 = 0
            r9.A0S(r1, r0, r2, r2)
            X.7uQ r1 = new X.7uQ
            r1.<init>(r6, r7)
            android.view.View r3 = r13.A0H
            r0 = 21
            X.AnonymousClass3Ma.A19(r3, r1, r0)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r3)
            r0 = 16843534(0x101030e, float:2.369575E-38)
            r1.resolveAttribute(r0, r2, r4)
            int r0 = r2.resourceId
            r3.setBackgroundResource(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.CharSequence r0 = r9.getText()
            r2.append(r0)
            r1 = 32
            r2.append(r1)
            java.lang.CharSequence r0 = r11.getText()
            r2.append(r0)
            r2.append(r1)
            int r0 = r10.getVisibility()
            if (r0 != 0) goto L_0x0107
            java.lang.CharSequence r0 = r10.getText()
        L_0x0098:
            java.lang.String r0 = X.C17890vO.A0V(r0, r2)
            r3.setContentDescription(r0)
            r9.setSelected(r8)
            java.util.List r1 = r7.A04
            if (r1 == 0) goto L_0x0105
            r0 = 5
            java.util.List r3 = X.C29431cG.A0v(r1, r0)
        L_0x00ab:
            com.whatsapp.contact.FacepileView r8 = r13.A00
            r2 = 0
            if (r8 == 0) goto L_0x00be
            if (r3 == 0) goto L_0x00b9
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00bb
        L_0x00b9:
            r0 = 8
        L_0x00bb:
            r8.setVisibility(r0)
        L_0x00be:
            if (r3 == 0) goto L_0x0113
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0113
            if (r8 == 0) goto L_0x00cf
            int r0 = r3.size()
            r8.setContactsSize(r0)
        L_0x00cf:
            java.util.Iterator r9 = r3.iterator()
        L_0x00d3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r9.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L_0x00e6
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x00e6:
            X.6rD r0 = (X.C134826rD) r0
            if (r8 == 0) goto L_0x00fd
            com.whatsapp.WaImageView r2 = r8.A04(r2)
            if (r2 == 0) goto L_0x00fd
            X.1E7 r1 = r0.A00
            if (r1 != 0) goto L_0x00ff
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x00fd
            X.6nc r0 = r6.A02
            r0.A00(r2, r1)
        L_0x00fd:
            r2 = r3
            goto L_0x00d3
        L_0x00ff:
            X.1pZ r0 = r6.A01
            r0.A07(r2, r1)
            goto L_0x00fd
        L_0x0105:
            r3 = 0
            goto L_0x00ab
        L_0x0107:
            java.lang.String r0 = ""
            goto L_0x0098
        L_0x010a:
            r0 = 2131892766(0x7f121a1e, float:1.942029E38)
            java.lang.String r9 = X.C17890vO.A0R(r1, r9, r4, r2, r0)
            goto L_0x0040
        L_0x0113:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0140
            if (r5 == 0) goto L_0x0140
            X.6BV r13 = (X.AnonymousClass6BV) r13
            if (r13 == 0) goto L_0x0140
            X.5iq r1 = r12.A03
            android.widget.ImageView r5 = r13.A00
            X.206 r2 = r7.A01
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1DT r3 = X.C108945cZ.A0S()
            X.1gV r1 = r1.A08
            X.7NG r0 = new X.7NG
            r0.<init>(r5, r3, r4)
            r1.A0D(r5, r2, r0)
            X.1F9 r2 = r12.A00
            X.80Z r1 = new X.80Z
            r1.<init>(r13)
            r0 = 2
            X.AnonymousClass7AS.A00(r2, r3, r1, r0)
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BZ.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Integer num;
        if (!((C136216tS) this.A00.A02.get(i)).A05) {
            num = AnonymousClass00R.A01;
        } else if (this.A04) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A0C;
        }
        return num.intValue();
    }
}
