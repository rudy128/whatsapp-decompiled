package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass206;
import X.C008503u;
import X.C129536hx;
import X.C137046up;
import X.C139316yd;
import X.C1408573i;
import X.C1409673t;
import X.C143887Fe;
import X.C17880vN;
import X.C17900vP;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C21425Ajs;
import X.C21438Ak5;
import X.C21462AkT;
import X.C22971Dz;
import X.C24681Lg;
import X.C26302CxJ;
import X.C31221fD;
import X.C32291gx;
import X.C32791hl;
import X.C32951i1;
import X.C33251iW;
import X.C48592Nd;
import X.C62952sG;
import X.C676430h;
import X.C692236j;
import X.C70313Ao;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class DirectReplyService extends C48592Nd {
    public AnonymousClass1KB A00;
    public C33251iW A01;
    public AnonymousClass1M9 A02;
    public C32791hl A03;
    public C32951i1 A04;
    public AnonymousClass11C A05;
    public C24681Lg A06;
    public C32291gx A07;
    public C70313Ao A08;
    public C18010vc A09;
    public boolean A0A = false;

    public DirectReplyService() {
        super("DirectReply");
    }

    public static C139316yd A00(Context context, AnonymousClass1E7 r19, C18030ve r20, String str, int i, boolean z) {
        String str2 = str;
        int i2 = 2131893060;
        if ("com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str2)) {
            i2 = 2131898236;
        }
        Context context2 = context;
        C129536hx r13 = new C129536hx(C17880vN.A0D(), context2.getString(i2), "direct_reply_input", C17880vN.A12(), (CharSequence[]) null);
        AnonymousClass1E7 r7 = r19;
        Intent putExtra = new Intent(str2, C62952sG.A00(r7), context2, DirectReplyService.class).putExtra("direct_reply_num_messages", i);
        C18020vd.A03(putExtra, r7, r20);
        CharSequence charSequence = r13.A01;
        int i3 = 134217728;
        C1408573i.A04(putExtra, 134217728);
        if (C1408573i.A02) {
            i3 = 167772160;
        }
        PendingIntent service = PendingIntent.getService(context2, 0, putExtra, i3);
        IconCompat A022 = IconCompat.A02((Resources) null, "", 2131233420);
        Bundle A0D = C17880vN.A0D();
        CharSequence A042 = C1409673t.A04(charSequence);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(r13);
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            A133.add(it.next());
        }
        return new C139316yd(service, A0D, A022, A042, C17900vP.A0s(A133, A133.isEmpty() ? 1 : 0), C17900vP.A0s(A132, A132.isEmpty() ? 1 : 0), 1, z, false);
    }

    public static boolean A01() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public void A08() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A00 = AnonymousClass10E.A12(r1);
            this.A01 = (C33251iW) r1.ABA.get();
            this.A02 = AnonymousClass10E.A4z(r1);
            this.A05 = (AnonymousClass11C) r1.AAp.get();
            this.A06 = (C24681Lg) r1.A6Y.get();
            this.A04 = (C32951i1) r1.A28.get();
            this.A07 = (C32291gx) r1.A6X.get();
            this.A08 = (C70313Ao) r1.A6t.get();
            this.A03 = (C32791hl) r1.A2t.get();
            this.A09 = (C18010vc) r1.A9s.get();
        }
    }

    public /* synthetic */ void A0A(Intent intent, AnonymousClass1E7 r13, C676430h r14, String str) {
        this.A06.unregisterObserver(r14);
        if (Build.VERSION.SDK_INT >= 28 && "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE".equals(str)) {
            C32291gx r2 = this.A07;
            AnonymousClass1BI A002 = AnonymousClass1E7.A00(r13);
            int intExtra = intent.getIntExtra("direct_reply_num_messages", 0);
            C17900vP.A0Y(A002, "messagenotification/posting reply update runnable for jid:", AnonymousClass000.A10());
            Handler A032 = r2.A03();
            boolean z = true;
            if (!C22971Dz.A0V(A002)) {
                z = false;
            }
            A032.post(r2.A06.A01(A002, (AnonymousClass206) null, intExtra, true, true, false, true, z));
        }
    }

    public /* synthetic */ void A0B(AnonymousClass1E7 r13, C676430h r14, String str, String str2) {
        this.A06.registerObserver(r14);
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        this.A01.A0O((C143887Fe) null, (AnonymousClass206) null, (C692236j) null, str, Collections.singletonList(r13.A06(cls)), (List) null, false, false);
        String str3 = str2;
        if ("com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str3)) {
            this.A08.A05();
        } else if ("com.whatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE".equals(str3)) {
            int i = Build.VERSION.SDK_INT;
            C32791hl r4 = this.A03;
            AnonymousClass1BI r5 = (AnonymousClass1BI) r13.A06(cls);
            if (i < 28) {
                r4.A00(r5, 2, 3, true, true, false);
                this.A07.A08();
                return;
            }
            r4.A00(r5, 2, 3, true, false, false);
        }
    }

    public void onCreate() {
        A08();
        super.onCreate();
    }

    public void onHandleIntent(Intent intent) {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("directreplyservice/intent: ");
        Intent intent2 = intent;
        A10.append(intent2);
        A10.append(" num_message:");
        C17900vP.A0o(A10, intent2.getIntExtra("direct_reply_num_messages", 0));
        Bundle A012 = C137046up.A01(intent2);
        if (A012 == null) {
            str2 = "directreplyservice/could not find remote input";
        } else {
            AnonymousClass1E7 A0B = this.A02.A0B(intent2);
            if (A0B == null) {
                str2 = "directreplyservice/contact could not be found";
            } else {
                CharSequence charSequence = A012.getCharSequence("direct_reply_input");
                if (charSequence != null) {
                    str = charSequence.toString().trim();
                } else {
                    str = null;
                }
                if (!C26302CxJ.A0V(this.A05, this.A09, str)) {
                    Log.i("directreplyservice/message is empty");
                    this.A00.A0J(new C21425Ajs((Object) this, 10));
                    return;
                }
                String action = intent2.getAction();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C676430h r6 = new C676430h(AnonymousClass1E7.A00(A0B), countDownLatch);
                this.A04.A0C(A0B.A0J, 2);
                this.A00.A0J(new C21438Ak5(this, r6, A0B, str, action, 6));
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    Log.e("Interrupted while waiting to add message", e);
                }
                this.A00.A0J(new C21462AkT(this, r6, A0B, intent2, action, 8));
                return;
            }
        }
        Log.i(str2);
    }
}
