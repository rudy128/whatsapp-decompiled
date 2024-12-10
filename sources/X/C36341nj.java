package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1nj  reason: invalid class name and case insensitive filesystem */
public final class C36341nj implements AnonymousClass1GE, C34561kh {
    public C107095Yj A00;
    public C63242sk A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C18100vl A0H = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C36351nk.A00);
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;

    public C36341nj(AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36) {
        AnonymousClass00H r18 = r20;
        C18070vi.A0d(r18, 1);
        AnonymousClass00H r17 = r21;
        C18070vi.A0d(r17, 2);
        AnonymousClass00H r16 = r22;
        C18070vi.A0d(r16, 3);
        AnonymousClass00H r15 = r23;
        C18070vi.A0d(r15, 4);
        AnonymousClass00H r14 = r24;
        C18070vi.A0d(r14, 5);
        AnonymousClass00H r13 = r25;
        C18070vi.A0d(r13, 6);
        AnonymousClass00H r12 = r26;
        C18070vi.A0d(r12, 7);
        AnonymousClass00H r11 = r27;
        C18070vi.A0d(r11, 8);
        AnonymousClass00H r10 = r28;
        C18070vi.A0d(r10, 9);
        AnonymousClass00H r9 = r29;
        C18070vi.A0d(r9, 10);
        AnonymousClass00H r8 = r30;
        C18070vi.A0d(r8, 11);
        AnonymousClass00H r7 = r31;
        C18070vi.A0d(r7, 12);
        AnonymousClass00H r6 = r32;
        C18070vi.A0d(r6, 13);
        AnonymousClass00H r5 = r33;
        C18070vi.A0d(r5, 14);
        AnonymousClass00H r4 = r34;
        C18070vi.A0d(r4, 15);
        AnonymousClass00H r3 = r35;
        C18070vi.A0d(r3, 16);
        AnonymousClass00H r2 = r36;
        C18070vi.A0d(r2, 17);
        this.A02 = r18;
        this.A09 = r17;
        this.A04 = r16;
        this.A08 = r15;
        this.A0B = r14;
        this.A0C = r13;
        this.A03 = r12;
        this.A0I = r11;
        this.A0E = r10;
        this.A0A = r9;
        this.A0J = r8;
        this.A0G = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A0F = r4;
        this.A0D = r3;
        this.A05 = r2;
        Boolean bool = C17960vV.A01;
    }

    public final void A01(Context context, Uri uri) {
        AnonymousClass1FU r3;
        C18070vi.A0d(context, 0);
        AnonymousClass00H r5 = this.A09;
        C18030ve r32 = ((AnonymousClass1c4) r5.get()).A02;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r32, 3877) == 1 || C18020vd.A00(r2, r32, 3878) == 1) {
            ((AnonymousClass4YQ) this.A04.get()).A02(context, AnonymousClass00R.A01);
        } else if (!((AnonymousClass1c4) r5.get()).A03()) {
            AnonymousClass4YQ r1 = (AnonymousClass4YQ) this.A04.get();
            C18070vi.A0X(r1);
            r1.A01(context, uri, AnonymousClass00R.A01, false);
        } else {
            Activity A002 = AnonymousClass1L9.A00(context);
            if ((A002 instanceof AnonymousClass1FU) && (r3 = (AnonymousClass1FU) A002) != null) {
                AnonymousClass749 r22 = (AnonymousClass749) this.A0E.get();
                C18070vi.A0X(r22);
                r22.A07(r3, ((Number) r22.A0F.getValue()).intValue(), AnonymousClass749.A00(r22), false);
            }
        }
    }

    public final void A02(Context context, Uri uri, C29681ch r28, Integer num, Long l, String str, int i, long j) {
        Integer num2;
        Context context2 = context;
        C18070vi.A0d(context2, 0);
        AnonymousClass00H r5 = this.A09;
        if (C18020vd.A00(C18040vf.A02, ((AnonymousClass1c4) r5.get()).A02, 3877) == 1) {
            AnonymousClass4YQ r1 = (AnonymousClass4YQ) this.A04.get();
            C18070vi.A0X(r1);
            r1.A02(context2, AnonymousClass00R.A00);
        } else if (!((AnonymousClass1c4) r5.get()).A08()) {
            AnonymousClass4YQ r12 = (AnonymousClass4YQ) this.A04.get();
            C18070vi.A0X(r12);
            r12.A01(context2, uri, AnonymousClass00R.A00, false);
        } else {
            String str2 = str;
            if (C18070vi.A18(str2, "refresh")) {
                Object obj = this.A0B.get();
                C18070vi.A0X(obj);
                ((C35681md) obj).A0F(false);
                Uri uri2 = (Uri) this.A0H.getValue();
                C18070vi.A0X(uri2);
                ((AnonymousClass4YQ) this.A04.get()).A00(context2, uri2);
                return;
            }
            Activity A002 = AnonymousClass1L9.A00(context2);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            AnonymousClass1FU r2 = (AnonymousClass1FU) A002;
            WeakReference weakReference = new WeakReference(r2);
            Integer num3 = num;
            int A003 = AnonymousClass4H6.A00(num3);
            C29681ch r122 = r28;
            C136516tw r11 = new C136516tw(r122, (Integer) null, str2, (String) null, (String) null, "NewsletterLinkLauncher", "in_app_link", A003, 0);
            Long l2 = l;
            long j2 = j;
            this.A01 = new C63242sk(num3, l2, j2);
            AnonymousClass749 r4 = (AnonymousClass749) this.A0E.get();
            AnonymousClass35C r15 = new AnonymousClass35C(r122, this, num3, l2, str2, weakReference, i, j2);
            C18070vi.A0d(r2, 0);
            Integer A032 = ((A6Q) r4.A0A.get()).A03(AnonymousClass6X2.A00(A003));
            if (A003 == 12) {
                num2 = AnonymousClass00R.A0C;
            } else {
                num2 = AnonymousClass00R.A01;
            }
            if (((Boolean) r4.A0H.getValue()).booleanValue()) {
                r4.A01 = r11;
                if (((C139966zj) r4.A0B.get()).A03()) {
                    r4.A06(AnonymousClass749.A0J, r2, 66004, true);
                } else {
                    AnonymousClass749.A03(r2, r4, AnonymousClass749.A01(r4, num2), 66004);
                }
            } else {
                AnonymousClass749.A02(r2, r15, r4, num2, A032);
            }
        }
    }

    public final void A03(Context context, Uri uri, boolean z) {
        AnonymousClass1FU r3;
        int i;
        C18070vi.A0d(context, 0);
        AnonymousClass00H r4 = this.A09;
        C18030ve r32 = ((AnonymousClass1c4) r4.get()).A02;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A00(r1, r32, 3877) == 1 || C18020vd.A00(r1, r32, 3879) == 1) {
            ((AnonymousClass4YQ) this.A04.get()).A02(context, AnonymousClass00R.A0C);
        } else if (!((AnonymousClass1c4) r4.get()).A07()) {
            AnonymousClass4YQ r12 = (AnonymousClass4YQ) this.A04.get();
            C18070vi.A0X(r12);
            r12.A01(context, uri, AnonymousClass00R.A0C, false);
        } else {
            Activity A002 = AnonymousClass1L9.A00(context);
            if ((A002 instanceof AnonymousClass1FU) && (r3 = (AnonymousClass1FU) A002) != null) {
                if (z) {
                    ((AnonymousClass74D) this.A0A.get()).A08(5);
                    i = 4;
                } else {
                    i = 3;
                }
                ((AnonymousClass74D) this.A0A.get()).A09(i, ((C133836pa) this.A0J.get()).A00());
                AnonymousClass749 r2 = (AnonymousClass749) this.A0E.get();
                C18070vi.A0X(r2);
                r2.A0A(r3, (String) null, (String) null, -1, true);
            }
        }
    }

    public final void A04(Context context, C29681ch r12, Integer num, int i, long j) {
        C18070vi.A0d(context, 0);
        A02(context, (Uri) null, r12, num, (Long) null, (String) null, i, j);
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void BrH(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C6E() {
    }

    public void C71(AnonymousClass1F9 r2) {
        AnonymousClass1FU r22;
        C18070vi.A0d(r2, 0);
        if ((r2 instanceof AnonymousClass1FU) && (r22 = (AnonymousClass1FU) r2) != null) {
            A05(r22);
        }
    }

    public /* synthetic */ void C8S(AnonymousClass1FU r1) {
    }

    public /* synthetic */ void C8T(AnonymousClass1FU r1) {
    }

    public final void A05(AnonymousClass1FU r2) {
        C107095Yj r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            A06(r2);
            this.A06.get();
            try {
                r2.CEx();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
        }
    }

    public void C8R(AnonymousClass1FU r18, C136516tw r19) {
        String str;
        C63242sk r1 = this.A01;
        this.A01 = null;
        C136516tw r3 = r19;
        String str2 = r3.A08;
        AnonymousClass1FU r7 = r18;
        if (C18070vi.A18(str2, "admin_invite_tos")) {
            C29681ch r6 = r3.A02;
            if (r6 != null && (str = r3.A06) != null) {
                long j = r3.A01;
                ((C219117w) this.A05.get()).A01(C217417f.class);
                C20098A7b.A02(AnonymousClass4HA.A00(r6, str, j, true), r7.A03.A00.A03);
            }
        } else if (!C18070vi.A18(str2, "in_app_link")) {
            StringBuilder sb = new StringBuilder();
            sb.append("type not handled: ");
            sb.append(str2);
            Log.e(sb.toString());
        } else if (r1 != null) {
            String str3 = r3.A04;
            C29681ch r8 = r3.A02;
            long j2 = r1.A00;
            Integer num = r1.A01;
            if (num == null) {
                num = AnonymousClass00R.A00;
            }
            A00(r7, r8, this, num, r3.A03, r1.A02, str3, 0, j2);
        }
    }

    public static final void A00(Context context, C29681ch r13, C36341nj r14, Integer num, Integer num2, Long l, String str, int i, long j) {
        Activity A002 = AnonymousClass1L9.A00(context);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        AnonymousClass1FU r4 = (AnonymousClass1FU) A002;
        C36341nj r6 = r14;
        if (!((AnonymousClass11E) r14.A0I.get()).A09()) {
            r4.BhQ(2131892439);
            return;
        }
        r4.getLifecycle().A05(r14);
        C53602cn r3 = new C53602cn(r4);
        r4.A3k(new C64202uO(r4, r3, r14), 0, 2131891797);
        boolean z = false;
        if (num == AnonymousClass00R.A0Y) {
            z = true;
        }
        C96884oZ r5 = new C96884oZ(r4, r14, r14.A0J, num);
        C107095Yj r0 = r14.A00;
        if (r0 != null) {
            r0.cancel();
        }
        ((AnonymousClass10I) r14.A0G.get()).CGF(new C21435Ak2(r14, r3, new AnonymousClass3I3(r13, new C96874oY(r5, r6, num2, l, i, j), r14, str, z), 4));
    }

    public final void A06(AnonymousClass1FU r2) {
        try {
            r2.getLifecycle().A06(this);
        } catch (Throwable th) {
            C30691eM.A00(th);
        }
    }
}
