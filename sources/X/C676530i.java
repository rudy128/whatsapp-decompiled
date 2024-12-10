package X;

import android.app.ActivityManager;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.30i  reason: invalid class name and case insensitive filesystem */
public class C676530i implements AnonymousClass1WR {
    public final AnonymousClass1KB A00;
    public final C60142nS A01;
    public final C26811To A02;
    public final AnonymousClass1M9 A03;
    public final C24671Lf A04;
    public final AnonymousClass12E A05;
    public final AnonymousClass1M4 A06;
    public final AnonymousClass122 A07;
    public final C24681Lg A08;
    public final C18030ve A09;
    public final C32571hP A0A;
    public final C33581j3 A0B;
    public final C32681ha A0C;
    public final AnonymousClass1N9 A0D;
    public final C61752qC A0E;
    public final C54422e7 A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final C19880zA A0R;
    public final C19880zA A0S;
    public final C19880zA A0T;
    public final C216316u A0U = ((C216316u) C221618v.A02(C216316u.class));
    public final AnonymousClass11S A0V;
    public final C25311Ns A0W;
    public final C32791hl A0X;
    public final C32951i1 A0Y;
    public final AnonymousClass1RW A0Z;
    public final C29781cr A0a;
    public final AnonymousClass118 A0b;
    public final C19830z4 A0c;
    public final C55262fU A0d;
    public final C27131Uv A0e;
    public final C32431hB A0f;
    public final C26061Qr A0g;
    public final C32781hk A0h;
    public final C29791cs A0i;
    public final C203911y A0j;
    public final C32291gx A0k;
    public final C33391ik A0l;
    public final AnonymousClass72F A0m;
    public final C31041ev A0n;
    public final C26241Rj A0o;
    public final C25981Qj A0p;
    public final AnonymousClass1R0 A0q;
    public final C36331ni A0r;
    public final C27231Vg A0s;
    public final C61412pe A0t;
    public final C25081Mu A0u;
    public final AnonymousClass00H A0v;
    public final AnonymousClass00H A0w;
    public final AnonymousClass00H A0x;
    public final AnonymousClass00H A0y;
    public final AnonymousClass00H A0z;
    public final AnonymousClass00H A10;
    public final AnonymousClass00H A11;
    public final AnonymousClass00H A12;
    public final AnonymousClass00H A13;
    public final AnonymousClass00H A14;
    public final AnonymousClass00H A15;
    public final AnonymousClass00H A16;
    public final AnonymousClass00H A17;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public void ByZ(AnonymousClass1BI r1) {
    }

