package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Ah  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70243Ah implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ long A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ AnonymousClass2SB A0C;
    public final /* synthetic */ DeviceJid A0D;
    public final /* synthetic */ AnonymousClass34B A0E;
    public final /* synthetic */ AnonymousClass1TO A0F;
    public final /* synthetic */ AnonymousClass8X2 A0G;
    public final /* synthetic */ File A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;

    public final void accept(Object obj) {
        C55612g5 A032;
        String str;
        AnonymousClass1TO r5 = this.A0F;
        File file = this.A0H;
        AnonymousClass34B r6 = this.A0E;
        int i = this.A02;
        AnonymousClass2SB r48 = this.A0C;
        String str2 = this.A0K;
        int i2 = this.A03;
        AnonymousClass8X2 r3 = this.A0G;
        long j = this.A0A;
        long j2 = this.A0B;
        int i3 = this.A00;
        DeviceJid deviceJid = this.A0D;
        long j3 = this.A04;
        long j4 = this.A05;
        long j5 = this.A06;
        long j6 = this.A07;
        int i4 = this.A01;
        String str3 = this.A0I;
        long j7 = this.A08;
        String str4 = this.A0J;
        long j8 = this.A09;
        Number number = (Number) obj;
        if (!file.delete()) {
            C17900vP.A0Z(file, "history-sync-send-methods/failed to delete temp file: ", AnonymousClass000.A10());
        }
        AnonymousClass18K r8 = r5.A0T;
        AnonymousClass1T6 r7 = r5.A0X;
        int intValue = number.intValue();
        r8.CC7(r7.A0F(r6, intValue, 8).A00);
        r6.A05();
        if (intValue != 0 || (A032 = r6.A03()) == null) {
            AnonymousClass1TO.A05(r48, r5, str2, i, i3, 3, (long) i2, (long) ((C166148cQ) r3.A00).conversations_.size(), j, j2);
            if (i != 2 && i != 3) {
                return;
            }
            if (i4 > 0) {
                Log.w("history-sync-send-methods/handleMMSFailure retry more than once");
                return;
            }
            if (C18020vd.A05(C18040vf.A02, r5.A0S, 4879)) {
                r5.A0Q.A03(new C59922n6(r48, deviceJid, str3, i, i3, 3, -1, j4, j3, j5, j6, 0, 0, -1, 0));
                return;
            }
            return;
        }
        if (i == 0) {
            r5.A0P.A01(true);
        }
        C196299un r62 = A032.A02;
        synchronized (r62) {
            str = r62.A06;
        }
        String A033 = r62.A03();
        String A062 = r62.A06();
        String A052 = r62.A05();
        C61382pa A002 = r62.A00();
        if (A002 == null || TextUtils.isEmpty(A033) || TextUtils.isEmpty(A062) || TextUtils.isEmpty(A052)) {
            AnonymousClass1TO.A05(r48, r5, str2, i, i3, 4, (long) i2, (long) ((C166148cQ) r3.A00).conversations_.size(), j, j2);
            return;
        }
        AnonymousClass1TO.A04(r48, deviceJid, A002, r5, r3, str2, str4, A033, str, A062, A052, str3, i3, i, i2, i4, j7, j3, j4, j5, j, j8, j2, false);
    }

    public /* synthetic */ C70243Ah(AnonymousClass2SB r3, DeviceJid deviceJid, AnonymousClass34B r5, AnonymousClass1TO r6, AnonymousClass8X2 r7, File file, String str, String str2, String str3, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A0F = r6;
        this.A0H = file;
        this.A0E = r5;
        this.A02 = i;
        this.A0C = r3;
        this.A0K = str;
        this.A03 = i2;
        this.A0G = r7;
        this.A0A = j;
        this.A0B = j2;
        this.A00 = i3;
        this.A0D = deviceJid;
        this.A04 = j3;
        this.A05 = j4;
        this.A06 = j5;
        this.A07 = j6;
        this.A01 = i4;
        this.A0I = str2;
        this.A08 = j7;
        this.A0J = str3;
        this.A09 = j8;
    }
}
