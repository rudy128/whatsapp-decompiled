package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.8C5  reason: invalid class name */
public final class AnonymousClass8C5 extends BroadcastReceiver {
    public String A00;
    public final C19830z4 A01;
    public final Object A02;
    public final AnonymousClass19D A03;
    public final WeakReference A04;
    public volatile boolean A05;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Cso, X.BZ2] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.Cso, X.BZ2] */
    public void onReceive(Context context, Intent intent) {
        SharedPreferences.Editor putInt;
        String str;
        String str2;
        if (!this.A05) {
            synchronized (this.A02) {
                if (!this.A05) {
                    C02800Fk.A00(context);
                    this.A05 = true;
                }
            }
        }
        boolean A15 = C18070vi.A15(context, intent);
        if (C17890vO.A1S(intent, "com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
            Log.i("SMSRetrieverReceiver/onReceive/text/intent");
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A04.get();
            if (verifyPhoneNumber == null) {
                str = "SMSRetrieverReceiver/onReceive/activity is null";
            } else if (verifyPhoneNumber.Bed()) {
                str = "SMSRetrieverReceiver/onReceive/destroyed";
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str2 = "SMSRetrieverReceiver/onReceive/bundle-null";
                } else {
                    Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    if (status == null) {
                        str2 = "SMSRetrieverReceiver/onReceive/status-null";
                    } else {
                        int i = status.A00;
                        if (i == 0) {
                            String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                            if (string == null) {
                                A9B.A0U(this.A01, "null-sms-message");
                                return;
                            }
                            String A002 = AnonymousClass8C9.A00(new C183619Yy(verifyPhoneNumber.getString(2131899103)), string);
                            if (C20099A7c.A01(A002, -1) == -1 || A002 == null) {
                                Log.w("SMSRetrieverReceiver/onReceive/no-code");
                                A9B.A0U(this.A01, "server-send-mismatch-empty");
                            } else if (A002.equals(this.A00)) {
                                str = "SMSRetrieverReceiver/onReceive/success/same-code";
                            } else {
                                this.A00 = A002;
                                verifyPhoneNumber.A4l(A002);
                                if (C18020vd.A05(C18040vf.A02, this.A03, 11889)) {
                                    VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
                                    zzw A06 = new C26126Cso(verifyPhoneNumber, verifyPhoneNumber2, C28622EAu.A00, BZ2.A00, C25540Chd.A02).A06();
                                    AJM.A00(A06, B3N.A00, 7);
                                    A06.addOnFailureListener(new C26949DKi(A15));
                                }
                            }
                            putInt = C19830z4.A00(this.A01).putInt("sms_retriever_retry_count", A15 ? 1 : 0);
                        } else if (i == 15) {
                            C19830z4 r6 = this.A01;
                            int i2 = C17890vO.A0B(r6).getInt("sms_retriever_retry_count", A15);
                            if (i2 >= 2) {
                                if (!C18020vd.A05(C18040vf.A02, this.A03, 11889)) {
                                    A9B.A0U(r6, "timeout-waiting-for-sms");
                                    putInt = C19830z4.A00(r6).putInt("sms_retriever_retry_count", A15);
                                }
                            }
                            VerifyPhoneNumber verifyPhoneNumber3 = verifyPhoneNumber;
                            zzw A062 = new C26126Cso(verifyPhoneNumber, verifyPhoneNumber3, C28622EAu.A00, BZ2.A00, C25540Chd.A02).A06();
                            AJM.A00(A062, new B19(this, i2), 8);
                            AJI.A00(A062, this, 6);
                            return;
                        } else {
                            return;
                        }
                        putInt.apply();
                        return;
                    }
                }
                Log.e(str2);
                return;
            }
            Log.i(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8C5(C19830z4 r2, AnonymousClass19D r3, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        C18070vi.A0k(r3, r2);
        this.A03 = r3;
        this.A01 = r2;
        this.A04 = AnonymousClass3MW.A0z(verifyPhoneNumber);
    }

    public AnonymousClass8C5() {
        this.A05 = false;
        this.A02 = C17880vN.A0p();
    }
}
