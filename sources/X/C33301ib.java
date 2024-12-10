package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ib  reason: invalid class name and case insensitive filesystem */
public class C33301ib {
    public final AnonymousClass118 A00;
    public final AnonymousClass1QR A01;
    public final C24621La A02;
    public final AnonymousClass1QS A03;
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final AnonymousClass1R2 A05;
    public final AnonymousClass10I A06;
    public final C27301Vn A07;
    public final C18000vb A08;
    public final AnonymousClass1Cd A09;
    public final AnonymousClass1QO A0A;
    public final AnonymousClass1Nb A0B;

    private synchronized void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A04.A05("removeUnreadMessagelessPaymentTransaction empty transaction id");
        } else {
            C24621La r6 = this.A02;
            String A022 = r6.A02("unread_messageless_transaction_ids");
            if (A022 == null) {
                A022 = "";
            }
            HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A022, ";")));
            if (hashSet.remove(str)) {
                AnonymousClass1QE r2 = this.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("removeUnreadMessagelessPaymentTransaction/removed id:");
                sb.append(str);
                r2.A06(sb.toString());
            }
            r6.A06("unread_messageless_transaction_ids", TextUtils.join(";", hashSet));
        }
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00((String) it.next());
        }
        if (TextUtils.isEmpty(this.A02.A02("unread_messageless_transaction_ids"))) {
            this.A07.BEJ(17, "MessagelessPaymentNotification4");
        }
    }

    public void A01() {
        C24621La r2 = this.A02;
        if (!TextUtils.isEmpty(r2.A02("unread_messageless_transaction_ids"))) {
            r2.A06("unread_messageless_transaction_ids", "");
            this.A07.BEJ(17, "MessagelessPaymentNotification3");
        }
    }

    /* JADX WARNING: type inference failed for: r0v56, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    public void A02() {
        ArrayList arrayList;
        Class BWe;
        PendingIntent A002;
        AnonymousClass1QS r18;
        C53642cr r14;
        ADR adr;
        if (this.A0A.A03()) {
            AnonymousClass1Cd r0 = this.A09;
            r0.A06();
            if (!r0.A08) {
                this.A04.A06("message store not yet ready");
                return;
            }
            synchronized (this) {
                String A022 = this.A02.A02("unread_messageless_transaction_ids");
                if (!TextUtils.isEmpty(A022)) {
                    arrayList = this.A01.A0U(Arrays.asList(A022.split(";")));
                } else {
                    arrayList = new ArrayList();
                }
            }
            Context context = this.A00.A00;
            if (arrayList.isEmpty()) {
                this.A07.BEJ(17, "MessagelessPaymentNotification1");
                AnonymousClass1QE.A02(this.A04, (String) null, "no unread payment notifications");
                return;
            }
            C1409673t A032 = C217217d.A03(context);
            A032.A0L = "status";
            A032.A03 = 1;
            A032.A0G(true);
            A032.A06(4);
            Notification notification = A032.A08;
            notification.icon = 2131231578;
            if (arrayList.size() == 1) {
                AW0 aw0 = (AW0) arrayList.get(0);
                AnonymousClass8pG r02 = aw0.A0A;
                if (!(r02 == null || (adr = r02.A01) == null || aw0.A03 != 9)) {
                    AW0 A0M = this.A01.A0M(adr.A03);
                    r18 = this.A03;
                    C196079uQ BWi = r18.A06().BWi();
                    if (!(BWi == null || A0M == null)) {
                        String A0S = this.A05.A0S(aw0);
                        Object A0I = BWi.A04.A0I(BWi.A03.A0H(A0M.A0D));
                        r14 = new C53642cr(A0S, context.getResources().getString(BWi.A00(), new Object[]{A0I}));
                        CharSequence charSequence = r14.A00;
                        A032.A0E(r14.A01);
                        A032.A0F(charSequence);
                        A032.A0D(charSequence);
                        ? r03 = new AnonymousClass72G();
                        r03.A07(charSequence);
                        A032.A0B(r03);
                        Intent putExtra = new Intent(context, r18.A06().BWx()).putExtra("extra_transaction_id", aw0.A0K);
                        AnonymousClass4aU.A00(putExtra, new AnonymousClass205(aw0.A0C, aw0.A0L, aw0.A0Q));
                        putExtra.addFlags(335544320);
                        A002 = C1408573i.A00(context, 0, putExtra, 268435456);
                    }
                }
                r18 = this.A03;
                C192079nl BQ8 = r18.A06().BQ8();
                if (BQ8 != null) {
                    String A023 = BQ8.A02(aw0);
                    if (!TextUtils.isEmpty(A023)) {
                        r14 = new C53642cr(BQ8.A01(aw0), A023);
                        CharSequence charSequence2 = r14.A00;
                        A032.A0E(r14.A01);
                        A032.A0F(charSequence2);
                        A032.A0D(charSequence2);
                        ? r032 = new AnonymousClass72G();
                        r032.A07(charSequence2);
                        A032.A0B(r032);
                        Intent putExtra2 = new Intent(context, r18.A06().BWx()).putExtra("extra_transaction_id", aw0.A0K);
                        AnonymousClass4aU.A00(putExtra2, new AnonymousClass205(aw0.A0C, aw0.A0L, aw0.A0Q));
                        putExtra2.addFlags(335544320);
                        A002 = C1408573i.A00(context, 0, putExtra2, 268435456);
                    }
                }
                this.A04.A06("no available payment notification text");
                A00(aw0.A0K);
                return;
            }
            A032.A0E(context.getString(2131893596));
            A032.A0D(this.A08.A0K(new Object[]{Integer.valueOf(arrayList.size())}, 2131755286, (long) arrayList.size()));
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AW0) it.next()).A0K()) {
                        BWe = this.A03.A06().BWu();
                        break;
                    }
                } else {
                    BWe = this.A03.A06().BWe();
                    break;
                }
            }
            Intent intent = new Intent(context, BWe);
            intent.addFlags(335544320);
            A002 = C1408573i.A00(context, 0, intent, 268435456);
            A032.A0A = A002;
            C1409673t A033 = C217217d.A03(context);
            A033.A0L = "status";
            A033.A03 = 1;
            A033.A0E(context.getString(2131893596));
            A033.A0D(this.A08.A0K(new Object[]{Integer.valueOf(arrayList.size())}, 2131755286, (long) arrayList.size()));
            A033.A09 = A033.A05();
            A033.A08.icon = 2131231578;
            notification.deleteIntent = C1408573i.A01(context, 17, new Intent(context, AnonymousClass26A.class), 134217728);
            if (Build.VERSION.SDK_INT >= 26) {
                A032.A0M = ((C43551zz) this.A0B.A0W()).A0E();
            }
            Notification A052 = A032.A05();
            try {
                this.A04.A06("NotificationManager/notify");
                this.A07.BkR(17, A052);
            } catch (SecurityException e) {
                String obj = e.toString();
                C17960vV.A0F(false, "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier");
                if (!obj.contains("android.permission.UPDATE_APP_OPS_STATS")) {
                    throw e;
                }
            }
        }
    }

    public C33301ib(AnonymousClass118 r4, C27301Vn r5, C18000vb r6, AnonymousClass1Cd r7, AnonymousClass1QR r8, C24621La r9, AnonymousClass1QO r10, AnonymousClass1QS r11, AnonymousClass1R2 r12, AnonymousClass1Nb r13, AnonymousClass10I r14) {
        this.A00 = r4;
        this.A06 = r14;
        this.A05 = r12;
        this.A08 = r6;
        this.A03 = r11;
        this.A0B = r13;
        this.A02 = r9;
        this.A09 = r7;
        this.A0A = r10;
        this.A07 = r5;
        this.A01 = r8;
    }
}
