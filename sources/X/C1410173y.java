package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.calling.service.VoiceFGService;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.73y  reason: invalid class name and case insensitive filesystem */
public class C1410173y {
    public final AnonymousClass11S A00;
    public final AnonymousClass1VW A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C24791Lr A04;
    public final C27191Vc A05;
    public final AnonymousClass11C A06;
    public final AnonymousClass118 A07;
    public final C18030ve A08;
    public final AnonymousClass126 A09;
    public final C24901Mc A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass195 A0C;
    public final AnonymousClass1HQ A0D;
    public final C27201Vd A0E;
    public final C27301Vn A0F;
    public final AnonymousClass18K A0G;
    public final AnonymousClass1Nb A0H;
    public final AnonymousClass1DC A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;

    /* JADX WARNING: type inference failed for: r3v2, types: [X.1LU, java.lang.Object] */
    private PendingIntent A00(Context context, C138686xW r11, int i, boolean z) {
        Intent A072;
        String str;
        Context context2 = context;
        if (!r11.A0A) {
            int i2 = 3;
            if (r11.A0G) {
                i2 = 10;
            }
            A072 = new Object().A22(context2, AnonymousClass6Z8.A00, r11.A06, i2, !this.A0C.A00);
            A072.putExtra("fgservice_start_failed", z);
        } else {
            A072 = A07(context, r11, i, z);
            if (r11.A0B) {
                A072.putExtra("lobbyEntryPoint", 27);
            } else {
                A072.putExtra("lobbyEntryPoint", 2);
            }
            if (r11.A0G) {
                str = AnonymousClass6Z8.A08;
            } else {
                str = "join_call";
            }
            A072.setAction(str);
        }
        return C17880vN.A07(context, A072, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        if (r14.A0F != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r1 == 8) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A01(android.content.Context r13, X.C138686xW r14, boolean r15) {
        /*
            r12 = this;
            long r0 = r14.A02
            boolean r7 = r14.A09
            boolean r2 = r14.A0E
            if (r2 == 0) goto L_0x0010
            r1 = 2131898263(0x7f122f97, float:1.9431439E38)
        L_0x000b:
            java.lang.String r0 = r13.getString(r1)
            return r0
        L_0x0010:
            r5 = 0
            r3 = 0
            r4 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0070
            boolean r0 = r14.A0A
            if (r0 != 0) goto L_0x0027
            boolean r0 = r14.A0H
            r1 = 2131898087(0x7f122ee7, float:1.9431082E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131893150(0x7f121b9e, float:1.9421068E38)
            goto L_0x000b
        L_0x0027:
            int r2 = r14.A00
            if (r2 < 0) goto L_0x0046
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x003b
            r1 = 2131755493(0x7f1001e5, float:1.9141867E38)
        L_0x0032:
            android.content.res.Resources r0 = r13.getResources()
            java.lang.String r0 = X.C72473Md.A0k(r0, r2, r1)
            return r0
        L_0x003b:
            boolean r0 = r14.A0H
            r1 = 2131755494(0x7f1001e6, float:1.9141869E38)
            if (r0 == 0) goto L_0x0032
            r1 = 2131755483(0x7f1001db, float:1.9141847E38)
            goto L_0x0032
        L_0x0046:
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x005d
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0052
            r1 = 2131893078(0x7f121b56, float:1.9420922E38)
            goto L_0x000b
        L_0x0052:
            boolean r0 = r14.A0H
            r1 = 2131893077(0x7f121b55, float:1.942092E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131893076(0x7f121b54, float:1.9420918E38)
            goto L_0x000b
        L_0x005d:
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0065
            r1 = 2131893148(0x7f121b9c, float:1.9421064E38)
            goto L_0x000b
        L_0x0065:
            boolean r0 = r14.A08
            r1 = 2131893149(0x7f121b9d, float:1.9421066E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131893152(0x7f121ba0, float:1.9421072E38)
            goto L_0x000b
        L_0x0070:
            if (r7 == 0) goto L_0x0083
            com.whatsapp.voipcalling.CallState r1 = r14.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x007f
            boolean r0 = r14.A0F
            r1 = 2131895366(0x7f122446, float:1.9425563E38)
            if (r0 == 0) goto L_0x000b
        L_0x007f:
            r1 = 2131887856(0x7f1206f0, float:1.941033E38)
            goto L_0x000b
        L_0x0083:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00b5
            X.0ve r1 = r12.A08
            X.11S r0 = r12.A00
            boolean r0 = X.C40811vJ.A0C(r0, r1)
            if (r0 == 0) goto L_0x00b5
            X.1M9 r1 = r12.A02
            com.whatsapp.jid.UserJid r0 = r14.A04
            X.1E7 r5 = r1.A0H(r0)
            int r1 = r14.A01
            r0 = 7
            if (r1 == r0) goto L_0x00a5
            r0 = 8
            r2 = 2131891834(0x7f12167a, float:1.94184E38)
            if (r1 != r0) goto L_0x00a8
        L_0x00a5:
            r2 = 2131891835(0x7f12167b, float:1.9418401E38)
        L_0x00a8:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.1Me r0 = r12.A03
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r5)
            java.lang.String r0 = X.C17880vN.A0q(r13, r0, r1, r3, r2)
            return r0
        L_0x00b5:
            java.util.List r5 = r14.A07
            int r8 = r5.size()
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x014f
            if (r8 <= 0) goto L_0x014f
            boolean r0 = r14.A0B
            if (r0 == 0) goto L_0x00ff
            r6 = 2
            if (r8 < r6) goto L_0x00ff
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            int r11 = r5.size()
            r10 = 1
            r9 = 0
        L_0x00d3:
            if (r10 >= r11) goto L_0x015b
            int r0 = r11 + -1
            int r0 = java.lang.Math.min(r0, r6)
            if (r9 >= r0) goto L_0x015b
            X.1M9 r1 = r12.A02
            X.1BI r0 = X.C108945cZ.A0i(r5, r10)
            X.1E7 r2 = r1.A0H(r0)
            X.1Me r0 = r12.A03
            java.lang.String r1 = r0.A0T(r2, r4)
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x00fb
            int r9 = r9 + 1
            r7.addFirst(r1)
        L_0x00f8:
            int r10 = r10 + 1
            goto L_0x00d3
        L_0x00fb:
            r7.addLast(r1)
            goto L_0x00f8
        L_0x00ff:
            if (r15 == 0) goto L_0x0129
            X.1M9 r1 = r12.A02
            com.whatsapp.jid.UserJid r0 = r14.A04
            X.1E7 r5 = r1.A0H(r0)
            X.0ve r2 = r12.A08
            r1 = 8673(0x21e1, float:1.2153E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r14.A0H
            if (r1 == 0) goto L_0x0120
            r2 = 2131891175(0x7f1213e7, float:1.9417063E38)
            if (r0 == 0) goto L_0x00a8
            r2 = 2131891168(0x7f1213e0, float:1.9417048E38)
            goto L_0x00a8
        L_0x0120:
            r2 = 2131890362(0x7f1210ba, float:1.9415414E38)
            if (r0 == 0) goto L_0x00a8
            r2 = 2131890360(0x7f1210b8, float:1.941541E38)
            goto L_0x00a8
        L_0x0129:
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x0137
            com.whatsapp.voipcalling.CallState r1 = r14.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0143
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x0143
        L_0x0137:
            boolean r0 = r14.A0H
            r1 = 2131891330(0x7f121482, float:1.9417377E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131891328(0x7f121480, float:1.9417373E38)
            goto L_0x000b
        L_0x0143:
            boolean r0 = r14.A0H
            r1 = 2131898233(0x7f122f79, float:1.9431378E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131898230(0x7f122f76, float:1.9431372E38)
            goto L_0x000b
        L_0x014f:
            boolean r0 = r14.A0H
            r1 = 2131891332(0x7f121484, float:1.9417381E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131897845(0x7f122df5, float:1.943059E38)
            goto L_0x000b
        L_0x015b:
            X.1Me r2 = r12.A03
            X.1M9 r1 = r12.A02
            X.1BI r0 = X.C108945cZ.A0i(r5, r3)
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r2, r0)
            r7.addFirst(r0)
            if (r8 != r6) goto L_0x017d
            r1 = 2131890906(0x7f1212da, float:1.9416517E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C108985cd.A1Q(r7, r0)
            java.lang.String r0 = r13.getString(r1, r0)
            return r0
        L_0x017d:
            r5 = 3
            if (r8 != r5) goto L_0x0191
            r2 = 2131890905(0x7f1212d9, float:1.9416515E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.C108985cd.A1Q(r7, r1)
            java.lang.Object r0 = r7.get(r6)
            java.lang.String r0 = X.C17880vN.A0q(r13, r0, r1, r6, r2)
            return r0
        L_0x0191:
            X.00H r0 = r12.A0K
            java.lang.Object r4 = r0.get()
            X.0vb r4 = (X.C18000vb) r4
            r3 = 2131755166(0x7f10009e, float:1.9141204E38)
            int r0 = r8 + -2
            long r1 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.C108985cd.A1Q(r7, r0)
            int r8 = r8 - r6
            X.C17880vN.A1T(r0, r8, r6)
            java.lang.String r0 = r4.A0K(r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410173y.A01(android.content.Context, X.6xW, boolean):java.lang.String");
    }

    private void A02(long j, int i) {
        String str;
        C22681Cu r2 = new C22681Cu();
        r2.A00 = Long.valueOf(j);
        r2.A02 = "CallNotificationBuilder-build";
        if (i == 1) {
            str = "NOTIFICATION_HEADS_UP";
        } else if (i != 2) {
            C17960vV.A0F(false, AnonymousClass001.A1I("UNKNOWN notification type ", AnonymousClass000.A10(), i));
            str = "NOTIFICATION_INVALID";
        } else {
            str = "NOTIFICATION_MUTE";
        }
        r2.A01 = str;
        this.A0G.CC7(r2);
    }

    private void A03(Notification.Builder builder, Context context, C138686xW r8, String str, int i) {
        Notification.CallStyle forOngoingCall;
        String str2;
        if (r8.A02 > 0 || r8.A09) {
            Person build = new Person.Builder().setName(str).build();
            Intent intent = new Intent(context, VoiceFGService.class);
            intent.setAction("hangup_call");
            intent.putExtra("end_call_reason", 1);
            forOngoingCall = Notification.CallStyle.forOngoingCall(build, C1408573i.A03(context, intent, 134217728));
        } else {
            Person build2 = new Person.Builder().setName(str).build();
            if (r8.A0B) {
                str2 = "reject_group_reminder";
            } else {
                str2 = "reject_call";
            }
            Intent intent2 = new Intent(context, VoiceFGService.class);
            intent2.setAction(str2);
            intent2.putExtra("call_id", r8.A06);
            int i2 = 4;
            if (r8.A0G) {
                i2 = 11;
            }
            intent2.putExtra("call_ui_action", i2);
            forOngoingCall = Notification.CallStyle.forIncomingCall(build2, C1408573i.A03(context, intent2, 134217728), A00(context, r8, i, false));
        }
        forOngoingCall.setIsVideo(r8.A0H);
        builder.setStyle(forOngoingCall);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.C1409673t r9, X.C138686xW r10, X.AnonymousClass1E7 r11, int r12) {
        /*
            r8 = this;
            r3 = 26
            r2 = 1
            if (r12 == r2) goto L_0x0013
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x00a9
            com.whatsapp.voipcalling.CallState r1 = r10.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0013
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 != r0) goto L_0x00a9
        L_0x0013:
            r9.A03 = r2
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x003d
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x0023
            com.whatsapp.voipcalling.CallState r1 = r10.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x009a
        L_0x0023:
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x009a
            X.00H r0 = r8.A0J
            java.lang.Object r1 = r0.get()
            X.2lU r1 = (X.C58932lU) r1
            X.1Nb r0 = r8.A0H
            java.lang.String r1 = r1.A02(r11, r0)
        L_0x0035:
            boolean r0 = X.C24605CBj.A00(r1)
        L_0x0039:
            if (r0 != 0) goto L_0x003d
            r9.A0M = r1
        L_0x003d:
            X.0ve r2 = r8.A08
            r1 = 5892(0x1704, float:8.256E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x007b
            X.11S r0 = r8.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x007a
            X.2lf r0 = r11.A0H
            if (r0 == 0) goto L_0x007a
            java.lang.String r5 = r0.A01
            if (r5 == 0) goto L_0x007a
            long r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tel:"
            java.lang.String r5 = X.AnonymousClass001.A1H(r0, r5, r1)
            r2 = 0
            r6 = 0
            X.6uT r1 = new X.6uT
            r4 = r2
            r3 = r2
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r0 = r9.A0T
        L_0x0077:
            r0.add(r1)
        L_0x007a:
            return
        L_0x007b:
            X.11C r0 = r8.A06
            X.11B r1 = r0.A0O()
            if (r1 == 0) goto L_0x00d4
            X.1M9 r0 = r8.A02
            android.net.Uri r0 = r0.A09(r11, r1)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x007a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x007a
            java.util.ArrayList r0 = r9.A0S
            goto L_0x0077
        L_0x009a:
            X.00H r0 = r8.A0J
            java.lang.Object r1 = r0.get()
            X.2lU r1 = (X.C58932lU) r1
            X.1Nb r0 = r8.A0H
            java.lang.String r1 = r1.A00(r11, r0)
            goto L_0x0035
        L_0x00a9:
            r0 = 2
            if (r12 != r0) goto L_0x00c4
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x003d
            X.00H r0 = r8.A0J
            java.lang.Object r1 = r0.get()
            X.2lU r1 = (X.C58932lU) r1
            X.1Nb r0 = r8.A0H
            java.lang.String r1 = r1.A01(r11, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            goto L_0x0039
        L_0x00c4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UNKNOWN NOTIFICATION TYPE "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r12)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            goto L_0x003d
        L_0x00d4:
            java.lang.String r0 = "voip/CallNotificationBuilder/addContactToNotification cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410173y.A04(X.73t, X.6xW, X.1E7, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A08, 4809) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r11 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8.A08, 4810) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(X.C138686xW r9, X.AnonymousClass1V7 r10, boolean r11) {
        /*
            r8 = this;
            boolean r3 = r9.A09
            r4 = 0
            r7 = 1
            if (r3 != 0) goto L_0x0022
            long r0 = r9.A02
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0022
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0022
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x0022
            X.0ve r2 = r8.A08
            r1 = 4810(0x12ca, float:6.74E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r6 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            long r1 = r9.A02
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            if (r3 == 0) goto L_0x0038
        L_0x002b:
            X.0ve r2 = r8.A08
            r1 = 4809(0x12c9, float:6.739E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A06
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0044
            r4 = 0
            if (r11 == 0) goto L_0x0045
        L_0x0044:
            r4 = 1
        L_0x0045:
            X.00H r0 = r8.A0J
            java.lang.Object r3 = r0.get()
            X.2lU r3 = (X.C58932lU) r3
            X.0ve r2 = r3.A01
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0076
            X.1Vn r0 = r3.A00
            X.1Vo r0 = (X.AnonymousClass1Vo) r0
            X.1Vp r0 = r0.A00
            boolean r1 = r0.A01()
        L_0x0063:
            if (r4 == 0) goto L_0x0078
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x0078
            int r0 = r9.A00
            if (r0 >= 0) goto L_0x0078
            if (r6 != 0) goto L_0x0073
            if (r5 == 0) goto L_0x0078
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            return r7
        L_0x0076:
            r1 = 1
            goto L_0x0063
        L_0x0078:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410173y.A05(X.6xW, X.1V7, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1LU, java.lang.Object] */
    public Intent A07(Context context, C138686xW r6, int i, boolean z) {
        Intent A20 = new Object().A20(context, r6.A04, C108945cZ.A1A(this.A0C.A00));
        String str = r6.A06;
        A20.setData(Uri.parse(str));
        A20.putExtra("notification_type", i);
        A20.putExtra("call_id", str);
        if (r6.A0G) {
            A20.setAction(AnonymousClass6Z8.A08);
        }
        if (r6.A0D && r6.A05 == CallState.NONE) {
            A20.putExtra("joinable", true);
        }
        A20.putExtra("fgservice_start_failed", z);
        return A20;
    }

    public C1410173y(AnonymousClass195 r2, AnonymousClass11S r3, AnonymousClass1HQ r4, AnonymousClass1VW r5, AnonymousClass1M9 r6, C24921Me r7, C24791Lr r8, C27201Vd r9, C27191Vc r10, AnonymousClass11C r11, AnonymousClass118 r12, C27301Vn r13, C18030ve r14, AnonymousClass18K r15, AnonymousClass126 r16, AnonymousClass1Nb r17, C24901Mc r18, AnonymousClass1DC r19, AnonymousClass10I r20, AnonymousClass00H r21, AnonymousClass00H r22) {
        this.A08 = r14;
        this.A00 = r3;
        this.A07 = r12;
        this.A0B = r20;
        this.A0D = r4;
        this.A0A = r18;
        this.A0E = r9;
        this.A01 = r5;
        this.A02 = r6;
        this.A0I = r19;
        this.A06 = r11;
        this.A03 = r7;
        this.A09 = r16;
        this.A0H = r17;
        this.A04 = r8;
        this.A0F = r13;
        this.A0C = r2;
        this.A05 = r10;
        this.A0J = r21;
        this.A0K = r22;
        this.A0G = r15;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.1BI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v0, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r13v26, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v22, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r0v196, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0265, code lost:
        if (r7.A00 >= 0) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04d1, code lost:
        if (X.C39761tb.A0B() == false) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04e5, code lost:
        if (r13 == com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x054b, code lost:
        if (r7.A07.size() != 0) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cc, code lost:
        if (r11 != null) goto L_0x01ce;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A06(android.content.Context r48, X.C138686xW r49, X.AnonymousClass1V7 r50, int r51, boolean r52) {
        /*
            r47 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CallNotificationBuilder type = "
            r2.append(r0)
            r0 = 1
            r6 = r51
            if (r6 == r0) goto L_0x01b7
            r0 = 2
            if (r6 == r0) goto L_0x01b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UNKNOWN notification type "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r6)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            java.lang.String r0 = "NOTIFICATION_INVALID"
        L_0x0021:
            X.C17890vO.A1A(r2, r0)
            java.lang.String r1 = "CallNotificationBuilder/build"
            X.1Ez r19 = new X.1Ez
            r0 = r19
            r0.<init>((java.lang.String) r1)
            r19.A04()
            r7 = r49
            long r2 = r7.A02
            boolean r0 = r7.A09
            r33 = r0
            boolean r13 = r7.A08
            com.whatsapp.jid.GroupJid r1 = r7.A03
            r32 = r1
            r5 = r47
            X.1M9 r0 = r5.A02
            r45 = r0
            X.1Me r0 = r5.A03
            r44 = r0
            X.1Mc r0 = r5.A0A
            r23 = r0
            X.126 r0 = r5.A09
            r16 = r0
            r8 = r45
            r4 = r0
            r0 = r23
            X.1E7 r4 = X.C63982u1.A01(r8, r4, r1, r0, r13)
            if (r4 == 0) goto L_0x01b0
            r0 = r44
            java.lang.String r9 = X.AnonymousClass3MY.A0q(r0, r4)
        L_0x0061:
            X.0ve r0 = r5.A08
            r43 = r0
            r8 = 8673(0x21e1, float:1.2153E-41)
            X.0vf r29 = X.C18040vf.A02
            r4 = r29
            boolean r0 = X.C18020vd.A05(r4, r0, r8)
            r4 = 0
            r10 = 1
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x01ad
            java.util.List r0 = r7.A07
            int r0 = r0.size()
            if (r0 <= r10) goto L_0x01ad
        L_0x007f:
            r8 = 1
        L_0x0080:
            X.118 r0 = r5.A07
            android.content.Context r0 = r0.A00
            r42 = r0
            java.lang.String r26 = r5.A01(r0, r7, r8)
            java.lang.String r30 = r5.A01(r0, r7, r4)
            if (r13 == 0) goto L_0x0181
            r4 = 2131233309(0x7f080a1d, float:1.8082752E38)
        L_0x0093:
            r8 = r48
            r28 = r52
            if (r13 == 0) goto L_0x0179
            X.C17960vV.A07(r1)
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r11 = X.AnonymousClass3MY.A06(r8, r0, r1)
            java.lang.String r0 = "fromCallNotification"
            r11.putExtra(r0, r10)
            boolean r0 = X.C40811vJ.A0X(r43)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r12 = "vcLobbyCallId"
            java.lang.String r0 = r7.A06
            r11.putExtra(r12, r0)
        L_0x00b7:
            boolean r0 = X.C40811vJ.A0P(r43)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r12 = "vcSlienceReason"
            int r0 = r7.A01
            r11.putExtra(r12, r0)
        L_0x00c4:
            java.lang.String r0 = "CallNotificationBuilder.getAudioChatContentIntent"
            X.C60442o2.A01(r11, r0)
        L_0x00c9:
            boolean r0 = r7.A0B
            r31 = r0
            java.lang.String r12 = "lobbyEntryPoint"
            if (r0 == 0) goto L_0x00d3
            r10 = 27
        L_0x00d3:
            r11.putExtra(r12, r10)
            if (r13 != 0) goto L_0x0168
            if (r0 != 0) goto L_0x0168
            r0 = r28
            android.content.Intent r10 = r5.A07(r8, r7, r6, r0)
            r0 = 6
            r10.putExtra(r12, r0)
        L_0x00e4:
            if (r1 != 0) goto L_0x00e8
            com.whatsapp.jid.UserJid r1 = r7.A04
        L_0x00e8:
            java.lang.String r0 = "attributed_call_jid"
            X.AnonymousClass3MY.A12(r11, r1, r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 1
            android.app.PendingIntent r27 = X.C1408573i.A00(r8, r0, r11, r1)
            android.content.res.Resources r22 = r8.getResources()
            r1 = 17104901(0x1050005, float:2.4428256E-38)
            r0 = r22
            int r1 = r0.getDimensionPixelSize(r1)
            r11 = 17104902(0x1050006, float:2.442826E-38)
            int r0 = r0.getDimensionPixelSize(r11)
            int r21 = java.lang.Math.min(r1, r0)
            r12 = 0
            r46 = r50
            if (r21 <= 0) goto L_0x0214
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x012a
            if (r32 != 0) goto L_0x012a
            java.util.List r11 = r7.A07
            int r1 = r11.size()
            r0 = 1
            if (r1 == r0) goto L_0x012a
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0165
            int r0 = r11.size()
            if (r0 != 0) goto L_0x0165
        L_0x012a:
            r20 = -1
        L_0x012c:
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            r15 = r32
            r14 = r45
            r11 = r16
            r0 = r23
            X.1E7 r11 = X.C63982u1.A01(r14, r11, r15, r0, r13)
            if (r11 != 0) goto L_0x01ce
            java.util.List r0 = r7.A07
            r23 = r0
            java.util.Iterator r16 = r23.iterator()
        L_0x014e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01bb
            X.1BI r15 = X.C17880vN.A0Q(r16)
            int r0 = r17.size()
            r11 = 3
            if (r0 >= r11) goto L_0x01bb
            r0 = r17
            X.AnonymousClass3MY.A1O(r14, r15, r0)
            goto L_0x014e
        L_0x0165:
            r20 = 0
            goto L_0x012c
        L_0x0168:
            if (r13 == 0) goto L_0x0176
            com.whatsapp.voipcalling.CallState r10 = r7.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r10 != r0) goto L_0x0176
            android.content.Intent r10 = X.C17880vN.A0A()
            goto L_0x00e4
        L_0x0176:
            r10 = 0
            goto L_0x00e4
        L_0x0179:
            r0 = r28
            android.content.Intent r11 = r5.A07(r8, r7, r6, r0)
            goto L_0x00c9
        L_0x0181:
            r11 = 0
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r0 = r7.A0H
            if (r4 <= 0) goto L_0x0193
            r4 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r0 == 0) goto L_0x0093
            r4 = 2131232406(0x7f080696, float:1.808092E38)
            goto L_0x0093
        L_0x0193:
            if (r33 == 0) goto L_0x019f
            r4 = 2131231759(0x7f08040f, float:1.8079608E38)
            if (r0 == 0) goto L_0x0093
            r4 = 2131232753(0x7f0807f1, float:1.8081624E38)
            goto L_0x0093
        L_0x019f:
            r4 = 2131231761(0x7f080411, float:1.8079612E38)
            if (r0 == 0) goto L_0x0093
            r4 = 2131232752(0x7f0807f0, float:1.8081622E38)
            goto L_0x0093
        L_0x01a9:
            if (r9 == 0) goto L_0x01ad
            goto L_0x007f
        L_0x01ad:
            r8 = 0
            goto L_0x0080
        L_0x01b0:
            r9 = 0
            goto L_0x0061
        L_0x01b3:
            java.lang.String r0 = "NOTIFICATION_MUTE"
            goto L_0x0021
        L_0x01b7:
            java.lang.String r0 = "NOTIFICATION_HEADS_UP"
            goto L_0x0021
        L_0x01bb:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x01d3
            int r0 = r23.size()
            if (r0 != 0) goto L_0x01d3
            X.11S r0 = r5.A00
            r0.A0I()
            X.1E8 r11 = r0.A0D
            if (r11 == 0) goto L_0x01d3
        L_0x01ce:
            r0 = r17
            r0.add(r11)
        L_0x01d3:
            java.util.Iterator r17 = r17.iterator()
        L_0x01d7:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x021a
            X.1E7 r11 = X.C17880vN.A0O(r17)
            X.1Lr r15 = r5.A04
            r0 = r20
            float r0 = (float) r0
            r23 = r0
            r14 = r0
            r0 = r21
            java.lang.String r16 = r11.A08(r14, r0)
            X.1Lp r0 = r15.A02
            X.1ga r14 = r0.A04()
            r0 = r16
            java.lang.Object r14 = r14.A0A(r0)
            if (r14 != 0) goto L_0x0210
            X.1VW r15 = r5.A01
            r14 = r23
            r0 = r21
            android.graphics.Bitmap r14 = r15.A07(r11, r14, r0)
            boolean r0 = r11.A0g
            if (r0 == 0) goto L_0x0210
            r0 = r18
            r0.add(r11)
        L_0x0210:
            r1.add(r14)
            goto L_0x01d7
        L_0x0214:
            java.lang.String r0 = "voip/CallNotificationBuilder/thumb-size-is-0"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0250
        L_0x021a:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x022e
            int r11 = r1.size()
            r0 = 1
            if (r11 != r0) goto L_0x04b6
            r0 = 0
            java.lang.Object r12 = r1.get(r0)
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
        L_0x022e:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0250
            X.10I r11 = r5.A0B
            X.1Vc r1 = r5.A05
            X.6M1 r0 = new X.6M1
            r34 = r0
            r35 = r8
            r36 = r46
            r37 = r1
            r38 = r18
            r39 = r21
            r40 = r20
            r41 = r6
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)
            X.C17890vO.A0u(r0, r11)
        L_0x0250:
            com.whatsapp.jid.UserJid r0 = r7.A04
            r41 = r0
            r1 = r0
            r0 = r45
            X.1E7 r25 = r0.A0H(r1)
            r20 = 0
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0267
            int r0 = r7.A00
            r24 = 1
            if (r0 < 0) goto L_0x0269
        L_0x0267:
            r24 = 0
        L_0x0269:
            X.73t r11 = X.C217217d.A03(r8)
            java.lang.String r23 = "call"
            r0 = r23
            r11.A0L = r0
            r0 = 1
            r11.A03 = r0
            if (r24 == 0) goto L_0x0282
            r11.A0a = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r11.A09(r0)
        L_0x0282:
            r0 = r26
            r11.A0D(r0)
            X.C17900vP.A0L(r11, r0)
            r0 = r27
            r11.A0A = r0
            int r0 = r7.A00
            boolean r14 = X.AnonymousClass000.A1Q(r0)
            r1 = 1
            if (r14 == 0) goto L_0x029a
            r11.A0G(r1)
        L_0x029a:
            X.AnonymousClass70v.A00(r12, r11)
            android.app.Notification r0 = r11.A08
            r40 = r0
            r0.icon = r4
            if (r6 != r1) goto L_0x04b3
            if (r14 != 0) goto L_0x04b3
            if (r10 == 0) goto L_0x04b3
            r0 = 4
            android.app.PendingIntent r0 = X.C17880vN.A07(r8, r10, r0)
            r11.A0B = r0
            r10 = 128(0x80, float:1.794E-43)
            r0 = r40
            int r0 = r0.flags
            r10 = r10 | r0
            r0 = r40
            r0.flags = r10
            r10 = 1
        L_0x02bc:
            if (r9 == 0) goto L_0x047c
            r12 = r9
        L_0x02bf:
            if (r12 == 0) goto L_0x02c4
            r11.A0E(r12)
        L_0x02c4:
            r16 = 0
            if (r33 != 0) goto L_0x0455
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x0455
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x02de
            if (r31 != 0) goto L_0x02de
            if (r13 != 0) goto L_0x03e8
            com.whatsapp.voipcalling.CallState r14 = r7.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r14 == r0) goto L_0x03e8
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r14 == r0) goto L_0x03e8
        L_0x02de:
            if (r31 == 0) goto L_0x03e4
            java.lang.String r13 = "reject_group_reminder"
        L_0x02e2:
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r14 = new android.content.Intent
            r14.<init>(r8, r0)
            r14.setAction(r13)
            java.lang.String r13 = "call_id"
            java.lang.String r0 = r7.A06
            r14.putExtra(r13, r0)
            boolean r0 = r7.A0G
            r22 = r0
            r13 = 4
            if (r0 == 0) goto L_0x02fc
            r13 = 11
        L_0x02fc:
            java.lang.String r0 = "call_ui_action"
            r14.putExtra(r0, r13)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r20 = X.C1408573i.A03(r8, r14, r0)
            boolean r0 = r7.A0A
            r18 = r0
            r0 = 2131895087(0x7f12232f, float:1.9424997E38)
            r13 = 2131099997(0x7f06015d, float:1.7812363E38)
            if (r18 == 0) goto L_0x0319
            r0 = 2131898192(0x7f122f50, float:1.9431295E38)
            r13 = 2131099998(0x7f06015e, float:1.7812365E38)
        L_0x0319:
            java.lang.String r15 = r8.getString(r0)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r14 < r0) goto L_0x03e1
            if (r6 != r1) goto L_0x03e1
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r15)
            int r0 = r8.getColor(r13)
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            r15.<init>(r0)
            int r0 = r14.length()
            r13 = 0
            r14.setSpan(r15, r13, r0, r13)
        L_0x033b:
            r15 = 2131231754(0x7f08040a, float:1.8079598E38)
            X.6yd r13 = new X.6yd
            r0 = r20
            r13.<init>(r15, r14, r0)
            java.util.ArrayList r0 = r11.A0Q
            r33 = r0
            r0.add(r13)
            r0 = r28
            android.app.PendingIntent r21 = r5.A00(r8, r7, r6, r0)
            boolean r0 = r7.A0H
            r20 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r0 == 0) goto L_0x035c
            r20 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x035c:
            if (r31 == 0) goto L_0x03d2
            r0 = 2131899582(0x7f1234be, float:1.9434114E38)
        L_0x0361:
            java.lang.String r14 = r8.getString(r0)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r13 < r0) goto L_0x03cf
            if (r6 != r1) goto L_0x03cf
            android.text.SpannableString r18 = new android.text.SpannableString
            r0 = r18
            r0.<init>(r14)
            r0 = 2131099996(0x7f06015c, float:1.781236E38)
            int r0 = r8.getColor(r0)
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            r15.<init>(r0)
            int r0 = r18.length()
            r14 = 0
            r13 = r0
            r0 = r18
            r0.setSpan(r15, r14, r13, r14)
        L_0x038b:
            X.6yd r13 = new X.6yd
            r15 = r20
            r14 = r21
            r0 = r18
            r13.<init>(r15, r0, r14)
        L_0x0396:
            r0 = r33
            r0.add(r13)
        L_0x039b:
            java.lang.String r0 = "call_notification_group"
            r11.A0N = r0
            r11.A0V = r1
        L_0x03a1:
            X.73t r13 = X.C217217d.A03(r8)
            r0 = r23
            r13.A0L = r0
            r0 = 1
            r13.A03 = r0
            if (r24 == 0) goto L_0x03b8
            r13.A0a = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r13.A09(r0)
        L_0x03b8:
            r0 = r30
            r13.A0D(r0)
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r0 = r8.getString(r0)
            if (r0 == 0) goto L_0x03c9
            r13.A0E(r0)
        L_0x03c9:
            android.app.Notification r0 = r13.A08
            r0.icon = r4
            goto L_0x04c5
        L_0x03cf:
            r18 = r14
            goto L_0x038b
        L_0x03d2:
            if (r18 == 0) goto L_0x03d8
            r0 = 2131898211(0x7f122f63, float:1.9431333E38)
            goto L_0x0361
        L_0x03d8:
            r0 = 2131886668(0x7f12024c, float:1.9407921E38)
            if (r22 == 0) goto L_0x0361
            r0 = 2131898123(0x7f122f0b, float:1.9431155E38)
            goto L_0x0361
        L_0x03e1:
            r14 = r15
            goto L_0x033b
        L_0x03e4:
            java.lang.String r13 = "reject_call"
            goto L_0x02e2
        L_0x03e8:
            com.whatsapp.voipcalling.CallState r14 = r7.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r14 != r0) goto L_0x039b
            if (r13 != 0) goto L_0x039b
            r14 = 10055(0x2747, float:1.409E-41)
            r13 = r29
            r0 = r43
            boolean r0 = X.C18020vd.A05(r13, r0, r14)
            if (r0 == 0) goto L_0x039b
            r0 = r28
            android.app.PendingIntent r15 = r5.A00(r8, r7, r6, r0)
            boolean r0 = r7.A0H
            r14 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r0 == 0) goto L_0x040c
            r14 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x040c:
            r13 = 2131899582(0x7f1234be, float:1.9434114E38)
            r0 = r42
            java.lang.String r0 = r0.getString(r13)
            X.6yd r13 = new X.6yd
            r13.<init>(r14, r0, r15)
            java.util.ArrayList r0 = r11.A0Q
            r33 = r0
            r0.add(r13)
            if (r32 != 0) goto L_0x0425
            r32 = r41
        L_0x0425:
            X.1LU r13 = new X.1LU
            r13.<init>()
            r0 = r32
            android.content.Intent r13 = X.AnonymousClass3MY.A06(r8, r13, r0)
            java.lang.String r0 = "fromCallNotification"
            android.content.Intent r13 = r13.putExtra(r0, r1)
            java.lang.String r0 = "show_keyboard"
            android.content.Intent r13 = r13.putExtra(r0, r1)
            r0 = 8
            android.app.PendingIntent r14 = X.C17880vN.A07(r8, r13, r0)
            r13 = 2131892254(0x7f12181e, float:1.9419251E38)
            r0 = r42
            java.lang.String r0 = r0.getString(r13)
            r15 = 2131233235(0x7f0809d3, float:1.8082602E38)
            X.6yd r13 = new X.6yd
            r13.<init>(r15, r0, r14)
            goto L_0x0396
        L_0x0455:
            r14 = 2131231754(0x7f08040a, float:1.8079598E38)
            r0 = 2131891183(0x7f1213ef, float:1.9417079E38)
            java.lang.String r13 = r8.getString(r0)
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r0)
            java.lang.String r0 = "hangup_call"
            r1.setAction(r0)
            java.lang.String r15 = "end_call_reason"
            r0 = 1
            r1.putExtra(r15, r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C1408573i.A03(r8, r1, r0)
            r11.A08(r14, r13, r0)
            goto L_0x03a1
        L_0x047c:
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0490
            r12 = r41
            r0 = r45
            X.1E7 r12 = r0.A0H(r12)
            r0 = r44
            java.lang.String r12 = r0.A0P(r12)
            goto L_0x02bf
        L_0x0490:
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x049f
            r0 = r46
            boolean r0 = r5.A05(r7, r0, r10)
            if (r0 != 0) goto L_0x049f
            r12 = 0
            goto L_0x02bf
        L_0x049f:
            java.util.List r0 = r7.A07
            r39 = 0
            r38 = 2
            r34 = r8
            r35 = r45
            r36 = r44
            r37 = r0
            java.lang.String r12 = X.AnonymousClass74H.A06(r34, r35, r36, r37, r38, r39)
            goto L_0x02bf
        L_0x04b3:
            r10 = 0
            goto L_0x02bc
        L_0x04b6:
            r11 = 2131168737(0x7f070de1, float:1.7951784E38)
            r0 = r22
            float r0 = r0.getDimension(r11)
            android.graphics.Bitmap r12 = X.C27201Vd.A02(r1, r0)
            goto L_0x022e
        L_0x04c5:
            android.app.Notification r0 = r13.A05()     // Catch:{ SecurityException -> 0x04cc }
            r11.A09 = r0     // Catch:{ SecurityException -> 0x04cc }
            goto L_0x04d3
        L_0x04cc:
            r1 = move-exception
            boolean r0 = X.C39761tb.A0B()
            if (r0 == 0) goto L_0x0622
        L_0x04d3:
            r0 = r25
            r5.A04(r11, r7, r0, r6)
            if (r52 == 0) goto L_0x04dc
            if (r10 == 0) goto L_0x04e7
        L_0x04dc:
            com.whatsapp.voipcalling.CallState r13 = r7.A05
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r13 == r0) goto L_0x04e7
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            r0 = 1
            if (r13 != r1) goto L_0x04e8
        L_0x04e7:
            r0 = 0
        L_0x04e8:
            r11.A0H(r0)
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x051b
            r0 = r46
            boolean r0 = r5.A05(r7, r0, r10)
            if (r0 != 0) goto L_0x051b
            r13 = 4793(0x12b9, float:6.716E-42)
            r1 = r29
            r0 = r43
            boolean r0 = X.C18020vd.A05(r1, r0, r13)
            if (r0 == 0) goto L_0x051b
            java.lang.Class<com.whatsapp.calling.service.VoiceFGService> r0 = com.whatsapp.calling.service.VoiceFGService.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r0)
            java.lang.String r0 = "recreate_notification"
            r1.setAction(r0)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C1408573i.A03(r8, r1, r0)
            r0 = r40
            r0.deleteIntent = r1
        L_0x051b:
            r0 = r46
            boolean r0 = r5.A05(r7, r0, r10)     // Catch:{ SecurityException -> 0x05c3 }
            java.lang.String r1 = "voip/CallNotificationBuilder "
            if (r0 == 0) goto L_0x0589
            if (r10 != 0) goto L_0x0529
            if (r52 != 0) goto L_0x0589
        L_0x0529:
            java.util.ArrayList r0 = r11.A0Q     // Catch:{ SecurityException -> 0x05c3 }
            r0.clear()     // Catch:{ SecurityException -> 0x05c3 }
            java.lang.String r13 = "CallNotificationBuilder/build/ callstyle title cannot be empty"
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ SecurityException -> 0x05c3 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SecurityException -> 0x05c3 }
            if (r0 != 0) goto L_0x0584
            android.app.Notification r0 = r11.A05()     // Catch:{ SecurityException -> 0x05c3 }
            android.app.Notification$Builder r29 = android.app.Notification.Builder.recoverBuilder(r8, r0)     // Catch:{ SecurityException -> 0x05c3 }
            boolean r0 = r7.A0C     // Catch:{ SecurityException -> 0x05c3 }
            if (r0 == 0) goto L_0x054d
            java.util.List r0 = r7.A07     // Catch:{ SecurityException -> 0x05c3 }
            int r11 = r0.size()     // Catch:{ SecurityException -> 0x05c3 }
            r0 = 1
            if (r11 == 0) goto L_0x054e
        L_0x054d:
            r0 = 0
        L_0x054e:
            if (r0 == 0) goto L_0x0557
            r0 = 2131893147(0x7f121b9b, float:1.9421062E38)
            java.lang.String r12 = r8.getString(r0)     // Catch:{ SecurityException -> 0x05c3 }
        L_0x0557:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SecurityException -> 0x05c3 }
            if (r0 == 0) goto L_0x0564
            r0 = 2131893147(0x7f121b9b, float:1.9421062E38)
            java.lang.String r12 = r8.getString(r0)     // Catch:{ SecurityException -> 0x05c3 }
        L_0x0564:
            r28 = r5
            r30 = r8
            r31 = r7
            r32 = r12
            r33 = r6
            r28.A03(r29, r30, r31, r32, r33)     // Catch:{ SecurityException -> 0x05c3 }
            android.app.Notification r11 = r29.build()     // Catch:{ SecurityException -> 0x05c3 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x05c3 }
            X.C17900vP.A0Y(r11, r1, r0)     // Catch:{ SecurityException -> 0x05c3 }
            long r0 = r19.A02()     // Catch:{ SecurityException -> 0x05c3 }
            r5.A02(r0, r6)     // Catch:{ SecurityException -> 0x05c3 }
            return r11
        L_0x0584:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r13)     // Catch:{ SecurityException -> 0x05c3 }
            throw r0     // Catch:{ SecurityException -> 0x05c3 }
        L_0x0589:
            android.app.Notification r4 = r11.A05()     // Catch:{ SecurityException -> 0x05c3 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x05b4
            android.widget.RemoteViews r0 = r4.bigContentView
            if (r0 == 0) goto L_0x05b4
            java.lang.String r0 = "com.android.internal.R$id"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x05ae }
            java.lang.String r0 = "time"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r0)     // Catch:{ Exception -> 0x05ae }
            r0 = 0
            int r3 = r2.getInt(r0)     // Catch:{ Exception -> 0x05ae }
            android.widget.RemoteViews r2 = r4.bigContentView     // Catch:{ Exception -> 0x05ae }
            r0 = 8
            r2.setViewVisibility(r3, r0)     // Catch:{ Exception -> 0x05ae }
            goto L_0x05b4
        L_0x05ae:
            r2 = move-exception
            java.lang.String r0 = "voip/service/notification/time-ui-gone"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x05b4:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0Y(r4, r1, r0)
            long r0 = r19.A02()
            r5.A02(r0, r6)
            return r4
        L_0x05c3:
            r1 = move-exception
            boolean r0 = X.C39761tb.A0B()
            if (r0 == 0) goto L_0x0622
            X.73t r11 = X.C217217d.A03(r8)
            r0 = r26
            r11.A0D(r0)
            r0 = r27
            r11.A0A = r0
            android.app.Notification r0 = r11.A08
            r0.icon = r4
            if (r9 != 0) goto L_0x05ef
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0605
            r1 = r41
            r0 = r45
            X.1E7 r1 = r0.A0H(r1)
            r0 = r44
            java.lang.String r9 = r0.A0P(r1)
        L_0x05ef:
            if (r9 == 0) goto L_0x05f4
            r11.A0E(r9)
        L_0x05f4:
            r0 = r25
            r5.A04(r11, r7, r0, r6)
            long r0 = r19.A02()
            r5.A02(r0, r6)
            android.app.Notification r11 = r11.A05()
            return r11
        L_0x0605:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0611
            r0 = r46
            boolean r0 = r5.A05(r7, r0, r10)
            if (r0 == 0) goto L_0x05f4
        L_0x0611:
            java.util.List r0 = r7.A07
            r17 = 0
            r16 = 2
            r12 = r8
            r13 = r45
            r14 = r44
            r15 = r0
            java.lang.String r9 = X.AnonymousClass74H.A06(r12, r13, r14, r15, r16, r17)
            goto L_0x05ef
        L_0x0622:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410173y.A06(android.content.Context, X.6xW, X.1V7, int, boolean):android.app.Notification");
    }
}
