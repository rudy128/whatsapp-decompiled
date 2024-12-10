package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;

/* renamed from: X.756  reason: invalid class name */
public final /* synthetic */ class AnonymousClass756 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass1KB A04;
    public final /* synthetic */ C30191dX A05;
    public final /* synthetic */ AnonymousClass1M9 A06;
    public final /* synthetic */ C139486yv A07;
    public final /* synthetic */ C133496or A08;
    public final /* synthetic */ C136756uL A09;
    public final /* synthetic */ AnonymousClass12E A0A;
    public final /* synthetic */ C219217x A0B;
    public final /* synthetic */ C19830z4 A0C;
    public final /* synthetic */ C133956pm A0D;
    public final /* synthetic */ C37301pI A0E;
    public final /* synthetic */ AnonymousClass10I A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    public final void onClick(DialogInterface dialogInterface, int i) {
        View view = this.A01;
        C133496or r7 = this.A08;
        View view2 = this.A02;
        View view3 = this.A03;
        C19830z4 r18 = this.A0C;
        C219217x r17 = this.A0B;
        C30191dX r22 = this.A05;
        C139486yv r16 = this.A07;
        AnonymousClass1M9 r13 = this.A06;
        AnonymousClass12E r12 = this.A0A;
        AnonymousClass10I r10 = this.A0F;
        C136756uL r9 = this.A09;
        boolean z = this.A0G;
        C133956pm r4 = this.A0D;
        AnonymousClass1KB r3 = this.A04;
        Resources resources = this.A00;
        C37301pI r1 = this.A0E;
        boolean z2 = this.A0H;
        DialogInterface dialogInterface2 = dialogInterface;
        C18070vi.A0d(dialogInterface2, 18);
        View A052 = C18070vi.A05(view, 2131435976);
        A052.setVisibility(0);
        view2.setVisibility(4);
        r7.A01(false);
        C219217x r28 = r17;
        C19830z4 r29 = r18;
        Resources resources2 = resources;
        View view4 = view3;
        View view5 = A052;
        View view6 = view2;
        View view7 = view;
        AnonymousClass1KB r21 = r3;
        r4.A01(new AnonymousClass83O(resources2, view4, view5, view6, view7, r21, r22, r13, r16, r7, r9, r12, r28, r29, r4, r1, r10, z2, z), true);
        dialogInterface2.dismiss();
    }

    public /* synthetic */ AnonymousClass756(Resources resources, View view, View view2, View view3, AnonymousClass1KB r6, C30191dX r7, AnonymousClass1M9 r8, C139486yv r9, C133496or r10, C136756uL r11, AnonymousClass12E r12, C219217x r13, C19830z4 r14, C133956pm r15, C37301pI r16, AnonymousClass10I r17, boolean z, boolean z2) {
        this.A01 = view;
        this.A08 = r10;
        this.A02 = view2;
        this.A03 = view3;
        this.A0C = r14;
        this.A0B = r13;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = r12;
        this.A0F = r17;
        this.A09 = r11;
        this.A0G = z;
        this.A0D = r15;
        this.A04 = r6;
        this.A00 = resources;
        this.A0E = r16;
        this.A0H = z2;
    }
}
