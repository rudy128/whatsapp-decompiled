package X;

import android.app.ProgressDialog;
import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.6MI  reason: invalid class name */
public class AnonymousClass6MI extends A34 {
    public ProgressDialog A00;
    public AnonymousClass1LU A01;
    public final AnonymousClass181 A02;
    public final C134036pu A03;
    public final AnonymousClass1D9 A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public AnonymousClass6MI(AnonymousClass1FU r2, AnonymousClass181 r3, C134036pu r4, AnonymousClass1D9 r5, AnonymousClass1LU r6, String str, String str2) {
        super(r2, true);
        this.A07 = AnonymousClass3MW.A0z(r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = r6;
    }

    public void A0F() {
        Context A0F = C108945cZ.A0F(this.A07);
        if (A0F != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(A0F);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new C1411674o(this, 13));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(A0F.getString(2131891192));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        InputStreamReader inputStreamReader;
        try {
            try {
                AUZ A08 = this.A04.A08(20, this.A06);
                try {
                    inputStreamReader = new InputStreamReader(A08.BMP(this.A02, (Integer) null, 20));
                    char[] cArr = new char[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
                    int read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                    StringBuilder A10 = AnonymousClass000.A10();
                    int i = 0;
                    while (read != -1) {
                        i += read;
                        if (i <= 65536) {
                            A10.append(cArr, 0, read);
                            read = inputStreamReader.read(cArr, 0, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                        } else {
                            throw C17880vN.A0f("The response from server is too big.");
                        }
                    }
                    JSONObject A16 = C17880vN.A16(A10.toString());
                    String optString = A16.optString("title");
                    A16.optString("platform");
                    A16.optString("lang");
                    C129856iU r5 = new C129856iU(optString, A16.optString("url"), A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), A16.optString("description"), A16.optBoolean("open_flow", true));
                    inputStreamReader.close();
                    A08.close();
                    return r5;
                } catch (Throwable th) {
                    A08.close();
                    throw th;
                }
                throw th;
            } catch (Exception e) {
                Log.e("http/get-help/httperror", e);
                return null;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        } catch (Exception e2) {
            Log.e("Could not fetch help response", e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r10) {
        /*
            r9 = this;
            X.6iU r10 = (X.C129856iU) r10
            if (r10 == 0) goto L_0x0062
            java.lang.String r8 = r10.A02
            if (r8 == 0) goto L_0x0062
            java.lang.String r7 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0062
            java.lang.String r6 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = r10.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0062
            java.lang.ref.WeakReference r0 = r9.A07
            X.1FU r5 = X.C108945cZ.A0Z(r0)
            if (r5 == 0) goto L_0x0052
            r4 = 0
            boolean r3 = r10.A04
            java.lang.String r2 = r9.A05
            android.content.Intent r1 = X.C109005cf.A08(r5, r8, r1, r7)
            java.lang.String r0 = "article_id"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "show_contact_support_button"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "contact_us_context"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "describe_problem_fields"
            r1.putExtra(r0, r4)
            r0 = 0
            r5.A3q(r1, r0)
            r1 = 2130772058(0x7f01005a, float:1.7147224E38)
            r0 = 2130772061(0x7f01005d, float:1.714723E38)
            r5.overridePendingTransition(r1, r0)
        L_0x0052:
            android.app.ProgressDialog r0 = r9.A00
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0061
            android.app.ProgressDialog r0 = r9.A00
            r0.cancel()
        L_0x0061:
            return
        L_0x0062:
            java.lang.ref.WeakReference r0 = r9.A07
            X.1FU r4 = X.C108945cZ.A0Z(r0)
            if (r4 == 0) goto L_0x0052
            X.6pu r3 = r9.A03
            java.lang.String r2 = r9.A05
            r1 = 0
            r0 = 0
            r3.A00(r0, r4, r2, r1)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MI.A0H(java.lang.Object):void");
    }
}
