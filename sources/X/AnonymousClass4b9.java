package X;

import android.content.Context;
import android.content.DialogInterface;
import java.util.Set;

/* renamed from: X.4b9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C107825ag A03;
    public final /* synthetic */ C107835ah A04;
    public final /* synthetic */ C33251iW A05;
    public final /* synthetic */ C19830z4 A06;
    public final /* synthetic */ AnonymousClass18K A07;
    public final /* synthetic */ C25241Nl A08;
    public final /* synthetic */ AnonymousClass1BI A09;
    public final /* synthetic */ C62242r5 A0A;
    public final /* synthetic */ C87794Wz A0B;
    public final /* synthetic */ Integer A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ Set A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C107825ag r14 = this.A03;
        boolean z = this.A0F;
        boolean z2 = this.A0G;
        C19830z4 r11 = this.A06;
        int i2 = this.A01;
        Context context = this.A02;
        String str = this.A0D;
        C87794Wz r7 = this.A0B;
        AnonymousClass18K r6 = this.A07;
        C62242r5 r5 = this.A0A;
        C25241Nl r4 = this.A08;
        Set set = this.A0E;
        C33251iW r2 = this.A05;
        C107835ah r16 = this.A04;
        AnonymousClass1BI r1 = this.A09;
        Integer num = this.A0C;
        int i3 = this.A00;
        r14.C31();
        if (z != z2) {
            C17880vN.A1F(C19830z4.A00(r11), "pref_delete_media", z);
        }
        if (i2 >= 1) {
            C17960vV.A07(str);
            String A0q = C17880vN.A0q(context, str, new Object[1], 0, 2131886551);
            if (r7.A03 && r7.A00 == 3) {
                r7.A00 = 4;
                C87794Wz.A00(r7, 5);
            }
            C25241Nl r18 = r4;
            AnonymousClass1BI r19 = r1;
            C62242r5 r20 = r5;
            C107835ah r15 = r16;
            C33251iW r162 = r2;
            AnonymousClass18K r17 = r6;
            AnonymousClass4PE r13 = new AnonymousClass4PE(r14, r15, r162, r17, r18, r19, r20, r7, num, set, i3, z);
            C73203Rj A002 = AnonymousClass4a6.A00(context);
            AnonymousClass4aq r22 = new AnonymousClass4aq(r13, 12);
            C1411874q r12 = new C1411874q(7);
            A002.A0S(A0q);
            A002.setPositiveButton(2131886550, r22);
            A002.setNegativeButton(2131898766, r12);
            A002.A0T(true);
            AnonymousClass3MY.A1G(A002);
            return;
        }
        C88224Yu.A02(r6, r4, r5, set, 1);
        r2.A0q(set, z);
        if (r7.A03 && r7.A00 == 3) {
            r7.A00 = 5;
            C87794Wz.A00(r7, 3);
        }
        r16.Br8();
        if (num != null) {
            r14.C5c(r1, num.intValue());
        }
    }

    public /* synthetic */ AnonymousClass4b9(Context context, C107825ag r3, C107835ah r4, C33251iW r5, C19830z4 r6, AnonymousClass18K r7, C25241Nl r8, AnonymousClass1BI r9, C62242r5 r10, C87794Wz r11, Integer num, String str, Set set, int i, int i2, boolean z, boolean z2) {
        this.A03 = r3;
        this.A0F = z;
        this.A0G = z2;
        this.A06 = r6;
        this.A01 = i;
        this.A02 = context;
        this.A0D = str;
        this.A0B = r11;
        this.A07 = r7;
        this.A0A = r10;
        this.A08 = r8;
        this.A0E = set;
        this.A05 = r5;
        this.A04 = r4;
        this.A09 = r9;
        this.A0C = num;
        this.A00 = i2;
    }
}