    public void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    private void A00(long j) {
        String A0t2;
        AnonymousClass00H r3 = this.A13;
        if (!((C54512eG) r3.get()).A02 && j > 900000 && this.A0i.A03()) {
            RegistrationIntentService.A01(this.A0b.A00, this.A0u);
            try {
                ActivityManager A042 = this.A0a.A00.A04();
                if (A042 == null) {
                    A0t2 = "app/logprocess am=null";
                } else {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A042.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (TextUtils.equals(next.processName, "com.google.process.gapps")) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("app/logprocess/procinfo ");
                                A102.append(next.processName);
                                A102.append(' ');
                                A0t2 = C17880vN.A0t(A102, next.pid);
                                break;
                            }
                        }
                    }
                    ((C54512eG) r3.get()).A02 = true;
                }
                Log.i(A0t2);
            } catch (Exception e) {
                Log.w("app/logprocess/error", e);
            }
            ((C54512eG) r3.get()).A02 = true;
        }
    }

    private void A01(AnonymousClass206 r9) {
        AEX A042;
        C18030ve r1 = this.A09;
        C18040vf r2 = C18040vf.A02;
        if ((C18020vd.A05(r2, r1, 605) || C18020vd.A05(r2, r1, 629)) && AnonymousClass25B.A00(r9) != null && (A042 = AnonymousClass25B.A00(r9).A04()) != null) {
            AnonymousClass72F r7 = this.A0m;
            if (!C18020vd.A05(r2, r7.A05, 1084) || A042.A01(r7.A00.A0H()).exists()) {
                C19830z4 r5 = r7.A02;
                if (r5.A0W("payment_backgrounds_batch_last_fetch_timestamp") == -1) {
                    C17890vO.A0u(new AnonymousClass6MS((C145207Kj) null, r7), r7.A0C);
                } else if (!A042.A01(r7.A00.A0H()).exists()) {
                    C17880vN.A1F(C19830z4.A00(r5), "payment_background_batch_require_fetch", true);
                }
            } else {
                r7.A0B.A03(A042, (AnonymousClass2L3) r7.A0D.get());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        if (X.AnonymousClass1c4.A00(r1, 3) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00af
            X.10I r2 = r6.A0G
            r1 = 32
            X.3Cf r0 = new X.3Cf
            r0.<init>(r6, r7, r1)
            r2.CGF(r0)
        L_0x0010:
            X.10I r2 = r6.A0G
            r0 = 36
            A04(r2, r6, r7, r0)
            boolean r5 = r7 instanceof X.AnonymousClass21K
            if (r5 == 0) goto L_0x003d
            r0 = r7
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r1 = r0.BPK()
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x003d
            X.AEn r0 = r1.A02
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x003d
            r0 = 34
            A04(r2, r6, r7, r0)
        L_0x003d:
            X.0ve r4 = r6.A09
            r0 = 11527(0x2d07, float:1.6153E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0071
            boolean r0 = r7 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x0071
            if (r5 == 0) goto L_0x0071
            r0 = r7
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r1 = r0.BPK()
            if (r1 == 0) goto L_0x0071
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0071
            X.AEE r0 = r1.A05
            if (r0 == 0) goto L_0x0071
            X.AEi r0 = r0.A00
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0071
            r0 = 35
            A04(r2, r6, r7, r0)
        L_0x0071:
            X.00H r0 = r6.A0P
            java.lang.Object r1 = r0.get()
            X.1MB r1 = (X.AnonymousClass1MB) r1
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00ae
            X.2mc r1 = r7.A0P
            if (r1 == 0) goto L_0x00ae
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x00ae
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ae
            X.2mc r0 = r7.A0P
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "no_ticket_created"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ae
            r0 = 9942(0x26d6, float:1.3932E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x00ae
            r0 = 33
            A04(r2, r6, r7, r0)
        L_0x00ae:
            return
        L_0x00af:
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00ed
            X.0ve r1 = r6.A09
            boolean r2 = X.C18070vi.A16(r1, r7)
            X.36w r0 = X.C60502o8.A00(r7)
            if (r0 != 0) goto L_0x00c5
            X.36w r0 = X.C50372Ue.A00(r1, r7)
            if (r0 == 0) goto L_0x00ed
        L_0x00c5:
            boolean r0 = r7.A0w()
            if (r0 == 0) goto L_0x00e0
            X.00H r0 = r6.A0M
            java.lang.Object r1 = r0.get()
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            boolean r0 = X.AnonymousClass1c4.A00(r1, r2)
            if (r0 != 0) goto L_0x00e0
            r0 = 3
            boolean r0 = X.AnonymousClass1c4.A00(r1, r0)
            if (r0 == 0) goto L_0x0010
        L_0x00e0:
            X.1ha r1 = r6.A0C
            boolean r0 = X.C32681ha.A02(r1, r7)
            if (r0 == 0) goto L_0x0010
            X.C32681ha.A00(r1, r7)
            goto L_0x0010
        L_0x00ed:
            boolean r0 = X.C20120A8f.A07(r7)
            if (r0 == 0) goto L_0x0010
            r0 = r7
            X.21L r0 = (X.AnonymousClass21L) r0
            java.util.List r0 = r0.A17()
            java.util.Iterator r1 = r0.iterator()
        L_0x00fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            X.206 r0 = X.C17880vN.A0Y(r1)
            r6.A02(r0)
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676530i.A02(X.206):void");
    }

    private void A03(AnonymousClass206 r7) {
        C58362kZ r2;
        C21459AkQ akQ;
        String str;
        AnonymousClass205 r0 = r7.A0v;
        AnonymousClass1BI r5 = r0.A00;
        String str2 = r7.A16;
        UserJid A0I2 = r7.A0I();
        if (r0.A02) {
            if (C22971Dz.A0U(r5) && (str = r7.A15) != null) {
                r2 = (C58362kZ) this.A0I.get();
                akQ = new C21459AkQ(this, r5, str, 12);
            } else {
                return;
            }
        } else if (C22971Dz.A0T(A0I2) && r7.A0J == C49502Qs.USERNAME) {
            if (str2 == null) {
                str2 = "";
            }
            r2 = (C58362kZ) this.A0I.get();
            akQ = new C21459AkQ(this, A0I2, str2, 12);
        } else {
            return;
        }
        r2.A01(akQ);
    }

    public static void A04(AnonymousClass10I r1, Object obj, Object obj2, int i) {
        r1.CGF(new C70713Cf(obj, obj2, i));
    }

    public static boolean A05(AnonymousClass206 r3) {
        if (r3 instanceof AnonymousClass2ME) {
            AnonymousClass2ME r32 = (AnonymousClass2ME) r3;
            int i = r32.A00;
            if (i == 65 || i == 66 || !r32.A01) {
                return true;
            }
            return false;
        } else if (!(r3 instanceof C436420i) || ((C436420i) r3).A00 != 42) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031c, code lost:
        if (r19.get() == false) goto L_0x031e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByH(X.AnonymousClass206 r21, int r22) {
        /*
            r20 = this;
            r8 = r21
            r0 = 29
            r2 = r22
            if (r2 == r0) goto L_0x0515
            if (r21 == 0) goto L_0x01b8
            X.205 r0 = r8.A0v
            X.1BI r7 = r0.A00
        L_0x000e:
            r6 = 1
            r5 = r20
            if (r21 == 0) goto L_0x0337
            int r4 = r8.A0u
            r0 = 8
            if (r4 == r0) goto L_0x0337
            r10 = 10
            if (r4 == r10) goto L_0x0337
            r0 = 90
            if (r4 == r0) goto L_0x0337
            boolean r0 = X.AnonymousClass25A.A0p(r8)
            if (r0 != 0) goto L_0x0337
            r3 = 0
            boolean r0 = X.C22971Dz.A0V(r7)
            if (r0 == 0) goto L_0x004a
            X.1RW r0 = r5.A0Z
            X.1RX r0 = r0.A00()
            boolean r0 = r0.A01(r7)
            if (r0 == 0) goto L_0x004a
            X.1hl r0 = r5.A0X
            r14 = 3
            r17 = 0
            r15 = r6
            r16 = r6
            r11 = r0
            r12 = r7
            r13 = r6
            r18 = r17
            r11.A01(r12, r13, r14, r15, r16, r17, r18)
        L_0x004a:
            X.00H r0 = r5.A11
            java.lang.Object r13 = r0.get()
            X.4aI r13 = (X.C88654aI) r13
            com.whatsapp.jid.UserJid r12 = r8.A0I()
            X.205 r9 = r8.A0v
            boolean r11 = r9.A02
            if (r11 == 0) goto L_0x0078
            int r1 = r8.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x0078
            boolean r0 = r8.A17
            if (r0 == 0) goto L_0x01a7
            X.Abv r0 = X.C60532oB.A00(r8)
            if (r0 == 0) goto L_0x01a4
            boolean r0 = r0.A00
            if (r0 != r6) goto L_0x01a4
            java.lang.String r1 = "agm"
        L_0x0073:
            r0 = 16
            X.C88654aI.A03(r13, r12, r1, r0, r6)
        L_0x0078:
            X.00H r0 = r5.A15
            java.lang.Object r12 = r0.get()
            X.72y r12 = (X.C1407672y) r12
            int r1 = r8.A0D()
            r0 = 13
            if (r1 != r0) goto L_0x009c
            if (r11 != 0) goto L_0x009c
            boolean r0 = X.C1408773k.A03(r8)
            if (r0 == 0) goto L_0x009c
            r18 = 5
            r15 = r3
            r16 = r3
            r17 = r3
            r13 = r8
            r14 = r3
            X.C1407672y.A01(r12, r13, r14, r15, r16, r17, r18)
        L_0x009c:
            X.00H r0 = r5.A0v
            X.1gM r3 = X.C17880vN.A0L(r0)
            r1 = 45
            X.DTg r0 = new X.DTg
            r0.<init>(r7, r5, r8, r1)
            r3.A01(r0, r10)
            X.0ve r3 = r5.A09
            r1 = 4652(0x122c, float:6.519E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00c8
            X.36g r3 = X.AnonymousClass2UY.A00(r8)
            if (r3 == 0) goto L_0x00c8
            X.10I r1 = r5.A0G
            X.2PR r0 = new X.2PR
            r0.<init>(r5, r3, r8)
            X.C17890vO.A0u(r0, r1)
        L_0x00c8:
            r10 = 0
            if (r11 != 0) goto L_0x0363
            X.11S r0 = r5.A0V
            boolean r0 = X.AnonymousClass25A.A0R(r0, r8)
            if (r0 != 0) goto L_0x0363
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A0I
            long r2 = r2 - r0
            X.16u r0 = r5.A0U
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            r19 = r0
            X.00H r0 = r5.A13
            r0.get()
            X.1BI r0 = r8.A0H()
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A00(r0)
            X.1Rj r1 = r5.A0o
            int r0 = r1.A06(r7, r12)
            if (r0 < 0) goto L_0x0103
            r1.A0C(r7, r12)
            X.00H r0 = r5.A10
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            r0.A00(r7)
        L_0x0103:
            X.1BI r11 = r9.A00
            java.lang.String r0 = r8.A0e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0190
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgadded/from_name is empty  jid:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " message:"
            X.C17900vP.A0Z(r9, r0, r1)
        L_0x011e:
            java.lang.String r13 = r8.A0Y
            com.whatsapp.jid.UserJid r11 = r8.A0I()
            if (r13 == 0) goto L_0x013c
            boolean r0 = r11 instanceof X.AnonymousClass1E1
            if (r0 == 0) goto L_0x013c
            X.00H r0 = r5.A0I
            java.lang.Object r9 = r0.get()
            X.2kZ r9 = (X.C58362kZ) r9
            r1 = 11
            X.AkQ r0 = new X.AkQ
            r0.<init>(r5, r11, r13, r1)
            r9.A01(r0)
        L_0x013c:
            r5.A03(r8)
            X.00H r0 = r5.A0z
            java.lang.Object r14 = r0.get()
            X.2fW r14 = (X.C55282fW) r14
            X.1BI r13 = r8.A0H()
            boolean r0 = r13 instanceof X.AnonymousClass1E2
            r1 = 0
            if (r0 == 0) goto L_0x0166
            X.1E2 r13 = (X.AnonymousClass1E2) r13
            if (r13 == 0) goto L_0x0166
            X.2Qs r0 = r8.A0J
            if (r0 == 0) goto L_0x0166
            X.1OX r11 = r14.A04
            com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1 r9 = new com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1
            r9.<init>(r0, r14, r13, r1)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r1, r9, r11)
        L_0x0166:
            r5.A02(r8)
            r5.A01(r8)
            X.206 r0 = r8.A0K()
            if (r0 == 0) goto L_0x0175
            r5.A01(r0)
        L_0x0175:
            boolean r0 = r8 instanceof X.AnonymousClass21D
            if (r0 == 0) goto L_0x0254
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 != 0) goto L_0x0183
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A01(r7)
        L_0x0183:
            if (r12 == 0) goto L_0x0254
            r0 = r8
            X.21D r0 = (X.AnonymousClass21D) r0
            int r13 = r0.A00
            long r0 = r0.A01
            X.1ik r11 = r5.A0l
            monitor-enter(r11)
            goto L_0x01bb
        L_0x0190:
            X.00H r0 = r5.A0I
            java.lang.Object r9 = r0.get()
            X.2kZ r9 = (X.C58362kZ) r9
            r1 = 44
            X.DTg r0 = new X.DTg
            r0.<init>(r11, r5, r8, r1)
            r9.A01(r0)
            goto L_0x011e
        L_0x01a4:
            r1 = 0
            goto L_0x0073
        L_0x01a7:
            r0 = 1024(0x400, double:5.06E-321)
            boolean r1 = r8.A11(r0)
            r0 = 15
            if (r1 == 0) goto L_0x01b3
            r0 = 14
        L_0x01b3:
            X.C88654aI.A03(r13, r12, r3, r0, r6)
            goto L_0x0078
        L_0x01b8:
            r7 = 0
            goto L_0x000e
        L_0x01bb:
            X.1QS r9 = r11.A06     // Catch:{ all -> 0x0250 }
            X.BD1 r9 = r9.A06()     // Catch:{ all -> 0x0250 }
            X.9fe r14 = r9.BWj()     // Catch:{ all -> 0x0250 }
            X.1QO r9 = r11.A05     // Catch:{ all -> 0x0250 }
            r18 = r9
            boolean r9 = r18.A03()     // Catch:{ all -> 0x0250 }
            if (r9 == 0) goto L_0x01d2
            if (r14 == 0) goto L_0x01d2
            goto L_0x0220
        L_0x01d2:
            X.1QD r13 = r11.A03     // Catch:{ all -> 0x0250 }
            android.content.SharedPreferences r14 = r13.A03()     // Catch:{ all -> 0x0250 }
            java.lang.String r15 = "payments_inviter_jids_with_expiry"
            java.lang.String r9 = ""
            java.lang.String r9 = r14.getString(r15, r9)     // Catch:{ all -> 0x0250 }
            java.util.HashMap r14 = X.AnonymousClass1QD.A02(r13, r9)     // Catch:{ all -> 0x0250 }
            java.lang.Object r9 = r14.get(r12)     // Catch:{ all -> 0x0250 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0250 }
            if (r9 == 0) goto L_0x01f4
            long r16 = r9.longValue()     // Catch:{ all -> 0x0250 }
            int r9 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0206
        L_0x01f4:
            X.C17880vN.A1N(r12, r14, r0)     // Catch:{ all -> 0x0250 }
            android.content.SharedPreferences r9 = r13.A03()     // Catch:{ all -> 0x0250 }
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x0250 }
            java.lang.String r14 = X.AnonymousClass1QD.A01(r14)     // Catch:{ all -> 0x0250 }
            X.C17880vN.A1E(r9, r15, r14)     // Catch:{ all -> 0x0250 }
        L_0x0206:
            boolean r9 = r18.A03()     // Catch:{ all -> 0x0250 }
            if (r9 != 0) goto L_0x022b
            X.11P r9 = r11.A00     // Catch:{ all -> 0x0250 }
            long r14 = X.AnonymousClass11P.A01(r9)     // Catch:{ all -> 0x0250 }
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x021c
            r0 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r0 = r0 + r14
        L_0x021c:
            r13.A0E(r10, r0)     // Catch:{ all -> 0x0250 }
            goto L_0x022b
        L_0x0220:
            X.1QL r9 = r14.A02     // Catch:{ all -> 0x0250 }
            boolean r9 = r9.A0D()     // Catch:{ all -> 0x0250 }
            if (r9 == 0) goto L_0x01d2
            X.C33391ik.A00(r12, r11, r13, r10)     // Catch:{ all -> 0x0250 }
        L_0x022b:
            X.1ex r0 = r11.A04     // Catch:{ all -> 0x0250 }
            X.1ev r0 = r0.A0C     // Catch:{ all -> 0x0250 }
            X.1es r13 = r0.A02     // Catch:{ all -> 0x0250 }
            java.lang.String r14 = r12.getRawString()     // Catch:{ all -> 0x0250 }
            monitor-enter(r13)     // Catch:{ all -> 0x0250 }
            X.1er r12 = r13.A01     // Catch:{ all -> 0x024d }
            X.2tF r9 = r12.A00()     // Catch:{ all -> 0x024d }
            long r0 = r9.A00     // Catch:{ all -> 0x024d }
            r15 = 1
            long r0 = r0 + r15
            r9.A00 = r0     // Catch:{ all -> 0x024d }
            java.util.Set r0 = r9.A0E     // Catch:{ all -> 0x024d }
            r0.add(r14)     // Catch:{ all -> 0x024d }
            r12.A01(r9)     // Catch:{ all -> 0x024d }
            monitor-exit(r13)     // Catch:{ all -> 0x0250 }
            goto L_0x0253
        L_0x024d:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0250 }
            throw r0     // Catch:{ all -> 0x0250 }
        L_0x0250:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0253:
            monitor-exit(r11)
        L_0x0254:
            X.206 r0 = r8.A0K()
            boolean r0 = r0 instanceof X.C441322g
            if (r0 == 0) goto L_0x0261
            X.2nS r0 = r5.A01
            r0.A01(r8)
        L_0x0261:
            boolean r0 = r8 instanceof X.AnonymousClass219
            if (r0 == 0) goto L_0x026c
            X.10I r1 = r5.A0G
            r0 = 37
            A04(r1, r5, r8, r0)
        L_0x026c:
            boolean r0 = r8 instanceof X.AnonymousClass2ME
            if (r0 == 0) goto L_0x0334
            boolean r1 = A05(r8)
        L_0x0274:
            boolean r0 = r8.A0m
            if (r0 == 0) goto L_0x02ea
            java.lang.Integer r0 = r8.A0R
            if (r0 == 0) goto L_0x0286
            r5.A00(r2)
            boolean r0 = r19.get()
            if (r0 == 0) goto L_0x0286
            r10 = 1
        L_0x0286:
            r0 = r19
            r0.set(r6)
            if (r10 != 0) goto L_0x02c9
            X.1gx r0 = r5.A0k
            r0.A09(r7)
            X.1Qr r1 = r5.A0g
            java.lang.Integer r0 = r8.A0S
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x02c9
            X.0z4 r0 = r5.A0c
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L_0x02c9
            java.lang.Class<X.36b> r0 = X.C691436b.class
            X.229 r0 = X.AnonymousClass206.A01(r8, r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x02c9
            X.1Vg r2 = r5.A0s
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C19620yd.A04
            r1.append(r0)
            r0 = 2132017176(0x7f140018, float:1.9672623E38)
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A02(r0)
        L_0x02c9:
            X.00H r1 = r5.A16
            java.lang.Object r0 = r1.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            boolean r0 = r0.A06(r8)
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r1 = r1.get()
            X.70P r1 = (X.AnonymousClass70P) r1
            X.118 r0 = r5.A0b
            android.content.Context r0 = r0.A00
            r1.A03(r0, r8)
        L_0x02e4:
            X.10I r1 = r5.A0G
            r0 = 38
            goto L_0x0371
        L_0x02ea:
            if (r1 == 0) goto L_0x02f6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgadded/bloks_notification is true jid: "
            X.C17900vP.A0Z(r7, r0, r1)
            goto L_0x02c9
        L_0x02f6:
            X.1gx r9 = r5.A0k
            android.os.Handler r11 = r9.A03()
            r1 = 22
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r9, r7, r8, r1)
            r11.post(r0)
            boolean r0 = X.C20133A8t.A0A(r8)
            if (r0 != 0) goto L_0x02c9
            r0 = 2
            if (r4 != r0) goto L_0x032f
            int r0 = r8.A09
            if (r0 == r6) goto L_0x02c9
        L_0x0313:
            java.lang.Integer r0 = r8.A0R
            if (r0 == 0) goto L_0x031e
            boolean r1 = r19.get()
            r0 = 1
            if (r1 != 0) goto L_0x031f
        L_0x031e:
            r0 = 0
        L_0x031f:
            r9.A0C(r8, r0, r10)
            java.lang.Integer r0 = r8.A0R
            if (r0 == 0) goto L_0x02c9
            r0 = r19
            r0.set(r6)
            r5.A00(r2)
            goto L_0x02c9
        L_0x032f:
            r0 = 99
            if (r4 == r0) goto L_0x02c9
            goto L_0x0313
        L_0x0334:
            r1 = 0
            goto L_0x0274
        L_0x0337:
            boolean r0 = r8 instanceof X.AnonymousClass22O
            if (r0 != 0) goto L_0x0374
            boolean r0 = X.AnonymousClass25A.A0p(r8)
            if (r0 == 0) goto L_0x0374
            X.11S r0 = r5.A0V
            boolean r0 = X.AnonymousClass25A.A0N(r0, r8)
            if (r0 == 0) goto L_0x035d
            X.1gx r3 = r5.A0k
            android.os.Handler r2 = r3.A03()
            r1 = 22
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r3, r7, r8, r1)
            r2.post(r0)
            r3.A0C(r8, r6, r6)
            goto L_0x0374
        L_0x035d:
            X.11y r0 = r5.A0j
            r0.A01(r8)
            goto L_0x0374
        L_0x0363:
            boolean r0 = r8.A19
            if (r0 == 0) goto L_0x03b1
            r5.A02(r8)
            r5.A03(r8)
            X.10I r1 = r5.A0G
            r0 = 39
        L_0x0371:
            A04(r1, r5, r8, r0)
        L_0x0374:
            boolean r0 = r8 instanceof X.AnonymousClass224
            if (r0 == 0) goto L_0x04a8
            r3 = r8
            X.224 r3 = (X.AnonymousClass224) r3
            X.206 r0 = r3.A0K()
            if (r0 == 0) goto L_0x04a8
            X.2nS r2 = r5.A01
            X.205 r0 = r0.A0v
            X.206 r4 = r2.A00(r0)
            boolean r0 = r4 instanceof X.C439421n
            if (r0 == 0) goto L_0x0476
            r0 = r4
            X.21n r0 = (X.C439421n) r0
            X.2k6 r0 = r0.BaE()
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x049c
            java.util.Iterator r10 = r0.iterator()
        L_0x039c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x049c
            java.lang.Object r9 = r10.next()
            X.2qD r9 = (X.C61762qD) r9
            int r1 = r9.A06
            int r0 = r3.A00
            if (r1 != r0) goto L_0x039c
            r9.A04 = r6
            goto L_0x039c
        L_0x03b1:
            r0 = -1
            r3 = 6
            if (r2 == r0) goto L_0x03b8
            r0 = 7
            if (r2 != r0) goto L_0x03c3
        L_0x03b8:
            int r0 = r8.A0D()
            if (r0 == r3) goto L_0x03c3
            X.11y r0 = r5.A0j
            r0.A01(r8)
        L_0x03c3:
            X.1Qj r0 = r5.A0p
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x03d5
            boolean r0 = r8.A0m
            if (r0 != 0) goto L_0x03d5
            boolean r0 = X.AnonymousClass25A.A0q(r8)
            if (r0 == 0) goto L_0x03e3
        L_0x03d5:
            r0 = 16
            if (r2 != r0) goto L_0x03f6
            boolean r0 = r8 instanceof X.C436420i
            if (r0 == 0) goto L_0x03f6
            boolean r0 = A05(r8)
            if (r0 != 0) goto L_0x03f6
        L_0x03e3:
            X.1gx r4 = r5.A0k
            android.os.Handler r2 = r4.A03()
            r1 = 22
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r4, r7, r8, r1)
            r2.post(r0)
            r4.A0C(r8, r10, r6)
        L_0x03f6:
            X.2pe r10 = r5.A0t
            r0 = 81
            boolean r0 = X.C61412pe.A00(r8, r10, r0)
            if (r0 != 0) goto L_0x0471
            r0 = 82
            boolean r0 = X.C61412pe.A00(r8, r10, r0)
            if (r0 != 0) goto L_0x0471
            r0 = 173(0xad, float:2.42E-43)
            boolean r0 = X.C61412pe.A00(r8, r10, r0)
            if (r0 == 0) goto L_0x0417
            X.10I r1 = r5.A0G
            r0 = 41
        L_0x0414:
            A04(r1, r5, r8, r0)
        L_0x0417:
            boolean r0 = r8 instanceof X.C48392Mh
            if (r0 == 0) goto L_0x0444
            r4 = r8
            X.2Mh r4 = (X.C48392Mh) r4
            int r9 = r4.A00
            r0 = 145(0x91, float:2.03E-43)
            if (r9 != r0) goto L_0x043c
            java.util.List r0 = r4.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x042a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0469
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.11S r0 = r10.A00
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x042a
        L_0x043c:
            X.2rV r1 = r4.A03
            if (r1 == 0) goto L_0x0459
            r0 = 0
            X.C62502rV.A00(r0, r1, r0)
        L_0x0444:
            boolean r0 = r8 instanceof X.C441322g
            if (r0 == 0) goto L_0x0374
            X.10I r2 = r5.A0G
            r0 = 43
            X.3Cf r1 = new X.3Cf
            r1.<init>(r5, r8, r0)
            java.lang.String r0 = "serial_worker_sticker_message"
            r2.CGS(r1, r0)
            goto L_0x0374
        L_0x0459:
            if (r9 != r3) goto L_0x0444
            X.00H r0 = r5.A14
            X.1OZ r1 = X.C17880vN.A0U(r0)
            X.2nR r0 = X.C49832Sc.A00(r4)
            r1.A0K(r0)
            goto L_0x0444
        L_0x0469:
            X.10I r1 = r5.A0G
            r0 = 42
            A04(r1, r5, r8, r0)
            goto L_0x043c
        L_0x0471:
            X.10I r1 = r5.A0G
            r0 = 40
            goto L_0x0414
        L_0x0476:
            boolean r0 = X.C20120A8f.A07(r4)
            if (r0 == 0) goto L_0x04a1
            java.lang.Integer r0 = r3.A03
            int r0 = r0.intValue()
            X.206 r0 = X.C20120A8f.A01(r4, r0)
            if (r0 == 0) goto L_0x04a1
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r0 = r0.BPK()
            X.AEk r0 = r0.A06
            java.util.List r1 = r0.A03
            int r0 = r3.A00
            java.lang.Object r0 = r1.get(r0)
            X.ADl r0 = (X.C20253ADl) r0
            r0.A00 = r6
        L_0x049c:
            X.122 r0 = r5.A07
            r0.CQw(r4)
        L_0x04a1:
            boolean r0 = r3.A19
            if (r0 == 0) goto L_0x04a8
            r2.A01(r3)
        L_0x04a8:
            boolean r0 = X.C20133A8t.A0A(r8)
            if (r0 == 0) goto L_0x04b3
            X.1ni r0 = r5.A0r
            r0.A01(r8, r6)
        L_0x04b3:
            boolean r0 = r8 instanceof X.C442822v
            if (r0 != 0) goto L_0x04bb
            boolean r0 = r8 instanceof X.AnonymousClass2MA
            if (r0 == 0) goto L_0x04c6
        L_0x04bb:
            X.00H r0 = r5.A10
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            r0.A00(r7)
        L_0x04c6:
            boolean r0 = r8 instanceof X.AnonymousClass21T
            if (r0 == 0) goto L_0x0515
            X.21T r8 = (X.AnonymousClass21T) r8
            X.206 r2 = r8.A0K()
            if (r2 == 0) goto L_0x0515
            r0 = 8
            boolean r0 = r2.A0z(r0)
            if (r0 == 0) goto L_0x0515
            X.2nS r1 = r5.A01
            X.205 r0 = r2.A0v
            X.206 r4 = r1.A00(r0)
            if (r4 == 0) goto L_0x0515
            X.2b7 r0 = r4.A0L()
            X.9rz r0 = r0.A00
            if (r0 == 0) goto L_0x0515
            X.2b7 r0 = r4.A0L()
            X.9rz r0 = r0.A00
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x04f8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0510
            java.lang.Object r2 = r3.next()
            X.9t8 r2 = (X.C195309t8) r2
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r8.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04f8
            r2.A00 = r6
        L_0x0510:
            X.122 r0 = r5.A07
            r0.CQw(r4)
        L_0x0515:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676530i.ByH(X.206, int):void");
    }

    public void Bz9(AnonymousClass206 r1) {
        A02(r1);
    }

    public C676530i(C19880zA r2, C19880zA r3, C19880zA r4, AnonymousClass1KB r5, C60142nS r6, AnonymousClass11S r7, C25311Ns r8, C26811To r9, AnonymousClass1M9 r10, C24671Lf r11, AnonymousClass12E r12, C32791hl r13, C32951i1 r14, AnonymousClass1RW r15, C29781cr r16, AnonymousClass118 r17, C19830z4 r18, C55262fU r19, AnonymousClass1M4 r20, AnonymousClass122 r21, C24681Lg r22, C18030ve r23, C27131Uv r24, C32571hP r25, C33581j3 r26, C32431hB r27, C32681ha r28, C26061Qr r29, C32781hk r30, C29791cs r31, AnonymousClass1N9 r32, C203911y r33, C61752qC r34, C32291gx r35, C33391ik r36, AnonymousClass72F r37, C31041ev r38, C54422e7 r39, C26241Rj r40, C25981Qj r41, AnonymousClass1R0 r42, C36331ni r43, C27231Vg r44, C61412pe r45, C25081Mu r46, AnonymousClass10I r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55, AnonymousClass00H r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61, AnonymousClass00H r62, AnonymousClass00H r63, AnonymousClass00H r64, AnonymousClass00H r65, AnonymousClass00H r66, AnonymousClass00H r67, AnonymousClass00H r68, AnonymousClass00H r69, AnonymousClass00H r70) {
        Boolean bool = C17960vV.A01;
        this.A0b = r17;
        this.A09 = r23;
        this.A00 = r5;
        this.A0V = r7;
        this.A0G = r47;
        this.A02 = r9;
        this.A0D = r32;
        this.A0F = r39;
        this.A14 = r48;
        this.A03 = r10;
        this.A0u = r46;
        this.A0x = r49;
        this.A15 = r50;
        this.A17 = r51;
        this.A0I = r52;
        this.A13 = r53;
        this.A0M = r54;
        this.A0o = r40;
        this.A0s = r44;
        this.A04 = r11;
        this.A07 = r21;
        this.A12 = r55;
        this.A08 = r22;
        this.A0r = r43;
        this.A0z = r56;
        this.A0t = r45;
        this.A0B = r26;
        this.A16 = r57;
        this.A0a = r16;
        this.A0v = r58;
        this.A10 = r59;
        this.A05 = r12;
        this.A0j = r33;
        this.A0p = r41;
        this.A0A = r25;
        this.A0i = r31;
        this.A0k = r35;
        this.A0c = r18;
        this.A0f = r27;
        this.A0O = r60;
        this.A0q = r42;
        this.A0h = r30;
        this.A0C = r28;
        this.A0K = r61;
        this.A0e = r24;
        this.A0g = r29;
        this.A0L = r62;
        this.A0X = r13;
        this.A0y = r63;
        this.A0J = r64;
        this.A01 = r6;
        this.A0S = r2;
        this.A0n = r38;
        this.A0m = r37;
        this.A0W = r8;
        this.A0H = r65;
        this.A06 = r20;
        this.A0l = r36;
        this.A11 = r66;
        this.A0Z = r15;
        this.A0d = r19;
        this.A0E = r34;
        this.A0T = r3;
        this.A0R = r4;
        this.A0w = r67;
        this.A0Y = r14;
        this.A0P = r68;
        this.A0Q = r69;
        this.A0N = r70;
    }
}
