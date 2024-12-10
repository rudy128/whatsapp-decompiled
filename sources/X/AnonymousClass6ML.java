package X;

import android.content.Intent;
import com.whatsapp.registration.sendsmstowa.SendSmsToWa;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6ML  reason: invalid class name */
public final class AnonymousClass6ML extends A34 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass99F A03;
    public final C192809p1 A04;
    public final String A05;
    public final String A06;
    public final String A07 = "sms";
    public final String A08;
    public final WeakReference A09;

    public AnonymousClass6ML(AnonymousClass99F r3, C192809p1 r4, C1596585j r5, String str, String str2, int i, int i2, int i3) {
        this.A06 = str;
        this.A08 = str2;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = "0";
        this.A03 = r3;
        this.A04 = r4;
        this.A09 = AnonymousClass3MW.A0z(r5);
        C17960vV.A06("0");
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return this.A04.A00(this.A03, this.A07, (String) null, this.A06, this.A08, this.A05, (String) null, 0, this.A01, this.A02, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        ADN adn = (ADN) obj;
        C18070vi.A0d(adn, 0);
        C1596585j r5 = (C1596585j) this.A09.get();
        if (r5 != null) {
            String str = this.A07;
            C18070vi.A18(str, "sms");
            Integer num = adn.A09;
            SendSmsToWa sendSmsToWa = (SendSmsToWa) r5;
            StringBuilder A19 = AnonymousClass3MZ.A19(str, 0);
            A19.append("SendSmsToWa/onCodeEntrypointResponse/status=");
            C17890vO.A1A(A19, C181669Rj.A00(num));
            if (sendSmsToWa.Bed()) {
                Log.i("SendSmsToWa/onCodeEntrypointResponse/activity ended, ignoring response");
                return;
            }
            if (num.intValue() != 0) {
                AnonymousClass1NV r0 = sendSmsToWa.A0H;
                if (r0 == null) {
                    C18070vi.A11("exponentialBackoffProvider");
                } else {
                    SendSmsToWa.A0s(sendSmsToWa, r0.A01());
                    return;
                }
            } else {
                AnonymousClass4Yv.A00(sendSmsToWa, 1);
                AnonymousClass4Yv.A00(sendSmsToWa, 2);
                C108975cc.A0N(sendSmsToWa).A0H("send_sms_to_wa_fraud", "successful");
                C33841jT.A03(sendSmsToWa.A4b(), 4, true);
                AnonymousClass00H r02 = sendSmsToWa.A0Q;
                if (r02 != null) {
                    r02.get();
                    Intent className = C17880vN.A0A().setClassName(sendSmsToWa.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
                    className.putExtra("use_sms_retriever", true);
                    className.putExtra("request_code_method", str);
                    className.putExtra("request_code_status", 0);
                    className.putExtra("request_code_result", adn);
                    className.putExtra("code_verification_mode", 0);
                    sendSmsToWa.startActivity(className);
                    sendSmsToWa.finish();
                    return;
                }
                AnonymousClass3MW.A1F();
            }
            throw null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestCodeTask/method=");
        A10.append(this.A07);
        C17890vO.A19(A10, "/error/callback null");
    }

    public void A0F() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RequestCodeTaskonPreExecute/method=");
        C17890vO.A1A(A10, this.A07);
        this.A09.get();
    }
}
