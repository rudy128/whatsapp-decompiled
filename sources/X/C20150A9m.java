package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.A9m  reason: case insensitive filesystem */
public final /* synthetic */ class C20150A9m implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ C132216mP A01;
    public final /* synthetic */ AnonymousClass11E A02;
    public final /* synthetic */ AnonymousClass11C A03;
    public final /* synthetic */ C219217x A04;
    public final /* synthetic */ AnonymousClass1MB A05;
    public final /* synthetic */ AnonymousClass1LU A06;
    public final /* synthetic */ A98 A07;
    public final /* synthetic */ AnonymousClass10I A08;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1FU r4 = this.A00;
        AnonymousClass10I r1 = this.A08;
        AnonymousClass1LU r11 = this.A06;
        C132216mP r5 = this.A01;
        AnonymousClass11C r7 = this.A03;
        AnonymousClass1MB r10 = this.A05;
        C219217x r8 = this.A04;
        A98 a98 = this.A07;
        AnonymousClass11E r6 = this.A02;
        Log.i("RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/button/checkstatus");
        AnonymousClass4Yv.A00(r4, 109);
        r1.CGD(new AnonymousClass9BP((Bundle) null, r4, r5, r6, r7, r8, (AnonymousClass770) null, r10, r11, a98, "reg/cant-connect", true, true, false), new String[0]);
    }

    public /* synthetic */ C20150A9m(AnonymousClass1FU r1, C132216mP r2, AnonymousClass11E r3, AnonymousClass11C r4, C219217x r5, AnonymousClass1MB r6, AnonymousClass1LU r7, A98 a98, AnonymousClass10I r9) {
        this.A00 = r1;
        this.A08 = r9;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = a98;
        this.A02 = r3;
    }
}
