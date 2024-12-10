package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.6IG  reason: invalid class name */
public class AnonymousClass6IG extends C112295lF {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BqY(viewGroup, i);
        }
        StickerStoreMyTabFragment stickerStoreMyTabFragment = this.A00;
        return new C113025mQ(AnonymousClass3MX.A09(LayoutInflater.from(stickerStoreMyTabFragment.A1n()), viewGroup, 2131627117), stickerStoreMyTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IG(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    public int A0Q() {
        int A0C = C72463Mc.A0C(this.A00);
        if (A0C > 0) {
            return A0C + 1;
        }
        return A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1.A07.size() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getItemViewType(r11)
            if (r0 != 0) goto L_0x00c4
            X.5nB r10 = (X.C113495nB) r10
            super.Bmc(r10, r11)
            java.util.List r0 = r9.A00
            java.lang.Object r1 = r0.get(r11)
            X.725 r1 = (X.AnonymousClass725) r1
            com.whatsapp.CircularProgressBar r5 = r10.A0H
            boolean r0 = r1.A0W
            r3 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r1.A07
            int r2 = r0.size()
            r0 = 0
            if (r2 == 0) goto L_0x0027
        L_0x0025:
            r0 = 8
        L_0x0027:
            r5.setVisibility(r0)
            android.widget.ImageView r5 = r10.A06
            r0 = 2131231845(0x7f080465, float:1.8079783E38)
            r5.setImageResource(r0)
            android.content.Context r2 = r5.getContext()
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r2, r0)
            X.C28081Yu.A00(r0, r5)
            android.widget.ImageView r2 = r10.A07
            r0 = 2131231872(0x7f080480, float:1.8079837E38)
            r2.setImageResource(r0)
            android.widget.ImageView r6 = r10.A08
            r0 = 2131231874(0x7f080482, float:1.8079841E38)
            r6.setImageResource(r0)
            boolean r0 = r1.A02()
            r8 = 4
            if (r0 == 0) goto L_0x00ce
            r5.setVisibility(r8)
            r2.setVisibility(r8)
            r6.setVisibility(r8)
            android.view.View r0 = r10.A04
            r0.setVisibility(r4)
            boolean r7 = r1.A09
            com.whatsapp.WaTextView r0 = r10.A0I
            if (r7 == 0) goto L_0x00c5
            r0.setVisibility(r8)
            android.widget.ProgressBar r0 = r10.A0B
            r0.setVisibility(r4)
        L_0x0073:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r7 = r9.A00
            r0 = 2131896499(0x7f1228b3, float:1.942786E38)
            X.C108955ca.A1J(r5, r7, r0)
            r0 = 32
            X.AnonymousClass3MY.A1E(r5, r9, r1, r0)
            r0 = 2131896511(0x7f1228bf, float:1.9427885E38)
            X.C108955ca.A1J(r2, r7, r0)
            r0 = 1
            r2.setLongClickable(r0)
            r5 = 12
            X.781 r0 = new X.781
            r0.<init>(r5)
            r2.setOnClickListener(r0)
            r0 = 9
            X.C1422578t.A00(r2, r10, r9, r0)
            r0 = 2131886202(0x7f12007a, float:1.9406976E38)
            X.AnonymousClass1Y5.A05(r2, r0)
            r0 = 2131896496(0x7f1228b0, float:1.9427855E38)
            X.C108955ca.A1J(r6, r7, r0)
            r0 = 30
            X.AnonymousClass6LG.A00(r6, r9, r0)
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.6pv r0 = (X.C134046pv) r0
            java.lang.String r1 = r1.A0H
            X.C18070vi.A0d(r1, r4)
            java.lang.String r0 = r0.A01()
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x00c4
            r2.setVisibility(r3)
        L_0x00c4:
            return
        L_0x00c5:
            r0.setVisibility(r4)
            android.widget.ProgressBar r0 = r10.A0B
            r0.setVisibility(r8)
            goto L_0x0073
        L_0x00ce:
            android.view.View r0 = r10.A04
            r0.setVisibility(r8)
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x00e1
            r5.setVisibility(r8)
            r2.setVisibility(r3)
            r6.setVisibility(r4)
            goto L_0x0073
        L_0x00e1:
            r6.setVisibility(r3)
            r5.setVisibility(r4)
            r2.setVisibility(r4)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IG.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        if (A0Q() - 1 != i) {
            return 0;
        }
        return 1;
    }
}
