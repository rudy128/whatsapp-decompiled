package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import java.util.ArrayList;

/* renamed from: X.7Sx  reason: invalid class name and case insensitive filesystem */
public class C147377Sx extends ArrayList<AnonymousClass7C7> {
    public final /* synthetic */ InCallBannerViewModel this$0;

    public C147377Sx(InCallBannerViewModel inCallBannerViewModel) {
        this.this$0 = inCallBannerViewModel;
    }

    /* renamed from: A02 */
    public AnonymousClass7C7 set(AnonymousClass7C7 r5, int i) {
        if (i != 0) {
            return (AnonymousClass7C7) super.set(i, r5);
        }
        AnonymousClass7C7 r3 = (AnonymousClass7C7) super.set(0, r5);
        C122636Rd r2 = r3.A04;
        if (r2 != r5.A04) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (r2 == C122636Rd.A0D) {
                inCallBannerViewModel.A08.A0E(C27621Wu.A00);
            }
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1.A01 == false) goto L_0x0013;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7C7 get(int r4) {
        /*
            r3 = this;
            java.lang.Object r2 = super.get(r4)
            X.7C7 r2 = (X.AnonymousClass7C7) r2
            if (r2 == 0) goto L_0x0018
            com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel r1 = r3.this$0
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0013
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            X.7C7 r2 = r2.A00(r0)
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147377Sx.get(int):X.7C7");
    }

    /* renamed from: A01 */
    public AnonymousClass7C7 remove(int i) {
        AnonymousClass7C7 r3 = (AnonymousClass7C7) super.remove(i);
        if (i == 0) {
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (r3.A04 == C122636Rd.A0D) {
                inCallBannerViewModel.A08.A0E(C27621Wu.A00);
            }
        }
        return r3;
    }

    public void clear() {
        if (size() > 0) {
            AnonymousClass7C7 A00 = get(0);
            super.clear();
            InCallBannerViewModel inCallBannerViewModel = this.this$0;
            if (A00.A04 == C122636Rd.A0D) {
                inCallBannerViewModel.A08.A0E(C27621Wu.A00);
            }
        }
    }
}
