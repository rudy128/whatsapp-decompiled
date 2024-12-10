package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.4RZ  reason: invalid class name */
public class AnonymousClass4RZ {
    public final Context A00;
    public final C33251iW A01;
    public final AnonymousClass1FP A02;
    public final AnonymousClass1BI A03;
    public final C18090vk A04;
    public final CompoundButton.OnCheckedChangeListener A05;
    public final ListItemWithLeftIcon A06;
    public final AnonymousClass11P A07;
    public final C19830z4 A08;
    public final C18000vb A09;
    public final AnonymousClass1CJ A0A;
    public final AnonymousClass1Nb A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        if (r9.A0A() != false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C76743o8
            if (r0 == 0) goto L_0x0067
            r6 = r10
            X.3o8 r6 = (X.C76743o8) r6
            com.whatsapp.ListItemWithLeftIcon r2 = r6.A01
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x0066
            X.1Nb r1 = r6.A04
            X.1BI r0 = r6.A03
            X.1yM r7 = r1.A0a(r0)
            r0 = 2131432885(0x7f0b15b5, float:1.848754E38)
            android.view.View r1 = X.C18070vi.A05(r2, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 2131432091(0x7f0b129b, float:1.848593E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r2, r0)
            r0 = 8
            r5.setVisibility(r0)
            boolean r0 = r7.A09()
            r1.setChecked(r0)
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0066
            long r3 = r7.A03
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            X.11P r0 = r7.A0W
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            long r3 = r7.A03
        L_0x004d:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
        L_0x0059:
            r0 = 0
            r5.setVisibility(r0)
            X.0vb r0 = r6.A02
            java.lang.String r0 = X.C64052u8.A06(r0, r3)
            r5.setText(r0)
        L_0x0066:
            return
        L_0x0067:
            X.1Nb r0 = r10.A0B
            X.1BI r2 = r10.A03
            X.1yM r9 = r0.A0a(r2)
            com.whatsapp.ListItemWithLeftIcon r4 = r10.A06
            r0 = 2131432096(0x7f0b12a0, float:1.848594E38)
            android.widget.TextView r8 = X.AnonymousClass3Ma.A0E(r4, r0)
            r0 = 2131432091(0x7f0b129b, float:1.848593E38)
            android.widget.TextView r6 = X.AnonymousClass3Ma.A0E(r4, r0)
            r0 = 2131432885(0x7f0b15b5, float:1.848754E38)
            android.view.View r5 = r4.findViewById(r0)
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            if (r5 != 0) goto L_0x0090
            android.content.Context r0 = r10.A00
            com.whatsapp.wds.components.toggle.WDSSwitch r5 = X.AnonymousClass4G4.A00(r0, r4)
        L_0x0090:
            X.1CJ r1 = r10.A0A
            X.0z4 r0 = r10.A08
            boolean r3 = X.AnonymousClass1Q0.A03(r0, r1, r2)
            r7 = 0
            r5.setOnCheckedChangeListener(r7)
            r2 = 8
            r6.setVisibility(r2)
            r1 = 3
            X.48Z r0 = new X.48Z
            r0.<init>(r1, r10, r3)
            r4.setOnClickListener(r0)
            r0 = 2131886185(0x7f120069, float:1.9406942E38)
            if (r3 == 0) goto L_0x00b2
            r0 = 2131886740(0x7f120294, float:1.9408067E38)
        L_0x00b2:
            X.AnonymousClass1Y5.A02(r4, r0)
            android.content.Context r4 = r10.A00
            if (r3 == 0) goto L_0x0118
            r1 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r0 = 2131101306(0x7f06067a, float:1.7815018E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x00c3:
            X.AnonymousClass3MX.A1C(r4, r8, r0)
            if (r3 != 0) goto L_0x00d1
            X.1FP r1 = r10.A02
            r0 = 2131886229(0x7f120095, float:1.940703E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x00d1:
            r5.setContentDescription(r7)
            r0 = r3 ^ 1
            r5.setEnabled(r0)
            r5.setClickable(r0)
            r7 = 0
            if (r3 != 0) goto L_0x00e6
            boolean r1 = r9.A0A()
            r0 = 0
            if (r1 == 0) goto L_0x00e7
        L_0x00e6:
            r0 = 1
        L_0x00e7:
            r5.setChecked(r0)
            if (r3 != 0) goto L_0x0066
            boolean r0 = r9.A0A()
            if (r0 == 0) goto L_0x0114
            long r3 = r9.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0102
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x010e
        L_0x0102:
            r6.setVisibility(r7)
            X.0vb r0 = r10.A09
            java.lang.String r0 = X.C64052u8.A06(r0, r3)
            r6.setText(r0)
        L_0x010e:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r10.A05
            r5.setOnCheckedChangeListener(r0)
            return
        L_0x0114:
            r6.setVisibility(r2)
            goto L_0x010e
        L_0x0118:
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RZ.A00():void");
    }

    public AnonymousClass4RZ(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, ListItemWithLeftIcon listItemWithLeftIcon, C33251iW r6, AnonymousClass11P r7, C19830z4 r8, C18000vb r9, AnonymousClass1CJ r10, AnonymousClass1BI r11, AnonymousClass1Nb r12, C18090vk r13) {
        C18070vi.A0w(r7, r9, r10, r12, r6);
        C18070vi.A0q(r8, listItemWithLeftIcon, onCheckedChangeListener);
        C18070vi.A0d(r11, 9);
        this.A07 = r7;
        this.A09 = r9;
        this.A0A = r10;
        this.A0B = r12;
        this.A01 = r6;
        this.A08 = r8;
        this.A06 = listItemWithLeftIcon;
        this.A05 = onCheckedChangeListener;
        this.A03 = r11;
        this.A00 = context;
        this.A04 = r13;
        Activity A002 = AnonymousClass1L9.A00(context);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseAppCompatActivity");
        this.A02 = (AnonymousClass1FP) A002;
    }
}
