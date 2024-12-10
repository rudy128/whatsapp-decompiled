package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.5z3  reason: invalid class name and case insensitive filesystem */
public class C117005z3 extends C196279uk {
    public final AnonymousClass11S A00;
    public final C19830z4 A01;
    public final C18000vb A02;
    public final AnonymousClass1QQ A03;
    public final AnonymousClass1KG A04;
    public final AnonymousClass10I A05;

    public /* bridge */ /* synthetic */ boolean A08() {
        return !TextUtils.isEmpty(C17890vO.A0B(this.A01).getString("payment_background_store_etag", (String) null));
    }

    public boolean A0A(String str, Map map, byte[] bArr) {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C117005z3(X.AnonymousClass11S r9, X.AnonymousClass181 r10, X.AnonymousClass118 r11, X.C19830z4 r12, X.C18000vb r13, X.AnonymousClass1QQ r14, X.AnonymousClass1D9 r15, X.AnonymousClass1KG r16, X.C220418j r17, X.AnonymousClass10I r18) {
        /*
            r8 = this;
            r0 = 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A05 = r6
            r8.A00 = r9
            r8.A02 = r13
            r8.A01 = r12
            r8.A03 = r14
            r0 = r16
            r8.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117005z3.<init>(X.11S, X.181, X.118, X.0z4, X.0vb, X.1QQ, X.1D9, X.1KG, X.18j, X.10I):void");
    }

    public /* bridge */ /* synthetic */ String A06() {
        return C17880vN.A0r(C17890vO.A0B(this.A01), "payment_background_store_etag");
    }

    public /* bridge */ /* synthetic */ void A07(String str) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor A002 = C19830z4.A00(this.A01);
        if (str == null) {
            putString = A002.remove("payment_background_store_etag");
        } else {
            putString = A002.putString("payment_background_store_etag", str);
        }
        putString.apply();
    }

    public /* bridge */ /* synthetic */ boolean A09(InputStream inputStream, Object obj) {
        String str;
        JsonReader A0E;
        C41851xA BD0;
        JsonReader A0E2;
        C127586eb r15 = (C127586eb) obj;
        if (r15 == null || TextUtils.isEmpty(r15.A01)) {
            ArrayList A13 = AnonymousClass000.A13();
            try {
                A0E = C108985cd.A0E(inputStream);
                A0E.beginArray();
                while (A0E.hasNext()) {
                    AEX A002 = A00(A0E);
                    if (A002 != null) {
                        A13.add(A002);
                    }
                }
                A0E.endArray();
                A0E.close();
                AnonymousClass1QQ r8 = this.A03;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/size=");
                C17900vP.A0o(A10, A13.size());
                C28791au A052 = r8.A00.A05();
                try {
                    BD0 = A052.BD0();
                    C23141Ev r6 = ((C28801av) A052).A02;
                    C17900vP.A0j("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/background order rows deleted: ", AnonymousClass000.A10(), r6.A04("payment_background_order", (String) null, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/DELETE_ALL_BACKGROUND_ORDERS", (String[]) null));
                    for (int i = 0; i < A13.size(); i++) {
                        AEX aex = (AEX) A13.get(i);
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("background_id", aex.A0F);
                        C17880vN.A18(contentValues, "background_order", i);
                        if (r6.A09("payment_background_order", "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_ORDER", contentValues, 5) == -1) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("PAY: PaymentBackgroundStore/updatePaymentBackgroundsForPicker/insert background order failed for id: ");
                            C17890vO.A19(A102, aex.A0F);
                        }
                        AnonymousClass1QQ.A02(A052, aex, r8, "payments/UPDATE_BACKGROUNDS_FOR_PICKER/INSERT_PAYMENT_BACKGROUND");
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        A052.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            } catch (IOException e) {
                e = e;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response/failed";
                Log.e(str, e);
                return false;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th, th3);
            }
        } else {
            try {
                A0E2 = C108985cd.A0E(inputStream);
                AEX A003 = A00(A0E2);
                A0E2.close();
                if (A003 == null) {
                    return false;
                }
                this.A03.A04(A003);
                return true;
            } catch (IOException e2) {
                e = e2;
                str = "PAY: PaymentBackgroundMetadataNetworkClient/handle-network-response-for-background/failed";
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th, th4);
            }
        }
        throw th;
        throw th;
        throw th;
    }

    public void A0B(BCV bcv, String str) {
        String A042;
        String A0y;
        String str2;
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        Me me = r0.A00;
        if (me != null) {
            A042 = C108965cb.A0p(me);
        } else {
            A042 = this.A02.A04();
        }
        C127586eb r3 = new C127586eb(str, A042);
        if (TextUtils.isEmpty("")) {
            A0y = null;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("https://www.");
            A10.append("");
            A0y = AnonymousClass000.A0y(".facebook.com/cdn/cacheable/whatsapp", A10);
        }
        if (!TextUtils.isEmpty(A0y)) {
            str2 = AnonymousClass000.A0y("/payments/background", AnonymousClass000.A11(A0y));
        } else {
            str2 = "https://static.whatsapp.net/payments/background";
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        String str3 = r3.A01;
        if (!TextUtils.isEmpty(str3)) {
            buildUpon.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
        } else {
            buildUpon.appendQueryParameter("country", r3.A00);
        }
        super.A04(bcv, r3, buildUpon.toString(), (Map) null);
    }

    public static AEX A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1724546052:
                    if (!nextName.equals("description")) {
                        break;
                    } else {
                        str4 = jsonReader.nextString();
                        break;
                    }
                case -1391167122:
                    if (!nextName.equals("mimetype")) {
                        break;
                    } else {
                        str2 = jsonReader.nextString();
                        break;
                    }
                case -1362486862:
                    if (!nextName.equals("file-size")) {
                        break;
                    } else {
                        j = jsonReader.nextLong();
                        break;
                    }
                case -1221029593:
                    if (!nextName.equals("height")) {
                        break;
                    } else {
                        i2 = jsonReader.nextInt();
                        break;
                    }
                case -718200573:
                    if (!nextName.equals("subtext-color")) {
                        break;
                    } else {
                        i5 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case -342731470:
                    if (!nextName.equals("fullsize-url")) {
                        break;
                    } else {
                        str3 = jsonReader.nextString();
                        break;
                    }
                case 3355:
                    if (!nextName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        break;
                    } else {
                        str = jsonReader.nextString();
                        break;
                    }
                case 113126854:
                    if (!nextName.equals("width")) {
                        break;
                    } else {
                        i = jsonReader.nextInt();
                        break;
                    }
                case 748171971:
                    if (!nextName.equals("text-color")) {
                        break;
                    } else {
                        i4 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case 2018420361:
                    if (!nextName.equals("placeholder-color")) {
                        break;
                    } else {
                        i3 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (str == null || j == 0 || ((long) i) == 0 || ((long) i2) == 0 || str2 == null || str3 == null || i3 == 0 || i4 == 0 || i5 == 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: PaymentBackgroundMetadataNetworkClient/parseMetadata/missing field/id=");
            A10.append(str);
            A10.append(", fileSize=");
            A10.append(j);
            A10.append(", width=");
            A10.append(i);
            A10.append(", height=");
            A10.append(i2);
            A10.append(", mimetype=");
            A10.append(str2);
            A10.append(", fullsizeUrl=");
            A10.append(str3);
            A10.append(", placeholderColor=");
            A10.append(i3);
            A10.append(", textColor=");
            A10.append(i4);
            C17900vP.A0i(", subtextColor=", A10, i5);
            return null;
        }
        return new AEX(str, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (byte[]) null, i, i2, i3, i4, i5, j, 0, false);
    }
}
