package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AVl  reason: case insensitive filesystem */
public class C20705AVl implements C25471Oi {
    public SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C25241Nl A03;
    public final C32941i0 A04 = new C20740AWv(this);
    public final C31671fw A05;
    public final C200710s A06;
    public final AnonymousClass18K A07;
    public final C18010vc A08;
    public final AnonymousClass00H A09;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    private SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A052 = this.A08.A05("conversationSketch");
        this.A00 = A052;
        return A052;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.8o6, X.8o5] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.8o6, X.8o3] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.8o1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.8o6, X.8o4] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e7, code lost:
        if (X.AnonymousClass8BR.A0i(r7) != null) goto L_0x0210;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03f3 A[Catch:{ JSONException -> 0x0403 }, LOOP:4: B:232:0x03f3->B:234:0x03f9, LOOP_START, PHI: r1 
      PHI: (r1v11 int) = (r1v10 int), (r1v12 int) binds: [B:231:0x03f1, B:234:0x03f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x041b A[Catch:{ JSONException -> 0x0428 }, LOOP:5: B:239:0x0415->B:241:0x041b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C20705AVl r11, X.AnonymousClass1BI r12, X.AnonymousClass205 r13, boolean r14) {
        /*
            X.0ve r2 = r11.A02
            r1 = 5535(0x159f, float:7.756E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0469
            r0 = 5536(0x15a0, float:7.758E-42)
            java.lang.String r1 = r2.A0I(r0)
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0026
            java.util.List r1 = X.AnonymousClass8BW.A0t(r1)
            java.lang.String r0 = r12.user
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0469
        L_0x0026:
            r0 = 0
            A03(r11, r0)
            X.00H r0 = r11.A09
            X.206 r7 = X.AnonymousClass1W2.A01(r13, r0)
            if (r7 == 0) goto L_0x0469
            int r8 = r7.A0u
            java.lang.String r0 = r12.getRawString()
            X.8o0 r1 = r11.A01(r0)
            X.8o1 r0 = r1.A00
            if (r0 != 0) goto L_0x03da
            r0 = 0
        L_0x0041:
            int r6 = r0 + 1
            if (r14 == 0) goto L_0x03d6
            java.lang.String r5 = "sent"
        L_0x0047:
            r3 = 54
            r2 = 1
            if (r8 == 0) goto L_0x01ea
            if (r8 == r2) goto L_0x01e3
            r0 = 2
            if (r8 == r0) goto L_0x01e3
            r0 = 3
            if (r8 == r0) goto L_0x01e3
            r0 = 9
            if (r8 == r0) goto L_0x01e3
            r0 = 20
            if (r8 == r0) goto L_0x01e3
            r0 = 23
            if (r8 == r0) goto L_0x0210
            r0 = 32
            if (r8 == r0) goto L_0x0163
            r0 = 49
            if (r8 == r0) goto L_0x0210
            r0 = 52
            if (r8 == r0) goto L_0x0210
            r0 = 45
            if (r8 == r0) goto L_0x0210
            r0 = 46
            if (r8 == r0) goto L_0x0210
            if (r8 == r3) goto L_0x0210
            r0 = 55
            if (r8 == r0) goto L_0x0210
            switch(r8) {
                case 25: goto L_0x0166;
                case 26: goto L_0x0166;
                case 27: goto L_0x0166;
                case 28: goto L_0x0166;
                case 29: goto L_0x0166;
                case 30: goto L_0x0166;
                default: goto L_0x007d;
            }
        L_0x007d:
            if (r8 == r2) goto L_0x015f
            r0 = 2
            if (r8 == r0) goto L_0x015b
            r0 = 3
            if (r8 == r0) goto L_0x0157
            r0 = 5
            if (r8 == r0) goto L_0x0153
            r0 = 9
            if (r8 == r0) goto L_0x014f
            r0 = 20
            if (r8 == r0) goto L_0x014b
            r0 = 44
            if (r8 != r0) goto L_0x0200
            java.lang.String r0 = "order"
        L_0x0096:
            X.8o2 r4 = new X.8o2
            r4.<init>(r6, r5, r0)
        L_0x009b:
            org.json.JSONObject r0 = r4.A03()
            if (r0 == 0) goto L_0x00a4
            r0.toString()
        L_0x00a4:
            X.11P r8 = r11.A01
            long r9 = X.AnonymousClass11P.A01(r8)
            X.8o1 r7 = r1.A00
            if (r7 == 0) goto L_0x00c0
            long r2 = r7.A00
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r5
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0135
            java.util.List r0 = r1.A01
            r0.add(r7)
            r0 = 0
            r1.A00 = r0
        L_0x00c0:
            X.1Nl r2 = r11.A03
            java.lang.String r0 = r12.getRawString()
            java.lang.String r2 = r2.A05(r0)
            r0 = 1
            r4.A00 = r0
            long r5 = X.AnonymousClass11P.A01(r8)
            java.lang.String r0 = r12.getRawString()
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = "defaultThreadID"
        L_0x00d9:
            X.8o1 r3 = new X.8o1
            r3.<init>()
            r3.A00 = r5
            r3.A03 = r0
            r3.A02 = r2
            java.lang.Long r0 = X.C17890vO.A0L()
            r3.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r3.A04 = r0
            r1.A00 = r3
            int r2 = r0.size()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x012c
            java.util.List r0 = r3.A04
        L_0x00fc:
            r0.add(r4)
        L_0x00ff:
            java.lang.String r3 = r12.getRawString()
            android.content.SharedPreferences r0 = r11.A00()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            org.json.JSONObject r0 = r1.A03()
            java.lang.String r0 = X.C17900vP.A08(r0)
            X.C17880vN.A1E(r2, r3, r0)
            java.lang.String r4 = r12.getRawString()
            android.content.SharedPreferences r1 = r11.A00()
            java.lang.String r5 = "merchant_jid_list"
            java.lang.String r0 = "{}"
            java.lang.String r0 = r1.getString(r5, r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            goto L_0x03e2
        L_0x012c:
            java.lang.Long r0 = r3.A01
            java.lang.Long r0 = X.C108995ce.A0T(r0)
            r3.A01 = r0
            goto L_0x00ff
        L_0x0135:
            java.util.List r0 = r7.A04
            int r2 = r0.size()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x0142
            java.util.List r0 = r7.A04
            goto L_0x00fc
        L_0x0142:
            java.lang.Long r0 = r7.A01
            java.lang.Long r0 = X.C108995ce.A0T(r0)
            r7.A01 = r0
            goto L_0x00ff
        L_0x014b:
            java.lang.String r0 = "sticker"
            goto L_0x0096
        L_0x014f:
            java.lang.String r0 = "document"
            goto L_0x0096
        L_0x0153:
            java.lang.String r0 = "location"
            goto L_0x0096
        L_0x0157:
            java.lang.String r0 = "video"
            goto L_0x0096
        L_0x015b:
            java.lang.String r0 = "audio"
            goto L_0x0096
        L_0x015f:
            java.lang.String r0 = "image"
            goto L_0x0096
        L_0x0163:
            java.lang.String r0 = "template_hsm_reply"
            goto L_0x0168
        L_0x0166:
            java.lang.String r0 = "template_hsm"
        L_0x0168:
            X.8o4 r4 = new X.8o4
            r4.<init>(r6, r5, r0)
            r0 = 32
            if (r8 != r0) goto L_0x01b4
            r0 = r7
            X.224 r0 = (X.AnonymousClass224) r0
            java.lang.String r0 = r0.A01
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r4.A00 = r0
        L_0x017c:
            boolean r0 = r7 instanceof X.C439421n
            if (r0 == 0) goto L_0x009b
            X.21n r7 = (X.C439421n) r7
            X.2k6 r2 = r7.BaE()
            java.lang.String r0 = r2.A05
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r4.A02 = r0
            java.util.List r2 = r2.A06
            if (r2 == 0) goto L_0x009b
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A03 = r0
            java.util.Iterator r3 = r2.iterator()
        L_0x019c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r3.next()
            X.2qD r0 = (X.C61762qD) r0
            java.util.List r2 = r4.A03
            java.lang.String r0 = r0.A09
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r2.add(r0)
            goto L_0x019c
        L_0x01b4:
            r0 = 27
            if (r8 != r0) goto L_0x01bd
            java.lang.String r0 = "text"
        L_0x01ba:
            r4.A01 = r0
            goto L_0x017c
        L_0x01bd:
            r0 = 25
            if (r8 != r0) goto L_0x01c4
            java.lang.String r0 = "image"
            goto L_0x01ba
        L_0x01c4:
            r0 = 30
            if (r8 != r0) goto L_0x01cb
            java.lang.String r0 = "location"
            goto L_0x01ba
        L_0x01cb:
            r0 = 28
            if (r8 != r0) goto L_0x01d2
            java.lang.String r0 = "video"
            goto L_0x01ba
        L_0x01d2:
            r0 = 26
            if (r8 != r0) goto L_0x01d9
            java.lang.String r0 = "document"
            goto L_0x01ba
        L_0x01d9:
            r0 = 29
            if (r8 != r0) goto L_0x01e0
            java.lang.String r0 = "gif"
            goto L_0x01ba
        L_0x01e0:
            java.lang.String r0 = "unsupported"
            goto L_0x01ba
        L_0x01e3:
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            if (r0 == 0) goto L_0x007d
            goto L_0x0210
        L_0x01ea:
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            if (r0 != 0) goto L_0x0210
            java.lang.String r0 = X.AnonymousClass25B.A01(r7)
            if (r0 == 0) goto L_0x0204
            java.lang.String r0 = X.AnonymousClass25B.A01(r7)
            if (r0 == 0) goto L_0x0200
            java.lang.String r0 = "payment"
            goto L_0x0096
        L_0x0200:
            java.lang.String r0 = "unsupported"
            goto L_0x0096
        L_0x0204:
            if (r14 != 0) goto L_0x03b7
            X.206 r0 = r7.A0K()
            if (r0 == 0) goto L_0x03b7
            int r0 = r0.A0u
            if (r0 != r3) goto L_0x03b7
        L_0x0210:
            java.lang.String r0 = "interactive"
            X.8o5 r4 = new X.8o5
            r4.<init>(r6, r5, r0)
            boolean r0 = r7 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x02e2
            r0 = r7
            X.21L r0 = (X.AnonymousClass21L) r0
            X.AEt r5 = r0.A00
            if (r5 == 0) goto L_0x0258
            X.AEE r6 = r5.A05
            if (r6 == 0) goto L_0x0238
            r4.A0B = r2
            byte[] r0 = r6.A03
            if (r0 == 0) goto L_0x02de
            java.lang.String r0 = "image"
        L_0x022e:
            r4.A01 = r0
            java.lang.String r0 = r6.A01
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            r4.A0C = r0
        L_0x0238:
            java.lang.String r0 = r5.A0B
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            r4.A09 = r0
            java.lang.String r0 = r5.A0B
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            r4.A07 = r0
            java.lang.String r0 = r5.A0C
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            r4.A0A = r0
            java.lang.String r0 = r5.A0C
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            r4.A08 = r0
        L_0x0258:
            boolean r0 = r7 instanceof X.AnonymousClass21T
            if (r0 == 0) goto L_0x0267
            r0 = r7
            X.21T r0 = (X.AnonymousClass21T) r0
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r4.A00 = r0
        L_0x0267:
            boolean r0 = r7 instanceof X.C438721g
            if (r0 == 0) goto L_0x027a
            r0 = r7
            X.21g r0 = (X.C438721g) r0
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = r0.A02
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r4.A03 = r0
        L_0x027a:
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            if (r0 == 0) goto L_0x02e5
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            java.util.List r6 = r0.A02
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            java.lang.String r0 = r0.A00
            r9 = 0
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r4.A09 = r0
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            r4.A07 = r0
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x02a8
            r9 = 1
        L_0x02a8:
            r4.A0A = r9
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            java.lang.String r0 = r0.A01
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            r4.A08 = r0
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02e5
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A05 = r0
            java.util.Iterator r9 = r6.iterator()
        L_0x02c6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02e5
            java.lang.Object r0 = r9.next()
            X.9t8 r0 = (X.C195309t8) r0
            java.util.List r6 = r4.A05
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            r6.add(r0)
            goto L_0x02c6
        L_0x02de:
            java.lang.String r0 = "text"
            goto L_0x022e
        L_0x02e2:
            r5 = 0
            goto L_0x0258
        L_0x02e5:
            if (r8 == 0) goto L_0x034c
            if (r8 == r2) goto L_0x034c
            r0 = 23
            if (r8 == r0) goto L_0x0349
            r0 = 49
            if (r8 == r0) goto L_0x0346
            r0 = 52
            if (r8 == r0) goto L_0x0343
            if (r8 == r3) goto L_0x0340
            r0 = 45
            if (r8 == r0) goto L_0x0363
            r0 = 46
            if (r8 == r0) goto L_0x033d
            java.lang.String r6 = "unsupported"
            if (r5 == 0) goto L_0x0337
            int r2 = r5.A00
            r0 = 5
            if (r2 != r0) goto L_0x0337
            java.lang.String r0 = r5.A00()
            if (r0 == 0) goto L_0x0337
            r5.A00()
            java.lang.String r3 = r5.A00()
            java.lang.String r2 = "address_message"
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x033b
            java.lang.String r0 = "review_order"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0337
            java.lang.String r2 = r5.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = X.C20096A6z.A02(r2)
            r4.A04 = r0
        L_0x0335:
            java.lang.String r6 = "order_status"
        L_0x0337:
            r4.A02 = r6
            goto L_0x009b
        L_0x033b:
            r6 = r2
            goto L_0x0337
        L_0x033d:
            java.lang.String r6 = "list_reply"
            goto L_0x0337
        L_0x0340:
            java.lang.String r6 = "order_details"
            goto L_0x0337
        L_0x0343:
            java.lang.String r6 = "product_list"
            goto L_0x0337
        L_0x0346:
            java.lang.String r6 = "button_reply"
            goto L_0x0337
        L_0x0349:
            java.lang.String r6 = "product"
            goto L_0x0337
        L_0x034c:
            X.9rz r0 = X.AnonymousClass8BR.A0i(r7)
            if (r0 == 0) goto L_0x0355
            java.lang.String r6 = "button"
            goto L_0x0337
        L_0x0355:
            X.206 r0 = r7.A0K()
            if (r0 == 0) goto L_0x0360
            int r0 = r0.A0u
            if (r0 != r3) goto L_0x0360
            goto L_0x0335
        L_0x0360:
            java.lang.String r6 = "unsupported"
            goto L_0x0337
        L_0x0363:
            java.lang.String r0 = "list"
            r4.A02 = r0
            if (r5 == 0) goto L_0x009b
            java.util.List r0 = r5.A0F
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009b
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A06 = r0
            java.util.List r0 = r5.A0F
            java.util.Iterator r5 = r0.iterator()
        L_0x037d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r5.next()
            X.AE4 r0 = (X.AE4) r0
            java.util.List r2 = r0.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x037d
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r2.iterator()
        L_0x0399:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r2.next()
            X.AEF r0 = (X.AEF) r0
            java.lang.String r0 = r0.A02
            java.lang.String r0 = X.AnonymousClass8o6.A01(r0)
            if (r0 == 0) goto L_0x0399
            r3.add(r0)
            goto L_0x0399
        L_0x03b1:
            java.util.List r0 = r4.A06
            r0.add(r3)
            goto L_0x037d
        L_0x03b7:
            r0 = r7
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = r7.A0X
            boolean r0 = X.AnonymousClass8o5.A00(r0)
            if (r0 != 0) goto L_0x03cb
            r2 = 0
        L_0x03cb:
            java.lang.String r0 = "text"
            X.8o3 r4 = new X.8o3
            r4.<init>(r6, r5, r0)
            r4.A00 = r2
            goto L_0x009b
        L_0x03d6:
            java.lang.String r5 = "received"
            goto L_0x0047
        L_0x03da:
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            goto L_0x0041
        L_0x03e2:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x0403 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0403 }
            java.lang.String r0 = "merchant_list"
            org.json.JSONArray r2 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x0403 }
            r1 = 0
            if (r2 == 0) goto L_0x0409
        L_0x03f3:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0403 }
            if (r1 >= r0) goto L_0x0409
            java.lang.Object r0 = r2.get(r1)     // Catch:{ JSONException -> 0x0403 }
            r6.add(r0)     // Catch:{ JSONException -> 0x0403 }
            int r1 = r1 + 1
            goto L_0x03f3
        L_0x0403:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchMerchantJIDKeyList: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0409:
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0428 }
            org.json.JSONArray r2 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x0428 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ JSONException -> 0x0428 }
        L_0x0415:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0428 }
            if (r0 == 0) goto L_0x041f
            X.AnonymousClass8BS.A1J(r1, r2)     // Catch:{ JSONException -> 0x0428 }
            goto L_0x0415
        L_0x041f:
            java.lang.String r0 = "merchant_list"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x0428 }
            r3.toString()
            goto L_0x042e
        L_0x0428:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchMerchantJIDKeyList: toJsonString threw: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x042e:
            boolean r0 = r6.contains(r4)
            if (r0 != 0) goto L_0x0469
            r6.add(r4)
            android.content.SharedPreferences r0 = r11.A00()
            android.content.SharedPreferences$Editor r4 = r0.edit()
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x045f }
            org.json.JSONArray r2 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x045f }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ JSONException -> 0x045f }
        L_0x044b:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x045f }
            if (r0 == 0) goto L_0x0455
            X.AnonymousClass8BS.A1J(r1, r2)     // Catch:{ JSONException -> 0x045f }
            goto L_0x044b
        L_0x0455:
            java.lang.String r0 = "merchant_list"
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x045f }
            java.lang.String r0 = r3.toString()
            goto L_0x0466
        L_0x045f:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchMerchantJIDKeyList: toJsonString threw: "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x0466:
            X.C17880vN.A1E(r4, r5, r0)
        L_0x0469:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20705AVl.A02(X.AVl, X.1BI, X.205, boolean):void");
    }

    public static void A03(C20705AVl aVl, boolean z) {
        String str;
        SharedPreferences.Editor remove;
        C20705AVl aVl2 = aVl;
        long A052 = C17890vO.A05(aVl2.A00(), "logs_last_sent");
        long currentTimeMillis = System.currentTimeMillis();
        if (z || currentTimeMillis > 259200000 + A052) {
            String string = aVl2.A00().getString("merchant_jid_list", "{}");
            ArrayList A13 = AnonymousClass000.A13();
            try {
                A13 = AnonymousClass000.A13();
                JSONArray optJSONArray = C17880vN.A16(string).optJSONArray("merchant_list");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        A13.add(optJSONArray.get(i));
                    }
                }
            } catch (JSONException e) {
                Log.w("ConversationSketchMerchantJIDKeyList: fromJsonString threw: ", e);
            }
            try {
                JSONObject A15 = C17880vN.A15();
                JSONArray A1A = AnonymousClass8BR.A1A();
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    AnonymousClass8BS.A1J(it, A1A);
                }
                A15.put("merchant_list", A1A);
                A15.toString();
            } catch (JSONException e2) {
                Log.e("ConversationSketchMerchantJIDKeyList: toJsonString threw: ", e2);
            }
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                String A0v = C17880vN.A0v(it2);
                AnonymousClass8o0 A012 = aVl2.A01(A0v);
                AnonymousClass8o1 r14 = A012.A00;
                if (r14 != null && r14.A00 + 86400000 < currentTimeMillis) {
                    A012.A01.add(r14);
                    A012.A00 = null;
                }
                A012.A01.size();
                for (AnonymousClass8o1 r12 : A012.A01) {
                    ArrayList A133 = AnonymousClass000.A13();
                    JSONArray A1A2 = AnonymousClass8BR.A1A();
                    for (C189069iS r15 : r12.A04) {
                        String obj = A1A2.toString();
                        A1A2.put(r15.A03());
                        if (A1A2.toString().length() > 1000) {
                            A133.add(obj);
                            A1A2 = AnonymousClass8BR.A1A();
                            A1A2.put(r15.A03());
                        }
                    }
                    if (A1A2.toString().length() > 0) {
                        C108955ca.A1U(A1A2, A133);
                    }
                    Iterator it3 = A133.iterator();
                    while (it3.hasNext()) {
                        String A0v2 = C17880vN.A0v(it3);
                        C170958qw r3 = new C170958qw();
                        r3.A01 = r12.A03;
                        r3.A03 = r12.A02;
                        r3.A00 = r12.A01;
                        r3.A02 = A0v2;
                        aVl2.A07.CC7(r3);
                    }
                }
                A012.A01 = AnonymousClass000.A13();
                AnonymousClass8o1 r0 = A012.A00;
                if (r0 == null || r0.A04.isEmpty()) {
                    remove = aVl2.A00().edit().remove(A0v);
                } else {
                    A132.add(A0v);
                    remove = aVl2.A00().edit().putString(A0v, C17900vP.A08(A012.A03()));
                }
                remove.apply();
            }
            if (A132.size() != A13.size()) {
                SharedPreferences.Editor edit = aVl2.A00().edit();
                try {
                    JSONObject A152 = C17880vN.A15();
                    JSONArray A1A3 = AnonymousClass8BR.A1A();
                    Iterator it4 = A132.iterator();
                    while (it4.hasNext()) {
                        AnonymousClass8BS.A1J(it4, A1A3);
                    }
                    A152.put("merchant_list", A1A3);
                    str = A152.toString();
                } catch (JSONException e3) {
                    Log.e("ConversationSketchMerchantJIDKeyList: toJsonString threw: ", e3);
                    str = null;
                }
                C17880vN.A1E(edit, "merchant_jid_list", str);
            }
            AnonymousClass8BW.A12(aVl2.A00(), "logs_last_sent", currentTimeMillis);
        }
    }

    public C20705AVl(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, C25241Nl r5, C31671fw r6, C18010vc r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r4;
        this.A09 = r9;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = C200710s.A00(r8);
        this.A08 = r7;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.8o0] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.8o1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r1.A04(r0) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass8o0 A01(java.lang.String r7) {
        /*
            r6 = this;
            android.content.SharedPreferences r1 = r6.A00()
            java.lang.String r0 = "{}"
            java.lang.String r0 = r1.getString(r7, r0)
            X.8o0 r5 = new X.8o0
            r5.<init>()
            org.json.JSONObject r2 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = "current_conversation"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0066 }
            X.8o1 r1 = new X.8o1     // Catch:{ JSONException -> 0x0066 }
            r1.<init>()     // Catch:{ JSONException -> 0x0066 }
            boolean r0 = r1.A04(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0039
        L_0x002a:
            r5.A00 = r1     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = "completed_conversations"
            org.json.JSONArray r4 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x0066 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ JSONException -> 0x0066 }
            r5.A01 = r0     // Catch:{ JSONException -> 0x0066 }
            goto L_0x003b
        L_0x0039:
            r1 = 0
            goto L_0x002a
        L_0x003b:
            r3 = 0
            if (r4 == 0) goto L_0x00a0
        L_0x003e:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0066 }
            if (r3 >= r0) goto L_0x00a0
            java.lang.Object r2 = r4.get(r3)     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0066 }
            X.8o1 r1 = new X.8o1     // Catch:{ JSONException -> 0x0066 }
            r1.<init>()     // Catch:{ JSONException -> 0x0066 }
            boolean r0 = r1.A04(r0)     // Catch:{ JSONException -> 0x0066 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0066 }
            r1.A04(r0)     // Catch:{ JSONException -> 0x0066 }
            java.util.List r0 = r5.A01     // Catch:{ JSONException -> 0x0066 }
            r0.add(r1)     // Catch:{ JSONException -> 0x0066 }
        L_0x0063:
            int r3 = r3 + 1
            goto L_0x003e
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "ConversationSketchConversationMerchantList: fromJsonString threw: "
            com.whatsapp.util.Log.w(r0, r1)
            X.1Nl r0 = r6.A03
            java.lang.String r4 = r0.A05(r7)
            X.11P r0 = r6.A01
            long r2 = X.AnonymousClass11P.A01(r0)
            if (r4 != 0) goto L_0x007c
            java.lang.String r4 = "defaultThreadID"
        L_0x007c:
            X.8o0 r5 = new X.8o0
            r5.<init>()
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A01 = r0
            X.8o1 r1 = new X.8o1
            r1.<init>()
            r1.A00 = r2
            r1.A03 = r7
            r1.A02 = r4
            java.lang.Long r0 = X.C17890vO.A0L()
            r1.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r1.A04 = r0
            r5.A00 = r1
        L_0x00a0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20705AVl.A01(java.lang.String):X.8o0");
    }

    public String BSr() {
        return "ConversationSketchLogger";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public void Bvt(C63362sw r5) {
        AnonymousClass1BI A032 = r5.A03();
        if (r5.A0C()) {
            this.A06.execute(new C98714rb(this, A032, r5, 34));
        }
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }
}
