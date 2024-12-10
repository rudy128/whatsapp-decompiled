package com.whatsapp.push;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass3MY;
import X.AnonymousClass8EC;
import X.C000200d;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C17900vP;
import X.C18030ve;
import X.C181649Rh;
import X.C20099A7c;
import X.C25081Mu;
import X.C31221fD;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class RegistrationIntentService extends AnonymousClass8EC implements AnonymousClass009 {
    public AnonymousClass190 A00;
    public AnonymousClass11P A01;
    public C18030ve A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public boolean A0D;
    public C181649Rh A0E;
    public final Object A0F;
    public volatile C008203r A0G;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9Rh, java.lang.Object] */
    public static synchronized void A04(RegistrationIntentService registrationIntentService) {
        synchronized (registrationIntentService) {
            if (registrationIntentService.A0E == null) {
                registrationIntentService.A0E = new Object();
            }
        }
    }

    public static void A01(Context context, C25081Mu r5) {
        Log.i("GCM: refreshing gcm token");
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        r5.A01(context, new Intent("com.whatsapp.action.REFRESH", (Uri) null, context, cls), cls, 4);
    }

    public static void A02(Context context, C25081Mu r7) {
        Log.i("GCM: force updating push config");
        A03(context, r7, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final Object generatedComponent() {
        if (this.A0G == null) {
            synchronized (this.A0F) {
                if (this.A0G == null) {
                    this.A0G = new C008203r(this);
                }
            }
        }
        return this.A0G.generatedComponent();
    }

    public void onCreate() {
        if (!this.A0D) {
            this.A0D = true;
            C31221fD r1 = (C31221fD) ((C008503u) generatedComponent());
            AnonymousClass10E r3 = r1.A07;
            this.A01 = AnonymousClass10E.A6O(r3);
            this.A02 = AnonymousClass10E.A8r(r3);
            this.A00 = AnonymousClass3MY.A0N(r3);
            this.A0C = C000200d.A00(r3.AC1);
            AnonymousClass10G r2 = r3.A00;
            this.A05 = C000200d.A00(r2.ABU);
            this.A0A = C000200d.A00(r3.AAp);
            this.A08 = C000200d.A00(r3.AfP);
            this.A0B = C000200d.A00(r3.ABl);
            this.A07 = C000200d.A00(r2.AFt);
            this.A04 = C000200d.A00(r2.A81);
            this.A09 = C000200d.A00(r3.A9V);
            this.A03 = C000200d.A00(r2.A5Z);
            this.A06 = C000200d.A00(r1.A05);
        }
        super.onCreate();
    }

    public RegistrationIntentService(int i) {
        this.A0F = C17880vN.A0p();
        this.A0D = false;
    }

    public static void A03(Context context, C25081Mu r5, String str, String str2, String str3, String str4, String str5, String str6) {
        C17900vP.A0f("GCM: verifying registration; serverRegistrationId=", str, AnonymousClass000.A10());
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        Intent intent = new Intent("com.whatsapp.action.VERIFY", (Uri) null, context, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("mutedChatsHash", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("appMuteConfig", str3);
        }
        intent.putExtra("numberOfAccountsFromServer", C20099A7c.A01(str4, 1));
        if (!TextUtils.isEmpty(str5)) {
            intent.putExtra("pKeyHash", str5);
        }
        intent.putExtra("voipPayloadType", C20099A7c.A01(str6, 0));
        r5.A01(context, intent, cls, 4);
    }

    public static void A05(RegistrationIntentService registrationIntentService, SecurityException securityException) {
        if (securityException.getMessage() == null || (!securityException.getMessage().contains("com.google.android.c2dm.permission.RECEIVE") && !securityException.getMessage().contains("process is bad"))) {
            throw securityException;
        }
        Log.e("GCM: security exception caught; switching to long-connect", securityException);
        C17880vN.A0K(registrationIntentService.A0B).A0x();
    }

    public RegistrationIntentService() {
        this(0);
    }
}
