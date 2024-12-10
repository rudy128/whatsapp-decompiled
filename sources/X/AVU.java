package X;

import android.net.Uri;
import android.util.Base64;
import com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URL;

public class AVU implements B8D {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AVU(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, X.9bF] */
    public final A88 CGA(C191779nA r8) {
        AUZ A002;
        A88 a88;
        AUZ A003;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C186009dV r4 = (C186009dV) obj;
            ? obj2 = new Object();
            C18070vi.A0d(r8, 0);
            String A0H = C18070vi.A0H(AnonymousClass99o.A01(r8, (AnonymousClass99o) this.A02).appendQueryParameter("auth", r8.A01).build());
            try {
                C24371Kb r5 = r4.A01;
                URL url = new URL(A0H);
                String str = r8.A07;
                r5.A00.A00();
                A003 = C24371Kb.A00(r5, str, "DELETE", (String) null, url);
                int responseCode = A003.A01.getResponseCode();
                obj2.A00 = responseCode;
                obj2.A01 = AnonymousClass000.A1T(responseCode, 200);
                A003.close();
            } catch (IOException e) {
                Log.e("Error while cancelling upload", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            if (obj2.A01) {
                return A88.A02(obj2);
            }
            return A88.A03(obj2, obj2.A00);
        }
        SendDeleteHistorySyncMmsJob sendDeleteHistorySyncMmsJob = (SendDeleteHistorySyncMmsJob) obj;
        C696237x r6 = (C696237x) this.A02;
        String str2 = sendDeleteHistorySyncMmsJob.directPath;
        String str3 = sendDeleteHistorySyncMmsJob.encHandle;
        String str4 = (String) C29431cG.A0b(C108965cb.A0v(str2, "\\?", C18070vi.A15(r8, str2) ? 1 : 0));
        Uri.Builder A022 = r6.A02(r8);
        String str5 = r6.A02;
        C17960vV.A07(str5);
        Uri.Builder appendQueryParameter = A022.appendQueryParameter("token", str5).appendQueryParameter("auth", r8.A01);
        if (str3 == null || str3.length() == 0) {
            appendQueryParameter.appendQueryParameter("d_md", AnonymousClass1EG.A0A(Base64.encodeToString(C108975cc.A1O(str4), 3)));
        } else {
            appendQueryParameter.appendQueryParameter("e_handle", str3);
        }
        String A0H2 = C18070vi.A0H(appendQueryParameter.build());
        try {
            C24371Kb r52 = sendDeleteHistorySyncMmsJob.A00;
            URL url2 = new URL(A0H2);
            String str6 = r8.A07;
            String str7 = sendDeleteHistorySyncMmsJob.companionMetaNonce;
            r52.A00.A00();
            A002 = C24371Kb.A00(r52, str6, "DELETE", str7, url2);
            int responseCode2 = A002.A01.getResponseCode();
            if (responseCode2 != 200) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("SendDeleteHistorySyncMmsJob/failed to send DELETE request chunkId=");
                A10.append(sendDeleteHistorySyncMmsJob.chunkId);
                C17900vP.A0i(" code=", A10, responseCode2);
                a88 = A88.A03(A002, responseCode2);
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("SendDeleteHistorySyncMmsJob/success chunkId=");
                C17890vO.A1A(A102, sendDeleteHistorySyncMmsJob.chunkId);
                a88 = A88.A02(A002);
            }
            A002.close();
            return a88;
        } catch (IOException e2) {
            Log.e("SendDeleteHistorySyncMmsJob/error while deleting blob", e2);
            return A88.A00((Object) null);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        throw th;
        throw th;
    }
}
