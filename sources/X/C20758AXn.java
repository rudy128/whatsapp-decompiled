package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.AXn  reason: case insensitive filesystem */
public class C20758AXn implements BB6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AW0 A01;
    public final /* synthetic */ A6R A02;
    public final /* synthetic */ B8b A03;
    public final /* synthetic */ AnonymousClass206 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C20758AXn(Context context, AW0 aw0, A6R a6r, B8b b8b, AnonymousClass206 r5, String str, boolean z) {
        this.A02 = a6r;
        this.A00 = context;
        this.A05 = str;
        this.A01 = aw0;
        this.A04 = r5;
        this.A03 = b8b;
        this.A06 = z;
    }

    public void Bti() {
        this.A02.A03(this.A00, this.A01);
    }

    public void onSuccess() {
        AnonymousClass1KJ A012;
        String A062;
        UserJid A002;
        BD1 A003;
        A6R a6r = this.A02;
        Context context = this.A00;
        String str = this.A05;
        AW0 aw0 = this.A01;
        AnonymousClass206 r2 = this.A04;
        B8b b8b = this.A03;
        if (this.A06) {
            if (r2 == null) {
                A002 = null;
            } else {
                A002 = C22941Dw.A00(r2.A0H());
            }
            C70653Bz r12 = new C70653Bz(a6r, b8b, 29);
            if (aw0.A0C != null) {
                AnonymousClass1KB r22 = a6r.A00;
                if (r22.A0N()) {
                    r22.A07(0, 2131895077);
                    AnonymousClass3MW.A1T(new C49122Pg(a6r.A01, a6r.A02, AnonymousClass8BR.A0N(a6r.A08), aw0, A002, a6r.A04, a6r.A05, a6r.A06, r12, 15), a6r.A07, 0);
                    return;
                }
                return;
            }
            C57312is A042 = a6r.A05.A04(aw0.A0G);
            if (A042 != null && (A003 = A042.A00(aw0.A0I)) != null) {
                a6r.A00.A07(0, 2131895077);
                BB4 BWW = A003.BWW();
                C17960vV.A07(BWW);
                BWW.CED(AnonymousClass1L9.A00(context), aw0, new AXU(aw0, a6r, r12));
                return;
            }
            return;
        }
        ALX alx = a6r.A03;
        Intent BTA = alx.A08.A06().BTA(context);
        if (BTA == null) {
            Log.e("No Intent to start send payment to Collect Request");
            return;
        }
        BTA.putExtra("extra_referral_screen", str);
        if (aw0.A0C != null) {
            BTA.putExtra("extra_request_message_key", aw0.A0L);
            BTA.putExtra("extra_conversation_message_type", 3);
            String str2 = aw0.A0K;
            if (str2 != null) {
                BTA.putExtra("extra_request_id", str2);
            }
            AnonymousClass1BI r23 = aw0.A0C;
            String str3 = "extra_jid";
            if (C22971Dz.A0e(r23)) {
                AnonymousClass3MY.A12(BTA, r23, str3);
                A062 = C22971Dz.A06(aw0.A0D);
                str3 = "extra_receiver_jid";
            } else {
                A062 = C22971Dz.A06(aw0.A0D);
            }
            BTA.putExtra(str3, A062);
        }
        if (!TextUtils.isEmpty(aw0.A0K)) {
            BTA.putExtra("extra_transaction_id", aw0.A0K);
        }
        BTA.putExtra("extra_transaction_type", aw0.A03);
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 != null) {
            BTA.putExtra("extra_payment_handle", AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, r0.A0G(), "paymentHandle"));
            BTA.putExtra("extra_incoming_pay_request_id", aw0.A0A.A0F());
        }
        AnonymousClass1KN r02 = aw0.A09;
        if (!(r02 == null || TextUtils.isEmpty(r02.toString()) || (A012 = alx.A07.A01()) == null)) {
            BTA.putExtra("extra_payment_preset_amount", A012.BLa(alx.A04, aw0.A09));
        }
        ((AnonymousClass1FU) AnonymousClass1L9.A00(context)).A3q(BTA, false);
    }
}
