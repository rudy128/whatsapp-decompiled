package com.whatsapp.registration.verifyphone.repository;

import X.A6P;
import X.AUZ;
import X.AnonymousClass000;
import X.AnonymousClass19D;
import X.AnonymousClass1D9;
import X.AnonymousClass1EY;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C188139gw;
import X.C197569wu;
import X.C19830z4;
import X.C220418j;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.net.Network;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.registration.verifyphone.repository.VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2", f = "VerifySilentAuthRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Network $network;
    public final /* synthetic */ String $screenType;
    public int label;
    public final /* synthetic */ C188139gw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2(Network network, C188139gw r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$network = network;
        this.$screenType = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2(this.$network, this.this$0, this.$screenType, r6);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        AUZ auz;
        String str2;
        TelephonyManager A0K;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.i("SilentAuthRepository/executeSilentAuthCoverageRequest");
            C188139gw r6 = this.this$0;
            AnonymousClass19D r2 = r6.A03;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 6386)) {
                str = C197569wu.A0U;
                C18070vi.A0Z(str);
            } else {
                String str3 = "";
                if (!C18020vd.A05(r1, r2, 6655) || (A0K = r6.A01.A0K()) == null) {
                    str2 = str3;
                } else {
                    A6P A00 = A6P.A00(A0K.getSimOperator());
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("&mcc=");
                    A10.append(A00.A00);
                    A10.append("&mnc=");
                    str2 = AnonymousClass000.A0y(A00.A01, A10);
                }
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(C197569wu.A0T);
                A102.append("&phone=");
                C19830z4 r12 = r6.A02;
                A102.append(r12.A0l());
                A102.append(r12.A0n());
                if (str2.length() != 0) {
                    str3 = str2;
                }
                str = AnonymousClass000.A0y(str3, A102);
            }
            try {
                if (this.$network == null) {
                    Log.i("SilentAuthRepository/executeSilentAuthCoverageRequest/already on cellular");
                    auz = this.this$0.A04.A07((C220418j) null, str, (String) null);
                } else {
                    Log.i("SilentAuthRepository/executeSilentAuthCoverageRequest/attempt request on cellular");
                    AnonymousClass1D9 r22 = this.this$0.A04;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) this.$network.openConnection(new URL(str));
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                    AnonymousClass1D9.A04(r22, httpURLConnection);
                    httpURLConnection.connect();
                    auz = new AUZ((Boolean) null, httpURLConnection);
                }
                C18070vi.A0b(auz);
                HttpURLConnection httpURLConnection2 = auz.A01;
                if (httpURLConnection2.getResponseCode() == 200) {
                    try {
                        JSONObject A01 = AnonymousClass1EY.A01(auz.BMP(this.this$0.A00, (Integer) null, AnonymousClass3MW.A0v(10)));
                        if (A01 == null || !A01.optBoolean("available")) {
                            Log.i("SilentAuthRepository/executeSilentAuthCoverageRequest/not available");
                            this.this$0.A02.A1g("silent_auth_unavailable");
                            this.this$0.A05.A0K(this.$screenType, "ipification_coverage_false", (String) null);
                        } else {
                            Log.i("SilentAuthRepository/executeSilentAuthCoverageRequest/available");
                            this.this$0.A02.A1g("silent_auth_available");
                            this.this$0.A05.A0K(this.$screenType, "ipification_coverage_true", (String) null);
                            return true;
                        }
                    } catch (JSONException e) {
                        this.this$0.A02.A1g("silent_auth_failed");
                        C17900vP.A0X(e, "SilentAuthRepository/executeSilentAuthCoverageRequest/getJSONFromStream/JSONException: ", AnonymousClass000.A10());
                    }
                } else {
                    this.this$0.A02.A1g("silent_auth_failed");
                    this.this$0.A05.A0K(this.$screenType, "ipification_coverage_failure", "http_response_failure");
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("SilentAuthRepository/executeSilentAuthCoverageRequest/returned code: ");
                    A103.append(httpURLConnection2.getResponseCode());
                    C17890vO.A0w(A103);
                }
            } catch (IOException e2) {
                C17900vP.A0X(e2, "SilentAuthRepository/executeSilentAuthCoverageRequest/IOException : ", AnonymousClass000.A10());
                this.this$0.A02.A1g("silent_auth_failed");
            }
            return AnonymousClass000.A0h();
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VerifySilentAuthRepository$executeSilentAuthCoverageRequest$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
