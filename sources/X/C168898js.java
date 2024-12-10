package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.8js  reason: invalid class name and case insensitive filesystem */
public class C168898js extends C65802x8 {
    public final C188159gy A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r21, C25681CkC ckC, String str) {
        Intent intent;
        Bundle extras;
        C23736Boh boh = (C23736Boh) ckC;
        String str2 = str;
        C199029zJ r2 = r21;
        if (str2.equals("wa.action.commerce.SendNFMReplyMessage")) {
            List list = r2.A00;
            String A0w = C17880vN.A0w(list, 0);
            String A0w2 = C17880vN.A0w(list, 1);
            Map A16 = AnonymousClass8BR.A16(list, 2);
            C188159gy r15 = this.A00;
            Activity A05 = ALS.A05(boh);
            if (!(A05 == null || (intent = A05.getIntent()) == null || (extras = intent.getExtras()) == null)) {
                String string = extras.getString("chat_id");
                AnonymousClass1BI r7 = (AnonymousClass1BI) AnonymousClass3MX.A0n(string);
                String string2 = extras.getString("message_id");
                long j = extras.getLong("message_row_id", 0);
                String string3 = extras.getString("action_name");
                String string4 = extras.getString("flow_message_version");
                if (!(r7 == null || A0w2 == null || A16 == null || string2 == null || string3 == null)) {
                    JSONObject jSONObject = new JSONObject(A16);
                    C33251iW r6 = r15.A00;
                    if (A0w == null) {
                        A0w = "";
                    }
                    r6.A0U(r7, (Integer) null, A0w, A0w2, jSONObject.toString(), string4, j);
                    r15.A03.CGF(new C21367Aiw(r15, string2, string, string3, 3));
                    return null;
                }
            }
        } else if (str2.equals("wa.action.commerce.ActionWithCallback")) {
            List list2 = r2.A00;
            String A0w3 = C17880vN.A0w(list2, 0);
            Map A162 = AnonymousClass8BR.A16(list2, 1);
            A45 A01 = A45.A01(boh, list2, 2);
            C188159gy r22 = this.A00;
            Activity A052 = ALS.A05(boh);
            B9Y b9y = (B9Y) r22.A06.get(A0w3);
            if (b9y != null) {
                b9y.CBS(A052, A01, A162);
            } else {
                r22.A01.A00(A01, A0w3).A00("unsupported_action");
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168898js(X.C188159gy r4) {
        /*
            r3 = this;
            java.lang.String[] r2 = X.C17880vN.A1Z()
            r1 = 0
            java.lang.String r0 = "wa.action.commerce.SendNFMReplyMessage"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "wa.action.commerce.ActionWithCallback"
            r2[r1] = r0
            r3.<init>(r2)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168898js.<init>(X.9gy):void");
    }
}
