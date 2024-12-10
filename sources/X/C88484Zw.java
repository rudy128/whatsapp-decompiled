package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Zw  reason: invalid class name and case insensitive filesystem */
public class C88484Zw {
    public CountDownTimer A00;
    public AnonymousClass4LK A01;
    public AnonymousClass4Q7 A02;
    public C85564Nw A03;
    public AnonymousClass5XZ A04;
    public boolean A05 = false;
    public AnonymousClass4ND A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass11P A0A;
    public final AnonymousClass118 A0B;
    public final C18030ve A0C;

    public static void A00(Context context, C88484Zw r14, Long l) {
        int i;
        AnonymousClass4UA r5;
        int i2;
        String format;
        AnonymousClass4ND r9 = r14.A06;
        long longValue = l.longValue();
        boolean A022 = A02(r14);
        long currentTimeMillis = longValue - System.currentTimeMillis();
        long A002 = (long) A87.A00(30, longValue, System.currentTimeMillis());
        Date date = new Date(longValue);
        long currentTimeMillis2 = System.currentTimeMillis();
        Integer A0h = C17880vN.A0h();
        if (A87.A00(A0h, currentTimeMillis2, longValue) == 0 || A87.A00(C17880vN.A0i(), currentTimeMillis2, longValue) == -1) {
            long convert = TimeUnit.HOURS.convert(currentTimeMillis, TimeUnit.MILLISECONDS);
            String A003 = A8I.A00(r9.A00, longValue);
            if (A87.A00(A0h, System.currentTimeMillis(), longValue) == 0) {
                i = 2131891609;
                if (A022) {
                    i = 2131891614;
                }
            } else {
                i = 2131891610;
                if (A022) {
                    i = 2131891615;
                }
            }
            boolean z = false;
            if (convert < 1) {
                z = true;
            }
            r5 = new AnonymousClass4UA(i, A003, z);
        } else {
            if (A002 <= 14) {
                i2 = 2131891608;
                if (A022) {
                    i2 = 2131891613;
                }
                format = String.valueOf(A002);
            } else {
                int i3 = 2131891607;
                if (A022) {
                    i3 = 2131891612;
                }
                format = r9.A01.format(date);
                C18070vi.A0X(format);
            }
            r5 = new AnonymousClass4UA(i2, format, false);
        }
        r14.A02.A00(r5.A01, r5.A00, true, false);
        if (r5.A02) {
            boolean A052 = C18020vd.A05(C18040vf.A02, r14.A0C, 8888);
            AnonymousClass4Q7 r3 = r14.A02;
            int i4 = 2130970924;
            int i5 = 2131102368;
            if (A052) {
                i4 = 2130971979;
                i5 = 2131102703;
            }
            int A004 = AnonymousClass1YL.A00(context, i4, i5);
            InteractiveMessageView interactiveMessageView = r3.A00;
            AnonymousClass3MX.A1C(interactiveMessageView.getContext(), interactiveMessageView.A06, A004);
        }
    }

    public static void A01(C88484Zw r5) {
        AnonymousClass4Q7 r4 = r5.A02;
        int i = 2131891606;
        if (A02(r5)) {
            i = 2131891611;
        }
        r4.A00((String) null, i, true, false);
        AnonymousClass4Q7 r3 = r5.A02;
        int A002 = AnonymousClass1YL.A00(r5.A0B.A00, 2130969247, 2131100256);
        InteractiveMessageView interactiveMessageView = r3.A00;
        AnonymousClass3MX.A1C(interactiveMessageView.getContext(), interactiveMessageView.A06, A002);
        r5.A02.A00.A05.setVisibility(8);
    }

    public static boolean A02(C88484Zw r1) {
        if (r1.A05) {
            C85564Nw r12 = r1.A03;
            if (r12.A00 == null || !TextUtils.isEmpty(r12.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A03() {
        Long l;
        C85564Nw r0 = this.A03;
        if (r0 == null || (l = r0.A00) == null || l.longValue() - System.currentTimeMillis() >= 0) {
            return false;
        }
        return true;
    }

    public C88484Zw(AnonymousClass1KB r2, AnonymousClass4ND r3, AnonymousClass11P r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        this.A0A = r4;
        this.A0C = r6;
        this.A07 = r2;
        this.A0B = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r3;
    }
}
