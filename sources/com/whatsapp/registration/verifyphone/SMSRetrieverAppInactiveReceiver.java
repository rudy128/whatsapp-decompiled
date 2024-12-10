package com.whatsapp.registration.verifyphone;

import X.AJI;
import X.AJM;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1CM;
import X.AnonymousClass1FR;
import X.AnonymousClass1KB;
import X.AnonymousClass8C9;
import X.B18;
import X.BZ2;
import X.C000100c;
import X.C02800Fk;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C183619Yy;
import X.C19830z4;
import X.C20099A7c;
import X.C25540Chd;
import X.C26126Cso;
import X.C28622EAu;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;

public final class SMSRetrieverAppInactiveReceiver extends BroadcastReceiver {
    public AnonymousClass1KB A00;
    public C19830z4 A01;
    public AnonymousClass19D A02;
    public AnonymousClass1CM A03;
    public final Object A04;
    public volatile boolean A05;

    /* JADX WARNING: type inference failed for: r0v35, types: [X.Cso, X.BZ2] */
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10G.AVt(((AnonymousClass10E) ((C000100c) C02800Fk.A00(context))).Ao8.A00, this);
                    this.A05 = true;
                }
            }
        }
        if (context != null && intent != null && C17890vO.A1S(intent, "com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
            Log.i("SMSRetrieverAppInactiveReceiver/onReceive");
            AnonymousClass1CM r0 = this.A03;
            if (r0 != null) {
                if (r0.A04()) {
                    str3 = "SMSRetrieverAppInactiveReceiver/onReceive/registration verified";
                } else {
                    AnonymousClass19D r1 = this.A02;
                    if (r1 != null) {
                        C18040vf r3 = C18040vf.A02;
                        if (!C18020vd.A05(r3, r1, 11186)) {
                            str3 = "SMSRetrieverAppInactiveReceiver/onReceive/abprop disabled";
                        } else {
                            AnonymousClass1KB r02 = this.A00;
                            if (r02 != null) {
                                AnonymousClass1FR r03 = r02.A00;
                                if (r03 == null || r03.Bed()) {
                                    Log.i("SMSRetrieverAppInactiveReceiver/onReceive/continue as app is killed");
                                    Bundle extras = intent.getExtras();
                                    if (extras == null) {
                                        str2 = "SMSRetrieverAppInactiveReceiver/onReceive/bundle null";
                                    } else {
                                        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                                        if (status == null) {
                                            str2 = "SMSRetrieverAppInactiveReceiver/onReceive/status null";
                                        } else {
                                            int i = status.A00;
                                            if (i == 0) {
                                                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                                if (string == null) {
                                                    str2 = "SMSRetrieverAppInactiveReceiver/onReceive/message null";
                                                } else {
                                                    String A002 = AnonymousClass8C9.A00(new C183619Yy(context.getString(2131899103)), string);
                                                    if (C20099A7c.A01(A002, -1) != -1) {
                                                        C19830z4 r04 = this.A01;
                                                        if (r04 != null) {
                                                            r04.A1h(A002);
                                                            Log.i("SMSRetrieverAppInactiveReceiver/onReceive/saved OTP code successfully");
                                                        }
                                                    } else {
                                                        Log.w("SMSRetrieverAppInactiveReceiver/onReceive/no OTP code");
                                                    }
                                                    C19830z4 r05 = this.A01;
                                                    if (r05 != null) {
                                                        C17880vN.A1C(C19830z4.A00(r05), "sms_retriever_app_inactive_retry_count", 0);
                                                        return;
                                                    }
                                                }
                                            } else if (i == 15) {
                                                C19830z4 r06 = this.A01;
                                                if (r06 != null) {
                                                    int A003 = C17890vO.A00(C17890vO.A0B(r06), "sms_retriever_app_inactive_retry_count");
                                                    AnonymousClass19D r12 = this.A02;
                                                    if (r12 != null) {
                                                        if (A003 < C18020vd.A00(r3, r12, 11959)) {
                                                            zzw A06 = new C26126Cso(context, C28622EAu.A00, BZ2.A00, C25540Chd.A02).A06();
                                                            AJM.A00(A06, new B18(this, A003), 6);
                                                            AJI.A00(A06, this, 5);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                            str = "waSharedPreferences";
                                        }
                                    }
                                    Log.e(str2);
                                    return;
                                }
                                str3 = "SMSRetrieverAppInactiveReceiver/onReceive/exiting as app is active";
                            } else {
                                str = "globalUI";
                            }
                        }
                    }
                    str = "abPreChatdProps";
                }
                Log.i(str3);
                return;
            }
            str = "registrationStateManager";
            C18070vi.A11(str);
            throw null;
        }
    }

    public SMSRetrieverAppInactiveReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public SMSRetrieverAppInactiveReceiver() {
        this(0);
    }
}
