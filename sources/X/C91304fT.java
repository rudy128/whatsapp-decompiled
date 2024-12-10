package X;

import android.view.Menu;
import android.view.MenuInflater;
import androidx.fragment.app.Fragment;

/* renamed from: X.4fT  reason: invalid class name and case insensitive filesystem */
public class C91304fT implements AnonymousClass1GW {
    public final int A00;
    public final Object A01;

    public C91304fT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BqV(Menu menu, MenuInflater menuInflater) {
        Fragment fragment;
        int A002;
        int i;
        int i2 = this.A00;
        boolean A16 = C18070vi.A16(menu, menuInflater);
        menu.clear();
        switch (i2) {
            case 0:
                C137526vb.A01(menu, A16);
                menuInflater.inflate(2131820579, menu);
                fragment = (Fragment) this.A01;
                A002 = AnonymousClass1YL.A00(fragment.A14(), 2130971978, 2131103152);
                i = 2131434628;
                break;
            case 1:
                C137526vb.A01(menu, A16);
                menuInflater.inflate(2131820580, menu);
                fragment = (Fragment) this.A01;
                A002 = AnonymousClass1YL.A00(fragment.A14(), 2130971978, 2131103152);
                i = 2131434630;
                break;
            default:
                C137526vb.A01(menu, A16);
                menuInflater.inflate(2131820581, menu);
                fragment = (Fragment) this.A01;
                A002 = AnonymousClass1YL.A00(fragment.A1D(), 2130971978, 2131103152);
                i = 2131434633;
                break;
        }
        A3C.A01(C19740yt.A03(fragment.A14(), A002), menu.findItem(i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        X.AnonymousClass3MW.A1H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r3.A0X(new X.C88814ar(r2, r1), r4);
        r3.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ByD(android.view.MenuItem r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            java.lang.Object r2 = r5.A01
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0042;
                default: goto L_0x0007;
            }
        L_0x0007:
            com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment r2 = (com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment) r2
            android.content.Context r0 = r2.A14()
            X.3Ri r3 = X.C73193Ri.A00(r0)
            r0 = 2131896844(0x7f122a0c, float:1.942856E38)
            r3.A0V(r0)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r2.A01
            if (r0 == 0) goto L_0x00a0
            X.1BI r1 = r0.A0Q
            r0 = 2131896839(0x7f122a07, float:1.942855E38)
            if (r1 == 0) goto L_0x0025
            r0 = 2131896845(0x7f122a0d, float:1.9428563E38)
        L_0x0025:
            r3.A0U(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 44
            X.C73193Ri.A01(r3, r0, r1)
            r4 = 2131896836(0x7f122a04, float:1.9428544E38)
            r1 = 19
        L_0x0035:
            X.4ar r0 = new X.4ar
            r0.<init>(r2, r1)
            r3.A0X(r0, r4)
            r3.A0C()
            r0 = 1
            return r0
        L_0x0042:
            com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment r2 = (com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment) r2
            android.content.Context r0 = r2.A14()
            X.3Ri r3 = X.C73193Ri.A00(r0)
            r0 = 2131896842(0x7f122a0a, float:1.9428557E38)
            r3.A0V(r0)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r2.A02
            if (r0 == 0) goto L_0x00a0
            X.1BI r1 = r0.A0Q
            r0 = 2131896838(0x7f122a06, float:1.9428549E38)
            if (r1 == 0) goto L_0x0060
            r0 = 2131896843(0x7f122a0b, float:1.9428559E38)
        L_0x0060:
            r3.A0U(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 43
            X.C73193Ri.A01(r3, r0, r1)
            r4 = 2131896836(0x7f122a04, float:1.9428544E38)
            r1 = 18
            goto L_0x0035
        L_0x0071:
            com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment r2 = (com.whatsapp.settings.chat.theme.fragment.ChatThemeMessageColorFragment) r2
            android.content.Context r0 = r2.A14()
            X.3Ri r3 = X.C73193Ri.A00(r0)
            r0 = 2131896840(0x7f122a08, float:1.9428553E38)
            r3.A0V(r0)
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r2.A01
            if (r0 == 0) goto L_0x00a0
            X.1BI r1 = r0.A0Q
            r0 = 2131896837(0x7f122a05, float:1.9428547E38)
            if (r1 == 0) goto L_0x008f
            r0 = 2131896841(0x7f122a09, float:1.9428555E38)
        L_0x008f:
            r3.A0U(r0)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 42
            X.C73193Ri.A01(r3, r0, r1)
            r4 = 2131896836(0x7f122a04, float:1.9428544E38)
            r1 = 17
            goto L_0x0035
        L_0x00a0:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91304fT.ByD(android.view.MenuItem):boolean");
    }

    public /* synthetic */ void ByC(Menu menu) {
    }

    public /* synthetic */ void C1X(Menu menu) {
    }
}
