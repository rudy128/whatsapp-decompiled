package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$getPreloadMessagesResultBlocking$2$1;
import com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preLoadMessagesHelper$1;
import com.whatsapp.conversation.messagesloader.ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.4lp  reason: invalid class name and case insensitive filesystem */
public final class C95184lp implements C108715cB {
    public Map A00 = C17880vN.A13();
    public Map A01 = C17880vN.A13();
    public final AnonymousClass1CJ A02;
    public final AnonymousClass121 A03;
    public final AnonymousClass1Q9 A04;
    public final C18030ve A05;
    public final AnonymousClass1LT A06;
    public final AW1 A07;
    public final AnonymousClass1W6 A08;
    public final C18600wl A09;
    public final C18600wl A0A;
    public final AnonymousClass1OX A0B;
    public final AnonymousClass1NJ A0C;
    public final C26061Qr A0D;

    public static final C87204Ur A01(C95184lp r5, AnonymousClass1BI r6) {
        Object obj;
        C87204Ur r0;
        synchronized (r5) {
            obj = r5.A00.get(r6);
        }
        AnonymousClass1OB r4 = (AnonymousClass1OB) obj;
        if (r4 != null) {
            try {
                AnonymousClass2VF.A00(AnonymousClass1OR.A00, new ConversationMessagesLoaderImpl$getPreloadMessagesResultBlocking$2$1((C30391dr) null, r4));
            } catch (InterruptedException e) {
                StringBuilder A11 = AnonymousClass000.A11("messagesViewModel/getPreloadMessagesResultBlocking/jid=");
                A11.append(r6);
                A11.append(" job ");
                A11.append(r4);
                C17900vP.A0X(e, " is cancelled e=", A11);
            }
        }
        synchronized (r5) {
            r0 = (C87204Ur) r5.A01.get(r6);
        }
        return r0;
    }

    public int BG4(AnonymousClass1BI r9, long j, long j2) {
        AnonymousClass1BI r3 = r9;
        C18070vi.A0d(r9, 0);
        return this.A0C.A00((C199410f) this.A0D.A01.getValue(), r3, j, j2);
    }

    public C54242dp BUp(AnonymousClass1BI r10, int i, long j, long j2) {
        AnonymousClass1BI r3 = r10;
        C18070vi.A0d(r10, 0);
        C54242dp BUp = this.A03.BUp(r3, i, j, j2);
        if (C22971Dz.A0V(r10)) {
            this.A07.A06((C29681ch) r3, (B8R) null, (Long) null, i);
        }
        Cursor cursor = BUp.A00;
        if (cursor != null) {
            cursor.getCount();
        }
        return BUp;
    }

    public void CCB(Activity activity, C87054Uc r11, AnonymousClass1BI r12) {
        C18070vi.A0d(r12, 1);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131166269);
        AnonymousClass1OX r1 = this.A0B;
        C87054Uc r4 = r11;
        AnonymousClass3MW.A1X(this.A0A, new ConversationMessagesLoaderImpl$preLoadMessagesHelper$1(C72483Me.A0D(activity), r4, this, r12, (C30391dr) null, dimensionPixelSize), r1);
    }

    public void CCH(Context context, Context context2, AnonymousClass1BI r11) {
        C18070vi.A0n(context, context2, r11);
        AnonymousClass1OX r1 = this.A0B;
        AnonymousClass3MW.A1X(this.A0A, new ConversationMessagesLoaderImpl$preloadConversationRowViewsForMessages$1(context2, context, this, r11, (C30391dr) null), r1);
    }

    public static final C87204Ur A00(C87054Uc r23, C95184lp r24, AnonymousClass1BI r25, int i, int i2, long j, long j2, long j3, boolean z) {
        int i3;
        C54242dp r9;
        long j4;
        C87054Uc r6 = r23;
        C95184lp r8 = r24;
        AnonymousClass1BI r7 = r25;
        long j5 = j;
        long j6 = j3;
        int i4 = i;
        if (r23 != null) {
            long j7 = r6.A00;
            long j8 = j7;
            if (j7 == 0) {
                j7 = r6.A02;
            }
            AnonymousClass122 r3 = (AnonymousClass122) r8.A03;
            AnonymousClass1BI r20 = r7;
            r9 = r3.BUp(r20, 51, r3.A0a.A06(r20, 51, j7, j6), j6);
            Long valueOf = Long.valueOf(j2);
            if (C22971Dz.A0V(r7)) {
                AW1 aw1 = r8.A07;
                C18070vi.A0z(r7, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                aw1.A06((C29681ch) r7, (B8R) null, valueOf, 51);
            }
            Cursor cursor = r9.A00;
            if (cursor != null) {
                cursor.getCount();
            } else {
                r9 = r8.BUp(r7, i4, j5, j6);
            }
            Log.i("messagesViewModel/start/count");
            long j9 = r6.A01;
            long j10 = j9;
            boolean z2 = true;
            if (j9 <= Long.MIN_VALUE && j8 > 0) {
                j9 = j8;
            } else if (j9 <= Long.MIN_VALUE) {
                j9 = r6.A03;
                if (j9 <= Long.MIN_VALUE) {
                    j9 = r6.A02;
                }
                z2 = false;
            }
            if (C22781De.A03()) {
                i3 = r8.BG4(r20, r9.A02, j9);
            } else {
                i3 = r8.A0C.A00((C199410f) r8.A0D.A01.getValue(), r7, r9.A02, j9);
            }
            if (!z2) {
                j10 = r6.A03;
            }
            C29691ci A0a = C72463Mc.A0a(r8.A02, r7);
            if (A0a == null) {
                j4 = 1;
            } else {
                j4 = A0a.A0S;
            }
            if (j10 > j4) {
                i3++;
            }
            C17900vP.A0j("messagesViewModel/start/count/result ", AnonymousClass000.A10(), i3);
        } else {
            i3 = -1;
            if (z && i2 > 90) {
                i4 = i2 + 10;
            }
            r9 = r8.BUp(r7, i4, j5, j6);
        }
        return new C87204Ur(r6, r9, (List) null, i3, j5);
    }

    public C95184lp(AnonymousClass1CJ r2, AnonymousClass121 r3, AnonymousClass1Q9 r4, AnonymousClass1NJ r5, C18030ve r6, AnonymousClass1LT r7, C26061Qr r8, AW1 aw1, AnonymousClass1W6 r10, C18600wl r11, C18600wl r12, AnonymousClass1OX r13) {
        C18070vi.A0w(r6, r2, r5, r10, r3);
        C18070vi.A0x(r8, r7, r4, aw1, r11);
        C72473Md.A1L(r12, r13);
        this.A05 = r6;
        this.A02 = r2;
        this.A0C = r5;
        this.A08 = r10;
        this.A03 = r3;
        this.A0D = r8;
        this.A06 = r7;
        this.A04 = r4;
        this.A07 = aw1;
        this.A09 = r11;
        this.A0A = r12;
        this.A0B = r13;
    }
}
