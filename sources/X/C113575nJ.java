package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5nJ  reason: invalid class name and case insensitive filesystem */
public final class C113575nJ extends C42011xT {
    public final ImageView A00;
    public final C127856f3 A01;
    public final boolean A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final AnonymousClass11P A05;
    public final C18000vb A06;
    public final C28931bI A07;
    public final C28931bI A08;
    public final boolean A09;

    public C113575nJ(View view, AnonymousClass11P r6, C18000vb r7, C127856f3 r8, boolean z, boolean z2, boolean z3) {
        super(view);
        View findViewById;
        ImageView imageView;
        this.A02 = z2;
        this.A09 = z3;
        this.A01 = r8;
        this.A05 = r6;
        this.A06 = r7;
        if (z) {
            findViewById = view.findViewById(2131437027);
            imageView = (ImageView) findViewById;
            C18070vi.A0b(imageView);
            imageView.setVisibility(0);
        } else {
            findViewById = view.findViewById(2131429433);
            imageView = (ImageView) findViewById;
            imageView.setEnabled(false);
        }
        C18070vi.A0X(findViewById);
        this.A00 = imageView;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429428);
        this.A04 = textEmojiLabel;
        C43421zm.A04(textEmojiLabel);
        AnonymousClass1Y5.A0A(textEmojiLabel, true);
        this.A03 = C72453Mb.A0W(view, 2131429798);
        this.A08 = C72453Mb.A0s(view, 2131436820);
        this.A07 = C72453Mb.A0s(view, 2131436821);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C129226hS r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            com.whatsapp.TextEmojiLabel r0 = r8.A04
            r4 = 0
            r2 = 0
            r0.A0S(r10, r4, r2, r2)
            boolean r0 = r8.A09
            r5 = 8
            android.widget.TextView r7 = r8.A03
            if (r0 == 0) goto L_0x00a7
            X.11P r6 = r8.A05
            X.0vb r3 = r8.A06
            long r0 = r9.A01
            java.lang.String r0 = X.C108965cb.A0q(r6, r3, r0)
            r7.setText(r0)
            r7.setVisibility(r2)
        L_0x001f:
            java.lang.String r3 = r9.A03
            if (r3 == 0) goto L_0x009f
            int r0 = r3.length()
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "💚"
            boolean r1 = r3.equals(r0)
            X.1bI r0 = r8.A07
            if (r1 == 0) goto L_0x008d
            r0.A04(r2)
            X.1bI r0 = r8.A08
        L_0x0038:
            r0.A04(r5)
        L_0x003b:
            android.widget.ImageView r3 = r8.A00
            boolean r0 = r3 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x00b2
            X.6yE r6 = r9.A00
            if (r6 == 0) goto L_0x00ac
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x00ac
            int r5 = r6.A01
            r0 = 1
            if (r5 > 0) goto L_0x0051
            r0 = 0
        L_0x0051:
            r1 = 1
            if (r0 == 0) goto L_0x006f
            r2 = r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r1)
            X.1sh r1 = X.C39211sh.UNSEEN
            X.1sj r0 = new X.1sj
            r0.<init>(r1)
            r2.setProfileStatus(r0)
            r0 = 27
            X.78T r1 = new X.78T
            r1.<init>(r8, r11, r0, r9)
        L_0x006b:
            r3.setOnClickListener(r1)
            return
        L_0x006f:
            if (r5 != 0) goto L_0x00ac
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00ac
            r2 = r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r1)
            X.1sh r1 = X.C39211sh.SEEN_80_ALPHA
            X.1sj r0 = new X.1sj
            r0.<init>(r1)
            r2.setProfileStatus(r0)
            r0 = 28
            X.78T r1 = new X.78T
            r1.<init>(r8, r11, r0, r6)
            goto L_0x006b
        L_0x008d:
            r0.A04(r5)
            X.1bI r1 = r8.A08
            android.view.View r0 = X.AnonymousClass3MX.A0D(r1)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r0.A0S(r3, r4, r2, r2)
            r1.A04(r2)
            goto L_0x003b
        L_0x009f:
            X.1bI r0 = r8.A08
            r0.A04(r5)
            X.1bI r0 = r8.A07
            goto L_0x0038
        L_0x00a7:
            r7.setVisibility(r5)
            goto L_0x001f
        L_0x00ac:
            r0 = r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r0.setStatusIndicatorEnabled(r2)
        L_0x00b2:
            r3.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113575nJ.A0B(X.6hS, java.lang.String, int):void");
    }
}
