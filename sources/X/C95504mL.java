package X;

import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.bot.prompts.BonsaiPromptsViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.jid.UserJid;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4mL  reason: invalid class name and case insensitive filesystem */
public class C95504mL implements AnonymousClass1WR {
    public final int A00;
    public final Object A01;

    public static Object A00(C95504mL r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A01;
    }

    public static void A01(AnonymousClass3VQ r9) {
        r9.A11.A0F(new AnonymousClass4SI((AnonymousClass1IX) null, (C54242dp) null, (Boolean) null, (Boolean) null, (Collection) null, false, true));
        r9.A0V();
    }

    public C95504mL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02(AnonymousClass206 r6) {
        AnonymousClass205 r2 = r6.A0v;
        String str = r2.A01;
        MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A01;
        AnonymousClass206 r3 = messageDetailsActivity.A0Q;
        if (!str.equals(r3.A0v.A01)) {
            return;
        }
        if (r2.A02 || (r6 instanceof AnonymousClass22H)) {
            MessageDetailsViewModel messageDetailsViewModel = messageDetailsActivity.A0I;
            C98704ra.A00(messageDetailsViewModel.A07, messageDetailsViewModel, r3, 8);
            messageDetailsActivity.A0F.A1u();
        }
    }

    public /* synthetic */ void BmY(AnonymousClass206 r49, int i) {
        C54242dp r0;
        AnonymousClass1E7 A0F;
        int i2;
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r5 = (AnonymousClass3VQ) this.A01;
            AnonymousClass1IX r41 = null;
            boolean z = null;
            boolean z2 = false;
            boolean z3 = false;
            Integer num = null;
            boolean z4 = false;
            boolean z5 = false;
            AnonymousClass206 r7 = r49;
            AnonymousClass205 r6 = r7.A0v;
            AnonymousClass1BI r14 = r6.A00;
            AnonymousClass1BI r4 = r5.A0u;
            if (C42171xk.A00(r14, r4) && r6.A02 && !AnonymousClass3VQ.A0E(r5, r7)) {
                AnonymousClass4RF r3 = r5.A0h;
                if (r5.A1K && (r7 instanceof C436420i) && ((i2 = ((C436420i) r7).A00) == 1 || i2 == 27 || i2 == 4 || i2 == 5 || i2 == 7 || AnonymousClass25A.A0F(i2) || i2 == 13 || i2 == 14 || i2 == 17 || i2 == 31 || i2 == 32 || i2 == 56)) {
                    z3 = true;
                }
                synchronized (r5) {
                    r0 = r5.A0D;
                }
                if (r3.A00(r0, r4, r7)) {
                    List list = r5.A1H;
                    list.add(r7);
                    r41 = AnonymousClass1IX.copyOf((Collection) list);
                    AnonymousClass3VQ.A08(r5);
                }
                if (r5.A07 != 0 && AnonymousClass25A.A0Q(r3.A00, r7)) {
                    AnonymousClass3VQ.A07(r5);
                    AnonymousClass3VQ.A06(r5);
                }
                AnonymousClass206 r2 = r5.A0G;
                if (!(r7.A0D() == 6 || i == 7)) {
                    num = AnonymousClass3MY.A0g();
                    z4 = true;
                    if (r2 != null) {
                        z5 = true;
                    }
                    r5.A0b((AnonymousClass206) null);
                }
                z2 = true;
                z = true;
                Intent intent = r5.A0P;
                boolean z6 = r5.A1L;
                long uptimeMillis = SystemClock.uptimeMillis();
                AnonymousClass1PT r10 = r3.A02;
                int i3 = r7.A0A;
                long j = uptimeMillis - r7.A12;
                long j2 = uptimeMillis - r7.A1F;
                Boolean bool = null;
                int i4 = 0;
                AnonymousClass1PT.A05(r10, r7, (Collection) null, 1, 0, 0, 0, 0, 0, 0, i3, j, j2, j2, false, false, false, false, false);
                if (!(r7 instanceof C436420i)) {
                    AnonymousClass4PC r102 = r3.A01;
                    String stringExtra = intent.getStringExtra("extra_deep_link_session_id");
                    int intExtra = intent.getIntExtra("args_conversation_screen_entry_point", 0);
                    if (intExtra != 0) {
                        r102.A03.A03(r6, intExtra);
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        C86344Rg r11 = r102.A05;
                        C81203yr r62 = new C81203yr();
                        r62.A00 = 1;
                        r62.A01 = stringExtra;
                        r11.A00.CC7(r62);
                        UserJid A002 = C22941Dw.A00(r14);
                        if (A002 != null) {
                            if (C18020vd.A05(C18040vf.A02, r102.A06, 9568) && (A0F = ((C25181Nf) r102.A09.get()).A02.A0F(A002)) != null && A0F.A0C()) {
                                A4F.A01((A4F) r102.A0A.get(), A002, 5);
                            }
                        }
                    }
                    if (z6) {
                        Parcelable.Creator creator = C47712Jo.CREATOR;
                        if ((r4 instanceof C47712Jo) && r4 != null) {
                            C63082sT r112 = (C63082sT) r102.A07.get();
                            AnonymousClass3MX.A0x(r112.A00).CGS(new C21451AkI(r112, r4, 39), "BroadcastAnalyticsManager");
                        }
                    }
                    if (intExtra == 6) {
                        Integer num2 = null;
                        if (intent.hasExtra("args_chat_search_result_type")) {
                            num2 = Integer.valueOf(intent.getIntExtra("args_chat_search_result_type", 0));
                        }
                        if (intent.hasExtra("args_chat_search_type")) {
                            int intExtra2 = intent.getIntExtra("args_chat_search_type", 0);
                            if (!(Integer.valueOf(intExtra2) == null || num2 == null || (intExtra2 != 0 ? intExtra2 != 98 : num2.intValue() != 5))) {
                                Integer num3 = null;
                                if (intent.hasExtra("args_chat_search_result_type")) {
                                    num3 = Integer.valueOf(intent.getIntExtra("args_chat_search_result_type", 0));
                                }
                                if (intent.hasExtra("args_chat_search_type")) {
                                    int intExtra3 = intent.getIntExtra("args_chat_search_type", 0);
                                    if (!(Integer.valueOf(intExtra3) == null || num3 == null || !C20045A4o.A01(r102.A06))) {
                                        if (intExtra3 == 98) {
                                            i4 = 1;
                                        }
                                        AM6 am6 = (AM6) r102.A08.get();
                                        int intValue = num3.intValue();
                                        if (C20045A4o.A01(am6.A00)) {
                                            C171228rN r22 = new C171228rN();
                                            r22.A00 = C17880vN.A0j();
                                            r22.A01 = Integer.valueOf(i4);
                                            r22.A02 = AM6.A00(Integer.valueOf(intValue));
                                            AM6.A01(am6, r22);
                                            am6.A01.CC7(r22);
                                        }
                                        am6.A04((Boolean) null, AM6.A00(Integer.valueOf(intValue)), (String) null, (String) null, (String) null, (Map) null, 2, i4);
                                    }
                                }
                            }
                        }
                    } else if (intExtra == 7) {
                        C131906lr r63 = r102.A02;
                        Boolean bool2 = null;
                        if (intent.hasExtra("isPhoneNumberOwner")) {
                            bool = Boolean.valueOf(intent.getBooleanExtra("isPhoneNumberOwner", false));
                        }
                        if (intent.hasExtra("isWAAccount")) {
                            bool2 = Boolean.valueOf(intent.getBooleanExtra("isWAAccount", false));
                        }
                        r63.A00(bool, bool2, 9);
                    }
                }
            }
            r5.A10.A0F(new AnonymousClass4O0(num, z3, z4, z5));
            r5.A11.A0F(new AnonymousClass4SI(r41, (C54242dp) null, (Boolean) null, z, (Collection) null, z2, false));
        }
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r3) {
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r1 = (AnonymousClass3VQ) this.A01;
            if (r3 != null && r3.equals(r1.A0u)) {
                r1.A0K = true;
                A01(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x018e, code lost:
        if (r0 == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0228, code lost:
        if (((X.C436420i) r3).A00 != 118) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (((X.C436420i) r3).A00 != 118) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        if (r2.A07 != 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012f, code lost:
        com.whatsapp.util.Log.i("messagesViewModel/addreceived/staledata ", r1);
        r0 = r2.A1H;
        r0.add(r3);
        r27 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0);
        X.AnonymousClass3VQ.A08(r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void ByH(X.AnonymousClass206 r35, int r36) {
        /*
            r34 = this;
            r5 = r34
            int r0 = r5.A00
            r3 = r35
            switch(r0) {
                case 1: goto L_0x02fa;
                case 2: goto L_0x02c6;
                case 3: goto L_0x02ae;
                case 12: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r5.A01
            X.3VQ r2 = (X.AnonymousClass3VQ) r2
            boolean r0 = X.AnonymousClass3VQ.A0E(r2, r3)
            if (r0 != 0) goto L_0x0009
            X.205 r4 = r3.A0v
            X.1BI r0 = r4.A00
            X.1BI r8 = r2.A0u
            boolean r0 = X.C42171xk.A00(r0, r8)
            if (r0 == 0) goto L_0x0009
            r28 = 0
            r27 = r28
            r20 = 0
            r13 = 0
            r22 = 0
            r24 = 0
            r12 = 0
            r14 = 0
            r11 = 0
            r17 = r28
            X.4RF r10 = r2.A0h
            boolean r0 = X.AnonymousClass25A.A0k(r3)     // Catch:{ Exception -> 0x0039 }
            if (r0 == 0) goto L_0x0042
            goto L_0x0040
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "messageObserverHelper/onMessageAddedHandleEphemeralMessageNux/consumed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0042
        L_0x0040:
            r20 = 1
        L_0x0042:
            boolean r6 = r4.A02
            if (r6 == 0) goto L_0x006d
            boolean r0 = r3.A0u()
            if (r0 != 0) goto L_0x006d
            X.11S r0 = r2.A0b
            boolean r0 = X.AnonymousClass25A.A0Q(r0, r3)
            if (r0 != 0) goto L_0x0148
            boolean r0 = r3 instanceof X.C436420i
            if (r0 == 0) goto L_0x0148
            X.0ve r4 = r2.A0t
            r1 = 4546(0x11c2, float:6.37E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x006d
            r0 = r3
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x0148
        L_0x006d:
            long r0 = r3.A0x
            r15 = -1
            r7 = 1
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r4)
            java.lang.String r0 = "row id must be present"
            X.C17960vV.A0F(r1, r0)
            int r1 = X.AnonymousClass3VQ.A00(r2)     // Catch:{ StaleDataException -> 0x012e }
            X.206 r0 = r2.A0T()     // Catch:{ StaleDataException -> 0x012e }
            if (r1 <= 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
            long r4 = r0.A0y     // Catch:{ StaleDataException -> 0x012e }
            long r0 = r3.A0y     // Catch:{ StaleDataException -> 0x012e }
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x00a2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ StaleDataException -> 0x012e }
            java.lang.String r0 = "messagesViewModel/addreceived/skip/"
            r1.append(r0)     // Catch:{ StaleDataException -> 0x012e }
            java.lang.String r0 = X.AnonymousClass25A.A0D(r3)     // Catch:{ StaleDataException -> 0x012e }
            X.C17890vO.A1A(r1, r0)     // Catch:{ StaleDataException -> 0x012e }
            goto L_0x00dd
        L_0x00a2:
            monitor-enter(r2)     // Catch:{ StaleDataException -> 0x012e }
            X.2dp r0 = r2.A0D     // Catch:{ all -> 0x012b }
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x012e }
            boolean r0 = r10.A00(r0, r8, r3)     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x00dd
            X.1QT r4 = r2.A0k     // Catch:{ StaleDataException -> 0x012e }
            boolean r0 = r4.A00(r3)     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x00f3
            java.lang.Integer r0 = r3.A0R     // Catch:{ StaleDataException -> 0x012e }
            if (r0 != 0) goto L_0x00f3
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x00ce
        L_0x00bc:
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x012e }
            int r0 = r0 + 1
            r2.A07 = r0     // Catch:{ StaleDataException -> 0x012e }
            int r1 = r3.A0u     // Catch:{ StaleDataException -> 0x012e }
            r0 = 10
            if (r1 != r0) goto L_0x00e8
            int r0 = r2.A06     // Catch:{ StaleDataException -> 0x012e }
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ StaleDataException -> 0x012e }
        L_0x00ce:
            X.AnonymousClass3VQ.A06(r2)     // Catch:{ StaleDataException -> 0x012e }
            java.util.List r0 = r2.A1H     // Catch:{ StaleDataException -> 0x012e }
            r0.add(r3)     // Catch:{ StaleDataException -> 0x012e }
            X.1IX r27 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0)     // Catch:{ StaleDataException -> 0x012e }
            X.AnonymousClass3VQ.A08(r2)     // Catch:{ StaleDataException -> 0x012e }
        L_0x00dd:
            X.1BI r0 = r3.A0H()     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x0113
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)     // Catch:{ StaleDataException -> 0x012e }
            goto L_0x010f
        L_0x00e8:
            boolean r0 = r3 instanceof X.C436420i     // Catch:{ StaleDataException -> 0x012e }
            if (r0 != 0) goto L_0x00ce
            int r0 = r2.A05     // Catch:{ StaleDataException -> 0x012e }
            int r0 = r0 + 1
            r2.A05 = r0     // Catch:{ StaleDataException -> 0x012e }
            goto L_0x00ce
        L_0x00f3:
            monitor-enter(r2)     // Catch:{ StaleDataException -> 0x012e }
            X.206 r1 = r2.A0F     // Catch:{ all -> 0x0128 }
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x012e }
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x00bc
            if (r1 == 0) goto L_0x00bc
            X.11S r0 = r2.A0b     // Catch:{ StaleDataException -> 0x012e }
            boolean r0 = X.AnonymousClass25A.A0Q(r0, r1)     // Catch:{ StaleDataException -> 0x012e }
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.A00(r1)     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x00bc
        L_0x010b:
            X.AnonymousClass3VQ.A07(r2)     // Catch:{ StaleDataException -> 0x012e }
            goto L_0x00bc
        L_0x010f:
            if (r0 == 0) goto L_0x0113
            r17 = r0
        L_0x0113:
            boolean r0 = r3.A0u()     // Catch:{ StaleDataException -> 0x012e }
            if (r0 == 0) goto L_0x0140
            r0 = 1048576(0x100000, double:5.180654E-318)
            boolean r0 = r3.A11(r0)     // Catch:{ StaleDataException -> 0x012e }
            if (r0 != 0) goto L_0x0140
            r2.A0K = r7     // Catch:{ StaleDataException -> 0x012e }
            r2.A0c(r13)     // Catch:{ StaleDataException -> 0x012e }
            goto L_0x0140
        L_0x0128:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x012e }
            throw r0     // Catch:{ StaleDataException -> 0x012e }
        L_0x012b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x012e }
            throw r0     // Catch:{ StaleDataException -> 0x012e }
        L_0x012e:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addreceived/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            java.util.List r0 = r2.A1H
            r0.add(r3)
            X.1IX r27 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0)
            X.AnonymousClass3VQ.A08(r2)
        L_0x0140:
            X.10I r1 = r2.A1C
            r0 = 45
            X.C98704ra.A00(r1, r2, r3, r0)
            goto L_0x0156
        L_0x0148:
            boolean r0 = r3 instanceof X.C436420i
            if (r0 == 0) goto L_0x0245
            r0 = r3
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 28
            if (r1 != r0) goto L_0x0245
            r13 = 1
        L_0x0156:
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0205
            boolean r0 = X.AnonymousClass25A.A0p(r3)
            if (r0 != 0) goto L_0x0205
            boolean r0 = r3.A0u()
            if (r0 != 0) goto L_0x0205
            X.11S r1 = r2.A0b
            boolean r0 = X.AnonymousClass25A.A0Q(r1, r3)
            if (r0 != 0) goto L_0x0205
            int r0 = r2.A04
            int r11 = r0 + 1
            r2.A04 = r11
            boolean r0 = X.AnonymousClass25A.A0M(r1, r3)
            if (r0 == 0) goto L_0x0188
            java.util.ArrayList r0 = r2.A1G
            r0.add(r3)
            X.4Xh r1 = X.C87844Xh.A00(r2, r0)
            X.1DT r0 = r2.A0V
            r0.A0E(r1)
        L_0x0188:
            boolean r0 = r2.A0I
            if (r6 != 0) goto L_0x0190
            r23 = 1
            if (r0 != 0) goto L_0x0192
        L_0x0190:
            r23 = 0
        L_0x0192:
            X.11S r0 = r2.A0b
            boolean r0 = X.AnonymousClass25A.A0O(r0, r3)
            if (r0 == 0) goto L_0x019c
            r24 = 1
        L_0x019c:
            boolean r0 = r2.A1K
            if (r0 == 0) goto L_0x01ba
            X.1QO r0 = r10.A03
            boolean r0 = r0.A04(r12)
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r3 instanceof X.C436420i
            if (r0 == 0) goto L_0x01ba
            r0 = r3
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 32
            if (r1 == r0) goto L_0x01b9
            r0 = 31
            if (r1 != r0) goto L_0x01ba
        L_0x01b9:
            r12 = 1
        L_0x01ba:
            X.1wy r1 = r2.A14
            X.4SP r0 = new X.4SP
            r21 = r13
            r25 = r12
            r26 = r22
            r18 = r3
            r19 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A0F(r0)
            X.1wy r1 = r2.A11
            r32 = 1
            X.4SI r0 = new X.4SI
            r30 = r28
            r31 = r28
            r26 = r0
            r29 = r28
            r33 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r1.A0F(r0)
            boolean r0 = X.AnonymousClass3VQ.A0D(r2, r3)
            if (r0 == 0) goto L_0x01f3
            if (r6 != 0) goto L_0x01f3
            X.1wy r0 = r2.A19
            X.AnonymousClass3MY.A1L(r0, r14)
        L_0x01f3:
            X.AnonymousClass3VQ.A08(r2)
            if (r6 == 0) goto L_0x0009
            X.10I r3 = r2.A1C
            r1 = 12
            X.4rL r0 = new X.4rL
            r0.<init>(r2, r1)
            r3.CGN(r0)
            return
        L_0x0205:
            int r0 = r2.A03
            if (r0 != 0) goto L_0x022c
            X.11S r0 = r2.A0b
            boolean r0 = X.AnonymousClass25A.A0Q(r0, r3)
            if (r0 == 0) goto L_0x022c
            boolean r0 = r3 instanceof X.C436420i
            if (r0 == 0) goto L_0x022c
            X.0ve r4 = r2.A0t
            r1 = 4547(0x11c3, float:6.372E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x0188
            r0 = r3
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r1 != r0) goto L_0x022c
            goto L_0x0188
        L_0x022c:
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r2.A0f
            X.1DT r0 = r0.A01
            java.lang.Object r0 = r0.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0241
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0241
            goto L_0x0188
        L_0x0241:
            r22 = 1
            goto L_0x0188
        L_0x0245:
            int r9 = X.AnonymousClass3VQ.A00(r2)
            X.206 r8 = r2.A0T()
            java.util.List r7 = r2.A1H
            java.lang.String r16 = "messagesViewModel/addsent/skipped/"
            if (r9 != 0) goto L_0x026c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r16)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = X.AnonymousClass25A.A0D(r3)     // Catch:{ StaleDataException -> 0x02a6 }
            r1.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = " adapter-count:0"
            X.C17890vO.A1A(r1, r0)     // Catch:{ StaleDataException -> 0x02a6 }
            r7.add(r3)     // Catch:{ StaleDataException -> 0x02a6 }
            X.1IX r27 = X.AnonymousClass1IX.copyOf((java.util.Collection) r7)     // Catch:{ StaleDataException -> 0x02a6 }
            goto L_0x0156
        L_0x026c:
            if (r8 == 0) goto L_0x0156
            long r4 = r8.A0y     // Catch:{ StaleDataException -> 0x02a6 }
            long r0 = r3.A0y     // Catch:{ StaleDataException -> 0x02a6 }
            int r15 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x0156
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r16)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = X.AnonymousClass25A.A0D(r3)     // Catch:{ StaleDataException -> 0x02a6 }
            r4.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = " adapter-count:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            r4.append(r9)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = " las-row-id:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            long r0 = r8.A0x     // Catch:{ StaleDataException -> 0x02a6 }
            r4.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            java.lang.String r0 = " cur-row-id:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x02a6 }
            long r0 = r3.A0x     // Catch:{ StaleDataException -> 0x02a6 }
            X.C17890vO.A16(r4, r0)     // Catch:{ StaleDataException -> 0x02a6 }
            r7.add(r3)     // Catch:{ StaleDataException -> 0x02a6 }
            X.1IX r27 = X.AnonymousClass1IX.copyOf((java.util.Collection) r7)     // Catch:{ StaleDataException -> 0x02a6 }
            goto L_0x0156
        L_0x02a6:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addsent/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x0156
        L_0x02ae:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.205 r0 = r3.A0v
            X.1BI r2 = r0.A00
            java.lang.Object r1 = r5.A01
            X.3Uv r1 = (X.AnonymousClass3Uv) r1
            X.1BI r0 = r1.A0E
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.AnonymousClass3Uv.A00(r1, r3)
            return
        L_0x02c6:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.205 r1 = r3.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            X.1BI r2 = r1.A00
            java.lang.Object r1 = r5.A01
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r1 = (com.whatsapp.bot.prompts.BonsaiPromptsViewModel) r1
            X.1BI r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0009
            X.1vp r1 = r1.A05
            java.util.List r0 = X.AnonymousClass3MW.A10(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0009
            boolean r0 = X.C83574Fq.A00(r3)
            if (r0 != 0) goto L_0x0009
            boolean r0 = r3 instanceof X.C436420i
            if (r0 != 0) goto L_0x0009
            X.0wS r0 = X.C18460wS.A00
            r1.A0F(r0)
            return
        L_0x02fa:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.205 r4 = r3.A0v
            X.1BI r2 = r4.A00
            java.lang.Object r1 = r5.A01
            X.3Uy r1 = (X.C73343Uy) r1
            X.1BI r0 = r1.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0009
            boolean r0 = X.C83574Fq.A00(r3)
            if (r0 != 0) goto L_0x0009
            boolean r0 = r3 instanceof X.C436420i
            if (r0 != 0) goto L_0x0009
            r0 = 1
            r1.A03 = r0
            X.C73343Uy.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504mL.ByH(X.206, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if ((r11 instanceof X.AnonymousClass23N) == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r3.A4e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r3.getListView().post(new X.C98704ra(r3, r11, 9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByK(X.AnonymousClass206 r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x01bd;
                case 5: goto L_0x019e;
                case 6: goto L_0x0137;
                case 7: goto L_0x0044;
                case 8: goto L_0x0210;
                case 9: goto L_0x0120;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0065;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x002c;
                case 16: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = A00(r10, r11)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity r2 = (com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity) r2
            X.0vl r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r11 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x0005
            X.0vl r0 = r2.A0B
            java.lang.Object r0 = r0.getValue()
            X.3X8 r0 = (X.AnonymousClass3X8) r0
            r0.A0U(r11)
            return
        L_0x002c:
            java.lang.Object r3 = A00(r10, r11)
            X.3vF r3 = (X.C79333vF) r3
            X.1BI r1 = r3.A0E
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11 instanceof X.AnonymousClass23N
            if (r0 != 0) goto L_0x0061
            goto L_0x0128
        L_0x0044:
            r0 = 30
            if (r12 == r0) goto L_0x004f
            int r1 = r11.A0C()
            r0 = 1
            if (r1 != r0) goto L_0x0005
        L_0x004f:
            java.lang.Object r3 = r10.A01
            X.3vF r3 = (X.C79333vF) r3
            android.widget.ListView r2 = r3.getListView()
            r1 = 9
            X.4ra r0 = new X.4ra
            r0.<init>(r3, r11, r1)
            r2.post(r0)
        L_0x0061:
            r3.A4e()
            return
        L_0x0065:
            java.lang.Object r3 = r10.A01
            X.3VQ r3 = (X.AnonymousClass3VQ) r3
            X.205 r6 = r11.A0v
            X.1BI r1 = r6.A00
            X.1BI r0 = r3.A0u
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 == 0) goto L_0x0005
            int r1 = r11.A0u
            r0 = 8
            if (r1 == r0) goto L_0x0005
            X.1wy r5 = r3.A15
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Object r4 = r5.A06()
        L_0x008b:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x00e8
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x0093:
            r7 = 24
            boolean r1 = X.AnonymousClass000.A1T(r12, r7)
            X.4Ru r0 = new X.4Ru
            r0.<init>(r11, r12, r1)
            r4.add(r0)
            r5.A0F(r4)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r4.iterator()
        L_0x00ac:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r2 = r9.next()
            X.4Ru r2 = (X.C86484Ru) r2
            int r1 = r2.A00
            r0 = 34
            if (r1 != r0) goto L_0x00ac
            X.206 r8 = r2.A01
            X.205 r5 = r8.A0v
            int r4 = X.C63892tr.A00(r8)
            r2 = 1
            java.util.Map r1 = r3.A1I
            boolean r0 = r1.containsKey(r5)
            if (r4 != r2) goto L_0x00e0
            if (r0 != 0) goto L_0x00ac
            r1.put(r5, r8)
            java.lang.Integer r2 = X.AnonymousClass00R.A00
        L_0x00d6:
            r1 = 0
            X.4YP r0 = new X.4YP
            r0.<init>(r8, r1, r2)
            r6.add(r0)
            goto L_0x00ac
        L_0x00e0:
            if (r0 == 0) goto L_0x00ac
            r1.remove(r5)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            goto L_0x00d6
        L_0x00e8:
            java.util.Iterator r2 = r4.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r2.next()
            X.4Ru r1 = (X.C86484Ru) r1
            X.206 r0 = r1.A01
            X.205 r0 = r0.A0v
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00ec
            int r0 = r1.A00
            if (r0 != r12) goto L_0x00ec
            r2.remove()
            goto L_0x00ec
        L_0x010a:
            r4 = 0
            goto L_0x008b
        L_0x010c:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x011a
            r6.size()
            X.1wy r0 = r3.A16
            r0.A0F(r6)
        L_0x011a:
            if (r12 != r7) goto L_0x0005
            X.AnonymousClass3VQ.A0C(r3, r11)
            return
        L_0x0120:
            boolean r0 = r11.A0q
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r10.A01
            X.3cp r3 = (X.C74803cp) r3
        L_0x0128:
            android.widget.ListView r2 = r3.getListView()
            r1 = 9
            X.4ra r0 = new X.4ra
            r0.<init>(r3, r11, r1)
            r2.post(r0)
            return
        L_0x0137:
            java.lang.Object r4 = r10.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r4 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r4
            X.247 r2 = r4.A07
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1W(r2)
            if (r2 == r11) goto L_0x0145
            r1 = 0
        L_0x0145:
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0162
            r0 = 45
            if (r12 != r0) goto L_0x0162
            X.3Ot r1 = r4.A0A
            java.util.ArrayList r0 = r2.A17()
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r1.A00(r0)
            X.3Ot r0 = r4.A0A
            r0.notifyDataSetChanged()
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A10(r4)
            return
        L_0x0162:
            X.3Ot r0 = r4.A0A
            X.205 r3 = r11.A0v
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0005
            java.util.Iterator r1 = r0.iterator()
        L_0x016e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.205 r0 = X.AnonymousClass3MZ.A10(r1)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x016e
            android.widget.ListView r0 = r4.getListView()
            android.view.View r2 = r0.findViewWithTag(r3)
            if (r2 == 0) goto L_0x0257
            X.3uP r2 = (X.AnonymousClass3uP) r2
            boolean r0 = r2.A2h(r3)
            if (r0 == 0) goto L_0x0251
            r0 = 8
            if (r12 != r0) goto L_0x0214
            X.206 r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x0243
            r2.A1y()
            return
        L_0x019e:
            if (r11 == 0) goto L_0x0005
            java.lang.Object r1 = r10.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.2Jo r0 = r1.A4l()
            boolean r0 = X.AnonymousClass3Ma.A1X(r11, r0)
            if (r0 == 0) goto L_0x0005
            int r0 = r11.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r0)
            if (r0 == 0) goto L_0x0005
            r0 = 3
            if (r12 != r0) goto L_0x0005
            com.whatsapp.chatinfo.ListChatInfoActivity.A10(r1)
            return
        L_0x01bd:
            java.lang.Object r1 = r10.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A4l()
            boolean r0 = X.AnonymousClass3Ma.A1X(r11, r0)
            if (r0 == 0) goto L_0x01e0
            int r0 = r11.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r0)
            if (r0 == 0) goto L_0x01e0
            r0 = 3
            if (r12 == r0) goto L_0x01da
            r0 = 9
            if (r12 != r0) goto L_0x01e0
        L_0x01da:
            X.3oT r0 = r1.A0k
            r0.A0V()
            return
        L_0x01e0:
            r0 = 30
            if (r12 != r0) goto L_0x0005
            goto L_0x01da
        L_0x01e5:
            r3 = 0
            X.C18070vi.A0d(r11, r3)
            java.lang.Object r2 = r10.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r2 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel) r2
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x01f9
            int r1 = r0.intValue()
            r0 = -1
            if (r1 != r0) goto L_0x01f9
            return
        L_0x01f9:
            boolean r0 = r11 instanceof X.AnonymousClass24D
            if (r0 == 0) goto L_0x0005
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMeOnboardingViewModel/onMessageChanged FMessageImagineMeOnboarding changed with type "
            X.C17900vP.A0j(r0, r1, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A03 = r0
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel.A03(r2, r3)
            return
        L_0x0210:
            r10.A02(r11)
            return
        L_0x0214:
            r0 = 12
            if (r12 != r0) goto L_0x0222
            X.206 r0 = r2.getFMessage()
            if (r0 != r11) goto L_0x0243
            r2.A1v()
            return
        L_0x0222:
            r0 = 27
            if (r12 == r0) goto L_0x0248
            r0 = 39
            if (r12 == r0) goto L_0x0248
            r0 = 30
            if (r12 != r0) goto L_0x0237
            int r1 = r11.A0C()
            r0 = 0
            r2.A26(r1, r0)
            return
        L_0x0237:
            r0 = 34
            if (r12 != r0) goto L_0x0243
            int r0 = X.C63892tr.A00(r11)
            r2.A24(r0)
            return
        L_0x0243:
            r0 = 1
            r2.A2V(r11, r0)
            return
        L_0x0248:
            r2.A2S(r11, r12)
            int r0 = r2.A01
            r2.A23(r0)
            return
        L_0x0251:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0257:
            java.util.HashSet r0 = r4.A0a
            r0.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504mL.ByK(X.206, int):void");
    }

    public /* synthetic */ void ByN(AnonymousClass206 r4) {
        switch (this.A00) {
            case 7:
                ((C79333vF) this.A01).A4e();
                return;
            case 8:
                A02(r4);
                return;
            case 15:
                C79333vF r2 = (C79333vF) A00(this, r4);
                if (C18070vi.A18(r2.A0E, r4.A0v.A00)) {
                    r2.A4e();
                    return;
                }
                return;
            case 16:
                NewsletterCopyrightSuspensionInfoActivity newsletterCopyrightSuspensionInfoActivity = (NewsletterCopyrightSuspensionInfoActivity) A00(this, r4);
                if (C18070vi.A18(newsletterCopyrightSuspensionInfoActivity.A0A.getValue(), r4.A0v.A00)) {
                    ((AnonymousClass3X8) newsletterCopyrightSuspensionInfoActivity.A0B.getValue()).A0U(r4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r4, AnonymousClass206 r5) {
        switch (this.A00) {
            case 3:
                C18070vi.A0d(r5, 1);
                AnonymousClass1BI r2 = r5.A0v.A00;
                AnonymousClass3Uv r1 = (AnonymousClass3Uv) this.A01;
                if (C18070vi.A18(r2, r1.A0E)) {
                    AnonymousClass3Uv.A00(r1, r5);
                    return;
                }
                return;
            case 12:
                AnonymousClass3VQ r22 = (AnonymousClass3VQ) this.A01;
                if (C42171xk.A00(r4.A0v.A00, r22.A0u)) {
                    r22.A0Y.A0F(new Pair(r4, r5));
                    r22.A0V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r6) {
        AnonymousClass1DS r1;
        List list;
        C446324e r0;
        switch (this.A00) {
            case 1:
                C73343Uy r12 = (C73343Uy) A00(this, r6);
                if (r6.equals(r12.A00)) {
                    C73343Uy.A00(r12);
                    return;
                }
                return;
            case 2:
                BonsaiPromptsViewModel bonsaiPromptsViewModel = (BonsaiPromptsViewModel) A00(this, r6);
                if (r6.equals(bonsaiPromptsViewModel.A00) && (r0 = bonsaiPromptsViewModel.A08) != null) {
                    r1 = bonsaiPromptsViewModel.A05;
                    list = r0.A0H;
                    break;
                } else {
                    return;
                }
                break;
            case 3:
                AnonymousClass3Uv r13 = (AnonymousClass3Uv) A00(this, r6);
                if (r6.equals(r13.A0E)) {
                    r1 = r13.A00;
                    list = null;
                    break;
                } else {
                    return;
                }
            case 8:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A01;
                if (AnonymousClass3Ma.A1X(messageDetailsActivity.A0Q, r6) && AnonymousClass1W2.A01(messageDetailsActivity.A0Q.A0v, messageDetailsActivity.A0U) == null) {
                    messageDetailsActivity.finish();
                    return;
                }
                return;
            case 12:
                AnonymousClass3VQ r4 = (AnonymousClass3VQ) this.A01;
                if (r6.equals(r4.A0u)) {
                    AnonymousClass3VQ.A07(r4);
                    r4.A0V();
                    Map map = r4.A1I;
                    if (!map.isEmpty()) {
                        r4.A16.A0F(AnonymousClass4HE.A00(AnonymousClass00R.A01, map.values()));
                        map.clear();
                    }
                    r4.A1C.CGN(new C98554rL(r4, 12));
                    return;
                }
                return;
            default:
                return;
        }
        r1.A0F(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020b, code lost:
        if (r5.A06 <= 0) goto L_0x020d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Bya(java.util.Collection r11, java.util.Map r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 3: goto L_0x0353;
                case 4: goto L_0x0325;
                case 5: goto L_0x02f9;
                case 6: goto L_0x038a;
                case 7: goto L_0x02dc;
                case 8: goto L_0x02bc;
                case 9: goto L_0x02a9;
                case 10: goto L_0x0279;
                case 11: goto L_0x0262;
                case 12: goto L_0x0120;
                case 13: goto L_0x00fe;
                case 14: goto L_0x00d2;
                case 15: goto L_0x00a8;
                case 16: goto L_0x0019;
                case 17: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r10.A01
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            android.os.Handler r1 = r2.A0T
            java.lang.Runnable r0 = r2.A0U
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A0P
            if (r0 == 0) goto L_0x0005
            r0.run()
            return
        L_0x0019:
            java.lang.Object r4 = A00(r10, r11)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity r4 = (com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity) r4
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r11.iterator()
        L_0x0027:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r3 = r6.next()
            r2 = r3
            X.206 r2 = (X.AnonymousClass206) r2
            X.0vl r0 = r4.A0A
            java.lang.Object r1 = r0.getValue()
            X.205 r0 = r2.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0027
            r5.add(r3)
            goto L_0x0027
        L_0x0048:
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x0094
            X.0vl r0 = r4.A0B
            java.lang.Object r6 = r0.getValue()
            X.3X8 r6 = (X.AnonymousClass3X8) r6
            java.util.ArrayList r2 = X.C29351c6.A0D(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            X.C72463Mc.A1L(r2, r1)
            goto L_0x005e
        L_0x0068:
            java.util.Set r5 = X.C29431cG.A12(r2)
            java.util.List r0 = r6.A01
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0076:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Tv r0 = (X.C86984Tv) r0
            X.206 r0 = r0.A01
            X.205 r0 = r0.A0v
            boolean r0 = r5.contains(r0)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x0076
        L_0x008f:
            r6.A01 = r3
            r6.notifyDataSetChanged()
        L_0x0094:
            X.0vl r0 = r4.A0B
            java.lang.Object r0 = r0.getValue()
            X.3X8 r0 = (X.AnonymousClass3X8) r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0005
            X.C72453Mb.A14(r4)
            return
        L_0x00a8:
            java.lang.Object r3 = A00(r10, r11)
            X.3vF r3 = (X.C79333vF) r3
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r2 = r11.iterator()
        L_0x00b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r0 = X.C17880vN.A0Y(r2)
            X.1BI r1 = r3.A0E
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00b8
            r3.A4e()
            return
        L_0x00d2:
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r2 = r11.iterator()
        L_0x00e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r1 = X.C17880vN.A0Y(r2)
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x00e0
            int r0 = r1.A0u
            boolean r0 = X.AnonymousClass25A.A0J(r0)
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r10.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x00fe:
            java.util.Iterator r3 = r11.iterator()
        L_0x0102:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.205 r0 = X.AnonymousClass3MZ.A10(r3)
            X.1BI r2 = r0.A00
            if (r2 == 0) goto L_0x0102
            java.lang.Object r1 = r10.A01
            com.whatsapp.gallery.GalleryFragmentBase r1 = (com.whatsapp.gallery.GalleryFragmentBase) r1
            X.1BI r0 = r1.A0D
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0102
            com.whatsapp.gallery.GalleryFragmentBase.A02(r1)
            return
        L_0x0120:
            java.lang.Object r5 = r10.A01
            X.3VQ r5 = (X.AnonymousClass3VQ) r5
            java.util.Iterator r7 = r11.iterator()
            r6 = 0
            r9 = 0
            r8 = 0
        L_0x012b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01aa
            X.206 r2 = X.C17880vN.A0Y(r7)
            X.205 r4 = r2.A0v
            X.1BI r1 = r4.A00
            X.1BI r0 = r5.A0u
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 == 0) goto L_0x017b
            X.5c3 r1 = r5.A1D
            boolean r0 = r1.BT1()
            if (r0 == 0) goto L_0x0154
            X.205 r0 = r1.BPv()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0154
            r9 = 1
        L_0x0154:
            X.1QT r0 = r5.A0k
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0175
            int r0 = r5.A07
            if (r0 <= 0) goto L_0x0175
            int r0 = r0 + -1
            r5.A07 = r0
            int r1 = r2.A0u
            r0 = 10
            if (r1 == r0) goto L_0x0172
            int r0 = r5.A05
            if (r0 <= 0) goto L_0x0172
            int r0 = r0 + -1
            r5.A05 = r0
        L_0x0172:
            X.AnonymousClass3VQ.A06(r5)
        L_0x0175:
            boolean r0 = r4.A02
            r6 = 1
            if (r0 == 0) goto L_0x017b
            r8 = 1
        L_0x017b:
            X.4Px r0 = r5.A1E
            X.4ZL r0 = r0.A00
            java.util.List r0 = r0.A0D
            java.util.Iterator r3 = r0.iterator()
        L_0x0185:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r2 = r3.next()
            X.4OI r2 = (X.AnonymousClass4OI) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r4.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0185
            X.4LI r0 = r2.A01
            if (r0 == 0) goto L_0x01a4
            X.49n r0 = r0.A00
            X.C827349n.A00(r0)
        L_0x01a4:
            X.70X r0 = r2.A03
            r0.A0F()
            goto L_0x0185
        L_0x01aa:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagesViewModel/observer/delete/unseen "
            r2.append(r0)
            int r0 = r5.A07
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r0 = r5.A05
            r2.append(r0)
            r2.append(r1)
            int r0 = r5.A06
            X.C17900vP.A0o(r2, r0)
            if (r6 == 0) goto L_0x0005
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r0 = r11.iterator()
            X.206 r0 = X.C17880vN.A0Y(r0)
            boolean r0 = r0.A18
            if (r0 != 0) goto L_0x020d
            long r1 = r5.A09
            r3 = -9223372036854775808
            r7 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0210
            java.util.Iterator r6 = r11.iterator()
        L_0x01eb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0200
            X.206 r0 = X.C17880vN.A0Y(r6)
            long r3 = r5.A09
            long r1 = r0.A0y
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01eb
            int r7 = r7 + 1
            goto L_0x01eb
        L_0x0200:
            if (r7 <= 0) goto L_0x0210
            int r0 = r5.A05
            int r0 = r0 - r7
            r5.A05 = r0
            if (r0 > 0) goto L_0x0210
            int r0 = r5.A06
            if (r0 > 0) goto L_0x0210
        L_0x020d:
            X.AnonymousClass3VQ.A07(r5)
        L_0x0210:
            r5.A0V()
            if (r9 == 0) goto L_0x021a
            X.5c3 r0 = r5.A1D
            r0.BF9()
        L_0x021a:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r11.iterator()
        L_0x0222:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0245
            X.206 r3 = X.C17880vN.A0Y(r4)
            java.util.Map r2 = r5.A1I
            X.205 r1 = r3.A0v
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0222
            r2.remove(r1)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r1 = 0
            X.4YP r0 = new X.4YP
            r0.<init>(r3, r1, r2)
            r6.add(r0)
            goto L_0x0222
        L_0x0245:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0253
            r6.size()
            X.1wy r0 = r5.A16
            r0.A0F(r6)
        L_0x0253:
            if (r8 == 0) goto L_0x0005
            X.10I r2 = r5.A1C
            r1 = 12
            X.4rL r0 = new X.4rL
            r0.<init>(r5, r1)
            r2.CGN(r0)
            return
        L_0x0262:
            java.lang.Object r0 = A00(r10, r11)
            X.3U8 r0 = (X.AnonymousClass3U8) r0
            X.1DT r1 = r0.A00
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C29431cG.A18(r11, r0)
            if (r0 == 0) goto L_0x0005
            r0 = 0
            r1.A0F(r0)
            return
        L_0x0279:
            java.lang.Object r4 = A00(r10, r11)
            com.whatsapp.conversation.selection.SelectedImageAlbumViewModel r4 = (com.whatsapp.conversation.selection.SelectedImageAlbumViewModel) r4
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0005
            java.util.Iterator r3 = r11.iterator()
        L_0x0289:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r3.next()
            X.1DT r2 = r4.A00
            java.lang.Object r0 = r2.A06()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0289
            boolean r1 = X.C29431cG.A18(r0, r1)
            r0 = 1
            if (r1 != r0) goto L_0x0289
            r0 = 0
            r2.A0F(r0)
            return
        L_0x02a9:
            java.util.Iterator r1 = r11.iterator()
        L_0x02ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r0 = X.C17880vN.A0Y(r1)
            boolean r0 = r0.A0q
            if (r0 == 0) goto L_0x02ad
            goto L_0x02f1
        L_0x02bc:
            java.util.Iterator r3 = r11.iterator()
        L_0x02c0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.205 r2 = X.AnonymousClass3MZ.A10(r3)
            java.lang.Object r1 = r10.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            X.206 r0 = r1.A0Q
            X.205 r0 = r0.A0v
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02c0
            r1.finish()
            return
        L_0x02dc:
            java.util.Iterator r2 = r11.iterator()
        L_0x02e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r0 = X.C17880vN.A0Y(r2)
            int r1 = r0.A0C()
            r0 = 1
            if (r1 != r0) goto L_0x02e0
        L_0x02f1:
            java.lang.Object r0 = r10.A01
            X.3vF r0 = (X.C79333vF) r0
            r0.A4e()
            return
        L_0x02f9:
            java.util.Iterator r3 = r11.iterator()
        L_0x02fd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r2 = X.C17880vN.A0Y(r3)
            java.lang.Object r1 = r10.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.2Jo r0 = r1.A4l()
            boolean r0 = X.AnonymousClass3Ma.A1X(r2, r0)
            if (r0 == 0) goto L_0x02fd
            int r0 = r2.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r0)
            if (r0 != 0) goto L_0x0321
            boolean r0 = r2.A0q
            if (r0 == 0) goto L_0x02fd
        L_0x0321:
            com.whatsapp.chatinfo.ListChatInfoActivity.A10(r1)
            return
        L_0x0325:
            java.util.Iterator r3 = r11.iterator()
        L_0x0329:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.206 r2 = X.C17880vN.A0Y(r3)
            java.lang.Object r1 = r10.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A4l()
            boolean r0 = X.AnonymousClass3Ma.A1X(r2, r0)
            if (r0 == 0) goto L_0x0329
            int r0 = r2.A0u
            boolean r0 = X.AnonymousClass25A.A0H(r0)
            if (r0 != 0) goto L_0x034d
            boolean r0 = r2.A0q
            if (r0 == 0) goto L_0x0329
        L_0x034d:
            X.3oT r0 = r1.A0k
            r0.A0V()
            return
        L_0x0353:
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            java.util.ArrayList r4 = X.C29351c6.A0D(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x035f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0369
            X.C72463Mc.A1L(r4, r1)
            goto L_0x035f
        L_0x0369:
            java.lang.Object r3 = r10.A01
            X.3Uv r3 = (X.AnonymousClass3Uv) r3
            X.1DT r2 = r3.A00
            X.206 r0 = X.AnonymousClass3MX.A0r(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0388
            X.205 r0 = r0.A0v
        L_0x0378:
            boolean r0 = X.C29431cG.A18(r4, r0)
            if (r0 == 0) goto L_0x0005
            X.206 r0 = X.AnonymousClass3MX.A0r(r2)
            r3.A01 = r0
            r2.A0F(r1)
            return
        L_0x0388:
            r0 = r1
            goto L_0x0378
        L_0x038a:
            java.lang.Object r7 = r10.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r7 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r7
            X.3Ot r8 = r7.A0A
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x03cb
            java.util.Iterator r6 = r11.iterator()
            r5 = 0
        L_0x0399:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03c6
            X.206 r4 = X.C17880vN.A0Y(r6)
            java.util.List r0 = r8.A00
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x03aa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0399
            X.205 r1 = X.AnonymousClass3MZ.A10(r3)
            X.205 r0 = r4.A0v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c3
            java.util.List r0 = r8.A00
            r0.remove(r2)
            r5 = 1
            goto L_0x0399
        L_0x03c3:
            int r2 = r2 + 1
            goto L_0x03aa
        L_0x03c6:
            if (r5 == 0) goto L_0x03cb
            r8.notifyDataSetChanged()
        L_0x03cb:
            X.3Ot r0 = r7.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03d7
            r7.finish()
            return
        L_0x03d7:
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A10(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95504mL.Bya(java.util.Collection, java.util.Map):void");
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r3) {
        if (15 - this.A00 == 0) {
            C79333vF r1 = (C79333vF) this.A01;
            if (C18070vi.A18(r1.A0E, r3)) {
                r1.A4e();
            }
        }
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r11, Collection collection, boolean z) {
        C76813oT r0;
        switch (this.A00) {
            case 4:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass206 A0Y = C17880vN.A0Y(it);
                        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                        if (AnonymousClass3Ma.A1X(A0Y, contactInfoActivity.A4l())) {
                            r0 = contactInfoActivity.A0k;
                        }
                    }
                    return;
                } else if (r11 == null || ((ContactInfoActivity) this.A01).A4l().equals(r11)) {
                    r0 = ((ContactInfoActivity) this.A01).A0k;
                } else {
                    return;
                }
                r0.A0V();
                return;
            case 5:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass206 A0Y2 = C17880vN.A0Y(it2);
                        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A01;
                        if (AnonymousClass3Ma.A1X(A0Y2, listChatInfoActivity.A4l())) {
                            ListChatInfoActivity.A10(listChatInfoActivity);
                            return;
                        }
                    }
                    return;
                } else if (r11 == null || r11.equals(((ListChatInfoActivity) this.A01).A4l())) {
                    ListChatInfoActivity.A10((ListChatInfoActivity) this.A01);
                    return;
                } else {
                    return;
                }
            case 6:
                if (collection != null) {
                    Iterator it3 = collection.iterator();
                    boolean z2 = false;
                    while (it3.hasNext()) {
                        AnonymousClass206 A0Y3 = C17880vN.A0Y(it3);
                        MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this.A01;
                        C73043Ot r02 = mediaAlbumActivity.A0A;
                        AnonymousClass205 r2 = A0Y3.A0v;
                        List list = r02.A00;
                        if (list != null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (AnonymousClass3MZ.A10(it4).equals(r2)) {
                                        mediaAlbumActivity.A0b.add(r2);
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z2) {
                        ((MediaAlbumActivity) this.A01).A0A.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (collection != null) {
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        A02(C17880vN.A0Y(it5));
                    }
                    return;
                }
                return;
            case 9:
                if (collection == null || !collection.isEmpty()) {
                    ((C79333vF) this.A01).A4e();
                    return;
                }
                return;
            case 12:
                AnonymousClass3VQ r1 = (AnonymousClass3VQ) this.A01;
                Collection collection2 = null;
                boolean z3 = false;
                if (collection == null || collection.isEmpty()) {
                    z3 = true;
                } else {
                    collection2 = collection;
                }
                r1.A11.A0F(new AnonymousClass4SI((AnonymousClass1IX) null, (C54242dp) null, (Boolean) null, (Boolean) null, collection2, false, z3));
                r1.A0V();
                return;
            case 13:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        AnonymousClass1BI r22 = AnonymousClass3MZ.A10(it6).A00;
                        if (r22 != null) {
                            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A01;
                            if (r22.equals(galleryFragmentBase.A0D)) {
                                GalleryFragmentBase.A02(galleryFragmentBase);
                                return;
                            }
                        }
                    }
                    return;
                } else if (r11 == null || r11.equals(((GalleryFragmentBase) this.A01).A0D)) {
                    GalleryFragmentBase.A02((GalleryFragmentBase) this.A01);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public /* synthetic */ void Byd(Collection collection) {
        AnonymousClass205 r0;
        switch (this.A00) {
            case 3:
                C18070vi.A0d(collection, 0);
                ArrayList A0D = C29351c6.A0D(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C72463Mc.A1L(A0D, it);
                }
                AnonymousClass3Uv r3 = (AnonymousClass3Uv) this.A01;
                AnonymousClass206 r02 = r3.A01;
                if (r02 != null) {
                    r0 = r02.A0v;
                } else {
                    r0 = null;
                }
                if (C29431cG.A18(A0D, r0)) {
                    r3.A00.A0F(r3.A01);
                    r3.A01 = null;
                    return;
                }
                return;
            case 9:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (C17880vN.A0Y(it2).A0q) {
                        ((C79333vF) this.A01).A4e();
                        return;
                    }
                }
                return;
            case 12:
                AnonymousClass3VQ r6 = (AnonymousClass3VQ) this.A01;
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it3);
                    if (C63892tr.A00(A0Y) == 1) {
                        r6.A1I.put(A0Y.A0v, A0Y);
                        A13.add(new AnonymousClass4YP(A0Y, (AnonymousClass205) null, AnonymousClass00R.A0N));
                    }
                }
                if (!A13.isEmpty()) {
                    A13.size();
                    r6.A16.A0F(A13);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void Bz8(C29681ch r4) {
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r2 = (AnonymousClass3VQ) this.A01;
            if (r4.equals(r2.A0u)) {
                A01(r2);
                AnonymousClass3VQ.A09(r2, r2.A0B);
            }
        }
    }

    public /* synthetic */ void BzA(C29681ch r8, boolean z) {
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r6 = (AnonymousClass3VQ) this.A01;
            if (r8.equals(r6.A0u)) {
                r6.A0K = !z;
                if (r6.A08 < 5) {
                    r6.A0c(true);
                }
            }
        }
    }

    public /* synthetic */ void BzC(C29681ch r3) {
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r1 = (AnonymousClass3VQ) this.A01;
            if (r3.equals(r1.A0u)) {
                A01(r1);
            }
        }
    }

    public /* synthetic */ void C0d(AnonymousClass206 r6, AnonymousClass206 r7) {
        if (12 - this.A00 == 0) {
            AnonymousClass3VQ r2 = (AnonymousClass3VQ) this.A01;
            Map map = r2.A1I;
            AnonymousClass205 r4 = r6.A0v;
            if (map.containsKey(r4)) {
                map.remove(r4);
                map.put(r7.A0v, r7);
                r2.A16.A0F(C220618l.newArrayList((Object[]) new AnonymousClass4YP[]{new AnonymousClass4YP(r7, r4, AnonymousClass00R.A0C)}));
            }
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }
}
