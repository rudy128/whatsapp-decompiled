package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1VQ  reason: invalid class name */
public class AnonymousClass1VQ implements AnonymousClass1VP, C218917u {
    public long A00;
    public C19760yx A01;
    public final Handler A02;
    public final AnonymousClass195 A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass1HQ A07;
    public final AnonymousClass1VE A08;
    public final AnonymousClass1V9 A09;
    public final AnonymousClass1V7 A0A;
    public final AnonymousClass1VM A0B;
    public final AnonymousClass11E A0C;
    public final AnonymousClass1M9 A0D;
    public final AnonymousClass11C A0E;
    public final AnonymousClass11P A0F;
    public final C219217x A0G;
    public final AnonymousClass1MZ A0H;
    public final AnonymousClass1TA A0I;
    public final C18030ve A0J;
    public final AnonymousClass1LU A0K;
    public final AnonymousClass1DC A0L;
    public final AnonymousClass10I A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass18O A0S;
    public final AnonymousClass1VF A0T;
    public final C24911Md A0U;
    public final AnonymousClass1VI A0V;
    public final AnonymousClass1VK A0W;
    public final C24921Me A0X;
    public final AnonymousClass118 A0Y;
    public final C18000vb A0Z;
    public final AnonymousClass126 A0a;
    public final AnonymousClass1VD A0b;
    public final C24901Mc A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public volatile C62172qu A0g;

    public AnonymousClass1VQ(AnonymousClass195 r9, AnonymousClass190 r10, AnonymousClass1KB r11, AnonymousClass11S r12, AnonymousClass18O r13, AnonymousClass1HQ r14, AnonymousClass1VE r15, AnonymousClass1VF r16, AnonymousClass1V9 r17, C24911Md r18, AnonymousClass1V7 r19, AnonymousClass1VM r20, AnonymousClass1VI r21, AnonymousClass1VK r22, AnonymousClass11E r23, AnonymousClass1M9 r24, C24921Me r25, AnonymousClass11C r26, AnonymousClass11P r27, AnonymousClass118 r28, C219217x r29, C18000vb r30, AnonymousClass1MZ r31, AnonymousClass1TA r32, C18030ve r33, AnonymousClass126 r34, AnonymousClass1LU r35, AnonymousClass1VD r36, C24901Mc r37, AnonymousClass1DC r38, AnonymousClass10I r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47) {
        AnonymousClass11P r5 = r27;
        this.A0F = r5;
        C18030ve r7 = r33;
        this.A0J = r7;
        this.A05 = r11;
        this.A04 = r10;
        this.A06 = r12;
        AnonymousClass118 r6 = r28;
        this.A0Y = r6;
        this.A0M = r39;
        this.A07 = r14;
        this.A0c = r37;
        C24911Md r2 = r18;
        this.A0U = r2;
        this.A0S = r13;
        this.A0D = r24;
        this.A0E = r26;
        this.A0L = r38;
        this.A0X = r25;
        this.A0Z = r30;
        this.A0N = r40;
        this.A0e = r41;
        this.A0a = r34;
        this.A0d = r43;
        this.A0R = r42;
        this.A0A = r19;
        this.A0G = r29;
        this.A0I = r32;
        this.A09 = r17;
        this.A0b = r36;
        this.A08 = r15;
        this.A0T = r16;
        this.A0V = r21;
        this.A0H = r31;
        this.A0C = r23;
        this.A03 = r9;
        this.A0W = r22;
        AnonymousClass1VM r4 = r20;
        this.A0B = r4;
        this.A0P = r46;
        this.A0Q = r44;
        this.A0f = r45;
        this.A0O = r47;
        this.A0K = r35;
        if (Build.VERSION.SDK_INT >= 28) {
            r4.A08(new AnonymousClass1VS(r2, this, r4, r5, r6, r7));
        }
        this.A02 = new AnonymousClass26y(Looper.getMainLooper(), this, r5);
    }

