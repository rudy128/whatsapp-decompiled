package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4fs  reason: invalid class name and case insensitive filesystem */
public final class C91554fs implements C22851Dl {
    public View A00;
    public final ViewGroup A01;
    public final AnonymousClass1F9 A02;
    public final AnonymousClass1FP A03;
    public final C18000vb A04;
    public final C25811Ps A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r5 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = r7.A02;
        r3 = r7.A04;
        r1 = r7.A03;
        r5 = new androidx.recyclerview.widget.RecyclerView(r1, (android.util.AttributeSet) null);
        r2 = (com.whatsapp.bot.prompts.BonsaiPromptsViewModel) X.AnonymousClass3MW.A0N(r1).A00(com.whatsapp.bot.prompts.BonsaiPromptsViewModel.class);
        X.C18070vi.A0d(r2, 2);
        r5.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(r5.getContext(), 0, false));
        r5.setAdapter(new X.AnonymousClass3WR(r4, r2));
        r2 = X.C72463Mc.A05(r5);
        r5.A0r(new X.AnonymousClass3XT(r3, r2));
        r5.setPadding(r2, 0, r2, r5.getResources().getDimensionPixelSize(2131168780));
        r5.setClipToPadding(false);
        r7.A01.addView(r5, 0, new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        r5.setVisibility(0);
        r7.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bo9(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            android.view.View r5 = r7.A00
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0012
            X.C72453Mb.A1B(r5)
            return
        L_0x0012:
            if (r5 != 0) goto L_0x006f
            X.1F9 r4 = r7.A02
            X.0vb r3 = r7.A04
            X.1FP r1 = r7.A03
            r0 = 0
            X.3Zi r5 = new X.3Zi
            r5.<init>(r1, r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r1)
            java.lang.Class<com.whatsapp.bot.prompts.BonsaiPromptsViewModel> r0 = com.whatsapp.bot.prompts.BonsaiPromptsViewModel.class
            X.1J2 r2 = r1.A00(r0)
            com.whatsapp.bot.prompts.BonsaiPromptsViewModel r2 = (com.whatsapp.bot.prompts.BonsaiPromptsViewModel) r2
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            android.content.Context r1 = r5.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1, r6, r6)
            r5.setLayoutManager(r0)
            X.3WR r0 = new X.3WR
            r0.<init>(r4, r2)
            r5.setAdapter(r0)
            int r2 = X.C72463Mc.A05(r5)
            X.3XT r0 = new X.3XT
            r0.<init>(r3, r2)
            r5.A0r(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168780(0x7f070e0c, float:1.7951871E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setPadding(r2, r6, r2, r0)
            r5.setClipToPadding(r6)
            android.view.ViewGroup r4 = r7.A01
            r3 = -2
            r2 = 80
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r3, r2)
            r4.addView(r5, r6, r0)
        L_0x006f:
            r5.setVisibility(r6)
            r7.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91554fs.Bo9(java.lang.Object):void");
    }

    public C91554fs(ViewGroup viewGroup, AnonymousClass1F9 r2, AnonymousClass1FP r3, C25811Ps r4, C18000vb r5) {
        this.A02 = r2;
        this.A04 = r5;
        this.A01 = viewGroup;
        this.A05 = r4;
        this.A03 = r3;
    }
}
