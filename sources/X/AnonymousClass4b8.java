package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import java.util.Set;

/* renamed from: X.4b8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ C107825ag A01;
    public final /* synthetic */ AnonymousClass5YU A02;
    public final /* synthetic */ C107835ah A03;
    public final /* synthetic */ AnonymousClass1KB A04;
    public final /* synthetic */ C33251iW A05;
    public final /* synthetic */ C19830z4 A06;
    public final /* synthetic */ C18000vb A07;
    public final /* synthetic */ C18030ve A08;
    public final /* synthetic */ AnonymousClass18K A09;
    public final /* synthetic */ C25241Nl A0A;
    public final /* synthetic */ C62242r5 A0B;
    public final /* synthetic */ AnonymousClass10I A0C;
    public final /* synthetic */ Set A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r0.isChecked() == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r28, int r29) {
        /*
            r27 = this;
            r3 = r27
            X.5ag r2 = r3.A01
            android.widget.CheckBox r0 = r3.A00
            boolean r14 = r3.A0E
            X.0z4 r1 = r3.A06
            X.10I r13 = r3.A0C
            X.18K r12 = r3.A09
            X.2r5 r11 = r3.A0B
            X.1Nl r10 = r3.A0A
            java.util.Set r9 = r3.A0D
            boolean r8 = r3.A0F
            X.5YU r15 = r3.A02
            X.1KB r7 = r3.A04
            X.1iW r6 = r3.A05
            X.0ve r5 = r3.A08
            X.0vb r4 = r3.A07
            X.5ah r3 = r3.A03
            r2.C31()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isChecked()
            r2 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == r14) goto L_0x003a
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)
            java.lang.String r0 = "pref_delete_media"
            X.C17880vN.A1F(r1, r0, r2)
        L_0x003a:
            X.4rY r14 = new X.4rY
            r25 = r8
            r26 = r2
            r24 = r9
            r23 = r11
            r22 = r10
            r21 = r12
            r20 = r5
            r19 = r4
            r18 = r6
            r17 = r7
            r16 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13.CGF(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4b8.onClick(android.content.DialogInterface, int):void");
    }

    public /* synthetic */ AnonymousClass4b8(CheckBox checkBox, C107825ag r3, AnonymousClass5YU r4, C107835ah r5, AnonymousClass1KB r6, C33251iW r7, C19830z4 r8, C18000vb r9, C18030ve r10, AnonymousClass18K r11, C25241Nl r12, C62242r5 r13, AnonymousClass10I r14, Set set, boolean z, boolean z2) {
        this.A01 = r3;
        this.A00 = checkBox;
        this.A0E = z;
        this.A06 = r8;
        this.A0C = r14;
        this.A09 = r11;
        this.A0B = r13;
        this.A0A = r12;
        this.A0D = set;
        this.A0F = z2;
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r10;
        this.A07 = r9;
        this.A03 = r5;
    }
}