    public static int A02(Context context, AnonymousClass1VQ r14, GroupJid groupJid, List list, int i, int i2, boolean z) {
        int i3;
        AnonymousClass1VQ r4 = r14;
        String A002 = AnonymousClass1PP.A00(r14.A06, r14.A0F, true);
        C18030ve r2 = r4.A0J;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A00(r1, r2, 5429) != 1 || C18020vd.A00(r1, r2, 6083) <= 0 || i2 < C18020vd.A00(r1, r2, 6119)) {
            i3 = 0;
        } else {
            i3 = C18020vd.A00(r1, r2, 6083);
        }
        return A00(context, r4, groupJid, (Integer) null, A002, (String) null, list, i, i3, false, false, true, z);
    }

    public static int A03(AnonymousClass1VQ r13, C62172qu r14, String str, List list, boolean z, boolean z2) {
        List list2 = list;
        UserJid userJid = (UserJid) list2.get(0);
        C62172qu r0 = r14;
        boolean z3 = r14.A0E;
        AnonymousClass1VQ r1 = r13;
        String A052 = AnonymousClass74H.A05(r13.A0Y.A00, r13.A0D, r13.A0X, r13.A0a, r14.A08, r13.A0c, list2, z3);
        if (A052 == null) {
            Log.w("app/startOutgoingCall/startTelecomFrameworkInternal displayName is null");
        } else if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass1VM r11 = r13.A0B;
            if (r11.A0D()) {
                r13.A00 = SystemClock.elapsedRealtime();
                if (r11.A0E()) {
                    r13.A0g = r0;
                    boolean z4 = z2;
                    if (r11.A0G(userJid, str, A052, z, z4)) {
                        Handler handler = r1.A02;
                        handler.removeMessages(1);
                        Message message = new Message();
                        message.what = 1;
                        message.obj = Boolean.valueOf(z4);
                        handler.sendMessageDelayed(message, 2000);
                        return 0;
                    }
                    r1.A0g = null;
                    return 10;
                }
            }
        }
        return 10;
    }

    public static C19760yx A04(int i) {
        int i2;
        int i3 = 1;
        int i4 = null;
        if (!(i == 1 || i == 2)) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 16) {
                        if (i == 25) {
                            return new C19760yx(4, 1);
                        }
                        if (i != 35) {
                            if (i == 57) {
                                i2 = 4;
                                i4 = 34;
                            } else if (i != 59) {
                                if (i != 9) {
                                    if (i != 10) {
                                        switch (i) {
                                            case 45:
                                            case 46:
                                            case 47:
                                                i2 = 4;
                                                i4 = 7;
                                                break;
                                        }
                                    }
                                }
                            } else {
                                i2 = 4;
                                i4 = 35;
                            }
                            return new C19760yx(i2, i4);
                        }
                    }
                }
                i3 = 5;
            } else {
                i3 = 39;
            }
            i2 = Integer.valueOf(i3);
            return new C19760yx(i2, i4);
        }
        i3 = 15;
        i2 = Integer.valueOf(i3);
        return new C19760yx(i2, i4);
    }

    public void BAc(Context context, boolean z) {
        if (!Bff(context, z, false)) {
            Voip.acceptCall();
        }
    }

    public void BiW(int i, Integer num) {
        ((C192539oZ) this.A0f.get()).A01(num, (Integer) null, i);
    }

    public void BiX(Integer num, Integer num2, int i, boolean z) {
        C194859sP r0 = (C194859sP) this.A0Q.get();
        if (z) {
            r0.A00();
        }
        r0.A01((Boolean) null, (Boolean) null, num, num2, (Integer) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        if (X.C18020vd.A05(r2, r8, 12593) == false) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0191 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BjR(android.content.Context r23, com.whatsapp.jid.GroupJid r24, java.util.List r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            r22 = this;
            r14 = 0
            r10 = r22
            r13 = r24
            if (r24 != 0) goto L_0x0187
            r9 = 0
        L_0x0008:
            X.0ve r8 = r10.A0J
            X.11S r1 = r10.A06
            boolean r0 = X.C40811vJ.A0H(r1, r8, r9)
            r7 = 0
            r5 = 12
            r6 = 1
            r15 = r23
            r12 = r26
            if (r0 == 0) goto L_0x005f
            X.1KB r0 = r10.A05
            X.1FR r0 = r0.A00
            if (r0 == 0) goto L_0x005e
            X.3Rj r4 = X.AnonymousClass4a6.A00(r15)
            r3 = 2131898036(0x7f122eb4, float:1.9430978E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1 = 4676(0x1244, float:6.552E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r8, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r14] = r0
            java.lang.String r0 = r15.getString(r3, r2)
            r4.A0S(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r4.A0Z(r7, r0)
            r4.A0C()
            X.0yx r1 = A04(r12)
            X.1V9 r3 = r10.A09
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 26
            r3.A01(r1, r0, r2)
        L_0x005e:
            return r5
        L_0x005f:
            if (r24 == 0) goto L_0x005e
            X.1MZ r0 = r10.A0H
            boolean r0 = r0.A0J(r13)
            if (r0 == 0) goto L_0x005e
            r11 = r29
            boolean r0 = X.C40811vJ.A0J(r1, r8, r9, r11)
            if (r0 == 0) goto L_0x005e
            X.1VE r5 = r10.A08
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            java.lang.String r4 = "voice_chat_education_seen_count"
            int r0 = r0.getInt(r4, r14)
            if (r0 >= r6) goto L_0x0183
            r0 = 5091(0x13e3, float:7.134E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r8, r0)
            r0 = r0 & 1
            if (r0 == r6) goto L_0x009c
            r0 = 6067(0x17b3, float:8.502E-42)
            int r0 = X.C18020vd.A00(r1, r8, r0)
            if (r9 < r0) goto L_0x0183
            r0 = 6068(0x17b4, float:8.503E-42)
            int r0 = X.C18020vd.A00(r1, r8, r0)
            if (r9 > r0) goto L_0x0183
        L_0x009c:
            r16 = 1
        L_0x009e:
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            java.lang.String r3 = "voice_chat_v2_education_seen_count"
            int r0 = r0.getInt(r3, r14)
            if (r0 >= r6) goto L_0x00c5
            if (r29 == 0) goto L_0x00c5
            r0 = 57
            if (r12 != r0) goto L_0x00c5
            r0 = 10194(0x27d2, float:1.4285E-41)
            X.0vf r2 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r2, r8, r0)
            r0 = 2
            if (r1 < r0) goto L_0x00c5
            r0 = 12593(0x3131, float:1.7647E-41)
            boolean r1 = X.C18020vd.A05(r2, r8, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r18 = r25
            if (r16 != 0) goto L_0x012a
            if (r0 != 0) goto L_0x016c
            if (r27 != 0) goto L_0x00f4
            boolean r0 = X.C40811vJ.A0Z(r8, r9)
            if (r0 != 0) goto L_0x00d6
            if (r29 == 0) goto L_0x00f4
        L_0x00d6:
            X.0yx r1 = A04(r12)
            X.1V9 r3 = r10.A09
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 25
            r3.A01(r1, r0, r2)
            r10.A09(r13, r12)
        L_0x00f0:
            r5 = 0
        L_0x00f1:
            if (r29 == 0) goto L_0x0191
            return r5
        L_0x00f4:
            r1 = 5429(0x1535, float:7.608E-42)
            X.0vf r0 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r0, r8, r1)
            X.0yx r1 = A04(r12)
            X.1V9 r3 = r10.A09
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 4
            r3.A01(r1, r0, r2)
            r21 = r28
            r20 = r9
            r19 = r12
            r17 = r13
            r16 = r10
            int r5 = A02(r15, r16, r17, r18, r19, r20, r21)
            if (r4 != r6) goto L_0x00f1
            r0 = 7
            r3.A01(r1, r0, r2)
            r10.A09(r13, r12)
            goto L_0x00f1
        L_0x012a:
            if (r0 != 0) goto L_0x016c
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            int r0 = r0.getInt(r4, r14)
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r4, r1)
        L_0x0142:
            r0.apply()
            X.1KB r0 = r10.A05
            X.1FR r1 = r0.A00
            if (r1 == 0) goto L_0x00f0
            r10.A05()
            X.2vB r14 = new X.2vB
            r20 = r9
            r21 = r11
            r19 = r12
            r17 = r13
            r16 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r0 = new com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog
            r0.<init>()
            r0.A00 = r14
            r0.A02 = r11
            r1.CMk(r0, r7)
            r0 = 13
            return r0
        L_0x016c:
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            int r0 = r0.getInt(r3, r14)
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)
            goto L_0x0142
        L_0x0183:
            r16 = 0
            goto L_0x009e
        L_0x0187:
            X.1MZ r0 = r10.A0H
            X.1MW r0 = r0.A08
            int r9 = r0.A0A(r13)
            goto L_0x0008
        L_0x0191:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.BjR(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int, boolean, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C40811vJ.A0Z(r8.A0J, r8.A0H.A08.A0A(r10)) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BjS(android.content.Context r9, com.whatsapp.jid.GroupJid r10, java.util.List r11, int r12) {
        /*
            r8 = this;
            r2 = r8
            r4 = r10
            if (r10 == 0) goto L_0x0015
            X.0ve r1 = r8.A0J
            X.1MZ r0 = r8.A0H
            X.1MW r0 = r0.A08
            int r0 = r0.A0A(r10)
            boolean r0 = X.C40811vJ.A0Z(r1, r0)
            r7 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            r3 = r9
            r5 = r11
            r6 = r12
            boolean r0 = r2.BjT(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.BjS(android.content.Context, com.whatsapp.jid.GroupJid, java.util.List, int):boolean");
    }

    public boolean BjT(Context context, GroupJid groupJid, List list, int i, boolean z) {
        if (BjR(context, groupJid, list, i, z, false, false) == 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void BzP() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    public int CNx(Context context, List list, int i, boolean z) {
        return A00(context, this, (GroupJid) null, (Integer) null, AnonymousClass1PP.A00(this.A06, this.A0F, true), (String) null, list, i, 0, z, false, false, false);
    }

    public int CNy(Context context, GroupJid groupJid, List list, int i, boolean z) {
        return A00(context, this, groupJid, (Integer) null, AnonymousClass1PP.A00(this.A06, this.A0F, true), (String) null, list, i, 0, z, false, false, false);
    }

    public void CO2(Context context, C59822mw r13, int i) {
        AnonymousClass1M9 r3 = this.A0D;
        AnonymousClass1E7 A0H2 = r3.A0H(r13.A04);
        Jid A062 = A0H2.A06(AnonymousClass1EC.class);
        C17960vV.A07(A062);
        GroupJid groupJid = (GroupJid) A062;
        List A042 = C63982u1.A04(this.A06, r3, this.A0H, A0H2);
        boolean z = false;
        if (r13.A00 == 2) {
            z = true;
        }
        CO3(context, groupJid, r13.A07, A042, i, z);
    }

    private void A05() {
        ((C219117w) this.A0P.get()).A01(C216917a.class);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4Rb, java.lang.Object] */
    private void A06(int i) {
        AnonymousClass1FR r2 = this.A05.A00;
        if (r2 != null) {
            ((C219117w) this.A0P.get()).A01(AnonymousClass12O.class);
            r2.CMk(VoipErrorDialogFragment.A00(new Object(), i), (String) null);
        }
    }

    public static void A08(AnonymousClass1VQ r3, C62172qu r4) {
        if (r4.A09 != null) {
            r3.A0M.CGF(new C21431Ajy(r3, r4, 34));
        }
    }

    private void A09(GroupJid groupJid, int i) {
        AnonymousClass1FR r6 = this.A05.A00;
        if (r6 != null) {
            A05();
            AudioChatBottomSheetDialog audioChatBottomSheetDialog = new AudioChatBottomSheetDialog();
            audioChatBottomSheetDialog.A1R(AnonymousClass9O6.A00(new AnonymousClass1D6("voice_chat_group_jid", groupJid.getRawString()), new AnonymousClass1D6("voice_chat_call_from_ui", Integer.valueOf(i))));
            A05();
            r6.CMk(audioChatBottomSheetDialog, "AudioChatBottomSheetDialog");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        if (r10 != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        X.C18070vi.A0b(r4);
        r2 = r4.get(r2);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b A[LOOP:4: B:48:0x0125->B:50:0x012b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0B(X.C62172qu r27) {
        /*
            r26 = this;
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r9 = r27
            java.util.LinkedHashMap r0 = r9.A0D
            java.util.Set r6 = r0.keySet()
            r7 = r26
            X.00H r0 = r7.A0d
            java.lang.Object r4 = r0.get()
            X.2hy r4 = (X.C56752hy) r4
            boolean r10 = r9.A04
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x0026
            r3.add(r1)
            goto L_0x0026
        L_0x0038:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0040
            if (r10 == 0) goto L_0x0063
        L_0x0040:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0049
            r3.add(r1)
            goto L_0x0049
        L_0x005b:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
        L_0x0063:
            r5 = r6
        L_0x0064:
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 == r0) goto L_0x0070
            X.1Om r5 = X.C25511Om.A00
        L_0x0070:
            boolean r0 = r5.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0119
            boolean r0 = r9.A04
            r2 = 1
            if (r0 == 0) goto L_0x0111
            X.190 r4 = r7.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CallsManagerImpl/startVoiceService phoneNumber(size:"
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = ") to lid(size:"
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = " ) mapping missing"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.A0G(r0, r3, r2)
            r0 = 0
            r9.A04 = r0
            r5.clear()
            java.util.Iterator r2 = r6.iterator()
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            boolean r0 = X.C22971Dz.A0X(r1)
            if (r0 == 0) goto L_0x00b1
            r5.add(r1)
            goto L_0x00b1
        L_0x00c7:
            X.1Ln r0 = r4.A00
            java.util.LinkedHashMap r0 = r0.A0G(r6)
            X.DbW r4 = X.C27300DbW.create((java.util.Map) r0)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x00da:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            boolean r0 = X.C22971Dz.A0X(r2)
            if (r0 == 0) goto L_0x0101
            if (r10 == 0) goto L_0x0101
            X.3MQ r1 = r4.inverse()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.C18070vi.A0z(r2, r0)
            java.lang.Object r2 = r1.get(r2)
        L_0x00fb:
            if (r2 == 0) goto L_0x00da
        L_0x00fd:
            r5.add(r2)
            goto L_0x00da
        L_0x0101:
            boolean r0 = X.C22971Dz.A0T(r2)
            if (r0 == 0) goto L_0x00fd
            if (r10 != 0) goto L_0x00fd
            X.C18070vi.A0b(r4)
            java.lang.Object r2 = r4.get(r2)
            goto L_0x00fb
        L_0x0111:
            X.190 r1 = r7.A04
            java.lang.String r0 = "CallsManagerImpl/startVoiceService userJids size zero in PN call"
            r1.A0G(r0, r3, r2)
            return
        L_0x0119:
            X.1VI r1 = r7.A0V
            java.lang.String r0 = "CallsManager/startVoiceService"
            java.util.ArrayList r0 = r1.A01(r0, r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x0125:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r1 = r2.next()
            com.whatsapp.voipcalling.CallParticipantJid r1 = (com.whatsapp.voipcalling.CallParticipantJid) r1
            com.whatsapp.jid.UserJid r0 = r1.userJid
            r8.put(r0, r1)
            goto L_0x0125
        L_0x0137:
            r9.A02 = r3
            com.whatsapp.jid.GroupJid r6 = r9.A08
            if (r6 == 0) goto L_0x0171
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x0171
            X.1MZ r0 = r7.A0H
            X.1MW r5 = r0.A08
            int r4 = r5.A0A(r6)
            X.0ve r3 = r7.A0J
            r0 = 10194(0x27d2, float:1.4285E-41)
            X.0vf r2 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r2, r3, r0)
            r0 = 2
            if (r1 >= r0) goto L_0x0167
            r0 = 4907(0x132b, float:6.876E-42)
            int r1 = X.C18020vd.A00(r2, r3, r0)
            r0 = 3
            if (r1 < r0) goto L_0x0171
            r0 = 5254(0x1486, float:7.362E-42)
            int r0 = X.C18020vd.A00(r2, r3, r0)
            if (r4 < r0) goto L_0x0171
        L_0x0167:
            X.2tp r0 = r5.A0B(r6)
            java.lang.String r0 = r0.A0F()
            r9.A02 = r0
        L_0x0171:
            java.lang.String r0 = r9.A0B
            r25 = r0
            boolean r15 = r9.A0F
            int r14 = r9.A07
            boolean r13 = r9.A0G
            java.lang.String r12 = r9.A0C
            boolean r11 = r9.A0E
            java.lang.Integer r10 = r9.A0A
            java.lang.String r5 = r9.A02
            boolean r4 = r9.A04
            boolean r2 = r9.A03
            int r1 = r9.A00
            boolean r0 = r9.A05
            X.2qu r3 = new X.2qu
            r20 = r13
            r21 = r11
            r22 = r4
            r23 = r2
            r24 = r0
            r19 = r15
            r18 = r1
            r17 = r14
            r16 = r8
            r15 = r5
            r14 = r12
            r13 = r25
            r12 = r10
            r11 = r6
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            long r0 = r9.A01
            r3.A01 = r0
            X.1V7 r2 = r7.A0A
            java.lang.String r1 = "start_call"
            X.A69 r0 = new X.A69
            r0.<init>((java.lang.String) r1, (java.lang.Object) r3)
            r2.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.A0B(X.2qu):void");
    }

    public boolean Bff(Context context, boolean z, boolean z2) {
        int i;
        if (this.A0C.A03(true) != 0) {
            return false;
        }
        boolean A022 = AnonymousClass11E.A02(context);
        StringBuilder sb = new StringBuilder();
        sb.append("CallsManager/isOffline: user has no network connection, isAirplaneModeOn: ");
        sb.append(A022);
        sb.append("isVoiceChat: ");
        sb.append(z);
        Log.w(sb.toString());
        if (z) {
            A06(3);
            return true;
        }
        AnonymousClass1KB r1 = this.A05;
        if (A022) {
            i = 2131887887;
            if (z2) {
                i = 2131887900;
            }
        } else {
            i = 2131898116;
            if (z2) {
                i = 2131898115;
            }
        }
        r1.A06(i, 1);
        return true;
    }

    public void BzR() {
        this.A0M.CGL(new C146427Pb(this, 28), "CallsManagerImpl/onOfflineResumeCompleted-zombie-cleanup");
    }

    public int CNw(Context context, AnonymousClass1E7 r17, int i, boolean z) {
        if (r17 == null) {
            return 1;
        }
        List singletonList = Collections.singletonList(r17);
        return A00(context, this, (GroupJid) null, (Integer) null, AnonymousClass1PP.A00(this.A06, this.A0F, true), (String) null, singletonList, i, 0, z, false, false, false);
    }

    public void CO3(Context context, GroupJid groupJid, String str, List list, int i, boolean z) {
        List list2 = list;
        if (list2.size() <= 1) {
            Log.e("app/startPrecall scheduled call is only supported for group with more than 2 people");
            return;
        }
        String A002 = AnonymousClass1PP.A00(this.A06, this.A0F, true);
        A00(context, this, groupJid, Integer.valueOf(i), A002, str, list2, 4, 0, z, true, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r14 == 54) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r21, X.AnonymousClass1VQ r22, com.whatsapp.jid.GroupJid r23, java.lang.Integer r24, java.lang.String r25, java.lang.String r26, java.util.List r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            X.C17960vV.A02()
            r13 = r27
            int r0 = r13.size()
            r3 = 12
            r5 = 0
            r1 = 1
            if (r0 != r1) goto L_0x001e
            java.lang.Object r0 = r13.get(r5)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r0 = r0.A0J
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x001e
            return r3
        L_0x001e:
            r0 = 53
            r14 = r28
            if (r14 == r0) goto L_0x002a
            r0 = 54
            r20 = 0
            if (r14 != r0) goto L_0x002c
        L_0x002a:
            r20 = 1
        L_0x002c:
            r8 = r22
            X.1VK r0 = r8.A0W
            boolean r0 = r0.A00()
            r7 = r21
            if (r0 == 0) goto L_0x004d
            X.3Rj r2 = X.AnonymousClass4a6.A00(r7)
            r0 = 2131898261(0x7f122f95, float:1.9431435E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 0
            r2.A0Z(r0, r1)
            r2.A0C()
            return r3
        L_0x004d:
            int r0 = r13.size()
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r19 = r33
            if (r0 != r1) goto L_0x00a9
            java.lang.Object r0 = r13.get(r5)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1yf r0 = r0.A0G
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r13.get(r5)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1yf r0 = r0.A0G
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00a9
            r0 = 36
            if (r14 == r0) goto L_0x00a9
            java.lang.Object r0 = r13.get(r5)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r1 = r0.A0J
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r1)
            X.Af0 r3 = new X.Af0
            r3.<init>()
            X.10I r2 = r8.A0M
            r1 = 23
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r8, r3, r4, r1)
            r2.CGF(r0)
            X.3Ag r6 = new X.3Ag
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.A09(r6)
            return r5
        L_0x00a9:
            int r0 = A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.A00(android.content.Context, X.1VQ, com.whatsapp.jid.GroupJid, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019d, code lost:
        if (r6.A0B.A0D() == false) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.content.Context r28, X.AnonymousClass1VQ r29, com.whatsapp.jid.GroupJid r30, java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.util.List r34, int r35, int r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            X.C17960vV.A02()
            r2 = 0
            r9 = 1
            r4 = 0
            r6 = r29
            r13 = r30
            r12 = r34
            if (r30 != 0) goto L_0x004b
            X.1VD r3 = r6.A0b
            X.1VC r0 = r3.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x004b
            int r0 = r12.size()
            if (r0 > r9) goto L_0x0030
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x004b
            java.lang.Object r0 = r12.get(r4)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            boolean r0 = r3.A01(r0, r4)
            if (r0 == 0) goto L_0x004b
        L_0x0030:
            X.1KB r0 = r6.A05
            X.1FR r1 = r0.A00
            if (r1 == 0) goto L_0x003e
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = r3.A00()
            r1.CMl(r0)
            return r9
        L_0x003e:
            X.00H r0 = r6.A0e
            java.lang.Object r1 = r0.get()
            X.1Qo r1 = (X.C26031Qo) r1
            X.3xL r0 = X.C80543xL.A00
            r1.A00(r0, r2)
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/startOutgoingCall/from "
            r1.append(r0)
            r8 = r35
            r1.append(r8)
            java.lang.String r0 = ", video call:"
            r1.append(r0)
            r7 = r37
            r1.append(r7)
            java.lang.String r0 = ", groupJid:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Md r3 = r6.A0U
            int r1 = r12.size()
            r0 = 726210773(0x2b4918d5, float:7.1444006E-13)
            r15 = r32
            boolean r0 = X.C24911Md.A00(r3, r15, r0)
            if (r0 == 0) goto L_0x0087
            r3.A02(r15, r1, r7, r4)
        L_0x0087:
            if (r30 == 0) goto L_0x0096
            int r0 = r12.size()
            if (r0 <= r9) goto L_0x0096
            X.1VF r1 = r6.A0T
            X.1VH r0 = X.AnonymousClass1VH.GROUP_CALL
            r1.A00(r0)
        L_0x0096:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r12.iterator()
            if (r30 == 0) goto L_0x00bc
        L_0x00a6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r5.next()
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r4.A06(r0)
            r10.add(r0)
            goto L_0x00a6
        L_0x00bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r5.next()
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r4.A06(r0)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.00H r0 = r6.A0N
            java.lang.Object r0 = r0.get()
            X.1pj r0 = (X.C37551pj) r0
            boolean r0 = r0.A0P(r4)
            if (r0 == 0) goto L_0x00e7
            r1.add(r4)
            java.lang.String r0 = "app/startOutgoingCall/failed_contact_blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00bc
        L_0x00e7:
            r10.add(r4)
            goto L_0x00bc
        L_0x00eb:
            r4 = 0
            r20 = r2
            r11 = r28
            r5 = r39
            r16 = r6
            r17 = r11
            r18 = r2
            r19 = r13
            r21 = r10
            r22 = r1
            r23 = r12
            r24 = r7
            r25 = r5
            r26 = r9
            int r1 = r16.A0A(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = r33
            if (r1 == 0) goto L_0x0169
            r0 = 7
            if (r1 == r0) goto L_0x0167
            r0 = 11
            if (r1 != r0) goto L_0x0161
            r2 = 1
        L_0x0116:
            X.C18070vi.A0d(r11, r4)
            java.lang.String r12 = "jids"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r6 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.VoipPermissionsActivity"
            r4.setClassName(r6, r0)
            java.util.ArrayList r0 = X.C22971Dz.A0B(r10)
            r4.putStringArrayListExtra(r12, r0)
            java.lang.String r0 = "call_from"
            r4.putExtra(r0, r8)
            java.lang.String r0 = "video_call"
            r4.putExtra(r0, r7)
            java.lang.String r0 = "permission_type"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "voice_chat"
            r4.putExtra(r0, r5)
            if (r30 == 0) goto L_0x0151
            java.lang.String r2 = r13.getRawString()
            java.lang.String r0 = "group_jid"
            r4.putExtra(r0, r2)
        L_0x0151:
            if (r33 == 0) goto L_0x015e
            int r0 = r9.length()
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = "scheduled_id"
            r4.putExtra(r0, r9)
        L_0x015e:
            r11.startActivity(r4)
        L_0x0161:
            r0 = 7952(0x1f10, float:1.1143E-41)
            r3.A04(r15, r0)
            return r1
        L_0x0167:
            r2 = 0
            goto L_0x0116
        L_0x0169:
            X.0ve r3 = r6.A0J
            r1 = 3358(0xd1e, float:4.706E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            r24 = 0
            if (r0 <= 0) goto L_0x0179
            r24 = 1
        L_0x0179:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r3 = r10.iterator()
        L_0x0182:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = r3.next()
            r1.put(r0, r2)
            goto L_0x0182
        L_0x0190:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 < r0) goto L_0x019f
            X.1VM r0 = r6.A0B
            boolean r3 = r0.A0D()
            r0 = 1
            if (r3 != 0) goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            r26 = r40
            r25 = r41
            r14 = r31
            r20 = r36
            r37 = r38
            if (r38 != 0) goto L_0x01eb
            if (r0 == 0) goto L_0x01eb
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r11 = r10.iterator()
        L_0x01b7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r11.next()
            r3.put(r0, r2)
            goto L_0x01b7
        L_0x01c5:
            X.2qu r12 = new X.2qu
            r22 = r4
            r23 = r5
            r19 = r8
            r21 = r7
            r17 = r2
            r18 = r3
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27 = r6
            r28 = r12
            r29 = r15
            r30 = r10
            r31 = r7
            r32 = r4
            int r0 = A03(r27, r28, r29, r30, r31, r32)
            if (r0 != 0) goto L_0x01eb
            return r0
        L_0x01eb:
            X.2qu r3 = new X.2qu
            r27 = r3
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r9
            r32 = r2
            r33 = r1
            r34 = r8
            r35 = r20
            r36 = r7
            r38 = r5
            r39 = r24
            r40 = r25
            r41 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.10I r2 = r6.A0M
            r1 = 35
            X.Ajy r0 = new X.Ajy
            r0.<init>(r6, r3, r1)
            r2.CGF(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.A01(android.content.Context, X.1VQ, com.whatsapp.jid.GroupJid, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean, boolean, boolean):int");
    }

    public static void A07(Context context, AnonymousClass1VQ r6, String str, String str2, int i, boolean z) {
        int i2;
        C17960vV.A02();
        AnonymousClass1VQ r3 = r6;
        AnonymousClass1DC r1 = r6.A0L;
        C219217x r2 = r6.A0G;
        String str3 = str;
        int i3 = i;
        boolean z2 = z;
        if (!r2.A0E() || AnonymousClass74H.A0A(r2, r1, z)) {
            i2 = 0;
        } else if (r2.A0J()) {
            i2 = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("app/previewCallLink token:");
            sb.append(str3);
            sb.append(" isVideoEnabled: ");
            sb.append(z);
            Log.i(sb.toString());
            if (str3.length() != 22) {
                Log.e("app/previewCallLink token with wrong length!");
                return;
            }
            boolean z3 = false;
            if (r3.A0I.A04(Voip.getCurrentCallId()) != null) {
                z3 = true;
            }
            if (C63982u1.A00(r3.A0E.A0K(), r2) != 0) {
                int i4 = 2131887901;
                if (z3) {
                    i4 = 2131898180;
                }
                r3.A05.A06(i4, 1);
                return;
            }
            r3.A0M.CGF(new AnonymousClass3CB(r3, str3, str2, i3, z2));
            return;
        }
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str3, 2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.calling.VoipPermissionsActivity");
        intent.putExtra("video_call", z);
        intent.putExtra("permission_type", i2);
        intent.putExtra("call_link_lobby_token", str3);
        intent.putExtra("lobby_entry_point", i);
        context.startActivity(intent);
    }

    public void BhC(Context context, C178119Bw r27, int i, boolean z) {
        GroupJid groupJid;
        int i2;
        C19760yx r12;
        int i3;
        int valueOf;
        C17960vV.A02();
        String str = null;
        Context context2 = context;
        if (this.A0W.A00()) {
            C73203Rj A002 = AnonymousClass4a6.A00(context2);
            A002.A0D(2131898261);
            A002.A0Z((DialogInterface.OnClickListener) null, 2131899286);
            A002.A0C();
            return;
        }
        C178119Bw r8 = r27;
        boolean A0W2 = r8.A0W();
        if (r8.A0O()) {
            if (C18020vd.A00(C18040vf.A02, this.A0J, 10402) > 0 && Bff(context2, A0W2, false)) {
                return;
            }
        }
        int i4 = i;
        boolean z2 = z;
        if (A0W2 && r8.A0C != null) {
            CallInfo BO3 = this.A07.BO3();
            AnonymousClass1MZ r0 = this.A0H;
            GroupJid groupJid2 = r8.A0C;
            C17960vV.A07(groupJid2);
            int A0A2 = r0.A08.A0A(groupJid2);
            C18030ve r13 = this.A0J;
            boolean A0C2 = C40811vJ.A0C(this.A06, r13);
            boolean z3 = true;
            boolean z4 = false;
            if (C18020vd.A00(C18040vf.A02, r13, 4907) >= 2) {
                z4 = true;
            }
            if (!A0C2 || (A0A2 > 64 && !z4)) {
                z3 = false;
            }
            int i5 = 1;
            if (i4 != 1) {
                int i6 = 15;
                if (i4 != 3) {
                    if (i4 != 22) {
                        switch (i) {
                            case 8:
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                            case 11:
                                i6 = 5;
                                break;
                            default:
                                valueOf = 1;
                                break;
                        }
                    }
                    i2 = 4;
                    i5 = 7;
                    r12 = new C19760yx(i2, Integer.valueOf(i5));
                }
                valueOf = Integer.valueOf(i6);
                r12 = new C19760yx(valueOf, (Object) null);
            } else {
                i2 = 4;
                i5 = 2;
                r12 = new C19760yx(i2, Integer.valueOf(i5));
            }
            if ((BO3 == null || BO3.callState == CallState.NONE) && !z && C40811vJ.A0X(r13)) {
                i3 = 25;
            } else {
                i3 = 6;
                if (C40811vJ.A0d(r8.A0C, BO3)) {
                    i3 = 7;
                }
            }
            this.A09.A01((Integer) r12.A01, i3, ((Number) r12.A00).intValue());
            if (!z3) {
                C18070vi.A0d(context2, 0);
                Intent intent = new Intent();
                intent.setClassName(context2.getPackageName(), "com.whatsapp.calling.VoipAppUpdateActivity");
                intent.putExtra("feature_type", 2);
                intent.setFlags(268435456);
                context2.startActivity(intent);
                return;
            }
            if (r8.A0E != null) {
                str = C40811vJ.A09(r8.A0E.A00);
            }
            if (BO3 != null && BO3.callState == CallState.RECEIVED_CALL && AnonymousClass026.A00(BO3.groupJid, r8.A0C) && BO3.callId.equals(str) && z) {
                BAc(context2, true);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("app/startFromCallLog/from ");
        sb.append(r8.A09());
        Log.i(sb.toString());
        if (this.A0g != null) {
            Log.e("app/startFromCallLog user tapped the call button twice before the telecom framework responds");
            return;
        }
        this.A00 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = r8.A0B().iterator();
        while (it.hasNext()) {
            AnonymousClass11S r02 = this.A06;
            UserJid userJid = ((C178109Bv) it.next()).A00;
            if (!r02.A0O(userJid)) {
                arrayList.add(userJid);
                arrayList3.add(this.A0D.A0H(userJid));
            }
        }
        C89444cT r11 = r8.A04;
        String str2 = r11.A02;
        String A092 = C40811vJ.A09(str2);
        C24911Md r2 = this.A0U;
        boolean z5 = r8.A0J;
        int size = arrayList3.size();
        if (C24911Md.A00(r2, A092, 726210773)) {
            r2.A02(A092, size, z5, true);
        }
        boolean z6 = r8.A0J;
        String A093 = C40811vJ.A09(str2);
        boolean z7 = z6;
        Context context3 = context2;
        C59292m4 r16 = r8.A0B;
        int A0A3 = A0A(context3, r16, (GroupJid) null, A093, arrayList, arrayList2, arrayList3, z7, r8.A0W(), false);
        if (A0A3 != 0) {
            if (A0A3 == 7 || A0A3 == 11) {
                int i7 = r11.A00;
                boolean z8 = r11.A03;
                UserJid userJid2 = r11.A01;
                boolean z9 = r8.A0J;
                int i8 = 1;
                if (A0A3 == 7) {
                    i8 = 0;
                }
                C18070vi.A0d(context2, 0);
                Intent intent2 = new Intent();
                intent2.setClassName(context2.getPackageName(), "com.whatsapp.calling.VoipPermissionsActivity");
                intent2.putExtra("join_call_log", true);
                intent2.putExtra("call_log_call_id", str2);
                intent2.putExtra("call_log_transaction_id", i7);
                intent2.putExtra("call_log_from_me", z8);
                intent2.putExtra("call_log_user_jid", userJid2.getRawString());
                intent2.putExtra("video_call", z9);
                intent2.putExtra("lobby_entry_point", i4);
                intent2.putExtra("permission_type", i8);
                intent2.putExtra("join_and_accept", z2);
                if (C18050vg.A00(context2) == null) {
                    intent2.addFlags(268435456);
                }
                context2.startActivity(intent2);
            } else if (A0A3 == 8) {
                CallInfo BO32 = this.A07.BO3();
                if (BO32 != null && z && (groupJid = BO32.groupJid) != null && groupJid.equals(r8.A0C) && BO32.callState == CallState.RECEIVED_CALL) {
                    BAc(context2, r8.A0W());
                    return;
                } else if (r8.A0W() && !z && C40811vJ.A0X(this.A0J)) {
                    this.A01 = new C19760yx(A092, Integer.valueOf(i4));
                }
            }
            r2.A04(A092, 7952);
            return;
        }
        if (r8.A0W() && !z) {
            C18030ve r22 = this.A0J;
            if (C40811vJ.A0X(r22) && C18020vd.A05(C18040vf.A02, r22, 6688)) {
                this.A01 = new C19760yx(A092, Integer.valueOf(i4));
                A08(this, new C62172qu(r8, i4, z2, r8.A0W()));
            }
        }
        if (A03(this, new C62172qu(r8, i4, z2, r8.A0W()), A092, arrayList, r8.A0J, true) == 0) {
            return;
        }
        A08(this, new C62172qu(r8, i4, z2, r8.A0W()));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r0 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r14.A0J, 10402) > 0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0177, code lost:
        if (r19.isEmpty() == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (android.text.TextUtils.equals(r8, r7.callId) == false) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A(android.content.Context r15, X.C59292m4 r16, com.whatsapp.jid.GroupJid r17, java.lang.String r18, java.util.ArrayList r19, java.util.ArrayList r20, java.util.List r21, boolean r22, boolean r23, boolean r24) {
        /*
            r14 = this;
            r4 = 0
            r6 = 1
            r13 = 0
            r8 = r18
            if (r18 == 0) goto L_0x0008
            r13 = 1
        L_0x0008:
            X.1HQ r9 = r14.A07
            com.whatsapp.voipcalling.CallInfo r7 = r9.BO3()
            int r2 = r21.size()
            if (r18 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x001f
            java.lang.String r0 = r7.callId
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            r0 = 0
            r3 = r16
            if (r16 == 0) goto L_0x0026
            r0 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x005c
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r7.callLinkToken
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005e
            if (r2 != 0) goto L_0x0078
            X.1LU r2 = new X.1LU
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r7.getPeerJid()
            X.C17960vV.A07(r1)
            X.195 r0 = r14.A03
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r2 = r2.A20(r15, r1, r0)
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = 3
            r2.putExtra(r1, r0)
            r15.startActivity(r2)
        L_0x0059:
            r1 = 8
            return r1
        L_0x005c:
            if (r0 == 0) goto L_0x0078
        L_0x005e:
            if (r2 != 0) goto L_0x0078
            r1 = 0
            java.util.List r0 = java.util.Collections.singletonList(r8)
            android.os.Message r3 = android.os.Message.obtain(r1, r4, r0)
            X.1V7 r2 = r14.A0A
            java.lang.String r1 = "check_ongoing_calls"
            X.A69 r0 = new X.A69
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            r1 = 12
            return r1
        L_0x0078:
            boolean r0 = r21.isEmpty()
            r2 = r23
            r5 = r17
            if (r0 == 0) goto L_0x00a3
            if (r23 == 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0094
            java.lang.String r0 = r7.callId
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x00a3
        L_0x0094:
            java.lang.String r0 = "app/startOutgoingCall empty list of contacts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r13 != 0) goto L_0x00a2
            if (r17 == 0) goto L_0x00a2
            r0 = 16
            r14.A06(r0)
        L_0x00a2:
            return r6
        L_0x00a3:
            X.2qu r0 = r14.A0g
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "app/startOutgoingCall user tapped the call button twice before the telecom framework responds"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2
            return r1
        L_0x00ae:
            r0 = 0
            r14.A00 = r0
            java.util.Iterator r10 = r21.iterator()
        L_0x00b6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r3 = r10.next()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            X.11S r1 = r14.A06
            X.1BI r0 = r3.A0J
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00d5
            X.1KB r1 = r14.A05
            r0 = 2131898154(0x7f122f2a, float:1.9431218E38)
            r1.A06(r0, r6)
            return r6
        L_0x00d5:
            boolean r0 = r3.A0F()
            r1 = r0 ^ 1
            java.lang.String r0 = "can't start a call with a group contact"
            X.C17960vV.A0G(r1, r0)
            goto L_0x00b6
        L_0x00e1:
            if (r13 == 0) goto L_0x00f1
            if (r23 != 0) goto L_0x00f1
            X.0ve r3 = r14.A0J
            r1 = 10402(0x28a2, float:1.4576E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            if (r0 <= 0) goto L_0x00fb
        L_0x00f1:
            r0 = r24
            boolean r0 = r14.Bff(r15, r2, r0)
            if (r0 == 0) goto L_0x00fb
            r1 = 4
            return r1
        L_0x00fb:
            r11 = 2131898103(0x7f122ef7, float:1.9431114E38)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            X.0vb r12 = r14.A0Z
            X.1Me r1 = r14.A0X
            r0 = -1
            r10 = r20
            java.lang.String r0 = r1.A0a(r10, r0)
            java.lang.String r0 = r12.A0F(r0)
            r3[r4] = r0
            java.lang.String r3 = r15.getString(r11, r3)
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x0155
            int r1 = r10.size()
            int r0 = r21.size()
            if (r1 != r0) goto L_0x0155
            X.1KB r0 = r14.A05
            X.1FR r5 = r0.A00
            if (r5 == 0) goto L_0x0151
            boolean r0 = r5.Bed()
            if (r0 != 0) goto L_0x014f
            boolean r0 = r5 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x014f
            com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment r2 = new com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "message"
            r1.putString(r0, r3)
            java.lang.String r0 = "jids"
            r1.putParcelableArrayList(r0, r10)
            r2.A1R(r1)
            r5.CMl(r2)
        L_0x014f:
            r1 = 5
            return r1
        L_0x0151:
            r0.A0G(r3, r4)
            goto L_0x014f
        L_0x0155:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0160
            X.1KB r0 = r14.A05
            r0.A0G(r3, r4)
        L_0x0160:
            if (r23 == 0) goto L_0x0172
            if (r7 == 0) goto L_0x0172
            com.whatsapp.voipcalling.CallState r1 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0172
            java.lang.String r0 = r7.callId
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x0179
        L_0x0172:
            boolean r0 = r19.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x017a
        L_0x0179:
            r1 = 1
        L_0x017a:
            java.lang.String r0 = "callable jids must not be empty"
            X.C17960vV.A0F(r1, r0)
            X.1DC r3 = r14.A0L
            X.17x r1 = r14.A0G
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0206
            r0 = r22
            boolean r0 = X.AnonymousClass74H.A0A(r1, r3, r0)
            if (r0 != 0) goto L_0x0206
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x019f
            r1 = 11
            java.lang.String r0 = "app/startOutgoingCall/failed_no_read_phone_state_permission"
        L_0x019b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r1
        L_0x019f:
            r3 = 7
            if (r7 == 0) goto L_0x01b4
            com.whatsapp.voipcalling.CallState r10 = r7.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r10 == r0) goto L_0x01b4
            boolean r0 = r7.isBotCall
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = "CallsManager/isCallActiveAndEndOngoingBotCall ending bot call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.BjM()
        L_0x01b4:
            X.11C r0 = r14.A0E
            android.telephony.TelephonyManager r0 = r0.A0K()
            int r0 = X.C63982u1.A00(r0, r1)
            if (r0 == 0) goto L_0x0242
            r1 = 2131887901(0x7f12071d, float:1.9410422E38)
            if (r13 == 0) goto L_0x01c8
            r1 = 2131898180(0x7f122f44, float:1.943127E38)
        L_0x01c8:
            X.1KB r0 = r14.A05
            r0.A06(r1, r6)
            r1 = 9
            java.lang.String r0 = "app/startOutgoingCall/failed_cellular_call_in_progress"
            goto L_0x019b
        L_0x01d2:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r10 == r0) goto L_0x01b4
            if (r13 == 0) goto L_0x022e
            java.lang.String r0 = r7.callId
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x022e
            boolean r0 = r7.isAudioChat()
            if (r0 == 0) goto L_0x020a
            com.whatsapp.jid.GroupJid r0 = r7.groupJid
            if (r0 == 0) goto L_0x020a
            java.lang.String r1 = r7.callId
            X.1KB r0 = r14.A05
            X.1FR r2 = r0.A00
            if (r2 == 0) goto L_0x0059
            r14.A05()
            X.C18070vi.A0d(r1, r4)
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = X.C87394Vk.A00(r1)
            r14.A05()
            java.lang.String r0 = "AudioChatBottomSheetDialog"
            r2.CMk(r1, r0)
            goto L_0x0059
        L_0x0206:
            r1 = 7
            java.lang.String r0 = "app/startOutgoingCall/failed_no_record_audio_permission"
            goto L_0x019b
        L_0x020a:
            X.1LU r2 = new X.1LU
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r7.getPeerJid()
            X.C17960vV.A07(r1)
            X.195 r0 = r14.A03
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r1 = r2.A20(r15, r1, r0)
            java.lang.String r0 = "lobbyEntryPoint"
            r1.putExtra(r0, r3)
            r15.startActivity(r1)
            goto L_0x0059
        L_0x022e:
            java.lang.String r0 = "app/startOutgoingCall/ try to start outgoing call from active voip call "
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 2131889960(0x7f120f28, float:1.9414598E38)
            if (r13 == 0) goto L_0x023b
            r1 = 2131889978(0x7f120f3a, float:1.9414635E38)
        L_0x023b:
            X.1KB r0 = r14.A05
            r0.A08(r1, r6)
            goto L_0x0059
        L_0x0242:
            if (r13 != 0) goto L_0x02c0
            if (r17 == 0) goto L_0x02c0
            X.1MZ r3 = r14.A0H
            boolean r0 = r3.A0J(r5)
            r6 = 0
            if (r0 != 0) goto L_0x025d
            r0 = 13
            r14.A06(r0)
            X.190 r1 = r14.A04
            java.lang.String r0 = "linked-group-call/left-chat-group"
        L_0x0258:
            r1.A0G(r0, r6, r4)
        L_0x025b:
            r1 = 1
            return r1
        L_0x025d:
            X.1M9 r0 = r14.A0D
            X.1E7 r1 = r0.A0G(r5)
            X.C17960vV.A07(r1)
            X.00H r0 = r14.A0R
            java.lang.Object r0 = r0.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x027a
            r0 = 17
        L_0x0276:
            r14.A06(r0)
            goto L_0x025b
        L_0x027a:
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x0287
            boolean r0 = r3.A0K(r5)
            if (r0 != 0) goto L_0x0287
            r0 = 14
            goto L_0x0276
        L_0x0287:
            X.1MW r0 = r3.A08
            X.2tp r0 = r0.A0C(r5)
            X.10f r0 = r0.A0C()
            if (r23 != 0) goto L_0x02b3
            int r3 = r0.size()
            X.0ve r2 = r14.A0J
            r1 = 4189(0x105d, float:5.87E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r3 <= r0) goto L_0x02b3
            r0 = 15
            r14.A06(r0)
            X.190 r1 = r14.A04
            java.lang.String r0 = "linked-group-call/log-exceed-size"
            goto L_0x0258
        L_0x02b3:
            X.1TA r0 = r14.A0I
            X.2Q4 r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x02be
            r0 = 11
            goto L_0x0276
        L_0x02be:
            r1 = 0
            return r1
        L_0x02c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.A0A(android.content.Context, X.2m4, com.whatsapp.jid.GroupJid, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, boolean, boolean, boolean):int");
    }
}
