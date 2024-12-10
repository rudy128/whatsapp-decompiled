package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1QQ  reason: invalid class name */
public class AnonymousClass1QQ {
    public final AnonymousClass1Cd A00;
    public final C18030ve A01;

    private AEX A00(Cursor cursor, String str) {
        Cursor cursor2 = cursor;
        String str2 = str;
        if (str == null) {
            str2 = cursor2.getString(cursor2.getColumnIndexOrThrow("background_id"));
        }
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("file_size"));
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
        AEX aex = new AEX(str2, cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type")), cursor2.getString(cursor2.getColumnIndexOrThrow("fullsize_url")), cursor2.getString(cursor2.getColumnIndexOrThrow("description")), cursor2.getString(cursor2.getColumnIndexOrThrow("lg")), (String) null, (String) null, (String) null, (byte[]) null, i, i2, cursor2.getInt(cursor2.getColumnIndexOrThrow("placeholder_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("text_color")), cursor2.getInt(cursor2.getColumnIndexOrThrow("subtext_color")), j, 0, false);
        C18030ve r9 = this.A01;
        C18040vf r7 = C18040vf.A02;
        if (C18020vd.A05(r7, r9, 1084)) {
            byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("media_key"));
            long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("media_key_timestamp"));
            String string = cursor2.getString(cursor2.getColumnIndexOrThrow("file_sha256"));
            String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("file_enc_sha256"));
            String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("direct_path"));
            boolean A05 = C18020vd.A05(r7, r9, 1084);
            aex.A08 = blob;
            aex.A00 = j2;
            aex.A04 = string;
            aex.A03 = string2;
            aex.A02 = string3;
            aex.A07 = A05;
        }
        return aex;
    }

    public static ArrayList A01(AnonymousClass1QQ r5, String str, String str2) {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        C28781at A04 = r5.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A(str, str2, (String[]) null);
            while (A0A.moveToNext()) {
                arrayList.add(r5.A00(A0A, (String) null));
            }
            A0A.close();
            A04.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A02(C28791au r8, AEX aex, AnonymousClass1QQ r10, String str) {
        byte[] bArr;
        long j;
        String str2;
        String str3;
        int i;
        String str4 = aex.A05;
        boolean z = !TextUtils.isEmpty(str4);
        boolean A05 = C18020vd.A05(C18040vf.A02, r10.A01, 1084);
        ContentValues contentValues = new ContentValues(15);
        String str5 = aex.A0F;
        contentValues.put("background_id", str5);
        contentValues.put("file_size", Long.valueOf(aex.A0E));
        contentValues.put("width", Integer.valueOf(aex.A0D));
        contentValues.put("height", Integer.valueOf(aex.A09));
        contentValues.put("mime_type", aex.A0G);
        contentValues.put("placeholder_color", Integer.valueOf(aex.A0A));
        contentValues.put("text_color", Integer.valueOf(aex.A0C));
        contentValues.put("subtext_color", Integer.valueOf(aex.A0B));
        String str6 = null;
        if (A05) {
            bArr = aex.A08;
        } else {
            bArr = null;
        }
        C63432t4.A03(contentValues, "media_key", bArr);
        if (A05) {
            j = aex.A00;
        } else {
            j = 0;
        }
        contentValues.put("media_key_timestamp", Long.valueOf(j));
        if (A05) {
            str2 = aex.A04;
        } else {
            str2 = null;
        }
        C63432t4.A01(contentValues, "file_sha256", str2);
        if (A05) {
            str3 = aex.A03;
        } else {
            str3 = null;
        }
        C63432t4.A01(contentValues, "file_enc_sha256", str3);
        if (A05) {
            str6 = aex.A02;
        }
        C63432t4.A01(contentValues, "direct_path", str6);
        if (z) {
            contentValues.put("fullsize_url", str4);
            C63432t4.A01(contentValues, "description", aex.A01);
            C63432t4.A01(contentValues, "lg", aex.A06);
            i = 5;
        } else {
            i = 4;
        }
        if (((C28801av) r8).A02.A09("payment_background", str, contentValues, i) == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/shouldReplace: ");
            sb.append(z);
            sb.append(", failed for id: ");
            sb.append(str5);
            Log.e(sb.toString());
        }
    }

    public AEX A03(String str) {
        Cursor A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentBackgroundStore/getPaymentBackgroundById/id=");
        sb.append(str);
        Log.i(sb.toString());
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background WHERE background_id =?", "payments/QUERY_PAYMENT_BACKGROUND_BY_ID", new String[]{str});
            if (A0A.moveToNext()) {
                AEX A002 = A00(A0A, str);
                A0A.close();
                A04.close();
                return A002;
            }
            A0A.close();
            A04.close();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: PaymentBackgroundStore/getPaymentBackgroundById/no background found for id=");
            sb2.append(str);
            Log.i(sb2.toString());
            return null;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A04(AEX aex) {
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/id=");
        sb.append(aex.A0F);
        Log.i(sb.toString());
        C28791au A05 = this.A00.A05();
        try {
            A02(A05, aex, this, "payments/INSERT_PAYMENT_BACKGROUND");
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1QQ(AnonymousClass1Cd r1, C18030ve r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
