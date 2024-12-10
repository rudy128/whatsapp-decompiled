package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Ajg  reason: case insensitive filesystem */
public final /* synthetic */ class C21413Ajg implements Runnable {
    public final /* synthetic */ C20284AEs A00;
    public final /* synthetic */ C195639tf A01;
    public final /* synthetic */ AnonymousClass90E A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public final void run() {
        AnonymousClass90E r11 = this.A02;
        C20284AEs aEs = this.A00;
        String str = this.A07;
        C195639tf r12 = this.A01;
        String str2 = this.A08;
        String str3 = this.A09;
        String str4 = this.A0A;
        Long l = this.A06;
        Integer num = this.A05;
        Boolean bool = this.A03;
        Integer num2 = this.A04;
        Context A0E = C108945cZ.A0E(r11.A03);
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(A0E.getPackageName(), "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity");
        A0A2.putExtra("extra_bank_account", aEs);
        A0A2.putExtra("extra_india_upi_pin_op", str);
        A0A2.putExtra("extra_fds_manager_id", r12.A04);
        String str5 = r11.A01;
        if (str5 == null) {
            C18070vi.A11("observerId");
            throw null;
        }
        A0A2.putExtra("extra_fcs_observer_id", str5);
        A0A2.putExtra("extra_seq_number", str2);
        A0A2.putExtra("extra_payee_name", str3);
        A0A2.putExtra("extra_receiver_vpa", str4);
        A0A2.putExtra("extra_payment_preset_amount", l);
        A0A2.putExtra("extra_payment_offset", num);
        A0A2.putExtra("is_asynchronous", bool);
        A0A2.putExtra("code", num2);
        A0A2.setFlags(268435456);
        A0E.startActivity(A0A2);
    }

    public /* synthetic */ C21413Ajg(C20284AEs aEs, C195639tf r2, AnonymousClass90E r3, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        this.A02 = r3;
        this.A00 = aEs;
        this.A07 = str;
        this.A01 = r2;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A06 = l;
        this.A05 = num;
        this.A03 = bool;
        this.A04 = num2;
    }
}
