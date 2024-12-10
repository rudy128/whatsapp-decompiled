package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.foundation.lazy.LazyListState;
import com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3$1;

/* renamed from: X.Ce9  reason: case insensitive filesystem */
public abstract class C25350Ce9 {
    public static final void A00(LazyListState lazyListState, C17130tn r5, C36711oL r6, int i, int i2) {
        int i3;
        C18070vi.A0i(lazyListState, r6);
        r5.COC(960037695);
        if ((i2 & 6) == 0) {
            i3 = AnonymousClass001.A0Z(r5, lazyListState) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AnonymousClass000.A0A(r5.BEd(i) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            i3 |= AnonymousClass001.A0c(r5, r6);
        }
        if ((i3 & 147) != 146 || !r5.BZO()) {
            r5.COB(1269727861);
            boolean A1T = AnonymousClass000.A1T(i3 & 14, 4);
            Object CER = r5.CER();
            if (A1T || CER == AnonymousClass0MH.A00) {
                CER = new C27000DOw(lazyListState);
                r5.CRH(CER);
            }
            AnonymousClass0VR.A0T(r5);
            A01(r5, (C28469E2k) CER, r6, i, (i3 & 112) | (i3 & 896));
        } else {
            r5.CNR();
        }
        C05660Vf BKF = r5.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt4(lazyListState, r6, i, i2);
        }
    }

    public static final void A01(C17130tn r8, C28469E2k e2k, C36711oL r10, int i, int i2) {
        int i3;
        boolean BEh;
        r8.COC(38618290);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                BEh = r8.BEf(e2k);
            } else {
                BEh = r8.BEh(e2k);
            }
            i3 = AnonymousClass000.A09(BEh ? 1 : 0) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AnonymousClass000.A0A(r8.BEd(i) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            i3 |= AnonymousClass001.A0c(r8, r10);
        }
        if ((i3 & 147) != 146 || !r8.BZO()) {
            Context context = (Context) r8.BFh(AnonymousClass0PK.A01);
            C18070vi.A0d(context, 0);
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    r8.COB(1269744259);
                    boolean z = true;
                    boolean A1T = AnonymousClass000.A1T(i3 & 112, 32) | r8.BEf(activity);
                    Object CER = r8.CER();
                    if (A1T || CER == AnonymousClass0MH.A00) {
                        r10.A02(activity);
                        CER = new AnonymousClass4MI(r10, i);
                        r8.CRH(CER);
                    }
                    AnonymousClass4MI r5 = (AnonymousClass4MI) CER;
                    AnonymousClass0VR r4 = (AnonymousClass0VR) r8;
                    AnonymousClass0VR.A0R(r4, false);
                    r8.COB(1269750944);
                    if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !r8.BEh(e2k))) {
                        z = false;
                    }
                    boolean BEh2 = r8.BEh(r5) | z | r8.BEh(activity);
                    Object CER2 = r8.CER();
                    if (BEh2 || CER2 == AnonymousClass0MH.A00) {
                        CER2 = new DropFrameWatcherKt$DropFrameWatcher$3$1(activity, e2k, r5, (C30391dr) null);
                        r8.CRH(CER2);
                    }
                    AnonymousClass0VR.A0R(r4, false);
                    AnonymousClass0QC.A04(r8, e2k, (AnonymousClass1OS) CER2);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    C18070vi.A0X(context);
                }
            }
            throw AnonymousClass000.A0n("no activity");
        }
        r8.CNR();
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A06 = new Dt5(e2k, r10, i, i2);
        }
    }
}
