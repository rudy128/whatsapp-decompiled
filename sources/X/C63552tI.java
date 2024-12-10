package X;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.whatsapp.service.BackgroundMediaControlService;

/* renamed from: X.2tI  reason: invalid class name and case insensitive filesystem */
public class C63552tI {
    public long A00;
    public C1409673t A01;
    public AnonymousClass206 A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C200710s A07;
    public final AnonymousClass11S A08;
    public final AnonymousClass1VW A09;
    public final AnonymousClass1M9 A0A;
    public final C24921Me A0B;
    public final C27201Vd A0C;
    public final C31131f4 A0D;
    public final AnonymousClass11C A0E;
    public final AnonymousClass118 A0F;
    public final C27301Vn A0G;
    public final AnonymousClass11P A0H;
    public final C18030ve A0I;
    public final AnonymousClass10I A0J;

    public static synchronized C200710s A00(C63552tI r1) {
        C200710s r0;
        synchronized (r1) {
            r0 = r1.A07;
            if (r0 == null) {
                r0 = C200710s.A00(r1.A0J);
                r1.A07 = r0;
            }
        }
        return r0;
    }

    public static void A01(RemoteViews remoteViews, C63552tI r5, boolean z) {
        int i;
        int i2;
        String str = r5.A03;
        if (str != null) {
            remoteViews.setTextViewText(2131433288, str);
        }
        Context context = r5.A0F.A00;
        Intent intent = new Intent(context, BackgroundMediaControlService.class);
        if (z) {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.STOP");
            i = 2131433286;
            remoteViews.setImageViewResource(2131433286, 2131232493);
            i2 = 2131893587;
        } else {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.START");
            i = 2131433286;
            remoteViews.setImageViewResource(2131433286, 2131232494);
            i2 = 2131899314;
        }
        remoteViews.setContentDescription(i, context.getString(i2));
        r5.A01.A0H(z);
        r5.A05 = z;
        remoteViews.setOnClickPendingIntent(i, C1408573i.A03(context, intent, 134217728));
        C1409673t r0 = r5.A01;
        r0.A0E = remoteViews;
        r5.A0G.BkR(14, r0.A05());
    }

    public C63552tI(AnonymousClass11S r1, AnonymousClass1VW r2, AnonymousClass1M9 r3, C24921Me r4, C27201Vd r5, C31131f4 r6, AnonymousClass11C r7, AnonymousClass11P r8, AnonymousClass118 r9, C27301Vn r10, C18030ve r11, AnonymousClass10I r12) {
        this.A0H = r8;
        this.A0I = r11;
        this.A0J = r12;
        this.A0F = r9;
        this.A08 = r1;
        this.A0C = r5;
        this.A09 = r2;
        this.A0A = r3;
        this.A0E = r7;
        this.A0B = r4;
        this.A0G = r10;
        this.A0D = r6;
    }

    public static void A02(C145777Mo r7, C63552tI r8) {
        boolean A0I2 = r7.A0I();
        if (!r8.A04) {
            RemoteViews remoteViews = new RemoteViews(r8.A0F.A00.getPackageName(), 2131626293);
            int A092 = r7.A09();
            remoteViews.setProgressBar(2131433285, r7.A01, A092, false);
            remoteViews.setTextViewText(2131433289, DateUtils.formatElapsedTime((long) (A092 / 1000)));
            A01(remoteViews, r8, A0I2);
            return;
        }
        boolean z = r8.A05;
        if (!A0I2 ? !z : z) {
            if (!r8.A06) {
                return;
            }
        }
        A01(new RemoteViews(r8.A0F.A00.getPackageName(), 2131626294), r8, A0I2);
        r8.A06 = false;
    }

    public void A03() {
        A00(this).execute(new C21425Ajs((Object) this, 11));
    }
}
