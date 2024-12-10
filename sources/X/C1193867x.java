package X;

import android.content.SharedPreferences;
import com.whatsapp.infra.graphql.generated.invite.NotificationNotifySenderOnReceiverJoinResponseImpl;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.67x  reason: invalid class name and case insensitive filesystem */
public final class C1193867x extends AnonymousClass2SE {
    public long A00 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    public final AnonymousClass1KB A01;
    public final C34531kd A02;
    public final AnonymousClass181 A03;
    public final C33251iW A04;
    public final AnonymousClass118 A05;
    public final C18000vb A06;
    public final AnonymousClass1CJ A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C32011gU A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C34321kI A0E;
    public final AnonymousClass11P A0F;
    public final AnonymousClass00H A0G;

    public void A02(C172768tz r14) {
        String str;
        C46162Dk r5;
        List list;
        C18070vi.A0d(r14, 0);
        if (C18020vd.A00(C18040vf.A02, this.A08, 8400) == 1) {
            C20125A8k a8k = r14.A00;
            Class<NotificationNotifySenderOnReceiverJoinResponseImpl.Xwa2NotifySenderOnReceiverJoin> cls = NotificationNotifySenderOnReceiverJoinResponseImpl.Xwa2NotifySenderOnReceiverJoin.class;
            String optString = C108985cd.A0I(a8k, cls, "xwa2_notify_sender_on_receiver_join").A00.optString("receiver");
            C22941Dw r0 = UserJid.Companion;
            UserJid A032 = C22941Dw.A03(optString);
            if (C108985cd.A0I(a8k, cls, "xwa2_notify_sender_on_receiver_join").A0G("has_clicked")) {
                str = "clicked_invite_link";
            } else {
                str = null;
            }
            this.A0E.A00(A032, str, this.A00);
            C132306mZ r2 = (C132306mZ) this.A0G.get();
            String A0z = C72453Mb.A0z(C108985cd.A0I(a8k, cls, "xwa2_notify_sender_on_receiver_join"), "code");
            r2.A00();
            C18100vl r3 = r2.A01;
            C135686sb r22 = null;
            String string = C17880vN.A0C(r3).getString(A0z, (String) null);
            if (string != null) {
                SharedPreferences.Editor A0A2 = C17890vO.A0A(r3);
                C18070vi.A0X(A0A2);
                C17880vN.A1B(A0A2, A0z);
                r22 = AnonymousClass6W8.A00(string);
            }
            if (str != null && str.length() > 0 && r22 != null) {
                int i = r22.A03;
                if (i == 1) {
                    C29681ch r1 = r22.A00;
                    if (r1 != null) {
                        C29691ci A002 = AnonymousClass1CJ.A00(this.A07, r1);
                        if ((A002 instanceof C46162Dk) && (r5 = (C46162Dk) A002) != null) {
                            AnonymousClass118 r4 = this.A05;
                            Object[] A1b = AnonymousClass3MW.A1b();
                            A1b[0] = r5.A0T;
                            A1b[1] = r5.A0S;
                            String A022 = r4.A02(2131892897, A1b);
                            C18070vi.A0X(A022);
                            String A023 = this.A0A.A02(A022);
                            if (A023 != null) {
                                this.A01.A0J(new C146597Pw(this, A032, A023, A022, 2));
                            }
                        }
                    }
                } else if (i == 2 && (list = r22.A02) != null) {
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass206 A024 = AnonymousClass1W2.A02(this.A0C, C17890vO.A07(it));
                        if (A024 != null) {
                            if (A024.A0w() && ((C32911hx) this.A0D.get()).A01(A024)) {
                                if (!(A024 instanceof AnonymousClass21V) || AnonymousClass25A.A12((AnonymousClass21V) A024)) {
                                    A13.add(A024);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (!A13.isEmpty()) {
                        this.A01.A0J(new C70773Cl(this, A13, A032, 15));
                    }
                }
            }
        }
    }

    public C1193867x(AnonymousClass1KB r17, C34531kd r18, AnonymousClass181 r19, C33251iW r20, C34321kI r21, AnonymousClass11P r22, AnonymousClass118 r23, C18000vb r24, AnonymousClass1CJ r25, C18030ve r26, AnonymousClass18K r27, C32011gU r28, AnonymousClass10I r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32) {
        AnonymousClass10I r4 = r29;
        C18030ve r7 = r26;
        AnonymousClass11P r11 = r22;
        C34531kd r14 = r18;
        AnonymousClass1KB r15 = r17;
        C18070vi.A0w(r11, r7, r15, r14, r4);
        C32011gU r5 = r28;
        AnonymousClass18K r6 = r27;
        AnonymousClass1CJ r8 = r25;
        AnonymousClass118 r10 = r23;
        AnonymousClass181 r13 = r19;
        C18070vi.A0x(r10, r13, r8, r5, r6);
        AnonymousClass00H r2 = r30;
        C18000vb r9 = r24;
        C33251iW r12 = r20;
        C18070vi.A0r(r12, r9, r2);
        AnonymousClass00H r1 = r31;
        C18070vi.A0d(r1, 14);
        AnonymousClass00H r0 = r32;
        C18070vi.A0d(r0, 16);
        this.A0F = r11;
        this.A08 = r7;
        this.A01 = r15;
        this.A02 = r14;
        this.A0B = r4;
        this.A05 = r10;
        this.A03 = r13;
        this.A07 = r8;
        this.A0A = r5;
        this.A09 = r6;
        this.A04 = r12;
        this.A06 = r9;
        this.A0C = r2;
        this.A0D = r1;
        this.A0E = r21;
        this.A0G = r0;
    }

    public Class A00() {
        return NotificationNotifySenderOnReceiverJoinResponseImpl.class;
    }

    public String A01() {
        return "NotificationNotifySenderOnReceiverJoin";
    }

    public void A03(C29621ca r7) {
        long seconds;
        super.A03(r7);
        AnonymousClass1MD[] A0S = r7.A0S();
        if (A0S != null) {
            int length = A0S.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass1MD r2 = A0S[i];
                if (C18070vi.A18(r2.A02, "t")) {
                    seconds = Long.parseLong(r2.A03);
                    break;
                }
                i++;
            }
        }
        seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.A00 = seconds;
    }
}
