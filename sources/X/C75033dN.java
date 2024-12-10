package X;

import android.view.View;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3dN  reason: invalid class name and case insensitive filesystem */
public class C75033dN extends C87584Wd implements Runnable, B9K {
    public final int A00;
    public final AnonymousClass1NN A01;
    public final AnonymousClass126 A02;
    public final AnonymousClass1EC A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C75033dN(AnonymousClass1NN r9, AnonymousClass126 r10, AnonymousClass1EC r11, String str, List list, int i) {
        this(r9, r10, r11, str, list, i, true);
    }

    public void A00(Integer num) {
        String str;
        AnonymousClass4ZZ r2;
        C81313z2 A002;
        int i;
        View view;
        if (this instanceof AnonymousClass40h) {
            AnonymousClass4VI r4 = ((AnonymousClass40h) this).A00;
            if (!r4.A02.isFinishing() && (view = r4.A01) != null) {
                view.postDelayed(new C21355Aik(r4, 25), 300);
            }
            C107495Zx r1 = r4.A00;
            if (r1 != null) {
                r1.BpM(AnonymousClass000.A1X(num));
            }
            r4.A00 = null;
        } else if (this instanceof C819040l) {
            C819040l r5 = (C819040l) this;
            AnonymousClass4VH r3 = r5.A00;
            r3.A02.A0J(new C21355Aik(r3, 22));
            AnonymousClass4QS r42 = r3.A03;
            if (r42 == null) {
                return;
            }
            if (num != null) {
                r42.A00(r5.A01, r5.A02, 2);
                return;
            }
            UserJid userJid = r5.A01;
            Integer num2 = r5.A02;
            AnonymousClass4XS r22 = r42.A02;
            if (r22.A00.A0O(userJid) && num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 3) {
                    r2 = (AnonymousClass4ZZ) r22.A05.getValue();
                    A002 = AnonymousClass4ZZ.A00(r2);
                    i = 1;
                } else if (intValue == 4) {
                    r2 = (AnonymousClass4ZZ) r22.A05.getValue();
                    A002 = AnonymousClass4ZZ.A00(r2);
                    i = 4;
                } else {
                    return;
                }
                AnonymousClass4ZZ.A01(r2, A002, i);
            }
        } else if (this instanceof C818940k) {
            C818940k r43 = (C818940k) this;
            AnonymousClass4VH r32 = r43.A00;
            r32.A02.A0J(new C21355Aik(r32, 21));
            AnonymousClass4QS r33 = r32.A03;
            if (r33 != null && num != null) {
                r33.A00(r43.A01, r43.A02, 1);
            }
        } else if (this instanceof AnonymousClass40i) {
            AnonymousClass40i r12 = (AnonymousClass40i) this;
            r12.A00.A3e();
            r12.A01.run();
        } else if (this instanceof AnonymousClass40g) {
            ((AnonymousClass40g) this).A00.A3e();
        } else if (this instanceof AnonymousClass40j) {
            AnonymousClass40j r13 = (AnonymousClass40j) this;
            ExitGroupsDialogFragment exitGroupsDialogFragment = r13.A01;
            AnonymousClass1NN r0 = exitGroupsDialogFragment.A08;
            if (r0 != null) {
                AnonymousClass1EC r7 = r13.A02;
                r0.A03(r7, false);
                AnonymousClass1KB r23 = exitGroupsDialogFragment.A00;
                if (r23 != null) {
                    if (r13.A00 != 1) {
                        r23.A0J(new C70813Cp(7, (Object) r23, false));
                    }
                    C19830z4 r14 = exitGroupsDialogFragment.A05;
                    if (r14 != null) {
                        if (r14.A0N("privacy_groupadd") == 0) {
                            C19830z4 r02 = exitGroupsDialogFragment.A05;
                            if (r02 != null) {
                                if (r02.A0W("privacy_tip_exit_group_timestamp") == -1) {
                                    if (C18020vd.A05(C18040vf.A02, exitGroupsDialogFragment.A02, 3995)) {
                                        C19830z4 r03 = exitGroupsDialogFragment.A05;
                                        if (r03 != null) {
                                            C17880vN.A1E(C19830z4.A00(r03), "privacy_tip_exit_group_jid", r7.user);
                                            C19830z4 r04 = exitGroupsDialogFragment.A05;
                                            if (r04 != null) {
                                                r04.A1i("privacy_tip_exit_group_timestamp");
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    str = "waSharedPreferences";
                } else {
                    str = "globalUI";
                }
            } else {
                str = "conversationObservers";
            }
            C18070vi.A11(str);
            throw null;
        } else if (this instanceof AnonymousClass40R) {
            AnonymousClass4X6 r34 = ((AnonymousClass40R) this).A00;
            r34.A06.CGP(new C21355Aik(r34, 10));
        } else if (this instanceof AnonymousClass40S) {
            ((AnonymousClass40S) this).A00.A0E(num);
        } else if (this instanceof AnonymousClass40f) {
            AnonymousClass40f r35 = (AnonymousClass40f) this;
            if (num != null) {
                C77033p1 r24 = r35.A00;
                if (num.intValue() == 406) {
                    r24.A0r.A04(false);
                }
                r24.A0E.A0E(num);
            }
            AnonymousClass3MY.A1M(r35.A00.A0y, false);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        if (r11 != 403) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CGB(int r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass40h
            if (r0 == 0) goto L_0x001a
            r4 = r10
            X.40h r4 = (X.AnonymousClass40h) r4
            X.4VI r3 = r4.A00
            X.1KB r2 = r3.A03
            r1 = 10
            X.7RM r0 = new X.7RM
            r0.<init>((java.lang.Object) r3, (int) r11, (int) r1)
            r2.A0J(r0)
            r0 = 0
            r4.A00(r0)
            return
        L_0x001a:
            boolean r0 = r10 instanceof X.AnonymousClass40f
            if (r0 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupmgr/request failed : "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.1EC r3 = r10.A03
            r1.append(r3)
            r1.append(r0)
            int r9 = r10.A00
            r1.append(r9)
            X.C17890vO.A0w(r1)
            X.4tP r0 = r10.A01
            r0.cancel()
            r0 = 30
            r4 = 404(0x194, float:5.66E-43)
            r5 = 403(0x193, float:5.65E-43)
            r8 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r9 == r0) goto L_0x00ed
            r0 = 159(0x9f, float:2.23E-43)
            r7 = 3012(0xbc4, float:4.221E-42)
            r6 = 3011(0xbc3, float:4.22E-42)
            r2 = 3010(0xbc2, float:4.218E-42)
            if (r9 == r0) goto L_0x00d7
            r0 = 161(0xa1, float:2.26E-43)
            if (r9 == r0) goto L_0x00ca
            r0 = 213(0xd5, float:2.98E-43)
            if (r9 == r0) goto L_0x00d7
            r0 = 224(0xe0, float:3.14E-43)
            if (r9 == r0) goto L_0x00d7
            r0 = 91
            if (r9 == r0) goto L_0x00b7
            r0 = 92
            if (r9 == r0) goto L_0x00b7
            switch(r9) {
                case 15: goto L_0x0092;
                case 16: goto L_0x007e;
                case 17: goto L_0x0100;
                default: goto L_0x0070;
            }
        L_0x0070:
            X.1NN r1 = r10.A01
            r0 = 0
            r1.A03(r3, r0)
        L_0x0076:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r10.A00(r0)
            return
        L_0x007e:
            X.126 r2 = r10.A02
            switch(r11) {
                case 403: goto L_0x008f;
                case 404: goto L_0x008b;
                case 405: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            r0 = 2022(0x7e6, float:2.833E-42)
            goto L_0x0110
        L_0x0087:
            r0 = 2028(0x7ec, float:2.842E-42)
            goto L_0x0110
        L_0x008b:
            r0 = 2024(0x7e8, float:2.836E-42)
            goto L_0x0110
        L_0x008f:
            r0 = 2023(0x7e7, float:2.835E-42)
            goto L_0x0110
        L_0x0092:
            if (r11 == r8) goto L_0x00b2
            r0 = 408(0x198, float:5.72E-43)
            if (r11 == r0) goto L_0x00ad
            r0 = 429(0x1ad, float:6.01E-43)
            X.126 r2 = r10.A02
            if (r11 == r0) goto L_0x00aa
            if (r11 == r5) goto L_0x00a7
            r0 = 2013(0x7dd, float:2.821E-42)
            if (r11 == r4) goto L_0x0110
            r0 = 2010(0x7da, float:2.817E-42)
            goto L_0x0110
        L_0x00a7:
            r0 = 2012(0x7dc, float:2.82E-42)
            goto L_0x0110
        L_0x00aa:
            r0 = 3005(0xbbd, float:4.211E-42)
            goto L_0x0110
        L_0x00ad:
            X.126 r2 = r10.A02
            r0 = 3007(0xbbf, float:4.214E-42)
            goto L_0x0110
        L_0x00b2:
            X.126 r2 = r10.A02
            r0 = 2011(0x7db, float:2.818E-42)
            goto L_0x0110
        L_0x00b7:
            X.126 r2 = r10.A02
            if (r11 == r8) goto L_0x00c7
            if (r11 == r5) goto L_0x00c4
            r0 = 2021(0x7e5, float:2.832E-42)
            if (r11 == r4) goto L_0x0110
            r0 = 2018(0x7e2, float:2.828E-42)
            goto L_0x0110
        L_0x00c4:
            r0 = 2020(0x7e4, float:2.83E-42)
            goto L_0x0110
        L_0x00c7:
            r0 = 2019(0x7e3, float:2.829E-42)
            goto L_0x0110
        L_0x00ca:
            if (r11 == r8) goto L_0x00e7
            if (r11 == r5) goto L_0x00e1
            r0 = 405(0x195, float:5.68E-43)
            if (r11 != r0) goto L_0x00db
            X.126 r2 = r10.A02
            r0 = 3014(0xbc6, float:4.224E-42)
            goto L_0x0110
        L_0x00d7:
            if (r11 == r8) goto L_0x00e7
            if (r11 == r5) goto L_0x00e1
        L_0x00db:
            X.126 r0 = r10.A02
            r0.A0O(r7, r1)
            goto L_0x0070
        L_0x00e1:
            X.126 r0 = r10.A02
            r0.A0O(r6, r1)
            goto L_0x0070
        L_0x00e7:
            X.126 r0 = r10.A02
            r0.A0O(r2, r1)
            goto L_0x0070
        L_0x00ed:
            X.126 r2 = r10.A02
            if (r11 == r8) goto L_0x00fd
            if (r11 == r5) goto L_0x00fa
            r0 = 2017(0x7e1, float:2.826E-42)
            if (r11 == r4) goto L_0x0110
            r0 = 2014(0x7de, float:2.822E-42)
            goto L_0x0110
        L_0x00fa:
            r0 = 2016(0x7e0, float:2.825E-42)
            goto L_0x0110
        L_0x00fd:
            r0 = 2015(0x7df, float:2.824E-42)
            goto L_0x0110
        L_0x0100:
            if (r11 == r8) goto L_0x0118
            r0 = 406(0x196, float:5.69E-43)
            X.126 r2 = r10.A02
            if (r11 == r0) goto L_0x011d
            if (r11 == r5) goto L_0x0115
            r0 = 2008(0x7d8, float:2.814E-42)
            if (r11 == r4) goto L_0x0110
            r0 = 2005(0x7d5, float:2.81E-42)
        L_0x0110:
            r2.A0O(r0, r1)
            goto L_0x0070
        L_0x0115:
            r0 = 2007(0x7d7, float:2.812E-42)
            goto L_0x0110
        L_0x0118:
            X.126 r2 = r10.A02
            r0 = 2006(0x7d6, float:2.811E-42)
            goto L_0x0110
        L_0x011d:
            r1 = 2009(0x7d9, float:2.815E-42)
            java.lang.String r0 = r10.A04
            r2.A0O(r1, r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75033dN.CGB(int):void");
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("groupmgr/request success/");
        C17900vP.A0o(A10, this.A00);
        A00((Integer) null);
    }

    public C75033dN(AnonymousClass1NN r2, AnonymousClass126 r3, AnonymousClass1EC r4, String str, List list, int i, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i;
        this.A06 = z;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }
}
