package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6MO  reason: invalid class name */
public class AnonymousClass6MO extends A34 {
    public long A00;
    public ProgressDialog A01;
    public C35541mP A02;
    public String A03;
    public String A04;
    public final AnonymousClass181 A05;
    public final C23501Gn A06 = new C143707Em(this, 3);
    public final AnonymousClass1NM A07;
    public final C19830z4 A08;
    public final C18000vb A09;
    public final AnonymousClass11Z A0A;
    public final AnonymousClass770 A0B;
    public final AnonymousClass895 A0C;
    public final AnonymousClass1EC A0D;
    public final AnonymousClass129 A0E;
    public final C35551mQ A0F;
    public final AnonymousClass1K3 A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final WeakReference A0K;
    public final List A0L;
    public final Uri[] A0M;
    public final AnonymousClass1MB A0N;
    public final C133186oJ A0O;

    public void A0F() {
        Context A0F2 = C108945cZ.A0F(this.A0K);
        if (A0F2 != null) {
            if (this.A01 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0F2);
                this.A01 = progressDialog;
                progressDialog.setOnCancelListener(new C1411674o(this, 6));
                this.A01.setCancelable(false);
            }
            if (!this.A01.isShowing()) {
                ProgressDialog progressDialog2 = this.A01;
                int i = 2131895533;
                if (this.A0N.A00()) {
                    i = 2131888873;
                }
                progressDialog2.setMessage(A0F2.getString(i));
                this.A01.setIndeterminate(true);
                this.A01.show();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        BufferedOutputStream bufferedOutputStream;
        BufferedReader bufferedReader;
        C130676jp r16;
        JSONArray jSONArray;
        int length;
        Context A0F2 = C108945cZ.A0F(this.A0K);
        if (A0F2 != null) {
            AnonymousClass11Z r3 = this.A0A;
            long A022 = r3.A02();
            this.A04 = Environment.getExternalStorageState();
            if (this.A07.A03(this.A06)) {
                this.A00 = r3.A01();
            }
            Pair A002 = this.A02.A00();
            C35551mQ r6 = this.A0F;
            String str2 = this.A0H;
            String str3 = this.A0J;
            long j = this.A00;
            String str4 = this.A04;
            List list = this.A0L;
            String A042 = r6.A04(A0F2, A002, this.A0D, str2, str3, (String) null, str4, (String) null, list, AnonymousClass6WX.A00(this.A0B), (JSONObject) null, j, A022, true, true, true);
            this.A03 = A042;
            C17900vP.A0f("searchSupportTask/doInBackground/debugInfo: ", A042, AnonymousClass000.A10());
            try {
                Uri.Builder A023 = this.A0E.A02();
                A023.appendPath("client_search.php");
                A023.appendQueryParameter("platform", "android");
                C18000vb r5 = this.A09;
                A023.appendQueryParameter("lg", r5.A05());
                A023.appendQueryParameter("lc", r5.A04());
                if (this.A0G.A04()) {
                    str = "1";
                } else {
                    str = "0";
                }
                A023.appendQueryParameter("eea", str);
                String str5 = this.A0I;
                A023.appendQueryParameter("query", str5);
                A023.appendQueryParameter("manufacturer", Build.MANUFACTURER);
                A023.appendQueryParameter("os_version", Build.VERSION.RELEASE);
                A023.appendQueryParameter("ccode", this.A08.A0l());
                A023.appendQueryParameter("app_version", "2.24.24.78");
                A023.appendQueryParameter((String) A002.first, (String) A002.second);
                URLConnection openConnection = new URL(A023.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                String A0Q = C17890vO.A0Q();
                httpURLConnection.setRequestProperty("Content-Type", AnonymousClass001.A1H("multipart/form-data; boundary=", A0Q, AnonymousClass000.A10()));
                AnonymousClass181 r52 = this.A05;
                try {
                    bufferedOutputStream = new BufferedOutputStream(new C179259He(r52, httpURLConnection.getOutputStream(), (Integer) null, 20));
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("--");
                    A10.append(A0Q);
                    bufferedOutputStream.write(AnonymousClass000.A0y("\r\n", A10).getBytes());
                    bufferedOutputStream.write("Content-Disposition: form-data; name=\"debug_info\"\r\n\r\n".getBytes());
                    bufferedOutputStream.write(this.A03.getBytes());
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("\r\n--");
                    A102.append(A0Q);
                    bufferedOutputStream.write(AnonymousClass000.A0y("--\r\n", A102).getBytes());
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    C179229Hb r8 = new C179229Hb(r52, httpURLConnection.getInputStream(), (Integer) null, 20);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(r8));
                        StringBuilder A103 = AnonymousClass000.A10();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            A103.append(readLine);
                        }
                        String obj = A103.toString();
                        if (TextUtils.isEmpty(obj) || (length = jSONArray.length()) == 0) {
                            r16 = null;
                        } else {
                            ArrayList A0z = C17880vN.A0z(length);
                            ArrayList A0z2 = C17880vN.A0z(length);
                            ArrayList A0z3 = C17880vN.A0z(length);
                            ArrayList A0z4 = C17880vN.A0z(length);
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject = (jSONArray = new JSONArray(obj)).optJSONObject(i);
                                A0z.add(optJSONObject.getString("title"));
                                A0z2.add(optJSONObject.getString("description"));
                                A0z3.add(optJSONObject.getString("url"));
                                A0z4.add(optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                            }
                            ArrayList A13 = AnonymousClass000.A13();
                            for (Uri uri : this.A0M) {
                                if (uri != null) {
                                    A13.add(uri);
                                }
                            }
                            r16 = new C130676jp(str5, this.A03, A0z, A0z2, A0z3, A0z4, A13, list, length);
                        }
                        bufferedReader.close();
                        r8.close();
                        return r16;
                    } catch (Throwable th) {
                        r8.close();
                        throw th;
                    }
                } catch (IOException | JSONException e) {
                    e = e;
                    Log.e(AnonymousClass001.A1E(e, "searchSupportTask/doInBackground/error: ", AnonymousClass000.A10()), e);
                    return null;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            } catch (IOException | JSONException e2) {
                e = e2;
                Log.e(AnonymousClass001.A1E(e, "searchSupportTask/doInBackground/error: ", AnonymousClass000.A10()), e);
                return null;
            }
        }
        return null;
        throw th;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C130676jp r4 = (C130676jp) obj;
        if (this.A0K.get() != null) {
            if (r4 != null) {
                try {
                    int i = r4.A00;
                    C17900vP.A0j("searchSupportTask/onPostExecute/result/count: ", AnonymousClass000.A10(), i);
                    if (i > 0) {
                        AnonymousClass895 r0 = this.A0C;
                        if (r0 != null) {
                            r0.C4m(r4);
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A01.cancel();
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    Log.e(AnonymousClass001.A1E(e, "searchSupportTask/onPostExecute/error: ", AnonymousClass000.A10()), e);
                }
            }
            AnonymousClass895 r02 = this.A0C;
            if (r02 != null) {
                r02.BsZ();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.A01.cancel();
            }
        }
    }

    public AnonymousClass6MO(AnonymousClass1FU r3, AnonymousClass181 r4, AnonymousClass1NM r5, C19830z4 r6, C18000vb r7, AnonymousClass11Z r8, AnonymousClass770 r9, AnonymousClass1MB r10, C35541mP r11, AnonymousClass895 r12, AnonymousClass1EC r13, C133186oJ r14, AnonymousClass129 r15, C35551mQ r16, AnonymousClass1K3 r17, String str, String str2, String str3, List list, Uri[] uriArr) {
        this.A0K = AnonymousClass3MW.A0z(r3);
        this.A05 = r4;
        this.A0G = r17;
        this.A0A = r8;
        this.A0E = r15;
        this.A09 = r7;
        this.A0F = r16;
        this.A07 = r5;
        this.A0N = r10;
        this.A08 = r6;
        this.A0O = r14;
        this.A0C = r12;
        this.A0H = str;
        this.A0J = str2;
        this.A0L = list;
        this.A0I = str3;
        this.A0M = uriArr;
        this.A0B = r9;
        this.A0D = r13;
        this.A02 = r11;
    }
}
