package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1WL  reason: invalid class name */
public class AnonymousClass1WL {
    public final AnonymousClass121 A00;
    public final AnonymousClass1Cd A01;
    public final C202711m A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final AnonymousClass11S A06;

    public static void A00(AnonymousClass1WL r5, AnonymousClass205 r6, C444923q r7) {
        Object A0H;
        int i = r7.A00;
        String str = r6.A01;
        AnonymousClass1BI r4 = r7.A0v.A00;
        AnonymousClass1WL r3 = r5;
        AnonymousClass11S r1 = r5.A06;
        if (AnonymousClass25A.A0P(r1, r7)) {
            r1.A0I();
            A0H = r1.A0E;
        } else {
            A0H = r7.A0H();
        }
        if (TextUtils.isEmpty(str) || r4 == null || A0H == null) {
            Log.w("MessageAddOnScheduledCallEditManager/onScheduledCallEditMessageAdded parentMessageId or chatJid or senderJid is empty");
        } else if (i == 1) {
            r3.A05.post(new C21456AkN(r3, r4, A0H, str, 28));
        }
    }

    public AnonymousClass1WL(AnonymousClass11S r3, AnonymousClass121 r4, AnonymousClass1Cd r5, C202711m r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A06 = r3;
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        this.A04 = r7;
        this.A03 = r8;
    }
}
