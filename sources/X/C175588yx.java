package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.8yx  reason: invalid class name and case insensitive filesystem */
public class C175588yx extends C195729to {
    public final AnonymousClass1KI A00;
    public final C20074A6a A01;
    public final C190219kZ A02;
    public final String A03;
    public final String A04;
    public final Context A05;
    public final AnonymousClass1OZ A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175588yx(android.content.Context r13, X.AnonymousClass1KB r14, X.AnonymousClass11S r15, X.AnonymousClass11P r16, X.AnonymousClass1KI r17, X.AnonymousClass1KH r18, X.AnonymousClass1OZ r19, X.C20074A6a r20, X.C33711jG r21, X.C31061ex r22, X.AnonymousClass1QS r23, X.A54 r24, X.C191949nS r25, X.C190219kZ r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r12 = this;
            r10 = r24
            r9 = r23
            r8 = r22
            r7 = r21
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r11 = r25
            r1 = r12
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A05 = r13
            r0 = r19
            r12.A06 = r0
            r0 = r17
            r12.A00 = r0
            r0 = r20
            r12.A01 = r0
            r0 = r27
            r12.A03 = r0
            r0 = r28
            r12.A07 = r0
            r0 = r29
            r12.A04 = r0
            r0 = r26
            r12.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175588yx.<init>(android.content.Context, X.1KB, X.11S, X.11P, X.1KI, X.1KH, X.1OZ, X.A6a, X.1jG, X.1ex, X.1QS, X.A54, X.9nS, X.9kZ, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void A00(C175588yx r18, String str) {
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendAuthCode");
        C175588yx r7 = r18;
        AnonymousClass1OZ r1 = r7.A06;
        String A0B = r1.A0B();
        String str2 = r7.A04;
        String str3 = r7.A07;
        String A0v = AnonymousClass8BT.A0v(str2);
        String str4 = str;
        C18070vi.A0d(str4, 4);
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "w:pay");
        AnonymousClass8BY.A1A(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A0B, A0v);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "br-verify-send-auth-code");
        if (C29601cY.A04(str2, 1, 200, false)) {
            C29591cX.A01(A0R, "credential-id", str2);
        }
        if (AnonymousClass8BV.A1Y(str3, 1, false)) {
            C29591cX.A01(A0R, "nonce", str3);
        }
        if (C29601cY.A04(str4, 1, 10000, false)) {
            C29591cX.A01(A0R, "auth-code", str4);
        }
        AnonymousClass8BW.A1B(r1, new C175408yf(r7.A05, r7.A05, r7.A01, r7, 10), C29591cX.A00(A0R, A0O), A0B);
    }
}
