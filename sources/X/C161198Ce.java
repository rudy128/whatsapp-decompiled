package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment;
import java.util.List;

/* renamed from: X.8Ce  reason: invalid class name and case insensitive filesystem */
public class C161198Ce extends CountDownTimer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161198Ce(Object obj, Object obj2, Object obj3, int i, long j) {
        super(j, 1000);
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public void onFinish() {
        switch (this.A00) {
            case 0:
                DOZ doz = (DOZ) this.A02;
                C26962DNk A012 = C26272CwJ.A01(doz);
                DFL dfl = ((C166448cu) this.A01).A00;
                A012.A0A(new C26964DNm((long) dfl.A04), new C23733Boe(this, 3));
                A012.A07();
                E8A A0A = dfl.A0A(36);
                if (A0A != null) {
                    C20046A4p.A01(doz, dfl, C108985cd.A0J(dfl), A0A);
                    return;
                }
                return;
            case 1:
                ((C88484Zw) this.A01).A07.A0J(new C98834rn((Object) this, 7));
                return;
            default:
                C162078Iw r6 = (C162078Iw) this.A01;
                C161718Hl r0 = (C161718Hl) this.A03;
                r6.A04.setText(((C195499tR) this.A02).A04);
                r6.A00 = null;
                r6.A0H.setEnabled(true);
                WaTextView waTextView = r6.A03;
                Context context = r0.A03;
                C72463Mc.A0y(context, waTextView, 2130970831, 2131102246);
                r6.A01.setEnabled(true);
                AnonymousClass8BS.A10(context, r6.A02, 2131103154);
                r0.A0G(r6.A05());
                B9Q b9q = r0.A01;
                if (b9q != null) {
                    int A05 = r6.A05();
                    C21046Adc adc = (C21046Adc) b9q;
                    if (adc.A00 != 0) {
                        if (A05 != -1) {
                            RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment = (RequestServerDrivenOtpCodeFullScreenFragment) adc.A01;
                            C195499tR r2 = (C195499tR) requestServerDrivenOtpCodeFullScreenFragment.A0K.get(A05);
                            requestServerDrivenOtpCodeFullScreenFragment.A0K.set(A05, new C195499tR(r2.A02, r2.A03, r2.A04, r2.A05, r2.A01, 0));
                            RequestServerDrivenOtpCodeFullScreenFragment.A01(requestServerDrivenOtpCodeFullScreenFragment);
                        }
                    } else if (A05 != -1) {
                        RequestServerDrivenOtpCodeBottomSheetFragment requestServerDrivenOtpCodeBottomSheetFragment = (RequestServerDrivenOtpCodeBottomSheetFragment) adc.A01;
                        C195499tR r22 = (C195499tR) requestServerDrivenOtpCodeBottomSheetFragment.A0H.get(A05);
                        requestServerDrivenOtpCodeBottomSheetFragment.A0H.set(A05, new C195499tR(r22.A02, r22.A03, r22.A04, r22.A05, r22.A01, 0));
                        RequestServerDrivenOtpCodeBottomSheetFragment.A01(requestServerDrivenOtpCodeBottomSheetFragment);
                    }
                }
                int i = r0.A00;
                if (i != -1) {
                    r0.A00 = -1;
                    r0.A0G(i);
                }
                List list = r0.A05;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!((C195499tR) list.get(i2)).A06) {
                        r0.A00 = i2;
                        return;
                    }
                }
                return;
        }
    }

    public void onTick(long j) {
        long j2 = j;
        switch (this.A00) {
            case 0:
                C26025Cqj cqj = ((C166448cu) this.A01).A01;
                AnonymousClass3MW.A0J((View) this.A03, 2131436203).setText(C64052u8.A0D(cqj.A04, (String) null, C17880vN.A04(j)));
                return;
            case 1:
                ((C88484Zw) this.A01).A07.A0J(new C98714rb(this, this.A02, this.A03, 20));
                return;
            default:
                ((C195499tR) this.A02).A00 = j;
                WaTextView waTextView = ((C162078Iw) this.A01).A04;
                C161718Hl r0 = (C161718Hl) this.A03;
                C18000vb r3 = r0.A04;
                Context context = r0.A03;
                waTextView.setText(A9B.A0C(context, r3, context.getString(2131890356), 2131755148, j2, false).toString());
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161198Ce(Context context, C88484Zw r4, Long l, long j) {
        super(j, 60000);
        this.A00 = 1;
        this.A01 = r4;
        this.A02 = context;
        this.A03 = l;
    }
}
